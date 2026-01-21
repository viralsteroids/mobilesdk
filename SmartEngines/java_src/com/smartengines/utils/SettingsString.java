package com.smartengines.utils;

import android.content.SharedPreferences;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsString.kt */
@Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u0005¨\u0006\u0013"}, m514d2 = {"Lcom/smartengines/utils/SettingsString;", "Lcom/smartengines/utils/SettingsValue;", "defaultVal", "", "<init>", "(Ljava/lang/String;)V", "getDefaultVal", "()Ljava/lang/String;", "value", "getValue", "setValue", "load", "", "key", "prefs", "Landroid/content/SharedPreferences;", "save", "editor", "Landroid/content/SharedPreferences$Editor;", "utils_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class SettingsString implements SettingsValue {
    private final String defaultVal;
    private String value;

    public SettingsString(String defaultVal) {
        Intrinsics.checkNotNullParameter(defaultVal, "defaultVal");
        this.defaultVal = defaultVal;
        this.value = defaultVal;
    }

    public final String getDefaultVal() {
        return this.defaultVal;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    @Override // com.smartengines.utils.SettingsValue
    public void load(String key, SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        String string = prefs.getString(key, this.defaultVal);
        Intrinsics.checkNotNull(string);
        this.value = string;
        Log.w("myapp.SettingsString", " ---load--- " + key + " : " + this.value);
    }

    @Override // com.smartengines.utils.SettingsValue
    public void save(String key, SharedPreferences.Editor editor) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(editor, "editor");
        editor.putString(key, this.value);
    }
}
