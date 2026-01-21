.class public final Lcom/smartengines/engine/code/CodeObjectData;
.super Ljava/lang/Object;
.source "CodeResultData.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006 "
    }
    d2 = {
        "Lcom/smartengines/engine/code/CodeObjectData;",
        "",
        "type",
        "",
        "fields",
        "",
        "Lcom/smartengines/engine/code/CodeObjectField;",
        "image",
        "Landroid/graphics/Bitmap;",
        "quad",
        "Lcom/smartengines/visualization/Quad;",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Landroid/graphics/Bitmap;Lcom/smartengines/visualization/Quad;)V",
        "getType",
        "()Ljava/lang/String;",
        "getFields",
        "()Ljava/util/List;",
        "getImage",
        "()Landroid/graphics/Bitmap;",
        "getQuad",
        "()Lcom/smartengines/visualization/Quad;",
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
.field private final fields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/smartengines/engine/code/CodeObjectField;",
            ">;"
        }
    .end annotation
.end field

.field private final image:Landroid/graphics/Bitmap;

.field private final quad:Lcom/smartengines/visualization/Quad;

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Landroid/graphics/Bitmap;Lcom/smartengines/visualization/Quad;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/code/CodeObjectField;",
            ">;",
            "Landroid/graphics/Bitmap;",
            "Lcom/smartengines/visualization/Quad;",
            ")V"
        }
    .end annotation

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fields"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/smartengines/engine/code/CodeObjectData;->type:Ljava/lang/String;

    .line 26
    iput-object p2, p0, Lcom/smartengines/engine/code/CodeObjectData;->fields:Ljava/util/List;

    .line 27
    iput-object p3, p0, Lcom/smartengines/engine/code/CodeObjectData;->image:Landroid/graphics/Bitmap;

    .line 28
    iput-object p4, p0, Lcom/smartengines/engine/code/CodeObjectData;->quad:Lcom/smartengines/visualization/Quad;

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/engine/code/CodeObjectData;Ljava/lang/String;Ljava/util/List;Landroid/graphics/Bitmap;Lcom/smartengines/visualization/Quad;ILjava/lang/Object;)Lcom/smartengines/engine/code/CodeObjectData;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/smartengines/engine/code/CodeObjectData;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/smartengines/engine/code/CodeObjectData;->fields:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/smartengines/engine/code/CodeObjectData;->image:Landroid/graphics/Bitmap;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/smartengines/engine/code/CodeObjectData;->quad:Lcom/smartengines/visualization/Quad;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/smartengines/engine/code/CodeObjectData;->copy(Ljava/lang/String;Ljava/util/List;Landroid/graphics/Bitmap;Lcom/smartengines/visualization/Quad;)Lcom/smartengines/engine/code/CodeObjectData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/engine/code/CodeObjectData;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/code/CodeObjectField;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/smartengines/engine/code/CodeObjectData;->fields:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/engine/code/CodeObjectData;->image:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final component4()Lcom/smartengines/visualization/Quad;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/engine/code/CodeObjectData;->quad:Lcom/smartengines/visualization/Quad;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Landroid/graphics/Bitmap;Lcom/smartengines/visualization/Quad;)Lcom/smartengines/engine/code/CodeObjectData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/code/CodeObjectField;",
            ">;",
            "Landroid/graphics/Bitmap;",
            "Lcom/smartengines/visualization/Quad;",
            ")",
            "Lcom/smartengines/engine/code/CodeObjectData;"
        }
    .end annotation

    const-string/jumbo v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fields"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/engine/code/CodeObjectData;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/smartengines/engine/code/CodeObjectData;-><init>(Ljava/lang/String;Ljava/util/List;Landroid/graphics/Bitmap;Lcom/smartengines/visualization/Quad;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/engine/code/CodeObjectData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/engine/code/CodeObjectData;

    iget-object v1, p0, Lcom/smartengines/engine/code/CodeObjectData;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/smartengines/engine/code/CodeObjectData;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/smartengines/engine/code/CodeObjectData;->fields:Ljava/util/List;

    iget-object v3, p1, Lcom/smartengines/engine/code/CodeObjectData;->fields:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/smartengines/engine/code/CodeObjectData;->image:Landroid/graphics/Bitmap;

    iget-object v3, p1, Lcom/smartengines/engine/code/CodeObjectData;->image:Landroid/graphics/Bitmap;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/smartengines/engine/code/CodeObjectData;->quad:Lcom/smartengines/visualization/Quad;

    iget-object p1, p1, Lcom/smartengines/engine/code/CodeObjectData;->quad:Lcom/smartengines/visualization/Quad;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/code/CodeObjectField;",
            ">;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeObjectData;->fields:Ljava/util/List;

    return-object v0
.end method

.method public final getImage()Landroid/graphics/Bitmap;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeObjectData;->image:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final getQuad()Lcom/smartengines/visualization/Quad;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeObjectData;->quad:Lcom/smartengines/visualization/Quad;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeObjectData;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/smartengines/engine/code/CodeObjectData;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/engine/code/CodeObjectData;->fields:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/engine/code/CodeObjectData;->image:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/engine/code/CodeObjectData;->quad:Lcom/smartengines/visualization/Quad;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/smartengines/visualization/Quad;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CodeObjectData(type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/engine/code/CodeObjectData;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fields="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/engine/code/CodeObjectData;->fields:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", image="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/engine/code/CodeObjectData;->image:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", quad="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/engine/code/CodeObjectData;->quad:Lcom/smartengines/visualization/Quad;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
