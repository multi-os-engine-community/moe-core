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
 * AVPlayerItemTrack
 * 
 * 	An AVPlayerItemTrack carries a reference to an AVAssetTrack as well as presentation settings for that track.
 * 
 * 	Note that inspection of assets tracks is provided by AVAssetTrack.
 * 	This class is intended to represent presentation state for a track of an asset that's played by an AVPlayer and AVPlayerItem.
 * 
 * 	To ensure safe access to AVPlayerItemTrack's nonatomic properties while dynamic changes in playback state may be reported,
 * 	clients must serialize their access with the associated AVPlayer's notification queue. In the common case, such serialization
 * 	is naturally achieved by invoking AVPlayerItemTrack's various methods on the main thread or queue.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerItemTrack extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerItemTrack(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItemTrack alloc();

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
     * [@property]		assetTrack
     * 
     * Indicates the AVAssetTrack for which the AVPlayerItemTrack represents presentation state.
     * 
     * This property is not observable.
     * Clients must serialize their access to the resulting AVAssetTrack and related objects on the associated AVPlayer's
     * notification queue.  By default, this queue is the main queue.
     */
    @Generated
    @Selector("assetTrack")
    public native AVAssetTrack assetTrack();

    /**
     * [@property]		currentVideoFrameRate
     * 
     * If the media type of the assetTrack is AVMediaTypeVideo, indicates the current frame rate of the track as it plays, in units of frames per second. If the item is not playing, or if the media type of the track is not video, the value of this property is 0.
     * 
     * This property is not observable.
     */
    @Generated
    @Selector("currentVideoFrameRate")
    public native float currentVideoFrameRate();

    @Generated
    @Selector("init")
    public native AVPlayerItemTrack init();

    /**
     * [@property]		enabled
     * 
     * Indicates whether the track is enabled for presentation during playback.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * [@property]		enabled
     * 
     * Indicates whether the track is enabled for presentation during playback.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);
}
