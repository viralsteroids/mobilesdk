package com.smartengines.app;

import com.smartengines.engine.RecognitionTarget;
import com.smartengines.engine.SessionType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: CameraButtonsModel.kt */
@Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m514d2 = {"Lcom/smartengines/app/CameraButtonsModel;", "", "<init>", "()V", "stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/smartengines/app/CameraButtonsState;", "getStateFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "target", "Lcom/smartengines/engine/RecognitionTarget;", "onTargetChanged", "", "switchIsVideoMode", "isVideoMode", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CameraButtonsModel {
    private static RecognitionTarget target;
    public static final CameraButtonsModel INSTANCE = new CameraButtonsModel();
    private static final MutableStateFlow<CameraButtonsState> stateFlow = StateFlowKt.MutableStateFlow(new CameraButtonsState(false, false, false, false, 15, null));
    public static final int $stable = 8;

    private CameraButtonsModel() {
    }

    public final MutableStateFlow<CameraButtonsState> getStateFlow() {
        return stateFlow;
    }

    public final void onTargetChanged(RecognitionTarget target2) {
        Intrinsics.checkNotNullParameter(target2, "target");
        target = target2;
        Set<SessionType> sessionTypes = target2.getSessionTypes();
        boolean z = CollectionsKt.first(sessionTypes) == SessionType.VIDEO_SESSION;
        boolean zCalculateCropState = CameraButtonsModelKt.calculateCropState(target2, z);
        stateFlow.setValue(new CameraButtonsState(zCalculateCropState, z, sessionTypes.contains(SessionType.VIDEO_SESSION) && sessionTypes.contains(SessionType.PHOTO_SESSION), CameraButtonsModelKt.calculateIsGalleryAllowed(target2, zCalculateCropState)));
    }

    public final void switchIsVideoMode(boolean isVideoMode) {
        MutableStateFlow<CameraButtonsState> mutableStateFlow = stateFlow;
        CameraButtonsState value = mutableStateFlow.getValue();
        RecognitionTarget recognitionTarget = target;
        if (recognitionTarget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("target");
            recognitionTarget = null;
        }
        mutableStateFlow.setValue(CameraButtonsState.copy$default(value, CameraButtonsModelKt.calculateCropState(recognitionTarget, isVideoMode), isVideoMode, false, false, 12, null));
    }
}
