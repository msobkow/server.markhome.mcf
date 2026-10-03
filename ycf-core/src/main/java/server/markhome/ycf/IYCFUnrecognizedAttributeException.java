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

import server.markhome.ycf.Inz;

/**
 * IYCFUnrecognizedAttributeException is primarily thrown by the manufacted XML parsers.
 */
public interface IYCFUnrecognizedAttributeException extends JSObject {

	protected String localMessage = null;
	protected String locInfo = null;
	protected String attrName = null;

	public IYCFUnrecognizedAttributeException(
		String enMsg,
		String xMsg )
	{
		super( enMsg );
		this.localMessage = xMsg;
	}

	public IYCFUnrecognizedAttributeException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, th);
			this.localMessage = xMsg;
	}

	// public IYCFUnrecognizedAttributeException(
	// 	Class<?> throwingClass,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( String.format(Inz.s("ycflib.IYCFArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )));
	// 	this.localMessage = String.format(Inz.x("ycflib.IYCFArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	// }

	// public IYCFUnrecognizedAttributeException(
	// 	Class<?> throwingClass,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super( String.format(Inz.s("ycflib.IYCFArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )),
	// 			th );
	// 	this.localMessage = String.format(Inz.x("ycflib.IYCFArgumentException.TcmnMsg"),
	// 			throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	// }

	public IYCFUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("ycflib.IYCFArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
		this.localMessage = String.format(Inz.x("ycflib.IYCFArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	public IYCFUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("ycflib.IYCFArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ),
				th );
		this.localMessage = String.format(Inz.x("ycflib.IYCFArgumentException.TcmnArgMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	// public IYCFUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( String.format(Inz.s("ycflib.IYCFArgumentException.FldMsg"),
	// 			enFieldName,
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
	// 	this.localMessage = String.format(Inz.x("ycflib.IYCFArgumentException.FldMsg"),
	// 			(xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName,
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	// }

	// public IYCFUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg )
	// {
	// 	super( String.format(Inz.s("ycflib.IYCFArgumentException.FldMsg"),
	// 			enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
	// 	this.localMessage = String.format(Inz.x("ycflib.IYCFArgumentException.FldMsg"),
	// 			((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	// }

	// public IYCFUnrecognizedAttributeException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String methName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super( String.format(Inz.s("ycflib.IYCFArgumentException.FldMsg"),
	// 			enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
	// 			( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
	// 			th );
	// 	this.localMessage = String.format(Inz.x("ycflib.IYCFArgumentException.FldMsg"),
	// 			((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
	// 			( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	// }

	public IYCFUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg )
	{
		super(String.format(Inz.s("ycflib.IYCFArgumentException.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ));
		this.localMessage = String.format(Inz.x("ycflib.IYCFArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public IYCFUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super( String.format(Inz.s("ycflib.IYCFArgumentException.FldArgMsg"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" ) ),
				th );
		this.localMessage = String.format(Inz.x("ycflib.IYCFArgumentException.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				argNo,
				argName,
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : "") );
	}

	public IYCFUnrecognizedAttributeException()
	{
		super(String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.default"),
				"").trim());
		this.localMessage = String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.default"),
				"").trim();
	}

	public IYCFUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName )
	{
		super(String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.localMessage = String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public IYCFUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		String locInfo,
		String attrName )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ))));
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}

	public IYCFUnrecognizedAttributeException(
		Class<?> throwingClass,
		String methName,
		String locInfo,
		String attrName,
		Throwable th )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ))),
			th);
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.locattr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.loc"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.attr"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.default"),
							throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}



	public IYCFUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName )
	{
		super(String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.default"),
				enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.localMessage = String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.default"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public IYCFUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		String locInfo,
		String attrName )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.locattr"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo,
							attrName)
					: String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.loc"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.attr"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							attrName)
					: String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.default"),
							(enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )))));
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.locattr"),
							(((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo,
							attrName)
					: String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.loc"),
							(((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.attr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.default"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.locInfo = locInfo;
		this.attrName = attrName;
	}

	public IYCFUnrecognizedAttributeException(
		String enFieldName,
		String xFieldName,
		String methName,
		String locInfo,
		String attrName,
		Throwable th )
	{
		super( (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.locattr"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.loc"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.attr"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.s("ycflib.IYCFUnrecognizedAttributeException.default"),
							enFieldName + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ))),
			th);
		this.localMessage = (locInfo != null && !locInfo.isEmpty()) ?
					((attrName != null && attrName.length() > 0) ? String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.locattr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo,
							attrName)
					: String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.loc"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							locInfo))
				: ((attrName != null && attrName.length() > 0) ? String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.attr"),
							((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName) + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
							attrName)
					: String.format(Inz.x("ycflib.IYCFUnrecognizedAttributeException.default"),
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
