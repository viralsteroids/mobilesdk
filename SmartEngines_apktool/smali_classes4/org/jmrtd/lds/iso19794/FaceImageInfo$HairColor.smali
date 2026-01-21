.class public final enum Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;
.super Ljava/lang/Enum;
.source "FaceImageInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jmrtd/lds/iso19794/FaceImageInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "HairColor"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

.field public static final enum BALD:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

.field public static final enum BLACK:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

.field public static final enum BLONDE:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

.field public static final enum BLUE:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

.field public static final enum BROWN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

.field public static final enum GRAY:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

.field public static final enum GREEN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

.field public static final enum RED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

.field public static final enum UNKNOWN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

.field public static final enum UNSPECIFIED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

.field public static final enum WHITE:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;


# instance fields
.field private code:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 121
    new-instance v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    const-string v1, "UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->UNSPECIFIED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    .line 122
    new-instance v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    const-string v2, "BALD"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->BALD:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    .line 123
    new-instance v2, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    const-string v3, "BLACK"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->BLACK:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    .line 124
    new-instance v3, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    const-string v4, "BLONDE"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->BLONDE:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    .line 125
    new-instance v4, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    const-string v5, "BROWN"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->BROWN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    .line 126
    new-instance v5, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    const-string v6, "GRAY"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->GRAY:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    .line 127
    new-instance v6, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    const-string v7, "WHITE"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8, v8}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->WHITE:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    .line 128
    new-instance v7, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    const-string v8, "RED"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9, v9}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->RED:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    .line 129
    new-instance v8, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    const-string v9, "GREEN"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10, v10}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->GREEN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    .line 130
    new-instance v9, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    const-string v10, "BLUE"

    const/16 v11, 0x9

    invoke-direct {v9, v10, v11, v11}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->BLUE:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    .line 131
    new-instance v10, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    const/16 v11, 0xa

    const/16 v12, 0xff

    const-string v13, "UNKNOWN"

    invoke-direct {v10, v13, v11, v12}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->UNKNOWN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    .line 120
    filled-new-array/range {v0 .. v10}, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->$VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 140
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 141
    iput p3, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->code:I

    return-void
.end method

.method static toHairColor(I)Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;
    .locals 5

    .line 161
    invoke-static {}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->values()[Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 162
    invoke-virtual {v3}, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->toInt()I

    move-result v4

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 167
    :cond_1
    sget-object p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->UNKNOWN:Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;
    .locals 1

    .line 120
    const-class v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    return-object p0
.end method

.method public static values()[Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;
    .locals 1

    .line 120
    sget-object v0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->$VALUES:[Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    invoke-virtual {v0}, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;

    return-object v0
.end method


# virtual methods
.method public toInt()I
    .locals 1

    .line 150
    iget v0, p0, Lorg/jmrtd/lds/iso19794/FaceImageInfo$HairColor;->code:I

    return v0
.end method
