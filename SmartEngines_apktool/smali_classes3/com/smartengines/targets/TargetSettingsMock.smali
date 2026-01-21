.class public final Lcom/smartengines/targets/TargetSettingsMock;
.super Ljava/lang/Object;
.source "TargetSettings.kt"

# interfaces
.implements Lcom/smartengines/targets/TargetSettings;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J1\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006!"
    }
    d2 = {
        "Lcom/smartengines/targets/TargetSettingsMock;",
        "Lcom/smartengines/targets/TargetSettings;",
        "common",
        "Lcom/smartengines/targets/CommonSettings;",
        "code",
        "Lcom/smartengines/targets/code/CodeSettings;",
        "id",
        "Lcom/smartengines/targets/id/IdSettings;",
        "text",
        "Lcom/smartengines/targets/text/TextSettings;",
        "<init>",
        "(Lcom/smartengines/targets/CommonSettings;Lcom/smartengines/targets/code/CodeSettings;Lcom/smartengines/targets/id/IdSettings;Lcom/smartengines/targets/text/TextSettings;)V",
        "getCommon",
        "()Lcom/smartengines/targets/CommonSettings;",
        "getCode",
        "()Lcom/smartengines/targets/code/CodeSettings;",
        "getId",
        "()Lcom/smartengines/targets/id/IdSettings;",
        "getText",
        "()Lcom/smartengines/targets/text/TextSettings;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
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
.field private final code:Lcom/smartengines/targets/code/CodeSettings;

.field private final common:Lcom/smartengines/targets/CommonSettings;

.field private final id:Lcom/smartengines/targets/id/IdSettings;

.field private final text:Lcom/smartengines/targets/text/TextSettings;


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

    invoke-direct/range {v0 .. v6}, Lcom/smartengines/targets/TargetSettingsMock;-><init>(Lcom/smartengines/targets/CommonSettings;Lcom/smartengines/targets/code/CodeSettings;Lcom/smartengines/targets/id/IdSettings;Lcom/smartengines/targets/text/TextSettings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/targets/CommonSettings;Lcom/smartengines/targets/code/CodeSettings;Lcom/smartengines/targets/id/IdSettings;Lcom/smartengines/targets/text/TextSettings;)V
    .locals 1

    const-string v0, "common"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "code"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "text"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/smartengines/targets/TargetSettingsMock;->common:Lcom/smartengines/targets/CommonSettings;

    .line 31
    iput-object p2, p0, Lcom/smartengines/targets/TargetSettingsMock;->code:Lcom/smartengines/targets/code/CodeSettings;

    .line 32
    iput-object p3, p0, Lcom/smartengines/targets/TargetSettingsMock;->id:Lcom/smartengines/targets/id/IdSettings;

    .line 33
    iput-object p4, p0, Lcom/smartengines/targets/TargetSettingsMock;->text:Lcom/smartengines/targets/text/TextSettings;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/smartengines/targets/CommonSettings;Lcom/smartengines/targets/code/CodeSettings;Lcom/smartengines/targets/id/IdSettings;Lcom/smartengines/targets/text/TextSettings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    .line 30
    new-instance v1, Lcom/smartengines/targets/CommonSettingsMock;

    const/16 v7, 0x1f

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/smartengines/targets/CommonSettingsMock;-><init>(IZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    check-cast v0, Lcom/smartengines/targets/CommonSettings;

    goto :goto_0

    :cond_0
    move-object/from16 v0, p1

    :goto_0
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_1

    .line 31
    new-instance v2, Lcom/smartengines/targets/code/CodeSettingsMock;

    const/16 v18, 0x7fff

    const/16 v19, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v2 .. v19}, Lcom/smartengines/targets/code/CodeSettingsMock;-><init>(Ljava/util/Set;ILjava/lang/String;Ljava/lang/String;ZZZLjava/util/Set;ZLjava/util/Set;ILjava/util/Set;ILjava/util/Set;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v2

    check-cast v1, Lcom/smartengines/targets/code/CodeSettings;

    goto :goto_1

    :cond_1
    move-object/from16 v1, p2

    :goto_1
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_2

    .line 32
    new-instance v3, Lcom/smartengines/targets/id/IdSettingsMock;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/smartengines/targets/id/IdSettingsMock;-><init>(ZZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v3

    check-cast v2, Lcom/smartengines/targets/id/IdSettings;

    goto :goto_2

    :cond_2
    move-object/from16 v2, p3

    :goto_2
    and-int/lit8 v3, p5, 0x8

    if-eqz v3, :cond_3

    .line 33
    new-instance v3, Lcom/smartengines/targets/text/TextSettingsMock;

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-direct {v3, v6, v4, v5, v6}, Lcom/smartengines/targets/text/TextSettingsMock;-><init>(Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v3, Lcom/smartengines/targets/text/TextSettings;

    goto :goto_3

    :cond_3
    move-object/from16 v3, p4

    :goto_3
    move-object/from16 v4, p0

    .line 29
    invoke-direct {v4, v0, v1, v2, v3}, Lcom/smartengines/targets/TargetSettingsMock;-><init>(Lcom/smartengines/targets/CommonSettings;Lcom/smartengines/targets/code/CodeSettings;Lcom/smartengines/targets/id/IdSettings;Lcom/smartengines/targets/text/TextSettings;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/targets/TargetSettingsMock;Lcom/smartengines/targets/CommonSettings;Lcom/smartengines/targets/code/CodeSettings;Lcom/smartengines/targets/id/IdSettings;Lcom/smartengines/targets/text/TextSettings;ILjava/lang/Object;)Lcom/smartengines/targets/TargetSettingsMock;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/smartengines/targets/TargetSettingsMock;->common:Lcom/smartengines/targets/CommonSettings;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/smartengines/targets/TargetSettingsMock;->code:Lcom/smartengines/targets/code/CodeSettings;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/smartengines/targets/TargetSettingsMock;->id:Lcom/smartengines/targets/id/IdSettings;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/smartengines/targets/TargetSettingsMock;->text:Lcom/smartengines/targets/text/TextSettings;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/smartengines/targets/TargetSettingsMock;->copy(Lcom/smartengines/targets/CommonSettings;Lcom/smartengines/targets/code/CodeSettings;Lcom/smartengines/targets/id/IdSettings;Lcom/smartengines/targets/text/TextSettings;)Lcom/smartengines/targets/TargetSettingsMock;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/smartengines/targets/CommonSettings;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/targets/TargetSettingsMock;->common:Lcom/smartengines/targets/CommonSettings;

    return-object v0
.end method

.method public final component2()Lcom/smartengines/targets/code/CodeSettings;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/targets/TargetSettingsMock;->code:Lcom/smartengines/targets/code/CodeSettings;

    return-object v0
.end method

.method public final component3()Lcom/smartengines/targets/id/IdSettings;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/targets/TargetSettingsMock;->id:Lcom/smartengines/targets/id/IdSettings;

    return-object v0
.end method

.method public final component4()Lcom/smartengines/targets/text/TextSettings;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/targets/TargetSettingsMock;->text:Lcom/smartengines/targets/text/TextSettings;

    return-object v0
.end method

.method public final copy(Lcom/smartengines/targets/CommonSettings;Lcom/smartengines/targets/code/CodeSettings;Lcom/smartengines/targets/id/IdSettings;Lcom/smartengines/targets/text/TextSettings;)Lcom/smartengines/targets/TargetSettingsMock;
    .locals 1

    const-string v0, "common"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "code"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "text"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/targets/TargetSettingsMock;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/smartengines/targets/TargetSettingsMock;-><init>(Lcom/smartengines/targets/CommonSettings;Lcom/smartengines/targets/code/CodeSettings;Lcom/smartengines/targets/id/IdSettings;Lcom/smartengines/targets/text/TextSettings;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/targets/TargetSettingsMock;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/targets/TargetSettingsMock;

    iget-object v1, p0, Lcom/smartengines/targets/TargetSettingsMock;->common:Lcom/smartengines/targets/CommonSettings;

    iget-object v3, p1, Lcom/smartengines/targets/TargetSettingsMock;->common:Lcom/smartengines/targets/CommonSettings;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/smartengines/targets/TargetSettingsMock;->code:Lcom/smartengines/targets/code/CodeSettings;

    iget-object v3, p1, Lcom/smartengines/targets/TargetSettingsMock;->code:Lcom/smartengines/targets/code/CodeSettings;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/smartengines/targets/TargetSettingsMock;->id:Lcom/smartengines/targets/id/IdSettings;

    iget-object v3, p1, Lcom/smartengines/targets/TargetSettingsMock;->id:Lcom/smartengines/targets/id/IdSettings;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/smartengines/targets/TargetSettingsMock;->text:Lcom/smartengines/targets/text/TextSettings;

    iget-object p1, p1, Lcom/smartengines/targets/TargetSettingsMock;->text:Lcom/smartengines/targets/text/TextSettings;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public getCode()Lcom/smartengines/targets/code/CodeSettings;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/smartengines/targets/TargetSettingsMock;->code:Lcom/smartengines/targets/code/CodeSettings;

    return-object v0
.end method

.method public getCommon()Lcom/smartengines/targets/CommonSettings;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/smartengines/targets/TargetSettingsMock;->common:Lcom/smartengines/targets/CommonSettings;

    return-object v0
.end method

.method public getId()Lcom/smartengines/targets/id/IdSettings;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/smartengines/targets/TargetSettingsMock;->id:Lcom/smartengines/targets/id/IdSettings;

    return-object v0
.end method

.method public getText()Lcom/smartengines/targets/text/TextSettings;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/smartengines/targets/TargetSettingsMock;->text:Lcom/smartengines/targets/text/TextSettings;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/smartengines/targets/TargetSettingsMock;->common:Lcom/smartengines/targets/CommonSettings;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/targets/TargetSettingsMock;->code:Lcom/smartengines/targets/code/CodeSettings;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/targets/TargetSettingsMock;->id:Lcom/smartengines/targets/id/IdSettings;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/targets/TargetSettingsMock;->text:Lcom/smartengines/targets/text/TextSettings;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TargetSettingsMock(common="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/targets/TargetSettingsMock;->common:Lcom/smartengines/targets/CommonSettings;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/targets/TargetSettingsMock;->code:Lcom/smartengines/targets/code/CodeSettings;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/targets/TargetSettingsMock;->id:Lcom/smartengines/targets/id/IdSettings;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/targets/TargetSettingsMock;->text:Lcom/smartengines/targets/text/TextSettings;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
