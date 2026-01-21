.class public Lorg/jmrtd/DefaultFileSystem;
.super Ljava/lang/Object;
.source "DefaultFileSystem.java"

# interfaces
.implements Lnet/sf/scuba/smartcards/FileSystemStructured;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;
    }
.end annotation


# static fields
.field private static final LOGGER:Ljava/util/logging/Logger;

.field public static final NO_SFI:I = -0x1

.field private static final READ_AHEAD_LENGTH:I = 0x8


# instance fields
.field private fidToSFI:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Short;",
            "Ljava/lang/Byte;",
            ">;"
        }
    .end annotation
.end field

.field private fileInfos:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Short;",
            "Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;",
            ">;"
        }
    .end annotation
.end field

.field private isSFIEnabled:Z

.field private isSelected:Z

.field private selectedFID:S

.field private service:Lorg/jmrtd/APDULevelReadBinaryCapable;

.field private wrapper:Lnet/sf/scuba/smartcards/APDUWrapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 61
    const-string v0, "org.jmrtd"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/DefaultFileSystem;->LOGGER:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lorg/jmrtd/APDULevelReadBinaryCapable;Z)V
    .locals 1

    .line 92
    sget-object v0, Lorg/jmrtd/lds/LDSFileUtil;->FID_TO_SFI:Ljava/util/Map;

    invoke-direct {p0, p1, p2, v0}, Lorg/jmrtd/DefaultFileSystem;-><init>(Lorg/jmrtd/APDULevelReadBinaryCapable;ZLjava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Lorg/jmrtd/APDULevelReadBinaryCapable;ZLjava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jmrtd/APDULevelReadBinaryCapable;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/Short;",
            "Ljava/lang/Byte;",
            ">;)V"
        }
    .end annotation

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    iput-object p1, p0, Lorg/jmrtd/DefaultFileSystem;->service:Lorg/jmrtd/APDULevelReadBinaryCapable;

    .line 104
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lorg/jmrtd/DefaultFileSystem;->fileInfos:Ljava/util/Map;

    const/4 p1, 0x0

    .line 105
    iput-short p1, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    .line 106
    iput-boolean p1, p0, Lorg/jmrtd/DefaultFileSystem;->isSelected:Z

    .line 107
    iput-boolean p2, p0, Lorg/jmrtd/DefaultFileSystem;->isSFIEnabled:Z

    .line 108
    iput-object p3, p0, Lorg/jmrtd/DefaultFileSystem;->fidToSFI:Ljava/util/Map;

    return-void
.end method

.method private declared-synchronized getFileInfo()Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    const-string v0, "Short file "

    const-string v1, "Unknown FID "

    const-string v2, "Something is wrong with prefix, prefix = "

    const-string v3, "Error getting file info for "

    monitor-enter p0

    .line 245
    :try_start_0
    iget-short v4, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    if-lez v4, :cond_8

    .line 249
    iget-object v5, p0, Lorg/jmrtd/DefaultFileSystem;->fileInfos:Ljava/util/Map;

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v4, :cond_0

    .line 253
    monitor-exit p0

    return-object v4

    .line 263
    :cond_0
    :try_start_1
    iget-boolean v4, p0, Lorg/jmrtd/DefaultFileSystem;->isSFIEnabled:Z

    const/4 v5, 0x1

    const/16 v6, 0x8

    const/4 v7, 0x0

    if-eqz v4, :cond_2

    .line 264
    iget-object v4, p0, Lorg/jmrtd/DefaultFileSystem;->fidToSFI:Ljava/util/Map;

    iget-short v8, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    invoke-static {v8}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Byte;

    if-eqz v4, :cond_1

    .line 268
    invoke-virtual {v4}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/lit16 v1, v1, 0x80

    invoke-virtual {p0, v1, v7, v6, v7}, Lorg/jmrtd/DefaultFileSystem;->sendReadBinary(IIIZ)[B

    move-result-object v1

    .line 269
    iput-boolean v5, p0, Lorg/jmrtd/DefaultFileSystem;->isSelected:Z

    goto :goto_0

    .line 266
    :cond_1
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-short v1, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 271
    :cond_2
    iget-boolean v1, p0, Lorg/jmrtd/DefaultFileSystem;->isSelected:Z

    if-nez v1, :cond_3

    .line 272
    iget-short v1, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    invoke-virtual {p0, v1}, Lorg/jmrtd/DefaultFileSystem;->sendSelectFile(S)V

    .line 273
    iput-boolean v5, p0, Lorg/jmrtd/DefaultFileSystem;->isSelected:Z

    .line 275
    :cond_3
    invoke-virtual {p0, v7, v6, v7}, Lorg/jmrtd/DefaultFileSystem;->sendReadBinary(IIZ)[B

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_7

    .line 277
    array-length v4, v1

    if-nez v4, :cond_4

    goto :goto_2

    .line 282
    :cond_4
    array-length v2, v1

    if-ge v2, v6, :cond_5

    .line 284
    array-length v1, v1

    .line 285
    sget-object v2, Lorg/jmrtd/DefaultFileSystem;->LOGGER:Ljava/util/logging/Logger;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-short v0, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, " with length: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    .line 286
    new-instance v0, Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;

    iget-short v2, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    invoke-direct {v0, v2, v1}, Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;-><init>(SI)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p0

    return-object v0

    .line 289
    :cond_5
    :try_start_2
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 290
    new-instance v2, Lnet/sf/scuba/tlv/TLVInputStream;

    invoke-direct {v2, v0}, Lnet/sf/scuba/tlv/TLVInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 293
    :try_start_3
    invoke-virtual {v2}, Lnet/sf/scuba/tlv/TLVInputStream;->readTag()I

    move-result v4

    const/16 v5, 0x42

    if-ne v4, v5, :cond_6

    const/16 v0, 0x24

    goto :goto_1

    .line 297
    :cond_6
    invoke-virtual {v2}, Lnet/sf/scuba/tlv/TLVInputStream;->readLength()I

    move-result v4

    .line 298
    array-length v5, v1

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    sub-int/2addr v5, v0

    add-int v0, v5, v4

    .line 301
    :goto_1
    new-instance v4, Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;

    iget-short v5, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    invoke-direct {v4, v5, v0}, Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;-><init>(SI)V

    .line 302
    invoke-virtual {v4, v7, v1}, Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;->addFragment(I[B)V

    .line 303
    iget-object v0, p0, Lorg/jmrtd/DefaultFileSystem;->fileInfos:Ljava/util/Map;

    iget-short v1, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 306
    :try_start_4
    invoke-virtual {v2}, Lnet/sf/scuba/tlv/TLVInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 304
    monitor-exit p0

    return-object v4

    :catchall_0
    move-exception v0

    .line 306
    :try_start_5
    invoke-virtual {v2}, Lnet/sf/scuba/tlv/TLVInputStream;->close()V

    .line 307
    throw v0

    .line 278
    :cond_7
    :goto_2
    sget-object v0, Lorg/jmrtd/DefaultFileSystem;->LOGGER:Ljava/util/logging/Logger;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 279
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :catch_0
    move-exception v0

    .line 309
    :try_start_6
    new-instance v1, Lnet/sf/scuba/smartcards/CardServiceException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-short v3, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 246
    :cond_8
    new-instance v0, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string v1, "No file selected"

    invoke-direct {v0, v1}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v0
.end method


# virtual methods
.method public declared-synchronized getSelectedPath()[Lnet/sf/scuba/smartcards/FileInfo;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    monitor-enter p0

    .line 129
    :try_start_0
    invoke-direct {p0}, Lorg/jmrtd/DefaultFileSystem;->getFileInfo()Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 131
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x1

    .line 133
    :try_start_1
    new-array v1, v1, [Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;

    const/4 v2, 0x0

    aput-object v0, v1, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public declared-synchronized readBinary(II)[B
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    const-string v0, "Unknown FID "

    const-string v1, "Read binary failed on file "

    const-string v2, "Read binary failed on file "

    monitor-enter p0

    const/4 v3, 0x0

    .line 170
    :try_start_0
    iget-short v4, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    if-lez v4, :cond_8

    .line 175
    invoke-direct {p0}, Lorg/jmrtd/DefaultFileSystem;->getFileInfo()Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 179
    invoke-virtual {v3, p1, p2}, Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;->getSmallestUnbufferedFragment(II)Lorg/jmrtd/io/FragmentBuffer$Fragment;

    move-result-object v4

    .line 184
    invoke-virtual {v4}, Lorg/jmrtd/io/FragmentBuffer$Fragment;->getLength()I

    move-result v5

    const/4 v6, 0x0

    if-lez v5, :cond_6

    .line 185
    iget-boolean p2, p0, Lorg/jmrtd/DefaultFileSystem;->isSFIEnabled:Z

    const/4 v5, 0x1

    if-eqz p2, :cond_1

    const/16 p2, 0x100

    if-ge p1, p2, :cond_1

    .line 186
    iget-object p2, p0, Lorg/jmrtd/DefaultFileSystem;->fidToSFI:Ljava/util/Map;

    iget-short v7, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    invoke-static {v7}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v7

    invoke-interface {p2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Byte;

    if-eqz p2, :cond_0

    .line 190
    invoke-virtual {p2}, Ljava/lang/Byte;->byteValue()B

    move-result p2

    and-int/lit16 p2, p2, 0xff

    or-int/lit16 p2, p2, 0x80

    invoke-virtual {v4}, Lorg/jmrtd/io/FragmentBuffer$Fragment;->getOffset()I

    move-result v0

    invoke-virtual {v4}, Lorg/jmrtd/io/FragmentBuffer$Fragment;->getLength()I

    move-result v7

    invoke-virtual {p0, p2, v0, v7, v6}, Lorg/jmrtd/DefaultFileSystem;->sendReadBinary(IIIZ)[B

    move-result-object p2

    .line 191
    iput-boolean v5, p0, Lorg/jmrtd/DefaultFileSystem;->isSelected:Z

    goto :goto_1

    .line 188
    :cond_0
    new-instance p1, Ljava/lang/NumberFormatException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-short v0, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 193
    :cond_1
    iget-boolean p2, p0, Lorg/jmrtd/DefaultFileSystem;->isSelected:Z

    if-nez p2, :cond_2

    .line 194
    iget-short p2, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    invoke-virtual {p0, p2}, Lorg/jmrtd/DefaultFileSystem;->sendSelectFile(S)V

    .line 195
    iput-boolean v5, p0, Lorg/jmrtd/DefaultFileSystem;->isSelected:Z

    .line 197
    :cond_2
    invoke-virtual {v4}, Lorg/jmrtd/io/FragmentBuffer$Fragment;->getOffset()I

    move-result p2

    invoke-virtual {v4}, Lorg/jmrtd/io/FragmentBuffer$Fragment;->getLength()I

    move-result v0

    const/16 v7, 0x7fff

    if-le p1, v7, :cond_3

    goto :goto_0

    :cond_3
    move v5, v6

    :goto_0
    invoke-virtual {p0, p2, v0, v5}, Lorg/jmrtd/DefaultFileSystem;->sendReadBinary(IIZ)[B

    move-result-object p2

    :goto_1
    if-eqz p2, :cond_5

    .line 204
    array-length v0, p2

    if-lez v0, :cond_4

    .line 206
    invoke-virtual {v4}, Lorg/jmrtd/io/FragmentBuffer$Fragment;->getOffset()I

    move-result v0

    invoke-virtual {v3, v0, p2}, Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;->addFragment(I[B)V

    .line 218
    :cond_4
    array-length p2, p2

    goto :goto_2

    .line 201
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not read bytes"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 222
    :cond_6
    :goto_2
    invoke-virtual {v3}, Lorg/jmrtd/DefaultFileSystem$DefaultFileInfo;->getBuffer()[B

    move-result-object v0

    .line 224
    new-array v4, p2, [B

    .line 225
    invoke-static {v0, p1, v4, v6, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Lnet/sf/scuba/smartcards/CardServiceException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 227
    monitor-exit p0

    return-object v4

    .line 177
    :cond_7
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Could not get file info"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 171
    :cond_8
    new-instance p1, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string p2, "No file selected"

    invoke-direct {p1, p2}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Lnet/sf/scuba/smartcards/CardServiceException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 231
    :try_start_2
    new-instance p2, Lnet/sf/scuba/smartcards/CardServiceException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez v3, :cond_9

    iget-short v1, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    :cond_9
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 229
    new-instance p2, Lnet/sf/scuba/smartcards/CardServiceException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez v3, :cond_a

    iget-short v1, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    :cond_a
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lnet/sf/scuba/smartcards/CardServiceException;->getSW()I

    move-result v1

    invoke-direct {p2, v0, p1, v1}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;I)V

    throw p2

    :goto_3
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized selectFile(S)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    monitor-enter p0

    .line 149
    :try_start_0
    iget-short v0, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, p1, :cond_0

    .line 150
    monitor-exit p0

    return-void

    .line 153
    :cond_0
    :try_start_1
    iput-short p1, p0, Lorg/jmrtd/DefaultFileSystem;->selectedFID:S

    const/4 p1, 0x0

    .line 154
    iput-boolean p1, p0, Lorg/jmrtd/DefaultFileSystem;->isSelected:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized sendReadBinary(IIIZ)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    monitor-enter p0

    .line 354
    :try_start_0
    iget-object v0, p0, Lorg/jmrtd/DefaultFileSystem;->service:Lorg/jmrtd/APDULevelReadBinaryCapable;

    iget-object v1, p0, Lorg/jmrtd/DefaultFileSystem;->wrapper:Lnet/sf/scuba/smartcards/APDUWrapper;

    const/4 v5, 0x1

    move v2, p1

    move v3, p2

    move v4, p3

    move v6, p4

    invoke-interface/range {v0 .. v6}, Lorg/jmrtd/APDULevelReadBinaryCapable;->sendReadBinary(Lnet/sf/scuba/smartcards/APDUWrapper;IIIZZ)[B

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized sendReadBinary(IIZ)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    monitor-enter p0

    .line 337
    :try_start_0
    iget-object v0, p0, Lorg/jmrtd/DefaultFileSystem;->service:Lorg/jmrtd/APDULevelReadBinaryCapable;

    iget-object v1, p0, Lorg/jmrtd/DefaultFileSystem;->wrapper:Lnet/sf/scuba/smartcards/APDUWrapper;

    const/4 v2, -0x1

    const/4 v5, 0x0

    move v3, p1

    move v4, p2

    move v6, p3

    invoke-interface/range {v0 .. v6}, Lorg/jmrtd/APDULevelReadBinaryCapable;->sendReadBinary(Lnet/sf/scuba/smartcards/APDUWrapper;IIIZZ)[B

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized sendSelectFile(S)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    monitor-enter p0

    .line 321
    :try_start_0
    iget-object v0, p0, Lorg/jmrtd/DefaultFileSystem;->service:Lorg/jmrtd/APDULevelReadBinaryCapable;

    iget-object v1, p0, Lorg/jmrtd/DefaultFileSystem;->wrapper:Lnet/sf/scuba/smartcards/APDUWrapper;

    invoke-interface {v0, v1, p1}, Lorg/jmrtd/APDULevelReadBinaryCapable;->sendSelectFile(Lnet/sf/scuba/smartcards/APDUWrapper;S)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 322
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public setWrapper(Lnet/sf/scuba/smartcards/APDUWrapper;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lorg/jmrtd/DefaultFileSystem;->wrapper:Lnet/sf/scuba/smartcards/APDUWrapper;

    return-void
.end method
