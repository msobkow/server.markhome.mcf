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

import java.util.concurrent.atomic.AtomicReference;

/**
 * IInz is the main interface for the IYCF Internationalization (IInz) library.
 * It provides a framework for managing translations and language files.
 * The IInz interface is responsible for loading language files, managing language codes,
 * and providing access to translations through the IInzLang interface.
 */
public class IInz {
//    public static final String IYCFLIB_INZ_PATH = "/server.markhome.ycf.v3_1.cflib/src/main/resources/inz/langs";
    public static final String IYCFLIB_INZ_PATH = "resource://inz/langs";

    /**
     * The language file path is a list of semicolon-separated path names to language file directories.
     * In each directory may be any number of 2 or 5 letter .properties files which are loaded on a per-language basis,
     * with the pre-".properties" portion of the file name used as the language code.
     * The built-in default path is "resource:server.markhome.ycf.langs".  Although the only populated
     * language in that resource directory is "en", there is a hierarchy of accepted language codes and their fallbacks
     * defined with no actual translations in them, so the default for IYCF is to report all exceptions in English.
     */
    protected static ArrayList<IInzPathEntry> pathEntries = new ArrayList<>();
    static {
        // Add the default IYCF IInz path entry
        pathEntries.add(new IInzPathEntry(IInz.interface, IYCFLIB_INZ_PATH));
//        pathEntries.add(new IInzPathEntry("/opt/ycf/v3_1/java" + IYCFLIB_INZ_PATH));
    }

    /**
     * The language file entries matching the langPath.
     */
    protected static ArrayList<IInzEntry> entries = new ArrayList<>();

    /**
     * The default language code used when no specific language is set.
     * This is typically "en" for English.
     */
    public static final String DEFAULT_LANG_CODE = "en";
    
    /**
     * The current system language code, used for the single-argument version of x().
     */
    protected static String systemLangCode = DEFAULT_LANG_CODE;

    protected static AtomicReference<IIInzEffectiveLangCode> effectiveLangCallback = new AtomicReference<>(null);

    /**
     * The IYCF IInzEntry references resource:server.markhome.ycf.langs and
     * defines the hierarchy of language codes.  All other language codes hierarchy information
     * is ignored and overwritten by the hierarchy information from the IYCF IInzEntry.
     */
    public static final IInzEntry IYCFLIB_INZ_ENTRY;
    static {
        IYCFLIB_INZ_ENTRY = new IInzEntry(pathEntries.get(0));
        entries.add(IYCFLIB_INZ_ENTRY);
    }

    /**
     * Private constructor to prevent instantiation.
     * This class is designed to be used as a singleton, so the constructor is private.
     */
    private IInz() {
       
    }

    /**
     * Add a language path entry to the list of path entries, load and initialize it, and wire it for translations
     * @param pathEntry The IInzPathEntry to add.
     */
    public static void addPathEntry(IInzPathEntry pathEntry) {
        if (pathEntry == null) {
            throw new IllegalArgumentException("Path entry cannot be null.");
        }
        if (!pathEntries.contains(pathEntry)) {
            pathEntries.add(pathEntry);
            IInzEntry entry = new IInzEntry(pathEntry);
            entry.loadLangs();
            entries.add(entry);
        } // else {
        //     throw new IllegalArgumentException("Path entry already exists: " + pathEntry.getPath());
        // }
    }

    /**
     * Get the list of path entries.
     * This method returns the current list of IInzPathEntry objects.
     *
     * @return The list of IInzPathEntry objects.
     */
    public static ArrayList<IInzPathEntry> getPathEntries() {
        return new ArrayList<>(pathEntries); // Return a copy to prevent external modification
    }

    /**
     * Load the language entries and their language translations from the path specified.
     * This method will clear existing entries if forceReload is true.
     * It will throw an IllegalStateException if the language path is not set or is empty.
     * It will throw an IllegalArgumentException if the path does not exist or is not a directory.
     * If any error occurs while loading the entries, it will throw a RuntimeException.
     *
     * @param forceReload If true, existing entries will be cleared before loading new ones.
     * @throws IllegalStateException if the language path is not set or is empty.
     * @throws IllegalArgumentException if the path does not exist or is not a directory.
     * @throws RuntimeException if an error occurs while loading the entries.
     * @see IInzEntry#loadLangs()
     * @see IInzLang
     * @see IInz#x(String, String)
     * @see IInzEntry
     * @see IInzLang#x(String)
     * 
     * This method is typically called to initialize the language entries before using the translation methods.
     * It allows for dynamic loading of language files from specified directories.
     * If the language path is not set, it will throw an exception to ensure that the user sets it before attempting to load entries.
     * The method supports reloading of entries by clearing existing ones if `forceReload` is true.
     * It iterates through each path in the semicolon-separated list, checking if the path exists and is a directory,
     * and then attempts to load language files from that directory.
     * If any path does not exist or is not a directory, it throws an IllegalArgumentException.
     * If an error occurs while loading the language files, it throws a RuntimeException with the error details.
     * The method ensures that all loaded entries are added to the `entries` list for later use in translations.
     * 
     * Example usage:
     * <pre>
     * IInz inz = new IInz();
     * inz.setLangPath("path/to/languages");
     * inz.loadLangEntries(true); // Load entries, clearing existing ones if any
     * String translation = inz.x("greeting", "en"); // Get translation for 'greeting' in English
     * </pre>
     */
    public static void loadLangEntries(boolean forceReload) {
        if (pathEntries == null || pathEntries.isEmpty()) {
            throw new IllegalStateException("Path entries are not set");
        }
        if (forceReload) {
            entries.clear(); // Clear existing entries if force reload is requested
        }
        if (entries.size() <= 1) {
            if (entries.isEmpty()) {
                entries.add(IYCFLIB_INZ_ENTRY); // Ensure the IYCF IInzEntry is
            }
            for (int idx = 1; idx < pathEntries.size(); idx++) {
                IInzPathEntry pathEntry = pathEntries.get(idx);
                if (pathEntry == null || pathEntry.getPath() == null || pathEntry.getPath().isEmpty()) {
                    throw new IllegalStateException("Path entry is not set for index: " + idx);
                }
                IInzEntry entry = new IInzEntry(pathEntry);
                try {
                    entry.loadLangs();
                    entries.add(entry);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to load language entries from path: " + pathEntry.getPath(), e);
                }
            }   
        }
    }

    /**
     * Get the current system language code.
     * This method returns the language code currently set for the system.
     *
     * @return The current system language code as a String.
     */
    public static String getSystemLangCode() {
        return systemLangCode;
    }

    /**
     * Set the current system language code.
     * @param langCode
     */
    public static void setSystemLangCode(String langCode) {
        if (langCode == null || langCode.isEmpty()) {
            throw new IllegalArgumentException("Language code cannot be null or empty.");
        }
        if (langCode.length() != 2 && langCode.length() != 5) {
            throw new IllegalArgumentException("Language code must be 2..5 characters");
        }
        if (langCode.length() == 5 && langCode.charAt(2) != '-') {
            throw new IllegalArgumentException( "5-character language code must be separated in position 2 by a hyphen");
        }
        systemLangCode = langCode.toLowerCase(); // Store the language code in lowercase for consistency
    }

    /**
     * Set the callback hook for getting the current session's language id string.
     * 
     * @param callback
     * @return The previously registered callback
     */
    public static IIInzEffectiveLangCode installEffectiveLangCodeCallback(IIInzEffectiveLangCode callback) {
        IIInzEffectiveLangCode prevCallback = effectiveLangCallback.get();
        if (prevCallback != callback) {
            effectiveLangCallback.compareAndSet(prevCallback, callback);
            if (callback == effectiveLangCallback.get()) {
                return prevCallback;
            }
            else {
                throw new IllegalStateException("Error registering replacement Effective Language Code callback");
            }
        }
        else {
            return prevCallback;
        }
    }

    /**
     * Get the callback hook for getting the current session's language id string.
     * 
     * @return The IIInzEffectiveLangId callback that was most recently installed; initially null.
     */
    public static IIInzEffectiveLangCode getEffectiveLangCodeCallback() {
        return effectiveLangCallback.get();
    }

    /**
     * Get the current effective language id.  If any exceptions are thrown by the most recently installed callback, the system language code is used. If that isn't valid, the language defaults to "en".
     * 
     * @return The current effective language id.
     */
    public static String getEffectiveLangCode() {
        String effLangCode;
        IIInzEffectiveLangCode cb = getEffectiveLangCodeCallback();
        if (cb != null) {
            try {
                effLangCode = cb.getEffectiveLangCode();
            }
            catch (Exception ex) {
                effLangCode = null;
            }
        }
        else {
            effLangCode = null;
        }

        if (effLangCode == null || effLangCode.isEmpty()) {
            effLangCode = getSystemLangCode();
        }

        if (effLangCode == null || effLangCode.isEmpty()) {
            effLangCode = "en";
        }

        return effLangCode;
    }

    /**
     * Get a translation for a given key in the current system language, probing each of the path entries in order
     * until a non-null translation is found.  If no translation is found, it returns "!key!".
     * @param key The translation key to look up.
     * @return The translated string if found, or "!key!" if not found.
     * @throws IllegalArgumentException if the key is null or empty.
     * @see IInzEntry#x(String, String)
     * @see IInzLang#x(String)
     */
    public static String x(String key) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Key cannot be null or empty.");
        }
        return x(key, getEffectiveLangCode());
    }

    /**
     * Get a translation for a given key in the specified language, probing each of the path entries in order
     * until a non-null translation is found.  If no translation is found, it returns "!key!".
     * This method is case-insensitive for both the key and the language code.
     * @param key The translation key to look up.
     * @param langCode The language code to use for the translation.
     * @return The translated string if found, or "!key!" if not found.
     * @throws IllegalArgumentException if the key or language code is null or empty.
     * @see IInzEntry#x(String, String)
     * @see IInzLang#x(String)
     */
    public static String x(String key, String langCode) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Key cannot be null or empty.");
        }
        if (langCode == null || langCode.isEmpty()) {
            throw new IllegalArgumentException("Language code cannot be null or empty.");
        }
        if (langCode.length() != 2 && !(langCode.length() == 5 && langCode.charAt(2) == '-')) {
            throw new IllegalArgumentException("Language code must be a 2-character or 5-character language code");
        }
        String lowerLangCode = langCode.toLowerCase();
        while (lowerLangCode != null) {
            for (int i = entries.size() - 1; i >= 0; i--) {
                IInzEntry entry = entries.get(i);
                String translation = entry.x(key, lowerLangCode);
                if (translation != null) {
                    return translation; // Return the first non-null translation found
                }
            }
            if (lowerLangCode.length() == 5) {
                lowerLangCode = lowerLangCode.substring(0,1);
            }
            else {
                if ("en".equals(lowerLangCode)) {
                    lowerLangCode = null;
                }
                else {
                    lowerLangCode = "en";
                }
            }
        }
        // If no translation is found, return the key wrapped in exclamation marks
        return "!" + key + "!";
    }

    /**
     * Get a system English translation for a given key using resource path entries only.
     * @param key The translation key to look up.
     * @return The translated string if found, or "!key!" if not found.
     * @throws IllegalArgumentException if the key is null or empty.
     * @see IInzEntry#x(String, String)
     * @see IInzLang#x(String)
     */
    public static String s(String key) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Key cannot be null or empty.");
        }
        for (int i = entries.size() - 1; i >= 0; i--) {
            IInzEntry entry = entries.get(i);
            if (entry.getPathEntry().getClazz() != null && entry.getPathEntry().getPath().startsWith("resource:")) {
                String translation = entry.x(key, "en");
                if (translation != null) {
                    return translation; // Return the first non-null translation found
                }
            }
        }
        // If no translation is found, return the key wrapped in exclamation marks
        return "!" + key + "!";
    }
}
