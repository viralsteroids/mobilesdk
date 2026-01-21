.class public final Lcom/smartengines/visualization/Visualization$Steps;
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
    name = "Steps"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/visualization/Visualization$Steps$StepState;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVisualization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Visualization.kt\ncom/smartengines/visualization/Visualization$Steps\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,101:1\n1682#2,6:102\n*S KotlinDebug\n*F\n+ 1 Visualization.kt\ncom/smartengines/visualization/Visualization$Steps\n*L\n69#1:102,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\rX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000e\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/smartengines/visualization/Visualization$Steps;",
        "Lcom/smartengines/visualization/Visualization;",
        "stepsCount",
        "",
        "<init>",
        "(I)V",
        "dataFlow",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "Lcom/smartengines/visualization/Visualization$Steps$StepState;",
        "getDataFlow",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
        "data",
        "",
        "[Lcom/smartengines/visualization/Visualization$Steps$StepState;",
        "reset",
        "",
        "onStepCompleted",
        "stepState",
        "StepState",
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
.field private data:[Lcom/smartengines/visualization/Visualization$Steps$StepState;

.field private final dataFlow:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/Visualization$Steps$StepState;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/smartengines/visualization/Visualization$Steps;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/smartengines/visualization/Visualization$Steps;->dataFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 62
    invoke-virtual {p0, p1}, Lcom/smartengines/visualization/Visualization$Steps;->reset(I)V

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 48
    :cond_0
    invoke-direct {p0, p1}, Lcom/smartengines/visualization/Visualization$Steps;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final getDataFlow()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/Visualization$Steps$StepState;",
            ">;>;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/smartengines/visualization/Visualization$Steps;->dataFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public final onStepCompleted(Lcom/smartengines/visualization/Visualization$Steps$StepState;)V
    .locals 7

    const-string/jumbo v0, "stepState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lcom/smartengines/visualization/Visualization$Steps;->data:[Lcom/smartengines/visualization/Visualization$Steps$StepState;

    const/4 v1, 0x0

    const-string v2, "data"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    .line 102
    :cond_0
    array-length v3, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    .line 103
    aget-object v5, v0, v4

    .line 69
    sget-object v6, Lcom/smartengines/visualization/Visualization$Steps$StepState;->NOT_COMPLETED:Lcom/smartengines/visualization/Visualization$Steps$StepState;

    if-ne v5, v6, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, -0x1

    :goto_1
    if-ltz v4, :cond_5

    .line 71
    iget-object v0, p0, Lcom/smartengines/visualization/Visualization$Steps;->data:[Lcom/smartengines/visualization/Visualization$Steps$StepState;

    if-nez v0, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3
    aput-object p1, v0, v4

    .line 72
    iget-object p1, p0, Lcom/smartengines/visualization/Visualization$Steps;->dataFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v0, p0, Lcom/smartengines/visualization/Visualization$Steps;->data:[Lcom/smartengines/visualization/Visualization$Steps$StepState;

    if-nez v0, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    move-object v1, v0

    :goto_2
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public final reset(I)V
    .locals 3

    .line 58
    new-array v0, p1, [Lcom/smartengines/visualization/Visualization$Steps$StepState;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    sget-object v2, Lcom/smartengines/visualization/Visualization$Steps$StepState;->NOT_COMPLETED:Lcom/smartengines/visualization/Visualization$Steps$StepState;

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lcom/smartengines/visualization/Visualization$Steps;->data:[Lcom/smartengines/visualization/Visualization$Steps$StepState;

    .line 59
    iget-object p1, p0, Lcom/smartengines/visualization/Visualization$Steps;->dataFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method
