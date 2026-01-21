package com.smartengines.engine.p005id;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdResultData.kt */
@Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m514d2 = {"Lcom/smartengines/engine/id/CheckStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PASSED", "FAILED", "UNDEFINED", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CheckStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CheckStatus[] $VALUES;
    public static final CheckStatus PASSED = new CheckStatus("PASSED", 0);
    public static final CheckStatus FAILED = new CheckStatus("FAILED", 1);
    public static final CheckStatus UNDEFINED = new CheckStatus("UNDEFINED", 2);

    private static final /* synthetic */ CheckStatus[] $values() {
        return new CheckStatus[]{PASSED, FAILED, UNDEFINED};
    }

    public static EnumEntries<CheckStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        CheckStatus[] checkStatusArr$values = $values();
        $VALUES = checkStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(checkStatusArr$values);
    }

    private CheckStatus(String str, int i) {
    }

    public static CheckStatus valueOf(String str) {
        return (CheckStatus) Enum.valueOf(CheckStatus.class, str);
    }

    public static CheckStatus[] values() {
        return (CheckStatus[]) $VALUES.clone();
    }
}
