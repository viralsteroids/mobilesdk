.class public final synthetic Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/app/ui/results/VModel;


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/app/ui/results/VModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2$$ExternalSyntheticLambda0;->f$0:Lcom/smartengines/app/ui/results/VModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2$$ExternalSyntheticLambda0;->f$0:Lcom/smartengines/app/ui/results/VModel;

    check-cast p1, Landroidx/compose/ui/geometry/Offset;

    check-cast p2, Landroidx/compose/ui/geometry/Offset;

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    check-cast p4, Ljava/lang/Float;

    invoke-virtual {p4}, Ljava/lang/Float;->floatValue()F

    move-result p4

    invoke-static {v0, p1, p2, p3, p4}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;->$r8$lambda$_QTevJansGPuhVEhT1UBPoHQiMc(Lcom/smartengines/app/ui/results/VModel;Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/geometry/Offset;FF)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
