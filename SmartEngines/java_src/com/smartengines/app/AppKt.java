package com.smartengines.app;

import androidx.compose.material.icons.Icons;
import com.smartengines.app.settings.CodeSettingsStore;
import com.smartengines.app.settings.CommonSettingsStore;
import com.smartengines.app.settings.DocSettingsStore;
import com.smartengines.app.settings.IdSettingsStore;
import com.smartengines.app.settings.TextSettingsStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: App.kt */
@Metadata(m513d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000\"\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\"\u001a\u0010#\u001a\u00020$X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, m514d2 = {"TAG", "", "AppIcons", "Landroidx/compose/material/icons/Icons$Rounded;", "getAppIcons", "()Landroidx/compose/material/icons/Icons$Rounded;", "instance", "Lcom/smartengines/app/App;", "app", "getApp", "()Lcom/smartengines/app/App;", "commonSettingsStore", "Lcom/smartengines/app/settings/CommonSettingsStore;", "getCommonSettingsStore", "()Lcom/smartengines/app/settings/CommonSettingsStore;", "setCommonSettingsStore", "(Lcom/smartengines/app/settings/CommonSettingsStore;)V", "codeSettingsStore", "Lcom/smartengines/app/settings/CodeSettingsStore;", "getCodeSettingsStore", "()Lcom/smartengines/app/settings/CodeSettingsStore;", "setCodeSettingsStore", "(Lcom/smartengines/app/settings/CodeSettingsStore;)V", "idSettingsStore", "Lcom/smartengines/app/settings/IdSettingsStore;", "getIdSettingsStore", "()Lcom/smartengines/app/settings/IdSettingsStore;", "setIdSettingsStore", "(Lcom/smartengines/app/settings/IdSettingsStore;)V", "docSettingsStore", "Lcom/smartengines/app/settings/DocSettingsStore;", "getDocSettingsStore", "()Lcom/smartengines/app/settings/DocSettingsStore;", "setDocSettingsStore", "(Lcom/smartengines/app/settings/DocSettingsStore;)V", "textSettingsStore", "Lcom/smartengines/app/settings/TextSettingsStore;", "getTextSettingsStore", "()Lcom/smartengines/app/settings/TextSettingsStore;", "setTextSettingsStore", "(Lcom/smartengines/app/settings/TextSettingsStore;)V", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class AppKt {
    private static final Icons.Rounded AppIcons = Icons.Rounded.INSTANCE;
    private static final String TAG = "myapp.App";
    public static CodeSettingsStore codeSettingsStore;
    public static CommonSettingsStore commonSettingsStore;
    public static DocSettingsStore docSettingsStore;
    public static IdSettingsStore idSettingsStore;
    private static App instance;
    public static TextSettingsStore textSettingsStore;

    public static final Icons.Rounded getAppIcons() {
        return AppIcons;
    }

    public static final App getApp() {
        App app = instance;
        if (app != null) {
            return app;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instance");
        return null;
    }

    public static final CommonSettingsStore getCommonSettingsStore() {
        CommonSettingsStore commonSettingsStore2 = commonSettingsStore;
        if (commonSettingsStore2 != null) {
            return commonSettingsStore2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("commonSettingsStore");
        return null;
    }

    public static final void setCommonSettingsStore(CommonSettingsStore commonSettingsStore2) {
        Intrinsics.checkNotNullParameter(commonSettingsStore2, "<set-?>");
        commonSettingsStore = commonSettingsStore2;
    }

    public static final CodeSettingsStore getCodeSettingsStore() {
        CodeSettingsStore codeSettingsStore2 = codeSettingsStore;
        if (codeSettingsStore2 != null) {
            return codeSettingsStore2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("codeSettingsStore");
        return null;
    }

    public static final void setCodeSettingsStore(CodeSettingsStore codeSettingsStore2) {
        Intrinsics.checkNotNullParameter(codeSettingsStore2, "<set-?>");
        codeSettingsStore = codeSettingsStore2;
    }

    public static final IdSettingsStore getIdSettingsStore() {
        IdSettingsStore idSettingsStore2 = idSettingsStore;
        if (idSettingsStore2 != null) {
            return idSettingsStore2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("idSettingsStore");
        return null;
    }

    public static final void setIdSettingsStore(IdSettingsStore idSettingsStore2) {
        Intrinsics.checkNotNullParameter(idSettingsStore2, "<set-?>");
        idSettingsStore = idSettingsStore2;
    }

    public static final DocSettingsStore getDocSettingsStore() {
        DocSettingsStore docSettingsStore2 = docSettingsStore;
        if (docSettingsStore2 != null) {
            return docSettingsStore2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("docSettingsStore");
        return null;
    }

    public static final void setDocSettingsStore(DocSettingsStore docSettingsStore2) {
        Intrinsics.checkNotNullParameter(docSettingsStore2, "<set-?>");
        docSettingsStore = docSettingsStore2;
    }

    public static final TextSettingsStore getTextSettingsStore() {
        TextSettingsStore textSettingsStore2 = textSettingsStore;
        if (textSettingsStore2 != null) {
            return textSettingsStore2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("textSettingsStore");
        return null;
    }

    public static final void setTextSettingsStore(TextSettingsStore textSettingsStore2) {
        Intrinsics.checkNotNullParameter(textSettingsStore2, "<set-?>");
        textSettingsStore = textSettingsStore2;
    }
}
