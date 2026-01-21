.class public final Lcom/smartengines/code/EngineSettingsGroup;
.super Ljava/lang/Object;
.source "EngineSettingsGroup.java"


# static fields
.field public static final Barcode:Lcom/smartengines/code/EngineSettingsGroup;

.field public static final Card:Lcom/smartengines/code/EngineSettingsGroup;

.field public static final CodeTextLine:Lcom/smartengines/code/EngineSettingsGroup;

.field public static final Global:Lcom/smartengines/code/EngineSettingsGroup;

.field public static final LicensePlate:Lcom/smartengines/code/EngineSettingsGroup;

.field public static final Mrz:Lcom/smartengines/code/EngineSettingsGroup;

.field public static final PaymentDetails:Lcom/smartengines/code/EngineSettingsGroup;

.field public static final RFID:Lcom/smartengines/code/EngineSettingsGroup;

.field public static final ShippingContainer:Lcom/smartengines/code/EngineSettingsGroup;

.field private static swigNext:I

.field private static swigValues:[Lcom/smartengines/code/EngineSettingsGroup;


# instance fields
.field private final swigName:Ljava/lang/String;

.field private final swigValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 12
    new-instance v0, Lcom/smartengines/code/EngineSettingsGroup;

    const-string v1, "Global"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->EngineSettingsGroup_Global_get()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/smartengines/code/EngineSettingsGroup;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/code/EngineSettingsGroup;->Global:Lcom/smartengines/code/EngineSettingsGroup;

    .line 13
    new-instance v1, Lcom/smartengines/code/EngineSettingsGroup;

    const-string v2, "Barcode"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->EngineSettingsGroup_Barcode_get()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lcom/smartengines/code/EngineSettingsGroup;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/smartengines/code/EngineSettingsGroup;->Barcode:Lcom/smartengines/code/EngineSettingsGroup;

    .line 14
    new-instance v2, Lcom/smartengines/code/EngineSettingsGroup;

    const-string v3, "Card"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->EngineSettingsGroup_Card_get()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/smartengines/code/EngineSettingsGroup;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/smartengines/code/EngineSettingsGroup;->Card:Lcom/smartengines/code/EngineSettingsGroup;

    .line 15
    new-instance v3, Lcom/smartengines/code/EngineSettingsGroup;

    const-string v4, "CodeTextLine"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->EngineSettingsGroup_CodeTextLine_get()I

    move-result v5

    invoke-direct {v3, v4, v5}, Lcom/smartengines/code/EngineSettingsGroup;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/smartengines/code/EngineSettingsGroup;->CodeTextLine:Lcom/smartengines/code/EngineSettingsGroup;

    .line 16
    new-instance v4, Lcom/smartengines/code/EngineSettingsGroup;

    const-string v5, "Mrz"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->EngineSettingsGroup_Mrz_get()I

    move-result v6

    invoke-direct {v4, v5, v6}, Lcom/smartengines/code/EngineSettingsGroup;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/smartengines/code/EngineSettingsGroup;->Mrz:Lcom/smartengines/code/EngineSettingsGroup;

    .line 17
    new-instance v5, Lcom/smartengines/code/EngineSettingsGroup;

    const-string v6, "PaymentDetails"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->EngineSettingsGroup_PaymentDetails_get()I

    move-result v7

    invoke-direct {v5, v6, v7}, Lcom/smartengines/code/EngineSettingsGroup;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/smartengines/code/EngineSettingsGroup;->PaymentDetails:Lcom/smartengines/code/EngineSettingsGroup;

    .line 18
    new-instance v6, Lcom/smartengines/code/EngineSettingsGroup;

    const-string v7, "LicensePlate"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->EngineSettingsGroup_LicensePlate_get()I

    move-result v8

    invoke-direct {v6, v7, v8}, Lcom/smartengines/code/EngineSettingsGroup;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lcom/smartengines/code/EngineSettingsGroup;->LicensePlate:Lcom/smartengines/code/EngineSettingsGroup;

    .line 19
    new-instance v7, Lcom/smartengines/code/EngineSettingsGroup;

    const-string v8, "ShippingContainer"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->EngineSettingsGroup_ShippingContainer_get()I

    move-result v9

    invoke-direct {v7, v8, v9}, Lcom/smartengines/code/EngineSettingsGroup;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/smartengines/code/EngineSettingsGroup;->ShippingContainer:Lcom/smartengines/code/EngineSettingsGroup;

    .line 20
    new-instance v8, Lcom/smartengines/code/EngineSettingsGroup;

    const-string v9, "RFID"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->EngineSettingsGroup_RFID_get()I

    move-result v10

    invoke-direct {v8, v9, v10}, Lcom/smartengines/code/EngineSettingsGroup;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lcom/smartengines/code/EngineSettingsGroup;->RFID:Lcom/smartengines/code/EngineSettingsGroup;

    .line 56
    filled-new-array/range {v0 .. v8}, [Lcom/smartengines/code/EngineSettingsGroup;

    move-result-object v0

    sput-object v0, Lcom/smartengines/code/EngineSettingsGroup;->swigValues:[Lcom/smartengines/code/EngineSettingsGroup;

    const/4 v0, 0x0

    .line 57
    sput v0, Lcom/smartengines/code/EngineSettingsGroup;->swigNext:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/smartengines/code/EngineSettingsGroup;->swigName:Ljava/lang/String;

    .line 41
    sget p1, Lcom/smartengines/code/EngineSettingsGroup;->swigNext:I

    add-int/lit8 v0, p1, 0x1

    sput v0, Lcom/smartengines/code/EngineSettingsGroup;->swigNext:I

    iput p1, p0, Lcom/smartengines/code/EngineSettingsGroup;->swigValue:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/smartengines/code/EngineSettingsGroup;->swigName:Ljava/lang/String;

    .line 46
    iput p2, p0, Lcom/smartengines/code/EngineSettingsGroup;->swigValue:I

    add-int/lit8 p2, p2, 0x1

    .line 47
    sput p2, Lcom/smartengines/code/EngineSettingsGroup;->swigNext:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/smartengines/code/EngineSettingsGroup;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/smartengines/code/EngineSettingsGroup;->swigName:Ljava/lang/String;

    .line 52
    iget p1, p2, Lcom/smartengines/code/EngineSettingsGroup;->swigValue:I

    iput p1, p0, Lcom/smartengines/code/EngineSettingsGroup;->swigValue:I

    add-int/lit8 p1, p1, 0x1

    .line 53
    sput p1, Lcom/smartengines/code/EngineSettingsGroup;->swigNext:I

    return-void
.end method

.method public static swigToEnum(I)Lcom/smartengines/code/EngineSettingsGroup;
    .locals 3

    .line 31
    sget-object v0, Lcom/smartengines/code/EngineSettingsGroup;->swigValues:[Lcom/smartengines/code/EngineSettingsGroup;

    array-length v1, v0

    if-ge p0, v1, :cond_0

    if-ltz p0, :cond_0

    aget-object v0, v0, p0

    iget v1, v0, Lcom/smartengines/code/EngineSettingsGroup;->swigValue:I

    if-ne v1, p0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 33
    :goto_0
    sget-object v1, Lcom/smartengines/code/EngineSettingsGroup;->swigValues:[Lcom/smartengines/code/EngineSettingsGroup;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 34
    aget-object v1, v1, v0

    iget v2, v1, Lcom/smartengines/code/EngineSettingsGroup;->swigValue:I

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

    const-class v2, Lcom/smartengines/code/EngineSettingsGroup;

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
    iget v0, p0, Lcom/smartengines/code/EngineSettingsGroup;->swigValue:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/smartengines/code/EngineSettingsGroup;->swigName:Ljava/lang/String;

    return-object v0
.end method
