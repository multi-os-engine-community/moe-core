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

package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKNotification extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CKNotification(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKNotification alloc();

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
    @Selector("notificationFromRemoteNotificationDictionary:")
    public static native CKNotification notificationFromRemoteNotificationDictionary(
            NSDictionary<?, ?> notificationDictionary);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * A key for a localized string to be used as the alert action in a modal style notification.
     */
    @Generated
    @Selector("alertActionLocalizationKey")
    public native String alertActionLocalizationKey();

    /**
     * Optional alert string to display in a push notification.
     */
    @Generated
    @Selector("alertBody")
    public native String alertBody();

    /**
     * The name of an image in your app bundle to be used as the launch image when launching in response to the notification.
     */
    @Generated
    @Selector("alertLaunchImage")
    public native String alertLaunchImage();

    /**
     * A list of field names to take from the matching record that is used as substitution variables in a formatted alert string.
     */
    @Generated
    @Selector("alertLocalizationArgs")
    public native NSArray<String> alertLocalizationArgs();

    /**
     * Instead of a raw alert string, you may optionally specify a key for a localized string in your app's Localizable.strings file.
     */
    @Generated
    @Selector("alertLocalizationKey")
    public native String alertLocalizationKey();

    /**
     * The number to display as the badge of the application icon
     */
    @Generated
    @Selector("badge")
    public native NSNumber badge();

    /**
     * The category for user-initiated actions in the notification
     */
    @Generated
    @Selector("category")
    public native String category();

    @Generated
    @Selector("containerIdentifier")
    public native String containerIdentifier();

    @Generated
    @Selector("init")
    public native CKNotification init();

    /**
     * Whether or not the notification fully represents what the server wanted to send.
     * 
     * Push notifications have a limited size.  In some cases, CloudKit servers may not be able to send you a full @c CKNotification's worth of info in one push.  In those cases, isPruned returns YES.  The order in which we'll drop properties is defined in each @c CKNotification subclass below.
     * The @c CKNotification can be obtained in full via a @c CKFetchNotificationChangesOperation
     */
    @Generated
    @Selector("isPruned")
    public native boolean isPruned();

    @Generated
    @Selector("notificationID")
    public native CKNotificationID notificationID();

    /**
     * When you instantiate a CKNotification from a remote notification dictionary, you will get back a concrete
     * subclass defined below.  Use notificationType to avoid -isKindOfClass: checks 
     */
    @Generated
    @Selector("notificationType")
    @NInt
    public native long notificationType();

    /**
     * The name of a sound file in your app bundle to play upon receiving the notification.
     */
    @Generated
    @Selector("soundName")
    public native String soundName();

    /**
     * The ID of the subscription that caused this notification to fire
     */
    @Generated
    @Selector("subscriptionID")
    public native String subscriptionID();

    /**
     * Optional subtitle of the alert to display in a push notification.
     */
    @Generated
    @Selector("subtitle")
    public native String subtitle();

    /**
     * A list of field names to take from the matching record that is used as substitution variables in a formatted subtitle string.
     */
    @Generated
    @Selector("subtitleLocalizationArgs")
    public native NSArray<String> subtitleLocalizationArgs();

    /**
     * Instead of a raw subtitle string, you may optionally specify a key for a localized string in your app's Localizable.strings file.
     */
    @Generated
    @Selector("subtitleLocalizationKey")
    public native String subtitleLocalizationKey();

    /**
     * Optional title of the alert to display in a push notification.
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * A list of field names to take from the matching record that is used as substitution variables in a formatted title string.
     */
    @Generated
    @Selector("titleLocalizationArgs")
    public native NSArray<String> titleLocalizationArgs();

    /**
     * Instead of a raw title string, you may optionally specify a key for a localized string in your app's Localizable.strings file.
     */
    @Generated
    @Selector("titleLocalizationKey")
    public native String titleLocalizationKey();

    /**
     * The user recordID of the owner of the subscription for which this notification was generated
     */
    @Generated
    @Selector("subscriptionOwnerUserRecordID")
    public native CKRecordID subscriptionOwnerUserRecordID();
}
