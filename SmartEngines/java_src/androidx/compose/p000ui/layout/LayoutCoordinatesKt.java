package androidx.compose.p000ui.layout;

import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.geometry.OffsetKt;
import androidx.compose.p000ui.geometry.Rect;
import androidx.compose.p000ui.node.NodeCoordinator;
import androidx.compose.p000ui.unit.IntSize;
import kotlin.Metadata;

/* compiled from: LayoutCoordinates.kt */
@Metadata(m513d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\u000b\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b¨\u0006\f"}, m514d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "positionOnScreen", "ui_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes2.dex */
public final class LayoutCoordinatesKt {
    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5942localToRootMKHz9U(Offset.INSTANCE.m4370getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5944localToWindowMKHz9U(Offset.INSTANCE.m4370getZeroF1C5BW0());
    }

    public static final long positionOnScreen(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5943localToScreenMKHz9U(Offset.INSTANCE.m4370getZeroF1C5BW0());
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = findRootCoordinates(layoutCoordinates);
        float fM7225getWidthimpl = IntSize.m7225getWidthimpl(layoutCoordinatesFindRootCoordinates.mo5939getSizeYbymL2g());
        float fM7224getHeightimpl = IntSize.m7224getHeightimpl(layoutCoordinatesFindRootCoordinates.mo5939getSizeYbymL2g());
        Rect rectBoundsInRoot = boundsInRoot(layoutCoordinates);
        float left = rectBoundsInRoot.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > fM7225getWidthimpl) {
            left = fM7225getWidthimpl;
        }
        float top = rectBoundsInRoot.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > fM7224getHeightimpl) {
            top = fM7224getHeightimpl;
        }
        float right = rectBoundsInRoot.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= fM7225getWidthimpl) {
            fM7225getWidthimpl = right;
        }
        float bottom = rectBoundsInRoot.getBottom();
        float f = bottom >= 0.0f ? bottom : 0.0f;
        if (f <= fM7224getHeightimpl) {
            fM7224getHeightimpl = f;
        }
        if (left == fM7225getWidthimpl || top == fM7224getHeightimpl) {
            return Rect.INSTANCE.getZero();
        }
        long jMo5944localToWindowMKHz9U = layoutCoordinatesFindRootCoordinates.mo5944localToWindowMKHz9U(OffsetKt.Offset(left, top));
        long jMo5944localToWindowMKHz9U2 = layoutCoordinatesFindRootCoordinates.mo5944localToWindowMKHz9U(OffsetKt.Offset(fM7225getWidthimpl, top));
        long jMo5944localToWindowMKHz9U3 = layoutCoordinatesFindRootCoordinates.mo5944localToWindowMKHz9U(OffsetKt.Offset(fM7225getWidthimpl, fM7224getHeightimpl));
        long jMo5944localToWindowMKHz9U4 = layoutCoordinatesFindRootCoordinates.mo5944localToWindowMKHz9U(OffsetKt.Offset(left, fM7224getHeightimpl));
        float fM4354getXimpl = Offset.m4354getXimpl(jMo5944localToWindowMKHz9U);
        float fM4354getXimpl2 = Offset.m4354getXimpl(jMo5944localToWindowMKHz9U2);
        float fM4354getXimpl3 = Offset.m4354getXimpl(jMo5944localToWindowMKHz9U4);
        float fM4354getXimpl4 = Offset.m4354getXimpl(jMo5944localToWindowMKHz9U3);
        float fMin = Math.min(fM4354getXimpl, Math.min(fM4354getXimpl2, Math.min(fM4354getXimpl3, fM4354getXimpl4)));
        float fMax = Math.max(fM4354getXimpl, Math.max(fM4354getXimpl2, Math.max(fM4354getXimpl3, fM4354getXimpl4)));
        float fM4355getYimpl = Offset.m4355getYimpl(jMo5944localToWindowMKHz9U);
        float fM4355getYimpl2 = Offset.m4355getYimpl(jMo5944localToWindowMKHz9U2);
        float fM4355getYimpl3 = Offset.m4355getYimpl(jMo5944localToWindowMKHz9U4);
        float fM4355getYimpl4 = Offset.m4355getYimpl(jMo5944localToWindowMKHz9U3);
        return new Rect(fMin, Math.min(fM4355getYimpl, Math.min(fM4355getYimpl2, Math.min(fM4355getYimpl3, fM4355getYimpl4))), fMax, Math.max(fM4355getYimpl, Math.max(fM4355getYimpl2, Math.max(fM4355getYimpl3, fM4355getYimpl4))));
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo5940localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m4370getZeroF1C5BW0()) : Offset.INSTANCE.m4370getZeroF1C5BW0();
    }

    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect rectLocalBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, IntSize.m7225getWidthimpl(layoutCoordinates.mo5939getSizeYbymL2g()), IntSize.m7224getHeightimpl(layoutCoordinates.mo5939getSizeYbymL2g())) : rectLocalBoundingBoxOf$default;
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator != null) {
                wrappedBy = nodeCoordinator.getWrappedBy();
            } else {
                return nodeCoordinator3;
            }
        }
    }
}
