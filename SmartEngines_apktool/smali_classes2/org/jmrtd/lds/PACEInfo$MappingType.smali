.class public final enum Lorg/jmrtd/lds/PACEInfo$MappingType;
.super Ljava/lang/Enum;
.source "PACEInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jmrtd/lds/PACEInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MappingType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jmrtd/lds/PACEInfo$MappingType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jmrtd/lds/PACEInfo$MappingType;

.field public static final enum CAM:Lorg/jmrtd/lds/PACEInfo$MappingType;

.field public static final enum GM:Lorg/jmrtd/lds/PACEInfo$MappingType;

.field public static final enum IM:Lorg/jmrtd/lds/PACEInfo$MappingType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 94
    new-instance v0, Lorg/jmrtd/lds/PACEInfo$MappingType;

    const-string v1, "GM"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/jmrtd/lds/PACEInfo$MappingType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/jmrtd/lds/PACEInfo$MappingType;->GM:Lorg/jmrtd/lds/PACEInfo$MappingType;

    .line 97
    new-instance v1, Lorg/jmrtd/lds/PACEInfo$MappingType;

    const-string v2, "IM"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lorg/jmrtd/lds/PACEInfo$MappingType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lorg/jmrtd/lds/PACEInfo$MappingType;->IM:Lorg/jmrtd/lds/PACEInfo$MappingType;

    .line 100
    new-instance v2, Lorg/jmrtd/lds/PACEInfo$MappingType;

    const-string v3, "CAM"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lorg/jmrtd/lds/PACEInfo$MappingType;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lorg/jmrtd/lds/PACEInfo$MappingType;->CAM:Lorg/jmrtd/lds/PACEInfo$MappingType;

    .line 92
    filled-new-array {v0, v1, v2}, [Lorg/jmrtd/lds/PACEInfo$MappingType;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/lds/PACEInfo$MappingType;->$VALUES:[Lorg/jmrtd/lds/PACEInfo$MappingType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 92
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jmrtd/lds/PACEInfo$MappingType;
    .locals 1

    .line 92
    const-class v0, Lorg/jmrtd/lds/PACEInfo$MappingType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jmrtd/lds/PACEInfo$MappingType;

    return-object p0
.end method

.method public static values()[Lorg/jmrtd/lds/PACEInfo$MappingType;
    .locals 1

    .line 92
    sget-object v0, Lorg/jmrtd/lds/PACEInfo$MappingType;->$VALUES:[Lorg/jmrtd/lds/PACEInfo$MappingType;

    invoke-virtual {v0}, [Lorg/jmrtd/lds/PACEInfo$MappingType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jmrtd/lds/PACEInfo$MappingType;

    return-object v0
.end method
