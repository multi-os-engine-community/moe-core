package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSDateInterval;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * HKDiscreteQuantitySample
 * 
 * An HKQuantitySample subclass representing a quantity measurement with
 *                discrete aggregation style.
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKDiscreteQuantitySample extends HKQuantitySample {
    static {
        NatJ.register();
    }

    @Generated
    protected HKDiscreteQuantitySample(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKDiscreteQuantitySample alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property]      averageQuantity
     * 
     * The average of the receiver's quantities
     */
    @Generated
    @Selector("averageQuantity")
    public native HKQuantity averageQuantity();

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
    public native HKDiscreteQuantitySample init();

    @Generated
    @Selector("initWithCoder:")
    public native HKDiscreteQuantitySample initWithCoder(NSCoder coder);

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
     * [@property]      maximumQuantity
     * 
     * The maximum of the receiver's quantities
     */
    @Generated
    @Selector("maximumQuantity")
    public native HKQuantity maximumQuantity();

    /**
     * [@property]      minimumQuantity
     * 
     * The minimum of the receiver's quantities
     */
    @Generated
    @Selector("minimumQuantity")
    public native HKQuantity minimumQuantity();

    /**
     * [@property]      mostRecentQuantity
     * 
     * The receiver's quantity with most recent date interval
     */
    @Generated
    @Selector("mostRecentQuantity")
    public native HKQuantity mostRecentQuantity();

    /**
     * [@property]      mostRecentQuantityDateInterval
     * 
     * The date interval for the receiver's most recent quantity
     */
    @Generated
    @Selector("mostRecentQuantityDateInterval")
    public native NSDateInterval mostRecentQuantityDateInterval();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("quantitySampleWithType:quantity:startDate:endDate:")
    public static native HKDiscreteQuantitySample quantitySampleWithTypeQuantityStartDateEndDate(
            HKQuantityType quantityType, HKQuantity quantity, NSDate startDate, NSDate endDate);

    @Generated
    @Selector("quantitySampleWithType:quantity:startDate:endDate:device:metadata:")
    public static native HKDiscreteQuantitySample quantitySampleWithTypeQuantityStartDateEndDateDeviceMetadata(
            HKQuantityType quantityType, HKQuantity quantity, NSDate startDate, NSDate endDate, HKDevice device,
            NSDictionary<String, ?> metadata);

    @Generated
    @Selector("quantitySampleWithType:quantity:startDate:endDate:metadata:")
    public static native HKDiscreteQuantitySample quantitySampleWithTypeQuantityStartDateEndDateMetadata(
            HKQuantityType quantityType, HKQuantity quantity, NSDate startDate, NSDate endDate,
            NSDictionary<String, ?> metadata);

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