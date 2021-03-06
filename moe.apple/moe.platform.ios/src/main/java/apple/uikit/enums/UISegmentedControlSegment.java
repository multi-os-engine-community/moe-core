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
public final class UISegmentedControlSegment {
    @Generated @NInt public static final long Any = 0x0000000000000000L;
    /**
     * The capped, leftmost segment. Only applies when numSegments > 1.
     */
    @Generated @NInt public static final long Left = 0x0000000000000001L;
    /**
     * Any segment between the left and rightmost segments. Only applies when numSegments > 2.
     */
    @Generated @NInt public static final long Center = 0x0000000000000002L;
    /**
     * The capped,rightmost segment. Only applies when numSegments > 1.
     */
    @Generated @NInt public static final long Right = 0x0000000000000003L;
    /**
     * The standalone segment, capped on both ends. Only applies when numSegments = 1.
     */
    @Generated @NInt public static final long Alone = 0x0000000000000004L;

    @Generated
    private UISegmentedControlSegment() {
    }
}
