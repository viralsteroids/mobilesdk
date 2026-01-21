package com.smartengines.app.p004ui.results;

import android.util.Log;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.gestures.TransformGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.geometry.OffsetKt;
import androidx.compose.p000ui.geometry.Size;
import androidx.compose.p000ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.TransformOriginKt;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.smartengines.app.p004ui.results.TextResultScreenSplitKt$ImagePage$1$1;
import com.smartengines.engine.text.TextResultChunk;
import com.smartengines.visualization.QuadDrawingKt;
import com.smartengines.visualization.QuadPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextResultScreenSplit.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
final class TextResultScreenSplitKt$ImagePage$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ VModel $model;
    final /* synthetic */ VModel $this_with;

    TextResultScreenSplitKt$ImagePage$1$1(VModel vModel, VModel vModel2) {
        this.$this_with = vModel;
        this.$model = vModel2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C224@7251L2579:TextResultScreenSplit.kt#4ipo3i");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(GraphicsLayerModifierKt.m4756graphicsLayerAp8cVGQ$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.$this_with.getScale(), this.$this_with.getScale(), 0.0f, Offset.m4354getXimpl(this.$this_with.m7681getOffsetF1C5BW0()), Offset.m4355getYimpl(this.$this_with.m7681getOffsetF1C5BW0()), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, TransformOriginKt.TransformOrigin(0.0f, 0.0f), null, false, null, 0L, 0L, 0, 130020, null), Unit.INSTANCE, new C31981(this.$this_with, null)), Unit.INSTANCE, new C31992(this.$this_with, null));
            final VModel vModel = this.$this_with;
            final VModel vModel2 = this.$model;
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPointerInput);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer);
            Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -29770075, "C270@9113L115,274@9241L579:TextResultScreenSplit.kt#4ipo3i");
            ImageKt.m1046Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(vModel.getBitmap()), "", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0.0f, null, 0, composer, 440, 248);
            CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function1() { // from class: com.smartengines.app.ui.results.TextResultScreenSplitKt$ImagePage$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TextResultScreenSplitKt$ImagePage$1$1.invoke$lambda$2$lambda$1(vModel, vModel2, (DrawScope) obj);
                }
            }, composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* compiled from: TextResultScreenSplit.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.ui.results.TextResultScreenSplitKt$ImagePage$1$1$1", m533f = "TextResultScreenSplit.kt", m534i = {}, m535l = {239}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.ui.results.TextResultScreenSplitKt$ImagePage$1$1$1 */
    static final class C31981 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ VModel $this_with;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31981(VModel vModel, Continuation<? super C31981> continuation) {
            super(2, continuation);
            this.$this_with = vModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C31981 c31981 = new C31981(this.$this_with, continuation);
            c31981.L$0 = obj;
            return c31981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C31981) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                final VModel vModel = this.$this_with;
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.smartengines.app.ui.results.TextResultScreenSplitKt$ImagePage$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return TextResultScreenSplitKt$ImagePage$1$1.C31981.invokeSuspend$lambda$1(vModel, (Offset) obj2);
                    }
                }, this, 7, null) == coroutine_suspended) {
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
        public static final Unit invokeSuspend$lambda$1(VModel vModel, Offset offset) {
            Integer numM7670findChunkIndexByCoordinatesUv8p0NA = TextResultScreenBodyNativeKt.m7670findChunkIndexByCoordinatesUv8p0NA(vModel.getResultData(), Offset.m4349divtuRUvjQ(offset.getPackedValue(), vModel.getImageScale()));
            Log.w("myapp.TextResultScr", " ----> offset:" + ((Object) Offset.m4362toStringimpl(vModel.m7681getOffsetF1C5BW0())) + "  scale:" + vModel.getScale() + "  fieldSize:" + ((Object) Size.m4427toStringimpl(vModel.getFieldSize())));
            Log.e("myapp.TextResultScr", " ----> tapOffset:" + offset + "  chunkIndex:" + numM7670findChunkIndexByCoordinatesUv8p0NA);
            if (numM7670findChunkIndexByCoordinatesUv8p0NA != null) {
                vModel.onChunkSelected(numM7670findChunkIndexByCoordinatesUv8p0NA.intValue());
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: TextResultScreenSplit.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.ui.results.TextResultScreenSplitKt$ImagePage$1$1$2", m533f = "TextResultScreenSplit.kt", m534i = {}, m535l = {249}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.ui.results.TextResultScreenSplitKt$ImagePage$1$1$2 */
    static final class C31992 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ VModel $this_with;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31992(VModel vModel, Continuation<? super C31992> continuation) {
            super(2, continuation);
            this.$this_with = vModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C31992 c31992 = new C31992(this.$this_with, continuation);
            c31992.L$0 = obj;
            return c31992;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C31992) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                final VModel vModel = this.$this_with;
                this.label = 1;
                if (TransformGestureDetectorKt.detectTransformGestures$default(pointerInputScope, false, new Function4() { // from class: com.smartengines.app.ui.results.TextResultScreenSplitKt$ImagePage$1$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        return TextResultScreenSplitKt$ImagePage$1$1.C31992.invokeSuspend$lambda$3(vModel, (Offset) obj2, (Offset) obj3, ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
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
        public static final Unit invokeSuspend$lambda$3(VModel vModel, Offset offset, Offset offset2, float f, float f2) {
            float scale = vModel.getScale();
            vModel.setScale(Math.max(1.0f, Math.min(5.0f, vModel.getScale() * f)));
            long jM4358minusMKHz9U = Offset.m4358minusMKHz9U(Offset.m4359plusMKHz9U(vModel.m7681getOffsetF1C5BW0(), Offset.m4361timestuRUvjQ(offset2.getPackedValue(), vModel.getScale())), Offset.m4361timestuRUvjQ(offset.getPackedValue(), vModel.getScale() - scale));
            vModel.m7683setOffsetk4lQ0M(OffsetKt.Offset(Math.max(Math.min(Offset.m4354getXimpl(jM4358minusMKHz9U), 0.0f), Size.m4423getWidthimpl(vModel.getFieldSize()) * (1.0f - vModel.getScale())), Math.max(Math.min(Offset.m4355getYimpl(jM4358minusMKHz9U), 0.0f), Size.m4420getHeightimpl(vModel.getFieldSize()) * (1.0f - vModel.getScale()))));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(VModel this_with, VModel model, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(model, "$model");
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        this_with.m7682setFieldSizeuvyYCjk(Canvas.mo5151getSizeNHjbRc());
        int i = 0;
        for (Object obj : model.getResultData().getChunks()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<QuadPoint> points = ((TextResultChunk) obj).getGeometry().getPoints();
            android.util.Size imageSize = this_with.getImageSize();
            Integer value = model.getSelectedChunkIndex().getValue();
            DrawScope drawScope = Canvas;
            this_with.setImageScale(QuadDrawingKt.m7840drawQuadPointsXOJAsU(points, imageSize, (value != null && i == value.intValue()) ? Color.INSTANCE.m4629getRed0d7_KjU() : Color.INSTANCE.m4626getGreen0d7_KjU(), 1.0f, drawScope));
            i = i2;
            Canvas = drawScope;
        }
        return Unit.INSTANCE;
    }
}
