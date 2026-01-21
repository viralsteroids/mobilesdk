.class public final synthetic Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/app/ui/results/VModel;

.field public final synthetic f$1:Lcom/smartengines/app/ui/results/VModel;


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/app/ui/results/VModel;Lcom/smartengines/app/ui/results/VModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$$ExternalSyntheticLambda0;->f$0:Lcom/smartengines/app/ui/results/VModel;

    iput-object p2, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$$ExternalSyntheticLambda0;->f$1:Lcom/smartengines/app/ui/results/VModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$$ExternalSyntheticLambda0;->f$0:Lcom/smartengines/app/ui/results/VModel;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$$ExternalSyntheticLambda0;->f$1:Lcom/smartengines/app/ui/results/VModel;

    check-cast p1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-static {v0, v1, p1}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1;->$r8$lambda$p109T1Xfq2aipv-MtELOca5dIAs(Lcom/smartengines/app/ui/results/VModel;Lcom/smartengines/app/ui/results/VModel;Landroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
