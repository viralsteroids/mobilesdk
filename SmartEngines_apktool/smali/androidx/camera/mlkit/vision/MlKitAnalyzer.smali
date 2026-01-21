.class public Landroidx/camera/mlkit/vision/MlKitAnalyzer;
.super Ljava/lang/Object;
.source "MlKitAnalyzer.java"

# interfaces
.implements Landroidx/camera/core/ImageAnalysis$Analyzer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;
    }
.end annotation


# static fields
.field private static final DEFAULT_SIZE:Landroid/util/Size;

.field private static final TAG:Ljava/lang/String; = "MlKitAnalyzer"


# instance fields
.field final mConsumer:Landroidx/core/util/Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/Consumer<",
            "Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;",
            ">;"
        }
    .end annotation
.end field

.field private final mDetectors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/mlkit/vision/interfaces/Detector<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final mExecutor:Ljava/util/concurrent/Executor;

.field final mImageAnalysisTransformFactory:Landroidx/camera/view/transform/ImageProxyTransformFactory;

.field private mSensorToTarget:Landroid/graphics/Matrix;

.field private final mTargetCoordinateSystem:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 93
    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x1e0

    const/16 v2, 0x168

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->DEFAULT_SIZE:Landroid/util/Size;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILjava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/mlkit/vision/interfaces/Detector<",
            "*>;>;I",
            "Ljava/util/concurrent/Executor;",
            "Landroidx/core/util/Consumer<",
            "Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;",
            ">;)V"
        }
    .end annotation

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    .line 137
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/mlkit/vision/interfaces/Detector;

    .line 138
    invoke-interface {v2}, Lcom/google/mlkit/vision/interfaces/Detector;->getDetectorType()I

    move-result v2

    const/4 v3, 0x7

    if-eq v2, v3, :cond_0

    move v2, v0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    const-string v3, "Segmentation only works with COORDINATE_SYSTEM_ORIGINAL"

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    goto :goto_0

    .line 143
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mDetectors:Ljava/util/List;

    .line 144
    iput p2, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mTargetCoordinateSystem:I

    .line 145
    iput-object p4, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mConsumer:Landroidx/core/util/Consumer;

    .line 146
    iput-object p3, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mExecutor:Ljava/util/concurrent/Executor;

    .line 147
    new-instance p1, Landroidx/camera/view/transform/ImageProxyTransformFactory;

    invoke-direct {p1}, Landroidx/camera/view/transform/ImageProxyTransformFactory;-><init>()V

    iput-object p1, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mImageAnalysisTransformFactory:Landroidx/camera/view/transform/ImageProxyTransformFactory;

    .line 148
    invoke-virtual {p1, v0}, Landroidx/camera/view/transform/ImageProxyTransformFactory;->setUsingRotationDegrees(Z)V

    return-void
.end method

.method private detectRecursively(Landroidx/camera/core/ImageProxy;ILandroid/graphics/Matrix;Ljava/util/Map;Ljava/util/Map;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/ImageProxy;",
            "I",
            "Landroid/graphics/Matrix;",
            "Ljava/util/Map<",
            "Lcom/google/mlkit/vision/interfaces/Detector<",
            "*>;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/google/mlkit/vision/interfaces/Detector<",
            "*>;",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    move-object v2, p5

    .line 213
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getImage()Landroid/media/Image;

    move-result-object v0

    if-nez v0, :cond_0

    .line 216
    const-string v0, "MlKitAnalyzer"

    const-string v2, "Image is null."

    invoke-static {v0, v2}, Landroidx/camera/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    return-void

    .line 221
    :cond_0
    iget-object v3, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mDetectors:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-le p2, v3, :cond_1

    .line 223
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 224
    iget-object v0, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mExecutor:Ljava/util/concurrent/Executor;

    new-instance v3, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda0;

    invoke-direct {v3, p0, p4, p1, p5}, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda0;-><init>(Landroidx/camera/mlkit/vision/MlKitAnalyzer;Ljava/util/Map;Landroidx/camera/core/ImageProxy;Ljava/util/Map;)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 228
    :cond_1
    iget-object v3, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mDetectors:Ljava/util/List;

    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/mlkit/vision/interfaces/Detector;

    .line 229
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getImageInfo()Landroidx/camera/core/ImageInfo;

    move-result-object v7

    invoke-interface {v7}, Landroidx/camera/core/ImageInfo;->getRotationDegrees()I

    move-result v7

    .line 233
    :try_start_0
    invoke-interface {v3, v0, v7, p3}, Lcom/google/mlkit/vision/interfaces/Detector;->process(Landroid/media/Image;ILandroid/graphics/Matrix;)Lcom/google/android/gms/tasks/Task;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 245
    iget-object v9, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mExecutor:Ljava/util/concurrent/Executor;

    new-instance v0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;

    move-object v1, p0

    move-object v5, p1

    move v6, p2

    move-object v7, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v7}, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;-><init>(Landroidx/camera/mlkit/vision/MlKitAnalyzer;Ljava/util/Map;Lcom/google/mlkit/vision/interfaces/Detector;Ljava/util/Map;Landroidx/camera/core/ImageProxy;ILandroid/graphics/Matrix;)V

    invoke-virtual {v8, v9, v0}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void

    :catch_0
    move-exception v0

    .line 238
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v4, "Failed to process the image."

    invoke-direct {v1, v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p5, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, p2, 0x1

    move-object v1, p0

    move-object v4, p3

    move-object v5, p4

    move-object v6, v2

    move-object v2, p1

    .line 241
    invoke-direct/range {v1 .. v6}, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->detectRecursively(Landroidx/camera/core/ImageProxy;ILandroid/graphics/Matrix;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private getTargetResolution(I)Landroid/util/Size;
    .locals 2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    .line 292
    sget-object p1, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->DEFAULT_SIZE:Landroid/util/Size;

    return-object p1

    .line 290
    :cond_0
    new-instance p1, Landroid/util/Size;

    const/16 v0, 0x500

    const/16 v1, 0x2d0

    invoke-direct {p1, v0, v1}, Landroid/util/Size;-><init>(II)V

    return-object p1
.end method


# virtual methods
.method public final analyze(Landroidx/camera/core/ImageProxy;)V
    .locals 8

    .line 166
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 167
    iget v0, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mTargetCoordinateSystem:I

    if-eqz v0, :cond_1

    .line 169
    iget-object v1, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mSensorToTarget:Landroid/graphics/Matrix;

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    if-nez v1, :cond_0

    .line 173
    const-string v0, "MlKitAnalyzer"

    const-string v1, "Sensor-to-target transformation is null."

    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    return-void

    .line 177
    :cond_0
    new-instance v0, Landroid/graphics/Matrix;

    .line 178
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getImageInfo()Landroidx/camera/core/ImageInfo;

    move-result-object v4

    invoke-interface {v4}, Landroidx/camera/core/ImageInfo;->getSensorToBufferTransformMatrix()Landroid/graphics/Matrix;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 180
    new-instance v4, Landroid/graphics/RectF;

    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    move-result v5

    int-to-float v5, v5

    .line 181
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    move-result v6

    int-to-float v6, v6

    const/4 v7, 0x0

    invoke-direct {v4, v7, v7, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 183
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getImageInfo()Landroidx/camera/core/ImageInfo;

    move-result-object v5

    invoke-interface {v5}, Landroidx/camera/core/ImageInfo;->getRotationDegrees()I

    move-result v5

    .line 182
    invoke-static {v4, v5}, Landroidx/camera/core/impl/utils/TransformUtils;->rotateRect(Landroid/graphics/RectF;I)Landroid/graphics/RectF;

    move-result-object v5

    .line 185
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getImageInfo()Landroidx/camera/core/ImageInfo;

    move-result-object v6

    invoke-interface {v6}, Landroidx/camera/core/ImageInfo;->getRotationDegrees()I

    move-result v6

    .line 184
    invoke-static {v4, v5, v6}, Landroidx/camera/core/impl/utils/TransformUtils;->getRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;I)Landroid/graphics/Matrix;

    move-result-object v4

    .line 187
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 189
    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 190
    iget v0, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mTargetCoordinateSystem:I

    if-eq v0, v2, :cond_1

    .line 192
    invoke-virtual {v3, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 196
    :cond_1
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->detectRecursively(Landroidx/camera/core/ImageProxy;ILandroid/graphics/Matrix;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public final getDefaultTargetResolution()Landroid/util/Size;
    .locals 6

    .line 269
    sget-object v0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->DEFAULT_SIZE:Landroid/util/Size;

    .line 270
    iget-object v1, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mDetectors:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/mlkit/vision/interfaces/Detector;

    .line 271
    invoke-interface {v2}, Lcom/google/mlkit/vision/interfaces/Detector;->getDetectorType()I

    move-result v2

    invoke-direct {p0, v2}, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->getTargetResolution(I)Landroid/util/Size;

    move-result-object v2

    .line 272
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v4

    mul-int/2addr v3, v4

    .line 273
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v5

    mul-int/2addr v4, v5

    if-le v3, v4, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final getTargetCoordinateSystem()I
    .locals 1

    .line 301
    iget v0, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mTargetCoordinateSystem:I

    return v0
.end method

.method synthetic lambda$detectRecursively$0$androidx-camera-mlkit-vision-MlKitAnalyzer(Ljava/util/Map;Landroidx/camera/core/ImageProxy;Ljava/util/Map;)V
    .locals 4

    .line 224
    iget-object v0, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mConsumer:Landroidx/core/util/Consumer;

    new-instance v1, Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;

    .line 225
    invoke-interface {p2}, Landroidx/camera/core/ImageProxy;->getImageInfo()Landroidx/camera/core/ImageInfo;

    move-result-object p2

    invoke-interface {p2}, Landroidx/camera/core/ImageInfo;->getTimestamp()J

    move-result-wide v2

    invoke-direct {v1, p1, v2, v3, p3}, Landroidx/camera/mlkit/vision/MlKitAnalyzer$Result;-><init>(Ljava/util/Map;JLjava/util/Map;)V

    .line 224
    invoke-interface {v0, v1}, Landroidx/core/util/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method synthetic lambda$detectRecursively$1$androidx-camera-mlkit-vision-MlKitAnalyzer(Ljava/util/Map;Lcom/google/mlkit/vision/interfaces/Detector;Ljava/util/Map;Landroidx/camera/core/ImageProxy;ILandroid/graphics/Matrix;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    .line 249
    invoke-virtual {p7}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 250
    new-instance p7, Ljava/util/concurrent/CancellationException;

    const-string v0, "The task is canceled."

    invoke-direct {p7, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2, p7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 252
    :cond_0
    invoke-virtual {p7}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 253
    invoke-virtual {p7}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p7

    invoke-interface {p3, p2, p7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 255
    :cond_1
    invoke-virtual {p7}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p7

    invoke-interface {p1, p2, p7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    add-int/lit8 p5, p5, 0x1

    move p2, p5

    move-object p5, p3

    move p3, p2

    move-object p2, p4

    move-object p4, p6

    move-object p6, p1

    move-object p1, p0

    .line 258
    invoke-direct/range {p1 .. p6}, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->detectRecursively(Landroidx/camera/core/ImageProxy;ILandroid/graphics/Matrix;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public final updateTransform(Landroid/graphics/Matrix;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 310
    iput-object p1, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mSensorToTarget:Landroid/graphics/Matrix;

    return-void

    .line 312
    :cond_0
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0, p1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v0, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->mSensorToTarget:Landroid/graphics/Matrix;

    return-void
.end method
