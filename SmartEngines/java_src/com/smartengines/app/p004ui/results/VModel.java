package com.smartengines.app.p004ui.results;

import android.graphics.Bitmap;
import android.util.Size;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.geometry.SizeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.smartengines.engine.text.TextResultData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TextResultScreenSplit.kt */
@Metadata(m513d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u001f\u0010 R+\u0010#\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\"8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R+\u0010*\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020)8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0017\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u00100\u001a\u000201X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b2\u0010,\"\u0004\b3\u0010.R\u0011\u00105\u001a\u000206¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010%\"\u0004\b;\u0010'¨\u0006?"}, m514d2 = {"Lcom/smartengines/app/ui/results/VModel;", "", "resultData", "Lcom/smartengines/engine/text/TextResultData;", "bitmap", "Landroid/graphics/Bitmap;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/smartengines/engine/text/TextResultData;Landroid/graphics/Bitmap;Lkotlinx/coroutines/CoroutineScope;)V", "getResultData", "()Lcom/smartengines/engine/text/TextResultData;", "getBitmap", "()Landroid/graphics/Bitmap;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "", "isDataPage", "()Z", "setDataPage", "(Z)V", "isDataPage$delegate", "Landroidx/compose/runtime/MutableState;", "selectedChunkIndex", "Landroidx/compose/runtime/MutableState;", "", "getSelectedChunkIndex", "()Landroidx/compose/runtime/MutableState;", "dataListState", "Landroidx/compose/foundation/lazy/LazyListState;", "getDataListState", "()Landroidx/compose/foundation/lazy/LazyListState;", "dataListState$delegate", "", "scale", "getScale", "()F", "setScale", "(F)V", "scale$delegate", "Landroidx/compose/ui/geometry/Offset;", "offset", "getOffset-F1C5BW0", "()J", "setOffset-k-4lQ0M", "(J)V", "offset$delegate", "fieldSize", "Landroidx/compose/ui/geometry/Size;", "getFieldSize-NH-jbRc", "setFieldSize-uvyYCjk", "J", "imageSize", "Landroid/util/Size;", "getImageSize", "()Landroid/util/Size;", "imageScale", "getImageScale", "setImageScale", "onChunkSelected", "", "index", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
final class VModel {
    private final Bitmap bitmap;
    private final CoroutineScope coroutineScope;

    /* renamed from: dataListState$delegate, reason: from kotlin metadata */
    private final MutableState dataListState;
    private long fieldSize;
    private float imageScale;
    private final Size imageSize;

    /* renamed from: isDataPage$delegate, reason: from kotlin metadata */
    private final MutableState isDataPage;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    private final MutableState offset;
    private final TextResultData resultData;

    /* renamed from: scale$delegate, reason: from kotlin metadata */
    private final MutableState scale;
    private final MutableState<Integer> selectedChunkIndex;

    public VModel(TextResultData resultData, Bitmap bitmap, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.resultData = resultData;
        this.bitmap = bitmap;
        this.coroutineScope = coroutineScope;
        this.isDataPage = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.selectedChunkIndex = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.dataListState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new LazyListState(0, 0, 3, null), null, 2, null);
        this.scale = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
        this.offset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4343boximpl(Offset.INSTANCE.m4370getZeroF1C5BW0()), null, 2, null);
        this.fieldSize = SizeKt.Size(1000.0f, 1000.0f);
        this.imageSize = new Size(bitmap.getWidth(), bitmap.getHeight());
        this.imageScale = 1.0f;
    }

    public final TextResultData getResultData() {
        return this.resultData;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDataPage() {
        return ((Boolean) this.isDataPage.getValue()).booleanValue();
    }

    public final void setDataPage(boolean z) {
        this.isDataPage.setValue(Boolean.valueOf(z));
    }

    public final MutableState<Integer> getSelectedChunkIndex() {
        return this.selectedChunkIndex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LazyListState getDataListState() {
        return (LazyListState) this.dataListState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getScale() {
        return ((Number) this.scale.getValue()).floatValue();
    }

    public final void setScale(float f) {
        this.scale.setValue(Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m7681getOffsetF1C5BW0() {
        return ((Offset) this.offset.getValue()).getPackedValue();
    }

    /* renamed from: setOffset-k-4lQ0M, reason: not valid java name */
    public final void m7683setOffsetk4lQ0M(long j) {
        this.offset.setValue(Offset.m4343boximpl(j));
    }

    /* renamed from: getFieldSize-NH-jbRc, reason: not valid java name and from getter */
    public final long getFieldSize() {
        return this.fieldSize;
    }

    /* renamed from: setFieldSize-uvyYCjk, reason: not valid java name */
    public final void m7682setFieldSizeuvyYCjk(long j) {
        this.fieldSize = j;
    }

    public final Size getImageSize() {
        return this.imageSize;
    }

    public final float getImageScale() {
        return this.imageScale;
    }

    public final void setImageScale(float f) {
        this.imageScale = f;
    }

    public final void onChunkSelected(int index) {
        this.selectedChunkIndex.setValue(Integer.valueOf(index));
        if (!isDataPage()) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C32001(index, null), 3, null);
        }
        setDataPage(!isDataPage());
    }

    /* compiled from: TextResultScreenSplit.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.ui.results.VModel$onChunkSelected$1", m533f = "TextResultScreenSplit.kt", m534i = {}, m535l = {98}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.ui.results.VModel$onChunkSelected$1 */
    static final class C32001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $index;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32001(int i, Continuation<? super C32001> continuation) {
            super(2, continuation);
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return VModel.this.new C32001(this.$index, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (LazyListState.scrollToItem$default(VModel.this.getDataListState(), this.$index, 0, this, 2, null) == coroutine_suspended) {
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
