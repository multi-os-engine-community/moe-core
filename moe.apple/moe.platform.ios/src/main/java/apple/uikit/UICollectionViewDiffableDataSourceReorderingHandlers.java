package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICollectionViewDiffableDataSourceReorderingHandlers<_SectionType, _ItemType> extends NSObject
        implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionViewDiffableDataSourceReorderingHandlers(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionViewDiffableDataSourceReorderingHandlers<?, ?> alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("canReorderItemHandler")
    @ObjCBlock(name = "call_canReorderItemHandler_ret")
    public native Block_canReorderItemHandler_ret canReorderItemHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_canReorderItemHandler_ret {
        @Generated
        boolean call_canReorderItemHandler_ret(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

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

    @Generated
    @Selector("didReorderHandler")
    @ObjCBlock(name = "call_didReorderHandler_ret")
    public native Block_didReorderHandler_ret didReorderHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_didReorderHandler_ret {
        @Generated
        void call_didReorderHandler_ret(NSDiffableDataSourceTransaction<Object, Object> arg0);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UICollectionViewDiffableDataSourceReorderingHandlers<?, ?> init();

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
    @Selector("setCanReorderItemHandler:")
    public native void setCanReorderItemHandler(
            @ObjCBlock(name = "call_setCanReorderItemHandler") Block_setCanReorderItemHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCanReorderItemHandler {
        @Generated
        boolean call_setCanReorderItemHandler(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Generated
    @Selector("setDidReorderHandler:")
    public native void setDidReorderHandler(
            @ObjCBlock(name = "call_setDidReorderHandler") Block_setDidReorderHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDidReorderHandler {
        @Generated
        void call_setDidReorderHandler(NSDiffableDataSourceTransaction<Object, Object> arg0);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("setWillReorderHandler:")
    public native void setWillReorderHandler(
            @ObjCBlock(name = "call_setWillReorderHandler") Block_setWillReorderHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWillReorderHandler {
        @Generated
        void call_setWillReorderHandler(NSDiffableDataSourceTransaction<Object, Object> arg0);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("willReorderHandler")
    @ObjCBlock(name = "call_willReorderHandler_ret")
    public native Block_willReorderHandler_ret willReorderHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_willReorderHandler_ret {
        @Generated
        void call_willReorderHandler_ret(NSDiffableDataSourceTransaction<Object, Object> arg0);
    }
}