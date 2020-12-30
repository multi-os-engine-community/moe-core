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

package apple.scenekit;

import apple.NSObject;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.modelio.MDLCamera;
import apple.quartzcore.CAAnimation;
import apple.scenekit.protocol.SCNAnimatable;
import apple.scenekit.protocol.SCNAnimation;
import apple.scenekit.protocol.SCNTechniqueSupport;
import apple.scenekit.struct.SCNMatrix4;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class SCNCamera
 * @abstract SCNCamera represents a camera that can be attached to a SCNNode. 
 * @discussion A node with a camera can be used as a point of view to visualize a 3D scene.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNCamera extends NSObject implements SCNAnimatable, SCNTechniqueSupport, NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNCamera(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNCamera alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * @method camera
     * @abstract Creates and returns a camera instance.
     */
    @Generated
    @Selector("camera")
    public static native SCNCamera camera();

    @Generated
    @Selector("cameraWithMDLCamera:")
    public static native SCNCamera cameraWithMDLCamera(MDLCamera mdlCamera);

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
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(@Mapped(ObjCObjectMapper.class) SCNAnimation animation, String key);

    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    /**
     * @property aperture
     * @abstract Determines the receiver's aperture. Animatable.
     * @discussion Defaults to 1/8.0.
     */
    @Generated
    @Selector("aperture")
    @NFloat
    public native double aperture();

    /**
     * @property automaticallyAdjustsZRange
     * @abstract Determines whether the receiver automatically adjusts the zFar value. Defaults to NO.
     * @discussion When set to YES, the near and far planes are automatically set to fit the bounding box of the entire scene at render time. 
     */
    @Generated
    @Selector("automaticallyAdjustsZRange")
    public native boolean automaticallyAdjustsZRange();

    /**
     * @property averageGray
     * @abstract Determines the average gray level desired in the final image. Defaults to 0.18.
     */
    @Generated
    @Selector("averageGray")
    @NFloat
    public native double averageGray();

    /**
     * @property bloomBlurRadius
     * @abstract Determines the radius of the bloom effect in points. Animatable. Defaults to 4.
     */
    @Generated
    @Selector("bloomBlurRadius")
    @NFloat
    public native double bloomBlurRadius();

    /**
     * @property bloomIntensity
     * @abstract Determines the intensity of the bloom effect. Animatable. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("bloomIntensity")
    @NFloat
    public native double bloomIntensity();

    /**
     * @property bloomThreshold
     * @abstract Determines the luminance threshold for the bloom effect. Animatable. Defaults to 1.
     */
    @Generated
    @Selector("bloomThreshold")
    @NFloat
    public native double bloomThreshold();

    /**
     * @property categoryBitMask
     * @abstract Determines the node categories that are visible from the receiver. Defaults to all bits set.
     */
    @Generated
    @Selector("categoryBitMask")
    @NUInt
    public native long categoryBitMask();

    /**
     * @property colorFringeIntensity
     * @abstract Controls the intensity of the color shift effect. Defaults to 1.
     */
    @Generated
    @Selector("colorFringeIntensity")
    @NFloat
    public native double colorFringeIntensity();

    /**
     * @property colorFringeStrength
     * @abstract Controls the strength of the color shift effect. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("colorFringeStrength")
    @NFloat
    public native double colorFringeStrength();

    /**
     * @property colorGrading
     * @abstract Specifies a lookup texture to apply color grading. The contents must a 2D image representing `n` slices of a unit color cube texture, arranged in an horizontal row of `n` images. For instance, a color cube of dimension 16x16x16 should be provided as an image of size 256x16.
     */
    @Generated
    @Selector("colorGrading")
    public native SCNMaterialProperty colorGrading();

    /**
     * @property contrast
     * @abstract Controls the overall contrast of the scene. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("contrast")
    @NFloat
    public native double contrast();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * @property exposureAdaptationBrighteningSpeedFactor
     * @abstract Determines the exposure adaptation speed when going from bright areas to dark areas. Defaults to 0.4.
     */
    @Generated
    @Selector("exposureAdaptationBrighteningSpeedFactor")
    @NFloat
    public native double exposureAdaptationBrighteningSpeedFactor();

    /**
     * @property exposureAdaptationBrighteningSpeedFactor
     * @abstract Determines the exposure adaptation speed when going from dark areas to bright areas. Defaults to 0.6.
     */
    @Generated
    @Selector("exposureAdaptationDarkeningSpeedFactor")
    @NFloat
    public native double exposureAdaptationDarkeningSpeedFactor();

    /**
     * @property exposureOffset
     * @abstract Determines the logarithmic exposure biasing, in EV. Defaults to 0.
     */
    @Generated
    @Selector("exposureOffset")
    @NFloat
    public native double exposureOffset();

    /**
     * @property focalBlurRadius
     * @abstract Determines the receiver's focal radius. Animatable.
     * @discussion Determines the maximum amount of blur for objects out of focus. Defaults to 0.
     */
    @Generated
    @Selector("focalBlurRadius")
    @NFloat
    public native double focalBlurRadius();

    /**
     * @property focalDistance
     * @abstract Determines the receiver's focal distance. Animatable.
     * @discussion When non zero, the focal distance determines how the camera focuses the objects in the 3d scene. Defaults to 10.0 prior to macOS 10.13, iOS 11, tvOS 11 and watchOS 4. Defaults to 2.5 otherwise.
     */
    @Generated
    @Selector("focalDistance")
    @NFloat
    public native double focalDistance();

    /**
     * @property focalSize
     * @abstract Determines the receiver's focal size. Animatable.
     * @discussion Determines the size of the area around focalDistance where the objects are in focus. Defaults to 0.
     */
    @Generated
    @Selector("focalSize")
    @NFloat
    public native double focalSize();

    @Generated
    @Selector("init")
    public native SCNCamera init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNCamera initWithCoder(NSCoder coder);

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    /**
     * @property maximumExposure
     * @abstract Determines the maximum exposure offset of the adaptation, in EV. Defaults to -15.
     */
    @Generated
    @Selector("maximumExposure")
    @NFloat
    public native double maximumExposure();

    /**
     * @property minimumExposure
     * @abstract Determines the minimum exposure offset of the adaptation, in EV. Defaults to -15.
     */
    @Generated
    @Selector("minimumExposure")
    @NFloat
    public native double minimumExposure();

    /**
     * @property motionBlurIntensity
     * @abstract Determines the intensity of the motion blur. Animatable. Defaults to 0.
     * @discussion An intensity of zero means no motion blur. The intensity should not exceeed 1.
     */
    @Generated
    @Selector("motionBlurIntensity")
    @NFloat
    public native double motionBlurIntensity();

    /**
     * @property name
     * @abstract Determines the name of the receiver.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * @property orthographicScale
     * @abstract Determines the receiver's orthographic scale value. Animatable. Defaults to 1.
     * @discussion This setting determines the size of the camera's visible area. This is only enabled when usesOrthographicProjection is set to YES.
     */
    @Generated
    @Selector("orthographicScale")
    public native double orthographicScale();

    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(String key);

    /**
     * @property projectionTransform
     * @abstract Determines the projection transform used by the camera to project the world onscreen. 
     */
    @Generated
    @Selector("projectionTransform")
    @ByValue
    public native SCNMatrix4 projectionTransform();

    @Generated
    @Selector("removeAllAnimations")
    public native void removeAllAnimations();

    @Generated
    @Selector("removeAnimationForKey:")
    public native void removeAnimationForKey(String key);

    @Generated
    @Selector("removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimationForKeyFadeOutDuration(String key, @NFloat double duration);

    @Generated
    @Selector("resumeAnimationForKey:")
    public native void resumeAnimationForKey(String key);

    /**
     * @property saturation
     * @abstract Controls the overall saturation of the scene. Defaults to 1 (no effect).
     */
    @Generated
    @Selector("saturation")
    @NFloat
    public native double saturation();

    /**
     * @property aperture
     * @abstract Determines the receiver's aperture. Animatable.
     * @discussion Defaults to 1/8.0.
     */
    @Generated
    @Selector("setAperture:")
    public native void setAperture(@NFloat double value);

    /**
     * @property automaticallyAdjustsZRange
     * @abstract Determines whether the receiver automatically adjusts the zFar value. Defaults to NO.
     * @discussion When set to YES, the near and far planes are automatically set to fit the bounding box of the entire scene at render time. 
     */
    @Generated
    @Selector("setAutomaticallyAdjustsZRange:")
    public native void setAutomaticallyAdjustsZRange(boolean value);

    /**
     * @property averageGray
     * @abstract Determines the average gray level desired in the final image. Defaults to 0.18.
     */
    @Generated
    @Selector("setAverageGray:")
    public native void setAverageGray(@NFloat double value);

    /**
     * @property bloomBlurRadius
     * @abstract Determines the radius of the bloom effect in points. Animatable. Defaults to 4.
     */
    @Generated
    @Selector("setBloomBlurRadius:")
    public native void setBloomBlurRadius(@NFloat double value);

    /**
     * @property bloomIntensity
     * @abstract Determines the intensity of the bloom effect. Animatable. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("setBloomIntensity:")
    public native void setBloomIntensity(@NFloat double value);

    /**
     * @property bloomThreshold
     * @abstract Determines the luminance threshold for the bloom effect. Animatable. Defaults to 1.
     */
    @Generated
    @Selector("setBloomThreshold:")
    public native void setBloomThreshold(@NFloat double value);

    /**
     * @property categoryBitMask
     * @abstract Determines the node categories that are visible from the receiver. Defaults to all bits set.
     */
    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(@NUInt long value);

    /**
     * @property colorFringeIntensity
     * @abstract Controls the intensity of the color shift effect. Defaults to 1.
     */
    @Generated
    @Selector("setColorFringeIntensity:")
    public native void setColorFringeIntensity(@NFloat double value);

    /**
     * @property colorFringeStrength
     * @abstract Controls the strength of the color shift effect. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("setColorFringeStrength:")
    public native void setColorFringeStrength(@NFloat double value);

    /**
     * @property contrast
     * @abstract Controls the overall contrast of the scene. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("setContrast:")
    public native void setContrast(@NFloat double value);

    /**
     * @property exposureAdaptationBrighteningSpeedFactor
     * @abstract Determines the exposure adaptation speed when going from bright areas to dark areas. Defaults to 0.4.
     */
    @Generated
    @Selector("setExposureAdaptationBrighteningSpeedFactor:")
    public native void setExposureAdaptationBrighteningSpeedFactor(@NFloat double value);

    /**
     * @property exposureAdaptationBrighteningSpeedFactor
     * @abstract Determines the exposure adaptation speed when going from dark areas to bright areas. Defaults to 0.6.
     */
    @Generated
    @Selector("setExposureAdaptationDarkeningSpeedFactor:")
    public native void setExposureAdaptationDarkeningSpeedFactor(@NFloat double value);

    /**
     * @property exposureOffset
     * @abstract Determines the logarithmic exposure biasing, in EV. Defaults to 0.
     */
    @Generated
    @Selector("setExposureOffset:")
    public native void setExposureOffset(@NFloat double value);

    /**
     * @property focalBlurRadius
     * @abstract Determines the receiver's focal radius. Animatable.
     * @discussion Determines the maximum amount of blur for objects out of focus. Defaults to 0.
     */
    @Generated
    @Selector("setFocalBlurRadius:")
    public native void setFocalBlurRadius(@NFloat double value);

    /**
     * @property focalDistance
     * @abstract Determines the receiver's focal distance. Animatable.
     * @discussion When non zero, the focal distance determines how the camera focuses the objects in the 3d scene. Defaults to 10.0 prior to macOS 10.13, iOS 11, tvOS 11 and watchOS 4. Defaults to 2.5 otherwise.
     */
    @Generated
    @Selector("setFocalDistance:")
    public native void setFocalDistance(@NFloat double value);

    /**
     * @property focalSize
     * @abstract Determines the receiver's focal size. Animatable.
     * @discussion Determines the size of the area around focalDistance where the objects are in focus. Defaults to 0.
     */
    @Generated
    @Selector("setFocalSize:")
    public native void setFocalSize(@NFloat double value);

    /**
     * @property maximumExposure
     * @abstract Determines the maximum exposure offset of the adaptation, in EV. Defaults to -15.
     */
    @Generated
    @Selector("setMaximumExposure:")
    public native void setMaximumExposure(@NFloat double value);

    /**
     * @property minimumExposure
     * @abstract Determines the minimum exposure offset of the adaptation, in EV. Defaults to -15.
     */
    @Generated
    @Selector("setMinimumExposure:")
    public native void setMinimumExposure(@NFloat double value);

    /**
     * @property motionBlurIntensity
     * @abstract Determines the intensity of the motion blur. Animatable. Defaults to 0.
     * @discussion An intensity of zero means no motion blur. The intensity should not exceeed 1.
     */
    @Generated
    @Selector("setMotionBlurIntensity:")
    public native void setMotionBlurIntensity(@NFloat double value);

    /**
     * @property name
     * @abstract Determines the name of the receiver.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * @property orthographicScale
     * @abstract Determines the receiver's orthographic scale value. Animatable. Defaults to 1.
     * @discussion This setting determines the size of the camera's visible area. This is only enabled when usesOrthographicProjection is set to YES.
     */
    @Generated
    @Selector("setOrthographicScale:")
    public native void setOrthographicScale(double value);

    /**
     * @property projectionTransform
     * @abstract Determines the projection transform used by the camera to project the world onscreen. 
     */
    @Generated
    @Selector("setProjectionTransform:")
    public native void setProjectionTransform(@ByValue SCNMatrix4 value);

    /**
     * @property saturation
     * @abstract Controls the overall saturation of the scene. Defaults to 1 (no effect).
     */
    @Generated
    @Selector("setSaturation:")
    public native void setSaturation(@NFloat double value);

    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, String key);

    @Generated
    @Selector("setTechnique:")
    public native void setTechnique(SCNTechnique value);

    /**
     * @property usesOrthographicProjection
     * @abstract Determines whether the receiver uses an orthographic projection or not. Defaults to NO.
     */
    @Generated
    @Selector("setUsesOrthographicProjection:")
    public native void setUsesOrthographicProjection(boolean value);

    /**
     * @property vignettingIntensity
     * @abstract Controls the intensity of the vignetting effect. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("setVignettingIntensity:")
    public native void setVignettingIntensity(@NFloat double value);

    /**
     * @property vignettingPower
     * @abstract Controls the shape of the vignetting effect. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("setVignettingPower:")
    public native void setVignettingPower(@NFloat double value);

    /**
     * @property wantsExposureAdaptation
     * @abstract Determines if the receiver should simulate an eye and continuously adjust to luminance. Defaults to YES.
     */
    @Generated
    @Selector("setWantsExposureAdaptation:")
    public native void setWantsExposureAdaptation(boolean value);

    /**
     * @property wantsHDR
     * @abstract Determines if the receiver has a high dynamic range. Defaults to NO.
     */
    @Generated
    @Selector("setWantsHDR:")
    public native void setWantsHDR(boolean value);

    /**
     * @property whitePoint
     * @abstract Determines the smallest luminance level that will be mapped to white in the final image. Defaults to 1.
     */
    @Generated
    @Selector("setWhitePoint:")
    public native void setWhitePoint(@NFloat double value);

    /**
     * @property xFov
     * @abstract Determines the receiver's field of view on the X axis (in degree). Animatable.
     * @discussion When both xFov and yFov are null an yFov of 60° is used. When both are set, the one that best fits the renderer's aspect ratio is used. When only one is set, it is used. Defaults to 0.
     */
    @Generated
    @Selector("setXFov:")
    public native void setXFov(double value);

    /**
     * @property yFov
     * @abstract Determines the receiver's field of view on the Y axis (in degree). Animatable.
     * @discussion When both xFov and yFov are null an yFov of 60° is used. When both are set, the one that best fits the renderer's aspect ratio is used. When only one is set, it is used. Defaults to 0.
     */
    @Generated
    @Selector("setYFov:")
    public native void setYFov(double value);

    /**
     * @property zFar
     * @abstract Determines the receiver's far value. Animatable.
     * @discussion The far value determines the maximal distance between the camera and a visible surface. If a surface is further from the camera than this maximal distance, then the surface is clipped. Defaults to 100.
     */
    @Generated
    @Selector("setZFar:")
    public native void setZFar(double value);

    /**
     * @property zNear
     * @abstract Determines the receiver's near value. Animatable.
     * @discussion The near value determines the minimal distance between the camera and a visible surface. If a surface is closer to the camera than this minimal distance, then the surface is clipped. The near value must be different than zero. Defaults to 1.
     */
    @Generated
    @Selector("setZNear:")
    public native void setZNear(double value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("technique")
    public native SCNTechnique technique();

    /**
     * @property usesOrthographicProjection
     * @abstract Determines whether the receiver uses an orthographic projection or not. Defaults to NO.
     */
    @Generated
    @Selector("usesOrthographicProjection")
    public native boolean usesOrthographicProjection();

    /**
     * @property vignettingIntensity
     * @abstract Controls the intensity of the vignetting effect. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("vignettingIntensity")
    @NFloat
    public native double vignettingIntensity();

    /**
     * @property vignettingPower
     * @abstract Controls the shape of the vignetting effect. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("vignettingPower")
    @NFloat
    public native double vignettingPower();

    /**
     * @property wantsExposureAdaptation
     * @abstract Determines if the receiver should simulate an eye and continuously adjust to luminance. Defaults to YES.
     */
    @Generated
    @Selector("wantsExposureAdaptation")
    public native boolean wantsExposureAdaptation();

    /**
     * @property wantsHDR
     * @abstract Determines if the receiver has a high dynamic range. Defaults to NO.
     */
    @Generated
    @Selector("wantsHDR")
    public native boolean wantsHDR();

    /**
     * @property whitePoint
     * @abstract Determines the smallest luminance level that will be mapped to white in the final image. Defaults to 1.
     */
    @Generated
    @Selector("whitePoint")
    @NFloat
    public native double whitePoint();

    /**
     * @property xFov
     * @abstract Determines the receiver's field of view on the X axis (in degree). Animatable.
     * @discussion When both xFov and yFov are null an yFov of 60° is used. When both are set, the one that best fits the renderer's aspect ratio is used. When only one is set, it is used. Defaults to 0.
     */
    @Generated
    @Selector("xFov")
    public native double xFov();

    /**
     * @property yFov
     * @abstract Determines the receiver's field of view on the Y axis (in degree). Animatable.
     * @discussion When both xFov and yFov are null an yFov of 60° is used. When both are set, the one that best fits the renderer's aspect ratio is used. When only one is set, it is used. Defaults to 0.
     */
    @Generated
    @Selector("yFov")
    public native double yFov();

    /**
     * @property zFar
     * @abstract Determines the receiver's far value. Animatable.
     * @discussion The far value determines the maximal distance between the camera and a visible surface. If a surface is further from the camera than this maximal distance, then the surface is clipped. Defaults to 100.
     */
    @Generated
    @Selector("zFar")
    public native double zFar();

    /**
     * @property zNear
     * @abstract Determines the receiver's near value. Animatable.
     * @discussion The near value determines the minimal distance between the camera and a visible surface. If a surface is closer to the camera than this minimal distance, then the surface is clipped. The near value must be different than zero. Defaults to 1.
     */
    @Generated
    @Selector("zNear")
    public native double zNear();

    @Generated
    @Selector("addAnimationPlayer:forKey:")
    public native void addAnimationPlayerForKey(SCNAnimationPlayer player, String key);

    @Generated
    @Selector("animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(String key);

    /**
     * @property apertureBladeCount
     * @abstract Determines the receiver's blade count of the aperture.
     * @discussion Defaults to 6.
     */
    @Generated
    @Selector("apertureBladeCount")
    @NInt
    public native long apertureBladeCount();

    /**
     * @property fStop
     * @abstract Determines the receiver's fstop. Animatable.
     * @discussion Defaults to 5.6.
     */
    @Generated
    @Selector("fStop")
    @NFloat
    public native double fStop();

    /**
     * @property fieldOfView
     * @abstract Determines the receiver's field of view (in degree). Defaults to 60°. Animatable.
     * @discussion The fieldOfView is automatically updated when the sensorHeight or focalLength are set. Setting the fieldOfView will update the focalLength according to the new fieldOfView and the current sensorHeight.
     */
    @Generated
    @Selector("fieldOfView")
    @NFloat
    public native double fieldOfView();

    /**
     * @property focalBlurSampleCount
     * @abstract Determines the receiver's sample count for depth of field effect.
     * @discussion Defaults to 25.
     */
    @Generated
    @Selector("focalBlurSampleCount")
    @NInt
    public native long focalBlurSampleCount();

    /**
     * @property focalLength
     * @abstract Determines the receiver's focal length in millimeter. Defaults to 50mm. Animatable.
     * @discussion The focalLength is automatically updated when the sensorHeight or fieldOfView are set. Setting the focalLength will update the fieldOfView according to the new focalLength and the current sensorHeight.
     */
    @Generated
    @Selector("focalLength")
    @NFloat
    public native double focalLength();

    /**
     * @property focusDistance
     * @abstract Determines the receiver's focus distance. Animatable.
     * @discussion Defaults to 2.5
     */
    @Generated
    @Selector("focusDistance")
    @NFloat
    public native double focusDistance();

    /**
     * @property projectionDirection
     * @abstract Determines whether the fieldOfView (or orthographicScale) is vertical or horizontal. Defaults to vertical.
     */
    @Generated
    @Selector("projectionDirection")
    @NInt
    public native long projectionDirection();

    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKeyBlendOutDuration(String key, @NFloat double duration);

    /**
     * @property screenSpaceAmbientOcclusionBias
     * @abstract Determines self occlusion bias in scene unit.
     * @discussion defaults to 0.03.
     */
    @Generated
    @Selector("screenSpaceAmbientOcclusionBias")
    @NFloat
    public native double screenSpaceAmbientOcclusionBias();

    /**
     * @property screenSpaceAmbientOcclusionDepthThreshold
     * @abstract Determines the depth blur threshold in scene unit.
     * @discussion defaults to 0.2.
     */
    @Generated
    @Selector("screenSpaceAmbientOcclusionDepthThreshold")
    @NFloat
    public native double screenSpaceAmbientOcclusionDepthThreshold();

    /**
     * @property screenSpaceAmbientOcclusionIntensity
     * @abstract Determines the intensity of the screen space ambient occlusion. Animatable.
     * @discussion defaults to 0.
     */
    @Generated
    @Selector("screenSpaceAmbientOcclusionIntensity")
    @NFloat
    public native double screenSpaceAmbientOcclusionIntensity();

    /**
     * @property screenSpaceAmbientOcclusionNormalThreshold
     * @abstract Determines the normal blur threshold.
     * @discussion defaults to 0.3.
     */
    @Generated
    @Selector("screenSpaceAmbientOcclusionNormalThreshold")
    @NFloat
    public native double screenSpaceAmbientOcclusionNormalThreshold();

    /**
     * @property screenSpaceAmbientOcclusionRadius
     * @abstract Determines the screen space ambient occlusion radius in scene unit. Animatable.
     * @discussion defaults to 5.
     */
    @Generated
    @Selector("screenSpaceAmbientOcclusionRadius")
    @NFloat
    public native double screenSpaceAmbientOcclusionRadius();

    /**
     * @property sensorHeight
     * @abstract Determines the vertical size of the sensor in millimeter. Defaults to 24mm. Animatable.
     * @discussion Setting the sensorHeight will automatically update the fieldOfView according to the new sensorHeight and the current focalLength.
     */
    @Generated
    @Selector("sensorHeight")
    @NFloat
    public native double sensorHeight();

    /**
     * @property apertureBladeCount
     * @abstract Determines the receiver's blade count of the aperture.
     * @discussion Defaults to 6.
     */
    @Generated
    @Selector("setApertureBladeCount:")
    public native void setApertureBladeCount(@NInt long value);

    /**
     * @property fStop
     * @abstract Determines the receiver's fstop. Animatable.
     * @discussion Defaults to 5.6.
     */
    @Generated
    @Selector("setFStop:")
    public native void setFStop(@NFloat double value);

    /**
     * @property fieldOfView
     * @abstract Determines the receiver's field of view (in degree). Defaults to 60°. Animatable.
     * @discussion The fieldOfView is automatically updated when the sensorHeight or focalLength are set. Setting the fieldOfView will update the focalLength according to the new fieldOfView and the current sensorHeight.
     */
    @Generated
    @Selector("setFieldOfView:")
    public native void setFieldOfView(@NFloat double value);

    /**
     * @property focalBlurSampleCount
     * @abstract Determines the receiver's sample count for depth of field effect.
     * @discussion Defaults to 25.
     */
    @Generated
    @Selector("setFocalBlurSampleCount:")
    public native void setFocalBlurSampleCount(@NInt long value);

    /**
     * @property focalLength
     * @abstract Determines the receiver's focal length in millimeter. Defaults to 50mm. Animatable.
     * @discussion The focalLength is automatically updated when the sensorHeight or fieldOfView are set. Setting the focalLength will update the fieldOfView according to the new focalLength and the current sensorHeight.
     */
    @Generated
    @Selector("setFocalLength:")
    public native void setFocalLength(@NFloat double value);

    /**
     * @property focusDistance
     * @abstract Determines the receiver's focus distance. Animatable.
     * @discussion Defaults to 2.5
     */
    @Generated
    @Selector("setFocusDistance:")
    public native void setFocusDistance(@NFloat double value);

    /**
     * @property projectionDirection
     * @abstract Determines whether the fieldOfView (or orthographicScale) is vertical or horizontal. Defaults to vertical.
     */
    @Generated
    @Selector("setProjectionDirection:")
    public native void setProjectionDirection(@NInt long value);

    /**
     * @property screenSpaceAmbientOcclusionBias
     * @abstract Determines self occlusion bias in scene unit.
     * @discussion defaults to 0.03.
     */
    @Generated
    @Selector("setScreenSpaceAmbientOcclusionBias:")
    public native void setScreenSpaceAmbientOcclusionBias(@NFloat double value);

    /**
     * @property screenSpaceAmbientOcclusionDepthThreshold
     * @abstract Determines the depth blur threshold in scene unit.
     * @discussion defaults to 0.2.
     */
    @Generated
    @Selector("setScreenSpaceAmbientOcclusionDepthThreshold:")
    public native void setScreenSpaceAmbientOcclusionDepthThreshold(@NFloat double value);

    /**
     * @property screenSpaceAmbientOcclusionIntensity
     * @abstract Determines the intensity of the screen space ambient occlusion. Animatable.
     * @discussion defaults to 0.
     */
    @Generated
    @Selector("setScreenSpaceAmbientOcclusionIntensity:")
    public native void setScreenSpaceAmbientOcclusionIntensity(@NFloat double value);

    /**
     * @property screenSpaceAmbientOcclusionNormalThreshold
     * @abstract Determines the normal blur threshold.
     * @discussion defaults to 0.3.
     */
    @Generated
    @Selector("setScreenSpaceAmbientOcclusionNormalThreshold:")
    public native void setScreenSpaceAmbientOcclusionNormalThreshold(@NFloat double value);

    /**
     * @property screenSpaceAmbientOcclusionRadius
     * @abstract Determines the screen space ambient occlusion radius in scene unit. Animatable.
     * @discussion defaults to 5.
     */
    @Generated
    @Selector("setScreenSpaceAmbientOcclusionRadius:")
    public native void setScreenSpaceAmbientOcclusionRadius(@NFloat double value);

    /**
     * @property sensorHeight
     * @abstract Determines the vertical size of the sensor in millimeter. Defaults to 24mm. Animatable.
     * @discussion Setting the sensorHeight will automatically update the fieldOfView according to the new sensorHeight and the current focalLength.
     */
    @Generated
    @Selector("setSensorHeight:")
    public native void setSensorHeight(@NFloat double value);

    /**
     * @property wantsDepthOfField
     * @abstract Determines if the receiver has depth of field. Defaults to NO.
     */
    @Generated
    @Selector("setWantsDepthOfField:")
    public native void setWantsDepthOfField(boolean value);

    /**
     * @property wantsDepthOfField
     * @abstract Determines if the receiver has depth of field. Defaults to NO.
     */
    @Generated
    @Selector("wantsDepthOfField")
    public native boolean wantsDepthOfField();

    /**
     * @property bloomIteration
     * @abstract Determines the number of blur iterations. Defaults to 1.
     */
    @Generated
    @Selector("bloomIterationCount")
    @NInt
    public native long bloomIterationCount();

    /**
     * @property bloomIterationSpread
     * @abstract Determines how the bloom iterations are spread. Defaults to 0.
     */
    @Generated
    @Selector("bloomIterationSpread")
    @NFloat
    public native double bloomIterationSpread();

    /**
     * @property grainIntensity
     * @abstract Controls the intensity of the grain. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("grainIntensity")
    @NFloat
    public native double grainIntensity();

    /**
     * @property grainIsColored
     * @abstract Determines if the grain is colored or not. Defaults to NO.
     */
    @Generated
    @Selector("grainIsColored")
    public native boolean grainIsColored();

    /**
     * @property grainScale
     * @abstract Controls the scale of the grain. Defaults to 1.
     */
    @Generated
    @Selector("grainScale")
    @NFloat
    public native double grainScale();

    @Generated
    @Selector("projectionTransformWithViewportSize:")
    @ByValue
    public native SCNMatrix4 projectionTransformWithViewportSize(@ByValue CGSize viewportSize);

    /**
     * @property bloomIteration
     * @abstract Determines the number of blur iterations. Defaults to 1.
     */
    @Generated
    @Selector("setBloomIterationCount:")
    public native void setBloomIterationCount(@NInt long value);

    /**
     * @property bloomIterationSpread
     * @abstract Determines how the bloom iterations are spread. Defaults to 0.
     */
    @Generated
    @Selector("setBloomIterationSpread:")
    public native void setBloomIterationSpread(@NFloat double value);

    /**
     * @property grainIntensity
     * @abstract Controls the intensity of the grain. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("setGrainIntensity:")
    public native void setGrainIntensity(@NFloat double value);

    /**
     * @property grainIsColored
     * @abstract Determines if the grain is colored or not. Defaults to NO.
     */
    @Generated
    @Selector("setGrainIsColored:")
    public native void setGrainIsColored(boolean value);

    /**
     * @property grainScale
     * @abstract Controls the scale of the grain. Defaults to 1.
     */
    @Generated
    @Selector("setGrainScale:")
    public native void setGrainScale(@NFloat double value);

    /**
     * @property whiteBalanceTemperature
     * @abstract Controls the overall white balance temperature of the scene. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("setWhiteBalanceTemperature:")
    public native void setWhiteBalanceTemperature(@NFloat double value);

    /**
     * @property whiteBalanceTint
     * @abstract Controls the overall white balance tint of the scene. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("setWhiteBalanceTint:")
    public native void setWhiteBalanceTint(@NFloat double value);

    /**
     * @property whiteBalanceTemperature
     * @abstract Controls the overall white balance temperature of the scene. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("whiteBalanceTemperature")
    @NFloat
    public native double whiteBalanceTemperature();

    /**
     * @property whiteBalanceTint
     * @abstract Controls the overall white balance tint of the scene. Defaults to 0 (no effect).
     */
    @Generated
    @Selector("whiteBalanceTint")
    @NFloat
    public native double whiteBalanceTint();
}
