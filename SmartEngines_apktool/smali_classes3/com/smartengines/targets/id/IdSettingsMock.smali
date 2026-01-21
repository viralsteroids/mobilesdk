.class public final Lcom/smartengines/targets/id/IdSettingsMock;
.super Ljava/lang/Object;
.source "IdSettings.kt"

# interfaces
.implements Lcom/smartengines/targets/id/IdSettings;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u001a\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\u0008\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u0006X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u0006X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u0006X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u0006X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u0003X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u000b\u00a8\u0006%"
    }
    d2 = {
        "Lcom/smartengines/targets/id/IdSettingsMock;",
        "Lcom/smartengines/targets/id/IdSettings;",
        "vauthEnabled",
        "",
        "enableForensics",
        "minInstrTime",
        "",
        "maxInstrTime",
        "<init>",
        "(ZZII)V",
        "getVauthEnabled",
        "()Z",
        "getEnableForensics",
        "getMinInstrTime",
        "()I",
        "getMaxInstrTime",
        "instrCount",
        "getInstrCount",
        "instrCountDeltaRandom",
        "getInstrCountDeltaRandom",
        "instrFailed",
        "getInstrFailed",
        "minPassTime",
        "getMinPassTime",
        "alwaysPass",
        "getAlwaysPass",
        "component1",
        "component2",
        "component3",
        "component4",
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
.field private final alwaysPass:Z

.field private final enableForensics:Z

.field private final instrCount:I

.field private final instrCountDeltaRandom:I

.field private final instrFailed:I

.field private final maxInstrTime:I

.field private final minInstrTime:I

.field private final minPassTime:I

.field private final vauthEnabled:Z


# direct methods
.method public constructor <init>()V
    .locals 7

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/smartengines/targets/id/IdSettingsMock;-><init>(ZZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZII)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-boolean p1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->vauthEnabled:Z

    .line 18
    iput-boolean p2, p0, Lcom/smartengines/targets/id/IdSettingsMock;->enableForensics:Z

    .line 19
    iput p3, p0, Lcom/smartengines/targets/id/IdSettingsMock;->minInstrTime:I

    .line 20
    iput p4, p0, Lcom/smartengines/targets/id/IdSettingsMock;->maxInstrTime:I

    const/4 p1, 0x4

    .line 22
    iput p1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->instrCount:I

    const/4 p1, 0x1

    .line 24
    iput p1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->instrFailed:I

    const/16 p1, 0x3e8

    .line 25
    iput p1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->minPassTime:I

    return-void
.end method

.method public synthetic constructor <init>(ZZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const/4 p3, 0x6

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x7

    .line 16
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/smartengines/targets/id/IdSettingsMock;-><init>(ZZII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/targets/id/IdSettingsMock;ZZIIILjava/lang/Object;)Lcom/smartengines/targets/id/IdSettingsMock;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->vauthEnabled:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/smartengines/targets/id/IdSettingsMock;->enableForensics:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/smartengines/targets/id/IdSettingsMock;->minInstrTime:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/smartengines/targets/id/IdSettingsMock;->maxInstrTime:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/smartengines/targets/id/IdSettingsMock;->copy(ZZII)Lcom/smartengines/targets/id/IdSettingsMock;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/smartengines/targets/id/IdSettingsMock;->vauthEnabled:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/smartengines/targets/id/IdSettingsMock;->enableForensics:Z

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/smartengines/targets/id/IdSettingsMock;->minInstrTime:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/smartengines/targets/id/IdSettingsMock;->maxInstrTime:I

    return v0
.end method

.method public final copy(ZZII)Lcom/smartengines/targets/id/IdSettingsMock;
    .locals 1

    new-instance v0, Lcom/smartengines/targets/id/IdSettingsMock;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/smartengines/targets/id/IdSettingsMock;-><init>(ZZII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/targets/id/IdSettingsMock;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/targets/id/IdSettingsMock;

    iget-boolean v1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->vauthEnabled:Z

    iget-boolean v3, p1, Lcom/smartengines/targets/id/IdSettingsMock;->vauthEnabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->enableForensics:Z

    iget-boolean v3, p1, Lcom/smartengines/targets/id/IdSettingsMock;->enableForensics:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->minInstrTime:I

    iget v3, p1, Lcom/smartengines/targets/id/IdSettingsMock;->minInstrTime:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->maxInstrTime:I

    iget p1, p1, Lcom/smartengines/targets/id/IdSettingsMock;->maxInstrTime:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public getAlwaysPass()Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Lcom/smartengines/targets/id/IdSettingsMock;->alwaysPass:Z

    return v0
.end method

.method public getEnableForensics()Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lcom/smartengines/targets/id/IdSettingsMock;->enableForensics:Z

    return v0
.end method

.method public getInstrCount()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/smartengines/targets/id/IdSettingsMock;->instrCount:I

    return v0
.end method

.method public getInstrCountDeltaRandom()I
    .locals 1

    .line 23
    iget v0, p0, Lcom/smartengines/targets/id/IdSettingsMock;->instrCountDeltaRandom:I

    return v0
.end method

.method public getInstrFailed()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/smartengines/targets/id/IdSettingsMock;->instrFailed:I

    return v0
.end method

.method public getMaxInstrTime()I
    .locals 1

    .line 20
    iget v0, p0, Lcom/smartengines/targets/id/IdSettingsMock;->maxInstrTime:I

    return v0
.end method

.method public getMinInstrTime()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/smartengines/targets/id/IdSettingsMock;->minInstrTime:I

    return v0
.end method

.method public getMinPassTime()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/smartengines/targets/id/IdSettingsMock;->minPassTime:I

    return v0
.end method

.method public getVauthEnabled()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/smartengines/targets/id/IdSettingsMock;->vauthEnabled:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/smartengines/targets/id/IdSettingsMock;->vauthEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->enableForensics:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->minInstrTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->maxInstrTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IdSettingsMock(vauthEnabled="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->vauthEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enableForensics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->enableForensics:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minInstrTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->minInstrTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxInstrTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/smartengines/targets/id/IdSettingsMock;->maxInstrTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
