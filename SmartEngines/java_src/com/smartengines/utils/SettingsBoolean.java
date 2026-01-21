package com.smartengines.utils;

import android.content.SharedPreferences;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsBoolean.kt */
@Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u0005¨\u0006\u0014"}, m514d2 = {"Lcom/smartengines/utils/SettingsBoolean;", "Lcom/smartengines/utils/SettingsValue;", "defaultVal", "", "<init>", "(Z)V", "getDefaultVal", "()Z", "value", "getValue", "setValue", "load", "", "key", "", "prefs", "Landroid/content/SharedPreferences;", "save", "editor", "Landroid/content/SharedPreferences$Editor;", "utils_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class SettingsBoolean implements SettingsValue {
    private final boolean defaultVal;
    private boolean value;

    public SettingsBoolean(boolean z) {
        this.defaultVal = z;
        this.value = z;
    }

    public final boolean getDefaultVal() {
        return this.defaultVal;
    }

    public final boolean getValue() {
        return this.value;
    }

    public final void setValue(boolean z) {
        this.value = z;
    }

    @Override // com.smartengines.utils.SettingsValue
    public void load(String key, SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.value = prefs.getBoolean(key, this.defaultVal);
        Log.w("myapp.SettingsBoolean", " ---load--- " + key + " : " + this.value);
    }

    @Override // com.smartengines.utils.SettingsValue
    public void save(String key, SharedPreferences.Editor editor) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(editor, "editor");
        editor.putBoolean(key, this.value);
    }
}
