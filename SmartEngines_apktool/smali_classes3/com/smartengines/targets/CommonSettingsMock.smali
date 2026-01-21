.class public final Lcom/smartengines/targets/CommonSettingsMock;
.super Ljava/lang/Object;
.source "CommonSettings.kt"

# interfaces
.implements Lcom/smartengines/targets/CommonSettings;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000eR\u0014\u0010\u0008\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000e\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/smartengines/targets/CommonSettingsMock;",
        "Lcom/smartengines/targets/CommonSettings;",
        "sessionTimeout",
        "",
        "multiThreading",
        "",
        "computeMetrics",
        "ignoreTerminal",
        "enableStoppers",
        "<init>",
        "(IZZZZ)V",
        "getSessionTimeout",
        "()I",
        "getMultiThreading",
        "()Z",
        "getComputeMetrics",
        "getIgnoreTerminal",
        "getEnableStoppers",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "targets_release"
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
.field private final computeMetrics:Z

.field private final enableStoppers:Z

.field private final ignoreTerminal:Z

.field private final multiThreading:Z

.field private final sessionTimeout:I


# direct methods
.method public constructor <init>()V
    .locals 8

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/smartengines/targets/CommonSettingsMock;-><init>(IZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IZZZZ)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput p1, p0, Lcom/smartengines/targets/CommonSettingsMock;->sessionTimeout:I

    .line 13
    iput-boolean p2, p0, Lcom/smartengines/targets/CommonSettingsMock;->multiThreading:Z

    .line 14
    iput-boolean p3, p0, Lcom/smartengines/targets/CommonSettingsMock;->computeMetrics:Z

    .line 15
    iput-boolean p4, p0, Lcom/smartengines/targets/CommonSettingsMock;->ignoreTerminal:Z

    .line 16
    iput-boolean p5, p0, Lcom/smartengines/targets/CommonSettingsMock;->enableStoppers:Z

    return-void
.end method

.method public synthetic constructor <init>(IZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const/16 p1, 0xd

    :cond_0
    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move p7, v0

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_4
    move p7, p5

    move p6, p4

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    .line 11
    :goto_0
    invoke-direct/range {p2 .. p7}, Lcom/smartengines/targets/CommonSettingsMock;-><init>(IZZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/targets/CommonSettingsMock;IZZZZILjava/lang/Object;)Lcom/smartengines/targets/CommonSettingsMock;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/smartengines/targets/CommonSettingsMock;->sessionTimeout:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lcom/smartengines/targets/CommonSettingsMock;->multiThreading:Z

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-boolean p3, p0, Lcom/smartengines/targets/CommonSettingsMock;->computeMetrics:Z

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Lcom/smartengines/targets/CommonSettingsMock;->ignoreTerminal:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lcom/smartengines/targets/CommonSettingsMock;->enableStoppers:Z

    :cond_4
    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/smartengines/targets/CommonSettingsMock;->copy(IZZZZ)Lcom/smartengines/targets/CommonSettingsMock;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/smartengines/targets/CommonSettingsMock;->sessionTimeout:I

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/smartengines/targets/CommonSettingsMock;->multiThreading:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/smartengines/targets/CommonSettingsMock;->computeMetrics:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/smartengines/targets/CommonSettingsMock;->ignoreTerminal:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/smartengines/targets/CommonSettingsMock;->enableStoppers:Z

    return v0
.end method

.method public final copy(IZZZZ)Lcom/smartengines/targets/CommonSettingsMock;
    .locals 6

    new-instance v0, Lcom/smartengines/targets/CommonSettingsMock;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/smartengines/targets/CommonSettingsMock;-><init>(IZZZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/targets/CommonSettingsMock;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/targets/CommonSettingsMock;

    iget v1, p0, Lcom/smartengines/targets/CommonSettingsMock;->sessionTimeout:I

    iget v3, p1, Lcom/smartengines/targets/CommonSettingsMock;->sessionTimeout:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/smartengines/targets/CommonSettingsMock;->multiThreading:Z

    iget-boolean v3, p1, Lcom/smartengines/targets/CommonSettingsMock;->multiThreading:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/smartengines/targets/CommonSettingsMock;->computeMetrics:Z

    iget-boolean v3, p1, Lcom/smartengines/targets/CommonSettingsMock;->computeMetrics:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/smartengines/targets/CommonSettingsMock;->ignoreTerminal:Z

    iget-boolean v3, p1, Lcom/smartengines/targets/CommonSettingsMock;->ignoreTerminal:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/smartengines/targets/CommonSettingsMock;->enableStoppers:Z

    iget-boolean p1, p1, Lcom/smartengines/targets/CommonSettingsMock;->enableStoppers:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public getComputeMetrics()Z
    .locals 1

    .line 14
    iget-boolean v0, p0, Lcom/smartengines/targets/CommonSettingsMock;->computeMetrics:Z

    return v0
.end method

.method public getEnableStoppers()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lcom/smartengines/targets/CommonSettingsMock;->enableStoppers:Z

    return v0
.end method

.method public getIgnoreTerminal()Z
    .locals 1

    .line 15
    iget-boolean v0, p0, Lcom/smartengines/targets/CommonSettingsMock;->ignoreTerminal:Z

    return v0
.end method

.method public getMultiThreading()Z
    .locals 1

    .line 13
    iget-boolean v0, p0, Lcom/smartengines/targets/CommonSettingsMock;->multiThreading:Z

    return v0
.end method

.method public getSessionTimeout()I
    .locals 1

    .line 12
    iget v0, p0, Lcom/smartengines/targets/CommonSettingsMock;->sessionTimeout:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/smartengines/targets/CommonSettingsMock;->sessionTimeout:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/smartengines/targets/CommonSettingsMock;->multiThreading:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/smartengines/targets/CommonSettingsMock;->computeMetrics:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/smartengines/targets/CommonSettingsMock;->ignoreTerminal:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/smartengines/targets/CommonSettingsMock;->enableStoppers:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CommonSettingsMock(sessionTimeout="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/smartengines/targets/CommonSettingsMock;->sessionTimeout:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", multiThreading="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/smartengines/targets/CommonSettingsMock;->multiThreading:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", computeMetrics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/smartengines/targets/CommonSettingsMock;->computeMetrics:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", ignoreTerminal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/smartengines/targets/CommonSettingsMock;->ignoreTerminal:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enableStoppers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/smartengines/targets/CommonSettingsMock;->enableStoppers:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
