package com.smartengines.app;

import android.app.Application;
import android.util.Log;
import com.smartengines.app.settings.CodeSettingsStore;
import com.smartengines.app.settings.CommonSettingsStore;
import com.smartengines.app.settings.DocSettingsStore;
import com.smartengines.app.settings.IdSettingsStore;
import com.smartengines.app.settings.TextSettingsStore;
import com.smartengines.targets.CommonSettings;
import com.smartengines.targets.TargetSettings;
import com.smartengines.targets.TargetSettingsKt;
import com.smartengines.targets.code.CodeSettings;
import com.smartengines.targets.p008id.IdSettings;
import com.smartengines.targets.text.TextSettings;
import com.smartengines.utils.Name;
import kotlin.Metadata;

/* compiled from: App.kt */
@Metadata(m513d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m514d2 = {"Lcom/smartengines/app/App;", "Landroid/app/Application;", "<init>", "()V", "updateLanguage", "", "onCreate", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class App extends Application {
    public static final int $stable = 0;

    public App() {
        AppKt.instance = this;
    }

    public final void updateLanguage() {
        Name.INSTANCE.setLanguage(getResources().getConfiguration().getLocales().get(0).getLanguage());
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Log.w("myapp.App", "onCreate");
        App app = this;
        AppKt.setCommonSettingsStore(new CommonSettingsStore(app));
        AppKt.setCodeSettingsStore(new CodeSettingsStore(app));
        AppKt.setIdSettingsStore(new IdSettingsStore(app));
        AppKt.setDocSettingsStore(new DocSettingsStore(app));
        AppKt.setTextSettingsStore(new TextSettingsStore(app));
        TargetSettingsKt.setTargetSettings(new TargetSettings() { // from class: com.smartengines.app.App.onCreate.1
            @Override // com.smartengines.targets.TargetSettings
            public CommonSettings getCommon() {
                return AppKt.getCommonSettingsStore().getData().getValue();
            }

            @Override // com.smartengines.targets.TargetSettings
            public CodeSettings getCode() {
                return AppKt.getCodeSettingsStore().getData().getValue();
            }

            @Override // com.smartengines.targets.TargetSettings
            public IdSettings getId() {
                return AppKt.getIdSettingsStore().getData().getValue();
            }

            @Override // com.smartengines.targets.TargetSettings
            public TextSettings getText() {
                return AppKt.getTextSettingsStore().getData().getValue();
            }
        });
        Model.INSTANCE.load(app);
    }
}
