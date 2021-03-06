package apple.gamecontroller;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamecontroller.protocol.GCDevice;
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
 * A game controller profile representing physical buttons, thumbsticks, dpads, etc... on a controller.
 * 
 * All controller profiles provide a base level of information about the controller they belong to.
 * 
 * A profile maps the hardware notion of a controller into a logical controller. One that a developer can design for
 * and depend on, no matter the underlying hardware.
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCPhysicalInputProfile extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GCPhysicalInputProfile(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allAxes")
    public native NSSet<? extends GCControllerAxisInput> allAxes();

    @Generated
    @Selector("allButtons")
    public native NSSet<? extends GCControllerButtonInput> allButtons();

    @Generated
    @Selector("allDpads")
    public native NSSet<? extends GCControllerDirectionPad> allDpads();

    /**
     * The following properties allow for dynamic querying of the input elements available on a profile.
     */
    @Generated
    @Selector("allElements")
    public native NSSet<? extends GCControllerElement> allElements();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCPhysicalInputProfile alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("axes")
    public native NSDictionary<String, ? extends GCControllerAxisInput> axes();

    @Generated
    @Selector("buttons")
    public native NSDictionary<String, ? extends GCControllerButtonInput> buttons();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * Polls the state vector of the physical input input and saves it to a new and writable instance of GCPhysicalInputProfile.
     * 
     * If your application is heavily multithreaded this may also be useful to guarantee atomicity of input handling as
     * a snapshot will not change based on user input once it is taken.
     * 
     * @see snapshot
     * @return A new physical input profile with the duplicated state vector of the current physical input
     */
    @Generated
    @Selector("capture")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object capture();

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

    /**
     * A profile keeps a reference to the device that this profile is mapping input from
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native GCDevice device();

    @Generated
    @Selector("dpads")
    public native NSDictionary<String, ? extends GCControllerDirectionPad> dpads();

    /**
     * The following properties allow for runtime lookup of any input element on a profile, when provided with a valid alias.
     * 
     * [@example] extendedGamepad.elements["Button A"] == extendedGamepad.buttonA // YES
     * [@example] extendedGamepad.dpads["Left Thumbstick"] == extendedGamepad.leftThumbstick // YES
     * [@example] extendedGamepad.dpads["Button B"] // returns nil, "Button B" is not a GCControllerDirectionPad
     */
    @Generated
    @Selector("elements")
    public native NSDictionary<String, ? extends GCControllerElement> elements();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native GCPhysicalInputProfile init();

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

    /**
     * The last time elements of this profile were updated.
     */
    @Generated
    @Selector("lastEventTimestamp")
    public native double lastEventTimestamp();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Profile elements can be accessed using keyed subscript notation, with a valid alias of its inputs.
     * 
     * [@example] extendedGamepad["Button A"] == extendedGamepad.buttonA // YES
     * [@example] microGamepad["Button X"] == microGamepad.buttonX // YES
     * [@note] Equivalent to -elements
     */
    @Generated
    @Selector("objectForKeyedSubscript:")
    public native GCControllerElement objectForKeyedSubscript(String key);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Sets the state vector of the physical input profile to a copy of the passed in physical input profile's state vector.
     * 
     * [@note] If the controller's snapshot flag is set to NO, this method has no effect.
     * 
     * @see GCController.snapshot
     */
    @Generated
    @Selector("setStateFromPhysicalInput:")
    public native void setStateFromPhysicalInput(GCPhysicalInputProfile physicalInput);

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
}