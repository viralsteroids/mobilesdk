package com.smartengines.tree.p009ui;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiLevel.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$MultiLevelKt {
    public static final ComposableSingletons$MultiLevelKt INSTANCE = new ComposableSingletons$MultiLevelKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<AppNode, Composer, Integer, Unit> f2190lambda1 = ComposableLambdaKt.composableLambdaInstance(1112662513, false, new Function3<AppNode, Composer, Integer, Unit>() { // from class: com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AppNode appNode, Composer composer, Integer num) {
            invoke(appNode, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AppNode node, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(node, "node");
            ComposerKt.sourceInformation(composer, "C122@4209L15:MultiLevel.kt#snoj4b");
            TextKt.m3128Text4IGK_g(node.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2191lambda2 = ComposableLambdaKt.composableLambdaInstance(584252155, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C115@3991L45,117@4067L181,117@4059L189:MultiLevel.kt#snoj4b");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            composer.startReplaceGroup(-1599564122);
            ComposerKt.sourceInformation(composer, "CC(remember):MultiLevel.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MultiLevelTreeModel(PreviewKt.getPreviewData());
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1238279936, true, new C33031((MultiLevelTreeModel) objRememberedValue), composer, 54), composer, 12582912, 127);
        }

        /* compiled from: MultiLevel.kt */
        @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
        /* renamed from: com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt$lambda-2$1$1 */
        static final class C33031 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ MultiLevelTreeModel<AppNode> $model;

            C33031(MultiLevelTreeModel<AppNode> multiLevelTreeModel) {
                this.$model = multiLevelTreeModel;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C118@4081L157:MultiLevel.kt#snoj4b");
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    MultiLevelKt.MultiLevelTreeView(this.$model, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: INVOKE 
                          (wrap:com.smartengines.tree.ui.MultiLevelTreeModel<com.smartengines.tree.ui.AppNode>:0x0015: IGET (r8v0 'this' com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt$lambda-2$1$1 A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:120) com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt$lambda-2$1.1.$model com.smartengines.tree.ui.MultiLevelTreeModel)
                          (wrap:kotlin.jvm.functions.Function1:0x0019: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt$lambda-2$1$1$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR)
                          (wrap:com.smartengines.tree.ui.TreeViewOptions:0x0023: CONSTRUCTOR (0 int), (null java.lang.Integer), (0 int), (7 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(int, java.lang.Integer, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:121) call: com.smartengines.tree.ui.TreeViewOptions.<init>(int, java.lang.Integer, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR)
                          (wrap:kotlin.jvm.functions.Function3<com.smartengines.tree.ui.AppNode, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>:0x0028: INVOKE 
                          (wrap:com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt:0x0026: SGET  A[WRAPPED] com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt.INSTANCE com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt)
                         VIRTUAL call: com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt.getLambda-1$tree_release():kotlin.jvm.functions.Function3 A[MD:():kotlin.jvm.functions.Function3<com.smartengines.tree.ui.AppNode, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> (m), WRAPPED])
                          (r9v0 'composer' androidx.compose.runtime.Composer)
                          (3128 int)
                         STATIC call: com.smartengines.tree.ui.MultiLevelKt.MultiLevelTreeView(com.smartengines.tree.ui.MultiLevelTreeModel, kotlin.jvm.functions.Function1, com.smartengines.tree.ui.TreeViewOptions, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int):void A[MD:<T extends com.smartengines.tree.TreeNode>:(com.smartengines.tree.ui.MultiLevelTreeModel<T extends com.smartengines.tree.TreeNode>, kotlin.jvm.functions.Function1<? super T extends com.smartengines.tree.TreeNode, kotlin.Unit>, com.smartengines.tree.ui.TreeViewOptions, kotlin.jvm.functions.Function3<? super T extends com.smartengines.tree.TreeNode, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, androidx.compose.runtime.Composer, int):void (m)] (LINE:119) in method: com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt$lambda-2$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt$lambda-2$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 21 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "C118@4081L157:MultiLevel.kt#snoj4b"
                        androidx.compose.runtime.ComposerKt.sourceInformation(r9, r0)
                        r10 = r10 & 11
                        r0 = 2
                        if (r10 != r0) goto L15
                        boolean r10 = r9.getSkipping()
                        if (r10 != 0) goto L11
                        goto L15
                    L11:
                        r9.skipToGroupEnd()
                        return
                    L15:
                        com.smartengines.tree.ui.MultiLevelTreeModel<com.smartengines.tree.ui.AppNode> r0 = r8.$model
                        com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt$lambda-2$1$1$$ExternalSyntheticLambda0 r1 = new com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt$lambda-2$1$1$$ExternalSyntheticLambda0
                        r1.<init>()
                        com.smartengines.tree.ui.TreeViewOptions r2 = new com.smartengines.tree.ui.TreeViewOptions
                        r6 = 7
                        r7 = 0
                        r3 = 0
                        r4 = 0
                        r5 = 0
                        r2.<init>(r3, r4, r5, r6, r7)
                        com.smartengines.tree.ui.ComposableSingletons$MultiLevelKt r10 = com.smartengines.tree.p009ui.ComposableSingletons$MultiLevelKt.INSTANCE
                        kotlin.jvm.functions.Function3 r3 = r10.m7815getLambda1$tree_release()
                        r5 = 3128(0xc38, float:4.383E-42)
                        r4 = r9
                        com.smartengines.tree.p009ui.MultiLevelKt.MultiLevelTreeView(r0, r1, r2, r3, r4, r5)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.smartengines.tree.p009ui.ComposableSingletons$MultiLevelKt$lambda2$1.C33031.invoke(androidx.compose.runtime.Composer, int):void");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$0(AppNode it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Unit.INSTANCE;
                }
            }
        });

        /* renamed from: getLambda-1$tree_release, reason: not valid java name */
        public final Function3<AppNode, Composer, Integer, Unit> m7815getLambda1$tree_release() {
            return f2190lambda1;
        }

        /* renamed from: getLambda-2$tree_release, reason: not valid java name */
        public final Function2<Composer, Integer, Unit> m7816getLambda2$tree_release() {
            return f2191lambda2;
        }
    }
