.class final Lcom/smartengines/engine/doc/SessionFieldInfo;
.super Ljava/lang/Object;
.source "DocResultNamesFiller.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\r\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/smartengines/engine/doc/SessionFieldInfo;",
        "",
        "name",
        "Lcom/smartengines/engine/doc/DocName;",
        "type",
        "",
        "format",
        "formatExt",
        "<init>",
        "(Lcom/smartengines/engine/doc/DocName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getName",
        "()Lcom/smartengines/engine/doc/DocName;",
        "getType",
        "()Ljava/lang/String;",
        "getFormat",
        "getFormatExt",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "engine_release"
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
.field private final format:Ljava/lang/String;

.field private final formatExt:Ljava/lang/String;

.field private final name:Lcom/smartengines/engine/doc/DocName;

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/smartengines/engine/doc/DocName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatExt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->name:Lcom/smartengines/engine/doc/DocName;

    .line 42
    iput-object p2, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->type:Ljava/lang/String;

    .line 43
    iput-object p3, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->format:Ljava/lang/String;

    .line 44
    iput-object p4, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->formatExt:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/engine/doc/SessionFieldInfo;Lcom/smartengines/engine/doc/DocName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/smartengines/engine/doc/SessionFieldInfo;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->name:Lcom/smartengines/engine/doc/DocName;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->type:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->format:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->formatExt:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/smartengines/engine/doc/SessionFieldInfo;->copy(Lcom/smartengines/engine/doc/DocName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/smartengines/engine/doc/SessionFieldInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/smartengines/engine/doc/DocName;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->name:Lcom/smartengines/engine/doc/DocName;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->format:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->formatExt:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/smartengines/engine/doc/DocName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/smartengines/engine/doc/SessionFieldInfo;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatExt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/engine/doc/SessionFieldInfo;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/smartengines/engine/doc/SessionFieldInfo;-><init>(Lcom/smartengines/engine/doc/DocName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/engine/doc/SessionFieldInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/engine/doc/SessionFieldInfo;

    iget-object v1, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->name:Lcom/smartengines/engine/doc/DocName;

    iget-object v3, p1, Lcom/smartengines/engine/doc/SessionFieldInfo;->name:Lcom/smartengines/engine/doc/DocName;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/smartengines/engine/doc/SessionFieldInfo;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->format:Ljava/lang/String;

    iget-object v3, p1, Lcom/smartengines/engine/doc/SessionFieldInfo;->format:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->formatExt:Ljava/lang/String;

    iget-object p1, p1, Lcom/smartengines/engine/doc/SessionFieldInfo;->formatExt:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getFormat()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->format:Ljava/lang/String;

    return-object v0
.end method

.method public final getFormatExt()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->formatExt:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Lcom/smartengines/engine/doc/DocName;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->name:Lcom/smartengines/engine/doc/DocName;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->name:Lcom/smartengines/engine/doc/DocName;

    invoke-virtual {v0}, Lcom/smartengines/engine/doc/DocName;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->type:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->format:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->formatExt:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SessionFieldInfo(name="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->name:Lcom/smartengines/engine/doc/DocName;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", format="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->format:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", formatExt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/engine/doc/SessionFieldInfo;->formatExt:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
