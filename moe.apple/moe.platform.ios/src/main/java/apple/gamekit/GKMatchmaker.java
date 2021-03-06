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

package apple.gamekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * GKMatchmaker is a singleton object to manage match creation from invites and auto-matching.
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKMatchmaker extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKMatchmaker(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKMatchmaker alloc();

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

    /**
     * The shared matchmaker
     */
    @Generated
    @Selector("sharedMatchmaker")
    public static native GKMatchmaker sharedMatchmaker();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Auto-matching or invites to add additional players to a peer-to-peer match for the specified request. Error will be nil on success:
     * Possible reasons for error:
     * 1. Communications failure
     * 2. Timeout
     */
    @Generated
    @Selector("addPlayersToMatch:matchRequest:completionHandler:")
    public native void addPlayersToMatchMatchRequestCompletionHandler(GKMatch match, GKMatchRequest matchRequest,
            @ObjCBlock(name = "call_addPlayersToMatchMatchRequestCompletionHandler") Block_addPlayersToMatchMatchRequestCompletionHandler completionHandler);

    /**
     * Cancel matchmaking and any pending invites
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     */
    @Generated
    @Deprecated
    @Selector("cancelInviteToPlayer:")
    public native void cancelInviteToPlayer(String playerID);

    /**
     * Cancel a pending invitation to a player
     */
    @Generated
    @Selector("cancelPendingInviteToPlayer:")
    public native void cancelPendingInviteToPlayer(GKPlayer player);

    /**
     * Auto-matching or invites to find a peer-to-peer match for the specified request. Error will be nil on success:
     * Possible reasons for error:
     * 1. Communications failure
     * 2. Unauthenticated player
     * 3. Timeout
     * Note that the players property on the returned GKMatch instance will only contain connected players. It will initially be empty as players are connecting. Implement the GKMatchDelegate method match:player:didChangeConnectionState: to listen for updates to the GKMatch instance's players property.
     */
    @Generated
    @Selector("findMatchForRequest:withCompletionHandler:")
    public native void findMatchForRequestWithCompletionHandler(GKMatchRequest request,
            @ObjCBlock(name = "call_findMatchForRequestWithCompletionHandler") Block_findMatchForRequestWithCompletionHandler completionHandler);

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     */
    @Generated
    @Deprecated
    @Selector("findPlayersForHostedMatchRequest:withCompletionHandler:")
    public native void findPlayersForHostedMatchRequestWithCompletionHandler(GKMatchRequest request,
            @ObjCBlock(name = "call_findPlayersForHostedMatchRequestWithCompletionHandler") Block_findPlayersForHostedMatchRequestWithCompletionHandler completionHandler);

    /**
     * Auto-matching or invites for host-client match request. This returns a list of player identifiers to be included in the match. Determination and communication with the host is not part of this API.
     * When inviting, no player identifiers will be returned. Player responses will be reported via the inviteeResponseHandler.
     * Possible reasons for error:
     * 1. Communications failure
     * 2. Unauthenticated player
     * 3. Timeout
     */
    @Generated
    @Selector("findPlayersForHostedRequest:withCompletionHandler:")
    public native void findPlayersForHostedRequestWithCompletionHandler(GKMatchRequest request,
            @ObjCBlock(name = "call_findPlayersForHostedRequestWithCompletionHandler") Block_findPlayersForHostedRequestWithCompletionHandler completionHandler);

    /**
     * Call this when finished with all programmatic P2P invites/matchmaking, for compatability with connected players using GKMatchmakerViewController.
     */
    @Generated
    @Selector("finishMatchmakingForMatch:")
    public native void finishMatchmakingForMatch(GKMatch match);

    @Generated
    @Selector("init")
    public native GKMatchmaker init();

    @Generated
    @Deprecated
    @Selector("inviteHandler")
    @ObjCBlock(name = "call_inviteHandler_ret")
    public native Block_inviteHandler_ret inviteHandler();

    /**
     * Get a match for an accepted invite
     * Possible reasons for error:
     * 1. Communications failure
     * 2. Invite cancelled
     */
    @Generated
    @Selector("matchForInvite:completionHandler:")
    public native void matchForInviteCompletionHandler(GKInvite invite,
            @ObjCBlock(name = "call_matchForInviteCompletionHandler") Block_matchForInviteCompletionHandler completionHandler);

    /**
     * Query the server for recent activity for all the player groups of that game. Error will be nil on success.
     * Possible reasons for error:
     * 1. Communications failure
     */
    @Generated
    @Selector("queryActivityWithCompletionHandler:")
    public native void queryActivityWithCompletionHandler(
            @ObjCBlock(name = "call_queryActivityWithCompletionHandler") Block_queryActivityWithCompletionHandler completionHandler);

    /**
     * Query the server for recent activity in the specified player group. A larger value indicates that a given group has seen more recent activity. Error will be nil on success.
     * Possible reasons for error:
     * 1. Communications failure
     */
    @Generated
    @Selector("queryPlayerGroupActivity:withCompletionHandler:")
    public native void queryPlayerGroupActivityWithCompletionHandler(@NUInt long playerGroup,
            @ObjCBlock(name = "call_queryPlayerGroupActivityWithCompletionHandler") Block_queryPlayerGroupActivityWithCompletionHandler completionHandler);

    @Generated
    @Deprecated
    @Selector("setInviteHandler:")
    public native void setInviteHandler(@ObjCBlock(name = "call_setInviteHandler") Block_setInviteHandler value);

    /**
     * Start browsing for nearby players that can be invited to a match. The reachableHandler will be called for each player found with a compatible game. It may be called more than once for the same player if that player ever becomes unreachable (e.g. moves out of range). You should call stopBrowsingForNearbyPlayers when finished browsing.
     */
    @Generated
    @Selector("startBrowsingForNearbyPlayersWithHandler:")
    public native void startBrowsingForNearbyPlayersWithHandler(
            @ObjCBlock(name = "call_startBrowsingForNearbyPlayersWithHandler") Block_startBrowsingForNearbyPlayersWithHandler reachableHandler);

    /**
     * This method is obsolete. It will never be invoked and its implementation does nothing**
     */
    @Generated
    @Deprecated
    @Selector("startBrowsingForNearbyPlayersWithReachableHandler:")
    public native void startBrowsingForNearbyPlayersWithReachableHandler(
            @ObjCBlock(name = "call_startBrowsingForNearbyPlayersWithReachableHandler") Block_startBrowsingForNearbyPlayersWithReachableHandler reachableHandler);

    /**
     * Stop browsing for nearby players.
     */
    @Generated
    @Selector("stopBrowsingForNearbyPlayers")
    public native void stopBrowsingForNearbyPlayers();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addPlayersToMatchMatchRequestCompletionHandler {
        @Generated
        void call_addPlayersToMatchMatchRequestCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_findMatchForRequestWithCompletionHandler {
        @Generated
        void call_findMatchForRequestWithCompletionHandler(GKMatch match, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_findPlayersForHostedMatchRequestWithCompletionHandler {
        @Generated
        void call_findPlayersForHostedMatchRequestWithCompletionHandler(NSArray<String> playerIDs, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_findPlayersForHostedRequestWithCompletionHandler {
        @Generated
        void call_findPlayersForHostedRequestWithCompletionHandler(NSArray<? extends GKPlayer> players, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_inviteHandler_ret {
        @Generated
        void call_inviteHandler_ret(GKInvite arg0, NSArray<?> arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_matchForInviteCompletionHandler {
        @Generated
        void call_matchForInviteCompletionHandler(GKMatch match, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryActivityWithCompletionHandler {
        @Generated
        void call_queryActivityWithCompletionHandler(@NInt long activity, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryPlayerGroupActivityWithCompletionHandler {
        @Generated
        void call_queryPlayerGroupActivityWithCompletionHandler(@NInt long activity, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setInviteHandler {
        @Generated
        void call_setInviteHandler(GKInvite arg0, NSArray<?> arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startBrowsingForNearbyPlayersWithHandler {
        @Generated
        void call_startBrowsingForNearbyPlayersWithHandler(GKPlayer player, boolean reachable);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startBrowsingForNearbyPlayersWithReachableHandler {
        @Generated
        void call_startBrowsingForNearbyPlayersWithReachableHandler(String playerID, boolean reachable);
    }
}
