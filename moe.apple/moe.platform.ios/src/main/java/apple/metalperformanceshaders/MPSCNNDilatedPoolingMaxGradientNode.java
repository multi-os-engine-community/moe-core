package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.protocol.MPSNNPadding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNDilatedPoolingMaxGradientNode extends MPSCNNPoolingGradientNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNDilatedPoolingMaxGradientNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNDilatedPoolingMaxGradientNode alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("dilationRateX")
    @NUInt
    public native long dilationRateX();

    @Generated
    @Selector("dilationRateY")
    @NUInt
    public native long dilationRateY();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNDilatedPoolingMaxGradientNode init();

    /**
     * make a pooling gradient node
     * 
     * It would be much easier to use [inferencePoolingNode gradientNodeForSourceGradient:] instead.
     * 
     * @param      sourceGradient  The gradient from the downstream gradient filter.
     * @param      sourceImage     The input image to the inference pooling filter
     * @param      gradientState   The gradient state produced by the inference poolin filter
     * @param      kernelWidth     The kernel width of the inference filter
     * @param      kernelHeight    The kernel height of the inference filter
     * @param      strideInPixelsX The X stride from the inference filter
     * @param      strideInPixelsY The Y stride from the inference filter
     */
    @Generated
    @Selector("initWithSourceGradient:sourceImage:gradientState:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:dilationRateX:dilationRateY:")
    public native MPSCNNDilatedPoolingMaxGradientNode initWithSourceGradientSourceImageGradientStateKernelWidthKernelHeightStrideInPixelsXStrideInPixelsYDilationRateXDilationRateY(
            MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNGradientStateNode gradientState,
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long strideInPixelsX, @NUInt long strideInPixelsY,
            @NUInt long dilationRateX, @NUInt long dilationRateY);

    @Generated
    @Selector("initWithSourceGradient:sourceImage:gradientState:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:paddingPolicy:")
    public native MPSCNNDilatedPoolingMaxGradientNode initWithSourceGradientSourceImageGradientStateKernelWidthKernelHeightStrideInPixelsXStrideInPixelsYPaddingPolicy(
            MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNGradientStateNode gradientState,
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long strideInPixelsX, @NUInt long strideInPixelsY,
            @Mapped(ObjCObjectMapper.class) MPSNNPadding paddingPolicy);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * make a pooling gradient node
     * 
     * It would be much easier to use [inferencePoolingNode gradientNodeForSourceGradient:] instead.
     * 
     * @param      sourceGradient  The gradient from the downstream gradient filter.
     * @param      sourceImage     The input image to the inference pooling filter
     * @param      gradientState   The gradient state produced by the inference poolin filter
     * @param      kernelWidth     The kernel width of the inference filter
     * @param      kernelHeight    The kernel height of the inference filter
     * @param      strideInPixelsX The X stride from the inference filter
     * @param      strideInPixelsY The Y stride from the inference filter
     */
    @Generated
    @Selector("nodeWithSourceGradient:sourceImage:gradientState:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:dilationRateX:dilationRateY:")
    public static native MPSCNNDilatedPoolingMaxGradientNode nodeWithSourceGradientSourceImageGradientStateKernelWidthKernelHeightStrideInPixelsXStrideInPixelsYDilationRateXDilationRateY(
            MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNGradientStateNode gradientState,
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long strideInPixelsX, @NUInt long strideInPixelsY,
            @NUInt long dilationRateX, @NUInt long dilationRateY);

    @Generated
    @Selector("nodeWithSourceGradient:sourceImage:gradientState:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:paddingPolicy:")
    public static native MPSCNNDilatedPoolingMaxGradientNode nodeWithSourceGradientSourceImageGradientStateKernelWidthKernelHeightStrideInPixelsXStrideInPixelsYPaddingPolicy(
            MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNGradientStateNode gradientState,
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long strideInPixelsX, @NUInt long strideInPixelsY,
            @Mapped(ObjCObjectMapper.class) MPSNNPadding paddingPolicy);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}