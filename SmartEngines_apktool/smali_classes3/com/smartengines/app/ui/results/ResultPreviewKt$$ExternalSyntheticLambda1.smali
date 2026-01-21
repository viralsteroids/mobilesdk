.class public final synthetic Lcom/smartengines/app/ui/results/ResultPreviewKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/util/Collection;

.field public final synthetic f$1:Landroid/util/Size;

.field public final synthetic f$2:Lcom/smartengines/app/settings/VisualizationSettings;

.field public final synthetic f$3:Landroidx/compose/ui/unit/Density;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Collection;Landroid/util/Size;Lcom/smartengines/app/settings/VisualizationSettings;Landroidx/compose/ui/unit/Density;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/results/ResultPreviewKt$$ExternalSyntheticLambda1;->f$0:Ljava/util/Collection;

    iput-object p2, p0, Lcom/smartengines/app/ui/results/ResultPreviewKt$$ExternalSyntheticLambda1;->f$1:Landroid/util/Size;

    iput-object p3, p0, Lcom/smartengines/app/ui/results/ResultPreviewKt$$ExternalSyntheticLambda1;->f$2:Lcom/smartengines/app/settings/VisualizationSettings;

    iput-object p4, p0, Lcom/smartengines/app/ui/results/ResultPreviewKt$$ExternalSyntheticLambda1;->f$3:Landroidx/compose/ui/unit/Density;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/results/ResultPreviewKt$$ExternalSyntheticLambda1;->f$0:Ljava/util/Collection;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/ResultPreviewKt$$ExternalSyntheticLambda1;->f$1:Landroid/util/Size;

    iget-object v2, p0, Lcom/smartengines/app/ui/results/ResultPreviewKt$$ExternalSyntheticLambda1;->f$2:Lcom/smartengines/app/settings/VisualizationSettings;

    iget-object v3, p0, Lcom/smartengines/app/ui/results/ResultPreviewKt$$ExternalSyntheticLambda1;->f$3:Landroidx/compose/ui/unit/Density;

    check-cast p1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/smartengines/app/ui/results/ResultPreviewKt;->$r8$lambda$HAtAIuCPRVN0L5pstaufZ8mMOKo(Ljava/util/Collection;Landroid/util/Size;Lcom/smartengines/app/settings/VisualizationSettings;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
