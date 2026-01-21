package com.smartengines.engine;

import com.smartengines.common.Point;
import com.smartengines.common.Quadrangle;
import com.smartengines.common.Rectangle;
import com.smartengines.visualization.Quad;
import com.smartengines.visualization.QuadPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EngineUtils.kt */
@Metadata(m513d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005¨\u0006\u0006"}, m514d2 = {"toQuad", "Lcom/smartengines/visualization/Quad;", "Lcom/smartengines/common/Quadrangle;", "toQuadrangle", "toRectangle", "Lcom/smartengines/common/Rectangle;", "engine_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class EngineUtilsKt {
    public static final Quad toQuad(Quadrangle quadrangle) {
        Intrinsics.checkNotNullParameter(quadrangle, "<this>");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            Point pointGetPoint = quadrangle.GetPoint(i);
            arrayList.add(new QuadPoint(pointGetPoint.getX(), pointGetPoint.getY()));
        }
        return new Quad(arrayList);
    }

    public static final Quadrangle toQuadrangle(Quad quad) {
        Intrinsics.checkNotNullParameter(quad, "<this>");
        return new Quadrangle(new Point(quad.getPoints().get(0).getX(), quad.getPoints().get(0).getX()), new Point(quad.getPoints().get(1).getX(), quad.getPoints().get(1).getX()), new Point(quad.getPoints().get(2).getX(), quad.getPoints().get(2).getX()), new Point(quad.getPoints().get(3).getX(), quad.getPoints().get(3).getX()));
    }

    public static final Rectangle toRectangle(Quad quad) {
        Intrinsics.checkNotNullParameter(quad, "<this>");
        Iterator<T> it = quad.getPoints().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float x = ((QuadPoint) it.next()).getX();
        while (it.hasNext()) {
            x = Math.min(x, ((QuadPoint) it.next()).getX());
        }
        Iterator<T> it2 = quad.getPoints().iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float x2 = ((QuadPoint) it2.next()).getX();
        while (it2.hasNext()) {
            x2 = Math.max(x2, ((QuadPoint) it2.next()).getX());
        }
        Iterator<T> it3 = quad.getPoints().iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float y = ((QuadPoint) it3.next()).getY();
        while (it3.hasNext()) {
            y = Math.min(y, ((QuadPoint) it3.next()).getY());
        }
        Iterator<T> it4 = quad.getPoints().iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        float y2 = ((QuadPoint) it4.next()).getY();
        while (it4.hasNext()) {
            y2 = Math.max(y2, ((QuadPoint) it4.next()).getY());
        }
        return new Rectangle((int) x, (int) y, (int) (x2 - x), (int) (y2 - y));
    }

    public static final Quad toQuad(Rectangle rectangle) {
        Intrinsics.checkNotNullParameter(rectangle, "<this>");
        return new Quad(CollectionsKt.listOf((Object[]) new QuadPoint[]{new QuadPoint(rectangle.getX(), rectangle.getY()), new QuadPoint(rectangle.getX() + rectangle.getWidth(), rectangle.getY()), new QuadPoint(rectangle.getX() + rectangle.getWidth(), rectangle.getY() + rectangle.getHeight()), new QuadPoint(rectangle.getX(), rectangle.getY() + rectangle.getHeight())}));
    }
}
