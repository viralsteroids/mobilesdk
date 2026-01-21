package com.smartengines.targets.text;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextSettings.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m514d2 = {"Lcom/smartengines/targets/text/TextSettingsMock;", "Lcom/smartengines/targets/text/TextSettings;", "languages", "", "", "pageDetection", "", "<init>", "(Ljava/util/Set;Z)V", "getLanguages", "()Ljava/util/Set;", "getPageDetection", "()Z", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextSettingsMock implements TextSettings {
    private final Set<String> languages;
    private final boolean pageDetection;

    /* JADX WARN: Multi-variable type inference failed */
    public TextSettingsMock() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public TextSettingsMock(Set<String> languages, boolean z) {
        Intrinsics.checkNotNullParameter(languages, "languages");
        this.languages = languages;
        this.pageDetection = z;
    }

    public /* synthetic */ TextSettingsMock(Set set, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SetsKt.emptySet() : set, (i & 2) != 0 ? false : z);
    }

    @Override // com.smartengines.targets.text.TextSettings
    public Set<String> getLanguages() {
        return this.languages;
    }

    @Override // com.smartengines.targets.text.TextSettings
    public boolean getPageDetection() {
        return this.pageDetection;
    }
}
