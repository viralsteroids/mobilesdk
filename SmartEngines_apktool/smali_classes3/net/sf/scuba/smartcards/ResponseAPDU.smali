.class public final Lnet/sf/scuba/smartcards/ResponseAPDU;
.super Ljava/lang/Object;
.source "ResponseAPDU.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x60a0a3aae9b650f1L


# instance fields
.field private apdu:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    .line 69
    invoke-static {p1}, Lnet/sf/scuba/smartcards/ResponseAPDU;->check([B)V

    .line 70
    iput-object p1, p0, Lnet/sf/scuba/smartcards/ResponseAPDU;->apdu:[B

    return-void
.end method

.method private static check([B)V
    .locals 1

    .line 74
    array-length p0, p0

    const/4 v0, 0x2

    if-lt p0, v0, :cond_0

    return-void

    .line 75
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "apdu must be at least 2 bytes long"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 186
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readUnshared()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    check-cast p1, [B

    iput-object p1, p0, Lnet/sf/scuba/smartcards/ResponseAPDU;->apdu:[B

    .line 187
    invoke-static {p1}, Lnet/sf/scuba/smartcards/ResponseAPDU;->check([B)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 167
    :cond_0
    instance-of v0, p1, Lnet/sf/scuba/smartcards/ResponseAPDU;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 170
    :cond_1
    check-cast p1, Lnet/sf/scuba/smartcards/ResponseAPDU;

    .line 171
    iget-object v0, p0, Lnet/sf/scuba/smartcards/ResponseAPDU;->apdu:[B

    iget-object p1, p1, Lnet/sf/scuba/smartcards/ResponseAPDU;->apdu:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public getBytes()[B
    .locals 1

    .line 140
    iget-object v0, p0, Lnet/sf/scuba/smartcards/ResponseAPDU;->apdu:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public getData()[B
    .locals 4

    .line 99
    iget-object v0, p0, Lnet/sf/scuba/smartcards/ResponseAPDU;->apdu:[B

    array-length v1, v0

    add-int/lit8 v1, v1, -0x2

    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 100
    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

.method public getNr()I
    .locals 1

    .line 88
    iget-object v0, p0, Lnet/sf/scuba/smartcards/ResponseAPDU;->apdu:[B

    array-length v0, v0

    add-int/lit8 v0, v0, -0x2

    return v0
.end method

.method public getSW()I
    .locals 2

    .line 131
    invoke-virtual {p0}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getSW1()I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getSW2()I

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public getSW1()I
    .locals 2

    .line 110
    iget-object v0, p0, Lnet/sf/scuba/smartcards/ResponseAPDU;->apdu:[B

    array-length v1, v0

    add-int/lit8 v1, v1, -0x2

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public getSW2()I
    .locals 2

    .line 119
    iget-object v0, p0, Lnet/sf/scuba/smartcards/ResponseAPDU;->apdu:[B

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 181
    iget-object v0, p0, Lnet/sf/scuba/smartcards/ResponseAPDU;->apdu:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 150
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ResponseAPDU: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lnet/sf/scuba/smartcards/ResponseAPDU;->apdu:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " bytes, SW="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 151
    invoke-virtual {p0}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getSW()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
