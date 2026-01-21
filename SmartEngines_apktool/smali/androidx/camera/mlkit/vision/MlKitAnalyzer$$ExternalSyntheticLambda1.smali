.class public final synthetic Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic f$0:Landroidx/camera/mlkit/vision/MlKitAnalyzer;

.field public final synthetic f$1:Ljava/util/Map;

.field public final synthetic f$2:Lcom/google/mlkit/vision/interfaces/Detector;

.field public final synthetic f$3:Ljava/util/Map;

.field public final synthetic f$4:Landroidx/camera/core/ImageProxy;

.field public final synthetic f$5:I

.field public final synthetic f$6:Landroid/graphics/Matrix;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/mlkit/vision/MlKitAnalyzer;Ljava/util/Map;Lcom/google/mlkit/vision/interfaces/Detector;Ljava/util/Map;Landroidx/camera/core/ImageProxy;ILandroid/graphics/Matrix;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;->f$0:Landroidx/camera/mlkit/vision/MlKitAnalyzer;

    iput-object p2, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;->f$1:Ljava/util/Map;

    iput-object p3, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;->f$2:Lcom/google/mlkit/vision/interfaces/Detector;

    iput-object p4, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;->f$3:Ljava/util/Map;

    iput-object p5, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;->f$4:Landroidx/camera/core/ImageProxy;

    iput p6, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;->f$5:I

    iput-object p7, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;->f$6:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 8

    .line 0
    iget-object v0, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;->f$0:Landroidx/camera/mlkit/vision/MlKitAnalyzer;

    iget-object v1, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;->f$1:Ljava/util/Map;

    iget-object v2, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;->f$2:Lcom/google/mlkit/vision/interfaces/Detector;

    iget-object v3, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;->f$3:Ljava/util/Map;

    iget-object v4, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;->f$4:Landroidx/camera/core/ImageProxy;

    iget v5, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;->f$5:I

    iget-object v6, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda1;->f$6:Landroid/graphics/Matrix;

    move-object v7, p1

    invoke-virtual/range {v0 .. v7}, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->lambda$detectRecursively$1$androidx-camera-mlkit-vision-MlKitAnalyzer(Ljava/util/Map;Lcom/google/mlkit/vision/interfaces/Detector;Ljava/util/Map;Landroidx/camera/core/ImageProxy;ILandroid/graphics/Matrix;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
