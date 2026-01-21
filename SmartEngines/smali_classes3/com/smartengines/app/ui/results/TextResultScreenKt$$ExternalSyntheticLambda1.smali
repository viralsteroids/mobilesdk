.class public final synthetic Lcom/smartengines/app/ui/results/TextResultScreenKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/app/targets/TreeLeaf;

.field public final synthetic f$1:Lcom/smartengines/engine/text/TextResultData;

.field public final synthetic f$2:Landroid/graphics/Bitmap;

.field public final synthetic f$3:Lcom/smartengines/app/settings/CommonSettings;

.field public final synthetic f$4:I

.field public final synthetic f$5:I


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/text/TextResultData;Landroid/graphics/Bitmap;Lcom/smartengines/app/settings/CommonSettings;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenKt$$ExternalSyntheticLambda1;->f$0:Lcom/smartengines/app/targets/TreeLeaf;

    iput-object p2, p0, Lcom/smartengines/app/ui/results/TextResultScreenKt$$ExternalSyntheticLambda1;->f$1:Lcom/smartengines/engine/text/TextResultData;

    iput-object p3, p0, Lcom/smartengines/app/ui/results/TextResultScreenKt$$ExternalSyntheticLambda1;->f$2:Landroid/graphics/Bitmap;

    iput-object p4, p0, Lcom/smartengines/app/ui/results/TextResultScreenKt$$ExternalSyntheticLambda1;->f$3:Lcom/smartengines/app/settings/CommonSettings;

    iput p5, p0, Lcom/smartengines/app/ui/results/TextResultScreenKt$$ExternalSyntheticLambda1;->f$4:I

    iput p6, p0, Lcom/smartengines/app/ui/results/TextResultScreenKt$$ExternalSyntheticLambda1;->f$5:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/results/TextResultScreenKt$$ExternalSyntheticLambda1;->f$0:Lcom/smartengines/app/targets/TreeLeaf;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/TextResultScreenKt$$ExternalSyntheticLambda1;->f$1:Lcom/smartengines/engine/text/TextResultData;

    iget-object v2, p0, Lcom/smartengines/app/ui/results/TextResultScreenKt$$ExternalSyntheticLambda1;->f$2:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/smartengines/app/ui/results/TextResultScreenKt$$ExternalSyntheticLambda1;->f$3:Lcom/smartengines/app/settings/CommonSettings;

    iget v4, p0, Lcom/smartengines/app/ui/results/TextResultScreenKt$$ExternalSyntheticLambda1;->f$4:I

    iget v5, p0, Lcom/smartengines/app/ui/results/TextResultScreenKt$$ExternalSyntheticLambda1;->f$5:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/smartengines/app/ui/results/TextResultScreenKt;->$r8$lambda$wMfC4NjroHVciaTXFD87zPDsquU(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/text/TextResultData;Landroid/graphics/Bitmap;Lcom/smartengines/app/settings/CommonSettings;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
