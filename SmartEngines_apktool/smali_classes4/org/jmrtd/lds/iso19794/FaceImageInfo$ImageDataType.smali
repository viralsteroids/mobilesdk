.class public final enum Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;
.super Ljava/lang/Enum;
.source "FaceImageInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jmrtd/lds/iso19794/FaceImageInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ImageDataType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;

.field public static final enum TYPE_JPEG:Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;

.field public static final enum TYPE_JPEG2000:Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 244
    new-instance v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;

    const-string v1, "TYPE_JPEG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;->TYPE_JPEG:Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;

    .line 245
    new-instance v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;

    const-string v2, "TYPE_JPEG2000"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;->TYPE_JPEG2000:Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;

    .line 243
    filled-new-array {v0, v1}, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;->$VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 243
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;
    .locals 1

    .line 243
    const-class v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;

    return-object p0
.end method

.method public static values()[Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;
    .locals 1

    .line 243
    sget-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;->$VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;

    invoke-virtual {v0}, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$ImageDataType;

    return-object v0
.end method
