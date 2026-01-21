.class public final Landroidx/compose/material3/ModalBottomSheetKt;
.super Ljava/lang/Object;
.source "ModalBottomSheet.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,445:1\n148#2:446\n148#2:544\n148#2:545\n488#3:447\n487#3,4:448\n491#3,2:455\n495#3:461\n1223#4,3:452\n1226#4,3:458\n1223#4,6:462\n1223#4,6:468\n1223#4,6:474\n1223#4,6:480\n1223#4,6:486\n1223#4,6:493\n1223#4,6:499\n1223#4,6:505\n1223#4,6:511\n1223#4,6:517\n1223#4,6:525\n1223#4,6:531\n1223#4,6:537\n487#5:457\n177#6:492\n240#6:524\n696#7:523\n81#8:543\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt\n*L\n127#1:446\n442#1:544\n443#1:545\n134#1:447\n134#1:448,4\n134#1:455,2\n134#1:461\n134#1:452,3\n134#1:458,3\n135#1:462,6\n146#1:468,6\n152#1:474,6\n156#1:480,6\n194#1:486,6\n225#1:493,6\n233#1:499,6\n268#1:505,6\n270#1:511,6\n274#1:517,6\n415#1:525,6\n416#1:531,6\n427#1:537,6\n134#1:457\n216#1:492\n412#1:524\n409#1:523\n411#1:543\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u00c4\u0001\u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00132\u0015\u0008\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u00182\u0013\u0008\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001a0\n\u00a2\u0006\u0002\u0008\u00182\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00080\u001e\u00a2\u0006\u0002\u0008\u0018\u00a2\u0006\u0002\u0008 H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\"\u001a0\u0010#\u001a\u00020\u00082\u0006\u0010$\u001a\u00020\u00132\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0006\u0010%\u001a\u00020&H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\'\u0010(\u001a-\u0010)\u001a\u00020\u000e2\u0008\u0008\u0002\u0010*\u001a\u00020&2\u0014\u0008\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020&0\u001eH\u0007\u00a2\u0006\u0002\u0010-\u001a\u00f3\u0001\u0010.\u001a\u00020\u0008*\u00020/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203012\u0006\u00104\u001a\u0002052\u000c\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2!\u00107\u001a\u001d\u0012\u0013\u0012\u001102\u00a2\u0006\u000c\u00088\u0012\u0008\u00089\u0012\u0004\u0008\u0008(:\u0012\u0004\u0012\u00020\u00080\u001e2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00042\u0015\u0008\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u00182\u0013\u0008\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001a0\n\u00a2\u0006\u0002\u0008\u00182\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00080\u001e\u00a2\u0006\u0002\u0008\u0018\u00a2\u0006\u0002\u0008 H\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008;\u0010<\u001a\u0014\u0010=\u001a\u000202*\u00020>2\u0006\u0010?\u001a\u000202H\u0002\u001a\u0014\u0010@\u001a\u000202*\u00020>2\u0006\u0010?\u001a\u000202H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006A\u00b2\u0006\n\u0010B\u001a\u000202X\u008a\u0084\u0002"
    }
    d2 = {
        "PredictiveBackChildTransformOrigin",
        "Landroidx/compose/ui/graphics/TransformOrigin;",
        "J",
        "PredictiveBackMaxScaleXDistance",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "PredictiveBackMaxScaleYDistance",
        "ModalBottomSheet",
        "",
        "onDismissRequest",
        "Lkotlin/Function0;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "sheetState",
        "Landroidx/compose/material3/SheetState;",
        "sheetMaxWidth",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "containerColor",
        "Landroidx/compose/ui/graphics/Color;",
        "contentColor",
        "tonalElevation",
        "scrimColor",
        "dragHandle",
        "Landroidx/compose/runtime/Composable;",
        "contentWindowInsets",
        "Landroidx/compose/foundation/layout/WindowInsets;",
        "properties",
        "Landroidx/compose/material3/ModalBottomSheetProperties;",
        "content",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Lkotlin/ExtensionFunctionType;",
        "ModalBottomSheet-dYc4hso",
        "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "Scrim",
        "color",
        "visible",
        "",
        "Scrim-3J-VO9M",
        "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V",
        "rememberModalBottomSheetState",
        "skipPartiallyExpanded",
        "confirmValueChange",
        "Landroidx/compose/material3/SheetValue;",
        "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;",
        "ModalBottomSheetContent",
        "Landroidx/compose/foundation/layout/BoxScope;",
        "predictiveBackProgress",
        "Landroidx/compose/animation/core/Animatable;",
        "",
        "Landroidx/compose/animation/core/AnimationVector1D;",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "animateToDismiss",
        "settleToDismiss",
        "Lkotlin/ParameterName;",
        "name",
        "velocity",
        "ModalBottomSheetContent-IQkwcL4",
        "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "calculatePredictiveBackScaleX",
        "Landroidx/compose/ui/graphics/GraphicsLayerScope;",
        "progress",
        "calculatePredictiveBackScaleY",
        "material3_release",
        "alpha"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final PredictiveBackChildTransformOrigin:J

.field private static final PredictiveBackMaxScaleXDistance:F

.field private static final PredictiveBackMaxScaleYDistance:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x30

    int-to-float v0, v0

    .line 544
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 442
    sput v0, Landroidx/compose/material3/ModalBottomSheetKt;->PredictiveBackMaxScaleXDistance:F

    const/16 v0, 0x18

    int-to-float v0, v0

    .line 545
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 443
    sput v0, Landroidx/compose/material3/ModalBottomSheetKt;->PredictiveBackMaxScaleYDistance:F

    const/high16 v0, 0x3f000000    # 0.5f

    const/4 v1, 0x0

    .line 444
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/TransformOriginKt;->TransformOrigin(FF)J

    move-result-wide v0

    sput-wide v0, Landroidx/compose/material3/ModalBottomSheetKt;->PredictiveBackChildTransformOrigin:J

    return-void
.end method

.method public static final ModalBottomSheet-dYc4hso(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 45
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material3/SheetState;",
            "F",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJFJ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/foundation/layout/WindowInsets;",
            ">;",
            "Landroidx/compose/material3/ModalBottomSheetProperties;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v0, p17

    move/from16 v2, p18

    move/from16 v3, p19

    const v4, 0x7f1eb8b9

    move-object/from16 v5, p16

    .line 133
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    const-string v6, "C(ModalBottomSheet)P(6,5,11,10:c#ui.unit.Dp,9,0:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.unit.Dp,8:c#ui.graphics.Color,4,3,7)121@6012L31,123@6143L13,124@6206L14,125@6248L31,127@6356L10,133@6697L24,134@6761L327,145@7142L149,151@7326L42,155@7458L708,167@8231L771,153@7374L1628,193@9077L21,193@9050L48:ModalBottomSheet.kt#uh7d8r"

    invoke-static {v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v6, v3, 0x1

    if-eqz v6, :cond_0

    or-int/lit8 v6, v0, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v0, 0x6

    if-nez v6, :cond_2

    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move v6, v0

    :goto_1
    and-int/lit8 v9, v3, 0x2

    if-eqz v9, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v12, v0, 0x30

    if-nez v12, :cond_5

    move-object/from16 v12, p1

    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x20

    goto :goto_2

    :cond_4
    const/16 v13, 0x10

    :goto_2
    or-int/2addr v6, v13

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v12, p1

    :goto_4
    and-int/lit16 v13, v0, 0x180

    if-nez v13, :cond_8

    and-int/lit8 v13, v3, 0x4

    if-nez v13, :cond_6

    move-object/from16 v13, p2

    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_5

    :cond_6
    move-object/from16 v13, p2

    :cond_7
    const/16 v16, 0x80

    :goto_5
    or-int v6, v6, v16

    goto :goto_6

    :cond_8
    move-object/from16 v13, p2

    :goto_6
    and-int/lit8 v16, v3, 0x8

    if-eqz v16, :cond_9

    or-int/lit16 v6, v6, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v10, v0, 0xc00

    if-nez v10, :cond_b

    move/from16 v10, p3

    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v17

    if-eqz v17, :cond_a

    const/16 v17, 0x800

    goto :goto_7

    :cond_a
    const/16 v17, 0x400

    :goto_7
    or-int v6, v6, v17

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v10, p3

    :goto_9
    and-int/lit16 v11, v0, 0x6000

    if-nez v11, :cond_e

    and-int/lit8 v11, v3, 0x10

    if-nez v11, :cond_c

    move-object/from16 v11, p4

    invoke-interface {v5, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_d

    const/16 v18, 0x4000

    goto :goto_a

    :cond_c
    move-object/from16 v11, p4

    :cond_d
    const/16 v18, 0x2000

    :goto_a
    or-int v6, v6, v18

    goto :goto_b

    :cond_e
    move-object/from16 v11, p4

    :goto_b
    const/high16 v18, 0x30000

    and-int v18, v0, v18

    if-nez v18, :cond_10

    and-int/lit8 v18, v3, 0x20

    move-wide/from16 v7, p5

    if-nez v18, :cond_f

    invoke-interface {v5, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v20

    if-eqz v20, :cond_f

    const/high16 v20, 0x20000

    goto :goto_c

    :cond_f
    const/high16 v20, 0x10000

    :goto_c
    or-int v6, v6, v20

    goto :goto_d

    :cond_10
    move-wide/from16 v7, p5

    :goto_d
    const/high16 v20, 0x180000

    and-int v20, v0, v20

    if-nez v20, :cond_12

    and-int/lit8 v20, v3, 0x40

    move-wide/from16 v14, p7

    if-nez v20, :cond_11

    invoke-interface {v5, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v21

    if-eqz v21, :cond_11

    const/high16 v21, 0x100000

    goto :goto_e

    :cond_11
    const/high16 v21, 0x80000

    :goto_e
    or-int v6, v6, v21

    goto :goto_f

    :cond_12
    move-wide/from16 v14, p7

    :goto_f
    and-int/lit16 v4, v3, 0x80

    const/high16 v22, 0xc00000

    if-eqz v4, :cond_13

    or-int v6, v6, v22

    move/from16 v0, p9

    goto :goto_11

    :cond_13
    and-int v22, v0, v22

    move/from16 v0, p9

    if-nez v22, :cond_15

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v22

    if-eqz v22, :cond_14

    const/high16 v22, 0x800000

    goto :goto_10

    :cond_14
    const/high16 v22, 0x400000

    :goto_10
    or-int v6, v6, v22

    :cond_15
    :goto_11
    const/high16 v22, 0x6000000

    and-int v22, p17, v22

    if-nez v22, :cond_18

    and-int/lit16 v0, v3, 0x100

    if-nez v0, :cond_16

    move v0, v6

    move-wide/from16 v6, p10

    invoke-interface {v5, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v8

    if-eqz v8, :cond_17

    const/high16 v8, 0x4000000

    goto :goto_12

    :cond_16
    move v0, v6

    move-wide/from16 v6, p10

    :cond_17
    const/high16 v8, 0x2000000

    :goto_12
    or-int/2addr v0, v8

    goto :goto_13

    :cond_18
    move v0, v6

    move-wide/from16 v6, p10

    :goto_13
    and-int/lit16 v8, v3, 0x200

    const/high16 v22, 0x30000000

    if-eqz v8, :cond_19

    or-int v0, v0, v22

    goto :goto_16

    :cond_19
    and-int v22, p17, v22

    if-nez v22, :cond_1b

    move/from16 v22, v0

    move-object/from16 v0, p12

    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1a

    const/high16 v23, 0x20000000

    goto :goto_14

    :cond_1a
    const/high16 v23, 0x10000000

    :goto_14
    or-int v22, v22, v23

    goto :goto_15

    :cond_1b
    move/from16 v22, v0

    move-object/from16 v0, p12

    :goto_15
    move/from16 v0, v22

    :goto_16
    and-int/lit8 v22, v2, 0x6

    if-nez v22, :cond_1e

    move/from16 v22, v4

    and-int/lit16 v4, v3, 0x400

    if-nez v4, :cond_1c

    move-object/from16 v4, p13

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1d

    const/16 v23, 0x4

    goto :goto_17

    :cond_1c
    move-object/from16 v4, p13

    :cond_1d
    const/16 v23, 0x2

    :goto_17
    or-int v23, v2, v23

    goto :goto_18

    :cond_1e
    move/from16 v22, v4

    move-object/from16 v4, p13

    move/from16 v23, v2

    :goto_18
    and-int/lit16 v4, v3, 0x800

    if-eqz v4, :cond_1f

    or-int/lit8 v23, v23, 0x30

    move/from16 v24, v4

    goto :goto_1a

    :cond_1f
    and-int/lit8 v24, v2, 0x30

    if-nez v24, :cond_21

    move/from16 v24, v4

    move-object/from16 v4, p14

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_20

    const/16 v17, 0x20

    goto :goto_19

    :cond_20
    const/16 v17, 0x10

    :goto_19
    or-int v23, v23, v17

    goto :goto_1a

    :cond_21
    move/from16 v24, v4

    move-object/from16 v4, p14

    :goto_1a
    move/from16 v4, v23

    and-int/lit16 v6, v3, 0x1000

    if-eqz v6, :cond_22

    or-int/lit16 v4, v4, 0x180

    goto :goto_1c

    :cond_22
    and-int/lit16 v6, v2, 0x180

    if-nez v6, :cond_24

    move-object/from16 v6, p15

    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_23

    const/16 v20, 0x100

    goto :goto_1b

    :cond_23
    const/16 v20, 0x80

    :goto_1b
    or-int v4, v4, v20

    goto :goto_1d

    :cond_24
    :goto_1c
    move-object/from16 v6, p15

    :goto_1d
    const v7, 0x12492493

    and-int/2addr v7, v0

    const v2, 0x12492492

    if-ne v7, v2, :cond_26

    and-int/lit16 v2, v4, 0x93

    const/16 v7, 0x92

    if-ne v2, v7, :cond_26

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_25

    goto :goto_1e

    .line 196
    :cond_25
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-wide/from16 v6, p5

    move-wide/from16 v26, p10

    move-object v2, v5

    move v4, v10

    move-object v5, v11

    move-object v3, v13

    move-wide v8, v14

    move/from16 v10, p9

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    goto/16 :goto_30

    .line 133
    :cond_26
    :goto_1e
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v2, p17, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_2e

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v2

    if-eqz v2, :cond_27

    goto :goto_1f

    .line 131
    :cond_27
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v2, v3, 0x4

    if-eqz v2, :cond_28

    and-int/lit16 v0, v0, -0x381

    :cond_28
    and-int/lit8 v2, v3, 0x10

    if-eqz v2, :cond_29

    const v2, -0xe001

    and-int/2addr v0, v2

    :cond_29
    and-int/lit8 v2, v3, 0x20

    if-eqz v2, :cond_2a

    const v2, -0x70001

    and-int/2addr v0, v2

    :cond_2a
    and-int/lit8 v2, v3, 0x40

    if-eqz v2, :cond_2b

    const v2, -0x380001

    and-int/2addr v0, v2

    :cond_2b
    and-int/lit16 v2, v3, 0x100

    if-eqz v2, :cond_2c

    const v2, -0xe000001

    and-int/2addr v0, v2

    :cond_2c
    and-int/lit16 v2, v3, 0x400

    if-eqz v2, :cond_2d

    and-int/lit8 v4, v4, -0xf

    :cond_2d
    move-wide/from16 v36, p5

    move/from16 v40, p9

    move-wide/from16 v26, p10

    move-object/from16 v41, p12

    move-object/from16 v42, p13

    move-object/from16 v20, p14

    move/from16 v34, v10

    move-object/from16 v35, v11

    move-object/from16 v33, v12

    move-wide/from16 v38, v14

    goto/16 :goto_28

    :cond_2e
    :goto_1f
    if-eqz v9, :cond_2f

    .line 121
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    move-object v12, v2

    :cond_2f
    and-int/lit8 v2, v3, 0x4

    if-eqz v2, :cond_30

    const/4 v2, 0x3

    const/4 v9, 0x0

    .line 122
    invoke-static {v7, v9, v5, v7, v2}, Landroidx/compose/material3/ModalBottomSheetKt;->rememberModalBottomSheetState(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;

    move-result-object v2

    and-int/lit16 v0, v0, -0x381

    move-object v13, v2

    :cond_30
    if-eqz v16, :cond_31

    .line 123
    sget-object v2, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v2}, Landroidx/compose/material3/BottomSheetDefaults;->getSheetMaxWidth-D9Ej5fM()F

    move-result v2

    goto :goto_20

    :cond_31
    move v2, v10

    :goto_20
    and-int/lit8 v9, v3, 0x10

    if-eqz v9, :cond_32

    .line 124
    sget-object v9, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    const/4 v10, 0x6

    invoke-virtual {v9, v5, v10}, Landroidx/compose/material3/BottomSheetDefaults;->getExpandedShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v9

    const v11, -0xe001

    and-int/2addr v0, v11

    goto :goto_21

    :cond_32
    const/4 v10, 0x6

    move-object v9, v11

    :goto_21
    and-int/lit8 v11, v3, 0x20

    if-eqz v11, :cond_33

    .line 125
    sget-object v11, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v11, v5, v10}, Landroidx/compose/material3/BottomSheetDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v25

    const v10, -0x70001

    and-int/2addr v0, v10

    move-wide/from16 v10, v25

    goto :goto_22

    :cond_33
    move-wide/from16 v10, p5

    :goto_22
    and-int/lit8 v16, v3, 0x40

    if-eqz v16, :cond_34

    shr-int/lit8 v14, v0, 0xf

    and-int/lit8 v14, v14, 0xe

    .line 126
    invoke-static {v10, v11, v5, v14}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    const v16, -0x380001

    and-int v0, v0, v16

    :cond_34
    move/from16 p1, v0

    if-eqz v22, :cond_35

    int-to-float v0, v7

    .line 446
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    goto :goto_23

    :cond_35
    move/from16 v0, p9

    :goto_23
    and-int/lit16 v7, v3, 0x100

    if-eqz v7, :cond_36

    .line 128
    sget-object v7, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    move/from16 p2, v0

    const/4 v0, 0x6

    invoke-virtual {v7, v5, v0}, Landroidx/compose/material3/BottomSheetDefaults;->getScrimColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v22

    const v0, -0xe000001

    and-int v0, p1, v0

    goto :goto_24

    :cond_36
    move/from16 p2, v0

    move/from16 v0, p1

    move-wide/from16 v22, p10

    :goto_24
    if-eqz v8, :cond_37

    sget-object v7, Landroidx/compose/material3/ComposableSingletons$ModalBottomSheetKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$ModalBottomSheetKt;

    invoke-virtual {v7}, Landroidx/compose/material3/ComposableSingletons$ModalBottomSheetKt;->getLambda-1$material3_release()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    goto :goto_25

    :cond_37
    move-object/from16 v7, p12

    :goto_25
    and-int/lit16 v8, v3, 0x400

    if-eqz v8, :cond_38

    .line 130
    sget-object v8, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$1;->INSTANCE:Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$1;

    check-cast v8, Lkotlin/jvm/functions/Function2;

    and-int/lit8 v4, v4, -0xf

    goto :goto_26

    :cond_38
    move-object/from16 v8, p13

    :goto_26
    if-eqz v24, :cond_39

    .line 131
    sget-object v20, Landroidx/compose/material3/ModalBottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/ModalBottomSheetDefaults;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/material3/ModalBottomSheetDefaults;->getProperties()Landroidx/compose/material3/ModalBottomSheetProperties;

    move-result-object v20

    move/from16 v40, p2

    goto :goto_27

    :cond_39
    move/from16 v40, p2

    move-object/from16 v20, p14

    :goto_27
    move/from16 v34, v2

    move-object/from16 v41, v7

    move-object/from16 v42, v8

    move-object/from16 v35, v9

    move-wide/from16 v36, v10

    move-object/from16 v33, v12

    move-wide/from16 v38, v14

    move-wide/from16 v26, v22

    :goto_28
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_3a

    const-string v2, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:132)"

    const v7, 0x7f1eb8b9

    .line 133
    invoke-static {v7, v0, v4, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_3a
    const v2, 0x2e20b340

    .line 134
    const-string v7, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp"

    .line 447
    invoke-static {v5, v2, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const v2, -0x38e26dd0

    .line 450
    const-string v7, "CC(remember):Effects.kt#9igjgp"

    .line 451
    invoke-static {v5, v2, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 452
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 453
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v2, v7, :cond_3b

    .line 457
    sget-object v2, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 456
    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v2, v5}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    .line 455
    new-instance v7, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v7, v2}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/CoroutineScope;)V

    .line 458
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v2, v7

    .line 451
    :cond_3b
    check-cast v2, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 461
    invoke-virtual {v2}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    .line 447
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v7, -0x77e36f2f

    .line 135
    const-string v8, "CC(remember):ModalBottomSheet.kt#9igjgp"

    invoke-static {v5, v7, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit16 v7, v0, 0x380

    xor-int/lit16 v7, v7, 0x180

    const/4 v9, 0x1

    const/16 v10, 0x100

    if-le v7, v10, :cond_3c

    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3d

    :cond_3c
    and-int/lit16 v11, v0, 0x180

    if-ne v11, v10, :cond_3e

    :cond_3d
    move v10, v9

    goto :goto_29

    :cond_3e
    const/4 v10, 0x0

    :goto_29
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    and-int/lit8 v11, v0, 0xe

    const/4 v12, 0x4

    if-ne v11, v12, :cond_3f

    move v12, v9

    goto :goto_2a

    :cond_3f
    const/4 v12, 0x0

    :goto_2a
    or-int/2addr v10, v12

    .line 462
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_40

    .line 463
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v12, v10, :cond_41

    .line 135
    :cond_40
    new-instance v10, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1;

    invoke-direct {v10, v13, v2, v1}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1;-><init>(Landroidx/compose/material3/SheetState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)V

    move-object v12, v10

    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 465
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 135
    :cond_41
    move-object/from16 v28, v12

    check-cast v28, Lkotlin/jvm/functions/Function0;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v10, -0x77e34041

    .line 146
    invoke-static {v5, v10, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    const/16 v12, 0x100

    if-le v7, v12, :cond_42

    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_43

    :cond_42
    and-int/lit16 v14, v0, 0x180

    if-ne v14, v12, :cond_44

    :cond_43
    move v12, v9

    goto :goto_2b

    :cond_44
    const/4 v12, 0x0

    :goto_2b
    or-int/2addr v10, v12

    const/4 v12, 0x4

    if-ne v11, v12, :cond_45

    move v12, v9

    goto :goto_2c

    :cond_45
    const/4 v12, 0x0

    :goto_2c
    or-int/2addr v10, v12

    .line 468
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_46

    .line 469
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v10

    if-ne v12, v10, :cond_47

    .line 146
    :cond_46
    new-instance v10, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1;

    invoke-direct {v10, v2, v13, v1}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1;-><init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;)V

    move-object v12, v10

    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 471
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 146
    :cond_47
    move-object/from16 v32, v12

    check-cast v32, Lkotlin/jvm/functions/Function1;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v10, -0x77e329ac

    .line 152
    invoke-static {v5, v10, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 474
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    .line 475
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v10, v12, :cond_48

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x2

    .line 152
    invoke-static {v10, v12, v15, v14}, Landroidx/compose/animation/core/AnimatableKt;->Animatable$default(FFILjava/lang/Object;)Landroidx/compose/animation/core/Animatable;

    move-result-object v10

    .line 477
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 152
    :cond_48
    check-cast v10, Landroidx/compose/animation/core/Animatable;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v12, -0x77e31692

    .line 156
    invoke-static {v5, v12, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/16 v12, 0x100

    if-le v7, v12, :cond_49

    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_4a

    :cond_49
    and-int/lit16 v14, v0, 0x180

    if-ne v14, v12, :cond_4b

    :cond_4a
    move v12, v9

    goto :goto_2d

    :cond_4b
    const/4 v12, 0x0

    :goto_2d
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v12, v14

    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v12, v14

    const/4 v14, 0x4

    if-ne v11, v14, :cond_4c

    move v11, v9

    goto :goto_2e

    :cond_4c
    const/4 v11, 0x0

    :goto_2e
    or-int/2addr v11, v12

    .line 480
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_4d

    .line 481
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v12, v11, :cond_4e

    .line 156
    :cond_4d
    new-instance v11, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;

    invoke-direct {v11, v13, v2, v10, v1}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;-><init>(Landroidx/compose/material3/SheetState;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function0;)V

    move-object v12, v11

    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 483
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 156
    :cond_4e
    check-cast v12, Lkotlin/jvm/functions/Function0;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 168
    new-instance v25, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$3;

    move-object/from16 v31, v2

    move-object/from16 v43, v6

    move-object/from16 v30, v10

    move-object/from16 v29, v13

    invoke-direct/range {v25 .. v43}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$3;-><init>(JLkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V

    move-object/from16 v2, v25

    const/16 v6, 0x36

    const v10, -0x12c18966

    invoke-static {v10, v9, v2, v5, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    check-cast v2, Lkotlin/jvm/functions/Function2;

    and-int/lit8 v4, v4, 0x70

    or-int/lit16 v4, v4, 0xc00

    sget v6, Landroidx/compose/animation/core/Animatable;->$stable:I

    const/16 v17, 0x6

    shl-int/lit8 v6, v6, 0x6

    or-int/2addr v4, v6

    move-object/from16 p4, v2

    move/from16 p6, v4

    move-object/from16 p5, v5

    move-object/from16 p1, v12

    move-object/from16 p2, v20

    move-object/from16 p3, v30

    .line 154
    invoke-static/range {p1 .. p6}, Landroidx/compose/material3/ModalBottomSheet_androidKt;->ModalBottomSheetDialog(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ModalBottomSheetProperties;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v2, p5

    .line 193
    invoke-virtual {v13}, Landroidx/compose/material3/SheetState;->getHasExpandedState()Z

    move-result v4

    if-eqz v4, :cond_54

    const v4, -0x77e24ee1

    .line 194
    invoke-static {v2, v4, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/16 v12, 0x100

    if-le v7, v12, :cond_4f

    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_50

    :cond_4f
    and-int/lit16 v4, v0, 0x180

    if-ne v4, v12, :cond_51

    :cond_50
    move v7, v9

    goto :goto_2f

    :cond_51
    const/4 v7, 0x0

    .line 486
    :goto_2f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v7, :cond_52

    .line 487
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_53

    .line 194
    :cond_52
    new-instance v4, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$4$1;

    const/4 v14, 0x0

    invoke-direct {v4, v13, v14}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$4$1;-><init>(Landroidx/compose/material3/SheetState;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 489
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 194
    :cond_53
    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v17, 0x6

    shr-int/lit8 v0, v0, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v13, v4, v2, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    :cond_54
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_55

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_55
    move-object v3, v13

    move-object/from16 v15, v20

    move-object/from16 v12, v33

    move/from16 v4, v34

    move-object/from16 v5, v35

    move-wide/from16 v6, v36

    move-wide/from16 v8, v38

    move/from16 v10, v40

    move-object/from16 v13, v41

    move-object/from16 v14, v42

    .line 196
    :goto_30
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_56

    move-object v2, v0

    new-instance v0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$5;

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v44, v2

    move-object v2, v12

    move-wide/from16 v11, v26

    invoke-direct/range {v0 .. v19}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$5;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v2, v44

    invoke-interface {v2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_56
    return-void
.end method

.method public static final ModalBottomSheetContent-IQkwcL4(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/BoxScope;",
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material3/SheetState;",
            "F",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJF",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Landroidx/compose/foundation/layout/WindowInsets;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move/from16 v0, p18

    move/from16 v3, p19

    move/from16 v4, p20

    const v6, -0x63f46313

    move-object/from16 v7, p17

    .line 215
    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v6

    const-string v7, "C(ModalBottomSheetContent)P(7,8!1,9,6,12,11:c#ui.unit.Dp,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.unit.Dp,5,4)205@9432L31,207@9563L13,208@9626L14,209@9668L31,215@10018L48,224@10294L324,232@10728L1476,267@12552L23,269@12621L112,273@12765L612,288@13518L2623,217@10072L6069:ModalBottomSheet.kt#uh7d8r"

    invoke-static {v6, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const/high16 v7, -0x80000000

    and-int/2addr v7, v4

    if-eqz v7, :cond_0

    or-int/lit8 v7, v0, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v0, 0x6

    if-nez v7, :cond_2

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v0

    goto :goto_1

    :cond_2
    move v7, v0

    :goto_1
    and-int/lit8 v10, v4, 0x1

    if-eqz v10, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v10, v0, 0x30

    if-nez v10, :cond_6

    and-int/lit8 v10, v0, 0x40

    if-nez v10, :cond_4

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_2

    :cond_4
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    :goto_2
    if-eqz v10, :cond_5

    const/16 v10, 0x20

    goto :goto_3

    :cond_5
    const/16 v10, 0x10

    :goto_3
    or-int/2addr v7, v10

    :cond_6
    :goto_4
    and-int/lit8 v10, v4, 0x2

    if-eqz v10, :cond_7

    or-int/lit16 v7, v7, 0x180

    goto :goto_6

    :cond_7
    and-int/lit16 v10, v0, 0x180

    if-nez v10, :cond_9

    move-object/from16 v10, p2

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_8

    const/16 v15, 0x100

    goto :goto_5

    :cond_8
    const/16 v15, 0x80

    :goto_5
    or-int/2addr v7, v15

    goto :goto_7

    :cond_9
    :goto_6
    move-object/from16 v10, p2

    :goto_7
    and-int/lit8 v15, v4, 0x4

    const/16 v16, 0x800

    const/16 v17, 0x400

    if-eqz v15, :cond_a

    or-int/lit16 v7, v7, 0xc00

    goto :goto_9

    :cond_a
    and-int/lit16 v15, v0, 0xc00

    if-nez v15, :cond_c

    move-object/from16 v15, p3

    invoke-interface {v6, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_b

    move/from16 v18, v16

    goto :goto_8

    :cond_b
    move/from16 v18, v17

    :goto_8
    or-int v7, v7, v18

    goto :goto_a

    :cond_c
    :goto_9
    move-object/from16 v15, p3

    :goto_a
    and-int/lit8 v18, v4, 0x8

    const/16 v19, 0x2000

    if-eqz v18, :cond_d

    or-int/lit16 v7, v7, 0x6000

    goto :goto_c

    :cond_d
    and-int/lit16 v11, v0, 0x6000

    if-nez v11, :cond_f

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    const/16 v11, 0x4000

    goto :goto_b

    :cond_e
    move/from16 v11, v19

    :goto_b
    or-int/2addr v7, v11

    :cond_f
    :goto_c
    and-int/lit8 v11, v4, 0x10

    const/high16 v20, 0x30000

    if-eqz v11, :cond_10

    or-int v7, v7, v20

    move-object/from16 v13, p5

    goto :goto_e

    :cond_10
    and-int v20, v0, v20

    move-object/from16 v13, p5

    if-nez v20, :cond_12

    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_11

    const/high16 v21, 0x20000

    goto :goto_d

    :cond_11
    const/high16 v21, 0x10000

    :goto_d
    or-int v7, v7, v21

    :cond_12
    :goto_e
    const/high16 v21, 0x180000

    and-int v22, v0, v21

    if-nez v22, :cond_14

    and-int/lit8 v22, v4, 0x20

    move-object/from16 v12, p6

    if-nez v22, :cond_13

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_13

    const/high16 v24, 0x100000

    goto :goto_f

    :cond_13
    const/high16 v24, 0x80000

    :goto_f
    or-int v7, v7, v24

    goto :goto_10

    :cond_14
    move-object/from16 v12, p6

    :goto_10
    and-int/lit8 v24, v4, 0x40

    const/high16 v25, 0xc00000

    if-eqz v24, :cond_15

    or-int v7, v7, v25

    move/from16 v8, p7

    goto :goto_12

    :cond_15
    and-int v25, v0, v25

    move/from16 v8, p7

    if-nez v25, :cond_17

    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v26

    if-eqz v26, :cond_16

    const/high16 v26, 0x800000

    goto :goto_11

    :cond_16
    const/high16 v26, 0x400000

    :goto_11
    or-int v7, v7, v26

    :cond_17
    :goto_12
    const/high16 v26, 0x6000000

    and-int v26, v0, v26

    if-nez v26, :cond_1a

    and-int/lit16 v9, v4, 0x80

    if-nez v9, :cond_18

    move-object/from16 v9, p8

    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_19

    const/high16 v27, 0x4000000

    goto :goto_13

    :cond_18
    move-object/from16 v9, p8

    :cond_19
    const/high16 v27, 0x2000000

    :goto_13
    or-int v7, v7, v27

    goto :goto_14

    :cond_1a
    move-object/from16 v9, p8

    :goto_14
    const/high16 v27, 0x30000000

    and-int v27, v0, v27

    if-nez v27, :cond_1d

    and-int/lit16 v14, v4, 0x100

    if-nez v14, :cond_1b

    move v14, v7

    move-wide/from16 v7, p9

    invoke-interface {v6, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v28

    if-eqz v28, :cond_1c

    const/high16 v28, 0x20000000

    goto :goto_15

    :cond_1b
    move v14, v7

    move-wide/from16 v7, p9

    :cond_1c
    const/high16 v28, 0x10000000

    :goto_15
    or-int v14, v14, v28

    goto :goto_16

    :cond_1d
    move v14, v7

    move-wide/from16 v7, p9

    :goto_16
    and-int/lit8 v28, v3, 0x6

    if-nez v28, :cond_1f

    and-int/lit16 v0, v4, 0x200

    move-wide/from16 v7, p11

    if-nez v0, :cond_1e

    invoke-interface {v6, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v0

    if-eqz v0, :cond_1e

    const/4 v0, 0x4

    goto :goto_17

    :cond_1e
    const/4 v0, 0x2

    :goto_17
    or-int/2addr v0, v3

    goto :goto_18

    :cond_1f
    move-wide/from16 v7, p11

    move v0, v3

    :goto_18
    move/from16 p17, v0

    and-int/lit16 v0, v4, 0x400

    if-eqz v0, :cond_20

    or-int/lit8 v18, p17, 0x30

    move/from16 v28, v0

    :goto_19
    move/from16 v0, v18

    goto :goto_1b

    :cond_20
    and-int/lit8 v28, v3, 0x30

    if-nez v28, :cond_22

    move/from16 v28, v0

    move/from16 v0, p13

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v29

    if-eqz v29, :cond_21

    const/16 v18, 0x20

    goto :goto_1a

    :cond_21
    const/16 v18, 0x10

    :goto_1a
    or-int v18, p17, v18

    goto :goto_19

    :cond_22
    move/from16 v28, v0

    move/from16 v0, p13

    move/from16 v0, p17

    :goto_1b
    and-int/lit16 v7, v4, 0x800

    if-eqz v7, :cond_23

    or-int/lit16 v0, v0, 0x180

    goto :goto_1d

    :cond_23
    and-int/lit16 v8, v3, 0x180

    if-nez v8, :cond_25

    move-object/from16 v8, p14

    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_24

    const/16 v20, 0x100

    goto :goto_1c

    :cond_24
    const/16 v20, 0x80

    :goto_1c
    or-int v0, v0, v20

    goto :goto_1e

    :cond_25
    :goto_1d
    move-object/from16 v8, p14

    :goto_1e
    move/from16 p17, v0

    and-int/lit16 v0, v3, 0xc00

    if-nez v0, :cond_28

    and-int/lit16 v0, v4, 0x1000

    if-nez v0, :cond_26

    move-object/from16 v0, p15

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_27

    goto :goto_1f

    :cond_26
    move-object/from16 v0, p15

    :cond_27
    move/from16 v16, v17

    :goto_1f
    or-int v16, p17, v16

    move/from16 v0, v16

    goto :goto_20

    :cond_28
    move-object/from16 v0, p15

    move/from16 v0, p17

    :goto_20
    move/from16 v16, v7

    and-int/lit16 v7, v4, 0x2000

    if-eqz v7, :cond_29

    or-int/lit16 v0, v0, 0x6000

    goto :goto_21

    :cond_29
    and-int/lit16 v7, v3, 0x6000

    if-nez v7, :cond_2b

    move-object/from16 v7, p16

    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2a

    const/16 v19, 0x4000

    :cond_2a
    or-int v0, v0, v19

    goto :goto_22

    :cond_2b
    :goto_21
    move-object/from16 v7, p16

    :goto_22
    const v17, 0x12492493

    and-int v3, v14, v17

    const v7, 0x12492492

    if-ne v3, v7, :cond_2d

    and-int/lit16 v3, v0, 0x2493

    const/16 v7, 0x2492

    if-ne v3, v7, :cond_2d

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_2c

    goto :goto_23

    .line 344
    :cond_2c
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-wide/from16 v10, p9

    move/from16 v14, p13

    move-object/from16 v16, p15

    move-object/from16 v17, v6

    move-object v15, v8

    move-object v7, v12

    move-object v6, v13

    move/from16 v8, p7

    move-wide/from16 v12, p11

    goto/16 :goto_32

    .line 215
    :cond_2d
    :goto_23
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v3, p18, 0x1

    const/4 v7, 0x0

    if-eqz v3, :cond_34

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v3

    if-eqz v3, :cond_2e

    goto :goto_24

    .line 213
    :cond_2e
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v3, v4, 0x20

    if-eqz v3, :cond_2f

    const v3, -0x380001

    and-int/2addr v14, v3

    :cond_2f
    and-int/lit16 v3, v4, 0x80

    if-eqz v3, :cond_30

    const v3, -0xe000001

    and-int/2addr v14, v3

    :cond_30
    and-int/lit16 v3, v4, 0x100

    if-eqz v3, :cond_31

    const v3, -0x70000001

    and-int/2addr v14, v3

    :cond_31
    and-int/lit16 v3, v4, 0x200

    if-eqz v3, :cond_32

    and-int/lit8 v0, v0, -0xf

    :cond_32
    and-int/lit16 v3, v4, 0x1000

    if-eqz v3, :cond_33

    and-int/lit16 v0, v0, -0x1c01

    :cond_33
    move/from16 v3, p7

    move-wide/from16 v18, p11

    move-object/from16 v7, p15

    move v11, v0

    move-object/from16 v16, v8

    move-object v8, v9

    move-object v0, v13

    move-wide/from16 v9, p9

    move/from16 v13, p13

    goto/16 :goto_2a

    :cond_34
    :goto_24
    if-eqz v11, :cond_35

    .line 205
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v13, v3

    :cond_35
    and-int/lit8 v3, v4, 0x20

    if-eqz v3, :cond_36

    const/4 v3, 0x3

    const/4 v11, 0x0

    .line 206
    invoke-static {v7, v11, v6, v7, v3}, Landroidx/compose/material3/ModalBottomSheetKt;->rememberModalBottomSheetState(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;

    move-result-object v3

    const v11, -0x380001

    and-int/2addr v14, v11

    move-object v12, v3

    :cond_36
    if-eqz v24, :cond_37

    .line 207
    sget-object v3, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v3}, Landroidx/compose/material3/BottomSheetDefaults;->getSheetMaxWidth-D9Ej5fM()F

    move-result v3

    goto :goto_25

    :cond_37
    move/from16 v3, p7

    :goto_25
    and-int/lit16 v11, v4, 0x80

    const/4 v7, 0x6

    if-eqz v11, :cond_38

    .line 208
    sget-object v9, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v9, v6, v7}, Landroidx/compose/material3/BottomSheetDefaults;->getExpandedShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v9

    const v11, -0xe000001

    and-int/2addr v14, v11

    :cond_38
    and-int/lit16 v11, v4, 0x100

    if-eqz v11, :cond_39

    .line 209
    sget-object v11, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v11, v6, v7}, Landroidx/compose/material3/BottomSheetDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v18

    const v7, -0x70000001

    and-int/2addr v7, v14

    move v14, v7

    move-wide/from16 v7, v18

    goto :goto_26

    :cond_39
    move-wide/from16 v7, p9

    :goto_26
    and-int/lit16 v11, v4, 0x200

    if-eqz v11, :cond_3a

    shr-int/lit8 v11, v14, 0x1b

    and-int/lit8 v11, v11, 0xe

    .line 210
    invoke-static {v7, v8, v6, v11}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    move-result-wide v18

    and-int/lit8 v0, v0, -0xf

    goto :goto_27

    :cond_3a
    move-wide/from16 v18, p11

    :goto_27
    if-eqz v28, :cond_3b

    .line 211
    sget-object v11, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v11}, Landroidx/compose/material3/BottomSheetDefaults;->getElevation-D9Ej5fM()F

    move-result v11

    goto :goto_28

    :cond_3b
    move/from16 v11, p13

    :goto_28
    if-eqz v16, :cond_3c

    sget-object v16, Landroidx/compose/material3/ComposableSingletons$ModalBottomSheetKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$ModalBottomSheetKt;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/material3/ComposableSingletons$ModalBottomSheetKt;->getLambda-2$material3_release()Lkotlin/jvm/functions/Function2;

    move-result-object v16

    goto :goto_29

    :cond_3c
    move-object/from16 v16, p14

    :goto_29
    move/from16 p5, v3

    and-int/lit16 v3, v4, 0x1000

    if-eqz v3, :cond_3d

    .line 213
    sget-object v3, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$1;->INSTANCE:Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$1;

    check-cast v3, Lkotlin/jvm/functions/Function2;

    and-int/lit16 v0, v0, -0x1c01

    move-wide/from16 v42, v7

    move-object v8, v9

    move-wide/from16 v9, v42

    move/from16 v42, v11

    move v11, v0

    move-object v0, v13

    move/from16 v13, v42

    move-object v7, v3

    move/from16 v3, p5

    goto :goto_2a

    :cond_3d
    move-wide/from16 v42, v7

    move-object v8, v9

    move-wide/from16 v9, v42

    move v3, v11

    move v11, v0

    move-object v0, v13

    move v13, v3

    move/from16 v3, p5

    move-object/from16 v7, p15

    :goto_2a
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v20

    if-eqz v20, :cond_3e

    const v4, -0x63f46313

    move-object/from16 p6, v7

    const-string v7, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:214)"

    .line 215
    invoke-static {v4, v14, v11, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_2b

    :cond_3e
    move-object/from16 p6, v7

    .line 216
    :goto_2b
    sget-object v4, Landroidx/compose/material3/internal/Strings;->Companion:Landroidx/compose/material3/internal/Strings$Companion;

    .line 492
    sget v4, Landroidx/compose/material3/R$string;->m3c_bottom_sheet_pane_title:I

    invoke-static {v4}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    move-result v4

    const/4 v7, 0x0

    .line 216
    invoke-static {v4, v6, v7}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    .line 221
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getTopCenter()Landroidx/compose/ui/Alignment;

    move-result-object v7

    invoke-interface {v1, v0, v7}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v20, v0

    const/4 v0, 0x0

    const/4 v1, 0x1

    move-object/from16 p13, v8

    const/4 v8, 0x0

    .line 222
    invoke-static {v7, v0, v3, v1, v8}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v7, 0x0

    .line 223
    invoke-static {v0, v7, v1, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v7, 0x49c83473

    .line 225
    const-string v8, "CC(remember):ModalBottomSheet.kt#9igjgp"

    invoke-static {v6, v7, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v7, 0x380000

    and-int/2addr v7, v14

    xor-int v7, v7, v21

    const/high16 v1, 0x100000

    if-le v7, v1, :cond_40

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_3f

    goto :goto_2c

    :cond_3f
    move/from16 v23, v3

    goto :goto_2d

    :cond_40
    :goto_2c
    move/from16 v23, v3

    and-int v3, v14, v21

    if-ne v3, v1, :cond_41

    :goto_2d
    const/4 v1, 0x1

    goto :goto_2e

    :cond_41
    const/4 v1, 0x0

    .line 493
    :goto_2e
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_42

    .line 494
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_43

    .line 228
    :cond_42
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 226
    invoke-static {v12, v1, v5}, Landroidx/compose/material3/SheetDefaultsKt;->ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(Landroidx/compose/material3/SheetState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    move-result-object v3

    .line 496
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 225
    :cond_43
    check-cast v3, Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move-wide/from16 v28, v9

    const/4 v1, 0x2

    const/4 v9, 0x0

    .line 224
    invoke-static {v0, v3, v9, v1, v9}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt;->nestedScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 233
    invoke-virtual {v12}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/internal/AnchoredDraggableState;

    move-result-object v1

    sget-object v3, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    const v9, 0x49c86f33

    invoke-static {v6, v9, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v9, 0x100000

    if-le v7, v9, :cond_44

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_45

    :cond_44
    and-int v10, v14, v21

    if-ne v10, v9, :cond_46

    :cond_45
    const/4 v9, 0x1

    goto :goto_2f

    :cond_46
    const/4 v9, 0x0

    .line 499
    :goto_2f
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_47

    .line 500
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v10, v9, :cond_48

    .line 233
    :cond_47
    new-instance v9, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$3$1;

    invoke-direct {v9, v12}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$3$1;-><init>(Landroidx/compose/material3/SheetState;)V

    move-object v10, v9

    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 502
    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 233
    :cond_48
    check-cast v10, Lkotlin/jvm/functions/Function2;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v0, v1, v3, v10}, Landroidx/compose/material3/internal/AnchoredDraggableKt;->draggableAnchors(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/internal/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;

    move-result-object v30

    .line 264
    invoke-virtual {v12}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/internal/AnchoredDraggableState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material3/internal/AnchoredDraggableState;->getDraggableState$material3_release()Landroidx/compose/foundation/gestures/DraggableState;

    move-result-object v31

    .line 265
    sget-object v32, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 266
    invoke-virtual {v12}, Landroidx/compose/material3/SheetState;->isVisible()Z

    move-result v33

    .line 267
    invoke-virtual {v12}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/internal/AnchoredDraggableState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material3/internal/AnchoredDraggableState;->isAnimationRunning()Z

    move-result v35

    const v0, 0x49c94d86

    .line 268
    invoke-static {v6, v0, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const v0, 0xe000

    and-int/2addr v0, v14

    const/16 v1, 0x4000

    if-ne v0, v1, :cond_49

    const/4 v0, 0x1

    goto :goto_30

    :cond_49
    const/4 v0, 0x0

    .line 505
    :goto_30
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_4a

    .line 506
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_4b

    .line 268
    :cond_4a
    new-instance v0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$4$1;

    const/4 v9, 0x0

    invoke-direct {v0, v5, v9}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$4$1;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function3;

    .line 508
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 268
    :cond_4b
    move-object/from16 v37, v1

    check-cast v37, Lkotlin/jvm/functions/Function3;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v39, 0xa8

    const/16 v40, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    .line 263
    invoke-static/range {v30 .. v40}, Landroidx/compose/foundation/gestures/DraggableKt;->draggable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v1, 0x49c9567f

    .line 270
    invoke-static {v6, v1, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    .line 511
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_4c

    .line 512
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_4d

    .line 270
    :cond_4c
    new-instance v1, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$5$1;

    invoke-direct {v1, v4}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$5$1;-><init>(Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 514
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 270
    :cond_4d
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v1, 0x0

    const/4 v4, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v1, v3, v4, v9}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v3, 0x49c96a73    # 1649998.4f

    .line 274
    invoke-static {v6, v3, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v9, 0x100000

    if-le v7, v9, :cond_4e

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4f

    :cond_4e
    and-int v3, v14, v21

    if-ne v3, v9, :cond_50

    :cond_4f
    const/4 v7, 0x1

    goto :goto_31

    :cond_50
    move v7, v1

    :goto_31
    and-int/lit8 v3, v14, 0x70

    const/16 v4, 0x20

    if-eq v3, v4, :cond_51

    and-int/lit8 v3, v14, 0x40

    if-eqz v3, :cond_52

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_52

    :cond_51
    const/4 v1, 0x1

    :cond_52
    or-int/2addr v1, v7

    .line 517
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_53

    .line 518
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_54

    .line 274
    :cond_53
    new-instance v1, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$6$1;

    invoke-direct {v1, v12, v2}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$6$1;-><init>(Landroidx/compose/material3/SheetState;Landroidx/compose/animation/core/Animatable;)V

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 520
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 274
    :cond_54
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v0, v3}, Landroidx/compose/ui/graphics/GraphicsLayerModifierKt;->graphicsLayer(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    .line 289
    new-instance v0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$7;

    move-object/from16 p11, p2

    move-object/from16 p12, p16

    move-object/from16 p5, v0

    move-object/from16 p7, v2

    move-object/from16 p9, v12

    move-object/from16 p10, v15

    move-object/from16 p8, v16

    invoke-direct/range {p5 .. p12}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$7;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/core/Animatable;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)V

    move-object/from16 v1, p5

    move-object/from16 v3, p6

    move-object/from16 v2, p8

    move-object/from16 v0, p9

    const/16 v4, 0x36

    const v8, -0x294949f8

    const/4 v9, 0x1

    invoke-static {v8, v9, v1, v6, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Lkotlin/jvm/functions/Function2;

    shr-int/lit8 v1, v14, 0x15

    and-int/lit8 v4, v1, 0x70

    const/high16 v8, 0xc00000

    or-int/2addr v4, v8

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v1, v4

    shl-int/lit8 v4, v11, 0x9

    and-int/lit16 v8, v4, 0x1c00

    or-int/2addr v1, v8

    const v8, 0xe000

    and-int/2addr v4, v8

    or-int/2addr v1, v4

    move-wide/from16 v11, v18

    const/16 v19, 0x60

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v8, p13

    move/from16 v18, v1

    move-object/from16 v17, v6

    move-wide/from16 v9, v28

    .line 218
    invoke-static/range {v7 .. v19}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_55

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_55
    move-object v7, v0

    move-object v15, v2

    move-object/from16 v16, v3

    move-object v9, v8

    move v14, v13

    move-object/from16 v6, v20

    move/from16 v8, v23

    move-wide v12, v11

    move-wide/from16 v10, v28

    .line 344
    :goto_32
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_56

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$8;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v17, p16

    move/from16 v18, p18

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v41, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v20}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$8;-><init>(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v41

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_56
    return-void
.end method

.method private static final Scrim-3J-VO9M(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-wide/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p5

    const v0, 0x38bc6405

    move-object/from16 v6, p4

    .line 408
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v11

    const-string v6, "C(Scrim)P(0:c#ui.graphics.Color)410@18376L87,411@18489L29,426@19112L79,426@19062L129:ModalBottomSheet.kt#uh7d8r"

    invoke-static {v11, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_1

    invoke-interface {v11, v1, v2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    const/16 v15, 0x20

    if-nez v7, :cond_3

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v15

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_5

    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v6, 0x93

    const/16 v8, 0x92

    if-ne v7, v8, :cond_7

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    .line 431
    :cond_6
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_a

    .line 408
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_8

    const/4 v7, -0x1

    const-string v8, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:407)"

    invoke-static {v0, v6, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_8
    const-wide/16 v7, 0x10

    cmp-long v0, v1, v7

    if-eqz v0, :cond_14

    if-eqz v4, :cond_9

    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_5

    :cond_9
    const/4 v7, 0x0

    .line 411
    :goto_5
    new-instance v16, Landroidx/compose/animation/core/TweenSpec;

    const/16 v20, 0x7

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Landroidx/compose/animation/core/TweenSpec;-><init>(IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v16, Landroidx/compose/animation/core/AnimationSpec;

    const/16 v12, 0x30

    const/16 v13, 0x1c

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v22, v16

    move/from16 v16, v6

    move v6, v7

    move-object/from16 v7, v22

    invoke-static/range {v6 .. v13}, Landroidx/compose/animation/core/AnimateAsStateKt;->animateFloatAsState(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v6

    .line 412
    sget-object v7, Landroidx/compose/material3/internal/Strings;->Companion:Landroidx/compose/material3/internal/Strings$Companion;

    .line 524
    sget v7, Landroidx/compose/ui/R$string;->close_sheet:I

    invoke-static {v7}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    move-result v7

    const/4 v8, 0x0

    .line 412
    invoke-static {v7, v11, v8}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const v9, -0x6a6eea4e

    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v9, "414@18629L44,415@18730L263"

    invoke-static {v11, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const/4 v9, 0x0

    .line 414
    const-string v10, "CC(remember):ModalBottomSheet.kt#9igjgp"

    const/4 v12, 0x1

    if-eqz v4, :cond_10

    .line 415
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v13, Landroidx/compose/ui/Modifier;

    const v8, -0x6a6ee331

    invoke-static {v11, v8, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v8, v16, 0x70

    if-ne v8, v15, :cond_a

    move/from16 v17, v12

    goto :goto_6

    :cond_a
    const/16 v17, 0x0

    .line 525
    :goto_6
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    if-nez v17, :cond_b

    .line 526
    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v14, v0, :cond_c

    .line 415
    :cond_b
    new-instance v0, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$dismissSheet$1$1;

    invoke-direct {v0, v3, v9}, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$dismissSheet$1$1;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    move-object v14, v0

    check-cast v14, Lkotlin/jvm/functions/Function2;

    .line 528
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 415
    :cond_c
    check-cast v14, Lkotlin/jvm/functions/Function2;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v13, v3, v14}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v13, -0x6a6ed5b6

    .line 416
    invoke-static {v11, v13, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-ne v8, v15, :cond_d

    move v8, v12

    goto :goto_7

    :cond_d
    const/4 v8, 0x0

    :goto_7
    or-int/2addr v8, v13

    .line 531
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    if-nez v8, :cond_e

    .line 532
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v13, v8, :cond_f

    .line 416
    :cond_e
    new-instance v8, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$dismissSheet$2$1;

    invoke-direct {v8, v7, v3}, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$dismissSheet$2$1;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    move-object v13, v8

    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 534
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 416
    :cond_f
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v0, v12, v13}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_8

    .line 425
    :cond_10
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .line 414
    :goto_8
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 427
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v7, Landroidx/compose/ui/Modifier;

    const/4 v8, 0x0

    invoke-static {v7, v8, v12, v9}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v7, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v7, -0x6a6ea6ae

    invoke-static {v11, v7, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v7, v16, 0xe

    const/4 v8, 0x4

    if-ne v7, v8, :cond_11

    goto :goto_9

    :cond_11
    const/4 v12, 0x0

    :goto_9
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v7, v12

    .line 537
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_12

    .line 538
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_13

    .line 427
    :cond_12
    new-instance v7, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$1$1;

    invoke-direct {v7, v1, v2, v6}, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$1$1;-><init>(JLandroidx/compose/runtime/State;)V

    move-object v8, v7

    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 540
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 427
    :cond_13
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v6, 0x0

    invoke-static {v0, v8, v11, v6}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :cond_14
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 431
    :cond_15
    :goto_a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$2;

    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/ModalBottomSheetKt$Scrim$2;-><init>(JLkotlin/jvm/functions/Function0;ZI)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_16
    return-void
.end method

.method private static final Scrim_3J_VO9M$lambda$10(Landroidx/compose/runtime/State;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Float;",
            ">;)F"
        }
    .end annotation

    .line 543
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method public static final synthetic access$Scrim-3J-VO9M(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Landroidx/compose/material3/ModalBottomSheetKt;->Scrim-3J-VO9M(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$Scrim_3J_VO9M$lambda$10(Landroidx/compose/runtime/State;)F
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/material3/ModalBottomSheetKt;->Scrim_3J_VO9M$lambda$10(Landroidx/compose/runtime/State;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$calculatePredictiveBackScaleX(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/ModalBottomSheetKt;->calculatePredictiveBackScaleX(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$calculatePredictiveBackScaleY(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/ModalBottomSheetKt;->calculatePredictiveBackScaleY(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$getPredictiveBackChildTransformOrigin$p()J
    .locals 2

    .line 1
    sget-wide v0, Landroidx/compose/material3/ModalBottomSheetKt;->PredictiveBackChildTransformOrigin:J

    return-wide v0
.end method

.method private static final calculatePredictiveBackScaleX(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F
    .locals 4

    .line 347
    invoke-interface {p0}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v0

    .line 348
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez v1, :cond_1

    const/4 v1, 0x0

    cmpg-float v3, v0, v1

    if-nez v3, :cond_0

    goto :goto_0

    .line 351
    :cond_0
    sget v3, Landroidx/compose/material3/ModalBottomSheetKt;->PredictiveBackMaxScaleXDistance:F

    invoke-interface {p0, v3}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->toPx-0680j_4(F)F

    move-result p0

    invoke-static {p0, v0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    invoke-static {v1, p0, p1}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    move-result p0

    div-float/2addr p0, v0

    sub-float/2addr v2, p0

    :cond_1
    :goto_0
    return v2
.end method

.method private static final calculatePredictiveBackScaleY(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F
    .locals 4

    .line 356
    invoke-interface {p0}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getSize-NH-jbRc()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v0

    .line 357
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez v1, :cond_1

    const/4 v1, 0x0

    cmpg-float v3, v0, v1

    if-nez v3, :cond_0

    goto :goto_0

    .line 360
    :cond_0
    sget v3, Landroidx/compose/material3/ModalBottomSheetKt;->PredictiveBackMaxScaleYDistance:F

    invoke-interface {p0, v3}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->toPx-0680j_4(F)F

    move-result p0

    invoke-static {p0, v0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    invoke-static {v1, p0, p1}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    move-result p0

    div-float/2addr p0, v0

    sub-float/2addr v2, p0

    :cond_1
    :goto_0
    return v2
.end method

.method public static final rememberModalBottomSheetState(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/material3/SheetValue;",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/material3/SheetState;"
        }
    .end annotation

    const-string v0, "C(rememberModalBottomSheetState)P(1)400@18058L160:ModalBottomSheet.kt#uh7d8r"

    const v1, -0x2e63272e

    .line 401
    invoke-static {p2, v1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    move v2, p0

    and-int/lit8 p0, p4, 0x2

    if-eqz p0, :cond_1

    .line 399
    sget-object p0, Landroidx/compose/material3/ModalBottomSheetKt$rememberModalBottomSheetState$1;->INSTANCE:Landroidx/compose/material3/ModalBottomSheetKt$rememberModalBottomSheetState$1;

    move-object p1, p0

    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_1
    move-object v3, p1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, -0x1

    const-string p1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:400)"

    .line 401
    invoke-static {v1, p3, p0, p1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 404
    :cond_2
    sget-object v4, Landroidx/compose/material3/SheetValue;->Hidden:Landroidx/compose/material3/SheetValue;

    and-int/lit8 p0, p3, 0xe

    or-int/lit16 p0, p0, 0x180

    and-int/lit8 p1, p3, 0x70

    or-int v7, p0, p1

    const/16 v8, 0x8

    const/4 v5, 0x0

    move-object v6, p2

    .line 401
    invoke-static/range {v2 .. v8}, Landroidx/compose/material3/SheetDefaultsKt;->rememberSheetState(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;

    move-result-object p0

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object p0
.end method
