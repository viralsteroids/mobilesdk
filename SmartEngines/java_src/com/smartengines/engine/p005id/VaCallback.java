package com.smartengines.engine.p005id;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.smartengines.p006id.IdCheckStatus;
import com.smartengines.p006id.IdFaceLivenessResult;
import com.smartengines.p006id.IdFaceSimilarityResult;
import com.smartengines.p006id.IdResult;
import com.smartengines.p006id.IdVideoAuthenticationAnomaly;
import com.smartengines.p006id.IdVideoAuthenticationCallbacks;
import com.smartengines.p006id.IdVideoAuthenticationInstruction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VaCallback.kt */
@Metadata(m513d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\u0012\u0010\u001b\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016R\u001f\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006&"}, m514d2 = {"Lcom/smartengines/engine/id/VaCallback;", "Lcom/smartengines/id/IdVideoAuthenticationCallbacks;", "onInstruction", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getOnInstruction", "()Lkotlin/jvm/functions/Function1;", "sessionEnded", "", "getSessionEnded", "()Z", "setSessionEnded", "(Z)V", "InstructionReceived", "p0", "", "instr", "Lcom/smartengines/id/IdVideoAuthenticationInstruction;", "MessageReceived", "message", "AuthenticationStatusUpdated", NotificationCompat.CATEGORY_STATUS, "Lcom/smartengines/id/IdCheckStatus;", "GlobalTimeoutReached", "DocumentResultUpdated", "Lcom/smartengines/id/IdResult;", "FaceLivenessResultUpdated", "Lcom/smartengines/id/IdFaceLivenessResult;", "FaceMatchingResultUpdated", "Lcom/smartengines/id/IdFaceSimilarityResult;", "AnomalyRegistered", "p1", "Lcom/smartengines/id/IdVideoAuthenticationAnomaly;", "InstructionTimeoutReached", "SessionEnded", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class VaCallback extends IdVideoAuthenticationCallbacks {
    private final Function1<String, Unit> onInstruction;
    private boolean sessionEnded;

    public final Function1<String, Unit> getOnInstruction() {
        return this.onInstruction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VaCallback(Function1<? super String, Unit> onInstruction) {
        Intrinsics.checkNotNullParameter(onInstruction, "onInstruction");
        this.onInstruction = onInstruction;
    }

    public final boolean getSessionEnded() {
        return this.sessionEnded;
    }

    public final void setSessionEnded(boolean z) {
        this.sessionEnded = z;
    }

    @Override // com.smartengines.p006id.IdVideoAuthenticationCallbacks
    public void InstructionReceived(int p0, IdVideoAuthenticationInstruction instr) {
        Intrinsics.checkNotNullParameter(instr, "instr");
        String strGetInstructionCode = instr.GetInstructionCode();
        Log.d("myapp.VaCallback", "   ---> InstructionReceived " + p0 + ' ' + strGetInstructionCode);
        this.onInstruction.invoke(strGetInstructionCode);
    }

    @Override // com.smartengines.p006id.IdVideoAuthenticationCallbacks
    public void MessageReceived(String message) {
        Log.d("myapp.VaCallback", "   ---> MessageReceived " + message);
    }

    @Override // com.smartengines.p006id.IdVideoAuthenticationCallbacks
    public void AuthenticationStatusUpdated(IdCheckStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Log.d("myapp.VaCallback", "   ---> AuthenticationStatusUpdated " + status);
    }

    @Override // com.smartengines.p006id.IdVideoAuthenticationCallbacks
    public void GlobalTimeoutReached() {
        Log.d("myapp.VaCallback", "   ---> GlobalTimeoutReached");
    }

    @Override // com.smartengines.p006id.IdVideoAuthenticationCallbacks
    public void DocumentResultUpdated(IdResult p0) {
        Log.d("myapp.VaCallback", "   ---> DocumentResultUpdated");
    }

    @Override // com.smartengines.p006id.IdVideoAuthenticationCallbacks
    public void FaceLivenessResultUpdated(IdFaceLivenessResult p0) {
        Log.d("myapp.VaCallback", "   ---> FaceLivenessResultUpdated");
    }

    @Override // com.smartengines.p006id.IdVideoAuthenticationCallbacks
    public void FaceMatchingResultUpdated(IdFaceSimilarityResult p0) {
        Log.d("myapp.VaCallback", "   ---> FaceMatchingResultUpdated");
    }

    @Override // com.smartengines.p006id.IdVideoAuthenticationCallbacks
    public void AnomalyRegistered(int p0, IdVideoAuthenticationAnomaly p1) {
        Log.d("myapp.VaCallback", "   ---> AnomalyRegistered");
    }

    @Override // com.smartengines.p006id.IdVideoAuthenticationCallbacks
    public void InstructionTimeoutReached() {
        Log.d("myapp.VaCallback", "   ---> InstructionTimeoutReached");
    }

    @Override // com.smartengines.p006id.IdVideoAuthenticationCallbacks
    public void SessionEnded() {
        Log.e("myapp.VaCallback", "   ---> SessionEnded");
        this.sessionEnded = true;
    }
}
