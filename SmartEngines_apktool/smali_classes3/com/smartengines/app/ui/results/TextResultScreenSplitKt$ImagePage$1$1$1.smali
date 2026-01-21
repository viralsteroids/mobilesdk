.class final Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "TextResultScreenSplit.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/ui/input/pointer/PointerInputScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/ui/input/pointer/PointerInputScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.smartengines.app.ui.results.TextResultScreenSplitKt$ImagePage$1$1$1"
    f = "TextResultScreenSplit.kt"
    i = {}
    l = {
        0xef
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $this_with:Lcom/smartengines/app/ui/results/VModel;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public static synthetic $r8$lambda$2Nk2za_2E9Vg18P_GWA2kKb23IU(Lcom/smartengines/app/ui/results/VModel;Landroidx/compose/ui/geometry/Offset;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;->invokeSuspend$lambda$1(Lcom/smartengines/app/ui/results/VModel;Landroidx/compose/ui/geometry/Offset;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/smartengines/app/ui/results/VModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/app/ui/results/VModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;->$this_with:Lcom/smartengines/app/ui/results/VModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$1(Lcom/smartengines/app/ui/results/VModel;Landroidx/compose/ui/geometry/Offset;)Lkotlin/Unit;
    .locals 4

    .line 240
    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->getResultData()Lcom/smartengines/engine/text/TextResultData;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->getImageScale()F

    move-result v3

    invoke-static {v1, v2, v3}, Landroidx/compose/ui/geometry/Offset;->div-tuRUvjQ(JF)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt;->findChunkIndexByCoordinates-Uv8p0NA(Lcom/smartengines/engine/text/TextResultData;J)Ljava/lang/Integer;

    move-result-object v0

    .line 241
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " ----> offset:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->getOffset-F1C5BW0()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->toString-impl(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  scale:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->getScale()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  fieldSize:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->getFieldSize-NH-jbRc()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Size;->toString-impl(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "myapp.TextResultScr"

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 242
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, " ----> tapOffset:"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, "  chunkIndex:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_0

    .line 243
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 244
    invoke-virtual {p0, p1}, Lcom/smartengines/app/ui/results/VModel;->onChunkSelected(I)V

    .line 246
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;->$this_with:Lcom/smartengines/app/ui/results/VModel;

    invoke-direct {v0, v1, p2}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;-><init>(Lcom/smartengines/app/ui/results/VModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;->invoke(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 238
    iget v1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;->L$0:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 239
    iget-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;->$this_with:Lcom/smartengines/app/ui/results/VModel;

    new-instance v7, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v7, p1}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1$$ExternalSyntheticLambda0;-><init>(Lcom/smartengines/app/ui/results/VModel;)V

    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$1;->label:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x7

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->detectTapGestures$default(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 247
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
