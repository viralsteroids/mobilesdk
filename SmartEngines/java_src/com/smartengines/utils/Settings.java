package com.smartengines.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Settings.kt */
@Metadata(m513d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0013J\u001e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\u001c\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m514d2 = {"Lcom/smartengines/utils/Settings;", "", "filename", "", "<init>", "(Ljava/lang/String;)V", "items", "Ljava/util/HashMap;", "Lcom/smartengines/utils/SettingsValue;", "getItems", "()Ljava/util/HashMap;", "dirty", "Ljava/util/HashSet;", "load", "", "context", "Landroid/content/Context;", "save", "getBoolean", "", "key", "getBooleanAsString", "set", "newVal", "setAndSave", "getInt", "", "getIntAsString", "getString", "getStringSet", "", "getStringSetAsString", "throwNotFound", "", "throwNotOfType", "type", "utils_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public class Settings {
    private final HashSet<String> dirty;
    private final String filename;
    private final HashMap<String, SettingsValue> items;

    public Settings(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        this.filename = filename;
        this.items = new HashMap<>();
        this.dirty = new HashSet<>();
    }

    protected final HashMap<String, SettingsValue> getItems() {
        return this.items;
    }

    public final void load(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.filename, 0);
        for (Map.Entry<String, SettingsValue> entry : this.items.entrySet()) {
            String key = entry.getKey();
            SettingsValue value = entry.getValue();
            Intrinsics.checkNotNull(sharedPreferences);
            value.load(key, sharedPreferences);
        }
        this.dirty.clear();
    }

    public final void save(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Log.d("myapp.Settings", "save " + this.dirty);
        if (this.dirty.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(this.filename, 0).edit();
        for (String str : this.dirty) {
            SettingsValue settingsValue = this.items.get(str);
            if (settingsValue != null) {
                Intrinsics.checkNotNull(editorEdit);
                settingsValue.save(str, editorEdit);
            }
        }
        editorEdit.apply();
        this.dirty.clear();
    }

    public final boolean getBoolean(String key) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        SettingsValue settingsValue = this.items.get(key);
        if (settingsValue != null) {
            if (settingsValue instanceof SettingsBoolean) {
                return ((SettingsBoolean) settingsValue).getValue();
            }
            throwNotOfType(key, "Boolean");
            throw new KotlinNothingValueException();
        }
        throwNotFound(key);
        throw new KotlinNothingValueException();
    }

    public final String getBooleanAsString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return String.valueOf(getBoolean(key));
    }

    public final void set(String key, boolean newVal) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        SettingsValue settingsValue = this.items.get(key);
        if (settingsValue != null) {
            if (settingsValue instanceof SettingsBoolean) {
                ((SettingsBoolean) settingsValue).setValue(newVal);
                this.dirty.add(key);
                return;
            } else {
                throwNotOfType(key, "Boolean");
                throw new KotlinNothingValueException();
            }
        }
        throwNotFound(key);
        throw new KotlinNothingValueException();
    }

    public final void setAndSave(String key, boolean newVal, Context context) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(context, "context");
        set(key, newVal);
        save(context);
    }

    public final int getInt(String key) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        SettingsValue settingsValue = this.items.get(key);
        if (settingsValue != null) {
            if (settingsValue instanceof SettingsInt) {
                return ((SettingsInt) settingsValue).getValue();
            }
            throwNotOfType(key, "Int");
            throw new KotlinNothingValueException();
        }
        throwNotFound(key);
        throw new KotlinNothingValueException();
    }

    public final String getIntAsString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return String.valueOf(getInt(key));
    }

    public final void set(String key, int newVal) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        SettingsValue settingsValue = this.items.get(key);
        if (settingsValue != null) {
            if (settingsValue instanceof SettingsInt) {
                ((SettingsInt) settingsValue).setValue(newVal);
                this.dirty.add(key);
                return;
            } else {
                throwNotOfType(key, "Int");
                throw new KotlinNothingValueException();
            }
        }
        throwNotFound(key);
        throw new KotlinNothingValueException();
    }

    public final String getString(String key) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        SettingsValue settingsValue = this.items.get(key);
        if (settingsValue != null) {
            if (!(settingsValue instanceof SettingsString)) {
                throwNotOfType(key, "String");
                throw new KotlinNothingValueException();
            }
            String value = ((SettingsString) settingsValue).getValue();
            if (value != null) {
                return value;
            }
        }
        throwNotFound(key);
        throw new KotlinNothingValueException();
    }

    public final void set(String key, String newVal) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(newVal, "newVal");
        SettingsValue settingsValue = this.items.get(key);
        if (settingsValue != null) {
            if (settingsValue instanceof SettingsString) {
                ((SettingsString) settingsValue).setValue(newVal);
                this.dirty.add(key);
                return;
            } else {
                throwNotOfType(key, "String");
                throw new KotlinNothingValueException();
            }
        }
        throwNotFound(key);
        throw new KotlinNothingValueException();
    }

    public final Set<String> getStringSet(String key) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        SettingsValue settingsValue = this.items.get(key);
        if (settingsValue != null) {
            if (!(settingsValue instanceof SettingsStringSet)) {
                throwNotOfType(key, "StringSet");
                throw new KotlinNothingValueException();
            }
            Set<String> value = ((SettingsStringSet) settingsValue).getValue();
            if (value != null) {
                return value;
            }
        }
        throwNotFound(key);
        throw new KotlinNothingValueException();
    }

    public final String getStringSetAsString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return CollectionsKt.joinToString$default(getStringSet(key), "|", null, null, 0, null, null, 62, null);
    }

    public final void set(String key, Set<String> newVal) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(newVal, "newVal");
        SettingsValue settingsValue = this.items.get(key);
        if (settingsValue != null) {
            if (settingsValue instanceof SettingsStringSet) {
                ((SettingsStringSet) settingsValue).setValue(newVal);
                this.dirty.add(key);
                return;
            } else {
                throwNotOfType(key, "StringSet");
                throw new KotlinNothingValueException();
            }
        }
        throwNotFound(key);
        throw new KotlinNothingValueException();
    }

    private final Void throwNotFound(String key) throws Exception {
        throw new Exception("key:" + key + " is not found");
    }

    private final Void throwNotOfType(String key, String type) throws Exception {
        throw new Exception("the value for key:" + key + " is not " + type);
    }
}
