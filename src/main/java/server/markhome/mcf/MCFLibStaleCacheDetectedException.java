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
 * MCFLibStaleCacheDetectedException is thrown when a cache or the objects in the cache have become stale and need to be refreshed from persistent storage before proceeding.
 */
public class MCFLibStaleCacheDetectedException extends IllegalStateException {

	protected String localMessage = null;
	protected String enMsgCause = null;
	protected String xMsgCause = null;
	protected String enTargetTable = null;
	protected String xTargetTable = null;
	protected Object indexKey = null;

	public MCFLibStaleCacheDetectedException(
		String enMsg,
		String xMsg )
	{
		super( enMsg );
		this.localMessage = xMsg;
	}

	public MCFLibStaleCacheDetectedException(
		String enMsg,
		String xMsg,
		Throwable th)
	{
			super(enMsg, th);
			this.localMessage = xMsg;
	}

	public MCFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("mcflib.MCFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg : "" )));
		this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.TcmnMsg"),
				throwingClass.getName()	+ (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ),
				( ( ( xMsg != null ) && ( xMsg.length() > 0 ) ) ? xMsg : (enMsg != null && enMsg.length() > 0) ? enMsg : ""));
	}

	public MCFLibStaleCacheDetectedException(
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

	public MCFLibStaleCacheDetectedException(
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

	public MCFLibStaleCacheDetectedException(
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

	public MCFLibStaleCacheDetectedException(
		String enFieldName,
		String xFieldName,
		String enMsg,
		String xMsg )
	{
		super( String.format(Inz.s("mcflib.MCFLibArgumentException.FldMsg"),
				enFieldName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) ));
		this.localMessage = String.format(Inz.x("mcflib.MCFLibArgumentException.FldMsg"),
				(xFieldName != null && !xFieldName.isEmpty()) ? xFieldName : enFieldName,
				( ( ( enMsg != null ) && ( enMsg.length() > 0 ) ) ? enMsg	: "" ) );
	}

	public MCFLibStaleCacheDetectedException(
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

	public MCFLibStaleCacheDetectedException(
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

	public MCFLibStaleCacheDetectedException(
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

	public MCFLibStaleCacheDetectedException(
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

	public MCFLibStaleCacheDetectedException()
	{
		super(String.format(Inz.s("mcflib.MCFLibStaleCacheDetectedException.default"), "").trim());
		this.localMessage = String.format(Inz.x("mcflib.MCFLibStaleCacheDetectedException.default"), "").trim();
	}

	public MCFLibStaleCacheDetectedException(Throwable th)
	{
		super(String.format(Inz.s("mcflib.MCFLibStaleCacheDetectedException.default"), "").trim(), th);
		this.localMessage = String.format(Inz.x("mcflib.MCFLibStaleCacheDetectedException.default"), "").trim();
	}

	public MCFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName )
	{
		super(String.format(Inz.s("mcflib.MCFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )));
		this.localMessage = String.format(Inz.x("mcflib.MCFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public MCFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName,
		Throwable th )
	{
		super(String.format(Inz.s("mcflib.MCFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" )),
			th);
		this.localMessage = String.format(Inz.x("mcflib.MCFLibStaleCacheDetectedException.default"),
				throwingClass.getName() + (( methName != null && !methName.isEmpty()) ? ("." + methName + "()") : "" ));
	}

	public MCFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName,
		String enMsgCause,
		String xMsgCause,
		String enTargetTable,
		String xTargetTable,
		Object argKey )
	{
		super( ((enTargetTable != null && !enTargetTable.isEmpty()) ?
					((argKey != null) ? String.format(Inz.s("mcflib.MCFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause,
							enTargetTable,
							argKey.toString())
						: String.format(Inz.s("mcflib.MCFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause,
							enTargetTable))
					: ((argKey != null) ? String.format(Inz.s("mcflib.MCFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause,
							argKey.toString())
						: String.format(Inz.s("mcflib.MCFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause))));
		this.localMessage = (((xTargetTable != null && !xTargetTable.isEmpty()) || (enTargetTable != null && !enTargetTable.isEmpty()) ?
					((argKey != null) ? String.format(Inz.x("mcflib.MCFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							(xTargetTable != null && !xTargetTable.isEmpty()) ? xTargetTable : enTargetTable,
							argKey.toString())
						: String.format(Inz.x("mcflib.MCFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							(xTargetTable != null && !xTargetTable.isEmpty()) ? xTargetTable : enTargetTable))
					: ((argKey != null) ? String.format(Inz.x("mcflib.MCFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							argKey.toString())
						: String.format(Inz.x("mcflib.MCFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause)))));
		this.enMsgCause = enMsgCause;
		this.xMsgCause = xMsgCause;
		this.enTargetTable = enTargetTable;
		this.xTargetTable = xTargetTable;
		this.indexKey = argKey;
	}

	public MCFLibStaleCacheDetectedException(
		Class<?> throwingClass,
		String methName,
		String enMsgCause,
		String xMsgCause,
		String enTargetTable,
		String xTargetTable,
		Object argKey,
		Throwable th )
	{
		super( ((enTargetTable != null && !enTargetTable.isEmpty()) ?
					((argKey != null) ? String.format(Inz.s("mcflib.MCFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause,
							enTargetTable,
							argKey.toString())
						: String.format(Inz.s("mcflib.MCFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause,
							enTargetTable))
					: ((argKey != null) ? String.format(Inz.s("mcflib.MCFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause,
							argKey.toString())
						: String.format(Inz.s("mcflib.MCFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + ( ( ( methName != null ) && !methName.isEmpty()) ? "." + methName + "() " : " "),
							enMsgCause))),
			th);
		this.localMessage = (((xTargetTable != null && !xTargetTable.isEmpty()) || (enTargetTable != null && !enTargetTable.isEmpty()) ?
					((argKey != null) ? String.format(Inz.x("mcflib.MCFLibStaleCacheDetectedException.causetargetkey"),//"%1$sStale cache detected due to %2$s by %3$s key %4$s"
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							(xTargetTable != null && !xTargetTable.isEmpty()) ? xTargetTable : enTargetTable,
							argKey.toString())
						: String.format(Inz.x("mcflib.MCFLibStaleCacheDetectedException.causetarget"),//"%1$sStale cache detected due to %2$s by %3$s
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							(xTargetTable != null && !xTargetTable.isEmpty()) ? xTargetTable : enTargetTable))
					: ((argKey != null) ? String.format(Inz.x("mcflib.MCFLibStaleCacheDetectedException.causekey"),//"%1$sStale cache detected due to %2$s key %4$s"
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause),
							argKey.toString())
						: String.format(Inz.x("mcflib.MCFLibStaleCacheDetectedException.cause"),//"%1$sStale cache detected due to %2$s
							throwingClass.getName() + (( methName != null && !methName.isEmpty())? ("." + methName + "()") : ""),
							((xMsgCause != null && !xMsgCause.isEmpty()) ? xMsgCause : enMsgCause)))));
		this.enMsgCause = enMsgCause;
		this.xMsgCause = xMsgCause;
		this.enTargetTable = enTargetTable;
		this.xTargetTable = xTargetTable;
		this.indexKey = argKey;
	}

	public Object getIndexKey() {
		return indexKey;
	}

	public String getMsgCause() {
		return enMsgCause;
	}

	public String getLocalizedMsgCause() {
		if (xMsgCause != null && !xMsgCause.isEmpty())
			return xMsgCause;
		else
			return enMsgCause;
	}

	public String getTargetTable() {
		return enTargetTable;
	}

	public String getLocalizedTargetTable() {
		if (xTargetTable != null && !xTargetTable.isEmpty())
			return xTargetTable;
		else
			return enTargetTable;
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
