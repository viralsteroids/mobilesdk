package com.smartengines.app;

import com.smartengines.engine.RecognitionTarget;
import com.smartengines.engine.SessionType;
import com.smartengines.targets.code.CodeTargets;
import kotlin.Metadata;

/* compiled from: CameraButtonsModel.kt */
@Metadata(m513d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¨\u0006\u0007"}, m514d2 = {"calculateCropState", "", "target", "Lcom/smartengines/engine/RecognitionTarget;", "isVideoMode", "calculateIsGalleryAllowed", "isCrop", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CameraButtonsModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean calculateCropState(RecognitionTarget recognitionTarget, boolean z) {
        return recognitionTarget instanceof CodeTargets.PaymentDetails ? z : (recognitionTarget instanceof CodeTargets.CodeTextLineNumbers) || (recognitionTarget instanceof CodeTargets.CodeTextLineIban) || (recognitionTarget instanceof CodeTargets.CodeTextLinePhone) || (recognitionTarget instanceof CodeTargets.CodeTextLinePhoneCis) || (recognitionTarget instanceof CodeTargets.CodeTextLineCardNumber) || (recognitionTarget instanceof CodeTargets.CodeTextLineInn) || (recognitionTarget instanceof CodeTargets.CodeTextLineKpp) || (recognitionTarget instanceof CodeTargets.CodeTextLineBic) || (recognitionTarget instanceof CodeTargets.CodeTextLineBankAccount) || (recognitionTarget instanceof CodeTargets.CodeTextLineVin) || (recognitionTarget instanceof CodeTargets.CodeTextLineContainerNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean calculateIsGalleryAllowed(RecognitionTarget recognitionTarget, boolean z) {
        if (!recognitionTarget.getSessionTypes().contains(SessionType.GALLERY_SESSION)) {
            return false;
        }
        if (z) {
            return recognitionTarget instanceof CodeTargets.PaymentDetails;
        }
        return true;
    }
}
