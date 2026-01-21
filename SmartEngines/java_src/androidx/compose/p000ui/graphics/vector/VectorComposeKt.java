package androidx.compose.p000ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.PathFillType;
import androidx.compose.p000ui.graphics.StrokeCap;
import androidx.compose.p000ui.graphics.StrokeJoin;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* compiled from: VectorCompose.kt */
@Metadata(m513d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a¦\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, m514d2 = {"Group", "", HintConstants.AUTOFILL_HINT_NAME, "", "rotation", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Path", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "ui_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class VectorComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Group(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        float f8;
        int i4;
        float f9;
        int i5;
        float f10;
        int i6;
        float f11;
        int i7;
        int i8;
        int i9;
        int i10;
        float f12;
        final float f13;
        float f14;
        final List<? extends PathNode> emptyPath;
        float f15;
        float f16;
        final float f17;
        final float f18;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-213417674);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Group)P(2,5,3,4,6,7,8,9)58@2500L585:VectorCompose.kt#huu6hf");
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                f8 = f;
                i3 |= composerStartRestartGroup.changed(f8) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    f9 = f2;
                    i3 |= composerStartRestartGroup.changed(f9) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        f10 = f3;
                        i3 |= composerStartRestartGroup.changed(f10) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            f11 = f4;
                            i3 |= composerStartRestartGroup.changed(f11) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        } else if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                            i3 |= composerStartRestartGroup.changed(f5) ? 131072 : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(f6) ? 1048576 : 524288;
                        }
                        i9 = i2 & 128;
                        if (i9 == 0) {
                            if ((i & 12582912) == 0) {
                                i10 = i9;
                                i3 |= composerStartRestartGroup.changed(f7) ? 8388608 : 4194304;
                            }
                            if ((i & 100663296) == 0) {
                                i3 |= ((i2 & 256) == 0 && composerStartRestartGroup.changedInstance(list)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i2 & 512) == 0) {
                                i3 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            }
                            if ((306783379 & i3) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 256) != 0) {
                                        i3 &= -234881025;
                                    }
                                    f12 = f5;
                                    f13 = f6;
                                    f14 = f7;
                                } else {
                                    if (i11 != 0) {
                                        str2 = "";
                                    }
                                    if (i12 != 0) {
                                        f8 = 0.0f;
                                    }
                                    if (i4 != 0) {
                                        f9 = 0.0f;
                                    }
                                    if (i5 != 0) {
                                        f10 = 0.0f;
                                    }
                                    if (i6 != 0) {
                                        f11 = 1.0f;
                                    }
                                    f12 = i7 == 0 ? f5 : 1.0f;
                                    f13 = i8 == 0 ? 0.0f : f6;
                                    f14 = i10 == 0 ? f7 : 0.0f;
                                    if ((i2 & 256) == 0) {
                                        emptyPath = VectorKt.getEmptyPath();
                                        i3 &= -234881025;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        f15 = f14;
                                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:57)");
                                    } else {
                                        f15 = f14;
                                    }
                                    C17761 c17761 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final GroupComponent invoke() {
                                            return new GroupComponent();
                                        }
                                    };
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -548224868, "CC(ComposeNode)P(1,2)336@12596L9:Composables.kt#9igjgp");
                                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composerStartRestartGroup.startNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(c17761);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composerStartRestartGroup);
                                    Updater.m4095setimpl(composerM4088constructorimpl, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str3) {
                                            invoke2(groupComponent, str3);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(GroupComponent groupComponent, String str3) {
                                            groupComponent.setName(str3);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f19) {
                                            invoke(groupComponent, f19.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(GroupComponent groupComponent, float f19) {
                                            groupComponent.setRotation(f19);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f19) {
                                            invoke(groupComponent, f19.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(GroupComponent groupComponent, float f19) {
                                            groupComponent.setPivotX(f19);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f19) {
                                            invoke(groupComponent, f19.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(GroupComponent groupComponent, float f19) {
                                            groupComponent.setPivotY(f19);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f19) {
                                            invoke(groupComponent, f19.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(GroupComponent groupComponent, float f19) {
                                            groupComponent.setScaleX(f19);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f19) {
                                            invoke(groupComponent, f19.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(GroupComponent groupComponent, float f19) {
                                            groupComponent.setScaleY(f19);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f19) {
                                            invoke(groupComponent, f19.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(GroupComponent groupComponent, float f19) {
                                            groupComponent.setTranslationX(f19);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl, Float.valueOf(f15), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f19) {
                                            invoke(groupComponent, f19.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(GroupComponent groupComponent, float f19) {
                                            groupComponent.setTranslationY(f19);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list2) {
                                            invoke2(groupComponent, list2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(GroupComponent groupComponent, List<? extends PathNode> list2) {
                                            groupComponent.setClipPathData(list2);
                                        }
                                    });
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 541925533, "C72@3070L9:VectorCompose.kt#huu6hf");
                                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    composerStartRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f16 = f15;
                                    f17 = f8;
                                    f18 = f12;
                                }
                                emptyPath = list;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                C17761 c177612 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final GroupComponent invoke() {
                                        return new GroupComponent();
                                    }
                                };
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -548224868, "CC(ComposeNode)P(1,2)336@12596L9:Composables.kt#9igjgp");
                                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                }
                                composerStartRestartGroup.startNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composerStartRestartGroup);
                                Updater.m4095setimpl(composerM4088constructorimpl2, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str3) {
                                        invoke2(groupComponent, str3);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(GroupComponent groupComponent, String str3) {
                                        groupComponent.setName(str3);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl2, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f19) {
                                        invoke(groupComponent, f19.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(GroupComponent groupComponent, float f19) {
                                        groupComponent.setRotation(f19);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl2, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f19) {
                                        invoke(groupComponent, f19.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(GroupComponent groupComponent, float f19) {
                                        groupComponent.setPivotX(f19);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl2, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f19) {
                                        invoke(groupComponent, f19.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(GroupComponent groupComponent, float f19) {
                                        groupComponent.setPivotY(f19);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl2, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f19) {
                                        invoke(groupComponent, f19.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(GroupComponent groupComponent, float f19) {
                                        groupComponent.setScaleX(f19);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl2, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f19) {
                                        invoke(groupComponent, f19.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(GroupComponent groupComponent, float f19) {
                                        groupComponent.setScaleY(f19);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl2, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f19) {
                                        invoke(groupComponent, f19.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(GroupComponent groupComponent, float f19) {
                                        groupComponent.setTranslationX(f19);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl2, Float.valueOf(f15), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f19) {
                                        invoke(groupComponent, f19.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(GroupComponent groupComponent, float f19) {
                                        groupComponent.setTranslationY(f19);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl2, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list2) {
                                        invoke2(groupComponent, list2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(GroupComponent groupComponent, List<? extends PathNode> list2) {
                                        groupComponent.setClipPathData(list2);
                                    }
                                });
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 541925533, "C72@3070L9:VectorCompose.kt#huu6hf");
                                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                composerStartRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f16 = f15;
                                f17 = f8;
                                f18 = f12;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                f13 = f6;
                                f16 = f7;
                                emptyPath = list;
                                f17 = f8;
                                f18 = f5;
                            }
                            final float f19 = f10;
                            final float f20 = f11;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final String str3 = str2;
                                final float f21 = f9;
                                final float f22 = f16;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i13) {
                                        VectorComposeKt.Group(str3, f17, f21, f19, f20, f18, f13, f22, emptyPath, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i10 = i9;
                        if ((i & 100663296) == 0) {
                        }
                        if ((i2 & 512) == 0) {
                        }
                        if ((306783379 & i3) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) == 0) {
                                if (i11 != 0) {
                                }
                                if (i12 != 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if ((i2 & 256) == 0) {
                                    emptyPath = list;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                C17761 c1776122 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final GroupComponent invoke() {
                                        return new GroupComponent();
                                    }
                                };
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -548224868, "CC(ComposeNode)P(1,2)336@12596L9:Composables.kt#9igjgp");
                                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                }
                                composerStartRestartGroup.startNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                Composer composerM4088constructorimpl22 = Updater.m4088constructorimpl(composerStartRestartGroup);
                                Updater.m4095setimpl(composerM4088constructorimpl22, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str32) {
                                        invoke2(groupComponent, str32);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(GroupComponent groupComponent, String str32) {
                                        groupComponent.setName(str32);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl22, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f192) {
                                        invoke(groupComponent, f192.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(GroupComponent groupComponent, float f192) {
                                        groupComponent.setRotation(f192);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl22, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f192) {
                                        invoke(groupComponent, f192.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(GroupComponent groupComponent, float f192) {
                                        groupComponent.setPivotX(f192);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl22, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f192) {
                                        invoke(groupComponent, f192.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(GroupComponent groupComponent, float f192) {
                                        groupComponent.setPivotY(f192);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl22, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f192) {
                                        invoke(groupComponent, f192.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(GroupComponent groupComponent, float f192) {
                                        groupComponent.setScaleX(f192);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl22, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f192) {
                                        invoke(groupComponent, f192.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(GroupComponent groupComponent, float f192) {
                                        groupComponent.setScaleY(f192);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl22, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f192) {
                                        invoke(groupComponent, f192.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(GroupComponent groupComponent, float f192) {
                                        groupComponent.setTranslationX(f192);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl22, Float.valueOf(f15), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f192) {
                                        invoke(groupComponent, f192.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(GroupComponent groupComponent, float f192) {
                                        groupComponent.setTranslationY(f192);
                                    }
                                });
                                Updater.m4095setimpl(composerM4088constructorimpl22, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list2) {
                                        invoke2(groupComponent, list2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(GroupComponent groupComponent, List<? extends PathNode> list2) {
                                        groupComponent.setClipPathData(list2);
                                    }
                                });
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 541925533, "C72@3070L9:VectorCompose.kt#huu6hf");
                                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                composerStartRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f16 = f15;
                                f17 = f8;
                                f18 = f12;
                            }
                        }
                        final float f192 = f10;
                        final float f202 = f11;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    f11 = f4;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    if ((i & 100663296) == 0) {
                    }
                    if ((i2 & 512) == 0) {
                    }
                    if ((306783379 & i3) == 306783378) {
                    }
                    final float f1922 = f10;
                    final float f2022 = f11;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                f10 = f3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f11 = f4;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i & 100663296) == 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if ((306783379 & i3) == 306783378) {
                }
                final float f19222 = f10;
                final float f20222 = f11;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f9 = f2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f10 = f3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f11 = f4;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i & 100663296) == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if ((306783379 & i3) == 306783378) {
            }
            final float f192222 = f10;
            final float f202222 = f11;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        f8 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f9 = f2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f10 = f3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f11 = f4;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i & 100663296) == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if ((306783379 & i3) == 306783378) {
        }
        final float f1922222 = f10;
        final float f2022222 = f11;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* renamed from: Path-9cdaXJ4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5299Path9cdaXJ4(final List<? extends PathNode> list, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        Brush brush3;
        int i11;
        float f8;
        int i12;
        Brush brush4;
        int i13;
        float f9;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        final String str2;
        Composer composer2;
        final Brush brush5;
        final float f10;
        final Brush brush6;
        final float f11;
        final int i28;
        final int i29;
        final int i30;
        final float f12;
        final float f13;
        final float f14;
        final float f15;
        final float f16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1478270750);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Path)P(3,4:c#ui.graphics.PathFillType,2!4,10,7:c#ui.graphics.StrokeCap,8:c#ui.graphics.StrokeJoin!1,13)115@5068L876:VectorCompose.kt#huu6hf");
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i31 = i6 & 2;
        if (i31 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                i8 = i;
                i7 |= composerStartRestartGroup.changed(i8) ? 32 : 16;
            }
            i9 = i6 & 4;
            if (i9 == 0) {
                i7 |= 384;
            } else {
                if ((i4 & 384) == 0) {
                    i7 |= composerStartRestartGroup.changed(str) ? 256 : 128;
                }
                i10 = i6 & 8;
                if (i10 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i4 & 3072) == 0) {
                        brush3 = brush;
                        i7 |= composerStartRestartGroup.changed(brush3) ? 2048 : 1024;
                    }
                    i11 = i6 & 16;
                    if (i11 == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i4 & 24576) == 0) {
                            f8 = f;
                            i7 |= composerStartRestartGroup.changed(f8) ? 16384 : 8192;
                        }
                        i12 = i6 & 32;
                        if (i12 != 0) {
                            i7 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                            brush4 = brush2;
                        } else {
                            brush4 = brush2;
                            if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                i7 |= composerStartRestartGroup.changed(brush4) ? 131072 : 65536;
                            }
                        }
                        i13 = i6 & 64;
                        if (i13 != 0) {
                            i7 |= 1572864;
                            f9 = f2;
                        } else {
                            f9 = f2;
                            if ((i4 & 1572864) == 0) {
                                i7 |= composerStartRestartGroup.changed(f9) ? 1048576 : 524288;
                            }
                        }
                        i14 = i6 & 128;
                        if (i14 != 0) {
                            i7 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i7 |= composerStartRestartGroup.changed(f3) ? 8388608 : 4194304;
                        }
                        i15 = i6 & 256;
                        if (i15 != 0) {
                            i7 |= 100663296;
                        } else {
                            if ((i4 & 100663296) == 0) {
                                i16 = i15;
                                i7 |= composerStartRestartGroup.changed(i2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            i17 = i6 & 512;
                            if (i17 == 0) {
                                i7 |= 805306368;
                            } else {
                                if ((i4 & 805306368) == 0) {
                                    i18 = i17;
                                    i7 |= composerStartRestartGroup.changed(i3) ? PKIFailureInfo.duplicateCertReq : 268435456;
                                }
                                i19 = i6 & 1024;
                                if (i19 != 0) {
                                    i21 = i5 | 6;
                                    i20 = i19;
                                } else if ((i5 & 6) == 0) {
                                    i20 = i19;
                                    i21 = i5 | (composerStartRestartGroup.changed(f4) ? 4 : 2);
                                } else {
                                    i20 = i19;
                                    i21 = i5;
                                }
                                i22 = i6 & 2048;
                                if (i22 != 0) {
                                    i21 |= 48;
                                    i23 = i22;
                                } else if ((i5 & 48) == 0) {
                                    i23 = i22;
                                    i21 |= composerStartRestartGroup.changed(f5) ? 32 : 16;
                                } else {
                                    i23 = i22;
                                }
                                int i32 = i21;
                                i24 = i6 & 4096;
                                if (i24 != 0) {
                                    i25 = i32 | 384;
                                } else {
                                    int i33 = i32;
                                    if ((i5 & 384) == 0) {
                                        i33 |= composerStartRestartGroup.changed(f6) ? 256 : 128;
                                    }
                                    i25 = i33;
                                }
                                i26 = i6 & 8192;
                                if (i26 == 0) {
                                    if ((i5 & 3072) == 0) {
                                        i25 |= composerStartRestartGroup.changed(f7) ? 2048 : 1024;
                                    }
                                    if ((i7 & 306783379) == 306783378 || (i25 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                                        int defaultFillType = i31 == 0 ? VectorKt.getDefaultFillType() : i8;
                                        String str3 = i9 == 0 ? "" : str;
                                        if (i10 != 0) {
                                            brush3 = null;
                                        }
                                        if (i11 != 0) {
                                            f8 = 1.0f;
                                        }
                                        if (i12 != 0) {
                                            brush4 = null;
                                        }
                                        if (i13 != 0) {
                                            f9 = 1.0f;
                                        }
                                        float f17 = i14 == 0 ? 0.0f : f3;
                                        int defaultStrokeLineCap = i16 == 0 ? VectorKt.getDefaultStrokeLineCap() : i2;
                                        int defaultStrokeLineJoin = i18 == 0 ? VectorKt.getDefaultStrokeLineJoin() : i3;
                                        float f18 = i20 == 0 ? 4.0f : f4;
                                        float f19 = i23 == 0 ? 0.0f : f5;
                                        float f20 = i24 == 0 ? f6 : 1.0f;
                                        float f21 = i26 == 0 ? f7 : 0.0f;
                                        if (ComposerKt.isTraceInProgress()) {
                                            i27 = defaultFillType;
                                        } else {
                                            i27 = defaultFillType;
                                            ComposerKt.traceEventStart(-1478270750, i7, i25, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:114)");
                                        }
                                        VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final PathComponent invoke() {
                                                return new PathComponent();
                                            }
                                        };
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
                                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composerStartRestartGroup.startNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.createNode(vectorComposeKt$Path$1);
                                        } else {
                                            composerStartRestartGroup.useNode();
                                        }
                                        Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composerStartRestartGroup);
                                        Updater.m4095setimpl(composerM4088constructorimpl, str3, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str4) {
                                                invoke2(pathComponent, str4);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(PathComponent pathComponent, String str4) {
                                                pathComponent.setName(str4);
                                            }
                                        });
                                        Updater.m4095setimpl(composerM4088constructorimpl, list, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                                                invoke2(pathComponent, list2);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(PathComponent pathComponent, List<? extends PathNode> list2) {
                                                pathComponent.setPathData(list2);
                                            }
                                        });
                                        Updater.m4095setimpl(composerM4088constructorimpl, PathFillType.m4870boximpl(i27), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                                                m5301invokepweu1eQ(pathComponent, pathFillType.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-pweu1eQ, reason: not valid java name */
                                            public final void m5301invokepweu1eQ(PathComponent pathComponent, int i34) {
                                                pathComponent.m5293setPathFillTypeoQ8Xj4U(i34);
                                            }
                                        });
                                        Updater.m4095setimpl(composerM4088constructorimpl, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush7) {
                                                invoke2(pathComponent, brush7);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(PathComponent pathComponent, Brush brush7) {
                                                pathComponent.setFill(brush7);
                                            }
                                        });
                                        Updater.m4095setimpl(composerM4088constructorimpl, Float.valueOf(f8), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f22) {
                                                invoke(pathComponent, f22.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(PathComponent pathComponent, float f22) {
                                                pathComponent.setFillAlpha(f22);
                                            }
                                        });
                                        Updater.m4095setimpl(composerM4088constructorimpl, brush4, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush7) {
                                                invoke2(pathComponent, brush7);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(PathComponent pathComponent, Brush brush7) {
                                                pathComponent.setStroke(brush7);
                                            }
                                        });
                                        Updater.m4095setimpl(composerM4088constructorimpl, Float.valueOf(f9), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f22) {
                                                invoke(pathComponent, f22.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(PathComponent pathComponent, float f22) {
                                                pathComponent.setStrokeAlpha(f22);
                                            }
                                        });
                                        Updater.m4095setimpl(composerM4088constructorimpl, Float.valueOf(f17), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f22) {
                                                invoke(pathComponent, f22.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(PathComponent pathComponent, float f22) {
                                                pathComponent.setStrokeLineWidth(f22);
                                            }
                                        });
                                        Updater.m4095setimpl(composerM4088constructorimpl, StrokeJoin.m4951boximpl(defaultStrokeLineJoin), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                                                m5302invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
                                            public final void m5302invokekLtJ_vA(PathComponent pathComponent, int i34) {
                                                pathComponent.m5295setStrokeLineJoinWw9F2mQ(i34);
                                            }
                                        });
                                        Updater.m4095setimpl(composerM4088constructorimpl, StrokeCap.m4941boximpl(defaultStrokeLineCap), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                                                m5300invokeCSYIeUk(pathComponent, strokeCap.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-CSYIeUk, reason: not valid java name */
                                            public final void m5300invokeCSYIeUk(PathComponent pathComponent, int i34) {
                                                pathComponent.m5294setStrokeLineCapBeK7IIE(i34);
                                            }
                                        });
                                        Updater.m4095setimpl(composerM4088constructorimpl, Float.valueOf(f18), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f22) {
                                                invoke(pathComponent, f22.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(PathComponent pathComponent, float f22) {
                                                pathComponent.setStrokeLineMiter(f22);
                                            }
                                        });
                                        Updater.m4095setimpl(composerM4088constructorimpl, Float.valueOf(f19), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f22) {
                                                invoke(pathComponent, f22.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(PathComponent pathComponent, float f22) {
                                                pathComponent.setTrimPathStart(f22);
                                            }
                                        });
                                        Updater.m4095setimpl(composerM4088constructorimpl, Float.valueOf(f20), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f22) {
                                                invoke(pathComponent, f22.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(PathComponent pathComponent, float f22) {
                                                pathComponent.setTrimPathEnd(f22);
                                            }
                                        });
                                        Updater.m4095setimpl(composerM4088constructorimpl, Float.valueOf(f21), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f22) {
                                                invoke(pathComponent, f22.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(PathComponent pathComponent, float f22) {
                                                pathComponent.setTrimPathOffset(f22);
                                            }
                                        });
                                        composerStartRestartGroup.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        str2 = str3;
                                        composer2 = composerStartRestartGroup;
                                        brush5 = brush3;
                                        f10 = f8;
                                        brush6 = brush4;
                                        f11 = f9;
                                        i28 = defaultStrokeLineCap;
                                        i29 = defaultStrokeLineJoin;
                                        i30 = i27;
                                        f12 = f20;
                                        f13 = f21;
                                        f14 = f17;
                                        f15 = f18;
                                        f16 = f19;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        str2 = str;
                                        f14 = f3;
                                        f16 = f5;
                                        f13 = f7;
                                        composer2 = composerStartRestartGroup;
                                        brush5 = brush3;
                                        f10 = f8;
                                        brush6 = brush4;
                                        i30 = i8;
                                        f11 = f9;
                                        i28 = i2;
                                        i29 = i3;
                                        f15 = f4;
                                        f12 = f6;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i34) {
                                                VectorComposeKt.m5299Path9cdaXJ4(list, i30, str2, brush5, f10, brush6, f11, f14, i28, i29, f15, f16, f12, f13, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i25 |= 3072;
                                if ((i7 & 306783379) == 306783378) {
                                    if (i31 == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    if (i13 != 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    if (i26 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    VectorComposeKt$Path$1 vectorComposeKt$Path$12 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final PathComponent invoke() {
                                            return new PathComponent();
                                        }
                                    };
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
                                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                    }
                                    composerStartRestartGroup.startNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composerStartRestartGroup);
                                    Updater.m4095setimpl(composerM4088constructorimpl2, str3, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str4) {
                                            invoke2(pathComponent, str4);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(PathComponent pathComponent, String str4) {
                                            pathComponent.setName(str4);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl2, list, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                                            invoke2(pathComponent, list2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(PathComponent pathComponent, List<? extends PathNode> list2) {
                                            pathComponent.setPathData(list2);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl2, PathFillType.m4870boximpl(i27), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                                            m5301invokepweu1eQ(pathComponent, pathFillType.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-pweu1eQ, reason: not valid java name */
                                        public final void m5301invokepweu1eQ(PathComponent pathComponent, int i34) {
                                            pathComponent.m5293setPathFillTypeoQ8Xj4U(i34);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl2, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush7) {
                                            invoke2(pathComponent, brush7);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(PathComponent pathComponent, Brush brush7) {
                                            pathComponent.setFill(brush7);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl2, Float.valueOf(f8), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f22) {
                                            invoke(pathComponent, f22.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PathComponent pathComponent, float f22) {
                                            pathComponent.setFillAlpha(f22);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl2, brush4, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush7) {
                                            invoke2(pathComponent, brush7);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(PathComponent pathComponent, Brush brush7) {
                                            pathComponent.setStroke(brush7);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl2, Float.valueOf(f9), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f22) {
                                            invoke(pathComponent, f22.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PathComponent pathComponent, float f22) {
                                            pathComponent.setStrokeAlpha(f22);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl2, Float.valueOf(f17), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f22) {
                                            invoke(pathComponent, f22.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PathComponent pathComponent, float f22) {
                                            pathComponent.setStrokeLineWidth(f22);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl2, StrokeJoin.m4951boximpl(defaultStrokeLineJoin), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                                            m5302invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
                                        public final void m5302invokekLtJ_vA(PathComponent pathComponent, int i34) {
                                            pathComponent.m5295setStrokeLineJoinWw9F2mQ(i34);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl2, StrokeCap.m4941boximpl(defaultStrokeLineCap), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                                            m5300invokeCSYIeUk(pathComponent, strokeCap.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-CSYIeUk, reason: not valid java name */
                                        public final void m5300invokeCSYIeUk(PathComponent pathComponent, int i34) {
                                            pathComponent.m5294setStrokeLineCapBeK7IIE(i34);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl2, Float.valueOf(f18), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f22) {
                                            invoke(pathComponent, f22.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PathComponent pathComponent, float f22) {
                                            pathComponent.setStrokeLineMiter(f22);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl2, Float.valueOf(f19), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f22) {
                                            invoke(pathComponent, f22.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PathComponent pathComponent, float f22) {
                                            pathComponent.setTrimPathStart(f22);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl2, Float.valueOf(f20), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f22) {
                                            invoke(pathComponent, f22.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PathComponent pathComponent, float f22) {
                                            pathComponent.setTrimPathEnd(f22);
                                        }
                                    });
                                    Updater.m4095setimpl(composerM4088constructorimpl2, Float.valueOf(f21), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f22) {
                                            invoke(pathComponent, f22.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PathComponent pathComponent, float f22) {
                                            pathComponent.setTrimPathOffset(f22);
                                        }
                                    });
                                    composerStartRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    str2 = str3;
                                    composer2 = composerStartRestartGroup;
                                    brush5 = brush3;
                                    f10 = f8;
                                    brush6 = brush4;
                                    f11 = f9;
                                    i28 = defaultStrokeLineCap;
                                    i29 = defaultStrokeLineJoin;
                                    i30 = i27;
                                    f12 = f20;
                                    f13 = f21;
                                    f14 = f17;
                                    f15 = f18;
                                    f16 = f19;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i18 = i17;
                            i19 = i6 & 1024;
                            if (i19 != 0) {
                            }
                            i22 = i6 & 2048;
                            if (i22 != 0) {
                            }
                            int i322 = i21;
                            i24 = i6 & 4096;
                            if (i24 != 0) {
                            }
                            i26 = i6 & 8192;
                            if (i26 == 0) {
                            }
                            if ((i7 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i16 = i15;
                        i17 = i6 & 512;
                        if (i17 == 0) {
                        }
                        i18 = i17;
                        i19 = i6 & 1024;
                        if (i19 != 0) {
                        }
                        i22 = i6 & 2048;
                        if (i22 != 0) {
                        }
                        int i3222 = i21;
                        i24 = i6 & 4096;
                        if (i24 != 0) {
                        }
                        i26 = i6 & 8192;
                        if (i26 == 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    f8 = f;
                    i12 = i6 & 32;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 64;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 128;
                    if (i14 != 0) {
                    }
                    i15 = i6 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    i17 = i6 & 512;
                    if (i17 == 0) {
                    }
                    i18 = i17;
                    i19 = i6 & 1024;
                    if (i19 != 0) {
                    }
                    i22 = i6 & 2048;
                    if (i22 != 0) {
                    }
                    int i32222 = i21;
                    i24 = i6 & 4096;
                    if (i24 != 0) {
                    }
                    i26 = i6 & 8192;
                    if (i26 == 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                brush3 = brush;
                i11 = i6 & 16;
                if (i11 == 0) {
                }
                f8 = f;
                i12 = i6 & 32;
                if (i12 != 0) {
                }
                i13 = i6 & 64;
                if (i13 != 0) {
                }
                i14 = i6 & 128;
                if (i14 != 0) {
                }
                i15 = i6 & 256;
                if (i15 != 0) {
                }
                i16 = i15;
                i17 = i6 & 512;
                if (i17 == 0) {
                }
                i18 = i17;
                i19 = i6 & 1024;
                if (i19 != 0) {
                }
                i22 = i6 & 2048;
                if (i22 != 0) {
                }
                int i322222 = i21;
                i24 = i6 & 4096;
                if (i24 != 0) {
                }
                i26 = i6 & 8192;
                if (i26 == 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i10 = i6 & 8;
            if (i10 != 0) {
            }
            brush3 = brush;
            i11 = i6 & 16;
            if (i11 == 0) {
            }
            f8 = f;
            i12 = i6 & 32;
            if (i12 != 0) {
            }
            i13 = i6 & 64;
            if (i13 != 0) {
            }
            i14 = i6 & 128;
            if (i14 != 0) {
            }
            i15 = i6 & 256;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i6 & 512;
            if (i17 == 0) {
            }
            i18 = i17;
            i19 = i6 & 1024;
            if (i19 != 0) {
            }
            i22 = i6 & 2048;
            if (i22 != 0) {
            }
            int i3222222 = i21;
            i24 = i6 & 4096;
            if (i24 != 0) {
            }
            i26 = i6 & 8192;
            if (i26 == 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i;
        i9 = i6 & 4;
        if (i9 == 0) {
        }
        i10 = i6 & 8;
        if (i10 != 0) {
        }
        brush3 = brush;
        i11 = i6 & 16;
        if (i11 == 0) {
        }
        f8 = f;
        i12 = i6 & 32;
        if (i12 != 0) {
        }
        i13 = i6 & 64;
        if (i13 != 0) {
        }
        i14 = i6 & 128;
        if (i14 != 0) {
        }
        i15 = i6 & 256;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i6 & 512;
        if (i17 == 0) {
        }
        i18 = i17;
        i19 = i6 & 1024;
        if (i19 != 0) {
        }
        i22 = i6 & 2048;
        if (i22 != 0) {
        }
        int i32222222 = i21;
        i24 = i6 & 4096;
        if (i24 != 0) {
        }
        i26 = i6 & 8192;
        if (i26 == 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
