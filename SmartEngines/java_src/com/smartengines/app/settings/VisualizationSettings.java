package com.smartengines.app.settings;

import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.unit.C1959Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: VisualizationSettings.kt */
@Metadata(m513d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0010JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010$\u001a\u00020%H×\u0001J\t\u0010&\u001a\u00020'H×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010¨\u0006("}, m514d2 = {"Lcom/smartengines/app/settings/VisualizationSettings;", "", "primaryLineWidth", "Landroidx/compose/ui/unit/Dp;", "secondaryLineWidth", "primaryLineColor", "Landroidx/compose/ui/graphics/Color;", "secondaryLineColor", "instructionColor", "<init>", "(FFJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPrimaryLineWidth-D9Ej5fM", "()F", "F", "getSecondaryLineWidth-D9Ej5fM", "getPrimaryLineColor-0d7_KjU", "()J", "J", "getSecondaryLineColor-0d7_KjU", "getInstructionColor-0d7_KjU", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "copy", "copy-Or4LFok", "(FFJJJ)Lcom/smartengines/app/settings/VisualizationSettings;", "equals", "", "other", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VisualizationSettings {
    public static final int $stable = 0;
    private final long instructionColor;
    private final long primaryLineColor;
    private final float primaryLineWidth;
    private final long secondaryLineColor;
    private final float secondaryLineWidth;

    public /* synthetic */ VisualizationSettings(float f, float f2, long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, j, j2, j3);
    }

    /* renamed from: copy-Or4LFok$default, reason: not valid java name */
    public static /* synthetic */ VisualizationSettings m7390copyOr4LFok$default(VisualizationSettings visualizationSettings, float f, float f2, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = visualizationSettings.primaryLineWidth;
        }
        if ((i & 2) != 0) {
            f2 = visualizationSettings.secondaryLineWidth;
        }
        if ((i & 4) != 0) {
            j = visualizationSettings.primaryLineColor;
        }
        if ((i & 8) != 0) {
            j2 = visualizationSettings.secondaryLineColor;
        }
        if ((i & 16) != 0) {
            j3 = visualizationSettings.instructionColor;
        }
        long j4 = j3;
        long j5 = j2;
        return visualizationSettings.m7396copyOr4LFok(f, f2, j, j5, j4);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getPrimaryLineWidth() {
        return this.primaryLineWidth;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSecondaryLineWidth() {
        return this.secondaryLineWidth;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimaryLineColor() {
        return this.primaryLineColor;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getSecondaryLineColor() {
        return this.secondaryLineColor;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getInstructionColor() {
        return this.instructionColor;
    }

    /* renamed from: copy-Or4LFok, reason: not valid java name */
    public final VisualizationSettings m7396copyOr4LFok(float primaryLineWidth, float secondaryLineWidth, long primaryLineColor, long secondaryLineColor, long instructionColor) {
        return new VisualizationSettings(primaryLineWidth, secondaryLineWidth, primaryLineColor, secondaryLineColor, instructionColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisualizationSettings)) {
            return false;
        }
        VisualizationSettings visualizationSettings = (VisualizationSettings) other;
        return C1959Dp.m7060equalsimpl0(this.primaryLineWidth, visualizationSettings.primaryLineWidth) && C1959Dp.m7060equalsimpl0(this.secondaryLineWidth, visualizationSettings.secondaryLineWidth) && Color.m4596equalsimpl0(this.primaryLineColor, visualizationSettings.primaryLineColor) && Color.m4596equalsimpl0(this.secondaryLineColor, visualizationSettings.secondaryLineColor) && Color.m4596equalsimpl0(this.instructionColor, visualizationSettings.instructionColor);
    }

    public int hashCode() {
        return (((((((C1959Dp.m7061hashCodeimpl(this.primaryLineWidth) * 31) + C1959Dp.m7061hashCodeimpl(this.secondaryLineWidth)) * 31) + Color.m4602hashCodeimpl(this.primaryLineColor)) * 31) + Color.m4602hashCodeimpl(this.secondaryLineColor)) * 31) + Color.m4602hashCodeimpl(this.instructionColor);
    }

    public String toString() {
        return "VisualizationSettings(primaryLineWidth=" + ((Object) C1959Dp.m7066toStringimpl(this.primaryLineWidth)) + ", secondaryLineWidth=" + ((Object) C1959Dp.m7066toStringimpl(this.secondaryLineWidth)) + ", primaryLineColor=" + ((Object) Color.m4603toStringimpl(this.primaryLineColor)) + ", secondaryLineColor=" + ((Object) Color.m4603toStringimpl(this.secondaryLineColor)) + ", instructionColor=" + ((Object) Color.m4603toStringimpl(this.instructionColor)) + ')';
    }

    private VisualizationSettings(float f, float f2, long j, long j2, long j3) {
        this.primaryLineWidth = f;
        this.secondaryLineWidth = f2;
        this.primaryLineColor = j;
        this.secondaryLineColor = j2;
        this.instructionColor = j3;
    }

    /* renamed from: getPrimaryLineWidth-D9Ej5fM, reason: not valid java name */
    public final float m7399getPrimaryLineWidthD9Ej5fM() {
        return this.primaryLineWidth;
    }

    /* renamed from: getSecondaryLineWidth-D9Ej5fM, reason: not valid java name */
    public final float m7401getSecondaryLineWidthD9Ej5fM() {
        return this.secondaryLineWidth;
    }

    /* renamed from: getPrimaryLineColor-0d7_KjU, reason: not valid java name */
    public final long m7398getPrimaryLineColor0d7_KjU() {
        return this.primaryLineColor;
    }

    /* renamed from: getSecondaryLineColor-0d7_KjU, reason: not valid java name */
    public final long m7400getSecondaryLineColor0d7_KjU() {
        return this.secondaryLineColor;
    }

    /* renamed from: getInstructionColor-0d7_KjU, reason: not valid java name */
    public final long m7397getInstructionColor0d7_KjU() {
        return this.instructionColor;
    }

    public /* synthetic */ VisualizationSettings(float f, float f2, long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1959Dp.m7055constructorimpl(3) : f, (i & 2) != 0 ? C1959Dp.m7055constructorimpl(2) : f2, (i & 4) != 0 ? Color.INSTANCE.m4626getGreen0d7_KjU() : j, (i & 8) != 0 ? Color.INSTANCE.m4629getRed0d7_KjU() : j2, (i & 16) != 0 ? Color.INSTANCE.m4633getYellow0d7_KjU() : j3, null);
    }
}
