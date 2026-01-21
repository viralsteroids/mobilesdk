.class public final Lcom/smartengines/visualization/Visualization$Quads;
.super Ljava/lang/Object;
.source "Visualization.kt"

# interfaces
.implements Lcom/smartengines/visualization/Visualization;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/visualization/Visualization;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Quads"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVisualization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Visualization.kt\ncom/smartengines/visualization/Visualization$Quads\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,101:1\n230#2,5:102\n*S KotlinDebug\n*F\n+ 1 Visualization.kt\ncom/smartengines/visualization/Visualization$Quads\n*L\n28#1:102,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0014\u0010\u0011\u001a\u00020\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014R\u001a\u0010\u0007\u001a\u00020\u0008X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/smartengines/visualization/Visualization$Quads;",
        "Lcom/smartengines/visualization/Visualization;",
        "initialValue",
        "",
        "Lcom/smartengines/visualization/QuadFrame;",
        "<init>",
        "(Ljava/util/List;)V",
        "frameSize",
        "Landroid/util/Size;",
        "getFrameSize",
        "()Landroid/util/Size;",
        "setFrameSize",
        "(Landroid/util/Size;)V",
        "dataFlow",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "getDataFlow",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
        "append",
        "",
        "quads",
        "",
        "Lcom/smartengines/visualization/Quad;",
        "visualization_release"
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
.field private final dataFlow:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;>;"
        }
    .end annotation
.end field

.field public frameSize:Landroid/util/Size;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/smartengines/visualization/Visualization$Quads;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;)V"
        }
    .end annotation

    const-string v0, "initialValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/visualization/Visualization$Quads;->dataFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 20
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/smartengines/visualization/Visualization$Quads;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final append(Ljava/util/Set;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/smartengines/visualization/Quad;",
            ">;)V"
        }
    .end annotation

    const-string v0, "quads"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    iget-object v0, p0, Lcom/smartengines/visualization/Visualization$Quads;->dataFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 103
    :goto_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 104
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    .line 28
    check-cast v2, Ljava/util/Collection;

    new-instance v3, Lcom/smartengines/visualization/QuadFrame;

    invoke-virtual {p0}, Lcom/smartengines/visualization/Visualization$Quads;->getFrameSize()Landroid/util/Size;

    move-result-object v5

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-wide/16 v6, 0x0

    move-object v4, p1

    invoke-direct/range {v3 .. v9}, Lcom/smartengines/visualization/QuadFrame;-><init>(Ljava/util/Set;Landroid/util/Size;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 105
    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    move-object p1, v4

    goto :goto_0
.end method

.method public final getDataFlow()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;>;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/smartengines/visualization/Visualization$Quads;->dataFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public final getFrameSize()Landroid/util/Size;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/smartengines/visualization/Visualization$Quads;->frameSize:Landroid/util/Size;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "frameSize"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final setFrameSize(Landroid/util/Size;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    iput-object p1, p0, Lcom/smartengines/visualization/Visualization$Quads;->frameSize:Landroid/util/Size;

    return-void
.end method
