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

package apple.avfoundation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Information about one of potentially multiple data sources associated with a port.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioSessionDataSourceDescription extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioSessionDataSourceDescription(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioSessionDataSourceDescription alloc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * System-assigned ID for the data source.
     */
    @Generated
    @Selector("dataSourceID")
    public native NSNumber dataSourceID();

    /**
     * Human-readable name for the data source.
     */
    @Generated
    @Selector("dataSourceName")
    public native String dataSourceName();

    @Generated
    @Selector("init")
    public native AVAudioSessionDataSourceDescription init();

    /**
     * Describes the general location of a data source. Will be nil for data sources for which the
     * location is not known.
     */
    @Generated
    @Selector("location")
    public native String location();

    /**
     * Describes the orientation of a data source.  Will be nil for data sources for which the
     * orientation is not known.
     */
    @Generated
    @Selector("orientation")
    public native String orientation();

    /**
     * Describes the preferred polar pattern.  Will be nil for data sources that have no selectable
     * patterns or if no preference has been set.
     */
    @Generated
    @Selector("preferredPolarPattern")
    public native String preferredPolarPattern();

    /**
     * Describes the currently selected polar pattern.  Will be nil for data sources that have no
     * selectable patterns.
     */
    @Generated
    @Selector("selectedPolarPattern")
    public native String selectedPolarPattern();

    /**
     * Select the desired polar pattern from the set of available patterns. Setting a nil value
     * will clear the preference.
     * 
     * [@note] If the owning port and data source are part of the active audio route, changing the polar
     * pattern will likely result in a route reconfiguration. If the owning port and data source are
     * not part of the active route, selecting a polar pattern will not result in an immediate route
     * reconfiguration.  Use AVAudioSession's setPreferredInput:error: method to activate the port. Use
     * setPreferredDataSource:error: to active the data source on the port.
     * You must call setPreferredInputOrientation:error: on the AVAudioSession if you chose the
     * AVAudioSessionPolarPatternStereo polar pattern.
     */
    @Generated
    @Selector("setPreferredPolarPattern:error:")
    public native boolean setPreferredPolarPatternError(String pattern,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Array of one or more AVAudioSessionPolarPatterns describing the supported polar patterns for a
     * data source.  Will be nil for data sources that have no selectable patterns.
     */
    @Generated
    @Selector("supportedPolarPatterns")
    public native NSArray<String> supportedPolarPatterns();
}
