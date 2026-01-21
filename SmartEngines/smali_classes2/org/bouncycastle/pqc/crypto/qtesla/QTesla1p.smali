.class Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$Gaussian;,
        Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;
    }
.end annotation


# static fields
.field private static BPLUS1BYTES:I = 0x3

.field static final CRYPTO_BYTES:I = 0xa20

.field private static final CRYPTO_C_BYTES:I = 0x20

.field static final CRYPTO_PUBLICKEYBYTES:I = 0x3a20

.field private static final CRYPTO_RANDOMBYTES:I = 0x20

.field static final CRYPTO_SECRETKEYBYTES:I = 0x1440

.field private static final CRYPTO_SEEDBYTES:I = 0x20

.field private static final HM_BYTES:I = 0x40

.field private static NBLOCKS_SHAKE:I = 0x38

.field private static final PARAM_B:I = 0x7ffff

.field private static final PARAM_BARR_DIV:I = 0x1e

.field private static final PARAM_BARR_MULT:I = 0x3

.field private static final PARAM_B_BITS:I = 0x13

.field private static final PARAM_D:I = 0x16

.field private static final PARAM_E:I = 0x22a

.field private static final PARAM_GEN_A:I = 0x6c

.field private static final PARAM_H:I = 0x19

.field private static final PARAM_K:I = 0x4

.field private static final PARAM_KEYGEN_BOUND_E:I = 0x22a

.field private static final PARAM_KEYGEN_BOUND_S:I = 0x22a

.field private static final PARAM_N:I = 0x400

.field private static final PARAM_N_LOG:I = 0xa

.field private static final PARAM_Q:I = 0x147a9001

.field private static final PARAM_QINV:J = 0x837a8fffL

.field private static final PARAM_Q_LOG:I = 0x1d

.field private static final PARAM_R:I = 0xa413ff4

.field private static final PARAM_R2_INVN:I = 0xd00399

.field private static final PARAM_S:I = 0x22a

.field private static final PARAM_SIGMA:D = 8.5

.field private static final PARAM_SIGMA_E:D = 8.5

.field private static final PARAM_S_BITS:I = 0x8

.field private static final RADIX:I = 0x20

.field private static final RADIX32:I = 0x20

.field private static final maskb1:I = 0xfffff


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static absolute(I)I
    .locals 1

    shr-int/lit8 v0, p0, 0x1f

    xor-int/2addr p0, v0

    sub-int/2addr p0, v0

    return p0
.end method

.method private static absolute(J)J
    .locals 2

    const/16 v0, 0x3f

    shr-long v0, p0, v0

    xor-long/2addr p0, v0

    sub-long/2addr p0, v0

    return-wide p0
.end method

.method static synthetic access$000([BII)I
    .locals 0

    invoke-static {p0, p1, p2}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result p0

    return p0
.end method

.method private static at([BII)I
    .locals 1

    mul-int/lit8 p1, p1, 0x4

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr p1, p2

    aget-byte p2, p0, p1

    and-int/lit16 p2, p2, 0xff

    add-int/lit8 v0, p1, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr p2, v0

    add-int/lit8 v0, p1, 0x2

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x10

    or-int/2addr p2, v0

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    shl-int/lit8 p0, p0, 0x18

    or-int/2addr p0, p2

    return p0
.end method

.method private static at([BIII)V
    .locals 0

    mul-int/lit8 p1, p1, 0x4

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr p1, p2

    invoke-static {p3, p0, p1}, Lorg/bouncycastle/util/Pack;->intToLittleEndian(I[BI)V

    return-void
.end method

.method private static checkPolynomial([JII)Z
    .locals 18

    const/16 v0, 0x400

    new-array v1, v0, [J

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    add-int v4, p1, v3

    aget-wide v4, p0, v4

    invoke-static {v4, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->absolute(J)J

    move-result-wide v4

    aput-wide v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    const/16 v5, 0x19

    if-ge v3, v5, :cond_2

    const/4 v5, 0x0

    :goto_2
    add-int/lit8 v6, v0, -0x1

    if-ge v5, v6, :cond_1

    add-int/lit8 v6, v5, 0x1

    aget-wide v7, v1, v6

    aget-wide v9, v1, v5

    sub-long v11, v7, v9

    const/16 v13, 0x1f

    shr-long/2addr v11, v13

    and-long v13, v7, v11

    move/from16 p0, v3

    const/4 v15, 0x0

    not-long v2, v11

    and-long v16, v9, v2

    or-long v13, v13, v16

    and-long/2addr v9, v11

    and-long/2addr v2, v7

    or-long/2addr v2, v9

    aput-wide v2, v1, v6

    aput-wide v13, v1, v5

    move/from16 v3, p0

    move v5, v6

    goto :goto_2

    :cond_1
    move/from16 p0, v3

    const/4 v15, 0x0

    int-to-long v2, v4

    aget-wide v4, v1, v6

    add-long/2addr v2, v4

    long-to-int v4, v2

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v3, p0, 0x1

    goto :goto_1

    :cond_2
    move/from16 v0, p2

    const/4 v15, 0x0

    if-le v4, v0, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    return v15
.end method

.method static decodePublicKey([I[BI[B)V
    .locals 29

    move-object/from16 v0, p3

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x1000

    if-ge v2, v3, :cond_0

    const/4 v3, 0x0

    invoke-static {v0, v1, v3}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v3

    const v4, 0x1fffffff

    and-int/2addr v3, v4

    aput v3, p0, v2

    add-int/lit8 v3, v2, 0x1

    const/4 v5, 0x0

    invoke-static {v0, v1, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    ushr-int/lit8 v5, v5, 0x1d

    const/4 v6, 0x1

    invoke-static {v0, v1, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v7

    const/4 v8, 0x3

    shl-int/2addr v7, v8

    or-int/2addr v5, v7

    and-int/2addr v5, v4

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0x2

    invoke-static {v0, v1, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    const/16 v7, 0x1a

    ushr-int/2addr v5, v7

    const/4 v9, 0x2

    invoke-static {v0, v1, v9}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v10

    const/4 v11, 0x6

    shl-int/2addr v10, v11

    or-int/2addr v5, v10

    and-int/2addr v5, v4

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0x3

    invoke-static {v0, v1, v9}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    const/16 v10, 0x17

    ushr-int/2addr v5, v10

    invoke-static {v0, v1, v8}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v12

    const/16 v13, 0x9

    shl-int/2addr v12, v13

    or-int/2addr v5, v12

    and-int/2addr v5, v4

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0x4

    invoke-static {v0, v1, v8}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    const/16 v12, 0x14

    ushr-int/2addr v5, v12

    const/4 v14, 0x4

    invoke-static {v0, v1, v14}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v15

    move/from16 v16, v4

    const/16 v4, 0xc

    shl-int/2addr v15, v4

    or-int/2addr v5, v15

    and-int v5, v5, v16

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0x5

    invoke-static {v0, v1, v14}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    const/16 v15, 0x11

    ushr-int/2addr v5, v15

    move/from16 v17, v6

    const/4 v6, 0x5

    invoke-static {v0, v1, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v18

    move/from16 v19, v8

    const/16 v8, 0xf

    shl-int/lit8 v18, v18, 0xf

    or-int v5, v5, v18

    and-int v5, v5, v16

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0x6

    invoke-static {v0, v1, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    move/from16 v18, v6

    const/16 v6, 0xe

    ushr-int/2addr v5, v6

    invoke-static {v0, v1, v11}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v20

    move/from16 v21, v9

    const/16 v9, 0x12

    shl-int/lit8 v20, v20, 0x12

    or-int v5, v5, v20

    and-int v5, v5, v16

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0x7

    invoke-static {v0, v1, v11}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    move/from16 v20, v11

    const/16 v11, 0xb

    ushr-int/2addr v5, v11

    move/from16 v22, v14

    const/4 v14, 0x7

    invoke-static {v0, v1, v14}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v23

    const/16 v7, 0x15

    shl-int/lit8 v23, v23, 0x15

    or-int v5, v5, v23

    and-int v5, v5, v16

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0x8

    invoke-static {v0, v1, v14}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    move/from16 v23, v14

    const/16 v14, 0x8

    ushr-int/2addr v5, v14

    invoke-static {v0, v1, v14}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v25

    const/16 v10, 0x18

    shl-int/lit8 v25, v25, 0x18

    or-int v5, v5, v25

    and-int v5, v5, v16

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0x9

    invoke-static {v0, v1, v14}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    ushr-int/lit8 v5, v5, 0x5

    invoke-static {v0, v1, v13}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v25

    move/from16 v27, v14

    const/16 v14, 0x1b

    shl-int/lit8 v25, v25, 0x1b

    or-int v5, v5, v25

    and-int v5, v5, v16

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0xa

    invoke-static {v0, v1, v13}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    ushr-int/lit8 v5, v5, 0x2

    and-int v5, v5, v16

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0xb

    invoke-static {v0, v1, v13}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    ushr-int/lit8 v5, v5, 0x1f

    move/from16 v25, v13

    const/16 v13, 0xa

    invoke-static {v0, v1, v13}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v13

    shl-int/lit8 v13, v13, 0x1

    or-int/2addr v5, v13

    and-int v5, v5, v16

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0xc

    const/16 v5, 0xa

    invoke-static {v0, v1, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    ushr-int/lit8 v5, v5, 0x1c

    invoke-static {v0, v1, v11}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v13

    shl-int/lit8 v13, v13, 0x4

    or-int/2addr v5, v13

    and-int v5, v5, v16

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0xd

    invoke-static {v0, v1, v11}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    ushr-int/lit8 v5, v5, 0x19

    invoke-static {v0, v1, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v13

    shl-int/lit8 v13, v13, 0x7

    or-int/2addr v5, v13

    and-int v5, v5, v16

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0xe

    invoke-static {v0, v1, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    ushr-int/lit8 v5, v5, 0x16

    const/16 v13, 0xd

    invoke-static {v0, v1, v13}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v13

    shl-int/lit8 v13, v13, 0xa

    or-int/2addr v5, v13

    and-int v5, v5, v16

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0xf

    const/16 v5, 0xd

    invoke-static {v0, v1, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    const/16 v13, 0x13

    ushr-int/2addr v5, v13

    invoke-static {v0, v1, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v28

    shl-int/lit8 v28, v28, 0xd

    or-int v5, v5, v28

    and-int v5, v5, v16

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0x10

    invoke-static {v0, v1, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    ushr-int/lit8 v5, v5, 0x10

    invoke-static {v0, v1, v8}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v28

    shl-int/lit8 v28, v28, 0x10

    or-int v5, v5, v28

    and-int v5, v5, v16

    aput v5, p0, v3

    add-int/lit8 v3, v2, 0x11

    invoke-static {v0, v1, v8}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    ushr-int/lit8 v5, v5, 0xd

    move/from16 v28, v4

    const/16 v4, 0x10

    invoke-static {v0, v1, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    shl-int/2addr v4, v13

    or-int/2addr v4, v5

    and-int v4, v4, v16

    aput v4, p0, v3

    add-int/lit8 v3, v2, 0x12

    const/16 v4, 0x10

    invoke-static {v0, v1, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0xa

    invoke-static {v0, v1, v15}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    shl-int/lit8 v5, v5, 0x16

    or-int/2addr v4, v5

    and-int v4, v4, v16

    aput v4, p0, v3

    add-int/lit8 v3, v2, 0x13

    invoke-static {v0, v1, v15}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x7

    invoke-static {v0, v1, v9}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    shl-int/lit8 v5, v5, 0x19

    or-int/2addr v4, v5

    and-int v4, v4, v16

    aput v4, p0, v3

    add-int/lit8 v3, v2, 0x14

    invoke-static {v0, v1, v9}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x4

    invoke-static {v0, v1, v13}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    shl-int/lit8 v5, v5, 0x1c

    or-int/2addr v4, v5

    and-int v4, v4, v16

    aput v4, p0, v3

    add-int/lit8 v3, v2, 0x15

    invoke-static {v0, v1, v13}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x1

    and-int v4, v4, v16

    aput v4, p0, v3

    add-int/lit8 v3, v2, 0x16

    invoke-static {v0, v1, v13}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x1e

    invoke-static {v0, v1, v12}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    shl-int/lit8 v5, v5, 0x2

    or-int/2addr v4, v5

    and-int v4, v4, v16

    aput v4, p0, v3

    add-int/lit8 v3, v2, 0x17

    invoke-static {v0, v1, v12}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/2addr v4, v14

    invoke-static {v0, v1, v7}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    shl-int/lit8 v5, v5, 0x5

    or-int/2addr v4, v5

    and-int v4, v4, v16

    aput v4, p0, v3

    add-int/lit8 v3, v2, 0x18

    invoke-static {v0, v1, v7}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/2addr v4, v10

    const/16 v5, 0x16

    invoke-static {v0, v1, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    shl-int/lit8 v5, v5, 0x8

    or-int/2addr v4, v5

    and-int v4, v4, v16

    aput v4, p0, v3

    add-int/lit8 v3, v2, 0x19

    const/16 v4, 0x16

    invoke-static {v0, v1, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/2addr v4, v7

    const/16 v5, 0x17

    invoke-static {v0, v1, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v7

    shl-int/2addr v7, v11

    or-int/2addr v4, v7

    and-int v4, v4, v16

    aput v4, p0, v3

    add-int/lit8 v3, v2, 0x1a

    invoke-static {v0, v1, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/2addr v4, v9

    invoke-static {v0, v1, v10}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    shl-int/2addr v5, v6

    or-int/2addr v4, v5

    and-int v4, v4, v16

    aput v4, p0, v3

    add-int/lit8 v3, v2, 0x1b

    invoke-static {v0, v1, v10}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/2addr v4, v8

    const/16 v5, 0x19

    invoke-static {v0, v1, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    shl-int/2addr v5, v15

    or-int/2addr v4, v5

    and-int v4, v4, v16

    aput v4, p0, v3

    add-int/lit8 v3, v2, 0x1c

    const/16 v4, 0x19

    invoke-static {v0, v1, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0xc

    const/16 v5, 0x1a

    invoke-static {v0, v1, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v6

    shl-int/2addr v6, v12

    or-int/2addr v4, v6

    and-int v4, v4, v16

    aput v4, p0, v3

    add-int/lit8 v3, v2, 0x1d

    invoke-static {v0, v1, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x9

    invoke-static {v0, v1, v14}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    const/16 v26, 0x17

    shl-int/lit8 v5, v5, 0x17

    or-int/2addr v4, v5

    and-int v4, v4, v16

    aput v4, p0, v3

    add-int/lit8 v3, v2, 0x1e

    invoke-static {v0, v1, v14}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x6

    const/16 v5, 0x1c

    invoke-static {v0, v1, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    const/16 v24, 0x1a

    shl-int/lit8 v5, v5, 0x1a

    or-int/2addr v4, v5

    and-int v4, v4, v16

    aput v4, p0, v3

    add-int/lit8 v3, v2, 0x1f

    const/16 v4, 0x1c

    invoke-static {v0, v1, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x3

    aput v4, p0, v3

    add-int/lit8 v1, v1, 0x1d

    add-int/lit8 v2, v2, 0x20

    goto/16 :goto_0

    :cond_0
    const/16 v1, 0x3a00

    const/16 v2, 0x20

    move-object/from16 v3, p1

    move/from16 v4, p2

    invoke-static {v0, v1, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method static decodeSignature([B[J[BI)V
    .locals 10

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    const/16 v3, 0x400

    if-ge v1, v3, :cond_0

    invoke-static {p2, v2, v0}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v3

    shl-int/lit8 v3, v3, 0xc

    shr-int/lit8 v3, v3, 0xc

    int-to-long v3, v3

    aput-wide v3, p1, v1

    add-int/lit8 v3, v1, 0x1

    invoke-static {p2, v2, v0}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x14

    const/4 v5, 0x1

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v6

    shl-int/lit8 v6, v6, 0x18

    shr-int/lit8 v6, v6, 0xc

    or-int/2addr v4, v6

    int-to-long v6, v4

    aput-wide v6, p1, v3

    add-int/lit8 v3, v1, 0x2

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    const/4 v6, 0x4

    shl-int/2addr v4, v6

    shr-int/lit8 v4, v4, 0xc

    int-to-long v7, v4

    aput-wide v7, p1, v3

    add-int/lit8 v3, v1, 0x3

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x1c

    const/4 v5, 0x2

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v7

    shl-int/lit8 v7, v7, 0x10

    shr-int/lit8 v7, v7, 0xc

    or-int/2addr v4, v7

    int-to-long v7, v4

    aput-wide v7, p1, v3

    add-int/lit8 v3, v1, 0x4

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x10

    const/4 v5, 0x3

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v7

    shl-int/lit8 v7, v7, 0x1c

    shr-int/lit8 v7, v7, 0xc

    or-int/2addr v4, v7

    int-to-long v7, v4

    aput-wide v7, p1, v3

    add-int/lit8 v3, v1, 0x5

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    const/16 v7, 0x8

    shl-int/2addr v4, v7

    shr-int/lit8 v4, v4, 0xc

    int-to-long v8, v4

    aput-wide v8, p1, v3

    add-int/lit8 v3, v1, 0x6

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x18

    invoke-static {p2, v2, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    shl-int/lit8 v5, v5, 0x14

    shr-int/lit8 v5, v5, 0xc

    or-int/2addr v4, v5

    int-to-long v4, v4

    aput-wide v4, p1, v3

    add-int/lit8 v3, v1, 0x7

    invoke-static {p2, v2, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    shr-int/lit8 v4, v4, 0xc

    int-to-long v4, v4

    aput-wide v4, p1, v3

    add-int/lit8 v3, v1, 0x8

    const/4 v4, 0x5

    invoke-static {p2, v2, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    shl-int/lit8 v5, v5, 0xc

    shr-int/lit8 v5, v5, 0xc

    int-to-long v8, v5

    aput-wide v8, p1, v3

    add-int/lit8 v3, v1, 0x9

    invoke-static {p2, v2, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x14

    const/4 v5, 0x6

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v8

    shl-int/lit8 v8, v8, 0x18

    shr-int/lit8 v8, v8, 0xc

    or-int/2addr v4, v8

    int-to-long v8, v4

    aput-wide v8, p1, v3

    add-int/lit8 v3, v1, 0xa

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    shl-int/2addr v4, v6

    shr-int/lit8 v4, v4, 0xc

    int-to-long v8, v4

    aput-wide v8, p1, v3

    add-int/lit8 v3, v1, 0xb

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x1c

    const/4 v5, 0x7

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v6

    shl-int/lit8 v6, v6, 0x10

    shr-int/lit8 v6, v6, 0xc

    or-int/2addr v4, v6

    int-to-long v8, v4

    aput-wide v8, p1, v3

    add-int/lit8 v3, v1, 0xc

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x10

    invoke-static {p2, v2, v7}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v5

    shl-int/lit8 v5, v5, 0x1c

    shr-int/lit8 v5, v5, 0xc

    or-int/2addr v4, v5

    int-to-long v4, v4

    aput-wide v4, p1, v3

    add-int/lit8 v3, v1, 0xd

    invoke-static {p2, v2, v7}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    shl-int/2addr v4, v7

    shr-int/lit8 v4, v4, 0xc

    int-to-long v4, v4

    aput-wide v4, p1, v3

    add-int/lit8 v3, v1, 0xe

    invoke-static {p2, v2, v7}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    ushr-int/lit8 v4, v4, 0x18

    const/16 v5, 0x9

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v6

    shl-int/lit8 v6, v6, 0x14

    shr-int/lit8 v6, v6, 0xc

    or-int/2addr v4, v6

    int-to-long v6, v4

    aput-wide v6, p1, v3

    add-int/lit8 v3, v1, 0xf

    invoke-static {p2, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BII)I

    move-result v4

    shr-int/lit8 v4, v4, 0xc

    int-to-long v4, v4

    aput-wide v4, p1, v3

    add-int/lit8 v2, v2, 0xa

    add-int/lit8 v1, v1, 0x10

    goto/16 :goto_0

    :cond_0
    add-int/lit16 p3, p3, 0xa00

    const/16 p1, 0x20

    invoke-static {p2, p3, p0, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method static encodeC([I[S[BI)V
    .locals 10

    const/16 v0, 0x400

    new-array v0, v0, [S

    const/16 v1, 0xa8

    new-array v2, v1, [B

    const/4 v1, 0x1

    int-to-short v9, v1

    const/16 v8, 0x20

    const/4 v3, 0x0

    const/16 v4, 0xa8

    const/4 v5, 0x0

    move-object v6, p2

    move v7, p3

    invoke-static/range {v2 .. v8}, Lorg/bouncycastle/pqc/crypto/qtesla/HashUtils;->customizableSecureHashAlgorithmKECCAK128Simple([BIIS[BII)V

    const/4 p2, 0x0

    invoke-static {v0, p2}, Lorg/bouncycastle/util/Arrays;->fill([SS)V

    move p3, p2

    move v3, p3

    move v5, v9

    :goto_0
    const/16 v4, 0x19

    if-ge p3, v4, :cond_3

    const/16 v4, 0xa5

    if-le v3, v4, :cond_0

    add-int/lit8 v3, v5, 0x1

    int-to-short v9, v3

    const/16 v8, 0x20

    const/4 v3, 0x0

    const/16 v4, 0xa8

    invoke-static/range {v2 .. v8}, Lorg/bouncycastle/pqc/crypto/qtesla/HashUtils;->customizableSecureHashAlgorithmKECCAK128Simple([BIIS[BII)V

    move v3, p2

    move v5, v9

    :cond_0
    aget-byte v4, v2, v3

    shl-int/lit8 v4, v4, 0x8

    add-int/lit8 v8, v3, 0x1

    aget-byte v8, v2, v8

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v4, v8

    and-int/lit16 v4, v4, 0x3ff

    aget-short v8, v0, v4

    if-nez v8, :cond_2

    add-int/lit8 v8, v3, 0x2

    aget-byte v8, v2, v8

    and-int/2addr v8, v1

    if-ne v8, v1, :cond_1

    const/4 v8, -0x1

    aput-short v8, v0, v4

    goto :goto_1

    :cond_1
    aput-short v1, v0, v4

    :goto_1
    aput v4, p0, p3

    aget-short v4, v0, v4

    aput-short v4, p1, p3

    add-int/lit8 p3, p3, 0x1

    :cond_2
    add-int/lit8 v3, v3, 0x3

    goto :goto_0

    :cond_3
    return-void
.end method

.method static encodePrivateKey([B[J[J[BI)V
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/16 v2, 0x400

    if-ge v1, v2, :cond_0

    aget-wide v2, p1, v1

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, p0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_1
    const/4 v1, 0x4

    if-ge p1, v1, :cond_2

    move v1, v0

    :goto_2
    if-ge v1, v2, :cond_1

    mul-int/lit16 v3, p1, 0x400

    add-int/2addr v3, v1

    add-int v4, v2, v3

    aget-wide v5, p2, v3

    long-to-int v3, v5

    int-to-byte v3, v3

    aput-byte v3, p0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    const/16 p1, 0x1400

    const/16 p2, 0x40

    invoke-static {p3, p4, p0, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method static encodePublicKey([B[J[BI)V
    .locals 32

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0xe80

    if-ge v2, v3, :cond_0

    aget-wide v3, p1, v1

    add-int/lit8 v5, v1, 0x1

    aget-wide v6, p1, v5

    const/16 v8, 0x1d

    shl-long/2addr v6, v8

    or-long/2addr v3, v6

    long-to-int v3, v3

    const/4 v4, 0x0

    invoke-static {v0, v2, v4, v3}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v3, p1, v5

    const/4 v5, 0x3

    shr-long/2addr v3, v5

    add-int/lit8 v6, v1, 0x2

    aget-wide v7, p1, v6

    const/16 v9, 0x1a

    shl-long/2addr v7, v9

    or-long/2addr v3, v7

    long-to-int v3, v3

    const/4 v4, 0x1

    invoke-static {v0, v2, v4, v3}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v6, p1, v6

    const/4 v3, 0x6

    shr-long/2addr v6, v3

    add-int/lit8 v8, v1, 0x3

    aget-wide v10, p1, v8

    const/16 v12, 0x17

    shl-long/2addr v10, v12

    or-long/2addr v6, v10

    long-to-int v6, v6

    const/4 v7, 0x2

    invoke-static {v0, v2, v7, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v10, p1, v8

    const/16 v6, 0x9

    shr-long/2addr v10, v6

    add-int/lit8 v8, v1, 0x4

    aget-wide v13, p1, v8

    const/16 v15, 0x14

    shl-long/2addr v13, v15

    or-long/2addr v10, v13

    long-to-int v10, v10

    invoke-static {v0, v2, v5, v10}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v10, p1, v8

    const/16 v8, 0xc

    shr-long/2addr v10, v8

    add-int/lit8 v13, v1, 0x5

    aget-wide v16, p1, v13

    const/16 v14, 0x11

    shl-long v16, v16, v14

    or-long v10, v10, v16

    long-to-int v10, v10

    const/4 v11, 0x4

    invoke-static {v0, v2, v11, v10}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v16, p1, v13

    const/16 v10, 0xf

    shr-long v16, v16, v10

    add-int/lit8 v13, v1, 0x6

    aget-wide v18, p1, v13

    move/from16 v20, v4

    const/16 v4, 0xe

    shl-long v18, v18, v4

    move/from16 v22, v11

    or-long v11, v16, v18

    long-to-int v11, v11

    const/4 v12, 0x5

    invoke-static {v0, v2, v12, v11}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v16, p1, v13

    const/16 v11, 0x12

    shr-long v16, v16, v11

    add-int/lit8 v13, v1, 0x7

    aget-wide v18, p1, v13

    move/from16 v23, v5

    const/16 v5, 0xb

    shl-long v18, v18, v5

    move/from16 v24, v12

    move/from16 v25, v13

    or-long v12, v16, v18

    long-to-int v12, v12

    invoke-static {v0, v2, v3, v12}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v12, p1, v25

    move/from16 v16, v3

    const/16 v3, 0x15

    shr-long/2addr v12, v3

    add-int/lit8 v17, v1, 0x8

    aget-wide v18, p1, v17

    move/from16 v25, v7

    const/16 v7, 0x8

    shl-long v18, v18, v7

    or-long v12, v12, v18

    long-to-int v12, v12

    const/4 v13, 0x7

    invoke-static {v0, v2, v13, v12}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v17, p1, v17

    const/16 v12, 0x18

    shr-long v17, v17, v12

    add-int/lit8 v19, v1, 0x9

    aget-wide v26, p1, v19

    shl-long v26, v26, v24

    move/from16 v29, v12

    move/from16 v28, v13

    or-long v12, v17, v26

    long-to-int v12, v12

    invoke-static {v0, v2, v7, v12}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v12, p1, v19

    move/from16 v17, v7

    const/16 v7, 0x1b

    shr-long/2addr v12, v7

    add-int/lit8 v18, v1, 0xa

    aget-wide v18, p1, v18

    shl-long v18, v18, v25

    or-long v12, v12, v18

    add-int/lit8 v18, v1, 0xb

    aget-wide v26, p1, v18

    const/16 v19, 0x1f

    shl-long v26, v26, v19

    or-long v12, v12, v26

    long-to-int v12, v12

    invoke-static {v0, v2, v6, v12}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v12, p1, v18

    shr-long v12, v12, v20

    add-int/lit8 v18, v1, 0xc

    aget-wide v26, p1, v18

    const/16 v19, 0x1c

    shl-long v26, v26, v19

    or-long v12, v12, v26

    long-to-int v12, v12

    const/16 v13, 0xa

    invoke-static {v0, v2, v13, v12}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v18, p1, v18

    shr-long v18, v18, v22

    add-int/lit8 v12, v1, 0xd

    aget-wide v26, p1, v12

    const/16 v30, 0x19

    shl-long v26, v26, v30

    move/from16 v30, v6

    move/from16 v31, v7

    or-long v6, v18, v26

    long-to-int v6, v6

    invoke-static {v0, v2, v5, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v6, p1, v12

    shr-long v6, v6, v28

    add-int/lit8 v12, v1, 0xe

    aget-wide v18, p1, v12

    const/16 v26, 0x16

    shl-long v18, v18, v26

    or-long v6, v6, v18

    long-to-int v6, v6

    invoke-static {v0, v2, v8, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v6, p1, v12

    shr-long/2addr v6, v13

    add-int/lit8 v12, v1, 0xf

    aget-wide v18, p1, v12

    const/16 v26, 0x13

    shl-long v18, v18, v26

    or-long v6, v6, v18

    long-to-int v6, v6

    const/16 v7, 0xd

    invoke-static {v0, v2, v7, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v6, p1, v12

    const/16 v12, 0xd

    shr-long/2addr v6, v12

    add-int/lit8 v12, v1, 0x10

    aget-wide v18, p1, v12

    const/16 v26, 0x10

    shl-long v18, v18, v26

    or-long v6, v6, v18

    long-to-int v6, v6

    invoke-static {v0, v2, v4, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v6, p1, v12

    const/16 v12, 0x10

    shr-long/2addr v6, v12

    add-int/lit8 v12, v1, 0x11

    aget-wide v18, p1, v12

    const/16 v26, 0xd

    shl-long v18, v18, v26

    or-long v6, v6, v18

    long-to-int v6, v6

    invoke-static {v0, v2, v10, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v6, p1, v12

    const/16 v12, 0x13

    shr-long/2addr v6, v12

    add-int/lit8 v12, v1, 0x12

    aget-wide v18, p1, v12

    shl-long v18, v18, v13

    or-long v6, v6, v18

    long-to-int v6, v6

    const/16 v7, 0x10

    invoke-static {v0, v2, v7, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v6, p1, v12

    const/16 v12, 0x16

    shr-long/2addr v6, v12

    add-int/lit8 v12, v1, 0x13

    aget-wide v18, p1, v12

    shl-long v18, v18, v28

    or-long v6, v6, v18

    long-to-int v6, v6

    invoke-static {v0, v2, v14, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v6, p1, v12

    const/16 v12, 0x19

    shr-long/2addr v6, v12

    add-int/lit8 v12, v1, 0x14

    aget-wide v18, p1, v12

    shl-long v18, v18, v22

    or-long v6, v6, v18

    long-to-int v6, v6

    invoke-static {v0, v2, v11, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v6, p1, v12

    const/16 v12, 0x1c

    shr-long/2addr v6, v12

    add-int/lit8 v12, v1, 0x15

    aget-wide v12, p1, v12

    shl-long v12, v12, v20

    or-long/2addr v6, v12

    add-int/lit8 v12, v1, 0x16

    aget-wide v18, p1, v12

    const/16 v13, 0x1e

    shl-long v18, v18, v13

    or-long v6, v6, v18

    long-to-int v6, v6

    const/16 v7, 0x13

    invoke-static {v0, v2, v7, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v6, p1, v12

    shr-long v6, v6, v25

    add-int/lit8 v12, v1, 0x17

    aget-wide v18, p1, v12

    shl-long v18, v18, v31

    or-long v6, v6, v18

    long-to-int v6, v6

    invoke-static {v0, v2, v15, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v6, p1, v12

    shr-long v6, v6, v24

    add-int/lit8 v12, v1, 0x18

    aget-wide v18, p1, v12

    shl-long v18, v18, v29

    or-long v6, v6, v18

    long-to-int v6, v6

    invoke-static {v0, v2, v3, v6}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v6, p1, v12

    shr-long v6, v6, v17

    add-int/lit8 v12, v1, 0x19

    aget-wide v17, p1, v12

    shl-long v17, v17, v3

    or-long v6, v6, v17

    long-to-int v3, v6

    const/16 v6, 0x16

    invoke-static {v0, v2, v6, v3}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v6, p1, v12

    shr-long v5, v6, v5

    add-int/lit8 v3, v1, 0x1a

    aget-wide v12, p1, v3

    shl-long v11, v12, v11

    or-long/2addr v5, v11

    long-to-int v5, v5

    const/16 v6, 0x17

    invoke-static {v0, v2, v6, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v5, p1, v3

    shr-long v3, v5, v4

    add-int/lit8 v5, v1, 0x1b

    aget-wide v6, p1, v5

    shl-long/2addr v6, v10

    or-long/2addr v3, v6

    long-to-int v3, v3

    move/from16 v4, v29

    invoke-static {v0, v2, v4, v3}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v3, p1, v5

    shr-long/2addr v3, v14

    add-int/lit8 v5, v1, 0x1c

    aget-wide v6, p1, v5

    shl-long/2addr v6, v8

    or-long/2addr v3, v6

    long-to-int v3, v3

    const/16 v4, 0x19

    invoke-static {v0, v2, v4, v3}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v3, p1, v5

    shr-long/2addr v3, v15

    add-int/lit8 v5, v1, 0x1d

    aget-wide v6, p1, v5

    shl-long v6, v6, v30

    or-long/2addr v3, v6

    long-to-int v3, v3

    invoke-static {v0, v2, v9, v3}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v3, p1, v5

    const/16 v21, 0x17

    shr-long v3, v3, v21

    add-int/lit8 v5, v1, 0x1e

    aget-wide v6, p1, v5

    shl-long v6, v6, v16

    or-long/2addr v3, v6

    long-to-int v3, v3

    move/from16 v4, v31

    invoke-static {v0, v2, v4, v3}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v3, p1, v5

    shr-long/2addr v3, v9

    add-int/lit8 v5, v1, 0x1f

    aget-wide v5, p1, v5

    shl-long v5, v5, v23

    or-long/2addr v3, v5

    long-to-int v3, v3

    const/16 v4, 0x1c

    invoke-static {v0, v2, v4, v3}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    add-int/lit8 v1, v1, 0x20

    add-int/lit8 v2, v2, 0x1d

    goto/16 :goto_0

    :cond_0
    const/16 v1, 0x3a00

    const/16 v2, 0x20

    move-object/from16 v3, p2

    move/from16 v4, p3

    invoke-static {v3, v4, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method static encodeSignature([BI[BI[J)V
    .locals 26

    move-object/from16 v0, p0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    const/16 v4, 0x280

    if-ge v2, v4, :cond_0

    aget-wide v4, p4, v3

    const-wide/32 v6, 0xfffff

    and-long/2addr v4, v6

    add-int/lit8 v8, v3, 0x1

    aget-wide v9, p4, v8

    const/16 v11, 0x14

    shl-long/2addr v9, v11

    or-long/2addr v4, v9

    long-to-int v4, v4

    invoke-static {v0, v2, v1, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v4, p4, v8

    const/16 v8, 0xc

    ushr-long/2addr v4, v8

    const-wide/16 v9, 0xff

    and-long/2addr v4, v9

    add-int/lit8 v12, v3, 0x2

    aget-wide v12, p4, v12

    and-long/2addr v12, v6

    const/16 v14, 0x8

    shl-long/2addr v12, v14

    or-long/2addr v4, v12

    add-int/lit8 v12, v3, 0x3

    aget-wide v15, p4, v12

    const/16 v13, 0x1c

    shl-long/2addr v15, v13

    or-long/2addr v4, v15

    long-to-int v4, v4

    const/4 v5, 0x1

    invoke-static {v0, v2, v5, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v4, p4, v12

    const/4 v12, 0x4

    ushr-long/2addr v4, v12

    const-wide/32 v15, 0xffff

    and-long/2addr v4, v15

    add-int/lit8 v17, v3, 0x4

    aget-wide v18, p4, v17

    const/16 v20, 0x10

    shl-long v18, v18, v20

    or-long v4, v4, v18

    long-to-int v4, v4

    const/4 v5, 0x2

    invoke-static {v0, v2, v5, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v4, p4, v17

    ushr-long v4, v4, v20

    const-wide/16 v17, 0xf

    and-long v4, v4, v17

    add-int/lit8 v19, v3, 0x5

    aget-wide v21, p4, v19

    and-long v21, v21, v6

    shl-long v21, v21, v12

    or-long v4, v4, v21

    add-int/lit8 v19, v3, 0x6

    aget-wide v21, p4, v19

    const/16 v23, 0x18

    shl-long v21, v21, v23

    or-long v4, v4, v21

    long-to-int v4, v4

    const/4 v5, 0x3

    invoke-static {v0, v2, v5, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v4, p4, v19

    ushr-long/2addr v4, v14

    const-wide/16 v21, 0xfff

    and-long v4, v4, v21

    add-int/lit8 v19, v3, 0x7

    aget-wide v24, p4, v19

    shl-long v24, v24, v8

    or-long v4, v4, v24

    long-to-int v4, v4

    invoke-static {v0, v2, v12, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    add-int/lit8 v4, v3, 0x8

    aget-wide v4, p4, v4

    and-long/2addr v4, v6

    add-int/lit8 v19, v3, 0x9

    aget-wide v24, p4, v19

    shl-long v24, v24, v11

    or-long v4, v4, v24

    long-to-int v4, v4

    const/4 v5, 0x5

    invoke-static {v0, v2, v5, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v4, p4, v19

    ushr-long/2addr v4, v8

    and-long/2addr v4, v9

    add-int/lit8 v9, v3, 0xa

    aget-wide v9, p4, v9

    and-long/2addr v9, v6

    shl-long/2addr v9, v14

    or-long/2addr v4, v9

    add-int/lit8 v9, v3, 0xb

    aget-wide v10, p4, v9

    shl-long/2addr v10, v13

    or-long/2addr v4, v10

    long-to-int v4, v4

    const/4 v5, 0x6

    invoke-static {v0, v2, v5, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v4, p4, v9

    ushr-long/2addr v4, v12

    and-long/2addr v4, v15

    add-int/lit8 v9, v3, 0xc

    aget-wide v10, p4, v9

    shl-long v10, v10, v20

    or-long/2addr v4, v10

    long-to-int v4, v4

    const/4 v5, 0x7

    invoke-static {v0, v2, v5, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v4, p4, v9

    ushr-long v4, v4, v20

    and-long v4, v4, v17

    add-int/lit8 v9, v3, 0xd

    aget-wide v9, p4, v9

    and-long/2addr v6, v9

    shl-long/2addr v6, v12

    or-long/2addr v4, v6

    add-int/lit8 v6, v3, 0xe

    aget-wide v9, p4, v6

    shl-long v9, v9, v23

    or-long/2addr v4, v9

    long-to-int v4, v4

    invoke-static {v0, v2, v14, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    aget-wide v4, p4, v6

    ushr-long/2addr v4, v14

    and-long v4, v4, v21

    add-int/lit8 v6, v3, 0xf

    aget-wide v6, p4, v6

    shl-long/2addr v6, v8

    or-long/2addr v4, v6

    long-to-int v4, v4

    const/16 v5, 0x9

    invoke-static {v0, v2, v5, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->at([BIII)V

    add-int/lit8 v3, v3, 0x10

    add-int/lit8 v2, v2, 0xa

    goto/16 :goto_0

    :cond_0
    move/from16 v1, p1

    add-int/lit16 v1, v1, 0xa00

    const/16 v2, 0x20

    move-object/from16 v3, p2

    move/from16 v4, p3

    invoke-static {v3, v4, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method static generateKeyPair([B[BLjava/security/SecureRandom;)I
    .locals 15

    const/16 v0, 0x20

    new-array v4, v0, [B

    const/16 v0, 0xe0

    new-array v1, v0, [B

    const/16 v0, 0x400

    new-array v7, v0, [J

    const/16 v2, 0x1000

    new-array v12, v2, [J

    new-array v14, v2, [J

    new-array v8, v2, [J

    new-array v0, v0, [J

    move-object/from16 v2, p2

    invoke-virtual {v2, v4}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/4 v5, 0x0

    const/16 v6, 0x20

    const/4 v2, 0x0

    const/16 v3, 0xe0

    invoke-static/range {v1 .. v6}, Lorg/bouncycastle/pqc/crypto/qtesla/HashUtils;->secureHashAlgorithmKECCAK128([BII[BII)V

    move v3, v2

    move v4, v3

    :goto_0
    const/16 v5, 0x22a

    const/4 v6, 0x4

    if-ge v3, v6, :cond_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    mul-int/lit8 v6, v3, 0x20

    mul-int/lit16 v9, v3, 0x400

    invoke-static {v4, v1, v6, v12, v9}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$Gaussian;->sample_gauss_polly(I[BI[JI)V

    invoke-static {v12, v9, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->checkPolynomial([JII)Z

    move-result v6

    if-nez v6, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    const/16 v3, 0x80

    invoke-static {v4, v1, v3, v7, v2}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$Gaussian;->sample_gauss_polly(I[BI[JI)V

    invoke-static {v7, v2, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->checkPolynomial([JII)Z

    move-result v3

    if-nez v3, :cond_3

    const/16 v3, 0xa0

    invoke-static {v14, v1, v3}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->poly_uniform([J[BI)V

    invoke-static {v0, v7}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->poly_ntt([J[J)V

    move v4, v2

    :goto_2
    if-ge v4, v6, :cond_2

    mul-int/lit16 v9, v4, 0x400

    invoke-static {v8, v9, v14, v9, v0}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->poly_mul([JI[JI[J)V

    move-object v10, v8

    move v11, v9

    move v13, v9

    invoke-static/range {v8 .. v13}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->poly_add_correct([JI[JI[JI)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    invoke-static {p0, v8, v1, v3}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->encodePublicKey([B[J[BI)V

    move-object/from16 v9, p1

    invoke-static {v9, v7, v12, v1, v3}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->encodePrivateKey([B[J[J[BI)V

    return v2

    :cond_3
    move-object/from16 v9, p1

    goto :goto_1
.end method

.method static generateSignature([B[BII[BLjava/security/SecureRandom;)I
    .locals 25

    move-object/from16 v2, p4

    const/16 v0, 0x20

    new-array v6, v0, [B

    new-array v7, v0, [B

    const/16 v1, 0x80

    new-array v10, v1, [B

    const/16 v1, 0x19

    new-array v4, v1, [I

    new-array v5, v1, [S

    const/16 v1, 0x400

    new-array v14, v1, [J

    new-array v15, v1, [J

    new-array v3, v1, [J

    new-array v1, v1, [J

    const/16 v8, 0x1000

    new-array v9, v8, [J

    new-array v11, v8, [J

    new-array v8, v8, [J

    new-array v12, v0, [B

    move-object/from16 v13, p5

    invoke-virtual {v13, v12}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/4 v13, 0x0

    invoke-static {v12, v13, v10, v0, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v12, 0x1420

    invoke-static {v2, v12, v10, v13, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v8

    move-object v8, v10

    const/16 v10, 0x40

    const/4 v12, 0x0

    move-object/from16 v16, v9

    const/16 v9, 0x40

    move/from16 v13, p3

    move-object/from16 v20, v11

    move-object/from16 v22, v16

    move-object/from16 v11, p1

    invoke-static/range {v8 .. v13}, Lorg/bouncycastle/pqc/crypto/qtesla/HashUtils;->secureHashAlgorithmKECCAK128([BII[BII)V

    const/4 v11, 0x0

    const/16 v12, 0x80

    move-object v10, v8

    const/4 v8, 0x0

    const/16 v9, 0x20

    invoke-static/range {v7 .. v12}, Lorg/bouncycastle/pqc/crypto/qtesla/HashUtils;->secureHashAlgorithmKECCAK128([BII[BII)V

    move-object v8, v10

    const/16 v9, 0x1400

    invoke-static {v0, v2, v9}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->poly_uniform([J[BI)V

    const/4 v9, 0x0

    const/4 v13, 0x0

    :goto_0
    add-int/lit8 v13, v13, 0x1

    const/4 v10, 0x0

    invoke-static {v14, v7, v10, v13}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->sample_y([J[BII)V

    invoke-static {v15, v14}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->poly_ntt([J[J)V

    const/4 v10, 0x0

    :goto_1
    const/4 v11, 0x4

    if-ge v10, v11, :cond_0

    mul-int/lit16 v11, v10, 0x400

    move-object/from16 v12, v22

    invoke-static {v12, v11, v0, v11, v15}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->poly_mul([JI[JI[J)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_0
    move-object/from16 v12, v22

    const/16 v10, 0x40

    const/4 v11, 0x0

    invoke-static {v6, v11, v12, v8, v10}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->hashFunction([BI[J[BI)V

    invoke-static {v4, v5, v6, v11}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->encodeC([I[S[BI)V

    invoke-static {v3, v2, v4, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->sparse_mul8([J[B[I[S)V

    invoke-static {v1, v14, v3}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->poly_add([J[J[J)V

    invoke-static {v1}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->testRejection([J)Z

    move-result v10

    if-eqz v10, :cond_1

    :goto_2
    move-object/from16 v22, v12

    goto :goto_0

    :cond_1
    move v10, v11

    :goto_3
    const/4 v11, 0x4

    if-ge v10, v11, :cond_3

    move-object v9, v1

    mul-int/lit16 v1, v10, 0x400

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v17, v3

    mul-int/lit16 v3, v10, 0x400

    move-object/from16 v23, v0

    move-object/from16 v22, v17

    move-object/from16 v0, v20

    const/4 v11, 0x0

    invoke-static/range {v0 .. v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->sparse_mul8([JI[BI[I[S)V

    move-object/from16 v18, v12

    move/from16 v19, v1

    move/from16 v21, v1

    move/from16 v17, v1

    move-object/from16 v16, v12

    invoke-static/range {v16 .. v21}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->poly_sub([JI[JI[JI)V

    invoke-static {v12, v1}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->test_correctness([JI)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object/from16 v24, v9

    move v9, v0

    move-object/from16 v0, v24

    goto :goto_4

    :cond_2
    move-object/from16 v2, p4

    move-object v1, v9

    move-object/from16 v3, v22

    move v9, v0

    move-object/from16 v0, v23

    goto :goto_3

    :cond_3
    move-object/from16 v23, v0

    move-object v0, v1

    move-object/from16 v22, v3

    const/4 v11, 0x0

    :goto_4
    if-eqz v9, :cond_4

    move-object/from16 v2, p4

    move-object v1, v0

    move-object/from16 v3, v22

    move-object/from16 v0, v23

    goto :goto_2

    :cond_4
    move-object/from16 v1, p0

    invoke-static {v1, v11, v6, v11, v0}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->encodeSignature([BI[BI[J)V

    return v11
.end method

.method private static hashFunction([BI[J[BI)V
    .locals 9

    const/16 v0, 0x1040

    new-array v4, v0, [B

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    mul-int/lit16 v2, v1, 0x400

    move v3, v0

    :goto_1
    const/16 v5, 0x400

    if-ge v3, v5, :cond_0

    aget-wide v5, p2, v2

    long-to-int v5, v5

    const v6, 0xa3d4800

    sub-int/2addr v6, v5

    shr-int/lit8 v6, v6, 0x1f

    const v7, 0x147a9001

    sub-int v7, v5, v7

    and-int/2addr v7, v6

    not-int v6, v6

    and-int/2addr v5, v6

    or-int/2addr v5, v7

    const v6, 0x3fffff

    and-int/2addr v6, v5

    const/high16 v7, 0x200000

    sub-int/2addr v7, v6

    shr-int/lit8 v7, v7, 0x1f

    const/high16 v8, 0x400000

    sub-int v8, v6, v8

    and-int/2addr v8, v7

    not-int v7, v7

    and-int/2addr v6, v7

    or-int/2addr v6, v8

    add-int/lit8 v7, v2, 0x1

    sub-int/2addr v5, v6

    shr-int/lit8 v5, v5, 0x16

    int-to-byte v5, v5

    aput-byte v5, v4, v2

    add-int/lit8 v3, v3, 0x1

    move v2, v7

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/16 p2, 0x1000

    const/16 v0, 0x40

    invoke-static {p3, p4, v4, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v5, 0x0

    const/16 v6, 0x1040

    const/16 v3, 0x20

    move-object v1, p0

    move v2, p1

    invoke-static/range {v1 .. v6}, Lorg/bouncycastle/pqc/crypto/qtesla/HashUtils;->secureHashAlgorithmKECCAK128([BII[BII)V

    return-void
.end method

.method static lE24BitToInt([BI)I
    .locals 2

    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x2

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x10

    or-int/2addr p0, v0

    return p0
.end method

.method static memoryEqual([BI[BII)Z
    .locals 4

    add-int v0, p1, p4

    array-length v1, p0

    const/4 v2, 0x0

    if-gt v0, v1, :cond_2

    add-int v0, p3, p4

    array-length v1, p2

    if-gt v0, v1, :cond_2

    move v0, v2

    :goto_0
    if-ge v0, p4, :cond_1

    add-int v1, p1, v0

    aget-byte v1, p0, v1

    add-int v3, p3, v0

    aget-byte v3, p2, v3

    if-eq v1, v3, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return v2
.end method

.method static sample_y([J[BII)V
    .locals 12

    sget v0, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->BPLUS1BYTES:I

    mul-int/lit16 v1, v0, 0x400

    add-int/lit8 v1, v1, 0x1

    new-array v2, v1, [B

    shl-int/lit8 p3, p3, 0x8

    int-to-short v5, p3

    mul-int/lit16 v4, v0, 0x400

    add-int/lit8 p3, v5, 0x1

    int-to-short p3, p3

    const/16 v8, 0x20

    const/4 v3, 0x0

    move-object v6, p1

    move v7, p2

    invoke-static/range {v2 .. v8}, Lorg/bouncycastle/pqc/crypto/qtesla/HashUtils;->customizableSecureHashAlgorithmKECCAK128Simple([BIIS[BII)V

    const/4 p1, 0x0

    const/16 p2, 0x400

    move v1, p1

    move v3, p2

    move v5, p3

    move p3, v1

    :goto_0
    if-ge p3, p2, :cond_2

    mul-int v8, v3, v0

    if-lt v1, v8, :cond_0

    sget v1, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->NBLOCKS_SHAKE:I

    add-int/lit8 v3, v5, 0x1

    int-to-short v9, v3

    const/16 v8, 0x20

    const/4 v3, 0x0

    invoke-static/range {v2 .. v8}, Lorg/bouncycastle/pqc/crypto/qtesla/HashUtils;->customizableSecureHashAlgorithmKECCAK128Simple([BIIS[BII)V

    move v3, v1

    move v5, v9

    move v1, p1

    :cond_0
    invoke-static {v2, v1}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->lE24BitToInt([BI)I

    move-result v8

    const v9, 0xfffff

    and-int/2addr v8, v9

    int-to-long v8, v8

    aput-wide v8, p0, p3

    const-wide/32 v10, 0x7ffff

    sub-long/2addr v8, v10

    aput-wide v8, p0, p3

    const-wide/32 v10, 0x80000

    cmp-long v8, v8, v10

    if-eqz v8, :cond_1

    add-int/lit8 p3, p3, 0x1

    :cond_1
    add-int/2addr v1, v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static testRejection([J)Z
    .locals 8

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    const/16 v3, 0x400

    if-ge v1, v3, :cond_0

    int-to-long v2, v2

    aget-wide v4, p0, v1

    invoke-static {v4, v5}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->absolute(J)J

    move-result-wide v4

    const-wide/32 v6, 0x7fdd5

    sub-long/2addr v6, v4

    or-long/2addr v2, v6

    long-to-int v2, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    ushr-int/lit8 p0, v2, 0x1f

    if-lez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v0
.end method

.method private static testZ([J)Z
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/16 v2, 0x400

    if-ge v1, v2, :cond_2

    aget-wide v2, p0, v1

    const-wide/32 v4, -0x7fdd5

    cmp-long v4, v2, v4

    if-ltz v4, :cond_1

    const-wide/32 v4, 0x7fdd5

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method static test_correctness([JI)Z
    .locals 9

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/16 v2, 0x400

    if-ge v1, v2, :cond_1

    add-int v2, p1, v1

    aget-wide v2, p0, v2

    const-wide/32 v4, 0xa3d4800

    sub-long/2addr v4, v2

    long-to-int v4, v4

    shr-int/lit8 v4, v4, 0x1f

    const-wide/32 v5, 0x147a9001

    sub-long v5, v2, v5

    int-to-long v7, v4

    and-long/2addr v5, v7

    not-int v4, v4

    int-to-long v7, v4

    and-long/2addr v2, v7

    or-long/2addr v2, v5

    long-to-int v2, v2

    invoke-static {v2}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->absolute(I)I

    move-result v3

    const v4, 0xa3d45d6

    sub-int/2addr v3, v4

    not-int v3, v3

    const v4, 0x1fffff

    add-int/2addr v4, v2

    shr-int/lit8 v4, v4, 0x16

    shl-int/lit8 v4, v4, 0x16

    sub-int/2addr v2, v4

    invoke-static {v2}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->absolute(I)I

    move-result v2

    const v4, 0x1ffdd6

    sub-int/2addr v2, v4

    not-int v2, v2

    or-int/2addr v2, v3

    ushr-int/lit8 v2, v2, 0x1f

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    return v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method static verifying([B[BII[B)I
    .locals 19

    const/16 v0, 0x20

    new-array v1, v0, [B

    new-array v2, v0, [B

    new-array v3, v0, [B

    const/16 v4, 0x40

    new-array v5, v4, [B

    const/16 v4, 0x19

    new-array v10, v4, [I

    new-array v11, v4, [S

    const/16 v4, 0x1000

    new-array v8, v4, [I

    new-array v12, v4, [J

    new-array v13, v4, [J

    new-array v6, v4, [J

    const/16 v4, 0x400

    new-array v7, v4, [J

    new-array v4, v4, [J

    const/16 v9, 0xa20

    move/from16 v14, p3

    if-ge v14, v9, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    move-object/from16 v9, p1

    move/from16 v14, p2

    invoke-static {v1, v7, v9, v14}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->decodeSignature([B[J[BI)V

    invoke-static {v7}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->testZ([J)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v0, -0x2

    return v0

    :cond_1
    const/4 v14, 0x0

    move-object/from16 v9, p4

    invoke-static {v8, v3, v14, v9}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->decodePublicKey([I[BI[B)V

    invoke-static {v13, v3, v14}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->poly_uniform([J[BI)V

    invoke-static {v10, v11, v1, v14}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->encodeC([I[S[BI)V

    invoke-static {v4, v7}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->poly_ntt([J[J)V

    move v3, v14

    :goto_0
    const/4 v7, 0x4

    if-ge v3, v7, :cond_2

    mul-int/lit16 v7, v3, 0x400

    move v9, v7

    invoke-static/range {v6 .. v11}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->sparse_mul32([JI[II[I[S)V

    move-object/from16 v16, v6

    invoke-static {v12, v7, v13, v7, v4}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->poly_mul([JI[JI[J)V

    move v6, v14

    move-object v14, v12

    move v15, v7

    move/from16 v17, v7

    move/from16 v18, v7

    move v7, v6

    move-object v6, v13

    move/from16 v13, v18

    invoke-static/range {v12 .. v17}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p$QTesla1PPolynomial;->poly_sub([JI[JI[JI)V

    add-int/lit8 v3, v3, 0x1

    move-object v13, v6

    move v14, v7

    move-object/from16 v6, v16

    goto :goto_0

    :cond_2
    move v7, v14

    const/4 v9, 0x0

    move-object/from16 v8, p0

    array-length v10, v8

    const/4 v6, 0x0

    move v3, v7

    const/16 v7, 0x40

    invoke-static/range {v5 .. v10}, Lorg/bouncycastle/pqc/crypto/qtesla/HashUtils;->secureHashAlgorithmKECCAK128([BII[BII)V

    invoke-static {v2, v3, v12, v5, v3}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->hashFunction([BI[J[BI)V

    invoke-static {v1, v3, v2, v3, v0}, Lorg/bouncycastle/pqc/crypto/qtesla/QTesla1p;->memoryEqual([BI[BII)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, -0x3

    return v0

    :cond_3
    return v3
.end method
