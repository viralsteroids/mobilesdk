package com.smartengines.app.com.smartengines.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.view.LifecycleCameraController;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.smartengines.app.MainActivity;
import com.smartengines.app.Model;
import com.smartengines.app.com.smartengines.app.SlotState;
import com.smartengines.camera.CameraUtilsKt;
import com.smartengines.engine.Engine;
import com.smartengines.engine.p005id.FacesKt;
import com.smartengines.engine.p005id.FacesResult;
import com.smartengines.engine.p005id.IdEngineWrapper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: FacesModel.kt */
@Metadata(m513d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010.\u001a\u00020/J\b\u00100\u001a\u00020/H\u0002J\u0018\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0005H\u0002J\u000e\u00104\u001a\u00020/2\u0006\u00105\u001a\u000206J\u000e\u00107\u001a\u00020/2\u0006\u00108\u001a\u00020\u0005J\u0006\u00109\u001a\u00020/J\u0010\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020<H\u0016R7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR/\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010#\u001a\n %*\u0004\u0018\u00010$0$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010&R+\u0010(\u001a\u00020'2\u0006\u0010\b\u001a\u00020'8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0011\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010-\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, m514d2 = {"Lcom/smartengines/app/com/smartengines/app/FacesModel;", "Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;", "context", "Landroid/content/Context;", "photo", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap;)V", "<set-?>", "", "Lcom/smartengines/app/com/smartengines/app/SlotState;", "slots", "getSlots", "()Ljava/util/List;", "setSlots", "(Ljava/util/List;)V", "slots$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/smartengines/engine/id/FacesResult;", "result", "getResult", "()Lcom/smartengines/engine/id/FacesResult;", "setResult", "(Lcom/smartengines/engine/id/FacesResult;)V", "result$delegate", "processingJob", "Lkotlinx/coroutines/Job;", "getProcessingJob", "()Lkotlinx/coroutines/Job;", "setProcessingJob", "(Lkotlinx/coroutines/Job;)V", "cameraController", "Landroidx/camera/view/LifecycleCameraController;", "getCameraController", "()Landroidx/camera/view/LifecycleCameraController;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ExecutorService;", "", "isPhotoTaking", "()Z", "setPhotoTaking", "(Z)V", "isPhotoTaking$delegate", "isFrontCamera", "switchCamera", "", "applyIsFrontCamera", "startProcessing", "bitmapA", "bitmapB", "onSlotClick", "index", "", "onPhotoTaken", "bitmap", "takePhoto", "onCaptureSuccess", "imageProxy", "Landroidx/camera/core/ImageProxy;", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class FacesModel extends ImageCapture.OnImageCapturedCallback {
    public static final int $stable = 8;
    private final LifecycleCameraController cameraController;
    private final ExecutorService cameraExecutor;
    private boolean isFrontCamera;

    /* renamed from: isPhotoTaking$delegate, reason: from kotlin metadata */
    private final MutableState isPhotoTaking;
    private Job processingJob;

    /* renamed from: result$delegate, reason: from kotlin metadata */
    private final MutableState result;

    /* renamed from: slots$delegate, reason: from kotlin metadata */
    private final MutableState slots;

    public FacesModel(Context context, Bitmap bitmap) {
        List listListOf;
        Intrinsics.checkNotNullParameter(context, "context");
        this.slots = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((bitmap == null || (listListOf = CollectionsKt.listOf((Object[]) new SlotState[]{new SlotState.PHOTO(bitmap), SlotState.CAMERA.INSTANCE})) == null) ? CollectionsKt.listOf((Object[]) new SlotState[]{SlotState.CAMERA.INSTANCE, SlotState.EMPTY.INSTANCE}) : listListOf, null, 2, null);
        this.result = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.cameraExecutor = Executors.newSingleThreadExecutor();
        this.isPhotoTaking = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isFrontCamera = true;
        Log.d("myapp.FacesModel", "init photo: " + bitmap);
        LifecycleCameraController lifecycleCameraController = new LifecycleCameraController(context);
        lifecycleCameraController.setEnabledUseCases(1);
        ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setResolutionStrategy(ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY).build();
        Intrinsics.checkNotNullExpressionValue(resolutionSelectorBuild, "build(...)");
        lifecycleCameraController.setImageCaptureResolutionSelector(resolutionSelectorBuild);
        this.cameraController = lifecycleCameraController;
        applyIsFrontCamera();
    }

    public final List<SlotState> getSlots() {
        return (List) this.slots.getValue();
    }

    public final void setSlots(List<? extends SlotState> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.slots.setValue(list);
    }

    public final FacesResult getResult() {
        return (FacesResult) this.result.getValue();
    }

    public final void setResult(FacesResult facesResult) {
        this.result.setValue(facesResult);
    }

    public final Job getProcessingJob() {
        return this.processingJob;
    }

    public final void setProcessingJob(Job job) {
        this.processingJob = job;
    }

    public final LifecycleCameraController getCameraController() {
        return this.cameraController;
    }

    private final void setPhotoTaking(boolean z) {
        this.isPhotoTaking.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPhotoTaking() {
        return ((Boolean) this.isPhotoTaking.getValue()).booleanValue();
    }

    public final void switchCamera() {
        this.isFrontCamera = !this.isFrontCamera;
        applyIsFrontCamera();
    }

    private final void applyIsFrontCamera() {
        this.cameraController.setCameraSelector(this.isFrontCamera ? CameraSelector.DEFAULT_FRONT_CAMERA : CameraSelector.DEFAULT_BACK_CAMERA);
    }

    private final void startProcessing(Bitmap bitmapA, Bitmap bitmapB) {
        Log.w("myapp.FacesModel", "startProcessing processingJob:" + this.processingJob);
        if (this.processingJob != null) {
            return;
        }
        this.processingJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C30701(bitmapA, bitmapB, null), 3, null);
    }

    /* compiled from: FacesModel.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.com.smartengines.app.FacesModel$startProcessing$1", m533f = "FacesModel.kt", m534i = {}, m535l = {}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.com.smartengines.app.FacesModel$startProcessing$1 */
    static final class C30701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmapA;
        final /* synthetic */ Bitmap $bitmapB;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30701(Bitmap bitmap, Bitmap bitmap2, Continuation<? super C30701> continuation) {
            super(2, continuation);
            this.$bitmapA = bitmap;
            this.$bitmapB = bitmap2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FacesModel.this.new C30701(this.$bitmapA, this.$bitmapB, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Engine engine = Model.INSTANCE.getEngines().getId().getLoader().getEngine();
            Intrinsics.checkNotNull(engine, "null cannot be cast to non-null type com.smartengines.engine.id.IdEngineWrapper");
            FacesModel.this.setResult(FacesKt.compareFaces((IdEngineWrapper) engine, this.$bitmapA, this.$bitmapB));
            FacesModel.this.setProcessingJob(null);
            return Unit.INSTANCE;
        }
    }

    public final void onSlotClick(int index) {
        List<? extends SlotState> listListOf;
        Log.d("myapp.FacesModel", "onSlotClick #" + index);
        SlotState slotState = getSlots().get(index);
        SlotState.EMPTY empty = getSlots().get(index == 0 ? 1 : 0);
        if (slotState instanceof SlotState.CAMERA) {
            return;
        }
        SlotState.CAMERA camera = SlotState.CAMERA.INSTANCE;
        if (Intrinsics.areEqual(empty, SlotState.CAMERA.INSTANCE) || Intrinsics.areEqual(empty, SlotState.EMPTY.INSTANCE)) {
            empty = SlotState.EMPTY.INSTANCE;
        } else if (!(empty instanceof SlotState.PHOTO)) {
            throw new NoWhenBranchMatchedException();
        }
        if (index == 0) {
            listListOf = CollectionsKt.listOf((Object[]) new SlotState[]{camera, empty});
        } else {
            listListOf = CollectionsKt.listOf((Object[]) new SlotState[]{empty, camera});
        }
        setSlots(listListOf);
        setResult(null);
    }

    public final void onPhotoTaken(Bitmap bitmap) {
        Integer num;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Log.d("myapp.FacesModel", "onPhotoTaken size: " + bitmap.getWidth() + 'x' + bitmap.getHeight());
        if (Intrinsics.areEqual(getSlots().get(0), SlotState.CAMERA.INSTANCE)) {
            num = 0;
        } else {
            num = Intrinsics.areEqual(getSlots().get(1), SlotState.CAMERA.INSTANCE) ? 1 : null;
        }
        if (num == null) {
            return;
        }
        getSlots().get(num.intValue());
        SlotState.CAMERA camera = getSlots().get(num.intValue() == 0 ? 1 : 0);
        SlotState.PHOTO photo = new SlotState.PHOTO(bitmap);
        if (Intrinsics.areEqual(camera, SlotState.EMPTY.INSTANCE)) {
            camera = SlotState.CAMERA.INSTANCE;
        }
        setSlots(num.intValue() == 0 ? CollectionsKt.listOf((Object[]) new SlotState[]{photo, camera}) : CollectionsKt.listOf((Object[]) new SlotState[]{camera, photo}));
        if (camera instanceof SlotState.PHOTO) {
            startProcessing(photo.getBitmap(), ((SlotState.PHOTO) camera).getBitmap());
        }
    }

    public final void takePhoto() {
        Log.d("myapp.FacesModel", "takePhoto");
        if (isPhotoTaking()) {
            return;
        }
        setPhotoTaking(true);
        this.cameraController.takePicture(this.cameraExecutor, this);
    }

    @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
    public void onCaptureSuccess(ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        super.onCaptureSuccess(imageProxy);
        Log.w("myapp.FacesModel", "onCaptureSuccess image size:" + imageProxy.getWidth() + 'x' + imageProxy.getHeight() + ' ');
        Bitmap bitmapLikeInPreview$default = CameraUtilsKt.toBitmapLikeInPreview$default(imageProxy, MainActivity.INSTANCE.getInstance(), this.isFrontCamera, null, 4, null);
        setPhotoTaking(false);
        onPhotoTaken(bitmapLikeInPreview$default);
    }
}
