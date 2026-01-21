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

/* compiled from: DocSettings.kt */
@Metadata(m513d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m514d2 = {"SHOW_IMAGES", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "SHOW_TABLES", "SHOW_ATTRIB", "docDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getDocDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "docDataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocSettingsKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DocSettingsKt.class, "docDataStore", "getDocDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final Preferences.Key<Boolean> SHOW_IMAGES = PreferencesKeys.booleanKey("show_images");
    private static final Preferences.Key<Boolean> SHOW_TABLES = PreferencesKeys.booleanKey("show_tables");
    private static final Preferences.Key<Boolean> SHOW_ATTRIB = PreferencesKeys.booleanKey("show_attrib");
    private static final ReadOnlyProperty docDataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("doc", null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataStore<Preferences> getDocDataStore(Context context) {
        return (DataStore) docDataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }
}
