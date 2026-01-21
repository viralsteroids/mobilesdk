.class public final Lcom/smartengines/app/ui/results/IdResultScreenKt;
.super Ljava/lang/Object;
.source "IdResultScreen.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIdResultScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdResultScreen.kt\ncom/smartengines/app/ui/results/IdResultScreenKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,340:1\n1225#2,6:341\n1225#2,6:347\n1225#2,6:440\n1225#2,6:491\n1225#2,6:498\n149#3:353\n149#3:446\n149#3:447\n86#4:354\n83#4,6:355\n89#4:389\n93#4:439\n86#4:448\n83#4,6:449\n89#4:483\n93#4:489\n79#5,6:361\n86#5,4:376\n90#5,2:386\n79#5,6:397\n86#5,4:412\n90#5,2:422\n94#5:428\n94#5:438\n79#5,6:455\n86#5,4:470\n90#5,2:480\n94#5:488\n368#6,9:367\n377#6:388\n368#6,9:403\n377#6:424\n378#6,2:426\n378#6,2:436\n368#6,9:461\n377#6:482\n378#6,2:486\n4034#7,6:380\n4034#7,6:416\n4034#7,6:474\n99#8:390\n96#8,6:391\n102#8:425\n106#8:429\n1863#9,2:430\n1863#9,2:432\n1863#9,2:434\n1863#9,2:484\n77#10:490\n77#10:497\n81#11:504\n107#11,2:505\n*S KotlinDebug\n*F\n+ 1 IdResultScreen.kt\ncom/smartengines/app/ui/results/IdResultScreenKt\n*L\n64#1:341,6\n110#1:347,6\n187#1:440,6\n319#1:491,6\n332#1:498,6\n116#1:353\n197#1:446\n268#1:447\n113#1:354\n113#1:355,6\n113#1:389\n113#1:439\n265#1:448\n265#1:449,6\n265#1:483\n265#1:489\n113#1:361,6\n113#1:376,4\n113#1:386,2\n120#1:397,6\n120#1:412,4\n120#1:422,2\n120#1:428\n113#1:438\n265#1:455,6\n265#1:470,4\n265#1:480,2\n265#1:488\n113#1:367,9\n113#1:388\n120#1:403,9\n120#1:424\n120#1:426,2\n113#1:436,2\n265#1:461,9\n265#1:482\n265#1:486,2\n113#1:380,6\n120#1:416,6\n265#1:474,6\n120#1:390\n120#1:391,6\n120#1:425\n120#1:429\n146#1:430,2\n170#1:432,2\n175#1:434,2\n270#1:484,2\n318#1:490\n331#1:497\n110#1:504\n110#1:505,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0007\u00a2\u0006\u0002\u0010\u000e\u001a7\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0003\u00a2\u0006\u0002\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0003\u00a2\u0006\u0002\u0010\u0014\u001a-\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001aH\u0003\u00a2\u0006\u0002\u0010\u001b\u001a/\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\t2\u0010\u0008\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001aH\u0003\u00a2\u0006\u0002\u0010 \u001a-\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001aH\u0003\u00a2\u0006\u0002\u0010$\u001a\u001b\u0010%\u001a\u00020\u00012\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020(0\'H\u0003\u00a2\u0006\u0002\u0010)\u001a\u000e\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,\u001a\r\u0010-\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010.\u001a\r\u0010/\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010.\u00a8\u00060\u00b2\u0006\u0012\u00101\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'X\u008a\u008e\u0002"
    }
    d2 = {
        "IdResultScreen",
        "",
        "selectedTreeLeaf",
        "Lcom/smartengines/app/targets/TreeLeaf;",
        "resultData",
        "Lcom/smartengines/engine/id/IdResultData;",
        "hasRFID",
        "",
        "commonSettings",
        "Lcom/smartengines/app/settings/CommonSettings;",
        "idSettings",
        "Lcom/smartengines/app/settings/IdSettings;",
        "passportKey",
        "Lcom/smartengines/nfc/PassportKey;",
        "(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;Landroidx/compose/runtime/Composer;II)V",
        "IdResultDataScreen",
        "(Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;Landroidx/compose/runtime/Composer;I)V",
        "Header",
        "text",
        "",
        "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "TextFieldCard",
        "textField",
        "Lcom/smartengines/engine/id/TextField;",
        "settings",
        "onClick",
        "Lkotlin/Function0;",
        "(Lcom/smartengines/engine/id/TextField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V",
        "CheckFieldCard",
        "checkField",
        "Lcom/smartengines/engine/id/CheckField;",
        "uiSettings",
        "(Lcom/smartengines/engine/id/CheckField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V",
        "ImageFieldCard",
        "imageField",
        "Lcom/smartengines/engine/id/ImageField;",
        "(Lcom/smartengines/engine/id/ImageField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V",
        "AttributesRow",
        "attributes",
        "",
        "Lcom/smartengines/engine/id/Attribute;",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
        "getMockIdResultData",
        "context",
        "Landroid/content/Context;",
        "Dark_Preview",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Light_Preview",
        "app_storeRelease",
        "visibleAttributes"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$-On70cCyx_fycLzh7A46bd6GasA(Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultDataScreen$lambda$20(Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$9iVlmfCS4Gu-6fxZ2lTEyPG2LZU(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->Header$lambda$21(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$BzkGj_oYRO2ifQvz4XUvtUQvbjI(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->Light_Preview$lambda$35(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$G5-XndixROm4iZCqQCUhH7M9R14(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->AttributesRow$lambda$31(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$JWFlWF1n3jLFMRb3_GtStqTAXAA(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultScreen$lambda$2(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$SPblQcFpwpT2p2F6vonNlPlCEYU(Lcom/smartengines/engine/id/CheckField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->CheckFieldCard$lambda$25(Lcom/smartengines/engine/id/CheckField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$SVICjsSUcE7G69UnSwK9rNUnfvE(Lcom/smartengines/engine/id/TextField;Lcom/smartengines/engine/id/TextField;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultDataScreen$lambda$16$lambda$15$lambda$10(Lcom/smartengines/engine/id/TextField;Lcom/smartengines/engine/id/TextField;)I

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$Z9WOJHYdlEhA36tb_0R9u_4TKFk(Lcom/smartengines/engine/id/TextField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->TextFieldCard$lambda$23(Lcom/smartengines/engine/id/TextField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$_Y4Qs4R7jtCLqlc-HxK_uTJ-O1U(Lcom/smartengines/engine/id/ImageField;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultDataScreen$lambda$16$lambda$15$lambda$14$lambda$13(Lcom/smartengines/engine/id/ImageField;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$_ubXOp3dXi_X3Ga7vhMMih2OWyU(Lcom/smartengines/engine/id/TextField;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultDataScreen$lambda$16$lambda$15$lambda$12$lambda$11(Lcom/smartengines/engine/id/TextField;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$bcXjATYlE8Apxwv5VPgjqxK4MOA(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->Dark_Preview$lambda$33(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$dFwwzRVx39m_fjHyhXQdsO4NTFY(Lcom/smartengines/engine/id/CheckField;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultDataScreen$lambda$16$lambda$15$lambda$9$lambda$8(Lcom/smartengines/engine/id/CheckField;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$heDeYxoT22rsl2nllPWWM26P_ZU(Lcom/smartengines/engine/id/ImageField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->ImageFieldCard$lambda$27(Lcom/smartengines/engine/id/ImageField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$pckq7R9nXeoNUPODq5PgXHXil5I(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultDataScreen$lambda$19$lambda$18$lambda$17(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final AttributesRow(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/id/Attribute;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    const v1, -0x6af3c93d

    move-object/from16 v2, p1

    .line 262
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    const-string v2, "C(AttributesRow):IdResultScreen.kt#4ipo3i"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const v2, -0xb2fb679

    .line 263
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "264@8847L359"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 264
    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    .line 266
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 267
    invoke-static {v2, v5, v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v2, 0xa

    int-to-float v2, v2

    .line 447
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 268
    invoke-static/range {v6 .. v12}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const v3, -0x1cd0f17e

    .line 265
    const-string v4, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"

    .line 448
    invoke-static {v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 449
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v3

    .line 450
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v4

    const/4 v5, 0x0

    .line 453
    invoke-static {v3, v4, v1, v5}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v3

    const v4, -0x4ee9b9da

    .line 454
    const-string v6, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    .line 455
    invoke-static {v1, v4, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 456
    invoke-static {v1, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v4

    .line 457
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v5

    .line 458
    invoke-static {v1, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 460
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    const v7, -0x2942ffcf

    .line 459
    const-string v8, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 461
    invoke-static {v1, v7, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 462
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v7

    instance-of v7, v7, Landroidx/compose/runtime/Applier;

    if-nez v7, :cond_0

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 463
    :cond_0
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 464
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 465
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    .line 467
    :cond_1
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 469
    :goto_0
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v6

    .line 470
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v3, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 471
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v6, v5, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 473
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    .line 475
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 476
    :cond_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 477
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 480
    :cond_3
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v6, v2, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v2, -0x16ef5699

    .line 482
    const-string v3, "C88@4444L9:Column.kt#2w3rfo"

    .line 483
    invoke-static {v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v2, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    check-cast v2, Landroidx/compose/foundation/layout/ColumnScope;

    const v2, -0x7f473f9a

    const-string v3, "C:IdResultScreen.kt#4ipo3i"

    .line 270
    invoke-static {v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const v2, -0x6733d8c3

    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "*272@9132L10,270@9022L152"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    .line 484
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v27

    :goto_1
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/engine/id/Attribute;

    .line 272
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/smartengines/engine/id/Attribute;->getKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v2}, Lcom/smartengines/engine/id/Attribute;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 273
    sget-object v3, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v4, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v3, v1, v4}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/material3/Typography;->getBodySmall()Landroidx/compose/ui/text/TextStyle;

    move-result-object v22

    const/16 v25, 0x0

    const v26, 0xfffe

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, v1

    .line 271
    invoke-static/range {v2 .. v26}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_4
    move-object/from16 v23, v1

    .line 485
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 270
    invoke-static/range {v23 .. v23}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 483
    invoke-static/range {v23 .. v23}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 486
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 461
    invoke-static/range {v23 .. v23}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 455
    invoke-static/range {v23 .. v23}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 448
    invoke-static/range {v23 .. v23}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    goto :goto_2

    :cond_5
    move-object/from16 v23, v1

    .line 489
    :goto_2
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 263
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v2, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda2;

    move/from16 v3, p2

    invoke-direct {v2, v0, v3}, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda2;-><init>(Ljava/util/List;I)V

    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_6
    return-void
.end method

.method private static final AttributesRow$lambda$31(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    const-string p3, "$attributes"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->AttributesRow(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final CheckFieldCard(Lcom/smartengines/engine/id/CheckField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/engine/id/CheckField;",
            "Lcom/smartengines/app/settings/CommonSettings;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const v0, 0x2b831bae

    .line 219
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p3

    const-string v0, "C(CheckFieldCard)P(!1,2)*220@7425L404,220@7406L423:IdResultScreen.kt#4ipo3i"

    invoke-static {p3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v3, p2

    .line 221
    new-instance p2, Lcom/smartengines/app/ui/results/IdResultScreenKt$CheckFieldCard$1$1;

    invoke-direct {p2, p0}, Lcom/smartengines/app/ui/results/IdResultScreenKt$CheckFieldCard$1$1;-><init>(Lcom/smartengines/engine/id/CheckField;)V

    const/16 v0, 0x36

    const v1, -0x53e7ac3b    # -2.1647E-12f

    const/4 v2, 0x1

    invoke-static {v1, v2, p2, p3, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p2

    check-cast p2, Lkotlin/jvm/functions/Function3;

    shr-int/lit8 v0, p4, 0x6

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    const/4 v1, 0x0

    invoke-static {v3, p2, p3, v0, v1}, Lcom/smartengines/app/ui/results/ResFragmentsKt;->ResultCard(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 220
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance v0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda4;

    move-object v1, p0

    move-object v2, p1

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda4;-><init>(Lcom/smartengines/engine/id/CheckField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;II)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_1
    return-void
.end method

.method private static final CheckFieldCard$lambda$25(Lcom/smartengines/engine/id/CheckField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    const-string p6, "$checkField"

    invoke-static {p0, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "$uiSettings"

    invoke-static {p1, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->CheckFieldCard(Lcom/smartengines/engine/id/CheckField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final Dark_Preview(Landroidx/compose/runtime/Composer;I)V
    .locals 4

    const v0, -0x63c041f3

    .line 316
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(Dark_Preview)316@10666L16,317@10714L7,318@10737L41,319@10819L166,319@10783L202:IdResultScreen.kt#4ipo3i"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 326
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 317
    invoke-static {p0, v0}, Lcom/smartengines/app/ui/ScreenDataKt;->ReadScreenData(Landroidx/compose/runtime/Composer;I)V

    .line 318
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    const v1, 0x789c5f52

    const-string v2, "CC:CompositionLocal.kt#9igjgp"

    .line 490
    invoke-static {p0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 318
    check-cast v0, Landroid/content/Context;

    const v1, -0x64aeb1cc

    invoke-interface {p0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "CC(remember):IdResultScreen.kt#9igjgp"

    invoke-static {p0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 491
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 492
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_2

    .line 319
    invoke-static {v0}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->getMockIdResultData(Landroid/content/Context;)Lcom/smartengines/engine/id/IdResultData;

    move-result-object v1

    .line 494
    invoke-interface {p0, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 319
    :cond_2
    check-cast v1, Lcom/smartengines/engine/id/IdResultData;

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 320
    new-instance v0, Lcom/smartengines/app/ui/results/IdResultScreenKt$Dark_Preview$1;

    invoke-direct {v0, v1}, Lcom/smartengines/app/ui/results/IdResultScreenKt$Dark_Preview$1;-><init>(Lcom/smartengines/engine/id/IdResultData;)V

    const v1, -0x1a39243e

    const/4 v2, 0x1

    const/16 v3, 0x36

    invoke-static {v1, v2, v0, p0, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v2, v0, p0, v3}, Lcom/smartengines/app/ui/theme/ThemeKt;->SmartEnginesTheme(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 326
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_3

    new-instance v0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda1;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_3
    return-void
.end method

.method private static final Dark_Preview$lambda$33(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->Dark_Preview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final Header(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v0, p0

    const v1, 0x40ad0910

    move-object/from16 v2, p1

    .line 192
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    const-string v2, "C(Header)194@6536L10,192@6479L175:IdResultScreen.kt#4ipo3i"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, p2, 0xe

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v2, 0xb

    if-ne v4, v3, :cond_3

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    .line 199
    :cond_2
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v21, v1

    goto :goto_3

    .line 195
    :cond_3
    :goto_2
    sget-object v3, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v4, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v3, v1, v4}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/material3/Typography;->getHeadlineSmall()Landroidx/compose/ui/text/TextStyle;

    move-result-object v20

    .line 196
    sget-object v3, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v7

    .line 197
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v8, v3

    check-cast v8, Landroidx/compose/ui/Modifier;

    const/16 v3, 0x14

    int-to-float v3, v3

    .line 446
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v10

    const/16 v13, 0xd

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 197
    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v4, 0x30030

    and-int/lit8 v2, v2, 0xe

    or-int v22, v2, v4

    const/16 v23, 0x0

    const v24, 0xffdc

    move-object/from16 v21, v1

    move-object v1, v3

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    .line 193
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 199
    :goto_3
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v2, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda3;

    move/from16 v3, p2

    invoke-direct {v2, v0, v3}, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda3;-><init>(Ljava/lang/String;I)V

    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_4
    return-void
.end method

.method private static final Header$lambda$21(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    const-string p3, "$text"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->Header(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final IdResultDataScreen(Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    const v0, 0x3bcd84d

    move-object/from16 v1, p5

    .line 109
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v3

    const-string v0, "C(IdResultDataScreen)P(4,1)109@3988L51,*186@6394L26,186@6374L46:IdResultScreen.kt#4ipo3i"

    invoke-static {v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const v0, 0x188c49ed

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "CC(remember):IdResultScreen.kt#9igjgp"

    invoke-static {v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 347
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 348
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-ne v1, v2, :cond_0

    .line 110
    invoke-static {v5, v5, v4, v5}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    .line 350
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 110
    :cond_0
    check-cast v1, Landroidx/compose/runtime/MutableState;

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v2, 0x188c59b3

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "*113@4127L21,112@4072L2232"

    invoke-static {v3, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 113
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v6, v2

    check-cast v6, Landroidx/compose/ui/Modifier;

    const/4 v2, 0x0

    const/4 v13, 0x1

    .line 114
    invoke-static {v2, v3, v2, v13}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    move-result-object v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Landroidx/compose/foundation/ScrollKt;->verticalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x0

    .line 115
    invoke-static {v6, v7, v13, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v8, 0x5

    int-to-float v8, v8

    .line 353
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    .line 116
    invoke-static {v6, v8, v7, v4, v5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v6, -0x1cd0f17e

    .line 113
    const-string v8, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"

    .line 354
    invoke-static {v3, v6, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 355
    sget-object v6, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v6}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v6

    .line 356
    sget-object v8, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v8

    .line 359
    invoke-static {v6, v8, v3, v2}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v6

    const v8, -0x4ee9b9da

    .line 361
    const-string v9, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    invoke-static {v3, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 362
    invoke-static {v3, v2}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v10

    .line 363
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v11

    .line 364
    invoke-static {v3, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 366
    sget-object v12, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v12

    const v14, -0x2942ffcf

    .line 367
    const-string v15, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    invoke-static {v3, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 368
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v14

    instance-of v14, v14, Landroidx/compose/runtime/Applier;

    if-nez v14, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 369
    :cond_1
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 370
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v14

    if-eqz v14, :cond_2

    .line 371
    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    .line 373
    :cond_2
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 375
    :goto_0
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v12

    .line 376
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v12, v6, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 377
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v12, v11, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 379
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    .line 381
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v11

    if-nez v11, :cond_3

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4

    .line 382
    :cond_3
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 383
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v12, v10, v6}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 386
    :cond_4
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v12, v4, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v4, -0x16ef5699

    .line 388
    const-string v6, "C88@4444L9:Column.kt#2w3rfo"

    .line 389
    invoke-static {v3, v4, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v4, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    check-cast v4, Landroidx/compose/foundation/layout/ColumnScope;

    const v4, -0x2278e761

    const-string v6, "C119@4266L367:IdResultScreen.kt#4ipo3i"

    .line 120
    invoke-static {v3, v4, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v4, Landroidx/compose/ui/Modifier;

    invoke-static {v4, v7, v13, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v5, 0x2952b718

    const-string v6, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo"

    .line 390
    invoke-static {v3, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 391
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v5

    .line 392
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v6

    .line 395
    invoke-static {v5, v6, v3, v2}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v5

    .line 397
    invoke-static {v3, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 398
    invoke-static {v3, v2}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v6

    .line 399
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v7

    .line 400
    invoke-static {v3, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 402
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    const v9, -0x2942ffcf

    .line 403
    invoke-static {v3, v9, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 404
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v9

    instance-of v9, v9, Landroidx/compose/runtime/Applier;

    if-nez v9, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 405
    :cond_5
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 406
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v9

    if-eqz v9, :cond_6

    .line 407
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    .line 409
    :cond_6
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 411
    :goto_1
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .line 412
    sget-object v9, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v8, v5, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 413
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v8, v7, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 415
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    .line 417
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v7

    if-nez v7, :cond_7

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    .line 418
    :cond_7
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 419
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6, v5}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 422
    :cond_8
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v8, v4, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v4, -0x184f2606

    .line 424
    const-string v5, "C101@5126L9:Row.kt#2w3rfo"

    .line 425
    invoke-static {v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v4, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    move-object v5, v4

    check-cast v5, Landroidx/compose/foundation/layout/RowScope;

    const v4, 0x3dc83575

    const-string v6, "C125@4526L10,121@4340L279:IdResultScreen.kt#4ipo3i"

    .line 122
    invoke-static {v3, v4, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    move-object v4, v1

    .line 123
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/id/IdResultData;->getDocType()Ljava/lang/String;

    move-result-object v1

    .line 124
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v6, Landroidx/compose/ui/Modifier;

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 125
    sget-object v6, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    move-result v6

    .line 126
    sget-object v7, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v8, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v7, v3, v8}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/material3/Typography;->getHeadlineMedium()Landroidx/compose/ui/text/TextStyle;

    move-result-object v21

    .line 127
    sget-object v7, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v8

    .line 125
    invoke-static {v6}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    move-result-object v13

    const/16 v24, 0x0

    const v25, 0xfddc

    move-object/from16 v22, v3

    move-object v6, v4

    const-wide/16 v3, 0x0

    move v9, v2

    move-object v2, v5

    move-object v7, v6

    const-wide/16 v5, 0x0

    move-object v10, v7

    const/4 v7, 0x0

    move v11, v9

    const/4 v9, 0x0

    move-object v12, v10

    move v14, v11

    const-wide/16 v10, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move/from16 v17, v14

    move-object/from16 v16, v15

    const-wide/16 v14, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v26, v20

    const/16 v20, 0x0

    move/from16 v27, v23

    const/high16 v23, 0x30000

    move-object/from16 p5, v0

    move/from16 v0, v27

    .line 122
    invoke-static/range {v1 .. v25}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v22

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 425
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 426
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 403
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 397
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 390
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v1, 0x7258f69

    .line 429
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "*134@4744L11"

    invoke-static {v3, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-eqz p1, :cond_a

    if-nez p4, :cond_9

    goto :goto_2

    .line 135
    :cond_9
    invoke-static {v3, v0}, Lcom/smartengines/app/ui/results/NfcScreenKt;->NfcScreen(Landroidx/compose/runtime/Composer;I)V

    .line 136
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 134
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_a
    :goto_2
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v0, 0x725a19e

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "*146@5129L109"

    invoke-static {v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 139
    invoke-virtual/range {p3 .. p3}, Lcom/smartengines/app/settings/IdSettings;->getEnableForensics()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 142
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/id/IdResultData;->getForensicCheckFields()Ljava/util/List;

    move-result-object v0

    .line 143
    invoke-virtual/range {p3 .. p3}, Lcom/smartengines/app/settings/IdSettings;->getShowUndefChecks()Z

    move-result v1

    .line 144
    invoke-virtual/range {p3 .. p3}, Lcom/smartengines/app/settings/IdSettings;->getShowChecksFilter()Ljava/lang/String;

    move-result-object v2

    .line 145
    invoke-virtual/range {p3 .. p3}, Lcom/smartengines/app/settings/IdSettings;->getHideChecksFilter()Ljava/lang/String;

    move-result-object v4

    .line 142
    invoke-static {v0, v1, v2, v4}, Lcom/smartengines/app/ui/results/ChecksFilterKt;->filterChecks(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 430
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/engine/id/CheckField;

    .line 147
    new-instance v2, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda0;

    move-object/from16 v10, v26

    invoke-direct {v2, v0, v10}, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda0;-><init>(Lcom/smartengines/engine/id/CheckField;Landroidx/compose/runtime/MutableState;)V

    const/16 v4, 0x48

    const/4 v5, 0x0

    move-object/from16 v1, p2

    move-object/from16 v7, p5

    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->CheckFieldCard(Lcom/smartengines/engine/id/CheckField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_b
    move-object/from16 v1, p2

    move-object/from16 v7, p5

    move-object/from16 v10, v26

    .line 431
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v0, 0x7262ee4

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "*170@5975L100"

    invoke-static {v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 166
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/id/IdResultData;->getTextFields()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda5;

    invoke-direct {v2}, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda5;-><init>()V

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 432
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/16 v4, 0x48

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/engine/id/TextField;

    .line 171
    new-instance v5, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda6;

    invoke-direct {v5, v2, v10}, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda6;-><init>(Lcom/smartengines/engine/id/TextField;Landroidx/compose/runtime/MutableState;)V

    invoke-static {v2, v1, v5, v3, v4}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->TextFieldCard(Lcom/smartengines/engine/id/TextField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    .line 433
    :cond_c
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v0, 0x72643ac

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "*175@6140L140"

    invoke-static {v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 175
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/id/IdResultData;->getImageFields()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 434
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/engine/id/ImageField;

    .line 176
    new-instance v5, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda7;

    invoke-direct {v5, v2, v10}, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda7;-><init>(Lcom/smartengines/engine/id/ImageField;Landroidx/compose/runtime/MutableState;)V

    invoke-static {v2, v1, v5, v3, v4}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->ImageFieldCard(Lcom/smartengines/engine/id/ImageField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    .line 435
    :cond_d
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 120
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 389
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 436
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 367
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 361
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 354
    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 183
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 112
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 186
    invoke-static {v10}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultDataScreen$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_e

    goto :goto_6

    :cond_e
    const v2, -0x6fa44e6d

    .line 187
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v3, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 440
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 441
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_f

    .line 187
    new-instance v2, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda8;

    invoke-direct {v2, v10}, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda8;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 443
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 187
    :cond_f
    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v4, 0x38

    invoke-static {v0, v2, v3, v4}, Lcom/smartengines/app/ui/results/AttributesDialogKt;->AttributesDialog(Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 188
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 186
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_6
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;

    move/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object v3, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;-><init>(Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;I)V

    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_10
    return-void
.end method

.method private static final IdResultDataScreen$lambda$16$lambda$15$lambda$10(Lcom/smartengines/engine/id/TextField;Lcom/smartengines/engine/id/TextField;)I
    .locals 2

    .line 167
    invoke-virtual {p0}, Lcom/smartengines/engine/id/TextField;->getKey()Ljava/lang/String;

    move-result-object v0

    const-string v1, "face_control"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, -0x1

    return p0

    .line 168
    :cond_0
    invoke-virtual {p1}, Lcom/smartengines/engine/id/TextField;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    .line 169
    :cond_1
    invoke-virtual {p0}, Lcom/smartengines/engine/id/TextField;->getKey()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/smartengines/engine/id/TextField;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static final IdResultDataScreen$lambda$16$lambda$15$lambda$12$lambda$11(Lcom/smartengines/engine/id/TextField;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$visibleAttributes$delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    invoke-virtual {p0}, Lcom/smartengines/engine/id/TextField;->getAttr()Ljava/util/List;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultDataScreen$lambda$5(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 173
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final IdResultDataScreen$lambda$16$lambda$15$lambda$14$lambda$13(Lcom/smartengines/engine/id/ImageField;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$visibleAttributes$delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    invoke-virtual {p0}, Lcom/smartengines/engine/id/ImageField;->getAttr()Ljava/util/List;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultDataScreen$lambda$5(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 180
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final IdResultDataScreen$lambda$16$lambda$15$lambda$9$lambda$8(Lcom/smartengines/engine/id/CheckField;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$visibleAttributes$delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    invoke-virtual {p0}, Lcom/smartengines/engine/id/CheckField;->getAttr()Ljava/util/List;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultDataScreen$lambda$5(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    .line 149
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final IdResultDataScreen$lambda$19$lambda$18$lambda$17(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$visibleAttributes$delegate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 187
    invoke-static {p0, v0}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultDataScreen$lambda$5(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final IdResultDataScreen$lambda$20(Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7

    const-string p7, "$resultData"

    invoke-static {p0, p7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p7, "$commonSettings"

    invoke-static {p2, p7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p7, "$idSettings"

    invoke-static {p3, p7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultDataScreen(Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final IdResultDataScreen$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/id/Attribute;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/id/Attribute;",
            ">;"
        }
    .end annotation

    .line 110
    check-cast p0, Landroidx/compose/runtime/State;

    .line 504
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final IdResultDataScreen$lambda$5(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/id/Attribute;",
            ">;>;",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/id/Attribute;",
            ">;)V"
        }
    .end annotation

    .line 505
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final IdResultScreen(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;Landroidx/compose/runtime/Composer;II)V
    .locals 11

    const-string v0, "selectedTreeLeaf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1d42da25

    move-object/from16 v1, p6

    .line 77
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v0

    const-string v1, "C(IdResultScreen)P(5,4,1)63@2525L308,79@3180L577,79@3172L585:IdResultScreen.kt#4ipo3i"

    invoke-static {v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v1, p8, 0x4

    if-eqz v1, :cond_3

    const p2, 0x54942c44

    .line 64
    invoke-interface {v0, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p2, "CC(remember):IdResultScreen.kt#9igjgp"

    invoke-static {v0, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 341
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    .line 342
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne p2, v1, :cond_2

    .line 66
    sget-object p2, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p2}, Lcom/smartengines/app/Model;->getSession()Lcom/smartengines/engine/Session;

    move-result-object p2

    .line 67
    instance-of v1, p2, Lcom/smartengines/engine/id/IdSessionWrapper;

    if-eqz v1, :cond_0

    check-cast p2, Lcom/smartengines/engine/id/IdSessionWrapper;

    invoke-virtual {p1}, Lcom/smartengines/engine/id/IdResultData;->getDocType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/smartengines/engine/id/IdSessionWrapper;->hasRFID(Ljava/lang/String;)Z

    move-result p2

    goto :goto_0

    .line 68
    :cond_0
    instance-of v1, p2, Lcom/smartengines/engine/id/VaSessionWrapper;

    if-eqz v1, :cond_1

    check-cast p2, Lcom/smartengines/engine/id/VaSessionWrapper;

    invoke-virtual {p1}, Lcom/smartengines/engine/id/IdResultData;->getDocType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/smartengines/engine/id/VaSessionWrapper;->hasRFID(Ljava/lang/String;)Z

    move-result p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 65
    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    .line 344
    invoke-interface {v0, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 64
    :cond_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :cond_3
    move v4, p2

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_4

    .line 74
    invoke-static {}, Lcom/smartengines/app/AppKt;->getCommonSettingsStore()Lcom/smartengines/app/settings/CommonSettingsStore;

    move-result-object p2

    invoke-virtual {p2}, Lcom/smartengines/app/settings/CommonSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object p3, p2

    check-cast p3, Lcom/smartengines/app/settings/CommonSettings;

    :cond_4
    move-object v5, p3

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_5

    .line 75
    invoke-static {}, Lcom/smartengines/app/AppKt;->getIdSettingsStore()Lcom/smartengines/app/settings/IdSettingsStore;

    move-result-object p2

    invoke-virtual {p2}, Lcom/smartengines/app/settings/IdSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    move-object p4, p2

    check-cast p4, Lcom/smartengines/app/settings/IdSettings;

    :cond_5
    move-object v6, p4

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_6

    .line 76
    sget-object p2, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p2}, Lcom/smartengines/app/Model;->getPassportReader()Lcom/smartengines/nfc/PassportReader;

    move-result-object p2

    invoke-virtual {p2}, Lcom/smartengines/nfc/PassportReader;->getPassportKeyFlow()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/smartengines/nfc/PassportKey;

    move-object v7, p2

    goto :goto_1

    :cond_6
    move-object/from16 v7, p5

    .line 80
    :goto_1
    new-instance v1, Lcom/smartengines/app/ui/results/IdResultScreenKt$IdResultScreen$2;

    move-object v2, v5

    move v5, v4

    move-object v4, v2

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Lcom/smartengines/app/ui/results/IdResultScreenKt$IdResultScreen$2;-><init>(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/IdResultData;Lcom/smartengines/app/settings/CommonSettings;ZLcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;)V

    move v10, v5

    move-object v5, v4

    move v4, v10

    const/16 p2, 0x36

    const p3, -0x5645bfac

    const/4 p4, 0x1

    invoke-static {p3, p4, v1, v0, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p2

    check-cast p2, Lkotlin/jvm/functions/Function3;

    const/4 p3, 0x6

    invoke-static {p2, v0, p3}, Lcom/smartengines/app/ui/BodyBoxKt;->BodyBox(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v1, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;

    move-object v2, p0

    move-object v3, p1

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;-><init>(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;II)V

    invoke-interface {p2, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_7
    return-void
.end method

.method private static final IdResultScreen$lambda$2(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10

    const-string v0, "$selectedTreeLeaf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$resultData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultScreen(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final ImageFieldCard(Lcom/smartengines/engine/id/ImageField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/engine/id/ImageField;",
            "Lcom/smartengines/app/settings/CommonSettings;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const v0, 0x131734e

    .line 239
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p3

    const-string v0, "C(ImageFieldCard)P(!1,2)*240@8017L689,240@7997L709:IdResultScreen.kt#4ipo3i"

    invoke-static {p3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 241
    new-instance v0, Lcom/smartengines/app/ui/results/IdResultScreenKt$ImageFieldCard$1$1;

    invoke-direct {v0, p0, p1}, Lcom/smartengines/app/ui/results/IdResultScreenKt$ImageFieldCard$1$1;-><init>(Lcom/smartengines/engine/id/ImageField;Lcom/smartengines/app/settings/CommonSettings;)V

    const/16 v1, 0x36

    const v2, -0x4c7cd388

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p3, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function3;

    shr-int/lit8 v1, p4, 0x6

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v1, v1, 0x30

    const/4 v2, 0x0

    invoke-static {p2, v0, p3, v1, v2}, Lcom/smartengines/app/ui/results/ResFragmentsKt;->ResultCard(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 240
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p3

    if-eqz p3, :cond_0

    new-instance v0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda11;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda11;-><init>(Lcom/smartengines/engine/id/ImageField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_0
    return-void
.end method

.method private static final ImageFieldCard$lambda$27(Lcom/smartengines/engine/id/ImageField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    const-string p5, "$imageField"

    invoke-static {p0, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "$settings"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->ImageFieldCard(Lcom/smartengines/engine/id/ImageField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final Light_Preview(Landroidx/compose/runtime/Composer;I)V
    .locals 5

    const v0, 0x15ba2689

    .line 329
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p0

    const-string v0, "C(Light_Preview)329@11066L16,330@11114L7,331@11137L41,332@11220L144,332@11183L181:IdResultScreen.kt#4ipo3i"

    invoke-static {p0, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-nez p1, :cond_1

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 339
    :cond_0
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 330
    invoke-static {p0, v0}, Lcom/smartengines/app/ui/ScreenDataKt;->ReadScreenData(Landroidx/compose/runtime/Composer;I)V

    .line 331
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v1

    check-cast v1, Landroidx/compose/runtime/CompositionLocal;

    const v2, 0x789c5f52

    const-string v3, "CC:CompositionLocal.kt#9igjgp"

    .line 497
    invoke-static {p0, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p0, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 331
    check-cast v1, Landroid/content/Context;

    const v2, 0x4ce97bc

    invoke-interface {p0, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "CC(remember):IdResultScreen.kt#9igjgp"

    invoke-static {p0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 498
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 499
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_2

    .line 332
    invoke-static {v1}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->getMockIdResultData(Landroid/content/Context;)Lcom/smartengines/engine/id/IdResultData;

    move-result-object v2

    .line 501
    invoke-interface {p0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 332
    :cond_2
    check-cast v2, Lcom/smartengines/engine/id/IdResultData;

    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 333
    new-instance v1, Lcom/smartengines/app/ui/results/IdResultScreenKt$Light_Preview$1;

    invoke-direct {v1, v2}, Lcom/smartengines/app/ui/results/IdResultScreenKt$Light_Preview$1;-><init>(Lcom/smartengines/engine/id/IdResultData;)V

    const v2, -0x2e9408c

    const/4 v3, 0x1

    const/16 v4, 0x36

    invoke-static {v2, v3, v1, p0, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p0, v4}, Lcom/smartengines/app/ui/theme/ThemeKt;->SmartEnginesTheme(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 339
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_3

    new-instance v0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda10;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda10;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_3
    return-void
.end method

.method private static final Light_Preview$lambda$35(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->Light_Preview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final TextFieldCard(Lcom/smartengines/engine/id/TextField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/engine/id/TextField;",
            "Lcom/smartengines/app/settings/CommonSettings;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const v0, 0x7ba0e484

    .line 202
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p3

    const-string v0, "C(TextFieldCard)P(2,1)*203@6817L430,203@6798L449:IdResultScreen.kt#4ipo3i"

    invoke-static {p3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 204
    new-instance v0, Lcom/smartengines/app/ui/results/IdResultScreenKt$TextFieldCard$1$1;

    invoke-direct {v0, p0, p1}, Lcom/smartengines/app/ui/results/IdResultScreenKt$TextFieldCard$1$1;-><init>(Lcom/smartengines/engine/id/TextField;Lcom/smartengines/app/settings/CommonSettings;)V

    const/16 v1, 0x36

    const v2, -0x6e4e821a

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, p3, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function3;

    shr-int/lit8 v1, p4, 0x6

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v1, v1, 0x30

    const/4 v2, 0x0

    invoke-static {p2, v0, p3, v1, v2}, Lcom/smartengines/app/ui/results/ResFragmentsKt;->ResultCard(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 203
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p3

    if-eqz p3, :cond_0

    new-instance v0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda12;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda12;-><init>(Lcom/smartengines/engine/id/TextField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_0
    return-void
.end method

.method private static final TextFieldCard$lambda$23(Lcom/smartengines/engine/id/TextField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    const-string p5, "$textField"

    invoke-static {p0, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "$settings"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->TextFieldCard(Lcom/smartengines/engine/id/TextField;Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$IdResultDataScreen(Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultDataScreen(Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final getMockIdResultData(Landroid/content/Context;)Lcom/smartengines/engine/id/IdResultData;
    .locals 13

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    new-instance v1, Lcom/smartengines/engine/id/IdResultData;

    const/4 v0, 0x2

    .line 286
    new-array v2, v0, [Lcom/smartengines/engine/id/TextField;

    new-instance v3, Lcom/smartengines/engine/id/TextField;

    .line 287
    new-array v4, v0, [Lcom/smartengines/engine/id/Attribute;

    new-instance v5, Lcom/smartengines/engine/id/Attribute;

    const-string v6, "mono_score"

    const-string v7, "-1.5"

    invoke-direct {v5, v6, v7}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v8, 0x0

    aput-object v5, v4, v8

    new-instance v5, Lcom/smartengines/engine/id/Attribute;

    const-string v9, "att_sample"

    const-string v10, "sample text"

    invoke-direct {v5, v9, v10}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v9, 0x1

    aput-object v5, v4, v9

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 286
    const-string v5, "birth_date"

    const-string v10, "29.10.1981"

    invoke-direct {v3, v5, v10, v9, v4}, Lcom/smartengines/engine/id/TextField;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V

    aput-object v3, v2, v8

    .line 289
    new-instance v3, Lcom/smartengines/engine/id/TextField;

    .line 290
    new-array v4, v0, [Lcom/smartengines/engine/id/Attribute;

    new-instance v5, Lcom/smartengines/engine/id/Attribute;

    invoke-direct {v5, v6, v7}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v5, v4, v8

    new-instance v5, Lcom/smartengines/engine/id/Attribute;

    const-string v10, "att_key"

    const-string v11, "key sample text"

    invoke-direct {v5, v10, v11}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v5, v4, v9

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 289
    const-string v5, "birth_place"

    const-string v12, "DA\u010cICE"

    invoke-direct {v3, v5, v12, v9, v4}, Lcom/smartengines/engine/id/TextField;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V

    aput-object v3, v2, v9

    .line 285
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 293
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    .line 295
    new-instance v2, Lcom/smartengines/engine/id/ImageField;

    .line 298
    const-string v5, "sample_photo.png"

    invoke-static {p0, v5}, Lcom/smartengines/utils/UtilsKt;->loadBitmapFromAssetFile(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 300
    new-array v5, v0, [Lcom/smartengines/engine/id/Attribute;

    new-instance v12, Lcom/smartengines/engine/id/Attribute;

    invoke-direct {v12, v6, v7}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v12, v5, v8

    new-instance v6, Lcom/smartengines/engine/id/Attribute;

    invoke-direct {v6, v10, v11}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v6, v5, v9

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 295
    const-string v6, "photo"

    invoke-direct {v2, v6, p0, v9, v5}, Lcom/smartengines/engine/id/ImageField;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/util/List;)V

    .line 294
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 p0, 0x3

    .line 304
    new-array p0, p0, [Lcom/smartengines/engine/id/CheckField;

    new-instance v2, Lcom/smartengines/engine/id/CheckField;

    sget-object v6, Lcom/smartengines/engine/id/CheckStatus;->UNDEFINED:Lcom/smartengines/engine/id/CheckStatus;

    new-instance v7, Lcom/smartengines/engine/id/Attribute;

    const-string v10, "reason"

    const-string v11, "Not all values are present"

    invoke-direct {v7, v10, v11}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const-string v10, "Check_0003"

    invoke-direct {v2, v10, v6, v7}, Lcom/smartengines/engine/id/CheckField;-><init>(Ljava/lang/String;Lcom/smartengines/engine/id/CheckStatus;Ljava/util/List;)V

    aput-object v2, p0, v8

    .line 305
    new-instance v2, Lcom/smartengines/engine/id/CheckField;

    sget-object v6, Lcom/smartengines/engine/id/CheckStatus;->PASSED:Lcom/smartengines/engine/id/CheckStatus;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    const-string v8, "Check_0001"

    invoke-direct {v2, v8, v6, v7}, Lcom/smartengines/engine/id/CheckField;-><init>(Ljava/lang/String;Lcom/smartengines/engine/id/CheckStatus;Ljava/util/List;)V

    aput-object v2, p0, v9

    .line 306
    new-instance v2, Lcom/smartengines/engine/id/CheckField;

    sget-object v6, Lcom/smartengines/engine/id/CheckStatus;->FAILED:Lcom/smartengines/engine/id/CheckStatus;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    const-string v8, "Check_0002"

    invoke-direct {v2, v8, v6, v7}, Lcom/smartengines/engine/id/CheckField;-><init>(Ljava/lang/String;Lcom/smartengines/engine/id/CheckStatus;Ljava/util/List;)V

    aput-object v2, p0, v0

    .line 303
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 308
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    .line 309
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v8

    .line 310
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v9

    .line 283
    const-string v2, "cze.passport.type1"

    invoke-direct/range {v1 .. v9}, Lcom/smartengines/engine/id/IdResultData;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V

    return-object v1
.end method
