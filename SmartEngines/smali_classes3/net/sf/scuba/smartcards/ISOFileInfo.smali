.class public Lnet/sf/scuba/smartcards/ISOFileInfo;
.super Lnet/sf/scuba/smartcards/FileInfo;
.source "ISOFileInfo.java"


# static fields
.field public static final A0:B = -0x60t

.field public static final A1:B = -0x5ft

.field public static final A2:B = -0x5et

.field public static final A5:B = -0x5bt

.field public static final AB:B = -0x55t

.field public static final AC:B = -0x54t

.field public static final CHANNEL_SECURITY:B = -0x72t

.field public static final DATA_BYTES1:B = -0x80t

.field public static final DATA_BYTES2:B = -0x7ft

.field public static final DF_NAME:B = -0x7ct

.field public static final ENV_TEMP_EF:B = -0x73t

.field public static final FCI_BYTE:B = 0x6ft

.field public static final FCI_EXT:B = -0x79t

.field public static final FCP_BYTE:B = 0x62t

.field public static final FILE_DESCRIPTOR:B = -0x7et

.field public static final FILE_IDENTIFIER:B = -0x7dt

.field public static final FMD_BYTE:B = 0x64t

.field public static final LCS_BYTE:B = -0x76t

.field public static final PROP_INFO:B = -0x7bt

.field public static final SECURITY_ATTR_COMPACT:B = -0x74t

.field public static final SECURITY_ATTR_EXP:B = -0x75t

.field public static final SECURITY_ATTR_PROP:B = -0x7at

.field public static final SHORT_EF:B = -0x78t


# instance fields
.field a0:[B

.field a1:[B

.field a2:[B

.field a5:[B

.field ab:[B

.field ac:[B

.field channelSecurity:B

.field dataCodingByte:B

.field descriptorByte:B

.field dfName:[B

.field envTempEF:S

.field fciExt:S

.field fid:S

.field fileLength:I

.field fileLengthFCI:I

.field lcsByte:B

.field mainTag:B

.field maxRecordSize:S

.field maxRecordsCount:S

.field propInfo:[B

.field secAttrCompact:[B

.field secAttrExp:[B

.field secAttrProp:[B

.field shortEF:B


# direct methods
.method public constructor <init>([B)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    .line 88
    invoke-direct {p0}, Lnet/sf/scuba/smartcards/FileInfo;-><init>()V

    const/4 v0, -0x1

    .line 63
    iput-byte v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->mainTag:B

    .line 64
    iput v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fileLength:I

    .line 65
    iput v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fileLengthFCI:I

    .line 66
    iput-byte v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->descriptorByte:B

    .line 67
    iput-byte v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->dataCodingByte:B

    .line 68
    iput-short v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->maxRecordSize:S

    .line 69
    iput-short v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->maxRecordsCount:S

    .line 70
    iput-short v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fid:S

    const/4 v1, 0x0

    .line 71
    iput-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->dfName:[B

    .line 72
    iput-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->propInfo:[B

    .line 73
    iput-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->secAttrProp:[B

    .line 74
    iput-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->secAttrExp:[B

    .line 75
    iput-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->secAttrCompact:[B

    .line 76
    iput-short v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fciExt:S

    .line 77
    iput-short v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->envTempEF:S

    .line 78
    iput-byte v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->shortEF:B

    .line 79
    iput-byte v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->lcsByte:B

    .line 80
    iput-byte v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->channelSecurity:B

    .line 81
    iput-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a0:[B

    .line 82
    iput-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a1:[B

    .line 83
    iput-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a2:[B

    .line 84
    iput-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a5:[B

    .line 85
    iput-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->ab:[B

    .line 86
    iput-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->ac:[B

    .line 89
    array-length v0, p1

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v0, 0x0

    .line 92
    aget-byte v1, p1, v0

    const/16 v2, 0x6f

    if-eq v1, v2, :cond_2

    const/16 v2, 0x62

    if-eq v1, v2, :cond_2

    const/16 v2, 0x64

    if-ne v1, v2, :cond_1

    goto :goto_0

    .line 93
    :cond_1
    new-instance p1, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string v0, "Malformed FCI data"

    invoke-direct {p1, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 95
    :cond_2
    :goto_0
    iput-byte v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->mainTag:B

    const/4 v1, 0x1

    .line 97
    aget-byte v2, p1, v1

    new-array v3, v2, [B

    const/4 v4, 0x2

    .line 98
    invoke-static {p1, v4, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move p1, v0

    :goto_1
    if-ge p1, v2, :cond_c

    add-int/lit8 v5, p1, 0x1

    .line 105
    :try_start_0
    aget-byte v6, v3, p1

    add-int/lit8 p1, p1, 0x2

    .line 106
    aget-byte v5, v3, v5

    .line 107
    new-array v7, v5, [B

    .line 108
    invoke-static {v3, p1, v7, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p1, v5

    const/16 v8, -0x5b

    if-eq v6, v8, :cond_b

    const/16 v8, -0x55

    if-eq v6, v8, :cond_a

    const/16 v8, -0x54

    if-eq v6, v8, :cond_9

    packed-switch v6, :pswitch_data_0

    packed-switch v6, :pswitch_data_1

    packed-switch v6, :pswitch_data_2

    .line 225
    new-instance p1, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string v0, "Malformed FCI: unrecognized tag."

    invoke-direct {p1, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 209
    :pswitch_0
    new-array v6, v5, [B

    iput-object v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a2:[B

    .line 210
    invoke-static {v7, v0, v6, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 205
    :pswitch_1
    new-array v6, v5, [B

    iput-object v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a1:[B

    .line 206
    invoke-static {v7, v0, v6, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 201
    :pswitch_2
    new-array v6, v5, [B

    iput-object v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a0:[B

    .line 202
    invoke-static {v7, v0, v6, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 197
    :pswitch_3
    invoke-static {v5, v1}, Lnet/sf/scuba/smartcards/ISOFileInfo;->checkLen(II)V

    .line 198
    aget-byte v5, v7, v0

    iput-byte v5, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->channelSecurity:B

    goto :goto_1

    .line 192
    :pswitch_4
    invoke-static {v5, v4}, Lnet/sf/scuba/smartcards/ISOFileInfo;->checkLen(II)V

    .line 193
    new-instance v5, Ljava/math/BigInteger;

    invoke-direct {v5, v7}, Ljava/math/BigInteger;-><init>([B)V

    .line 194
    invoke-virtual {v5}, Ljava/math/BigInteger;->shortValue()S

    move-result v5

    iput-short v5, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->envTempEF:S

    goto :goto_1

    .line 188
    :pswitch_5
    new-array v6, v5, [B

    iput-object v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->secAttrCompact:[B

    .line 189
    invoke-static {v7, v0, v6, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 184
    :pswitch_6
    new-array v6, v5, [B

    iput-object v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->secAttrExp:[B

    .line 185
    invoke-static {v7, v0, v6, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 180
    :pswitch_7
    invoke-static {v5, v1}, Lnet/sf/scuba/smartcards/ISOFileInfo;->checkLen(II)V

    .line 181
    aget-byte v5, v7, v0

    iput-byte v5, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->lcsByte:B

    goto :goto_1

    .line 172
    :pswitch_8
    invoke-static {v5, v0, v1}, Lnet/sf/scuba/smartcards/ISOFileInfo;->checkLen(III)V

    if-nez v5, :cond_3

    .line 174
    iput-byte v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->shortEF:B

    goto :goto_1

    .line 176
    :cond_3
    aget-byte v5, v7, v0

    iput-byte v5, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->shortEF:B

    goto/16 :goto_1

    .line 167
    :pswitch_9
    invoke-static {v5, v4}, Lnet/sf/scuba/smartcards/ISOFileInfo;->checkLen(II)V

    .line 168
    new-instance v5, Ljava/math/BigInteger;

    invoke-direct {v5, v7}, Ljava/math/BigInteger;-><init>([B)V

    .line 169
    invoke-virtual {v5}, Ljava/math/BigInteger;->shortValue()S

    move-result v5

    iput-short v5, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fciExt:S

    goto/16 :goto_1

    .line 163
    :pswitch_a
    new-array v6, v5, [B

    iput-object v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->secAttrProp:[B

    .line 164
    invoke-static {v7, v0, v6, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto/16 :goto_1

    .line 159
    :pswitch_b
    new-array v6, v5, [B

    iput-object v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->propInfo:[B

    .line 160
    invoke-static {v7, v0, v6, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto/16 :goto_1

    :pswitch_c
    const/16 v6, 0x10

    .line 154
    invoke-static {v5, v0, v6}, Lnet/sf/scuba/smartcards/ISOFileInfo;->checkLen(III)V

    .line 155
    new-array v6, v5, [B

    iput-object v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->dfName:[B

    .line 156
    invoke-static {v7, v0, v6, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto/16 :goto_1

    .line 149
    :pswitch_d
    invoke-static {v5, v4}, Lnet/sf/scuba/smartcards/ISOFileInfo;->checkLen(II)V

    .line 150
    new-instance v5, Ljava/math/BigInteger;

    invoke-direct {v5, v7}, Ljava/math/BigInteger;-><init>([B)V

    .line 151
    invoke-virtual {v5}, Ljava/math/BigInteger;->shortValue()S

    move-result v5

    iput-short v5, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fid:S

    goto/16 :goto_1

    :pswitch_e
    const/4 v6, 0x6

    .line 122
    invoke-static {v5, v1, v6}, Lnet/sf/scuba/smartcards/ISOFileInfo;->checkLen(III)V

    .line 124
    aget-byte v6, v7, v0

    iput-byte v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->descriptorByte:B

    if-ne v1, v5, :cond_4

    goto/16 :goto_1

    .line 128
    :cond_4
    aget-byte v6, v7, v1

    iput-byte v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->dataCodingByte:B

    if-ne v4, v5, :cond_5

    goto/16 :goto_1

    :cond_5
    const/4 v6, 0x3

    if-ne v5, v6, :cond_6

    .line 133
    aget-byte v8, v7, v4

    int-to-short v8, v8

    iput-short v8, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->maxRecordSize:S

    goto :goto_2

    .line 135
    :cond_6
    new-instance v8, Ljava/math/BigInteger;

    aget-byte v9, v7, v4

    aget-byte v6, v7, v6

    new-array v10, v4, [B

    aput-byte v9, v10, v0

    aput-byte v6, v10, v1

    invoke-direct {v8, v10}, Ljava/math/BigInteger;-><init>([B)V

    .line 136
    invoke-virtual {v8}, Ljava/math/BigInteger;->shortValue()S

    move-result v6

    iput-short v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->maxRecordSize:S

    const/4 v6, 0x4

    :goto_2
    if-ne v6, v5, :cond_7

    goto/16 :goto_1

    :cond_7
    const/4 v8, 0x5

    if-ne v5, v8, :cond_8

    .line 142
    aget-byte v5, v7, v6

    int-to-short v5, v5

    iput-short v5, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->maxRecordsCount:S

    goto/16 :goto_1

    .line 144
    :cond_8
    new-instance v5, Ljava/math/BigInteger;

    add-int/lit8 v8, v6, 0x1

    aget-byte v6, v7, v6

    aget-byte v7, v7, v8

    new-array v8, v4, [B

    aput-byte v6, v8, v0

    aput-byte v7, v8, v1

    invoke-direct {v5, v8}, Ljava/math/BigInteger;-><init>([B)V

    .line 145
    invoke-virtual {v5}, Ljava/math/BigInteger;->shortValue()S

    move-result v5

    iput-short v5, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->maxRecordsCount:S

    goto/16 :goto_1

    .line 117
    :pswitch_f
    invoke-static {v5, v4}, Lnet/sf/scuba/smartcards/ISOFileInfo;->checkLen(II)V

    .line 118
    new-instance v5, Ljava/math/BigInteger;

    invoke-direct {v5, v7}, Ljava/math/BigInteger;-><init>([B)V

    .line 119
    invoke-virtual {v5}, Ljava/math/BigInteger;->intValue()I

    move-result v5

    iput v5, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fileLengthFCI:I

    goto/16 :goto_1

    .line 112
    :pswitch_10
    new-instance v5, Ljava/math/BigInteger;

    invoke-direct {v5, v7}, Ljava/math/BigInteger;-><init>([B)V

    .line 113
    invoke-virtual {v5}, Ljava/math/BigInteger;->abs()Ljava/math/BigInteger;

    move-result-object v5

    .line 114
    invoke-virtual {v5}, Ljava/math/BigInteger;->intValue()I

    move-result v5

    iput v5, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fileLength:I

    goto/16 :goto_1

    .line 221
    :cond_9
    new-array v6, v5, [B

    iput-object v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->ac:[B

    .line 222
    invoke-static {v7, v0, v6, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto/16 :goto_1

    .line 217
    :cond_a
    new-array v6, v5, [B

    iput-object v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->ab:[B

    .line 218
    invoke-static {v7, v0, v6, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto/16 :goto_1

    .line 213
    :cond_b
    new-array v6, v5, [B

    iput-object v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a5:[B

    .line 214
    invoke-static {v7, v0, v6, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    .line 229
    :catch_0
    new-instance p1, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string v0, "Malformed FCI."

    invoke-direct {p1, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x80
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x76
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch -0x60
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static catArray([B[B)[B
    .locals 3

    .line 373
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [B

    .line 374
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 375
    array-length p0, p0

    array-length v1, p1

    invoke-static {p1, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method private static checkLen(II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    if-ne p0, p1, :cond_0

    return-void

    .line 235
    :cond_0
    new-instance p0, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string p1, "Malformed FCI."

    invoke-direct {p0, p1}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static checkLen(III)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    if-lt p0, p1, :cond_0

    if-gt p0, p2, :cond_0

    return-void

    .line 241
    :cond_0
    new-instance p0, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string p1, "Malformed FCI."

    invoke-direct {p0, p1}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static getArray(B[B)[B
    .locals 4

    .line 365
    array-length v0, p1

    const/4 v1, 0x2

    add-int/2addr v0, v1

    new-array v0, v0, [B

    const/4 v2, 0x0

    .line 366
    aput-byte p0, v0, v2

    .line 367
    array-length p0, p1

    int-to-byte p0, p0

    const/4 v3, 0x1

    aput-byte p0, v0, v3

    .line 368
    array-length p0, p1

    invoke-static {p1, v2, v0, v1, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method


# virtual methods
.method public getFID()S
    .locals 1

    .line 415
    iget-short v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fid:S

    return v0
.end method

.method public getFileLength()I
    .locals 1

    .line 426
    iget v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fileLength:I

    return v0
.end method

.method public getFormatted()[B
    .locals 10

    const/4 v0, 0x0

    .line 246
    new-array v1, v0, [B

    .line 247
    iget-byte v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->mainTag:B

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    return-object v1

    .line 251
    :cond_0
    iget v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fileLength:I

    if-eq v2, v3, :cond_1

    int-to-short v2, v2

    .line 252
    invoke-static {v2}, Lnet/sf/scuba/util/Hex;->shortToHexString(S)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/sf/scuba/util/Hex;->hexStringToBytes(Ljava/lang/String;)[B

    move-result-object v2

    const/16 v4, -0x80

    invoke-static {v4, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v2

    .line 253
    invoke-static {v1, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 255
    :cond_1
    iget v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fileLengthFCI:I

    if-eq v2, v3, :cond_2

    int-to-short v2, v2

    .line 256
    invoke-static {v2}, Lnet/sf/scuba/util/Hex;->shortToHexString(S)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/sf/scuba/util/Hex;->hexStringToBytes(Ljava/lang/String;)[B

    move-result-object v2

    const/16 v4, -0x7f

    invoke-static {v4, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v2

    .line 257
    invoke-static {v1, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 260
    :cond_2
    iget-byte v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->descriptorByte:B

    const/4 v4, 0x1

    if-eq v2, v3, :cond_9

    .line 261
    new-array v5, v4, [B

    aput-byte v2, v5, v0

    .line 262
    new-array v2, v0, [B

    .line 263
    iget-byte v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->dataCodingByte:B

    if-eq v6, v3, :cond_3

    .line 264
    new-array v2, v4, [B

    aput-byte v6, v2, v0

    .line 266
    :cond_3
    new-array v6, v0, [B

    .line 267
    iget-short v7, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->maxRecordSize:S

    const/16 v8, 0x100

    if-eq v7, v3, :cond_6

    if-gt v7, v8, :cond_5

    .line 270
    iget-short v6, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->maxRecordsCount:S

    if-ne v6, v3, :cond_4

    int-to-byte v6, v7

    .line 271
    invoke-static {v6}, Lnet/sf/scuba/util/Hex;->byteToHexString(B)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 273
    :cond_4
    invoke-static {v7}, Lnet/sf/scuba/util/Hex;->shortToHexString(S)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 276
    :cond_5
    invoke-static {v7}, Lnet/sf/scuba/util/Hex;->shortToHexString(S)Ljava/lang/String;

    move-result-object v6

    .line 278
    :goto_0
    invoke-static {v6}, Lnet/sf/scuba/util/Hex;->hexStringToBytes(Ljava/lang/String;)[B

    move-result-object v6

    .line 280
    :cond_6
    new-array v7, v0, [B

    .line 281
    iget-short v9, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->maxRecordsCount:S

    if-eq v9, v3, :cond_8

    if-gt v9, v8, :cond_7

    int-to-byte v7, v9

    .line 284
    invoke-static {v7}, Lnet/sf/scuba/util/Hex;->byteToHexString(B)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 286
    :cond_7
    invoke-static {v9}, Lnet/sf/scuba/util/Hex;->shortToHexString(S)Ljava/lang/String;

    move-result-object v7

    .line 288
    :goto_1
    invoke-static {v7}, Lnet/sf/scuba/util/Hex;->hexStringToBytes(Ljava/lang/String;)[B

    move-result-object v7

    .line 290
    :cond_8
    invoke-static {v5, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v2

    invoke-static {v2, v6}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v2

    invoke-static {v2, v7}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v2

    const/16 v5, -0x7e

    invoke-static {v5, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v2

    .line 291
    invoke-static {v1, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 293
    :cond_9
    iget-short v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fid:S

    if-eq v2, v3, :cond_a

    .line 294
    invoke-static {v2}, Lnet/sf/scuba/util/Hex;->shortToHexString(S)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/sf/scuba/util/Hex;->hexStringToBytes(Ljava/lang/String;)[B

    move-result-object v2

    const/16 v5, -0x7d

    invoke-static {v5, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v2

    .line 295
    invoke-static {v1, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 297
    :cond_a
    iget-object v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->dfName:[B

    if-eqz v2, :cond_b

    const/16 v5, -0x7c

    .line 298
    invoke-static {v5, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v2

    .line 299
    invoke-static {v1, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 301
    :cond_b
    iget-object v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->propInfo:[B

    if-eqz v2, :cond_c

    const/16 v5, -0x7b

    .line 302
    invoke-static {v5, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v2

    .line 303
    invoke-static {v1, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 305
    :cond_c
    iget-object v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->secAttrProp:[B

    if-eqz v2, :cond_d

    const/16 v5, -0x7a

    .line 306
    invoke-static {v5, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v2

    .line 307
    invoke-static {v1, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 309
    :cond_d
    iget-short v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fciExt:S

    if-eq v2, v3, :cond_e

    .line 310
    invoke-static {v2}, Lnet/sf/scuba/util/Hex;->shortToHexString(S)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/sf/scuba/util/Hex;->hexStringToBytes(Ljava/lang/String;)[B

    move-result-object v2

    const/16 v5, -0x79

    invoke-static {v5, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v2

    .line 311
    invoke-static {v1, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 313
    :cond_e
    iget-byte v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->shortEF:B

    if-eq v2, v3, :cond_10

    if-nez v2, :cond_f

    .line 314
    new-array v2, v0, [B

    goto :goto_2

    :cond_f
    new-array v5, v4, [B

    aput-byte v2, v5, v0

    move-object v2, v5

    :goto_2
    const/16 v5, -0x78

    invoke-static {v5, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v2

    .line 315
    invoke-static {v1, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 317
    :cond_10
    iget-byte v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->lcsByte:B

    if-eq v2, v3, :cond_11

    .line 318
    new-array v5, v4, [B

    aput-byte v2, v5, v0

    const/16 v2, -0x76

    invoke-static {v2, v5}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v2

    .line 319
    invoke-static {v1, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 321
    :cond_11
    iget-object v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->secAttrExp:[B

    if-eqz v2, :cond_12

    const/16 v5, -0x75

    .line 322
    invoke-static {v5, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v2

    .line 323
    invoke-static {v1, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 325
    :cond_12
    iget-object v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->secAttrCompact:[B

    if-eqz v2, :cond_13

    const/16 v5, -0x74

    .line 326
    invoke-static {v5, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v2

    .line 327
    invoke-static {v1, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 329
    :cond_13
    iget-short v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->envTempEF:S

    if-eq v2, v3, :cond_14

    .line 330
    invoke-static {v2}, Lnet/sf/scuba/util/Hex;->shortToHexString(S)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lnet/sf/scuba/util/Hex;->hexStringToBytes(Ljava/lang/String;)[B

    move-result-object v2

    const/16 v5, -0x73

    invoke-static {v5, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v2

    .line 331
    invoke-static {v1, v2}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 333
    :cond_14
    iget-byte v2, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->channelSecurity:B

    if-eq v2, v3, :cond_15

    .line 334
    new-array v3, v4, [B

    aput-byte v2, v3, v0

    const/16 v0, -0x72

    invoke-static {v0, v3}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v0

    .line 335
    invoke-static {v1, v0}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 337
    :cond_15
    iget-object v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a0:[B

    if-eqz v0, :cond_16

    const/16 v2, -0x60

    .line 338
    invoke-static {v2, v0}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v0

    .line 339
    invoke-static {v1, v0}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 341
    :cond_16
    iget-object v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a1:[B

    if-eqz v0, :cond_17

    const/16 v2, -0x5f

    .line 342
    invoke-static {v2, v0}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v0

    .line 343
    invoke-static {v1, v0}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 345
    :cond_17
    iget-object v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a2:[B

    if-eqz v0, :cond_18

    const/16 v2, -0x5e

    .line 346
    invoke-static {v2, v0}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v0

    .line 347
    invoke-static {v1, v0}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 349
    :cond_18
    iget-object v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a5:[B

    if-eqz v0, :cond_19

    const/16 v2, -0x5b

    .line 350
    invoke-static {v2, v0}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v0

    .line 351
    invoke-static {v1, v0}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 353
    :cond_19
    iget-object v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->ab:[B

    if-eqz v0, :cond_1a

    const/16 v2, -0x55

    .line 354
    invoke-static {v2, v0}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v0

    .line 355
    invoke-static {v1, v0}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 357
    :cond_1a
    iget-object v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->ac:[B

    if-eqz v0, :cond_1b

    const/16 v2, -0x54

    .line 358
    invoke-static {v2, v0}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v0

    .line 359
    invoke-static {v1, v0}, Lnet/sf/scuba/smartcards/ISOFileInfo;->catArray([B[B)[B

    move-result-object v1

    .line 361
    :cond_1b
    iget-byte v0, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->mainTag:B

    invoke-static {v0, v1}, Lnet/sf/scuba/smartcards/ISOFileInfo;->getArray(B[B)[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 381
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Length: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fileLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nLength FCI: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fileLengthFCI:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nDesc byte: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->descriptorByte:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nData byte: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->dataCodingByte:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nRecord size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->maxRecordSize:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nRecord count: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->maxRecordsCount:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nFID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fid:S

    .line 388
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->shortToHexString(S)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nDF name: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->dfName:[B

    .line 389
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\npropInfo: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->propInfo:[B

    .line 390
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nsecAttrProp: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->secAttrProp:[B

    .line 391
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nsecAttrExp: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->secAttrExp:[B

    .line 392
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nsecAttrComp: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->secAttrCompact:[B

    .line 393
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nFCI ext: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->fciExt:S

    .line 394
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->shortToHexString(S)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nEF env temp: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->envTempEF:S

    .line 395
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->shortToHexString(S)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nShort EF: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->shortEF:B

    .line 396
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->byteToHexString(B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nLCS byte: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->lcsByte:B

    .line 397
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->byteToHexString(B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nChannel sec: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->channelSecurity:B

    .line 398
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->byteToHexString(B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\na0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a0:[B

    .line 399
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\na1: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a1:[B

    .line 400
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\na2: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a2:[B

    .line 401
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\na5: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->a5:[B

    .line 402
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nab: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->ab:[B

    .line 403
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\nac: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sf/scuba/smartcards/ISOFileInfo;->ac:[B

    .line 404
    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
