.class public Lorg/jmrtd/lds/iso19794/FaceImageInfo;
.super Lorg/jmrtd/lds/AbstractImageInfo;
.source "FaceImageInfo.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;,
        Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;,
        Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;,
        Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;,
        Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;,
        Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;,
        Lorg/jmrtd/lds/iso19794/FaceImageInfo$Features;,
        Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;,
        Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;
    }
.end annotation


# static fields
.field public static final EXPRESSION_EYES_LOOKING_AWAY:S = 0x5s

.field public static final EXPRESSION_FROWNING:S = 0x7s

.field public static final EXPRESSION_NEUTRAL:S = 0x1s

.field public static final EXPRESSION_RAISED_EYEBROWS:S = 0x4s

.field public static final EXPRESSION_SMILE_CLOSED:S = 0x2s

.field public static final EXPRESSION_SMILE_OPEN:S = 0x3s

.field public static final EXPRESSION_SQUINTING:S = 0x6s

.field public static final EXPRESSION_UNSPECIFIED:S = 0x0s

.field public static final EYE_COLOR_BLACK:I = 0x1

.field public static final EYE_COLOR_BLUE:I = 0x2

.field public static final EYE_COLOR_BROWN:I = 0x3

.field public static final EYE_COLOR_GRAY:I = 0x4

.field public static final EYE_COLOR_GREEN:I = 0x5

.field public static final EYE_COLOR_MULTI_COLORED:I = 0x6

.field public static final EYE_COLOR_PINK:I = 0x7

.field public static final EYE_COLOR_UNKNOWN:I = 0xff

.field public static final EYE_COLOR_UNSPECIFIED:I = 0x0

.field public static final FACE_IMAGE_TYPE_BASIC:I = 0x0

.field public static final FACE_IMAGE_TYPE_FULL_FRONTAL:I = 0x1

.field public static final FACE_IMAGE_TYPE_TOKEN_FRONTAL:I = 0x2

.field private static final FEATURE_BEARD_FLAG:I = 0x8

.field private static final FEATURE_BLINK_FLAG:I = 0x20

.field private static final FEATURE_DARK_GLASSES:I = 0x200

.field private static final FEATURE_DISTORTING_MEDICAL_CONDITION:I = 0x400

.field private static final FEATURE_FEATURES_ARE_SPECIFIED_FLAG:I = 0x1

.field private static final FEATURE_GLASSES_FLAG:I = 0x2

.field private static final FEATURE_LEFT_EYE_PATCH_FLAG:I = 0x80

.field private static final FEATURE_MOUSTACHE_FLAG:I = 0x4

.field private static final FEATURE_MOUTH_OPEN_FLAG:I = 0x40

.field private static final FEATURE_RIGHT_EYE_PATCH:I = 0x100

.field private static final FEATURE_TEETH_VISIBLE_FLAG:I = 0x10

.field public static final HAIR_COLOR_BALD:I = 0x1

.field public static final HAIR_COLOR_BLACK:I = 0x2

.field public static final HAIR_COLOR_BLONDE:I = 0x3

.field public static final HAIR_COLOR_BLUE:I = 0x9

.field public static final HAIR_COLOR_BROWN:I = 0x4

.field public static final HAIR_COLOR_GRAY:I = 0x5

.field public static final HAIR_COLOR_GREEN:I = 0x8

.field public static final HAIR_COLOR_RED:I = 0x7

.field public static final HAIR_COLOR_UNKNOWN:I = 0xff

.field public static final HAIR_COLOR_UNSPECIFIED:I = 0x0

.field public static final HAIR_COLOR_WHITE:I = 0x6

.field public static final IMAGE_COLOR_SPACE_GRAY8:I = 0x3

.field public static final IMAGE_COLOR_SPACE_OTHER:I = 0x4

.field public static final IMAGE_COLOR_SPACE_RGB24:I = 0x1

.field public static final IMAGE_COLOR_SPACE_UNSPECIFIED:I = 0x0

.field public static final IMAGE_COLOR_SPACE_YUV422:I = 0x2

.field public static final IMAGE_DATA_TYPE_JPEG:I = 0x0

.field public static final IMAGE_DATA_TYPE_JPEG2000:I = 0x1

.field private static final LOGGER:Ljava/util/logging/Logger;

.field private static final PITCH:I = 0x1

.field private static final ROLL:I = 0x2

.field public static final SOURCE_TYPE_STATIC_PHOTO_DIGITAL_CAM:I = 0x2

.field public static final SOURCE_TYPE_STATIC_PHOTO_SCANNER:I = 0x3

.field public static final SOURCE_TYPE_STATIC_PHOTO_UNKNOWN_SOURCE:I = 0x1

.field public static final SOURCE_TYPE_UNKNOWN:I = 0x7

.field public static final SOURCE_TYPE_UNSPECIFIED:I = 0x0

.field public static final SOURCE_TYPE_VIDEO_FRAME_ANALOG_CAM:I = 0x5

.field public static final SOURCE_TYPE_VIDEO_FRAME_DIGITAL_CAM:I = 0x6

.field public static final SOURCE_TYPE_VIDEO_FRAME_UNKNOWN_SOURCE:I = 0x4

.field private static final YAW:I = 0x0

.field private static final serialVersionUID:J = -0x184d0c59e3a10453L


# instance fields
.field private colorSpace:I

.field private deviceType:I

.field private expression:I

.field private eyeColor:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

.field private faceImageType:I

.field private featureMask:I

.field private featurePoints:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

.field private gender:Lnet/sf/scuba/data/Gender;

.field private hairColor:I

.field private imageDataType:I

.field private poseAngle:[I

.field private poseAngleUncertainty:[I

.field private quality:I

.field private recordLength:J

.field private sourceType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    const-string v0, "org.jmrtd"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->LOGGER:Ljava/util/logging/Logger;

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

    .line 388
    invoke-direct {p0, v0}, Lorg/jmrtd/lds/AbstractImageInfo;-><init>(I)V

    .line 389
    invoke-virtual {p0, p1}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->readObject(Ljava/io/InputStream;)V

    return-void
.end method

.method public constructor <init>(Lnet/sf/scuba/data/Gender;Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;III[I[IIIIII[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;IILjava/io/InputStream;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move/from16 v0, p9

    move/from16 v1, p10

    move/from16 v2, p11

    move-object/from16 v3, p13

    move/from16 v4, p17

    int-to-long v9, v4

    .line 349
    invoke-static/range {p18 .. p18}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->toMimeType(I)Ljava/lang/String;

    move-result-object v11

    const/4 v5, 0x0

    move-object v4, p0

    move/from16 v6, p14

    move/from16 v7, p15

    move-object/from16 v8, p16

    invoke-direct/range {v4 .. v11}, Lorg/jmrtd/lds/AbstractImageInfo;-><init>(IIILjava/io/InputStream;JLjava/lang/String;)V

    if-eqz p16, :cond_4

    if-nez p1, :cond_0

    .line 353
    sget-object p1, Lnet/sf/scuba/data/Gender;->UNSPECIFIED:Lnet/sf/scuba/data/Gender;

    :cond_0
    iput-object p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->gender:Lnet/sf/scuba/data/Gender;

    if-nez p2, :cond_1

    .line 354
    sget-object p2, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->UNSPECIFIED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    :cond_1
    iput-object p2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->eyeColor:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    .line 355
    iput p3, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    move/from16 p1, p4

    .line 356
    iput p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->hairColor:I

    move/from16 p1, p5

    .line 357
    iput p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->expression:I

    .line 358
    iput v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->colorSpace:I

    .line 359
    iput v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->sourceType:I

    .line 360
    iput v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->deviceType:I

    const/4 p1, 0x0

    if-nez v3, :cond_2

    move p2, p1

    goto :goto_0

    .line 361
    :cond_2
    array-length p2, v3

    .line 362
    :goto_0
    new-array p3, p2, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

    iput-object p3, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featurePoints:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

    if-lez p2, :cond_3

    .line 364
    invoke-static {v3, p1, p3, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    const/4 p3, 0x3

    .line 366
    new-array v3, p3, [I

    iput-object v3, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngle:[I

    move-object/from16 v5, p6

    .line 367
    invoke-static {v5, p1, v3, p1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 368
    new-array v3, p3, [I

    iput-object v3, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    move-object/from16 v5, p7

    .line 369
    invoke-static {v5, p1, v3, p1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move/from16 p1, p18

    .line 370
    iput p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->imageDataType:I

    mul-int/lit8 p2, p2, 0x8

    int-to-long p1, p2

    const-wide/16 v5, 0x20

    add-long/2addr p1, v5

    add-long/2addr p1, v9

    .line 371
    iput-wide p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->recordLength:J

    move/from16 p1, p8

    .line 373
    iput p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->faceImageType:I

    .line 374
    iput v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->colorSpace:I

    .line 375
    iput v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->sourceType:I

    .line 376
    iput v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->deviceType:I

    move/from16 p1, p12

    .line 377
    iput p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->quality:I

    return-void

    .line 351
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Null image"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private expressionToString()Ljava/lang/String;
    .locals 1

    .line 860
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->expression:I

    packed-switch v0, :pswitch_data_0

    .line 878
    const-string v0, "unknown"

    return-object v0

    .line 876
    :pswitch_0
    const-string v0, "frowning"

    return-object v0

    .line 874
    :pswitch_1
    const-string v0, "squinting"

    return-object v0

    .line 872
    :pswitch_2
    const-string v0, "eyes looking away from the camera"

    return-object v0

    .line 870
    :pswitch_3
    const-string v0, "raised eyebrows"

    return-object v0

    .line 868
    :pswitch_4
    const-string v0, "a smile where the inside of the mouth and/or teeth is exposed"

    return-object v0

    .line 866
    :pswitch_5
    const-string v0, "a smile where the inside of the mouth and/or teeth is not exposed (closed jaw)"

    return-object v0

    .line 864
    :pswitch_6
    const-string v0, "neutral (non-smiling) with both eyes open and mouth closed"

    return-object v0

    .line 862
    :pswitch_7
    const-string v0, "unspecified"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private faceImageTypeToString()Ljava/lang/String;
    .locals 2

    .line 916
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->faceImageType:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 924
    const-string v0, "unknown"

    return-object v0

    .line 922
    :cond_0
    const-string v0, "token frontal"

    return-object v0

    .line 920
    :cond_1
    const-string v0, "full frontal"

    return-object v0

    .line 918
    :cond_2
    const-string v0, "basic"

    return-object v0
.end method

.method private featureMaskToString()Ljava/lang/String;
    .locals 3

    .line 809
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    .line 810
    const-string v0, ""

    return-object v0

    .line 812
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 813
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_1

    .line 814
    const-string v1, "glasses"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 816
    :cond_1
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_2

    .line 817
    const-string v1, "moustache"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 819
    :cond_2
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_3

    .line 820
    const-string v1, "beard"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 822
    :cond_3
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_4

    .line 823
    const-string v1, "teeth visible"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 825
    :cond_4
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_5

    .line 826
    const-string v1, "blink"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 828
    :cond_5
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    and-int/lit8 v1, v1, 0x40

    if-eqz v1, :cond_6

    .line 829
    const-string v1, "mouth open"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 831
    :cond_6
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    .line 832
    const-string v1, "left eye patch"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 834
    :cond_7
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    .line 835
    const-string v1, "right eye patch"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 837
    :cond_8
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    .line 838
    const-string v1, "dark glasses"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 840
    :cond_9
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    .line 841
    const-string v1, "distorting medical condition (which could impact feature point detection)"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 843
    :cond_a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 844
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 845
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 846
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    .line 847
    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 851
    :cond_c
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private hairColorToString()Ljava/lang/String;
    .locals 1

    .line 777
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->hairColor:I

    packed-switch v0, :pswitch_data_0

    .line 799
    const-string v0, "unknown"

    return-object v0

    .line 797
    :pswitch_0
    const-string v0, "blue"

    return-object v0

    .line 795
    :pswitch_1
    const-string v0, "green"

    return-object v0

    .line 793
    :pswitch_2
    const-string v0, "red"

    return-object v0

    .line 791
    :pswitch_3
    const-string v0, "white"

    return-object v0

    .line 789
    :pswitch_4
    const-string v0, "gray"

    return-object v0

    .line 787
    :pswitch_5
    const-string v0, "brown"

    return-object v0

    .line 785
    :pswitch_6
    const-string v0, "blonde"

    return-object v0

    .line 783
    :pswitch_7
    const-string v0, "black"

    return-object v0

    .line 781
    :pswitch_8
    const-string v0, "bald"

    return-object v0

    .line 779
    :pswitch_9
    const-string v0, "unspecified"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private poseAngleToString()Ljava/lang/String;
    .locals 6

    .line 888
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "(y: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 890
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngle:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 891
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    aget v1, v1, v2

    const-string v3, " ("

    const-string v4, ")"

    if-eqz v1, :cond_0

    .line 892
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v5, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    aget v2, v5, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 894
    :cond_0
    const-string v1, ", p:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 895
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngle:[I

    const/4 v2, 0x1

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 896
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    aget v1, v1, v2

    if-eqz v1, :cond_1

    .line 897
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v5, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    aget v2, v5, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 899
    :cond_1
    const-string v1, ", r: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 900
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngle:[I

    const/4 v2, 0x2

    aget v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 901
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    aget v1, v1, v2

    if-eqz v1, :cond_2

    .line 902
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    aget v2, v3, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 904
    :cond_2
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 905
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private sourceTypeToString()Ljava/lang/String;
    .locals 1

    .line 934
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->sourceType:I

    packed-switch v0, :pswitch_data_0

    .line 950
    const-string v0, "unknown"

    return-object v0

    .line 948
    :pswitch_0
    const-string v0, "single video frame from a digital camera"

    return-object v0

    .line 946
    :pswitch_1
    const-string v0, "single video frame from an analogue camera"

    return-object v0

    .line 944
    :pswitch_2
    const-string v0, "single video frame from an unknown source"

    return-object v0

    .line 942
    :pswitch_3
    const-string v0, "static photograph from a scanner"

    return-object v0

    .line 940
    :pswitch_4
    const-string v0, "static photograph from a digital still-image camera"

    return-object v0

    .line 938
    :pswitch_5
    const-string v0, "static photograph from an unknown source"

    return-object v0

    .line 936
    :pswitch_6
    const-string v0, "unspecified"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static toMimeType(I)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    .line 969
    sget-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->LOGGER:Ljava/util/logging/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown image type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    .line 967
    :cond_0
    const-string p0, "image/jp2"

    return-object p0

    .line 965
    :cond_1
    const-string p0, "image/jpeg"

    return-object p0
.end method

.method private writeFacialRecordData(Ljava/io/OutputStream;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 724
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-direct {v0, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 727
    iget-object p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featurePoints:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 728
    iget-object p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->gender:Lnet/sf/scuba/data/Gender;

    if-nez p1, :cond_0

    sget-object p1, Lnet/sf/scuba/data/Gender;->UNSPECIFIED:Lnet/sf/scuba/data/Gender;

    :cond_0
    invoke-virtual {p1}, Lnet/sf/scuba/data/Gender;->toInt()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 729
    iget-object p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->eyeColor:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    if-nez p1, :cond_1

    sget-object p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->UNSPECIFIED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    :cond_1
    invoke-virtual {p1}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->toInt()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 730
    iget p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->hairColor:I

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 731
    iget p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    int-to-long v1, p1

    const-wide/32 v3, 0xff0000

    and-long/2addr v1, v3

    const/16 p1, 0x10

    shr-long/2addr v1, p1

    long-to-int p1, v1

    int-to-byte p1, p1

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 732
    iget p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    int-to-long v1, p1

    const-wide/32 v3, 0xff00

    and-long/2addr v1, v3

    const/16 p1, 0x8

    shr-long/2addr v1, p1

    long-to-int p1, v1

    int-to-byte p1, p1

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 733
    iget p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    int-to-long v1, p1

    const-wide/16 v3, 0xff

    and-long/2addr v1, v3

    long-to-int p1, v1

    int-to-byte p1, p1

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 734
    iget p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->expression:I

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    const/4 p1, 0x0

    move v1, p1

    :goto_0
    const/4 v2, 0x3

    if-ge v1, v2, :cond_2

    .line 736
    iget-object v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngle:[I

    aget v2, v2, v1

    .line 737
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move v1, p1

    :goto_1
    if-ge v1, v2, :cond_3

    .line 740
    iget-object v3, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    aget v3, v3, v1

    invoke-virtual {v0, v3}, Ljava/io/DataOutputStream;->writeByte(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 744
    :cond_3
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featurePoints:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

    array-length v2, v1

    move v3, p1

    :goto_2
    if-ge v3, v2, :cond_4

    aget-object v4, v1, v3

    .line 745
    invoke-virtual {v4}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;->getType()I

    move-result v5

    invoke-virtual {v0, v5}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 746
    invoke-virtual {v4}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;->getMajorCode()I

    move-result v5

    shl-int/lit8 v5, v5, 0x4

    invoke-virtual {v4}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;->getMinorCode()I

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v0, v5}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 747
    invoke-virtual {v4}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;->getX()I

    move-result v5

    invoke-virtual {v0, v5}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 748
    invoke-virtual {v4}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;->getY()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 749
    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 753
    :cond_4
    iget p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->faceImageType:I

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 754
    iget p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->imageDataType:I

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 755
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->getWidth()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 756
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->getHeight()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 757
    iget p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->colorSpace:I

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 758
    iget p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->sourceType:I

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 759
    iget p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->deviceType:I

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 760
    iget p1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->quality:I

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeShort(I)V

    .line 766
    invoke-virtual {p0, v0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->writeImage(Ljava/io/OutputStream;)V

    .line 767
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 768
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 691
    :cond_0
    invoke-super {p0, p1}, Lorg/jmrtd/lds/AbstractImageInfo;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 694
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v1, v3, :cond_2

    return v2

    .line 698
    :cond_2
    check-cast p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;

    .line 699
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->colorSpace:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->colorSpace:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->deviceType:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->deviceType:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->expression:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->expression:I

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->eyeColor:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    iget-object v3, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->eyeColor:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->faceImageType:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->faceImageType:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featurePoints:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

    iget-object v3, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featurePoints:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

    .line 705
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->gender:Lnet/sf/scuba/data/Gender;

    iget-object v3, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->gender:Lnet/sf/scuba/data/Gender;

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->hairColor:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->hairColor:I

    if-ne v1, v3, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->imageDataType:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->imageDataType:I

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngle:[I

    iget-object v3, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngle:[I

    .line 709
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    iget-object v3, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    .line 710
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v1

    if-eqz v1, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->quality:I

    iget v3, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->quality:I

    if-ne v1, v3, :cond_3

    iget-wide v3, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->recordLength:J

    iget-wide v5, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->recordLength:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_3

    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->sourceType:I

    iget p1, p1, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->sourceType:I

    if-ne v1, p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public getColorSpace()I
    .locals 1

    .line 591
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->colorSpace:I

    return v0
.end method

.method public getDeviceType()I
    .locals 1

    .line 600
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->deviceType:I

    return v0
.end method

.method public getExpression()I
    .locals 1

    .line 504
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->expression:I

    return v0
.end method

.method public getEyeColor()Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;
    .locals 1

    .line 514
    iget-object v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->eyeColor:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    return-object v0
.end method

.method public getFaceImageType()I
    .locals 1

    .line 544
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->faceImageType:I

    return v0
.end method

.method public getFeatureMask()I
    .locals 1

    .line 553
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    return v0
.end method

.method public getFeaturePoints()[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;
    .locals 1

    .line 494
    iget-object v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featurePoints:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

    return-object v0
.end method

.method public getGender()Lnet/sf/scuba/data/Gender;
    .locals 1

    .line 524
    iget-object v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->gender:Lnet/sf/scuba/data/Gender;

    return-object v0
.end method

.method public getHairColor()I
    .locals 1

    .line 534
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->hairColor:I

    return v0
.end method

.method public getImageDataType()I
    .locals 1

    .line 581
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->imageDataType:I

    return v0
.end method

.method public getPoseAngle()[I
    .locals 4

    const/4 v0, 0x3

    .line 610
    new-array v1, v0, [I

    .line 611
    iget-object v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngle:[I

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public getPoseAngleUncertainty()[I
    .locals 4

    const/4 v0, 0x3

    .line 622
    new-array v1, v0, [I

    .line 623
    iget-object v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public getQuality()I
    .locals 1

    .line 562
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->quality:I

    return v0
.end method

.method public getRecordLength()J
    .locals 2

    .line 485
    iget-wide v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->recordLength:J

    return-wide v0
.end method

.method public getSourceType()I
    .locals 1

    .line 572
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->sourceType:I

    return v0
.end method

.method public hashCode()I
    .locals 5

    .line 667
    invoke-super {p0}, Lorg/jmrtd/lds/AbstractImageInfo;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 668
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->colorSpace:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 669
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->deviceType:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 670
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->expression:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 671
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->eyeColor:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 672
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->faceImageType:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 673
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 674
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featurePoints:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 675
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->gender:Lnet/sf/scuba/data/Gender;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lnet/sf/scuba/data/Gender;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 676
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->hairColor:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 677
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->imageDataType:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 678
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngle:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 679
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 680
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->quality:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 681
    iget-wide v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->recordLength:J

    const/16 v3, 0x20

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 682
    iget v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->sourceType:I

    add-int/2addr v0, v1

    return v0
.end method

.method protected readObject(Ljava/io/InputStream;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 394
    instance-of v0, p1, Ljava/io/DataInputStream;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/io/DataInputStream;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 397
    :goto_0
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    int-to-long v1, v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    iput-wide v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->recordLength:J

    .line 398
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v1

    .line 399
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v2

    invoke-static {v2}, Lnet/sf/scuba/data/Gender;->getInstance(I)Lnet/sf/scuba/data/Gender;

    move-result-object v2

    iput-object v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->gender:Lnet/sf/scuba/data/Gender;

    .line 400
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v2

    invoke-static {v2}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->toEyeColor(I)Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    move-result-object v2

    iput-object v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->eyeColor:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    .line 401
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v2

    iput v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->hairColor:I

    .line 402
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v2

    iput v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    shl-int/lit8 v2, v2, 0x10

    .line 403
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v3

    or-int/2addr v2, v3

    iput v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMask:I

    .line 404
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readShort()S

    move-result v2

    iput v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->expression:I

    const/4 v2, 0x3

    .line 405
    new-array v3, v2, [I

    iput-object v3, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngle:[I

    .line 406
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v3

    .line 407
    iget-object v4, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngle:[I

    const/4 v5, 0x0

    aput v3, v4, v5

    .line 408
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v3

    .line 409
    iget-object v4, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngle:[I

    const/4 v6, 0x1

    aput v3, v4, v6

    .line 410
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v3

    .line 411
    iget-object v4, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngle:[I

    const/4 v7, 0x2

    aput v3, v4, v7

    .line 412
    new-array v2, v2, [I

    iput-object v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    .line 413
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v3

    aput v3, v2, v5

    .line 414
    iget-object v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v3

    aput v3, v2, v6

    .line 415
    iget-object v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleUncertainty:[I

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v3

    aput v3, v2, v7

    .line 418
    new-array v2, v1, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

    iput-object v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featurePoints:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

    :goto_1
    if-ge v5, v1, :cond_2

    .line 420
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v2

    .line 421
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readByte()B

    move-result v3

    .line 422
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    .line 423
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v6

    const-wide/16 v7, 0x0

    :goto_2
    const-wide/16 v9, 0x2

    cmp-long v11, v7, v9

    if-gez v11, :cond_1

    .line 426
    invoke-virtual {v0, v9, v10}, Ljava/io/DataInputStream;->skip(J)J

    move-result-wide v9

    add-long/2addr v7, v9

    goto :goto_2

    .line 428
    :cond_1
    iget-object v7, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featurePoints:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

    new-instance v8, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

    invoke-direct {v8, v2, v3, v4, v6}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;-><init>(IBII)V

    aput-object v8, v7, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 432
    :cond_2
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v2

    iput v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->faceImageType:I

    .line 433
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v2

    iput v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->imageDataType:I

    .line 434
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    invoke-virtual {p0, v2}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->setWidth(I)V

    .line 435
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    invoke-virtual {p0, v2}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->setHeight(I)V

    .line 436
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v2

    iput v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->colorSpace:I

    .line 437
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v2

    iput v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->sourceType:I

    .line 438
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    iput v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->deviceType:I

    .line 439
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    iput v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->quality:I

    .line 442
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->getWidth()I

    move-result v0

    if-gtz v0, :cond_3

    const/16 v0, 0x320

    .line 443
    invoke-virtual {p0, v0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->setWidth(I)V

    .line 445
    :cond_3
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->getHeight()I

    move-result v0

    if-gtz v0, :cond_4

    const/16 v0, 0x258

    .line 446
    invoke-virtual {p0, v0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->setHeight(I)V

    .line 453
    :cond_4
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->imageDataType:I

    invoke-static {v0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->toMimeType(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->setMimeType(Ljava/lang/String;)V

    .line 454
    iget-wide v2, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->recordLength:J

    const-wide/16 v4, 0x14

    sub-long/2addr v2, v4

    mul-int/lit8 v1, v1, 0x8

    int-to-long v0, v1

    sub-long/2addr v2, v0

    const-wide/16 v0, 0xc

    sub-long/2addr v2, v0

    .line 456
    invoke-virtual {p0, p1, v2, v3}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->readImage(Ljava/io/InputStream;J)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 636
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FaceImageInfo [Image size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 638
    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " x "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Gender: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 639
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->gender:Lnet/sf/scuba/data/Gender;

    if-nez v1, :cond_0

    sget-object v1, Lnet/sf/scuba/data/Gender;->UNSPECIFIED:Lnet/sf/scuba/data/Gender;

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Eye color: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 640
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->eyeColor:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    if-nez v1, :cond_1

    sget-object v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->UNSPECIFIED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Hair color: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    invoke-direct {p0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->hairColorToString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Feature mask: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 642
    invoke-direct {p0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featureMaskToString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Expression: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    invoke-direct {p0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->expressionToString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Pose angle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 644
    invoke-direct {p0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->poseAngleToString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Face image type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 645
    invoke-direct {p0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->faceImageTypeToString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Source type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 646
    invoke-direct {p0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->sourceTypeToString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", FeaturePoints ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    iget-object v1, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->featurePoints:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;

    if-eqz v1, :cond_3

    array-length v2, v1

    if-lez v2, :cond_3

    .line 650
    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    move v5, v3

    :goto_0
    if-ge v5, v2, :cond_3

    aget-object v6, v1, v5

    if-eqz v4, :cond_2

    move v4, v3

    goto :goto_1

    .line 654
    :cond_2
    const-string v7, ", "

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 656
    :goto_1
    invoke-virtual {v6}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FeaturePoint;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 659
    :cond_3
    const-string v1, "]]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 661
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeObject(Ljava/io/OutputStream;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 468
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 469
    invoke-direct {p0, v0}, Lorg/jmrtd/lds/iso19794/FaceImageInfo;->writeFacialRecordData(Ljava/io/OutputStream;)V

    .line 470
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 471
    array-length v1, v0

    int-to-long v1, v1

    const-wide/16 v3, 0x4

    add-long/2addr v1, v3

    .line 472
    new-instance v3, Ljava/io/DataOutputStream;

    invoke-direct {v3, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    long-to-int p1, v1

    .line 473
    invoke-virtual {v3, p1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 474
    invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 475
    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V

    return-void
.end method
