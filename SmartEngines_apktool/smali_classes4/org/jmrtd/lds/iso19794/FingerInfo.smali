.class public Lorg/jmrtd/lds/iso19794/FingerInfo;
.super Lorg/jmrtd/lds/AbstractListInfo;
.source "FingerInfo.java"

# interfaces
.implements Lorg/jmrtd/cbeff/BiometricDataBlock;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jmrtd/lds/AbstractListInfo<",
        "Lorg/jmrtd/lds/iso19794/FingerImageInfo;",
        ">;",
        "Lorg/jmrtd/cbeff/BiometricDataBlock;"
    }
.end annotation


# static fields
.field public static final COMPRESSION_JPEG:I = 0x3

.field public static final COMPRESSION_JPEG2000:I = 0x4

.field public static final COMPRESSION_PNG:I = 0x5

.field public static final COMPRESSION_UNCOMPRESSED_BIT_PACKED:I = 0x1

.field public static final COMPRESSION_UNCOMPRESSED_NO_BIT_PACKING:I = 0x0

.field public static final COMPRESSION_WSQ:I = 0x2

.field private static final FORMAT_IDENTIFIER:I = 0x46495200

.field private static final FORMAT_OWNER_VALUE:I = 0x101

.field private static final FORMAT_TYPE_VALUE:I = 0x7

.field private static final LOGGER:Ljava/util/logging/Logger;

.field public static final SCALE_UNITS_PPCM:I = 0x2

.field public static final SCALE_UNITS_PPI:I = 0x1

.field private static final VERSION_NUMBER:I = 0x30313000

.field private static final serialVersionUID:J = 0x509c61b7018cc070L


# instance fields
.field private acquisitionLevel:I

.field private captureDeviceId:I

.field private compressionAlgorithm:I

.field private depth:I

.field private imageResolutionHorizontal:I

.field private imageResolutionVertical:I

.field private sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

.field private scaleUnits:I

.field private scanResolutionHorizontal:I

.field private scanResolutionVertical:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 53
    const-string v0, "org.jmrtd"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/lds/iso19794/FingerInfo;->LOGGER:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(IIIIIIIIILjava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIIIIIII",
            "Ljava/util/List<",
            "Lorg/jmrtd/lds/iso19794/FingerImageInfo;",
            ">;)V"
        }
    .end annotation

    const/4 v1, 0x0

    move-object v0, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    .line 125
    invoke-direct/range {v0 .. v11}, Lorg/jmrtd/lds/iso19794/FingerInfo;-><init>(Lorg/jmrtd/cbeff/StandardBiometricHeader;IIIIIIIIILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 173
    invoke-direct {p0, v0, p1}, Lorg/jmrtd/lds/iso19794/FingerInfo;-><init>(Lorg/jmrtd/cbeff/StandardBiometricHeader;Ljava/io/InputStream;)V

    return-void
.end method

.method public constructor <init>(Lorg/jmrtd/cbeff/StandardBiometricHeader;IIIIIIIIILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jmrtd/cbeff/StandardBiometricHeader;",
            "IIIIIIIII",
            "Ljava/util/List<",
            "Lorg/jmrtd/lds/iso19794/FingerImageInfo;",
            ">;)V"
        }
    .end annotation

    .line 151
    invoke-direct {p0}, Lorg/jmrtd/lds/AbstractListInfo;-><init>()V

    .line 152
    iput-object p1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    .line 153
    iput p2, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->captureDeviceId:I

    .line 154
    iput p3, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->acquisitionLevel:I

    .line 155
    iput p4, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scaleUnits:I

    .line 156
    iput p5, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scanResolutionHorizontal:I

    .line 157
    iput p6, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scanResolutionVertical:I

    .line 158
    iput p7, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->imageResolutionHorizontal:I

    .line 159
    iput p8, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->imageResolutionVertical:I

    .line 160
    iput p9, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->depth:I

    .line 161
    iput p10, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->compressionAlgorithm:I

    .line 162
    invoke-virtual {p0, p11}, Lorg/jmrtd/lds/iso19794/FingerInfo;->addAll(Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lorg/jmrtd/cbeff/StandardBiometricHeader;Ljava/io/InputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 184
    invoke-direct {p0}, Lorg/jmrtd/lds/AbstractListInfo;-><init>()V

    .line 185
    iput-object p1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    .line 186
    invoke-virtual {p0, p2}, Lorg/jmrtd/lds/iso19794/FingerInfo;->readObject(Ljava/io/InputStream;)V

    return-void
.end method

.method static fromMimeType(Ljava/lang/String;)I
    .locals 1

    .line 596
    const-string v0, "image/x-wsq"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x2

    return p0

    .line 599
    :cond_0
    const-string v0, "image/jpeg"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x3

    return p0

    .line 602
    :cond_1
    const-string v0, "image/jpeg2000"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x4

    return p0

    .line 605
    :cond_2
    const-string v0, "images/png"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, 0x5

    return p0

    .line 609
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Did not recognize mimeType"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private getBiometricSubtype()I
    .locals 5

    .line 620
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/FingerInfo;->getSubRecords()Ljava/util/List;

    move-result-object v0

    .line 621
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move v3, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/jmrtd/lds/iso19794/FingerImageInfo;

    .line 622
    invoke-virtual {v4}, Lorg/jmrtd/lds/iso19794/FingerImageInfo;->getBiometricSubtype()I

    move-result v4

    if-eqz v2, :cond_0

    move v2, v1

    move v3, v4

    goto :goto_0

    :cond_0
    and-int/2addr v3, v4

    goto :goto_0

    :cond_1
    return v3
.end method

.method private static readUnsignedLong(Ljava/io/InputStream;I)J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 512
    instance-of v0, p0, Ljava/io/DataInputStream;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/io/DataInputStream;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    move-object p0, v0

    .line 513
    :goto_0
    new-array v0, p1, [B

    .line 514
    invoke-virtual {p0, v0}, Ljava/io/DataInputStream;->readFully([B)V

    const-wide/16 v1, 0x0

    const/4 p0, 0x0

    :goto_1
    if-ge p0, p1, :cond_1

    const/16 v3, 0x8

    shl-long/2addr v1, v3

    .line 518
    aget-byte v3, v0, p0

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    add-long/2addr v1, v3

    add-int/lit8 p0, p0, 0x1

    goto :goto_1

    :cond_1
    return-wide v1
.end method

.method static toMimeType(I)Ljava/lang/String;
    .locals 2

    .line 570
    const-string v0, "image/raw"

    if-eqz p0, :cond_4

    const/4 v1, 0x1

    if-eq p0, v1, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 582
    :cond_0
    const-string p0, "image/png"

    return-object p0

    .line 580
    :cond_1
    const-string p0, "image/jpeg2000"

    return-object p0

    .line 578
    :cond_2
    const-string p0, "image/jpeg"

    return-object p0

    .line 576
    :cond_3
    const-string p0, "image/x-wsq"

    return-object p0

    :cond_4
    return-object v0
.end method

.method private static writeLong(JLjava/io/OutputStream;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-gtz p3, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    add-int/lit8 v2, p3, -0x8

    if-ge v1, v2, :cond_1

    .line 538
    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/16 v0, 0x8

    if-le p3, v0, :cond_2

    move p3, v0

    :cond_2
    add-int/lit8 p3, p3, -0x1

    :goto_1
    if-ltz p3, :cond_3

    mul-int/lit8 v0, p3, 0x8

    const-wide/16 v1, 0xff

    shl-long/2addr v1, v0

    and-long/2addr v1, p0

    shr-long v0, v1, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    .line 546
    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 p3, p3, -0x1

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public addFingerImageInfo(Lorg/jmrtd/lds/iso19794/FingerImageInfo;)V
    .locals 0

    .line 487
    invoke-virtual {p0, p1}, Lorg/jmrtd/lds/iso19794/FingerInfo;->add(Ljava/io/Serializable;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 418
    :cond_0
    invoke-super {p0, p1}, Lorg/jmrtd/lds/AbstractListInfo;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 421
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    .line 425
    :cond_2
    check-cast p1, Lorg/jmrtd/lds/iso19794/FingerInfo;

    .line 426
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->acquisitionLevel:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FingerInfo;->acquisitionLevel:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->captureDeviceId:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FingerInfo;->captureDeviceId:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->compressionAlgorithm:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FingerInfo;->compressionAlgorithm:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->depth:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FingerInfo;->depth:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->imageResolutionHorizontal:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FingerInfo;->imageResolutionHorizontal:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->imageResolutionVertical:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FingerInfo;->imageResolutionVertical:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scaleUnits:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FingerInfo;->scaleUnits:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scanResolutionHorizontal:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FingerInfo;->scanResolutionHorizontal:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scanResolutionVertical:I

    iget p1, p1, Lorg/jmrtd/lds/iso19794/FingerInfo;->scanResolutionVertical:I

    if-ne v1, p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public getAcquisitionLevel()I
    .locals 1

    .line 206
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->acquisitionLevel:I

    return v0
.end method

.method public getCaptureDeviceId()I
    .locals 1

    .line 196
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->captureDeviceId:I

    return v0
.end method

.method public getCompressionAlgorithm()I
    .locals 1

    .line 287
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->compressionAlgorithm:I

    return v0
.end method

.method public getDepth()I
    .locals 1

    .line 270
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->depth:I

    return v0
.end method

.method public getFingerImageInfos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jmrtd/lds/iso19794/FingerImageInfo;",
            ">;"
        }
    .end annotation

    .line 478
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/FingerInfo;->getSubRecords()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getHorizontalImageResolution()I
    .locals 1

    .line 249
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->imageResolutionHorizontal:I

    return v0
.end method

.method public getHorizontalScanningResolution()I
    .locals 1

    .line 227
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scanResolutionHorizontal:I

    return v0
.end method

.method public getScaleUnits()I
    .locals 1

    .line 216
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scaleUnits:I

    return v0
.end method

.method public getStandardBiometricHeader()Lorg/jmrtd/cbeff/StandardBiometricHeader;
    .locals 6

    .line 455
    iget-object v0, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 456
    new-array v1, v0, [B

    const/16 v2, 0x8

    const/4 v3, 0x0

    aput-byte v2, v1, v3

    .line 457
    invoke-direct {p0}, Lorg/jmrtd/lds/iso19794/FingerInfo;->getBiometricSubtype()I

    move-result v2

    int-to-byte v2, v2

    new-array v0, v0, [B

    aput-byte v2, v0, v3

    const/4 v2, 0x2

    .line 458
    new-array v3, v2, [B

    fill-array-data v3, :array_0

    .line 459
    new-array v2, v2, [B

    fill-array-data v2, :array_1

    .line 461
    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    const/16 v5, 0x81

    .line 462
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5, v1}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x82

    .line 463
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v1, v0}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x87

    .line 464
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0, v3}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x88

    .line 465
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0, v2}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    new-instance v0, Lorg/jmrtd/cbeff/StandardBiometricHeader;

    invoke-direct {v0, v4}, Lorg/jmrtd/cbeff/StandardBiometricHeader;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    .line 469
    :cond_0
    iget-object v0, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    return-object v0

    nop

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x0t
        0x7t
    .end array-data
.end method

.method public getVerticalImageResolution()I
    .locals 1

    .line 260
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->imageResolutionVertical:I

    return v0
.end method

.method public getVerticalScanningResolution()I
    .locals 1

    .line 238
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scanResolutionVertical:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 399
    invoke-super {p0}, Lorg/jmrtd/lds/AbstractListInfo;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 400
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->acquisitionLevel:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 401
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->captureDeviceId:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 402
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->compressionAlgorithm:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 403
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->depth:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 404
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->imageResolutionHorizontal:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 405
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->imageResolutionVertical:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 406
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lorg/jmrtd/cbeff/StandardBiometricHeader;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 407
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scaleUnits:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 408
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scanResolutionHorizontal:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 409
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scanResolutionVertical:I

    add-int/2addr v0, v1

    return v0
.end method

.method public readObject(Ljava/io/InputStream;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 301
    instance-of v0, p1, Ljava/io/DataInputStream;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/io/DataInputStream;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 303
    :goto_0
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    const v2, 0x46495200    # 12884.5f

    if-ne v1, v2, :cond_4

    .line 308
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    const v2, 0x30313000

    if-ne v1, v2, :cond_3

    const/4 v1, 0x6

    .line 313
    invoke-static {v0, v1}, Lorg/jmrtd/lds/iso19794/FingerInfo;->readUnsignedLong(Ljava/io/InputStream;I)J

    move-result-wide v1

    .line 314
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v3

    iput v3, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->captureDeviceId:I

    .line 315
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v3

    iput v3, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->acquisitionLevel:I

    .line 316
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v3

    .line 317
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v4

    iput v4, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scaleUnits:I

    .line 318
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    iput v4, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scanResolutionHorizontal:I

    .line 319
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    iput v4, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scanResolutionVertical:I

    .line 320
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    iput v4, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->imageResolutionHorizontal:I

    .line 321
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    iput v4, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->imageResolutionVertical:I

    .line 322
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v4

    iput v4, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->depth:I

    .line 323
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v4

    iput v4, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->compressionAlgorithm:I

    .line 330
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    const-wide/16 v4, 0x20

    sub-long/2addr v1, v4

    const-wide/16 v4, 0x0

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v3, :cond_1

    .line 338
    new-instance v6, Lorg/jmrtd/lds/iso19794/FingerImageInfo;

    iget v7, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->compressionAlgorithm:I

    invoke-direct {v6, p1, v7}, Lorg/jmrtd/lds/iso19794/FingerImageInfo;-><init>(Ljava/io/InputStream;I)V

    .line 339
    invoke-virtual {v6}, Lorg/jmrtd/lds/iso19794/FingerImageInfo;->getRecordLength()J

    move-result-wide v7

    add-long/2addr v4, v7

    .line 340
    invoke-virtual {p0, v6}, Lorg/jmrtd/lds/iso19794/FingerInfo;->add(Ljava/io/Serializable;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    cmp-long p1, v1, v4

    if-eqz p1, :cond_2

    .line 343
    sget-object p1, Lorg/jmrtd/lds/iso19794/FingerInfo;->LOGGER:Ljava/util/logging/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "ConstructedDataLength and dataLength differ: dataLength = "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", constructedDataLength = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    :cond_2
    return-void

    .line 310
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "\'010\' version number expected! Found "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 305
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "\'FIR\' marker expected! Found "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public removeFingerImageInfo(I)V
    .locals 0

    .line 496
    invoke-virtual {p0, p1}, Lorg/jmrtd/lds/iso19794/FingerInfo;->remove(I)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 439
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FingerInfo ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 441
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/FingerInfo;->getSubRecords()Ljava/util/List;

    move-result-object v1

    .line 442
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jmrtd/lds/iso19794/FingerImageInfo;

    .line 443
    invoke-virtual {v2}, Lorg/jmrtd/lds/iso19794/FingerImageInfo;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 445
    :cond_0
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeObject(Ljava/io/OutputStream;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 362
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/FingerInfo;->getSubRecords()Ljava/util/List;

    move-result-object v0

    .line 363
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/jmrtd/lds/iso19794/FingerImageInfo;

    .line 364
    invoke-virtual {v4}, Lorg/jmrtd/lds/iso19794/FingerImageInfo;->getRecordLength()J

    move-result-wide v4

    add-long/2addr v2, v4

    goto :goto_0

    :cond_0
    const-wide/16 v4, 0x20

    add-long/2addr v4, v2

    .line 371
    instance-of v1, p1, Ljava/io/DataOutputStream;

    if-eqz v1, :cond_1

    check-cast p1, Ljava/io/DataOutputStream;

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object p1, v1

    :goto_1
    const v1, 0x46495200    # 12884.5f

    .line 373
    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    const v1, 0x30313000

    .line 374
    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    const/4 v1, 0x6

    .line 376
    invoke-static {v4, v5, p1, v1}, Lorg/jmrtd/lds/iso19794/FingerInfo;->writeLong(JLjava/io/OutputStream;I)V

    .line 378
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->captureDeviceId:I

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 379
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->acquisitionLevel:I

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 380
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 381
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scaleUnits:I

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 382
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scanResolutionHorizontal:I

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 383
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->scanResolutionVertical:I

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 384
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->imageResolutionHorizontal:I

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 385
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->imageResolutionVertical:I

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 386
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->depth:I

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 388
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FingerInfo;->compressionAlgorithm:I

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    const/4 v1, 0x0

    .line 389
    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 391
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jmrtd/lds/iso19794/FingerImageInfo;

    .line 392
    invoke-virtual {v1, p1}, Lorg/jmrtd/lds/iso19794/FingerImageInfo;->writeObject(Ljava/io/OutputStream;)V

    goto :goto_2

    :cond_2
    return-void
.end method
