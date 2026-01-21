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

/* compiled from: IdSettings.kt */
@Metadata(m513d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m514d2 = {"VAUTH_ENABLED", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "ENABLE_FORENSICS", "MIN_INSTR_TIME", "", "MAX_INSTR_TIME", "INSTR_COUNT", "INSTR_COUNT_DELTA", "INSTR_FAILED", "ALWAYS_PASS", "ENABLE_VISUAL", "MIN_PASS_TIME", "FLASH_BY_DEFAULT", "SHOW_UNDEF_CHECKS", "SHOW_CHECKS_FILTER", "", "HIDE_CHECKS_FILTER", "idDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getIdDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "idDataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdSettingsKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IdSettingsKt.class, "idDataStore", "getIdDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final Preferences.Key<Boolean> VAUTH_ENABLED = PreferencesKeys.booleanKey("vauth_enabled");
    private static final Preferences.Key<Boolean> ENABLE_FORENSICS = PreferencesKeys.booleanKey("enable_forensics");
    private static final Preferences.Key<Integer> MIN_INSTR_TIME = PreferencesKeys.intKey("min_instr_time");
    private static final Preferences.Key<Integer> MAX_INSTR_TIME = PreferencesKeys.intKey("max_instr_time");
    private static final Preferences.Key<Integer> INSTR_COUNT = PreferencesKeys.intKey("instr_count");
    private static final Preferences.Key<Integer> INSTR_COUNT_DELTA = PreferencesKeys.intKey("instr_count_delta");
    private static final Preferences.Key<Integer> INSTR_FAILED = PreferencesKeys.intKey("instr_failed");
    private static final Preferences.Key<Boolean> ALWAYS_PASS = PreferencesKeys.booleanKey("always_pass");
    private static final Preferences.Key<Boolean> ENABLE_VISUAL = PreferencesKeys.booleanKey("enable_visual");
    private static final Preferences.Key<Integer> MIN_PASS_TIME = PreferencesKeys.intKey("min_pass_time");
    private static final Preferences.Key<Boolean> FLASH_BY_DEFAULT = PreferencesKeys.booleanKey("flash_by_default");
    private static final Preferences.Key<Boolean> SHOW_UNDEF_CHECKS = PreferencesKeys.booleanKey("show_undef_checks");
    private static final Preferences.Key<String> SHOW_CHECKS_FILTER = PreferencesKeys.stringKey("show_checks_filter");
    private static final Preferences.Key<String> HIDE_CHECKS_FILTER = PreferencesKeys.stringKey("hide_checks_filter");
    private static final ReadOnlyProperty idDataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("id", null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore<Preferences> getIdDataStore(Context context) {
        return (DataStore) idDataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }
}
