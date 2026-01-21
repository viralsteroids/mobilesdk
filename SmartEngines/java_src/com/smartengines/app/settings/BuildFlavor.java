package com.smartengines.app.settings;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BuildFlavor.kt */
@Metadata(m513d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\r"}, m514d2 = {"Lcom/smartengines/app/settings/BuildFlavor;", "", "<init>", "(Ljava/lang/String;I)V", "STORE", "BETA", "NIGHTLY", "FORENSIC", "RUSTORE", "UNKNOWN", "isPrivate", "", "()Z", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class BuildFlavor {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BuildFlavor[] $VALUES;
    public static final BuildFlavor STORE = new BuildFlavor("STORE", 0);
    public static final BuildFlavor BETA = new BuildFlavor("BETA", 1);
    public static final BuildFlavor NIGHTLY = new BuildFlavor("NIGHTLY", 2);
    public static final BuildFlavor FORENSIC = new BuildFlavor("FORENSIC", 3);
    public static final BuildFlavor RUSTORE = new BuildFlavor("RUSTORE", 4);
    public static final BuildFlavor UNKNOWN = new BuildFlavor("UNKNOWN", 5);

    private static final /* synthetic */ BuildFlavor[] $values() {
        return new BuildFlavor[]{STORE, BETA, NIGHTLY, FORENSIC, RUSTORE, UNKNOWN};
    }

    public static EnumEntries<BuildFlavor> getEntries() {
        return $ENTRIES;
    }

    private BuildFlavor(String str, int i) {
    }

    static {
        BuildFlavor[] buildFlavorArr$values = $values();
        $VALUES = buildFlavorArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(buildFlavorArr$values);
    }

    public final boolean isPrivate() {
        return (this == STORE || this == RUSTORE) ? false : true;
    }

    public static BuildFlavor valueOf(String str) {
        return (BuildFlavor) Enum.valueOf(BuildFlavor.class, str);
    }

    public static BuildFlavor[] values() {
        return (BuildFlavor[]) $VALUES.clone();
    }
}
