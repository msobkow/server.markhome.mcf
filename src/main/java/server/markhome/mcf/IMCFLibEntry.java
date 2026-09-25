/*
 * Copyright 2026 Mark Stephen Sobkow (mark.sobkow@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://apache.org
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package server.markhome.mcf;

import org.teavm.jso.JSExport;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

public interface IMCFLibEntry extends JSObject {

	/**
	 *	The public resource name for the parent library.
	 *
	 *	Implementations should define a public static final constant string prefixed by the uppercase library name matching the following signature:
	 *
	 *	<tt>public static final String MCF_LIB_PARENT_NAME = "server.markhome";</tt>
	 */

	/**
	 *	The parent resource name for this library.
	 *
	 *	Implementations should define a public static final constant string prefixed by the uppercase library name matching the following signature:
	 *
	 *	<tt>public static final String MCF_LIB_PARENT_VERSION = "3.1.42-2026091111";</tt>
	 */

	/**
	 *	The public resource name for this library.
	 *
	 *	Implementations should define a public static final constant string prefixed by the uppercase library name matching the following signature:
	 *
	 *	<tt>public static final String MCF_LIB_NAME = MCF_LIB_PARENT_NAME + ".mcf";</tt>
	 */

	/**
	 *	The public version string for this library.
	 *
	 *	Implementations should define a public static final constant string prefixed by the uppercase library name matching the following signature:
	 *
	 *	<tt>public static final String MCF_LIB_VERSION = MCF_LIB_PARENT_VERSION;</tt>
	 */

	/**
	 *	Implementations must be a singleton, returning the same instance over and over after initialization. How this is achieved may vary.
	 *
	 *	<tt>protected final static singleton = new AtomicReference<MCFLibEntry>(null);</tt>
	 */

	/**
	 *	Default constructor is protected so that only a singleton can be created.
	 *
	 *	<tt>protected MCFLibEntry { }</tt>
	 */

	/**
	 *	Get the singleton.
	 *
	 *	Implementations should define a public static final method with the following signature, using the uppercase package name before "Lib" as appropriate.
	 *
	 *	<tt>public final static MCFLibEntry getMCFLibEntrySingleton()</tt>
	 *
	 *	@return Return the library singleton. Always returns the same instance after the first invocation unless reset(true) is invoked.
	 */

	/**
	 *	Get an instance. Because this is a singleton, getInstance() always returns null, as it just invokes MCFLibEntry() under the hood.
	 *
	 *	Implementations should define a public static final method with the following signature, using the uppercase package name before "Lib" as appropriate.
	 *
	 *	<tt>public final static MCFLibEntry getMCFLibEntryInstance()</tt>
	 *
	 *	@return The instance, if any. Always returns null.
	 */

	/**
	 *	Reset the singleton and any data caches after an application reload or other package or executable reloading event.
	 *
	 *	Implementations should define a public static final method with the following signature, using the uppercase package name before "Lib" as appropriate.
	 *
	 *	<tt>public static boolean execMCFLibEntryLibReset(boolean yesReally)</tt>
	 *
	 *	@param	yesReally Are you sure you want to reset the value?
	 */

	/**
	 *	Get an instance, if possible.  Invokes getMCFLibEntryInstance() under the hood.
	 *
	 *	@return Return an instance if dynamically allocated, otherwise null. Because this is a singleton, null will always be returned.
	 */
	@JSProperty
	public MCFLibEntry getInstance();

	/**
	 *	Get the singleton instance, if any. Invokes getMCFLibEntrySingleton() under the hood.
	 *
	 *	@return Return the library singleton, if any. Always returns the same value after the first invocation unless reset(true) is invoked.
	 */
	@JSProperty
	public MCFLibEntry getSingleton();

	/**
	 *	Reset the singleton and any other data caches after an application reload or other package or executable reloading event.
	 *
	 *	Invokes execMCFLibEntryReset(false) under the hood.
	 *
	 *	@return True if the library was reinitialized, false if the code detected that the library has not been used since the last reinitialization.
	 */
	@JSExport
	public boolean libReset();

	/**
	 *	Reset the singleton and any other data caches after an application reload or other package or executable reloading event.
	 *
	 *	Invokes execMCFLibEntryReset(yesReally) under the hood.
	 *
	 *	@param	yesReally Are you sure you want to reset the value?
	 *
	 *	@return True if the library was reinitialized, false if the code detected that the library has not been used since the last reinitialization.
	 */
	@JSExport
	public boolean libReset(boolean yesReally);

	/**
	 *	Reset the singleton and any data caches after an application reload or other package or executable reloading event.
	 *
	 *	@param	yesReally Are you sure you want to reset the value?
	 *
	 *	@return	True if the singleton was reset, false if the singleton was set and yesReally was false.
	 */
	@JSExport
	public boolean resetLib(boolean yesReally);

	/**
	 *	Reset the singleton and any data caches after an application reload or other package or executable reloading event.
	 *
	 *	@return	True if the value was reset, false if the singleton was already initialized.
	 */
	@JSExport
	public boolean resetLib();

	/**
	 *	Get the parent's public resource name of this library or package, used in searches to resolve the package for runtimes or compilation and test.
	 *
	 *	@return The parent's public resource name used for named resource resolution.
	 */
	@JSProperty
	public String getParentLibName();

	/**
	 *	Get name public resource name of this library or package, used in searches to resolve the package for runtimes or compilation and test.
	 *
	 *	@return The name of this package used for public naming resolution.
	 */
	@JSProperty
	public String getParentLibVersion();

	/**
	 *	Get the public resource name of this library or package, used in searches to resolve the package for runtimes or compilation and test.
	 *
	 *	@return The name of this package used for public naming resolution.
	 */
	@JSProperty
	public String getLibName();

	/**
	 *	Get the public resource name of this library or package, used in searches to resolve the package for runtimes or compilation and test.
	 *
	 *	@return The name of this package used for public naming resolution.
	 */
	@JSProperty
	public String getLibVersion();

	/**
	 *	The default main does nothing.
	 *
	 *	<tt>public static void main(int argc, String[] argv) { return 0; }</tt>
	 *	<tt>public static void main(String[] argv) { main(argv.length, argv); }</tt>
	 */
}
