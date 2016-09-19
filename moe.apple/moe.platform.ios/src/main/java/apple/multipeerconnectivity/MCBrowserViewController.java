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

package apple.multipeerconnectivity;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.multipeerconnectivity.protocol.MCBrowserViewControllerDelegate;
import apple.multipeerconnectivity.protocol.MCNearbyServiceBrowserDelegate;
import apple.uikit.UIViewController;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MultipeerConnectivity")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MCBrowserViewController extends UIViewController implements MCNearbyServiceBrowserDelegate {
    static {
        NatJ.register();
    }

    @Generated
    protected MCBrowserViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MCBrowserViewController alloc();

    /**
     * browser</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCBrowserViewController_class/index.html#//apple_ref/occ/instp/MCBrowserViewController/browser">iOS Dev Center</a>
     */
    @Generated
    @Selector("browser")
    public native MCNearbyServiceBrowser browser();

    @Generated
    @IsOptional
    @Selector("browser:didNotStartBrowsingForPeers:")
    public native void browserDidNotStartBrowsingForPeers(MCNearbyServiceBrowser browser, NSError error);

    @Generated
    @Selector("browser:foundPeer:withDiscoveryInfo:")
    public native void browserFoundPeerWithDiscoveryInfo(MCNearbyServiceBrowser browser, MCPeerID peerID,
            NSDictionary<String, String> info);

    @Generated
    @Selector("browser:lostPeer:")
    public native void browserLostPeer(MCNearbyServiceBrowser browser, MCPeerID peerID);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCBrowserViewController_class/index.html#//apple_ref/occ/instp/MCBrowserViewController/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native MCBrowserViewControllerDelegate delegate();

    @Generated
    @Selector("init")
    public native MCBrowserViewController init();

    /**
     * initWithBrowser:session:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCBrowserViewController_class/index.html#//apple_ref/occ/instm/MCBrowserViewController/initWithBrowser:session:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithBrowser:session:")
    public native MCBrowserViewController initWithBrowserSession(MCNearbyServiceBrowser browser, MCSession session);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native MCBrowserViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * initWithServiceType:session:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCBrowserViewController_class/index.html#//apple_ref/occ/instm/MCBrowserViewController/initWithServiceType:session:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithServiceType:session:")
    public native MCBrowserViewController initWithServiceTypeSession(String serviceType, MCSession session);

    /**
     * maximumNumberOfPeers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCBrowserViewController_class/index.html#//apple_ref/occ/instp/MCBrowserViewController/maximumNumberOfPeers">iOS Dev Center</a>
     */
    @Generated
    @Selector("maximumNumberOfPeers")
    @NUInt
    public native long maximumNumberOfPeers();

    /**
     * minimumNumberOfPeers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCBrowserViewController_class/index.html#//apple_ref/occ/instp/MCBrowserViewController/minimumNumberOfPeers">iOS Dev Center</a>
     */
    @Generated
    @Selector("minimumNumberOfPeers")
    @NUInt
    public native long minimumNumberOfPeers();

    /**
     * session</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCBrowserViewController_class/index.html#//apple_ref/occ/instp/MCBrowserViewController/session">iOS Dev Center</a>
     */
    @Generated
    @Selector("session")
    public native MCSession session();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCBrowserViewController_class/index.html#//apple_ref/occ/instp/MCBrowserViewController/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) MCBrowserViewControllerDelegate value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCBrowserViewController_class/index.html#//apple_ref/occ/instp/MCBrowserViewController/delegate">iOS Dev Center</a>
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) MCBrowserViewControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * maximumNumberOfPeers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCBrowserViewController_class/index.html#//apple_ref/occ/instp/MCBrowserViewController/maximumNumberOfPeers">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaximumNumberOfPeers:")
    public native void setMaximumNumberOfPeers(@NUInt long value);

    /**
     * minimumNumberOfPeers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MultipeerConnectivity/Reference/MCBrowserViewController_class/index.html#//apple_ref/occ/instp/MCBrowserViewController/minimumNumberOfPeers">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMinimumNumberOfPeers:")
    public native void setMinimumNumberOfPeers(@NUInt long value);

    @Generated
    @Selector("initWithCoder:")
    public native MCBrowserViewController initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    @Selector("prepareInterstitialAds")
    public static native void prepareInterstitialAds();

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
}