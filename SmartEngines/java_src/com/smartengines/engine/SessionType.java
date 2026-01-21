package com.smartengines.engine;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SessionType.kt */
@Metadata(m513d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000b"}, m514d2 = {"Lcom/smartengines/engine/SessionType;", "", "<init>", "(Ljava/lang/String;I)V", "VIDEO_SESSION", "PHOTO_SESSION", "GALLERY_SESSION", "isSingleShot", "", "()Z", "isVideo", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class SessionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SessionType[] $VALUES;
    public static final SessionType VIDEO_SESSION = new SessionType("VIDEO_SESSION", 0);
    public static final SessionType PHOTO_SESSION = new SessionType("PHOTO_SESSION", 1);
    public static final SessionType GALLERY_SESSION = new SessionType("GALLERY_SESSION", 2);

    private static final /* synthetic */ SessionType[] $values() {
        return new SessionType[]{VIDEO_SESSION, PHOTO_SESSION, GALLERY_SESSION};
    }

    public static EnumEntries<SessionType> getEntries() {
        return $ENTRIES;
    }

    private SessionType(String str, int i) {
    }

    static {
        SessionType[] sessionTypeArr$values = $values();
        $VALUES = sessionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sessionTypeArr$values);
    }

    public final boolean isSingleShot() {
        return this == PHOTO_SESSION || this == GALLERY_SESSION;
    }

    public final boolean isVideo() {
        return this == VIDEO_SESSION;
    }

    public static SessionType valueOf(String str) {
        return (SessionType) Enum.valueOf(SessionType.class, str);
    }

    public static SessionType[] values() {
        return (SessionType[]) $VALUES.clone();
    }
}
