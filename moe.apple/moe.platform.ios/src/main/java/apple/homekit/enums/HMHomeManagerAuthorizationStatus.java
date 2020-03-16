package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class HMHomeManagerAuthorizationStatus {
    @Generated
    private HMHomeManagerAuthorizationStatus() {
    }

    @Generated @NUInt public static final long Determined = 0x0000000000000001L;
    @Generated @NUInt public static final long Restricted = 0x0000000000000002L;
    @Generated @NUInt public static final long Authorized = 0x0000000000000004L;
}