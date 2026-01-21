.class public final enum Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;
.super Ljava/lang/Enum;
.source "FaceImageInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jmrtd/lds/iso19794/FaceImageInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "EyeColor"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

.field public static final enum BLACK:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

.field public static final enum BLUE:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

.field public static final enum BROWN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

.field public static final enum GRAY:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

.field public static final enum GREEN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

.field public static final enum MULTI_COLORED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

.field public static final enum PINK:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

.field public static final enum UNKNOWN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

.field public static final enum UNSPECIFIED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;


# instance fields
.field private code:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 61
    new-instance v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    const-string v1, "UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->UNSPECIFIED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    .line 62
    new-instance v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    const-string v2, "BLACK"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->BLACK:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    .line 63
    new-instance v2, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    const-string v3, "BLUE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->BLUE:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    .line 64
    new-instance v3, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    const-string v4, "BROWN"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->BROWN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    .line 65
    new-instance v4, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    const-string v5, "GRAY"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->GRAY:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    .line 66
    new-instance v5, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    const-string v6, "GREEN"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->GREEN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    .line 67
    new-instance v6, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    const-string v7, "MULTI_COLORED"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8, v8}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->MULTI_COLORED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    .line 68
    new-instance v7, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    const-string v8, "PINK"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9, v9}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->PINK:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    .line 69
    new-instance v8, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    const/16 v9, 0x8

    const/16 v10, 0xff

    const-string v11, "UNKNOWN"

    invoke-direct {v8, v11, v9, v10}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->UNKNOWN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    .line 60
    filled-new-array/range {v0 .. v8}, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->$VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 78
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 79
    iput p3, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->code:I

    return-void
.end method

.method static toEyeColor(I)Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;
    .locals 5

    .line 99
    invoke-static {}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->values()[Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 100
    invoke-virtual {v3}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->toInt()I

    move-result v4

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 104
    :cond_1
    sget-object p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->UNKNOWN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;
    .locals 1

    .line 60
    const-class v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    return-object p0
.end method

.method public static values()[Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;
    .locals 1

    .line 60
    sget-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->$VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    invoke-virtual {v0}, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;

    return-object v0
.end method


# virtual methods
.method public toInt()I
    .locals 1

    .line 88
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$EyeColor;->code:I

    return v0
.end method
