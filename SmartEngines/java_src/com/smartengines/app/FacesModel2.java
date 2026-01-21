package com.smartengines.app;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.camera.core.ImageCapture;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.smartengines.engine.Engine;
import com.smartengines.engine.p005id.FacesKt;
import com.smartengines.engine.p005id.FacesResult;
import com.smartengines.engine.p005id.IdEngineWrapper;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
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

/* compiled from: FacesModel2.kt */
@Metadata(m513d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001cJ\u0016\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\bR;\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m514d2 = {"Lcom/smartengines/app/FacesModel2;", "Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;", "photo", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "<set-?>", "", "Lcom/smartengines/app/Photo;", "slots", "getSlots", "()Ljava/util/List;", "setSlots", "(Ljava/util/List;)V", "slots$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/smartengines/engine/id/FacesResult;", "result", "getResult", "()Lcom/smartengines/engine/id/FacesResult;", "setResult", "(Lcom/smartengines/engine/id/FacesResult;)V", "result$delegate", "processingJob", "Lkotlinx/coroutines/Job;", "setSlot", "", "index", "", "value", "onSlotsChanged", "onClearSlot", "slotIndex", "onNewImage", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class FacesModel2 extends ImageCapture.OnImageCapturedCallback {
    public static final int $stable = 8;
    private Job processingJob;

    /* renamed from: result$delegate, reason: from kotlin metadata */
    private final MutableState result;

    /* renamed from: slots$delegate, reason: from kotlin metadata */
    private final MutableState slots;

    public FacesModel2(Bitmap bitmap) {
        List listListOf;
        this.slots = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((bitmap == null || (listListOf = CollectionsKt.listOf((Object[]) new Photo[]{new Photo(bitmap), null})) == null) ? CollectionsKt.listOf((Object[]) new Void[]{null, null}) : listListOf, null, 2, null);
        this.result = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        Log.d("myapp.FacesModel2", "init photo: " + bitmap);
        Model.INSTANCE.switchToFrontCamera();
    }

    public final List<Photo> getSlots() {
        return (List) this.slots.getValue();
    }

    public final void setSlots(List<Photo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.slots.setValue(list);
    }

    public final FacesResult getResult() {
        return (FacesResult) this.result.getValue();
    }

    public final void setResult(FacesResult facesResult) {
        this.result.setValue(facesResult);
    }

    private final void setSlot(int index, Photo value) {
        List<Photo> listListOf;
        if (index == 0) {
            listListOf = CollectionsKt.listOf((Object[]) new Photo[]{value, getSlots().get(1)});
        } else {
            listListOf = CollectionsKt.listOf((Object[]) new Photo[]{getSlots().get(0), value});
        }
        setSlots(listListOf);
        onSlotsChanged();
    }

    private final void onSlotsChanged() {
        Job job = this.processingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.processingJob = null;
        Photo photo = getSlots().get(0);
        Photo photo2 = getSlots().get(1);
        if (photo != null && photo2 != null) {
            this.processingJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C30571(photo, photo2, null), 3, null);
        } else {
            setResult(null);
        }
    }

    /* compiled from: FacesModel2.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.FacesModel2$onSlotsChanged$1", m533f = "FacesModel2.kt", m534i = {}, m535l = {}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.FacesModel2$onSlotsChanged$1 */
    static final class C30571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Photo $photoA;
        final /* synthetic */ Photo $photoB;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30571(Photo photo, Photo photo2, Continuation<? super C30571> continuation) {
            super(2, continuation);
            this.$photoA = photo;
            this.$photoB = photo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FacesModel2.this.new C30571(this.$photoA, this.$photoB, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            FacesModel2.this.setResult(FacesKt.compareFaces((IdEngineWrapper) engine, this.$photoA.getBitmap(), this.$photoB.getBitmap()));
            FacesModel2.this.processingJob = null;
            return Unit.INSTANCE;
        }
    }

    public final void onClearSlot(int slotIndex) {
        setSlot(slotIndex, null);
    }

    public final void onNewImage(int slotIndex, Photo photo) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        setSlot(slotIndex, photo);
    }
}
