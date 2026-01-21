package com.smartengines.engine.doc;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocResultData.kt */
@Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m514d2 = {"Lcom/smartengines/engine/doc/ImageField;", "", "info", "Lcom/smartengines/engine/doc/FieldInfo;", "value", "Landroid/graphics/Bitmap;", "<init>", "(Lcom/smartengines/engine/doc/FieldInfo;Landroid/graphics/Bitmap;)V", "getInfo", "()Lcom/smartengines/engine/doc/FieldInfo;", "getValue", "()Landroid/graphics/Bitmap;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ImageField {
    private final FieldInfo info;
    private final Bitmap value;

    public static /* synthetic */ ImageField copy$default(ImageField imageField, FieldInfo fieldInfo, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            fieldInfo = imageField.info;
        }
        if ((i & 2) != 0) {
            bitmap = imageField.value;
        }
        return imageField.copy(fieldInfo, bitmap);
    }

    /* renamed from: component1, reason: from getter */
    public final FieldInfo getInfo() {
        return this.info;
    }

    /* renamed from: component2, reason: from getter */
    public final Bitmap getValue() {
        return this.value;
    }

    public final ImageField copy(FieldInfo info, Bitmap value) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ImageField(info, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageField)) {
            return false;
        }
        ImageField imageField = (ImageField) other;
        return Intrinsics.areEqual(this.info, imageField.info) && Intrinsics.areEqual(this.value, imageField.value);
    }

    public int hashCode() {
        return (this.info.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "ImageField(info=" + this.info + ", value=" + this.value + ')';
    }

    public ImageField(FieldInfo info, Bitmap value) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(value, "value");
        this.info = info;
        this.value = value;
    }

    public final FieldInfo getInfo() {
        return this.info;
    }

    public final Bitmap getValue() {
        return this.value;
    }
}
