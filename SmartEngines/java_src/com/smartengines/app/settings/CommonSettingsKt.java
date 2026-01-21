package com.smartengines.app.settings;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* compiled from: CommonSettings.kt */
@Metadata(m513d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m514d2 = {"EXTENDED_MODE", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "TUTORIAL_SHOWN", "EULA_VERSION", "", "DARK_THEME", "SHOW_QUADS", "RESULT_PREVIEW", "ALWAYS_ACCEPTED", "SAVE_PHOTO", "SAVE_VIDEO", "LIVENESS_INTRO", "SESSION_TIMEOUT", "", "MULTI_THREADING", "COMPUTE_METRICS", "IGNORE_TERMINAL", "ENABLE_STOPPERS", "commonDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getCommonDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "commonDataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CommonSettingsKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CommonSettingsKt.class, "commonDataStore", "getCommonDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final Preferences.Key<Boolean> EXTENDED_MODE = PreferencesKeys.booleanKey("ext_mode");
    private static final Preferences.Key<Boolean> TUTORIAL_SHOWN = PreferencesKeys.booleanKey("tut_shown");
    private static final Preferences.Key<Long> EULA_VERSION = PreferencesKeys.longKey("eula_version");
    private static final Preferences.Key<Boolean> DARK_THEME = PreferencesKeys.booleanKey("dark_theme");
    private static final Preferences.Key<Boolean> SHOW_QUADS = PreferencesKeys.booleanKey("show_quads");
    private static final Preferences.Key<Boolean> RESULT_PREVIEW = PreferencesKeys.booleanKey("result_preview");
    private static final Preferences.Key<Boolean> ALWAYS_ACCEPTED = PreferencesKeys.booleanKey("always_accepted");
    private static final Preferences.Key<Boolean> SAVE_PHOTO = PreferencesKeys.booleanKey("save_photo");
    private static final Preferences.Key<Boolean> SAVE_VIDEO = PreferencesKeys.booleanKey("save_video");
    private static final Preferences.Key<Boolean> LIVENESS_INTRO = PreferencesKeys.booleanKey("liveness_intro");
    private static final Preferences.Key<Integer> SESSION_TIMEOUT = PreferencesKeys.intKey("session_timeout");
    private static final Preferences.Key<Boolean> MULTI_THREADING = PreferencesKeys.booleanKey("multi_threading");
    private static final Preferences.Key<Boolean> COMPUTE_METRICS = PreferencesKeys.booleanKey("compute_metrics");
    private static final Preferences.Key<Boolean> IGNORE_TERMINAL = PreferencesKeys.booleanKey("ignore_terminality");
    private static final Preferences.Key<Boolean> ENABLE_STOPPERS = PreferencesKeys.booleanKey("enable_stoppers");
    private static final ReadOnlyProperty commonDataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("common", null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore<Preferences> getCommonDataStore(Context context) {
        return (DataStore) commonDataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }
}
