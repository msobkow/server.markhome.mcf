package server.markhome.mcf.v3_1.cflib;

import java.util.concurrent.atomic.AtomicReference;

public final class MCFLibEntry implements IMCFLibEntry {

	/**
	 *	The public resource name for the parent library.
	 *
	 *	Implementations should define a public static final constant string prefixed by the uppercase library name matching the following signature:
	 *
	 *	<tt>public static final String MCF_LIB_PARENT_NAME = "server.markhome";</tt>
	 */
	public static final String LIB_PARENT_NAME = "server.markhome";

	/**
	 *	The parent resource name for this library.
	 *
	 *	Implementations should define a public static final constant string prefixed by the uppercase library name matching the following signature:
	 *
	 *	<tt>public static final String MCF_LIB_PARENT_VERSION = "3.1.42-2026091111";</tt>
	 */
	public static final String LIB_PARENT_VERSION = "3.1.42-2026091111";

	/**
	 *	The public resource name for this library.
	 *
	 *	Implementations should define a public static final constant string prefixed by the uppercase library name matching the following signature:
	 *
	 *	<tt>public static final String MCF_LIB_NAME = LIB_PARENT_NAME + ".mcf";</tt>
	 */
	public static final String LIB_NAME = LIB_PARENT_NAME + ".mcf";

	/**
	 *	The public version string for this library.
	 *
	 *	Implementations should define a public static final constant string prefixed by the uppercase library name matching the following signature:
	 *
	 *	<tt>public static final String MCF_LIB_VERSION = LIB_PARENT_VERSION;</tt>
	 */
	public static final String LIB_VERSION = CFLIB_PARENT_VERSION;

	/**
	 *	Implementations must be a singleton, returning the same instance over and over after initialization. How this is achieved may vary.
	 *
	 *	<tt>protected final static singleton = new AtomicReference<MCFLibraryEntry>(null);</tt>
	 */
	protected final static singleton = new AtomicReference<MCFLibraryEntry>(null);

	/**
	 *	Default constructor is protected so that only a singleton can be created.
	 *
	 *	<tt>protected MCFLibEntry { }</tt>
	 */
	protected MCFLibEntry { }

	/**
	 *	Get the singleton.
	 *
	 *	Implementations should define a public static final method with the following signature, using the uppercase package name before "Lib" as appropriate.
	 *
	 *	<tt>public final static MCFLibEntry getMCFLibEntrySingleton()</tt>
	 *
	 *	@return Return the library singleton. Always returns the same instance after the first invocation unless reset(true) is invoked.
	 */
	public final static MCFLibEntry getMCFLibEntrySingleton() {
		MCFLibraryEntry retval = singleton.get();
		if( retval == null ) {
			retval = new MCFLibEntry();
			singleton.compareAndSet(null, retval);
			retval = singleton.get();
		}
		return(retval);
	}

	/**
	 *	Get an instance. Because this is a singleton, getInstance() always returns null, as it just invokes MCFLibEntry() under the hood.
	 *
	 *	Implementations should define a public static final method with the following signature, using the uppercase package name before "Lib" as appropriate.
	 *
	 *	<tt>public final static MCFLibraryEntry getMCFLibEntryInstance()</tt>
	 *
	 *	@return The instance, if any. Always returns null.
	 */
	public static MCFLibraryEntry getMCFLibEntryInstance() { return(null); }

	/**
	 *	Reset the singleton and any data caches after an application reload or other package or executable reloading event.
	 *
	 *	Implementations should define a public static final method with the following signature, using the uppercase package name before "Lib" as appropriate.
	 *
	 *	<tt>public static boolean execMCFLibEntryLibReset(boolean yesReally)</tt>
	 *
	 *	@param	yesReally Are you sure you want to reset the value?
	 */
	public static boolean execMCFLibEntryLibReset(boolean yesReally) {
		MCFLibraryEntry sgl = singleton.get();
		boolean retval;
		if (sgl== null) {
			retval = false;

			MCFLibraryEntry sgl = getSingleton();
			assert(sgl != null, "Singleton must not be null after initialization");

			retval = true;
		}
		else {
			retval = false;

			if (yesReally) {
				singleton.compareAndSet(retval, null);
			}

			MCFLibraryEntry sgl = getSingleton();
			assert(sgl != null, "Singleton must not be null after initialization");

			retval = true;
		}
		return (retval);
	}

	/**
	 *	Get an instance, if possible.  Invokes getMCFLibEntryInstance() under the hood.
	 *
	 *	@return Return an instance if dynamically allocated, otherwise null. Because this is a singleton, null will always be returned.
	 */
	public MCFLibraryEntry getInstance() { return(getMCFLibEntryInstance()); }

	/**
	 *	Get the singleton instance, if any. Invokes getMCFLibEntrySingleton() under the hood.
	 *
	 *	@return Return the library singleton, if any. Always returns the same value after the first invocation unless reset(true) is invoked.
	 */
	public MCFLibEntry getSingleton() { return(getMCFLibEntrySingleton()); }

	/**
	 *	Reset the singleton and any other data caches after an application reload or other package or executable reloading event.
	 *
	 *	Invokes libReset(false) under the hood.
	 *
	 *	@return True if the library was reinitialized, false if the code detected that the library has not been used since the last reinitialization.
	 */
	public boolean libReset() { libReset(false); }

	/**
	 *	Reset the singleton and any other data caches after an application reload or other package or executable reloading event.
	 *
	 *	Invokes execMCFLibEntryReset(false) under the hood.
	 *
	 *	@return True if the library was reinitialized, false if the code detected that the library has not been used since the last reinitialization.
	 */
	public boolean libReset(boolean yesReally) { execMCFLibEntryLibReset(yesReally); }

	/**
	 *	Reset the singleton and any data caches after an application reload or other package or executable reloading event.
	 *
	 *	@param	yesReally Are you sure you want to reset the value?
	 *
	 *	@return	True if the singleton was reset, false if the singleton was set and yesReally was false.
	 */
	public boolean resetLib(boolean yesReally) { execMCFLibEntryLibReset(yesReally); }

	/**
	 *	Reset the singleton and any data caches after an application reload or other package or executable reloading event.
	 *
	 *	@return	True if the value was reset, false if the singleton was already initialized.
	 */
	public boolean resetLib() { return(resetLib(false)); }

	/**
	 *	Get the parent's public resource name of this library or package, used in searches to resolve the package for runtimes or compilation and test.
	 *
	 *	@return The parent's public resource name used for named resource resolution.
	 */
	public String getParentLibName() { return(PARENT_LIB_NAME); }

	/**
	 *	Get name public resource name of this library or package, used in searches to resolve the package for runtimes or compilation and test.
	 *
	 *	@return The name of this package used for public naming resolution.
	 */
	public String getParentLibVersion() { return(PARENT_LIB_VERSION); }

	/**
	 *	Get the public resource name of this library or package, used in searches to resolve the package for runtimes or compilation and test.
	 *
	 *	@return The name of this package used for public naming resolution.
	 */
	public String getLibName() { return(LIB_NAME); }

	/**
	 *	Get the public resource name of this library or package, used in searches to resolve the package for runtimes or compilation and test.
	 *
	 *	@return The name of this package used for public naming resolution.
	 */
	public String getLibVersion() { return(LIB_VERSION); }

	/**
	 *	The default main does nothing.
	 *
	 *	<tt>public static int main(int argc, String[] argv) { return 0; }</tt>
	 */
	public static int main(int argc, String[] argv) { return 0; }
}
