package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class symseg_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public symseg_command() {
        super(symseg_command.class);
    }

    @Generated
    protected symseg_command(Pointer peer) {
        super(peer);
    }

    @Generated
    public symseg_command(int cmd, int cmdsize, int offset, int size) {
        super(symseg_command.class);
        setCmd(cmd);
        setCmdsize(cmdsize);
        setOffset(offset);
        setSize(size);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int offset();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setOffset(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int size();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setSize(int value);
}