package com.smartengines.engine.p005id;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdResultData.kt */
@Metadata(m513d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m514d2 = {"Lcom/smartengines/engine/id/ImageField;", "", "key", "", "value", "Landroid/graphics/Bitmap;", "isAccepted", "", "attr", "", "Lcom/smartengines/engine/id/Attribute;", "<init>", "(Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/util/List;)V", "getKey", "()Ljava/lang/String;", "getValue", "()Landroid/graphics/Bitmap;", "()Z", "getAttr", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ImageField {
    private final List<Attribute> attr;
    private final boolean isAccepted;
    private final String key;
    private final Bitmap value;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageField copy$default(ImageField imageField, String str, Bitmap bitmap, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageField.key;
        }
        if ((i & 2) != 0) {
            bitmap = imageField.value;
        }
        if ((i & 4) != 0) {
            z = imageField.isAccepted;
        }
        if ((i & 8) != 0) {
            list = imageField.attr;
        }
        return imageField.copy(str, bitmap, z, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final Bitmap getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAccepted() {
        return this.isAccepted;
    }

    public final List<Attribute> component4() {
        return this.attr;
    }

    public final ImageField copy(String key, Bitmap value, boolean isAccepted, List<Attribute> attr) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(attr, "attr");
        return new ImageField(key, value, isAccepted, attr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageField)) {
            return false;
        }
        ImageField imageField = (ImageField) other;
        return Intrinsics.areEqual(this.key, imageField.key) && Intrinsics.areEqual(this.value, imageField.value) && this.isAccepted == imageField.isAccepted && Intrinsics.areEqual(this.attr, imageField.attr);
    }

    public int hashCode() {
        return (((((this.key.hashCode() * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.isAccepted)) * 31) + this.attr.hashCode();
    }

    public String toString() {
        return "ImageField(key=" + this.key + ", value=" + this.value + ", isAccepted=" + this.isAccepted + ", attr=" + this.attr + ')';
    }

    public ImageField(String key, Bitmap value, boolean z, List<Attribute> attr) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(attr, "attr");
        this.key = key;
        this.value = value;
        this.isAccepted = z;
        this.attr = attr;
    }

    public final String getKey() {
        return this.key;
    }

    public final Bitmap getValue() {
        return this.value;
    }

    public final boolean isAccepted() {
        return this.isAccepted;
    }

    public final List<Attribute> getAttr() {
        return this.attr;
    }
}
