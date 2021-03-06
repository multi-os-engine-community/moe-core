package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class routines_command_64 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public routines_command_64() {
        super(routines_command_64.class);
    }

    @Generated
    protected routines_command_64(Pointer peer) {
        super(peer);
    }

    /**
     * LC_ROUTINES_64
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_ROUTINES_64
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * total size of this command
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * total size of this command
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    /**
     * address of initialization routine
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long init_address();

    /**
     * address of initialization routine
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setInit_address(long value);

    /**
     * index into the module table that
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long init_module();

    /**
     * index into the module table that
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setInit_module(long value);

    /**
     * the init routine is defined in
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long reserved1();

    /**
     * the init routine is defined in
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setReserved1(long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long reserved2();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setReserved2(long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native long reserved3();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setReserved3(long value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native long reserved4();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setReserved4(long value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native long reserved5();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setReserved5(long value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native long reserved6();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setReserved6(long value);
}