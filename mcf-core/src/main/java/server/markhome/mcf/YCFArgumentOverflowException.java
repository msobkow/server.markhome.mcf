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

import java.math.*;

/**
 * YYCFArgumentOverflowException indicates that an argument exceeds the permitted value range.
 */
public class YYCFArgumentOverflowException extends YYCFArgumentException {

	public YYCFArgumentOverflowException(
		String enMsg,
		String xMsg )
	{
		super(enMsg, xMsg);
	}

	public YYCFArgumentOverflowException(
		String enMsg, String xMsg, Throwable cause) {
			super(enMsg, xMsg, cause);
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg )
	{
		super(throwingClass, methName, enMsg, xMsg);
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super(throwingClass, methName, enMsg, xMsg, th);
	}

	// public YYCFArgumentOverflowException(
	//  	Class<?> throwingClass,
	//  	String methName,
	//  	int argNo,
	//  	String argName,
	//  	String enMsg,
	//  	String xMsg )
	// {
	//  	super(throwingClass, methName, argNo, argName, enMsg, xMsg);
	// }

	// public YYCFArgumentOverflowException(
	// 	Class<?> throwingClass,
	// 	String methName,
	// 	int argNo,
	// 	String argName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super(throwingClass, methName, argNo, argName, enMsg, xMsg, th);
	// }

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String enMsg,
		String xMsg )
	{
		super(enFieldName, xFieldName, enMsg, xMsg);
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg )
	{
		super(enFieldName, xFieldName, methName, enMsg, xMsg);
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		String enMsg,
		String xMsg,
		Throwable th )
	{
		super(enFieldName, xFieldName, methName, enMsg, xMsg, th);
	}

	// public YYCFArgumentOverflowException(
	// 	String enFieldName,
	//  	String xFieldName,
	//  	String methName,
	//  	int argNo,
	//  	String argName,
	//  	String enMsg,
	//  	String xMsg )
	// {
	//  	super(enFieldName, xFieldName, methName, argNo, argName, enMsg, xMsg);
	// }

	// public YYCFArgumentOverflowException(
	// 	String enFieldName,
	// 	String xFieldName,
	// 	String methName,
	// 	int argNo,
	// 	String argName,
	// 	String enMsg,
	// 	String xMsg,
	// 	Throwable th )
	// {
	// 	super(enFieldName, xFieldName, methName, argNo, argName, enMsg, xMsg, th);
	// }


	
	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th );
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th );
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th );
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th );
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.float.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th );
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			th );
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th );
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
	}

	public YYCFArgumentOverflowException(
		Class<?> throwingClass,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.string.TcmnArgMsg"),
				throwingClass.getName()	+ ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			th );
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ((methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		short argValue,
		short maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		int argValue,
		int maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		long argValue,
		long maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		float argValue,
		float maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		double argValue,
		double maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.decimal.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.string.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		Calendar argValue,
		Calendar maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.string.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			th);
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.string.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue));
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		String argValue,
		String maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.string.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue,
				maxValue),
			th);
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.string.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()));
	}

	public YYCFArgumentOverflowException(
		String enFieldName,
		String xFieldName,
		String methName,
		int argNo,
		String argName,
		BigDecimal argValue,
		BigDecimal maxValue,
		Throwable th )
	{
		super(String.format(Inz.s("ycflib.YYCFArgumentOverflowException.string.FldArgMsg"),
				enFieldName + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "()"	: "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			String.format(Inz.x("ycflib.YYCFArgumentOverflowException.string.FldArgMsg"),
				((xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName)	+ (( methName != null && !methName.isEmpty()) ? "." + methName + "()" : "" ),
				argNo,
				argName,
				argValue.toString(),
				maxValue.toString()),
			th);
	}
}
