package apple.vision.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class VNElementType {
    @Generated
    private VNElementType() {
    }

    @Generated @NUInt public static final long Unknown = 0x0000000000000000L;
    /**
     * IEEE 754 single-precision floating point value
     */
    @Generated @NUInt public static final long Float = 0x0000000000000001L;
    /**
     * IEEE 754 double-precision floating point value
     */
    @Generated @NUInt public static final long Double = 0x0000000000000002L;
}