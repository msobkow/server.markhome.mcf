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

import server.markhome.ycf.Inz;

/**
 * YCFLibEmptyArgumentException is thrown when an argument is null or empty.
 */
public class YCFLibInvalidStateException extends YCFLibArgumentException {

	// Inherited constructor patterns

	public YCFLibInvalidStateException(
		String enMsg,
		String xMsg )
	{
		super(enMsg, xMsg);
	}

	public YCFLibInvalidStateException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, xMsg, th);
	}

//	public YCFLibInvalidStateException(
//		Class<?> throwingClass,
//		String methName,
//		String enMsg,
//		String xMsg )
//	{
//		super(throwingClass, methName, enMsg, xMsg);
//	}

//	public YCFLibInvalidStateException(
//		Class<?> throwingClass,
//		String methName,
//		String enMsg,
//		String xMsg,
//		Throwable th )
//	{
//		super(throwingClass, methName, enMsg, xMsg, th);
//	}

	public YCFLibInvalidStateException(
	 	Class<?> throwingClass,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
	 	String xMsg )
	{
	 	super(throwingClass, methName, argNo, argName, enMsg, xMsg);
	}

	public YCFLibInvalidStateException(
	 	Class<?> throwingClass,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
	 	String xMsg,
	 	Throwable th )
	{
	 	super(throwingClass, methName, argNo, argName, enMsg, xMsg, th);
	}

	public YCFLibInvalidStateException(
		String enFieldName,
		String xFieldName,
		String enMsg,
		String xMsg )
	{
		super(enFieldName, xFieldName, enMsg, xMsg);
	}

//	public YCFLibInvalidStateException(
//		String enFieldName,
//		String xFieldName,
//		String methName,
//		String enMsg,
//		String xMsg )
//	{
//		super(enFieldName, xFieldName, methName, enMsg, xMsg);
//	}

//	public YCFLibInvalidStateException(
//		String enFieldName,
//		String xFieldName,
//		String methName,
//		String enMsg,
//		String xMsg,
//		Throwable th )
//	{
//		super(enFieldName, xFieldName, methName, enMsg, xMsg, th);
//	}

	public YCFLibInvalidStateException(
	 	String enFieldName,
		String xFieldName,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
		String xMsg )
	{
	 	super(enFieldName, xFieldName, methName, argNo, argName, enMsg, xMsg);
	}

	public YCFLibInvalidStateException(
	 	String enFieldName,
		String xFieldName,
	 	String methName,
	 	int argNo,
	 	String argName,
	 	String enMsg,
	 	String xMsg,
	 	Throwable th )
	{
	 	super(enFieldName, xFieldName, methName, argNo, argName, enMsg, xMsg, th);
	}

	// Custom/most-often-used constructors

	public YCFLibInvalidStateException(
		Class<?> throwingClass,
		String methName,
		String enReason,
		String xReason )
	{
		super(String.format(Inz.s("ycflib.YCFLibInvalidStateException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				enReason),
			String.format(Inz.x("ycflib.YCFLibInvalidStateException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				xReason));
	}

	public YCFLibInvalidStateException(
		Class<?> throwingClass,
		String methName,
		String enReason,
		String xReason,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YCFLibInvalidStateException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				enReason),
		String.format(Inz.x("ycflib.YCFLibInvalidStateException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				xReason),
			th);
	}

	public YCFLibInvalidStateException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enReason,
		String xReason )
	{
		super(String.format(Inz.s("ycflib.YCFLibInvalidStateException.FldMsg"),
				enFieldName + ( ( methName != null && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				enReason),
		String.format(Inz.x("ycflib.YCFLibInvalidStateException.FldMsg"),
				enFieldName + ( ( methName != null && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				xReason));
	}

	public YCFLibInvalidStateException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enReason,
		String xReason,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YCFLibInvalidStateException.FldMsg"),
				enFieldName + ( ( methName != null && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				enReason),
		String.format(Inz.x("ycflib.YCFLibInvalidStateException.FldMsg"),
				enFieldName + ( ( methName != null && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				xReason),
				th );
	}
}
