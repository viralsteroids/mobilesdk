.class public final enum Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;
.super Ljava/lang/Enum;
.source "CVCAuthorizationTemplate.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jmrtd/cert/CVCAuthorizationTemplate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Role"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

.field public static final enum CVCA:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

.field public static final enum DV_D:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

.field public static final enum DV_F:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

.field public static final enum IS:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;


# instance fields
.field private value:B


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 45
    new-instance v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

    const/16 v1, 0xc0

    const-string v2, "CVCA"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;->CVCA:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

    .line 46
    new-instance v1, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

    const/4 v2, 0x1

    const/16 v4, 0x80

    const-string v5, "DV_D"

    invoke-direct {v1, v5, v2, v4}, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;->DV_D:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

    .line 47
    new-instance v2, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

    const/4 v4, 0x2

    const/16 v5, 0x40

    const-string v6, "DV_F"

    invoke-direct {v2, v6, v4, v5}, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;->DV_F:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

    .line 48
    new-instance v4, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

    const-string v5, "IS"

    const/4 v6, 0x3

    invoke-direct {v4, v5, v6, v3}, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;->IS:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

    .line 44
    filled-new-array {v0, v1, v2, v4}, [Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;->$VALUES:[Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 57
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    int-to-byte p1, p3

    .line 58
    iput-byte p1, p0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;->value:B

    return-void
.end method

.method static synthetic access$000(Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;)B
    .locals 0

    .line 44
    iget-byte p0, p0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;->value:B

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;
    .locals 1

    .line 44
    const-class v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

    return-object p0
.end method

.method public static values()[Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;
    .locals 1

    .line 44
    sget-object v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;->$VALUES:[Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

    invoke-virtual {v0}, [Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;

    return-object v0
.end method


# virtual methods
.method public getValue()B
    .locals 1

    .line 67
    iget-byte v0, p0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Role;->value:B

    return v0
.end method
