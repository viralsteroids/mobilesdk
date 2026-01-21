.class public final Lcom/smartengines/visualization/Visualization$Timer;
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
    name = "Timer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/visualization/Visualization$Timer$Data;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/smartengines/visualization/Visualization$Timer;",
        "Lcom/smartengines/visualization/Visualization;",
        "<init>",
        "()V",
        "dataFlow",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/smartengines/visualization/Visualization$Timer$Data;",
        "getDataFlow",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
        "start",
        "",
        "length",
        "",
        "Data",
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
            "Lcom/smartengines/visualization/Visualization$Timer$Data;",
            ">;"
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

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    new-instance v0, Lcom/smartengines/visualization/Visualization$Timer$Data;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, Lcom/smartengines/visualization/Visualization$Timer$Data;-><init>(JJ)V

    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/smartengines/visualization/Visualization$Timer;->dataFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-void
.end method


# virtual methods
.method public final getDataFlow()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/smartengines/visualization/Visualization$Timer$Data;",
            ">;"
        }
    .end annotation

    .line 89
    iget-object v0, p0, Lcom/smartengines/visualization/Visualization$Timer;->dataFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public final start(J)V
    .locals 4

    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 93
    iget-object v2, p0, Lcom/smartengines/visualization/Visualization$Timer;->dataFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    new-instance v3, Lcom/smartengines/visualization/Visualization$Timer$Data;

    add-long/2addr p1, v0

    invoke-direct {v3, v0, v1, p1, p2}, Lcom/smartengines/visualization/Visualization$Timer$Data;-><init>(JJ)V

    invoke-interface {v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method
