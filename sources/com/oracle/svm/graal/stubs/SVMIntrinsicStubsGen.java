// CheckStyle: stop header check
// CheckStyle: stop line length check
// GENERATED CONTENT - DO NOT EDIT
// GENERATOR: jdk.graal.compiler.lir.processor.IntrinsicStubProcessor
package com.oracle.svm.graal.stubs;

import com.oracle.svm.core.SubstrateTarget;
import com.oracle.svm.shared.Uninterruptible;
import com.oracle.svm.core.snippets.SubstrateForeignCallTarget;
import com.oracle.svm.core.cpufeature.Stubs;
import com.oracle.svm.graal.RuntimeCPUFeatureRegion;
import jdk.graal.compiler.api.replacements.Fold;
import jdk.graal.compiler.debug.GraalError;
import java.util.EnumSet;
import jdk.vm.ci.code.Architecture;
import jdk.vm.ci.aarch64.AArch64;
import jdk.vm.ci.amd64.AMD64;
import jdk.graal.compiler.replacements.nodes.Adler32UpdateBytesNode;
import jdk.graal.compiler.replacements.nodes.AESNode;
import jdk.graal.compiler.replacements.nodes.AESNode.CryptMode;
import jdk.graal.compiler.replacements.nodes.ArrayCompareToNode;
import jdk.graal.compiler.core.common.Stride;
import jdk.graal.compiler.replacements.nodes.ArrayCopyWithConversionsNode;
import jdk.graal.compiler.replacements.nodes.ArrayEqualsNode;
import jdk.vm.ci.meta.JavaKind;
import jdk.graal.compiler.replacements.nodes.ArrayFillNode;
import jdk.graal.compiler.replacements.nodes.ArrayIndexOfNode;
import jdk.graal.compiler.lir.gen.LIRGeneratorTool.ArrayIndexOfVariant;
import jdk.graal.compiler.replacements.nodes.ArrayRegionCompareToNode;
import jdk.graal.compiler.replacements.nodes.ArrayRegionEqualsNode;
import jdk.graal.compiler.replacements.nodes.ArrayRegionEqualsWithMaskNode;
import jdk.graal.compiler.replacements.nodes.Base64DecodeBlockNode;
import jdk.graal.compiler.replacements.nodes.Base64EncodeBlockNode;
import jdk.graal.compiler.replacements.nodes.BigIntegerLeftShiftWorkerNode;
import jdk.graal.compiler.replacements.nodes.BigIntegerMontgomeryMultiplyNode;
import jdk.graal.compiler.replacements.nodes.BigIntegerMontgomerySquareNode;
import jdk.graal.compiler.replacements.nodes.BigIntegerMulAddNode;
import jdk.graal.compiler.replacements.nodes.BigIntegerMultiplyToLenNode;
import jdk.graal.compiler.replacements.nodes.BigIntegerRightShiftWorkerNode;
import jdk.graal.compiler.replacements.nodes.BigIntegerSquareToLenNode;
import jdk.graal.compiler.replacements.nodes.CalcStringAttributesNode;
import jdk.graal.compiler.lir.gen.LIRGeneratorTool.CalcStringAttributesEncoding;
import jdk.graal.compiler.replacements.nodes.ChaCha20Node;
import jdk.graal.compiler.replacements.nodes.CipherBlockChainingAESNode;
import jdk.graal.compiler.replacements.nodes.CounterModeAESNode;
import jdk.graal.compiler.replacements.nodes.CountPositivesNode;
import jdk.graal.compiler.replacements.nodes.CRC32CUpdateBytesNode;
import jdk.graal.compiler.replacements.nodes.CRC32UpdateBytesNode;
import jdk.graal.compiler.replacements.nodes.DilithiumNode.DilithiumAlmostInverseNttNode;
import jdk.graal.compiler.replacements.nodes.DilithiumNode.DilithiumAlmostNttNode;
import jdk.graal.compiler.replacements.nodes.DilithiumNode.DilithiumDecomposePolyNode;
import jdk.graal.compiler.replacements.nodes.DilithiumNode.DilithiumMontMulByConstantNode;
import jdk.graal.compiler.replacements.nodes.DilithiumNode.DilithiumNttMultNode;
import jdk.graal.compiler.replacements.nodes.DoubleModStubNode;
import jdk.graal.compiler.replacements.nodes.ElectronicCodeBookAESNode;
import jdk.graal.compiler.replacements.nodes.EncodeArrayNode;
import jdk.graal.compiler.lir.gen.LIRGeneratorTool.CharsetName;
import jdk.graal.compiler.replacements.nodes.GaloisCounterModeAESNode;
import jdk.graal.compiler.replacements.nodes.GHASHProcessBlocksNode;
import jdk.graal.compiler.replacements.nodes.IndexOfZeroNode;
import jdk.graal.compiler.replacements.nodes.KyberNode.KyberNttNode;
import jdk.graal.compiler.replacements.nodes.KyberNode.KyberInverseNttNode;
import jdk.graal.compiler.replacements.nodes.KyberNode.KyberNttMultNode;
import jdk.graal.compiler.replacements.nodes.KyberNode.KyberAddPoly2Node;
import jdk.graal.compiler.replacements.nodes.KyberNode.KyberAddPoly3Node;
import jdk.graal.compiler.replacements.nodes.KyberNode.Kyber12To16Node;
import jdk.graal.compiler.replacements.nodes.KyberNode.KyberBarrettReduceNode;
import jdk.graal.compiler.replacements.nodes.MessageDigestNode.MD5Node;
import jdk.graal.compiler.replacements.nodes.Poly1305ProcessBlocksNode;
import jdk.graal.compiler.replacements.nodes.MessageDigestNode.SHA1Node;
import jdk.graal.compiler.replacements.nodes.MessageDigestNode.SHA256Node;
import jdk.graal.compiler.replacements.nodes.MessageDigestNode.SHA3Node;
import jdk.graal.compiler.replacements.nodes.MessageDigestNode.SHA512Node;
import jdk.graal.compiler.replacements.nodes.StringCodepointIndexToByteIndexNode;
import jdk.graal.compiler.replacements.nodes.StringCodepointIndexToByteIndexNode.InputEncoding;
import jdk.graal.compiler.replacements.StringLatin1InflateNode;
import jdk.graal.compiler.replacements.StringUTF16CompressNode;
import jdk.graal.compiler.replacements.nodes.VectorizedHashCodeNode;
import jdk.graal.compiler.replacements.nodes.VectorizedMismatchNode;

// generated by: IntrinsicStubProcessor
public class SVMIntrinsicStubsGen {
    @SuppressWarnings("unused") private static final EnumSet<AMD64.CPUFeature> EMPTY_CPU_FEATURES_AMD64 = EnumSet.noneOf(AMD64.CPUFeature.class);
    @SuppressWarnings("unused") private static final EnumSet<AArch64.CPUFeature> EMPTY_CPU_FEATURES_AARCH64 = EnumSet.noneOf(AArch64.CPUFeature.class);

    @Fold
    public static EnumSet<?> Adler32UpdateBytesNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return Adler32UpdateBytesNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: Adler32UpdateBytesNode.update(int,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int updateBytesAdler32(int adler, org.graalvm.word.Pointer bufferAddress, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Adler32UpdateBytesNode_getMinimumFeatures());
        try {
            return Adler32UpdateBytesNode.update(adler, bufferAddress, length, Adler32UpdateBytesNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: Adler32UpdateBytesNode.update(int,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int updateBytesAdler32RTC(int adler, org.graalvm.word.Pointer bufferAddress, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(Adler32UpdateBytesNode.class));
        try {
            return Adler32UpdateBytesNode.update(adler, bufferAddress, length, Stubs.getRuntimeCheckedCPUFeatures(Adler32UpdateBytesNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> AESNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return AESNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return AESNode.minFeaturesAARCH64();
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: AESNode.apply(Pointer,Pointer,Pointer,CryptMode,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void aesEncrypt(org.graalvm.word.Pointer from, org.graalvm.word.Pointer to, org.graalvm.word.Pointer key) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(AESNode_getMinimumFeatures());
        try {
            AESNode.apply(from, to, key, CryptMode.ENCRYPT, AESNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: AESNode.apply(Pointer,Pointer,Pointer,CryptMode,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void aesEncryptRTC(org.graalvm.word.Pointer from, org.graalvm.word.Pointer to, org.graalvm.word.Pointer key) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(AESNode.class));
        try {
            AESNode.apply(from, to, key, CryptMode.ENCRYPT, Stubs.getRuntimeCheckedCPUFeatures(AESNode.class));
        } finally {
            region.leave();
        }
    }

    // method: AESNode.apply(Pointer,Pointer,Pointer,CryptMode,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void aesDecrypt(org.graalvm.word.Pointer from, org.graalvm.word.Pointer to, org.graalvm.word.Pointer key) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(AESNode_getMinimumFeatures());
        try {
            AESNode.apply(from, to, key, CryptMode.DECRYPT, AESNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: AESNode.apply(Pointer,Pointer,Pointer,CryptMode,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void aesDecryptRTC(org.graalvm.word.Pointer from, org.graalvm.word.Pointer to, org.graalvm.word.Pointer key) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(AESNode.class));
        try {
            AESNode.apply(from, to, key, CryptMode.DECRYPT, Stubs.getRuntimeCheckedCPUFeatures(AESNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCompareToNode.compareTo(Pointer,int,Pointer,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int byteArrayCompareToByteArray(org.graalvm.word.Pointer arrayA, int lengthA, org.graalvm.word.Pointer arrayB, int lengthB) {
        return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S1, Stride.S1);
    }

    // method: ArrayCompareToNode.compareTo(Pointer,int,Pointer,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int byteArrayCompareToByteArrayRTC(org.graalvm.word.Pointer arrayA, int lengthA, org.graalvm.word.Pointer arrayB, int lengthB) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCompareToNode.class));
        try {
            return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S1, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayCompareToNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCompareToNode.compareTo(Pointer,int,Pointer,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int byteArrayCompareToCharArray(org.graalvm.word.Pointer arrayA, int lengthA, org.graalvm.word.Pointer arrayB, int lengthB) {
        return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S1, Stride.S2);
    }

    // method: ArrayCompareToNode.compareTo(Pointer,int,Pointer,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int byteArrayCompareToCharArrayRTC(org.graalvm.word.Pointer arrayA, int lengthA, org.graalvm.word.Pointer arrayB, int lengthB) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCompareToNode.class));
        try {
            return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S1, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(ArrayCompareToNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCompareToNode.compareTo(Pointer,int,Pointer,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int charArrayCompareToByteArray(org.graalvm.word.Pointer arrayA, int lengthA, org.graalvm.word.Pointer arrayB, int lengthB) {
        return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S2, Stride.S1);
    }

    // method: ArrayCompareToNode.compareTo(Pointer,int,Pointer,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int charArrayCompareToByteArrayRTC(org.graalvm.word.Pointer arrayA, int lengthA, org.graalvm.word.Pointer arrayB, int lengthB) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCompareToNode.class));
        try {
            return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S2, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayCompareToNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCompareToNode.compareTo(Pointer,int,Pointer,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int charArrayCompareToCharArray(org.graalvm.word.Pointer arrayA, int lengthA, org.graalvm.word.Pointer arrayB, int lengthB) {
        return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S2, Stride.S2);
    }

    // method: ArrayCompareToNode.compareTo(Pointer,int,Pointer,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int charArrayCompareToCharArrayRTC(org.graalvm.word.Pointer arrayA, int lengthA, org.graalvm.word.Pointer arrayB, int lengthB) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCompareToNode.class));
        try {
            return ArrayCompareToNode.compareTo(arrayA, lengthA, arrayB, lengthB, Stride.S2, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(ArrayCompareToNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS1S1(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S1, Stride.S1);
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS1S1RTC(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        try {
            ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S1, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS1S2(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S1, Stride.S2);
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS1S2RTC(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        try {
            ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S1, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS1S4(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S1, Stride.S4);
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS1S4RTC(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        try {
            ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S1, Stride.S4, Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS2S1(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S2, Stride.S1);
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS2S1RTC(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        try {
            ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S2, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS2S2(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S2, Stride.S2);
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS2S2RTC(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        try {
            ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S2, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS2S4(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S2, Stride.S4);
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS2S4RTC(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        try {
            ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S2, Stride.S4, Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS4S1(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S4, Stride.S1);
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS4S1RTC(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        try {
            ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S4, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS4S2(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S4, Stride.S2);
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS4S2RTC(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        try {
            ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S4, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS4S4(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S4, Stride.S4);
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsS4S4RTC(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        try {
            ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S4, Stride.S4, Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCopyWithConversionsNode.arrayCopyWithReverseBytes(Object,long,Object,long,int,Stride,boolean)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithReverseBytesS2(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        ArrayCopyWithConversionsNode.arrayCopyWithReverseBytes(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S2, true);
    }

    // method: ArrayCopyWithConversionsNode.arrayCopyWithReverseBytes(Object,long,Object,long,int,Stride,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithReverseBytesS2RTC(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        try {
            ArrayCopyWithConversionsNode.arrayCopyWithReverseBytes(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S2, true, Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCopyWithConversionsNode.arrayCopyWithReverseBytes(Object,long,Object,long,int,Stride,boolean)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithReverseBytesS4(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        ArrayCopyWithConversionsNode.arrayCopyWithReverseBytes(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S4, true);
    }

    // method: ArrayCopyWithConversionsNode.arrayCopyWithReverseBytes(Object,long,Object,long,int,Stride,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithReverseBytesS4RTC(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        try {
            ArrayCopyWithConversionsNode.arrayCopyWithReverseBytes(arraySrc, offsetSrc, arrayDst, offsetDst, length, Stride.S4, true, Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsDynamicStrides(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length, int stride) {
        ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, stride);
    }

    // method: ArrayCopyWithConversionsNode.arrayCopy(Object,long,Object,long,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void arrayCopyWithConversionsDynamicStridesRTC(java.lang.Object arraySrc, long offsetSrc, java.lang.Object arrayDst, long offsetDst, int length, int stride) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        try {
            ArrayCopyWithConversionsNode.arrayCopy(arraySrc, offsetSrc, arrayDst, offsetDst, length, stride, Stubs.getRuntimeCheckedCPUFeatures(ArrayCopyWithConversionsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayEqualsNode.equals(Pointer,long,Pointer,long,int,JavaKind)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean longArraysEquals(org.graalvm.word.Pointer array1, long offset1, org.graalvm.word.Pointer array2, long offset2, int length) {
        return ArrayEqualsNode.equals(array1, offset1, array2, offset2, length, JavaKind.Long);
    }

    // method: ArrayEqualsNode.equals(Pointer,long,Pointer,long,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean longArraysEqualsRTC(org.graalvm.word.Pointer array1, long offset1, org.graalvm.word.Pointer array2, long offset2, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayEqualsNode.class));
        try {
            return ArrayEqualsNode.equals(array1, offset1, array2, offset2, length, JavaKind.Long, Stubs.getRuntimeCheckedCPUFeatures(ArrayEqualsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayEqualsNode.equals(Pointer,long,Pointer,long,int,JavaKind)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean floatArraysEquals(org.graalvm.word.Pointer array1, long offset1, org.graalvm.word.Pointer array2, long offset2, int length) {
        return ArrayEqualsNode.equals(array1, offset1, array2, offset2, length, JavaKind.Float);
    }

    // method: ArrayEqualsNode.equals(Pointer,long,Pointer,long,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean floatArraysEqualsRTC(org.graalvm.word.Pointer array1, long offset1, org.graalvm.word.Pointer array2, long offset2, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayEqualsNode.class));
        try {
            return ArrayEqualsNode.equals(array1, offset1, array2, offset2, length, JavaKind.Float, Stubs.getRuntimeCheckedCPUFeatures(ArrayEqualsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayEqualsNode.equals(Pointer,long,Pointer,long,int,JavaKind)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean doubleArraysEquals(org.graalvm.word.Pointer array1, long offset1, org.graalvm.word.Pointer array2, long offset2, int length) {
        return ArrayEqualsNode.equals(array1, offset1, array2, offset2, length, JavaKind.Double);
    }

    // method: ArrayEqualsNode.equals(Pointer,long,Pointer,long,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean doubleArraysEqualsRTC(org.graalvm.word.Pointer array1, long offset1, org.graalvm.word.Pointer array2, long offset2, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayEqualsNode.class));
        try {
            return ArrayEqualsNode.equals(array1, offset1, array2, offset2, length, JavaKind.Double, Stubs.getRuntimeCheckedCPUFeatures(ArrayEqualsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayFillNode.fill(Pointer,long,int,byte,JavaKind)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void booleanArrayFill(org.graalvm.word.Pointer array, long offset, int length, byte value) {
        ArrayFillNode.fill(array, offset, length, value, JavaKind.Boolean);
    }

    // method: ArrayFillNode.fill(Pointer,long,int,byte,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void booleanArrayFillRTC(org.graalvm.word.Pointer array, long offset, int length, byte value) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        try {
            ArrayFillNode.fill(array, offset, length, value, JavaKind.Boolean, Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayFillNode.fill(Pointer,long,int,byte,JavaKind)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void byteArrayFill(org.graalvm.word.Pointer array, long offset, int length, byte value) {
        ArrayFillNode.fill(array, offset, length, value, JavaKind.Byte);
    }

    // method: ArrayFillNode.fill(Pointer,long,int,byte,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void byteArrayFillRTC(org.graalvm.word.Pointer array, long offset, int length, byte value) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        try {
            ArrayFillNode.fill(array, offset, length, value, JavaKind.Byte, Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayFillNode.fill(Pointer,long,int,short,JavaKind)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void charArrayFill(org.graalvm.word.Pointer array, long offset, int length, short value) {
        ArrayFillNode.fill(array, offset, length, value, JavaKind.Char);
    }

    // method: ArrayFillNode.fill(Pointer,long,int,short,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void charArrayFillRTC(org.graalvm.word.Pointer array, long offset, int length, short value) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        try {
            ArrayFillNode.fill(array, offset, length, value, JavaKind.Char, Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayFillNode.fill(Pointer,long,int,short,JavaKind)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void shortArrayFill(org.graalvm.word.Pointer array, long offset, int length, short value) {
        ArrayFillNode.fill(array, offset, length, value, JavaKind.Short);
    }

    // method: ArrayFillNode.fill(Pointer,long,int,short,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void shortArrayFillRTC(org.graalvm.word.Pointer array, long offset, int length, short value) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        try {
            ArrayFillNode.fill(array, offset, length, value, JavaKind.Short, Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayFillNode.fill(Pointer,long,int,int,JavaKind)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void intArrayFill(org.graalvm.word.Pointer array, long offset, int length, int value) {
        ArrayFillNode.fill(array, offset, length, value, JavaKind.Int);
    }

    // method: ArrayFillNode.fill(Pointer,long,int,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void intArrayFillRTC(org.graalvm.word.Pointer array, long offset, int length, int value) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        try {
            ArrayFillNode.fill(array, offset, length, value, JavaKind.Int, Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayFillNode.fill(Pointer,long,int,int,JavaKind)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void floatArrayFill(org.graalvm.word.Pointer array, long offset, int length, int value) {
        ArrayFillNode.fill(array, offset, length, value, JavaKind.Float);
    }

    // method: ArrayFillNode.fill(Pointer,long,int,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void floatArrayFillRTC(org.graalvm.word.Pointer array, long offset, int length, int value) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        try {
            ArrayFillNode.fill(array, offset, length, value, JavaKind.Float, Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayFillNode.fill(Pointer,long,int,long,JavaKind)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void longArrayFill(org.graalvm.word.Pointer array, long offset, int length, long value) {
        ArrayFillNode.fill(array, offset, length, value, JavaKind.Long);
    }

    // method: ArrayFillNode.fill(Pointer,long,int,long,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void longArrayFillRTC(org.graalvm.word.Pointer array, long offset, int length, long value) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        try {
            ArrayFillNode.fill(array, offset, length, value, JavaKind.Long, Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayFillNode.fill(Pointer,long,int,long,JavaKind)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void doubleArrayFill(org.graalvm.word.Pointer array, long offset, int length, long value) {
        ArrayFillNode.fill(array, offset, length, value, JavaKind.Double);
    }

    // method: ArrayFillNode.fill(Pointer,long,int,long,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void doubleArrayFillRTC(org.graalvm.word.Pointer array, long offset, int length, long value) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        try {
            ArrayFillNode.fill(array, offset, length, value, JavaKind.Double, Stubs.getRuntimeCheckedCPUFeatures(ArrayFillNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> ArrayIndexOfNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return ArrayIndexOfNode.amd64FeaturesSSE41();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    @Fold
    public static EnumSet<?> ArrayIndexOfNode_getMinimumFeatures_2() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return ArrayIndexOfNode.amd64FeaturesAVX2();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf1S1(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.MatchAny, array, arrayOffset, arrayLength, fromIndex, v1);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf1S1RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.MatchAny, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf1S2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchAny, array, arrayOffset, arrayLength, fromIndex, v1);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf1S2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchAny, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf1S4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchAny, array, arrayOffset, arrayLength, fromIndex, v1);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf1S4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchAny, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf2S1(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.MatchAny, array, arrayOffset, arrayLength, fromIndex, v1, v2);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf2S1RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.MatchAny, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf2S2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchAny, array, arrayOffset, arrayLength, fromIndex, v1, v2);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf2S2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchAny, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf2S4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchAny, array, arrayOffset, arrayLength, fromIndex, v1, v2);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf2S4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchAny, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRange1S1(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.MatchRange, array, arrayOffset, arrayLength, fromIndex, v1, v2);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRange1S1RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.MatchRange, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRange1S2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchRange, ArrayIndexOfNode_getMinimumFeatures(), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRange1S2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchRange, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRange1S4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchRange, ArrayIndexOfNode_getMinimumFeatures(), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRange1S4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchRange, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfWithMaskS1(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.WithMask, array, arrayOffset, arrayLength, fromIndex, v1, v2);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfWithMaskS1RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.WithMask, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfWithMaskS2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.WithMask, array, arrayOffset, arrayLength, fromIndex, v1, v2);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfWithMaskS2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.WithMask, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfWithMaskS4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.WithMask, array, arrayOffset, arrayLength, fromIndex, v1, v2);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfWithMaskS4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.WithMask, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTwoConsecutiveS1(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.FindTwoConsecutive, array, arrayOffset, arrayLength, fromIndex, v1, v2);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTwoConsecutiveS1RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.FindTwoConsecutive, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTwoConsecutiveS2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.FindTwoConsecutive, array, arrayOffset, arrayLength, fromIndex, v1, v2);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTwoConsecutiveS2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.FindTwoConsecutive, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTwoConsecutiveS4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.FindTwoConsecutive, array, arrayOffset, arrayLength, fromIndex, v1, v2);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTwoConsecutiveS4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.FindTwoConsecutive, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRangeForeignEndian1S2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchRangeForeignEndian, ArrayIndexOfNode_getMinimumFeatures(), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRangeForeignEndian1S2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchRangeForeignEndian, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRangeForeignEndian1S4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchRangeForeignEndian, ArrayIndexOfNode_getMinimumFeatures(), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRangeForeignEndian1S4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchRangeForeignEndian, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf3S1(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.MatchAny, array, arrayOffset, arrayLength, fromIndex, v1, v2, v3);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf3S1RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.MatchAny, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf3S2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchAny, array, arrayOffset, arrayLength, fromIndex, v1, v2, v3);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf3S2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchAny, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf3S4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchAny, array, arrayOffset, arrayLength, fromIndex, v1, v2, v3);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf3S4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchAny, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf4S1(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.MatchAny, array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf4S1RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.MatchAny, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf4S2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchAny, array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf4S2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchAny, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf4S4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchAny, array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOf4S4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchAny, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRange2S1(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.MatchRange, array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRange2S1RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.MatchRange, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRange2S2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchRange, ArrayIndexOfNode_getMinimumFeatures(), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRange2S2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchRange, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRange2S4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchRange, ArrayIndexOfNode_getMinimumFeatures(), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRange2S4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchRange, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTwoConsecutiveWithMaskS1(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.FindTwoConsecutiveWithMask, array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTwoConsecutiveWithMaskS1RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S1, ArrayIndexOfVariant.FindTwoConsecutiveWithMask, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTwoConsecutiveWithMaskS2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.FindTwoConsecutiveWithMask, array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTwoConsecutiveWithMaskS2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.FindTwoConsecutiveWithMask, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,Object,long,int,int,int,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTwoConsecutiveWithMaskS4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.FindTwoConsecutiveWithMask, array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTwoConsecutiveWithMaskS4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.FindTwoConsecutiveWithMask, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRangeForeignEndian2S2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchRangeForeignEndian, ArrayIndexOfNode_getMinimumFeatures(), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRangeForeignEndian2S2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S2, ArrayIndexOfVariant.MatchRangeForeignEndian, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRangeForeignEndian2S4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchRangeForeignEndian, ArrayIndexOfNode_getMinimumFeatures(), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOf(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,int,int,int,int)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfRangeForeignEndian2S4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, int v1, int v2, int v3, int v4) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOf(Stride.S4, ArrayIndexOfVariant.MatchRangeForeignEndian, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, v1, v2, v3, v4);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTableS1(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride.S1, ArrayIndexOfVariant.Table, ArrayIndexOfNode_getMinimumFeatures(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTableS1RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride.S1, ArrayIndexOfVariant.Table, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTableS2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride.S2, ArrayIndexOfVariant.Table, ArrayIndexOfNode_getMinimumFeatures(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTableS2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride.S2, ArrayIndexOfVariant.Table, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTableS4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride.S4, ArrayIndexOfVariant.Table, ArrayIndexOfNode_getMinimumFeatures(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTableS4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride.S4, ArrayIndexOfVariant.Table, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTableForeignEndianS2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride.S2, ArrayIndexOfVariant.TableForeignEndian, ArrayIndexOfNode_getMinimumFeatures(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTableForeignEndianS2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride.S2, ArrayIndexOfVariant.TableForeignEndian, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTableForeignEndianS4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride.S4, ArrayIndexOfVariant.TableForeignEndian, ArrayIndexOfNode_getMinimumFeatures(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int indexOfTableForeignEndianS4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTable(Stride.S4, ArrayIndexOfVariant.TableForeignEndian, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf2ConsecutiveTablesS1(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S1, ArrayIndexOfVariant.FindTwoConsecutiveTables, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf2ConsecutiveTablesS1RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S1, ArrayIndexOfVariant.FindTwoConsecutiveTables, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf2ConsecutiveTablesS2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S2, ArrayIndexOfVariant.FindTwoConsecutiveTables, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf2ConsecutiveTablesS2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S2, ArrayIndexOfVariant.FindTwoConsecutiveTables, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf2ConsecutiveTablesS4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S4, ArrayIndexOfVariant.FindTwoConsecutiveTables, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf2ConsecutiveTablesS4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S4, ArrayIndexOfVariant.FindTwoConsecutiveTables, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf2ConsecutiveTablesForeignEndianS2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S2, ArrayIndexOfVariant.FindTwoConsecutiveTablesForeignEndian, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf2ConsecutiveTablesForeignEndianS2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S2, ArrayIndexOfVariant.FindTwoConsecutiveTablesForeignEndian, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf2ConsecutiveTablesForeignEndianS4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S4, ArrayIndexOfVariant.FindTwoConsecutiveTablesForeignEndian, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf2ConsecutiveTablesForeignEndianS4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S4, ArrayIndexOfVariant.FindTwoConsecutiveTablesForeignEndian, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf3ConsecutiveTablesS1(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S1, ArrayIndexOfVariant.FindThreeConsecutiveTables, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf3ConsecutiveTablesS1RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S1, ArrayIndexOfVariant.FindThreeConsecutiveTables, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf3ConsecutiveTablesS2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S2, ArrayIndexOfVariant.FindThreeConsecutiveTables, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf3ConsecutiveTablesS2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S2, ArrayIndexOfVariant.FindThreeConsecutiveTables, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf3ConsecutiveTablesS4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S4, ArrayIndexOfVariant.FindThreeConsecutiveTables, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf3ConsecutiveTablesS4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S4, ArrayIndexOfVariant.FindThreeConsecutiveTables, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf3ConsecutiveTablesForeignEndianS2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S2, ArrayIndexOfVariant.FindThreeConsecutiveTablesForeignEndian, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf3ConsecutiveTablesForeignEndianS2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S2, ArrayIndexOfVariant.FindThreeConsecutiveTablesForeignEndian, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf3ConsecutiveTablesForeignEndianS4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S4, ArrayIndexOfVariant.FindThreeConsecutiveTablesForeignEndian, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf3ConsecutiveTablesForeignEndianS4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S4, ArrayIndexOfVariant.FindThreeConsecutiveTablesForeignEndian, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf4ConsecutiveTablesS1(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S1, ArrayIndexOfVariant.FindFourConsecutiveTables, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf4ConsecutiveTablesS1RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S1, ArrayIndexOfVariant.FindFourConsecutiveTables, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf4ConsecutiveTablesS2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S2, ArrayIndexOfVariant.FindFourConsecutiveTables, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf4ConsecutiveTablesS2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S2, ArrayIndexOfVariant.FindFourConsecutiveTables, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf4ConsecutiveTablesS4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S4, ArrayIndexOfVariant.FindFourConsecutiveTables, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf4ConsecutiveTablesS4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S4, ArrayIndexOfVariant.FindFourConsecutiveTables, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf4ConsecutiveTablesForeignEndianS2(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S2, ArrayIndexOfVariant.FindFourConsecutiveTablesForeignEndian, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf4ConsecutiveTablesForeignEndianS2RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S2, ArrayIndexOfVariant.FindFourConsecutiveTablesForeignEndian, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf4ConsecutiveTablesForeignEndianS4(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ArrayIndexOfNode_getMinimumFeatures_2());
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S4, ArrayIndexOfVariant.FindFourConsecutiveTablesForeignEndian, ArrayIndexOfNode_getMinimumFeatures_2(), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride,ArrayIndexOfVariant,EnumSet<?>,Object,long,int,int,byte[])
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOf4ConsecutiveTablesForeignEndianS4RTC(java.lang.Object array, long arrayOffset, int arrayLength, int fromIndex, byte[] tables) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class));
        try {
            return ArrayIndexOfNode.optimizedArrayIndexOfTableLong(Stride.S4, ArrayIndexOfVariant.FindFourConsecutiveTablesForeignEndian, Stubs.getRuntimeCheckedCPUFeatures(ArrayIndexOfNode.class), array, arrayOffset, arrayLength, fromIndex, tables);
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS1S1(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S1, Stride.S1);
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS1S1RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        try {
            return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S1, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS1S2(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S1, Stride.S2);
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS1S2RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        try {
            return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S1, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS1S4(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S1, Stride.S4);
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS1S4RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        try {
            return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S1, Stride.S4, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS2S1(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S2, Stride.S1);
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS2S1RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        try {
            return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S2, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS2S2(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S2, Stride.S2);
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS2S2RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        try {
            return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S2, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS2S4(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S2, Stride.S4);
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS2S4RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        try {
            return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S2, Stride.S4, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS4S1(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S4, Stride.S1);
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS4S1RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        try {
            return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S4, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS4S2(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S4, Stride.S2);
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS4S2RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        try {
            return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S4, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS4S4(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S4, Stride.S4);
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToS4S4RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        try {
            return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, Stride.S4, Stride.S4, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToDynamicStrides(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length, int dynamicStrides) {
        return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, dynamicStrides);
    }

    // method: ArrayRegionCompareToNode.compare(Object,long,Object,long,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int arrayRegionCompareToDynamicStridesRTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length, int dynamicStrides) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        try {
            return ArrayRegionCompareToNode.compare(arrayA, offsetA, arrayB, offsetB, length, dynamicStrides, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionCompareToNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS1S1(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S1, Stride.S1);
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS1S1RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        try {
            return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S1, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS1S2(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S1, Stride.S2);
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS1S2RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        try {
            return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S1, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS1S4(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S1, Stride.S4);
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS1S4RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        try {
            return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S1, Stride.S4, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS2S1(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S2, Stride.S1);
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS2S1RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        try {
            return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S2, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS2S2(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S2, Stride.S2);
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS2S2RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        try {
            return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S2, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS2S4(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S2, Stride.S4);
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS2S4RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        try {
            return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S2, Stride.S4, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS4S1(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S4, Stride.S1);
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS4S1RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        try {
            return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S4, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS4S2(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S4, Stride.S2);
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS4S2RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        try {
            return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S4, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS4S4(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S4, Stride.S4);
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsS4S4RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        try {
            return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, Stride.S4, Stride.S4, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsDynamicStrides(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length, int dynamicStrides) {
        return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, dynamicStrides);
    }

    // method: ArrayRegionEqualsNode.regionEquals(Object,long,Object,long,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsDynamicStridesRTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, int length, int dynamicStrides) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        try {
            return ArrayRegionEqualsNode.regionEquals(arrayA, offsetA, arrayB, offsetB, length, dynamicStrides, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS1S2S1(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S1, Stride.S2, Stride.S1);
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS1S2S1RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        try {
            return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S1, Stride.S2, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS2S2S1(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S2, Stride.S2, Stride.S1);
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS2S2S1RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        try {
            return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S2, Stride.S2, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS1S1(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S1, Stride.S1, Stride.S1);
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS1S1RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        try {
            return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S1, Stride.S1, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS1S2(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S1, Stride.S2, Stride.S2);
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS1S2RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        try {
            return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S1, Stride.S2, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS1S4(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S1, Stride.S4, Stride.S4);
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS1S4RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        try {
            return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S1, Stride.S4, Stride.S4, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS2S1(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S2, Stride.S1, Stride.S1);
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS2S1RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        try {
            return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S2, Stride.S1, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS2S2(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S2, Stride.S2, Stride.S2);
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS2S2RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        try {
            return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S2, Stride.S2, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS2S4(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S2, Stride.S4, Stride.S4);
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS2S4RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        try {
            return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S2, Stride.S4, Stride.S4, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS4S1(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S4, Stride.S1, Stride.S1);
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS4S1RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        try {
            return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S4, Stride.S1, Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS4S2(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S4, Stride.S2, Stride.S2);
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS4S2RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        try {
            return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S4, Stride.S2, Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS4S4(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S4, Stride.S4, Stride.S4);
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,Stride,Stride,Stride,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskS4S4RTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        try {
            return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, Stride.S4, Stride.S4, Stride.S4, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskDynamicStrides(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length, int stride) {
        return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, stride);
    }

    // method: ArrayRegionEqualsWithMaskNode.regionEquals(Object,long,Object,long,Pointer,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static boolean arrayRegionEqualsWithMaskDynamicStridesRTC(java.lang.Object arrayA, long offsetA, java.lang.Object arrayB, long offsetB, org.graalvm.word.Pointer mask, int length, int stride) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        try {
            return ArrayRegionEqualsWithMaskNode.regionEquals(arrayA, offsetA, arrayB, offsetB, mask, length, stride, Stubs.getRuntimeCheckedCPUFeatures(ArrayRegionEqualsWithMaskNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> Base64DecodeBlockNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return Base64DecodeBlockNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: Base64DecodeBlockNode.base64DecodeBlock(Pointer,int,int,Pointer,int,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int base64DecodeBlock(org.graalvm.word.Pointer src, int sp, int sl, org.graalvm.word.Pointer dst, int dp, int isURLFlag, int isMimeFlag) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Base64DecodeBlockNode_getMinimumFeatures());
        try {
            return Base64DecodeBlockNode.base64DecodeBlock(src, sp, sl, dst, dp, isURLFlag, isMimeFlag, Base64DecodeBlockNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: Base64DecodeBlockNode.base64DecodeBlock(Pointer,int,int,Pointer,int,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int base64DecodeBlockRTC(org.graalvm.word.Pointer src, int sp, int sl, org.graalvm.word.Pointer dst, int dp, int isURLFlag, int isMimeFlag) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(Base64DecodeBlockNode.class));
        try {
            return Base64DecodeBlockNode.base64DecodeBlock(src, sp, sl, dst, dp, isURLFlag, isMimeFlag, Stubs.getRuntimeCheckedCPUFeatures(Base64DecodeBlockNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> Base64EncodeBlockNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return Base64EncodeBlockNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: Base64EncodeBlockNode.base64EncodeBlock(Pointer,int,int,Pointer,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void base64EncodeBlock(org.graalvm.word.Pointer src, int sp, int sl, org.graalvm.word.Pointer dst, int dp, int isURL) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Base64EncodeBlockNode_getMinimumFeatures());
        try {
            Base64EncodeBlockNode.base64EncodeBlock(src, sp, sl, dst, dp, isURL, Base64EncodeBlockNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: Base64EncodeBlockNode.base64EncodeBlock(Pointer,int,int,Pointer,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void base64EncodeBlockRTC(org.graalvm.word.Pointer src, int sp, int sl, org.graalvm.word.Pointer dst, int dp, int isURL) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(Base64EncodeBlockNode.class));
        try {
            Base64EncodeBlockNode.base64EncodeBlock(src, sp, sl, dst, dp, isURL, Stubs.getRuntimeCheckedCPUFeatures(Base64EncodeBlockNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> BigIntegerLeftShiftWorkerNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return BigIntegerLeftShiftWorkerNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: BigIntegerLeftShiftWorkerNode.apply(Pointer,Pointer,int,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void bigIntegerLeftShiftWorker(org.graalvm.word.Pointer newArr, org.graalvm.word.Pointer oldArr, int newIdx, int shiftCount, int numIter) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(BigIntegerLeftShiftWorkerNode_getMinimumFeatures());
        try {
            BigIntegerLeftShiftWorkerNode.apply(newArr, oldArr, newIdx, shiftCount, numIter, BigIntegerLeftShiftWorkerNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: BigIntegerLeftShiftWorkerNode.apply(Pointer,Pointer,int,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void bigIntegerLeftShiftWorkerRTC(org.graalvm.word.Pointer newArr, org.graalvm.word.Pointer oldArr, int newIdx, int shiftCount, int numIter) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(BigIntegerLeftShiftWorkerNode.class));
        try {
            BigIntegerLeftShiftWorkerNode.apply(newArr, oldArr, newIdx, shiftCount, numIter, Stubs.getRuntimeCheckedCPUFeatures(BigIntegerLeftShiftWorkerNode.class));
        } finally {
            region.leave();
        }
    }

    // method: BigIntegerMontgomeryMultiplyNode.apply(Pointer,Pointer,Pointer,int,long,Pointer)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void montgomeryMultiply(org.graalvm.word.Pointer a, org.graalvm.word.Pointer b, org.graalvm.word.Pointer n, int len, long inv, org.graalvm.word.Pointer product) {
        BigIntegerMontgomeryMultiplyNode.apply(a, b, n, len, inv, product);
    }

    // method: BigIntegerMontgomeryMultiplyNode.apply(Pointer,Pointer,Pointer,int,long,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void montgomeryMultiplyRTC(org.graalvm.word.Pointer a, org.graalvm.word.Pointer b, org.graalvm.word.Pointer n, int len, long inv, org.graalvm.word.Pointer product) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(BigIntegerMontgomeryMultiplyNode.class));
        try {
            BigIntegerMontgomeryMultiplyNode.apply(a, b, n, len, inv, product, Stubs.getRuntimeCheckedCPUFeatures(BigIntegerMontgomeryMultiplyNode.class));
        } finally {
            region.leave();
        }
    }

    // method: BigIntegerMontgomerySquareNode.apply(Pointer,Pointer,int,long,Pointer)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void montgomerySquare(org.graalvm.word.Pointer a, org.graalvm.word.Pointer n, int len, long inv, org.graalvm.word.Pointer product) {
        BigIntegerMontgomerySquareNode.apply(a, n, len, inv, product);
    }

    // method: BigIntegerMontgomerySquareNode.apply(Pointer,Pointer,int,long,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void montgomerySquareRTC(org.graalvm.word.Pointer a, org.graalvm.word.Pointer n, int len, long inv, org.graalvm.word.Pointer product) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(BigIntegerMontgomerySquareNode.class));
        try {
            BigIntegerMontgomerySquareNode.apply(a, n, len, inv, product, Stubs.getRuntimeCheckedCPUFeatures(BigIntegerMontgomerySquareNode.class));
        } finally {
            region.leave();
        }
    }

    // method: BigIntegerMulAddNode.apply(Pointer,Pointer,int,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int mulAdd(org.graalvm.word.Pointer out, org.graalvm.word.Pointer in, int offset, int len, int k) {
        return BigIntegerMulAddNode.apply(out, in, offset, len, k);
    }

    // method: BigIntegerMulAddNode.apply(Pointer,Pointer,int,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int mulAddRTC(org.graalvm.word.Pointer out, org.graalvm.word.Pointer in, int offset, int len, int k) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(BigIntegerMulAddNode.class));
        try {
            return BigIntegerMulAddNode.apply(out, in, offset, len, k, Stubs.getRuntimeCheckedCPUFeatures(BigIntegerMulAddNode.class));
        } finally {
            region.leave();
        }
    }

    // method: BigIntegerMultiplyToLenNode.apply(Pointer,int,Pointer,int,Pointer,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void multiplyToLen(org.graalvm.word.Pointer x, int xlen, org.graalvm.word.Pointer y, int ylen, org.graalvm.word.Pointer z, int zlen) {
        BigIntegerMultiplyToLenNode.apply(x, xlen, y, ylen, z, zlen);
    }

    // method: BigIntegerMultiplyToLenNode.apply(Pointer,int,Pointer,int,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void multiplyToLenRTC(org.graalvm.word.Pointer x, int xlen, org.graalvm.word.Pointer y, int ylen, org.graalvm.word.Pointer z, int zlen) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(BigIntegerMultiplyToLenNode.class));
        try {
            BigIntegerMultiplyToLenNode.apply(x, xlen, y, ylen, z, zlen, Stubs.getRuntimeCheckedCPUFeatures(BigIntegerMultiplyToLenNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> BigIntegerRightShiftWorkerNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return BigIntegerRightShiftWorkerNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: BigIntegerRightShiftWorkerNode.apply(Pointer,Pointer,int,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void bigIntegerRightShiftWorker(org.graalvm.word.Pointer newArr, org.graalvm.word.Pointer oldArr, int newIdx, int shiftCount, int numIter) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(BigIntegerRightShiftWorkerNode_getMinimumFeatures());
        try {
            BigIntegerRightShiftWorkerNode.apply(newArr, oldArr, newIdx, shiftCount, numIter, BigIntegerRightShiftWorkerNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: BigIntegerRightShiftWorkerNode.apply(Pointer,Pointer,int,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void bigIntegerRightShiftWorkerRTC(org.graalvm.word.Pointer newArr, org.graalvm.word.Pointer oldArr, int newIdx, int shiftCount, int numIter) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(BigIntegerRightShiftWorkerNode.class));
        try {
            BigIntegerRightShiftWorkerNode.apply(newArr, oldArr, newIdx, shiftCount, numIter, Stubs.getRuntimeCheckedCPUFeatures(BigIntegerRightShiftWorkerNode.class));
        } finally {
            region.leave();
        }
    }

    // method: BigIntegerSquareToLenNode.apply(Pointer,int,Pointer,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void squareToLen(org.graalvm.word.Pointer x, int len, org.graalvm.word.Pointer z, int zlen) {
        BigIntegerSquareToLenNode.apply(x, len, z, zlen);
    }

    // method: BigIntegerSquareToLenNode.apply(Pointer,int,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void squareToLenRTC(org.graalvm.word.Pointer x, int len, org.graalvm.word.Pointer z, int zlen) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(BigIntegerSquareToLenNode.class));
        try {
            BigIntegerSquareToLenNode.apply(x, len, z, zlen, Stubs.getRuntimeCheckedCPUFeatures(BigIntegerSquareToLenNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> CalcStringAttributesNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return CalcStringAttributesNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return CalcStringAttributesNode.minFeaturesAARCH64();
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: CalcStringAttributesNode.intReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int calcStringAttributesLatin1(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CalcStringAttributesNode_getMinimumFeatures());
        try {
            return CalcStringAttributesNode.intReturnValue(array, offset, length, CalcStringAttributesEncoding.LATIN1, false, CalcStringAttributesNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.intReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int calcStringAttributesLatin1RTC(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        try {
            return CalcStringAttributesNode.intReturnValue(array, offset, length, CalcStringAttributesEncoding.LATIN1, false, Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.intReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int calcStringAttributesBMP(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CalcStringAttributesNode_getMinimumFeatures());
        try {
            return CalcStringAttributesNode.intReturnValue(array, offset, length, CalcStringAttributesEncoding.BMP, false, CalcStringAttributesNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.intReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int calcStringAttributesBMPRTC(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        try {
            return CalcStringAttributesNode.intReturnValue(array, offset, length, CalcStringAttributesEncoding.BMP, false, Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.intReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int calcStringAttributesUTF32(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CalcStringAttributesNode_getMinimumFeatures());
        try {
            return CalcStringAttributesNode.intReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_32, false, CalcStringAttributesNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.intReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int calcStringAttributesUTF32RTC(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        try {
            return CalcStringAttributesNode.intReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_32, false, Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.intReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int calcStringAttributesUTF32FE(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CalcStringAttributesNode_getMinimumFeatures());
        try {
            return CalcStringAttributesNode.intReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_32_FOREIGN_ENDIAN, false, CalcStringAttributesNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.intReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int calcStringAttributesUTF32FERTC(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        try {
            return CalcStringAttributesNode.intReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_32_FOREIGN_ENDIAN, false, Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.longReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long calcStringAttributesUTF8Valid(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CalcStringAttributesNode_getMinimumFeatures());
        try {
            return CalcStringAttributesNode.longReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_8, true, CalcStringAttributesNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.longReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long calcStringAttributesUTF8ValidRTC(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        try {
            return CalcStringAttributesNode.longReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_8, true, Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.longReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long calcStringAttributesUTF8Unknown(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CalcStringAttributesNode_getMinimumFeatures());
        try {
            return CalcStringAttributesNode.longReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_8, false, CalcStringAttributesNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.longReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long calcStringAttributesUTF8UnknownRTC(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        try {
            return CalcStringAttributesNode.longReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_8, false, Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.longReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long calcStringAttributesUTF16Valid(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CalcStringAttributesNode_getMinimumFeatures());
        try {
            return CalcStringAttributesNode.longReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_16, true, CalcStringAttributesNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.longReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long calcStringAttributesUTF16ValidRTC(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        try {
            return CalcStringAttributesNode.longReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_16, true, Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.longReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long calcStringAttributesUTF16Unknown(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CalcStringAttributesNode_getMinimumFeatures());
        try {
            return CalcStringAttributesNode.longReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_16, false, CalcStringAttributesNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.longReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long calcStringAttributesUTF16UnknownRTC(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        try {
            return CalcStringAttributesNode.longReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_16, false, Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.longReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long calcStringAttributesUTF16FEValid(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CalcStringAttributesNode_getMinimumFeatures());
        try {
            return CalcStringAttributesNode.longReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_16_FOREIGN_ENDIAN, true, CalcStringAttributesNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.longReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long calcStringAttributesUTF16FEValidRTC(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        try {
            return CalcStringAttributesNode.longReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_16_FOREIGN_ENDIAN, true, Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.longReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long calcStringAttributesUTF16FEUnknown(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CalcStringAttributesNode_getMinimumFeatures());
        try {
            return CalcStringAttributesNode.longReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_16_FOREIGN_ENDIAN, false, CalcStringAttributesNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CalcStringAttributesNode.longReturnValue(Object,long,int,CalcStringAttributesEncoding,boolean,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long calcStringAttributesUTF16FEUnknownRTC(java.lang.Object array, long offset, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        try {
            return CalcStringAttributesNode.longReturnValue(array, offset, length, CalcStringAttributesEncoding.UTF_16_FOREIGN_ENDIAN, false, Stubs.getRuntimeCheckedCPUFeatures(CalcStringAttributesNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> ChaCha20Node_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return ChaCha20Node.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: ChaCha20Node.apply(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int chacha20Block(org.graalvm.word.Pointer state, org.graalvm.word.Pointer result) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ChaCha20Node_getMinimumFeatures());
        try {
            return ChaCha20Node.apply(state, result, ChaCha20Node_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: ChaCha20Node.apply(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int chacha20BlockRTC(org.graalvm.word.Pointer state, org.graalvm.word.Pointer result) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ChaCha20Node.class));
        try {
            return ChaCha20Node.apply(state, result, Stubs.getRuntimeCheckedCPUFeatures(ChaCha20Node.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> CipherBlockChainingAESNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return CipherBlockChainingAESNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return CipherBlockChainingAESNode.minFeaturesAARCH64();
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: CipherBlockChainingAESNode.apply(Pointer,Pointer,Pointer,Pointer,int,CryptMode,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int cbcAESEncrypt(org.graalvm.word.Pointer from, org.graalvm.word.Pointer to, org.graalvm.word.Pointer key, org.graalvm.word.Pointer r, int len) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CipherBlockChainingAESNode_getMinimumFeatures());
        try {
            return CipherBlockChainingAESNode.apply(from, to, key, r, len, CryptMode.ENCRYPT, CipherBlockChainingAESNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CipherBlockChainingAESNode.apply(Pointer,Pointer,Pointer,Pointer,int,CryptMode,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int cbcAESEncryptRTC(org.graalvm.word.Pointer from, org.graalvm.word.Pointer to, org.graalvm.word.Pointer key, org.graalvm.word.Pointer r, int len) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CipherBlockChainingAESNode.class));
        try {
            return CipherBlockChainingAESNode.apply(from, to, key, r, len, CryptMode.ENCRYPT, Stubs.getRuntimeCheckedCPUFeatures(CipherBlockChainingAESNode.class));
        } finally {
            region.leave();
        }
    }

    // method: CipherBlockChainingAESNode.apply(Pointer,Pointer,Pointer,Pointer,int,CryptMode,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int cbcAESDecrypt(org.graalvm.word.Pointer from, org.graalvm.word.Pointer to, org.graalvm.word.Pointer key, org.graalvm.word.Pointer r, int len) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CipherBlockChainingAESNode_getMinimumFeatures());
        try {
            return CipherBlockChainingAESNode.apply(from, to, key, r, len, CryptMode.DECRYPT, CipherBlockChainingAESNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CipherBlockChainingAESNode.apply(Pointer,Pointer,Pointer,Pointer,int,CryptMode,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int cbcAESDecryptRTC(org.graalvm.word.Pointer from, org.graalvm.word.Pointer to, org.graalvm.word.Pointer key, org.graalvm.word.Pointer r, int len) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CipherBlockChainingAESNode.class));
        try {
            return CipherBlockChainingAESNode.apply(from, to, key, r, len, CryptMode.DECRYPT, Stubs.getRuntimeCheckedCPUFeatures(CipherBlockChainingAESNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> CounterModeAESNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return CounterModeAESNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return CounterModeAESNode.minFeaturesAARCH64();
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: CounterModeAESNode.apply(Pointer,Pointer,Pointer,Pointer,int,Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int ctrAESCrypt(org.graalvm.word.Pointer inAddr, org.graalvm.word.Pointer outAddr, org.graalvm.word.Pointer kAddr, org.graalvm.word.Pointer counterAddr, int len, org.graalvm.word.Pointer encryptedCounterAddr, org.graalvm.word.Pointer usedPtr) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CounterModeAESNode_getMinimumFeatures());
        try {
            return CounterModeAESNode.apply(inAddr, outAddr, kAddr, counterAddr, len, encryptedCounterAddr, usedPtr, CounterModeAESNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CounterModeAESNode.apply(Pointer,Pointer,Pointer,Pointer,int,Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int ctrAESCryptRTC(org.graalvm.word.Pointer inAddr, org.graalvm.word.Pointer outAddr, org.graalvm.word.Pointer kAddr, org.graalvm.word.Pointer counterAddr, int len, org.graalvm.word.Pointer encryptedCounterAddr, org.graalvm.word.Pointer usedPtr) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CounterModeAESNode.class));
        try {
            return CounterModeAESNode.apply(inAddr, outAddr, kAddr, counterAddr, len, encryptedCounterAddr, usedPtr, Stubs.getRuntimeCheckedCPUFeatures(CounterModeAESNode.class));
        } finally {
            region.leave();
        }
    }

    // method: CountPositivesNode.stringCodingCountPositives(Pointer,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int stringCodingCountPositives(org.graalvm.word.Pointer array, int len) {
        return CountPositivesNode.stringCodingCountPositives(array, len);
    }

    // method: CountPositivesNode.stringCodingCountPositives(Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int stringCodingCountPositivesRTC(org.graalvm.word.Pointer array, int len) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CountPositivesNode.class));
        try {
            return CountPositivesNode.stringCodingCountPositives(array, len, Stubs.getRuntimeCheckedCPUFeatures(CountPositivesNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> CRC32CUpdateBytesNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return CRC32CUpdateBytesNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return CRC32CUpdateBytesNode.minFeaturesAARCH64();
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: CRC32CUpdateBytesNode.update(int,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int updateBytesCRC32C(int crc, org.graalvm.word.Pointer bufferAddress, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CRC32CUpdateBytesNode_getMinimumFeatures());
        try {
            return CRC32CUpdateBytesNode.update(crc, bufferAddress, length, CRC32CUpdateBytesNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CRC32CUpdateBytesNode.update(int,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int updateBytesCRC32CRTC(int crc, org.graalvm.word.Pointer bufferAddress, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CRC32CUpdateBytesNode.class));
        try {
            return CRC32CUpdateBytesNode.update(crc, bufferAddress, length, Stubs.getRuntimeCheckedCPUFeatures(CRC32CUpdateBytesNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> CRC32UpdateBytesNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return CRC32UpdateBytesNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: CRC32UpdateBytesNode.update(int,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int updateBytesCRC32(int crc, org.graalvm.word.Pointer bufferAddress, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(CRC32UpdateBytesNode_getMinimumFeatures());
        try {
            return CRC32UpdateBytesNode.update(crc, bufferAddress, length, CRC32UpdateBytesNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: CRC32UpdateBytesNode.update(int,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int updateBytesCRC32RTC(int crc, org.graalvm.word.Pointer bufferAddress, int length) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(CRC32UpdateBytesNode.class));
        try {
            return CRC32UpdateBytesNode.update(crc, bufferAddress, length, Stubs.getRuntimeCheckedCPUFeatures(CRC32UpdateBytesNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> DilithiumAlmostInverseNttNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return DilithiumAlmostInverseNttNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: DilithiumAlmostInverseNttNode.dilithiumAlmostInverseNtt(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int dilithiumAlmostInverseNtt(org.graalvm.word.Pointer coeffs, org.graalvm.word.Pointer zetas) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(DilithiumAlmostInverseNttNode_getMinimumFeatures());
        try {
            return DilithiumAlmostInverseNttNode.dilithiumAlmostInverseNtt(coeffs, zetas, DilithiumAlmostInverseNttNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: DilithiumAlmostInverseNttNode.dilithiumAlmostInverseNtt(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int dilithiumAlmostInverseNttRTC(org.graalvm.word.Pointer coeffs, org.graalvm.word.Pointer zetas) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(DilithiumAlmostInverseNttNode.class));
        try {
            return DilithiumAlmostInverseNttNode.dilithiumAlmostInverseNtt(coeffs, zetas, Stubs.getRuntimeCheckedCPUFeatures(DilithiumAlmostInverseNttNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> DilithiumAlmostNttNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return DilithiumAlmostNttNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: DilithiumAlmostNttNode.dilithiumAlmostNtt(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int dilithiumAlmostNtt(org.graalvm.word.Pointer coeffs, org.graalvm.word.Pointer zetas) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(DilithiumAlmostNttNode_getMinimumFeatures());
        try {
            return DilithiumAlmostNttNode.dilithiumAlmostNtt(coeffs, zetas, DilithiumAlmostNttNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: DilithiumAlmostNttNode.dilithiumAlmostNtt(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int dilithiumAlmostNttRTC(org.graalvm.word.Pointer coeffs, org.graalvm.word.Pointer zetas) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(DilithiumAlmostNttNode.class));
        try {
            return DilithiumAlmostNttNode.dilithiumAlmostNtt(coeffs, zetas, Stubs.getRuntimeCheckedCPUFeatures(DilithiumAlmostNttNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> DilithiumDecomposePolyNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return DilithiumDecomposePolyNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: DilithiumDecomposePolyNode.dilithiumDecomposePoly(Pointer,Pointer,Pointer,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int dilithiumDecomposePoly(org.graalvm.word.Pointer input, org.graalvm.word.Pointer lowPart, org.graalvm.word.Pointer highPart, int twoGamma2, int multiplier) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(DilithiumDecomposePolyNode_getMinimumFeatures());
        try {
            return DilithiumDecomposePolyNode.dilithiumDecomposePoly(input, lowPart, highPart, twoGamma2, multiplier, DilithiumDecomposePolyNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: DilithiumDecomposePolyNode.dilithiumDecomposePoly(Pointer,Pointer,Pointer,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int dilithiumDecomposePolyRTC(org.graalvm.word.Pointer input, org.graalvm.word.Pointer lowPart, org.graalvm.word.Pointer highPart, int twoGamma2, int multiplier) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(DilithiumDecomposePolyNode.class));
        try {
            return DilithiumDecomposePolyNode.dilithiumDecomposePoly(input, lowPart, highPart, twoGamma2, multiplier, Stubs.getRuntimeCheckedCPUFeatures(DilithiumDecomposePolyNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> DilithiumMontMulByConstantNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return DilithiumMontMulByConstantNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: DilithiumMontMulByConstantNode.dilithiumMontMulByConstant(Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int dilithiumMontMulByConstant(org.graalvm.word.Pointer coeffs, int constant) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(DilithiumMontMulByConstantNode_getMinimumFeatures());
        try {
            return DilithiumMontMulByConstantNode.dilithiumMontMulByConstant(coeffs, constant, DilithiumMontMulByConstantNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: DilithiumMontMulByConstantNode.dilithiumMontMulByConstant(Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int dilithiumMontMulByConstantRTC(org.graalvm.word.Pointer coeffs, int constant) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(DilithiumMontMulByConstantNode.class));
        try {
            return DilithiumMontMulByConstantNode.dilithiumMontMulByConstant(coeffs, constant, Stubs.getRuntimeCheckedCPUFeatures(DilithiumMontMulByConstantNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> DilithiumNttMultNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return DilithiumNttMultNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: DilithiumNttMultNode.dilithiumNttMult(Pointer,Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int dilithiumNttMult(org.graalvm.word.Pointer product, org.graalvm.word.Pointer coeffs1, org.graalvm.word.Pointer coeffs2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(DilithiumNttMultNode_getMinimumFeatures());
        try {
            return DilithiumNttMultNode.dilithiumNttMult(product, coeffs1, coeffs2, DilithiumNttMultNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: DilithiumNttMultNode.dilithiumNttMult(Pointer,Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int dilithiumNttMultRTC(org.graalvm.word.Pointer product, org.graalvm.word.Pointer coeffs1, org.graalvm.word.Pointer coeffs2) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(DilithiumNttMultNode.class));
        try {
            return DilithiumNttMultNode.dilithiumNttMult(product, coeffs1, coeffs2, Stubs.getRuntimeCheckedCPUFeatures(DilithiumNttMultNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> DoubleModStubNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return DoubleModStubNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: DoubleModStubNode.compute(double,double,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static double fmod(double x, double y) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(DoubleModStubNode_getMinimumFeatures());
        try {
            return DoubleModStubNode.compute(x, y, DoubleModStubNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: DoubleModStubNode.compute(double,double,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static double fmodRTC(double x, double y) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(DoubleModStubNode.class));
        try {
            return DoubleModStubNode.compute(x, y, Stubs.getRuntimeCheckedCPUFeatures(DoubleModStubNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> ElectronicCodeBookAESNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return ElectronicCodeBookAESNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: ElectronicCodeBookAESNode.apply(Pointer,Pointer,Pointer,int,CryptMode,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int ecbAESEncrypt(org.graalvm.word.Pointer from, org.graalvm.word.Pointer to, org.graalvm.word.Pointer key, int len) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ElectronicCodeBookAESNode_getMinimumFeatures());
        try {
            return ElectronicCodeBookAESNode.apply(from, to, key, len, CryptMode.ENCRYPT, ElectronicCodeBookAESNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: ElectronicCodeBookAESNode.apply(Pointer,Pointer,Pointer,int,CryptMode,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int ecbAESEncryptRTC(org.graalvm.word.Pointer from, org.graalvm.word.Pointer to, org.graalvm.word.Pointer key, int len) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ElectronicCodeBookAESNode.class));
        try {
            return ElectronicCodeBookAESNode.apply(from, to, key, len, CryptMode.ENCRYPT, Stubs.getRuntimeCheckedCPUFeatures(ElectronicCodeBookAESNode.class));
        } finally {
            region.leave();
        }
    }

    // method: ElectronicCodeBookAESNode.apply(Pointer,Pointer,Pointer,int,CryptMode,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int ecbAESDecrypt(org.graalvm.word.Pointer from, org.graalvm.word.Pointer to, org.graalvm.word.Pointer key, int len) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(ElectronicCodeBookAESNode_getMinimumFeatures());
        try {
            return ElectronicCodeBookAESNode.apply(from, to, key, len, CryptMode.DECRYPT, ElectronicCodeBookAESNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: ElectronicCodeBookAESNode.apply(Pointer,Pointer,Pointer,int,CryptMode,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int ecbAESDecryptRTC(org.graalvm.word.Pointer from, org.graalvm.word.Pointer to, org.graalvm.word.Pointer key, int len) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(ElectronicCodeBookAESNode.class));
        try {
            return ElectronicCodeBookAESNode.apply(from, to, key, len, CryptMode.DECRYPT, Stubs.getRuntimeCheckedCPUFeatures(ElectronicCodeBookAESNode.class));
        } finally {
            region.leave();
        }
    }

    // method: EncodeArrayNode.stringCodingEncodeArray(Pointer,Pointer,int,CharsetName)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int stringCodingEncodeArrayAscii(org.graalvm.word.Pointer src, org.graalvm.word.Pointer dst, int len) {
        return EncodeArrayNode.stringCodingEncodeArray(src, dst, len, CharsetName.ASCII);
    }

    // method: EncodeArrayNode.stringCodingEncodeArray(Pointer,Pointer,int,CharsetName,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int stringCodingEncodeArrayAsciiRTC(org.graalvm.word.Pointer src, org.graalvm.word.Pointer dst, int len) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(EncodeArrayNode.class));
        try {
            return EncodeArrayNode.stringCodingEncodeArray(src, dst, len, CharsetName.ASCII, Stubs.getRuntimeCheckedCPUFeatures(EncodeArrayNode.class));
        } finally {
            region.leave();
        }
    }

    // method: EncodeArrayNode.stringCodingEncodeArray(Pointer,Pointer,int,CharsetName)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int stringCodingEncodeArrayLatin1(org.graalvm.word.Pointer src, org.graalvm.word.Pointer dst, int len) {
        return EncodeArrayNode.stringCodingEncodeArray(src, dst, len, CharsetName.ISO_8859_1);
    }

    // method: EncodeArrayNode.stringCodingEncodeArray(Pointer,Pointer,int,CharsetName,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int stringCodingEncodeArrayLatin1RTC(org.graalvm.word.Pointer src, org.graalvm.word.Pointer dst, int len) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(EncodeArrayNode.class));
        try {
            return EncodeArrayNode.stringCodingEncodeArray(src, dst, len, CharsetName.ISO_8859_1, Stubs.getRuntimeCheckedCPUFeatures(EncodeArrayNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> GaloisCounterModeAESNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return GaloisCounterModeAESNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return GaloisCounterModeAESNode.minFeaturesAARCH64();
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: GaloisCounterModeAESNode.apply(Pointer,int,Pointer,Pointer,Pointer,Pointer,Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int galoisCounterModeAESCrypt(org.graalvm.word.Pointer in, int len, org.graalvm.word.Pointer ct, org.graalvm.word.Pointer out, org.graalvm.word.Pointer key, org.graalvm.word.Pointer state, org.graalvm.word.Pointer subkeyHtbl, org.graalvm.word.Pointer counter) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(GaloisCounterModeAESNode_getMinimumFeatures());
        try {
            return GaloisCounterModeAESNode.apply(in, len, ct, out, key, state, subkeyHtbl, counter, GaloisCounterModeAESNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: GaloisCounterModeAESNode.apply(Pointer,int,Pointer,Pointer,Pointer,Pointer,Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int galoisCounterModeAESCryptRTC(org.graalvm.word.Pointer in, int len, org.graalvm.word.Pointer ct, org.graalvm.word.Pointer out, org.graalvm.word.Pointer key, org.graalvm.word.Pointer state, org.graalvm.word.Pointer subkeyHtbl, org.graalvm.word.Pointer counter) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(GaloisCounterModeAESNode.class));
        try {
            return GaloisCounterModeAESNode.apply(in, len, ct, out, key, state, subkeyHtbl, counter, Stubs.getRuntimeCheckedCPUFeatures(GaloisCounterModeAESNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> GHASHProcessBlocksNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return GHASHProcessBlocksNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return GHASHProcessBlocksNode.minFeaturesAARCH64();
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: GHASHProcessBlocksNode.apply(Pointer,Pointer,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void ghashProcessBlocks(org.graalvm.word.Pointer state, org.graalvm.word.Pointer hashSubkey, org.graalvm.word.Pointer data, int blocks) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(GHASHProcessBlocksNode_getMinimumFeatures());
        try {
            GHASHProcessBlocksNode.apply(state, hashSubkey, data, blocks, GHASHProcessBlocksNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: GHASHProcessBlocksNode.apply(Pointer,Pointer,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void ghashProcessBlocksRTC(org.graalvm.word.Pointer state, org.graalvm.word.Pointer hashSubkey, org.graalvm.word.Pointer data, int blocks) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(GHASHProcessBlocksNode.class));
        try {
            GHASHProcessBlocksNode.apply(state, hashSubkey, data, blocks, Stubs.getRuntimeCheckedCPUFeatures(GHASHProcessBlocksNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> IndexOfZeroNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return IndexOfZeroNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: IndexOfZeroNode.optimizedArrayIndexOf(Stride,EnumSet<?>,long)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOfZeroS1(long arrayPtr) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(IndexOfZeroNode_getMinimumFeatures());
        try {
            return IndexOfZeroNode.optimizedArrayIndexOf(Stride.S1, IndexOfZeroNode_getMinimumFeatures(), arrayPtr);
        } finally {
            region.leave();
        }
    }

    // method: IndexOfZeroNode.optimizedArrayIndexOf(Stride,EnumSet<?>,long)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOfZeroS1RTC(long arrayPtr) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(IndexOfZeroNode.class));
        try {
            return IndexOfZeroNode.optimizedArrayIndexOf(Stride.S1, Stubs.getRuntimeCheckedCPUFeatures(IndexOfZeroNode.class), arrayPtr);
        } finally {
            region.leave();
        }
    }

    // method: IndexOfZeroNode.optimizedArrayIndexOf(Stride,EnumSet<?>,long)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOfZeroS2(long arrayPtr) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(IndexOfZeroNode_getMinimumFeatures());
        try {
            return IndexOfZeroNode.optimizedArrayIndexOf(Stride.S2, IndexOfZeroNode_getMinimumFeatures(), arrayPtr);
        } finally {
            region.leave();
        }
    }

    // method: IndexOfZeroNode.optimizedArrayIndexOf(Stride,EnumSet<?>,long)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOfZeroS2RTC(long arrayPtr) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(IndexOfZeroNode.class));
        try {
            return IndexOfZeroNode.optimizedArrayIndexOf(Stride.S2, Stubs.getRuntimeCheckedCPUFeatures(IndexOfZeroNode.class), arrayPtr);
        } finally {
            region.leave();
        }
    }

    // method: IndexOfZeroNode.optimizedArrayIndexOf(Stride,EnumSet<?>,long)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOfZeroS4(long arrayPtr) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(IndexOfZeroNode_getMinimumFeatures());
        try {
            return IndexOfZeroNode.optimizedArrayIndexOf(Stride.S4, IndexOfZeroNode_getMinimumFeatures(), arrayPtr);
        } finally {
            region.leave();
        }
    }

    // method: IndexOfZeroNode.optimizedArrayIndexOf(Stride,EnumSet<?>,long)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static long indexOfZeroS4RTC(long arrayPtr) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(IndexOfZeroNode.class));
        try {
            return IndexOfZeroNode.optimizedArrayIndexOf(Stride.S4, Stubs.getRuntimeCheckedCPUFeatures(IndexOfZeroNode.class), arrayPtr);
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> KyberNttNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return KyberNttNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: KyberNttNode.kyberNtt(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int kyberNtt(org.graalvm.word.Pointer poly, org.graalvm.word.Pointer zetas) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(KyberNttNode_getMinimumFeatures());
        try {
            return KyberNttNode.kyberNtt(poly, zetas, KyberNttNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: KyberNttNode.kyberNtt(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int kyberNttRTC(org.graalvm.word.Pointer poly, org.graalvm.word.Pointer zetas) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(KyberNttNode.class));
        try {
            return KyberNttNode.kyberNtt(poly, zetas, Stubs.getRuntimeCheckedCPUFeatures(KyberNttNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> KyberInverseNttNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return KyberInverseNttNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: KyberInverseNttNode.kyberInverseNtt(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int kyberInverseNtt(org.graalvm.word.Pointer poly, org.graalvm.word.Pointer zetas) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(KyberInverseNttNode_getMinimumFeatures());
        try {
            return KyberInverseNttNode.kyberInverseNtt(poly, zetas, KyberInverseNttNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: KyberInverseNttNode.kyberInverseNtt(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int kyberInverseNttRTC(org.graalvm.word.Pointer poly, org.graalvm.word.Pointer zetas) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(KyberInverseNttNode.class));
        try {
            return KyberInverseNttNode.kyberInverseNtt(poly, zetas, Stubs.getRuntimeCheckedCPUFeatures(KyberInverseNttNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> KyberNttMultNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return KyberNttMultNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: KyberNttMultNode.kyberNttMult(Pointer,Pointer,Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int kyberNttMult(org.graalvm.word.Pointer result, org.graalvm.word.Pointer ntta, org.graalvm.word.Pointer nttb, org.graalvm.word.Pointer zetas) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(KyberNttMultNode_getMinimumFeatures());
        try {
            return KyberNttMultNode.kyberNttMult(result, ntta, nttb, zetas, KyberNttMultNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: KyberNttMultNode.kyberNttMult(Pointer,Pointer,Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int kyberNttMultRTC(org.graalvm.word.Pointer result, org.graalvm.word.Pointer ntta, org.graalvm.word.Pointer nttb, org.graalvm.word.Pointer zetas) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(KyberNttMultNode.class));
        try {
            return KyberNttMultNode.kyberNttMult(result, ntta, nttb, zetas, Stubs.getRuntimeCheckedCPUFeatures(KyberNttMultNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> KyberAddPoly2Node_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return KyberAddPoly2Node.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: KyberAddPoly2Node.kyberAddPoly2(Pointer,Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int kyberAddPoly_2(org.graalvm.word.Pointer result, org.graalvm.word.Pointer a, org.graalvm.word.Pointer b) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(KyberAddPoly2Node_getMinimumFeatures());
        try {
            return KyberAddPoly2Node.kyberAddPoly2(result, a, b, KyberAddPoly2Node_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: KyberAddPoly2Node.kyberAddPoly2(Pointer,Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int kyberAddPoly_2RTC(org.graalvm.word.Pointer result, org.graalvm.word.Pointer a, org.graalvm.word.Pointer b) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(KyberAddPoly2Node.class));
        try {
            return KyberAddPoly2Node.kyberAddPoly2(result, a, b, Stubs.getRuntimeCheckedCPUFeatures(KyberAddPoly2Node.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> KyberAddPoly3Node_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return KyberAddPoly3Node.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: KyberAddPoly3Node.kyberAddPoly3(Pointer,Pointer,Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int kyberAddPoly_3(org.graalvm.word.Pointer result, org.graalvm.word.Pointer a, org.graalvm.word.Pointer b, org.graalvm.word.Pointer c) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(KyberAddPoly3Node_getMinimumFeatures());
        try {
            return KyberAddPoly3Node.kyberAddPoly3(result, a, b, c, KyberAddPoly3Node_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: KyberAddPoly3Node.kyberAddPoly3(Pointer,Pointer,Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int kyberAddPoly_3RTC(org.graalvm.word.Pointer result, org.graalvm.word.Pointer a, org.graalvm.word.Pointer b, org.graalvm.word.Pointer c) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(KyberAddPoly3Node.class));
        try {
            return KyberAddPoly3Node.kyberAddPoly3(result, a, b, c, Stubs.getRuntimeCheckedCPUFeatures(KyberAddPoly3Node.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> Kyber12To16Node_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return Kyber12To16Node.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: Kyber12To16Node.kyber12To16(Pointer,int,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int kyber12To16(org.graalvm.word.Pointer condensed, int index, org.graalvm.word.Pointer parsed, int parsedLength) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Kyber12To16Node_getMinimumFeatures());
        try {
            return Kyber12To16Node.kyber12To16(condensed, index, parsed, parsedLength, Kyber12To16Node_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: Kyber12To16Node.kyber12To16(Pointer,int,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int kyber12To16RTC(org.graalvm.word.Pointer condensed, int index, org.graalvm.word.Pointer parsed, int parsedLength) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(Kyber12To16Node.class));
        try {
            return Kyber12To16Node.kyber12To16(condensed, index, parsed, parsedLength, Stubs.getRuntimeCheckedCPUFeatures(Kyber12To16Node.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> KyberBarrettReduceNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return KyberBarrettReduceNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: KyberBarrettReduceNode.kyberBarrettReduce(Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int kyberBarrettReduce(org.graalvm.word.Pointer coeffs) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(KyberBarrettReduceNode_getMinimumFeatures());
        try {
            return KyberBarrettReduceNode.kyberBarrettReduce(coeffs, KyberBarrettReduceNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: KyberBarrettReduceNode.kyberBarrettReduce(Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int kyberBarrettReduceRTC(org.graalvm.word.Pointer coeffs) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(KyberBarrettReduceNode.class));
        try {
            return KyberBarrettReduceNode.kyberBarrettReduce(coeffs, Stubs.getRuntimeCheckedCPUFeatures(KyberBarrettReduceNode.class));
        } finally {
            region.leave();
        }
    }

    // method: MD5Node.md5ImplCompress(Pointer,Pointer)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void md5ImplCompress(org.graalvm.word.Pointer buf, org.graalvm.word.Pointer state) {
        MD5Node.md5ImplCompress(buf, state);
    }

    // method: MD5Node.md5ImplCompress(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void md5ImplCompressRTC(org.graalvm.word.Pointer buf, org.graalvm.word.Pointer state) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(MD5Node.class));
        try {
            MD5Node.md5ImplCompress(buf, state, Stubs.getRuntimeCheckedCPUFeatures(MD5Node.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> Poly1305ProcessBlocksNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return Poly1305ProcessBlocksNode.maxFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: Poly1305ProcessBlocksNode.apply(Pointer,int,Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void poly1305ProcessBlocks(org.graalvm.word.Pointer input, int length, org.graalvm.word.Pointer accumulator, org.graalvm.word.Pointer r) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Poly1305ProcessBlocksNode_getMinimumFeatures());
        try {
            Poly1305ProcessBlocksNode.apply(input, length, accumulator, r, Poly1305ProcessBlocksNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: Poly1305ProcessBlocksNode.apply(Pointer,int,Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void poly1305ProcessBlocksRTC(org.graalvm.word.Pointer input, int length, org.graalvm.word.Pointer accumulator, org.graalvm.word.Pointer r) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(Poly1305ProcessBlocksNode.class));
        try {
            Poly1305ProcessBlocksNode.apply(input, length, accumulator, r, Stubs.getRuntimeCheckedCPUFeatures(Poly1305ProcessBlocksNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> SHA1Node_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return SHA1Node.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return SHA1Node.minFeaturesAARCH64();
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: SHA1Node.sha1ImplCompress(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void sha1ImplCompress(org.graalvm.word.Pointer buf, org.graalvm.word.Pointer state) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(SHA1Node_getMinimumFeatures());
        try {
            SHA1Node.sha1ImplCompress(buf, state, SHA1Node_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: SHA1Node.sha1ImplCompress(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void sha1ImplCompressRTC(org.graalvm.word.Pointer buf, org.graalvm.word.Pointer state) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(SHA1Node.class));
        try {
            SHA1Node.sha1ImplCompress(buf, state, Stubs.getRuntimeCheckedCPUFeatures(SHA1Node.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> SHA256Node_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return SHA256Node.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return SHA256Node.minFeaturesAARCH64();
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: SHA256Node.sha256ImplCompress(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void sha256ImplCompress(org.graalvm.word.Pointer buf, org.graalvm.word.Pointer state) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(SHA256Node_getMinimumFeatures());
        try {
            SHA256Node.sha256ImplCompress(buf, state, SHA256Node_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: SHA256Node.sha256ImplCompress(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void sha256ImplCompressRTC(org.graalvm.word.Pointer buf, org.graalvm.word.Pointer state) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(SHA256Node.class));
        try {
            SHA256Node.sha256ImplCompress(buf, state, Stubs.getRuntimeCheckedCPUFeatures(SHA256Node.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> SHA3Node_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return EMPTY_CPU_FEATURES_AMD64;
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return SHA3Node.minFeaturesAARCH64();
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: SHA3Node.sha3ImplCompress(Pointer,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void sha3ImplCompress(org.graalvm.word.Pointer buf, org.graalvm.word.Pointer state, int blockSize) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(SHA3Node_getMinimumFeatures());
        try {
            SHA3Node.sha3ImplCompress(buf, state, blockSize, SHA3Node_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: SHA3Node.sha3ImplCompress(Pointer,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void sha3ImplCompressRTC(org.graalvm.word.Pointer buf, org.graalvm.word.Pointer state, int blockSize) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(SHA3Node.class));
        try {
            SHA3Node.sha3ImplCompress(buf, state, blockSize, Stubs.getRuntimeCheckedCPUFeatures(SHA3Node.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> SHA512Node_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return SHA512Node.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return SHA512Node.minFeaturesAARCH64();
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: SHA512Node.sha512ImplCompress(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void sha512ImplCompress(org.graalvm.word.Pointer buf, org.graalvm.word.Pointer state) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(SHA512Node_getMinimumFeatures());
        try {
            SHA512Node.sha512ImplCompress(buf, state, SHA512Node_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: SHA512Node.sha512ImplCompress(Pointer,Pointer,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void sha512ImplCompressRTC(org.graalvm.word.Pointer buf, org.graalvm.word.Pointer state) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(SHA512Node.class));
        try {
            SHA512Node.sha512ImplCompress(buf, state, Stubs.getRuntimeCheckedCPUFeatures(SHA512Node.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> StringCodepointIndexToByteIndexNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return StringCodepointIndexToByteIndexNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return StringCodepointIndexToByteIndexNode.minFeaturesAARCH64();
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: StringCodepointIndexToByteIndexNode.codepointIndexToByteIndex(Object,long,int,int,InputEncoding,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int codePointIndexToByteIndexUTF8(java.lang.Object array, long offset, int length, int index) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(StringCodepointIndexToByteIndexNode_getMinimumFeatures());
        try {
            return StringCodepointIndexToByteIndexNode.codepointIndexToByteIndex(array, offset, length, index, InputEncoding.UTF_8, StringCodepointIndexToByteIndexNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: StringCodepointIndexToByteIndexNode.codepointIndexToByteIndex(Object,long,int,int,InputEncoding,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int codePointIndexToByteIndexUTF8RTC(java.lang.Object array, long offset, int length, int index) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(StringCodepointIndexToByteIndexNode.class));
        try {
            return StringCodepointIndexToByteIndexNode.codepointIndexToByteIndex(array, offset, length, index, InputEncoding.UTF_8, Stubs.getRuntimeCheckedCPUFeatures(StringCodepointIndexToByteIndexNode.class));
        } finally {
            region.leave();
        }
    }

    // method: StringCodepointIndexToByteIndexNode.codepointIndexToByteIndex(Object,long,int,int,InputEncoding,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int codePointIndexToByteIndexUTF16(java.lang.Object array, long offset, int length, int index) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(StringCodepointIndexToByteIndexNode_getMinimumFeatures());
        try {
            return StringCodepointIndexToByteIndexNode.codepointIndexToByteIndex(array, offset, length, index, InputEncoding.UTF_16, StringCodepointIndexToByteIndexNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: StringCodepointIndexToByteIndexNode.codepointIndexToByteIndex(Object,long,int,int,InputEncoding,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int codePointIndexToByteIndexUTF16RTC(java.lang.Object array, long offset, int length, int index) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(StringCodepointIndexToByteIndexNode.class));
        try {
            return StringCodepointIndexToByteIndexNode.codepointIndexToByteIndex(array, offset, length, index, InputEncoding.UTF_16, Stubs.getRuntimeCheckedCPUFeatures(StringCodepointIndexToByteIndexNode.class));
        } finally {
            region.leave();
        }
    }

    // method: StringCodepointIndexToByteIndexNode.codepointIndexToByteIndex(Object,long,int,int,InputEncoding,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int codePointIndexToByteIndexUTF16FE(java.lang.Object array, long offset, int length, int index) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(StringCodepointIndexToByteIndexNode_getMinimumFeatures());
        try {
            return StringCodepointIndexToByteIndexNode.codepointIndexToByteIndex(array, offset, length, index, InputEncoding.UTF_16_FOREIGN_ENDIAN, StringCodepointIndexToByteIndexNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: StringCodepointIndexToByteIndexNode.codepointIndexToByteIndex(Object,long,int,int,InputEncoding,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int codePointIndexToByteIndexUTF16FERTC(java.lang.Object array, long offset, int length, int index) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(StringCodepointIndexToByteIndexNode.class));
        try {
            return StringCodepointIndexToByteIndexNode.codepointIndexToByteIndex(array, offset, length, index, InputEncoding.UTF_16_FOREIGN_ENDIAN, Stubs.getRuntimeCheckedCPUFeatures(StringCodepointIndexToByteIndexNode.class));
        } finally {
            region.leave();
        }
    }

    // method: StringLatin1InflateNode.stringLatin1Inflate(Pointer,Pointer,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void stringLatin1Inflate(org.graalvm.word.Pointer src, org.graalvm.word.Pointer dst, int len) {
        StringLatin1InflateNode.stringLatin1Inflate(src, dst, len);
    }

    // method: StringLatin1InflateNode.stringLatin1Inflate(Pointer,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static void stringLatin1InflateRTC(org.graalvm.word.Pointer src, org.graalvm.word.Pointer dst, int len) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(StringLatin1InflateNode.class));
        try {
            StringLatin1InflateNode.stringLatin1Inflate(src, dst, len, Stubs.getRuntimeCheckedCPUFeatures(StringLatin1InflateNode.class));
        } finally {
            region.leave();
        }
    }

    // method: StringUTF16CompressNode.stringUTF16Compress(Pointer,Pointer,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int stringUTF16Compress(org.graalvm.word.Pointer src, org.graalvm.word.Pointer dst, int len) {
        return StringUTF16CompressNode.stringUTF16Compress(src, dst, len);
    }

    // method: StringUTF16CompressNode.stringUTF16Compress(Pointer,Pointer,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int stringUTF16CompressRTC(org.graalvm.word.Pointer src, org.graalvm.word.Pointer dst, int len) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(StringUTF16CompressNode.class));
        try {
            return StringUTF16CompressNode.stringUTF16Compress(src, dst, len, Stubs.getRuntimeCheckedCPUFeatures(StringUTF16CompressNode.class));
        } finally {
            region.leave();
        }
    }

    @Fold
    public static EnumSet<?> VectorizedHashCodeNode_getMinimumFeatures() {
        Architecture arch = SubstrateTarget.getArchitecture();
        if (arch instanceof jdk.vm.ci.amd64.AMD64) {
            return VectorizedHashCodeNode.minFeaturesAMD64();
        }
        if (arch instanceof jdk.vm.ci.aarch64.AArch64) {
            return EMPTY_CPU_FEATURES_AARCH64;
        }
        throw GraalError.unsupportedArchitecture(arch);
    }

    // method: VectorizedHashCodeNode.vectorizedHashCode(Pointer,int,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int vectorizedHashCodeBoolean(org.graalvm.word.Pointer arrayStart, int length, int initialValue) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(VectorizedHashCodeNode_getMinimumFeatures());
        try {
            return VectorizedHashCodeNode.vectorizedHashCode(arrayStart, length, initialValue, JavaKind.Boolean, VectorizedHashCodeNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: VectorizedHashCodeNode.vectorizedHashCode(Pointer,int,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int vectorizedHashCodeBooleanRTC(org.graalvm.word.Pointer arrayStart, int length, int initialValue) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(VectorizedHashCodeNode.class));
        try {
            return VectorizedHashCodeNode.vectorizedHashCode(arrayStart, length, initialValue, JavaKind.Boolean, Stubs.getRuntimeCheckedCPUFeatures(VectorizedHashCodeNode.class));
        } finally {
            region.leave();
        }
    }

    // method: VectorizedHashCodeNode.vectorizedHashCode(Pointer,int,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int vectorizedHashCodeChar(org.graalvm.word.Pointer arrayStart, int length, int initialValue) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(VectorizedHashCodeNode_getMinimumFeatures());
        try {
            return VectorizedHashCodeNode.vectorizedHashCode(arrayStart, length, initialValue, JavaKind.Char, VectorizedHashCodeNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: VectorizedHashCodeNode.vectorizedHashCode(Pointer,int,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int vectorizedHashCodeCharRTC(org.graalvm.word.Pointer arrayStart, int length, int initialValue) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(VectorizedHashCodeNode.class));
        try {
            return VectorizedHashCodeNode.vectorizedHashCode(arrayStart, length, initialValue, JavaKind.Char, Stubs.getRuntimeCheckedCPUFeatures(VectorizedHashCodeNode.class));
        } finally {
            region.leave();
        }
    }

    // method: VectorizedHashCodeNode.vectorizedHashCode(Pointer,int,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int vectorizedHashCodeByte(org.graalvm.word.Pointer arrayStart, int length, int initialValue) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(VectorizedHashCodeNode_getMinimumFeatures());
        try {
            return VectorizedHashCodeNode.vectorizedHashCode(arrayStart, length, initialValue, JavaKind.Byte, VectorizedHashCodeNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: VectorizedHashCodeNode.vectorizedHashCode(Pointer,int,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int vectorizedHashCodeByteRTC(org.graalvm.word.Pointer arrayStart, int length, int initialValue) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(VectorizedHashCodeNode.class));
        try {
            return VectorizedHashCodeNode.vectorizedHashCode(arrayStart, length, initialValue, JavaKind.Byte, Stubs.getRuntimeCheckedCPUFeatures(VectorizedHashCodeNode.class));
        } finally {
            region.leave();
        }
    }

    // method: VectorizedHashCodeNode.vectorizedHashCode(Pointer,int,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int vectorizedHashCodeShort(org.graalvm.word.Pointer arrayStart, int length, int initialValue) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(VectorizedHashCodeNode_getMinimumFeatures());
        try {
            return VectorizedHashCodeNode.vectorizedHashCode(arrayStart, length, initialValue, JavaKind.Short, VectorizedHashCodeNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: VectorizedHashCodeNode.vectorizedHashCode(Pointer,int,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int vectorizedHashCodeShortRTC(org.graalvm.word.Pointer arrayStart, int length, int initialValue) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(VectorizedHashCodeNode.class));
        try {
            return VectorizedHashCodeNode.vectorizedHashCode(arrayStart, length, initialValue, JavaKind.Short, Stubs.getRuntimeCheckedCPUFeatures(VectorizedHashCodeNode.class));
        } finally {
            region.leave();
        }
    }

    // method: VectorizedHashCodeNode.vectorizedHashCode(Pointer,int,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int vectorizedHashCodeInt(org.graalvm.word.Pointer arrayStart, int length, int initialValue) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(VectorizedHashCodeNode_getMinimumFeatures());
        try {
            return VectorizedHashCodeNode.vectorizedHashCode(arrayStart, length, initialValue, JavaKind.Int, VectorizedHashCodeNode_getMinimumFeatures());
        } finally {
            region.leave();
        }
    }

    // method: VectorizedHashCodeNode.vectorizedHashCode(Pointer,int,int,JavaKind,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int vectorizedHashCodeIntRTC(org.graalvm.word.Pointer arrayStart, int length, int initialValue) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(VectorizedHashCodeNode.class));
        try {
            return VectorizedHashCodeNode.vectorizedHashCode(arrayStart, length, initialValue, JavaKind.Int, Stubs.getRuntimeCheckedCPUFeatures(VectorizedHashCodeNode.class));
        } finally {
            region.leave();
        }
    }

    // method: VectorizedMismatchNode.vectorizedMismatch(Pointer,Pointer,int,int)
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int vectorizedMismatch(org.graalvm.word.Pointer arrayA, org.graalvm.word.Pointer arrayB, int length, int stride) {
        return VectorizedMismatchNode.vectorizedMismatch(arrayA, arrayB, length, stride);
    }

    // method: VectorizedMismatchNode.vectorizedMismatch(Pointer,Pointer,int,int,EnumSet<?>)
    // runtime-checked CPU features variant, i.e. variant compiled with CPU features not present in the feature set selected by the -march option
    @Uninterruptible(reason = "Must not do a safepoint check.")
    @SubstrateForeignCallTarget(stubCallingConvention = false, fullyUninterruptible = true)
    private static int vectorizedMismatchRTC(org.graalvm.word.Pointer arrayA, org.graalvm.word.Pointer arrayB, int length, int stride) {
        RuntimeCPUFeatureRegion region = RuntimeCPUFeatureRegion.enterSet(Stubs.getRuntimeCheckedCPUFeatures(VectorizedMismatchNode.class));
        try {
            return VectorizedMismatchNode.vectorizedMismatch(arrayA, arrayB, length, stride, Stubs.getRuntimeCheckedCPUFeatures(VectorizedMismatchNode.class));
        } finally {
            region.leave();
        }
    }

}
