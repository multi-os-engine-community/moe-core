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

package apple.spritekit;

import apple.NSObject;
import apple.coreimage.CIFilter;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.uikit.UIColor;
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
 * A transition style from one scene to another.
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKTransition extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected SKTransition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKTransition alloc();

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
    @Selector("crossFadeWithDuration:")
    public static native SKTransition crossFadeWithDuration(double sec);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("doorsCloseHorizontalWithDuration:")
    public static native SKTransition doorsCloseHorizontalWithDuration(double sec);

    @Generated
    @Selector("doorsCloseVerticalWithDuration:")
    public static native SKTransition doorsCloseVerticalWithDuration(double sec);

    @Generated
    @Selector("doorsOpenHorizontalWithDuration:")
    public static native SKTransition doorsOpenHorizontalWithDuration(double sec);

    @Generated
    @Selector("doorsOpenVerticalWithDuration:")
    public static native SKTransition doorsOpenVerticalWithDuration(double sec);

    @Generated
    @Selector("doorwayWithDuration:")
    public static native SKTransition doorwayWithDuration(double sec);

    @Generated
    @Selector("fadeWithColor:duration:")
    public static native SKTransition fadeWithColorDuration(UIColor color, double sec);

    @Generated
    @Selector("fadeWithDuration:")
    public static native SKTransition fadeWithDuration(double sec);

    @Generated
    @Selector("flipHorizontalWithDuration:")
    public static native SKTransition flipHorizontalWithDuration(double sec);

    @Generated
    @Selector("flipVerticalWithDuration:")
    public static native SKTransition flipVerticalWithDuration(double sec);

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
    @Selector("moveInWithDirection:duration:")
    public static native SKTransition moveInWithDirectionDuration(@NInt long direction, double sec);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("pushWithDirection:duration:")
    public static native SKTransition pushWithDirectionDuration(@NInt long direction, double sec);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("revealWithDirection:duration:")
    public static native SKTransition revealWithDirectionDuration(@NInt long direction, double sec);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Create a transition with a CIFilter. The filter must be a transition filter which requires only two images (inputImage, inputTargetImage) and generates a single image (outputImage). SpriteKit sets the inputImage, inputTargetImage, and inputTime properties when rendering, all others must be setup beforehand.
     */
    @Generated
    @Selector("transitionWithCIFilter:duration:")
    public static native SKTransition transitionWithCIFilterDuration(CIFilter filter, double sec);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("init")
    public native SKTransition init();

    /**
     * Pause the incoming Scene during the transition, defaults to YES.
     */
    @Generated
    @Selector("pausesIncomingScene")
    public native boolean pausesIncomingScene();

    /**
     * Pause the outgoing Scene during the transition, defaults to YES.
     */
    @Generated
    @Selector("pausesOutgoingScene")
    public native boolean pausesOutgoingScene();

    /**
     * Pause the incoming Scene during the transition, defaults to YES.
     */
    @Generated
    @Selector("setPausesIncomingScene:")
    public native void setPausesIncomingScene(boolean value);

    /**
     * Pause the outgoing Scene during the transition, defaults to YES.
     */
    @Generated
    @Selector("setPausesOutgoingScene:")
    public native void setPausesOutgoingScene(boolean value);
}
