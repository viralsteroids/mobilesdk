package com.smartengines.app.p004ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import com.smartengines.app.AppKt;
import com.smartengines.app.C3069R;
import com.smartengines.code.CodeEngine;
import com.smartengines.doc.DocEngine;
import com.smartengines.p006id.IdEngine;
import com.smartengines.text.TextEngine;
import com.smartengines.utils.UtilsKt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: InfoViewModel.kt */
@Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m514d2 = {"Lcom/smartengines/app/ui/InfoViewModel;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "appBuild", "getAppBuild", "sdkBuild", "getSdkBuild", "sdkVersions", "", "getSdkVersions", "()Ljava/util/Map;", "openContactUs", "", "openProductPage", "showTutorial", "switchPrivateMode", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class InfoViewModel {
    public static final int $stable = 8;
    private final String appBuild;
    private final String appVersion;
    private final String sdkBuild;
    private final Map<String, String> sdkVersions;

    public InfoViewModel(Context context) {
        String str;
        String strGetVersion;
        String strGetVersion2;
        String strGetVersion3;
        String strGetVersion4;
        String assetsTextFile = EnvironmentCompat.MEDIA_UNKNOWN;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).versionName;
            Intrinsics.checkNotNull(str);
        } catch (Throwable th) {
            Log.e("myapp.InfoViewModel", "Trying to get app version", th);
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{"+"}, false, 0, 6, (Object) null);
        this.appVersion = (String) listSplit$default.get(0);
        this.appBuild = (String) (1 < listSplit$default.size() ? listSplit$default.get(1) : EnvironmentCompat.MEDIA_UNKNOWN);
        HashMap map = new HashMap();
        try {
            strGetVersion = IdEngine.GetVersion();
        } catch (Throwable unused) {
            strGetVersion = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        map.put("idengine", strGetVersion);
        try {
            strGetVersion2 = CodeEngine.GetVersion();
        } catch (Throwable unused2) {
            strGetVersion2 = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        map.put("codeengine", strGetVersion2);
        try {
            strGetVersion3 = DocEngine.GetVersion();
        } catch (Throwable unused3) {
            strGetVersion3 = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        map.put("docengine", strGetVersion3);
        try {
            strGetVersion4 = TextEngine.GetVersion();
        } catch (Throwable unused4) {
            strGetVersion4 = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        map.put("textengine", strGetVersion4);
        this.sdkVersions = map;
        try {
            assetsTextFile = UtilsKt.readAssetsTextFile(context, "revision.txt");
        } catch (Throwable unused5) {
        }
        this.sdkBuild = assetsTextFile;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getAppBuild() {
        return this.appBuild;
    }

    public final String getSdkBuild() {
        return this.sdkBuild;
    }

    public final Map<String, String> getSdkVersions() {
        return this.sdkVersions;
    }

    public final void openContactUs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(context.getString(C3069R.string.info_contact_us_url))));
    }

    public final void openProductPage(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(context.getString(C3069R.string.info_product_page_url))));
    }

    public final void showTutorial() {
        AppKt.getCommonSettingsStore().writeTutorialShown(false);
    }

    public final void switchPrivateMode() {
        Log.d("myapp.InfoViewModel", "switchPrivateMode");
        AppKt.getCommonSettingsStore().writeExtendedMode(!AppKt.getCommonSettingsStore().getData().getValue().getExtendedMode());
    }
}
