.class public final Lcom/smartengines/id/IdFaceSimilarity;
.super Ljava/lang/Object;
.source "IdFaceSimilarity.java"


# static fields
.field public static final Different:Lcom/smartengines/id/IdFaceSimilarity;

.field public static final Same:Lcom/smartengines/id/IdFaceSimilarity;

.field public static final Uncertain:Lcom/smartengines/id/IdFaceSimilarity;

.field private static swigNext:I

.field private static swigValues:[Lcom/smartengines/id/IdFaceSimilarity;


# instance fields
.field private final swigName:Ljava/lang/String;

.field private final swigValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 12
    new-instance v0, Lcom/smartengines/id/IdFaceSimilarity;

    const-string v1, "Different"

    invoke-direct {v0, v1}, Lcom/smartengines/id/IdFaceSimilarity;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/smartengines/id/IdFaceSimilarity;->Different:Lcom/smartengines/id/IdFaceSimilarity;

    .line 13
    new-instance v1, Lcom/smartengines/id/IdFaceSimilarity;

    const-string v2, "Uncertain"

    invoke-direct {v1, v2}, Lcom/smartengines/id/IdFaceSimilarity;-><init>(Ljava/lang/String;)V

    sput-object v1, Lcom/smartengines/id/IdFaceSimilarity;->Uncertain:Lcom/smartengines/id/IdFaceSimilarity;

    .line 14
    new-instance v2, Lcom/smartengines/id/IdFaceSimilarity;

    const-string v3, "Same"

    invoke-direct {v2, v3}, Lcom/smartengines/id/IdFaceSimilarity;-><init>(Ljava/lang/String;)V

    sput-object v2, Lcom/smartengines/id/IdFaceSimilarity;->Same:Lcom/smartengines/id/IdFaceSimilarity;

    .line 50
    filled-new-array {v0, v1, v2}, [Lcom/smartengines/id/IdFaceSimilarity;

    move-result-object v0

    sput-object v0, Lcom/smartengines/id/IdFaceSimilarity;->swigValues:[Lcom/smartengines/id/IdFaceSimilarity;

    const/4 v0, 0x0

    .line 51
    sput v0, Lcom/smartengines/id/IdFaceSimilarity;->swigNext:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/smartengines/id/IdFaceSimilarity;->swigName:Ljava/lang/String;

    .line 35
    sget p1, Lcom/smartengines/id/IdFaceSimilarity;->swigNext:I

    add-int/lit8 v0, p1, 0x1

    sput v0, Lcom/smartengines/id/IdFaceSimilarity;->swigNext:I

    iput p1, p0, Lcom/smartengines/id/IdFaceSimilarity;->swigValue:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/smartengines/id/IdFaceSimilarity;->swigName:Ljava/lang/String;

    .line 40
    iput p2, p0, Lcom/smartengines/id/IdFaceSimilarity;->swigValue:I

    add-int/lit8 p2, p2, 0x1

    .line 41
    sput p2, Lcom/smartengines/id/IdFaceSimilarity;->swigNext:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/smartengines/id/IdFaceSimilarity;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/smartengines/id/IdFaceSimilarity;->swigName:Ljava/lang/String;

    .line 46
    iget p1, p2, Lcom/smartengines/id/IdFaceSimilarity;->swigValue:I

    iput p1, p0, Lcom/smartengines/id/IdFaceSimilarity;->swigValue:I

    add-int/lit8 p1, p1, 0x1

    .line 47
    sput p1, Lcom/smartengines/id/IdFaceSimilarity;->swigNext:I

    return-void
.end method

.method public static swigToEnum(I)Lcom/smartengines/id/IdFaceSimilarity;
    .locals 3

    .line 25
    sget-object v0, Lcom/smartengines/id/IdFaceSimilarity;->swigValues:[Lcom/smartengines/id/IdFaceSimilarity;

    array-length v1, v0

    if-ge p0, v1, :cond_0

    if-ltz p0, :cond_0

    aget-object v0, v0, p0

    iget v1, v0, Lcom/smartengines/id/IdFaceSimilarity;->swigValue:I

    if-ne v1, p0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    sget-object v1, Lcom/smartengines/id/IdFaceSimilarity;->swigValues:[Lcom/smartengines/id/IdFaceSimilarity;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 28
    aget-object v1, v1, v0

    iget v2, v1, Lcom/smartengines/id/IdFaceSimilarity;->swigValue:I

    if-ne v2, p0, :cond_1

    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 30
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No enum "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Lcom/smartengines/id/IdFaceSimilarity;

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

    .line 17
    iget v0, p0, Lcom/smartengines/id/IdFaceSimilarity;->swigValue:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/smartengines/id/IdFaceSimilarity;->swigName:Ljava/lang/String;

    return-object v0
.end method
