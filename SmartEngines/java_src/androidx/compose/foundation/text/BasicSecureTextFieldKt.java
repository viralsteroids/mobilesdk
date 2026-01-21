package androidx.compose.foundation.text;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.InputTransformationKt;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.geometry.Rect;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.SolidColor;
import androidx.compose.p000ui.input.key.KeyEvent;
import androidx.compose.p000ui.input.key.KeyInputModifierKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.platform.TextToolbar;
import androidx.compose.p000ui.platform.TextToolbarStatus;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.lds.LDSFile;

/* compiled from: BasicSecureTextField.kt */
@Metadata(m513d1 = {"\u0000~\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÊ\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u001328\b\u0002\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\u0016\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015¢\u0006\u0002\b\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a \u0010(\u001a\u00020\u00052\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b*H\u0003¢\u0006\u0002\u0010+\u001a\u001a\u0010,\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\r2\b\u0010-\u001a\u0004\u0018\u00010\rH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, m514d2 = {"DefaultObfuscationCharacter", "", "LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS", "", "BasicSecureTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "decorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "textObfuscationMode", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", "textObfuscationCharacter", "BasicSecureTextField-Jb9bMDk", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/TextFieldDecorator;ICLandroidx/compose/runtime/Composer;III)V", "DisableCutCopy", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "then", "next", "foundation_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class BasicSecureTextFieldKt {
    private static final char DefaultObfuscationCharacter = 8226;
    private static final long LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS = 1500;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    /* renamed from: BasicSecureTextField-Jb9bMDk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1723BasicSecureTextFieldJb9bMDk(final TextFieldState textFieldState, Modifier modifier, boolean z, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i, char c, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        boolean z2;
        int i7;
        InputTransformation inputTransformation2;
        int i8;
        TextStyle textStyle2;
        int i9;
        KeyboardOptions keyboardOptions2;
        int i10;
        KeyboardActionHandler keyboardActionHandler2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Composer composer2;
        final Brush solidColor;
        Object objRememberedValue;
        int i23;
        boolean zChangedInstance;
        char c2;
        boolean zChanged;
        final boolean z3;
        boolean z4;
        Object objRememberedValue2;
        CodepointTransformation codepointTransformation;
        Modifier.Companion focusChangeModifier;
        final int i24;
        Composer composer3;
        final boolean z5;
        final InputTransformation inputTransformation3;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActionHandler keyboardActionHandler3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        final MutableInteractionSource mutableInteractionSource2;
        final Brush brush2;
        final TextFieldDecorator textFieldDecorator2;
        final char c3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1399310985);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicSecureTextField)P(9,6,2,3,12,5,7,8,4!2,11:c#foundation.text.input.TextObfuscationMode)131@7694L46,132@7777L60,133@7884L130,133@7842L172,144@8392L129,144@8353L168,150@8557L384,176@9335L825,176@9320L840:BasicSecureTextField.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(textFieldState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i25 = i4 & 2;
        if (i25 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    z2 = z;
                    i5 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        inputTransformation2 = inputTransformation;
                        i5 |= composerStartRestartGroup.changed(inputTransformation2) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            textStyle2 = textStyle;
                            i5 |= composerStartRestartGroup.changed(textStyle2) ? 16384 : 8192;
                        }
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                i5 |= composerStartRestartGroup.changed(keyboardOptions2) ? 131072 : 65536;
                            }
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                            keyboardActionHandler2 = keyboardActionHandler;
                        } else {
                            keyboardActionHandler2 = keyboardActionHandler;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerStartRestartGroup.changed(keyboardActionHandler2) ? 1048576 : 524288;
                            }
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                        } else {
                            if ((i2 & 12582912) == 0) {
                                i12 = i11;
                                i5 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                            }
                            i13 = i4 & 256;
                            if (i13 == 0) {
                                i5 |= 100663296;
                            } else {
                                if ((i2 & 100663296) == 0) {
                                    i14 = i13;
                                    i5 |= composerStartRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                i15 = i4 & 512;
                                if (i15 == 0) {
                                    if ((i2 & 805306368) == 0) {
                                        i16 = i15;
                                        i5 |= composerStartRestartGroup.changed(brush) ? PKIFailureInfo.duplicateCertReq : 268435456;
                                    }
                                    i17 = i4 & 1024;
                                    if (i17 == 0) {
                                        i18 = i3 | 6;
                                    } else if ((i3 & 6) == 0) {
                                        i18 = i3 | ((i3 & 8) == 0 ? composerStartRestartGroup.changed(textFieldDecorator) : composerStartRestartGroup.changedInstance(textFieldDecorator) ? 4 : 2);
                                    } else {
                                        i18 = i3;
                                    }
                                    i19 = i4 & 2048;
                                    if (i19 == 0) {
                                        i18 |= 48;
                                        i20 = i19;
                                    } else if ((i3 & 48) == 0) {
                                        i20 = i19;
                                        i18 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                                    } else {
                                        i20 = i19;
                                    }
                                    int i26 = i18;
                                    i21 = i4 & 4096;
                                    if (i21 == 0) {
                                        i22 = i26 | 384;
                                    } else if ((i3 & 384) == 0) {
                                        i22 = i26 | (composerStartRestartGroup.changed(c) ? 256 : 128);
                                    } else {
                                        i22 = i26;
                                    }
                                    if ((i5 & 306783379) == 306783378 || (i22 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
                                        Modifier.Companion companion = i25 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (i6 != 0) {
                                            z2 = true;
                                        }
                                        if (i7 != 0) {
                                            inputTransformation2 = null;
                                        }
                                        if (i8 != 0) {
                                            textStyle2 = TextStyle.INSTANCE.getDefault();
                                        }
                                        KeyboardOptions secureTextField$foundation_release = i9 == 0 ? KeyboardOptions.INSTANCE.getSecureTextField$foundation_release() : keyboardOptions2;
                                        if (i10 != 0) {
                                            keyboardActionHandler2 = null;
                                        }
                                        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23 = i12 == 0 ? null : function2;
                                        final MutableInteractionSource mutableInteractionSource3 = i14 == 0 ? null : mutableInteractionSource;
                                        if (i16 == 0) {
                                            composer2 = composerStartRestartGroup;
                                            solidColor = new SolidColor(Color.INSTANCE.m4621getBlack0d7_KjU(), null);
                                        } else {
                                            composer2 = composerStartRestartGroup;
                                            solidColor = brush;
                                        }
                                        final TextFieldDecorator textFieldDecorator3 = i17 == 0 ? null : textFieldDecorator;
                                        int iM1885getRevealLastTypedvTwcZD0 = i20 == 0 ? TextObfuscationMode.INSTANCE.m1885getRevealLastTypedvTwcZD0() : i;
                                        char c4 = i21 == 0 ? (char) 8226 : c;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1399310985, i5, i22, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:130)");
                                        }
                                        Composer composer4 = composer2;
                                        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c4), composer4, (i22 >> 6) & 14);
                                        ComposerKt.sourceInformationMarkerStart(composer4, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                        objRememberedValue = composer4.rememberedValue();
                                        i23 = i22;
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new SecureTextFieldController(stateRememberUpdatedState);
                                            composer4.updateRememberedValue(objRememberedValue);
                                        }
                                        final SecureTextFieldController secureTextFieldController = (SecureTextFieldController) objRememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerStart(composer4, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                        zChangedInstance = composer4.changedInstance(secureTextFieldController);
                                        BasicSecureTextFieldKt$BasicSecureTextField$1$1 basicSecureTextFieldKt$BasicSecureTextField$1$1RememberedValue = composer4.rememberedValue();
                                        if (zChangedInstance) {
                                            c2 = c4;
                                            if (basicSecureTextFieldKt$BasicSecureTextField$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            EffectsKt.LaunchedEffect(secureTextFieldController, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) basicSecureTextFieldKt$BasicSecureTextField$1$1RememberedValue, composer4, 0);
                                            final boolean zM1880equalsimpl0 = TextObfuscationMode.m1880equalsimpl0(iM1885getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1885getRevealLastTypedvTwcZD0());
                                            Boolean boolValueOf = Boolean.valueOf(zM1880equalsimpl0);
                                            ComposerKt.sourceInformationMarkerStart(composer4, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                            zChanged = composer4.changed(zM1880equalsimpl0) | composer4.changedInstance(secureTextFieldController);
                                            BasicSecureTextFieldKt$BasicSecureTextField$2$1 basicSecureTextFieldKt$BasicSecureTextField$2$1RememberedValue = composer4.rememberedValue();
                                            if (zChanged) {
                                                z3 = z2;
                                            } else {
                                                z3 = z2;
                                                if (basicSecureTextFieldKt$BasicSecureTextField$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) basicSecureTextFieldKt$BasicSecureTextField$2$1RememberedValue, composer4, 0);
                                                ComposerKt.sourceInformationMarkerStart(composer4, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                                z4 = (i23 & LDSFile.EF_DG16_TAG) == 32;
                                                objRememberedValue2 = composer4.rememberedValue();
                                                if (!z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    if (!TextObfuscationMode.m1880equalsimpl0(iM1885getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1885getRevealLastTypedvTwcZD0())) {
                                                        codepointTransformation = secureTextFieldController.getCodepointTransformation();
                                                    } else {
                                                        codepointTransformation = TextObfuscationMode.m1880equalsimpl0(iM1885getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1884getHiddenvTwcZD0()) ? new CodepointTransformation() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$$ExternalSyntheticLambda0
                                                            @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
                                                            public final int transform(int i27, int i28) {
                                                                return BasicSecureTextFieldKt.BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3(stateRememberUpdatedState, i27, i28);
                                                            }
                                                        } : null;
                                                    }
                                                    composer4.updateRememberedValue(codepointTransformation);
                                                    objRememberedValue2 = codepointTransformation;
                                                }
                                                final CodepointTransformation codepointTransformation2 = (CodepointTransformation) objRememberedValue2;
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                Modifier modifierSemantics = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        invoke2(semanticsPropertyReceiver);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                return false;
                                                            }
                                                        }, 1, null);
                                                        SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                return false;
                                                            }
                                                        }, 1, null);
                                                    }
                                                });
                                                if (!zM1880equalsimpl0) {
                                                    focusChangeModifier = secureTextFieldController.getFocusChangeModifier();
                                                } else {
                                                    focusChangeModifier = Modifier.INSTANCE;
                                                }
                                                final Modifier modifierThen = modifierSemantics.then(focusChangeModifier);
                                                final InputTransformation inputTransformation4 = inputTransformation2;
                                                final TextStyle textStyle4 = textStyle2;
                                                final KeyboardActionHandler keyboardActionHandler4 = keyboardActionHandler2;
                                                final KeyboardOptions keyboardOptions4 = secureTextField$foundation_release;
                                                DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i27) {
                                                        InputTransformation inputTransformationThen;
                                                        ComposerKt.sourceInformation(composer5, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                                                        if ((i27 & 3) != 2 || !composer5.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(2023988909, i27, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                                                            }
                                                            TextFieldState textFieldState2 = textFieldState;
                                                            Modifier modifier4 = modifierThen;
                                                            boolean z6 = z3;
                                                            if (zM1880equalsimpl0) {
                                                                inputTransformationThen = BasicSecureTextFieldKt.then(inputTransformation4, secureTextFieldController.getPasswordInputTransformation());
                                                            } else {
                                                                inputTransformationThen = inputTransformation4;
                                                            }
                                                            BasicTextFieldKt.BasicTextField(textFieldState2, modifier4, z6, false, inputTransformationThen, textStyle4, keyboardOptions4, keyboardActionHandler4, TextFieldLineLimits.SingleLine.INSTANCE, function23, mutableInteractionSource3, solidColor, codepointTransformation2, null, textFieldDecorator3, null, true, composer5, 100666368, 1572864, 40960);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer5.skipToGroupEnd();
                                                    }
                                                }, composer4, 54), composer4, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                i24 = iM1885getRevealLastTypedvTwcZD0;
                                                composer3 = composer4;
                                                z5 = z3;
                                                inputTransformation3 = inputTransformation4;
                                                textStyle3 = textStyle4;
                                                keyboardOptions3 = keyboardOptions4;
                                                keyboardActionHandler3 = keyboardActionHandler4;
                                                function22 = function23;
                                                mutableInteractionSource2 = mutableInteractionSource3;
                                                brush2 = solidColor;
                                                textFieldDecorator2 = textFieldDecorator3;
                                                c3 = c2;
                                                modifier3 = companion;
                                            }
                                            basicSecureTextFieldKt$BasicSecureTextField$2$1RememberedValue = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(zM1880equalsimpl0, secureTextFieldController, null);
                                            composer4.updateRememberedValue(basicSecureTextFieldKt$BasicSecureTextField$2$1RememberedValue);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) basicSecureTextFieldKt$BasicSecureTextField$2$1RememberedValue, composer4, 0);
                                            ComposerKt.sourceInformationMarkerStart(composer4, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                            if ((i23 & LDSFile.EF_DG16_TAG) == 32) {
                                            }
                                            objRememberedValue2 = composer4.rememberedValue();
                                            if (!z4) {
                                                if (!TextObfuscationMode.m1880equalsimpl0(iM1885getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1885getRevealLastTypedvTwcZD0())) {
                                                }
                                                composer4.updateRememberedValue(codepointTransformation);
                                                objRememberedValue2 = codepointTransformation;
                                                final CodepointTransformation codepointTransformation22 = (CodepointTransformation) objRememberedValue2;
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                Modifier modifierSemantics2 = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        invoke2(semanticsPropertyReceiver);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                return false;
                                                            }
                                                        }, 1, null);
                                                        SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Boolean invoke() {
                                                                return false;
                                                            }
                                                        }, 1, null);
                                                    }
                                                });
                                                if (!zM1880equalsimpl0) {
                                                }
                                                final Modifier modifierThen2 = modifierSemantics2.then(focusChangeModifier);
                                                final InputTransformation inputTransformation42 = inputTransformation2;
                                                final TextStyle textStyle42 = textStyle2;
                                                final KeyboardActionHandler keyboardActionHandler42 = keyboardActionHandler2;
                                                final KeyboardOptions keyboardOptions42 = secureTextField$foundation_release;
                                                DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i27) {
                                                        InputTransformation inputTransformationThen;
                                                        ComposerKt.sourceInformation(composer5, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                                                        if ((i27 & 3) != 2 || !composer5.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(2023988909, i27, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                                                            }
                                                            TextFieldState textFieldState2 = textFieldState;
                                                            Modifier modifier4 = modifierThen2;
                                                            boolean z6 = z3;
                                                            if (zM1880equalsimpl0) {
                                                                inputTransformationThen = BasicSecureTextFieldKt.then(inputTransformation42, secureTextFieldController.getPasswordInputTransformation());
                                                            } else {
                                                                inputTransformationThen = inputTransformation42;
                                                            }
                                                            BasicTextFieldKt.BasicTextField(textFieldState2, modifier4, z6, false, inputTransformationThen, textStyle42, keyboardOptions42, keyboardActionHandler42, TextFieldLineLimits.SingleLine.INSTANCE, function23, mutableInteractionSource3, solidColor, codepointTransformation22, null, textFieldDecorator3, null, true, composer5, 100666368, 1572864, 40960);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer5.skipToGroupEnd();
                                                    }
                                                }, composer4, 54), composer4, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i24 = iM1885getRevealLastTypedvTwcZD0;
                                                composer3 = composer4;
                                                z5 = z3;
                                                inputTransformation3 = inputTransformation42;
                                                textStyle3 = textStyle42;
                                                keyboardOptions3 = keyboardOptions42;
                                                keyboardActionHandler3 = keyboardActionHandler42;
                                                function22 = function23;
                                                mutableInteractionSource2 = mutableInteractionSource3;
                                                brush2 = solidColor;
                                                textFieldDecorator2 = textFieldDecorator3;
                                                c3 = c2;
                                                modifier3 = companion;
                                            }
                                        } else {
                                            c2 = c4;
                                        }
                                        basicSecureTextFieldKt$BasicSecureTextField$1$1RememberedValue = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController, null);
                                        composer4.updateRememberedValue(basicSecureTextFieldKt$BasicSecureTextField$1$1RememberedValue);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        EffectsKt.LaunchedEffect(secureTextFieldController, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) basicSecureTextFieldKt$BasicSecureTextField$1$1RememberedValue, composer4, 0);
                                        final boolean zM1880equalsimpl02 = TextObfuscationMode.m1880equalsimpl0(iM1885getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1885getRevealLastTypedvTwcZD0());
                                        Boolean boolValueOf2 = Boolean.valueOf(zM1880equalsimpl02);
                                        ComposerKt.sourceInformationMarkerStart(composer4, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                        zChanged = composer4.changed(zM1880equalsimpl02) | composer4.changedInstance(secureTextFieldController);
                                        BasicSecureTextFieldKt$BasicSecureTextField$2$1 basicSecureTextFieldKt$BasicSecureTextField$2$1RememberedValue2 = composer4.rememberedValue();
                                        if (zChanged) {
                                        }
                                        basicSecureTextFieldKt$BasicSecureTextField$2$1RememberedValue2 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(zM1880equalsimpl02, secureTextFieldController, null);
                                        composer4.updateRememberedValue(basicSecureTextFieldKt$BasicSecureTextField$2$1RememberedValue2);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) basicSecureTextFieldKt$BasicSecureTextField$2$1RememberedValue2, composer4, 0);
                                        ComposerKt.sourceInformationMarkerStart(composer4, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                        if ((i23 & LDSFile.EF_DG16_TAG) == 32) {
                                        }
                                        objRememberedValue2 = composer4.rememberedValue();
                                        if (!z4) {
                                        }
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        function22 = function2;
                                        i24 = i;
                                        composer3 = composerStartRestartGroup;
                                        z5 = z2;
                                        inputTransformation3 = inputTransformation2;
                                        textStyle3 = textStyle2;
                                        keyboardActionHandler3 = keyboardActionHandler2;
                                        modifier3 = modifier2;
                                        keyboardOptions3 = keyboardOptions2;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        brush2 = brush;
                                        textFieldDecorator2 = textFieldDecorator;
                                        c3 = c;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i27) {
                                                BasicSecureTextFieldKt.m1723BasicSecureTextFieldJb9bMDk(textFieldState, modifier3, z5, inputTransformation3, textStyle3, keyboardOptions3, keyboardActionHandler3, function22, mutableInteractionSource2, brush2, textFieldDecorator2, i24, c3, composer5, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i5 |= 805306368;
                                i16 = i15;
                                i17 = i4 & 1024;
                                if (i17 == 0) {
                                }
                                i19 = i4 & 2048;
                                if (i19 == 0) {
                                }
                                int i262 = i18;
                                i21 = i4 & 4096;
                                if (i21 == 0) {
                                }
                                if ((i5 & 306783379) == 306783378) {
                                    if (i25 == 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i21 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    Composer composer42 = composer2;
                                    final State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c4), composer42, (i22 >> 6) & 14);
                                    ComposerKt.sourceInformationMarkerStart(composer42, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                    objRememberedValue = composer42.rememberedValue();
                                    i23 = i22;
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    }
                                    final SecureTextFieldController secureTextFieldController2 = (SecureTextFieldController) objRememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(composer42);
                                    ComposerKt.sourceInformationMarkerStart(composer42, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                    zChangedInstance = composer42.changedInstance(secureTextFieldController2);
                                    BasicSecureTextFieldKt$BasicSecureTextField$1$1 basicSecureTextFieldKt$BasicSecureTextField$1$1RememberedValue2 = composer42.rememberedValue();
                                    if (zChangedInstance) {
                                    }
                                    basicSecureTextFieldKt$BasicSecureTextField$1$1RememberedValue2 = new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController2, null);
                                    composer42.updateRememberedValue(basicSecureTextFieldKt$BasicSecureTextField$1$1RememberedValue2);
                                    ComposerKt.sourceInformationMarkerEnd(composer42);
                                    EffectsKt.LaunchedEffect(secureTextFieldController2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) basicSecureTextFieldKt$BasicSecureTextField$1$1RememberedValue2, composer42, 0);
                                    final boolean zM1880equalsimpl022 = TextObfuscationMode.m1880equalsimpl0(iM1885getRevealLastTypedvTwcZD0, TextObfuscationMode.INSTANCE.m1885getRevealLastTypedvTwcZD0());
                                    Boolean boolValueOf22 = Boolean.valueOf(zM1880equalsimpl022);
                                    ComposerKt.sourceInformationMarkerStart(composer42, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                    zChanged = composer42.changed(zM1880equalsimpl022) | composer42.changedInstance(secureTextFieldController2);
                                    BasicSecureTextFieldKt$BasicSecureTextField$2$1 basicSecureTextFieldKt$BasicSecureTextField$2$1RememberedValue22 = composer42.rememberedValue();
                                    if (zChanged) {
                                    }
                                    basicSecureTextFieldKt$BasicSecureTextField$2$1RememberedValue22 = new BasicSecureTextFieldKt$BasicSecureTextField$2$1(zM1880equalsimpl022, secureTextFieldController2, null);
                                    composer42.updateRememberedValue(basicSecureTextFieldKt$BasicSecureTextField$2$1RememberedValue22);
                                    ComposerKt.sourceInformationMarkerEnd(composer42);
                                    EffectsKt.LaunchedEffect(boolValueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) basicSecureTextFieldKt$BasicSecureTextField$2$1RememberedValue22, composer42, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer42, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
                                    if ((i23 & LDSFile.EF_DG16_TAG) == 32) {
                                    }
                                    objRememberedValue2 = composer42.rememberedValue();
                                    if (!z4) {
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i14 = i13;
                            i15 = i4 & 512;
                            if (i15 == 0) {
                            }
                            i16 = i15;
                            i17 = i4 & 1024;
                            if (i17 == 0) {
                            }
                            i19 = i4 & 2048;
                            if (i19 == 0) {
                            }
                            int i2622 = i18;
                            i21 = i4 & 4096;
                            if (i21 == 0) {
                            }
                            if ((i5 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i12 = i11;
                        i13 = i4 & 256;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i4 & 512;
                        if (i15 == 0) {
                        }
                        i16 = i15;
                        i17 = i4 & 1024;
                        if (i17 == 0) {
                        }
                        i19 = i4 & 2048;
                        if (i19 == 0) {
                        }
                        int i26222 = i18;
                        i21 = i4 & 4096;
                        if (i21 == 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    textStyle2 = textStyle;
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i4 & 256;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i4 & 512;
                    if (i15 == 0) {
                    }
                    i16 = i15;
                    i17 = i4 & 1024;
                    if (i17 == 0) {
                    }
                    i19 = i4 & 2048;
                    if (i19 == 0) {
                    }
                    int i262222 = i18;
                    i21 = i4 & 4096;
                    if (i21 == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                inputTransformation2 = inputTransformation;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                textStyle2 = textStyle;
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i4 & 256;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i4 & 512;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i4 & 1024;
                if (i17 == 0) {
                }
                i19 = i4 & 2048;
                if (i19 == 0) {
                }
                int i2622222 = i18;
                i21 = i4 & 4096;
                if (i21 == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            inputTransformation2 = inputTransformation;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            textStyle2 = textStyle;
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i4 & 256;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i4 & 512;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i4 & 1024;
            if (i17 == 0) {
            }
            i19 = i4 & 2048;
            if (i19 == 0) {
            }
            int i26222222 = i18;
            i21 = i4 & 4096;
            if (i21 == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        inputTransformation2 = inputTransformation;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        textStyle2 = textStyle;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i4 & 256;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i4 & 512;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i4 & 1024;
        if (i17 == 0) {
        }
        i19 = i4 & 2048;
        if (i19 == 0) {
        }
        int i262222222 = i18;
        i21 = i4 & 4096;
        if (i21 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3(State state, int i, int i2) {
        return ((Character) state.getValue()).charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputTransformation then(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        return inputTransformation == null ? inputTransformation2 : inputTransformation2 == null ? inputTransformation : InputTransformationKt.then(inputTransformation, inputTransformation2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisableCutCopy(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1085555050);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DisableCutCopy)311@13911L7,312@13949L680,331@14706L361,331@14634L433:BasicSecureTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1085555050, i2, -1, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:310)");
            }
            ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localTextToolbar);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final TextToolbar textToolbar = (TextToolbar) objConsume;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1202776994, "CC(remember):BasicSecureTextField.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(textToolbar);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new TextToolbar() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1
                    private final /* synthetic */ TextToolbar $$delegate_0;

                    @Override // androidx.compose.p000ui.platform.TextToolbar
                    public TextToolbarStatus getStatus() {
                        return this.$$delegate_0.getStatus();
                    }

                    @Override // androidx.compose.p000ui.platform.TextToolbar
                    public void hide() {
                        this.$$delegate_0.hide();
                    }

                    {
                        this.$$delegate_0 = this.$currentToolbar;
                    }

                    @Override // androidx.compose.p000ui.platform.TextToolbar
                    public void showMenu(Rect rect, Function0<Unit> onCopyRequested, Function0<Unit> onPasteRequested, Function0<Unit> onCutRequested, Function0<Unit> onSelectAllRequested) {
                        this.$currentToolbar.showMenu(rect, null, onPasteRequested, null, onSelectAllRequested);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalTextToolbar().provides((BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) objRememberedValue), ComposableLambdaKt.rememberComposableLambda(-1448819882, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt.DisableCutCopy.1
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

                public final void invoke(Composer composer2, int i3) {
                    ComposerKt.sourceInformation(composer2, "C332@14716L345:BasicSecureTextField.kt#423gt5");
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1448819882, i3, -1, "androidx.compose.foundation.text.DisableCutCopy.<anonymous> (BasicSecureTextField.kt:332)");
                        }
                        Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(Modifier.INSTANCE, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt.DisableCutCopy.1.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return m1724invokeZmokQxo(keyEvent.m5649unboximpl());
                            }

                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m1724invokeZmokQxo(android.view.KeyEvent keyEvent) {
                                KeyCommand keyCommandMo1751mapZmokQxo = KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo1751mapZmokQxo(keyEvent);
                                return Boolean.valueOf(keyCommandMo1751mapZmokQxo == KeyCommand.COPY || keyCommandMo1751mapZmokQxo == KeyCommand.CUT);
                            }
                        });
                        Function2<Composer, Integer, Unit> function22 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierOnPreviewKeyEvent);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer2);
                        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1177942586, "C338@15042L9:BasicSecureTextField.kt#423gt5");
                        function22.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt.DisableCutCopy.2
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

                public final void invoke(Composer composer2, int i3) {
                    BasicSecureTextFieldKt.DisableCutCopy(function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
