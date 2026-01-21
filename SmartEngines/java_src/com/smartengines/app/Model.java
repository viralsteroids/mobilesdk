package com.smartengines.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.view.LifecycleCameraController;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.smartengines.app.ImageSaver;
import com.smartengines.app.PhotoTakingState;
import com.smartengines.app.p004ui.TargetsViewModel;
import com.smartengines.app.settings.BuildFlavor;
import com.smartengines.app.settings.VisualizationSettings;
import com.smartengines.app.targets.CodeTargetsKt;
import com.smartengines.app.targets.DocTargetsListKt;
import com.smartengines.app.targets.HomeScreenTargetsKt;
import com.smartengines.app.targets.IdTargetTestUtils;
import com.smartengines.app.targets.IdTargetsKt;
import com.smartengines.app.targets.TextTargetsKt;
import com.smartengines.app.targets.TreeItem;
import com.smartengines.app.targets.TreeLeaf;
import com.smartengines.camera.CameraUtilsKt;
import com.smartengines.camera.Frame;
import com.smartengines.common.ByteString;
import com.smartengines.common.Image;
import com.smartengines.engine.Engine;
import com.smartengines.engine.EngineBundle;
import com.smartengines.engine.EngineId;
import com.smartengines.engine.EngineLoader;
import com.smartengines.engine.EngineLoadingState;
import com.smartengines.engine.ImageProcessingState;
import com.smartengines.engine.ImageProcessor;
import com.smartengines.engine.RecognitionTarget;
import com.smartengines.engine.Result;
import com.smartengines.engine.Session;
import com.smartengines.engine.SessionType;
import com.smartengines.engine.code.CodeEngineWrapper;
import com.smartengines.engine.code.CodeResultData;
import com.smartengines.engine.doc.DocEngineWrapper;
import com.smartengines.engine.p005id.IdEngineWrapper;
import com.smartengines.engine.p005id.IdResultData;
import com.smartengines.engine.p005id.IdResultParserKt;
import com.smartengines.engine.p005id.IdSessionWrapper;
import com.smartengines.engine.text.TextEngineWrapper;
import com.smartengines.nfc.FaceImageData;
import com.smartengines.nfc.PassportData;
import com.smartengines.nfc.PassportKey;
import com.smartengines.nfc.PassportReader;
import com.smartengines.nfc.PassportReaderState;
import com.smartengines.p006id.IdResult;
import com.smartengines.p006id.IdSession;
import com.smartengines.targets.FacesTarget;
import com.smartengines.targets.p008id.IdTarget;
import com.smartengines.targets.p008id.LivenessTarget;
import com.smartengines.utils.ResourceFinder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Model.kt */
@Metadata(m513d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020KJ\b\u0010M\u001a\u00020KH\u0002J\b\u0010N\u001a\u00020KH\u0002J\u0006\u0010O\u001a\u00020KJ\u0006\u0010P\u001a\u00020KJ\u000e\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020gJ\b\u0010h\u001a\u0004\u0018\u00010gJ\b\u0010i\u001a\u0004\u0018\u00010gJ\u0010\u0010j\u001a\u00020K2\u0006\u0010k\u001a\u00020eH\u0002J\u000e\u0010l\u001a\u00020K2\u0006\u0010m\u001a\u00020\u001bJ\u0006\u0010n\u001a\u00020KJ\u0006\u0010o\u001a\u00020KJ\u0006\u0010p\u001a\u00020KJ\u0006\u0010q\u001a\u00020KJ\u000e\u0010r\u001a\u00020K2\u0006\u0010s\u001a\u00020tJ\u000e\u0010u\u001a\u00020K2\u0006\u0010s\u001a\u00020tJ\b\u0010v\u001a\u00020\"H\u0002J\u0006\u0010w\u001a\u00020KJ\u0006\u0010x\u001a\u00020KJ\u000e\u0010y\u001a\u00020K2\u0006\u0010z\u001a\u00020{J\u001a\u0010|\u001a\u00020K2\u0006\u0010}\u001a\u00020~2\b\u0010\u007f\u001a\u0004\u0018\u00010{H\u0002J\u0007\u0010\u0080\u0001\u001a\u00020KJ\u0007\u0010\u0081\u0001\u001a\u00020KJ\u0007\u0010\u0082\u0001\u001a\u00020KJ\u0013\u0010\u0083\u0001\u001a\u00020K2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0016J\t\u0010\u0086\u0001\u001a\u00020KH\u0002J\t\u0010\u0087\u0001\u001a\u00020KH\u0002J\u0011\u0010\u0088\u0001\u001a\u00020K2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001J\u0012\u0010\u0089\u0001\u001a\u00020K2\t\u0010/\u001a\u0005\u0018\u00010\u008a\u0001J\u0013\u0010\u008b\u0001\u001a\u00020K2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0002J\u000f\u0010\u008e\u0001\u001a\u00020K2\u0006\u0010s\u001a\u00020tJ*\u0010\u008f\u0001\u001a\u00020K2\b\u0010\u0090\u0001\u001a\u00030\u0091\u00012\u000e\u0010\u0092\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010\u001aH\u0082@¢\u0006\u0003\u0010\u0094\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0019\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000!¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\"\u00105\u001a\u0004\u0018\u0001042\b\u00103\u001a\u0004\u0018\u000104@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0018\u00108\u001a\n :*\u0004\u0018\u00010909X\u0082\u0004¢\u0006\u0004\n\u0002\u0010;R+\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020=8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR+\u0010E\u001a\u00020\"2\u0006\u0010<\u001a\u00020\"8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0011\u0010Q\u001a\u00020R¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0019\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010V0!¢\u0006\b\n\u0000\u001a\u0004\bW\u00102R\u0011\u0010X\u001a\u00020Y¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0011\u0010\\\u001a\u00020]¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0011\u0010`\u001a\u00020a¢\u0006\b\n\u0000\u001a\u0004\bb\u0010c¨\u0006\u0095\u0001"}, m514d2 = {"Lcom/smartengines/app/Model;", "Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;", "<init>", "()V", "TAG", "", "signature", "getSignature", "()Ljava/lang/String;", "jniLibrary", "getJniLibrary", "bundleCode", "Lcom/smartengines/engine/EngineBundle$File;", "getBundleCode", "()Lcom/smartengines/engine/EngineBundle$File;", "bundleId", "getBundleId", "bundleDoc", "getBundleDoc", "bundleText", "getBundleText", "engines", "Lcom/smartengines/app/EngineList;", "getEngines", "()Lcom/smartengines/app/EngineList;", "homeScreenTargets", "", "Lcom/smartengines/app/targets/TreeItem;", "getHomeScreenTargets", "()Ljava/util/List;", "setHomeScreenTargets", "(Ljava/util/List;)V", "_loadedState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "loadedState", "Lkotlinx/coroutines/flow/StateFlow;", "getLoadedState", "()Lkotlinx/coroutines/flow/StateFlow;", "imageProcessor", "Lcom/smartengines/engine/ImageProcessor;", "getImageProcessor", "()Lcom/smartengines/engine/ImageProcessor;", "session", "Lcom/smartengines/engine/Session;", "getSession", "()Lcom/smartengines/engine/Session;", "result", "Lcom/smartengines/engine/Result;", "getResult", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "value", "Landroidx/camera/view/LifecycleCameraController;", "cameraController", "getCameraController", "()Landroidx/camera/view/LifecycleCameraController;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ExecutorService;", "<set-?>", "Lcom/smartengines/app/PhotoTakingState;", "photoTaking", "getPhotoTaking", "()Lcom/smartengines/app/PhotoTakingState;", "setPhotoTaking", "(Lcom/smartengines/app/PhotoTakingState;)V", "photoTaking$delegate", "Landroidx/compose/runtime/MutableState;", "isFrontCamera", "()Z", "setFrontCamera", "(Z)V", "isFrontCamera$delegate", "switchCamera", "", "switchToFrontCamera", "switchToBackCamera", "applyIsFrontCamera", "switchTorchOn", "switchTorchState", "passportReader", "Lcom/smartengines/nfc/PassportReader;", "getPassportReader", "()Lcom/smartengines/nfc/PassportReader;", "error", "", "getError", "visualizationSettings", "Lcom/smartengines/app/settings/VisualizationSettings;", "getVisualizationSettings", "()Lcom/smartengines/app/settings/VisualizationSettings;", "buildFlavor", "Lcom/smartengines/app/settings/BuildFlavor;", "getBuildFlavor", "()Lcom/smartengines/app/settings/BuildFlavor;", "resourceFinder", "Lcom/smartengines/utils/ResourceFinder;", "getResourceFinder", "()Lcom/smartengines/utils/ResourceFinder;", "getEngineById", "Lcom/smartengines/app/EngineStaff;", "engineId", "Lcom/smartengines/engine/EngineId;", "getSelectedEngineId", "predictSelectedEngineId", "checkLoadedStatus", "engineStaff", "onNodeClick", "node", "onBack", "onResultDone", "onResultRepeat", "addNewPage", "load", "context", "Landroid/content/Context;", "onLoaded", "getModelLoadedState", "startVideoProcessing", "startCapturedPhotoProcessing", "onGalleryPhotoLoaded", "bitmap", "Landroid/graphics/Bitmap;", "startProcessing", "sessionType", "Lcom/smartengines/engine/SessionType;", "photo", "stopProcessing", "takePhoto", "clearTakenPhoto", "onCaptureSuccess", "imageProxy", "Landroidx/camera/core/ImageProxy;", "stopVideo", "startVideo", "onVideoFrame", "calculatePassportKey", "", "checkPassportNfcData", "passportData", "Lcom/smartengines/nfc/PassportData;", "check", "hiddenEngineInitialization", "engine", "Lcom/smartengines/engine/Engine;", "targets", "Lcom/smartengines/engine/RecognitionTarget;", "(Lcom/smartengines/engine/Engine;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class Model extends ImageCapture.OnImageCapturedCallback {
    public static final int $stable;
    private static final MutableStateFlow<Boolean> _loadedState;
    private static final BuildFlavor buildFlavor;
    private static LifecycleCameraController cameraController;
    private static final ExecutorService cameraExecutor;
    private static final EngineList engines;
    private static final MutableStateFlow<Throwable> error;
    private static final ImageProcessor imageProcessor;

    /* renamed from: isFrontCamera$delegate, reason: from kotlin metadata */
    private static final MutableState isFrontCamera;
    private static final StateFlow<Boolean> loadedState;
    private static final PassportReader passportReader;

    /* renamed from: photoTaking$delegate, reason: from kotlin metadata */
    private static final MutableState photoTaking;
    private static final ResourceFinder resourceFinder;
    private static final MutableStateFlow<Result> result;
    private static final VisualizationSettings visualizationSettings;
    public static final Model INSTANCE = new Model();
    private static final String TAG = "myapp.Model";
    private static final String signature = "3d49205bc8237c174fe3f018b4634d5d9339a8d0c33da45235c1f5c08e9efa28678882178c7064123b3032e8a642e6100d5f25d06a82244b9534c4df072aa6769fdcf7d6fe36e9bcce26266581c79fd30635de268756759d3601d6e6d214312f66d5e00f363ff5ebdb395a1ff8c62141a7832132e63b145ecac64ad090df62ac";
    private static final String jniLibrary = "jnimultiengine";
    private static final EngineBundle.File bundleCode = new EngineBundle.File(BuildConfig.bundleCode);
    private static final EngineBundle.File bundleId = new EngineBundle.File(BuildConfig.bundleId);
    private static final EngineBundle.File bundleDoc = new EngineBundle.File(BuildConfig.bundleDoc);
    private static final EngineBundle.File bundleText = new EngineBundle.File(BuildConfig.bundleText);
    private static List<? extends TreeItem> homeScreenTargets = CollectionsKt.emptyList();

    /* compiled from: Model.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EngineId.values().length];
            try {
                iArr[EngineId.CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EngineId.DOC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EngineId.f368ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EngineId.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Model.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.Model", m533f = "Model.kt", m534i = {0, 0}, m535l = {673}, m536m = "hiddenEngineInitialization", m537n = {"engine", "target"}, m538s = {"L$0", "L$2"})
    /* renamed from: com.smartengines.app.Model$hiddenEngineInitialization$1 */
    static final class C30621 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C30621(Continuation<? super C30621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Model.this.hiddenEngineInitialization(null, null, this);
        }
    }

    private Model() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        BuildFlavor buildFlavor2;
        int i = 2;
        engines = new EngineList(new EngineStaff(new EngineLoader(new CodeEngineWrapper("3d49205bc8237c174fe3f018b4634d5d9339a8d0c33da45235c1f5c08e9efa28678882178c7064123b3032e8a642e6100d5f25d06a82244b9534c4df072aa6769fdcf7d6fe36e9bcce26266581c79fd30635de268756759d3601d6e6d214312f66d5e00f363ff5ebdb395a1ff8c62141a7832132e63b145ecac64ad090df62ac")), null, i, null == true ? 1 : 0), new EngineStaff(new EngineLoader(new DocEngineWrapper("3d49205bc8237c174fe3f018b4634d5d9339a8d0c33da45235c1f5c08e9efa28678882178c7064123b3032e8a642e6100d5f25d06a82244b9534c4df072aa6769fdcf7d6fe36e9bcce26266581c79fd30635de268756759d3601d6e6d214312f66d5e00f363ff5ebdb395a1ff8c62141a7832132e63b145ecac64ad090df62ac")), null == true ? 1 : 0, i, null == true ? 1 : 0), new EngineStaff(new EngineLoader(new IdEngineWrapper("3d49205bc8237c174fe3f018b4634d5d9339a8d0c33da45235c1f5c08e9efa28678882178c7064123b3032e8a642e6100d5f25d06a82244b9534c4df072aa6769fdcf7d6fe36e9bcce26266581c79fd30635de268756759d3601d6e6d214312f66d5e00f363ff5ebdb395a1ff8c62141a7832132e63b145ecac64ad090df62ac")), null == true ? 1 : 0, i, null == true ? 1 : 0), new EngineStaff(new EngineLoader(new TextEngineWrapper("3d49205bc8237c174fe3f018b4634d5d9339a8d0c33da45235c1f5c08e9efa28678882178c7064123b3032e8a642e6100d5f25d06a82244b9534c4df072aa6769fdcf7d6fe36e9bcce26266581c79fd30635de268756759d3601d6e6d214312f66d5e00f363ff5ebdb395a1ff8c62141a7832132e63b145ecac64ad090df62ac")), null == true ? 1 : 0, i, null == true ? 1 : 0));
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        _loadedState = MutableStateFlow;
        loadedState = FlowKt.asStateFlow(MutableStateFlow);
        imageProcessor = new ImageProcessor(SessionSettingsLoggerImpl.INSTANCE);
        result = StateFlowKt.MutableStateFlow(null);
        cameraExecutor = Executors.newSingleThreadExecutor();
        photoTaking = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PhotoTakingState.Inactive.INSTANCE, null, 2, null);
        isFrontCamera = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        passportReader = new PassportReader(Dependencies.INSTANCE.getNfcReadingEngine());
        error = StateFlowKt.MutableStateFlow(null);
        float f = 2;
        visualizationSettings = new VisualizationSettings(C1959Dp.m7055constructorimpl(f), C1959Dp.m7055constructorimpl(f), Color.INSTANCE.m4626getGreen0d7_KjU(), Color.INSTANCE.m4626getGreen0d7_KjU(), Color.INSTANCE.m4632getWhite0d7_KjU(), null);
        switch (BuildConfig.FLAVOR.hashCode()) {
            case -1764661465:
                if (BuildConfig.FLAVOR.equals("nightlysebeta")) {
                    buildFlavor2 = BuildFlavor.NIGHTLY;
                    buildFlavor = buildFlavor2;
                    resourceFinder = new ResourceFinder(C3069R.drawable.home_anypassport);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C30601(null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C30612(null), 3, null);
                    $stable = 8;
                    return;
                }
                break;
            case -906319038:
                if (BuildConfig.FLAVOR.equals("sebeta")) {
                    buildFlavor2 = BuildFlavor.BETA;
                    buildFlavor = buildFlavor2;
                    resourceFinder = new ResourceFinder(C3069R.drawable.home_anypassport);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C30601(null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C30612(null), 3, null);
                    $stable = 8;
                    return;
                }
                break;
            case 109770977:
                if (BuildConfig.FLAVOR.equals(BuildConfig.FLAVOR)) {
                    buildFlavor2 = BuildFlavor.STORE;
                    buildFlavor = buildFlavor2;
                    resourceFinder = new ResourceFinder(C3069R.drawable.home_anypassport);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C30601(null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C30612(null), 3, null);
                    $stable = 8;
                    return;
                }
                break;
            case 467078235:
                if (BuildConfig.FLAVOR.equals("forensic")) {
                    buildFlavor2 = BuildFlavor.FORENSIC;
                    buildFlavor = buildFlavor2;
                    resourceFinder = new ResourceFinder(C3069R.drawable.home_anypassport);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C30601(null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C30612(null), 3, null);
                    $stable = 8;
                    return;
                }
                break;
            case 1555586174:
                if (BuildConfig.FLAVOR.equals("rustore")) {
                    buildFlavor2 = BuildFlavor.RUSTORE;
                    buildFlavor = buildFlavor2;
                    resourceFinder = new ResourceFinder(C3069R.drawable.home_anypassport);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C30601(null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C30612(null), 3, null);
                    $stable = 8;
                    return;
                }
                break;
        }
        throw new Exception("Model does not know the FLAVOR NAME: store");
    }

    public final String getSignature() {
        return signature;
    }

    public final String getJniLibrary() {
        return jniLibrary;
    }

    public final EngineBundle.File getBundleCode() {
        return bundleCode;
    }

    public final EngineBundle.File getBundleId() {
        return bundleId;
    }

    public final EngineBundle.File getBundleDoc() {
        return bundleDoc;
    }

    public final EngineBundle.File getBundleText() {
        return bundleText;
    }

    public final EngineList getEngines() {
        return engines;
    }

    public final List<TreeItem> getHomeScreenTargets() {
        return homeScreenTargets;
    }

    public final void setHomeScreenTargets(List<? extends TreeItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        homeScreenTargets = list;
    }

    public final StateFlow<Boolean> getLoadedState() {
        return loadedState;
    }

    public final ImageProcessor getImageProcessor() {
        return imageProcessor;
    }

    public final Session getSession() {
        return imageProcessor.getSession();
    }

    public final MutableStateFlow<Result> getResult() {
        return result;
    }

    public final LifecycleCameraController getCameraController() {
        return cameraController;
    }

    private final void setPhotoTaking(PhotoTakingState photoTakingState) {
        photoTaking.setValue(photoTakingState);
    }

    public final PhotoTakingState getPhotoTaking() {
        return (PhotoTakingState) photoTaking.getValue();
    }

    private final void setFrontCamera(boolean z) {
        isFrontCamera.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isFrontCamera() {
        return ((Boolean) isFrontCamera.getValue()).booleanValue();
    }

    public final void switchCamera() {
        setFrontCamera(!isFrontCamera());
        applyIsFrontCamera();
    }

    public final void switchToFrontCamera() {
        if (isFrontCamera()) {
            return;
        }
        setFrontCamera(true);
        applyIsFrontCamera();
    }

    private final void switchToBackCamera() {
        if (isFrontCamera()) {
            setFrontCamera(false);
            applyIsFrontCamera();
        }
    }

    private final void applyIsFrontCamera() {
        LifecycleCameraController lifecycleCameraController = cameraController;
        if (lifecycleCameraController != null) {
            lifecycleCameraController.setCameraSelector(isFrontCamera() ? CameraSelector.DEFAULT_FRONT_CAMERA : CameraSelector.DEFAULT_BACK_CAMERA);
        }
    }

    public final void switchTorchOn() {
        LifecycleCameraController lifecycleCameraController = cameraController;
        if (lifecycleCameraController != null) {
            lifecycleCameraController.enableTorch(true);
        }
    }

    public final void switchTorchState() {
        LifecycleCameraController lifecycleCameraController = cameraController;
        if (lifecycleCameraController != null) {
            Integer value = lifecycleCameraController.getTorchState().getValue();
            boolean z = true;
            if (value != null && value.intValue() == 1) {
                z = false;
            }
            lifecycleCameraController.enableTorch(z);
        }
    }

    public final PassportReader getPassportReader() {
        return passportReader;
    }

    public final MutableStateFlow<Throwable> getError() {
        return error;
    }

    public final VisualizationSettings getVisualizationSettings() {
        return visualizationSettings;
    }

    public final BuildFlavor getBuildFlavor() {
        return buildFlavor;
    }

    public final ResourceFinder getResourceFinder() {
        return resourceFinder;
    }

    public final EngineStaff getEngineById(EngineId engineId) {
        Intrinsics.checkNotNullParameter(engineId, "engineId");
        int i = WhenMappings.$EnumSwitchMapping$0[engineId.ordinal()];
        if (i == 1) {
            return engines.getCode();
        }
        if (i == 2) {
            return engines.getDoc();
        }
        if (i == 3) {
            return engines.getId();
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return engines.getText();
    }

    public final EngineId getSelectedEngineId() {
        try {
            TreeLeaf selectedLeaf = AppViewModel.INSTANCE.getSelectedLeaf();
            Intrinsics.checkNotNull(selectedLeaf);
            return selectedLeaf.getTarget().getEngineId();
        } catch (Throwable th) {
            Log.e(TAG, "getSelectedEngineId", th);
            return null;
        }
    }

    public final EngineId predictSelectedEngineId() {
        try {
            TargetsViewModel selectedGroup = AppViewModel.INSTANCE.getSelectedGroup();
            Intrinsics.checkNotNull(selectedGroup);
            Object objFirst = CollectionsKt.first((List<? extends Object>) selectedGroup.getTreeGroup().getChildren());
            Intrinsics.checkNotNull(objFirst, "null cannot be cast to non-null type com.smartengines.app.targets.TreeLeaf");
            return ((TreeLeaf) objFirst).getTarget().getEngineId();
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void checkLoadedStatus(EngineStaff engineStaff) throws AppInternalError {
        if (!(engineStaff.getLoader().getLoadingState().getValue() instanceof EngineLoadingState.Loaded)) {
            throw new AppInternalError("The engine is not loaded");
        }
    }

    public final void onNodeClick(TreeItem node) {
        Intrinsics.checkNotNullParameter(node, "node");
        Log.w(TAG, "onNodeClick " + node.getName() + ' ' + node.getClass().getSimpleName());
        AppViewModel.INSTANCE.onNodeClick(node);
        if (node instanceof TreeLeaf) {
            TreeLeaf treeLeaf = (TreeLeaf) node;
            if ((treeLeaf.getTarget() instanceof LivenessTarget) || (treeLeaf.getTarget() instanceof FacesTarget)) {
                switchToFrontCamera();
            } else {
                switchToBackCamera();
            }
            CameraButtonsModel.INSTANCE.onTargetChanged(treeLeaf.getTarget());
        }
    }

    public final void onBack() {
        Log.w(TAG, "onBack");
        if (!Intrinsics.areEqual(getPhotoTaking(), PhotoTakingState.Inactive.INSTANCE)) {
            setPhotoTaking(PhotoTakingState.Inactive.INSTANCE);
            if (imageProcessor.getState().getValue() instanceof ImageProcessingState.WAITING) {
                return;
            }
        }
        imageProcessor.clear();
        if (AppViewModel.INSTANCE.onBack()) {
            return;
        }
        MainActivityKt.exitApp();
    }

    public final void onResultDone() {
        Log.w(TAG, "onResultDone");
        onBack();
    }

    public final void onResultRepeat() {
        Log.w(TAG, "onResultRepeat");
        setPhotoTaking(PhotoTakingState.Inactive.INSTANCE);
        imageProcessor.clear();
    }

    public final void addNewPage() {
        Log.w(TAG, "addNewPage");
        setPhotoTaking(PhotoTakingState.Inactive.INSTANCE);
        imageProcessor.restart();
    }

    public final void load(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = TAG;
        Log.w(str, "load");
        try {
            LifecycleCameraController lifecycleCameraController = new LifecycleCameraController(context);
            lifecycleCameraController.setEnabledUseCases(0);
            ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setResolutionStrategy(ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY).build();
            Intrinsics.checkNotNullExpressionValue(resolutionSelectorBuild, "build(...)");
            lifecycleCameraController.setImageAnalysisResolutionSelector(resolutionSelectorBuild);
            lifecycleCameraController.setImageCaptureResolutionSelector(resolutionSelectorBuild);
            ExecutorService executorService = cameraExecutor;
            final Model model = INSTANCE;
            lifecycleCameraController.setImageAnalysisAnalyzer(executorService, new ImageAnalysis.Analyzer() { // from class: com.smartengines.app.Model$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.ImageAnalysis.Analyzer
                public final void analyze(ImageProxy imageProxy) {
                    this.f$0.onVideoFrame(imageProxy);
                }
            });
            cameraController = lifecycleCameraController;
            applyIsFrontCamera();
            Log.d(str, "camera controller created");
        } catch (Exception e) {
            Log.e(TAG, "init camera", e);
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C30632(null), 3, null);
        EngineList engineList = engines;
        EngineLoader loader = engineList.getId().getLoader();
        String str2 = jniLibrary;
        loader.load(context, str2, bundleId, new C30643(context, null));
        engineList.getCode().getLoader().load(context, str2, bundleCode, new C30654(context, null));
        engineList.getDoc().getLoader().load(context, str2, bundleDoc, new C30665(context, null));
        engineList.getText().getLoader().load(context, str2, bundleText, new C30676(context, null));
        Iterator<T> it = engineList.getAsList().iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new Model$load$7$1((EngineStaff) it.next(), context, null), 3, null);
        }
    }

    /* compiled from: Model.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.Model$load$2", m533f = "Model.kt", m534i = {}, m535l = {305}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.Model$load$2 */
    static final class C30632 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C30632(Continuation<? super C30632> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30632(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Model.INSTANCE.getImageProcessor().getState().collect(new FlowCollector() { // from class: com.smartengines.app.Model.load.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ImageProcessingState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ImageProcessingState imageProcessingState, Continuation<? super Unit> continuation) {
                        Log.e(Model.TAG, "image processor state: " + imageProcessingState);
                        if (!(imageProcessingState instanceof ImageProcessingState.VIDEO_PROCESSING) || ((ImageProcessingState.VIDEO_PROCESSING) imageProcessingState).getVisualizations() == null) {
                            Model.INSTANCE.stopVideo();
                        } else {
                            Model.INSTANCE.startVideo();
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: Model.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m514d2 = {"<anonymous>", "", "engine", "Lcom/smartengines/engine/Engine;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.Model$load$3", m533f = "Model.kt", m534i = {}, m535l = {}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.Model$load$3 */
    static final class C30643 extends SuspendLambda implements Function2<Engine, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30643(Context context, Continuation<? super C30643> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30643 c30643 = new C30643(this.$context, continuation);
            c30643.L$0 = obj;
            return c30643;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Engine engine, Continuation<? super Unit> continuation) {
            return ((C30643) create(engine, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Engine engine = (Engine) this.L$0;
            EngineStaff id = Model.INSTANCE.getEngines().getId();
            Context context = this.$context;
            Intrinsics.checkNotNull(engine, "null cannot be cast to non-null type com.smartengines.engine.id.IdEngineWrapper");
            id.setTargets(IdTargetsKt.loadIdTargetList$default(context, ((IdEngineWrapper) engine).getIdEngine(), null, 4, null));
            Log.w(Model.TAG, "id-engine target list is loaded");
            if (Model.INSTANCE.getBuildFlavor() == BuildFlavor.NIGHTLY) {
                IdTargetTestUtils.INSTANCE.runTests();
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: Model.kt */
        @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
        @DebugMetadata(m532c = "com.smartengines.app.Model$load$3$1", m533f = "Model.kt", m534i = {}, m535l = {331}, m536m = "invokeSuspend", m537n = {}, m538s = {})
        /* renamed from: com.smartengines.app.Model$load$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Model model = Model.INSTANCE;
                    Engine engine = Model.INSTANCE.getEngines().getId().getLoader().getEngine();
                    IdTarget[] idTargetArr = {new IdTarget("anydoc", "*"), new IdTarget("anycis", "*"), new IdTarget("anyrus", "*")};
                    this.label = 1;
                    if (model.hiddenEngineInitialization(engine, CollectionsKt.listOf((Object[]) idTargetArr), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: Model.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m514d2 = {"<anonymous>", "", "engine", "Lcom/smartengines/engine/Engine;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.Model$load$4", m533f = "Model.kt", m534i = {}, m535l = {}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.Model$load$4 */
    static final class C30654 extends SuspendLambda implements Function2<Engine, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30654(Context context, Continuation<? super C30654> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30654 c30654 = new C30654(this.$context, continuation);
            c30654.L$0 = obj;
            return c30654;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Engine engine, Continuation<? super Unit> continuation) {
            return ((C30654) create(engine, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Engine engine = (Engine) this.L$0;
            EngineStaff code = Model.INSTANCE.getEngines().getCode();
            Context context = this.$context;
            Intrinsics.checkNotNull(engine, "null cannot be cast to non-null type com.smartengines.engine.code.CodeEngineWrapper");
            code.setTargets(CodeTargetsKt.loadCodeTargetList(context, ((CodeEngineWrapper) engine).getCodeEngine()));
            Log.w(Model.TAG, "code-engine target list  is loaded");
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Model.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m514d2 = {"<anonymous>", "", "engine", "Lcom/smartengines/engine/Engine;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.Model$load$5", m533f = "Model.kt", m534i = {}, m535l = {}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.Model$load$5 */
    static final class C30665 extends SuspendLambda implements Function2<Engine, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30665(Context context, Continuation<? super C30665> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30665 c30665 = new C30665(this.$context, continuation);
            c30665.L$0 = obj;
            return c30665;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Engine engine, Continuation<? super Unit> continuation) {
            return ((C30665) create(engine, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Engine engine = (Engine) this.L$0;
            EngineStaff doc = Model.INSTANCE.getEngines().getDoc();
            Context context = this.$context;
            Intrinsics.checkNotNull(engine, "null cannot be cast to non-null type com.smartengines.engine.doc.DocEngineWrapper");
            doc.setTargets(DocTargetsListKt.loadDocTargetList(context, ((DocEngineWrapper) engine).getDocEngine(), null));
            Log.w(Model.TAG, "doc-engine target list is loaded");
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Model.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m514d2 = {"<anonymous>", "", "engine", "Lcom/smartengines/engine/Engine;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.Model$load$6", m533f = "Model.kt", m534i = {}, m535l = {}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.Model$load$6 */
    static final class C30676 extends SuspendLambda implements Function2<Engine, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30676(Context context, Continuation<? super C30676> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30676 c30676 = new C30676(this.$context, continuation);
            c30676.L$0 = obj;
            return c30676;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Engine engine, Continuation<? super Unit> continuation) {
            return ((C30676) create(engine, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Engine engine = (Engine) this.L$0;
            EngineStaff text = Model.INSTANCE.getEngines().getText();
            Context context = this.$context;
            Intrinsics.checkNotNull(engine, "null cannot be cast to non-null type com.smartengines.engine.text.TextEngineWrapper");
            text.setTargets(TextTargetsKt.loadTextTargetList(context, ((TextEngineWrapper) engine).getTextEngine(), null));
            Log.w(Model.TAG, "text-engine target list is loaded");
            return Unit.INSTANCE;
        }
    }

    public final void onLoaded(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        homeScreenTargets = HomeScreenTargetsKt.loadHomeScreenTargets(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getModelLoadedState() {
        Iterator<T> it = engines.getAsList().iterator();
        while (it.hasNext()) {
            EngineLoadingState value = ((EngineStaff) it.next()).getLoader().getLoadingState().getValue();
            if (Intrinsics.areEqual(value, EngineLoadingState.Unloaded.INSTANCE) || Intrinsics.areEqual(value, EngineLoadingState.Loading.INSTANCE)) {
                return false;
            }
        }
        return true;
    }

    public final void startVideoProcessing() {
        startProcessing(SessionType.VIDEO_SESSION, null);
    }

    public final void startCapturedPhotoProcessing() {
        PhotoTakingState photoTaking2 = getPhotoTaking();
        if (photoTaking2 instanceof PhotoTakingState.Ready) {
            PhotoTakingState.Ready ready = (PhotoTakingState.Ready) photoTaking2;
            INSTANCE.startProcessing(ready.getFromGallery() ? SessionType.GALLERY_SESSION : SessionType.PHOTO_SESSION, ready.getPhoto().getBitmap());
            if (AppKt.getCommonSettingsStore().getData().getValue().getSavePhoto()) {
                ImageSaver.INSTANCE.saveImage(ImageSaver.Dir.Photo, ready.getPhoto().getBitmap());
                return;
            }
            return;
        }
        Log.e(TAG, "Photo is not ready, photoTaking: " + photoTaking2);
    }

    public final void onGalleryPhotoLoaded(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        setPhotoTaking(new PhotoTakingState.Ready(new Photo(bitmap), true));
    }

    private final void startProcessing(SessionType sessionType, Bitmap photo) {
        try {
            TreeLeaf selectedLeaf = AppViewModel.INSTANCE.getSelectedLeaf();
            Intrinsics.checkNotNull(selectedLeaf);
            RecognitionTarget target = selectedLeaf.getTarget();
            imageProcessor.startProcessing(getEngineById(target.getEngineId()).getLoader().getEngine(), target, sessionType, photo);
        } catch (Throwable th) {
            error.setValue(th);
        }
    }

    public final void stopProcessing() {
        imageProcessor.stopProcessing();
    }

    /* compiled from: Model.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.Model$1", m533f = "Model.kt", m534i = {}, m535l = {453}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.Model$1 */
    static final class C30601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C30601(Continuation<? super C30601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Model.INSTANCE.getImageProcessor().getState().collect(new FlowCollector() { // from class: com.smartengines.app.Model.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ImageProcessingState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ImageProcessingState imageProcessingState, Continuation<? super Unit> continuation) {
                        Result currentResult;
                        Log.e(Model.TAG, "===================== imageProcessor state: " + imageProcessingState);
                        Result result = null;
                        if ((imageProcessingState instanceof ImageProcessingState.VIDEO_PROCESSING) || (imageProcessingState instanceof ImageProcessingState.PHOTO_PROCESSING)) {
                            if (Model.INSTANCE.getBuildFlavor() == BuildFlavor.FORENSIC && AppKt.getIdSettingsStore().getData().getValue().getFlashByDefault()) {
                                Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C40041(null), continuation);
                                return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
                            }
                        } else if (imageProcessingState instanceof ImageProcessingState.FINISHED) {
                            MutableStateFlow<Result> result2 = Model.INSTANCE.getResult();
                            Session session = Model.INSTANCE.getSession();
                            if (session != null && (currentResult = session.getCurrentResult()) != null) {
                                Model.INSTANCE.calculatePassportKey(currentResult);
                                result = currentResult;
                            }
                            result2.setValue(result);
                        } else {
                            Model.INSTANCE.getResult().setValue(null);
                        }
                        return Unit.INSTANCE;
                    }

                    /* compiled from: Model.kt */
                    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
                    @DebugMetadata(m532c = "com.smartengines.app.Model$1$1$1", m533f = "Model.kt", m534i = {}, m535l = {}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                    /* renamed from: com.smartengines.app.Model$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C40041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        int label;

                        C40041(Continuation<? super C40041> continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C40041(continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C40041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            Model.INSTANCE.switchTorchOn();
                            return Unit.INSTANCE;
                        }
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final void takePhoto() {
        Log.w(TAG, "takePhoto");
        if (Intrinsics.areEqual(getPhotoTaking(), PhotoTakingState.InProgress.INSTANCE)) {
            return;
        }
        setPhotoTaking(PhotoTakingState.InProgress.INSTANCE);
        LifecycleCameraController lifecycleCameraController = cameraController;
        if (lifecycleCameraController != null) {
            lifecycleCameraController.setEnabledUseCases(1);
        }
        LifecycleCameraController lifecycleCameraController2 = cameraController;
        if (lifecycleCameraController2 != null) {
            lifecycleCameraController2.takePicture(cameraExecutor, this);
        }
    }

    public final void clearTakenPhoto() {
        Log.w(TAG, "clearTakenPhoto");
        setPhotoTaking(PhotoTakingState.Inactive.INSTANCE);
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public void onCaptureSuccess(ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        super.onCaptureSuccess(imageProxy);
        Log.w(TAG, "onCaptureSuccess image size:" + imageProxy.getWidth() + 'x' + imageProxy.getHeight() + ' ');
        if (Intrinsics.areEqual(getPhotoTaking(), PhotoTakingState.InProgress.INSTANCE)) {
            setPhotoTaking(new PhotoTakingState.Ready(new Photo(CameraUtilsKt.toBitmapLikeInPreview$default(imageProxy, MainActivity.INSTANCE.getInstance(), isFrontCamera(), null, 4, null)), false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopVideo() {
        Log.w(TAG, "stopVideo");
        LifecycleCameraController lifecycleCameraController = cameraController;
        if (lifecycleCameraController != null) {
            lifecycleCameraController.setEnabledUseCases(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startVideo() {
        Log.d(TAG, "startVideo");
        LifecycleCameraController lifecycleCameraController = cameraController;
        if (lifecycleCameraController != null) {
            lifecycleCameraController.setEnabledUseCases(2);
        }
    }

    public final void onVideoFrame(ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        Log.d(TAG, " --- video frame");
        Bitmap bitmapLikeInPreview$default = CameraUtilsKt.toBitmapLikeInPreview$default(imageProxy, MainActivity.INSTANCE.getInstance(), isFrontCamera(), null, 4, null);
        imageProcessor.addFrame(new Frame(bitmapLikeInPreview$default, imageProxy));
        if (AppKt.getCommonSettingsStore().getData().getValue().getSaveVideo()) {
            ImageSaver.INSTANCE.saveImage(ImageSaver.Dir.Video, bitmapLikeInPreview$default);
        }
    }

    public final void calculatePassportKey(Object result2) {
        PassportReader passportReader2 = passportReader;
        PassportKey passportKeyCalculatePassportKey = null;
        passportReader2.reset(null);
        MutableStateFlow<PassportKey> passportKeyFlow = passportReader2.getPassportKeyFlow();
        if (result2 instanceof CodeResultData) {
            passportKeyCalculatePassportKey = PassportKeyKt.calculatePassportKey((CodeResultData) result2);
        } else if (result2 instanceof IdResultData) {
            passportKeyCalculatePassportKey = PassportKeyKt.calculatePassportKey((IdResultData) result2);
        }
        passportKeyFlow.setValue(passportKeyCalculatePassportKey);
    }

    /* compiled from: Model.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.Model$2", m533f = "Model.kt", m534i = {}, m535l = {551}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.Model$2 */
    static final class C30612 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C30612(Continuation<? super C30612> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30612(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (Model.INSTANCE.getPassportReader().getStateFlow().collect(new FlowCollector() { // from class: com.smartengines.app.Model.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PassportReaderState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PassportReaderState passportReaderState, Continuation<? super Unit> continuation) throws JSONException {
                        Log.e(Model.TAG, "********************** passportReader.state: " + passportReaderState);
                        if ((passportReaderState instanceof PassportReaderState.Data) && AppKt.getIdSettingsStore().getData().getValue().getEnableForensics() && (Model.INSTANCE.getImageProcessor().getState().getValue() instanceof ImageProcessingState.FINISHED)) {
                            Model.INSTANCE.checkPassportNfcData(((PassportReaderState.Data) passportReaderState).getData());
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkPassportNfcData(PassportData passportData) throws JSONException {
        Session session = imageProcessor.getSession();
        Result value = result.getValue();
        if ((session instanceof IdSessionWrapper) && (value instanceof IdResultData)) {
            IdSession idSession = ((IdSessionWrapper) session).getIdSession();
            String singleLine = passportData.getMrzInfo().toSingleLine();
            FaceImageData faceImageData = (FaceImageData) CollectionsKt.firstOrNull((List) passportData.getFacesData());
            String strGetCStr = null;
            if (faceImageData != null) {
                try {
                    strGetCStr = Image.FromFileBuffer(faceImageData.getBuffer()).GetBase64String().GetCStr();
                } catch (Exception e) {
                    Log.e(TAG, "Decoding passport photo error", e);
                }
            }
            JSONObject jSONObjectPut = new JSONObject().put("doc_type", ((IdResultData) value).getDocType());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rfid_mrz", new JSONObject().put("value", singleLine).put("type", "String"));
            if (strGetCStr != null) {
                jSONObject.put("rfid_photo", new JSONObject().put("value", strGetCStr).put("type", "Image"));
            }
            Map mapMapOf = MapsKt.mapOf(TuplesKt.m521to("COM", "rfid_com"), TuplesKt.m521to("SOD", "rfid_sod"), TuplesKt.m521to("DG1", "rfid_dg1"), TuplesKt.m521to("DG2", "rfid_dg2"), TuplesKt.m521to("DG7", "rfid_dg7"), TuplesKt.m521to("DG11", "rfid_dg11"), TuplesKt.m521to("DG12", "rfid_dg12"), TuplesKt.m521to("DG14", "rfid_dg14"), TuplesKt.m521to("DG15", "rfid_dg15"));
            for (Map.Entry<String, String> entry : passportData.getOtherFields().entrySet()) {
                String key = entry.getKey();
                String value2 = entry.getValue();
                String str = (String) mapMapOf.get(key);
                if (str != null) {
                    jSONObject.put(str, new JSONObject().put("value", value2).put("type", "String"));
                }
            }
            Unit unit = Unit.INSTANCE;
            JSONObject jSONObjectPut2 = jSONObjectPut.put("physical_fields", jSONObject);
            try {
                String str2 = TAG;
                Log.w(str2, "Start RFID data check by the current session. Data: " + jSONObjectPut2);
                String string = jSONObjectPut2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                byte[] bytes = string.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                IdResult idResultProcess = idSession.Process(new ByteString(bytes));
                Log.w(str2, "rfid result checking finished");
                MutableStateFlow<Result> mutableStateFlow = result;
                Intrinsics.checkNotNull(idResultProcess);
                mutableStateFlow.setValue(IdResultData.copy$default((IdResultData) value, null, null, null, null, IdResultParserKt.parseForensicCheckFields(idResultProcess), null, null, null, 239, null));
                Unit unit2 = Unit.INSTANCE;
            } catch (Exception e2) {
                Integer.valueOf(Log.e(TAG, "RFID data processing", e2));
            }
        }
    }

    public final void check(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = TAG;
        Log.w(str, "check");
        try {
            System.loadLibrary("jnimultiengine");
            Image.CreateEmpty();
            String[] list = context.getAssets().list("bundles");
            StringBuilder sb = new StringBuilder("assets: ");
            Intrinsics.checkNotNull(list);
            Log.w(str, sb.append(list.length).toString());
            for (String str2 : list) {
                Log.w(TAG, "   - " + str2);
            }
        } catch (Throwable th) {
            Log.e(TAG, "load", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008e -> B:29:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hiddenEngineInitialization(Engine engine, List<? extends RecognitionTarget> list, Continuation<? super Unit> continuation) {
        C30621 c30621;
        Iterator it;
        if (continuation instanceof C30621) {
            c30621 = (C30621) continuation;
            if ((c30621.label & Integer.MIN_VALUE) != 0) {
                c30621.label -= Integer.MIN_VALUE;
            } else {
                c30621 = new C30621(continuation);
            }
        }
        Object obj = c30621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c30621.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            it = list.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RecognitionTarget recognitionTarget = (RecognitionTarget) c30621.L$2;
            it = (Iterator) c30621.L$1;
            Engine engine2 = (Engine) c30621.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                Log.e(TAG, "hiddenEngineInitialization target: " + recognitionTarget, th);
            }
            engine = engine2;
            if (it.hasNext()) {
                RecognitionTarget recognitionTarget2 = (RecognitionTarget) it.next();
                try {
                } catch (Throwable th2) {
                    engine2 = engine;
                    Log.e(TAG, "hiddenEngineInitialization target: " + recognitionTarget2, th2);
                }
                String str = TAG;
                Log.w(str, "===== create a dummy session for initialization, target: " + recognitionTarget2);
                Session sessionCreateSession = recognitionTarget2.createSession(engine, SessionType.VIDEO_SESSION, null);
                Log.w(str, "===== the dummy session created");
                sessionCreateSession.delete();
                c30621.L$0 = engine;
                c30621.L$1 = it;
                c30621.L$2 = recognitionTarget2;
                c30621.label = 1;
                if (DelayKt.delay(1L, c30621) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                engine2 = engine;
                engine = engine2;
                if (it.hasNext()) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
