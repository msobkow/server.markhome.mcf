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

import server.markhome.mcf.Inz;

/**
 * MCFLibUnrecognizedAttributeException is primarily thrown by the manufacted XML parsers.
 */
public class MCFLibUnrecognizedAttributeException extends NoSuchElementException {

	protected String localMessage = null;
	protected String locInfo = null;
	protected String attrName = null;

	public MCFLibUnrecognizedAttributeException(
		String enMsg,
		String xMsg )
	{
		super( enMsg );
		this.localMessage = xMsg;
	}

	public MCFLibUnrecognizedAttributeException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, th);
			this.localMessage = xMsg;
	}

	// public MCFLibUnrecognizedAttributeException(
	// 	Class<?> throwingClass,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( String.format(Inz.s("mcflib.MCFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )));
	// 	this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	// }

	// public MCFLibUnrecognizedAttributeException(
	// 	Class<?> throwingClass,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super( String.format(Inz.s("mcflib.MCFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )),
	// 			th );
	// 	this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	// }

	public MCFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("mcflib.MCFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
		this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	public MCFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("mcflib.MCFLibArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
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

	// public MCFLibUnrecognizedAttributeException(
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

	// public MCFLibUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( String.format(Inz.s("mcflib.MCFLibArgumentException.FldMsg"),
	// 			enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
	// 	this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.FldMsg"),
	// 			((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	// }

	// public MCFLibUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super( String.format(Inz.s("mcflib.MCFLibArgumentException.FldMsg"),
	// 			enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
	// 			th );
	// 	this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.FldMsg"),
	// 			((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	// }

	public MCFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg )
	{
		super(String.format(Inz.s("mcflib.MCFLibArgumentException.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
		this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public MCFLibUnrecognizedAttributeException(
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
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
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

	public MCFLibUnrecognizedAttributeException()
	{
		super(String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.default"),
				"").trim());
		this.localMessage = String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.default"),
				"").trim();
	}

	public MCFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName )
	{
		super(String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.localMessage = String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public MCFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		String locInfo,
		String attrName )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ))));
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}

	public MCFLibUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		String locInfo,
		String attrName,
		Throwable th )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ))),
			th);
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}



	public MCFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName )
	{
		super(String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.default"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.localMessage = String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.default"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public MCFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		String locInfo,
		String attrName )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.locattr"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo,
							attrName)
					: String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.loc"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.attr"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							attrName)
					: String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.default"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )))));
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.locattr"),
							(((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo,
							attrName)
					: String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.loc"),
							(((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.attr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.default"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}

	public MCFLibUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		String locInfo,
		String attrName,
		Throwable th )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.locattr"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.loc"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.attr"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.s("mcflib.MCFLibUnrecognizedAttributeException.default"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ))),
			th);
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.locattr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.loc"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.attr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("mcflib.MCFLibUnrecognizedAttributeException.default"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}


	public String getLocInfo() {
		return locInfo;
	}

	public String getAttrName() {
		return attrName;
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
