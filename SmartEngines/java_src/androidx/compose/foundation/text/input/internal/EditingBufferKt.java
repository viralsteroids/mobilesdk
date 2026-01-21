package androidx.compose.foundation.text.input.internal;

import androidx.compose.p000ui.text.TextRange;
import androidx.compose.p000ui.text.TextRangeKt;
import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, m514d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "foundation_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m1899updateRangeAfterDeletepWDy79M(long j, long j2) {
        int iM6536getLengthimpl;
        int iM6538getMinimpl = TextRange.m6538getMinimpl(j);
        int iM6537getMaximpl = TextRange.m6537getMaximpl(j);
        if (TextRange.m6542intersects5zctL8(j2, j)) {
            if (TextRange.m6530contains5zctL8(j2, j)) {
                iM6538getMinimpl = TextRange.m6538getMinimpl(j2);
                iM6537getMaximpl = iM6538getMinimpl;
            } else {
                if (TextRange.m6530contains5zctL8(j, j2)) {
                    iM6536getLengthimpl = TextRange.m6536getLengthimpl(j2);
                } else if (TextRange.m6531containsimpl(j2, iM6538getMinimpl)) {
                    iM6538getMinimpl = TextRange.m6538getMinimpl(j2);
                    iM6536getLengthimpl = TextRange.m6536getLengthimpl(j2);
                } else {
                    iM6537getMaximpl = TextRange.m6538getMinimpl(j2);
                }
                iM6537getMaximpl -= iM6536getLengthimpl;
            }
        } else if (iM6537getMaximpl > TextRange.m6538getMinimpl(j2)) {
            iM6538getMinimpl -= TextRange.m6536getLengthimpl(j2);
            iM6536getLengthimpl = TextRange.m6536getLengthimpl(j2);
            iM6537getMaximpl -= iM6536getLengthimpl;
        }
        return TextRangeKt.TextRange(iM6538getMinimpl, iM6537getMaximpl);
    }
}
