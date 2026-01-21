.class public Lcom/smartengines/common/Image;
.super Ljava/lang/Object;
.source "Image.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-boolean p3, p0, Lcom/smartengines/common/Image;->swigCMemOwn:Z

    .line 17
    iput-wide p1, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    return-void
.end method

.method public static CreateEmpty()Lcom/smartengines/common/Image;
    .locals 4

    .line 60
    invoke-static {}, Lcom/smartengines/common/jnisecommonJNI;->Image_CreateEmpty()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 61
    :cond_0
    new-instance v2, Lcom/smartengines/common/Image;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v2
.end method

.method public static FromBase64Buffer(Ljava/lang/String;)Lcom/smartengines/common/Image;
    .locals 4

    .line 125
    invoke-static {p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_FromBase64Buffer__SWIG_2(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 126
    :cond_0
    new-instance p0, Lcom/smartengines/common/Image;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p0
.end method

.method public static FromBase64Buffer(Ljava/lang/String;I)Lcom/smartengines/common/Image;
    .locals 2

    .line 120
    invoke-static {p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Image_FromBase64Buffer__SWIG_1(Ljava/lang/String;I)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 121
    :cond_0
    new-instance v0, Lcom/smartengines/common/Image;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v0
.end method

.method public static FromBase64Buffer(Ljava/lang/String;ILcom/smartengines/common/Size;)Lcom/smartengines/common/Image;
    .locals 2

    .line 115
    invoke-static {p2}, Lcom/smartengines/common/Size;->getCPtr(Lcom/smartengines/common/Size;)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1, p2}, Lcom/smartengines/common/jnisecommonJNI;->Image_FromBase64Buffer__SWIG_0(Ljava/lang/String;IJLcom/smartengines/common/Size;)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long p2, p0, v0

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 116
    :cond_0
    new-instance p2, Lcom/smartengines/common/Image;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p1, v0}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p2
.end method

.method public static FromBuffer([BIIII)Lcom/smartengines/common/Image;
    .locals 0

    .line 95
    invoke-static {p0, p1, p2, p3, p4}, Lcom/smartengines/common/jnisecommonJNI;->Image_FromBuffer([BIIII)J

    move-result-wide p0

    const-wide/16 p2, 0x0

    cmp-long p2, p0, p2

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 96
    :cond_0
    new-instance p2, Lcom/smartengines/common/Image;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p1, p3}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p2
.end method

.method public static FromBufferExtended([BIIILcom/smartengines/common/ImagePixelFormat;I)Lcom/smartengines/common/Image;
    .locals 0

    .line 100
    invoke-virtual {p4}, Lcom/smartengines/common/ImagePixelFormat;->swigValue()I

    move-result p4

    invoke-static/range {p0 .. p5}, Lcom/smartengines/common/jnisecommonJNI;->Image_FromBufferExtended([BIIIII)J

    move-result-wide p0

    const-wide/16 p2, 0x0

    cmp-long p2, p0, p2

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 101
    :cond_0
    new-instance p2, Lcom/smartengines/common/Image;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p1, p3}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p2
.end method

.method public static FromFile(Ljava/lang/String;)Lcom/smartengines/common/Image;
    .locals 4

    .line 75
    invoke-static {p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_FromFile__SWIG_2(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 76
    :cond_0
    new-instance p0, Lcom/smartengines/common/Image;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p0
.end method

.method public static FromFile(Ljava/lang/String;I)Lcom/smartengines/common/Image;
    .locals 2

    .line 70
    invoke-static {p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Image_FromFile__SWIG_1(Ljava/lang/String;I)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 71
    :cond_0
    new-instance v0, Lcom/smartengines/common/Image;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v0
.end method

.method public static FromFile(Ljava/lang/String;ILcom/smartengines/common/Size;)Lcom/smartengines/common/Image;
    .locals 2

    .line 65
    invoke-static {p2}, Lcom/smartengines/common/Size;->getCPtr(Lcom/smartengines/common/Size;)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1, p2}, Lcom/smartengines/common/jnisecommonJNI;->Image_FromFile__SWIG_0(Ljava/lang/String;IJLcom/smartengines/common/Size;)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long p2, p0, v0

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 66
    :cond_0
    new-instance p2, Lcom/smartengines/common/Image;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p1, v0}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p2
.end method

.method public static FromFileBuffer([B)Lcom/smartengines/common/Image;
    .locals 4

    .line 90
    invoke-static {p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_FromFileBuffer__SWIG_2([B)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 91
    :cond_0
    new-instance p0, Lcom/smartengines/common/Image;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p0
.end method

.method public static FromFileBuffer([BI)Lcom/smartengines/common/Image;
    .locals 2

    .line 85
    invoke-static {p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Image_FromFileBuffer__SWIG_1([BI)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 86
    :cond_0
    new-instance v0, Lcom/smartengines/common/Image;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v0
.end method

.method public static FromFileBuffer([BILcom/smartengines/common/Size;)Lcom/smartengines/common/Image;
    .locals 2

    .line 80
    invoke-static {p2}, Lcom/smartengines/common/Size;->getCPtr(Lcom/smartengines/common/Size;)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1, p2}, Lcom/smartengines/common/jnisecommonJNI;->Image_FromFileBuffer__SWIG_0([BIJLcom/smartengines/common/Size;)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long p2, p0, v0

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 81
    :cond_0
    new-instance p2, Lcom/smartengines/common/Image;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p1, v0}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p2
.end method

.method public static FromYUV([B[B[BLcom/smartengines/common/YUVDimensions;)Lcom/smartengines/common/Image;
    .locals 6

    .line 110
    invoke-static {p3}, Lcom/smartengines/common/YUVDimensions;->getCPtr(Lcom/smartengines/common/YUVDimensions;)J

    move-result-wide v3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Image_FromYUV([B[B[BJLcom/smartengines/common/YUVDimensions;)J

    move-result-wide p0

    const-wide/16 p2, 0x0

    cmp-long p2, p0, p2

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 111
    :cond_0
    new-instance p2, Lcom/smartengines/common/Image;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p1, p3}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p2
.end method

.method public static FromYUVBuffer([BII)Lcom/smartengines/common/Image;
    .locals 2

    .line 105
    invoke-static {p0, p1, p2}, Lcom/smartengines/common/jnisecommonJNI;->Image_FromYUVBuffer([BII)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long p2, p0, v0

    if-nez p2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 106
    :cond_0
    new-instance p2, Lcom/smartengines/common/Image;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p1, v0}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p2
.end method

.method public static GetImagePageName(Ljava/lang/String;I)Lcom/smartengines/common/MutableString;
    .locals 2

    .line 56
    new-instance v0, Lcom/smartengines/common/MutableString;

    invoke-static {p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Image_GetImagePageName(Ljava/lang/String;I)J

    move-result-wide p0

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lcom/smartengines/common/MutableString;-><init>(JZ)V

    return-object v0
.end method

.method public static GetNumberOfPages(Ljava/lang/String;)I
    .locals 0

    .line 52
    invoke-static {p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_GetNumberOfPages(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static getCPtr(Lcom/smartengines/common/Image;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 21
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/common/Image;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 27
    iget-boolean v0, p0, Lcom/smartengines/common/Image;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 29
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    const/4 v2, 0x0

    .line 30
    iput-boolean v2, p0, Lcom/smartengines/common/Image;->swigCMemOwn:Z

    .line 31
    invoke-virtual {p0}, Lcom/smartengines/common/Image;->delete()V

    return-wide v0

    .line 28
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Cannot release ownership as memory is not owned"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const-wide/16 v0, 0x0

    return-wide v0
.end method


# virtual methods
.method public AverageChannels()V
    .locals 2

    .line 423
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_AverageChannels(JLcom/smartengines/common/Image;)V

    return-void
.end method

.method public Clear()V
    .locals 2

    .line 185
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_Clear(JLcom/smartengines/common/Image;)V

    return-void
.end method

.method public CloneAveragedChannels()Lcom/smartengines/common/Image;
    .locals 4

    .line 427
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneAveragedChannels(JLcom/smartengines/common/Image;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 428
    :cond_0
    new-instance v2, Lcom/smartengines/common/Image;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v2
.end method

.method public CloneCropped(Lcom/smartengines/common/Quadrangle;)Lcom/smartengines/common/Image;
    .locals 6

    .line 234
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneCropped__SWIG_0(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 235
    :cond_0
    new-instance p1, Lcom/smartengines/common/Image;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p1
.end method

.method public CloneCropped(Lcom/smartengines/common/Quadrangle;Lcom/smartengines/common/Size;)Lcom/smartengines/common/Image;
    .locals 9

    .line 243
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    invoke-static {p2}, Lcom/smartengines/common/Size;->getCPtr(Lcom/smartengines/common/Size;)J

    move-result-wide v6

    move-object v2, p0

    move-object v5, p1

    move-object v8, p2

    invoke-static/range {v0 .. v8}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneCropped__SWIG_1(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;JLcom/smartengines/common/Size;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 244
    :cond_0
    new-instance v0, Lcom/smartengines/common/Image;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v0
.end method

.method public CloneCropped(Lcom/smartengines/common/Rectangle;)Lcom/smartengines/common/Image;
    .locals 6

    .line 252
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneCropped__SWIG_2(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 253
    :cond_0
    new-instance p1, Lcom/smartengines/common/Image;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p1
.end method

.method public CloneCroppedShallow(Lcom/smartengines/common/Rectangle;)Lcom/smartengines/common/Image;
    .locals 6

    .line 257
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneCroppedShallow(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 258
    :cond_0
    new-instance p1, Lcom/smartengines/common/Image;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p1
.end method

.method public CloneDeep()Lcom/smartengines/common/Image;
    .locals 4

    .line 175
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneDeep(JLcom/smartengines/common/Image;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 176
    :cond_0
    new-instance v2, Lcom/smartengines/common/Image;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v2
.end method

.method public CloneFilled(Lcom/smartengines/common/Quadrangle;I)Lcom/smartengines/common/Image;
    .locals 7

    .line 391
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneFilled__SWIG_9(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;I)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 392
    :cond_0
    new-instance v0, Lcom/smartengines/common/Image;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v0
.end method

.method public CloneFilled(Lcom/smartengines/common/Quadrangle;II)Lcom/smartengines/common/Image;
    .locals 8

    .line 386
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    invoke-static/range {v0 .. v7}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneFilled__SWIG_8(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;II)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 387
    :cond_0
    new-instance p3, Lcom/smartengines/common/Image;

    const/4 v0, 0x0

    invoke-direct {p3, p1, p2, v0}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p3
.end method

.method public CloneFilled(Lcom/smartengines/common/Quadrangle;III)Lcom/smartengines/common/Image;
    .locals 9

    .line 381
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    move v8, p4

    invoke-static/range {v0 .. v8}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneFilled__SWIG_7(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;III)J

    move-result-wide p1

    const-wide/16 p3, 0x0

    cmp-long p3, p1, p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 382
    :cond_0
    new-instance p3, Lcom/smartengines/common/Image;

    const/4 p4, 0x0

    invoke-direct {p3, p1, p2, p4}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p3
.end method

.method public CloneFilled(Lcom/smartengines/common/Quadrangle;IIII)Lcom/smartengines/common/Image;
    .locals 10

    .line 376
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    move v8, p4

    move v9, p5

    invoke-static/range {v0 .. v9}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneFilled__SWIG_6(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;IIII)J

    move-result-wide p1

    const-wide/16 p3, 0x0

    cmp-long p3, p1, p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 377
    :cond_0
    new-instance p3, Lcom/smartengines/common/Image;

    const/4 p4, 0x0

    invoke-direct {p3, p1, p2, p4}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p3
.end method

.method public CloneFilled(Lcom/smartengines/common/Quadrangle;IIIII)Lcom/smartengines/common/Image;
    .locals 11

    .line 371
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    move v8, p4

    move/from16 v9, p5

    move/from16 v10, p6

    invoke-static/range {v0 .. v10}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneFilled__SWIG_5(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;IIIII)J

    move-result-wide p1

    const-wide/16 p3, 0x0

    cmp-long p3, p1, p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 372
    :cond_0
    new-instance p3, Lcom/smartengines/common/Image;

    const/4 p4, 0x0

    invoke-direct {p3, p1, p2, p4}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p3
.end method

.method public CloneFilled(Lcom/smartengines/common/Rectangle;I)Lcom/smartengines/common/Image;
    .locals 7

    .line 346
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneFilled__SWIG_4(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;I)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 347
    :cond_0
    new-instance v0, Lcom/smartengines/common/Image;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v0
.end method

.method public CloneFilled(Lcom/smartengines/common/Rectangle;II)Lcom/smartengines/common/Image;
    .locals 8

    .line 341
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    invoke-static/range {v0 .. v7}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneFilled__SWIG_3(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;II)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 342
    :cond_0
    new-instance p3, Lcom/smartengines/common/Image;

    const/4 v0, 0x0

    invoke-direct {p3, p1, p2, v0}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p3
.end method

.method public CloneFilled(Lcom/smartengines/common/Rectangle;III)Lcom/smartengines/common/Image;
    .locals 9

    .line 336
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    move v8, p4

    invoke-static/range {v0 .. v8}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneFilled__SWIG_2(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;III)J

    move-result-wide p1

    const-wide/16 p3, 0x0

    cmp-long p3, p1, p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 337
    :cond_0
    new-instance p3, Lcom/smartengines/common/Image;

    const/4 p4, 0x0

    invoke-direct {p3, p1, p2, p4}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p3
.end method

.method public CloneFilled(Lcom/smartengines/common/Rectangle;IIII)Lcom/smartengines/common/Image;
    .locals 10

    .line 331
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    move v8, p4

    move v9, p5

    invoke-static/range {v0 .. v9}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneFilled__SWIG_1(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;IIII)J

    move-result-wide p1

    const-wide/16 p3, 0x0

    cmp-long p3, p1, p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 332
    :cond_0
    new-instance p3, Lcom/smartengines/common/Image;

    const/4 p4, 0x0

    invoke-direct {p3, p1, p2, p4}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p3
.end method

.method public CloneFilled(Lcom/smartengines/common/Rectangle;IIIII)Lcom/smartengines/common/Image;
    .locals 11

    .line 326
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    move v8, p4

    move/from16 v9, p5

    move/from16 v10, p6

    invoke-static/range {v0 .. v10}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneFilled__SWIG_0(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;IIIII)J

    move-result-wide p1

    const-wide/16 p3, 0x0

    cmp-long p3, p1, p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 327
    :cond_0
    new-instance p3, Lcom/smartengines/common/Image;

    const/4 p4, 0x0

    invoke-direct {p3, p1, p2, p4}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p3
.end method

.method public CloneFlippedHorizontal()Lcom/smartengines/common/Image;
    .locals 4

    .line 409
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneFlippedHorizontal(JLcom/smartengines/common/Image;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 410
    :cond_0
    new-instance v2, Lcom/smartengines/common/Image;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v2
.end method

.method public CloneFlippedVertical()Lcom/smartengines/common/Image;
    .locals 4

    .line 400
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneFlippedVertical(JLcom/smartengines/common/Image;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 401
    :cond_0
    new-instance v2, Lcom/smartengines/common/Image;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v2
.end method

.method public CloneInverted()Lcom/smartengines/common/Image;
    .locals 4

    .line 436
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneInverted(JLcom/smartengines/common/Image;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 437
    :cond_0
    new-instance v2, Lcom/smartengines/common/Image;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v2
.end method

.method public CloneMasked(Lcom/smartengines/common/Quadrangle;)Lcom/smartengines/common/Image;
    .locals 6

    .line 301
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneMasked__SWIG_3(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 302
    :cond_0
    new-instance p1, Lcom/smartengines/common/Image;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p1
.end method

.method public CloneMasked(Lcom/smartengines/common/Quadrangle;I)Lcom/smartengines/common/Image;
    .locals 7

    .line 296
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneMasked__SWIG_2(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;I)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 297
    :cond_0
    new-instance v0, Lcom/smartengines/common/Image;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v0
.end method

.method public CloneMasked(Lcom/smartengines/common/Rectangle;)Lcom/smartengines/common/Image;
    .locals 6

    .line 279
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneMasked__SWIG_1(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 280
    :cond_0
    new-instance p1, Lcom/smartengines/common/Image;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p1
.end method

.method public CloneMasked(Lcom/smartengines/common/Rectangle;I)Lcom/smartengines/common/Image;
    .locals 7

    .line 274
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneMasked__SWIG_0(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;I)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 275
    :cond_0
    new-instance v0, Lcom/smartengines/common/Image;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v0
.end method

.method public CloneResized(Lcom/smartengines/common/Size;)Lcom/smartengines/common/Image;
    .locals 6

    .line 225
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Size;->getCPtr(Lcom/smartengines/common/Size;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneResized(JLcom/smartengines/common/Image;JLcom/smartengines/common/Size;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 226
    :cond_0
    new-instance p1, Lcom/smartengines/common/Image;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p1
.end method

.method public CloneRotated90(I)Lcom/smartengines/common/Image;
    .locals 4

    .line 418
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneRotated90(JLcom/smartengines/common/Image;I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 419
    :cond_0
    new-instance p1, Lcom/smartengines/common/Image;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p1
.end method

.method public CloneShallow()Lcom/smartengines/common/Image;
    .locals 4

    .line 180
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_CloneShallow(JLcom/smartengines/common/Image;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 181
    :cond_0
    new-instance v2, Lcom/smartengines/common/Image;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v2
.end method

.method public CopyBase64ToBuffer(Ljava/lang/String;I)I
    .locals 2

    .line 205
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/common/jnisecommonJNI;->Image_CopyBase64ToBuffer(JLcom/smartengines/common/Image;Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public CopyToBuffer([B)I
    .locals 2

    .line 193
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Image_CopyToBuffer(JLcom/smartengines/common/Image;[B)I

    move-result p1

    return p1
.end method

.method public Crop(Lcom/smartengines/common/Quadrangle;)V
    .locals 6

    .line 230
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Image_Crop__SWIG_0(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;)V

    return-void
.end method

.method public Crop(Lcom/smartengines/common/Quadrangle;Lcom/smartengines/common/Size;)V
    .locals 9

    .line 239
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    invoke-static {p2}, Lcom/smartengines/common/Size;->getCPtr(Lcom/smartengines/common/Size;)J

    move-result-wide v6

    move-object v2, p0

    move-object v5, p1

    move-object v8, p2

    invoke-static/range {v0 .. v8}, Lcom/smartengines/common/jnisecommonJNI;->Image_Crop__SWIG_1(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;JLcom/smartengines/common/Size;)V

    return-void
.end method

.method public Crop(Lcom/smartengines/common/Rectangle;)V
    .locals 6

    .line 248
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Image_Crop__SWIG_2(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;)V

    return-void
.end method

.method public EstimateFocusScore()D
    .locals 2

    .line 217
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_EstimateFocusScore__SWIG_1(JLcom/smartengines/common/Image;)D

    move-result-wide v0

    return-wide v0
.end method

.method public EstimateFocusScore(D)D
    .locals 2

    .line 213
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/common/jnisecommonJNI;->Image_EstimateFocusScore__SWIG_0(JLcom/smartengines/common/Image;D)D

    move-result-wide p1

    return-wide p1
.end method

.method public Fill(Lcom/smartengines/common/Quadrangle;I)V
    .locals 7

    .line 367
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->Image_Fill__SWIG_9(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;I)V

    return-void
.end method

.method public Fill(Lcom/smartengines/common/Quadrangle;II)V
    .locals 8

    .line 363
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    invoke-static/range {v0 .. v7}, Lcom/smartengines/common/jnisecommonJNI;->Image_Fill__SWIG_8(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;II)V

    return-void
.end method

.method public Fill(Lcom/smartengines/common/Quadrangle;III)V
    .locals 9

    .line 359
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    move v8, p4

    invoke-static/range {v0 .. v8}, Lcom/smartengines/common/jnisecommonJNI;->Image_Fill__SWIG_7(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;III)V

    return-void
.end method

.method public Fill(Lcom/smartengines/common/Quadrangle;IIII)V
    .locals 10

    .line 355
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    move v8, p4

    move v9, p5

    invoke-static/range {v0 .. v9}, Lcom/smartengines/common/jnisecommonJNI;->Image_Fill__SWIG_6(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;IIII)V

    return-void
.end method

.method public Fill(Lcom/smartengines/common/Quadrangle;IIIII)V
    .locals 11

    .line 351
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    move v8, p4

    move/from16 v9, p5

    move/from16 v10, p6

    invoke-static/range {v0 .. v10}, Lcom/smartengines/common/jnisecommonJNI;->Image_Fill__SWIG_5(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;IIIII)V

    return-void
.end method

.method public Fill(Lcom/smartengines/common/Rectangle;I)V
    .locals 7

    .line 322
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->Image_Fill__SWIG_4(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;I)V

    return-void
.end method

.method public Fill(Lcom/smartengines/common/Rectangle;II)V
    .locals 8

    .line 318
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    invoke-static/range {v0 .. v7}, Lcom/smartengines/common/jnisecommonJNI;->Image_Fill__SWIG_3(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;II)V

    return-void
.end method

.method public Fill(Lcom/smartengines/common/Rectangle;III)V
    .locals 9

    .line 314
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    move v8, p4

    invoke-static/range {v0 .. v8}, Lcom/smartengines/common/jnisecommonJNI;->Image_Fill__SWIG_2(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;III)V

    return-void
.end method

.method public Fill(Lcom/smartengines/common/Rectangle;IIII)V
    .locals 10

    .line 310
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    move v8, p4

    move v9, p5

    invoke-static/range {v0 .. v9}, Lcom/smartengines/common/jnisecommonJNI;->Image_Fill__SWIG_1(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;IIII)V

    return-void
.end method

.method public Fill(Lcom/smartengines/common/Rectangle;IIIII)V
    .locals 11

    .line 306
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    move v8, p4

    move/from16 v9, p5

    move/from16 v10, p6

    invoke-static/range {v0 .. v10}, Lcom/smartengines/common/jnisecommonJNI;->Image_Fill__SWIG_0(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;IIIII)V

    return-void
.end method

.method public FlipHorizontal()V
    .locals 2

    .line 405
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_FlipHorizontal(JLcom/smartengines/common/Image;)V

    return-void
.end method

.method public FlipVertical()V
    .locals 2

    .line 396
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_FlipVertical(JLcom/smartengines/common/Image;)V

    return-void
.end method

.method public ForceMemoryOwner()V
    .locals 2

    .line 465
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_ForceMemoryOwner(JLcom/smartengines/common/Image;)V

    return-void
.end method

.method public GetBase64String()Lcom/smartengines/common/MutableString;
    .locals 4

    .line 209
    new-instance v0, Lcom/smartengines/common/MutableString;

    iget-wide v1, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_GetBase64String(JLcom/smartengines/common/Image;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/MutableString;-><init>(JZ)V

    return-object v0
.end method

.method public GetChannels()I
    .locals 2

    .line 457
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_GetChannels(JLcom/smartengines/common/Image;)I

    move-result v0

    return v0
.end method

.method public GetHeight()I
    .locals 2

    .line 445
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_GetHeight(JLcom/smartengines/common/Image;)I

    move-result v0

    return v0
.end method

.method public GetLayer(Ljava/lang/String;)Lcom/smartengines/common/Image;
    .locals 3

    .line 134
    new-instance v0, Lcom/smartengines/common/Image;

    iget-wide v1, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Image_GetLayer(JLcom/smartengines/common/Image;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v0
.end method

.method public GetLayerPtr(Ljava/lang/String;)Lcom/smartengines/common/Image;
    .locals 4

    .line 138
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Image_GetLayerPtr(JLcom/smartengines/common/Image;Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 139
    :cond_0
    new-instance p1, Lcom/smartengines/common/Image;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object p1
.end method

.method public GetNumberOfLayers()I
    .locals 2

    .line 130
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_GetNumberOfLayers(JLcom/smartengines/common/Image;)I

    move-result v0

    return v0
.end method

.method public GetRequiredBase64BufferLength()I
    .locals 2

    .line 201
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_GetRequiredBase64BufferLength(JLcom/smartengines/common/Image;)I

    move-result v0

    return v0
.end method

.method public GetRequiredBufferLength()I
    .locals 2

    .line 189
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_GetRequiredBufferLength(JLcom/smartengines/common/Image;)I

    move-result v0

    return v0
.end method

.method public GetSize()Lcom/smartengines/common/Size;
    .locals 4

    .line 449
    new-instance v0, Lcom/smartengines/common/Size;

    iget-wide v1, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_GetSize(JLcom/smartengines/common/Image;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/Size;-><init>(JZ)V

    return-object v0
.end method

.method public GetStride()I
    .locals 2

    .line 453
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_GetStride(JLcom/smartengines/common/Image;)I

    move-result v0

    return v0
.end method

.method public GetWidth()I
    .locals 2

    .line 441
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_GetWidth(JLcom/smartengines/common/Image;)I

    move-result v0

    return v0
.end method

.method public HasLayer(Ljava/lang/String;)Z
    .locals 2

    .line 151
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Image_HasLayer(JLcom/smartengines/common/Image;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasLayers()Z
    .locals 2

    .line 155
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_HasLayers(JLcom/smartengines/common/Image;)Z

    move-result v0

    return v0
.end method

.method public Invert()V
    .locals 2

    .line 432
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_Invert(JLcom/smartengines/common/Image;)V

    return-void
.end method

.method public IsMemoryOwner()Z
    .locals 2

    .line 461
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_IsMemoryOwner(JLcom/smartengines/common/Image;)Z

    move-result v0

    return v0
.end method

.method public LayersBegin()Lcom/smartengines/common/ImagesMapIterator;
    .locals 4

    .line 143
    new-instance v0, Lcom/smartengines/common/ImagesMapIterator;

    iget-wide v1, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_LayersBegin(JLcom/smartengines/common/Image;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/ImagesMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public LayersEnd()Lcom/smartengines/common/ImagesMapIterator;
    .locals 4

    .line 147
    new-instance v0, Lcom/smartengines/common/ImagesMapIterator;

    iget-wide v1, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_LayersEnd(JLcom/smartengines/common/Image;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/ImagesMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public Mask(Lcom/smartengines/common/Quadrangle;)V
    .locals 6

    .line 292
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Image_Mask__SWIG_5(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;)V

    return-void
.end method

.method public Mask(Lcom/smartengines/common/Quadrangle;I)V
    .locals 7

    .line 288
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->Image_Mask__SWIG_4(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;I)V

    return-void
.end method

.method public Mask(Lcom/smartengines/common/Quadrangle;ID)V
    .locals 9

    .line 284
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move-wide v7, p3

    invoke-static/range {v0 .. v8}, Lcom/smartengines/common/jnisecommonJNI;->Image_Mask__SWIG_3(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;ID)V

    return-void
.end method

.method public Mask(Lcom/smartengines/common/Rectangle;)V
    .locals 6

    .line 270
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Image_Mask__SWIG_2(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;)V

    return-void
.end method

.method public Mask(Lcom/smartengines/common/Rectangle;I)V
    .locals 7

    .line 266
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->Image_Mask__SWIG_1(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;I)V

    return-void
.end method

.method public Mask(Lcom/smartengines/common/Rectangle;ID)V
    .locals 9

    .line 262
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Rectangle;->getCPtr(Lcom/smartengines/common/Rectangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move-wide v7, p3

    invoke-static/range {v0 .. v8}, Lcom/smartengines/common/jnisecommonJNI;->Image_Mask__SWIG_0(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;ID)V

    return-void
.end method

.method public RemoveLayer(Ljava/lang/String;)V
    .locals 2

    .line 159
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Image_RemoveLayer(JLcom/smartengines/common/Image;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveLayers()V
    .locals 2

    .line 163
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/common/jnisecommonJNI;->Image_RemoveLayers(JLcom/smartengines/common/Image;)V

    return-void
.end method

.method public Resize(Lcom/smartengines/common/Size;)V
    .locals 6

    .line 221
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Size;->getCPtr(Lcom/smartengines/common/Size;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Image_Resize(JLcom/smartengines/common/Image;JLcom/smartengines/common/Size;)V

    return-void
.end method

.method public Rotate90(I)V
    .locals 2

    .line 414
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Image_Rotate90(JLcom/smartengines/common/Image;I)V

    return-void
.end method

.method public Save(Ljava/lang/String;)V
    .locals 2

    .line 197
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/common/jnisecommonJNI;->Image_Save(JLcom/smartengines/common/Image;Ljava/lang/String;)V

    return-void
.end method

.method public Serialize(Lcom/smartengines/common/Serializer;)V
    .locals 6

    .line 469
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Serializer;->getCPtr(Lcom/smartengines/common/Serializer;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/common/jnisecommonJNI;->Image_Serialize(JLcom/smartengines/common/Image;JLcom/smartengines/common/Serializer;)V

    return-void
.end method

.method public SetLayer(Ljava/lang/String;Lcom/smartengines/common/Image;)V
    .locals 7

    .line 167
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->Image_SetLayer(JLcom/smartengines/common/Image;Ljava/lang/String;JLcom/smartengines/common/Image;)V

    return-void
.end method

.method public SetLayerWithOwnership(Ljava/lang/String;Lcom/smartengines/common/Image;)V
    .locals 7

    .line 171
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/common/jnisecommonJNI;->Image_SetLayerWithOwnership(JLcom/smartengines/common/Image;Ljava/lang/String;JLcom/smartengines/common/Image;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 42
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/common/Image;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 43
    iget-boolean v4, p0, Lcom/smartengines/common/Image;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 44
    iput-boolean v4, p0, Lcom/smartengines/common/Image;->swigCMemOwn:Z

    .line 45
    invoke-static {v0, v1}, Lcom/smartengines/common/jnisecommonJNI;->delete_Image(J)V

    .line 47
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/common/Image;->swigCPtr:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected finalize()V
    .locals 0

    .line 38
    invoke-virtual {p0}, Lcom/smartengines/common/Image;->delete()V

    return-void
.end method
