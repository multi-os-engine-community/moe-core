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
import apple.avfoundation.protocol.AVAudioPlayerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioPlayer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioPlayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioPlayer alloc();

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
     * returns average power in decibels for a given channel
     */
    @Generated
    @Selector("averagePowerForChannel:")
    public native float averagePowerForChannel(@NUInt long channelNumber);

    /**
     * Array of AVAudioSessionChannelDescription objects
     */
    @Generated
    @Selector("channelAssignments")
    public native NSArray<? extends AVAudioSessionChannelDescription> channelAssignments();

    /**
     * If the sound is playing, currentTime is the offset into the sound of the current playback position.
     * If the sound is not playing, currentTime is the offset into the sound where playing would start. 
     */
    @Generated
    @Selector("currentTime")
    public native double currentTime();

    /**
     * returns nil if object was not created with a data object
     */
    @Generated
    @Selector("data")
    public native NSData data();

    /**
     * the delegate will be sent messages from the AVAudioPlayerDelegate protocol
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVAudioPlayerDelegate delegate();

    /**
     * returns the current time associated with the output device
     */
    @Generated
    @Selector("deviceCurrentTime")
    public native double deviceCurrentTime();

    /**
     * the duration of the sound.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * You must set enableRate to YES for the rate property to take effect. You must set this before calling prepareToPlay.
     */
    @Generated
    @Selector("enableRate")
    public native boolean enableRate();

    /**
     * returns the format of the audio data
     */
    @Generated
    @Selector("format")
    public native AVAudioFormat format();

    @Generated
    @Selector("init")
    public native AVAudioPlayer init();

    /**
     * all data must be in the form of an audio file understood by CoreAudio
     */
    @Generated
    @Selector("initWithContentsOfURL:error:")
    public native AVAudioPlayer initWithContentsOfURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * The file type hint is a constant defined in AVMediaFormat.h whose value is a UTI for a file format. e.g. AVFileTypeAIFF.
     * Sometimes the type of a file cannot be determined from the data, or it is actually corrupt. The file type hint tells the parser what kind of data to look for so that files which are not self identifying or possibly even corrupt can be successfully parsed.
     */
    @Generated
    @Selector("initWithContentsOfURL:fileTypeHint:error:")
    public native AVAudioPlayer initWithContentsOfURLFileTypeHintError(NSURL url, String utiString,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("initWithData:error:")
    public native AVAudioPlayer initWithDataError(NSData data,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("initWithData:fileTypeHint:error:")
    public native AVAudioPlayer initWithDataFileTypeHintError(NSData data, String utiString,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * turns level metering on or off. default is off.
     */
    @Generated
    @Selector("isMeteringEnabled")
    public native boolean isMeteringEnabled();

    /**
     * turns level metering on or off. default is off.
     */
    @Generated
    @Selector("setMeteringEnabled:")
    public native void setMeteringEnabled(boolean value);

    /**
     * is it playing or not?
     */
    @Generated
    @Selector("isPlaying")
    public native boolean isPlaying();

    @Generated
    @Selector("numberOfChannels")
    @NUInt
    public native long numberOfChannels();

    /**
     * "numberOfLoops" is the number of times that the sound will return to the beginning upon reaching the end.
     * A value of zero means to play the sound just once.
     * A value of one will result in playing the sound twice, and so on..
     * Any negative number will loop indefinitely until stopped.
     */
    @Generated
    @Selector("numberOfLoops")
    @NInt
    public native long numberOfLoops();

    /**
     * set panning. -1.0 is left, 0.0 is center, 1.0 is right.
     */
    @Generated
    @Selector("pan")
    public native float pan();

    /**
     * Pauses playback, but remains ready to play.
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * returns peak power in decibels for a given channel
     */
    @Generated
    @Selector("peakPowerForChannel:")
    public native float peakPowerForChannel(@NUInt long channelNumber);

    /**
     * This method starts the audio hardware synchronously (if not already running), and triggers the sound playback which is streamed asynchronously.
     */
    @Generated
    @Selector("play")
    public native boolean play();

    /**
     * This method starts the audio hardware synchronously (if not already running), and triggers the sound playback which is streamed asynchronously at the specified time in the future.
     * Time is an absolute time based on and greater than deviceCurrentTime. 
     */
    @Generated
    @Selector("playAtTime:")
    public native boolean playAtTime(double time);

    /**
     * Transport control
     * Methods that return BOOL return YES on success and NO on failure.
     * Get ready to play the sound. This happens automatically on play.
     */
    @Generated
    @Selector("prepareToPlay")
    public native boolean prepareToPlay();

    /**
     * See enableRate. The playback rate for the sound. 1.0 is normal, 0.5 is half speed, 2.0 is double speed.
     */
    @Generated
    @Selector("rate")
    public native float rate();

    /**
     * Array of AVAudioSessionChannelDescription objects
     */
    @Generated
    @Selector("setChannelAssignments:")
    public native void setChannelAssignments(NSArray<? extends AVAudioSessionChannelDescription> value);

    /**
     * If the sound is playing, currentTime is the offset into the sound of the current playback position.
     * If the sound is not playing, currentTime is the offset into the sound where playing would start. 
     */
    @Generated
    @Selector("setCurrentTime:")
    public native void setCurrentTime(double value);

    /**
     * the delegate will be sent messages from the AVAudioPlayerDelegate protocol
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) AVAudioPlayerDelegate value);

    /**
     * the delegate will be sent messages from the AVAudioPlayerDelegate protocol
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) AVAudioPlayerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * You must set enableRate to YES for the rate property to take effect. You must set this before calling prepareToPlay.
     */
    @Generated
    @Selector("setEnableRate:")
    public native void setEnableRate(boolean value);

    /**
     * "numberOfLoops" is the number of times that the sound will return to the beginning upon reaching the end.
     * A value of zero means to play the sound just once.
     * A value of one will result in playing the sound twice, and so on..
     * Any negative number will loop indefinitely until stopped.
     */
    @Generated
    @Selector("setNumberOfLoops:")
    public native void setNumberOfLoops(@NInt long value);

    /**
     * set panning. -1.0 is left, 0.0 is center, 1.0 is right.
     */
    @Generated
    @Selector("setPan:")
    public native void setPan(float value);

    /**
     * See enableRate. The playback rate for the sound. 1.0 is normal, 0.5 is half speed, 2.0 is double speed.
     */
    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    /**
     * The volume for the sound. The nominal range is from 0.0 to 1.0.
     */
    @Generated
    @Selector("setVolume:")
    public native void setVolume(float value);

    /**
     * fade to a new volume over a duration
     */
    @Generated
    @Selector("setVolume:fadeDuration:")
    public native void setVolumeFadeDuration(float volume, double duration);

    /**
     * returns a settings dictionary with keys as described in AVAudioSettings.h
     */
    @Generated
    @Selector("settings")
    public native NSDictionary<String, ?> settings();

    /**
     * Synchronously stops playback, no longer ready to play.
     * NOTE: - This will block while releasing the audio hardware that was acquired upon calling play() or prepareToPlay() 
     */
    @Generated
    @Selector("stop")
    public native void stop();

    /**
     * call to refresh meter values
     */
    @Generated
    @Selector("updateMeters")
    public native void updateMeters();

    /**
     * returns nil if object was not created with a URL
     */
    @Generated
    @Selector("url")
    public native NSURL url();

    /**
     * The volume for the sound. The nominal range is from 0.0 to 1.0.
     */
    @Generated
    @Selector("volume")
    public native float volume();
}
