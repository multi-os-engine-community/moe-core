package apple.classkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * CLSActivity represents user generated activity data for a given context.
 * 
 * CLSActivity has three major components.
 * 
 *             (1) Progress, used to measure the amount of activity a user generates as a percentage.
 *             (2) Duration, used to measure the length of time a user spent on this activity. Use @c -start and @c -stop methods.
 *             (3) Activity Items, used to gather information about the activity generated by a user.
 */
@Generated
@Library("ClassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLSActivity extends CLSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CLSActivity(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Add an activity item to this CLSActivity.
     */
    @Generated
    @Selector("addAdditionalActivityItem:")
    public native void addAdditionalActivityItem(CLSActivityItem activityItem);

    /**
     * Adds progress to this activity.
     * 
     * The progress should be a decimal representation of the start and ending percentage [0.0, 1.0].
     * 
     * @param         start      Starting percentage.
     * @param         end        Ending percentage.
     */
    @Generated
    @Selector("addProgressRangeFromStart:toEnd:")
    public native void addProgressRangeFromStartToEnd(double start, double end);

    /**
     * Array of all additional activity items on this CLSActivity.
     */
    @Generated
    @Selector("additionalActivityItems")
    public native NSArray<? extends CLSActivityItem> additionalActivityItems();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLSActivity alloc();

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

    /**
     * Returns the total time tracked in this activity (excluding any previous activities).
     * 
     * The time between calling @c -start and @c -stop.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CLSActivity init();

    @Generated
    @Selector("initWithCoder:")
    public native CLSActivity initWithCoder(NSCoder coder);

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

    /**
     * Returns whether this Activity has been started or not.
     */
    @Generated
    @Selector("isStarted")
    public native boolean isStarted();

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

    /**
     * The primary activityItem to be reported on.
     * 
     * This can be nil indicating @c progress property is the primary data instead of any activityItems.
     */
    @Generated
    @Selector("primaryActivityItem")
    public native CLSActivityItem primaryActivityItem();

    /**
     * Current progress as a decimal representation of a percentage.
     * 
     * Should be [0.0, 1.0].
     */
    @Generated
    @Selector("progress")
    public native double progress();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The primary activityItem to be reported on.
     * 
     * This can be nil indicating @c progress property is the primary data instead of any activityItems.
     */
    @Generated
    @Selector("setPrimaryActivityItem:")
    public native void setPrimaryActivityItem(CLSActivityItem value);

    /**
     * Current progress as a decimal representation of a percentage.
     * 
     * Should be [0.0, 1.0].
     */
    @Generated
    @Selector("setProgress:")
    public native void setProgress(double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Start Activity.
     * 
     * Starts the activity (or resumes if previously stopped).
     */
    @Generated
    @Selector("start")
    public native void start();

    /**
     * Stop Activity.
     * 
     * Stops or pauses the activity and ends the time being tracked on it.
     */
    @Generated
    @Selector("stop")
    public native void stop();

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