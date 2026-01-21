package com.smartengines.engine.doc;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocResultData.kt */
@Metadata(m513d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m514d2 = {"Lcom/smartengines/engine/doc/PhysicalPageData;", "", "width", "", "height", "imageBase64String", "", "fields", "", "Lcom/smartengines/engine/doc/PhysicalFieldInfo;", "basicTextObjects", "", "Lcom/smartengines/engine/doc/BasicTextObject;", "<init>", "(IILjava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getWidth", "()I", "getHeight", "getImageBase64String", "()Ljava/lang/String;", "getFields", "()Ljava/util/Map;", "getBasicTextObjects", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PhysicalPageData {
    private final List<BasicTextObject> basicTextObjects;
    private final Map<String, PhysicalFieldInfo> fields;
    private final int height;
    private final String imageBase64String;
    private final int width;

    public static /* synthetic */ PhysicalPageData copy$default(PhysicalPageData physicalPageData, int i, int i2, String str, Map map, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = physicalPageData.width;
        }
        if ((i3 & 2) != 0) {
            i2 = physicalPageData.height;
        }
        if ((i3 & 4) != 0) {
            str = physicalPageData.imageBase64String;
        }
        if ((i3 & 8) != 0) {
            map = physicalPageData.fields;
        }
        if ((i3 & 16) != 0) {
            list = physicalPageData.basicTextObjects;
        }
        List list2 = list;
        String str2 = str;
        return physicalPageData.copy(i, i2, str2, map, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageBase64String() {
        return this.imageBase64String;
    }

    public final Map<String, PhysicalFieldInfo> component4() {
        return this.fields;
    }

    public final List<BasicTextObject> component5() {
        return this.basicTextObjects;
    }

    public final PhysicalPageData copy(int width, int height, String imageBase64String, Map<String, PhysicalFieldInfo> fields, List<BasicTextObject> basicTextObjects) {
        Intrinsics.checkNotNullParameter(imageBase64String, "imageBase64String");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(basicTextObjects, "basicTextObjects");
        return new PhysicalPageData(width, height, imageBase64String, fields, basicTextObjects);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalPageData)) {
            return false;
        }
        PhysicalPageData physicalPageData = (PhysicalPageData) other;
        return this.width == physicalPageData.width && this.height == physicalPageData.height && Intrinsics.areEqual(this.imageBase64String, physicalPageData.imageBase64String) && Intrinsics.areEqual(this.fields, physicalPageData.fields) && Intrinsics.areEqual(this.basicTextObjects, physicalPageData.basicTextObjects);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + this.imageBase64String.hashCode()) * 31) + this.fields.hashCode()) * 31) + this.basicTextObjects.hashCode();
    }

    public String toString() {
        return "PhysicalPageData(width=" + this.width + ", height=" + this.height + ", imageBase64String=" + this.imageBase64String + ", fields=" + this.fields + ", basicTextObjects=" + this.basicTextObjects + ')';
    }

    public PhysicalPageData(int i, int i2, String imageBase64String, Map<String, PhysicalFieldInfo> fields, List<BasicTextObject> basicTextObjects) {
        Intrinsics.checkNotNullParameter(imageBase64String, "imageBase64String");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(basicTextObjects, "basicTextObjects");
        this.width = i;
        this.height = i2;
        this.imageBase64String = imageBase64String;
        this.fields = fields;
        this.basicTextObjects = basicTextObjects;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getImageBase64String() {
        return this.imageBase64String;
    }

    public final Map<String, PhysicalFieldInfo> getFields() {
        return this.fields;
    }

    public final List<BasicTextObject> getBasicTextObjects() {
        return this.basicTextObjects;
    }
}
