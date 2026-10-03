/**
 *	server.markhome.ycf-core - Mark's Code Fractal Core Services
 *
 *	Copyright 2026 Mark Stephen Sobkow (mark.sobkow@gmail.com)
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://apache.org
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	SPDX-License-Identifier: Apache-2.0
**/

package server.markhome.ycf;

import org.teavm.jso.JSExport;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import java.util.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

/**
 * An IInzEntry contains all IInzLang entries for a given entry in the language path defined by IInz.langPath.
 * 
 * When IInz does the top-level translation search, it probes the IInzEntry data in path-order sequence until
 * it finds a match for the requested key.  If the key ultimately could not be found, it returns "!key!".
 * 
 * IInzEntry is not intended to be instantiated directly by users of IYCF, but rather is used internally
 * by IInz to manage the language entries loaded from the properties files in the langPath.
 * 
 * @author Mark Stephen Sobkow
 * @see IInz
 * @see IInzLang
 */
public interface IInzEntry extends JSObject {
    protected IInzPathEntry pathEntry = null;
    protected HashMap<String, IInzLang> langs = new HashMap<>();
    
    /**
     * Construct an IInzEntry for the specified pathName, using it to open the directory specified as pathEntry,
     * and then loading all the IInzLang entries from the properties files in that directory.
     * 
     * @param pathName
     */
    public IInzEntry(IInzPathEntry pathEntry) {
        if (pathEntry == null) {
            throw new IllegalArgumentException("Path entry cannot be null.");
        }
        this.pathEntry = pathEntry;
        loadLangs();
    }

    /**
     * Load all IInzLang entries from the properties files in the pathEntry directory.
     * Each properties file should be named with the language code (e.g., "en.properties" for English).
     * The IInzLang instances are stored in the langs map, keyed by their language code.
     * 
     * This method reads each properties file, validates the required properties,
     * and creates an IInzLang instance for each valid file. It also handles fallback languages
     * by linking them to their respective IInzLang instances.
     * 
     * If a properties file does not contain the required properties or has mismatched language codes,
     * an IllegalArgumentException is thrown.
     * 
     * In the case of resource entries, it expects to find a "propnames.txt" file that lists the names of the properties files.
     * 
     * @throws IOException if there is an error reading the directory or files.
     * @throws RuntimeException if there is an error loading the language files.
     * @throws IllegalArgumentException if a properties file is invalid or missing required properties.
     * @see IInzLang#LANG_CODE_PROP
     * @see IInzLang#ENGLISH_NAME_PROP
     * @see IInzLang#NLS_NAME_PROP
     * @see IInzLang#FALLBACK_LANG_PROP
     * @see IInzLang#setTranslations(Properties)
     * @see IInzLang#setFallbackLang(IInzLang)
     * 
     * Note: This method assumes that the properties files are well-formed and contain the required properties.
     * It does not handle malformed files or unexpected formats, which should be validated before calling this method.
     */
    protected final void loadLangs() {
        String propnames;
        InputStream input = pathEntry.getInputStream("propnames.txt");
        if (input == null) {
            throw new IllegalArgumentException("Resource or file not found: " + pathEntry.getPath() + "/propnames.txt");
        }
        try {
            propnames = new String(input.readAllBytes());
            propnames = propnames.replace("\r", "").trim(); // Normalize line endings
            propnames = propnames.replace("\n", " ").trim(); // Replace newlines with spaces
            propnames = propnames.replace("  ", " "); // Replace multiple spaces with a single space
        }
        catch (IOException e) {
            throw new RuntimeException("Failed to read propnames.txt for path entry " + pathEntry.getPath(), e);
        }
        finally {
            try {
                input.close();
            } catch (IOException e) {
                // Ignore close exception
            }
        }
        String[] propNamesArray = propnames.split(" ");
        for (String propname: propNamesArray) {
            input = null;
            Properties properties = new Properties();
            try {
                input = pathEntry.getInputStream(propname);
                if (input == null) {
                    throw new IllegalArgumentException("Resource or file not found: " + propname + " for path entry " + pathEntry.getPath());
                }
                properties.load(input);
            } catch (IOException e) {
                throw new RuntimeException("Failed to load language resource or file: " + propname + " for path entry " + pathEntry.getPath(), e);
            }
            finally {
                if (input != null) {
                    try {
                        input.close();
                    } catch (IOException e) {
                        // Ignore close exception
                    }
                }
            }

            String langCode = propname.substring(0, propname.length() - 11); // Remove ".properties"
            String loadedLangCodeString;
            String englishName;
            String nlsName;

            loadedLangCodeString = properties.getProperty(IInzLang.LANG_CODE_PROP);
            if (loadedLangCodeString == null || loadedLangCodeString.isEmpty()) {
                throw new IllegalArgumentException("Language file " + propname + " must contain " +
                        IInzLang.LANG_CODE_PROP + " property for path entry " + pathEntry.getPath());
            }
            if (!loadedLangCodeString.toLowerCase().equals(langCode.toLowerCase())) {
                throw new IllegalArgumentException("Language file " + propname + " has mismatched language code: " +
                        loadedLangCodeString.toLowerCase() + ", expected: " + langCode.toLowerCase() + " for path entry " + pathEntry.getPath());
            }
            englishName = properties.getProperty(IInzLang.ENGLISH_NAME_PROP);
            nlsName = properties.getProperty(IInzLang.NLS_NAME_PROP);
            if (englishName == null || nlsName == null || englishName.isEmpty() || nlsName.isEmpty()) {
                throw new IllegalArgumentException("Language file " + propname + " must contain " +
                        IInzLang.ENGLISH_NAME_PROP + " and " + IInzLang.NLS_NAME_PROP + " properties for path entry " + pathEntry.getPath());
            }

            // Create an IInzLang instance and add it to the langs map
            IInzLang lang = new IInzLang(langCode.toLowerCase(), englishName, nlsName);
            lang.setTranslations(properties);
            langs.put(langCode, lang);
        }
    }

    /**
     * Search for a translation for the given key using the IInz.getEffectiveLangId() value.
     * 
     * @param key
     * @return
     */
    public String x(String key) {
        return x(key, IInz.getEffectiveLangCode());
    }

    /**
     * Search for a translation for the given key, starting with the specified language code.
     * If the key is not found in the specified language, it will search through the fallback languages
     * until it finds a match or exhausts all options.
     * 
     * @param key The translation key to search for.
     * @param langCode The language code to start the search from.
     * @return The translation for the key, or "!key!" if not found in any language.
     */
    public String x(String key, String langCode) {
        IInzLang lang = langs.get(langCode.toLowerCase());
        if (lang != null) {
            return lang.x(key);
        }
        return null;
    }

    /**
     * Get the path entry of this IInzEntry.
     * 
     * @return The path entry associated with this IInzEntry.
     */
    public IInzPathEntry getPathEntry() {
        return pathEntry;
    }

    /**
     * Get the map of language codes to IInzLang instances for this IInzEntry.
     * 
     * @return A HashMap containing language codes and their corresponding IInzLang instances.
     */
    protected HashMap<String, IInzLang> getLangs() {
        return langs;
    }

    /**
     * Get the IInzLang instance for the specified language code.
     * 
     * @param langCode The language code to retrieve the IInzLang instance for.
     * @return The IInzLang instance for the specified language code, or null if not found.
     */
    protected IInzLang getLang(String langCode) {
        return langs.get(langCode.toLowerCase());
    }
}
