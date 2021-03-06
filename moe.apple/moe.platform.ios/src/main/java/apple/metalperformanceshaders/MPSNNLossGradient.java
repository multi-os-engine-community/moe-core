package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSNNLossGradient
 * [@dependency] This depends on Metal.framework.
 * 
 * The MPSNNLossGradient filter specifies the gradient filter for @ref MPSNNForwardLoss.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNLossGradient extends MPSCNNBinaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNLossGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNLossGradient alloc();

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

    /**
     * [@property]   computeLabelGradients
     * 
     * The computeLabelGradients property is used to control whether the loss gradient
     *             filter computes gradients for the primary (predictions) or secondary (labels) source image from the forward pass.
     *             Default: NO.
     */
    @Generated
    @Selector("computeLabelGradients")
    public native boolean computeLabelGradients();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("delta")
    public native float delta();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("epsilon")
    public native float epsilon();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNLossGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNLossGradient initWithCoder(NSCoder aDecoder);

    /**
     * <NSSecureCoding> support
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNLossGradient initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNNLossGradient initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize the loss gradient filter with a loss descriptor.
     * 
     * @param      device                   The device the filter will run on.
     * @param      lossDescriptor           The loss descriptor.
     * @return     A valid MPSNNLossGradient object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:lossDescriptor:")
    public native MPSNNLossGradient initWithDeviceLossDescriptor(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MPSCNNLossDescriptor lossDescriptor);

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
    @Selector("labelSmoothing")
    public native float labelSmoothing();

    /**
     * See MPSCNNLossDescriptor for information about the following properties.
     */
    @Generated
    @Selector("lossType")
    public native int lossType();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("numberOfClasses")
    @NUInt
    public native long numberOfClasses();

    @Generated
    @Selector("reductionType")
    public native int reductionType();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   computeLabelGradients
     * 
     * The computeLabelGradients property is used to control whether the loss gradient
     *             filter computes gradients for the primary (predictions) or secondary (labels) source image from the forward pass.
     *             Default: NO.
     */
    @Generated
    @Selector("setComputeLabelGradients:")
    public native void setComputeLabelGradients(boolean value);

    @Generated
    @Selector("setDelta:")
    public native void setDelta(float value);

    @Generated
    @Selector("setEpsilon:")
    public native void setEpsilon(float value);

    @Generated
    @Selector("setLabelSmoothing:")
    public native void setLabelSmoothing(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("setWeight:")
    public native void setWeight(float value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("weight")
    public native float weight();

    @Generated
    @Selector("reduceAcrossBatch")
    public native boolean reduceAcrossBatch();
}