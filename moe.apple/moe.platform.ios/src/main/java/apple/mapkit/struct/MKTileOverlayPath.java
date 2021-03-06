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

package apple.mapkit.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;

@Generated
@Structure()
public final class MKTileOverlayPath extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public MKTileOverlayPath() {
        super(MKTileOverlayPath.class);
    }

    @Generated
    protected MKTileOverlayPath(Pointer peer) {
        super(peer);
    }

    @Generated
    public MKTileOverlayPath(@NInt long x, @NInt long y, @NInt long z, @NFloat double contentScaleFactor) {
        super(MKTileOverlayPath.class);
        setX(x);
        setY(y);
        setZ(z);
        setContentScaleFactor(contentScaleFactor);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NInt
    public native long x();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setX(@NInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NInt
    public native long y();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setY(@NInt long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @NInt
    public native long z();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setZ(@NInt long value);

    /**
     * The screen scale that the tile will be shown on. Either 1.0 or 2.0.
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @NFloat
    public native double contentScaleFactor();

    /**
     * The screen scale that the tile will be shown on. Either 1.0 or 2.0.
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setContentScaleFactor(@NFloat double value);
}
