.class public final enum Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;
.super Ljava/lang/Enum;
.source "FaceImageInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jmrtd/lds/iso19794/FaceImageInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "FaceImageType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

.field public static final enum BASIC:Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

.field public static final enum FULL_FRONTAL:Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

.field public static final enum TOKEN_FRONTAL:Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 233
    new-instance v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

    const-string v1, "BASIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;->BASIC:Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

    .line 234
    new-instance v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

    const-string v2, "FULL_FRONTAL"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;->FULL_FRONTAL:Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

    .line 235
    new-instance v2, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

    const-string v3, "TOKEN_FRONTAL"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;->TOKEN_FRONTAL:Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

    .line 232
    filled-new-array {v0, v1, v2}, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;->$VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 232
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;
    .locals 1

    .line 232
    const-class v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

    return-object p0
.end method

.method public static values()[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;
    .locals 1

    .line 232
    sget-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;->$VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

    invoke-virtual {v0}, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$FaceImageType;

    return-object v0
.end method
