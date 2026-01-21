.class public Lorg/jmrtd/lds/DisplayedImageInfo;
.super Lorg/jmrtd/lds/AbstractImageInfo;
.source "DisplayedImageInfo.java"


# static fields
.field public static final DISPLAYED_PORTRAIT_TAG:I = 0x5f40

.field public static final DISPLAYED_SIGNATURE_OR_MARK_TAG:I = 0x5f43

.field private static final serialVersionUID:J = 0x34c100ee9bd8ce01L


# instance fields
.field private displayedImageTag:I


# direct methods
.method public constructor <init>(I[B)V
    .locals 1

    .line 58
    invoke-static {p1}, Lorg/jmrtd/lds/DisplayedImageInfo;->getMimeTypeFromType(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/jmrtd/lds/AbstractImageInfo;-><init>(ILjava/lang/String;)V

    .line 59
    invoke-static {p1}, Lorg/jmrtd/lds/DisplayedImageInfo;->getDisplayedImageTagFromType(I)I

    move-result p1

    iput p1, p0, Lorg/jmrtd/lds/DisplayedImageInfo;->displayedImageTag:I

    .line 60
    invoke-virtual {p0, p2}, Lorg/jmrtd/lds/DisplayedImageInfo;->setImageBytes([B)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 70
    invoke-direct {p0}, Lorg/jmrtd/lds/AbstractImageInfo;-><init>()V

    .line 71
    invoke-virtual {p0, p1}, Lorg/jmrtd/lds/DisplayedImageInfo;->readObject(Ljava/io/InputStream;)V

    return-void
.end method

.method private static getDisplayedImageTagFromType(I)I
    .locals 3

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const/16 p0, 0x5f43

    return p0

    .line 200
    :cond_0
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/16 p0, 0x5f40

    return p0
.end method

.method private static getMimeTypeFromType(I)Ljava/lang/String;
    .locals 3

    .line 174
    const-string v0, "image/jpeg"

    if-eqz p0, :cond_1

    const/4 v1, 0x1

    if-eq p0, v1, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    .line 178
    const-string p0, "image/x-wsq"

    return-object p0

    .line 182
    :cond_0
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-object v0
.end method

.method private static getTypeFromDisplayedImageTag(I)I
    .locals 3

    const/16 v0, 0x5f40

    if-eq p0, v0, :cond_1

    const/16 v0, 0x5f43

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 218
    :cond_0
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown tag: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 147
    :cond_0
    invoke-super {p0, p1}, Lorg/jmrtd/lds/AbstractImageInfo;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 150
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    .line 154
    :cond_2
    check-cast p1, Lorg/jmrtd/lds/DisplayedImageInfo;

    .line 155
    iget v1, p0, Lorg/jmrtd/lds/DisplayedImageInfo;->displayedImageTag:I

    iget p1, p1, Lorg/jmrtd/lds/DisplayedImageInfo;->displayedImageTag:I

    if-ne v1, p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method getDisplayedImageTag()I
    .locals 1

    .line 117
    iget v0, p0, Lorg/jmrtd/lds/DisplayedImageInfo;->displayedImageTag:I

    return v0
.end method

.method public getRecordLength()J
    .locals 5

    .line 127
    invoke-virtual {p0}, Lorg/jmrtd/lds/DisplayedImageInfo;->getImageLength()I

    move-result v0

    .line 128
    invoke-virtual {p0}, Lorg/jmrtd/lds/DisplayedImageInfo;->getType()I

    move-result v1

    invoke-static {v1}, Lorg/jmrtd/lds/DisplayedImageInfo;->getDisplayedImageTagFromType(I)I

    move-result v1

    invoke-static {v1}, Lnet/sf/scuba/tlv/TLVUtil;->getTagLength(I)I

    move-result v1

    int-to-long v1, v1

    .line 129
    invoke-static {v0}, Lnet/sf/scuba/tlv/TLVUtil;->getLengthLength(I)I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    int-to-long v3, v0

    add-long/2addr v1, v3

    return-wide v1
.end method

.method public hashCode()I
    .locals 2

    .line 137
    invoke-super {p0}, Lorg/jmrtd/lds/AbstractImageInfo;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 138
    iget v1, p0, Lorg/jmrtd/lds/DisplayedImageInfo;->displayedImageTag:I

    add-int/2addr v0, v1

    return v0
.end method

.method protected readObject(Ljava/io/InputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 84
    instance-of v0, p1, Lnet/sf/scuba/tlv/TLVInputStream;

    if-eqz v0, :cond_0

    check-cast p1, Lnet/sf/scuba/tlv/TLVInputStream;

    goto :goto_0

    :cond_0
    new-instance v0, Lnet/sf/scuba/tlv/TLVInputStream;

    invoke-direct {v0, p1}, Lnet/sf/scuba/tlv/TLVInputStream;-><init>(Ljava/io/InputStream;)V

    move-object p1, v0

    .line 86
    :goto_0
    invoke-virtual {p1}, Lnet/sf/scuba/tlv/TLVInputStream;->readTag()I

    move-result v0

    iput v0, p0, Lorg/jmrtd/lds/DisplayedImageInfo;->displayedImageTag:I

    const/16 v1, 0x5f40

    if-eq v0, v1, :cond_2

    const/16 v1, 0x5f43

    if-ne v0, v1, :cond_1

    goto :goto_1

    .line 89
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Expected tag 0x5F40 or 0x5F43, found "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lorg/jmrtd/lds/DisplayedImageInfo;->displayedImageTag:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 92
    :cond_2
    :goto_1
    invoke-static {v0}, Lorg/jmrtd/lds/DisplayedImageInfo;->getTypeFromDisplayedImageTag(I)I

    move-result v0

    .line 93
    invoke-virtual {p0, v0}, Lorg/jmrtd/lds/DisplayedImageInfo;->setType(I)V

    .line 94
    invoke-static {v0}, Lorg/jmrtd/lds/DisplayedImageInfo;->getMimeTypeFromType(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jmrtd/lds/DisplayedImageInfo;->setMimeType(Ljava/lang/String;)V

    .line 96
    invoke-virtual {p1}, Lnet/sf/scuba/tlv/TLVInputStream;->readLength()I

    move-result v0

    int-to-long v0, v0

    .line 98
    invoke-virtual {p0, p1, v0, v1}, Lorg/jmrtd/lds/DisplayedImageInfo;->readImage(Ljava/io/InputStream;J)V

    return-void
.end method

.method protected writeObject(Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 103
    instance-of v0, p1, Lnet/sf/scuba/tlv/TLVOutputStream;

    if-eqz v0, :cond_0

    check-cast p1, Lnet/sf/scuba/tlv/TLVOutputStream;

    goto :goto_0

    :cond_0
    new-instance v0, Lnet/sf/scuba/tlv/TLVOutputStream;

    invoke-direct {v0, p1}, Lnet/sf/scuba/tlv/TLVOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object p1, v0

    .line 104
    :goto_0
    invoke-virtual {p0}, Lorg/jmrtd/lds/DisplayedImageInfo;->getType()I

    move-result v0

    invoke-static {v0}, Lorg/jmrtd/lds/DisplayedImageInfo;->getDisplayedImageTagFromType(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeTag(I)V

    .line 105
    invoke-virtual {p0, p1}, Lorg/jmrtd/lds/DisplayedImageInfo;->writeImage(Ljava/io/OutputStream;)V

    .line 106
    invoke-virtual {p1}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeValueEnd()V

    return-void
.end method
