.class public final synthetic Lcom/smartengines/app/ui/results/DocResultScreenKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/app/targets/TreeLeaf;

.field public final synthetic f$1:Lcom/smartengines/engine/doc/DocResultData;

.field public final synthetic f$2:Lcom/smartengines/app/settings/CommonSettings;

.field public final synthetic f$3:Lcom/smartengines/app/settings/DocSettings;

.field public final synthetic f$4:I

.field public final synthetic f$5:I


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/doc/DocResultData;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/DocSettings;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/results/DocResultScreenKt$$ExternalSyntheticLambda1;->f$0:Lcom/smartengines/app/targets/TreeLeaf;

    iput-object p2, p0, Lcom/smartengines/app/ui/results/DocResultScreenKt$$ExternalSyntheticLambda1;->f$1:Lcom/smartengines/engine/doc/DocResultData;

    iput-object p3, p0, Lcom/smartengines/app/ui/results/DocResultScreenKt$$ExternalSyntheticLambda1;->f$2:Lcom/smartengines/app/settings/CommonSettings;

    iput-object p4, p0, Lcom/smartengines/app/ui/results/DocResultScreenKt$$ExternalSyntheticLambda1;->f$3:Lcom/smartengines/app/settings/DocSettings;

    iput p5, p0, Lcom/smartengines/app/ui/results/DocResultScreenKt$$ExternalSyntheticLambda1;->f$4:I

    iput p6, p0, Lcom/smartengines/app/ui/results/DocResultScreenKt$$ExternalSyntheticLambda1;->f$5:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/results/DocResultScreenKt$$ExternalSyntheticLambda1;->f$0:Lcom/smartengines/app/targets/TreeLeaf;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/DocResultScreenKt$$ExternalSyntheticLambda1;->f$1:Lcom/smartengines/engine/doc/DocResultData;

    iget-object v2, p0, Lcom/smartengines/app/ui/results/DocResultScreenKt$$ExternalSyntheticLambda1;->f$2:Lcom/smartengines/app/settings/CommonSettings;

    iget-object v3, p0, Lcom/smartengines/app/ui/results/DocResultScreenKt$$ExternalSyntheticLambda1;->f$3:Lcom/smartengines/app/settings/DocSettings;

    iget v4, p0, Lcom/smartengines/app/ui/results/DocResultScreenKt$$ExternalSyntheticLambda1;->f$4:I

    iget v5, p0, Lcom/smartengines/app/ui/results/DocResultScreenKt$$ExternalSyntheticLambda1;->f$5:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/smartengines/app/ui/results/DocResultScreenKt;->$r8$lambda$F9P8BWVUgBCEFplRIYCjbDlcg9A(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/doc/DocResultData;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/DocSettings;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
