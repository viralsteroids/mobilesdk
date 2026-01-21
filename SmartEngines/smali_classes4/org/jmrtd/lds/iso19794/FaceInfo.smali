.class public Lorg/jmrtd/lds/iso19794/FaceInfo;
.super Lorg/jmrtd/lds/AbstractListInfo;
.source "FaceInfo.java"

# interfaces
.implements Lorg/jmrtd/cbeff/BiometricDataBlock;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jmrtd/lds/AbstractListInfo<",
        "Lorg/jmrtd/lds/iso19794/FaceImageInfo;",
        ">;",
        "Lorg/jmrtd/cbeff/BiometricDataBlock;"
    }
.end annotation


# static fields
.field private static final FORMAT_IDENTIFIER:I = 0x46414300

.field private static final FORMAT_OWNER_VALUE:I = 0x101

.field private static final FORMAT_TYPE_VALUE:I = 0x8

.field private static final LOGGER:Ljava/util/logging/Logger;

.field private static final VERSION_NUMBER:I = 0x30313000

.field private static final serialVersionUID:J = -0x54014f0654c74495L


# instance fields
.field private sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 60
    const-string v0, "org.jmrtd"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceInfo;->LOGGER:Ljava/util/logging/Logger;

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

    .line 108
    invoke-direct {p0, v0, p1}, Lorg/jmrtd/lds/iso19794/FaceInfo;-><init>(Lorg/jmrtd/cbeff/StandardBiometricHeader;Ljava/io/InputStream;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/jmrtd/lds/iso19794/FaceImageInfo;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 86
    invoke-direct {p0, v0, p1}, Lorg/jmrtd/lds/iso19794/FaceInfo;-><init>(Lorg/jmrtd/cbeff/StandardBiometricHeader;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lorg/jmrtd/cbeff/StandardBiometricHeader;Ljava/io/InputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 119
    invoke-direct {p0}, Lorg/jmrtd/lds/AbstractListInfo;-><init>()V

    .line 120
    iput-object p1, p0, Lorg/jmrtd/lds/iso19794/FaceInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    .line 121
    invoke-virtual {p0, p2}, Lorg/jmrtd/lds/iso19794/FaceInfo;->readObject(Ljava/io/InputStream;)V

    return-void
.end method

.method public constructor <init>(Lorg/jmrtd/cbeff/StandardBiometricHeader;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jmrtd/cbeff/StandardBiometricHeader;",
            "Ljava/util/List<",
            "Lorg/jmrtd/lds/iso19794/FaceImageInfo;",
            ">;)V"
        }
    .end annotation

    .line 95
    invoke-direct {p0}, Lorg/jmrtd/lds/AbstractListInfo;-><init>()V

    .line 96
    iput-object p1, p0, Lorg/jmrtd/lds/iso19794/FaceInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    .line 97
    invoke-virtual {p0, p2}, Lorg/jmrtd/lds/iso19794/FaceInfo;->addAll(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public addFaceImageInfo(Lorg/jmrtd/lds/iso19794/FaceImageInfo;)V
    .locals 0

    .line 286
    invoke-virtual {p0, p1}, Lorg/jmrtd/lds/iso19794/FaceInfo;->add(Ljava/io/Serializable;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 323
    :cond_0
    invoke-super {p0, p1}, Lorg/jmrtd/lds/AbstractListInfo;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 326
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    .line 330
    :cond_2
    check-cast p1, Lorg/jmrtd/lds/iso19794/FaceInfo;

    .line 331
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    if-nez v1, :cond_4

    .line 332
    iget-object p1, p1, Lorg/jmrtd/lds/iso19794/FaceInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    if-nez p1, :cond_3

    return v0

    :cond_3
    return v2

    .line 335
    :cond_4
    iget-object p1, p1, Lorg/jmrtd/lds/iso19794/FaceInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    if-eq v1, p1, :cond_6

    invoke-virtual {v1, p1}, Lorg/jmrtd/cbeff/StandardBiometricHeader;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    return v2

    :cond_6
    :goto_0
    return v0
.end method

.method public getFaceImageInfos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jmrtd/lds/iso19794/FaceImageInfo;",
            ">;"
        }
    .end annotation

    .line 277
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/FaceInfo;->getSubRecords()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStandardBiometricHeader()Lorg/jmrtd/cbeff/StandardBiometricHeader;
    .locals 6

    .line 255
    iget-object v0, p0, Lorg/jmrtd/lds/iso19794/FaceInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 256
    new-array v1, v0, [B

    const/4 v2, 0x0

    const/4 v3, 0x2

    aput-byte v3, v1, v2

    .line 257
    new-array v0, v0, [B

    aput-byte v2, v0, v2

    .line 258
    new-array v2, v3, [B

    fill-array-data v2, :array_0

    .line 259
    new-array v3, v3, [B

    fill-array-data v3, :array_1

    .line 261
    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    const/16 v5, 0x81

    .line 262
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5, v1}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x82

    .line 263
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v1, v0}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x87

    .line 264
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0, v2}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x88

    .line 265
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0, v3}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    new-instance v0, Lorg/jmrtd/cbeff/StandardBiometricHeader;

    invoke-direct {v0, v4}, Lorg/jmrtd/cbeff/StandardBiometricHeader;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lorg/jmrtd/lds/iso19794/FaceInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    .line 268
    :cond_0
    iget-object v0, p0, Lorg/jmrtd/lds/iso19794/FaceInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    return-object v0

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x0t
        0x8t
    .end array-data
.end method

.method public hashCode()I
    .locals 2

    .line 313
    invoke-super {p0}, Lorg/jmrtd/lds/AbstractListInfo;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 314
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceInfo;->sbh:Lorg/jmrtd/cbeff/StandardBiometricHeader;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lorg/jmrtd/cbeff/StandardBiometricHeader;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public readObject(Ljava/io/InputStream;)V
    .locals 25
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 132
    instance-of v2, v1, Ljava/io/DataInputStream;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ljava/io/DataInputStream;

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/io/DataInputStream;

    invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 136
    :goto_0
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    const v4, 0x46414300    # 12368.75f

    const/4 v5, 0x0

    if-eq v3, v4, :cond_3

    .line 138
    sget-object v4, Lorg/jmrtd/lds/iso19794/FaceInfo;->LOGGER:Ljava/util/logging/Logger;

    sget-object v6, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "\'FAC\' marker expected! Found "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    const/16 v4, 0xc

    if-ne v3, v4, :cond_3

    .line 144
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 145
    new-instance v4, Ljava/io/DataOutputStream;

    invoke-direct {v4, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 146
    invoke-virtual {v4, v3}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 148
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readShort()S

    move-result v3

    .line 150
    invoke-virtual {v4, v3}, Ljava/io/DataOutputStream;->writeShort(I)V

    move v4, v5

    :goto_1
    if-ge v4, v3, :cond_2

    const/16 v6, 0x800

    .line 154
    new-array v6, v6, [B

    .line 155
    invoke-virtual {v2, v6}, Ljava/io/DataInputStream;->read([B)I

    move-result v7

    if-gez v7, :cond_1

    goto :goto_2

    .line 159
    :cond_1
    invoke-virtual {v1, v6}, Ljava/io/ByteArrayOutputStream;->write([B)V

    add-int/2addr v4, v7

    goto :goto_1

    .line 164
    :cond_2
    :goto_2
    new-instance v6, Lorg/jmrtd/lds/iso19794/FaceImageInfo;

    sget-object v7, Lnet/sf/scuba/data/Gender;->UNKNOWN:Lnet/sf/scuba/data/Gender;

    sget-object v8, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->UNSPECIFIED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    filled-new-array {v5, v5, v5}, [I

    move-result-object v12

    filled-new-array {v5, v5, v5}, [I

    move-result-object v13

    new-array v2, v5, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

    new-instance v4, Ljava/io/ByteArrayInputStream;

    .line 178
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-direct {v4, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const/16 v24, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v19, v2

    move/from16 v23, v3

    move-object/from16 v22, v4

    invoke-direct/range {v6 .. v24}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;-><init>(Lnet/sf/scuba/data/Gender;Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;III[I[IIIIII[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;IILjava/io/InputStream;II)V

    .line 179
    invoke-virtual {v0, v6}, Lorg/jmrtd/lds/iso19794/FaceInfo;->add(Ljava/io/Serializable;)V

    return-void

    .line 184
    :cond_3
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    const v4, 0x30313000

    if-ne v3, v4, :cond_6

    .line 189
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    int-to-long v3, v3

    const-wide v6, 0xffffffffL

    and-long/2addr v3, v6

    const-wide/16 v6, 0xe

    sub-long/2addr v3, v6

    .line 195
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    const-wide/16 v6, 0x0

    :goto_3
    if-ge v5, v2, :cond_4

    .line 198
    new-instance v8, Lorg/jmrtd/lds/iso19794/FaceImageInfo;

    invoke-direct {v8, v1}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;-><init>(Ljava/io/InputStream;)V

    .line 199
    invoke-virtual {v8}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->getRecordLength()J

    move-result-wide v9

    add-long/2addr v6, v9

    .line 200
    invoke-virtual {v0, v8}, Lorg/jmrtd/lds/iso19794/FaceInfo;->add(Ljava/io/Serializable;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_4
    cmp-long v1, v3, v6

    if-eqz v1, :cond_5

    .line 203
    sget-object v1, Lorg/jmrtd/lds/iso19794/FaceInfo;->LOGGER:Ljava/util/logging/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "ConstructedDataLength and dataLength differ: dataLength = "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", constructedDataLength = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    :cond_5
    return-void

    .line 186
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "\'010\' version number expected! Found "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public removeFaceImageInfo(I)V
    .locals 0

    .line 295
    invoke-virtual {p0, p1}, Lorg/jmrtd/lds/iso19794/FaceInfo;->remove(I)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 300
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FaceInfo ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 302
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/FaceInfo;->getSubRecords()Ljava/util/List;

    move-result-object v1

    .line 303
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/jmrtd/lds/iso19794/FaceImageInfo;

    .line 304
    invoke-virtual {v2}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 306
    :cond_0
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
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

    .line 221
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/FaceInfo;->getSubRecords()Ljava/util/List;

    move-result-object v0

    .line 222
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/jmrtd/lds/iso19794/FaceImageInfo;

    .line 223
    invoke-virtual {v4}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->getRecordLength()J

    move-result-wide v4

    add-long/2addr v2, v4

    goto :goto_0

    :cond_0
    const/16 v1, 0xe

    int-to-long v4, v1

    add-long/2addr v4, v2

    .line 228
    instance-of v1, p1, Ljava/io/DataOutputStream;

    if-eqz v1, :cond_1

    check-cast p1, Ljava/io/DataOutputStream;

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object p1, v1

    :goto_1
    const v1, 0x46414300    # 12368.75f

    .line 230
    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    const v1, 0x30313000

    .line 231
    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    const-wide v1, 0xffffffffL

    and-long/2addr v1, v4

    long-to-int v1, v1

    .line 239
    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 242
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 244
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;

    .line 245
    invoke-virtual {v1, p1}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->writeObject(Ljava/io/OutputStream;)V

    goto :goto_2

    :cond_2
    return-void
.end method
