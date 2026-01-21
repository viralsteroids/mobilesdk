package com.smartengines.visualization;

import android.util.Size;
import com.smartengines.visualization.Visualization;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

/* compiled from: Mock.kt */
@Metadata(m513d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m514d2 = {"mockQuadsPrimary", "", "Lcom/smartengines/visualization/QuadFrame;", "getMockQuadsPrimary", "()Ljava/util/List;", "mockQuadsSecondary", "getMockQuadsSecondary", "mockQuadsSinglePoints", "getMockQuadsSinglePoints", "mockVisualizations", "", "Lcom/smartengines/visualization/Visualization;", "getMockVisualizations", "()Ljava/util/Collection;", "visualization_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class MockKt {
    public static final List<QuadFrame> getMockQuadsPrimary() {
        return CollectionsKt.listOf(new QuadFrame(SetsKt.setOf(new Quad(CollectionsKt.listOf((Object[]) new QuadPoint[]{new QuadPoint(10.0f, 10.0f), new QuadPoint(90.0f, 10.0f), new QuadPoint(90.0f, 90.0f), new QuadPoint(10.0f, 90.0f)}))), new Size(100, 100), 0L, 4, null));
    }

    public static final List<QuadFrame> getMockQuadsSecondary() {
        return CollectionsKt.listOf(new QuadFrame(SetsKt.setOf((Object[]) new Quad[]{new Quad(CollectionsKt.listOf((Object[]) new QuadPoint[]{new QuadPoint(20.0f, 20.0f), new QuadPoint(40.0f, 20.0f), new QuadPoint(40.0f, 40.0f), new QuadPoint(20.0f, 40.0f)})), new Quad(CollectionsKt.listOf((Object[]) new QuadPoint[]{new QuadPoint(50.0f, 50.0f), new QuadPoint(80.0f, 50.0f), new QuadPoint(80.0f, 80.0f), new QuadPoint(50.0f, 80.0f)}))}), new Size(100, 100), 0L, 4, null));
    }

    public static final List<QuadFrame> getMockQuadsSinglePoints() {
        return CollectionsKt.listOf(new QuadFrame(SetsKt.setOf((Object[]) new Quad[]{new Quad(CollectionsKt.listOf(new QuadPoint(50.0f, 30.0f))), new Quad(CollectionsKt.listOf(new QuadPoint(30.0f, 50.0f)))}), new Size(100, 100), 0L, 4, null));
    }

    public static final Collection<Visualization> getMockVisualizations() {
        return CollectionsKt.listOf((Object[]) new Visualization[]{new Visualization.Quads(getMockQuadsPrimary()), new Visualization.Quads(getMockQuadsSecondary()), new Visualization.Instruction("The instruction")});
    }
}
