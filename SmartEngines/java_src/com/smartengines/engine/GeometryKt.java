package com.smartengines.engine;

import android.graphics.Rect;
import com.smartengines.common.Point;
import com.smartengines.common.Polygon;
import com.smartengines.common.Rectangle;
import com.smartengines.visualization.QuadPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Geometry.kt */
@Metadata(m513d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m514d2 = {"toGeometry", "Lcom/smartengines/engine/Geometry;", "Lcom/smartengines/common/Polygon;", "sceneId", "", "engine_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class GeometryKt {
    public static final Geometry toGeometry(Polygon polygon, int i) {
        Intrinsics.checkNotNullParameter(polygon, "<this>");
        ArrayList arrayList = new ArrayList();
        int iGetPointsCount = polygon.GetPointsCount();
        for (int i2 = 0; i2 < iGetPointsCount; i2++) {
            Point pointGetPoint = polygon.GetPoint(i2);
            arrayList.add(new QuadPoint((float) pointGetPoint.getX(), (float) pointGetPoint.getY()));
        }
        Unit unit = Unit.INSTANCE;
        Rectangle rectangleGetBoundingRectangle = polygon.GetBoundingRectangle();
        return new Geometry(i, arrayList, new Rect(rectangleGetBoundingRectangle.getX(), rectangleGetBoundingRectangle.getY(), rectangleGetBoundingRectangle.getX() + rectangleGetBoundingRectangle.getWidth(), rectangleGetBoundingRectangle.getY() + rectangleGetBoundingRectangle.getHeight()));
    }
}
