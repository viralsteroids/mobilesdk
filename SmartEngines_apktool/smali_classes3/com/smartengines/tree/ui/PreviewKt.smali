.class public final Lcom/smartengines/tree/ui/PreviewKt;
.super Ljava/lang/Object;
.source "Preview.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPreview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preview.kt\ncom/smartengines/tree/ui/PreviewKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,79:1\n149#2:80\n149#2:81\n149#2:82\n149#2:83\n*S KotlinDebug\n*F\n+ 1 Preview.kt\ncom/smartengines/tree/ui/PreviewKt\n*L\n59#1:80\n69#1:81\n70#1:82\n72#1:83\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u001a\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0001\u00a2\u0006\u0002\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0001\u00a2\u0006\u0002\u0010\u0010\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0000\u0010\u0002\"\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0012"
    }
    d2 = {
        "isPreview",
        "",
        "()Z",
        "setPreview",
        "(Z)V",
        "previewData",
        "",
        "Lcom/smartengines/tree/ui/AppNode;",
        "getPreviewData",
        "()Ljava/util/List;",
        "NodeRow",
        "",
        "node",
        "(Lcom/smartengines/tree/ui/AppNode;Landroidx/compose/runtime/Composer;I)V",
        "NodeRowAccordion",
        "selected",
        "(Lcom/smartengines/tree/ui/AppNode;ZLandroidx/compose/runtime/Composer;I)V",
        "NodeIcon",
        "tree_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static isPreview:Z


# direct methods
.method public static synthetic $r8$lambda$Ajukw4esI4padKSFcDmHKtxlvhU(Lcom/smartengines/tree/ui/AppNode;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/smartengines/tree/ui/PreviewKt;->NodeRow$lambda$0(Lcom/smartengines/tree/ui/AppNode;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$_Jvv928CqLwSsveTji1kskhttEQ(Lcom/smartengines/tree/ui/AppNode;ZILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/smartengines/tree/ui/PreviewKt;->NodeIcon$lambda$2(Lcom/smartengines/tree/ui/AppNode;ZILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$pZeiTCZjAq14z3xw_2WZ4oMUUHs(Lcom/smartengines/tree/ui/AppNode;ZILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/smartengines/tree/ui/PreviewKt;->NodeRowAccordion$lambda$1(Lcom/smartengines/tree/ui/AppNode;ZILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final NodeIcon(Lcom/smartengines/tree/ui/AppNode;ZLandroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    const-string v2, "node"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7e0c7c9f

    move-object/from16 v3, p2

    .line 67
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v13

    const-string v2, "C(NodeIcon)72@2430L96,67@2197L329:Preview.kt#snoj4b"

    invoke-static {v13, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 68
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/16 v3, 0x6e

    int-to-float v3, v3

    .line 81
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 69
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x5

    int-to-float v3, v3

    .line 82
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 70
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    if-eqz v1, :cond_0

    const v2, -0x607d2a1b    # -5.5411E-20f

    .line 71
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "70@2315L11"

    invoke-static {v13, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v4, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v2, v13, v4}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/material3/ColorScheme;->getPrimary-0d7_KjU()J

    move-result-wide v4

    goto :goto_0

    :cond_0
    const v2, -0x607d2534

    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "70@2354L11"

    invoke-static {v13, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v4, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v2, v13, v4}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/material3/ColorScheme;->getSurfaceVariant-0d7_KjU()J

    move-result-wide v4

    :goto_0
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-wide v5, v4

    const/16 v2, 0xa

    int-to-float v2, v2

    .line 83
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 72
    invoke-static {v2}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroidx/compose/ui/graphics/Shape;

    .line 73
    new-instance v2, Lcom/smartengines/tree/ui/PreviewKt$NodeIcon$1;

    invoke-direct {v2, v0}, Lcom/smartengines/tree/ui/PreviewKt$NodeIcon$1;-><init>(Lcom/smartengines/tree/ui/AppNode;)V

    const/16 v7, 0x36

    const v8, -0x7668a99c

    const/4 v9, 0x1

    invoke-static {v8, v9, v2, v13, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lkotlin/jvm/functions/Function2;

    const v14, 0xc00006

    const/16 v15, 0x78

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 68
    invoke-static/range {v3 .. v15}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Lcom/smartengines/tree/ui/PreviewKt$$ExternalSyntheticLambda0;

    move/from16 v4, p3

    invoke-direct {v3, v0, v1, v4}, Lcom/smartengines/tree/ui/PreviewKt$$ExternalSyntheticLambda0;-><init>(Lcom/smartengines/tree/ui/AppNode;ZI)V

    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_1
    return-void
.end method

.method private static final NodeIcon$lambda$2(Lcom/smartengines/tree/ui/AppNode;ZILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    const-string p4, "$node"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/smartengines/tree/ui/PreviewKt;->NodeIcon(Lcom/smartengines/tree/ui/AppNode;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final NodeRow(Lcom/smartengines/tree/ui/AppNode;Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move-object/from16 v0, p0

    const-string v1, "node"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x3fdf61c4

    move-object/from16 v2, p1

    .line 51
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    const-string v2, "C(NodeRow)51@1716L15:Preview.kt#snoj4b"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 52
    invoke-virtual {v0}, Lcom/smartengines/tree/ui/AppNode;->getName()Ljava/lang/String;

    move-result-object v2

    const/16 v25, 0x0

    const v26, 0x1fffe

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

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, v1

    invoke-static/range {v2 .. v26}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/smartengines/tree/ui/PreviewKt$$ExternalSyntheticLambda1;

    move/from16 v3, p2

    invoke-direct {v2, v0, v3}, Lcom/smartengines/tree/ui/PreviewKt$$ExternalSyntheticLambda1;-><init>(Lcom/smartengines/tree/ui/AppNode;I)V

    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_0
    return-void
.end method

.method private static final NodeRow$lambda$0(Lcom/smartengines/tree/ui/AppNode;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    const-string p3, "$node"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/smartengines/tree/ui/PreviewKt;->NodeRow(Lcom/smartengines/tree/ui/AppNode;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final NodeRowAccordion(Lcom/smartengines/tree/ui/AppNode;ZLandroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    const-string v2, "node"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x3b13c88c

    move-object/from16 v3, p2

    .line 55
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v13

    const-string v2, "C(NodeRowAccordion)59@2026L96,55@1814L308:Preview.kt#snoj4b"

    invoke-static {v13, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 57
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v2, v4, v5, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    if-eqz v1, :cond_0

    const v2, -0x77783ec6

    .line 58
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "57@1911L11"

    invoke-static {v13, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v4, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v2, v13, v4}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/material3/ColorScheme;->getPrimary-0d7_KjU()J

    move-result-wide v6

    goto :goto_0

    :cond_0
    const v2, -0x777839df

    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v2, "57@1950L11"

    invoke-static {v13, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v4, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v2, v13, v4}, Landroidx/compose/material3/MaterialTheme;->getColorScheme(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/material3/ColorScheme;->getSurfaceVariant-0d7_KjU()J

    move-result-wide v6

    :goto_0
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v2, 0xa

    int-to-float v2, v2

    .line 80
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 59
    invoke-static {v2}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroidx/compose/ui/graphics/Shape;

    .line 60
    new-instance v2, Lcom/smartengines/tree/ui/PreviewKt$NodeRowAccordion$1;

    invoke-direct {v2, v0}, Lcom/smartengines/tree/ui/PreviewKt$NodeRowAccordion$1;-><init>(Lcom/smartengines/tree/ui/AppNode;)V

    const/16 v8, 0x36

    const v9, -0x3ec883c7

    invoke-static {v9, v5, v2, v13, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lkotlin/jvm/functions/Function2;

    const v14, 0xc00006

    const/16 v15, 0x78

    move-wide v5, v6

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 56
    invoke-static/range {v3 .. v15}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Lcom/smartengines/tree/ui/PreviewKt$$ExternalSyntheticLambda2;

    move/from16 v4, p3

    invoke-direct {v3, v0, v1, v4}, Lcom/smartengines/tree/ui/PreviewKt$$ExternalSyntheticLambda2;-><init>(Lcom/smartengines/tree/ui/AppNode;ZI)V

    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_1
    return-void
.end method

.method private static final NodeRowAccordion$lambda$1(Lcom/smartengines/tree/ui/AppNode;ZILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    const-string p4, "$node"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/smartengines/tree/ui/PreviewKt;->NodeRowAccordion(Lcom/smartengines/tree/ui/AppNode;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final getPreviewData()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/tree/ui/AppNode;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x5

    .line 35
    new-array v0, v0, [Lcom/smartengines/tree/ui/AppNode;

    new-instance v1, Lcom/smartengines/tree/ui/AppNode;

    const/4 v2, 0x3

    .line 36
    new-array v3, v2, [Lcom/smartengines/tree/ui/AppNode;

    new-instance v4, Lcom/smartengines/tree/ui/AppNode;

    .line 37
    new-array v5, v2, [Lcom/smartengines/tree/ui/AppNode;

    new-instance v6, Lcom/smartengines/tree/ui/AppNode;

    const-string v7, "one/one/one"

    const/4 v8, 0x0

    const/4 v9, 0x2

    invoke-direct {v6, v7, v8, v9, v8}, Lcom/smartengines/tree/ui/AppNode;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x0

    aput-object v6, v5, v7

    .line 38
    new-instance v6, Lcom/smartengines/tree/ui/AppNode;

    const-string v10, "one/one/two"

    invoke-direct {v6, v10, v8, v9, v8}, Lcom/smartengines/tree/ui/AppNode;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x1

    aput-object v6, v5, v10

    .line 39
    new-instance v6, Lcom/smartengines/tree/ui/AppNode;

    const-string v11, "one/one/three"

    invoke-direct {v6, v11, v8, v9, v8}, Lcom/smartengines/tree/ui/AppNode;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v6, v5, v9

    .line 36
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-string v6, "one-one"

    invoke-direct {v4, v6, v5}, Lcom/smartengines/tree/ui/AppNode;-><init>(Ljava/lang/String;Ljava/util/List;)V

    aput-object v4, v3, v7

    .line 41
    new-instance v4, Lcom/smartengines/tree/ui/AppNode;

    const-string v5, "one-two"

    invoke-direct {v4, v5, v8, v9, v8}, Lcom/smartengines/tree/ui/AppNode;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v4, v3, v10

    .line 42
    new-instance v4, Lcom/smartengines/tree/ui/AppNode;

    const-string v5, "one-three"

    invoke-direct {v4, v5, v8, v9, v8}, Lcom/smartengines/tree/ui/AppNode;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v4, v3, v9

    .line 35
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v4, "One"

    invoke-direct {v1, v4, v3}, Lcom/smartengines/tree/ui/AppNode;-><init>(Ljava/lang/String;Ljava/util/List;)V

    aput-object v1, v0, v7

    .line 44
    new-instance v1, Lcom/smartengines/tree/ui/AppNode;

    const-string v3, "Two"

    invoke-direct {v1, v3, v8, v9, v8}, Lcom/smartengines/tree/ui/AppNode;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v1, v0, v10

    .line 45
    new-instance v1, Lcom/smartengines/tree/ui/AppNode;

    const-string v3, "Three"

    invoke-direct {v1, v3, v8, v9, v8}, Lcom/smartengines/tree/ui/AppNode;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v1, v0, v9

    .line 46
    new-instance v1, Lcom/smartengines/tree/ui/AppNode;

    const-string v3, "Four"

    invoke-direct {v1, v3, v8, v9, v8}, Lcom/smartengines/tree/ui/AppNode;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v1, v0, v2

    .line 47
    new-instance v1, Lcom/smartengines/tree/ui/AppNode;

    const-string v2, "Five"

    invoke-direct {v1, v2, v8, v9, v8}, Lcom/smartengines/tree/ui/AppNode;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 34
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final isPreview()Z
    .locals 1

    .line 27
    sget-boolean v0, Lcom/smartengines/tree/ui/PreviewKt;->isPreview:Z

    return v0
.end method

.method public static final setPreview(Z)V
    .locals 0

    .line 27
    sput-boolean p0, Lcom/smartengines/tree/ui/PreviewKt;->isPreview:Z

    return-void
.end method
