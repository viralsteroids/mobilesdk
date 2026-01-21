.class public final Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;
.super Ljava/lang/Object;
.source "WindowAdaptiveInfo.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\u000e\u001a\u00020\u000fH\u0016J\u0008\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;",
        "",
        "windowSizeClass",
        "Landroidx/window/core/layout/WindowSizeClass;",
        "windowPosture",
        "Landroidx/compose/material3/adaptive/Posture;",
        "(Landroidx/window/core/layout/WindowSizeClass;Landroidx/compose/material3/adaptive/Posture;)V",
        "getWindowPosture",
        "()Landroidx/compose/material3/adaptive/Posture;",
        "getWindowSizeClass",
        "()Landroidx/window/core/layout/WindowSizeClass;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "adaptive_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final windowPosture:Landroidx/compose/material3/adaptive/Posture;

.field private final windowSizeClass:Landroidx/window/core/layout/WindowSizeClass;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/window/core/layout/WindowSizeClass;Landroidx/compose/material3/adaptive/Posture;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;->windowSizeClass:Landroidx/window/core/layout/WindowSizeClass;

    iput-object p2, p0, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;->windowPosture:Landroidx/compose/material3/adaptive/Posture;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 44
    :cond_0
    instance-of v1, p1, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 45
    :cond_1
    iget-object v1, p0, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;->windowSizeClass:Landroidx/window/core/layout/WindowSizeClass;

    check-cast p1, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;

    iget-object v3, p1, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;->windowSizeClass:Landroidx/window/core/layout/WindowSizeClass;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    .line 46
    :cond_2
    iget-object v1, p0, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;->windowPosture:Landroidx/compose/material3/adaptive/Posture;

    iget-object p1, p1, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;->windowPosture:Landroidx/compose/material3/adaptive/Posture;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getWindowPosture()Landroidx/compose/material3/adaptive/Posture;
    .locals 1

    .line 41
    iget-object v0, p0, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;->windowPosture:Landroidx/compose/material3/adaptive/Posture;

    return-object v0
.end method

.method public final getWindowSizeClass()Landroidx/window/core/layout/WindowSizeClass;
    .locals 1

    .line 41
    iget-object v0, p0, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;->windowSizeClass:Landroidx/window/core/layout/WindowSizeClass;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 51
    iget-object v0, p0, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;->windowSizeClass:Landroidx/window/core/layout/WindowSizeClass;

    invoke-virtual {v0}, Landroidx/window/core/layout/WindowSizeClass;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 52
    iget-object v1, p0, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;->windowPosture:Landroidx/compose/material3/adaptive/Posture;

    invoke-virtual {v1}, Landroidx/compose/material3/adaptive/Posture;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "WindowAdaptiveInfo(windowSizeClass="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;->windowSizeClass:Landroidx/window/core/layout/WindowSizeClass;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", windowPosture="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;->windowPosture:Landroidx/compose/material3/adaptive/Posture;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
