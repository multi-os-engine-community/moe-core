package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class BNNSLayerParametersPermute extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersPermute() {
        super(BNNSLayerParametersPermute.class);
    }

    @Generated
    protected BNNSLayerParametersPermute(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor i_desc();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setI_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor o_desc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setO_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 8)
    public native long permutation(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 8)
    public native void setPermutation(long value, int field_idx);
}