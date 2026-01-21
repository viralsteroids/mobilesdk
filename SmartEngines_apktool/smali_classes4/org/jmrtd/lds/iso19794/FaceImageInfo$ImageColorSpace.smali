.class public final enum Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;
.super Ljava/lang/Enum;
.source "FaceImageInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jmrtd/lds/iso19794/FaceImageInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ImageColorSpace"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

.field public static final enum GRAY8:Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

.field public static final enum OTHER:Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

.field public static final enum RGB24:Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

.field public static final enum UNSPECIFIED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

.field public static final enum YUV422:Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 253
    new-instance v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    const-string v1, "UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;->UNSPECIFIED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    .line 254
    new-instance v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    const-string v2, "RGB24"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;->RGB24:Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    .line 255
    new-instance v2, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    const-string v3, "YUV422"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;->YUV422:Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    .line 256
    new-instance v3, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    const-string v4, "GRAY8"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;->GRAY8:Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    .line 257
    new-instance v4, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    const-string v5, "OTHER"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;->OTHER:Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    .line 252
    filled-new-array {v0, v1, v2, v3, v4}, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;->$VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 252
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;
    .locals 1

    .line 252
    const-class v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    return-object p0
.end method

.method public static values()[Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;
    .locals 1

    .line 252
    sget-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;->$VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    invoke-virtual {v0}, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageColorSpace;

    return-object v0
.end method
