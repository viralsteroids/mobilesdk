.class public final Lcom/smartengines/id/IdFieldType;
.super Ljava/lang/Object;
.source "IdFieldType.java"


# static fields
.field public static final IdFieldType_Animated:Lcom/smartengines/id/IdFieldType;

.field public static final IdFieldType_Check:Lcom/smartengines/id/IdFieldType;

.field public static final IdFieldType_Image:Lcom/smartengines/id/IdFieldType;

.field public static final IdFieldType_Text:Lcom/smartengines/id/IdFieldType;

.field private static swigNext:I

.field private static swigValues:[Lcom/smartengines/id/IdFieldType;


# instance fields
.field private final swigName:Ljava/lang/String;

.field private final swigValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 12
    new-instance v0, Lcom/smartengines/id/IdFieldType;

    const-string v1, "IdFieldType_Text"

    invoke-direct {v0, v1}, Lcom/smartengines/id/IdFieldType;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/smartengines/id/IdFieldType;->IdFieldType_Text:Lcom/smartengines/id/IdFieldType;

    .line 13
    new-instance v1, Lcom/smartengines/id/IdFieldType;

    const-string v2, "IdFieldType_Image"

    invoke-direct {v1, v2}, Lcom/smartengines/id/IdFieldType;-><init>(Ljava/lang/String;)V

    sput-object v1, Lcom/smartengines/id/IdFieldType;->IdFieldType_Image:Lcom/smartengines/id/IdFieldType;

    .line 14
    new-instance v2, Lcom/smartengines/id/IdFieldType;

    const-string v3, "IdFieldType_Animated"

    invoke-direct {v2, v3}, Lcom/smartengines/id/IdFieldType;-><init>(Ljava/lang/String;)V

    sput-object v2, Lcom/smartengines/id/IdFieldType;->IdFieldType_Animated:Lcom/smartengines/id/IdFieldType;

    .line 15
    new-instance v3, Lcom/smartengines/id/IdFieldType;

    const-string v4, "IdFieldType_Check"

    invoke-direct {v3, v4}, Lcom/smartengines/id/IdFieldType;-><init>(Ljava/lang/String;)V

    sput-object v3, Lcom/smartengines/id/IdFieldType;->IdFieldType_Check:Lcom/smartengines/id/IdFieldType;

    .line 51
    filled-new-array {v0, v1, v2, v3}, [Lcom/smartengines/id/IdFieldType;

    move-result-object v0

    sput-object v0, Lcom/smartengines/id/IdFieldType;->swigValues:[Lcom/smartengines/id/IdFieldType;

    const/4 v0, 0x0

    .line 52
    sput v0, Lcom/smartengines/id/IdFieldType;->swigNext:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/smartengines/id/IdFieldType;->swigName:Ljava/lang/String;

    .line 36
    sget p1, Lcom/smartengines/id/IdFieldType;->swigNext:I

    add-int/lit8 v0, p1, 0x1

    sput v0, Lcom/smartengines/id/IdFieldType;->swigNext:I

    iput p1, p0, Lcom/smartengines/id/IdFieldType;->swigValue:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/smartengines/id/IdFieldType;->swigName:Ljava/lang/String;

    .line 41
    iput p2, p0, Lcom/smartengines/id/IdFieldType;->swigValue:I

    add-int/lit8 p2, p2, 0x1

    .line 42
    sput p2, Lcom/smartengines/id/IdFieldType;->swigNext:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/smartengines/id/IdFieldType;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/smartengines/id/IdFieldType;->swigName:Ljava/lang/String;

    .line 47
    iget p1, p2, Lcom/smartengines/id/IdFieldType;->swigValue:I

    iput p1, p0, Lcom/smartengines/id/IdFieldType;->swigValue:I

    add-int/lit8 p1, p1, 0x1

    .line 48
    sput p1, Lcom/smartengines/id/IdFieldType;->swigNext:I

    return-void
.end method

.method public static swigToEnum(I)Lcom/smartengines/id/IdFieldType;
    .locals 3

    .line 26
    sget-object v0, Lcom/smartengines/id/IdFieldType;->swigValues:[Lcom/smartengines/id/IdFieldType;

    array-length v1, v0

    if-ge p0, v1, :cond_0

    if-ltz p0, :cond_0

    aget-object v0, v0, p0

    iget v1, v0, Lcom/smartengines/id/IdFieldType;->swigValue:I

    if-ne v1, p0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    sget-object v1, Lcom/smartengines/id/IdFieldType;->swigValues:[Lcom/smartengines/id/IdFieldType;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 29
    aget-object v1, v1, v0

    iget v2, v1, Lcom/smartengines/id/IdFieldType;->swigValue:I

    if-ne v2, p0, :cond_1

    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 31
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No enum "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Lcom/smartengines/id/IdFieldType;

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

    .line 18
    iget v0, p0, Lcom/smartengines/id/IdFieldType;->swigValue:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/smartengines/id/IdFieldType;->swigName:Ljava/lang/String;

    return-object v0
.end method
