package com.smartengines.app.settings;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* compiled from: CodeSettings.kt */
@Metadata(m513d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m514d2 = {"BARCODE_TYPES", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "", "BARCODE_MAX", "", "BARCODE_ROI", "BARCODE_EFFORT", "BARCODE_DECODE", "", "BARCODE_SMART", "BARCODE_NONPAYMENT", "CARD_TYPES", "CARD_OPTIONAL", "PAYMENT_TYPES", "LINE_MAX", "LINE_TYPES", "METER_MAX", "PLATE_TYPES", "CONTAINER_MAX", "codeDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getCodeDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "codeDataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CodeSettingsKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CodeSettingsKt.class, "codeDataStore", "getCodeDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final Preferences.Key<Set<String>> BARCODE_TYPES = PreferencesKeys.stringSetKey("barcode_types");
    private static final Preferences.Key<Integer> BARCODE_MAX = PreferencesKeys.intKey("barcode_max");
    private static final Preferences.Key<String> BARCODE_ROI = PreferencesKeys.stringKey("barcode_roi");
    private static final Preferences.Key<String> BARCODE_EFFORT = PreferencesKeys.stringKey("barcode_effort");
    private static final Preferences.Key<Boolean> BARCODE_DECODE = PreferencesKeys.booleanKey("barcode_decode");
    private static final Preferences.Key<Boolean> BARCODE_SMART = PreferencesKeys.booleanKey("barcode_smart");
    private static final Preferences.Key<Boolean> BARCODE_NONPAYMENT = PreferencesKeys.booleanKey("barcode_nonpayment");
    private static final Preferences.Key<Set<String>> CARD_TYPES = PreferencesKeys.stringSetKey("card_types");
    private static final Preferences.Key<Boolean> CARD_OPTIONAL = PreferencesKeys.booleanKey("card_optional");
    private static final Preferences.Key<Set<String>> PAYMENT_TYPES = PreferencesKeys.stringSetKey("payment_types");
    private static final Preferences.Key<Integer> LINE_MAX = PreferencesKeys.intKey("line_max");
    private static final Preferences.Key<Set<String>> LINE_TYPES = PreferencesKeys.stringSetKey("line_types");
    private static final Preferences.Key<Integer> METER_MAX = PreferencesKeys.intKey("meter_max");
    private static final Preferences.Key<Set<String>> PLATE_TYPES = PreferencesKeys.stringSetKey("plate_types");
    private static final Preferences.Key<Integer> CONTAINER_MAX = PreferencesKeys.intKey("container_max");
    private static final ReadOnlyProperty codeDataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("code", null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore<Preferences> getCodeDataStore(Context context) {
        return (DataStore) codeDataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }
}
