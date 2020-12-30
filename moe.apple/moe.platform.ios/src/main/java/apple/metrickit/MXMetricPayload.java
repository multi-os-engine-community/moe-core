package apple.metrickit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
 * @class         MXMetricPayload
 * @abstract      A wrapper class which contains a metric payload and associated properties of that payload.
 * @discussion    MXMetricPayload encapsulates currently supported metric types that can be vended by MetricKit. MXMetric subclasses on MXMetricPayload are nullable. If an MXMetric subclass is nil, it indicates that the data is not available for this payload.
 * @discussion    MXMetricPayload exposes a convenience function, JSONRepresentation, to convert the contents of the payload to a human readable JSON. This should be used in conjunction with other APIs that accept NSData.
 * @discussion    An MXMetricPayload contains data that covers a 24 hour period of application usage. The properties timeStampBegin and timeStampEnd should be used to determine which time range the payload covers.
 * @discussion    It is possible for an MXMetricPayload to cover regions of time where an application was updated, and thus had multiple different app version strings. The property latestApplicationVersion will always reflect the latest appVersion at the time the metric payload was created. Use includesMultipleApplicationVersions to determine if an application changed versions during the time range the payload covers.
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MXMetricPayload extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MXMetricPayload(Pointer peer) {
        super(peer);
    }

    /**
     * @method        DictionaryRepresentation
     * @abstract      Convenience method to return a NSDictionary representation of this payload.
     * @result        An NSDictionary object containing the dictionary representation
     */
    @Generated
    @Selector("DictionaryRepresentation")
    public native NSDictionary<?, ?> DictionaryRepresentation();

    /**
     * @method        JSONRepresentation
     * @abstract      Convenience method to return a JSON representation of this payload.
     * @result        An NSData object containing the JSON representation
     */
    @Generated
    @Selector("JSONRepresentation")
    public native NSData JSONRepresentation();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MXMetricPayload alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * @property      applicationLaunchMetrics
     * @abstract      An object containing launch metrics for this application.
     */
    @Generated
    @Selector("applicationLaunchMetrics")
    public native MXAppLaunchMetric applicationLaunchMetrics();

    /**
     * @property      applicationResponsivenessMetrics
     * @abstract      An object containing hang metrics for this application.
     */
    @Generated
    @Selector("applicationResponsivenessMetrics")
    public native MXAppResponsivenessMetric applicationResponsivenessMetrics();

    /**
     * @property      applicationTimeMetrics
     * @abstract      An object containing running mode metrics for this application.
     */
    @Generated
    @Selector("applicationTimeMetrics")
    public native MXAppRunTimeMetric applicationTimeMetrics();

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

    /**
     * @property      cellularConditionMetrics
     * @abstract      An object containing a cellular condition metrics for this application.
     */
    @Generated
    @Selector("cellularConditionMetrics")
    public native MXCellularConditionMetric cellularConditionMetrics();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * @property      cpuMetrics
     * @abstract      An object containing CPU metrics for this application.
     */
    @Generated
    @Selector("cpuMetrics")
    public native MXCPUMetric cpuMetrics();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * @property      diskIOMetrics
     * @abstract      An object containing disk IO metrics for this application.
     */
    @Generated
    @Selector("diskIOMetrics")
    public native MXDiskIOMetric diskIOMetrics();

    /**
     * @property      displayMetrics
     * @abstract      An object containing display metrics for this application.
     */
    @Generated
    @Selector("displayMetrics")
    public native MXDisplayMetric displayMetrics();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * @property      gpuMetrics
     * @abstract      An object containing GPU metrics for this application.
     */
    @Generated
    @Selector("gpuMetrics")
    public native MXGPUMetric gpuMetrics();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * @property      includesMultipleApplicationVersions
     * @abstract      A bool which indicates whether or not this payload contains data from multiple application versions.
     * @discussion    A value of YES indicates that this payload's data reflects multiple application versions.
     * @discussion    A value of NO indicates that this payload only reflects data from the application version specified by latestApplicationVersion.
     */
    @Generated
    @Selector("includesMultipleApplicationVersions")
    public native boolean includesMultipleApplicationVersions();

    @Generated
    @Selector("init")
    public native MXMetricPayload init();

    @Generated
    @Selector("initWithCoder:")
    public native MXMetricPayload initWithCoder(NSCoder coder);

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
     * @property      latestApplicationVersion
     * @abstract      An NSString representation of the application version from which this payload was generated.
     * @discussion    If the application version was changed during the aggregation of this data, this value will reflect the latest application version at the time of retrieval.
     */
    @Generated
    @Selector("latestApplicationVersion")
    public native String latestApplicationVersion();

    /**
     * @property      locationActivityMetrics
     * @abstract      An object containing location activity metrics for this application.
     */
    @Generated
    @Selector("locationActivityMetrics")
    public native MXLocationActivityMetric locationActivityMetrics();

    /**
     * @property      memoryMetrics
     * @abstract      An object containing memory metrics for this application.
     */
    @Generated
    @Selector("memoryMetrics")
    public native MXMemoryMetric memoryMetrics();

    /**
     * @property      metaData
     * @abstract      An object containing extra metadata for this payload.
     */
    @Generated
    @Selector("metaData")
    public native MXMetaData metaData();

    /**
     * @property      networkTransferMetrics
     * @abstract      An object containing network transfer metrics for this application.
     */
    @Generated
    @Selector("networkTransferMetrics")
    public native MXNetworkTransferMetric networkTransferMetrics();

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

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * @property      signpostMetrics
     * @abstract      An array containing signpost metrics for this application.
     */
    @Generated
    @Selector("signpostMetrics")
    public native NSArray<? extends MXSignpostMetric> signpostMetrics();

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

    /**
     * @property      timeStampBegin
     * @abstract      An NSDate object that indicates the time which the payload was generated.
     */
    @Generated
    @Selector("timeStampBegin")
    public native NSDate timeStampBegin();

    /**
     * @property      timeStampEnd
     * @abstract      An NSDate object that indicates the time which the payload was generated.
     */
    @Generated
    @Selector("timeStampEnd")
    public native NSDate timeStampEnd();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @property      animationMetrics
     * @abstract      An object containing animation metrics for this application.
     */
    @Generated
    @Selector("animationMetrics")
    public native MXAnimationMetric animationMetrics();

    /**
     * @property      applicationExitMetrics
     * @abstract      An object containing exit metrics for this application.
     */
    @Generated
    @Selector("applicationExitMetrics")
    public native MXAppExitMetric applicationExitMetrics();

    /**
     * @method        dictionaryRepresentation
     * @abstract      Convenience method to return a NSDictionary representation of this payload.
     * @result        An NSDictionary object containing the dictionary representation
     */
    @Generated
    @Selector("dictionaryRepresentation")
    public native NSDictionary<?, ?> dictionaryRepresentation();
}