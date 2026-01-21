.class public final Lcom/smartengines/nfc/PassportData;
.super Ljava/lang/Object;
.source "PassportData.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JQ\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016\u00a8\u0006$"
    }
    d2 = {
        "Lcom/smartengines/nfc/PassportData;",
        "",
        "mrzInfo",
        "Lcom/smartengines/nfc/MrzInfo;",
        "facesData",
        "",
        "Lcom/smartengines/nfc/FaceImageData;",
        "otherFields",
        "",
        "",
        "chipAuth",
        "Lcom/smartengines/nfc/AuthResult;",
        "dataAuth",
        "<init>",
        "(Lcom/smartengines/nfc/MrzInfo;Ljava/util/List;Ljava/util/Map;Lcom/smartengines/nfc/AuthResult;Lcom/smartengines/nfc/AuthResult;)V",
        "getMrzInfo",
        "()Lcom/smartengines/nfc/MrzInfo;",
        "getFacesData",
        "()Ljava/util/List;",
        "getOtherFields",
        "()Ljava/util/Map;",
        "getChipAuth",
        "()Lcom/smartengines/nfc/AuthResult;",
        "getDataAuth",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "nfc_release"
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
.field private final chipAuth:Lcom/smartengines/nfc/AuthResult;

.field private final dataAuth:Lcom/smartengines/nfc/AuthResult;

.field private final facesData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/smartengines/nfc/FaceImageData;",
            ">;"
        }
    .end annotation
.end field

.field private final mrzInfo:Lcom/smartengines/nfc/MrzInfo;

.field private final otherFields:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/smartengines/nfc/MrzInfo;Ljava/util/List;Ljava/util/Map;Lcom/smartengines/nfc/AuthResult;Lcom/smartengines/nfc/AuthResult;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/nfc/MrzInfo;",
            "Ljava/util/List<",
            "Lcom/smartengines/nfc/FaceImageData;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/smartengines/nfc/AuthResult;",
            "Lcom/smartengines/nfc/AuthResult;",
            ")V"
        }
    .end annotation

    const-string v0, "mrzInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "facesData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "otherFields"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/smartengines/nfc/PassportData;->mrzInfo:Lcom/smartengines/nfc/MrzInfo;

    .line 13
    iput-object p2, p0, Lcom/smartengines/nfc/PassportData;->facesData:Ljava/util/List;

    .line 15
    iput-object p3, p0, Lcom/smartengines/nfc/PassportData;->otherFields:Ljava/util/Map;

    .line 17
    iput-object p4, p0, Lcom/smartengines/nfc/PassportData;->chipAuth:Lcom/smartengines/nfc/AuthResult;

    .line 18
    iput-object p5, p0, Lcom/smartengines/nfc/PassportData;->dataAuth:Lcom/smartengines/nfc/AuthResult;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/smartengines/nfc/MrzInfo;Ljava/util/List;Ljava/util/Map;Lcom/smartengines/nfc/AuthResult;Lcom/smartengines/nfc/AuthResult;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    .line 15
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p3

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/smartengines/nfc/PassportData;-><init>(Lcom/smartengines/nfc/MrzInfo;Ljava/util/List;Ljava/util/Map;Lcom/smartengines/nfc/AuthResult;Lcom/smartengines/nfc/AuthResult;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/nfc/PassportData;Lcom/smartengines/nfc/MrzInfo;Ljava/util/List;Ljava/util/Map;Lcom/smartengines/nfc/AuthResult;Lcom/smartengines/nfc/AuthResult;ILjava/lang/Object;)Lcom/smartengines/nfc/PassportData;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/smartengines/nfc/PassportData;->mrzInfo:Lcom/smartengines/nfc/MrzInfo;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/smartengines/nfc/PassportData;->facesData:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/smartengines/nfc/PassportData;->otherFields:Ljava/util/Map;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/smartengines/nfc/PassportData;->chipAuth:Lcom/smartengines/nfc/AuthResult;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/smartengines/nfc/PassportData;->dataAuth:Lcom/smartengines/nfc/AuthResult;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/smartengines/nfc/PassportData;->copy(Lcom/smartengines/nfc/MrzInfo;Ljava/util/List;Ljava/util/Map;Lcom/smartengines/nfc/AuthResult;Lcom/smartengines/nfc/AuthResult;)Lcom/smartengines/nfc/PassportData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/smartengines/nfc/MrzInfo;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/nfc/PassportData;->mrzInfo:Lcom/smartengines/nfc/MrzInfo;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/nfc/FaceImageData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/smartengines/nfc/PassportData;->facesData:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/smartengines/nfc/PassportData;->otherFields:Ljava/util/Map;

    return-object v0
.end method

.method public final component4()Lcom/smartengines/nfc/AuthResult;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/nfc/PassportData;->chipAuth:Lcom/smartengines/nfc/AuthResult;

    return-object v0
.end method

.method public final component5()Lcom/smartengines/nfc/AuthResult;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/nfc/PassportData;->dataAuth:Lcom/smartengines/nfc/AuthResult;

    return-object v0
.end method

.method public final copy(Lcom/smartengines/nfc/MrzInfo;Ljava/util/List;Ljava/util/Map;Lcom/smartengines/nfc/AuthResult;Lcom/smartengines/nfc/AuthResult;)Lcom/smartengines/nfc/PassportData;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/nfc/MrzInfo;",
            "Ljava/util/List<",
            "Lcom/smartengines/nfc/FaceImageData;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/smartengines/nfc/AuthResult;",
            "Lcom/smartengines/nfc/AuthResult;",
            ")",
            "Lcom/smartengines/nfc/PassportData;"
        }
    .end annotation

    const-string v0, "mrzInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "facesData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "otherFields"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/smartengines/nfc/PassportData;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/smartengines/nfc/PassportData;-><init>(Lcom/smartengines/nfc/MrzInfo;Ljava/util/List;Ljava/util/Map;Lcom/smartengines/nfc/AuthResult;Lcom/smartengines/nfc/AuthResult;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/nfc/PassportData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/nfc/PassportData;

    iget-object v1, p0, Lcom/smartengines/nfc/PassportData;->mrzInfo:Lcom/smartengines/nfc/MrzInfo;

    iget-object v3, p1, Lcom/smartengines/nfc/PassportData;->mrzInfo:Lcom/smartengines/nfc/MrzInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/smartengines/nfc/PassportData;->facesData:Ljava/util/List;

    iget-object v3, p1, Lcom/smartengines/nfc/PassportData;->facesData:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/smartengines/nfc/PassportData;->otherFields:Ljava/util/Map;

    iget-object v3, p1, Lcom/smartengines/nfc/PassportData;->otherFields:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/smartengines/nfc/PassportData;->chipAuth:Lcom/smartengines/nfc/AuthResult;

    iget-object v3, p1, Lcom/smartengines/nfc/PassportData;->chipAuth:Lcom/smartengines/nfc/AuthResult;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/smartengines/nfc/PassportData;->dataAuth:Lcom/smartengines/nfc/AuthResult;

    iget-object p1, p1, Lcom/smartengines/nfc/PassportData;->dataAuth:Lcom/smartengines/nfc/AuthResult;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getChipAuth()Lcom/smartengines/nfc/AuthResult;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/smartengines/nfc/PassportData;->chipAuth:Lcom/smartengines/nfc/AuthResult;

    return-object v0
.end method

.method public final getDataAuth()Lcom/smartengines/nfc/AuthResult;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/smartengines/nfc/PassportData;->dataAuth:Lcom/smartengines/nfc/AuthResult;

    return-object v0
.end method

.method public final getFacesData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/nfc/FaceImageData;",
            ">;"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/smartengines/nfc/PassportData;->facesData:Ljava/util/List;

    return-object v0
.end method

.method public final getMrzInfo()Lcom/smartengines/nfc/MrzInfo;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/smartengines/nfc/PassportData;->mrzInfo:Lcom/smartengines/nfc/MrzInfo;

    return-object v0
.end method

.method public final getOtherFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/smartengines/nfc/PassportData;->otherFields:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/smartengines/nfc/PassportData;->mrzInfo:Lcom/smartengines/nfc/MrzInfo;

    invoke-virtual {v0}, Lcom/smartengines/nfc/MrzInfo;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/nfc/PassportData;->facesData:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/nfc/PassportData;->otherFields:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/nfc/PassportData;->chipAuth:Lcom/smartengines/nfc/AuthResult;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/nfc/PassportData;->dataAuth:Lcom/smartengines/nfc/AuthResult;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PassportData(mrzInfo="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/nfc/PassportData;->mrzInfo:Lcom/smartengines/nfc/MrzInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", facesData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/nfc/PassportData;->facesData:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", otherFields="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/nfc/PassportData;->otherFields:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", chipAuth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/nfc/PassportData;->chipAuth:Lcom/smartengines/nfc/AuthResult;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataAuth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/nfc/PassportData;->dataAuth:Lcom/smartengines/nfc/AuthResult;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
