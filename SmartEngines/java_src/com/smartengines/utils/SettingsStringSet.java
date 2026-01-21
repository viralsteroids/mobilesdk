package com.smartengines.utils;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsStringSet.kt */
@Metadata(m513d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m514d2 = {"Lcom/smartengines/utils/SettingsStringSet;", "Lcom/smartengines/utils/SettingsValue;", "defaultVal", "Lkotlin/Function0;", "", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getDefaultVal", "()Lkotlin/jvm/functions/Function0;", "value", "getValue", "()Ljava/util/Set;", "setValue", "(Ljava/util/Set;)V", "load", "", "key", "prefs", "Landroid/content/SharedPreferences;", "save", "editor", "Landroid/content/SharedPreferences$Editor;", "utils_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class SettingsStringSet implements SettingsValue {
    private final Function0<Set<String>> defaultVal;
    private Set<String> value;

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsStringSet(Function0<? extends Set<String>> defaultVal) {
        Intrinsics.checkNotNullParameter(defaultVal, "defaultVal");
        this.defaultVal = defaultVal;
        this.value = (Set) defaultVal.invoke();
    }

    public final Function0<Set<String>> getDefaultVal() {
        return this.defaultVal;
    }

    public final Set<String> getValue() {
        return this.value;
    }

    public final void setValue(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.value = set;
    }

    @Override // com.smartengines.utils.SettingsValue
    public void load(String key, SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Set<String> stringSet = prefs.getStringSet(key, this.defaultVal.invoke());
        Intrinsics.checkNotNull(stringSet);
        this.value = stringSet;
        Log.w("myapp.SettingsStringSet", " ---load--- " + key + " : " + this.value);
    }

    @Override // com.smartengines.utils.SettingsValue
    public void save(String key, SharedPreferences.Editor editor) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(editor, "editor");
        editor.putStringSet(key, this.value);
    }
}
