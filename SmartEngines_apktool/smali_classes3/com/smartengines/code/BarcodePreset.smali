.class public final Lcom/smartengines/code/BarcodePreset;
.super Ljava/lang/Object;
.source "BarcodePreset.java"


# static fields
.field public static final AAMVA:Lcom/smartengines/code/BarcodePreset;

.field public static final EMAIL:Lcom/smartengines/code/BarcodePreset;

.field public static final GEO:Lcom/smartengines/code/BarcodePreset;

.field public static final GS1:Lcom/smartengines/code/BarcodePreset;

.field public static final ICALENDAR:Lcom/smartengines/code/BarcodePreset;

.field public static final ISBN:Lcom/smartengines/code/BarcodePreset;

.field public static final NONE:Lcom/smartengines/code/BarcodePreset;

.field public static final PAYMENT:Lcom/smartengines/code/BarcodePreset;

.field public static final PHONE:Lcom/smartengines/code/BarcodePreset;

.field public static final SMS:Lcom/smartengines/code/BarcodePreset;

.field public static final URL:Lcom/smartengines/code/BarcodePreset;

.field public static final VCARD:Lcom/smartengines/code/BarcodePreset;

.field public static final WIFI:Lcom/smartengines/code/BarcodePreset;

.field private static swigNext:I

.field private static swigValues:[Lcom/smartengines/code/BarcodePreset;


# instance fields
.field private final swigName:Ljava/lang/String;

.field private final swigValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 12
    new-instance v0, Lcom/smartengines/code/BarcodePreset;

    const-string v1, "GS1"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->BarcodePreset_GS1_get()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/smartengines/code/BarcodePreset;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/code/BarcodePreset;->GS1:Lcom/smartengines/code/BarcodePreset;

    .line 13
    new-instance v1, Lcom/smartengines/code/BarcodePreset;

    const-string v2, "AAMVA"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->BarcodePreset_AAMVA_get()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lcom/smartengines/code/BarcodePreset;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/smartengines/code/BarcodePreset;->AAMVA:Lcom/smartengines/code/BarcodePreset;

    .line 14
    new-instance v2, Lcom/smartengines/code/BarcodePreset;

    const-string v3, "URL"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->BarcodePreset_URL_get()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/smartengines/code/BarcodePreset;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/smartengines/code/BarcodePreset;->URL:Lcom/smartengines/code/BarcodePreset;

    .line 15
    new-instance v3, Lcom/smartengines/code/BarcodePreset;

    const-string v4, "VCARD"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->BarcodePreset_VCARD_get()I

    move-result v5

    invoke-direct {v3, v4, v5}, Lcom/smartengines/code/BarcodePreset;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/smartengines/code/BarcodePreset;->VCARD:Lcom/smartengines/code/BarcodePreset;

    .line 16
    new-instance v4, Lcom/smartengines/code/BarcodePreset;

    const-string v5, "EMAIL"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->BarcodePreset_EMAIL_get()I

    move-result v6

    invoke-direct {v4, v5, v6}, Lcom/smartengines/code/BarcodePreset;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/smartengines/code/BarcodePreset;->EMAIL:Lcom/smartengines/code/BarcodePreset;

    .line 17
    new-instance v5, Lcom/smartengines/code/BarcodePreset;

    const-string v6, "ICALENDAR"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->BarcodePreset_ICALENDAR_get()I

    move-result v7

    invoke-direct {v5, v6, v7}, Lcom/smartengines/code/BarcodePreset;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/smartengines/code/BarcodePreset;->ICALENDAR:Lcom/smartengines/code/BarcodePreset;

    .line 18
    new-instance v6, Lcom/smartengines/code/BarcodePreset;

    const-string v7, "PHONE"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->BarcodePreset_PHONE_get()I

    move-result v8

    invoke-direct {v6, v7, v8}, Lcom/smartengines/code/BarcodePreset;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lcom/smartengines/code/BarcodePreset;->PHONE:Lcom/smartengines/code/BarcodePreset;

    .line 19
    new-instance v7, Lcom/smartengines/code/BarcodePreset;

    const-string v8, "SMS"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->BarcodePreset_SMS_get()I

    move-result v9

    invoke-direct {v7, v8, v9}, Lcom/smartengines/code/BarcodePreset;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/smartengines/code/BarcodePreset;->SMS:Lcom/smartengines/code/BarcodePreset;

    .line 20
    new-instance v8, Lcom/smartengines/code/BarcodePreset;

    const-string v9, "ISBN"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->BarcodePreset_ISBN_get()I

    move-result v10

    invoke-direct {v8, v9, v10}, Lcom/smartengines/code/BarcodePreset;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lcom/smartengines/code/BarcodePreset;->ISBN:Lcom/smartengines/code/BarcodePreset;

    .line 21
    new-instance v9, Lcom/smartengines/code/BarcodePreset;

    const-string v10, "WIFI"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->BarcodePreset_WIFI_get()I

    move-result v11

    invoke-direct {v9, v10, v11}, Lcom/smartengines/code/BarcodePreset;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/smartengines/code/BarcodePreset;->WIFI:Lcom/smartengines/code/BarcodePreset;

    .line 22
    new-instance v10, Lcom/smartengines/code/BarcodePreset;

    const-string v11, "GEO"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->BarcodePreset_GEO_get()I

    move-result v12

    invoke-direct {v10, v11, v12}, Lcom/smartengines/code/BarcodePreset;-><init>(Ljava/lang/String;I)V

    sput-object v10, Lcom/smartengines/code/BarcodePreset;->GEO:Lcom/smartengines/code/BarcodePreset;

    .line 23
    new-instance v11, Lcom/smartengines/code/BarcodePreset;

    const-string v12, "PAYMENT"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->BarcodePreset_PAYMENT_get()I

    move-result v13

    invoke-direct {v11, v12, v13}, Lcom/smartengines/code/BarcodePreset;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lcom/smartengines/code/BarcodePreset;->PAYMENT:Lcom/smartengines/code/BarcodePreset;

    .line 24
    new-instance v12, Lcom/smartengines/code/BarcodePreset;

    const-string v13, "NONE"

    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->BarcodePreset_NONE_get()I

    move-result v14

    invoke-direct {v12, v13, v14}, Lcom/smartengines/code/BarcodePreset;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lcom/smartengines/code/BarcodePreset;->NONE:Lcom/smartengines/code/BarcodePreset;

    .line 60
    filled-new-array/range {v0 .. v12}, [Lcom/smartengines/code/BarcodePreset;

    move-result-object v0

    sput-object v0, Lcom/smartengines/code/BarcodePreset;->swigValues:[Lcom/smartengines/code/BarcodePreset;

    const/4 v0, 0x0

    .line 61
    sput v0, Lcom/smartengines/code/BarcodePreset;->swigNext:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/smartengines/code/BarcodePreset;->swigName:Ljava/lang/String;

    .line 45
    sget p1, Lcom/smartengines/code/BarcodePreset;->swigNext:I

    add-int/lit8 v0, p1, 0x1

    sput v0, Lcom/smartengines/code/BarcodePreset;->swigNext:I

    iput p1, p0, Lcom/smartengines/code/BarcodePreset;->swigValue:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/smartengines/code/BarcodePreset;->swigName:Ljava/lang/String;

    .line 50
    iput p2, p0, Lcom/smartengines/code/BarcodePreset;->swigValue:I

    add-int/lit8 p2, p2, 0x1

    .line 51
    sput p2, Lcom/smartengines/code/BarcodePreset;->swigNext:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/smartengines/code/BarcodePreset;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/smartengines/code/BarcodePreset;->swigName:Ljava/lang/String;

    .line 56
    iget p1, p2, Lcom/smartengines/code/BarcodePreset;->swigValue:I

    iput p1, p0, Lcom/smartengines/code/BarcodePreset;->swigValue:I

    add-int/lit8 p1, p1, 0x1

    .line 57
    sput p1, Lcom/smartengines/code/BarcodePreset;->swigNext:I

    return-void
.end method

.method public static swigToEnum(I)Lcom/smartengines/code/BarcodePreset;
    .locals 3

    .line 35
    sget-object v0, Lcom/smartengines/code/BarcodePreset;->swigValues:[Lcom/smartengines/code/BarcodePreset;

    array-length v1, v0

    if-ge p0, v1, :cond_0

    if-ltz p0, :cond_0

    aget-object v0, v0, p0

    iget v1, v0, Lcom/smartengines/code/BarcodePreset;->swigValue:I

    if-ne v1, p0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 37
    :goto_0
    sget-object v1, Lcom/smartengines/code/BarcodePreset;->swigValues:[Lcom/smartengines/code/BarcodePreset;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 38
    aget-object v1, v1, v0

    iget v2, v1, Lcom/smartengines/code/BarcodePreset;->swigValue:I

    if-ne v2, p0, :cond_1

    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 40
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No enum "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Lcom/smartengines/code/BarcodePreset;

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

    .line 27
    iget v0, p0, Lcom/smartengines/code/BarcodePreset;->swigValue:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/smartengines/code/BarcodePreset;->swigName:Ljava/lang/String;

    return-object v0
.end method
