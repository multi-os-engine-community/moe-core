package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIBarAppearance extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIBarAppearance(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIBarAppearance alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * A color to use for the bar background. This color is composited over backgroundEffects.
     */
    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    /**
     * A specific blur effect to use for the bar background. This effect is composited first when constructing the bar's background.
     */
    @Generated
    @Selector("backgroundEffect")
    public native UIBlurEffect backgroundEffect();

    /**
     * An image to use for the bar background. This image is composited over the backgroundColor, and resized per the backgroundImageContentMode.
     */
    @Generated
    @Selector("backgroundImage")
    public native UIImage backgroundImage();

    /**
     * The content mode to use when rendering the backgroundImage. Defaults to UIViewContentModeScaleToFill. UIViewContentModeRedraw will be reinterpreted as UIViewContentModeScaleToFill.
     */
    @Generated
    @Selector("backgroundImageContentMode")
    @NInt
    public native long backgroundImageContentMode();

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

    /**
     * Reset background and shadow properties to their defaults.
     */
    @Generated
    @Selector("configureWithDefaultBackground")
    public native void configureWithDefaultBackground();

    /**
     * Reset background and shadow properties to display theme-appropriate opaque colors.
     */
    @Generated
    @Selector("configureWithOpaqueBackground")
    public native void configureWithOpaqueBackground();

    /**
     * Reset background and shadow properties to be transparent.
     */
    @Generated
    @Selector("configureWithTransparentBackground")
    public native void configureWithTransparentBackground();

    @Generated
    @Owned
    @Selector("copy")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copy();

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

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The idiom that this appearance object targets.
     */
    @Generated
    @Selector("idiom")
    @NInt
    public native long idiom();

    /**
     * Constructs a new bar appearance, configured with default values and targeting the device idiom.
     */
    @Generated
    @Selector("init")
    public native UIBarAppearance init();

    /**
     * Constructs a new bar appearance, copying all relevant properties from the given appearance object. This initializer is useful for migrating configuration between UIBarAppearance subclasses. For example, you can initialize a UINavigationBarAppearance with a UIToolbarAppearance instance, and shared attributes will be identical between the two.
     */
    @Generated
    @Selector("initWithBarAppearance:")
    public native UIBarAppearance initWithBarAppearance(UIBarAppearance barAppearance);

    @Generated
    @Selector("initWithCoder:")
    public native UIBarAppearance initWithCoder(NSCoder coder);

    /**
     * Constructs a new bar appearance, targetting the passed-in idiom as a hint. Not all platforms support all available idioms. See the idiom property to determine the resolved idiom.
     */
    @Generated
    @Selector("initWithIdiom:")
    public native UIBarAppearance initWithIdiom(@NInt long idiom);

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

    /**
     * A color to use for the bar background. This color is composited over backgroundEffects.
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    /**
     * A specific blur effect to use for the bar background. This effect is composited first when constructing the bar's background.
     */
    @Generated
    @Selector("setBackgroundEffect:")
    public native void setBackgroundEffect(UIBlurEffect value);

    /**
     * An image to use for the bar background. This image is composited over the backgroundColor, and resized per the backgroundImageContentMode.
     */
    @Generated
    @Selector("setBackgroundImage:")
    public native void setBackgroundImage(UIImage value);

    /**
     * The content mode to use when rendering the backgroundImage. Defaults to UIViewContentModeScaleToFill. UIViewContentModeRedraw will be reinterpreted as UIViewContentModeScaleToFill.
     */
    @Generated
    @Selector("setBackgroundImageContentMode:")
    public native void setBackgroundImageContentMode(@NInt long value);

    /**
     * A color to use for the shadow. Its specific behavior depends on the value of shadowImage. If shadowImage is nil, then the shadowColor is used to color the bar's default shadow; a nil or clearColor shadowColor will result in no shadow. If shadowImage is a template image, then the shadowColor is used to tint the image; a nil or clearColor shadowColor will also result in no shadow. If the shadowImage is not a template image, then it will be rendered regardless of the value of shadowColor.
     */
    @Generated
    @Selector("setShadowColor:")
    public native void setShadowColor(UIColor value);

    /**
     * Use an image for the shadow. See shadowColor for how they interact.
     */
    @Generated
    @Selector("setShadowImage:")
    public native void setShadowImage(UIImage value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * A color to use for the shadow. Its specific behavior depends on the value of shadowImage. If shadowImage is nil, then the shadowColor is used to color the bar's default shadow; a nil or clearColor shadowColor will result in no shadow. If shadowImage is a template image, then the shadowColor is used to tint the image; a nil or clearColor shadowColor will also result in no shadow. If the shadowImage is not a template image, then it will be rendered regardless of the value of shadowColor.
     */
    @Generated
    @Selector("shadowColor")
    public native UIColor shadowColor();

    /**
     * Use an image for the shadow. See shadowColor for how they interact.
     */
    @Generated
    @Selector("shadowImage")
    public native UIImage shadowImage();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

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
}