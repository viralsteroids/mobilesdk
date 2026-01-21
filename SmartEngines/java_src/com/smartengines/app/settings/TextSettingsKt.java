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
import org.bouncycastle.i18n.TextBundle;

/* compiled from: TextSettings.kt */
@Metadata(m513d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m514d2 = {"LANGUAGES", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "", "PAGE_DETECTION", "", "textDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getTextDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "textDataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextSettingsKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TextSettingsKt.class, "textDataStore", "getTextDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final Preferences.Key<Set<String>> LANGUAGES = PreferencesKeys.stringSetKey("languages");
    private static final Preferences.Key<Boolean> PAGE_DETECTION = PreferencesKeys.booleanKey("page_detection");
    private static final ReadOnlyProperty textDataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default(TextBundle.TEXT_ENTRY, null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore<Preferences> getTextDataStore(Context context) {
        return (DataStore) textDataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }
}
