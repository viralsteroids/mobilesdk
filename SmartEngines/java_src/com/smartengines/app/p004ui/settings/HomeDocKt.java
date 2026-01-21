package com.smartengines.app.p004ui.settings;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.AppKt;
import com.smartengines.app.C3069R;
import com.smartengines.app.Model;
import com.smartengines.app.p004ui.AppContentKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.DocSettings;
import com.smartengines.app.settings.DocSettingsWriter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeDoc.kt */
@Metadata(m513d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, m514d2 = {"HomeDoc", "", "docSettings", "Lcom/smartengines/app/settings/DocSettings;", "docSettingsWriter", "Lcom/smartengines/app/settings/DocSettingsWriter;", "(Lcom/smartengines/app/settings/DocSettings;Lcom/smartengines/app/settings/DocSettingsWriter;Landroidx/compose/runtime/Composer;II)V", "Preview_Dark", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class HomeDocKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeDoc$lambda$0(DocSettings docSettings, DocSettingsWriter docSettingsWriter, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(docSettings, "$docSettings");
        HomeDoc(docSettings, docSettingsWriter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview_Dark$lambda$1(int i, Composer composer, int i2) {
        Preview_Dark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HomeDoc(final DocSettings docSettings, final DocSettingsWriter docSettingsWriter, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(docSettings, "docSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(2042064506);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HomeDoc)20@760L7,21@825L556,21@772L609:HomeDoc.kt#v86m6v");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(docSettings) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 16;
        }
        if (i4 != 2 || (i3 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else if (i4 != 0) {
                docSettingsWriter = AppKt.getDocSettingsStore();
            }
            composerStartRestartGroup.endDefaults();
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context = (Context) objConsume;
            FragmentsKt.Section(context.getString(C3069R.string.doc_engine_name), ComposableLambdaKt.rememberComposableLambda(-1402976829, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.HomeDocKt.HomeDoc.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Section, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(Section, "$this$Section");
                    ComposerKt.sourceInformation(composer2, "C22@835L147,26@991L147,31@1206L159:HomeDoc.kt#v86m6v");
                    if ((i5 & 81) != 16 || !composer2.getSkipping()) {
                        String string = context.getString(C3069R.string.s_show_images);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        FragmentsKt.BooleanRow(string, docSettings.getShowImages(), new AnonymousClass1(docSettingsWriter), composer2, 0);
                        String string2 = context.getString(C3069R.string.s_show_tables);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        FragmentsKt.BooleanRow(string2, docSettings.getShowTables(), new AnonymousClass2(docSettingsWriter), composer2, 0);
                        if (Model.INSTANCE.getBuildFlavor().isPrivate() || AppContentKt.isPreview()) {
                            String string3 = context.getString(C3069R.string.s_show_attrib);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            FragmentsKt.BooleanRow(string3, docSettings.getShowAttrib(), new AnonymousClass3(docSettingsWriter), composer2, 0);
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* compiled from: HomeDoc.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeDocKt$HomeDoc$1$1, reason: invalid class name */
                /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass1(Object obj) {
                        super(1, obj, DocSettingsWriter.class, "writeShowImages", "writeShowImages(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((DocSettingsWriter) this.receiver).writeShowImages(z);
                    }
                }

                /* compiled from: HomeDoc.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeDocKt$HomeDoc$1$2, reason: invalid class name */
                /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass2(Object obj) {
                        super(1, obj, DocSettingsWriter.class, "writeShowTables", "writeShowTables(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((DocSettingsWriter) this.receiver).writeShowTables(z);
                    }
                }

                /* compiled from: HomeDoc.kt */
                @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                /* renamed from: com.smartengines.app.ui.settings.HomeDocKt$HomeDoc$1$3, reason: invalid class name */
                /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                    AnonymousClass3(Object obj) {
                        super(1, obj, DocSettingsWriter.class, "writeShowAttrib", "writeShowAttrib(Z)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z) {
                        ((DocSettingsWriter) this.receiver).writeShowAttrib(z);
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeDocKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeDocKt.HomeDoc$lambda$0(docSettings, docSettingsWriter, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(211729351);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview_Dark)43@1606L220:HomeDoc.kt#v86m6v");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$HomeDocKt.INSTANCE.m7735getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.settings.HomeDocKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeDocKt.Preview_Dark$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
