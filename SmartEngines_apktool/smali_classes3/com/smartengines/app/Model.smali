.class public final Lcom/smartengines/app/Model;
.super Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;
.source "Model.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/app/Model$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Model.kt\ncom/smartengines/app/Model\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,679:1\n81#2:680\n107#2,2:681\n81#2:683\n107#2,2:684\n1#3:686\n1863#4,2:687\n1863#4,2:689\n1863#4,2:695\n216#5,2:691\n13346#6,2:693\n149#7:697\n149#7:698\n*S KotlinDebug\n*F\n+ 1 Model.kt\ncom/smartengines/app/Model\n*L\n117#1:680\n117#1:681,2\n119#1:683\n119#1:684,2\n364#1:687,2\n382#1:689,2\n667#1:695,2\n612#1:691,2\n654#1:693,2\n155#1:697\n156#1:698\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ee\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0003\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020KJ\u0008\u0010M\u001a\u00020KH\u0002J\u0008\u0010N\u001a\u00020KH\u0002J\u0006\u0010O\u001a\u00020KJ\u0006\u0010P\u001a\u00020KJ\u000e\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020gJ\u0008\u0010h\u001a\u0004\u0018\u00010gJ\u0008\u0010i\u001a\u0004\u0018\u00010gJ\u0010\u0010j\u001a\u00020K2\u0006\u0010k\u001a\u00020eH\u0002J\u000e\u0010l\u001a\u00020K2\u0006\u0010m\u001a\u00020\u001bJ\u0006\u0010n\u001a\u00020KJ\u0006\u0010o\u001a\u00020KJ\u0006\u0010p\u001a\u00020KJ\u0006\u0010q\u001a\u00020KJ\u000e\u0010r\u001a\u00020K2\u0006\u0010s\u001a\u00020tJ\u000e\u0010u\u001a\u00020K2\u0006\u0010s\u001a\u00020tJ\u0008\u0010v\u001a\u00020\"H\u0002J\u0006\u0010w\u001a\u00020KJ\u0006\u0010x\u001a\u00020KJ\u000e\u0010y\u001a\u00020K2\u0006\u0010z\u001a\u00020{J\u001a\u0010|\u001a\u00020K2\u0006\u0010}\u001a\u00020~2\u0008\u0010\u007f\u001a\u0004\u0018\u00010{H\u0002J\u0007\u0010\u0080\u0001\u001a\u00020KJ\u0007\u0010\u0081\u0001\u001a\u00020KJ\u0007\u0010\u0082\u0001\u001a\u00020KJ\u0013\u0010\u0083\u0001\u001a\u00020K2\u0008\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0016J\t\u0010\u0086\u0001\u001a\u00020KH\u0002J\t\u0010\u0087\u0001\u001a\u00020KH\u0002J\u0011\u0010\u0088\u0001\u001a\u00020K2\u0008\u0010\u0084\u0001\u001a\u00030\u0085\u0001J\u0012\u0010\u0089\u0001\u001a\u00020K2\t\u0010/\u001a\u0005\u0018\u00010\u008a\u0001J\u0013\u0010\u008b\u0001\u001a\u00020K2\u0008\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0002J\u000f\u0010\u008e\u0001\u001a\u00020K2\u0006\u0010s\u001a\u00020tJ*\u0010\u008f\u0001\u001a\u00020K2\u0008\u0010\u0090\u0001\u001a\u00030\u0091\u00012\u000e\u0010\u0092\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010\u001aH\u0082@\u00a2\u0006\u0003\u0010\u0094\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u00020\u0005X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000eR\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R \u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u0014\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\"0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0$\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0011\u0010\'\u001a\u00020(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010,8F\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.R\u0019\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000!\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\"\u00105\u001a\u0004\u0018\u0001042\u0008\u00103\u001a\u0004\u0018\u000104@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u0018\u00108\u001a\n :*\u0004\u0018\u00010909X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010;R+\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020=8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008C\u0010D\u001a\u0004\u0008?\u0010@\"\u0004\u0008A\u0010BR+\u0010E\u001a\u00020\"2\u0006\u0010<\u001a\u00020\"8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008I\u0010D\u001a\u0004\u0008E\u0010F\"\u0004\u0008G\u0010HR\u0011\u0010Q\u001a\u00020R\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008S\u0010TR\u0019\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010V0!\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008W\u00102R\u0011\u0010X\u001a\u00020Y\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Z\u0010[R\u0011\u0010\\\u001a\u00020]\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008^\u0010_R\u0011\u0010`\u001a\u00020a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008b\u0010c\u00a8\u0006\u0095\u0001"
    }
    d2 = {
        "Lcom/smartengines/app/Model;",
        "Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;",
        "<init>",
        "()V",
        "TAG",
        "",
        "signature",
        "getSignature",
        "()Ljava/lang/String;",
        "jniLibrary",
        "getJniLibrary",
        "bundleCode",
        "Lcom/smartengines/engine/EngineBundle$File;",
        "getBundleCode",
        "()Lcom/smartengines/engine/EngineBundle$File;",
        "bundleId",
        "getBundleId",
        "bundleDoc",
        "getBundleDoc",
        "bundleText",
        "getBundleText",
        "engines",
        "Lcom/smartengines/app/EngineList;",
        "getEngines",
        "()Lcom/smartengines/app/EngineList;",
        "homeScreenTargets",
        "",
        "Lcom/smartengines/app/targets/TreeItem;",
        "getHomeScreenTargets",
        "()Ljava/util/List;",
        "setHomeScreenTargets",
        "(Ljava/util/List;)V",
        "_loadedState",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "loadedState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getLoadedState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "imageProcessor",
        "Lcom/smartengines/engine/ImageProcessor;",
        "getImageProcessor",
        "()Lcom/smartengines/engine/ImageProcessor;",
        "session",
        "Lcom/smartengines/engine/Session;",
        "getSession",
        "()Lcom/smartengines/engine/Session;",
        "result",
        "Lcom/smartengines/engine/Result;",
        "getResult",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
        "value",
        "Landroidx/camera/view/LifecycleCameraController;",
        "cameraController",
        "getCameraController",
        "()Landroidx/camera/view/LifecycleCameraController;",
        "cameraExecutor",
        "Ljava/util/concurrent/ExecutorService;",
        "kotlin.jvm.PlatformType",
        "Ljava/util/concurrent/ExecutorService;",
        "<set-?>",
        "Lcom/smartengines/app/PhotoTakingState;",
        "photoTaking",
        "getPhotoTaking",
        "()Lcom/smartengines/app/PhotoTakingState;",
        "setPhotoTaking",
        "(Lcom/smartengines/app/PhotoTakingState;)V",
        "photoTaking$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "isFrontCamera",
        "()Z",
        "setFrontCamera",
        "(Z)V",
        "isFrontCamera$delegate",
        "switchCamera",
        "",
        "switchToFrontCamera",
        "switchToBackCamera",
        "applyIsFrontCamera",
        "switchTorchOn",
        "switchTorchState",
        "passportReader",
        "Lcom/smartengines/nfc/PassportReader;",
        "getPassportReader",
        "()Lcom/smartengines/nfc/PassportReader;",
        "error",
        "",
        "getError",
        "visualizationSettings",
        "Lcom/smartengines/app/settings/VisualizationSettings;",
        "getVisualizationSettings",
        "()Lcom/smartengines/app/settings/VisualizationSettings;",
        "buildFlavor",
        "Lcom/smartengines/app/settings/BuildFlavor;",
        "getBuildFlavor",
        "()Lcom/smartengines/app/settings/BuildFlavor;",
        "resourceFinder",
        "Lcom/smartengines/utils/ResourceFinder;",
        "getResourceFinder",
        "()Lcom/smartengines/utils/ResourceFinder;",
        "getEngineById",
        "Lcom/smartengines/app/EngineStaff;",
        "engineId",
        "Lcom/smartengines/engine/EngineId;",
        "getSelectedEngineId",
        "predictSelectedEngineId",
        "checkLoadedStatus",
        "engineStaff",
        "onNodeClick",
        "node",
        "onBack",
        "onResultDone",
        "onResultRepeat",
        "addNewPage",
        "load",
        "context",
        "Landroid/content/Context;",
        "onLoaded",
        "getModelLoadedState",
        "startVideoProcessing",
        "startCapturedPhotoProcessing",
        "onGalleryPhotoLoaded",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "startProcessing",
        "sessionType",
        "Lcom/smartengines/engine/SessionType;",
        "photo",
        "stopProcessing",
        "takePhoto",
        "clearTakenPhoto",
        "onCaptureSuccess",
        "imageProxy",
        "Landroidx/camera/core/ImageProxy;",
        "stopVideo",
        "startVideo",
        "onVideoFrame",
        "calculatePassportKey",
        "",
        "checkPassportNfcData",
        "passportData",
        "Lcom/smartengines/nfc/PassportData;",
        "check",
        "hiddenEngineInitialization",
        "engine",
        "Lcom/smartengines/engine/Engine;",
        "targets",
        "Lcom/smartengines/engine/RecognitionTarget;",
        "(Lcom/smartengines/engine/Engine;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "app_storeRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/smartengines/app/Model;

.field private static final TAG:Ljava/lang/String;

.field private static final _loadedState:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final buildFlavor:Lcom/smartengines/app/settings/BuildFlavor;

.field private static final bundleCode:Lcom/smartengines/engine/EngineBundle$File;

.field private static final bundleDoc:Lcom/smartengines/engine/EngineBundle$File;

.field private static final bundleId:Lcom/smartengines/engine/EngineBundle$File;

.field private static final bundleText:Lcom/smartengines/engine/EngineBundle$File;

.field private static cameraController:Landroidx/camera/view/LifecycleCameraController;

.field private static final cameraExecutor:Ljava/util/concurrent/ExecutorService;

.field private static final engines:Lcom/smartengines/app/EngineList;

.field private static final error:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field private static homeScreenTargets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;"
        }
    .end annotation
.end field

.field private static final imageProcessor:Lcom/smartengines/engine/ImageProcessor;

.field private static final isFrontCamera$delegate:Landroidx/compose/runtime/MutableState;

.field private static final jniLibrary:Ljava/lang/String;

.field private static final loadedState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final passportReader:Lcom/smartengines/nfc/PassportReader;

.field private static final photoTaking$delegate:Landroidx/compose/runtime/MutableState;

.field private static final resourceFinder:Lcom/smartengines/utils/ResourceFinder;

.field private static final result:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/smartengines/engine/Result;",
            ">;"
        }
    .end annotation
.end field

.field private static final signature:Ljava/lang/String;

.field private static final visualizationSettings:Lcom/smartengines/app/settings/VisualizationSettings;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lcom/smartengines/app/Model;

    invoke-direct {v0}, Lcom/smartengines/app/Model;-><init>()V

    sput-object v0, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    .line 75
    const-string v0, "myapp.Model"

    sput-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    .line 78
    const-string v0, "3d49205bc8237c174fe3f018b4634d5d9339a8d0c33da45235c1f5c08e9efa28678882178c7064123b3032e8a642e6100d5f25d06a82244b9534c4df072aa6769fdcf7d6fe36e9bcce26266581c79fd30635de268756759d3601d6e6d214312f66d5e00f363ff5ebdb395a1ff8c62141a7832132e63b145ecac64ad090df62ac"

    sput-object v0, Lcom/smartengines/app/Model;->signature:Ljava/lang/String;

    .line 82
    const-string v1, "jnimultiengine"

    sput-object v1, Lcom/smartengines/app/Model;->jniLibrary:Ljava/lang/String;

    .line 83
    new-instance v1, Lcom/smartengines/engine/EngineBundle$File;

    const-string v2, "bundle_codeengine_full.se"

    invoke-direct {v1, v2}, Lcom/smartengines/engine/EngineBundle$File;-><init>(Ljava/lang/String;)V

    sput-object v1, Lcom/smartengines/app/Model;->bundleCode:Lcom/smartengines/engine/EngineBundle$File;

    .line 84
    new-instance v1, Lcom/smartengines/engine/EngineBundle$File;

    const-string v2, "bundle_international_faces_liveness.se"

    invoke-direct {v1, v2}, Lcom/smartengines/engine/EngineBundle$File;-><init>(Ljava/lang/String;)V

    sput-object v1, Lcom/smartengines/app/Model;->bundleId:Lcom/smartengines/engine/EngineBundle$File;

    .line 85
    new-instance v1, Lcom/smartengines/engine/EngineBundle$File;

    const-string v2, "bundle_newdocengine_demo_hiring_dsn.se"

    invoke-direct {v1, v2}, Lcom/smartengines/engine/EngineBundle$File;-><init>(Ljava/lang/String;)V

    sput-object v1, Lcom/smartengines/app/Model;->bundleDoc:Lcom/smartengines/engine/EngineBundle$File;

    .line 86
    new-instance v1, Lcom/smartengines/engine/EngineBundle$File;

    const-string v2, "bundle_textengine.se"

    invoke-direct {v1, v2}, Lcom/smartengines/engine/EngineBundle$File;-><init>(Ljava/lang/String;)V

    sput-object v1, Lcom/smartengines/app/Model;->bundleText:Lcom/smartengines/engine/EngineBundle$File;

    .line 90
    new-instance v1, Lcom/smartengines/app/EngineList;

    .line 91
    new-instance v2, Lcom/smartengines/app/EngineStaff;

    new-instance v3, Lcom/smartengines/engine/EngineLoader;

    new-instance v4, Lcom/smartengines/engine/code/CodeEngineWrapper;

    invoke-direct {v4, v0}, Lcom/smartengines/engine/code/CodeEngineWrapper;-><init>(Ljava/lang/String;)V

    check-cast v4, Lcom/smartengines/engine/Engine;

    invoke-direct {v3, v4}, Lcom/smartengines/engine/EngineLoader;-><init>(Lcom/smartengines/engine/Engine;)V

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v2, v3, v4, v5, v4}, Lcom/smartengines/app/EngineStaff;-><init>(Lcom/smartengines/engine/EngineLoader;Lcom/smartengines/app/targets/TreeItem;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 92
    new-instance v3, Lcom/smartengines/app/EngineStaff;

    new-instance v6, Lcom/smartengines/engine/EngineLoader;

    new-instance v7, Lcom/smartengines/engine/doc/DocEngineWrapper;

    invoke-direct {v7, v0}, Lcom/smartengines/engine/doc/DocEngineWrapper;-><init>(Ljava/lang/String;)V

    check-cast v7, Lcom/smartengines/engine/Engine;

    invoke-direct {v6, v7}, Lcom/smartengines/engine/EngineLoader;-><init>(Lcom/smartengines/engine/Engine;)V

    invoke-direct {v3, v6, v4, v5, v4}, Lcom/smartengines/app/EngineStaff;-><init>(Lcom/smartengines/engine/EngineLoader;Lcom/smartengines/app/targets/TreeItem;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    new-instance v6, Lcom/smartengines/app/EngineStaff;

    new-instance v7, Lcom/smartengines/engine/EngineLoader;

    new-instance v8, Lcom/smartengines/engine/id/IdEngineWrapper;

    invoke-direct {v8, v0}, Lcom/smartengines/engine/id/IdEngineWrapper;-><init>(Ljava/lang/String;)V

    check-cast v8, Lcom/smartengines/engine/Engine;

    invoke-direct {v7, v8}, Lcom/smartengines/engine/EngineLoader;-><init>(Lcom/smartengines/engine/Engine;)V

    invoke-direct {v6, v7, v4, v5, v4}, Lcom/smartengines/app/EngineStaff;-><init>(Lcom/smartengines/engine/EngineLoader;Lcom/smartengines/app/targets/TreeItem;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 94
    new-instance v7, Lcom/smartengines/app/EngineStaff;

    new-instance v8, Lcom/smartengines/engine/EngineLoader;

    new-instance v9, Lcom/smartengines/engine/text/TextEngineWrapper;

    invoke-direct {v9, v0}, Lcom/smartengines/engine/text/TextEngineWrapper;-><init>(Ljava/lang/String;)V

    check-cast v9, Lcom/smartengines/engine/Engine;

    invoke-direct {v8, v9}, Lcom/smartengines/engine/EngineLoader;-><init>(Lcom/smartengines/engine/Engine;)V

    invoke-direct {v7, v8, v4, v5, v4}, Lcom/smartengines/app/EngineStaff;-><init>(Lcom/smartengines/engine/EngineLoader;Lcom/smartengines/app/targets/TreeItem;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 90
    invoke-direct {v1, v2, v3, v6, v7}, Lcom/smartengines/app/EngineList;-><init>(Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;)V

    sput-object v1, Lcom/smartengines/app/Model;->engines:Lcom/smartengines/app/EngineList;

    .line 96
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/smartengines/app/Model;->homeScreenTargets:Ljava/util/List;

    const/4 v0, 0x0

    .line 99
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    sput-object v1, Lcom/smartengines/app/Model;->_loadedState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 100
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    sput-object v1, Lcom/smartengines/app/Model;->loadedState:Lkotlinx/coroutines/flow/StateFlow;

    .line 106
    new-instance v1, Lcom/smartengines/engine/ImageProcessor;

    sget-object v2, Lcom/smartengines/app/SessionSettingsLoggerImpl;->INSTANCE:Lcom/smartengines/app/SessionSettingsLoggerImpl;

    check-cast v2, Lcom/smartengines/engine/SessionSettingsLogger;

    invoke-direct {v1, v2}, Lcom/smartengines/engine/ImageProcessor;-><init>(Lcom/smartengines/engine/SessionSettingsLogger;)V

    sput-object v1, Lcom/smartengines/app/Model;->imageProcessor:Lcom/smartengines/engine/ImageProcessor;

    .line 111
    invoke-static {v4}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    sput-object v1, Lcom/smartengines/app/Model;->result:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 116
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    sput-object v1, Lcom/smartengines/app/Model;->cameraExecutor:Ljava/util/concurrent/ExecutorService;

    .line 117
    sget-object v1, Lcom/smartengines/app/PhotoTakingState$Inactive;->INSTANCE:Lcom/smartengines/app/PhotoTakingState$Inactive;

    invoke-static {v1, v4, v5, v4}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    sput-object v1, Lcom/smartengines/app/Model;->photoTaking$delegate:Landroidx/compose/runtime/MutableState;

    .line 119
    invoke-static {v0, v4, v5, v4}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    sput-object v0, Lcom/smartengines/app/Model;->isFrontCamera$delegate:Landroidx/compose/runtime/MutableState;

    .line 148
    new-instance v0, Lcom/smartengines/nfc/PassportReader;

    sget-object v1, Lcom/smartengines/app/Dependencies;->INSTANCE:Lcom/smartengines/app/Dependencies;

    invoke-virtual {v1}, Lcom/smartengines/app/Dependencies;->getNfcReadingEngine()Lcom/smartengines/nfc/ReadingEngine;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/smartengines/nfc/PassportReader;-><init>(Lcom/smartengines/nfc/ReadingEngine;)V

    sput-object v0, Lcom/smartengines/app/Model;->passportReader:Lcom/smartengines/nfc/PassportReader;

    .line 151
    invoke-static {v4}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    sput-object v0, Lcom/smartengines/app/Model;->error:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 154
    new-instance v6, Lcom/smartengines/app/settings/VisualizationSettings;

    int-to-float v0, v5

    .line 697
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 698
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    .line 157
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getGreen-0d7_KjU()J

    move-result-wide v9

    .line 158
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getGreen-0d7_KjU()J

    move-result-wide v11

    .line 159
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v13

    const/4 v15, 0x0

    .line 154
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/settings/VisualizationSettings;-><init>(FFJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lcom/smartengines/app/Model;->visualizationSettings:Lcom/smartengines/app/settings/VisualizationSettings;

    .line 163
    const-string/jumbo v0, "store"

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v1, "rustore"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    sget-object v0, Lcom/smartengines/app/settings/BuildFlavor;->RUSTORE:Lcom/smartengines/app/settings/BuildFlavor;

    goto :goto_0

    .line 163
    :sswitch_1
    const-string v1, "forensic"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    sget-object v0, Lcom/smartengines/app/settings/BuildFlavor;->FORENSIC:Lcom/smartengines/app/settings/BuildFlavor;

    goto :goto_0

    .line 163
    :sswitch_2
    invoke-virtual {v0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    sget-object v0, Lcom/smartengines/app/settings/BuildFlavor;->STORE:Lcom/smartengines/app/settings/BuildFlavor;

    goto :goto_0

    .line 163
    :sswitch_3
    const-string v1, "sebeta"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    sget-object v0, Lcom/smartengines/app/settings/BuildFlavor;->BETA:Lcom/smartengines/app/settings/BuildFlavor;

    goto :goto_0

    .line 163
    :sswitch_4
    const-string v1, "nightlysebeta"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    sget-object v0, Lcom/smartengines/app/settings/BuildFlavor;->NIGHTLY:Lcom/smartengines/app/settings/BuildFlavor;

    .line 163
    :goto_0
    sput-object v0, Lcom/smartengines/app/Model;->buildFlavor:Lcom/smartengines/app/settings/BuildFlavor;

    .line 173
    new-instance v0, Lcom/smartengines/utils/ResourceFinder;

    sget v1, Lcom/smartengines/app/R$drawable;->home_anypassport:I

    invoke-direct {v0, v1}, Lcom/smartengines/utils/ResourceFinder;-><init>(I)V

    sput-object v0, Lcom/smartengines/app/Model;->resourceFinder:Lcom/smartengines/utils/ResourceFinder;

    .line 452
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v5

    new-instance v0, Lcom/smartengines/app/Model$1;

    invoke-direct {v0, v4}, Lcom/smartengines/app/Model$1;-><init>(Lkotlin/coroutines/Continuation;)V

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function2;

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 550
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v5

    new-instance v0, Lcom/smartengines/app/Model$2;

    invoke-direct {v0, v4}, Lcom/smartengines/app/Model$2;-><init>(Lkotlin/coroutines/Continuation;)V

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function2;

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    const/16 v0, 0x8

    .line 561
    sput v0, Lcom/smartengines/app/Model;->$stable:I

    return-void

    .line 169
    :cond_0
    :goto_1
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Model does not know the FLAVOR NAME: store"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        -0x692e98d9 -> :sswitch_4
        -0x360554be -> :sswitch_3
        0x68af8e1 -> :sswitch_2
        0x1bd70c5b -> :sswitch_1
        0x5cb85c7e -> :sswitch_0
    .end sparse-switch
.end method

.method private constructor <init>()V
    .locals 0

    .line 74
    invoke-direct {p0}, Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;-><init>()V

    return-void
.end method

.method public static final synthetic access$checkPassportNfcData(Lcom/smartengines/app/Model;Lcom/smartengines/nfc/PassportData;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Lcom/smartengines/app/Model;->checkPassportNfcData(Lcom/smartengines/nfc/PassportData;)V

    return-void
.end method

.method public static final synthetic access$getModelLoadedState(Lcom/smartengines/app/Model;)Z
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/smartengines/app/Model;->getModelLoadedState()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getTAG$p()Ljava/lang/String;
    .locals 1

    .line 74
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$get_loadedState$p()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1

    .line 74
    sget-object v0, Lcom/smartengines/app/Model;->_loadedState:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public static final synthetic access$hiddenEngineInitialization(Lcom/smartengines/app/Model;Lcom/smartengines/engine/Engine;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 74
    invoke-direct {p0, p1, p2, p3}, Lcom/smartengines/app/Model;->hiddenEngineInitialization(Lcom/smartengines/engine/Engine;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$startVideo(Lcom/smartengines/app/Model;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/smartengines/app/Model;->startVideo()V

    return-void
.end method

.method public static final synthetic access$stopVideo(Lcom/smartengines/app/Model;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Lcom/smartengines/app/Model;->stopVideo()V

    return-void
.end method

.method private final applyIsFrontCamera()V
    .locals 2

    .line 136
    sget-object v0, Lcom/smartengines/app/Model;->cameraController:Landroidx/camera/view/LifecycleCameraController;

    if-eqz v0, :cond_1

    .line 137
    invoke-virtual {p0}, Lcom/smartengines/app/Model;->isFrontCamera()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/camera/core/CameraSelector;->DEFAULT_FRONT_CAMERA:Landroidx/camera/core/CameraSelector;

    goto :goto_0

    .line 138
    :cond_0
    sget-object v1, Landroidx/camera/core/CameraSelector;->DEFAULT_BACK_CAMERA:Landroidx/camera/core/CameraSelector;

    .line 136
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/camera/view/LifecycleCameraController;->setCameraSelector(Landroidx/camera/core/CameraSelector;)V

    :cond_1
    return-void
.end method

.method private final checkLoadedStatus(Lcom/smartengines/app/EngineStaff;)V
    .locals 1

    .line 210
    invoke-virtual {p1}, Lcom/smartengines/app/EngineStaff;->getLoader()Lcom/smartengines/engine/EngineLoader;

    move-result-object p1

    invoke-virtual {p1}, Lcom/smartengines/engine/EngineLoader;->getLoadingState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lcom/smartengines/engine/EngineLoadingState$Loaded;

    if-eqz p1, :cond_0

    return-void

    .line 211
    :cond_0
    new-instance p1, Lcom/smartengines/app/AppInternalError;

    const-string v0, "The engine is not loaded"

    invoke-direct {p1, v0}, Lcom/smartengines/app/AppInternalError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final checkPassportNfcData(Lcom/smartengines/nfc/PassportData;)V
    .locals 13

    .line 565
    sget-object v0, Lcom/smartengines/app/Model;->imageProcessor:Lcom/smartengines/engine/ImageProcessor;

    invoke-virtual {v0}, Lcom/smartengines/engine/ImageProcessor;->getSession()Lcom/smartengines/engine/Session;

    move-result-object v0

    .line 566
    sget-object v1, Lcom/smartengines/app/Model;->result:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/engine/Result;

    .line 568
    instance-of v2, v0, Lcom/smartengines/engine/id/IdSessionWrapper;

    if-eqz v2, :cond_4

    instance-of v2, v1, Lcom/smartengines/engine/id/IdResultData;

    if-eqz v2, :cond_4

    .line 569
    check-cast v0, Lcom/smartengines/engine/id/IdSessionWrapper;

    invoke-virtual {v0}, Lcom/smartengines/engine/id/IdSessionWrapper;->getIdSession()Lcom/smartengines/id/IdSession;

    move-result-object v2

    .line 573
    invoke-virtual {p1}, Lcom/smartengines/nfc/PassportData;->getMrzInfo()Lcom/smartengines/nfc/MrzInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/nfc/MrzInfo;->toSingleLine()Ljava/lang/String;

    move-result-object v3

    .line 575
    invoke-virtual {p1}, Lcom/smartengines/nfc/PassportData;->getFacesData()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/nfc/FaceImageData;

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    .line 578
    :try_start_0
    invoke-virtual {v0}, Lcom/smartengines/nfc/FaceImageData;->getBuffer()[B

    move-result-object v0

    invoke-static {v0}, Lcom/smartengines/common/Image;->FromFileBuffer([B)Lcom/smartengines/common/Image;

    move-result-object v0

    .line 580
    invoke-virtual {v0}, Lcom/smartengines/common/Image;->GetBase64String()Lcom/smartengines/common/MutableString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/common/MutableString;->GetCStr()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 582
    sget-object v5, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string v6, "Decoding passport photo error"

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 587
    :cond_0
    :goto_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 588
    move-object v5, v1

    check-cast v5, Lcom/smartengines/engine/id/IdResultData;

    invoke-virtual {v5}, Lcom/smartengines/engine/id/IdResultData;->getDocType()Ljava/lang/String;

    move-result-object v5

    const-string v6, "doc_type"

    invoke-virtual {v0, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    .line 589
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 590
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 591
    const-string/jumbo v7, "value"

    invoke-virtual {v6, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    .line 592
    const-string/jumbo v6, "type"

    const-string v8, "String"

    invoke-virtual {v3, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    .line 590
    const-string v9, "rfid_mrz"

    invoke-virtual {v5, v9, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz v4, :cond_1

    .line 595
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 596
    invoke-virtual {v3, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    .line 597
    const-string v4, "Image"

    invoke-virtual {v3, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    .line 595
    const-string v4, "rfid_photo"

    invoke-virtual {v5, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    const/16 v3, 0x9

    .line 602
    new-array v3, v3, [Lkotlin/Pair;

    const-string v4, "COM"

    const-string v9, "rfid_com"

    invoke-static {v4, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v9, 0x0

    aput-object v4, v3, v9

    .line 603
    const-string v4, "SOD"

    const-string v9, "rfid_sod"

    invoke-static {v4, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v9, 0x1

    aput-object v4, v3, v9

    .line 604
    const-string v4, "DG1"

    const-string v9, "rfid_dg1"

    invoke-static {v4, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v9, 0x2

    aput-object v4, v3, v9

    .line 605
    const-string v4, "DG2"

    const-string v9, "rfid_dg2"

    invoke-static {v4, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v9, 0x3

    aput-object v4, v3, v9

    .line 606
    const-string v4, "DG7"

    const-string v9, "rfid_dg7"

    invoke-static {v4, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v9, 0x4

    aput-object v4, v3, v9

    .line 607
    const-string v4, "DG11"

    const-string v9, "rfid_dg11"

    invoke-static {v4, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v9, 0x5

    aput-object v4, v3, v9

    .line 608
    const-string v4, "DG12"

    const-string v9, "rfid_dg12"

    invoke-static {v4, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v9, 0x6

    aput-object v4, v3, v9

    .line 609
    const-string v4, "DG14"

    const-string v9, "rfid_dg14"

    invoke-static {v4, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v9, 0x7

    aput-object v4, v3, v9

    .line 610
    const-string v4, "DG15"

    const-string v9, "rfid_dg15"

    invoke-static {v4, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v9, 0x8

    aput-object v4, v3, v9

    .line 601
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    .line 612
    invoke-virtual {p1}, Lcom/smartengines/nfc/PassportData;->getOtherFields()Ljava/util/Map;

    move-result-object p1

    .line 691
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 612
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 613
    invoke-interface {v3, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_2

    .line 614
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 615
    invoke-virtual {v10, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v4

    .line 616
    invoke-virtual {v4, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v4

    .line 614
    invoke-virtual {v5, v9, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 620
    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 589
    const-string p1, "physical_fields"

    invoke-virtual {v0, p1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    .line 624
    :try_start_1
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Start RFID data check by the current session. Data: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 626
    new-instance v3, Lcom/smartengines/common/ByteString;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v4, "toString(...)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v4, "getBytes(...)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, p1}, Lcom/smartengines/common/ByteString;-><init>([B)V

    .line 625
    invoke-virtual {v2, v3}, Lcom/smartengines/id/IdSession;->Process(Lcom/smartengines/common/ByteString;)Lcom/smartengines/id/IdResult;

    move-result-object p1

    .line 628
    const-string v2, "rfid result checking finished"

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 631
    sget-object v0, Lcom/smartengines/app/Model;->result:Lkotlinx/coroutines/flow/MutableStateFlow;

    move-object v2, v1

    check-cast v2, Lcom/smartengines/engine/id/IdResultData;

    .line 632
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/smartengines/engine/id/IdResultParserKt;->parseForensicCheckFields(Lcom/smartengines/id/IdResult;)Ljava/util/List;

    move-result-object v7

    const/16 v11, 0xef

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 631
    invoke-static/range {v2 .. v12}, Lcom/smartengines/engine/id/IdResultData;->copy$default(Lcom/smartengines/engine/id/IdResultData;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Lcom/smartengines/engine/id/IdResultData;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    move-object p1, v0

    .line 636
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string v1, "RFID data processing"

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    :cond_4
    :goto_2
    return-void
.end method

.method private final getModelLoadedState()Z
    .locals 3

    .line 382
    sget-object v0, Lcom/smartengines/app/Model;->engines:Lcom/smartengines/app/EngineList;

    invoke-virtual {v0}, Lcom/smartengines/app/EngineList;->getAsList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 689
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/app/EngineStaff;

    .line 383
    invoke-virtual {v1}, Lcom/smartengines/app/EngineStaff;->getLoader()Lcom/smartengines/engine/EngineLoader;

    move-result-object v1

    invoke-virtual {v1}, Lcom/smartengines/engine/EngineLoader;->getLoadingState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/engine/EngineLoadingState;

    .line 384
    sget-object v2, Lcom/smartengines/engine/EngineLoadingState$Unloaded;->INSTANCE:Lcom/smartengines/engine/EngineLoadingState$Unloaded;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lcom/smartengines/engine/EngineLoadingState$Loading;->INSTANCE:Lcom/smartengines/engine/EngineLoadingState$Loading;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private final hiddenEngineInitialization(Lcom/smartengines/engine/Engine;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/engine/Engine;",
            "Ljava/util/List<",
            "+",
            "Lcom/smartengines/engine/RecognitionTarget;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;

    iget v1, v0, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;

    invoke-direct {v0, p0, p3}, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;-><init>(Lcom/smartengines/app/Model;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 666
    iget v2, v0, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/smartengines/engine/RecognitionTarget;

    iget-object p2, v0, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;->L$1:Ljava/lang/Object;

    check-cast p2, Ljava/util/Iterator;

    iget-object v2, v0, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/smartengines/engine/Engine;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p3

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 667
    check-cast p2, Ljava/lang/Iterable;

    .line 695
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/smartengines/engine/RecognitionTarget;

    .line 669
    :try_start_1
    sget-object v2, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "===== create a dummy session for initialization, target: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 670
    sget-object v4, Lcom/smartengines/engine/SessionType;->VIDEO_SESSION:Lcom/smartengines/engine/SessionType;

    const/4 v5, 0x0

    invoke-interface {p3, p1, v4, v5}, Lcom/smartengines/engine/RecognitionTarget;->createSession(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/SessionType;Lcom/smartengines/engine/SessionSettingsLogger;)Lcom/smartengines/engine/Session;

    move-result-object v4

    .line 671
    const-string v5, "===== the dummy session created"

    invoke-static {v2, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 672
    invoke-interface {v4}, Lcom/smartengines/engine/Session;->delete()V

    .line 673
    iput-object p1, v0, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/smartengines/app/Model$hiddenEngineInitialization$1;->label:I

    const-wide/16 v4, 0x1

    invoke-static {v4, v5, v0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object v2, p1

    goto :goto_3

    :catchall_1
    move-exception v2

    move-object v7, v2

    move-object v2, p1

    move-object p1, p3

    move-object p3, v7

    .line 675
    :goto_2
    sget-object v4, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "hiddenEngineInitialization target: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_3
    move-object p1, v2

    goto :goto_1

    .line 678
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final setFrontCamera(Z)V
    .locals 1

    .line 119
    sget-object v0, Lcom/smartengines/app/Model;->isFrontCamera$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 684
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final setPhotoTaking(Lcom/smartengines/app/PhotoTakingState;)V
    .locals 1

    .line 117
    sget-object v0, Lcom/smartengines/app/Model;->photoTaking$delegate:Landroidx/compose/runtime/MutableState;

    .line 681
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final startProcessing(Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;)V
    .locals 3

    .line 430
    :try_start_0
    sget-object v0, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {v0}, Lcom/smartengines/app/AppViewModel;->getSelectedLeaf()Lcom/smartengines/app/targets/TreeLeaf;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/smartengines/app/targets/TreeLeaf;->getTarget()Lcom/smartengines/engine/RecognitionTarget;

    move-result-object v0

    .line 432
    invoke-interface {v0}, Lcom/smartengines/engine/RecognitionTarget;->getEngineId()Lcom/smartengines/engine/EngineId;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/smartengines/app/Model;->getEngineById(Lcom/smartengines/engine/EngineId;)Lcom/smartengines/app/EngineStaff;

    move-result-object v1

    invoke-virtual {v1}, Lcom/smartengines/app/EngineStaff;->getLoader()Lcom/smartengines/engine/EngineLoader;

    move-result-object v1

    invoke-virtual {v1}, Lcom/smartengines/engine/EngineLoader;->getEngine()Lcom/smartengines/engine/Engine;

    move-result-object v1

    .line 434
    sget-object v2, Lcom/smartengines/app/Model;->imageProcessor:Lcom/smartengines/engine/ImageProcessor;

    invoke-virtual {v2, v1, v0, p1, p2}, Lcom/smartengines/engine/ImageProcessor;->startProcessing(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/RecognitionTarget;Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 441
    sget-object p2, Lcom/smartengines/app/Model;->error:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p2, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final startVideo()V
    .locals 2

    .line 516
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string/jumbo v1, "startVideo"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 517
    sget-object v0, Lcom/smartengines/app/Model;->cameraController:Landroidx/camera/view/LifecycleCameraController;

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroidx/camera/view/LifecycleCameraController;->setEnabledUseCases(I)V

    :cond_0
    return-void
.end method

.method private final stopVideo()V
    .locals 2

    .line 512
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string/jumbo v1, "stopVideo"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 513
    sget-object v0, Lcom/smartengines/app/Model;->cameraController:Landroidx/camera/view/LifecycleCameraController;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/camera/view/LifecycleCameraController;->setEnabledUseCases(I)V

    :cond_0
    return-void
.end method

.method private final switchToBackCamera()V
    .locals 1

    .line 131
    invoke-virtual {p0}, Lcom/smartengines/app/Model;->isFrontCamera()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 132
    invoke-direct {p0, v0}, Lcom/smartengines/app/Model;->setFrontCamera(Z)V

    .line 133
    invoke-direct {p0}, Lcom/smartengines/app/Model;->applyIsFrontCamera()V

    return-void
.end method


# virtual methods
.method public final addNewPage()V
    .locals 2

    .line 272
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string v1, "addNewPage"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 274
    sget-object v0, Lcom/smartengines/app/PhotoTakingState$Inactive;->INSTANCE:Lcom/smartengines/app/PhotoTakingState$Inactive;

    check-cast v0, Lcom/smartengines/app/PhotoTakingState;

    invoke-direct {p0, v0}, Lcom/smartengines/app/Model;->setPhotoTaking(Lcom/smartengines/app/PhotoTakingState;)V

    .line 276
    sget-object v0, Lcom/smartengines/app/Model;->imageProcessor:Lcom/smartengines/engine/ImageProcessor;

    invoke-virtual {v0}, Lcom/smartengines/engine/ImageProcessor;->restart()V

    return-void
.end method

.method public final calculatePassportKey(Ljava/lang/Object;)V
    .locals 3

    .line 540
    sget-object v0, Lcom/smartengines/app/Model;->passportReader:Lcom/smartengines/nfc/PassportReader;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/smartengines/nfc/PassportReader;->reset(Landroid/app/Activity;)V

    .line 541
    invoke-virtual {v0}, Lcom/smartengines/nfc/PassportReader;->getPassportKeyFlow()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    .line 542
    instance-of v2, p1, Lcom/smartengines/engine/code/CodeResultData;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/smartengines/engine/code/CodeResultData;

    invoke-static {p1}, Lcom/smartengines/app/PassportKeyKt;->calculatePassportKey(Lcom/smartengines/engine/code/CodeResultData;)Lcom/smartengines/nfc/PassportKey;

    move-result-object v1

    goto :goto_0

    .line 543
    :cond_0
    instance-of v2, p1, Lcom/smartengines/engine/id/IdResultData;

    if-eqz v2, :cond_1

    check-cast p1, Lcom/smartengines/engine/id/IdResultData;

    invoke-static {p1}, Lcom/smartengines/app/PassportKeyKt;->calculatePassportKey(Lcom/smartengines/engine/id/IdResultData;)Lcom/smartengines/nfc/PassportKey;

    move-result-object v1

    .line 541
    :cond_1
    :goto_0
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final check(Landroid/content/Context;)V
    .locals 6

    const-string v0, "assets: "

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 645
    sget-object v1, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string v2, "check"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 648
    :try_start_0
    const-string v2, "jnimultiengine"

    invoke-static {v2}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 649
    invoke-static {}, Lcom/smartengines/common/Image;->CreateEmpty()Lcom/smartengines/common/Image;

    .line 652
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    const-string v2, "bundles"

    invoke-virtual {p1, v2}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 653
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v0, p1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 693
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 655
    sget-object v3, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "   - "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 659
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string v1, "load"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final clearTakenPhoto()V
    .locals 2

    .line 494
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string v1, "clearTakenPhoto"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 496
    sget-object v0, Lcom/smartengines/app/PhotoTakingState$Inactive;->INSTANCE:Lcom/smartengines/app/PhotoTakingState$Inactive;

    check-cast v0, Lcom/smartengines/app/PhotoTakingState;

    invoke-direct {p0, v0}, Lcom/smartengines/app/Model;->setPhotoTaking(Lcom/smartengines/app/PhotoTakingState;)V

    return-void
.end method

.method public final getBuildFlavor()Lcom/smartengines/app/settings/BuildFlavor;
    .locals 1

    .line 163
    sget-object v0, Lcom/smartengines/app/Model;->buildFlavor:Lcom/smartengines/app/settings/BuildFlavor;

    return-object v0
.end method

.method public final getBundleCode()Lcom/smartengines/engine/EngineBundle$File;
    .locals 1

    .line 83
    sget-object v0, Lcom/smartengines/app/Model;->bundleCode:Lcom/smartengines/engine/EngineBundle$File;

    return-object v0
.end method

.method public final getBundleDoc()Lcom/smartengines/engine/EngineBundle$File;
    .locals 1

    .line 85
    sget-object v0, Lcom/smartengines/app/Model;->bundleDoc:Lcom/smartengines/engine/EngineBundle$File;

    return-object v0
.end method

.method public final getBundleId()Lcom/smartengines/engine/EngineBundle$File;
    .locals 1

    .line 84
    sget-object v0, Lcom/smartengines/app/Model;->bundleId:Lcom/smartengines/engine/EngineBundle$File;

    return-object v0
.end method

.method public final getBundleText()Lcom/smartengines/engine/EngineBundle$File;
    .locals 1

    .line 86
    sget-object v0, Lcom/smartengines/app/Model;->bundleText:Lcom/smartengines/engine/EngineBundle$File;

    return-object v0
.end method

.method public final getCameraController()Landroidx/camera/view/LifecycleCameraController;
    .locals 1

    .line 114
    sget-object v0, Lcom/smartengines/app/Model;->cameraController:Landroidx/camera/view/LifecycleCameraController;

    return-object v0
.end method

.method public final getEngineById(Lcom/smartengines/engine/EngineId;)Lcom/smartengines/app/EngineStaff;
    .locals 1

    const-string v0, "engineId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    sget-object v0, Lcom/smartengines/app/Model$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/smartengines/engine/EngineId;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 181
    sget-object p1, Lcom/smartengines/app/Model;->engines:Lcom/smartengines/app/EngineList;

    invoke-virtual {p1}, Lcom/smartengines/app/EngineList;->getText()Lcom/smartengines/app/EngineStaff;

    move-result-object p1

    return-object p1

    .line 177
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 180
    :cond_1
    sget-object p1, Lcom/smartengines/app/Model;->engines:Lcom/smartengines/app/EngineList;

    invoke-virtual {p1}, Lcom/smartengines/app/EngineList;->getId()Lcom/smartengines/app/EngineStaff;

    move-result-object p1

    return-object p1

    .line 179
    :cond_2
    sget-object p1, Lcom/smartengines/app/Model;->engines:Lcom/smartengines/app/EngineList;

    invoke-virtual {p1}, Lcom/smartengines/app/EngineList;->getDoc()Lcom/smartengines/app/EngineStaff;

    move-result-object p1

    return-object p1

    .line 178
    :cond_3
    sget-object p1, Lcom/smartengines/app/Model;->engines:Lcom/smartengines/app/EngineList;

    invoke-virtual {p1}, Lcom/smartengines/app/EngineList;->getCode()Lcom/smartengines/app/EngineStaff;

    move-result-object p1

    return-object p1
.end method

.method public final getEngines()Lcom/smartengines/app/EngineList;
    .locals 1

    .line 90
    sget-object v0, Lcom/smartengines/app/Model;->engines:Lcom/smartengines/app/EngineList;

    return-object v0
.end method

.method public final getError()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    .line 151
    sget-object v0, Lcom/smartengines/app/Model;->error:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public final getHomeScreenTargets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;"
        }
    .end annotation

    .line 96
    sget-object v0, Lcom/smartengines/app/Model;->homeScreenTargets:Ljava/util/List;

    return-object v0
.end method

.method public final getImageProcessor()Lcom/smartengines/engine/ImageProcessor;
    .locals 1

    .line 106
    sget-object v0, Lcom/smartengines/app/Model;->imageProcessor:Lcom/smartengines/engine/ImageProcessor;

    return-object v0
.end method

.method public final getJniLibrary()Ljava/lang/String;
    .locals 1

    .line 82
    sget-object v0, Lcom/smartengines/app/Model;->jniLibrary:Ljava/lang/String;

    return-object v0
.end method

.method public final getLoadedState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 100
    sget-object v0, Lcom/smartengines/app/Model;->loadedState:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getPassportReader()Lcom/smartengines/nfc/PassportReader;
    .locals 1

    .line 148
    sget-object v0, Lcom/smartengines/app/Model;->passportReader:Lcom/smartengines/nfc/PassportReader;

    return-object v0
.end method

.method public final getPhotoTaking()Lcom/smartengines/app/PhotoTakingState;
    .locals 1

    .line 117
    sget-object v0, Lcom/smartengines/app/Model;->photoTaking$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 680
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/app/PhotoTakingState;

    return-object v0
.end method

.method public final getResourceFinder()Lcom/smartengines/utils/ResourceFinder;
    .locals 1

    .line 173
    sget-object v0, Lcom/smartengines/app/Model;->resourceFinder:Lcom/smartengines/utils/ResourceFinder;

    return-object v0
.end method

.method public final getResult()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/smartengines/engine/Result;",
            ">;"
        }
    .end annotation

    .line 111
    sget-object v0, Lcom/smartengines/app/Model;->result:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public final getSelectedEngineId()Lcom/smartengines/engine/EngineId;
    .locals 3

    .line 187
    :try_start_0
    sget-object v0, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {v0}, Lcom/smartengines/app/AppViewModel;->getSelectedLeaf()Lcom/smartengines/app/targets/TreeLeaf;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/smartengines/app/targets/TreeLeaf;->getTarget()Lcom/smartengines/engine/RecognitionTarget;

    move-result-object v0

    .line 189
    invoke-interface {v0}, Lcom/smartengines/engine/RecognitionTarget;->getEngineId()Lcom/smartengines/engine/EngineId;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    .line 191
    sget-object v1, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string v2, "getSelectedEngineId"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSession()Lcom/smartengines/engine/Session;
    .locals 1

    .line 108
    sget-object v0, Lcom/smartengines/app/Model;->imageProcessor:Lcom/smartengines/engine/ImageProcessor;

    invoke-virtual {v0}, Lcom/smartengines/engine/ImageProcessor;->getSession()Lcom/smartengines/engine/Session;

    move-result-object v0

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    .line 78
    sget-object v0, Lcom/smartengines/app/Model;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public final getVisualizationSettings()Lcom/smartengines/app/settings/VisualizationSettings;
    .locals 1

    .line 154
    sget-object v0, Lcom/smartengines/app/Model;->visualizationSettings:Lcom/smartengines/app/settings/VisualizationSettings;

    return-object v0
.end method

.method public final isFrontCamera()Z
    .locals 1

    .line 119
    sget-object v0, Lcom/smartengines/app/Model;->isFrontCamera$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 683
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final load(Landroid/content/Context;)V
    .locals 14

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string v1, "load"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 287
    :try_start_0
    new-instance v1, Landroidx/camera/view/LifecycleCameraController;

    invoke-direct {v1, p1}, Landroidx/camera/view/LifecycleCameraController;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    .line 288
    invoke-virtual {v1, v2}, Landroidx/camera/view/LifecycleCameraController;->setEnabledUseCases(I)V

    .line 289
    new-instance v2, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    invoke-direct {v2}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;-><init>()V

    .line 290
    sget-object v3, Landroidx/camera/core/resolutionselector/ResolutionStrategy;->HIGHEST_AVAILABLE_STRATEGY:Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    invoke-virtual {v2, v3}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->setResolutionStrategy(Landroidx/camera/core/resolutionselector/ResolutionStrategy;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    move-result-object v2

    .line 291
    invoke-virtual {v2}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->build()Landroidx/camera/core/resolutionselector/ResolutionSelector;

    move-result-object v2

    const-string v3, "build(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    invoke-virtual {v1, v2}, Landroidx/camera/view/LifecycleCameraController;->setImageAnalysisResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)V

    .line 294
    invoke-virtual {v1, v2}, Landroidx/camera/view/LifecycleCameraController;->setImageCaptureResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)V

    .line 295
    sget-object v2, Lcom/smartengines/app/Model;->cameraExecutor:Ljava/util/concurrent/ExecutorService;

    check-cast v2, Ljava/util/concurrent/Executor;

    sget-object v3, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    new-instance v4, Lcom/smartengines/app/Model$$ExternalSyntheticLambda0;

    invoke-direct {v4, v3}, Lcom/smartengines/app/Model$$ExternalSyntheticLambda0;-><init>(Lcom/smartengines/app/Model;)V

    invoke-virtual {v1, v2, v4}, Landroidx/camera/view/LifecycleCameraController;->setImageAnalysisAnalyzer(Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageAnalysis$Analyzer;)V

    .line 287
    sput-object v1, Lcom/smartengines/app/Model;->cameraController:Landroidx/camera/view/LifecycleCameraController;

    .line 297
    invoke-direct {p0}, Lcom/smartengines/app/Model;->applyIsFrontCamera()V

    .line 298
    const-string v1, "camera controller created"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 300
    sget-object v1, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string v2, "init camera"

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 304
    :goto_0
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/smartengines/app/Model$load$2;

    const/4 v7, 0x0

    invoke-direct {v0, v7}, Lcom/smartengines/app/Model$load$2;-><init>(Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 316
    sget-object v0, Lcom/smartengines/app/Model;->engines:Lcom/smartengines/app/EngineList;

    invoke-virtual {v0}, Lcom/smartengines/app/EngineList;->getId()Lcom/smartengines/app/EngineStaff;

    move-result-object v1

    invoke-virtual {v1}, Lcom/smartengines/app/EngineStaff;->getLoader()Lcom/smartengines/engine/EngineLoader;

    move-result-object v1

    .line 317
    sget-object v2, Lcom/smartengines/app/Model;->jniLibrary:Ljava/lang/String;

    .line 318
    sget-object v3, Lcom/smartengines/app/Model;->bundleId:Lcom/smartengines/engine/EngineBundle$File;

    check-cast v3, Lcom/smartengines/engine/EngineBundle;

    .line 316
    new-instance v4, Lcom/smartengines/app/Model$load$3;

    invoke-direct {v4, p1, v7}, Lcom/smartengines/app/Model$load$3;-><init>(Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-virtual {v1, p1, v2, v3, v4}, Lcom/smartengines/engine/EngineLoader;->load(Landroid/content/Context;Ljava/lang/String;Lcom/smartengines/engine/EngineBundle;Lkotlin/jvm/functions/Function2;)V

    .line 341
    invoke-virtual {v0}, Lcom/smartengines/app/EngineList;->getCode()Lcom/smartengines/app/EngineStaff;

    move-result-object v1

    invoke-virtual {v1}, Lcom/smartengines/app/EngineStaff;->getLoader()Lcom/smartengines/engine/EngineLoader;

    move-result-object v1

    .line 343
    sget-object v3, Lcom/smartengines/app/Model;->bundleCode:Lcom/smartengines/engine/EngineBundle$File;

    check-cast v3, Lcom/smartengines/engine/EngineBundle;

    .line 341
    new-instance v4, Lcom/smartengines/app/Model$load$4;

    invoke-direct {v4, p1, v7}, Lcom/smartengines/app/Model$load$4;-><init>(Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-virtual {v1, p1, v2, v3, v4}, Lcom/smartengines/engine/EngineLoader;->load(Landroid/content/Context;Ljava/lang/String;Lcom/smartengines/engine/EngineBundle;Lkotlin/jvm/functions/Function2;)V

    .line 348
    invoke-virtual {v0}, Lcom/smartengines/app/EngineList;->getDoc()Lcom/smartengines/app/EngineStaff;

    move-result-object v1

    invoke-virtual {v1}, Lcom/smartengines/app/EngineStaff;->getLoader()Lcom/smartengines/engine/EngineLoader;

    move-result-object v1

    .line 350
    sget-object v3, Lcom/smartengines/app/Model;->bundleDoc:Lcom/smartengines/engine/EngineBundle$File;

    check-cast v3, Lcom/smartengines/engine/EngineBundle;

    .line 348
    new-instance v4, Lcom/smartengines/app/Model$load$5;

    invoke-direct {v4, p1, v7}, Lcom/smartengines/app/Model$load$5;-><init>(Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-virtual {v1, p1, v2, v3, v4}, Lcom/smartengines/engine/EngineLoader;->load(Landroid/content/Context;Ljava/lang/String;Lcom/smartengines/engine/EngineBundle;Lkotlin/jvm/functions/Function2;)V

    .line 355
    invoke-virtual {v0}, Lcom/smartengines/app/EngineList;->getText()Lcom/smartengines/app/EngineStaff;

    move-result-object v1

    invoke-virtual {v1}, Lcom/smartengines/app/EngineStaff;->getLoader()Lcom/smartengines/engine/EngineLoader;

    move-result-object v1

    .line 357
    sget-object v3, Lcom/smartengines/app/Model;->bundleText:Lcom/smartengines/engine/EngineBundle$File;

    check-cast v3, Lcom/smartengines/engine/EngineBundle;

    .line 355
    new-instance v4, Lcom/smartengines/app/Model$load$6;

    invoke-direct {v4, p1, v7}, Lcom/smartengines/app/Model$load$6;-><init>(Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-virtual {v1, p1, v2, v3, v4}, Lcom/smartengines/engine/EngineLoader;->load(Landroid/content/Context;Ljava/lang/String;Lcom/smartengines/engine/EngineBundle;Lkotlin/jvm/functions/Function2;)V

    .line 364
    invoke-virtual {v0}, Lcom/smartengines/app/EngineList;->getAsList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 687
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/app/EngineStaff;

    .line 365
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v2}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v8

    new-instance v2, Lcom/smartengines/app/Model$load$7$1;

    invoke-direct {v2, v1, p1, v7}, Lcom/smartengines/app/Model$load$7$1;-><init>(Lcom/smartengines/app/EngineStaff;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    move-object v11, v2

    check-cast v11, Lkotlin/jvm/functions/Function2;

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    goto :goto_1

    :cond_0
    return-void
.end method

.method public final onBack()V
    .locals 2

    # BYPASS BACK BUTTON - completely disable back navigation
    return-void

    .line 237
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string v1, "onBack"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 238
    invoke-virtual {p0}, Lcom/smartengines/app/Model;->getPhotoTaking()Lcom/smartengines/app/PhotoTakingState;

    move-result-object v0

    sget-object v1, Lcom/smartengines/app/PhotoTakingState$Inactive;->INSTANCE:Lcom/smartengines/app/PhotoTakingState$Inactive;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 239
    sget-object v0, Lcom/smartengines/app/PhotoTakingState$Inactive;->INSTANCE:Lcom/smartengines/app/PhotoTakingState$Inactive;

    check-cast v0, Lcom/smartengines/app/PhotoTakingState;

    invoke-direct {p0, v0}, Lcom/smartengines/app/Model;->setPhotoTaking(Lcom/smartengines/app/PhotoTakingState;)V

    .line 240
    sget-object v0, Lcom/smartengines/app/Model;->imageProcessor:Lcom/smartengines/engine/ImageProcessor;

    invoke-virtual {v0}, Lcom/smartengines/engine/ImageProcessor;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/smartengines/engine/ImageProcessingState$WAITING;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 243
    :cond_0
    sget-object v0, Lcom/smartengines/app/Model;->imageProcessor:Lcom/smartengines/engine/ImageProcessor;

    invoke-virtual {v0}, Lcom/smartengines/engine/ImageProcessor;->clear()V

    .line 246
    sget-object v0, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {v0}, Lcom/smartengines/app/AppViewModel;->onBack()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 249
    :cond_1
    invoke-static {}, Lcom/smartengines/app/MainActivityKt;->exitApp()V

    return-void
.end method

.method public onCaptureSuccess(Landroidx/camera/core/ImageProxy;)V
    .locals 7

    const-string v0, "imageProxy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 501
    invoke-super {p0, p1}, Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;->onCaptureSuccess(Landroidx/camera/core/ImageProxy;)V

    .line 502
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onCaptureSuccess image size:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x78

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 504
    invoke-virtual {p0}, Lcom/smartengines/app/Model;->getPhotoTaking()Lcom/smartengines/app/PhotoTakingState;

    move-result-object v0

    sget-object v1, Lcom/smartengines/app/PhotoTakingState$InProgress;->INSTANCE:Lcom/smartengines/app/PhotoTakingState$InProgress;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 506
    :cond_0
    sget-object v0, Lcom/smartengines/app/MainActivity;->Companion:Lcom/smartengines/app/MainActivity$Companion;

    invoke-virtual {v0}, Lcom/smartengines/app/MainActivity$Companion;->getInstance()Lcom/smartengines/app/MainActivity;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {p0}, Lcom/smartengines/app/Model;->isFrontCamera()Z

    move-result v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/camera/CameraUtilsKt;->toBitmapLikeInPreview$default(Landroidx/camera/core/ImageProxy;Landroid/app/Activity;ZLjava/lang/Integer;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 508
    new-instance v0, Lcom/smartengines/app/PhotoTakingState$Ready;

    new-instance v1, Lcom/smartengines/app/Photo;

    invoke-direct {v1, p1}, Lcom/smartengines/app/Photo;-><init>(Landroid/graphics/Bitmap;)V

    const/4 p1, 0x0

    invoke-direct {v0, v1, p1}, Lcom/smartengines/app/PhotoTakingState$Ready;-><init>(Lcom/smartengines/app/Photo;Z)V

    check-cast v0, Lcom/smartengines/app/PhotoTakingState;

    invoke-direct {p0, v0}, Lcom/smartengines/app/Model;->setPhotoTaking(Lcom/smartengines/app/PhotoTakingState;)V

    return-void
.end method

.method public final onGalleryPhotoLoaded(Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 420
    new-instance v0, Lcom/smartengines/app/PhotoTakingState$Ready;

    new-instance v1, Lcom/smartengines/app/Photo;

    invoke-direct {v1, p1}, Lcom/smartengines/app/Photo;-><init>(Landroid/graphics/Bitmap;)V

    const/4 p1, 0x1

    invoke-direct {v0, v1, p1}, Lcom/smartengines/app/PhotoTakingState$Ready;-><init>(Lcom/smartengines/app/Photo;Z)V

    check-cast v0, Lcom/smartengines/app/PhotoTakingState;

    invoke-direct {p0, v0}, Lcom/smartengines/app/Model;->setPhotoTaking(Lcom/smartengines/app/PhotoTakingState;)V

    return-void
.end method

.method public final onLoaded(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    invoke-static {p1}, Lcom/smartengines/app/targets/HomeScreenTargetsKt;->loadHomeScreenTargets(Landroid/content/Context;)Ljava/util/List;

    move-result-object p1

    sput-object p1, Lcom/smartengines/app/Model;->homeScreenTargets:Ljava/util/List;

    return-void
.end method

.method public final onNodeClick(Lcom/smartengines/app/targets/TreeItem;)V
    .locals 3

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onNodeClick "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/smartengines/app/targets/TreeItem;->getName()Lcom/smartengines/utils/Name;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    sget-object v0, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {v0, p1}, Lcom/smartengines/app/AppViewModel;->onNodeClick(Lcom/smartengines/app/targets/TreeItem;)V

    .line 222
    instance-of v0, p1, Lcom/smartengines/app/targets/TreeLeaf;

    if-eqz v0, :cond_2

    .line 224
    check-cast p1, Lcom/smartengines/app/targets/TreeLeaf;

    invoke-virtual {p1}, Lcom/smartengines/app/targets/TreeLeaf;->getTarget()Lcom/smartengines/engine/RecognitionTarget;

    move-result-object v0

    instance-of v0, v0, Lcom/smartengines/targets/id/LivenessTarget;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/smartengines/app/targets/TreeLeaf;->getTarget()Lcom/smartengines/engine/RecognitionTarget;

    move-result-object v0

    instance-of v0, v0, Lcom/smartengines/targets/FacesTarget;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 227
    :cond_0
    invoke-direct {p0}, Lcom/smartengines/app/Model;->switchToBackCamera()V

    goto :goto_1

    .line 225
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/smartengines/app/Model;->switchToFrontCamera()V

    .line 232
    :goto_1
    sget-object v0, Lcom/smartengines/app/CameraButtonsModel;->INSTANCE:Lcom/smartengines/app/CameraButtonsModel;

    invoke-virtual {p1}, Lcom/smartengines/app/targets/TreeLeaf;->getTarget()Lcom/smartengines/engine/RecognitionTarget;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/smartengines/app/CameraButtonsModel;->onTargetChanged(Lcom/smartengines/engine/RecognitionTarget;)V

    :cond_2
    return-void
.end method

.method public final onResultDone()V
    .locals 2

    .line 254
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string v1, "onResultDone"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 261
    invoke-virtual {p0}, Lcom/smartengines/app/Model;->onBack()V

    return-void
.end method

.method public final onResultRepeat()V
    .locals 2

    .line 264
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string v1, "onResultRepeat"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 266
    sget-object v0, Lcom/smartengines/app/PhotoTakingState$Inactive;->INSTANCE:Lcom/smartengines/app/PhotoTakingState$Inactive;

    check-cast v0, Lcom/smartengines/app/PhotoTakingState;

    invoke-direct {p0, v0}, Lcom/smartengines/app/Model;->setPhotoTaking(Lcom/smartengines/app/PhotoTakingState;)V

    .line 268
    sget-object v0, Lcom/smartengines/app/Model;->imageProcessor:Lcom/smartengines/engine/ImageProcessor;

    invoke-virtual {v0}, Lcom/smartengines/engine/ImageProcessor;->clear()V

    return-void
.end method

.method public final onVideoFrame(Landroidx/camera/core/ImageProxy;)V
    .locals 7

    const-string v0, "imageProxy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 521
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string v1, " --- video frame"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 523
    sget-object v0, Lcom/smartengines/app/MainActivity;->Companion:Lcom/smartengines/app/MainActivity$Companion;

    invoke-virtual {v0}, Lcom/smartengines/app/MainActivity$Companion;->getInstance()Lcom/smartengines/app/MainActivity;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {p0}, Lcom/smartengines/app/Model;->isFrontCamera()Z

    move-result v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lcom/smartengines/camera/CameraUtilsKt;->toBitmapLikeInPreview$default(Landroidx/camera/core/ImageProxy;Landroid/app/Activity;ZLjava/lang/Integer;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 525
    sget-object v0, Lcom/smartengines/app/Model;->imageProcessor:Lcom/smartengines/engine/ImageProcessor;

    .line 526
    new-instance v2, Lcom/smartengines/camera/Frame;

    invoke-direct {v2, p1, v1}, Lcom/smartengines/camera/Frame;-><init>(Landroid/graphics/Bitmap;Landroidx/camera/core/ImageProxy;)V

    .line 525
    invoke-virtual {v0, v2}, Lcom/smartengines/engine/ImageProcessor;->addFrame(Lcom/smartengines/camera/Frame;)V

    .line 532
    invoke-static {}, Lcom/smartengines/app/AppKt;->getCommonSettingsStore()Lcom/smartengines/app/settings/CommonSettingsStore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/app/settings/CommonSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/app/settings/CommonSettings;

    invoke-virtual {v0}, Lcom/smartengines/app/settings/CommonSettings;->getSaveVideo()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 533
    sget-object v0, Lcom/smartengines/app/ImageSaver;->INSTANCE:Lcom/smartengines/app/ImageSaver;

    sget-object v1, Lcom/smartengines/app/ImageSaver$Dir;->Video:Lcom/smartengines/app/ImageSaver$Dir;

    invoke-virtual {v0, v1, p1}, Lcom/smartengines/app/ImageSaver;->saveImage(Lcom/smartengines/app/ImageSaver$Dir;Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public final predictSelectedEngineId()Lcom/smartengines/engine/EngineId;
    .locals 2

    .line 201
    :try_start_0
    sget-object v0, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {v0}, Lcom/smartengines/app/AppViewModel;->getSelectedGroup()Lcom/smartengines/app/ui/TargetsViewModel;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/smartengines/app/ui/TargetsViewModel;->getTreeGroup()Lcom/smartengines/app/targets/TreeGroup;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/app/targets/TreeGroup;->getChildren()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.smartengines.app.targets.TreeLeaf"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/smartengines/app/targets/TreeLeaf;

    invoke-virtual {v0}, Lcom/smartengines/app/targets/TreeLeaf;->getTarget()Lcom/smartengines/engine/RecognitionTarget;

    move-result-object v0

    .line 203
    invoke-interface {v0}, Lcom/smartengines/engine/RecognitionTarget;->getEngineId()Lcom/smartengines/engine/EngineId;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final setHomeScreenTargets(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    sput-object p1, Lcom/smartengines/app/Model;->homeScreenTargets:Ljava/util/List;

    return-void
.end method

.method public final startCapturedPhotoProcessing()V
    .locals 4

    .line 402
    invoke-virtual {p0}, Lcom/smartengines/app/Model;->getPhotoTaking()Lcom/smartengines/app/PhotoTakingState;

    move-result-object v0

    .line 403
    instance-of v1, v0, Lcom/smartengines/app/PhotoTakingState$Ready;

    if-eqz v1, :cond_2

    .line 405
    sget-object v1, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    .line 406
    check-cast v0, Lcom/smartengines/app/PhotoTakingState$Ready;

    invoke-virtual {v0}, Lcom/smartengines/app/PhotoTakingState$Ready;->getFromGallery()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lcom/smartengines/engine/SessionType;->GALLERY_SESSION:Lcom/smartengines/engine/SessionType;

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/smartengines/engine/SessionType;->PHOTO_SESSION:Lcom/smartengines/engine/SessionType;

    .line 407
    :goto_0
    invoke-virtual {v0}, Lcom/smartengines/app/PhotoTakingState$Ready;->getPhoto()Lcom/smartengines/app/Photo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/smartengines/app/Photo;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v3

    .line 405
    invoke-direct {v1, v2, v3}, Lcom/smartengines/app/Model;->startProcessing(Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;)V

    .line 410
    invoke-static {}, Lcom/smartengines/app/AppKt;->getCommonSettingsStore()Lcom/smartengines/app/settings/CommonSettingsStore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/app/settings/CommonSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettings;->getSavePhoto()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 411
    sget-object v1, Lcom/smartengines/app/ImageSaver;->INSTANCE:Lcom/smartengines/app/ImageSaver;

    sget-object v2, Lcom/smartengines/app/ImageSaver$Dir;->Photo:Lcom/smartengines/app/ImageSaver$Dir;

    invoke-virtual {v0}, Lcom/smartengines/app/PhotoTakingState$Ready;->getPhoto()Lcom/smartengines/app/Photo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/app/Photo;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/smartengines/app/ImageSaver;->saveImage(Lcom/smartengines/app/ImageSaver$Dir;Landroid/graphics/Bitmap;)V

    :cond_1
    return-void

    .line 413
    :cond_2
    sget-object v1, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Photo is not ready, photoTaking: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final startVideoProcessing()V
    .locals 2

    .line 395
    sget-object v0, Lcom/smartengines/engine/SessionType;->VIDEO_SESSION:Lcom/smartengines/engine/SessionType;

    const/4 v1, 0x0

    .line 394
    invoke-direct {p0, v0, v1}, Lcom/smartengines/app/Model;->startProcessing(Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final stopProcessing()V
    .locals 1

    .line 446
    sget-object v0, Lcom/smartengines/app/Model;->imageProcessor:Lcom/smartengines/engine/ImageProcessor;

    invoke-virtual {v0}, Lcom/smartengines/engine/ImageProcessor;->stopProcessing()V

    return-void
.end method

.method public final switchCamera()V
    .locals 1

    .line 122
    invoke-virtual {p0}, Lcom/smartengines/app/Model;->isFrontCamera()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lcom/smartengines/app/Model;->setFrontCamera(Z)V

    .line 123
    invoke-direct {p0}, Lcom/smartengines/app/Model;->applyIsFrontCamera()V

    return-void
.end method

.method public final switchToFrontCamera()V
    .locals 1

    .line 126
    invoke-virtual {p0}, Lcom/smartengines/app/Model;->isFrontCamera()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 127
    invoke-direct {p0, v0}, Lcom/smartengines/app/Model;->setFrontCamera(Z)V

    .line 128
    invoke-direct {p0}, Lcom/smartengines/app/Model;->applyIsFrontCamera()V

    return-void
.end method

.method public final switchTorchOn()V
    .locals 2

    .line 141
    sget-object v0, Lcom/smartengines/app/Model;->cameraController:Landroidx/camera/view/LifecycleCameraController;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/camera/view/LifecycleCameraController;->enableTorch(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_0
    return-void
.end method

.method public final switchTorchState()V
    .locals 3

    .line 144
    sget-object v0, Lcom/smartengines/app/Model;->cameraController:Landroidx/camera/view/LifecycleCameraController;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/camera/view/LifecycleCameraController;->getTorchState()Landroidx/lifecycle/LiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Landroidx/camera/view/LifecycleCameraController;->enableTorch(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_2
    return-void
.end method

.method public final takePhoto()V
    .locals 3

    .line 484
    sget-object v0, Lcom/smartengines/app/Model;->TAG:Ljava/lang/String;

    const-string/jumbo v1, "takePhoto"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 485
    invoke-virtual {p0}, Lcom/smartengines/app/Model;->getPhotoTaking()Lcom/smartengines/app/PhotoTakingState;

    move-result-object v0

    sget-object v1, Lcom/smartengines/app/PhotoTakingState$InProgress;->INSTANCE:Lcom/smartengines/app/PhotoTakingState$InProgress;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 487
    :cond_0
    sget-object v0, Lcom/smartengines/app/PhotoTakingState$InProgress;->INSTANCE:Lcom/smartengines/app/PhotoTakingState$InProgress;

    check-cast v0, Lcom/smartengines/app/PhotoTakingState;

    invoke-direct {p0, v0}, Lcom/smartengines/app/Model;->setPhotoTaking(Lcom/smartengines/app/PhotoTakingState;)V

    .line 489
    sget-object v0, Lcom/smartengines/app/Model;->cameraController:Landroidx/camera/view/LifecycleCameraController;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/camera/view/LifecycleCameraController;->setEnabledUseCases(I)V

    .line 490
    :cond_1
    sget-object v0, Lcom/smartengines/app/Model;->cameraController:Landroidx/camera/view/LifecycleCameraController;

    if-eqz v0, :cond_2

    sget-object v1, Lcom/smartengines/app/Model;->cameraExecutor:Ljava/util/concurrent/ExecutorService;

    check-cast v1, Ljava/util/concurrent/Executor;

    move-object v2, p0

    check-cast v2, Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;

    invoke-virtual {v0, v1, v2}, Landroidx/camera/view/LifecycleCameraController;->takePicture(Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;)V

    :cond_2
    :goto_0
    return-void
.end method
