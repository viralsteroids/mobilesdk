.class public Lorg/ejbca/cvc/GenericPublicKeyField;
.super Lorg/ejbca/cvc/AbstractSequence;
.source "GenericPublicKeyField.java"


# static fields
.field private static allowedFields:[Lorg/ejbca/cvc/CVCTagEnum; = null

.field private static final serialVersionUID:J = 0x1L


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x9

    .line 25
    new-array v0, v0, [Lorg/ejbca/cvc/CVCTagEnum;

    const/4 v1, 0x0

    sget-object v2, Lorg/ejbca/cvc/CVCTagEnum;->OID:Lorg/ejbca/cvc/CVCTagEnum;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lorg/ejbca/cvc/CVCTagEnum;->MODULUS:Lorg/ejbca/cvc/CVCTagEnum;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lorg/ejbca/cvc/CVCTagEnum;->EXPONENT:Lorg/ejbca/cvc/CVCTagEnum;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lorg/ejbca/cvc/CVCTagEnum;->COEFFICIENT_A:Lorg/ejbca/cvc/CVCTagEnum;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lorg/ejbca/cvc/CVCTagEnum;->COEFFICIENT_B:Lorg/ejbca/cvc/CVCTagEnum;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lorg/ejbca/cvc/CVCTagEnum;->BASE_POINT_G:Lorg/ejbca/cvc/CVCTagEnum;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lorg/ejbca/cvc/CVCTagEnum;->BASE_POINT_R_ORDER:Lorg/ejbca/cvc/CVCTagEnum;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lorg/ejbca/cvc/CVCTagEnum;->PUBLIC_POINT_Y:Lorg/ejbca/cvc/CVCTagEnum;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lorg/ejbca/cvc/CVCTagEnum;->COFACTOR_F:Lorg/ejbca/cvc/CVCTagEnum;

    aput-object v2, v0, v1

    sput-object v0, Lorg/ejbca/cvc/GenericPublicKeyField;->allowedFields:[Lorg/ejbca/cvc/CVCTagEnum;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 34
    sget-object v0, Lorg/ejbca/cvc/CVCTagEnum;->PUBLIC_KEY:Lorg/ejbca/cvc/CVCTagEnum;

    invoke-direct {p0, v0}, Lorg/ejbca/cvc/AbstractSequence;-><init>(Lorg/ejbca/cvc/CVCTagEnum;)V

    return-void
.end method


# virtual methods
.method protected getAllowedFields()[Lorg/ejbca/cvc/CVCTagEnum;
    .locals 1

    .line 30
    sget-object v0, Lorg/ejbca/cvc/GenericPublicKeyField;->allowedFields:[Lorg/ejbca/cvc/CVCTagEnum;

    return-object v0
.end method
