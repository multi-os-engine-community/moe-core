package apple.vision;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A request that detects trajectories of shapes (even small ones) that follow a parabolic path in a sequence of images.
 * 
 * This request detects objects moving and (once their path follows the constraint of a parabola), a VNTrajectoryObservation will be returned with the detected points and the equation describing the parabola.
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNDetectTrajectoriesRequest extends VNStatefulRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNDetectTrajectoriesRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNDetectTrajectoriesRequest alloc();

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
    @Selector("currentRevision")
    @NUInt
    public static native long currentRevision();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("defaultRevision")
    @NUInt
    public static native long defaultRevision();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VNDetectTrajectoriesRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNDetectTrajectoriesRequest initWithCompletionHandler(
            @ObjCBlock(name = "call_initWithCompletionHandler") VNRequest.Block_initWithCompletionHandler completionHandler);

    @Generated
    @Selector("initWithFrameAnalysisSpacing:completionHandler:")
    public native VNDetectTrajectoriesRequest initWithFrameAnalysisSpacingCompletionHandler(
            @ByValue CMTime frameAnalysisSpacing,
            @ObjCBlock(name = "call_initWithFrameAnalysisSpacingCompletionHandler") VNStatefulRequest.Block_initWithFrameAnalysisSpacingCompletionHandler completionHandler);

    /**
     * Create a new request that will detect the trajectory of a shape in motion.
     * 
     * @param frameAnalysisSpacing	The reciprocal of the maximum rate at which buffers will be processed. The request will not process buffers that fall within the frameAnalysisSpacing after it has performed the analysis. The analysis is not done by wall time but by analysis of the time stamps of the samplebuffers being processed. This property is for instance useful to throttle the processing on slower devices. If this is set to kCMTimeZero then no frames get skipped in the analysis.
     * @param trajectoryLength		The number of points required to analyze a parabola that indicates a trajectory. Must be at least 5.
     * @param completionHandler		The block to be invoked after the request has completed its processing. The completion handler gets executed on the same dispatch queue as the request being executed.
     */
    @Generated
    @Selector("initWithFrameAnalysisSpacing:trajectoryLength:completionHandler:")
    public native VNDetectTrajectoriesRequest initWithFrameAnalysisSpacingTrajectoryLengthCompletionHandler(
            @ByValue CMTime frameAnalysisSpacing, @NInt long trajectoryLength,
            @ObjCBlock(name = "call_initWithFrameAnalysisSpacingTrajectoryLengthCompletionHandler") Block_initWithFrameAnalysisSpacingTrajectoryLengthCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithFrameAnalysisSpacingTrajectoryLengthCompletionHandler {
        @Generated
        void call_initWithFrameAnalysisSpacingTrajectoryLengthCompletionHandler(VNRequest request, NSError error);
    }

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
    @Selector("maximumObjectSize")
    public native float maximumObjectSize();

    @Generated
    @Selector("minimumObjectSize")
    public native float minimumObjectSize();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Specifies the maximum radius of the bounding circle of the object to be tracked. This can be used to filter out unwanted trajectories from larger objects moving through the scene. The default is 1.0, which means no filtering is applied. Changing the maximum from frame to frame can produce eratic trajectories as objects will either disappear or be added to the tracking base on this filtering. The size is specified in normalized coordinates.
     */
    @Generated
    @Selector("objectMaximumNormalizedRadius")
    public native float objectMaximumNormalizedRadius();

    /**
     * Specifies the minimum radius of the bounding circle of the object to be tracked. This can be used to filter out noise and small objects. The default is 0.0, which means no filtering is applied. Changing the property from frame to frame can produce eratic trajectories as objects will either disappear or be added to the tracking base on this filtering. The value is specified in normalized coordinates.
     */
    @Generated
    @Selector("objectMinimumNormalizedRadius")
    public native float objectMinimumNormalizedRadius();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Provides VNTrajectoryObservation results.
     */
    @Generated
    @Selector("results")
    public native NSArray<? extends VNTrajectoryObservation> results();

    @Generated
    @Selector("setMaximumObjectSize:")
    public native void setMaximumObjectSize(float value);

    @Generated
    @Selector("setMinimumObjectSize:")
    public native void setMinimumObjectSize(float value);

    /**
     * Specifies the maximum radius of the bounding circle of the object to be tracked. This can be used to filter out unwanted trajectories from larger objects moving through the scene. The default is 1.0, which means no filtering is applied. Changing the maximum from frame to frame can produce eratic trajectories as objects will either disappear or be added to the tracking base on this filtering. The size is specified in normalized coordinates.
     */
    @Generated
    @Selector("setObjectMaximumNormalizedRadius:")
    public native void setObjectMaximumNormalizedRadius(float value);

    /**
     * Specifies the minimum radius of the bounding circle of the object to be tracked. This can be used to filter out noise and small objects. The default is 0.0, which means no filtering is applied. Changing the property from frame to frame can produce eratic trajectories as objects will either disappear or be added to the tracking base on this filtering. The value is specified in normalized coordinates.
     */
    @Generated
    @Selector("setObjectMinimumNormalizedRadius:")
    public native void setObjectMinimumNormalizedRadius(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();

    /**
     * The number of points required to analyze a parabola that indicates a trajectory.
     */
    @Generated
    @Selector("trajectoryLength")
    @NInt
    public native long trajectoryLength();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}