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

/**
 * NSCachedURLResponse
 * NSCachedURLResponse is a class whose objects functions as a wrapper for
 * objects that are stored in the framework's caching system. 
 * It is used to maintain characteristics and attributes of a cached 
 * object. 
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCachedURLResponse extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCachedURLResponse(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCachedURLResponse alloc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * Returns the data of the receiver.
     * 
     * @return The data of the receiver. 
     */
    @Generated
    @Selector("data")
    public native NSData data();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native NSCachedURLResponse init();

    @Generated
    @Selector("initWithCoder:")
    public native NSCachedURLResponse initWithCoder(NSCoder coder);

    /**
     * initWithResponse:data
     * 
     * Initializes an NSCachedURLResponse with the given
     * response and data.
     * 
     * A default NSURLCacheStoragePolicy is used for
     * NSCachedURLResponse objects initialized with this method:
     * NSURLCacheStorageAllowed.
     * 
     * @param response a NSURLResponse object.
     * @param data an NSData object representing the URL content
     * corresponding to the given response.
     * @return an initialized NSCachedURLResponse.
     */
    @Generated
    @Selector("initWithResponse:data:")
    public native NSCachedURLResponse initWithResponseData(NSURLResponse response, NSData data);

    /**
     * initWithResponse:data:userInfo:storagePolicy:
     * 
     * Initializes an NSCachedURLResponse with the given
     * response, data, user-info dictionary, and storage policy.
     * 
     * @param response a NSURLResponse object.
     * @param data an NSData object representing the URL content
     * corresponding to the given response.
     * @param userInfo a dictionary user-specified information to be
     * stored with the NSCachedURLResponse.
     * @param storagePolicy an NSURLCacheStoragePolicy constant.
     * @return an initialized NSCachedURLResponse.
     */
    @Generated
    @Selector("initWithResponse:data:userInfo:storagePolicy:")
    public native NSCachedURLResponse initWithResponseDataUserInfoStoragePolicy(NSURLResponse response, NSData data,
            NSDictionary<?, ?> userInfo, @NUInt long storagePolicy);

    /**
     * Returns the response wrapped by this instance.
     * 
     * @return The response wrapped by this instance. 
     */
    @Generated
    @Selector("response")
    public native NSURLResponse response();

    /**
     * Returns the NSURLCacheStoragePolicy constant of the receiver.
     * 
     * @return The NSURLCacheStoragePolicy constant of the receiver. 
     */
    @Generated
    @Selector("storagePolicy")
    @NUInt
    public native long storagePolicy();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Returns the userInfo dictionary of the receiver.
     * 
     * @return The userInfo dictionary of the receiver. 
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();
}
