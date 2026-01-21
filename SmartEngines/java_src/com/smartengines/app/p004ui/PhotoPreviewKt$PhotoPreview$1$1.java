package com.smartengines.app.p004ui;

import androidx.compose.foundation.gestures.TransformGestureDetectorKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* compiled from: PhotoPreview.kt */
@Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
@DebugMetadata(m532c = "com.smartengines.app.ui.PhotoPreviewKt$PhotoPreview$1$1", m533f = "PhotoPreview.kt", m534i = {}, m535l = {49}, m536m = "invokeSuspend", m537n = {}, m538s = {})
/* loaded from: classes3.dex */
final class PhotoPreviewKt$PhotoPreview$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Offset> $offset$delegate;
    final /* synthetic */ MutableState<Float> $scale$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhotoPreviewKt$PhotoPreview$1$1(MutableState<Float> mutableState, MutableState<Offset> mutableState2, Continuation<? super PhotoPreviewKt$PhotoPreview$1$1> continuation) {
        super(2, continuation);
        this.$scale$delegate = mutableState;
        this.$offset$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PhotoPreviewKt$PhotoPreview$1$1 photoPreviewKt$PhotoPreview$1$1 = new PhotoPreviewKt$PhotoPreview$1$1(this.$scale$delegate, this.$offset$delegate, continuation);
        photoPreviewKt$PhotoPreview$1$1.L$0 = obj;
        return photoPreviewKt$PhotoPreview$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((PhotoPreviewKt$PhotoPreview$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final MutableState<Float> mutableState = this.$scale$delegate;
            final MutableState<Offset> mutableState2 = this.$offset$delegate;
            this.label = 1;
            if (TransformGestureDetectorKt.detectTransformGestures$default(pointerInputScope, false, new Function4() { // from class: com.smartengines.app.ui.PhotoPreviewKt$PhotoPreview$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    return PhotoPreviewKt$PhotoPreview$1$1.invokeSuspend$lambda$0(mutableState, mutableState2, (Offset) obj2, (Offset) obj3, ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, this, 1, null) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableState mutableState, MutableState mutableState2, Offset offset, Offset offset2, float f, float f2) {
        float fPhotoPreview$lambda$1 = PhotoPreviewKt.PhotoPreview$lambda$1(mutableState);
        PhotoPreviewKt.PhotoPreview$lambda$2(mutableState, Math.max(1.0f, Math.min(5.0f, PhotoPreviewKt.PhotoPreview$lambda$1(mutableState) * f)));
        PhotoPreviewKt.PhotoPreview$lambda$5(mutableState2, Offset.m4359plusMKHz9U(PhotoPreviewKt.PhotoPreview$lambda$4(mutableState2), Offset.m4358minusMKHz9U(Offset.m4361timestuRUvjQ(offset2.getPackedValue(), PhotoPreviewKt.PhotoPreview$lambda$1(mutableState)), Offset.m4361timestuRUvjQ(offset.getPackedValue(), PhotoPreviewKt.PhotoPreview$lambda$1(mutableState) - fPhotoPreview$lambda$1))));
        return Unit.INSTANCE;
    }
}
