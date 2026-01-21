.class public final Lcom/smartengines/nfc/PassportReaderState$Data;
.super Ljava/lang/Object;
.source "PassportReaderState.kt"

# interfaces
.implements Lcom/smartengines/nfc/PassportReaderState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/nfc/PassportReaderState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Data"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/smartengines/nfc/PassportReaderState$Data;",
        "Lcom/smartengines/nfc/PassportReaderState;",
        "data",
        "Lcom/smartengines/nfc/PassportData;",
        "<init>",
        "(Lcom/smartengines/nfc/PassportData;)V",
        "getData",
        "()Lcom/smartengines/nfc/PassportData;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final data:Lcom/smartengines/nfc/PassportData;


# direct methods
.method public constructor <init>(Lcom/smartengines/nfc/PassportData;)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/nfc/PassportReaderState$Data;->data:Lcom/smartengines/nfc/PassportData;

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/nfc/PassportReaderState$Data;Lcom/smartengines/nfc/PassportData;ILjava/lang/Object;)Lcom/smartengines/nfc/PassportReaderState$Data;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/smartengines/nfc/PassportReaderState$Data;->data:Lcom/smartengines/nfc/PassportData;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/smartengines/nfc/PassportReaderState$Data;->copy(Lcom/smartengines/nfc/PassportData;)Lcom/smartengines/nfc/PassportReaderState$Data;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/smartengines/nfc/PassportData;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/nfc/PassportReaderState$Data;->data:Lcom/smartengines/nfc/PassportData;

    return-object v0
.end method

.method public final copy(Lcom/smartengines/nfc/PassportData;)Lcom/smartengines/nfc/PassportReaderState$Data;
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/nfc/PassportReaderState$Data;

    invoke-direct {v0, p1}, Lcom/smartengines/nfc/PassportReaderState$Data;-><init>(Lcom/smartengines/nfc/PassportData;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/nfc/PassportReaderState$Data;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/nfc/PassportReaderState$Data;

    iget-object v1, p0, Lcom/smartengines/nfc/PassportReaderState$Data;->data:Lcom/smartengines/nfc/PassportData;

    iget-object p1, p1, Lcom/smartengines/nfc/PassportReaderState$Data;->data:Lcom/smartengines/nfc/PassportData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getData()Lcom/smartengines/nfc/PassportData;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/smartengines/nfc/PassportReaderState$Data;->data:Lcom/smartengines/nfc/PassportData;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/smartengines/nfc/PassportReaderState$Data;->data:Lcom/smartengines/nfc/PassportData;

    invoke-virtual {v0}, Lcom/smartengines/nfc/PassportData;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Data(data="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/nfc/PassportReaderState$Data;->data:Lcom/smartengines/nfc/PassportData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
