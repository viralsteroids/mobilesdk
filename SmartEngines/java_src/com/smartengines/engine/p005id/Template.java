package com.smartengines.engine.p005id;

import androidx.autofill.HintConstants;
import com.smartengines.common.Rectangle;
import com.smartengines.visualization.Quad;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdResultData.kt */
@Metadata(m513d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, m514d2 = {"Lcom/smartengines/engine/id/Template;", "", HintConstants.AUTOFILL_HINT_NAME, "", "quad", "Lcom/smartengines/visualization/Quad;", "fieldQuads", "", "fieldTemplateRectangles", "Lcom/smartengines/common/Rectangle;", "<init>", "(Ljava/lang/String;Lcom/smartengines/visualization/Quad;Ljava/util/Map;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getQuad", "()Lcom/smartengines/visualization/Quad;", "getFieldQuads", "()Ljava/util/Map;", "getFieldTemplateRectangles", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Template {
    private final Map<String, Quad> fieldQuads;
    private final Map<String, Rectangle> fieldTemplateRectangles;
    private final String name;
    private final Quad quad;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Template copy$default(Template template, String str, Quad quad, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = template.name;
        }
        if ((i & 2) != 0) {
            quad = template.quad;
        }
        if ((i & 4) != 0) {
            map = template.fieldQuads;
        }
        if ((i & 8) != 0) {
            map2 = template.fieldTemplateRectangles;
        }
        return template.copy(str, quad, map, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Quad getQuad() {
        return this.quad;
    }

    public final Map<String, Quad> component3() {
        return this.fieldQuads;
    }

    public final Map<String, Rectangle> component4() {
        return this.fieldTemplateRectangles;
    }

    public final Template copy(String name, Quad quad, Map<String, Quad> fieldQuads, Map<String, ? extends Rectangle> fieldTemplateRectangles) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(quad, "quad");
        Intrinsics.checkNotNullParameter(fieldQuads, "fieldQuads");
        Intrinsics.checkNotNullParameter(fieldTemplateRectangles, "fieldTemplateRectangles");
        return new Template(name, quad, fieldQuads, fieldTemplateRectangles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Template)) {
            return false;
        }
        Template template = (Template) other;
        return Intrinsics.areEqual(this.name, template.name) && Intrinsics.areEqual(this.quad, template.quad) && Intrinsics.areEqual(this.fieldQuads, template.fieldQuads) && Intrinsics.areEqual(this.fieldTemplateRectangles, template.fieldTemplateRectangles);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.quad.hashCode()) * 31) + this.fieldQuads.hashCode()) * 31) + this.fieldTemplateRectangles.hashCode();
    }

    public String toString() {
        return "Template(name=" + this.name + ", quad=" + this.quad + ", fieldQuads=" + this.fieldQuads + ", fieldTemplateRectangles=" + this.fieldTemplateRectangles + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Template(String name, Quad quad, Map<String, Quad> fieldQuads, Map<String, ? extends Rectangle> fieldTemplateRectangles) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(quad, "quad");
        Intrinsics.checkNotNullParameter(fieldQuads, "fieldQuads");
        Intrinsics.checkNotNullParameter(fieldTemplateRectangles, "fieldTemplateRectangles");
        this.name = name;
        this.quad = quad;
        this.fieldQuads = fieldQuads;
        this.fieldTemplateRectangles = fieldTemplateRectangles;
    }

    public final String getName() {
        return this.name;
    }

    public final Quad getQuad() {
        return this.quad;
    }

    public final Map<String, Quad> getFieldQuads() {
        return this.fieldQuads;
    }

    public final Map<String, Rectangle> getFieldTemplateRectangles() {
        return this.fieldTemplateRectangles;
    }
}
