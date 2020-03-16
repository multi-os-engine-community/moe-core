package apple.corenfc;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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

@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NFCNDEFPayload extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NFCNDEFPayload(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NFCNDEFPayload alloc();

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("identifier")
    public native NSData identifier();

    @Generated
    @Selector("init")
    public native NFCNDEFPayload init();

    @Generated
    @Selector("initWithCoder:")
    public native NFCNDEFPayload initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFormat:type:identifier:payload:")
    public native NFCNDEFPayload initWithFormatTypeIdentifierPayload(byte format, NSData type, NSData identifier,
            NSData payload);

    @Generated
    @Selector("initWithFormat:type:identifier:payload:chunkSize:")
    public native NFCNDEFPayload initWithFormatTypeIdentifierPayloadChunkSize(byte format, NSData type,
            NSData identifier, NSData payload, @NUInt long chunkSize);

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
    @Selector("payload")
    public native NSData payload();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setIdentifier:")
    public native void setIdentifier(NSData value);

    @Generated
    @Selector("setPayload:")
    public native void setPayload(NSData value);

    @Generated
    @Selector("setType:")
    public native void setType(NSData value);

    @Generated
    @Selector("setTypeNameFormat:")
    public native void setTypeNameFormat(byte value);

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
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("type")
    public native NSData type();

    @Generated
    @Selector("typeNameFormat")
    public native byte typeNameFormat();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("wellKnowTypeTextPayloadWithString:locale:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object wellKnowTypeTextPayloadWithStringLocale(String text, NSLocale locale);

    @Generated
    @Selector("wellKnownTypeTextPayloadWithLocale:")
    public native String wellKnownTypeTextPayloadWithLocale(@ReferenceInfo(type = NSLocale.class) Ptr<NSLocale> locale);

    @Generated
    @Selector("wellKnownTypeTextPayloadWithString:locale:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object wellKnownTypeTextPayloadWithStringLocale(String text, NSLocale locale);

    @Generated
    @Selector("wellKnownTypeURIPayload")
    public native NSURL wellKnownTypeURIPayload();

    @Generated
    @Selector("wellKnownTypeURIPayloadWithString:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object wellKnownTypeURIPayloadWithString(String uri);

    @Generated
    @Selector("wellKnownTypeURIPayloadWithURL:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object wellKnownTypeURIPayloadWithURL(NSURL url);
}