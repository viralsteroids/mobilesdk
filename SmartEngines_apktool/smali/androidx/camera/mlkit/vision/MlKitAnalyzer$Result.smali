.class public final Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;
.super Ljava/lang/Object;
.source "MlKitAnalyzer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/mlkit/vision/MlKitAnalyzer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Result"
.end annotation


# instance fields
.field private final mThrowables:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/mlkit/vision/interfaces/Detector<",
            "*>;",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field private final mTimestamp:J

.field private final mValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/mlkit/vision/interfaces/Detector<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;JLjava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/google/mlkit/vision/interfaces/Detector<",
            "*>;",
            "Ljava/lang/Object;",
            ">;J",
            "Ljava/util/Map<",
            "Lcom/google/mlkit/vision/interfaces/Detector<",
            "*>;",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .line 328
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 329
    iput-object p1, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;->mValues:Ljava/util/Map;

    .line 330
    iput-object p4, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;->mThrowables:Ljava/util/Map;

    .line 331
    iput-wide p2, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;->mTimestamp:J

    return-void
.end method

.method private checkDetectorExists(Lcom/google/mlkit/vision/interfaces/Detector;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/mlkit/vision/interfaces/Detector<",
            "*>;)V"
        }
    .end annotation

    .line 379
    iget-object v0, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;->mValues:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;->mThrowables:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    const-string v0, "The detector does not exist"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getThrowable(Lcom/google/mlkit/vision/interfaces/Detector;)Ljava/lang/Throwable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/mlkit/vision/interfaces/Detector<",
            "*>;)",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    .line 364
    invoke-direct {p0, p1}, Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;->checkDetectorExists(Lcom/google/mlkit/vision/interfaces/Detector;)V

    .line 365
    iget-object v0, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;->mThrowables:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    return-object p1
.end method

.method public getTimestamp()J
    .locals 2

    .line 375
    iget-wide v0, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;->mTimestamp:J

    return-wide v0
.end method

.method public getValue(Lcom/google/mlkit/vision/interfaces/Detector;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/mlkit/vision/interfaces/Detector<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 350
    invoke-direct {p0, p1}, Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;->checkDetectorExists(Lcom/google/mlkit/vision/interfaces/Detector;)V

    .line 351
    iget-object v0, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;->mValues:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
