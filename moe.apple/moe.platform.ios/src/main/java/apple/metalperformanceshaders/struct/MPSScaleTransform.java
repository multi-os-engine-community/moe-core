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

package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MPSScaleTransform extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public MPSScaleTransform() {
        super(MPSScaleTransform.class);
    }

    @Generated
    protected MPSScaleTransform(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSScaleTransform(double scaleX, double scaleY, double translateX, double translateY) {
        super(MPSScaleTransform.class);
        setScaleX(scaleX);
        setScaleY(scaleY);
        setTranslateX(translateX);
        setTranslateY(translateY);
    }

    /**
     * < horizontal scaling factor
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native double scaleX();

    /**
     * < horizontal scaling factor
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setScaleX(double value);

    /**
     * < vertical scaling factor
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native double scaleY();

    /**
     * < vertical scaling factor
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setScaleY(double value);

    /**
     * < horizontal translation
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native double translateX();

    /**
     * < horizontal translation
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setTranslateX(double value);

    /**
     * < vertical translation
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native double translateY();

    /**
     * < vertical translation
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTranslateY(double value);
}
