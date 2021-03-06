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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAudioEnvironmentReverbParameters
 * 
 * Parameters used to control the reverb in AVAudioEnvironmentNode
 * 
 *     Reverberation can be used to simulate the acoustic characteristics of an environment.
 *     AVAudioEnvironmentNode has a built in reverb that describes the space that the listener 
 *     is in.
 * 
 *     The reverb also has a single filter that sits at the end of the chain. This filter is useful 
 *     to shape the overall sound of the reverb. For instance, one of the reverb presets can be 
 *     selected to simulate the general space and then the filter can be used to brighten or darken 
 *     the overall sound.
 * 
 *     A standalone instance of AVAudioEnvironmentReverbParameters cannot be created.
 *     Only an instance vended out by a source object (e.g. AVAudioEnvironmentNode) can be used.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioEnvironmentReverbParameters extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioEnvironmentReverbParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioEnvironmentReverbParameters alloc();

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
     * [@property] enable
     * 
     * Turns on/off the reverb
     * 
     *     Default:    NO
     */
    @Generated
    @Selector("enable")
    public native boolean enable();

    /**
     * [@property] filterParameters
     * 
     * filter that applies to the output of the reverb
     */
    @Generated
    @Selector("filterParameters")
    public native AVAudioUnitEQFilterParameters filterParameters();

    @Generated
    @Selector("init")
    public native AVAudioEnvironmentReverbParameters init();

    /**
     * [@property] level
     * 
     * Controls the master level of the reverb
     * 
     *     Range:      -40 to 40 dB
     *     Default:    0.0
     */
    @Generated
    @Selector("level")
    public native float level();

    /**
     * loadFactoryReverbPreset:
     * 
     * Load one of the reverb's factory presets
     * 
     *     Loading a factory reverb preset changes the sound of the reverb. This works independently
     *     of the filter which follows the reverb in the signal chain.
     * 
     * @param preset
     *     Reverb preset to be set.
     */
    @Generated
    @Selector("loadFactoryReverbPreset:")
    public native void loadFactoryReverbPreset(@NInt long preset);

    /**
     * [@property] enable
     * 
     * Turns on/off the reverb
     * 
     *     Default:    NO
     */
    @Generated
    @Selector("setEnable:")
    public native void setEnable(boolean value);

    /**
     * [@property] level
     * 
     * Controls the master level of the reverb
     * 
     *     Range:      -40 to 40 dB
     *     Default:    0.0
     */
    @Generated
    @Selector("setLevel:")
    public native void setLevel(float value);
}
