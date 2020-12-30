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

package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * @enum MTLPurgeableOption
 * @abstract Options for setPurgeable call.
 * 
 * @constant MTLPurgeableStateNonVolatile
 * The contents of this resource may not be discarded.
 * 
 * @constant MTLPurgeableStateVolatile
 * The contents of this resource may be discarded.
 * 
 * @constant MTLPurgeableStateEmpty
 * The contents of this are discarded.
 * 
 * @constant MTLPurgeableStateKeepCurrent
 * The purgeabelity state is not changed.
 */
@Generated
public final class MTLPurgeableState {
    @Generated @NUInt public static final long KeepCurrent = 0x0000000000000001L;
    @Generated @NUInt public static final long NonVolatile = 0x0000000000000002L;
    @Generated @NUInt public static final long Volatile = 0x0000000000000003L;
    @Generated @NUInt public static final long Empty = 0x0000000000000004L;

    @Generated
    private MTLPurgeableState() {
    }
}
