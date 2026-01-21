.class public final synthetic Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Landroidx/camera/mlkit/vision/MlKitAnalyzer;

.field public final synthetic f$1:Ljava/util/Map;

.field public final synthetic f$2:Landroidx/camera/core/ImageProxy;

.field public final synthetic f$3:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/mlkit/vision/MlKitAnalyzer;Ljava/util/Map;Landroidx/camera/core/ImageProxy;Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda0;->f$0:Landroidx/camera/mlkit/vision/MlKitAnalyzer;

    iput-object p2, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda0;->f$1:Ljava/util/Map;

    iput-object p3, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda0;->f$2:Landroidx/camera/core/ImageProxy;

    iput-object p4, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda0;->f$3:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 0
    iget-object v0, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda0;->f$0:Landroidx/camera/mlkit/vision/MlKitAnalyzer;

    iget-object v1, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda0;->f$1:Ljava/util/Map;

    iget-object v2, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda0;->f$2:Landroidx/camera/core/ImageProxy;

    iget-object v3, p0, Landroidx/camera/mlkit/vision/MlKitAnalyzer$$ExternalSyntheticLambda0;->f$3:Ljava/util/Map;

    invoke-virtual {v0, v1, v2, v3}, Landroidx/camera/mlkit/vision/MlKitAnalyzer;->lambda$detectRecursively$0$androidx-camera-mlkit-vision-MlKitAnalyzer(Ljava/util/Map;Landroidx/camera/core/ImageProxy;Ljava/util/Map;)V

    return-void
.end method
