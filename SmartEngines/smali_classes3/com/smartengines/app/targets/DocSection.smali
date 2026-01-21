.class public final Lcom/smartengines/app/targets/DocSection;
.super Ljava/lang/Object;
.source "DocTargetsList.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003J/\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c7\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d7\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d7\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d7\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/smartengines/app/targets/DocSection;",
        "",
        "type",
        "Lcom/smartengines/app/targets/DocSectionType;",
        "name",
        "Lcom/smartengines/utils/Name;",
        "items",
        "",
        "Lcom/smartengines/app/targets/TreeItem;",
        "<init>",
        "(Lcom/smartengines/app/targets/DocSectionType;Lcom/smartengines/utils/Name;Ljava/util/List;)V",
        "getType",
        "()Lcom/smartengines/app/targets/DocSectionType;",
        "getName",
        "()Lcom/smartengines/utils/Name;",
        "getItems",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
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
.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Lcom/smartengines/utils/Name;

.field private final type:Lcom/smartengines/app/targets/DocSectionType;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/app/targets/DocSectionType;Lcom/smartengines/utils/Name;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/app/targets/DocSectionType;",
            "Lcom/smartengines/utils/Name;",
            "Ljava/util/List<",
            "+",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/smartengines/app/targets/DocSection;->type:Lcom/smartengines/app/targets/DocSectionType;

    .line 24
    iput-object p2, p0, Lcom/smartengines/app/targets/DocSection;->name:Lcom/smartengines/utils/Name;

    .line 25
    iput-object p3, p0, Lcom/smartengines/app/targets/DocSection;->items:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/smartengines/app/targets/DocSectionType;Lcom/smartengines/utils/Name;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 22
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/smartengines/app/targets/DocSection;-><init>(Lcom/smartengines/app/targets/DocSectionType;Lcom/smartengines/utils/Name;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/app/targets/DocSection;Lcom/smartengines/app/targets/DocSectionType;Lcom/smartengines/utils/Name;Ljava/util/List;ILjava/lang/Object;)Lcom/smartengines/app/targets/DocSection;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/smartengines/app/targets/DocSection;->type:Lcom/smartengines/app/targets/DocSectionType;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/smartengines/app/targets/DocSection;->name:Lcom/smartengines/utils/Name;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/smartengines/app/targets/DocSection;->items:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/targets/DocSection;->copy(Lcom/smartengines/app/targets/DocSectionType;Lcom/smartengines/utils/Name;Ljava/util/List;)Lcom/smartengines/app/targets/DocSection;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/smartengines/app/targets/DocSectionType;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/targets/DocSection;->type:Lcom/smartengines/app/targets/DocSectionType;

    return-object v0
.end method

.method public final component2()Lcom/smartengines/utils/Name;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/targets/DocSection;->name:Lcom/smartengines/utils/Name;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/smartengines/app/targets/DocSection;->items:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/smartengines/app/targets/DocSectionType;Lcom/smartengines/utils/Name;Ljava/util/List;)Lcom/smartengines/app/targets/DocSection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/app/targets/DocSectionType;",
            "Lcom/smartengines/utils/Name;",
            "Ljava/util/List<",
            "+",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;)",
            "Lcom/smartengines/app/targets/DocSection;"
        }
    .end annotation

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/app/targets/DocSection;

    invoke-direct {v0, p1, p2, p3}, Lcom/smartengines/app/targets/DocSection;-><init>(Lcom/smartengines/app/targets/DocSectionType;Lcom/smartengines/utils/Name;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/app/targets/DocSection;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/app/targets/DocSection;

    iget-object v1, p0, Lcom/smartengines/app/targets/DocSection;->type:Lcom/smartengines/app/targets/DocSectionType;

    iget-object v3, p1, Lcom/smartengines/app/targets/DocSection;->type:Lcom/smartengines/app/targets/DocSectionType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/smartengines/app/targets/DocSection;->name:Lcom/smartengines/utils/Name;

    iget-object v3, p1, Lcom/smartengines/app/targets/DocSection;->name:Lcom/smartengines/utils/Name;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/smartengines/app/targets/DocSection;->items:Ljava/util/List;

    iget-object p1, p1, Lcom/smartengines/app/targets/DocSection;->items:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/smartengines/app/targets/DocSection;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getName()Lcom/smartengines/utils/Name;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/smartengines/app/targets/DocSection;->name:Lcom/smartengines/utils/Name;

    return-object v0
.end method

.method public final getType()Lcom/smartengines/app/targets/DocSectionType;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/smartengines/app/targets/DocSection;->type:Lcom/smartengines/app/targets/DocSectionType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/smartengines/app/targets/DocSection;->type:Lcom/smartengines/app/targets/DocSectionType;

    invoke-virtual {v0}, Lcom/smartengines/app/targets/DocSectionType;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/app/targets/DocSection;->name:Lcom/smartengines/utils/Name;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/smartengines/utils/Name;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/app/targets/DocSection;->items:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DocSection(type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/app/targets/DocSection;->type:Lcom/smartengines/app/targets/DocSectionType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/app/targets/DocSection;->name:Lcom/smartengines/utils/Name;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/app/targets/DocSection;->items:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
