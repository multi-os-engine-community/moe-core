/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.foundation;

import apple.NSObject;
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
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMeasurement<_UnitType> extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMeasurement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMeasurement<?> alloc();

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
    public static native <_UnitType> boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Given an NSUnit object, canBeConvertedToUnit: will check for dimensionality i.e. check the unit type (NSUnitAngle, NSUnitLength, NSUnitCustom, etc.) of the NSUnit object.  It will return YES if the unit type of the given unit is the same as the unit type of the unit within the NSMeasurement object and NO if not.
     * Note: This method will return NO if given or called on a dimensionless unit.
     */
    @Generated
    @Selector("canBeConvertedToUnit:")
    public native boolean canBeConvertedToUnit(NSUnit unit);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("doubleValue")
    public native double doubleValue();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native NSMeasurement<?> init();

    @Generated
    @Selector("initWithCoder:")
    public native NSMeasurement<?> initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithDoubleValue:unit:")
    public native NSMeasurement<?> initWithDoubleValueUnit(double doubleValue, NSUnit unit);

    /**
     * Given an NSMeasurement object, these methods will first check for dimensionality i.e. check the unit type (NSUnitAngle, NSUnitLength, NSUnitCustom, etc.) of the unit contained in that object.  If the unit type of the unit in the given NSMeasurement object is not the same as the unit type of the unit within the current NSMeasurement instance (i.e. the units are of differing dimensionalities), these methods will throw an InvalidArgumentException.
     * 
     * @return A new NSMeasurement object with the adjusted value and a unit that is the same type as the current NSMeasurement instance.
     */
    @Generated
    @Selector("measurementByAddingMeasurement:")
    public native NSMeasurement<NSUnit> measurementByAddingMeasurement(NSMeasurement<NSUnit> measurement);

    /**
     * Given an NSUnit object, measurementByConvertingUnit: will first check for dimensionality i.e. check the unit type (NSUnitAngle, NSUnitLength, NSUnitCustom, etc.) of the NSUnit object.  If the unit type of the given unit is not the same as the unit type of the unit within the NSMeasurement object (i.e. the units are of differing dimensionalities), measurementByConvertingToUnit: will throw an InvalidArgumentException.
     * 
     * @return A new NSMeasurement object with the given unit and converted value.
     */
    @Generated
    @Selector("measurementByConvertingToUnit:")
    public native NSMeasurement<?> measurementByConvertingToUnit(NSUnit unit);

    @Generated
    @Selector("measurementBySubtractingMeasurement:")
    public native NSMeasurement<NSUnit> measurementBySubtractingMeasurement(NSMeasurement<NSUnit> measurement);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("unit")
    public native NSUnit unit();
}
