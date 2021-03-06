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
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

/**
 * AVSpeechUtterance
 * 
 * AVSpeechUtterance is the atom of speaking a string or pausing the synthesizer.
 * 
 * To start speaking, specify the AVSpeechSynthesisVoice and the string to be spoken, then optionally change the rate, pitch or volume if desired.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSpeechUtterance extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSpeechUtterance(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSpeechUtterance alloc();

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
    @Selector("speechUtteranceWithAttributedString:")
    public static native AVSpeechUtterance speechUtteranceWithAttributedString(NSAttributedString string);

    @Generated
    @Selector("speechUtteranceWithString:")
    public static native AVSpeechUtterance speechUtteranceWithString(String string);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("attributedSpeechString")
    public native NSAttributedString attributedSpeechString();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native AVSpeechUtterance init();

    @Generated
    @Selector("initWithAttributedString:")
    public native AVSpeechUtterance initWithAttributedString(NSAttributedString string);

    @Generated
    @Selector("initWithCoder:")
    public native AVSpeechUtterance initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithString:")
    public native AVSpeechUtterance initWithString(String string);

    /**
     * [0.5 - 2] Default = 1
     */
    @Generated
    @Selector("pitchMultiplier")
    public native float pitchMultiplier();

    /**
     * Default is 0.0
     */
    @Generated
    @Selector("postUtteranceDelay")
    public native double postUtteranceDelay();

    /**
     * Default is 0.0
     */
    @Generated
    @Selector("preUtteranceDelay")
    public native double preUtteranceDelay();

    /**
     * Values are pinned between AVSpeechUtteranceMinimumSpeechRate and AVSpeechUtteranceMaximumSpeechRate.
     */
    @Generated
    @Selector("rate")
    public native float rate();

    /**
     * [0.5 - 2] Default = 1
     */
    @Generated
    @Selector("setPitchMultiplier:")
    public native void setPitchMultiplier(float value);

    /**
     * Default is 0.0
     */
    @Generated
    @Selector("setPostUtteranceDelay:")
    public native void setPostUtteranceDelay(double value);

    /**
     * Default is 0.0
     */
    @Generated
    @Selector("setPreUtteranceDelay:")
    public native void setPreUtteranceDelay(double value);

    /**
     * Values are pinned between AVSpeechUtteranceMinimumSpeechRate and AVSpeechUtteranceMaximumSpeechRate.
     */
    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    /**
     * If no voice is specified, the system's default will be used.
     */
    @Generated
    @Selector("setVoice:")
    public native void setVoice(AVSpeechSynthesisVoice value);

    /**
     * [0-1] Default = 1
     */
    @Generated
    @Selector("setVolume:")
    public native void setVolume(float value);

    @Generated
    @Selector("speechString")
    public native String speechString();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * If no voice is specified, the system's default will be used.
     */
    @Generated
    @Selector("voice")
    public native AVSpeechSynthesisVoice voice();

    /**
     * [0-1] Default = 1
     */
    @Generated
    @Selector("volume")
    public native float volume();

    /**
     * If an assistive technology is on, like VoiceOver, the user's selected voice, rate and other settings will be used for this speech utterance instead of the default values.
     * If no assistive technologies are on, then the values of the properties on AVSpeechUtterance will be used.
     * Note that querying the properties will not refect the user's settings. 
     */
    @Generated
    @Selector("prefersAssistiveTechnologySettings")
    public native boolean prefersAssistiveTechnologySettings();

    /**
     * If an assistive technology is on, like VoiceOver, the user's selected voice, rate and other settings will be used for this speech utterance instead of the default values.
     * If no assistive technologies are on, then the values of the properties on AVSpeechUtterance will be used.
     * Note that querying the properties will not refect the user's settings. 
     */
    @Generated
    @Selector("setPrefersAssistiveTechnologySettings:")
    public native void setPrefersAssistiveTechnologySettings(boolean value);
}
