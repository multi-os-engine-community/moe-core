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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIEventSubtype {
    /**
     * available in iPhone OS 3.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * for UIEventTypeMotion, available in iPhone OS 3.0
     */
    @Generated @NInt public static final long MotionShake = 0x0000000000000001L;
    /**
     * for UIEventTypeRemoteControl, available in iOS 4.0
     */
    @Generated @NInt public static final long RemoteControlPlay = 0x0000000000000064L;
    /**
     * for UIEventTypeRemoteControl, available in iOS 4.0
     */
    @Generated @NInt public static final long RemoteControlPause = 0x0000000000000065L;
    /**
     * for UIEventTypeRemoteControl, available in iOS 4.0
     */
    @Generated @NInt public static final long RemoteControlStop = 0x0000000000000066L;
    /**
     * for UIEventTypeRemoteControl, available in iOS 4.0
     */
    @Generated @NInt public static final long RemoteControlTogglePlayPause = 0x0000000000000067L;
    /**
     * for UIEventTypeRemoteControl, available in iOS 4.0
     */
    @Generated @NInt public static final long RemoteControlNextTrack = 0x0000000000000068L;
    /**
     * for UIEventTypeRemoteControl, available in iOS 4.0
     */
    @Generated @NInt public static final long RemoteControlPreviousTrack = 0x0000000000000069L;
    /**
     * for UIEventTypeRemoteControl, available in iOS 4.0
     */
    @Generated @NInt public static final long RemoteControlBeginSeekingBackward = 0x000000000000006AL;
    /**
     * for UIEventTypeRemoteControl, available in iOS 4.0
     */
    @Generated @NInt public static final long RemoteControlEndSeekingBackward = 0x000000000000006BL;
    /**
     * for UIEventTypeRemoteControl, available in iOS 4.0
     */
    @Generated @NInt public static final long RemoteControlBeginSeekingForward = 0x000000000000006CL;
    /**
     * for UIEventTypeRemoteControl, available in iOS 4.0
     */
    @Generated @NInt public static final long RemoteControlEndSeekingForward = 0x000000000000006DL;

    @Generated
    private UIEventSubtype() {
    }
}
