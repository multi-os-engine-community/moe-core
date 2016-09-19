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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSLocking;
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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSConditionLock extends NSObject implements NSLocking {
    static {
        NatJ.register();
    }

    @Generated
    protected NSConditionLock(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSConditionLock alloc();

    /**
     * condition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSConditionLock_Class/index.html#//apple_ref/occ/instp/NSConditionLock/condition">iOS Dev Center</a>
     */
    @Generated
    @Selector("condition")
    @NInt
    public native long condition();

    @Generated
    @Selector("init")
    public native NSConditionLock init();

    /**
     * initWithCondition:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSConditionLock_Class/index.html#//apple_ref/occ/instm/NSConditionLock/initWithCondition:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithCondition:")
    public native NSConditionLock initWithCondition(@NInt long condition);

    @Generated
    @Selector("lock")
    public native void lock();

    /**
     * lockBeforeDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSConditionLock_Class/index.html#//apple_ref/occ/instm/NSConditionLock/lockBeforeDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lockBeforeDate:")
    public native boolean lockBeforeDate(NSDate limit);

    /**
     * lockWhenCondition:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSConditionLock_Class/index.html#//apple_ref/occ/instm/NSConditionLock/lockWhenCondition:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lockWhenCondition:")
    public native void lockWhenCondition(@NInt long condition);

    /**
     * lockWhenCondition:beforeDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSConditionLock_Class/index.html#//apple_ref/occ/instm/NSConditionLock/lockWhenCondition:beforeDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lockWhenCondition:beforeDate:")
    public native boolean lockWhenConditionBeforeDate(@NInt long condition, NSDate limit);

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSConditionLock_Class/index.html#//apple_ref/occ/instp/NSConditionLock/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSConditionLock_Class/index.html#//apple_ref/occ/instp/NSConditionLock/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * tryLock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSConditionLock_Class/index.html#//apple_ref/occ/instm/NSConditionLock/tryLock">iOS Dev Center</a>
     */
    @Generated
    @Selector("tryLock")
    public native boolean tryLock();

    /**
     * tryLockWhenCondition:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSConditionLock_Class/index.html#//apple_ref/occ/instm/NSConditionLock/tryLockWhenCondition:">iOS Dev Center</a>
     */
    @Generated
    @Selector("tryLockWhenCondition:")
    public native boolean tryLockWhenCondition(@NInt long condition);

    @Generated
    @Selector("unlock")
    public native void unlock();

    /**
     * unlockWithCondition:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSConditionLock_Class/index.html#//apple_ref/occ/instm/NSConditionLock/unlockWithCondition:">iOS Dev Center</a>
     */
    @Generated
    @Selector("unlockWithCondition:")
    public native void unlockWithCondition(@NInt long condition);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}