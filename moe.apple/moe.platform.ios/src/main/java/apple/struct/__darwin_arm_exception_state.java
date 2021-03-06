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

package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class __darwin_arm_exception_state extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public __darwin_arm_exception_state() {
        super(__darwin_arm_exception_state.class);
    }

    @Generated
    protected __darwin_arm_exception_state(Pointer peer) {
        super(peer);
    }

    @Generated
    public __darwin_arm_exception_state(int __exception, int __fsr, int __far) {
        super(__darwin_arm_exception_state.class);
        set__exception(__exception);
        set__fsr(__fsr);
        set__far(__far);
    }

    /**
     * number of arm exception taken
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int __exception();

    /**
     * number of arm exception taken
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void set__exception(int value);

    /**
     * Fault status
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int __fsr();

    /**
     * Fault status
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void set__fsr(int value);

    /**
     * Virtual Fault Address
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int __far();

    /**
     * Virtual Fault Address
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void set__far(int value);
}
