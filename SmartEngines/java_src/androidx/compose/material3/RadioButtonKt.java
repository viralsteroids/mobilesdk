package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.graphics.drawscope.Fill;
import androidx.compose.p000ui.graphics.drawscope.Stroke;
import androidx.compose.p000ui.semantics.Role;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jmrtd.lds.LDSFile;

/* compiled from: RadioButton.kt */
@Metadata(m513d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u0015"}, m514d2 = {"RadioAnimationDuration", "", "RadioButtonDotSize", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioStrokeWidth", "RadioButton", "", "selected", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/RadioButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/RadioButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize = C1959Dp.m7055constructorimpl(12);
    private static final float RadioButtonPadding;
    private static final float RadioStrokeWidth;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, RadioButtonColors radioButtonColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        RadioButtonColors radioButtonColorsColors;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Modifier.Companion companion;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        boolean z4;
        RadioButtonColors radioButtonColors2;
        float fM7055constructorimpl;
        ?? r11;
        Modifier modifier3;
        State<C1959Dp> state;
        final boolean z5;
        final State<Color> state2;
        Modifier.Companion companionM1686selectableO2vRcR0;
        Modifier.Companion companionMinimumInteractiveComponentSize;
        final State<C1959Dp> state3;
        boolean zChanged;
        Object objRememberedValue;
        final MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(408580840);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(RadioButton)P(5,4,3,1)80@3770L8,84@3868L176,88@4073L29,119@5097L415,106@4679L833:RadioButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        radioButtonColorsColors = radioButtonColors;
                        int i8 = composerStartRestartGroup.changed(radioButtonColorsColors) ? 16384 : 8192;
                        i3 |= i8;
                    } else {
                        radioButtonColorsColors = radioButtonColors;
                    }
                    i3 |= i8;
                } else {
                    radioButtonColorsColors = radioButtonColors;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                radioButtonColorsColors = RadioButtonDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            }
                            if (i5 == 0) {
                                i6 = i3;
                                z4 = z3;
                                radioButtonColors2 = radioButtonColorsColors;
                                mutableInteractionSource3 = null;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(408580840, i6, -1, "androidx.compose.material3.RadioButton (RadioButton.kt:82)");
                                }
                                if (!z) {
                                    fM7055constructorimpl = C1959Dp.m7055constructorimpl(RadioButtonDotSize / 2);
                                } else {
                                    fM7055constructorimpl = C1959Dp.m7055constructorimpl(0);
                                }
                                State<C1959Dp> stateM882animateDpAsStateAjpBEmI = AnimateAsStateKt.m882animateDpAsStateAjpBEmI(fM7055constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                                State<Color> stateRadioColor$material3_release = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i6 >> 6) & 896) | ((i6 >> 9) & 14) | ((i6 << 3) & LDSFile.EF_DG16_TAG));
                                composerStartRestartGroup.startReplaceGroup(1327106656);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "98@4448L164");
                                if (function0 == null) {
                                    state = stateM882animateDpAsStateAjpBEmI;
                                    radioButtonColorsColors = radioButtonColors2;
                                    r11 = 0;
                                    modifier3 = companion;
                                    z5 = z4;
                                    state2 = stateRadioColor$material3_release;
                                    companionM1686selectableO2vRcR0 = SelectableKt.m1686selectableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, RippleKt.m2842rippleOrFallbackImplementation9IZ8Weo(false, C1959Dp.m7055constructorimpl(RadioButtonTokens.INSTANCE.m3905getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z5, Role.m6343boximpl(Role.INSTANCE.m6354getRadioButtono7Vup1c()), function0);
                                } else {
                                    r11 = 0;
                                    modifier3 = companion;
                                    radioButtonColorsColors = radioButtonColors2;
                                    state = stateM882animateDpAsStateAjpBEmI;
                                    z5 = z4;
                                    state2 = stateRadioColor$material3_release;
                                    companionM1686selectableO2vRcR0 = Modifier.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                if (function0 == null) {
                                    companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                                } else {
                                    companionMinimumInteractiveComponentSize = Modifier.INSTANCE;
                                }
                                Modifier modifierM1472requiredSize3ABfNKs = SizeKt.m1472requiredSize3ABfNKs(PaddingKt.m1435padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1686selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r11, 2, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3904getIconSizeD9Ej5fM());
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1327137161, "CC(remember):RadioButton.kt#9igjgp");
                                state3 = state;
                                zChanged = composerStartRestartGroup.changed(state2) | composerStartRestartGroup.changed(state3);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                            invoke2(drawScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(DrawScope drawScope) {
                                            float f = drawScope.mo1127toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                            float f2 = 2;
                                            float f3 = f / f2;
                                            DrawScope.m5132drawCircleVaOC9Bg$default(drawScope, state2.getValue().m4605unboximpl(), drawScope.mo1127toPx0680j_4(C1959Dp.m7055constructorimpl(RadioButtonTokens.INSTANCE.m3904getIconSizeD9Ej5fM() / f2)) - f3, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                            if (C1959Dp.m7054compareTo0680j_4(state3.getValue().m7069unboximpl(), C1959Dp.m7055constructorimpl(0)) > 0) {
                                                DrawScope.m5132drawCircleVaOC9Bg$default(drawScope, state2.getValue().m4605unboximpl(), drawScope.mo1127toPx0680j_4(state3.getValue().m7069unboximpl()) - f3, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                CanvasKt.Canvas(modifierM1472requiredSize3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, r11);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                mutableInteractionSource4 = mutableInteractionSource3;
                                modifier4 = modifier3;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                i6 = i3;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            mutableInteractionSource3 = mutableInteractionSource;
                            i6 = i3;
                            companion = modifier2;
                        }
                        z4 = z3;
                        radioButtonColors2 = radioButtonColorsColors;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (!z) {
                        }
                        State<C1959Dp> stateM882animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m882animateDpAsStateAjpBEmI(fM7055constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
                        State<Color> stateRadioColor$material3_release2 = radioButtonColors2.radioColor$material3_release(z4, z, composerStartRestartGroup, ((i6 >> 6) & 896) | ((i6 >> 9) & 14) | ((i6 << 3) & LDSFile.EF_DG16_TAG));
                        composerStartRestartGroup.startReplaceGroup(1327106656);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "98@4448L164");
                        if (function0 == null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (function0 == null) {
                        }
                        Modifier modifierM1472requiredSize3ABfNKs2 = SizeKt.m1472requiredSize3ABfNKs(PaddingKt.m1435padding3ABfNKs(SizeKt.wrapContentSize$default(modifier3.then(companionMinimumInteractiveComponentSize).then(companionM1686selectableO2vRcR0), Alignment.INSTANCE.getCenter(), r11, 2, null), RadioButtonPadding), RadioButtonTokens.INSTANCE.m3904getIconSizeD9Ej5fM());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1327137161, "CC(remember):RadioButton.kt#9igjgp");
                        state3 = state;
                        zChanged = composerStartRestartGroup.changed(state2) | composerStartRestartGroup.changed(state3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    float f = drawScope.mo1127toPx0680j_4(RadioButtonKt.RadioStrokeWidth);
                                    float f2 = 2;
                                    float f3 = f / f2;
                                    DrawScope.m5132drawCircleVaOC9Bg$default(drawScope, state2.getValue().m4605unboximpl(), drawScope.mo1127toPx0680j_4(C1959Dp.m7055constructorimpl(RadioButtonTokens.INSTANCE.m3904getIconSizeD9Ej5fM() / f2)) - f3, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    if (C1959Dp.m7054compareTo0680j_4(state3.getValue().m7069unboximpl(), C1959Dp.m7055constructorimpl(0)) > 0) {
                                        DrawScope.m5132drawCircleVaOC9Bg$default(drawScope, state2.getValue().m4605unboximpl(), drawScope.mo1127toPx0680j_4(state3.getValue().m7069unboximpl()) - f3, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            CanvasKt.Canvas(modifierM1472requiredSize3ABfNKs2, (Function1) objRememberedValue, composerStartRestartGroup, r11);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier3;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    final RadioButtonColors radioButtonColors3 = radioButtonColorsColors;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.RadioButtonKt.RadioButton.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i9) {
                                RadioButtonKt.RadioButton(z, function0, modifier4, z5, radioButtonColors3, mutableInteractionSource4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i5 == 0) {
                        }
                    }
                }
                final RadioButtonColors radioButtonColors32 = radioButtonColorsColors;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((74899 & i3) == 74898) {
            }
            final RadioButtonColors radioButtonColors322 = radioButtonColorsColors;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((74899 & i3) == 74898) {
        }
        final RadioButtonColors radioButtonColors3222 = radioButtonColorsColors;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    static {
        float f = 2;
        RadioButtonPadding = C1959Dp.m7055constructorimpl(f);
        RadioStrokeWidth = C1959Dp.m7055constructorimpl(f);
    }
}
