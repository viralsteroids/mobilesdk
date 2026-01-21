.class public final synthetic Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:I

.field public final synthetic f$1:Ljava/util/List;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function4;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function4;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function3;

.field public final synthetic f$6:I


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function3;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;->f$0:I

    iput-object p2, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;->f$1:Ljava/util/List;

    iput-object p3, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;->f$2:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;->f$3:Lkotlin/jvm/functions/Function4;

    iput-object p5, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;->f$4:Lkotlin/jvm/functions/Function4;

    iput-object p6, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;->f$5:Lkotlin/jvm/functions/Function3;

    iput p7, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;->f$6:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget v0, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;->f$0:I

    iget-object v1, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;->f$1:Ljava/util/List;

    iget-object v2, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;->f$2:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;->f$3:Lkotlin/jvm/functions/Function4;

    iget-object v4, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;->f$4:Lkotlin/jvm/functions/Function4;

    iget-object v5, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;->f$5:Lkotlin/jvm/functions/Function3;

    iget v6, p0, Lcom/smartengines/tree/ui/ThreeLevelsKt$$ExternalSyntheticLambda2;->f$6:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/smartengines/tree/ui/ThreeLevelsKt;->$r8$lambda$ckCIkZicsAv_VbjI2MdYDu_8BSY(ILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
