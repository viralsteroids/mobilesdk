.class public Lorg/jmrtd/lds/iso19794/IrisImageInfo;
.super Lorg/jmrtd/lds/AbstractImageInfo;
.source "IrisImageInfo.java"


# static fields
.field public static final IMAGE_QUAL_HIGH_HI:I = 0x64

.field public static final IMAGE_QUAL_HIGH_LO:I = 0x4c

.field public static final IMAGE_QUAL_LOW_HI:I = 0x32

.field public static final IMAGE_QUAL_LOW_LO:I = 0x1a

.field public static final IMAGE_QUAL_MED_HI:I = 0x4b

.field public static final IMAGE_QUAL_MED_LO:I = 0x33

.field public static final IMAGE_QUAL_UNDEF:I = 0xfe

.field private static final ROT_ANGLE_UNDEF:I = 0xffff

.field private static final ROT_UNCERTAIN_UNDEF:I = 0xffff

.field private static final serialVersionUID:J = 0xb915558d85bb898L


# instance fields
.field private imageFormat:I

.field private imageNumber:I

.field private quality:I

.field private rotationAngle:I

.field private rotationAngleUncertainty:I


# direct methods
.method public constructor <init>(IIIIIILjava/io/InputStream;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move/from16 v0, p8

    int-to-long v5, v0

    .line 99
    invoke-static/range {p9 .. p9}, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->getMimeTypeFromImageFormat(I)Ljava/lang/String;

    move-result-object v7

    const/4 v1, 0x3

    move-object v0, p0

    move v2, p5

    move v3, p6

    move-object v4, p7

    invoke-direct/range {v0 .. v7}, Lorg/jmrtd/lds/AbstractImageInfo;-><init>(IIILjava/io/InputStream;JLjava/lang/String;)V

    if-eqz p7, :cond_0

    .line 103
    iput p1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->imageNumber:I

    .line 104
    iput p2, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->quality:I

    .line 105
    iput p3, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->rotationAngle:I

    .line 106
    iput p4, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->rotationAngleUncertainty:I

    return-void

    .line 101
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null image bytes"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(IIILjava/io/InputStream;II)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const v3, 0xffff

    const v4, 0xffff

    const/16 v2, 0xfe

    move-object v0, p0

    move v1, p1

    move v5, p2

    move v6, p3

    move-object v7, p4

    move v8, p5

    move/from16 v9, p6

    .line 122
    invoke-direct/range {v0 .. v9}, Lorg/jmrtd/lds/iso19794/IrisImageInfo;-><init>(IIIIIILjava/io/InputStream;II)V

    return-void
.end method

.method constructor <init>(Ljava/io/InputStream;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x3

    .line 135
    invoke-direct {p0, v0}, Lorg/jmrtd/lds/AbstractImageInfo;-><init>(I)V

    .line 136
    iput p2, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->imageFormat:I

    .line 137
    invoke-static {p2}, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->getMimeTypeFromImageFormat(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->setMimeType(Ljava/lang/String;)V

    .line 138
    invoke-virtual {p0, p1}, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->readObject(Ljava/io/InputStream;)V

    return-void
.end method

.method private static getMimeTypeFromImageFormat(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v0, 0x6

    if-eq p0, v0, :cond_1

    const/16 v0, 0x8

    if-eq p0, v0, :cond_1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/16 v0, 0xc

    if-eq p0, v0, :cond_1

    const/16 v0, 0xe

    if-eq p0, v0, :cond_0

    const/16 v0, 0x10

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 333
    :cond_0
    const-string p0, "image/jp2"

    return-object p0

    .line 330
    :cond_1
    const-string p0, "image/jpeg"

    return-object p0

    .line 325
    :cond_2
    const-string p0, "image/x-wsq"

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 212
    :cond_0
    invoke-super {p0, p1}, Lorg/jmrtd/lds/AbstractImageInfo;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 215
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    .line 219
    :cond_2
    check-cast p1, Lorg/jmrtd/lds/iso19794/IrisImageInfo;

    .line 220
    iget v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->imageFormat:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->imageFormat:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->imageNumber:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->imageNumber:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->quality:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->quality:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->rotationAngle:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->rotationAngle:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->rotationAngleUncertainty:I

    iget p1, p1, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->rotationAngleUncertainty:I

    if-ne v1, p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public getImageFormat()I
    .locals 1

    .line 147
    iget v0, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->imageFormat:I

    return v0
.end method

.method public getImageNumber()I
    .locals 1

    .line 156
    iget v0, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->imageNumber:I

    return v0
.end method

.method public getQuality()I
    .locals 1

    .line 165
    iget v0, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->quality:I

    return v0
.end method

.method public getRecordLength()J
    .locals 4

    .line 192
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->getImageLength()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0xb

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public getRotationAngle()I
    .locals 1

    .line 174
    iget v0, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->rotationAngle:I

    return v0
.end method

.method public getRotationAngleUncertainty()I
    .locals 1

    .line 183
    iget v0, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->rotationAngleUncertainty:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 198
    invoke-super {p0}, Lorg/jmrtd/lds/AbstractImageInfo;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 199
    iget v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->imageFormat:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 200
    iget v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->imageNumber:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 201
    iget v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->quality:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 202
    iget v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->rotationAngle:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 203
    iget v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->rotationAngleUncertainty:I

    add-int/2addr v0, v1

    return v0
.end method

.method protected readObject(Ljava/io/InputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 249
    instance-of v0, p1, Ljava/io/DataInputStream;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/io/DataInputStream;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 251
    :goto_0
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v1

    iput v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->imageNumber:I

    .line 252
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v1

    iput v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->quality:I

    .line 262
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readShort()S

    move-result v1

    iput v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->rotationAngle:I

    .line 272
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v1

    iput v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->rotationAngleUncertainty:I

    .line 277
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    .line 279
    invoke-virtual {p0, p1, v0, v1}, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->readImage(Ljava/io/InputStream;J)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 236
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IrisImageInfo [image number: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    iget v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->imageNumber:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", quality: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 239
    iget v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->quality:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", image: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 241
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->getHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "mime-type: "

    .line 242
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->imageFormat:I

    invoke-static {v1}, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->getMimeTypeFromImageFormat(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    .line 243
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 244
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected writeObject(Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 285
    instance-of v0, p1, Ljava/io/DataOutputStream;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/io/DataOutputStream;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-direct {v0, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object p1, v0

    .line 287
    :goto_0
    iget v0, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->imageNumber:I

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 288
    iget v0, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->quality:I

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 298
    iget v0, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->rotationAngle:I

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 308
    iget v0, p0, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->rotationAngleUncertainty:I

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 310
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->getImageLength()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 311
    invoke-virtual {p0, p1}, Lorg/jmrtd/lds/iso19794/IrisImageInfo;->writeImage(Ljava/io/OutputStream;)V

    return-void
.end method
