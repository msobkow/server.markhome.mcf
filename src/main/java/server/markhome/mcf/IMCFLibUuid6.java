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

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 * This variation on a UUID is based on supporting IPv6 as well as IPv4 host addresses for type 1 UUIDs.
 * <p>
 * The Uuid6 is a 28 byte value, represented as a 62 character string.  The string representation is
 * formatted as follows:
 * <blockquote><pre>
 * {@code
 * Uuid6                   = <time_stamp> "-"
 *                          <version_and_variant> "-"
 *                          <random> "-"
 *                          <node0> "-" <node1> "-" <node2> "-" <node3>
 * time_stamp             = 6*<hexOctet>
 * version_and_variant    = 2*<hexOctet>
 * random                 = 4*<hexOctet>
 * node0                  = 4*<hexOctet>
 * node1                  = 4*<hexOctet>
 * node2                  = 4*<hexOctet>
 * node3                  = 4*<hexOctet>
 * hexOctet               = <hexDigit><hexDigit>
 * hexDigit               =
 *       "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
 *       | "a" | "b" | "c" | "d" | "e" | "f"
 *       | "A" | "B" | "C" | "D" | "E" | "F"
 * }</pre></blockquote>
 * 
 * @author msobkow
 */
public interface IMCFLibUuid6 extends JSObject {
    public static final int IPV6_LENGTH = MCFLibHostAddr.IPV6_LENGTH;
    public static final int IPV4_LENGTH = MCFLibHostAddr.IPV4_LENGTH;
    public static final int IPV4_PAD = MCFLibHostAddr.IPV4_PAD;

    public final static int STAMP_START = 0;
    public final static int STAMP_BYTES = 6;
    public final static int VERSION_AND_VARIANT_START = STAMP_BYTES;
    public final static int VERSION_AND_VARIANT_BYTES = 2;
    public final static int RANDOM_START = VERSION_AND_VARIANT_START + VERSION_AND_VARIANT_BYTES;
    public final static int RANDOM_BYTES = 4;
    public final static int NODE0_START = RANDOM_START + RANDOM_BYTES;
    public final static int NODE0_BYTES = 4;
    public final static int NODE1_START = NODE0_START + NODE0_BYTES;
    public final static int NODE1_BYTES = 4;
    public final static int NODE2_START = NODE1_START + NODE1_BYTES;
    public final static int NODE2_BYTES = 4;
    public final static int NODE3_START = NODE2_START + NODE2_BYTES;
    public final static int NODE3_BYTES = 4;
    /**
     * Uuid6 values are 28 bytes long, representable as strings for transport
     */
    public final static int TOTAL_BYTES = NODE3_START + NODE3_BYTES;
    /**
     * String format for Uuid6 values is 62 characters long
     */
    public final static int STRING_LENGTH = (TOTAL_BYTES * 2) + 6;

    public byte[] getBytes();
}
