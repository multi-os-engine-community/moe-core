package apple.uikit.protocol;

import apple.foundation.NSUserActivity;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIUserActivityRestoring")
public interface UIUserActivityRestoring {
    @Generated
    @Selector("restoreUserActivityState:")
    void restoreUserActivityState(NSUserActivity userActivity);
}