.class final Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextResultScreenSplit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextResultScreenSplit.kt\ncom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,400:1\n1#2:401\n*E\n"
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
    c = "com.smartengines.app.ui.results.TextResultScreenSplitKt$ImagePage$1$1$2"
    f = "TextResultScreenSplit.kt"
    i = {}
    l = {
        0xf9
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
.method public static synthetic $r8$lambda$_QTevJansGPuhVEhT1UBPoHQiMc(Lcom/smartengines/app/ui/results/VModel;Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/geometry/Offset;FF)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;->invokeSuspend$lambda$3(Lcom/smartengines/app/ui/results/VModel;Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/geometry/Offset;FF)Lkotlin/Unit;

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
            "Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;->$this_with:Lcom/smartengines/app/ui/results/VModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$3(Lcom/smartengines/app/ui/results/VModel;Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/geometry/Offset;FF)Lkotlin/Unit;
    .locals 5

    .line 251
    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->getScale()F

    move-result p4

    .line 255
    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->getScale()F

    move-result v0

    mul-float/2addr v0, p3

    const/high16 p3, 0x40a00000    # 5.0f

    invoke-static {p3, v0}, Ljava/lang/Math;->min(FF)F

    move-result p3

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p3}, Ljava/lang/Math;->max(FF)F

    move-result p3

    .line 252
    invoke-virtual {p0, p3}, Lcom/smartengines/app/ui/results/VModel;->setScale(F)V

    .line 258
    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->getScale()F

    move-result p3

    sub-float/2addr p3, p4

    .line 260
    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->getOffset-F1C5BW0()J

    move-result-wide v1

    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v3

    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->getScale()F

    move-result p2

    invoke-static {v3, v4, p2}, Landroidx/compose/ui/geometry/Offset;->times-tuRUvjQ(JF)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    move-result-wide v1

    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide p1

    invoke-static {p1, p2, p3}, Landroidx/compose/ui/geometry/Offset;->times-tuRUvjQ(JF)J

    move-result-wide p1

    invoke-static {v1, v2, p1, p2}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    move-result-wide p1

    .line 262
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result p3

    const/4 p4, 0x0

    invoke-static {p3, p4}, Ljava/lang/Math;->min(FF)F

    move-result p3

    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->getFieldSize-NH-jbRc()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v1

    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->getScale()F

    move-result v2

    sub-float v2, v0, v2

    mul-float/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->max(FF)F

    move-result p3

    .line 263
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result p1

    invoke-static {p1, p4}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->getFieldSize-NH-jbRc()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result p2

    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->getScale()F

    move-result p4

    sub-float/2addr v0, p4

    mul-float/2addr p2, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    .line 261
    invoke-static {p3, p1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide p1

    .line 260
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/results/VModel;->setOffset-k-4lQ0M(J)V

    .line 267
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

    new-instance v0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;->$this_with:Lcom/smartengines/app/ui/results/VModel;

    invoke-direct {v0, v1, p2}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;-><init>(Lcom/smartengines/app/ui/results/VModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;->L$0:Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/input/pointer/PointerInputScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;->invoke(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 248
    iget v1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;->label:I

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

    iget-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;->L$0:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 249
    iget-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;->$this_with:Lcom/smartengines/app/ui/results/VModel;

    new-instance v5, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2$$ExternalSyntheticLambda0;

    invoke-direct {v5, p1}, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2$$ExternalSyntheticLambda0;-><init>(Lcom/smartengines/app/ui/results/VModel;)V

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/smartengines/app/ui/results/TextResultScreenSplitKt$ImagePage$1$1$2;->label:I

    const/4 v4, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/gestures/TransformGestureDetectorKt;->detectTransformGestures$default(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 268
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
