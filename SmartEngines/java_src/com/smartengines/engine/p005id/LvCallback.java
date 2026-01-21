package com.smartengines.engine.p005id;

import android.util.Log;
import com.smartengines.p006id.IdFaceFeedback;
import com.smartengines.visualization.Quad;
import com.smartengines.visualization.QuadPoint;
import com.smartengines.visualization.Visualization;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: LvCallback.kt */
@Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m514d2 = {"Lcom/smartengines/engine/id/LvCallback;", "Lcom/smartengines/id/IdFaceFeedback;", "timer", "Lcom/smartengines/visualization/Visualization$Timer;", "steps", "Lcom/smartengines/visualization/Visualization$Steps;", "quads", "Lcom/smartengines/visualization/Visualization$Quads;", "<init>", "(Lcom/smartengines/visualization/Visualization$Timer;Lcom/smartengines/visualization/Visualization$Steps;Lcom/smartengines/visualization/Visualization$Quads;)V", "MessageReceived", "", "message", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class LvCallback extends IdFaceFeedback {
    private final Visualization.Quads quads;
    private final Visualization.Steps steps;
    private final Visualization.Timer timer;

    public LvCallback(Visualization.Timer timer, Visualization.Steps steps, Visualization.Quads quads) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(quads, "quads");
        this.timer = timer;
        this.steps = steps;
        this.quads = quads;
    }

    @Override // com.smartengines.p006id.IdFaceFeedback
    public void MessageReceived(String message) throws JSONException {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("myapp.LvCallback", "   ---> MessageReceived: " + message);
        if (StringsKt.startsWith$default(message, "StartInst:", false, 2, (Object) null)) {
            try {
                this.timer.start(Long.parseLong((String) StringsKt.split$default((CharSequence) message, new String[]{" "}, false, 0, 6, (Object) null).get(3)));
                return;
            } catch (Exception e) {
                Log.e("myapp.LvCallback", "Message parsing error", e);
                return;
            }
        }
        if (StringsKt.startsWith$default(message, "InstSuccess:", false, 2, (Object) null)) {
            this.steps.onStepCompleted(Visualization.Steps.StepState.SUCCESSFUL);
            return;
        }
        if (StringsKt.startsWith$default(message, "InstFailed:", false, 2, (Object) null)) {
            this.steps.onStepCompleted(Visualization.Steps.StepState.FAILED);
            return;
        }
        if (StringsKt.startsWith$default(message, "face_rect", false, 2, (Object) null)) {
            try {
                JSONArray jSONArray = new JSONArray(StringsKt.removePrefix(message, (CharSequence) "face_rect"));
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                    arrayList.add(new QuadPoint(jSONArray2.getInt(0), jSONArray2.getInt(1)));
                }
                this.quads.append(SetsKt.setOf(new Quad(arrayList)));
                return;
            } catch (Exception e2) {
                Log.e("myapp.LvCallback", "Message parsing error", e2);
                return;
            }
        }
        if (StringsKt.startsWith$default(message, "kp_", false, 2, (Object) null)) {
            try {
                List listSplit$default = StringsKt.split$default((CharSequence) message, new String[]{" "}, false, 0, 6, (Object) null);
                this.quads.append(SetsKt.setOf(new Quad(CollectionsKt.listOf(new QuadPoint(Float.parseFloat((String) listSplit$default.get(1)), Float.parseFloat((String) listSplit$default.get(2)))))));
            } catch (Exception e3) {
                Log.e("myapp.LvCallback", "Message parsing error", e3);
            }
        }
    }
}
