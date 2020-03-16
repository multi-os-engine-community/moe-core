package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ASExtensionErrorCode {
    @Generated
    private ASExtensionErrorCode() {
    }

    @Generated @NInt public static final long Failed = 0x0000000000000000L;
    @Generated @NInt public static final long UserCanceled = 0x0000000000000001L;
    @Generated @NInt public static final long UserInteractionRequired = 0x0000000000000064L;
    @Generated @NInt public static final long CredentialIdentityNotFound = 0x0000000000000065L;
}