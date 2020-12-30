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

package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum          HKWheelchairUse
 * @abstract      This enumerated type is used to represent whether the user uses a wheelchair.
 * 
 * @constant      HKWheelchairUseNo      The user does not use a wheelchair.
 * @constant      HKWheelchairUseYes     The user does use a wheelchair.
 */
@Generated
public final class HKWheelchairUse {
    @Generated @NInt public static final long NotSet = 0x0000000000000000L;
    @Generated @NInt public static final long No = 0x0000000000000001L;
    @Generated @NInt public static final long Yes = 0x0000000000000002L;

    @Generated
    private HKWheelchairUse() {
    }
}
