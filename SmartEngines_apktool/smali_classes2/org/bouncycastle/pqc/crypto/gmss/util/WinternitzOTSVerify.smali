.class public Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;
.super Ljava/lang/Object;


# instance fields
.field private messDigestOTS:Lorg/bouncycastle/crypto/Digest;

.field private w:I


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/Digest;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    return-void
.end method


# virtual methods
.method public Verify([B[B)[B
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v3}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v3

    new-array v4, v3, [B

    iget-object v4, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    array-length v5, v1

    const/4 v6, 0x0

    invoke-interface {v4, v1, v6, v5}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v1, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    new-array v4, v1, [B

    iget-object v5, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v5, v4, v6}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    shl-int/lit8 v5, v3, 0x3

    iget v7, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    add-int/lit8 v8, v7, -0x1

    add-int/2addr v8, v5

    div-int/2addr v8, v7

    shl-int v7, v8, v7

    const/4 v9, 0x1

    add-int/2addr v7, v9

    invoke-virtual {v0, v7}, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->getLog(I)I

    move-result v7

    iget v10, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    add-int v11, v7, v10

    sub-int/2addr v11, v9

    div-int/2addr v11, v10

    add-int/2addr v11, v8

    mul-int/2addr v11, v3

    array-length v12, v2

    if-eq v11, v12, :cond_0

    const/4 v1, 0x0

    return-object v1

    :cond_0
    new-array v12, v11, [B

    const/16 v13, 0x8

    rem-int v14, v13, v10

    if-nez v14, :cond_5

    div-int/2addr v13, v10

    shl-int v5, v9, v10

    sub-int/2addr v5, v9

    new-array v9, v3, [B

    move v10, v6

    move v14, v10

    move v15, v14

    :goto_0
    if-ge v10, v1, :cond_3

    :goto_1
    if-ge v6, v13, :cond_2

    aget-byte v16, v4, v10

    and-int v16, v16, v5

    add-int v14, v14, v16

    move/from16 p1, v1

    mul-int v1, v15, v3

    move-object/from16 v17, v4

    const/4 v4, 0x0

    invoke-static {v2, v1, v9, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move/from16 v4, v16

    :goto_2
    if-ge v4, v5, :cond_1

    move/from16 v16, v4

    iget-object v4, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    move/from16 v18, v6

    array-length v6, v9

    move/from16 v19, v8

    const/4 v8, 0x0

    invoke-interface {v4, v9, v8, v6}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v4, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v4}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v4

    new-array v9, v4, [B

    iget-object v4, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v4, v9, v8}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    add-int/lit8 v4, v16, 0x1

    move/from16 v6, v18

    move/from16 v8, v19

    goto :goto_2

    :cond_1
    move/from16 v18, v6

    move/from16 v19, v8

    const/4 v8, 0x0

    invoke-static {v9, v8, v12, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget-byte v1, v17, v10

    iget v4, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    ushr-int/2addr v1, v4

    int-to-byte v1, v1

    aput-byte v1, v17, v10

    add-int/lit8 v15, v15, 0x1

    add-int/lit8 v6, v18, 0x1

    move/from16 v1, p1

    move-object/from16 v4, v17

    move/from16 v8, v19

    goto :goto_1

    :cond_2
    move/from16 p1, v1

    move-object/from16 v17, v4

    move/from16 v19, v8

    add-int/lit8 v10, v10, 0x1

    const/4 v6, 0x0

    goto :goto_0

    :cond_3
    move/from16 v19, v8

    iget v1, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    shl-int v1, v19, v1

    sub-int/2addr v1, v14

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v7, :cond_16

    and-int v6, v1, v5

    mul-int v8, v15, v3

    const/4 v10, 0x0

    invoke-static {v2, v8, v9, v10, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_4
    if-ge v6, v5, :cond_4

    iget-object v13, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    array-length v14, v9

    invoke-interface {v13, v9, v10, v14}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v9, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v9}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v9

    new-array v9, v9, [B

    iget-object v13, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v13, v9, v10}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_4
    invoke-static {v9, v10, v12, v8, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v6, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    ushr-int/2addr v1, v6

    add-int/lit8 v15, v15, 0x1

    add-int/2addr v4, v6

    goto :goto_3

    :cond_5
    move-object/from16 v17, v4

    move/from16 v19, v8

    if-ge v10, v13, :cond_e

    div-int v1, v3, v10

    shl-int v4, v9, v10

    sub-int/2addr v4, v9

    new-array v5, v3, [B

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/16 v16, 0x0

    :goto_5
    move/from16 p1, v9

    if-ge v6, v1, :cond_9

    const/4 v9, 0x0

    const-wide/16 v20, 0x0

    :goto_6
    iget v14, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    if-ge v9, v14, :cond_6

    aget-byte v14, v17, v8

    and-int/lit16 v14, v14, 0xff

    shl-int/lit8 v15, v9, 0x3

    shl-int/2addr v14, v15

    int-to-long v14, v14

    xor-long v20, v20, v14

    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    :cond_6
    const/4 v9, 0x0

    :goto_7
    if-ge v9, v13, :cond_8

    int-to-long v14, v4

    and-long v14, v20, v14

    long-to-int v14, v14

    add-int/2addr v10, v14

    mul-int v15, v16, v3

    move/from16 v18, v13

    const/4 v13, 0x0

    invoke-static {v2, v15, v5, v13, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_8
    move/from16 v22, v1

    if-ge v14, v4, :cond_7

    iget-object v1, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    move/from16 v23, v6

    array-length v6, v5

    invoke-interface {v1, v5, v13, v6}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v1, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    new-array v5, v1, [B

    iget-object v1, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1, v5, v13}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    add-int/lit8 v14, v14, 0x1

    move/from16 v1, v22

    move/from16 v6, v23

    goto :goto_8

    :cond_7
    move/from16 v23, v6

    invoke-static {v5, v13, v12, v15, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    ushr-long v20, v20, v1

    add-int/lit8 v16, v16, 0x1

    add-int/lit8 v9, v9, 0x1

    move/from16 v13, v18

    move/from16 v1, v22

    goto :goto_7

    :cond_8
    move/from16 v22, v1

    move/from16 v23, v6

    move/from16 v18, v13

    add-int/lit8 v6, v23, 0x1

    move/from16 v9, p1

    goto :goto_5

    :cond_9
    iget v1, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    rem-int v1, v3, v1

    const/4 v6, 0x0

    const-wide/16 v14, 0x0

    :goto_9
    if-ge v6, v1, :cond_a

    aget-byte v9, v17, v8

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v13, v6, 0x3

    shl-int/2addr v9, v13

    move-object v13, v5

    move/from16 v18, v6

    int-to-long v5, v9

    xor-long/2addr v14, v5

    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v6, v18, 0x1

    move-object v5, v13

    goto :goto_9

    :cond_a
    move-object v13, v5

    shl-int/lit8 v1, v1, 0x3

    const/4 v6, 0x0

    :goto_a
    if-ge v6, v1, :cond_c

    int-to-long v8, v4

    and-long/2addr v8, v14

    long-to-int v8, v8

    add-int/2addr v10, v8

    mul-int v9, v16, v3

    const/4 v13, 0x0

    invoke-static {v2, v9, v5, v13, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_b
    move/from16 p1, v1

    if-ge v8, v4, :cond_b

    iget-object v1, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    move/from16 v17, v6

    array-length v6, v5

    invoke-interface {v1, v5, v13, v6}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v1, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    new-array v5, v1, [B

    iget-object v1, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v1, v5, v13}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    add-int/lit8 v8, v8, 0x1

    move/from16 v1, p1

    move/from16 v6, v17

    goto :goto_b

    :cond_b
    move/from16 v17, v6

    invoke-static {v5, v13, v12, v9, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    ushr-long/2addr v14, v1

    add-int/lit8 v16, v16, 0x1

    add-int v6, v17, v1

    move/from16 v1, p1

    goto :goto_a

    :cond_c
    iget v1, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    shl-int v1, v19, v1

    sub-int/2addr v1, v10

    const/4 v6, 0x0

    :goto_c
    if-ge v6, v7, :cond_16

    and-int v8, v1, v4

    mul-int v9, v16, v3

    const/4 v13, 0x0

    invoke-static {v2, v9, v5, v13, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_d
    if-ge v8, v4, :cond_d

    iget-object v10, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    array-length v14, v5

    invoke-interface {v10, v5, v13, v14}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v5, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v5}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v5

    new-array v5, v5, [B

    iget-object v10, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v10, v5, v13}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    add-int/lit8 v8, v8, 0x1

    goto :goto_d

    :cond_d
    invoke-static {v5, v13, v12, v9, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v8, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    ushr-int/2addr v1, v8

    add-int/lit8 v16, v16, 0x1

    add-int/2addr v6, v8

    goto :goto_c

    :cond_e
    move/from16 p1, v9

    move/from16 v18, v13

    const/16 v1, 0x39

    if-ge v10, v1, :cond_16

    sub-int/2addr v5, v10

    shl-int v1, p1, v10

    add-int/lit8 v1, v1, -0x1

    new-array v4, v3, [B

    move-object v8, v4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    :goto_e
    if-gt v9, v5, :cond_11

    ushr-int/lit8 v10, v9, 0x3

    rem-int/lit8 v15, v9, 0x8

    const-wide/16 v20, 0x1

    iget v13, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    add-int/2addr v9, v13

    add-int/lit8 v13, v9, 0x7

    ushr-int/lit8 v13, v13, 0x3

    const/4 v14, 0x0

    const-wide/16 v22, 0x0

    :goto_f
    move/from16 v16, v5

    if-ge v10, v13, :cond_f

    aget-byte v5, v17, v10

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v24, v14, 0x3

    shl-int v5, v5, v24

    move/from16 v24, v6

    int-to-long v5, v5

    xor-long v22, v22, v5

    add-int/lit8 v14, v14, 0x1

    add-int/lit8 v10, v10, 0x1

    move/from16 v5, v16

    move/from16 v6, v24

    goto :goto_f

    :cond_f
    move/from16 v24, v6

    ushr-long v5, v22, v15

    int-to-long v13, v1

    and-long/2addr v5, v13

    move-wide/from16 v22, v5

    int-to-long v4, v4

    add-long v4, v4, v22

    long-to-int v4, v4

    mul-int v6, v24, v3

    const/4 v10, 0x0

    invoke-static {v2, v6, v8, v10, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_10
    cmp-long v5, v22, v13

    if-gez v5, :cond_10

    iget-object v5, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    array-length v15, v8

    invoke-interface {v5, v8, v10, v15}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v5, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v5}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v5

    new-array v8, v5, [B

    iget-object v5, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v5, v8, v10}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    add-long v22, v22, v20

    goto :goto_10

    :cond_10
    invoke-static {v8, v10, v12, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v6, v24, 0x1

    move/from16 v5, v16

    goto :goto_e

    :cond_11
    move/from16 v24, v6

    const-wide/16 v20, 0x1

    ushr-int/lit8 v5, v9, 0x3

    if-ge v5, v3, :cond_14

    rem-int/lit8 v9, v9, 0x8

    const/4 v6, 0x0

    const-wide/16 v14, 0x0

    :goto_11
    if-ge v5, v3, :cond_12

    aget-byte v10, v17, v5

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v13, v6, 0x3

    shl-int/2addr v10, v13

    move v13, v5

    move/from16 v16, v6

    int-to-long v5, v10

    xor-long/2addr v14, v5

    add-int/lit8 v6, v16, 0x1

    add-int/lit8 v5, v13, 0x1

    goto :goto_11

    :cond_12
    ushr-long v5, v14, v9

    int-to-long v9, v1

    and-long/2addr v5, v9

    int-to-long v13, v4

    add-long/2addr v13, v5

    long-to-int v4, v13

    mul-int v13, v24, v3

    const/4 v14, 0x0

    invoke-static {v2, v13, v8, v14, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_12
    cmp-long v15, v5, v9

    if-gez v15, :cond_13

    iget-object v15, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    move/from16 v16, v4

    array-length v4, v8

    invoke-interface {v15, v8, v14, v4}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v4, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v4}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v4

    new-array v8, v4, [B

    iget-object v4, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v4, v8, v14}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    add-long v5, v5, v20

    move/from16 v4, v16

    goto :goto_12

    :cond_13
    move/from16 v16, v4

    invoke-static {v8, v14, v12, v13, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v6, v24, 0x1

    goto :goto_13

    :cond_14
    move/from16 v6, v24

    :goto_13
    iget v5, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    shl-int v5, v19, v5

    sub-int/2addr v5, v4

    const/4 v4, 0x0

    :goto_14
    if-ge v4, v7, :cond_16

    and-int v9, v5, v1

    int-to-long v9, v9

    mul-int v13, v6, v3

    const/4 v14, 0x0

    invoke-static {v2, v13, v8, v14, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_15
    int-to-long v14, v1

    cmp-long v14, v9, v14

    if-gez v14, :cond_15

    iget-object v14, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    array-length v15, v8

    move/from16 p1, v1

    const/4 v1, 0x0

    invoke-interface {v14, v8, v1, v15}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v8, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v8}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v8

    new-array v8, v8, [B

    iget-object v14, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v14, v8, v1}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    add-long v9, v9, v20

    move/from16 v1, p1

    goto :goto_15

    :cond_15
    move/from16 p1, v1

    const/4 v1, 0x0

    invoke-static {v8, v1, v12, v13, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v9, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    ushr-int/2addr v5, v9

    add-int/lit8 v6, v6, 0x1

    add-int/2addr v4, v9

    move/from16 v1, p1

    goto :goto_14

    :cond_16
    const/4 v1, 0x0

    new-array v2, v3, [B

    iget-object v2, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v2, v12, v1, v11}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    iget-object v2, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v2}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v2

    new-array v2, v2, [B

    iget-object v3, v0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v3, v2, v1}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    return-object v2
.end method

.method public getLog(I)I
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x2

    :goto_0
    if-ge v1, p1, :cond_0

    shl-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public getSignatureLength()I
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->messDigestOTS:Lorg/bouncycastle/crypto/Digest;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    shl-int/lit8 v1, v0, 0x3

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    add-int/lit8 v3, v2, -0x1

    add-int/2addr v1, v3

    div-int/2addr v1, v2

    shl-int v2, v1, v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v2}, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->getLog(I)I

    move-result v2

    iget v3, p0, Lorg/bouncycastle/pqc/crypto/gmss/util/WinternitzOTSVerify;->w:I

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, -0x1

    div-int/2addr v2, v3

    add-int/2addr v1, v2

    mul-int/2addr v0, v1

    return v0
.end method
