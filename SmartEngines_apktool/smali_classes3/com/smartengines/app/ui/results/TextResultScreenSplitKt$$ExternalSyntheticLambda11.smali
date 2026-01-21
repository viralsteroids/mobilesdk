.class public final synthetic Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$$ExternalSyntheticLambda11;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/engine/text/TextResultData;

.field public final synthetic f$1:Landroid/util/Size;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/engine/text/TextResultData;Landroid/util/Size;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$$ExternalSyntheticLambda11;->f$0:Lcom/smartengines/engine/text/TextResultData;

    iput-object p2, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$$ExternalSyntheticLambda11;->f$1:Landroid/util/Size;

    iput-object p3, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$$ExternalSyntheticLambda11;->f$2:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$$ExternalSyntheticLambda11;->f$0:Lcom/smartengines/engine/text/TextResultData;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$$ExternalSyntheticLambda11;->f$1:Landroid/util/Size;

    iget-object v2, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$$ExternalSyntheticLambda11;->f$2:Landroidx/compose/runtime/MutableState;

    check-cast p1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-static {v0, v1, v2, p1}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt;->$r8$lambda$CEubJSTMJ6w7TNbQ-yER5bMF8c0(Lcom/smartengines/engine/text/TextResultData;Landroid/util/Size;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
