.class final Lcom/smartengines/app/ui/results/VModel;
.super Ljava/lang/Object;
.source "TextResultScreenSplit.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextResultScreenSplit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextResultScreenSplit.kt\ncom/smartengines/app/ui/results/VModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,400:1\n81#2:401\n107#2,2:402\n81#2:404\n81#2:405\n107#2,2:406\n81#2:408\n107#2,2:409\n*S KotlinDebug\n*F\n+ 1 TextResultScreenSplit.kt\ncom/smartengines/app/ui/results/VModel\n*L\n75#1:401\n75#1:402,2\n79#1:404\n82#1:405\n82#1:406,2\n83#1:408\n83#1:409,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000e\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0017\u001a\u0004\u0008\u001f\u0010 R+\u0010#\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\"8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008(\u0010\u0017\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R+\u0010*\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020)8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008/\u0010\u0017\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R\u001c\u00100\u001a\u000201X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\u00082\u0010,\"\u0004\u00083\u0010.R\u0011\u00105\u001a\u000206\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00108R\u001a\u00109\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008:\u0010%\"\u0004\u0008;\u0010\'\u00a8\u0006?"
    }
    d2 = {
        "Lcom/smartengines/app/ui/results/VModel;",
        "",
        "resultData",
        "Lcom/smartengines/engine/text/TextResultData;",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "<init>",
        "(Lcom/smartengines/engine/text/TextResultData;Landroid/graphics/Bitmap;Lkotlinx/coroutines/CoroutineScope;)V",
        "getResultData",
        "()Lcom/smartengines/engine/text/TextResultData;",
        "getBitmap",
        "()Landroid/graphics/Bitmap;",
        "getCoroutineScope",
        "()Lkotlinx/coroutines/CoroutineScope;",
        "<set-?>",
        "",
        "isDataPage",
        "()Z",
        "setDataPage",
        "(Z)V",
        "isDataPage$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "selectedChunkIndex",
        "Landroidx/compose/runtime/MutableState;",
        "",
        "getSelectedChunkIndex",
        "()Landroidx/compose/runtime/MutableState;",
        "dataListState",
        "Landroidx/compose/foundation/lazy/LazyListState;",
        "getDataListState",
        "()Landroidx/compose/foundation/lazy/LazyListState;",
        "dataListState$delegate",
        "",
        "scale",
        "getScale",
        "()F",
        "setScale",
        "(F)V",
        "scale$delegate",
        "Landroidx/compose/ui/geometry/Offset;",
        "offset",
        "getOffset-F1C5BW0",
        "()J",
        "setOffset-k-4lQ0M",
        "(J)V",
        "offset$delegate",
        "fieldSize",
        "Landroidx/compose/ui/geometry/Size;",
        "getFieldSize-NH-jbRc",
        "setFieldSize-uvyYCjk",
        "J",
        "imageSize",
        "Landroid/util/Size;",
        "getImageSize",
        "()Landroid/util/Size;",
        "imageScale",
        "getImageScale",
        "setImageScale",
        "onChunkSelected",
        "",
        "index",
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


# instance fields
.field private final bitmap:Landroid/graphics/Bitmap;

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private final dataListState$delegate:Landroidx/compose/runtime/MutableState;

.field private fieldSize:J

.field private imageScale:F

.field private final imageSize:Landroid/util/Size;

.field private final isDataPage$delegate:Landroidx/compose/runtime/MutableState;

.field private final offset$delegate:Landroidx/compose/runtime/MutableState;

.field private final resultData:Lcom/smartengines/engine/text/TextResultData;

.field private final scale$delegate:Landroidx/compose/runtime/MutableState;

.field private final selectedChunkIndex:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/smartengines/engine/text/TextResultData;Landroid/graphics/Bitmap;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 3

    const-string v0, "resultData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Lcom/smartengines/app/ui/results/VModel;->resultData:Lcom/smartengines/engine/text/TextResultData;

    .line 71
    iput-object p2, p0, Lcom/smartengines/app/ui/results/VModel;->bitmap:Landroid/graphics/Bitmap;

    .line 72
    iput-object p3, p0, Lcom/smartengines/app/ui/results/VModel;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    const/4 p1, 0x1

    .line 75
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 p3, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p3, v0, p3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/app/ui/results/VModel;->isDataPage$delegate:Landroidx/compose/runtime/MutableState;

    .line 76
    invoke-static {p3, p3, v0, p3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/app/ui/results/VModel;->selectedChunkIndex:Landroidx/compose/runtime/MutableState;

    .line 79
    new-instance p1, Landroidx/compose/foundation/lazy/LazyListState;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {p1, v1, v1, v2, p3}, Landroidx/compose/foundation/lazy/LazyListState;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, p3, v0, p3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/app/ui/results/VModel;->dataListState$delegate:Landroidx/compose/runtime/MutableState;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 82
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v1, p3, v0, p3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    iput-object v1, p0, Lcom/smartengines/app/ui/results/VModel;->scale$delegate:Landroidx/compose/runtime/MutableState;

    .line 83
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v1

    invoke-static {v1, p3, v0, p3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p3

    iput-object p3, p0, Lcom/smartengines/app/ui/results/VModel;->offset$delegate:Landroidx/compose/runtime/MutableState;

    const/high16 p3, 0x447a0000    # 1000.0f

    .line 84
    invoke-static {p3, p3}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/smartengines/app/ui/results/VModel;->fieldSize:J

    .line 85
    new-instance p3, Landroid/util/Size;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    invoke-direct {p3, v0, p2}, Landroid/util/Size;-><init>(II)V

    iput-object p3, p0, Lcom/smartengines/app/ui/results/VModel;->imageSize:Landroid/util/Size;

    .line 86
    iput p1, p0, Lcom/smartengines/app/ui/results/VModel;->imageScale:F

    return-void
.end method


# virtual methods
.method public final getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/smartengines/app/ui/results/VModel;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/smartengines/app/ui/results/VModel;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final getDataListState()Landroidx/compose/foundation/lazy/LazyListState;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/smartengines/app/ui/results/VModel;->dataListState$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 404
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/LazyListState;

    return-object v0
.end method

.method public final getFieldSize-NH-jbRc()J
    .locals 2

    .line 84
    iget-wide v0, p0, Lcom/smartengines/app/ui/results/VModel;->fieldSize:J

    return-wide v0
.end method

.method public final getImageScale()F
    .locals 1

    .line 86
    iget v0, p0, Lcom/smartengines/app/ui/results/VModel;->imageScale:F

    return v0
.end method

.method public final getImageSize()Landroid/util/Size;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/smartengines/app/ui/results/VModel;->imageSize:Landroid/util/Size;

    return-object v0
.end method

.method public final getOffset-F1C5BW0()J
    .locals 2

    .line 83
    iget-object v0, p0, Lcom/smartengines/app/ui/results/VModel;->offset$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 408
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/geometry/Offset;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getResultData()Lcom/smartengines/engine/text/TextResultData;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/smartengines/app/ui/results/VModel;->resultData:Lcom/smartengines/engine/text/TextResultData;

    return-object v0
.end method

.method public final getScale()F
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/smartengines/app/ui/results/VModel;->scale$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 405
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final getSelectedChunkIndex()Landroidx/compose/runtime/MutableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/smartengines/app/ui/results/VModel;->selectedChunkIndex:Landroidx/compose/runtime/MutableState;

    return-object v0
.end method

.method public final isDataPage()Z
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/smartengines/app/ui/results/VModel;->isDataPage$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 401
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final onChunkSelected(I)V
    .locals 7

    .line 91
    iget-object v0, p0, Lcom/smartengines/app/ui/results/VModel;->selectedChunkIndex:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 93
    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->isDataPage()Z

    move-result v0

    if-nez v0, :cond_0

    .line 97
    iget-object v1, p0, Lcom/smartengines/app/ui/results/VModel;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/smartengines/app/ui/results/VModel$onChunkSelected$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/smartengines/app/ui/results/VModel$onChunkSelected$1;-><init>(Lcom/smartengines/app/ui/results/VModel;ILkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 102
    :cond_0
    invoke-virtual {p0}, Lcom/smartengines/app/ui/results/VModel;->isDataPage()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/smartengines/app/ui/results/VModel;->setDataPage(Z)V

    return-void
.end method

.method public final setDataPage(Z)V
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/smartengines/app/ui/results/VModel;->isDataPage$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 402
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setFieldSize-uvyYCjk(J)V
    .locals 0

    .line 84
    iput-wide p1, p0, Lcom/smartengines/app/ui/results/VModel;->fieldSize:J

    return-void
.end method

.method public final setImageScale(F)V
    .locals 0

    .line 86
    iput p1, p0, Lcom/smartengines/app/ui/results/VModel;->imageScale:F

    return-void
.end method

.method public final setOffset-k-4lQ0M(J)V
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/smartengines/app/ui/results/VModel;->offset$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object p1

    .line 409
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setScale(F)V
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/smartengines/app/ui/results/VModel;->scale$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    .line 406
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method
