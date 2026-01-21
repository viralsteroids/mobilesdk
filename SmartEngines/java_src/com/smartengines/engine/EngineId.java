package com.smartengines.engine;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EngineId.kt */
@Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m514d2 = {"Lcom/smartengines/engine/EngineId;", "", "<init>", "(Ljava/lang/String;I)V", "CODE", "DOC", "ID", "TEXT", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class EngineId {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EngineId[] $VALUES;
    public static final EngineId CODE = new EngineId("CODE", 0);
    public static final EngineId DOC = new EngineId("DOC", 1);

    /* renamed from: ID */
    public static final EngineId f368ID = new EngineId("ID", 2);
    public static final EngineId TEXT = new EngineId("TEXT", 3);

    private static final /* synthetic */ EngineId[] $values() {
        return new EngineId[]{CODE, DOC, f368ID, TEXT};
    }

    public static EnumEntries<EngineId> getEntries() {
        return $ENTRIES;
    }

    private EngineId(String str, int i) {
    }

    static {
        EngineId[] engineIdArr$values = $values();
        $VALUES = engineIdArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(engineIdArr$values);
    }

    public static EngineId valueOf(String str) {
        return (EngineId) Enum.valueOf(EngineId.class, str);
    }

    public static EngineId[] values() {
        return (EngineId[]) $VALUES.clone();
    }
}
