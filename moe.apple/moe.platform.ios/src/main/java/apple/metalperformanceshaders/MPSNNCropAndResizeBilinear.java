package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.struct.MPSRegion;
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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSNNCropAndResizeBilinear
 * [@dependency] This depends on Metal.framework
 * 
 * The MPSNNCropAndResizeBilinear filter resizes the source image  using bilinear interpolation to
 *             a destination whose dimensions are given by resizeWidth and resizeHeight
 * 
 *             The number of output feature channels remains the same as the number of input feature
 *             channels.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNCropAndResizeBilinear extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNCropAndResizeBilinear(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNCropAndResizeBilinear alloc();

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNCropAndResizeBilinear init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNCropAndResizeBilinear initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * See @ref MPSKernel#initWithCoder.
     * 
     * @param      aDecoder    The NSCoder subclass with your serialized MPSNNCropAndResizeBilinear
     * @param      device      The MTLDevice on which to make the MPSNNCropAndResizeBilinear
     * @return     A new MPSNNResizeBilinear object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNCropAndResizeBilinear initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNNCropAndResizeBilinear initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize the crop and resize bilinear filter.
     * 
     * @param     device                   The device the filter will run on.
     * @param     resizeWidth              The destination resize width in pixels
     * @param     resizeHeight             The destination resize height in pixels
     * @param     numberOfRegions          Specifies the number of bounding box i.e. regions to resize
     * @param     regions                  This is a pointer to "numberOfRegions" boxes which specify the locations in the
     *                                     source image to use for each box/region to perform the resize operation.
     * @return    A valid MPSNNCropAndResizeBilinear object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:resizeWidth:resizeHeight:numberOfRegions:regions:")
    public native MPSNNCropAndResizeBilinear initWithDeviceResizeWidthResizeHeightNumberOfRegionsRegions(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long resizeWidth, @NUInt long resizeHeight,
            @NUInt long numberOfRegions,
            @UncertainArgument("Options: reference, array Fallback: reference") MPSRegion regions);

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
     * [@property]   numberOfRegions
     * 
     * the number of bounding box i.e. regions to resize.
     */
    @Generated
    @Selector("numberOfRegions")
    @NUInt
    public native long numberOfRegions();

    /**
     * [@property]   regions
     * 
     * This is a pointer to "numberOfRegions" boxes which specify the locations in the
     *             source image to use for each box/region to perform the resize operation.
     *             The coordinates specified are normalized values.  A normalized region outside the
     *             [0, 1] range is allowed, in which case we use extrapolation_value to extrapolate
     *             the input image values.
     */
    @Generated
    @Selector("regions")
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native MPSRegion regions();

    /**
     * [@property]   resizeHeight
     * 
     * The resize height.
     */
    @Generated
    @Selector("resizeHeight")
    @NUInt
    public native long resizeHeight();

    /**
     * [@property]   resizeWidth
     * 
     * The resize width.
     */
    @Generated
    @Selector("resizeWidth")
    @NUInt
    public native long resizeWidth();

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
}