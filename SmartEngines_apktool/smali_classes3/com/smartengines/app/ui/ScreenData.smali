.class public final Lcom/smartengines/app/ui/ScreenData;
.super Ljava/lang/Object;
.source "ScreenData.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0007\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J8\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c7\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00062\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d7\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d7\u0001J\t\u0010\u001f\u001a\u00020 H\u00d7\u0001R\u0013\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u000b\u00a8\u0006!"
    }
    d2 = {
        "Lcom/smartengines/app/ui/ScreenData;",
        "",
        "width",
        "Landroidx/compose/ui/unit/Dp;",
        "height",
        "isWide",
        "",
        "isTall",
        "<init>",
        "(FFZZLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getWidth-D9Ej5fM",
        "()F",
        "F",
        "getHeight-D9Ej5fM",
        "()Z",
        "bodyWidthFraction",
        "",
        "getBodyWidthFraction",
        "component1",
        "component1-D9Ej5fM",
        "component2",
        "component2-D9Ej5fM",
        "component3",
        "component4",
        "copy",
        "copy-i1RSzL4",
        "(FFZZ)Lcom/smartengines/app/ui/ScreenData;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field public static final $stable:I


# instance fields
.field private final height:F

.field private final isTall:Z

.field private final isWide:Z

.field private final width:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(FFZZ)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput p1, p0, Lcom/smartengines/app/ui/ScreenData;->width:F

    .line 17
    iput p2, p0, Lcom/smartengines/app/ui/ScreenData;->height:F

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/app/ui/ScreenData;->isWide:Z

    .line 19
    iput-boolean p4, p0, Lcom/smartengines/app/ui/ScreenData;->isTall:Z

    return-void
.end method

.method public synthetic constructor <init>(FFZZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/smartengines/app/ui/ScreenData;-><init>(FFZZ)V

    return-void
.end method

.method public static synthetic copy-i1RSzL4$default(Lcom/smartengines/app/ui/ScreenData;FFZZILjava/lang/Object;)Lcom/smartengines/app/ui/ScreenData;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/smartengines/app/ui/ScreenData;->width:F

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/smartengines/app/ui/ScreenData;->height:F

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/smartengines/app/ui/ScreenData;->isWide:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/smartengines/app/ui/ScreenData;->isTall:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/smartengines/app/ui/ScreenData;->copy-i1RSzL4(FFZZ)Lcom/smartengines/app/ui/ScreenData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lcom/smartengines/app/ui/ScreenData;->width:F

    return v0
.end method

.method public final component2-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lcom/smartengines/app/ui/ScreenData;->height:F

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/smartengines/app/ui/ScreenData;->isWide:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/smartengines/app/ui/ScreenData;->isTall:Z

    return v0
.end method

.method public final copy-i1RSzL4(FFZZ)Lcom/smartengines/app/ui/ScreenData;
    .locals 6

    new-instance v0, Lcom/smartengines/app/ui/ScreenData;

    const/4 v5, 0x0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/smartengines/app/ui/ScreenData;-><init>(FFZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/app/ui/ScreenData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/app/ui/ScreenData;

    iget v1, p0, Lcom/smartengines/app/ui/ScreenData;->width:F

    iget v3, p1, Lcom/smartengines/app/ui/ScreenData;->width:F

    invoke-static {v1, v3}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/smartengines/app/ui/ScreenData;->height:F

    iget v3, p1, Lcom/smartengines/app/ui/ScreenData;->height:F

    invoke-static {v1, v3}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/smartengines/app/ui/ScreenData;->isWide:Z

    iget-boolean v3, p1, Lcom/smartengines/app/ui/ScreenData;->isWide:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/smartengines/app/ui/ScreenData;->isTall:Z

    iget-boolean p1, p1, Lcom/smartengines/app/ui/ScreenData;->isTall:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBodyWidthFraction()F
    .locals 1

    .line 21
    iget-boolean v0, p0, Lcom/smartengines/app/ui/ScreenData;->isWide:Z

    if-eqz v0, :cond_0

    const v0, 0x3f333333    # 0.7f

    return v0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public final getHeight-D9Ej5fM()F
    .locals 1

    .line 17
    iget v0, p0, Lcom/smartengines/app/ui/ScreenData;->height:F

    return v0
.end method

.method public final getWidth-D9Ej5fM()F
    .locals 1

    .line 16
    iget v0, p0, Lcom/smartengines/app/ui/ScreenData;->width:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/smartengines/app/ui/ScreenData;->width:F

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/smartengines/app/ui/ScreenData;->height:F

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/smartengines/app/ui/ScreenData;->isWide:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/smartengines/app/ui/ScreenData;->isTall:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isTall()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Lcom/smartengines/app/ui/ScreenData;->isTall:Z

    return v0
.end method

.method public final isWide()Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lcom/smartengines/app/ui/ScreenData;->isWide:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ScreenData(width="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/smartengines/app/ui/ScreenData;->width:F

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->toString-impl(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/smartengines/app/ui/ScreenData;->height:F

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->toString-impl(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isWide="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/smartengines/app/ui/ScreenData;->isWide:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isTall="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/smartengines/app/ui/ScreenData;->isTall:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
