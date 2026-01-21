.class public final enum Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;
.super Ljava/lang/Enum;
.source "CVCAuthorizationTemplate.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jmrtd/cert/CVCAuthorizationTemplate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Permission"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

.field public static final enum READ_ACCESS_DG3:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

.field public static final enum READ_ACCESS_DG3_AND_DG4:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

.field public static final enum READ_ACCESS_DG4:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

.field public static final enum READ_ACCESS_NONE:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;


# instance fields
.field private value:B


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 79
    new-instance v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    const-string v1, "READ_ACCESS_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->READ_ACCESS_NONE:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    .line 80
    new-instance v1, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    const-string v2, "READ_ACCESS_DG3"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->READ_ACCESS_DG3:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    .line 81
    new-instance v2, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    const-string v3, "READ_ACCESS_DG4"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->READ_ACCESS_DG4:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    .line 82
    new-instance v3, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    const-string v4, "READ_ACCESS_DG3_AND_DG4"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->READ_ACCESS_DG3_AND_DG4:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    .line 78
    filled-new-array {v0, v1, v2, v3}, [Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->$VALUES:[Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 91
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    int-to-byte p1, p3

    .line 92
    iput-byte p1, p0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->value:B

    return-void
.end method

.method static synthetic access$100(Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;)B
    .locals 0

    .line 78
    iget-byte p0, p0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->value:B

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;
    .locals 1

    .line 78
    const-class v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    return-object p0
.end method

.method public static values()[Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;
    .locals 1

    .line 78
    sget-object v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->$VALUES:[Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    invoke-virtual {v0}, [Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    return-object v0
.end method


# virtual methods
.method public getValue()B
    .locals 1

    .line 123
    iget-byte v0, p0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->value:B

    return v0
.end method

.method public implies(Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;)Z
    .locals 4

    .line 103
    sget-object v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$1;->$SwitchMap$org$jmrtd$cert$CVCAuthorizationTemplate$Permission:[I

    invoke-virtual {p0}, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_7

    const/4 v3, 0x2

    if-eq v0, v3, :cond_5

    const/4 v3, 0x3

    if-eq v0, v3, :cond_3

    const/4 v3, 0x4

    if-eq v0, v3, :cond_0

    return v1

    .line 111
    :cond_0
    sget-object v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->READ_ACCESS_DG3:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    if-eq p1, v0, :cond_2

    sget-object v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->READ_ACCESS_DG4:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    if-eq p1, v0, :cond_2

    sget-object v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->READ_ACCESS_DG3_AND_DG4:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    return v2

    .line 109
    :cond_3
    sget-object v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->READ_ACCESS_DG4:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    if-ne p1, v0, :cond_4

    return v2

    :cond_4
    return v1

    .line 107
    :cond_5
    sget-object v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->READ_ACCESS_DG3:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    if-ne p1, v0, :cond_6

    return v2

    :cond_6
    return v1

    .line 105
    :cond_7
    sget-object v0, Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;->READ_ACCESS_NONE:Lorg/jmrtd/cert/CVCAuthorizationTemplate$Permission;

    if-ne p1, v0, :cond_8

    return v2

    :cond_8
    return v1
.end method
