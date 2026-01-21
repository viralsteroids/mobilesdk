.class public final synthetic Lcom/smartengines/app/ui/ProcessingScreenResultKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/engine/ImageProcessingState$FINISHED;

.field public final synthetic f$1:Lcom/smartengines/app/targets/TreeLeaf;

.field public final synthetic f$2:Lcom/smartengines/app/settings/CommonSettings;

.field public final synthetic f$3:I

.field public final synthetic f$4:I


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/engine/ImageProcessingState$FINISHED;Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/settings/CommonSettings;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/ProcessingScreenResultKt$$ExternalSyntheticLambda2;->f$0:Lcom/smartengines/engine/ImageProcessingState$FINISHED;

    iput-object p2, p0, Lcom/smartengines/app/ui/ProcessingScreenResultKt$$ExternalSyntheticLambda2;->f$1:Lcom/smartengines/app/targets/TreeLeaf;

    iput-object p3, p0, Lcom/smartengines/app/ui/ProcessingScreenResultKt$$ExternalSyntheticLambda2;->f$2:Lcom/smartengines/app/settings/CommonSettings;

    iput p4, p0, Lcom/smartengines/app/ui/ProcessingScreenResultKt$$ExternalSyntheticLambda2;->f$3:I

    iput p5, p0, Lcom/smartengines/app/ui/ProcessingScreenResultKt$$ExternalSyntheticLambda2;->f$4:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/ProcessingScreenResultKt$$ExternalSyntheticLambda2;->f$0:Lcom/smartengines/engine/ImageProcessingState$FINISHED;

    iget-object v1, p0, Lcom/smartengines/app/ui/ProcessingScreenResultKt$$ExternalSyntheticLambda2;->f$1:Lcom/smartengines/app/targets/TreeLeaf;

    iget-object v2, p0, Lcom/smartengines/app/ui/ProcessingScreenResultKt$$ExternalSyntheticLambda2;->f$2:Lcom/smartengines/app/settings/CommonSettings;

    iget v3, p0, Lcom/smartengines/app/ui/ProcessingScreenResultKt$$ExternalSyntheticLambda2;->f$3:I

    iget v4, p0, Lcom/smartengines/app/ui/ProcessingScreenResultKt$$ExternalSyntheticLambda2;->f$4:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/smartengines/app/ui/ProcessingScreenResultKt;->$r8$lambda$gLY2XgMavJZhwFvu769cYPk43u0(Lcom/smartengines/engine/ImageProcessingState$FINISHED;Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/settings/CommonSettings;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
