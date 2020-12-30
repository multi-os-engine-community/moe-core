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
public final class UIDeviceOrientation {
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * Device oriented vertically, home button on the bottom
     */
    @Generated @NInt public static final long Portrait = 0x0000000000000001L;
    /**
     * Device oriented vertically, home button on the top
     */
    @Generated @NInt public static final long PortraitUpsideDown = 0x0000000000000002L;
    /**
     * Device oriented horizontally, home button on the right
     */
    @Generated @NInt public static final long LandscapeLeft = 0x0000000000000003L;
    /**
     * Device oriented horizontally, home button on the left
     */
    @Generated @NInt public static final long LandscapeRight = 0x0000000000000004L;
    /**
     * Device oriented flat, face up
     */
    @Generated @NInt public static final long FaceUp = 0x0000000000000005L;
    /**
     * Device oriented flat, face down
     */
    @Generated @NInt public static final long FaceDown = 0x0000000000000006L;

    @Generated
    private UIDeviceOrientation() {
    }
}
