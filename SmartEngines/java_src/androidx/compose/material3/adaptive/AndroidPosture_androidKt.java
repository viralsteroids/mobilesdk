package androidx.compose.material3.adaptive;

import androidx.compose.p000ui.graphics.RectHelper_androidKt;
import androidx.window.layout.FoldingFeature;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidPosture.android.kt */
@Metadata(m513d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¨\u0006\u0005"}, m514d2 = {"calculatePosture", "Landroidx/compose/material3/adaptive/Posture;", "foldingFeatures", "", "Landroidx/window/layout/FoldingFeature;", "adaptive_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class AndroidPosture_androidKt {
    public static final Posture calculatePosture(List<? extends FoldingFeature> list) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (FoldingFeature foldingFeature : list) {
            if (Intrinsics.areEqual(foldingFeature.getOrientation(), FoldingFeature.Orientation.HORIZONTAL) && Intrinsics.areEqual(foldingFeature.getState(), FoldingFeature.State.HALF_OPENED)) {
                z = true;
            }
            arrayList.add(new HingeInfo(RectHelper_androidKt.toComposeRect(foldingFeature.getBounds()), Intrinsics.areEqual(foldingFeature.getState(), FoldingFeature.State.FLAT), Intrinsics.areEqual(foldingFeature.getOrientation(), FoldingFeature.Orientation.VERTICAL), foldingFeature.isSeparating(), Intrinsics.areEqual(foldingFeature.getOcclusionType(), FoldingFeature.OcclusionType.FULL)));
        }
        return new Posture(z, arrayList);
    }
}
