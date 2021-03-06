package apple.coreml;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An immutable variant holding a data value of a supported MLFeatureType
 * 
 * MLFeatureValue does not support type conversion in its accessor properties. It
 * can also have a missing or undefined value of a well defined type.
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLFeatureValue extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MLFeatureValue(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLFeatureValue alloc();

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

    /**
     * Populated value if the type is MLFeatureTypeDictionary
     */
    @Generated
    @Selector("dictionaryValue")
    public native NSDictionary<?, ? extends NSNumber> dictionaryValue();

    /**
     * Populated value if the type is MLFeatureTypeDouble
     */
    @Generated
    @Selector("doubleValue")
    public native double doubleValue();

    /**
     * For encoding a sparse feature set or for encoding probabilities. Input keys that are not
     * NSNumber * or NSString * are rejected on construction and return a MLModelErrorFeatureTypeMismatch
     * error. Further validation for consistency occurs on evaluation
     */
    @Generated
    @Selector("featureValueWithDictionary:error:")
    public static native MLFeatureValue featureValueWithDictionaryError(NSDictionary<?, ? extends NSNumber> value,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("featureValueWithDouble:")
    public static native MLFeatureValue featureValueWithDouble(double value);

    /**
     * Hold an object with the specified value
     */
    @Generated
    @Selector("featureValueWithInt64:")
    public static native MLFeatureValue featureValueWithInt64(long value);

    @Generated
    @Selector("featureValueWithMultiArray:")
    public static native MLFeatureValue featureValueWithMultiArray(MLMultiArray value);

    @Generated
    @Selector("featureValueWithPixelBuffer:")
    public static native MLFeatureValue featureValueWithPixelBuffer(CVBufferRef value);

    @Generated
    @Selector("featureValueWithString:")
    public static native MLFeatureValue featureValueWithString(String value);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Populated value if the type is MLFeatureTypeImage
     */
    @Generated
    @Selector("imageBufferValue")
    public native CVBufferRef imageBufferValue();

    @Generated
    @Selector("init")
    public native MLFeatureValue init();

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
     * Populated value if the type is MLFeatureTypeInt64
     */
    @Generated
    @Selector("int64Value")
    public native long int64Value();

    @Generated
    @Selector("isEqualToFeatureValue:")
    public native boolean isEqualToFeatureValue(MLFeatureValue value);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * True if the value represents a missing or undefined value
     */
    @Generated
    @Selector("isUndefined")
    public native boolean isUndefined();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Populated value if the type is MLFeatureTypeMultiArray
     */
    @Generated
    @Selector("multiArrayValue")
    public native MLMultiArray multiArrayValue();

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

    /**
     * Populated value if the type is MLFeatureTypeString
     */
    @Generated
    @Selector("stringValue")
    public native String stringValue();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Type of the value for which the corresponding property below is held
     */
    @Generated
    @Selector("type")
    @NInt
    public native long type();

    /**
     * Represent an undefined value of a specified type
     */
    @Generated
    @Selector("undefinedFeatureValueWithType:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object undefinedFeatureValueWithType(@NInt long type);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Construct image feature value from CGImage, using the size and type information required by feature description (orientation is assumed to be kCGImagePropertyOrientationUp)
     */
    @Generated
    @Selector("featureValueWithCGImage:constraint:options:error:")
    public static native MLFeatureValue featureValueWithCGImageConstraintOptionsError(CGImageRef cgImage,
            MLImageConstraint constraint, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct image feature value from CGImage w/ specified orientation, using the size and type information required by feature description
     */
    @Generated
    @Selector("featureValueWithCGImage:orientation:constraint:options:error:")
    public static native MLFeatureValue featureValueWithCGImageOrientationConstraintOptionsError(CGImageRef cgImage,
            int orientation, MLImageConstraint constraint, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct image feature value from CGImage w/ specified orientation
     */
    @Generated
    @Selector("featureValueWithCGImage:orientation:pixelsWide:pixelsHigh:pixelFormatType:options:error:")
    public static native MLFeatureValue featureValueWithCGImageOrientationPixelsWidePixelsHighPixelFormatTypeOptionsError(
            CGImageRef cgImage, int orientation, @NInt long pixelsWide, @NInt long pixelsHigh, int pixelFormatType,
            NSDictionary<String, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct image feature value from CGImage (orientation is assumed to be kCGImagePropertyOrientationUp)
     */
    @Generated
    @Selector("featureValueWithCGImage:pixelsWide:pixelsHigh:pixelFormatType:options:error:")
    public static native MLFeatureValue featureValueWithCGImagePixelsWidePixelsHighPixelFormatTypeOptionsError(
            CGImageRef cgImage, @NInt long pixelsWide, @NInt long pixelsHigh, int pixelFormatType,
            NSDictionary<String, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct image feature value from an image on disk, using a model specified image constraint. Orientation is read from Exif if avaiable
     */
    @Generated
    @Selector("featureValueWithImageAtURL:constraint:options:error:")
    public static native MLFeatureValue featureValueWithImageAtURLConstraintOptionsError(NSURL url,
            MLImageConstraint constraint, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct image feature value from an image on disk using a model specified image constraint. The passed in orientation supersedes any in the file
     */
    @Generated
    @Selector("featureValueWithImageAtURL:orientation:constraint:options:error:")
    public static native MLFeatureValue featureValueWithImageAtURLOrientationConstraintOptionsError(NSURL url,
            int orientation, MLImageConstraint constraint, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct image feature value from an image on disk. The passed in orientation supersedes any in the file
     */
    @Generated
    @Selector("featureValueWithImageAtURL:orientation:pixelsWide:pixelsHigh:pixelFormatType:options:error:")
    public static native MLFeatureValue featureValueWithImageAtURLOrientationPixelsWidePixelsHighPixelFormatTypeOptionsError(
            NSURL url, int orientation, @NInt long pixelsWide, @NInt long pixelsHigh, int pixelFormatType,
            NSDictionary<String, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Construct image feature value from an image on disk. Orientation is read from Exif if avaiable
     */
    @Generated
    @Selector("featureValueWithImageAtURL:pixelsWide:pixelsHigh:pixelFormatType:options:error:")
    public static native MLFeatureValue featureValueWithImageAtURLPixelsWidePixelsHighPixelFormatTypeOptionsError(
            NSURL url, @NInt long pixelsWide, @NInt long pixelsHigh, int pixelFormatType,
            NSDictionary<String, ?> options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("featureValueWithSequence:")
    public static native MLFeatureValue featureValueWithSequence(MLSequence sequence);

    /**
     * Populated value if the type is MLFeatureTypeSequence
     */
    @Generated
    @Selector("sequenceValue")
    public native MLSequence sequenceValue();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithCoder:")
    public native MLFeatureValue initWithCoder(NSCoder coder);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}