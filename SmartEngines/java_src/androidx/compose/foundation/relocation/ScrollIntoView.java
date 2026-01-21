package androidx.compose.foundation.relocation;

import androidx.compose.p000ui.geometry.Rect;
import androidx.compose.p000ui.node.DelegatableNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: ScrollIntoViewRequester.kt */
@Metadata(m513d1 = {"androidx/compose/foundation/relocation/ScrollIntoView__ScrollIntoViewRequesterKt"}, m515k = 4, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class ScrollIntoView {
    public static final Object scrollIntoView(DelegatableNode delegatableNode, Rect rect, Continuation<? super Unit> continuation) {
        return ScrollIntoView__ScrollIntoViewRequesterKt.scrollIntoView(delegatableNode, rect, continuation);
    }
}
