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
public final class BNNSLayerParametersLossHuber extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public BNNSLayerParametersLossHuber() {
        super(BNNSLayerParametersLossHuber.class);
    }

    @Generated
    protected BNNSLayerParametersLossHuber(Pointer peer) {
        super(peer);
    }

    /**
     * Fields layout compatible with BNNSLayerParametersLoseBase
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int function();

    /**
     * Fields layout compatible with BNNSLayerParametersLoseBase
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFunction(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor i_desc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setI_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native BNNSNDArrayDescriptor o_desc();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setO_desc(@ByValue BNNSNDArrayDescriptor value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int reduction();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setReduction(int value);

    /**
     * Fields specific to Huber Loss
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native float huber_delta();

    /**
     * Fields specific to Huber Loss
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setHuber_delta(float value);
}