.class public final enum Lorg/ejbca/cvc/CVCTagEnum;
.super Ljava/lang/Enum;
.source "CVCTagEnum.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/ejbca/cvc/CVCTagEnum;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum BASE_POINT_G:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum BASE_POINT_R_ORDER:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum CA_REFERENCE:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum CERTIFICATE_BODY:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum COEFFICIENT_A:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum COEFFICIENT_B:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum COFACTOR_F:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum CV_CERTIFICATE:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum EFFECTIVE_DATE:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum EXPIRATION_DATE:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum EXPONENT:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum HOLDER_AUTH_TEMPLATE:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum HOLDER_REFERENCE:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum MODULUS:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum OID:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum PROFILE_IDENTIFIER:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum PUBLIC_KEY:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum PUBLIC_POINT_Y:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum REQ_AUTHENTICATION:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum ROLE_AND_ACCESS_RIGHTS:Lorg/ejbca/cvc/CVCTagEnum;

.field public static final enum SIGNATURE:Lorg/ejbca/cvc/CVCTagEnum;


# instance fields
.field private isSequence:Z

.field private value:I


# direct methods
.method static constructor <clinit>()V
    .locals 24

    .line 25
    new-instance v1, Lorg/ejbca/cvc/CVCTagEnum;

    const-string v0, "CV_CERTIFICATE"

    const/4 v2, 0x0

    const/16 v3, 0x7f21

    const/4 v4, 0x1

    invoke-direct {v1, v0, v2, v3, v4}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;IIZ)V

    sput-object v1, Lorg/ejbca/cvc/CVCTagEnum;->CV_CERTIFICATE:Lorg/ejbca/cvc/CVCTagEnum;

    .line 26
    new-instance v2, Lorg/ejbca/cvc/CVCTagEnum;

    const-string v0, "CERTIFICATE_BODY"

    const/16 v3, 0x7f4e

    invoke-direct {v2, v0, v4, v3, v4}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;IIZ)V

    sput-object v2, Lorg/ejbca/cvc/CVCTagEnum;->CERTIFICATE_BODY:Lorg/ejbca/cvc/CVCTagEnum;

    .line 27
    new-instance v3, Lorg/ejbca/cvc/CVCTagEnum;

    const/4 v0, 0x2

    const/16 v5, 0x5f29

    const-string v6, "PROFILE_IDENTIFIER"

    invoke-direct {v3, v6, v0, v5}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lorg/ejbca/cvc/CVCTagEnum;->PROFILE_IDENTIFIER:Lorg/ejbca/cvc/CVCTagEnum;

    .line 28
    new-instance v0, Lorg/ejbca/cvc/CVCTagEnum;

    const/4 v5, 0x3

    const/16 v6, 0x7f49

    const-string v7, "PUBLIC_KEY"

    invoke-direct {v0, v7, v5, v6, v4}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;IIZ)V

    sput-object v0, Lorg/ejbca/cvc/CVCTagEnum;->PUBLIC_KEY:Lorg/ejbca/cvc/CVCTagEnum;

    .line 29
    new-instance v5, Lorg/ejbca/cvc/CVCTagEnum;

    const/4 v6, 0x4

    const/16 v7, 0x5f20

    const-string v8, "HOLDER_REFERENCE"

    invoke-direct {v5, v8, v6, v7}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lorg/ejbca/cvc/CVCTagEnum;->HOLDER_REFERENCE:Lorg/ejbca/cvc/CVCTagEnum;

    .line 30
    new-instance v6, Lorg/ejbca/cvc/CVCTagEnum;

    const/4 v7, 0x5

    const/16 v8, 0x7f4c

    const-string v9, "HOLDER_AUTH_TEMPLATE"

    invoke-direct {v6, v9, v7, v8, v4}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;IIZ)V

    sput-object v6, Lorg/ejbca/cvc/CVCTagEnum;->HOLDER_AUTH_TEMPLATE:Lorg/ejbca/cvc/CVCTagEnum;

    .line 31
    new-instance v7, Lorg/ejbca/cvc/CVCTagEnum;

    const/16 v8, 0x5f25

    const-string v9, "EFFECTIVE_DATE"

    const/4 v10, 0x6

    invoke-direct {v7, v9, v10, v8}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lorg/ejbca/cvc/CVCTagEnum;->EFFECTIVE_DATE:Lorg/ejbca/cvc/CVCTagEnum;

    .line 32
    new-instance v8, Lorg/ejbca/cvc/CVCTagEnum;

    const/4 v9, 0x7

    const/16 v11, 0x5f24

    const-string v12, "EXPIRATION_DATE"

    invoke-direct {v8, v12, v9, v11}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lorg/ejbca/cvc/CVCTagEnum;->EXPIRATION_DATE:Lorg/ejbca/cvc/CVCTagEnum;

    .line 33
    new-instance v9, Lorg/ejbca/cvc/CVCTagEnum;

    const/16 v11, 0x8

    const/16 v12, 0x5f37

    const-string v13, "SIGNATURE"

    invoke-direct {v9, v13, v11, v12}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lorg/ejbca/cvc/CVCTagEnum;->SIGNATURE:Lorg/ejbca/cvc/CVCTagEnum;

    .line 35
    new-instance v11, Lorg/ejbca/cvc/CVCTagEnum;

    const-string v12, "OID"

    const/16 v13, 0x9

    invoke-direct {v11, v12, v13, v10}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lorg/ejbca/cvc/CVCTagEnum;->OID:Lorg/ejbca/cvc/CVCTagEnum;

    move-object v10, v11

    .line 36
    new-instance v11, Lorg/ejbca/cvc/CVCTagEnum;

    const/16 v12, 0xa

    const/16 v13, 0x42

    const-string v14, "CA_REFERENCE"

    invoke-direct {v11, v14, v12, v13}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lorg/ejbca/cvc/CVCTagEnum;->CA_REFERENCE:Lorg/ejbca/cvc/CVCTagEnum;

    .line 37
    new-instance v12, Lorg/ejbca/cvc/CVCTagEnum;

    const/16 v13, 0xb

    const/16 v14, 0x67

    const-string v15, "REQ_AUTHENTICATION"

    invoke-direct {v12, v15, v13, v14, v4}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;IIZ)V

    sput-object v12, Lorg/ejbca/cvc/CVCTagEnum;->REQ_AUTHENTICATION:Lorg/ejbca/cvc/CVCTagEnum;

    .line 40
    new-instance v13, Lorg/ejbca/cvc/CVCTagEnum;

    const/16 v4, 0xc

    const/16 v14, 0x53

    const-string v15, "ROLE_AND_ACCESS_RIGHTS"

    invoke-direct {v13, v15, v4, v14}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lorg/ejbca/cvc/CVCTagEnum;->ROLE_AND_ACCESS_RIGHTS:Lorg/ejbca/cvc/CVCTagEnum;

    .line 43
    new-instance v14, Lorg/ejbca/cvc/CVCTagEnum;

    const/16 v4, 0xd

    const/16 v15, 0x81

    move-object/from16 v16, v0

    const-string v0, "MODULUS"

    invoke-direct {v14, v0, v4, v15}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lorg/ejbca/cvc/CVCTagEnum;->MODULUS:Lorg/ejbca/cvc/CVCTagEnum;

    .line 44
    new-instance v15, Lorg/ejbca/cvc/CVCTagEnum;

    const-string v0, "EXPONENT"

    const/16 v4, 0xe

    move-object/from16 v17, v1

    const/16 v1, 0x82

    invoke-direct {v15, v0, v4, v1}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lorg/ejbca/cvc/CVCTagEnum;->EXPONENT:Lorg/ejbca/cvc/CVCTagEnum;

    .line 46
    new-instance v0, Lorg/ejbca/cvc/CVCTagEnum;

    const-string v4, "COEFFICIENT_A"

    move-object/from16 v18, v2

    const/16 v2, 0xf

    invoke-direct {v0, v4, v2, v1}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/ejbca/cvc/CVCTagEnum;->COEFFICIENT_A:Lorg/ejbca/cvc/CVCTagEnum;

    .line 47
    new-instance v1, Lorg/ejbca/cvc/CVCTagEnum;

    const/16 v2, 0x10

    const/16 v4, 0x83

    move-object/from16 v19, v0

    const-string v0, "COEFFICIENT_B"

    invoke-direct {v1, v0, v2, v4}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lorg/ejbca/cvc/CVCTagEnum;->COEFFICIENT_B:Lorg/ejbca/cvc/CVCTagEnum;

    .line 48
    new-instance v0, Lorg/ejbca/cvc/CVCTagEnum;

    const/16 v2, 0x11

    const/16 v4, 0x84

    move-object/from16 v20, v1

    const-string v1, "BASE_POINT_G"

    invoke-direct {v0, v1, v2, v4}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/ejbca/cvc/CVCTagEnum;->BASE_POINT_G:Lorg/ejbca/cvc/CVCTagEnum;

    .line 49
    new-instance v1, Lorg/ejbca/cvc/CVCTagEnum;

    const/16 v2, 0x12

    const/16 v4, 0x85

    move-object/from16 v21, v0

    const-string v0, "BASE_POINT_R_ORDER"

    invoke-direct {v1, v0, v2, v4}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lorg/ejbca/cvc/CVCTagEnum;->BASE_POINT_R_ORDER:Lorg/ejbca/cvc/CVCTagEnum;

    .line 50
    new-instance v0, Lorg/ejbca/cvc/CVCTagEnum;

    const/16 v2, 0x13

    const/16 v4, 0x86

    move-object/from16 v22, v1

    const-string v1, "PUBLIC_POINT_Y"

    invoke-direct {v0, v1, v2, v4}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/ejbca/cvc/CVCTagEnum;->PUBLIC_POINT_Y:Lorg/ejbca/cvc/CVCTagEnum;

    .line 51
    new-instance v1, Lorg/ejbca/cvc/CVCTagEnum;

    const/16 v2, 0x14

    const/16 v4, 0x87

    move-object/from16 v23, v0

    const-string v0, "COFACTOR_F"

    invoke-direct {v1, v0, v2, v4}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lorg/ejbca/cvc/CVCTagEnum;->COFACTOR_F:Lorg/ejbca/cvc/CVCTagEnum;

    move-object/from16 v4, v16

    move-object/from16 v2, v18

    move-object/from16 v16, v19

    move-object/from16 v18, v21

    move-object/from16 v19, v22

    move-object/from16 v21, v1

    move-object/from16 v1, v17

    move-object/from16 v17, v20

    move-object/from16 v20, v23

    .line 22
    filled-new-array/range {v1 .. v21}, [Lorg/ejbca/cvc/CVCTagEnum;

    move-result-object v0

    sput-object v0, Lorg/ejbca/cvc/CVCTagEnum;->$VALUES:[Lorg/ejbca/cvc/CVCTagEnum;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 58
    invoke-direct {p0, p1, p2, p3, v0}, Lorg/ejbca/cvc/CVCTagEnum;-><init>(Ljava/lang/String;IIZ)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ)V"
        }
    .end annotation

    .line 61
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 62
    iput p3, p0, Lorg/ejbca/cvc/CVCTagEnum;->value:I

    .line 63
    iput-boolean p4, p0, Lorg/ejbca/cvc/CVCTagEnum;->isSequence:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/ejbca/cvc/CVCTagEnum;
    .locals 1

    .line 22
    const-class v0, Lorg/ejbca/cvc/CVCTagEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/ejbca/cvc/CVCTagEnum;

    return-object p0
.end method

.method public static values()[Lorg/ejbca/cvc/CVCTagEnum;
    .locals 1

    .line 22
    sget-object v0, Lorg/ejbca/cvc/CVCTagEnum;->$VALUES:[Lorg/ejbca/cvc/CVCTagEnum;

    invoke-virtual {v0}, [Lorg/ejbca/cvc/CVCTagEnum;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/ejbca/cvc/CVCTagEnum;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 71
    iget v0, p0, Lorg/ejbca/cvc/CVCTagEnum;->value:I

    return v0
.end method

.method public isSequence()Z
    .locals 1

    .line 83
    iget-boolean v0, p0, Lorg/ejbca/cvc/CVCTagEnum;->isSequence:Z

    return v0
.end method
