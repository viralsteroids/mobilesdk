.class public final Lcom/smartengines/app/EngineList;
.super Ljava/lang/Object;
.source "EngineList.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010 \n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c7\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d7\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d7\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d7\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\nR\u0017\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/smartengines/app/EngineList;",
        "",
        "code",
        "Lcom/smartengines/app/EngineStaff;",
        "doc",
        "id",
        "text",
        "<init>",
        "(Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;)V",
        "getCode",
        "()Lcom/smartengines/app/EngineStaff;",
        "getDoc",
        "getId",
        "getText",
        "asList",
        "",
        "getAsList",
        "()Ljava/util/List;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final asList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/smartengines/app/EngineStaff;",
            ">;"
        }
    .end annotation
.end field

.field private final code:Lcom/smartengines/app/EngineStaff;

.field private final doc:Lcom/smartengines/app/EngineStaff;

.field private final id:Lcom/smartengines/app/EngineStaff;

.field private final text:Lcom/smartengines/app/EngineStaff;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;)V
    .locals 2

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "doc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "text"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/smartengines/app/EngineList;->code:Lcom/smartengines/app/EngineStaff;

    .line 5
    iput-object p2, p0, Lcom/smartengines/app/EngineList;->doc:Lcom/smartengines/app/EngineStaff;

    .line 6
    iput-object p3, p0, Lcom/smartengines/app/EngineList;->id:Lcom/smartengines/app/EngineStaff;

    .line 7
    iput-object p4, p0, Lcom/smartengines/app/EngineList;->text:Lcom/smartengines/app/EngineStaff;

    const/4 v0, 0x4

    .line 9
    new-array v0, v0, [Lcom/smartengines/app/EngineStaff;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    const/4 p1, 0x2

    aput-object p3, v0, p1

    const/4 p1, 0x3

    aput-object p4, v0, p1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/app/EngineList;->asList:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/app/EngineList;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;ILjava/lang/Object;)Lcom/smartengines/app/EngineList;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/smartengines/app/EngineList;->code:Lcom/smartengines/app/EngineStaff;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/smartengines/app/EngineList;->doc:Lcom/smartengines/app/EngineStaff;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/smartengines/app/EngineList;->id:Lcom/smartengines/app/EngineStaff;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/smartengines/app/EngineList;->text:Lcom/smartengines/app/EngineStaff;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/smartengines/app/EngineList;->copy(Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;)Lcom/smartengines/app/EngineList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/smartengines/app/EngineStaff;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/EngineList;->code:Lcom/smartengines/app/EngineStaff;

    return-object v0
.end method

.method public final component2()Lcom/smartengines/app/EngineStaff;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/EngineList;->doc:Lcom/smartengines/app/EngineStaff;

    return-object v0
.end method

.method public final component3()Lcom/smartengines/app/EngineStaff;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/EngineList;->id:Lcom/smartengines/app/EngineStaff;

    return-object v0
.end method

.method public final component4()Lcom/smartengines/app/EngineStaff;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/EngineList;->text:Lcom/smartengines/app/EngineStaff;

    return-object v0
.end method

.method public final copy(Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;)Lcom/smartengines/app/EngineList;
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "doc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "text"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/app/EngineList;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/smartengines/app/EngineList;-><init>(Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/app/EngineList;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/app/EngineList;

    iget-object v1, p0, Lcom/smartengines/app/EngineList;->code:Lcom/smartengines/app/EngineStaff;

    iget-object v3, p1, Lcom/smartengines/app/EngineList;->code:Lcom/smartengines/app/EngineStaff;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/smartengines/app/EngineList;->doc:Lcom/smartengines/app/EngineStaff;

    iget-object v3, p1, Lcom/smartengines/app/EngineList;->doc:Lcom/smartengines/app/EngineStaff;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/smartengines/app/EngineList;->id:Lcom/smartengines/app/EngineStaff;

    iget-object v3, p1, Lcom/smartengines/app/EngineList;->id:Lcom/smartengines/app/EngineStaff;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/smartengines/app/EngineList;->text:Lcom/smartengines/app/EngineStaff;

    iget-object p1, p1, Lcom/smartengines/app/EngineList;->text:Lcom/smartengines/app/EngineStaff;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/app/EngineStaff;",
            ">;"
        }
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/smartengines/app/EngineList;->asList:Ljava/util/List;

    return-object v0
.end method

.method public final getCode()Lcom/smartengines/app/EngineStaff;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/smartengines/app/EngineList;->code:Lcom/smartengines/app/EngineStaff;

    return-object v0
.end method

.method public final getDoc()Lcom/smartengines/app/EngineStaff;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/smartengines/app/EngineList;->doc:Lcom/smartengines/app/EngineStaff;

    return-object v0
.end method

.method public final getId()Lcom/smartengines/app/EngineStaff;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/smartengines/app/EngineList;->id:Lcom/smartengines/app/EngineStaff;

    return-object v0
.end method

.method public final getText()Lcom/smartengines/app/EngineStaff;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/smartengines/app/EngineList;->text:Lcom/smartengines/app/EngineStaff;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/smartengines/app/EngineList;->code:Lcom/smartengines/app/EngineStaff;

    invoke-virtual {v0}, Lcom/smartengines/app/EngineStaff;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/app/EngineList;->doc:Lcom/smartengines/app/EngineStaff;

    invoke-virtual {v1}, Lcom/smartengines/app/EngineStaff;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/app/EngineList;->id:Lcom/smartengines/app/EngineStaff;

    invoke-virtual {v1}, Lcom/smartengines/app/EngineStaff;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/app/EngineList;->text:Lcom/smartengines/app/EngineStaff;

    invoke-virtual {v1}, Lcom/smartengines/app/EngineStaff;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EngineList(code="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/app/EngineList;->code:Lcom/smartengines/app/EngineStaff;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", doc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/app/EngineList;->doc:Lcom/smartengines/app/EngineStaff;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/app/EngineList;->id:Lcom/smartengines/app/EngineStaff;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/app/EngineList;->text:Lcom/smartengines/app/EngineStaff;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
