package com.smartengines.engine.p005id;

import android.graphics.Bitmap;
import android.util.Log;
import com.smartengines.common.StringsMapIterator;
import com.smartengines.engine.ImageFactory;
import com.smartengines.engine.Result;
import com.smartengines.engine.Session;
import com.smartengines.p006id.IdEngine;
import com.smartengines.p006id.IdFaceSession;
import com.smartengines.p006id.IdFaceSessionSettings;
import com.smartengines.utils.UtilsKt;
import com.smartengines.visualization.Visualization;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LvSessionWrapper.kt */
@Metadata(m513d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020#H\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006+"}, m514d2 = {"Lcom/smartengines/engine/id/LvSessionWrapper;", "Lcom/smartengines/engine/Session;", "idEngine", "Lcom/smartengines/id/IdEngine;", "lvSettings", "Lcom/smartengines/id/IdFaceSessionSettings;", "signature", "", "<init>", "(Lcom/smartengines/id/IdEngine;Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;)V", "lvSession", "Lcom/smartengines/id/IdFaceSession;", "getLvSession", "()Lcom/smartengines/id/IdFaceSession;", "isEnded", "", "()Z", "setEnded", "(Z)V", "instruction", "Lcom/smartengines/visualization/Visualization$Instruction;", "timer", "Lcom/smartengines/visualization/Visualization$Timer;", "steps", "Lcom/smartengines/visualization/Visualization$Steps;", "quads", "Lcom/smartengines/visualization/Visualization$Quads;", "visualizations", "", "Lcom/smartengines/visualization/Visualization;", "getVisualizations", "()Ljava/util/List;", "lvCallback", "Lcom/smartengines/engine/id/LvCallback;", "processImage", "", "bitmap", "Landroid/graphics/Bitmap;", "delete", "currentResult", "Lcom/smartengines/engine/Result;", "getCurrentResult", "()Lcom/smartengines/engine/Result;", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class LvSessionWrapper implements Session {
    private final Visualization.Instruction instruction;
    private boolean isEnded;
    private final LvCallback lvCallback;
    private final IdFaceSession lvSession;
    private final Visualization.Quads quads;
    private final Visualization.Steps steps;
    private final Visualization.Timer timer;
    private final List<Visualization> visualizations;

    public LvSessionWrapper(IdEngine idEngine, IdFaceSessionSettings lvSettings, String signature) {
        Intrinsics.checkNotNullParameter(idEngine, "idEngine");
        Intrinsics.checkNotNullParameter(lvSettings, "lvSettings");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Visualization.Instruction instruction = new Visualization.Instruction(null, 1, null);
        this.instruction = instruction;
        Visualization.Timer timer = new Visualization.Timer();
        this.timer = timer;
        Visualization.Steps steps = new Visualization.Steps(0, 1, null);
        this.steps = steps;
        Visualization.Quads quads = new Visualization.Quads(null, 1, null);
        this.quads = quads;
        this.visualizations = CollectionsKt.listOf((Object[]) new Visualization[]{instruction, timer, steps, quads});
        this.lvCallback = new LvCallback(timer, steps, quads);
        Log.d("myapp.LvSessionWrapper", "supportedLivenessInstructionsCount:    " + lvSettings.GetSupportedLivenessInstructionsCount());
        StringsMapIterator stringsMapIteratorSupportedLivenessInstructionsBegin = lvSettings.SupportedLivenessInstructionsBegin();
        StringsMapIterator stringsMapIteratorSupportedLivenessInstructionsEnd = lvSettings.SupportedLivenessInstructionsEnd();
        while (!stringsMapIteratorSupportedLivenessInstructionsBegin.Equals(stringsMapIteratorSupportedLivenessInstructionsEnd)) {
            Log.d("myapp.LvSessionWrapper", " = supportedLivenessInstruction:    " + stringsMapIteratorSupportedLivenessInstructionsBegin.GetKey() + " : " + stringsMapIteratorSupportedLivenessInstructionsBegin.GetValue());
            stringsMapIteratorSupportedLivenessInstructionsBegin.Advance();
        }
        IdFaceSession idFaceSessionSpawnFaceSession = idEngine.SpawnFaceSession(lvSettings, signature, this.lvCallback);
        this.lvSession = idFaceSessionSpawnFaceSession;
        Log.w("myapp.LvSessionWrapper", "Session created   instructionsCount: " + idFaceSessionSpawnFaceSession.GetInstructionsCount());
        this.steps.reset((int) idFaceSessionSpawnFaceSession.GetInstructionsCount());
    }

    public final IdFaceSession getLvSession() {
        return this.lvSession;
    }

    @Override // com.smartengines.engine.Session
    /* renamed from: isEnded, reason: from getter */
    public boolean getIsEnded() {
        return this.isEnded;
    }

    public void setEnded(boolean z) {
        this.isEnded = z;
    }

    @Override // com.smartengines.engine.Session
    public List<Visualization> getVisualizations() {
        return this.visualizations;
    }

    @Override // com.smartengines.engine.Session
    public void processImage(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.quads.setFrameSize(UtilsKt.getSize(bitmap));
        this.lvSession.AddFaceImage(ImageFactory.INSTANCE.imageFromBitmap(bitmap));
        String strGetLivenessInstruction = this.lvSession.GetLivenessResult().GetLivenessInstruction();
        Log.d("myapp.LvSessionWrapper", " ---> instruction: " + strGetLivenessInstruction);
        this.instruction.update(strGetLivenessInstruction);
        if (Intrinsics.areEqual(strGetLivenessInstruction, "CT")) {
            setEnded(true);
        }
    }

    @Override // com.smartengines.engine.Session
    public void delete() {
        this.lvSession.delete();
        Log.w("myapp.LvSessionWrapper", "Session deleted");
    }

    @Override // com.smartengines.engine.Session
    public Result getCurrentResult() {
        return new LvResultData(this.lvSession.GetLivenessResult().GetLivenessEstimation());
    }
}
