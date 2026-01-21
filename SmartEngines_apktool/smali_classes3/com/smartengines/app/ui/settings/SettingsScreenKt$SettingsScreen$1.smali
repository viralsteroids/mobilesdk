.class final Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;
.super Ljava/lang/Object;
.source "SettingsScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/SettingsScreenKt;->SettingsScreen(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $codeSettings$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/CodeSettings;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $commonSettings$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/CommonSettings;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $docSettings$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/DocSettings;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $idSettings$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/IdSettings;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $navController:Landroidx/navigation/NavHostController;

.field final synthetic $onDismiss:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $textSettings$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/TextSettings;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$F14-JHiJ6wFlpXV1y4yLxZtrnOM(Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/navigation/NavGraphBuilder;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->invoke$lambda$0(Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/navigation/NavGraphBuilder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavHostController;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/CommonSettings;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/CodeSettings;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/IdSettings;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/DocSettings;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/TextSettings;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->$navController:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->$onDismiss:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->$commonSettings$delegate:Landroidx/compose/runtime/State;

    iput-object p4, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->$codeSettings$delegate:Landroidx/compose/runtime/State;

    iput-object p5, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->$idSettings$delegate:Landroidx/compose/runtime/State;

    iput-object p6, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->$docSettings$delegate:Landroidx/compose/runtime/State;

    iput-object p7, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->$textSettings$delegate:Landroidx/compose/runtime/State;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0(Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/navigation/NavGraphBuilder;)Lkotlin/Unit;
    .locals 16

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    const-string v0, "$onDismiss"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$navController"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$commonSettings$delegate"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$codeSettings$delegate"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$idSettings$delegate"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$docSettings$delegate"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$textSettings$delegate"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this$NavHost"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    new-instance v0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;

    invoke-direct/range {v0 .. v7}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    move-object v1, v0

    move-object v0, v2

    move-object v13, v4

    move-object v15, v7

    const v2, 0x1a181d97

    const/4 v3, 0x1

    invoke-static {v2, v3, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const/16 v11, 0xfe

    const/4 v12, 0x0

    const-string v2, "home"

    move v1, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v14, v1

    move-object/from16 v1, p7

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 78
    new-instance v1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$2;

    invoke-direct {v1, v0, v13}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$2;-><init>(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;)V

    const v2, 0x291a7300

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string v2, "barcodes"

    move-object/from16 v1, p7

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 86
    new-instance v1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$3;

    invoke-direct {v1, v0, v13}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$3;-><init>(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;)V

    const v2, -0x5916f4e1

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string v2, "barcode-types"

    move-object/from16 v1, p7

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 93
    new-instance v1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$4;

    invoke-direct {v1, v0, v13}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$4;-><init>(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;)V

    const v2, 0x24b7a33e

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string v2, "cards"

    move-object/from16 v1, p7

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 99
    new-instance v1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$5;

    invoke-direct {v1, v0, v13}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$5;-><init>(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;)V

    const v2, -0x5d79c4a3

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string/jumbo v2, "textlines"

    move-object/from16 v1, p7

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 106
    new-instance v1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$6;

    invoke-direct {v1, v0, v15}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$6;-><init>(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;)V

    const v2, 0x2054d37c

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string/jumbo v2, "texts"

    move-object/from16 v1, p7

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 112
    new-instance v1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$7;

    invoke-direct {v1, v0, v13}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$7;-><init>(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;)V

    const v2, -0x61dc9465

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string v2, "meters"

    move-object/from16 v1, p7

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 118
    new-instance v1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$8;

    invoke-direct {v1, v0, v13}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$8;-><init>(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;)V

    const v2, 0x1bf203ba

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string v2, "payments"

    move-object/from16 v1, p7

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 124
    new-instance v1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$9;

    invoke-direct {v1, v0, v13}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$9;-><init>(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;)V

    const v2, -0x663f6427

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string v2, "plates"

    move-object/from16 v1, p7

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 130
    new-instance v1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$10;

    invoke-direct {v1, v0, v13}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$10;-><init>(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;)V

    const v2, 0x178f33f8

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string v2, "containers"

    move-object/from16 v1, p7

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 136
    new-instance v1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$11;

    move-object/from16 v5, p4

    invoke-direct {v1, v0, v5}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$11;-><init>(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;)V

    const v0, 0x3d28b18c

    invoke-static {v0, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lkotlin/jvm/functions/Function4;

    const-string v2, "liveness"

    const/4 v5, 0x0

    move-object/from16 v1, p7

    invoke-static/range {v1 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 142
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 62
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "C62@2492L2337:SettingsScreen.kt#v86m6v"

    move-object/from16 v13, p1

    invoke-static {v13, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v1, p2, 0xb

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 63
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 142
    :cond_0
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 63
    :cond_1
    :goto_0
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 64
    iget-object v2, v0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->$navController:Landroidx/navigation/NavHostController;

    .line 63
    iget-object v6, v0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->$onDismiss:Lkotlin/jvm/functions/Function0;

    iget-object v8, v0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->$commonSettings$delegate:Landroidx/compose/runtime/State;

    iget-object v9, v0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->$codeSettings$delegate:Landroidx/compose/runtime/State;

    iget-object v10, v0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->$idSettings$delegate:Landroidx/compose/runtime/State;

    iget-object v11, v0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->$docSettings$delegate:Landroidx/compose/runtime/State;

    iget-object v12, v0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->$textSettings$delegate:Landroidx/compose/runtime/State;

    new-instance v5, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$$ExternalSyntheticLambda0;

    move-object v7, v2

    invoke-direct/range {v5 .. v12}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    const/4 v15, 0x0

    const/16 v16, 0x3f8

    const-string v3, "home"

    move-object v12, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v14, 0x1b8

    invoke-static/range {v2 .. v16}, Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    return-void
.end method
