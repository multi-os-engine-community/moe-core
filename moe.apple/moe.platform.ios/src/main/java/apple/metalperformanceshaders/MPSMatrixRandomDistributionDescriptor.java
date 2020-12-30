package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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

/**
 * @class      MPSMatrixRandomDistributionDescriptor
 * @dependency This depends on Metal.framework
 * @discussion Decribes properties of a distribution of random values.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixRandomDistributionDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixRandomDistributionDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixRandomDistributionDescriptor alloc();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * @abstract  Make a descriptor for a default distribution.
     * @return    A valid MPSMatrixRandomDistribution object or nil, if failure.
     */
    @Generated
    @Selector("defaultDistributionDescriptor")
    public static native MPSMatrixRandomDistributionDescriptor defaultDistributionDescriptor();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * @property   distributionType
     * @abstract   The type of distribution.
     */
    @Generated
    @Selector("distributionType")
    @NUInt
    public native long distributionType();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSMatrixRandomDistributionDescriptor init();

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

    /**
     * @property   maximum
     * @abstract   For distributions of values bounded above, this value describes the maximum.
     */
    @Generated
    @Selector("maximum")
    public native float maximum();

    /**
     * @property   mean
     * @abstract   The value to use for distributions described by their mean.
     */
    @Generated
    @Selector("mean")
    public native float mean();

    /**
     * @property   minimum
     * @abstract   For distributions of values bounded below, this value describes the minimum.
     */
    @Generated
    @Selector("minimum")
    public native float minimum();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * @property   distributionType
     * @abstract   The type of distribution.
     */
    @Generated
    @Selector("setDistributionType:")
    public native void setDistributionType(@NUInt long value);

    /**
     * @property   maximum
     * @abstract   For distributions of values bounded above, this value describes the maximum.
     */
    @Generated
    @Selector("setMaximum:")
    public native void setMaximum(float value);

    /**
     * @property   mean
     * @abstract   The value to use for distributions described by their mean.
     */
    @Generated
    @Selector("setMean:")
    public native void setMean(float value);

    /**
     * @property   minimum
     * @abstract   For distributions of values bounded below, this value describes the minimum.
     */
    @Generated
    @Selector("setMinimum:")
    public native void setMinimum(float value);

    /**
     * @property   standardDeviation
     * @abstract   The value to use for distributions described by their standardDeviation.
     */
    @Generated
    @Selector("setStandardDeviation:")
    public native void setStandardDeviation(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * @property   standardDeviation
     * @abstract   The value to use for distributions described by their standardDeviation.
     */
    @Generated
    @Selector("standardDeviation")
    public native float standardDeviation();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * @abstract  Make a descriptor for a uniform distribution of floating point values in
     *             the range [minimum, maximum).
     * @param     minimum  The lower bound of the range.
     * @param     maximum  The upper bound of the range.
     * @return    A valid MPSMatrixRandomDistribution object or nil, if failure.
     */
    @Generated
    @Selector("uniformDistributionDescriptorWithMinimum:maximum:")
    public static native MPSMatrixRandomDistributionDescriptor uniformDistributionDescriptorWithMinimumMaximum(
            float minimum, float maximum);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @abstract Make a descriptor for a normal distribution of floating point values.
     * @param    mean    The mean of the distribution
     * @param    standardDeviation   The standard deviation of the distribution.
     * 
     * @return   A valid MPSMatrixRandomDistribution object or nil if failure.
     */
    @Generated
    @Selector("normalDistributionDescriptorWithMean:standardDeviation:")
    public static native MPSMatrixRandomDistributionDescriptor normalDistributionDescriptorWithMeanStandardDeviation(
            float mean, float standardDeviation);

    /**
     * @abstract Make a descriptor for a truncated normal distribution of floating point values.
     * @param    mean    The mean of the distribution
     * @param    standardDeviation   The standard deviation of the distribution.
     * @param    minimum The lower bound of the distribution
     * @param    maximum The upper bound of the distribution
     * 
     * @return   A valid MPSMatrixRandomDistribution object or nil if failure.
     */
    @Generated
    @Selector("normalDistributionDescriptorWithMean:standardDeviation:minimum:maximum:")
    public static native MPSMatrixRandomDistributionDescriptor normalDistributionDescriptorWithMeanStandardDeviationMinimumMaximum(
            float mean, float standardDeviation, float minimum, float maximum);
}