package com.smartengines.engine.code;

import android.graphics.Bitmap;
import com.smartengines.visualization.Quad;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeResultData.kt */
@Metadata(m513d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m514d2 = {"Lcom/smartengines/engine/code/CodeObjectData;", "", "type", "", "fields", "", "Lcom/smartengines/engine/code/CodeObjectField;", "image", "Landroid/graphics/Bitmap;", "quad", "Lcom/smartengines/visualization/Quad;", "<init>", "(Ljava/lang/String;Ljava/util/List;Landroid/graphics/Bitmap;Lcom/smartengines/visualization/Quad;)V", "getType", "()Ljava/lang/String;", "getFields", "()Ljava/util/List;", "getImage", "()Landroid/graphics/Bitmap;", "getQuad", "()Lcom/smartengines/visualization/Quad;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CodeObjectData {
    private final List<CodeObjectField> fields;
    private final Bitmap image;
    private final Quad quad;
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CodeObjectData copy$default(CodeObjectData codeObjectData, String str, List list, Bitmap bitmap, Quad quad, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeObjectData.type;
        }
        if ((i & 2) != 0) {
            list = codeObjectData.fields;
        }
        if ((i & 4) != 0) {
            bitmap = codeObjectData.image;
        }
        if ((i & 8) != 0) {
            quad = codeObjectData.quad;
        }
        return codeObjectData.copy(str, list, bitmap, quad);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<CodeObjectField> component2() {
        return this.fields;
    }

    /* renamed from: component3, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final Quad getQuad() {
        return this.quad;
    }

    public final CodeObjectData copy(String type, List<CodeObjectField> fields, Bitmap image, Quad quad) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new CodeObjectData(type, fields, image, quad);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeObjectData)) {
            return false;
        }
        CodeObjectData codeObjectData = (CodeObjectData) other;
        return Intrinsics.areEqual(this.type, codeObjectData.type) && Intrinsics.areEqual(this.fields, codeObjectData.fields) && Intrinsics.areEqual(this.image, codeObjectData.image) && Intrinsics.areEqual(this.quad, codeObjectData.quad);
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.fields.hashCode()) * 31;
        Bitmap bitmap = this.image;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Quad quad = this.quad;
        return iHashCode2 + (quad != null ? quad.hashCode() : 0);
    }

    public String toString() {
        return "CodeObjectData(type=" + this.type + ", fields=" + this.fields + ", image=" + this.image + ", quad=" + this.quad + ')';
    }

    public CodeObjectData(String type, List<CodeObjectField> fields, Bitmap bitmap, Quad quad) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.type = type;
        this.fields = fields;
        this.image = bitmap;
        this.quad = quad;
    }

    public final String getType() {
        return this.type;
    }

    public final List<CodeObjectField> getFields() {
        return this.fields;
    }

    public final Bitmap getImage() {
        return this.image;
    }

    public final Quad getQuad() {
        return this.quad;
    }
}
