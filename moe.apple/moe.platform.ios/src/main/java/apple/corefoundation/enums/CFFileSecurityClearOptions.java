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

package apple.corefoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * values to pass in the clearPropertyMask to CFFileSecurityClearProperties
 */
@Generated
public final class CFFileSecurityClearOptions {
    @Generated @NUInt public static final long Owner = 0x0000000000000001L;
    @Generated @NUInt public static final long Group = 0x0000000000000002L;
    @Generated @NUInt public static final long Mode = 0x0000000000000004L;
    @Generated @NUInt public static final long OwnerUUID = 0x0000000000000008L;
    @Generated @NUInt public static final long GroupUUID = 0x0000000000000010L;
    @Generated @NUInt public static final long AccessControlList = 0x0000000000000020L;

    @Generated
    private CFFileSecurityClearOptions() {
    }
}
