.class public final Landroidx/compose/material3/BottomSheetScaffoldKt;
.super Ljava/lang/Object;
.source "BottomSheetScaffold.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,410:1\n148#2:411\n1223#3,6:412\n1223#3,6:418\n1223#3,6:424\n1223#3,3:435\n1226#3,3:441\n1223#3,6:447\n1223#3,6:453\n1223#3,6:459\n1223#3,6:473\n488#4:430\n487#4,4:431\n491#4,2:438\n495#4:444\n487#5:440\n77#6:445\n1#7:446\n170#8:465\n168#8,7:466\n78#8,6:479\n85#8,4:494\n89#8,2:504\n93#8:509\n176#8:510\n368#9,9:485\n377#9,3:506\n4032#10,6:498\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n*L\n119#1:411\n134#1:412,6\n180#1:418,6\n182#1:424,6\n226#1:435,3\n226#1:441,3\n232#1:447,6\n249#1:453,6\n371#1:459,6\n356#1:473,6\n226#1:430\n226#1:431,4\n226#1:438,2\n226#1:444\n226#1:440\n228#1:445\n356#1:465\n356#1:466,7\n356#1:479,6\n356#1:494,4\n356#1:504,2\n356#1:509\n356#1:510\n356#1:485,9\n356#1:506,3\n356#1:498,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u008a\u0002\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0008\u0005\u00a2\u0006\u0002\u0008\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000c2\u0015\u0008\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016\u00a2\u0006\u0002\u0008\u00052\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0015\u0008\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016\u00a2\u0006\u0002\u0008\u00052\u0019\u0008\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0008\u00052\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00112\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0008\u0005H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010!\u001a\u008e\u0001\u0010\"\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00082\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016\u00a2\u0006\u0002\u0008\u00052\u0011\u0010#\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016\u00a2\u0006\u0002\u0008\u00052\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016\u00a2\u0006\u0002\u0008\u00052\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016\u00a2\u0006\u0002\u0008\u00052\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020&0\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008)\u0010*\u001a\u008d\u0001\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u000c2\u0006\u00100\u001a\u00020\u000c2\u0013\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016\u00a2\u0006\u0002\u0008\u00052\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\u0008\u0005\u00a2\u0006\u0002\u0008\u0006H\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u00082\u00103\u001a!\u00104\u001a\u00020\n2\u0008\u0008\u0002\u00105\u001a\u00020(2\u0008\u0008\u0002\u00106\u001a\u00020\u001bH\u0007\u00a2\u0006\u0002\u00107\u001a7\u00108\u001a\u00020(2\u0008\u0008\u0002\u00109\u001a\u00020:2\u0014\u0008\u0002\u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00180\u00032\u0008\u0008\u0002\u0010<\u001a\u00020\u0018H\u0007\u00a2\u0006\u0002\u0010=\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006>"
    }
    d2 = {
        "BottomSheetScaffold",
        "",
        "sheetContent",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Landroidx/compose/runtime/Composable;",
        "Lkotlin/ExtensionFunctionType;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "scaffoldState",
        "Landroidx/compose/material3/BottomSheetScaffoldState;",
        "sheetPeekHeight",
        "Landroidx/compose/ui/unit/Dp;",
        "sheetMaxWidth",
        "sheetShape",
        "Landroidx/compose/ui/graphics/Shape;",
        "sheetContainerColor",
        "Landroidx/compose/ui/graphics/Color;",
        "sheetContentColor",
        "sheetTonalElevation",
        "sheetShadowElevation",
        "sheetDragHandle",
        "Lkotlin/Function0;",
        "sheetSwipeEnabled",
        "",
        "topBar",
        "snackbarHost",
        "Landroidx/compose/material3/SnackbarHostState;",
        "containerColor",
        "contentColor",
        "content",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "BottomSheetScaffold-sdMYb0k",
        "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V",
        "BottomSheetScaffoldLayout",
        "body",
        "bottomSheet",
        "sheetOffset",
        "",
        "sheetState",
        "Landroidx/compose/material3/SheetState;",
        "BottomSheetScaffoldLayout-2E65NiM",
        "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V",
        "StandardBottomSheet",
        "state",
        "peekHeight",
        "shape",
        "tonalElevation",
        "shadowElevation",
        "dragHandle",
        "StandardBottomSheet-w7I5h1o",
        "(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "rememberBottomSheetScaffoldState",
        "bottomSheetState",
        "snackbarHostState",
        "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;",
        "rememberStandardBottomSheetState",
        "initialValue",
        "Landroidx/compose/material3/SheetValue;",
        "confirmValueChange",
        "skipHiddenState",
        "(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;",
        "material3_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final BottomSheetScaffold-sdMYb0k(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material3/BottomSheetScaffoldState;",
            "FF",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJFF",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/material3/SnackbarHostState;",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;JJ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/compose/foundation/layout/PaddingValues;",
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

    move-object/from16 v0, p20

    move/from16 v1, p22

    move/from16 v2, p23

    move/from16 v3, p24

    const v4, -0x5ad53ca7

    move-object/from16 v5, p21

    .line 128
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    const-string v5, "C(BottomSheetScaffold)P(6,3,4,10:c#ui.unit.Dp,9:c#ui.unit.Dp,12,5:c#ui.graphics.Color,7:c#ui.graphics.Color,14:c#ui.unit.Dp,11:c#ui.unit.Dp,8,13,16,15,0:c#ui.graphics.Color,2:c#ui.graphics.Color)112@5992L34,115@6194L13,116@6262L14,117@6309L36,124@6741L11,125@6788L31,131@6974L52,137@7329L597,132@7051L49,133@7124L50,128@6878L1054:BottomSheetScaffold.kt#uh7d8r"

    invoke-static {v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v5, v3, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v5, v1, 0x6

    move v8, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v1, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v1

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v8, v1

    :goto_1
    and-int/lit8 v9, v3, 0x2

    if-eqz v9, :cond_3

    or-int/lit8 v8, v8, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v12, v1, 0x30

    if-nez v12, :cond_5

    move-object/from16 v12, p1

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x20

    goto :goto_2

    :cond_4
    const/16 v13, 0x10

    :goto_2
    or-int/2addr v8, v13

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v12, p1

    :goto_4
    and-int/lit16 v13, v1, 0x180

    if-nez v13, :cond_8

    and-int/lit8 v13, v3, 0x4

    if-nez v13, :cond_6

    move-object/from16 v13, p2

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_5

    :cond_6
    move-object/from16 v13, p2

    :cond_7
    const/16 v16, 0x80

    :goto_5
    or-int v8, v8, v16

    goto :goto_6

    :cond_8
    move-object/from16 v13, p2

    :goto_6
    and-int/lit8 v16, v3, 0x8

    const/16 v17, 0x800

    const/16 v18, 0x400

    if-eqz v16, :cond_9

    or-int/lit16 v8, v8, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v6, v1, 0xc00

    if-nez v6, :cond_b

    move/from16 v6, p3

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v19

    if-eqz v19, :cond_a

    move/from16 v19, v17

    goto :goto_7

    :cond_a
    move/from16 v19, v18

    :goto_7
    or-int v8, v8, v19

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v6, p3

    :goto_9
    and-int/lit8 v19, v3, 0x10

    const/16 v20, 0x2000

    const/16 v21, 0x4000

    if-eqz v19, :cond_c

    or-int/lit16 v8, v8, 0x6000

    goto :goto_b

    :cond_c
    and-int/lit16 v7, v1, 0x6000

    if-nez v7, :cond_e

    move/from16 v7, p4

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v23

    if-eqz v23, :cond_d

    move/from16 v23, v21

    goto :goto_a

    :cond_d
    move/from16 v23, v20

    :goto_a
    or-int v8, v8, v23

    goto :goto_c

    :cond_e
    :goto_b
    move/from16 v7, p4

    :goto_c
    const/high16 v23, 0x30000

    and-int v23, v1, v23

    const/high16 v24, 0x10000

    if-nez v23, :cond_10

    and-int/lit8 v23, v3, 0x20

    move-object/from16 v10, p5

    if-nez v23, :cond_f

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_f

    const/high16 v25, 0x20000

    goto :goto_d

    :cond_f
    move/from16 v25, v24

    :goto_d
    or-int v8, v8, v25

    goto :goto_e

    :cond_10
    move-object/from16 v10, p5

    :goto_e
    const/high16 v25, 0x180000

    and-int v26, v1, v25

    if-nez v26, :cond_12

    and-int/lit8 v26, v3, 0x40

    move-wide/from16 v11, p6

    if-nez v26, :cond_11

    invoke-interface {v4, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v27

    if-eqz v27, :cond_11

    const/high16 v27, 0x100000

    goto :goto_f

    :cond_11
    const/high16 v27, 0x80000

    :goto_f
    or-int v8, v8, v27

    goto :goto_10

    :cond_12
    move-wide/from16 v11, p6

    :goto_10
    const/high16 v27, 0xc00000

    and-int v27, v1, v27

    if-nez v27, :cond_15

    and-int/lit16 v15, v3, 0x80

    if-nez v15, :cond_13

    move-wide/from16 v14, p8

    invoke-interface {v4, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v28

    if-eqz v28, :cond_14

    const/high16 v28, 0x800000

    goto :goto_11

    :cond_13
    move-wide/from16 v14, p8

    :cond_14
    const/high16 v28, 0x400000

    :goto_11
    or-int v8, v8, v28

    goto :goto_12

    :cond_15
    move-wide/from16 v14, p8

    :goto_12
    and-int/lit16 v1, v3, 0x100

    const/high16 v28, 0x6000000

    if-eqz v1, :cond_16

    or-int v8, v8, v28

    goto :goto_14

    :cond_16
    and-int v28, p22, v28

    if-nez v28, :cond_18

    move/from16 v28, v1

    move/from16 v1, p10

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v29

    if-eqz v29, :cond_17

    const/high16 v29, 0x4000000

    goto :goto_13

    :cond_17
    const/high16 v29, 0x2000000

    :goto_13
    or-int v8, v8, v29

    goto :goto_15

    :cond_18
    :goto_14
    move/from16 v28, v1

    move/from16 v1, p10

    :goto_15
    and-int/lit16 v1, v3, 0x200

    const/high16 v29, 0x30000000

    if-eqz v1, :cond_19

    or-int v8, v8, v29

    goto :goto_17

    :cond_19
    and-int v29, p22, v29

    if-nez v29, :cond_1b

    move/from16 v29, v1

    move/from16 v1, p11

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v30

    if-eqz v30, :cond_1a

    const/high16 v30, 0x20000000

    goto :goto_16

    :cond_1a
    const/high16 v30, 0x10000000

    :goto_16
    or-int v8, v8, v30

    goto :goto_18

    :cond_1b
    :goto_17
    move/from16 v29, v1

    move/from16 v1, p11

    :goto_18
    and-int/lit16 v1, v3, 0x400

    if-eqz v1, :cond_1c

    or-int/lit8 v22, v2, 0x6

    move/from16 v30, v1

    move-object/from16 v1, p12

    goto :goto_1a

    :cond_1c
    and-int/lit8 v30, v2, 0x6

    if-nez v30, :cond_1e

    move/from16 v30, v1

    move-object/from16 v1, p12

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_1d

    const/16 v22, 0x4

    goto :goto_19

    :cond_1d
    const/16 v22, 0x2

    :goto_19
    or-int v22, v2, v22

    goto :goto_1a

    :cond_1e
    move/from16 v30, v1

    move-object/from16 v1, p12

    move/from16 v22, v2

    :goto_1a
    and-int/lit16 v1, v3, 0x800

    if-eqz v1, :cond_1f

    or-int/lit8 v22, v22, 0x30

    move/from16 v31, v1

    goto :goto_1c

    :cond_1f
    and-int/lit8 v31, v2, 0x30

    if-nez v31, :cond_21

    move/from16 v31, v1

    move/from16 v1, p13

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v32

    if-eqz v32, :cond_20

    const/16 v23, 0x20

    goto :goto_1b

    :cond_20
    const/16 v23, 0x10

    :goto_1b
    or-int v22, v22, v23

    goto :goto_1c

    :cond_21
    move/from16 v31, v1

    move/from16 v1, p13

    :goto_1c
    move/from16 v1, v22

    and-int/lit16 v5, v3, 0x1000

    if-eqz v5, :cond_22

    or-int/lit16 v1, v1, 0x180

    goto :goto_1f

    :cond_22
    move/from16 v22, v1

    and-int/lit16 v1, v2, 0x180

    if-nez v1, :cond_24

    move-object/from16 v1, p14

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_23

    const/16 v27, 0x100

    goto :goto_1d

    :cond_23
    const/16 v27, 0x80

    :goto_1d
    or-int v22, v22, v27

    goto :goto_1e

    :cond_24
    move-object/from16 v1, p14

    :goto_1e
    move/from16 v1, v22

    :goto_1f
    move/from16 v22, v5

    and-int/lit16 v5, v3, 0x2000

    if-eqz v5, :cond_25

    or-int/lit16 v1, v1, 0xc00

    move/from16 v23, v1

    goto :goto_21

    :cond_25
    move/from16 v23, v1

    and-int/lit16 v1, v2, 0xc00

    if-nez v1, :cond_27

    move-object/from16 v1, p15

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_26

    goto :goto_20

    :cond_26
    move/from16 v17, v18

    :goto_20
    or-int v17, v23, v17

    move/from16 v23, v17

    goto :goto_22

    :cond_27
    :goto_21
    move-object/from16 v1, p15

    :goto_22
    and-int/lit16 v1, v2, 0x6000

    if-nez v1, :cond_2a

    and-int/lit16 v1, v3, 0x4000

    if-nez v1, :cond_28

    move-wide/from16 v1, p16

    invoke-interface {v4, v1, v2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v17

    if-eqz v17, :cond_29

    move/from16 v20, v21

    goto :goto_23

    :cond_28
    move-wide/from16 v1, p16

    :cond_29
    :goto_23
    or-int v23, v23, v20

    goto :goto_24

    :cond_2a
    move-wide/from16 v1, p16

    :goto_24
    const/high16 v17, 0x30000

    and-int v17, p23, v17

    const v18, 0x8000

    if-nez v17, :cond_2c

    and-int v17, v3, v18

    move-wide/from16 v1, p18

    if-nez v17, :cond_2b

    invoke-interface {v4, v1, v2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v17

    if-eqz v17, :cond_2b

    const/high16 v17, 0x20000

    goto :goto_25

    :cond_2b
    move/from16 v17, v24

    :goto_25
    or-int v23, v23, v17

    goto :goto_26

    :cond_2c
    move-wide/from16 v1, p18

    :goto_26
    and-int v17, v3, v24

    if-eqz v17, :cond_2d

    or-int v23, v23, v25

    goto :goto_28

    :cond_2d
    and-int v17, p23, v25

    if-nez v17, :cond_2f

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2e

    const/high16 v17, 0x100000

    goto :goto_27

    :cond_2e
    const/high16 v17, 0x80000

    :goto_27
    or-int v23, v23, v17

    :cond_2f
    :goto_28
    const v17, 0x12492493

    and-int v1, v8, v17

    const v2, 0x12492492

    if-ne v1, v2, :cond_31

    const v1, 0x92493

    and-int v1, v23, v1

    const v2, 0x92492

    if-ne v1, v2, :cond_31

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_30

    goto :goto_29

    .line 154
    :cond_30
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v2, p1

    move-object/from16 v16, p15

    move-wide/from16 v17, p16

    move-wide/from16 v19, p18

    move-object v0, v4

    move v4, v6

    move v5, v7

    move-object v6, v10

    move-wide v7, v11

    move-object v3, v13

    move-wide v9, v14

    move/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v15, p14

    goto/16 :goto_38

    .line 128
    :cond_31
    :goto_29
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v1, p22, 0x1

    const p21, -0x70001

    if-eqz v1, :cond_39

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v1

    if-eqz v1, :cond_32

    goto :goto_2a

    .line 126
    :cond_32
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v1, v3, 0x4

    if-eqz v1, :cond_33

    and-int/lit16 v8, v8, -0x381

    :cond_33
    and-int/lit8 v1, v3, 0x20

    if-eqz v1, :cond_34

    and-int v8, v8, p21

    :cond_34
    and-int/lit8 v1, v3, 0x40

    if-eqz v1, :cond_35

    const v1, -0x380001

    and-int/2addr v8, v1

    :cond_35
    and-int/lit16 v1, v3, 0x80

    if-eqz v1, :cond_36

    const v1, -0x1c00001

    and-int/2addr v8, v1

    :cond_36
    and-int/lit16 v1, v3, 0x4000

    if-eqz v1, :cond_37

    const v1, -0xe001

    and-int v23, v23, v1

    :cond_37
    and-int v1, v3, v18

    if-eqz v1, :cond_38

    and-int v23, v23, p21

    :cond_38
    move-object/from16 v22, p1

    move/from16 v16, p11

    move-object/from16 v19, p12

    move/from16 v20, p13

    move-object/from16 v21, p14

    move-object/from16 v5, p15

    move-wide/from16 v1, p16

    move-wide/from16 v24, p18

    move-object v9, v13

    move-wide v13, v14

    move/from16 v3, v23

    move/from16 v15, p10

    goto/16 :goto_36

    :cond_39
    :goto_2a
    if-eqz v9, :cond_3a

    .line 112
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    goto :goto_2b

    :cond_3a
    move-object/from16 v1, p1

    :goto_2b
    and-int/lit8 v9, v3, 0x4

    const/4 v2, 0x0

    if-eqz v9, :cond_3b

    const/4 v9, 0x0

    const/4 v13, 0x3

    .line 113
    invoke-static {v2, v2, v4, v9, v13}, Landroidx/compose/material3/BottomSheetScaffoldKt;->rememberBottomSheetScaffoldState(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;

    move-result-object v9

    and-int/lit16 v8, v8, -0x381

    goto :goto_2c

    :cond_3b
    move-object v9, v13

    :goto_2c
    if-eqz v16, :cond_3c

    .line 114
    sget-object v6, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v6}, Landroidx/compose/material3/BottomSheetDefaults;->getSheetPeekHeight-D9Ej5fM()F

    move-result v6

    :cond_3c
    if-eqz v19, :cond_3d

    .line 115
    sget-object v7, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v7}, Landroidx/compose/material3/BottomSheetDefaults;->getSheetMaxWidth-D9Ej5fM()F

    move-result v7

    :cond_3d
    and-int/lit8 v13, v3, 0x20

    const/4 v2, 0x6

    if-eqz v13, :cond_3e

    .line 116
    sget-object v10, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v10, v4, v2}, Landroidx/compose/material3/BottomSheetDefaults;->getExpandedShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v10

    and-int v8, v8, p21

    :cond_3e
    and-int/lit8 v13, v3, 0x40

    if-eqz v13, :cond_3f

    .line 117
    sget-object v11, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual {v11, v4, v2}, Landroidx/compose/material3/BottomSheetDefaults;->getContainerColor(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    const v13, -0x380001

    and-int/2addr v8, v13

    :cond_3f
    and-int/lit16 v13, v3, 0x80

    if-eqz v13, :cond_40

    shr-int/lit8 v13, v8, 0x12

    and-int/lit8 v13, v13, 0xe

    .line 118
    invoke-static {v11, v12, v4, v13}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    move-result-wide v13

    const v15, -0x1c00001

    and-int/2addr v8, v15

    goto :goto_2d

    :cond_40
    move-wide v13, v14

    :goto_2d
    if-eqz v28, :cond_41

    const/4 v15, 0x0

    int-to-float v15, v15

    .line 411
    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v15

    goto :goto_2e

    :cond_41
    move/from16 v15, p10

    :goto_2e
    if-eqz v29, :cond_42

    .line 120
    sget-object v16, Landroidx/compose/material3/BottomSheetDefaults;->INSTANCE:Landroidx/compose/material3/BottomSheetDefaults;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/material3/BottomSheetDefaults;->getElevation-D9Ej5fM()F

    move-result v16

    goto :goto_2f

    :cond_42
    move/from16 v16, p11

    :goto_2f
    if-eqz v30, :cond_43

    sget-object v19, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->getLambda-1$material3_release()Lkotlin/jvm/functions/Function2;

    move-result-object v19

    goto :goto_30

    :cond_43
    move-object/from16 v19, p12

    :goto_30
    if-eqz v31, :cond_44

    const/16 v20, 0x1

    goto :goto_31

    :cond_44
    move/from16 v20, p13

    :goto_31
    if-eqz v22, :cond_45

    const/16 v21, 0x0

    goto :goto_32

    :cond_45
    move-object/from16 v21, p14

    :goto_32
    if-eqz v5, :cond_46

    .line 123
    sget-object v5, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;

    invoke-virtual {v5}, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->getLambda-2$material3_release()Lkotlin/jvm/functions/Function3;

    move-result-object v5

    goto :goto_33

    :cond_46
    move-object/from16 v5, p15

    :goto_33
    and-int/lit16 v2, v3, 0x4000

    if-eqz v2, :cond_47

    .line 125
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    move-object/from16 v22, v1

    const/4 v1, 0x6

    invoke-virtual {v2, v4, v1}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/material3/ColorScheme;->getSurface-0d7_KjU()J

    move-result-wide v1

    const v24, -0xe001

    and-int v23, v23, v24

    goto :goto_34

    :cond_47
    move-object/from16 v22, v1

    move-wide/from16 v1, p16

    :goto_34
    and-int v18, v3, v18

    if-eqz v18, :cond_48

    shr-int/lit8 v18, v23, 0xc

    and-int/lit8 v3, v18, 0xe

    .line 126
    invoke-static {v1, v2, v4, v3}, Landroidx/compose/material3/ColorSchemeKt;->contentColorFor-ek8zF_U(JLandroidx/compose/runtime/Composer;I)J

    move-result-wide v24

    and-int v23, v23, p21

    goto :goto_35

    :cond_48
    move-wide/from16 v24, p18

    :goto_35
    move/from16 v3, v23

    :goto_36
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v18

    move-wide/from16 p15, v1

    if-eqz v18, :cond_49

    const v1, -0x5ad53ca7

    const-string v2, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:127)"

    .line 128
    invoke-static {v1, v8, v3, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 135
    :cond_49
    invoke-virtual {v9}, Landroidx/compose/material3/BottomSheetScaffoldState;->getBottomSheetState()Landroidx/compose/material3/SheetState;

    move-result-object v1

    .line 132
    new-instance v2, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1;

    invoke-direct {v2, v0, v6}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$1;-><init>(Lkotlin/jvm/functions/Function3;F)V

    const/16 v0, 0x36

    move-object/from16 p17, v1

    const v1, -0x1b693980

    move/from16 v18, v3

    const/4 v3, 0x1

    invoke-static {v1, v3, v2, v4, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 138
    new-instance v1, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$2;

    move-object/from16 p14, p0

    move-object/from16 p1, v1

    move/from16 p3, v6

    move/from16 p4, v7

    move-object/from16 p2, v9

    move-object/from16 p6, v10

    move-wide/from16 p7, v11

    move-wide/from16 p9, v13

    move/from16 p11, v15

    move/from16 p12, v16

    move-object/from16 p13, v19

    move/from16 p5, v20

    invoke-direct/range {p1 .. p14}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$2;-><init>(Landroidx/compose/material3/BottomSheetScaffoldState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V

    const/16 v2, 0x36

    move-object/from16 p3, v0

    const v0, 0x74efce1f

    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 133
    new-instance v1, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$3;

    invoke-direct {v1, v5, v9}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$3;-><init>(Lkotlin/jvm/functions/Function3;Landroidx/compose/material3/BottomSheetScaffoldState;)V

    move-object/from16 p4, v0

    const v0, 0x548d5be

    invoke-static {v0, v3, v1, v4, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const v1, -0x506b63c7

    const-string v2, "CC(remember):BottomSheetScaffold.kt#9igjgp"

    .line 134
    invoke-static {v4, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit16 v1, v8, 0x380

    xor-int/lit16 v1, v1, 0x180

    const/16 v2, 0x100

    if-le v1, v2, :cond_4a

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4b

    :cond_4a
    and-int/lit16 v1, v8, 0x180

    if-ne v1, v2, :cond_4c

    :cond_4b
    move v2, v3

    goto :goto_37

    :cond_4c
    const/4 v2, 0x0

    .line 412
    :goto_37
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v2, :cond_4d

    .line 413
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_4e

    .line 134
    :cond_4d
    new-instance v1, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$4$1;

    invoke-direct {v1, v9}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$4$1;-><init>(Landroidx/compose/material3/BottomSheetScaffoldState;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 415
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 134
    :cond_4e
    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    shr-int/lit8 v2, v8, 0x3

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v2, v2, 0x6d80

    shr-int/lit8 v3, v18, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    shl-int/lit8 v3, v18, 0x9

    const/high16 v8, 0x1c00000

    and-int/2addr v8, v3

    or-int/2addr v2, v8

    const/high16 v8, 0xe000000

    and-int/2addr v3, v8

    or-int/2addr v2, v3

    move-wide/from16 p8, p15

    move-object/from16 p7, p17

    move-object/from16 p5, v0

    move-object/from16 p6, v1

    move/from16 p13, v2

    move-object/from16 p12, v4

    move-object/from16 p2, v21

    move-object/from16 p1, v22

    move-wide/from16 p10, v24

    .line 129
    invoke-static/range {p1 .. p13}, Landroidx/compose/material3/BottomSheetScaffoldKt;->BottomSheetScaffoldLayout-2E65NiM(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V

    move-wide/from16 v1, p8

    move-object/from16 v0, p12

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_4f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4f
    move/from16 v3, v16

    move-object/from16 v16, v5

    move v5, v7

    move-wide v7, v11

    move v12, v3

    move-wide/from16 v17, v1

    move v4, v6

    move-object v3, v9

    move-object v6, v10

    move-wide v9, v13

    move v11, v15

    move-object/from16 v13, v19

    move/from16 v14, v20

    move-object/from16 v15, v21

    move-object/from16 v2, v22

    move-wide/from16 v19, v24

    .line 154
    :goto_38
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_50

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$5;

    move-object/from16 v21, p20

    move/from16 v22, p22

    move/from16 v23, p23

    move/from16 v24, p24

    move-object/from16 v33, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v24}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffold$5;-><init>(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v33

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_50
    return-void
.end method

.method private static final BottomSheetScaffoldLayout-2E65NiM(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
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
            "Lkotlin/Unit;",
            ">;",
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
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/material3/SheetState;",
            "JJ",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v12, p12

    const v0, -0x626b8a2c

    move-object/from16 v1, p11

    .line 355
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    const-string v3, "C(BottomSheetScaffoldLayout)P(4,8!2,7,5,6,2:c#ui.graphics.Color,3:c#ui.graphics.Color)359@16300L255,370@16635L1950,355@16183L2402:BottomSheetScaffold.kt#uh7d8r"

    invoke-static {v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v3, v12, 0x6

    const/4 v8, 0x4

    move-object/from16 v14, p0

    if-nez v3, :cond_1

    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v8

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v12

    goto :goto_1

    :cond_1
    move v3, v12

    :goto_1
    and-int/lit8 v10, v12, 0x30

    if-nez v10, :cond_3

    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v3, v10

    :cond_3
    and-int/lit16 v10, v12, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p2

    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x100

    goto :goto_3

    :cond_4
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v3, v11

    goto :goto_4

    :cond_5
    move-object/from16 v10, p2

    :goto_4
    and-int/lit16 v11, v12, 0xc00

    if-nez v11, :cond_7

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    const/16 v11, 0x800

    goto :goto_5

    :cond_6
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v3, v11

    :cond_7
    and-int/lit16 v11, v12, 0x6000

    if-nez v11, :cond_9

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x4000

    goto :goto_6

    :cond_8
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v3, v11

    :cond_9
    const/high16 v11, 0x30000

    and-int/2addr v11, v12

    if-nez v11, :cond_b

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/high16 v11, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v11, 0x10000

    :goto_7
    or-int/2addr v3, v11

    :cond_b
    const/high16 v11, 0x180000

    and-int/2addr v11, v12

    if-nez v11, :cond_d

    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/high16 v11, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v11, 0x80000

    :goto_8
    or-int/2addr v3, v11

    :cond_d
    const/high16 v11, 0xc00000

    and-int/2addr v11, v12

    move-wide/from16 v9, p7

    const/16 p11, 0x2

    if-nez v11, :cond_f

    invoke-interface {v1, v9, v10}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v11

    if-eqz v11, :cond_e

    const/high16 v11, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v11, 0x400000

    :goto_9
    or-int/2addr v3, v11

    :cond_f
    const/high16 v11, 0x6000000

    and-int/2addr v11, v12

    move-wide/from16 v13, p9

    if-nez v11, :cond_11

    invoke-interface {v1, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x4000000

    goto :goto_a

    :cond_10
    const/high16 v16, 0x2000000

    :goto_a
    or-int v3, v3, v16

    :cond_11
    const v16, 0x2492493

    and-int v11, v3, v16

    const v15, 0x2492492

    if-ne v11, v15, :cond_13

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v11

    if-nez v11, :cond_12

    goto :goto_b

    .line 409
    :cond_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_10

    .line 355
    :cond_13
    :goto_b
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v11

    if-eqz v11, :cond_14

    const/4 v11, -0x1

    const-string v15, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:354)"

    invoke-static {v0, v3, v11, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 359
    :cond_14
    new-array v0, v8, [Lkotlin/jvm/functions/Function2;

    if-nez v2, :cond_15

    sget-object v8, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->INSTANCE:Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;

    invoke-virtual {v8}, Landroidx/compose/material3/ComposableSingletons$BottomSheetScaffoldKt;->getLambda-3$material3_release()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    goto :goto_c

    :cond_15
    move-object v8, v2

    :goto_c
    const/4 v11, 0x0

    aput-object v8, v0, v11

    .line 360
    new-instance v13, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1;

    move-object/from16 v14, p0

    move-object/from16 v19, p2

    move-wide/from16 v17, p9

    move-wide v15, v9

    const/high16 v8, 0x100000

    const/high16 v9, 0x20000

    invoke-direct/range {v13 .. v19}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1;-><init>(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function2;)V

    const/16 v10, 0x36

    const v14, 0x17c7b382

    const/4 v15, 0x1

    invoke-static {v14, v15, v13, v1, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v10

    aput-object v10, v0, v15

    .line 368
    aput-object v4, v0, p11

    const/4 v10, 0x3

    .line 369
    aput-object v5, v0, v10

    .line 358
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const v10, 0x48c9040f

    const-string v13, "CC(remember):BottomSheetScaffold.kt#9igjgp"

    .line 371
    invoke-static {v1, v10, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v10, 0x380000

    and-int/2addr v10, v3

    if-ne v10, v8, :cond_16

    move v8, v15

    goto :goto_d

    :cond_16
    move v8, v11

    :goto_d
    const/high16 v10, 0x70000

    and-int/2addr v3, v10

    if-ne v3, v9, :cond_17

    goto :goto_e

    :cond_17
    move v15, v11

    :goto_e
    or-int v3, v8, v15

    .line 459
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_18

    .line 460
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v8, v3, :cond_19

    .line 371
    :cond_18
    new-instance v3, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;

    invoke-direct {v3, v7, v6}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1;-><init>(Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;)V

    move-object v8, v3

    check-cast v8, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;

    .line 462
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 371
    :cond_19
    check-cast v8, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v3, 0x5365e06c

    .line 356
    const-string v9, "CC(Layout)P(!1,2)173@6976L62,170@6862L182:Layout.kt#80mrfh"

    .line 465
    invoke-static {v1, v3, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 466
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    .line 470
    invoke-static {v0}, Landroidx/compose/ui/layout/LayoutKt;->combineAsVirtualLayouts(Ljava/util/List;)Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const v9, -0x1154ad0d

    const-string v10, "CC(remember):Layout.kt#9igjgp"

    .line 472
    invoke-static {v1, v9, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    .line 473
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_1a

    .line 474
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v10, v9, :cond_1b

    .line 472
    :cond_1a
    invoke-static {v8}, Landroidx/compose/ui/layout/MultiContentMeasurePolicyKt;->createMeasurePolicy(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v10

    .line 476
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 472
    :cond_1b
    check-cast v10, Landroidx/compose/ui/layout/MeasurePolicy;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v8, -0x4ee9b9da

    .line 469
    const-string v9, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh"

    .line 479
    invoke-static {v1, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 480
    invoke-static {v1, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v8

    .line 481
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v9

    .line 482
    invoke-static {v1, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 484
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    const v14, -0x2942ffcf

    .line 483
    const-string v15, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 485
    invoke-static {v1, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 486
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v14

    instance-of v14, v14, Landroidx/compose/runtime/Applier;

    if-nez v14, :cond_1c

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 487
    :cond_1c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 488
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v14

    if-eqz v14, :cond_1d

    .line 489
    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_f

    .line 491
    :cond_1d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 493
    :goto_f
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v13

    .line 494
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v13, v10, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 495
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v13, v9, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 497
    sget-object v9, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    .line 499
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v10

    if-nez v10, :cond_1e

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1f

    .line 500
    :cond_1e
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 501
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v13, v8, v9}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 504
    :cond_1f
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v13, v3, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 506
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 507
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 485
    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 479
    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 465
    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 510
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 409
    :cond_20
    :goto_10
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v13

    if-eqz v13, :cond_21

    new-instance v0, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3;

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3;-><init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJI)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_21
    return-void
.end method

.method private static final StandardBottomSheet-w7I5h1o(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SheetState;",
            "FFZ",
            "Landroidx/compose/ui/graphics/Shape;",
            "JJFF",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
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
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v6, p1

    move/from16 v7, p2

    move/from16 v3, p3

    move/from16 v0, p14

    const v2, 0x2b00b886

    move-object/from16 v4, p13

    .line 225
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    const-string v5, "C(StandardBottomSheet)P(9,4:c#ui.unit.Dp,7:c#ui.unit.Dp,8,6,0:c#ui.graphics.Color,2:c#ui.graphics.Color,10:c#ui.unit.Dp,5:c#ui.unit.Dp,3)225@10249L24,*227@10358L7,248@11164L1938,294@13493L2297,242@10889L4901:BottomSheetScaffold.kt#uh7d8r"

    invoke-static {v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_1

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_1
    move v5, v0

    :goto_1
    and-int/lit8 v10, v0, 0x30

    if-nez v10, :cond_3

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v5, v10

    :cond_3
    and-int/lit16 v10, v0, 0x180

    if-nez v10, :cond_5

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x100

    goto :goto_3

    :cond_4
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v5, v10

    :cond_5
    and-int/lit16 v10, v0, 0xc00

    if-nez v10, :cond_7

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x800

    goto :goto_4

    :cond_6
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v5, v10

    :cond_7
    and-int/lit16 v10, v0, 0x6000

    if-nez v10, :cond_9

    move-object/from16 v10, p4

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x4000

    goto :goto_5

    :cond_8
    const/16 v11, 0x2000

    :goto_5
    or-int/2addr v5, v11

    goto :goto_6

    :cond_9
    move-object/from16 v10, p4

    :goto_6
    const/high16 v11, 0x30000

    and-int/2addr v11, v0

    if-nez v11, :cond_b

    move-wide/from16 v11, p5

    invoke-interface {v4, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v13

    if-eqz v13, :cond_a

    const/high16 v13, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v13, 0x10000

    :goto_7
    or-int/2addr v5, v13

    goto :goto_8

    :cond_b
    move-wide/from16 v11, p5

    :goto_8
    const/high16 v13, 0x180000

    and-int/2addr v13, v0

    if-nez v13, :cond_d

    move-wide/from16 v13, p7

    invoke-interface {v4, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v15

    if-eqz v15, :cond_c

    const/high16 v15, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v15, 0x80000

    :goto_9
    or-int/2addr v5, v15

    goto :goto_a

    :cond_d
    move-wide/from16 v13, p7

    :goto_a
    const/high16 v16, 0xc00000

    and-int v15, v0, v16

    if-nez v15, :cond_f

    move/from16 v15, p9

    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v17

    if-eqz v17, :cond_e

    const/high16 v17, 0x800000

    goto :goto_b

    :cond_e
    const/high16 v17, 0x400000

    :goto_b
    or-int v5, v5, v17

    goto :goto_c

    :cond_f
    move/from16 v15, p9

    :goto_c
    const/high16 v17, 0x6000000

    and-int v17, v0, v17

    move/from16 v12, p10

    if-nez v17, :cond_11

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v11

    if-eqz v11, :cond_10

    const/high16 v11, 0x4000000

    goto :goto_d

    :cond_10
    const/high16 v11, 0x2000000

    :goto_d
    or-int/2addr v5, v11

    :cond_11
    const/high16 v11, 0x30000000

    and-int/2addr v11, v0

    if-nez v11, :cond_13

    move-object/from16 v11, p11

    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_12

    const/high16 v17, 0x20000000

    goto :goto_e

    :cond_12
    const/high16 v17, 0x10000000

    :goto_e
    or-int v5, v5, v17

    goto :goto_f

    :cond_13
    move-object/from16 v11, p11

    :goto_f
    and-int/lit8 v17, p15, 0x6

    move-object/from16 v12, p12

    if-nez v17, :cond_15

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_14

    const/16 v17, 0x4

    goto :goto_10

    :cond_14
    const/16 v17, 0x2

    :goto_10
    or-int v17, p15, v17

    move/from16 v8, v17

    goto :goto_11

    :cond_15
    move/from16 v8, p15

    :goto_11
    const v17, 0x12492493

    and-int v2, v5, v17

    const v9, 0x12492492

    if-ne v2, v9, :cond_17

    and-int/lit8 v2, v8, 0x3

    const/4 v9, 0x2

    if-ne v2, v9, :cond_17

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_16

    goto :goto_12

    .line 341
    :cond_16
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v18, v4

    goto/16 :goto_15

    .line 225
    :cond_17
    :goto_12
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_18

    const-string v2, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:224)"

    const v9, 0x2b00b886

    invoke-static {v9, v5, v8, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_18
    const v2, 0x2e20b340

    .line 226
    const-string v8, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp"

    .line 430
    invoke-static {v4, v2, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const v2, -0x38e26dd0

    .line 433
    const-string v8, "CC(remember):Effects.kt#9igjgp"

    .line 434
    invoke-static {v4, v2, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 435
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 436
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v2, v8, :cond_19

    .line 440
    sget-object v2, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 439
    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v2, v4}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    .line 438
    new-instance v8, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v8, v2}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/CoroutineScope;)V

    .line 441
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v2, v8

    .line 434
    :cond_19
    check-cast v2, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 444
    invoke-virtual {v2}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    .line 430
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 227
    sget-object v10, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 228
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v8

    check-cast v8, Landroidx/compose/runtime/CompositionLocal;

    const v9, 0x789c5f52

    const-string v0, "CC:CompositionLocal.kt#9igjgp"

    .line 445
    invoke-static {v4, v9, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 228
    check-cast v0, Landroidx/compose/ui/unit/Density;

    invoke-interface {v0, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v0

    const v8, -0x6d2c2c7c

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v8, "231@10496L326"

    invoke-static {v4, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 230
    const-string v8, "CC(remember):BottomSheetScaffold.kt#9igjgp"

    if-eqz v3, :cond_1c

    .line 231
    sget-object v18, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object/from16 v9, v18

    check-cast v9, Landroidx/compose/ui/Modifier;

    .line 232
    invoke-virtual {v1}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/internal/AnchoredDraggableState;

    move-result-object v3

    move/from16 v18, v5

    const v5, -0x6d2c2386

    invoke-static {v4, v5, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    .line 447
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_1a

    .line 448
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_1b

    .line 233
    :cond_1a
    new-instance v3, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1;

    invoke-direct {v3, v2, v1}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1;-><init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v10, v3}, Landroidx/compose/material3/SheetDefaultsKt;->ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(Landroidx/compose/material3/SheetState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    move-result-object v5

    .line 450
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 232
    :cond_1b
    check-cast v5, Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move-object/from16 v19, v2

    const/4 v2, 0x2

    const/4 v3, 0x0

    .line 231
    invoke-static {v9, v5, v3, v2, v3}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt;->nestedScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    goto :goto_13

    :cond_1c
    move-object/from16 v19, v2

    move/from16 v18, v5

    const/4 v3, 0x0

    .line 241
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v5, v2

    check-cast v5, Landroidx/compose/ui/Modifier;

    .line 230
    :goto_13
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 245
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/4 v9, 0x0

    const/4 v12, 0x1

    invoke-static {v2, v9, v7, v12, v3}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 246
    invoke-static {v2, v9, v12, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v12, 0x2

    .line 247
    invoke-static {v2, v6, v9, v12, v3}, Landroidx/compose/foundation/layout/SizeKt;->requiredHeightIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 248
    invoke-interface {v2, v5}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 249
    invoke-virtual {v1}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/internal/AnchoredDraggableState;

    move-result-object v3

    const v5, -0x6d2bc9ba

    invoke-static {v4, v5, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v5, v18, 0xe

    const/4 v8, 0x4

    if-ne v5, v8, :cond_1d

    const/4 v5, 0x1

    goto :goto_14

    :cond_1d
    const/4 v5, 0x0

    :goto_14
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v8

    or-int/2addr v5, v8

    .line 453
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_1e

    .line 454
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v8, v5, :cond_1f

    .line 249
    :cond_1e
    new-instance v5, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$1$1;

    invoke-direct {v5, v1, v0}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$1$1;-><init>(Landroidx/compose/material3/SheetState;F)V

    move-object v8, v5

    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 456
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 249
    :cond_1f
    check-cast v8, Lkotlin/jvm/functions/Function2;

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v2, v3, v10, v8}, Landroidx/compose/material3/internal/AnchoredDraggableKt;->draggableAnchors(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/internal/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 286
    invoke-virtual {v1}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/internal/AnchoredDraggableState;

    move-result-object v9

    const/16 v14, 0x18

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v11, p3

    const/16 v20, 0x1

    .line 285
    invoke-static/range {v8 .. v15}, Landroidx/compose/material3/internal/AnchoredDraggableKt;->anchoredDraggable$default(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/internal/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 295
    new-instance v0, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$2;

    move/from16 v3, p3

    move-object/from16 v5, p12

    move-object v2, v1

    move-object v9, v4

    move-object/from16 v4, v19

    move/from16 v10, v20

    move-object/from16 v1, p11

    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$2;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/SheetState;ZLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function3;)V

    const/16 v1, 0x36

    const v2, 0x1749ed8b

    invoke-static {v2, v10, v0, v9, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lkotlin/jvm/functions/Function2;

    shr-int/lit8 v0, v18, 0x9

    and-int/lit8 v1, v0, 0x70

    or-int v1, v1, v16

    and-int/lit16 v2, v0, 0x380

    or-int/2addr v1, v2

    and-int/lit16 v2, v0, 0x1c00

    or-int/2addr v1, v2

    const v2, 0xe000

    and-int/2addr v2, v0

    or-int/2addr v1, v2

    const/high16 v2, 0x70000

    and-int/2addr v0, v2

    or-int v19, v1, v0

    const/16 v20, 0x40

    const/16 v16, 0x0

    move-wide/from16 v10, p5

    move-wide/from16 v12, p7

    move/from16 v14, p9

    move/from16 v15, p10

    move-object/from16 v18, v9

    move-object/from16 v9, p4

    .line 243
    invoke-static/range {v8 .. v20}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 341
    :cond_20
    :goto_15
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_21

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3;

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-wide/from16 v8, p7

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v21, v1

    move v2, v6

    move v3, v7

    move-object/from16 v1, p0

    move-wide/from16 v6, p5

    invoke-direct/range {v0 .. v15}, Landroidx/compose/material3/BottomSheetScaffoldKt$StandardBottomSheet$3;-><init>(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v21

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_21
    return-void
.end method

.method public static final synthetic access$BottomSheetScaffoldLayout-2E65NiM(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p12}, Landroidx/compose/material3/BottomSheetScaffoldKt;->BottomSheetScaffoldLayout-2E65NiM(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic access$StandardBottomSheet-w7I5h1o(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p15}, Landroidx/compose/material3/BottomSheetScaffoldKt;->StandardBottomSheet-w7I5h1o(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final rememberBottomSheetScaffoldState(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;
    .locals 8

    const-string v0, "C(rememberBottomSheetScaffoldState)178@8695L34,179@8774L32,181@8848L196:BottomSheetScaffold.kt#uh7d8r"

    const v1, -0x57e4b436

    .line 181
    invoke-static {p2, v1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p2

    .line 179
    invoke-static/range {v2 .. v7}, Landroidx/compose/material3/BottomSheetScaffoldKt;->rememberStandardBottomSheetState(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object v5, p2

    :goto_0
    and-int/lit8 p2, p4, 0x2

    const-string p4, "CC(remember):BottomSheetScaffold.kt#9igjgp"

    if-eqz p2, :cond_2

    const p1, -0x2ef392c9

    .line 180
    invoke-static {v5, p1, p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 418
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p1

    .line 419
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    .line 180
    new-instance p1, Landroidx/compose/material3/SnackbarHostState;

    invoke-direct {p1}, Landroidx/compose/material3/SnackbarHostState;-><init>()V

    .line 421
    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 180
    :cond_1
    check-cast p1, Landroidx/compose/material3/SnackbarHostState;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    :cond_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, -0x1

    const-string v0, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:180)"

    .line 181
    invoke-static {v1, p3, p2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_3
    const p2, -0x2ef388e5

    .line 182
    invoke-static {v5, p2, p4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 p2, p3, 0xe

    xor-int/lit8 p2, p2, 0x6

    const/4 p4, 0x0

    const/4 v0, 0x4

    const/4 v1, 0x1

    if-le p2, v0, :cond_4

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    :cond_4
    and-int/lit8 p2, p3, 0x6

    if-ne p2, v0, :cond_6

    :cond_5
    move p2, v1

    goto :goto_1

    :cond_6
    move p2, p4

    :goto_1
    and-int/lit8 v0, p3, 0x70

    xor-int/lit8 v0, v0, 0x30

    const/16 v2, 0x20

    if-le v0, v2, :cond_7

    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_7
    and-int/lit8 p3, p3, 0x30

    if-ne p3, v2, :cond_9

    :cond_8
    move p4, v1

    :cond_9
    or-int/2addr p2, p4

    .line 424
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_a

    .line 425
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p2

    if-ne p3, p2, :cond_b

    .line 183
    :cond_a
    new-instance p3, Landroidx/compose/material3/BottomSheetScaffoldState;

    invoke-direct {p3, p0, p1}, Landroidx/compose/material3/BottomSheetScaffoldState;-><init>(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;)V

    .line 427
    invoke-interface {v5, p3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 182
    :cond_b
    check-cast p3, Landroidx/compose/material3/BottomSheetScaffoldState;

    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 181
    :cond_c
    invoke-static {v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object p3
.end method

.method public static final rememberStandardBottomSheetState(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SheetValue;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/material3/SheetValue;",
            "Ljava/lang/Boolean;",
            ">;Z",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Landroidx/compose/material3/SheetState;"
        }
    .end annotation

    const-string v0, "C(rememberStandardBottomSheetState)P(1)204@9680L154:BottomSheetScaffold.kt#uh7d8r"

    const v1, 0x287143dd

    .line 205
    invoke-static {p3, v1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    .line 201
    sget-object p0, Landroidx/compose/material3/SheetValue;->PartiallyExpanded:Landroidx/compose/material3/SheetValue;

    :cond_0
    move-object v4, p0

    and-int/lit8 p0, p5, 0x2

    if-eqz p0, :cond_1

    .line 202
    sget-object p0, Landroidx/compose/material3/BottomSheetScaffoldKt$rememberStandardBottomSheetState$1;->INSTANCE:Landroidx/compose/material3/BottomSheetScaffoldKt$rememberStandardBottomSheetState$1;

    move-object p1, p0

    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_1
    move-object v3, p1

    and-int/lit8 p0, p5, 0x4

    if-eqz p0, :cond_2

    const/4 p2, 0x1

    :cond_2
    move v5, p2

    .line 203
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, -0x1

    const-string p1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:204)"

    .line 205
    invoke-static {v1, p4, p0, p1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_3
    and-int/lit8 p0, p4, 0x70

    shl-int/lit8 p1, p4, 0x6

    and-int/lit16 p1, p1, 0x380

    or-int/2addr p0, p1

    shl-int/lit8 p1, p4, 0x3

    and-int/lit16 p1, p1, 0x1c00

    or-int v7, p0, p1

    const/4 v8, 0x1

    const/4 v2, 0x0

    move-object v6, p3

    invoke-static/range {v2 .. v8}, Landroidx/compose/material3/SheetDefaultsKt;->rememberSheetState(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;

    move-result-object p0

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    invoke-static {v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-object p0
.end method
