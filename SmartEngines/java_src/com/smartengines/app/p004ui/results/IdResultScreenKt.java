package com.smartengines.app.p004ui.results;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.smartengines.app.AppKt;
import com.smartengines.app.Model;
import com.smartengines.app.mock.MockSelectorsKt;
import com.smartengines.app.p004ui.BodyBoxKt;
import com.smartengines.app.p004ui.ScreenDataKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.CommonSettings;
import com.smartengines.app.settings.IdSettings;
import com.smartengines.app.targets.TreeLeaf;
import com.smartengines.engine.Session;
import com.smartengines.engine.p005id.Attribute;
import com.smartengines.engine.p005id.CheckField;
import com.smartengines.engine.p005id.CheckStatus;
import com.smartengines.engine.p005id.IdResultData;
import com.smartengines.engine.p005id.IdSessionWrapper;
import com.smartengines.engine.p005id.ImageField;
import com.smartengines.engine.p005id.TextField;
import com.smartengines.engine.p005id.VaSessionWrapper;
import com.smartengines.nfc.PassportKey;
import com.smartengines.utils.UtilsKt;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: IdResultScreen.kt */
@Metadata(m513d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000e\u001a7\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a-\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001aH\u0003¢\u0006\u0002\u0010\u001b\u001a/\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\t2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001aH\u0003¢\u0006\u0002\u0010 \u001a-\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001aH\u0003¢\u0006\u0002\u0010$\u001a\u001b\u0010%\u001a\u00020\u00012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0003¢\u0006\u0002\u0010)\u001a\u000e\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,\u001a\r\u0010-\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010.\u001a\r\u0010/\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010.¨\u00060²\u0006\u0012\u00101\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'X\u008a\u008e\u0002"}, m514d2 = {"IdResultScreen", "", "selectedTreeLeaf", "Lcom/smartengines/app/targets/TreeLeaf;", "resultData", "Lcom/smartengines/engine/id/IdResultData;", "hasRFID", "", "commonSettings", "Lcom/smartengines/app/settings/CommonSettings;", "idSettings", "Lcom/smartengines/app/settings/IdSettings;", "passportKey", "Lcom/smartengines/nfc/PassportKey;", "(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;Landroidx/compose/runtime/Composer;II)V", "IdResultDataScreen", "(Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;Landroidx/compose/runtime/Composer;I)V", "Header", TextBundle.TEXT_ENTRY, "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "TextFieldCard", "textField", "Lcom/smartengines/engine/id/TextField;", "settings", "onClick", "Lkotlin/Function0;", "(Lcom/smartengines/engine/id/TextField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CheckFieldCard", "checkField", "Lcom/smartengines/engine/id/CheckField;", "uiSettings", "(Lcom/smartengines/engine/id/CheckField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ImageFieldCard", "imageField", "Lcom/smartengines/engine/id/ImageField;", "(Lcom/smartengines/engine/id/ImageField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AttributesRow", "attributes", "", "Lcom/smartengines/engine/id/Attribute;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "getMockIdResultData", "context", "Landroid/content/Context;", "Dark_Preview", "(Landroidx/compose/runtime/Composer;I)V", "Light_Preview", "app_storeRelease", "visibleAttributes"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdResultScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttributesRow$lambda$31(List attributes, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(attributes, "$attributes");
        AttributesRow(attributes, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckFieldCard$lambda$25(CheckField checkField, CommonSettings uiSettings, Function0 function0, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(checkField, "$checkField");
        Intrinsics.checkNotNullParameter(uiSettings, "$uiSettings");
        CheckFieldCard(checkField, uiSettings, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dark_Preview$lambda$33(int i, Composer composer, int i2) {
        Dark_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$21(String text, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Header(text, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IdResultDataScreen$lambda$20(IdResultData resultData, boolean z, CommonSettings commonSettings, IdSettings idSettings, PassportKey passportKey, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(resultData, "$resultData");
        Intrinsics.checkNotNullParameter(commonSettings, "$commonSettings");
        Intrinsics.checkNotNullParameter(idSettings, "$idSettings");
        IdResultDataScreen(resultData, z, commonSettings, idSettings, passportKey, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IdResultScreen$lambda$2(TreeLeaf selectedTreeLeaf, IdResultData resultData, boolean z, CommonSettings commonSettings, IdSettings idSettings, PassportKey passportKey, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "$selectedTreeLeaf");
        Intrinsics.checkNotNullParameter(resultData, "$resultData");
        IdResultScreen(selectedTreeLeaf, resultData, z, commonSettings, idSettings, passportKey, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageFieldCard$lambda$27(ImageField imageField, CommonSettings settings, Function0 function0, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(imageField, "$imageField");
        Intrinsics.checkNotNullParameter(settings, "$settings");
        ImageFieldCard(imageField, settings, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Light_Preview$lambda$35(int i, Composer composer, int i2) {
        Light_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextFieldCard$lambda$23(TextField textField, CommonSettings settings, Function0 function0, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(textField, "$textField");
        Intrinsics.checkNotNullParameter(settings, "$settings");
        TextFieldCard(textField, settings, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void IdResultScreen(final TreeLeaf selectedTreeLeaf, final IdResultData resultData, boolean z, CommonSettings commonSettings, IdSettings idSettings, PassportKey passportKey, Composer composer, final int i, final int i2) {
        boolean zHasRFID;
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "selectedTreeLeaf");
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-490920485);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(IdResultScreen)P(5,4,1)63@2525L308,79@3180L577,79@3172L585:IdResultScreen.kt#4ipo3i");
        if ((i2 & 4) != 0) {
            composerStartRestartGroup.startReplaceGroup(1418996804);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):IdResultScreen.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Session session = Model.INSTANCE.getSession();
                if (session instanceof IdSessionWrapper) {
                    zHasRFID = ((IdSessionWrapper) session).hasRFID(resultData.getDocType());
                } else {
                    zHasRFID = session instanceof VaSessionWrapper ? ((VaSessionWrapper) session).hasRFID(resultData.getDocType()) : false;
                }
                objRememberedValue = Boolean.valueOf(zHasRFID);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            z = ((Boolean) objRememberedValue).booleanValue();
            composerStartRestartGroup.endReplaceGroup();
        }
        final boolean z2 = z;
        if ((i2 & 8) != 0) {
            commonSettings = AppKt.getCommonSettingsStore().getData().getValue();
        }
        final CommonSettings commonSettings2 = commonSettings;
        if ((i2 & 16) != 0) {
            idSettings = AppKt.getIdSettingsStore().getData().getValue();
        }
        final IdSettings idSettings2 = idSettings;
        final PassportKey value = (i2 & 32) != 0 ? Model.INSTANCE.getPassportReader().getPassportKeyFlow().getValue() : passportKey;
        BodyBoxKt.BodyBox(ComposableLambdaKt.rememberComposableLambda(-1447411628, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.IdResultScreenKt.IdResultScreen.2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                invoke(boxScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(BoxScope BodyBox, Composer composer2, int i3) {
                Bitmap value2;
                List<ImageField> imageFields;
                Object next;
                Intrinsics.checkNotNullParameter(BodyBox, "$this$BodyBox");
                ComposerKt.sourceInformation(composer2, "C80@3190L561:IdResultScreen.kt#4ipo3i");
                if ((i3 & 81) != 16 || !composer2.getSkipping()) {
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    TreeLeaf treeLeaf = selectedTreeLeaf;
                    IdResultData idResultData = resultData;
                    CommonSettings commonSettings3 = commonSettings2;
                    boolean z3 = z2;
                    IdSettings idSettings3 = idSettings2;
                    PassportKey passportKey2 = value;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer2);
                    Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 664866771, "C83@3259L234,91@3534L150,96@3724L17:IdResultScreen.kt#4ipo3i");
                    if (idResultData == null || (imageFields = idResultData.getImageFields()) == null) {
                        value2 = null;
                    } else {
                        Iterator<T> it = imageFields.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                if (Intrinsics.areEqual(((ImageField) next).getKey(), "photo")) {
                                    break;
                                }
                            }
                        }
                        ImageField imageField = (ImageField) next;
                        if (imageField != null) {
                            value2 = imageField.getValue();
                        }
                    }
                    ResFragmentsKt.ResultTitle(treeLeaf, value2, commonSettings3, composer2, 584, 0);
                    Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer2);
                    Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -81773528, "C92@3592L78:IdResultScreen.kt#4ipo3i");
                    IdResultScreenKt.IdResultDataScreen(idResultData, z3, commonSettings3, idSettings3, passportKey2, composer2, 37384);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ResFragmentsKt.ResultBottomBar(false, composer2, 0, 1);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IdResultScreenKt.IdResultScreen$lambda$2(selectedTreeLeaf, resultData, z2, commonSettings2, idSettings2, value, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IdResultDataScreen(final IdResultData idResultData, final boolean z, final CommonSettings commonSettings, final IdSettings idSettings, final PassportKey passportKey, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(62707789);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(IdResultDataScreen)P(4,1)109@3988L51,*186@6394L26,186@6374L46:IdResultScreen.kt#4ipo3i");
        composerStartRestartGroup.startReplaceGroup(411847149);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):IdResultScreen.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceGroup();
        composerStartRestartGroup.startReplaceGroup(411851187);
        ComposerKt.sourceInformation(composerStartRestartGroup, "*113@4127L21,112@4072L2232");
        Modifier modifierM1437paddingVpY3zN4$default = PaddingKt.m1437paddingVpY3zN4$default(SizeKt.fillMaxSize$default(ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null), C1959Dp.m7055constructorimpl(5), 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1437paddingVpY3zN4$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composerStartRestartGroup);
        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -578348897, "C119@4266L367:IdResultScreen.kt#4ipo3i");
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composerStartRestartGroup);
        Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1036531061, "C125@4526L10,121@4340L279:IdResultScreen.kt#4ipo3i");
        TextKt.m3128Text4IGK_g(idResultData.getDocType(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(TextAlign.INSTANCE.m6944getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getHeadlineMedium(), composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21, 0, 64988);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.startReplaceGroup(119902057);
        ComposerKt.sourceInformation(composerStartRestartGroup, "*134@4744L11");
        if (z && passportKey != null) {
            NfcScreenKt.NfcScreen(composerStartRestartGroup, 0);
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceGroup();
        composerStartRestartGroup.startReplaceGroup(119906718);
        ComposerKt.sourceInformation(composerStartRestartGroup, "*146@5129L109");
        if (idSettings.getEnableForensics()) {
            for (final CheckField checkField : ChecksFilterKt.filterChecks(idResultData.getForensicCheckFields(), idSettings.getShowUndefChecks(), idSettings.getShowChecksFilter(), idSettings.getHideChecksFilter())) {
                CheckFieldCard(checkField, commonSettings, new Function0() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IdResultScreenKt.IdResultDataScreen$lambda$16$lambda$15$lambda$9$lambda$8(checkField, mutableState);
                    }
                }, composerStartRestartGroup, 72, 0);
            }
        }
        composerStartRestartGroup.endReplaceGroup();
        composerStartRestartGroup.startReplaceGroup(119942884);
        ComposerKt.sourceInformation(composerStartRestartGroup, "*170@5975L100");
        for (final TextField textField : CollectionsKt.sortedWith(idResultData.getTextFields(), new Comparator() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$$ExternalSyntheticLambda5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return IdResultScreenKt.IdResultDataScreen$lambda$16$lambda$15$lambda$10((TextField) obj, (TextField) obj2);
            }
        })) {
            TextFieldCard(textField, commonSettings, new Function0() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IdResultScreenKt.IdResultDataScreen$lambda$16$lambda$15$lambda$12$lambda$11(textField, mutableState);
                }
            }, composerStartRestartGroup, 72);
        }
        composerStartRestartGroup.endReplaceGroup();
        composerStartRestartGroup.startReplaceGroup(119948204);
        ComposerKt.sourceInformation(composerStartRestartGroup, "*175@6140L140");
        for (final ImageField imageField : idResultData.getImageFields()) {
            ImageFieldCard(imageField, commonSettings, new Function0() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IdResultScreenKt.IdResultDataScreen$lambda$16$lambda$15$lambda$14$lambda$13(imageField, mutableState);
                }
            }, composerStartRestartGroup, 72);
        }
        composerStartRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Unit unit3 = Unit.INSTANCE;
        composerStartRestartGroup.endReplaceGroup();
        List<Attribute> listIdResultDataScreen$lambda$4 = IdResultDataScreen$lambda$4(mutableState);
        if (listIdResultDataScreen$lambda$4 != null) {
            composerStartRestartGroup.startReplaceGroup(-1873038957);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):IdResultScreen.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IdResultScreenKt.IdResultDataScreen$lambda$19$lambda$18$lambda$17(mutableState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            AttributesDialogKt.AttributesDialog(listIdResultDataScreen$lambda$4, (Function0) objRememberedValue2, composerStartRestartGroup, 56);
            Unit unit4 = Unit.INSTANCE;
            Unit unit5 = Unit.INSTANCE;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IdResultScreenKt.IdResultDataScreen$lambda$20(idResultData, z, commonSettings, idSettings, passportKey, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final List<Attribute> IdResultDataScreen$lambda$4(MutableState<List<Attribute>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IdResultDataScreen$lambda$16$lambda$15$lambda$9$lambda$8(CheckField it, MutableState visibleAttributes$delegate) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(visibleAttributes$delegate, "$visibleAttributes$delegate");
        visibleAttributes$delegate.setValue(it.getAttr());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IdResultDataScreen$lambda$16$lambda$15$lambda$10(TextField textField, TextField textField2) {
        if (Intrinsics.areEqual(textField.getKey(), "face_control")) {
            return -1;
        }
        if (Intrinsics.areEqual(textField2.getKey(), "face_control")) {
            return 1;
        }
        return textField.getKey().compareTo(textField2.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IdResultDataScreen$lambda$16$lambda$15$lambda$12$lambda$11(TextField it, MutableState visibleAttributes$delegate) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(visibleAttributes$delegate, "$visibleAttributes$delegate");
        visibleAttributes$delegate.setValue(it.getAttr());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IdResultDataScreen$lambda$16$lambda$15$lambda$14$lambda$13(ImageField it, MutableState visibleAttributes$delegate) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(visibleAttributes$delegate, "$visibleAttributes$delegate");
        visibleAttributes$delegate.setValue(it.getAttr());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IdResultDataScreen$lambda$19$lambda$18$lambda$17(MutableState visibleAttributes$delegate) {
        Intrinsics.checkNotNullParameter(visibleAttributes$delegate, "$visibleAttributes$delegate");
        visibleAttributes$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    private static final void Header(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1085081872);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Header)194@6536L10,192@6479L175:IdResultScreen.kt#4ipo3i");
        if ((i & 14) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            composer2 = composerStartRestartGroup;
            TextKt.m3128Text4IGK_g(str, PaddingKt.m1439paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1959Dp.m7055constructorimpl(20), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getHeadlineSmall(), composer2, (i2 & 14) | 196656, 0, 65500);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IdResultScreenKt.Header$lambda$21(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TextFieldCard(final TextField textField, final CommonSettings commonSettings, final Function0<Unit> function0, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2074141828);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextFieldCard)P(2,1)*203@6817L430,203@6798L449:IdResultScreen.kt#4ipo3i");
        ResFragmentsKt.ResultCard(function0, ComposableLambdaKt.rememberComposableLambda(-1850638874, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$TextFieldCard$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope ResultCard, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(ResultCard, "$this$ResultCard");
                ComposerKt.sourceInformation(composer2, "C205@6863L175,210@7072L48:IdResultScreen.kt#4ipo3i");
                if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    TextField textField2 = textField;
                    CommonSettings commonSettings2 = commonSettings;
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer2);
                    Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1063823645, "C206@6910L48,207@6975L49:IdResultScreen.kt#4ipo3i");
                    TextKt.m3128Text4IGK_g(textField2.getKey(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131068);
                    ResFragmentsKt.ResultIcon(textField2.isAccepted() || commonSettings2.getAlwaysAccepted(), composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    TextKt.m3128Text4IGK_g(textField.getValue(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ProfileVerifier.CompilationStatus.f285xf2722a21, 0, 131038);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i >> 6) & 14) | 48, 0);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IdResultScreenKt.TextFieldCard$lambda$23(textField, commonSettings, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CheckFieldCard(final CheckField checkField, final CommonSettings commonSettings, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(730012590);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CheckFieldCard)P(!1,2)*220@7425L404,220@7406L423:IdResultScreen.kt#4ipo3i");
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        final Function0<Unit> function02 = function0;
        ResFragmentsKt.ResultCard(function02, ComposableLambdaKt.rememberComposableLambda(-1407691835, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$CheckFieldCard$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope ResultCard, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(ResultCard, "$this$ResultCard");
                ComposerKt.sourceInformation(composer2, "C222@7485L143,226@7641L59:IdResultScreen.kt#4ipo3i");
                if ((i3 & 81) != 16 || !composer2.getSkipping()) {
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    CheckField checkField2 = checkField;
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer2);
                    Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 292275974, "C223@7532L48,224@7597L17:IdResultScreen.kt#4ipo3i");
                    TextKt.m3128Text4IGK_g(checkField2.getKey(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131068);
                    ResFragmentsKt.ResultIcon(checkField2.getValue(), composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    TextKt.m3128Text4IGK_g(checkField.getValue().toString(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ProfileVerifier.CompilationStatus.f285xf2722a21, 0, 131038);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i >> 6) & 14) | 48, 0);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IdResultScreenKt.CheckFieldCard$lambda$25(checkField, commonSettings, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ImageFieldCard(final ImageField imageField, final CommonSettings commonSettings, final Function0<Unit> function0, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(20017998);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ImageFieldCard)P(!1,2)*240@8017L689,240@7997L709:IdResultScreen.kt#4ipo3i");
        ResFragmentsKt.ResultCard(function0, ComposableLambdaKt.rememberComposableLambda(-1283249032, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$ImageFieldCard$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope ResultCard, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(ResultCard, "$this$ResultCard");
                ComposerKt.sourceInformation(composer2, "C242@8063L175,247@8280L299:IdResultScreen.kt#4ipo3i");
                if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ImageField imageField2 = imageField;
                    CommonSettings commonSettings2 = commonSettings;
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer2);
                    Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 22035705, "C243@8110L48,244@8175L49:IdResultScreen.kt#4ipo3i");
                    TextKt.m3128Text4IGK_g(imageField2.getKey(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131068);
                    ResFragmentsKt.ResultIcon(imageField2.isAccepted() || commonSettings2.getAlwaysAccepted(), composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    ImageField imageField3 = imageField;
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composer2, 6);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer2);
                    Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 22297097, "C248@8371L194:IdResultScreen.kt#4ipo3i");
                    ImageKt.m1046Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(imageField3.getValue()), "", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, ContentScale.INSTANCE.getFillWidth(), 0.0f, null, 0, composer2, 25016, 232);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i >> 6) & 14) | 48, 0);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IdResultScreenKt.ImageFieldCard$lambda$27(imageField, commonSettings, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void AttributesRow(final List<Attribute> list, Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1794361661);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AttributesRow):IdResultScreen.kt#4ipo3i");
        composerStartRestartGroup.startReplaceGroup(-187676281);
        ComposerKt.sourceInformation(composerStartRestartGroup, "264@8847L359");
        if (list.isEmpty()) {
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifierM1439paddingqDBjuR0$default = PaddingKt.m1439paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1959Dp.m7055constructorimpl(10), 0.0f, 0.0f, 0.0f, 14, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1439paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composerStartRestartGroup);
            Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2135375770, "C:IdResultScreen.kt#4ipo3i");
            composerStartRestartGroup.startReplaceGroup(-1731451075);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*272@9132L10,270@9022L152");
            for (Attribute attribute : list) {
                TextKt.m3128Text4IGK_g(attribute.getKey() + " : " + attribute.getValue(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall(), composerStartRestartGroup, 0, 0, 65534);
            }
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
        }
        composer2.endReplaceGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IdResultScreenKt.AttributesRow$lambda$31(list, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final IdResultData getMockIdResultData(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new IdResultData("cze.passport.type1", CollectionsKt.listOf((Object[]) new TextField[]{new TextField("birth_date", "29.10.1981", true, CollectionsKt.listOf((Object[]) new Attribute[]{new Attribute("mono_score", "-1.5"), new Attribute("att_sample", "sample text")})), new TextField("birth_place", "DAČICE", true, CollectionsKt.listOf((Object[]) new Attribute[]{new Attribute("mono_score", "-1.5"), new Attribute("att_key", "key sample text")}))}), CollectionsKt.emptyList(), CollectionsKt.listOf(new ImageField("photo", UtilsKt.loadBitmapFromAssetFile(context, "sample_photo.png"), true, CollectionsKt.listOf((Object[]) new Attribute[]{new Attribute("mono_score", "-1.5"), new Attribute("att_key", "key sample text")}))), CollectionsKt.listOf((Object[]) new CheckField[]{new CheckField("Check_0003", CheckStatus.UNDEFINED, CollectionsKt.listOf(new Attribute("reason", "Not all values are present"))), new CheckField("Check_0001", CheckStatus.PASSED, CollectionsKt.emptyList()), new CheckField("Check_0002", CheckStatus.FAILED, CollectionsKt.emptyList())}), CollectionsKt.emptyList(), CollectionsKt.emptyList(), MapsKt.emptyMap());
    }

    private static final void Dark_Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1673544179);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Dark_Preview)316@10666L16,317@10714L7,318@10737L41,319@10819L166,319@10783L202:IdResultScreen.kt#4ipo3i");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(-1689170380);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):IdResultScreen.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = getMockIdResultData(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final IdResultData idResultData = (IdResultData) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ThemeKt.SmartEnginesTheme(true, ComposableLambdaKt.rememberComposableLambda(-439952446, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.IdResultScreenKt.Dark_Preview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C320@10837L142,320@10829L150:IdResultScreen.kt#4ipo3i");
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final IdResultData idResultData2 = idResultData;
                        SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-268791865, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.IdResultScreenKt.Dark_Preview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C321@10851L118:IdResultScreen.kt#4ipo3i");
                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                    IdResultScreenKt.IdResultScreen(MockSelectorsKt.getMockSelectedTreeLeaf(), idResultData2, true, new CommonSettings(null, 1, null), new IdSettings(null, 1, null), new PassportKey("", "", ""), composer3, 299464, 0);
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                            }
                        }, composer2, 54), composer2, 12582912, 127);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IdResultScreenKt.Dark_Preview$lambda$33(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Light_Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(364521097);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Light_Preview)329@11066L16,330@11114L7,331@11137L41,332@11220L144,332@11183L181:IdResultScreen.kt#4ipo3i");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(80648124);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):IdResultScreen.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = getMockIdResultData(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final IdResultData idResultData = (IdResultData) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ThemeKt.SmartEnginesTheme(false, ComposableLambdaKt.rememberComposableLambda(-48840844, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.IdResultScreenKt.Light_Preview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C333@11238L120,333@11230L128:IdResultScreen.kt#4ipo3i");
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final IdResultData idResultData2 = idResultData;
                        SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(962169871, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.IdResultScreenKt.Light_Preview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C334@11252L96:IdResultScreen.kt#4ipo3i");
                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                    IdResultScreenKt.IdResultScreen(MockSelectorsKt.getMockSelectedTreeLeaf(), idResultData2, true, new CommonSettings(null, 1, null), new IdSettings(null, 1, null), null, composer3, 37320, 32);
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                            }
                        }, composer2, 54), composer2, 12582912, 127);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.IdResultScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IdResultScreenKt.Light_Preview$lambda$35(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
