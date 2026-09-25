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

/**
 * YCFLibReqKeyHash224 extends YCFLibKeyHash224 with the appropriate behavior for the isNull() and setNull() method signatures.
 *
 * @author msobkow
 */
public class YCFLibReqKeyHash224 extends YCFLibKeyHash224 implements IYCFLibRequired, IYCFLibReqKeyHash224 {

	/**
	 *	Is this value null?
	 *
	 *	@throws YCFLibInvalidStateException if the superclass implementation of isNull() returns true.
	 */
	@Override
	public boolean isNull() {
		if (super.isNull()) {
			throw new YCFLibInvalidStateException(getClass(), "isNull", 0, "super.isNull()", "superclass value is not allowed to be null", null);
		}
		return(false);
	}

	/**
	 *	Make this value null.
	 *
	 *	@throws YCFLibNullArgumentException
	 */
	@Override
	public void setNull() {
		throw new YCFLibNullArgumentException(getClass(), "setNull", 0, "required-attribute");
	}
}
