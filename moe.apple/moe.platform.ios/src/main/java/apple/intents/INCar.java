package apple.intents;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMeasurement;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUnitPower;
import apple.foundation.protocol.NSCopying;
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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INCar extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected INCar(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INCar alloc();

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

    /**
     * An identifier for the vehicles. Use this same value as the carIdentifier property of INGetCarPowerLevelStatusResponse. Do not use the VIN (or the equivalent code) as the identifier.
     */
    @Generated
    @Selector("carIdentifier")
    public native String carIdentifier();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Color of the vehicle.
     */
    @Generated
    @Selector("color")
    public native CGColorRef color();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * A user-defined display name for the vehicle that is expected to be set in the OEM app.
     */
    @Generated
    @Selector("displayName")
    public native String displayName();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * A data structure containing the bluetooth identifier and the iAP 2 identifier of the head unit of the vehicle.
     */
    @Generated
    @Selector("headUnit")
    public native INCarHeadUnit headUnit();

    @Generated
    @Selector("init")
    public native INCar init();

    /**
     * Instantiates an INCar object.
     */
    @Generated
    @Selector("initWithCarIdentifier:displayName:year:make:model:color:headUnit:supportedChargingConnectors:")
    public native INCar initWithCarIdentifierDisplayNameYearMakeModelColorHeadUnitSupportedChargingConnectors(
            String carIdentifier, String displayName, String year, String make, String model, CGColorRef color,
            INCarHeadUnit headUnit, NSArray<String> supportedChargingConnectors);

    @Generated
    @Selector("initWithCoder:")
    public native INCar initWithCoder(NSCoder coder);

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
     * Make of the vehicle. Should be set by the OEM app. This is later used by Maps to be shown to the user.
     */
    @Generated
    @Selector("make")
    public native String make();

    /**
     * Use this method to read the maximum power set for each charging connector type.
     */
    @Generated
    @Selector("maximumPowerForChargingConnectorType:")
    public native NSMeasurement<NSUnitPower> maximumPowerForChargingConnectorType(String chargingConnectorType);

    /**
     * Model name of the vehicle. Should be set by the OEM app. This is later used by Maps to be shown to the user.
     */
    @Generated
    @Selector("model")
    public native String model();

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
     * Use this method to set the maximum supported power for each charging connector type a vehicle supports. This function can be called multiple times for different connector types.
     */
    @Generated
    @Selector("setMaximumPower:forChargingConnectorType:")
    public native void setMaximumPowerForChargingConnectorType(NSMeasurement<NSUnitPower> power,
            String chargingConnectorType);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * An array containing the supported charging connectors of a vehicle
     */
    @Generated
    @Selector("supportedChargingConnectors")
    public native NSArray<String> supportedChargingConnectors();

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

    /**
     * Manufacturing year of the vehicle.
     */
    @Generated
    @Selector("year")
    public native String year();
}