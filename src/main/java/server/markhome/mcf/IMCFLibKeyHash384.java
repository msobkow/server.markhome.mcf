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

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author msobkow
 */
public interface IMCFLibKeyHash384 extends JSObject {
	static final public int HASH_LENGTH = 48; // hash size in bytes
	static final public int HASH_LENGTH_STRING = HASH_LENGTH * 2; // SHA-1 hash size as a string
	static final String HASH_ALGO = "SHA-384";
	static final String hexDigits = "0123456789abcdef";
	static final int UUID6_INDEX = 0;
	static final int UUID6_LENGTH = MCFLibUuid6.TOTAL_BYTES;
	static final int COUNTER_INDEX = 28;
	static final int COUNTER_LENGTH = 8;
	static final int CLUSTERCODE_INDEX = 36;
	static final int CLUSTERCODE_LENGTH = 8;
	static final int PID_INDEX = 44;
	static final int PID_LENGTH = 8;
	static final int THREAD_INDEX = 52;
	static final int THREAD_LENGTH = 8;
	static final int HEADER_BYTES = 60;
	static final int RANDBYTES_INDEX = HEADER_BYTES;
	static final int RANDBYTES_LENGTH = 8;
	static final int TOTAL_BYTES = HEADER_BYTES + RANDBYTES_LENGTH;

	public byte[] getBytes();

	public void setBytes(byte[] bytes);

	public void setBytes(byte[] newBytes, int offset, int length);

	public void initStatics();

	public static byte[] bytesFromHex(String string) {
		if (string == null) {
			// allowed
		} else if (string.length() > HASH_LENGTH * 2) {
			throw new IllegalArgumentException("string length is " + string.length() + ".  Must be <= " + HASH_LENGTH * 2 + ".  string is '" + string + "'.");
		}
		byte[] b = new byte[HASH_LENGTH];
		if (string == null) {
			return b;
		}

		int n = string.length();
		for (int i = 0; i < n - 1; i += 2) {
			b[i / 2] = (byte) ((Character.digit(string.charAt(i), 16) << 4) + Character.digit(string.charAt(i + 1), 16));
		}
		return b;
	}

	public default int reduceToInt() {
		return hashCode();
	}

	public default boolean isNull() {
		byte[] b = getBytes();
		if (b != null) {
			for (int i = 0; i < HASH_LENGTH; i++) {
				if (b[i] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public default void toString(StringBuilder sb) {
		// Construct and return the representive hex string
		byte[] b = getBytes();
		if (b == null) {
			for (int i = 0; i < HASH_LENGTH; i++) {
				sb.append('0');
				sb.append('0');
			}
		} else {
			for (int i = 0; i < HASH_LENGTH; i++) {
				sb.append(hexDigits.charAt((b[i] & 0xF0) >>> 4));
				sb.append(hexDigits.charAt(b[i] & 0x0F));
			}
		}
	}

	public int compareTo(IMCFLibKeyHash384 o);

	public default int compare(IMCFLibKeyHash384 h1, IMCFLibKeyHash384 h2) {
		if (h1 == null) {
			if (h2 == null) {
				return 0;
			} else {
				return 1;
			}
		} else {
			if (h2 == null) {
				return -1;
			} else {
				byte[] b1 = h1.getBytes();
				byte[] b2 = h2.getBytes();
				if (b1 == null) {
					if (b2 == null) {
						return 0;
					} else {
						return 1;
					}
				} else {
					if (b2 == null) {
						return -1;
					} else {
						for (int i = 0; i < h1.HASH_LENGTH; i++) {
							int v1 = b1[i];
							int v2 = b2[i];
							if (v1 < 0) {
								v1 += 256;
							}
							if (v2 < 0) {
								v2 += 256;
							}
							int c = v1 - v2;
							if (c != 0) {
								return c;
							}
						}
					}
				}
			}
		}
		return 0;
	}

	public IMCFLibKeyHash384 deepClone();

  public default int getHashLength() {
    return HASH_LENGTH;
  }

  public default int getHashLengthString() {
    return HASH_LENGTH_STRING;
  }

  public default String getHashAlgo() {
    return HASH_ALGO;
  }

  public static byte[] sbytesFromHex(String string) {
    if (string == null) {
      // allowed
    }
    else if (string.length() > HASH_LENGTH * 2) {
      throw new IllegalArgumentException("string length is " + string.length() + ".  Must be <= " + HASH_LENGTH * 2 + ".  string is '" + string + "'.");
    }
    byte[] b = new byte[HASH_LENGTH];
    if (string == null) {
      return b;
    }

    int n = string.length();
    for (int i = 0; i < n - 1; i += 2) {
      b[i / 2] = (byte) ((Character.digit(string.charAt(i), 16) << 4) + Character.digit(string.charAt(i + 1), 16));
    }
    return b;
  }

  public static boolean isNull(IMCFLibKeyHash384 anId) {
    return anId == null || anId.isNull();
  }

  static public String getNullString() {
    return "00000000000000000000000000000000";
  }

}
