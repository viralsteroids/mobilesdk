.class public final synthetic Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/engine/text/TextResultData;

.field public final synthetic f$1:Lkotlin/jvm/internal/Ref$FloatRef;

.field public final synthetic f$2:Landroid/util/Size;

.field public final synthetic f$3:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/engine/text/TextResultData;Lkotlin/jvm/internal/Ref$FloatRef;Landroid/util/Size;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda0;->f$0:Lcom/smartengines/engine/text/TextResultData;

    iput-object p2, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda0;->f$1:Lkotlin/jvm/internal/Ref$FloatRef;

    iput-object p3, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda0;->f$2:Landroid/util/Size;

    iput-object p4, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda0;->f$3:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda0;->f$0:Lcom/smartengines/engine/text/TextResultData;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda0;->f$1:Lkotlin/jvm/internal/Ref$FloatRef;

    iget-object v2, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda0;->f$2:Landroid/util/Size;

    iget-object v3, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda0;->f$3:Landroidx/compose/runtime/MutableState;

    check-cast p1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt;->$r8$lambda$7rb0wj2NiGMf2rcRrs_jedAy81c(Lcom/smartengines/engine/text/TextResultData;Lkotlin/jvm/internal/Ref$FloatRef;Landroid/util/Size;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
