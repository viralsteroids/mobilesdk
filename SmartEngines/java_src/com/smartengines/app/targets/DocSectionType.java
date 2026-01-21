package com.smartengines.app.targets;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DocTargetsList.kt */
@Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m514d2 = {"Lcom/smartengines/app/targets/DocSectionType;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT_ENGINE", "AUTO_SELECT", "POPULAR_DOCUMENTS", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocSectionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DocSectionType[] $VALUES;
    public static final DocSectionType TEXT_ENGINE = new DocSectionType("TEXT_ENGINE", 0);
    public static final DocSectionType AUTO_SELECT = new DocSectionType("AUTO_SELECT", 1);
    public static final DocSectionType POPULAR_DOCUMENTS = new DocSectionType("POPULAR_DOCUMENTS", 2);

    private static final /* synthetic */ DocSectionType[] $values() {
        return new DocSectionType[]{TEXT_ENGINE, AUTO_SELECT, POPULAR_DOCUMENTS};
    }

    public static EnumEntries<DocSectionType> getEntries() {
        return $ENTRIES;
    }

    private DocSectionType(String str, int i) {
    }

    static {
        DocSectionType[] docSectionTypeArr$values = $values();
        $VALUES = docSectionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(docSectionTypeArr$values);
    }

    public static DocSectionType valueOf(String str) {
        return (DocSectionType) Enum.valueOf(DocSectionType.class, str);
    }

    public static DocSectionType[] values() {
        return (DocSectionType[]) $VALUES.clone();
    }
}
