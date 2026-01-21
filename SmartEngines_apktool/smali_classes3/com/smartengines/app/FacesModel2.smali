.class public final Lcom/smartengines/app/FacesModel2;
.super Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;
.source "FacesModel2.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFacesModel2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacesModel2.kt\ncom/smartengines/app/FacesModel2\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,79:1\n81#2:80\n107#2,2:81\n81#2:83\n107#2,2:84\n*S KotlinDebug\n*F\n+ 1 FacesModel2.kt\ncom/smartengines/app/FacesModel2\n*L\n29#1:80\n29#1:81,2\n36#1:83\n36#1:84,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0008H\u0002J\u0008\u0010\u001e\u001a\u00020\u001aH\u0002J\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001cJ\u0016\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u0008R;\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00078F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR/\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u000f\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/smartengines/app/FacesModel2;",
        "Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;",
        "photo",
        "Landroid/graphics/Bitmap;",
        "<init>",
        "(Landroid/graphics/Bitmap;)V",
        "<set-?>",
        "",
        "Lcom/smartengines/app/Photo;",
        "slots",
        "getSlots",
        "()Ljava/util/List;",
        "setSlots",
        "(Ljava/util/List;)V",
        "slots$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "Lcom/smartengines/engine/id/FacesResult;",
        "result",
        "getResult",
        "()Lcom/smartengines/engine/id/FacesResult;",
        "setResult",
        "(Lcom/smartengines/engine/id/FacesResult;)V",
        "result$delegate",
        "processingJob",
        "Lkotlinx/coroutines/Job;",
        "setSlot",
        "",
        "index",
        "",
        "value",
        "onSlotsChanged",
        "onClearSlot",
        "slotIndex",
        "onNewImage",
        "app_storeRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private processingJob:Lkotlinx/coroutines/Job;

.field private final result$delegate:Landroidx/compose/runtime/MutableState;

.field private final slots$delegate:Landroidx/compose/runtime/MutableState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 6

    .line 26
    invoke-direct {p0}, Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    .line 31
    new-array v4, v2, [Lcom/smartengines/app/Photo;

    new-instance v5, Lcom/smartengines/app/Photo;

    invoke-direct {v5, p1}, Lcom/smartengines/app/Photo;-><init>(Landroid/graphics/Bitmap;)V

    aput-object v5, v4, v1

    aput-object v3, v4, v0

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    if-nez v4, :cond_1

    .line 32
    :cond_0
    new-array v4, v2, [Ljava/lang/Void;

    aput-object v3, v4, v1

    aput-object v3, v4, v0

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 29
    :cond_1
    invoke-static {v4, v3, v2, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    iput-object v0, p0, Lcom/smartengines/app/FacesModel2;->slots$delegate:Landroidx/compose/runtime/MutableState;

    .line 36
    invoke-static {v3, v3, v2, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    iput-object v0, p0, Lcom/smartengines/app/FacesModel2;->result$delegate:Landroidx/compose/runtime/MutableState;

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "init photo: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "myapp.FacesModel2"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    sget-object p1, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p1}, Lcom/smartengines/app/Model;->switchToFrontCamera()V

    return-void
.end method

.method public static final synthetic access$setProcessingJob$p(Lcom/smartengines/app/FacesModel2;Lkotlinx/coroutines/Job;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/smartengines/app/FacesModel2;->processingJob:Lkotlinx/coroutines/Job;

    return-void
.end method

.method private final onSlotsChanged()V
    .locals 10

    .line 53
    iget-object v0, p0, Lcom/smartengines/app/FacesModel2;->processingJob:Lkotlinx/coroutines/Job;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 54
    :cond_0
    iput-object v2, p0, Lcom/smartengines/app/FacesModel2;->processingJob:Lkotlinx/coroutines/Job;

    .line 57
    invoke-virtual {p0}, Lcom/smartengines/app/FacesModel2;->getSlots()Ljava/util/List;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/app/Photo;

    .line 58
    invoke-virtual {p0}, Lcom/smartengines/app/FacesModel2;->getSlots()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/app/Photo;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    .line 60
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v3

    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v3}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v4

    new-instance v3, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;

    invoke-direct {v3, p0, v0, v1, v2}, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;-><init>(Lcom/smartengines/app/FacesModel2;Lcom/smartengines/app/Photo;Lcom/smartengines/app/Photo;Lkotlin/coroutines/Continuation;)V

    move-object v7, v3

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    iput-object v0, p0, Lcom/smartengines/app/FacesModel2;->processingJob:Lkotlinx/coroutines/Job;

    return-void

    .line 66
    :cond_1
    invoke-virtual {p0, v2}, Lcom/smartengines/app/FacesModel2;->setResult(Lcom/smartengines/engine/id/FacesResult;)V

    return-void
.end method

.method private final setSlot(ILcom/smartengines/app/Photo;)V
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    .line 47
    new-array p1, v0, [Lcom/smartengines/app/Photo;

    aput-object p2, p1, v2

    invoke-virtual {p0}, Lcom/smartengines/app/FacesModel2;->getSlots()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    aput-object p2, p1, v1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    .line 48
    :cond_0
    new-array p1, v0, [Lcom/smartengines/app/Photo;

    invoke-virtual {p0}, Lcom/smartengines/app/FacesModel2;->getSlots()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    aput-object v0, p1, v2

    aput-object p2, p1, v1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 47
    :goto_0
    invoke-virtual {p0, p1}, Lcom/smartengines/app/FacesModel2;->setSlots(Ljava/util/List;)V

    .line 49
    invoke-direct {p0}, Lcom/smartengines/app/FacesModel2;->onSlotsChanged()V

    return-void
.end method


# virtual methods
.method public final getResult()Lcom/smartengines/engine/id/FacesResult;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/smartengines/app/FacesModel2;->result$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 83
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/engine/id/FacesResult;

    return-object v0
.end method

.method public final getSlots()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/app/Photo;",
            ">;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/smartengines/app/FacesModel2;->slots$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 80
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final onClearSlot(I)V
    .locals 1

    const/4 v0, 0x0

    .line 73
    invoke-direct {p0, p1, v0}, Lcom/smartengines/app/FacesModel2;->setSlot(ILcom/smartengines/app/Photo;)V

    return-void
.end method

.method public final onNewImage(ILcom/smartengines/app/Photo;)V
    .locals 1

    const-string v0, "photo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-direct {p0, p1, p2}, Lcom/smartengines/app/FacesModel2;->setSlot(ILcom/smartengines/app/Photo;)V

    return-void
.end method

.method public final setResult(Lcom/smartengines/engine/id/FacesResult;)V
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/smartengines/app/FacesModel2;->result$delegate:Landroidx/compose/runtime/MutableState;

    .line 84
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setSlots(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/smartengines/app/Photo;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, Lcom/smartengines/app/FacesModel2;->slots$delegate:Landroidx/compose/runtime/MutableState;

    .line 81
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method
