/**
 *	server.markhome.mcf-core - Mark's Code Fractal Core Services
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

package server.markhome.mcf;

import org.teavm.jso.JSExport;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import server.markhome.mcf.Inz;

/**
 * MCFLibCollisionDetectedException is thrown when there is already an existing entry with the specified key that conflicts with new data or other data changes.
 */
public class MCFLibCollisionDetectedException extends MCFLibRuntimeException {

	protected Object indexKey = null;

	public MCFLibCollisionDetectedException(
		String enMsg,
		String xMsg )
	{
		super( enMsg, xMsg );
	}

	public MCFLibCollisionDetectedException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg )
	{
		super( throwingClass, methName, enMsg, xMsg );
	}

	public MCFLibCollisionDetectedException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( throwingClass, methName,  enMsg, xMsg, th );
	}

	public MCFLibCollisionDetectedException(
		Class<?> throwingClass,
		String methName,
		Object argKey )
	{
		super( ((argKey != null)
					? String.format(Inz.s("mcflib.MCFLibCollisionDetectedException.pkey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
						argKey.toString())
					: String.format(Inz.s("mcflib.MCFLibCollisionDetectedException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )))),
				((argKey != null)
					? String.format(Inz.x("mcflib.MCFLibCollisionDetectedException.pkey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
						argKey.toString())
					: String.format(Inz.s("mcflib.MCFLibCollisionDetectedException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")))));
		indexKey = argKey;
	}

	public MCFLibCollisionDetectedException(
		Class<?> throwingClass,
		String methName,
		Object argKey,
		Throwable th )
	{
		super( ((argKey != null)
					? String.format(Inz.s("mcflib.MCFLibCollisionDetectedException.pkey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
						argKey.toString())
					: String.format(Inz.s("mcflib.MCFLibCollisionDetectedException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")))),
				((argKey != null)
					? String.format(Inz.x("mcflib.MCFLibCollisionDetectedException.pkey"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")),
						argKey.toString())
					: String.format(Inz.s("mcflib.MCFLibCollisionDetectedException.default"),
						(throwingClass.getName() + ((methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "")))),
				th);
		indexKey = argKey;
	}

	public Object getIndexKey() {
		return( indexKey );
	}
}
