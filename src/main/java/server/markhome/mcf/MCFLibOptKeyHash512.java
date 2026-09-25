/*
 *	Mark's Code Fractal MCFLib KeyHash 3.1 Common Library
 *
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *
 *	MCFLib KeyHash provides essential types and utilities for Code Fractal applications.
 *
 *	These files are part of Mark's Code Fractal MCFLib KeyHash.
 *
 *	Mark's Code Fractal MCFLib KeyHash is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU Library General Public License,
 *	Version 3 or later with static linking exception.
 *
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the LGPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-LGPLv3-compatibly licensed code.  That said,
 *	code which does not rely on this library is free to specify whatever license its
 *	authors decide to use. Mark Sobkow specifically rejects the infectious nature of
 *	the LGPLv3, and considers the mere act of including LGPLv3 modules in an
 *	executable to be perfectly reasonable given tools like modern Java's single-jar
 *	deployment options.
 *
 *	Mark's Code Fractal MCFLib KeyHash is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU Library General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	Mark's Code Fractal MCFLib KeyHash is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU Library General Public License for more details.
 *
 *	You should have received a copy of the GNU Library General Public License
 *	along with Mark's Code Fractal MCFLib KeyHash.  If not, see &lt;https://www.gnu.org/licenses/&gt;.
 *
 *	If you wish to modify and use this code without publishing your changes in order to
 *	tie it to proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */
package server.markhome.mmcf.v3_1.mcflib.keyhash;

/**
 * MCFLibOptKeyHash512 extends MCFLibKeyHash512 with the appropriate behavior for the isNull() and setNull() method signatures.
 *
 * @author msobkow
 */
public class MCFLibOptKeyHash512 extends MCFLibKeyHash512 implements IMCFLibOptional, IMCFLibOptKeyHash512 {

	/**
	 *	Make this value null.
	 *
	 *	@throws MCFLibNullArgumentException
	 */
	@Override
	public void setNull() {
		byte[] ba = getBytes();
		if (ba != null ) {
			for( int i = 0; i < ba.length; i++ ) {
				ba[i] = 0;
			}
		}
	}
}
