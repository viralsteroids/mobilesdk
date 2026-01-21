.class public final Lcom/smartengines/code/CodeEngineType;
.super Ljava/lang/Object;
.source "CodeEngineType.java"


# static fields
.field public static final CodeEngine_BankCard:Lcom/smartengines/code/CodeEngineType;

.field public static final CodeEngine_Barcode:Lcom/smartengines/code/CodeEngineType;

.field public static final CodeEngine_CodeTextLine:Lcom/smartengines/code/CodeEngineType;

.field public static final CodeEngine_LicensePlate:Lcom/smartengines/code/CodeEngineType;

.field public static final CodeEngine_MRZ:Lcom/smartengines/code/CodeEngineType;

.field public static final CodeEngine_PaymentDetails:Lcom/smartengines/code/CodeEngineType;

.field public static final CodeEngine_RFID:Lcom/smartengines/code/CodeEngineType;

.field public static final CodeEngine_ShippingContainer:Lcom/smartengines/code/CodeEngineType;

.field private static swigNext:I

.field private static swigValues:[Lcom/smartengines/code/CodeEngineType;


# instance fields
.field private final swigName:Ljava/lang/String;

.field private final swigValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 12
    new-instance v0, Lcom/smartengines/code/CodeEngineType;

    const-string v1, "CodeEngine_Barcode"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngine_Barcode_get()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/smartengines/code/CodeEngineType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/code/CodeEngineType;->CodeEngine_Barcode:Lcom/smartengines/code/CodeEngineType;

    .line 13
    new-instance v1, Lcom/smartengines/code/CodeEngineType;

    const-string v2, "CodeEngine_CodeTextLine"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngine_CodeTextLine_get()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lcom/smartengines/code/CodeEngineType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/smartengines/code/CodeEngineType;->CodeEngine_CodeTextLine:Lcom/smartengines/code/CodeEngineType;

    .line 14
    new-instance v2, Lcom/smartengines/code/CodeEngineType;

    const-string v3, "CodeEngine_MRZ"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngine_MRZ_get()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/smartengines/code/CodeEngineType;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/smartengines/code/CodeEngineType;->CodeEngine_MRZ:Lcom/smartengines/code/CodeEngineType;

    .line 15
    new-instance v3, Lcom/smartengines/code/CodeEngineType;

    const-string v4, "CodeEngine_BankCard"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngine_BankCard_get()I

    move-result v5

    invoke-direct {v3, v4, v5}, Lcom/smartengines/code/CodeEngineType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/smartengines/code/CodeEngineType;->CodeEngine_BankCard:Lcom/smartengines/code/CodeEngineType;

    .line 16
    new-instance v4, Lcom/smartengines/code/CodeEngineType;

    const-string v5, "CodeEngine_PaymentDetails"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngine_PaymentDetails_get()I

    move-result v6

    invoke-direct {v4, v5, v6}, Lcom/smartengines/code/CodeEngineType;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/smartengines/code/CodeEngineType;->CodeEngine_PaymentDetails:Lcom/smartengines/code/CodeEngineType;

    .line 17
    new-instance v5, Lcom/smartengines/code/CodeEngineType;

    const-string v6, "CodeEngine_LicensePlate"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngine_LicensePlate_get()I

    move-result v7

    invoke-direct {v5, v6, v7}, Lcom/smartengines/code/CodeEngineType;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/smartengines/code/CodeEngineType;->CodeEngine_LicensePlate:Lcom/smartengines/code/CodeEngineType;

    .line 18
    new-instance v6, Lcom/smartengines/code/CodeEngineType;

    const-string v7, "CodeEngine_ShippingContainer"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngine_ShippingContainer_get()I

    move-result v8

    invoke-direct {v6, v7, v8}, Lcom/smartengines/code/CodeEngineType;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lcom/smartengines/code/CodeEngineType;->CodeEngine_ShippingContainer:Lcom/smartengines/code/CodeEngineType;

    .line 19
    new-instance v7, Lcom/smartengines/code/CodeEngineType;

    const-string v8, "CodeEngine_RFID"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeEngine_RFID_get()I

    move-result v9

    invoke-direct {v7, v8, v9}, Lcom/smartengines/code/CodeEngineType;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/smartengines/code/CodeEngineType;->CodeEngine_RFID:Lcom/smartengines/code/CodeEngineType;

    .line 55
    filled-new-array/range {v0 .. v7}, [Lcom/smartengines/code/CodeEngineType;

    move-result-object v0

    sput-object v0, Lcom/smartengines/code/CodeEngineType;->swigValues:[Lcom/smartengines/code/CodeEngineType;

    const/4 v0, 0x0

    .line 56
    sput v0, Lcom/smartengines/code/CodeEngineType;->swigNext:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/smartengines/code/CodeEngineType;->swigName:Ljava/lang/String;

    .line 40
    sget p1, Lcom/smartengines/code/CodeEngineType;->swigNext:I

    add-int/lit8 v0, p1, 0x1

    sput v0, Lcom/smartengines/code/CodeEngineType;->swigNext:I

    iput p1, p0, Lcom/smartengines/code/CodeEngineType;->swigValue:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/smartengines/code/CodeEngineType;->swigName:Ljava/lang/String;

    .line 45
    iput p2, p0, Lcom/smartengines/code/CodeEngineType;->swigValue:I

    add-int/lit8 p2, p2, 0x1

    .line 46
    sput p2, Lcom/smartengines/code/CodeEngineType;->swigNext:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/smartengines/code/CodeEngineType;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/smartengines/code/CodeEngineType;->swigName:Ljava/lang/String;

    .line 51
    iget p1, p2, Lcom/smartengines/code/CodeEngineType;->swigValue:I

    iput p1, p0, Lcom/smartengines/code/CodeEngineType;->swigValue:I

    add-int/lit8 p1, p1, 0x1

    .line 52
    sput p1, Lcom/smartengines/code/CodeEngineType;->swigNext:I

    return-void
.end method

.method public static swigToEnum(I)Lcom/smartengines/code/CodeEngineType;
    .locals 3

    .line 30
    sget-object v0, Lcom/smartengines/code/CodeEngineType;->swigValues:[Lcom/smartengines/code/CodeEngineType;

    array-length v1, v0

    if-ge p0, v1, :cond_0

    if-ltz p0, :cond_0

    aget-object v0, v0, p0

    iget v1, v0, Lcom/smartengines/code/CodeEngineType;->swigValue:I

    if-ne v1, p0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    sget-object v1, Lcom/smartengines/code/CodeEngineType;->swigValues:[Lcom/smartengines/code/CodeEngineType;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 33
    aget-object v1, v1, v0

    iget v2, v1, Lcom/smartengines/code/CodeEngineType;->swigValue:I

    if-ne v2, p0, :cond_1

    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 35
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No enum "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Lcom/smartengines/code/CodeEngineType;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " with value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final swigValue()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/smartengines/code/CodeEngineType;->swigValue:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/smartengines/code/CodeEngineType;->swigName:Ljava/lang/String;

    return-object v0
.end method
