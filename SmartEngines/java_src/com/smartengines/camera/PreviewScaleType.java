package com.smartengines.camera;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PreviewScaleType.kt */
@Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m514d2 = {"Lcom/smartengines/camera/PreviewScaleType;", "", "<init>", "(Ljava/lang/String;I)V", "FIT", "FILL", "camera_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class PreviewScaleType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PreviewScaleType[] $VALUES;
    public static final PreviewScaleType FIT = new PreviewScaleType("FIT", 0);
    public static final PreviewScaleType FILL = new PreviewScaleType("FILL", 1);

    private static final /* synthetic */ PreviewScaleType[] $values() {
        return new PreviewScaleType[]{FIT, FILL};
    }

    public static EnumEntries<PreviewScaleType> getEntries() {
        return $ENTRIES;
    }

    private PreviewScaleType(String str, int i) {
    }

    static {
        PreviewScaleType[] previewScaleTypeArr$values = $values();
        $VALUES = previewScaleTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(previewScaleTypeArr$values);
    }

    public static PreviewScaleType valueOf(String str) {
        return (PreviewScaleType) Enum.valueOf(PreviewScaleType.class, str);
    }

    public static PreviewScaleType[] values() {
        return (PreviewScaleType[]) $VALUES.clone();
    }
}
