.class public final synthetic Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:I

.field public final synthetic f$1:Lcom/smartengines/app/ui/results/VModel;

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(ILcom/smartengines/app/ui/results/VModel;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$$ExternalSyntheticLambda9;->f$0:I

    iput-object p2, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$$ExternalSyntheticLambda9;->f$1:Lcom/smartengines/app/ui/results/VModel;

    iput p3, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$$ExternalSyntheticLambda9;->f$2:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget v0, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$$ExternalSyntheticLambda9;->f$0:I

    iget-object v1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$$ExternalSyntheticLambda9;->f$1:Lcom/smartengines/app/ui/results/VModel;

    iget v2, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$$ExternalSyntheticLambda9;->f$2:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt;->$r8$lambda$I9hEytK2DMFftD-wGffDbJDMO-c(ILcom/smartengines/app/ui/results/VModel;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
