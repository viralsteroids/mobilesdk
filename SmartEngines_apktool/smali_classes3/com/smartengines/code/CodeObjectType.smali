.class public final Lcom/smartengines/code/CodeObjectType;
.super Ljava/lang/Object;
.source "CodeObjectType.java"


# static fields
.field public static final CodeObject_BankCard:Lcom/smartengines/code/CodeObjectType;

.field public static final CodeObject_CodeTextLine:Lcom/smartengines/code/CodeObjectType;

.field public static final CodeObject_Container:Lcom/smartengines/code/CodeObjectType;

.field public static final CodeObject_Face:Lcom/smartengines/code/CodeObjectType;

.field public static final CodeObject_LinearBarcode:Lcom/smartengines/code/CodeObjectType;

.field public static final CodeObject_MRZ:Lcom/smartengines/code/CodeObjectType;

.field public static final CodeObject_MatrixBarcode:Lcom/smartengines/code/CodeObjectType;

.field public static final CodeObject_PaymentDetails:Lcom/smartengines/code/CodeObjectType;

.field public static final CodeObject_RFID:Lcom/smartengines/code/CodeObjectType;

.field private static swigNext:I

.field private static swigValues:[Lcom/smartengines/code/CodeObjectType;


# instance fields
.field private final swigName:Ljava/lang/String;

.field private final swigValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 12
    new-instance v0, Lcom/smartengines/code/CodeObjectType;

    const-string v1, "CodeObject_LinearBarcode"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_LinearBarcode_get()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/smartengines/code/CodeObjectType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/code/CodeObjectType;->CodeObject_LinearBarcode:Lcom/smartengines/code/CodeObjectType;

    .line 13
    new-instance v1, Lcom/smartengines/code/CodeObjectType;

    const-string v2, "CodeObject_MatrixBarcode"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_MatrixBarcode_get()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lcom/smartengines/code/CodeObjectType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/smartengines/code/CodeObjectType;->CodeObject_MatrixBarcode:Lcom/smartengines/code/CodeObjectType;

    .line 14
    new-instance v2, Lcom/smartengines/code/CodeObjectType;

    const-string v3, "CodeObject_CodeTextLine"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_CodeTextLine_get()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/smartengines/code/CodeObjectType;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/smartengines/code/CodeObjectType;->CodeObject_CodeTextLine:Lcom/smartengines/code/CodeObjectType;

    .line 15
    new-instance v3, Lcom/smartengines/code/CodeObjectType;

    const-string v4, "CodeObject_MRZ"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_MRZ_get()I

    move-result v5

    invoke-direct {v3, v4, v5}, Lcom/smartengines/code/CodeObjectType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/smartengines/code/CodeObjectType;->CodeObject_MRZ:Lcom/smartengines/code/CodeObjectType;

    .line 16
    new-instance v4, Lcom/smartengines/code/CodeObjectType;

    const-string v5, "CodeObject_BankCard"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_BankCard_get()I

    move-result v6

    invoke-direct {v4, v5, v6}, Lcom/smartengines/code/CodeObjectType;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/smartengines/code/CodeObjectType;->CodeObject_BankCard:Lcom/smartengines/code/CodeObjectType;

    .line 17
    new-instance v5, Lcom/smartengines/code/CodeObjectType;

    const-string v6, "CodeObject_PaymentDetails"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_PaymentDetails_get()I

    move-result v7

    invoke-direct {v5, v6, v7}, Lcom/smartengines/code/CodeObjectType;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/smartengines/code/CodeObjectType;->CodeObject_PaymentDetails:Lcom/smartengines/code/CodeObjectType;

    .line 18
    new-instance v6, Lcom/smartengines/code/CodeObjectType;

    const-string v7, "CodeObject_Face"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_Face_get()I

    move-result v8

    invoke-direct {v6, v7, v8}, Lcom/smartengines/code/CodeObjectType;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lcom/smartengines/code/CodeObjectType;->CodeObject_Face:Lcom/smartengines/code/CodeObjectType;

    .line 19
    new-instance v7, Lcom/smartengines/code/CodeObjectType;

    const-string v8, "CodeObject_Container"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_Container_get()I

    move-result v9

    invoke-direct {v7, v8, v9}, Lcom/smartengines/code/CodeObjectType;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/smartengines/code/CodeObjectType;->CodeObject_Container:Lcom/smartengines/code/CodeObjectType;

    .line 20
    new-instance v8, Lcom/smartengines/code/CodeObjectType;

    const-string v9, "CodeObject_RFID"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_RFID_get()I

    move-result v10

    invoke-direct {v8, v9, v10}, Lcom/smartengines/code/CodeObjectType;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lcom/smartengines/code/CodeObjectType;->CodeObject_RFID:Lcom/smartengines/code/CodeObjectType;

    .line 56
    filled-new-array/range {v0 .. v8}, [Lcom/smartengines/code/CodeObjectType;

    move-result-object v0

    sput-object v0, Lcom/smartengines/code/CodeObjectType;->swigValues:[Lcom/smartengines/code/CodeObjectType;

    const/4 v0, 0x0

    .line 57
    sput v0, Lcom/smartengines/code/CodeObjectType;->swigNext:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/smartengines/code/CodeObjectType;->swigName:Ljava/lang/String;

    .line 41
    sget p1, Lcom/smartengines/code/CodeObjectType;->swigNext:I

    add-int/lit8 v0, p1, 0x1

    sput v0, Lcom/smartengines/code/CodeObjectType;->swigNext:I

    iput p1, p0, Lcom/smartengines/code/CodeObjectType;->swigValue:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/smartengines/code/CodeObjectType;->swigName:Ljava/lang/String;

    .line 46
    iput p2, p0, Lcom/smartengines/code/CodeObjectType;->swigValue:I

    add-int/lit8 p2, p2, 0x1

    .line 47
    sput p2, Lcom/smartengines/code/CodeObjectType;->swigNext:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/smartengines/code/CodeObjectType;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/smartengines/code/CodeObjectType;->swigName:Ljava/lang/String;

    .line 52
    iget p1, p2, Lcom/smartengines/code/CodeObjectType;->swigValue:I

    iput p1, p0, Lcom/smartengines/code/CodeObjectType;->swigValue:I

    add-int/lit8 p1, p1, 0x1

    .line 53
    sput p1, Lcom/smartengines/code/CodeObjectType;->swigNext:I

    return-void
.end method

.method public static swigToEnum(I)Lcom/smartengines/code/CodeObjectType;
    .locals 3

    .line 31
    sget-object v0, Lcom/smartengines/code/CodeObjectType;->swigValues:[Lcom/smartengines/code/CodeObjectType;

    array-length v1, v0

    if-ge p0, v1, :cond_0

    if-ltz p0, :cond_0

    aget-object v0, v0, p0

    iget v1, v0, Lcom/smartengines/code/CodeObjectType;->swigValue:I

    if-ne v1, p0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 33
    :goto_0
    sget-object v1, Lcom/smartengines/code/CodeObjectType;->swigValues:[Lcom/smartengines/code/CodeObjectType;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 34
    aget-object v1, v1, v0

    iget v2, v1, Lcom/smartengines/code/CodeObjectType;->swigValue:I

    if-ne v2, p0, :cond_1

    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 36
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No enum "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Lcom/smartengines/code/CodeObjectType;

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

    .line 23
    iget v0, p0, Lcom/smartengines/code/CodeObjectType;->swigValue:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/smartengines/code/CodeObjectType;->swigName:Ljava/lang/String;

    return-object v0
.end method
