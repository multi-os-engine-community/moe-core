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

package apple.audiotoolbox.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 1)
public final class CAFRegion extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CAFRegion() {
        super(CAFRegion.class);
    }

    @Generated
    protected CAFRegion(Pointer peer) {
        super(peer);
    }

    @Generated
    public CAFRegion(int mRegionID, int mFlags, int mNumberMarkers, @ByValue CAFMarker mMarkers) {
        super(CAFRegion.class);
        setMRegionID(mRegionID);
        setMFlags(mFlags);
        setMNumberMarkers(mNumberMarkers);
        setMMarkers(mMarkers);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int mRegionID();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMRegionID(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mFlags();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMFlags(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mNumberMarkers();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMNumberMarkers(int value);

    /**
     * this is a variable length array of mNumberMarkers elements
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native CAFMarker mMarkers();

    /**
     * this is a variable length array of mNumberMarkers elements
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMMarkers(@ByValue CAFMarker value);
}
