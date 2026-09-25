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

import java.util.*;

/**
 * IMCFLibOptional is the base interface used to specify the accessors used to manipulate optional values.
 * @author msobkow
 */
public interface IMCFLibRequired extends JSObject {

	/**
	 *	Is this value null?
	 *	@return true if the value is null, otherwise false
	 */
	public default boolean isNull() { return false; }

	/**
	 *	Make this value null.
	 */
	public default void setNull() {
		throw new MCFLibNullArgumentException(getClass(), "setNull", 0, "value");
	};
}
