.class final Landroidx/camera/core/impl/utils/ExifAttribute;
.super Ljava/lang/Object;
.source "ExifAttribute.java"


# static fields
.field static final ASCII:Ljava/nio/charset/Charset;

.field public static final BYTES_OFFSET_UNKNOWN:J = -0x1L

.field static final EXIF_ASCII_PREFIX:[B

.field static final IFD_FORMAT_BYTE:I = 0x1

.field static final IFD_FORMAT_BYTES_PER_FORMAT:[I

.field static final IFD_FORMAT_DOUBLE:I = 0xc

.field static final IFD_FORMAT_NAMES:[Ljava/lang/String;

.field static final IFD_FORMAT_SBYTE:I = 0x6

.field static final IFD_FORMAT_SINGLE:I = 0xb

.field static final IFD_FORMAT_SLONG:I = 0x9

.field static final IFD_FORMAT_SRATIONAL:I = 0xa

.field static final IFD_FORMAT_SSHORT:I = 0x8

.field static final IFD_FORMAT_STRING:I = 0x2

.field static final IFD_FORMAT_ULONG:I = 0x4

.field static final IFD_FORMAT_UNDEFINED:I = 0x7

.field static final IFD_FORMAT_URATIONAL:I = 0x5

.field static final IFD_FORMAT_USHORT:I = 0x3

.field private static final TAG:Ljava/lang/String; = "ExifAttribute"


# instance fields
.field public final bytes:[B

.field public final bytesOffset:J

.field public final format:I

.field public final numberOfComponents:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 43
    sget-object v0, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    sput-object v0, Landroidx/camera/core/impl/utils/ExifAttribute;->ASCII:Ljava/nio/charset/Charset;

    const/16 v0, 0xe

    .line 59
    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, ""

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "BYTE"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "STRING"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "USHORT"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string v3, "ULONG"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const-string v3, "URATIONAL"

    aput-object v3, v1, v2

    const/4 v2, 0x6

    const-string v3, "SBYTE"

    aput-object v3, v1, v2

    const/4 v2, 0x7

    const-string v3, "UNDEFINED"

    aput-object v3, v1, v2

    const-string v2, "SSHORT"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const/16 v2, 0x9

    const-string v4, "SLONG"

    aput-object v4, v1, v2

    const/16 v2, 0xa

    const-string v4, "SRATIONAL"

    aput-object v4, v1, v2

    const/16 v2, 0xb

    const-string v4, "SINGLE"

    aput-object v4, v1, v2

    const/16 v2, 0xc

    const-string v4, "DOUBLE"

    aput-object v4, v1, v2

    const/16 v2, 0xd

    const-string v4, "IFD"

    aput-object v4, v1, v2

    sput-object v1, Landroidx/camera/core/impl/utils/ExifAttribute;->IFD_FORMAT_NAMES:[Ljava/lang/String;

    .line 64
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Landroidx/camera/core/impl/utils/ExifAttribute;->IFD_FORMAT_BYTES_PER_FORMAT:[I

    .line 69
    new-array v0, v3, [B

    fill-array-data v0, :array_1

    sput-object v0, Landroidx/camera/core/impl/utils/ExifAttribute;->EXIF_ASCII_PREFIX:[B

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x1
        0x1
        0x2
        0x4
        0x8
        0x1
        0x1
        0x2
        0x4
        0x8
        0x4
        0x8
        0x1
    .end array-data

    :array_1
    .array-data 1
        0x41t
        0x53t
        0x43t
        0x49t
        0x49t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method constructor <init>(IIJ[B)V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput p1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->format:I

    .line 86
    iput p2, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    .line 87
    iput-wide p3, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->bytesOffset:J

    .line 88
    iput-object p5, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->bytes:[B

    return-void
.end method

.method constructor <init>(II[B)V
    .locals 6

    const-wide/16 v3, -0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v5, p3

    .line 80
    invoke-direct/range {v0 .. v5}, Landroidx/camera/core/impl/utils/ExifAttribute;-><init>(IIJ[B)V

    return-void
.end method

.method public static createByte(Ljava/lang/String;)Landroidx/camera/core/impl/utils/ExifAttribute;
    .locals 5

    .line 142
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x31

    if-gt v2, v4, :cond_0

    .line 143
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    sub-int/2addr p0, v3

    int-to-byte p0, p0

    new-array v2, v1, [B

    aput-byte p0, v2, v0

    .line 144
    new-instance p0, Landroidx/camera/core/impl/utils/ExifAttribute;

    invoke-direct {p0, v1, v1, v2}, Landroidx/camera/core/impl/utils/ExifAttribute;-><init>(II[B)V

    return-object p0

    .line 146
    :cond_0
    sget-object v0, Landroidx/camera/core/impl/utils/ExifAttribute;->ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    .line 147
    new-instance v0, Landroidx/camera/core/impl/utils/ExifAttribute;

    array-length v2, p0

    invoke-direct {v0, v1, v2, p0}, Landroidx/camera/core/impl/utils/ExifAttribute;-><init>(II[B)V

    return-object v0
.end method

.method public static createDouble(DLjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;
    .locals 2

    const/4 v0, 0x1

    .line 208
    new-array v0, v0, [D

    const/4 v1, 0x0

    aput-wide p0, v0, v1

    invoke-static {v0, p2}, Landroidx/camera/core/impl/utils/ExifAttribute;->createDouble([DLjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;

    move-result-object p0

    return-object p0
.end method

.method public static createDouble([DLjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;
    .locals 5

    .line 197
    sget-object v0, Landroidx/camera/core/impl/utils/ExifAttribute;->IFD_FORMAT_BYTES_PER_FORMAT:[I

    const/16 v1, 0xc

    aget v0, v0, v1

    array-length v2, p0

    mul-int/2addr v0, v2

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 199
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 200
    array-length p1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget-wide v3, p0, v2

    .line 201
    invoke-virtual {v0, v3, v4}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 203
    :cond_0
    new-instance p1, Landroidx/camera/core/impl/utils/ExifAttribute;

    array-length p0, p0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Landroidx/camera/core/impl/utils/ExifAttribute;-><init>(II[B)V

    return-object p1
.end method

.method public static createSLong(ILjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;
    .locals 0

    .line 136
    filled-new-array {p0}, [I

    move-result-object p0

    invoke-static {p0, p1}, Landroidx/camera/core/impl/utils/ExifAttribute;->createSLong([ILjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;

    move-result-object p0

    return-object p0
.end method

.method public static createSLong([ILjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;
    .locals 4

    .line 125
    sget-object v0, Landroidx/camera/core/impl/utils/ExifAttribute;->IFD_FORMAT_BYTES_PER_FORMAT:[I

    const/16 v1, 0x9

    aget v0, v0, v1

    array-length v2, p0

    mul-int/2addr v0, v2

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 127
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 128
    array-length p1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget v3, p0, v2

    .line 129
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 131
    :cond_0
    new-instance p1, Landroidx/camera/core/impl/utils/ExifAttribute;

    array-length p0, p0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Landroidx/camera/core/impl/utils/ExifAttribute;-><init>(II[B)V

    return-object p1
.end method

.method public static createSRational(Landroidx/camera/core/impl/utils/LongRational;Ljava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;
    .locals 2

    const/4 v0, 0x1

    .line 191
    new-array v0, v0, [Landroidx/camera/core/impl/utils/LongRational;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0, p1}, Landroidx/camera/core/impl/utils/ExifAttribute;->createSRational([Landroidx/camera/core/impl/utils/LongRational;Ljava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;

    move-result-object p0

    return-object p0
.end method

.method public static createSRational([Landroidx/camera/core/impl/utils/LongRational;Ljava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;
    .locals 6

    .line 178
    sget-object v0, Landroidx/camera/core/impl/utils/ExifAttribute;->IFD_FORMAT_BYTES_PER_FORMAT:[I

    const/16 v1, 0xa

    aget v0, v0, v1

    array-length v2, p0

    mul-int/2addr v0, v2

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 180
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 181
    array-length p1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget-object v3, p0, v2

    .line 182
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/LongRational;->getNumerator()J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 183
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/LongRational;->getDenominator()J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 185
    :cond_0
    new-instance p1, Landroidx/camera/core/impl/utils/ExifAttribute;

    array-length p0, p0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Landroidx/camera/core/impl/utils/ExifAttribute;-><init>(II[B)V

    return-object p1
.end method

.method public static createString(Ljava/lang/String;)Landroidx/camera/core/impl/utils/ExifAttribute;
    .locals 3

    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Landroidx/camera/core/impl/utils/ExifAttribute;->ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    .line 153
    new-instance v0, Landroidx/camera/core/impl/utils/ExifAttribute;

    const/4 v1, 0x2

    array-length v2, p0

    invoke-direct {v0, v1, v2, p0}, Landroidx/camera/core/impl/utils/ExifAttribute;-><init>(II[B)V

    return-object v0
.end method

.method public static createULong(JLjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;
    .locals 2

    const/4 v0, 0x1

    .line 120
    new-array v0, v0, [J

    const/4 v1, 0x0

    aput-wide p0, v0, v1

    invoke-static {v0, p2}, Landroidx/camera/core/impl/utils/ExifAttribute;->createULong([JLjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;

    move-result-object p0

    return-object p0
.end method

.method public static createULong([JLjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;
    .locals 5

    .line 109
    sget-object v0, Landroidx/camera/core/impl/utils/ExifAttribute;->IFD_FORMAT_BYTES_PER_FORMAT:[I

    const/4 v1, 0x4

    aget v0, v0, v1

    array-length v2, p0

    mul-int/2addr v0, v2

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 111
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 112
    array-length p1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget-wide v3, p0, v2

    long-to-int v3, v3

    .line 113
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 115
    :cond_0
    new-instance p1, Landroidx/camera/core/impl/utils/ExifAttribute;

    array-length p0, p0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Landroidx/camera/core/impl/utils/ExifAttribute;-><init>(II[B)V

    return-object p1
.end method

.method public static createURational(Landroidx/camera/core/impl/utils/LongRational;Ljava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;
    .locals 2

    const/4 v0, 0x1

    .line 172
    new-array v0, v0, [Landroidx/camera/core/impl/utils/LongRational;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0, p1}, Landroidx/camera/core/impl/utils/ExifAttribute;->createURational([Landroidx/camera/core/impl/utils/LongRational;Ljava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;

    move-result-object p0

    return-object p0
.end method

.method public static createURational([Landroidx/camera/core/impl/utils/LongRational;Ljava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;
    .locals 6

    .line 159
    sget-object v0, Landroidx/camera/core/impl/utils/ExifAttribute;->IFD_FORMAT_BYTES_PER_FORMAT:[I

    const/4 v1, 0x5

    aget v0, v0, v1

    array-length v2, p0

    mul-int/2addr v0, v2

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 161
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 162
    array-length p1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget-object v3, p0, v2

    .line 163
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/LongRational;->getNumerator()J

    move-result-wide v4

    long-to-int v4, v4

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 164
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/LongRational;->getDenominator()J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 166
    :cond_0
    new-instance p1, Landroidx/camera/core/impl/utils/ExifAttribute;

    array-length p0, p0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Landroidx/camera/core/impl/utils/ExifAttribute;-><init>(II[B)V

    return-object p1
.end method

.method public static createUShort(ILjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;
    .locals 0

    .line 104
    filled-new-array {p0}, [I

    move-result-object p0

    invoke-static {p0, p1}, Landroidx/camera/core/impl/utils/ExifAttribute;->createUShort([ILjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;

    move-result-object p0

    return-object p0
.end method

.method public static createUShort([ILjava/nio/ByteOrder;)Landroidx/camera/core/impl/utils/ExifAttribute;
    .locals 4

    .line 93
    sget-object v0, Landroidx/camera/core/impl/utils/ExifAttribute;->IFD_FORMAT_BYTES_PER_FORMAT:[I

    const/4 v1, 0x3

    aget v0, v0, v1

    array-length v2, p0

    mul-int/2addr v0, v2

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 95
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 96
    array-length p1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    aget v3, p0, v2

    int-to-short v3, v3

    .line 97
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 99
    :cond_0
    new-instance p1, Landroidx/camera/core/impl/utils/ExifAttribute;

    array-length p0, p0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Landroidx/camera/core/impl/utils/ExifAttribute;-><init>(II[B)V

    return-object p1
.end method


# virtual methods
.method public getDoubleValue(Ljava/nio/ByteOrder;)D
    .locals 4

    .line 340
    invoke-virtual {p0, p1}, Landroidx/camera/core/impl/utils/ExifAttribute;->getValue(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 344
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 345
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0

    .line 347
    :cond_0
    instance-of v0, p1, [J

    const/4 v1, 0x0

    const-string v2, "There are more than one component"

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    .line 348
    check-cast p1, [J

    .line 349
    array-length v0, p1

    if-ne v0, v3, :cond_1

    .line 350
    aget-wide v0, p1, v1

    long-to-double v0, v0

    return-wide v0

    .line 352
    :cond_1
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 354
    :cond_2
    instance-of v0, p1, [I

    if-eqz v0, :cond_4

    .line 355
    check-cast p1, [I

    .line 356
    array-length v0, p1

    if-ne v0, v3, :cond_3

    .line 357
    aget p1, p1, v1

    int-to-double v0, p1

    return-wide v0

    .line 359
    :cond_3
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 361
    :cond_4
    instance-of v0, p1, [D

    if-eqz v0, :cond_6

    .line 362
    check-cast p1, [D

    .line 363
    array-length v0, p1

    if-ne v0, v3, :cond_5

    .line 364
    aget-wide v0, p1, v1

    return-wide v0

    .line 366
    :cond_5
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 368
    :cond_6
    instance-of v0, p1, [Landroidx/camera/core/impl/utils/LongRational;

    if-eqz v0, :cond_8

    .line 369
    check-cast p1, [Landroidx/camera/core/impl/utils/LongRational;

    .line 370
    array-length v0, p1

    if-ne v0, v3, :cond_7

    .line 371
    aget-object p1, p1, v1

    invoke-virtual {p1}, Landroidx/camera/core/impl/utils/LongRational;->toDouble()D

    move-result-wide v0

    return-wide v0

    .line 373
    :cond_7
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 375
    :cond_8
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "Couldn\'t find a double value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 342
    :cond_9
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "NULL can\'t be converted to a double value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getIntValue(Ljava/nio/ByteOrder;)I
    .locals 4

    .line 379
    invoke-virtual {p0, p1}, Landroidx/camera/core/impl/utils/ExifAttribute;->getValue(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 383
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 384
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 386
    :cond_0
    instance-of v0, p1, [J

    const/4 v1, 0x0

    const-string v2, "There are more than one component"

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    .line 387
    check-cast p1, [J

    .line 388
    array-length v0, p1

    if-ne v0, v3, :cond_1

    .line 389
    aget-wide v0, p1, v1

    long-to-int p1, v0

    return p1

    .line 391
    :cond_1
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 393
    :cond_2
    instance-of v0, p1, [I

    if-eqz v0, :cond_4

    .line 394
    check-cast p1, [I

    .line 395
    array-length v0, p1

    if-ne v0, v3, :cond_3

    .line 396
    aget p1, p1, v1

    return p1

    .line 398
    :cond_3
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 400
    :cond_4
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "Couldn\'t find a integer value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 381
    :cond_5
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "NULL can\'t be converted to a integer value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getStringValue(Ljava/nio/ByteOrder;)Ljava/lang/String;
    .locals 7

    .line 405
    invoke-virtual {p0, p1}, Landroidx/camera/core/impl/utils/ExifAttribute;->getValue(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 409
    :cond_0
    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 410
    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 413
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 414
    instance-of v2, p1, [J

    const-string v3, ","

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    .line 415
    check-cast p1, [J

    .line 416
    :cond_2
    :goto_0
    array-length v0, p1

    if-ge v4, v0, :cond_3

    .line 417
    aget-wide v5, p1, v4

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    .line 418
    array-length v0, p1

    if-eq v4, v0, :cond_2

    .line 419
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 422
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 424
    :cond_4
    instance-of v2, p1, [I

    if-eqz v2, :cond_7

    .line 425
    check-cast p1, [I

    .line 426
    :cond_5
    :goto_1
    array-length v0, p1

    if-ge v4, v0, :cond_6

    .line 427
    aget v0, p1, v4

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    .line 428
    array-length v0, p1

    if-eq v4, v0, :cond_5

    .line 429
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 432
    :cond_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 434
    :cond_7
    instance-of v2, p1, [D

    if-eqz v2, :cond_a

    .line 435
    check-cast p1, [D

    .line 436
    :cond_8
    :goto_2
    array-length v0, p1

    if-ge v4, v0, :cond_9

    .line 437
    aget-wide v5, p1, v4

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    .line 438
    array-length v0, p1

    if-eq v4, v0, :cond_8

    .line 439
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 442
    :cond_9
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 444
    :cond_a
    instance-of v2, p1, [Landroidx/camera/core/impl/utils/LongRational;

    if-eqz v2, :cond_d

    .line 445
    check-cast p1, [Landroidx/camera/core/impl/utils/LongRational;

    .line 446
    :cond_b
    :goto_3
    array-length v0, p1

    if-ge v4, v0, :cond_c

    .line 447
    aget-object v0, p1, v4

    invoke-virtual {v0}, Landroidx/camera/core/impl/utils/LongRational;->getNumerator()J

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x2f

    .line 448
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 449
    aget-object v0, p1, v4

    invoke-virtual {v0}, Landroidx/camera/core/impl/utils/LongRational;->getDenominator()J

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    .line 450
    array-length v0, p1

    if-eq v4, v0, :cond_b

    .line 451
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 454
    :cond_c
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_d
    return-object v0
.end method

.method getValue(Ljava/nio/ByteOrder;)Ljava/lang/Object;
    .locals 10

    .line 218
    const-string v0, "IOException occurred while closing InputStream"

    const-string v1, "ExifAttribute"

    const/4 v2, 0x0

    .line 220
    :try_start_0
    new-instance v3, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;

    iget-object v4, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->bytes:[B

    invoke-direct {v3, v4}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    :try_start_1
    invoke-virtual {v3, p1}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->setByteOrder(Ljava/nio/ByteOrder;)V

    .line 222
    iget p1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->format:I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v4, 0x0

    packed-switch p1, :pswitch_data_0

    .line 331
    :try_start_2
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    return-object v2

    .line 316
    :pswitch_0
    :try_start_3
    iget p1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    new-array p1, p1, [D

    .line 317
    :goto_0
    iget v5, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    if-ge v4, v5, :cond_0

    .line 318
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->readDouble()D

    move-result-wide v5

    aput-wide v5, p1, v4
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 331
    :cond_0
    :goto_1
    :try_start_4
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    return-object p1

    :catch_0
    move-exception v2

    .line 333
    invoke-static {v1, v0, v2}, Landroidx/camera/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p1

    .line 309
    :pswitch_1
    :try_start_5
    iget p1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    new-array p1, p1, [D

    .line 310
    :goto_2
    iget v5, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    if-ge v4, v5, :cond_0

    .line 311
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->readFloat()F

    move-result v5

    float-to-double v5, v5

    aput-wide v5, p1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 300
    :pswitch_2
    iget p1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    new-array p1, p1, [Landroidx/camera/core/impl/utils/LongRational;

    .line 301
    :goto_3
    iget v5, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    if-ge v4, v5, :cond_0

    .line 302
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->readInt()I

    move-result v5

    int-to-long v5, v5

    .line 303
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->readInt()I

    move-result v7

    int-to-long v7, v7

    .line 304
    new-instance v9, Landroidx/camera/core/impl/utils/LongRational;

    invoke-direct {v9, v5, v6, v7, v8}, Landroidx/camera/core/impl/utils/LongRational;-><init>(JJ)V

    aput-object v9, p1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 293
    :pswitch_3
    iget p1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    new-array p1, p1, [I

    .line 294
    :goto_4
    iget v5, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    if-ge v4, v5, :cond_0

    .line 295
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->readInt()I

    move-result v5

    aput v5, p1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 286
    :pswitch_4
    iget p1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    new-array p1, p1, [I

    .line 287
    :goto_5
    iget v5, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    if-ge v4, v5, :cond_0

    .line 288
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->readShort()S

    move-result v5

    aput v5, p1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 277
    :pswitch_5
    iget p1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    new-array p1, p1, [Landroidx/camera/core/impl/utils/LongRational;

    .line 278
    :goto_6
    iget v5, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    if-ge v4, v5, :cond_0

    .line 279
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->readUnsignedInt()J

    move-result-wide v5

    .line 280
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->readUnsignedInt()J

    move-result-wide v7

    .line 281
    new-instance v9, Landroidx/camera/core/impl/utils/LongRational;

    invoke-direct {v9, v5, v6, v7, v8}, Landroidx/camera/core/impl/utils/LongRational;-><init>(JJ)V

    aput-object v9, p1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    .line 270
    :pswitch_6
    iget p1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    new-array p1, p1, [J

    .line 271
    :goto_7
    iget v5, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    if-ge v4, v5, :cond_0

    .line 272
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->readUnsignedInt()J

    move-result-wide v5

    aput-wide v5, p1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    .line 263
    :pswitch_7
    iget p1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    new-array p1, p1, [I

    .line 264
    :goto_8
    iget v5, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    if-ge v4, v5, :cond_0

    .line 265
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->readUnsignedShort()I

    move-result v5

    aput v5, p1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    .line 234
    :pswitch_8
    iget p1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    sget-object v5, Landroidx/camera/core/impl/utils/ExifAttribute;->EXIF_ASCII_PREFIX:[B

    array-length v5, v5

    if-lt p1, v5, :cond_3

    move p1, v4

    .line 236
    :goto_9
    sget-object v5, Landroidx/camera/core/impl/utils/ExifAttribute;->EXIF_ASCII_PREFIX:[B

    array-length v6, v5

    if-ge p1, v6, :cond_2

    .line 237
    iget-object v6, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->bytes:[B

    aget-byte v6, v6, p1

    aget-byte v5, v5, p1

    if-eq v6, v5, :cond_1

    goto :goto_a

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_9

    .line 243
    :cond_2
    array-length v4, v5

    .line 247
    :cond_3
    :goto_a
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 248
    :goto_b
    iget v5, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    if-ge v4, v5, :cond_6

    .line 249
    iget-object v5, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->bytes:[B

    aget-byte v5, v5, v4

    if-nez v5, :cond_4

    goto :goto_d

    :cond_4
    const/16 v6, 0x20

    if-lt v5, v6, :cond_5

    int-to-char v5, v5

    .line 254
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_c

    :cond_5
    const/16 v5, 0x3f

    .line 256
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_c
    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    .line 260
    :cond_6
    :goto_d
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_1

    .line 226
    :pswitch_9
    iget-object p1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->bytes:[B

    array-length v5, p1

    const/4 v6, 0x1

    if-ne v5, v6, :cond_7

    aget-byte p1, p1, v4

    if-ltz p1, :cond_7

    if-gt p1, v6, :cond_7

    .line 227
    new-instance p1, Ljava/lang/String;

    iget-object v5, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->bytes:[B

    aget-byte v5, v5, v4

    add-int/lit8 v5, v5, 0x30

    int-to-char v5, v5

    new-array v6, v6, [C

    aput-char v5, v6, v4

    invoke-direct {p1, v6}, Ljava/lang/String;-><init>([C)V

    goto/16 :goto_1

    .line 229
    :cond_7
    new-instance p1, Ljava/lang/String;

    iget-object v4, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->bytes:[B

    sget-object v5, Landroidx/camera/core/impl/utils/ExifAttribute;->ASCII:Ljava/nio/charset/Charset;

    invoke-direct {p1, v4, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto/16 :goto_1

    :catch_1
    move-exception p1

    .line 333
    invoke-static {v1, v0, p1}, Landroidx/camera/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v2

    :catch_2
    move-exception p1

    goto :goto_e

    :catchall_0
    move-exception p1

    goto :goto_10

    :catch_3
    move-exception p1

    move-object v3, v2

    .line 326
    :goto_e
    :try_start_6
    const-string v4, "IOException occurred during reading a value"

    invoke-static {v1, v4, p1}, Landroidx/camera/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v3, :cond_8

    .line 331
    :try_start_7
    invoke-virtual {v3}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_f

    :catch_4
    move-exception p1

    .line 333
    invoke-static {v1, v0, p1}, Landroidx/camera/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    :goto_f
    return-object v2

    :catchall_1
    move-exception p1

    move-object v2, v3

    :goto_10
    if-eqz v2, :cond_9

    .line 331
    :try_start_8
    invoke-virtual {v2}, Landroidx/camera/core/impl/utils/ByteOrderedDataInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_11

    :catch_5
    move-exception v2

    .line 333
    invoke-static {v1, v0, v2}, Landroidx/camera/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 336
    :cond_9
    :goto_11
    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_9
        :pswitch_8
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public size()I
    .locals 2

    .line 460
    sget-object v0, Landroidx/camera/core/impl/utils/ExifAttribute;->IFD_FORMAT_BYTES_PER_FORMAT:[I

    iget v1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->format:I

    aget v0, v0, v1

    iget v1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->numberOfComponents:I

    mul-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Landroidx/camera/core/impl/utils/ExifAttribute;->IFD_FORMAT_NAMES:[Ljava/lang/String;

    iget v2, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->format:I

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", data length:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/core/impl/utils/ExifAttribute;->bytes:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
