.class public final enum Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;
.super Ljava/lang/Enum;
.source "FaceImageInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jmrtd/lds/iso19794/FaceImageInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Expression"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

.field public static final enum EYES_LOOKING_AWAY:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

.field public static final enum FROWNING:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

.field public static final enum NEUTRAL:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

.field public static final enum RAISED_EYEBROWS:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

.field public static final enum SMILE_CLOSED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

.field public static final enum SMILE_OPEN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

.field public static final enum SQUINTING:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

.field public static final enum UNSPECIFIED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 212
    new-instance v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    const-string v1, "UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;->UNSPECIFIED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    .line 213
    new-instance v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    const-string v2, "NEUTRAL"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;->NEUTRAL:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    .line 214
    new-instance v2, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    const-string v3, "SMILE_CLOSED"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;->SMILE_CLOSED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    .line 215
    new-instance v3, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    const-string v4, "SMILE_OPEN"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;->SMILE_OPEN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    .line 216
    new-instance v4, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    const-string v5, "RAISED_EYEBROWS"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;->RAISED_EYEBROWS:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    .line 217
    new-instance v5, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    const-string v6, "EYES_LOOKING_AWAY"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;->EYES_LOOKING_AWAY:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    .line 218
    new-instance v6, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    const-string v7, "SQUINTING"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;->SQUINTING:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    .line 219
    new-instance v7, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    const-string v8, "FROWNING"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;->FROWNING:Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    .line 211
    filled-new-array/range {v0 .. v7}, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;->$VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 211
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;
    .locals 1

    .line 211
    const-class v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    return-object p0
.end method

.method public static values()[Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;
    .locals 1

    .line 211
    sget-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;->$VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    invoke-virtual {v0}, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$Expression;

    return-object v0
.end method
