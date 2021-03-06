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

package apple.coretext.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class LtagTable extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public LtagTable() {
        super(LtagTable.class);
    }

    @Generated
    protected LtagTable(Pointer peer) {
        super(peer);
    }

    @Generated
    public LtagTable(int version, int flags, int numTags, @ByValue LtagStringRange tagRange) {
        super(LtagTable.class);
        setVersion(version);
        setFlags(flags);
        setNumTags(numTags);
        setTagRange(tagRange);
    }

    /**
     * 1
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int version();

    /**
     * 1
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(int value);

    /**
     * none currently defined
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int flags();

    /**
     * none currently defined
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFlags(int value);

    /**
     * number of language tags which follow
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int numTags();

    /**
     * number of language tags which follow
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setNumTags(int value);

    /**
     * first string range starts here
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native LtagStringRange tagRange();

    /**
     * first string range starts here
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTagRange(@ByValue LtagStringRange value);
}
