.class public final Lcom/smartengines/id/IdFaceStatus;
.super Ljava/lang/Object;
.source "IdFaceStatus.java"


# static fields
.field public static final IdFaceStatus_A_FaceNotFound:Lcom/smartengines/id/IdFaceStatus;

.field public static final IdFaceStatus_B_FaceNotFound:Lcom/smartengines/id/IdFaceStatus;

.field public static final IdFaceStatus_FaceNotFound:Lcom/smartengines/id/IdFaceStatus;

.field public static final IdFaceStatus_NoAccumulatedResult:Lcom/smartengines/id/IdFaceStatus;

.field public static final IdFaceStatus_NotUsed:Lcom/smartengines/id/IdFaceStatus;

.field public static final IdFaceStatus_Success:Lcom/smartengines/id/IdFaceStatus;

.field private static swigNext:I

.field private static swigValues:[Lcom/smartengines/id/IdFaceStatus;


# instance fields
.field private final swigName:Ljava/lang/String;

.field private final swigValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 12
    new-instance v0, Lcom/smartengines/id/IdFaceStatus;

    const-string v1, "IdFaceStatus_NotUsed"

    invoke-direct {v0, v1}, Lcom/smartengines/id/IdFaceStatus;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/smartengines/id/IdFaceStatus;->IdFaceStatus_NotUsed:Lcom/smartengines/id/IdFaceStatus;

    .line 13
    new-instance v1, Lcom/smartengines/id/IdFaceStatus;

    const-string v2, "IdFaceStatus_Success"

    invoke-direct {v1, v2}, Lcom/smartengines/id/IdFaceStatus;-><init>(Ljava/lang/String;)V

    sput-object v1, Lcom/smartengines/id/IdFaceStatus;->IdFaceStatus_Success:Lcom/smartengines/id/IdFaceStatus;

    .line 14
    new-instance v2, Lcom/smartengines/id/IdFaceStatus;

    const-string v3, "IdFaceStatus_A_FaceNotFound"

    invoke-direct {v2, v3}, Lcom/smartengines/id/IdFaceStatus;-><init>(Ljava/lang/String;)V

    sput-object v2, Lcom/smartengines/id/IdFaceStatus;->IdFaceStatus_A_FaceNotFound:Lcom/smartengines/id/IdFaceStatus;

    .line 15
    new-instance v3, Lcom/smartengines/id/IdFaceStatus;

    const-string v4, "IdFaceStatus_B_FaceNotFound"

    invoke-direct {v3, v4}, Lcom/smartengines/id/IdFaceStatus;-><init>(Ljava/lang/String;)V

    sput-object v3, Lcom/smartengines/id/IdFaceStatus;->IdFaceStatus_B_FaceNotFound:Lcom/smartengines/id/IdFaceStatus;

    .line 16
    new-instance v4, Lcom/smartengines/id/IdFaceStatus;

    const-string v5, "IdFaceStatus_FaceNotFound"

    invoke-direct {v4, v5}, Lcom/smartengines/id/IdFaceStatus;-><init>(Ljava/lang/String;)V

    sput-object v4, Lcom/smartengines/id/IdFaceStatus;->IdFaceStatus_FaceNotFound:Lcom/smartengines/id/IdFaceStatus;

    .line 17
    new-instance v5, Lcom/smartengines/id/IdFaceStatus;

    const-string v6, "IdFaceStatus_NoAccumulatedResult"

    invoke-direct {v5, v6}, Lcom/smartengines/id/IdFaceStatus;-><init>(Ljava/lang/String;)V

    sput-object v5, Lcom/smartengines/id/IdFaceStatus;->IdFaceStatus_NoAccumulatedResult:Lcom/smartengines/id/IdFaceStatus;

    .line 53
    filled-new-array/range {v0 .. v5}, [Lcom/smartengines/id/IdFaceStatus;

    move-result-object v0

    sput-object v0, Lcom/smartengines/id/IdFaceStatus;->swigValues:[Lcom/smartengines/id/IdFaceStatus;

    const/4 v0, 0x0

    .line 54
    sput v0, Lcom/smartengines/id/IdFaceStatus;->swigNext:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/smartengines/id/IdFaceStatus;->swigName:Ljava/lang/String;

    .line 38
    sget p1, Lcom/smartengines/id/IdFaceStatus;->swigNext:I

    add-int/lit8 v0, p1, 0x1

    sput v0, Lcom/smartengines/id/IdFaceStatus;->swigNext:I

    iput p1, p0, Lcom/smartengines/id/IdFaceStatus;->swigValue:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/smartengines/id/IdFaceStatus;->swigName:Ljava/lang/String;

    .line 43
    iput p2, p0, Lcom/smartengines/id/IdFaceStatus;->swigValue:I

    add-int/lit8 p2, p2, 0x1

    .line 44
    sput p2, Lcom/smartengines/id/IdFaceStatus;->swigNext:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/smartengines/id/IdFaceStatus;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/smartengines/id/IdFaceStatus;->swigName:Ljava/lang/String;

    .line 49
    iget p1, p2, Lcom/smartengines/id/IdFaceStatus;->swigValue:I

    iput p1, p0, Lcom/smartengines/id/IdFaceStatus;->swigValue:I

    add-int/lit8 p1, p1, 0x1

    .line 50
    sput p1, Lcom/smartengines/id/IdFaceStatus;->swigNext:I

    return-void
.end method

.method public static swigToEnum(I)Lcom/smartengines/id/IdFaceStatus;
    .locals 3

    .line 28
    sget-object v0, Lcom/smartengines/id/IdFaceStatus;->swigValues:[Lcom/smartengines/id/IdFaceStatus;

    array-length v1, v0

    if-ge p0, v1, :cond_0

    if-ltz p0, :cond_0

    aget-object v0, v0, p0

    iget v1, v0, Lcom/smartengines/id/IdFaceStatus;->swigValue:I

    if-ne v1, p0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    sget-object v1, Lcom/smartengines/id/IdFaceStatus;->swigValues:[Lcom/smartengines/id/IdFaceStatus;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 31
    aget-object v1, v1, v0

    iget v2, v1, Lcom/smartengines/id/IdFaceStatus;->swigValue:I

    if-ne v2, p0, :cond_1

    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 33
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No enum "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Lcom/smartengines/id/IdFaceStatus;

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

    .line 20
    iget v0, p0, Lcom/smartengines/id/IdFaceStatus;->swigValue:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/smartengines/id/IdFaceStatus;->swigName:Ljava/lang/String;

    return-object v0
.end method
