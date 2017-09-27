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
import apple.coremedia.opaque.CMFormatDescriptionRef;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMVideoDimensions;
import apple.foundation.NSArray;
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
import org.moe.natj.general.ann.NFloat;
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
public class AVCaptureDeviceFormat extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureDeviceFormat(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureDeviceFormat alloc();

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
    @Selector("autoFocusSystem")
    @NInt
    public native long autoFocusSystem();

    @Generated
    @Selector("formatDescription")
    public native CMFormatDescriptionRef formatDescription();

    @Generated
    @Selector("highResolutionStillImageDimensions")
    @ByValue
    public native CMVideoDimensions highResolutionStillImageDimensions();

    @Generated
    @Selector("init")
    public native AVCaptureDeviceFormat init();

    @Generated
    @Selector("isVideoBinned")
    public native boolean isVideoBinned();

    @Generated
    @Selector("isVideoHDRSupported")
    public native boolean isVideoHDRSupported();

    @Generated
    @Selector("isVideoStabilizationModeSupported:")
    public native boolean isVideoStabilizationModeSupported(@NInt long videoStabilizationMode);

    @Generated
    @Deprecated
    @Selector("isVideoStabilizationSupported")
    public native boolean isVideoStabilizationSupported();

    @Generated
    @Selector("maxExposureDuration")
    @ByValue
    public native CMTime maxExposureDuration();

    @Generated
    @Selector("maxISO")
    public native float maxISO();

    @Generated
    @Selector("mediaType")
    public native String mediaType();

    @Generated
    @Selector("minExposureDuration")
    @ByValue
    public native CMTime minExposureDuration();

    @Generated
    @Selector("minISO")
    public native float minISO();

    @Generated
    @Selector("supportedColorSpaces")
    public native NSArray<? extends NSNumber> supportedColorSpaces();

    @Generated
    @Selector("videoFieldOfView")
    public native float videoFieldOfView();

    @Generated
    @Selector("videoMaxZoomFactor")
    @NFloat
    public native double videoMaxZoomFactor();

    @Generated
    @Selector("videoSupportedFrameRateRanges")
    public native NSArray<? extends AVFrameRateRange> videoSupportedFrameRateRanges();

    @Generated
    @Selector("videoZoomFactorUpscaleThreshold")
    @NFloat
    public native double videoZoomFactorUpscaleThreshold();

    @Generated
    @Selector("supportedDepthDataFormats")
    public native NSArray<? extends AVCaptureDeviceFormat> supportedDepthDataFormats();

    @Generated
    @Selector("unsupportedCaptureOutputClasses")
    public native NSArray<? extends Class> unsupportedCaptureOutputClasses();

    @Generated
    @Selector("videoMaxZoomFactorForDepthDataDelivery")
    @NFloat
    public native double videoMaxZoomFactorForDepthDataDelivery();

    @Generated
    @Selector("videoMinZoomFactorForDepthDataDelivery")
    @NFloat
    public native double videoMinZoomFactorForDepthDataDelivery();
}
