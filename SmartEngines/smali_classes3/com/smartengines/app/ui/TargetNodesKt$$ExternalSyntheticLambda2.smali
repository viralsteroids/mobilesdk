.class public final synthetic Lcom/smartengines/app/ui/TargetNodesKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/app/targets/TreeItem;

.field public final synthetic f$1:Z

.field public final synthetic f$2:F

.field public final synthetic f$3:I

.field public final synthetic f$4:I


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/app/targets/TreeItem;ZFII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/TargetNodesKt$$ExternalSyntheticLambda2;->f$0:Lcom/smartengines/app/targets/TreeItem;

    iput-boolean p2, p0, Lcom/smartengines/app/ui/TargetNodesKt$$ExternalSyntheticLambda2;->f$1:Z

    iput p3, p0, Lcom/smartengines/app/ui/TargetNodesKt$$ExternalSyntheticLambda2;->f$2:F

    iput p4, p0, Lcom/smartengines/app/ui/TargetNodesKt$$ExternalSyntheticLambda2;->f$3:I

    iput p5, p0, Lcom/smartengines/app/ui/TargetNodesKt$$ExternalSyntheticLambda2;->f$4:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/TargetNodesKt$$ExternalSyntheticLambda2;->f$0:Lcom/smartengines/app/targets/TreeItem;

    iget-boolean v1, p0, Lcom/smartengines/app/ui/TargetNodesKt$$ExternalSyntheticLambda2;->f$1:Z

    iget v2, p0, Lcom/smartengines/app/ui/TargetNodesKt$$ExternalSyntheticLambda2;->f$2:F

    iget v3, p0, Lcom/smartengines/app/ui/TargetNodesKt$$ExternalSyntheticLambda2;->f$3:I

    iget v4, p0, Lcom/smartengines/app/ui/TargetNodesKt$$ExternalSyntheticLambda2;->f$4:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/smartengines/app/ui/TargetNodesKt;->$r8$lambda$ZVKi_tWO7L3uWGq4Top4Frdjdsc(Lcom/smartengines/app/targets/TreeItem;ZFIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
