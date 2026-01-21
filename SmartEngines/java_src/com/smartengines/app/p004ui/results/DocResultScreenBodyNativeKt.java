package com.smartengines.app.p004ui.results;

import android.graphics.Bitmap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.smartengines.app.Model;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.engine.doc.DocName;
import com.smartengines.engine.doc.DocResultData;
import com.smartengines.engine.doc.DocumentData;
import com.smartengines.engine.doc.FieldInfo;
import com.smartengines.engine.doc.ImageField;
import com.smartengines.engine.doc.TableField;
import com.smartengines.engine.doc.TextField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: DocResultScreenBodyNative.kt */
@Metadata(m513d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a!\u0010\u0011\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013H\u0003¢\u0006\u0002\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a\u0015\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010\u001e\u001a\u0015\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020 H\u0003¢\u0006\u0002\u0010!\u001a\u0015\u0010\"\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020#H\u0003¢\u0006\u0002\u0010$\u001a\r\u0010%\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010&¨\u0006'"}, m514d2 = {"DocResultScreenBodyNative", "", "resultData", "Lcom/smartengines/engine/doc/DocResultData;", "(Lcom/smartengines/engine/doc/DocResultData;Landroidx/compose/runtime/Composer;I)V", "CropScreen", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Landroidx/compose/runtime/Composer;I)V", "DocumentDataScreen", "document", "Lcom/smartengines/engine/doc/DocumentData;", "(Lcom/smartengines/engine/doc/DocumentData;Landroidx/compose/runtime/Composer;I)V", "Section", TextBundle.TEXT_ENTRY, "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "AttributeRow", "mapEntry", "", "(Ljava/util/Map$Entry;Landroidx/compose/runtime/Composer;I)V", "FieldInfoView", "info", "Lcom/smartengines/engine/doc/FieldInfo;", "(Lcom/smartengines/engine/doc/FieldInfo;Landroidx/compose/runtime/Composer;I)V", "FieldInfo", "fieldInfo", "TextFieldCard", "field", "Lcom/smartengines/engine/doc/TextField;", "(Lcom/smartengines/engine/doc/TextField;Landroidx/compose/runtime/Composer;I)V", "TableFieldRow", "Lcom/smartengines/engine/doc/TableField;", "(Lcom/smartengines/engine/doc/TableField;Landroidx/compose/runtime/Composer;I)V", "ImageFieldCard", "Lcom/smartengines/engine/doc/ImageField;", "(Lcom/smartengines/engine/doc/ImageField;Landroidx/compose/runtime/Composer;I)V", "DataResultScreen_Preview", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocResultScreenBodyNativeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AttributeRow$lambda$15(Map.Entry mapEntry, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(mapEntry, "$mapEntry");
        AttributeRow(mapEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CropScreen$lambda$5(Bitmap bitmap, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        CropScreen(bitmap, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataResultScreen_Preview$lambda$28(int i, Composer composer, int i2) {
        DataResultScreen_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocResultScreenBodyNative$lambda$4(DocResultData resultData, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(resultData, "$resultData");
        DocResultScreenBodyNative(resultData, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocumentDataScreen$lambda$12(DocumentData document, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(document, "$document");
        DocumentDataScreen(document, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FieldInfo$lambda$19(FieldInfo fieldInfo, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(fieldInfo, "$fieldInfo");
        FieldInfo(fieldInfo, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FieldInfoView$lambda$17(FieldInfo info, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(info, "$info");
        FieldInfoView(info, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageFieldCard$lambda$27(ImageField field, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(field, "$field");
        ImageFieldCard(field, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Section$lambda$13(String text, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Section(text, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TableFieldRow$lambda$26(TableField field, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(field, "$field");
        TableFieldRow(field, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextFieldCard$lambda$20(TextField field, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(field, "$field");
        TextFieldCard(field, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DocResultScreenBodyNative(final DocResultData resultData, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        Composer composerStartRestartGroup = composer.startRestartGroup(1218307131);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DocResultScreenBodyNative)47@1843L785:DocResultScreenBodyNative.kt#4ipo3i");
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment topStart = Alignment.INSTANCE.getTopStart();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 441753360, "C52@2016L21,50@1944L678:DocResultScreenBodyNative.kt#4ipo3i");
        Modifier modifierM1437paddingVpY3zN4$default = PaddingKt.m1437paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null), C1959Dp.m7055constructorimpl(10), 0.0f, 2, null);
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1437paddingVpY3zN4$default);
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
        Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1503739854, "C64@2402L210:DocResultScreenBodyNative.kt#4ipo3i");
        composerStartRestartGroup.startReplaceGroup(-90039190);
        ComposerKt.sourceInformation(composerStartRestartGroup, "*61@2330L22");
        Iterator<T> it = resultData.getDocuments().iterator();
        while (it.hasNext()) {
            DocumentDataScreen((DocumentData) it.next(), composerStartRestartGroup, 8);
        }
        composerStartRestartGroup.endReplaceGroup();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM4088constructorimpl3 = Updater.m4088constructorimpl(composerStartRestartGroup);
        Updater.m4095setimpl(composerM4088constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM4088constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM4088constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m4095setimpl(composerM4088constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -983832820, "C65@2490L108:DocResultScreenBodyNative.kt#4ipo3i");
        ButtonKt.Button(new DocResultScreenBodyNativeKt$DocResultScreenBodyNative$1$1$2$1(Model.INSTANCE.getImageProcessor()), null, false, null, null, null, null, null, null, ComposableSingletons$DocResultScreenBodyNativeKt.INSTANCE.m7603getLambda1$app_storeRelease(), composerStartRestartGroup, 805306368, 510);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyNativeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocResultScreenBodyNativeKt.DocResultScreenBodyNative$lambda$4(resultData, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CropScreen(final Bitmap bitmap, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1942536431);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CropScreen)74@2686L29,75@2720L65:DocResultScreenBodyNative.kt#4ipo3i");
        Section("Crop result", composerStartRestartGroup, 6);
        ImageKt.m1046Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), null, null, null, null, 0.0f, null, 0, composerStartRestartGroup, 56, 252);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyNativeKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocResultScreenBodyNativeKt.CropScreen$lambda$5(bitmap, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void DocumentDataScreen(final DocumentData documentData, Composer composer, final int i) {
        Composer composer2;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(932791728);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DocumentDataScreen)*83@3033L72,91@3222L23,97@3343L24,103@3466L24:DocResultScreenBodyNative.kt#4ipo3i");
        DocName name = documentData.getName();
        composerStartRestartGroup.startReplaceGroup(1570530435);
        ComposerKt.sourceInformation(composerStartRestartGroup, "*81@2908L106");
        if (name == null) {
            composer2 = composerStartRestartGroup;
            obj = null;
        } else {
            composer2 = composerStartRestartGroup;
            obj = null;
            TextKt.m3128Text4IGK_g(name.getLocal(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(TextAlign.INSTANCE.m6944getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196656, 0, 130524);
        }
        composer2.endReplaceGroup();
        TextKt.m3128Text4IGK_g(documentData.getType(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(TextAlign.INSTANCE.m6944getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 130556);
        Composer composer3 = composer2;
        composer3.startReplaceGroup(1570538604);
        ComposerKt.sourceInformation(composer3, "*87@3169L16");
        Iterator<Map.Entry<String, String>> it = documentData.getAttributes().entrySet().iterator();
        while (it.hasNext()) {
            AttributeRow(it.next(), composer3, 8);
        }
        composer3.endReplaceGroup();
        Section("Texts", composer3, 6);
        composer3.startReplaceGroup(1570542413);
        ComposerKt.sourceInformation(composer3, "*93@3288L17");
        Iterator<T> it2 = documentData.getTexts().values().iterator();
        while (it2.hasNext()) {
            TextFieldCard((TextField) it2.next(), composer3, 8);
        }
        composer3.endReplaceGroup();
        Section("Tables", composer3, 6);
        composer3.startReplaceGroup(1570546349);
        ComposerKt.sourceInformation(composer3, "*99@3411L17");
        Iterator<T> it3 = documentData.getTables().values().iterator();
        while (it3.hasNext()) {
            TableFieldRow((TableField) it3.next(), composer3, 8);
        }
        composer3.endReplaceGroup();
        Section("Images", composer3, 6);
        composer3.startReplaceGroup(1570550286);
        ComposerKt.sourceInformation(composer3, "*105@3534L18");
        Iterator<T> it4 = documentData.getImages().values().iterator();
        while (it4.hasNext()) {
            ImageFieldCard((ImageField) it4.next(), composer3, 8);
        }
        composer3.endReplaceGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyNativeKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DocResultScreenBodyNativeKt.DocumentDataScreen$lambda$12(documentData, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final void Section(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1443503580);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Section)113@3678L10,111@3621L175:DocResultScreenBodyNative.kt#4ipo3i");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyNativeKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocResultScreenBodyNativeKt.Section$lambda$13(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void AttributeRow(final Map.Entry<String, String> entry, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(674972648);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AttributeRow)122@3911L327:DocResultScreenBodyNative.kt#4ipo3i");
        String key = entry.getKey();
        String value = entry.getValue();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 428160160, "C123@3950L40,124@4040L10,124@3999L96,125@4145L10,125@4104L128:DocResultScreenBodyNative.kt#4ipo3i");
        SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 0.3f, false, 2, null), composerStartRestartGroup, 0);
        TextKt.m3128Text4IGK_g(key, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall(), composerStartRestartGroup, 0, 0, 65532);
        TextKt.m3128Text4IGK_g(value, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall(), composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21, 0, 65500);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyNativeKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocResultScreenBodyNativeKt.AttributeRow$lambda$15(entry, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FieldInfoView(final FieldInfo fieldInfo, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1896001185);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FieldInfoView)134@4531L10,130@4303L254:DocResultScreenBodyNative.kt#4ipo3i");
        StringBuilder sb = new StringBuilder("conf:");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(fieldInfo.getConfidence())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        TextKt.m3128Text4IGK_g(sb.append(str).append(" accepted:").append(fieldInfo.isAccepted()).append(" attr:").append(fieldInfo.getAttributes()).toString(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(TextAlign.INSTANCE.m6944getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall(), composerStartRestartGroup, 48, 0, 65020);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyNativeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocResultScreenBodyNativeKt.FieldInfoView$lambda$17(fieldInfo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FieldInfo(final FieldInfo fieldInfo, Composer composer, final int i) {
        String local;
        Composer composerStartRestartGroup = composer.startRestartGroup(1810931204);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FieldInfo)*140@4648L52:DocResultScreenBodyNative.kt#4ipo3i");
        DocName name = fieldInfo.getName();
        if (name == null || (local = name.getLocal()) == null) {
            local = "[" + fieldInfo.getKey() + ']';
        }
        TextKt.m3128Text4IGK_g(local, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 48, 0, 131068);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyNativeKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocResultScreenBodyNativeKt.FieldInfo$lambda$19(fieldInfo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TextFieldCard(final TextField textField, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1385311818);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextFieldCard)146@4813L357,146@4784L386,160@5175L40:DocResultScreenBodyNative.kt#4ipo3i");
        CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(255886360, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyNativeKt.TextFieldCard.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope Card, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                ComposerKt.sourceInformation(composer2, "C146@4815L354:DocResultScreenBodyNative.kt#4ipo3i");
                if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                    Modifier modifierM1435padding3ABfNKs = PaddingKt.m1435padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1959Dp.m7055constructorimpl(5));
                    TextField textField2 = textField;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1435padding3ABfNKs);
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
                    ComposerKt.sourceInformationMarkerStart(composer2, 981632296, "C152@4927L21,154@4974L133,158@5138L25:DocResultScreenBodyNative.kt#4ipo3i");
                    DocResultScreenBodyNativeKt.FieldInfo(textField2.getInfo(), composer2, 8);
                    TextKt.m3128Text4IGK_g(textField2.getValue(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(TextAlign.INSTANCE.m6944getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 196656, 0, 130524);
                    DocResultScreenBodyNativeKt.FieldInfoView(textField2.getInfo(), composer2, 8);
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
        }, composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
        SpacerKt.Spacer(SizeKt.m1466height3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(8)), composerStartRestartGroup, 6);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyNativeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocResultScreenBodyNativeKt.TextFieldCard$lambda$20(textField, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TableFieldRow(final TableField tableField, Composer composer, final int i) {
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-800527094);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TableFieldRow)167@5342L407,180@5785L1016,180@5756L1045,213@6806L40:DocResultScreenBodyNative.kt#4ipo3i");
        composerStartRestartGroup.startReplaceGroup(754064377);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):DocResultScreenBodyNative.kt#9igjgp");
        boolean zChanged = composerStartRestartGroup.changed(tableField);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (!zChanged) {
            obj = objRememberedValue;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ArrayList arrayList = new ArrayList();
                int size = tableField.getHeader().size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(Float.valueOf(0.1f));
                }
                Iterator<T> it = tableField.getRows().iterator();
                while (it.hasNext()) {
                    int i3 = 0;
                    for (Object obj2 : (List) it.next()) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        float length = ((TextField) obj2).getValue().length();
                        if (((Number) arrayList.get(i3)).floatValue() < length) {
                            arrayList.set(i3, Float.valueOf(length));
                        }
                        i3 = i4;
                    }
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            }
        }
        final ArrayList arrayList2 = (ArrayList) obj;
        composerStartRestartGroup.endReplaceGroup();
        CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1452977924, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyNativeKt.TableFieldRow.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope Card, Composer composer2, int i5) {
                String str;
                Composer composer3 = composer2;
                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                ComposerKt.sourceInformation(composer3, "C180@5787L1013:DocResultScreenBodyNative.kt#4ipo3i");
                if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                    Modifier modifierM1435padding3ABfNKs = PaddingKt.m1435padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1959Dp.m7055constructorimpl(5));
                    TableField tableField2 = tableField;
                    ArrayList<Float> arrayList3 = arrayList2;
                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    boolean z = false;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    char c = 17958;
                    String str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM1435padding3ABfNKs);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    TableField tableField3 = tableField2;
                    String str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer3);
                    Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, -254950203, "C186@5899L21,188@5947L300,210@6768L25:DocResultScreenBodyNative.kt#4ipo3i");
                    DocResultScreenBodyNativeKt.FieldInfo(tableField3.getInfo(), composer3, 8);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    char c2 = 46872;
                    String str4 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer3);
                    Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    String str5 = "C101@5126L9:Row.kt#2w3rfo";
                    ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    String str6 = "C:DocResultScreenBodyNative.kt#4ipo3i";
                    ComposerKt.sourceInformationMarkerStart(composer3, -1811413779, "C:DocResultScreenBodyNative.kt#4ipo3i");
                    composer3.startReplaceGroup(634304361);
                    ComposerKt.sourceInformation(composer3, "*192@6185L10,190@6047L176");
                    Iterator<T> it2 = tableField3.getHeader().iterator();
                    int i6 = 0;
                    while (true) {
                        str = "get(...)";
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Float f = arrayList3.get(i6);
                        Intrinsics.checkNotNullExpressionValue(f, "get(...)");
                        TextKt.m3128Text4IGK_g((String) next, RowScope.weight$default(rowScopeInstance, companion, f.floatValue(), false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(TextAlign.INSTANCE.m6944getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65020);
                        composer3 = composer2;
                        i6 = i7;
                        rowScopeInstance = rowScopeInstance;
                        str4 = str4;
                        tableField3 = tableField3;
                        arrayList3 = arrayList3;
                        str6 = str6;
                        str5 = str5;
                        str3 = str3;
                        str2 = str2;
                        c = 17958;
                        z = false;
                        c2 = 46872;
                    }
                    String str7 = str5;
                    String str8 = str6;
                    String str9 = str3;
                    ArrayList<Float> arrayList4 = arrayList3;
                    String str10 = str2;
                    String str11 = str4;
                    TableField tableField4 = tableField3;
                    Object obj3 = null;
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.startReplaceGroup(-1947875002);
                    ComposerKt.sourceInformation(composer3, "*198@6314L413");
                    Iterator<T> it3 = tableField4.getRows().iterator();
                    while (it3.hasNext()) {
                        List list = (List) it3.next();
                        boolean z2 = true;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj3);
                        String str12 = str11;
                        char c3 = 46872;
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, str12);
                        boolean z3 = false;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                        String str13 = str10;
                        char c4 = 17958;
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str13);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        String str14 = str9;
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str14);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM4088constructorimpl3 = Updater.m4088constructorimpl(composer3);
                        Updater.m4095setimpl(composerM4088constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4095setimpl(composerM4088constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM4088constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM4088constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM4088constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4095setimpl(composerM4088constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        String str15 = str7;
                        char c5 = 55802;
                        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, str15);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        String str16 = str8;
                        ComposerKt.sourceInformationMarkerStart(composer3, -753658971, str16);
                        composer3.startReplaceGroup(1915351318);
                        ComposerKt.sourceInformation(composer3, "*204@6653L10,200@6424L271");
                        int i8 = 0;
                        for (Object obj4 : list) {
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            String value = ((TextField) obj4).getValue();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Float f2 = arrayList4.get(i8);
                            Intrinsics.checkNotNullExpressionValue(f2, str);
                            TextKt.m3128Text4IGK_g(value, RowScope.weight$default(rowScopeInstance2, companion2, f2.floatValue(), false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(TextAlign.INSTANCE.m6944getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65020);
                            composer3 = composer2;
                            i8 = i9;
                            rowScopeInstance2 = rowScopeInstance2;
                            str = str;
                            c4 = c4;
                            str13 = str13;
                            z3 = z3;
                            str12 = str12;
                            str16 = str16;
                            str15 = str15;
                            c5 = 55802;
                            c3 = c3;
                            z2 = true;
                        }
                        str7 = str15;
                        str11 = str12;
                        str8 = str16;
                        composer3.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        str9 = str14;
                        str10 = str13;
                        obj3 = null;
                    }
                    composer3.endReplaceGroup();
                    DocResultScreenBodyNativeKt.FieldInfoView(tableField4.getInfo(), composer3, 8);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
        SpacerKt.Spacer(SizeKt.m1466height3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(8)), composerStartRestartGroup, 6);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyNativeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return DocResultScreenBodyNativeKt.TableFieldRow$lambda$26(tableField, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final void ImageFieldCard(final ImageField imageField, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(735053460);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ImageFieldCard)219@6958L240,219@6929L269,229@7203L41:DocResultScreenBodyNative.kt#4ipo3i");
        CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1983914210, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyNativeKt.ImageFieldCard.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope Card, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                ComposerKt.sourceInformation(composer2, "C219@6960L237:DocResultScreenBodyNative.kt#4ipo3i");
                if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                    Modifier modifierM1435padding3ABfNKs = PaddingKt.m1435padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1959Dp.m7055constructorimpl(5));
                    ImageField imageField2 = imageField;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1435padding3ABfNKs);
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
                    ComposerKt.sourceInformationMarkerStart(composer2, 925015027, "C225@7072L25,227@7123L68:DocResultScreenBodyNative.kt#4ipo3i");
                    DocResultScreenBodyNativeKt.FieldInfoView(imageField2.getInfo(), composer2, 8);
                    ImageKt.m1046Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(imageField2.getValue()), "", null, null, null, 0.0f, null, 0, composer2, 56, 252);
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
        }, composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 30);
        SpacerKt.Spacer(SizeKt.m1466height3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(10)), composerStartRestartGroup, 6);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyNativeKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocResultScreenBodyNativeKt.ImageFieldCard$lambda$27(imageField, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void DataResultScreen_Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-468895552);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DataResultScreen_Preview)238@7472L126:DocResultScreenBodyNative.kt#4ipo3i");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$DocResultScreenBodyNativeKt.INSTANCE.m7605getLambda3$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.DocResultScreenBodyNativeKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocResultScreenBodyNativeKt.DataResultScreen_Preview$lambda$28(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
