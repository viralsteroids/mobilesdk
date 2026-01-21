.class public final Landroidx/window/core/layout/WindowSizeClass;
.super Ljava/lang/Object;
.source "WindowSizeClass.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/window/core/layout/WindowSizeClass$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\u000e\u001a\u00020\u000fH\u0016J\u0008\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/window/core/layout/WindowSizeClass;",
        "",
        "windowWidthSizeClass",
        "Landroidx/window/core/layout/WindowWidthSizeClass;",
        "windowHeightSizeClass",
        "Landroidx/window/core/layout/WindowHeightSizeClass;",
        "(Landroidx/window/core/layout/WindowWidthSizeClass;Landroidx/window/core/layout/WindowHeightSizeClass;)V",
        "getWindowHeightSizeClass",
        "()Landroidx/window/core/layout/WindowHeightSizeClass;",
        "getWindowWidthSizeClass",
        "()Landroidx/window/core/layout/WindowWidthSizeClass;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "Companion",
        "window-core_release"
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
.field public static final Companion:Landroidx/window/core/layout/WindowSizeClass$Companion;


# instance fields
.field private final windowHeightSizeClass:Landroidx/window/core/layout/WindowHeightSizeClass;

.field private final windowWidthSizeClass:Landroidx/window/core/layout/WindowWidthSizeClass;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/window/core/layout/WindowSizeClass$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/window/core/layout/WindowSizeClass$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/window/core/layout/WindowSizeClass;->Companion:Landroidx/window/core/layout/WindowSizeClass$Companion;

    return-void
.end method

.method private constructor <init>(Landroidx/window/core/layout/WindowWidthSizeClass;Landroidx/window/core/layout/WindowHeightSizeClass;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Landroidx/window/core/layout/WindowSizeClass;->windowWidthSizeClass:Landroidx/window/core/layout/WindowWidthSizeClass;

    .line 62
    iput-object p2, p0, Landroidx/window/core/layout/WindowSizeClass;->windowHeightSizeClass:Landroidx/window/core/layout/WindowHeightSizeClass;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/window/core/layout/WindowWidthSizeClass;Landroidx/window/core/layout/WindowHeightSizeClass;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/window/core/layout/WindowSizeClass;-><init>(Landroidx/window/core/layout/WindowWidthSizeClass;Landroidx/window/core/layout/WindowHeightSizeClass;)V

    return-void
.end method

.method public static final compute(FF)Landroidx/window/core/layout/WindowSizeClass;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Landroidx/window/core/layout/WindowSizeClass;->Companion:Landroidx/window/core/layout/WindowSizeClass$Companion;

    invoke-virtual {v0, p0, p1}, Landroidx/window/core/layout/WindowSizeClass$Companion;->compute(FF)Landroidx/window/core/layout/WindowSizeClass;

    move-result-object p0

    return-object p0
.end method

.method public static final compute(IIF)Landroidx/window/core/layout/WindowSizeClass;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Landroidx/window/core/layout/WindowSizeClass;->Companion:Landroidx/window/core/layout/WindowSizeClass$Companion;

    invoke-virtual {v0, p0, p1, p2}, Landroidx/window/core/layout/WindowSizeClass$Companion;->compute(IIF)Landroidx/window/core/layout/WindowSizeClass;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 67
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    .line 69
    :cond_2
    const-string v1, "null cannot be cast to non-null type androidx.window.core.layout.WindowSizeClass"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/window/core/layout/WindowSizeClass;

    .line 71
    iget-object v1, p0, Landroidx/window/core/layout/WindowSizeClass;->windowWidthSizeClass:Landroidx/window/core/layout/WindowWidthSizeClass;

    iget-object v3, p1, Landroidx/window/core/layout/WindowSizeClass;->windowWidthSizeClass:Landroidx/window/core/layout/WindowWidthSizeClass;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    .line 72
    :cond_3
    iget-object v1, p0, Landroidx/window/core/layout/WindowSizeClass;->windowHeightSizeClass:Landroidx/window/core/layout/WindowHeightSizeClass;

    iget-object p1, p1, Landroidx/window/core/layout/WindowSizeClass;->windowHeightSizeClass:Landroidx/window/core/layout/WindowHeightSizeClass;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getWindowHeightSizeClass()Landroidx/window/core/layout/WindowHeightSizeClass;
    .locals 1

    .line 62
    iget-object v0, p0, Landroidx/window/core/layout/WindowSizeClass;->windowHeightSizeClass:Landroidx/window/core/layout/WindowHeightSizeClass;

    return-object v0
.end method

.method public final getWindowWidthSizeClass()Landroidx/window/core/layout/WindowWidthSizeClass;
    .locals 1

    .line 58
    iget-object v0, p0, Landroidx/window/core/layout/WindowSizeClass;->windowWidthSizeClass:Landroidx/window/core/layout/WindowWidthSizeClass;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 78
    iget-object v0, p0, Landroidx/window/core/layout/WindowSizeClass;->windowWidthSizeClass:Landroidx/window/core/layout/WindowWidthSizeClass;

    invoke-virtual {v0}, Landroidx/window/core/layout/WindowWidthSizeClass;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 79
    iget-object v1, p0, Landroidx/window/core/layout/WindowSizeClass;->windowHeightSizeClass:Landroidx/window/core/layout/WindowHeightSizeClass;

    invoke-virtual {v1}, Landroidx/window/core/layout/WindowHeightSizeClass;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "WindowSizeClass {windowWidthSizeClass="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    iget-object v1, p0, Landroidx/window/core/layout/WindowSizeClass;->windowWidthSizeClass:Landroidx/window/core/layout/WindowWidthSizeClass;

    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 85
    const-string v1, ", windowHeightSizeClass="

    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 86
    iget-object v1, p0, Landroidx/window/core/layout/WindowSizeClass;->windowHeightSizeClass:Landroidx/window/core/layout/WindowHeightSizeClass;

    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 86
    const-string v1, " }"

    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
