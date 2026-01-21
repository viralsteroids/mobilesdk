.class public final enum Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;
.super Ljava/lang/Enum;
.source "FaceImageInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jmrtd/lds/iso19794/FaceImageInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SourceType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

.field public static final enum STATIC_PHOTO_DIGITAL_CAM:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

.field public static final enum STATIC_PHOTO_SCANNER:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

.field public static final enum STATIC_PHOTO_UNKNOWN_SOURCE:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

.field public static final enum UNKNOWN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

.field public static final enum UNSPECIFIED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

.field public static final enum VIDEO_FRAME_ANALOG_CAM:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

.field public static final enum VIDEO_FRAME_DIGITAL_CAM:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

.field public static final enum VIDEO_FRAME_UNKNOWN_SOURCE:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 268
    new-instance v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    const-string v1, "UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;->UNSPECIFIED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    .line 269
    new-instance v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    const-string v2, "STATIC_PHOTO_UNKNOWN_SOURCE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;->STATIC_PHOTO_UNKNOWN_SOURCE:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    .line 270
    new-instance v2, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    const-string v3, "STATIC_PHOTO_DIGITAL_CAM"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;->STATIC_PHOTO_DIGITAL_CAM:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    .line 271
    new-instance v3, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    const-string v4, "STATIC_PHOTO_SCANNER"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;->STATIC_PHOTO_SCANNER:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    .line 272
    new-instance v4, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    const-string v5, "VIDEO_FRAME_UNKNOWN_SOURCE"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;->VIDEO_FRAME_UNKNOWN_SOURCE:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    .line 273
    new-instance v5, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    const-string v6, "VIDEO_FRAME_ANALOG_CAM"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;->VIDEO_FRAME_ANALOG_CAM:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    .line 274
    new-instance v6, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    const-string v7, "VIDEO_FRAME_DIGITAL_CAM"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;->VIDEO_FRAME_DIGITAL_CAM:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    .line 275
    new-instance v7, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    const-string v8, "UNKNOWN"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;->UNKNOWN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    .line 267
    filled-new-array/range {v0 .. v7}, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;->$VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 267
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;
    .locals 1

    .line 267
    const-class v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    return-object p0
.end method

.method public static values()[Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;
    .locals 1

    .line 267
    sget-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;->$VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    invoke-virtual {v0}, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$SourceType;

    return-object v0
.end method
