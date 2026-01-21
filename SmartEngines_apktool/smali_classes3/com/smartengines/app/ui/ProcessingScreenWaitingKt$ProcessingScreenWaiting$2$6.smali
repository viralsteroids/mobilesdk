.class final Lcom/smartengines/app/ui/ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$6;
.super Ljava/lang/Object;
.source "ProcessingScreenWaiting.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/ProcessingScreenWaitingKt;->ProcessingScreenWaiting(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/PhotoTakingState;Lcom/smartengines/app/CameraButtonsState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/animation/AnimatedVisibilityScope;",
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
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $photoTakingState:Lcom/smartengines/app/PhotoTakingState;


# direct methods
.method constructor <init>(Lcom/smartengines/app/PhotoTakingState;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/app/ui/ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$6;->$photoTakingState:Lcom/smartengines/app/PhotoTakingState;

    iput-object p2, p0, Lcom/smartengines/app/ui/ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$6;->$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 127
    check-cast p1, Landroidx/compose/animation/AnimatedVisibilityScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$6;->invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object v10, p2

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "C130@5146L875,128@5084L937:ProcessingScreenWaiting.kt#83idza"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 130
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 131
    new-instance v1, Lcom/smartengines/app/ui/ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$6$1;

    iget-object v2, p0, Lcom/smartengines/app/ui/ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$6;->$photoTakingState:Lcom/smartengines/app/PhotoTakingState;

    iget-object v4, p0, Lcom/smartengines/app/ui/ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$6;->$context:Landroid/content/Context;

    invoke-direct {v1, v2, v4}, Lcom/smartengines/app/ui/ProcessingScreenWaitingKt$ProcessingScreenWaiting$2$6$1;-><init>(Lcom/smartengines/app/PhotoTakingState;Landroid/content/Context;)V

    const/16 v2, 0x36

    const v4, -0x53f8c842

    invoke-static {v4, v3, v1, p2, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lkotlin/jvm/functions/Function2;

    const v11, 0xc00006

    const/16 v12, 0x7e

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 129
    invoke-static/range {v0 .. v12}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
