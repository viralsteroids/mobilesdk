.class public final synthetic Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$TextResultScreen13$1$1$2$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$TextResultScreen13$1$1$2$1$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$TextResultScreen13$1$1$2$1$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$TextResultScreen13$1$1$2$1$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$TextResultScreen13$1$1$2$1$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/runtime/MutableState;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/geometry/Offset;

    move-object v3, p2

    check-cast v3, Landroidx/compose/ui/geometry/Offset;

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result v4

    check-cast p4, Ljava/lang/Float;

    invoke-virtual {p4}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$TextResultScreen13$1$1$2$1;->$r8$lambda$nu5SNHzFO14l9IgIijDXxOAegQA(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/geometry/Offset;FF)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
