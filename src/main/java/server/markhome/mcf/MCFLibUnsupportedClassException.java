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

import server.markhome.mcf.Inz;

/**
 * MCFLibUnsupportedClassException is thrown when an argument is not a supported class instance or derivative.
 */
public class MCFLibUnsupportedClassException extends IllegalStateException {

	protected String localMessage = null;

	public MCFLibUnsupportedClassException(
		String enMsg,
		String xMsg )
	{
		super( enMsg );
		this.localMessage = xMsg;
	}

	// public MCFLibUnsupportedClassException(
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th)
	// {
	// 		super(enMsg, th);
	// 		this.localMessage = xMsg;
	// }

	public MCFLibUnsupportedClassException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("mcflib.MCFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )));
		this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public MCFLibUnsupportedClassException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("mcflib.MCFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )),
				th );
		this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public MCFLibUnsupportedClassException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("mcflib.MCFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
		this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	public MCFLibUnsupportedClassException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("mcflib.MCFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ),
				th );
		this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	// public MCFLibUnsupportedClassException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( String.format(Inz.s("mcflib.MCFLibArgumentException.FldMsg"),
	// 			enFieldName,
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
	// 	this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.FldMsg"),
	// 			(xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName,
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	// }

	public MCFLibUnsupportedClassException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("mcflib.MCFLibArgumentException.FldMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
		this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public MCFLibUnsupportedClassException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("mcflib.MCFLibArgumentException.FldMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
				th );
		this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.FldMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public MCFLibUnsupportedClassException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg )
	{
		super(String.format(Inz.s("mcflib.MCFLibArgumentException.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
		this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public MCFLibUnsupportedClassException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("mcflib.MCFLibArgumentException.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
				th );
		this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public MCFLibUnsupportedClassException()
	{
		super(String.format(Inz.s("mcflib.MCFLibUnsupportedClassException.default"), ""));//%1$sUnsupported class
		this.localMessage = String.format(Inz.x("mcflib.MCFLibUnsupportedClassException.default"), "");
	}

	public MCFLibUnsupportedClassException(
		Class<?> throwingClass,
		String methName )
	{
		super(String.format(Inz.s("mcflib.MCFLibUnsupportedClassException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )));
		this.localMessage = String.format(Inz.x("mcflib.MCFLibUnsupportedClassException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ));
	}

	public MCFLibUnsupportedClassException(
		Class<?> throwingClass,
		String methName,
		Throwable th )
	{
		super(String.format(Inz.s("mcflib.MCFLibUnsupportedClassException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )),
				th );
		this.localMessage = String.format(Inz.x("mcflib.MCFLibUnsupportedClassException.default"),
				throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ));
	}

	public MCFLibUnsupportedClassException(
		String fieldName,
		String methName,
		Throwable th )
	{
		super(String.format(Inz.s("mcflib.MCFLibUnsupportedClassException.default"),
				fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " )),
				th );
		this.localMessage = String.format(Inz.x("mcflib.MCFLibUnsupportedClassException.default"),
				fieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ));
	}

	public MCFLibUnsupportedClassException(
		Class<?> throwingClass,
		String methName,
		String argObjName,
		Object argObj,
		String argExpectedClasses )
	{
		super( (argObj != null) ? String.format(Inz.s("mcflib.MCFLibUnsupportedClassException.objwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					argObjName,
					argObj.getClass().getName(),
					argExpectedClasses )
				: String.format(Inz.s("mcflib.MCFLibUnsupportedClassException.nullwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					argObjName,
					argExpectedClasses ) );
		this.localMessage = (argObj != null) ? String.format(Inz.x("mcflib.MCFLibUnsupportedClassException.objwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					argObjName,
					argObj.getClass().getName(),
					argExpectedClasses )
				: String.format(Inz.x("mcflib.MCFLibUnsupportedClassException.nullwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					argObjName,
					argExpectedClasses );
	}

	public MCFLibUnsupportedClassException(
		Class<?> throwingClass,
		String methName,
		String argObjName,
		Object argObj,
		String argExpectedClasses,
		Throwable th )
	{
		super( (argObj != null) ? String.format(Inz.s("mcflib.MCFLibUnsupportedClassException.objwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					argObjName,
					argObj.getClass().getName(),
					argExpectedClasses )
				: String.format(Inz.s("mcflib.MCFLibUnsupportedClassException.nullwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					argObjName,
					argExpectedClasses ),
			th );
		this.localMessage = (argObj != null) ? String.format(Inz.x("mcflib.MCFLibUnsupportedClassException.objwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					argObjName,
					argObj.getClass().getName(),
					argExpectedClasses )
				: String.format(Inz.x("mcflib.MCFLibUnsupportedClassException.nullwithclasses"),
					throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " " ),
					argObjName,
					argExpectedClasses );
	}

	@Override
	public String getLocalizedMessage() {
		if (localMessage != null) {
			return localMessage;
		}
		else {
			return getMessage();
		}
	}
}
