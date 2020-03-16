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
import apple.avfoundation.protocol.AVCaptureVideoDataOutputSampleBufferDelegate;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureVideoDataOutput extends AVCaptureOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureVideoDataOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureVideoDataOutput alloc();

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

    @Generated
    @Selector("alwaysDiscardsLateVideoFrames")
    public native boolean alwaysDiscardsLateVideoFrames();

    @Generated
    @Selector("availableVideoCVPixelFormatTypes")
    public native NSArray<? extends NSNumber> availableVideoCVPixelFormatTypes();

    @Generated
    @Selector("availableVideoCodecTypes")
    public native NSArray<String> availableVideoCodecTypes();

    @Generated
    @Selector("init")
    public native AVCaptureVideoDataOutput init();

    @Generated
    @Deprecated
    @Selector("minFrameDuration")
    @ByValue
    public native CMTime minFrameDuration();

    @Generated
    @Selector("recommendedVideoSettingsForAssetWriterWithOutputFileType:")
    public native NSDictionary<String, ?> recommendedVideoSettingsForAssetWriterWithOutputFileType(
            String outputFileType);

    @Generated
    @Selector("sampleBufferCallbackQueue")
    public native NSObject sampleBufferCallbackQueue();

    @Generated
    @Selector("sampleBufferDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVCaptureVideoDataOutputSampleBufferDelegate sampleBufferDelegate();

    @Generated
    @Selector("setAlwaysDiscardsLateVideoFrames:")
    public native void setAlwaysDiscardsLateVideoFrames(boolean value);

    @Generated
    @Deprecated
    @Selector("setMinFrameDuration:")
    public native void setMinFrameDuration(@ByValue CMTime value);

    @Generated
    @Selector("setSampleBufferDelegate:queue:")
    public native void setSampleBufferDelegateQueue(
            @Mapped(ObjCObjectMapper.class) AVCaptureVideoDataOutputSampleBufferDelegate sampleBufferDelegate,
            NSObject sampleBufferCallbackQueue);

    @Generated
    @Selector("setVideoSettings:")
    public native void setVideoSettings(NSDictionary<String, ?> value);

    @Generated
    @Selector("videoSettings")
    public native NSDictionary<String, ?> videoSettings();

    @Generated
    @Selector("availableVideoCodecTypesForAssetWriterWithOutputFileType:")
    public native NSArray<String> availableVideoCodecTypesForAssetWriterWithOutputFileType(String outputFileType);

    @Generated
    @Selector("recommendedVideoSettingsForVideoCodecType:assetWriterOutputFileType:")
    public native NSDictionary<?, ?> recommendedVideoSettingsForVideoCodecTypeAssetWriterOutputFileType(
            String videoCodecType, String outputFileType);

    @Generated
    @Selector("automaticallyConfiguresOutputBufferDimensions")
    public native boolean automaticallyConfiguresOutputBufferDimensions();

    @Generated
    @Selector("deliversPreviewSizedOutputBuffers")
    public native boolean deliversPreviewSizedOutputBuffers();

    @Generated
    @Selector("setAutomaticallyConfiguresOutputBufferDimensions:")
    public native void setAutomaticallyConfiguresOutputBufferDimensions(boolean value);

    @Generated
    @Selector("setDeliversPreviewSizedOutputBuffers:")
    public native void setDeliversPreviewSizedOutputBuffers(boolean value);
}
