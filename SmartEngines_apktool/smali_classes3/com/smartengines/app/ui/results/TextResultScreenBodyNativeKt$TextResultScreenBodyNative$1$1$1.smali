.class final Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "TextResultScreenBodyNative.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt;->TextResultScreenBodyNative(Lcom/smartengines/engine/text/TextResultData;Landroid/graphics/Bitmap;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.smartengines.app.ui.results.TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1"
    f = "TextResultScreenBodyNative.kt"
    i = {}
    l = {
        0x52
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic $dataChunkPositions:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $imageScale:Lkotlin/jvm/internal/Ref$FloatRef;

.field final synthetic $resultData:Lcom/smartengines/engine/text/TextResultData;

.field final synthetic $scrollState:Landroidx/compose/foundation/ScrollState;

.field final synthetic $selectedChunk:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/smartengines/engine/text/TextResultChunk;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public static synthetic $r8$lambda$bZ917zEUhlDsik4Z_4RyJDijAds(Lcom/smartengines/engine/text/TextResultData;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/MutableState;Ljava/util/HashMap;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/geometry/Offset;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->invokeSuspend$lambda$2(Lcom/smartengines/engine/text/TextResultData;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/MutableState;Ljava/util/HashMap;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/geometry/Offset;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/smartengines/engine/text/TextResultData;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/MutableState;Ljava/util/HashMap;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/engine/text/TextResultData;",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "Landroidx/compose/foundation/ScrollState;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/smartengines/engine/text/TextResultChunk;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$resultData:Lcom/smartengines/engine/text/TextResultData;

    iput-object p2, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$imageScale:Lkotlin/jvm/internal/Ref$FloatRef;

    iput-object p3, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$scrollState:Landroidx/compose/foundation/ScrollState;

    iput-object p4, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$selectedChunk:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$dataChunkPositions:Ljava/util/HashMap;

    iput-object p6, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$2(Lcom/smartengines/engine/text/TextResultData;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/MutableState;Ljava/util/HashMap;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/geometry/Offset;)Lkotlin/Unit;
    .locals 6

    .line 83
    invoke-virtual {p6}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v0

    iget p1, p1, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    invoke-static {v0, v1, p1}, Landroidx/compose/ui/geometry/Offset;->div-tuRUvjQ(JF)J

    move-result-wide v0

    invoke-static {p0, v0, v1}, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt;->findChunkIndexByCoordinates-Uv8p0NA(Lcom/smartengines/engine/text/TextResultData;J)Ljava/lang/Integer;

    move-result-object p1

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " ----> "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p6

    const-string v0, " of "

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p6

    invoke-virtual {p2}, Landroidx/compose/foundation/ScrollState;->getViewportSize()I

    move-result v0

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p6

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    const-string v0, "myapp.TextResultScr"

    invoke-static {v0, p6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    .line 88
    move-object p6, p1

    check-cast p6, Ljava/lang/Number;

    invoke-virtual {p6}, Ljava/lang/Number;->intValue()I

    .line 89
    invoke-virtual {p0}, Lcom/smartengines/engine/text/TextResultData;->getChunks()Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p6

    invoke-interface {p0, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/smartengines/engine/text/TextResultChunk;

    .line 90
    invoke-interface {p3, p0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 91
    invoke-virtual {p4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    if-eqz p0, :cond_0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    .line 92
    new-instance p1, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1$1$1$1$1;

    const/4 p3, 0x0

    invoke-direct {p1, p2, p0, p3}, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1$1$1$1$1;-><init>(Landroidx/compose/foundation/ScrollState;FLkotlin/coroutines/Continuation;)V

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p5

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 99
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$resultData:Lcom/smartengines/engine/text/TextResultData;

    iget-object v2, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$imageScale:Lkotlin/jvm/internal/Ref$FloatRef;

    iget-object v3, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$scrollState:Landroidx/compose/foundation/ScrollState;

    iget-object v4, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$selectedChunk:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$dataChunkPositions:Ljava/util/HashMap;

    iget-object v6, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;-><init>(Lcom/smartengines/engine/text/TextResultData;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/MutableState;Ljava/util/HashMap;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->L$0:Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->invoke(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 81
    iget v1, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->label:I

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

    iget-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->L$0:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 82
    iget-object v5, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$resultData:Lcom/smartengines/engine/text/TextResultData;

    iget-object v6, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$imageScale:Lkotlin/jvm/internal/Ref$FloatRef;

    iget-object v7, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$scrollState:Landroidx/compose/foundation/ScrollState;

    iget-object v8, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$selectedChunk:Landroidx/compose/runtime/MutableState;

    iget-object v9, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$dataChunkPositions:Ljava/util/HashMap;

    iget-object v10, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->$coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v4, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1$$ExternalSyntheticLambda0;

    invoke-direct/range {v4 .. v10}, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1$$ExternalSyntheticLambda0;-><init>(Lcom/smartengines/engine/text/TextResultData;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/MutableState;Ljava/util/HashMap;Lkotlinx/coroutines/CoroutineScope;)V

    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;->label:I

    move-object v7, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x7

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->detectTapGestures$default(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 100
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
