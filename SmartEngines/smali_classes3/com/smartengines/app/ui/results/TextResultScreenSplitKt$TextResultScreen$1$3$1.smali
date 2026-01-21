.class final Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$TextResultScreen$1$3$1;
.super Ljava/lang/Object;
.source "TextResultScreenSplit.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/results/TextResultScreenSplitKt;->TextResultScreen(Lcom/smartengines/engine/text/TextResultData;Landroid/graphics/Bitmap;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function4<",
        "Landroidx/compose/animation/AnimatedContentScope;",
        "Ljava/lang/Boolean;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $model:Lcom/smartengines/app/ui/results/VModel;


# direct methods
.method constructor <init>(Lcom/smartengines/app/ui/results/VModel;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$TextResultScreen$1$3$1;->$model:Lcom/smartengines/app/ui/results/VModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 132
    check-cast p1, Landroidx/compose/animation/AnimatedContentScope;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$TextResultScreen$1$3$1;->invoke(Landroidx/compose/animation/AnimatedContentScope;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/AnimatedContentScope;ZLandroidx/compose/runtime/Composer;I)V
    .locals 0

    const-string p4, "$this$AnimatedContent"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C:TextResultScreenSplit.kt#4ipo3i"

    invoke-static {p3, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const/16 p1, 0x8

    if-eqz p2, :cond_0

    const p2, 0x28d8f60b

    .line 133
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p2, "134@5031L15"

    invoke-static {p3, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 135
    iget-object p2, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$TextResultScreen$1$3$1;->$model:Lcom/smartengines/app/ui/results/VModel;

    invoke-static {p2, p3, p1}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt;->access$DataPage(Lcom/smartengines/app/ui/results/VModel;Landroidx/compose/runtime/Composer;I)V

    .line 133
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-void

    :cond_0
    const p2, 0x28da6289

    .line 136
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p2, "137@5126L16"

    invoke-static {p3, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 138
    iget-object p2, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$TextResultScreen$1$3$1;->$model:Lcom/smartengines/app/ui/results/VModel;

    invoke-static {p2, p3, p1}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt;->access$ImagePage(Lcom/smartengines/app/ui/results/VModel;Landroidx/compose/runtime/Composer;I)V

    .line 136
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-void
.end method
