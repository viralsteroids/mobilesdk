package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.accompanist.permissions.PermissionStatus;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: PermissionsUtil.kt */
@Metadata(m513d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a%\u0010\u0010\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\u0015H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005¨\u0006\u001a"}, m514d2 = {"isGranted", "", "Lcom/google/accompanist/permissions/PermissionStatus;", "isGranted$annotations", "(Lcom/google/accompanist/permissions/PermissionStatus;)V", "(Lcom/google/accompanist/permissions/PermissionStatus;)Z", "shouldShowRationale", "getShouldShowRationale$annotations", "getShouldShowRationale", "PermissionLifecycleCheckerEffect", "", "permissionState", "Lcom/google/accompanist/permissions/MutablePermissionState;", "lifecycleEvent", "Landroidx/lifecycle/Lifecycle$Event;", "(Lcom/google/accompanist/permissions/MutablePermissionState;Landroidx/lifecycle/Lifecycle$Event;Landroidx/compose/runtime/Composer;II)V", "PermissionsLifecycleCheckerEffect", "permissions", "", "(Ljava/util/List;Landroidx/lifecycle/Lifecycle$Event;Landroidx/compose/runtime/Composer;II)V", "checkPermission", "Landroid/content/Context;", "permission", "", "findActivity", "Landroid/app/Activity;", "permissions_release"}, m515k = 2, m516mv = {1, 9, 0}, m518xi = 48)
/* loaded from: classes2.dex */
public final class PermissionsUtilKt {
    public static /* synthetic */ void getShouldShowRationale$annotations(PermissionStatus permissionStatus) {
    }

    public static /* synthetic */ void isGranted$annotations(PermissionStatus permissionStatus) {
    }

    public static final boolean isGranted(PermissionStatus permissionStatus) {
        Intrinsics.checkNotNullParameter(permissionStatus, "<this>");
        return Intrinsics.areEqual(permissionStatus, PermissionStatus.Granted.INSTANCE);
    }

    public static final boolean getShouldShowRationale(PermissionStatus permissionStatus) {
        Intrinsics.checkNotNullParameter(permissionStatus, "<this>");
        if (Intrinsics.areEqual(permissionStatus, PermissionStatus.Granted.INSTANCE)) {
            return false;
        }
        if (permissionStatus instanceof PermissionStatus.Denied) {
            return ((PermissionStatus.Denied) permissionStatus).getShouldShowRationale();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void PermissionLifecycleCheckerEffect(final MutablePermissionState permissionState, final Lifecycle.Event event, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(permissionState, "permissionState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1770945943);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(permissionState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & LDSFile.EF_DG16_TAG) == 0) {
            i3 |= composerStartRestartGroup.changed(event) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                event = Lifecycle.Event.ON_RESUME;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1770945943, i3, -1, "com.google.accompanist.permissions.PermissionLifecycleCheckerEffect (PermissionsUtil.kt:75)");
            }
            composerStartRestartGroup.startReplaceableGroup(-899069773);
            boolean z = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new LifecycleEventObserver() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$$ExternalSyntheticLambda0
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                        PermissionsUtilKt.PermissionLifecycleCheckerEffect$lambda$1$lambda$0(event, permissionState, lifecycleOwner, event2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Lifecycle lifecycle = ((LifecycleOwner) objConsume).getLifecycle();
            EffectsKt.DisposableEffect(lifecycle, lifecycleEventObserver, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt.PermissionLifecycleCheckerEffect.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    lifecycle.addObserver(lifecycleEventObserver);
                    final Lifecycle lifecycle2 = lifecycle;
                    final LifecycleEventObserver lifecycleEventObserver2 = lifecycleEventObserver;
                    return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            lifecycle2.removeObserver(lifecycleEventObserver2);
                        }
                    };
                }
            }, composerStartRestartGroup, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt.PermissionLifecycleCheckerEffect.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    PermissionsUtilKt.PermissionLifecycleCheckerEffect(permissionState, event, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PermissionLifecycleCheckerEffect$lambda$1$lambda$0(Lifecycle.Event event, MutablePermissionState permissionState, LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
        Intrinsics.checkNotNullParameter(permissionState, "$permissionState");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event2, "event");
        if (event2 != event || Intrinsics.areEqual(permissionState.getStatus(), PermissionStatus.Granted.INSTANCE)) {
            return;
        }
        permissionState.refreshPermissionStatus$permissions_release();
    }

    public static final void PermissionsLifecycleCheckerEffect(final List<MutablePermissionState> permissions, final Lifecycle.Event event, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Composer composerStartRestartGroup = composer.startRestartGroup(1533427666);
        if ((i2 & 2) != 0) {
            event = Lifecycle.Event.ON_RESUME;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1533427666, i, -1, "com.google.accompanist.permissions.PermissionsLifecycleCheckerEffect (PermissionsUtil.kt:105)");
        }
        composerStartRestartGroup.startReplaceableGroup(-1664752182);
        boolean zChanged = composerStartRestartGroup.changed(permissions);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LifecycleEventObserver() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$$ExternalSyntheticLambda1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                    PermissionsUtilKt.PermissionsLifecycleCheckerEffect$lambda$3$lambda$2(event, permissions, lifecycleOwner, event2);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final LifecycleEventObserver lifecycleEventObserver = (LifecycleEventObserver) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localLifecycleOwner);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        final Lifecycle lifecycle = ((LifecycleOwner) objConsume).getLifecycle();
        EffectsKt.DisposableEffect(lifecycle, lifecycleEventObserver, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt.PermissionsLifecycleCheckerEffect.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                lifecycle.addObserver(lifecycleEventObserver);
                final Lifecycle lifecycle2 = lifecycle;
                final LifecycleEventObserver lifecycleEventObserver2 = lifecycleEventObserver;
                return new DisposableEffectResult() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        lifecycle2.removeObserver(lifecycleEventObserver2);
                    }
                };
            }
        }, composerStartRestartGroup, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.accompanist.permissions.PermissionsUtilKt.PermissionsLifecycleCheckerEffect.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    PermissionsUtilKt.PermissionsLifecycleCheckerEffect(permissions, event, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PermissionsLifecycleCheckerEffect$lambda$3$lambda$2(Lifecycle.Event event, List permissions, LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event2, "event");
        if (event2 == event) {
            Iterator it = permissions.iterator();
            while (it.hasNext()) {
                MutablePermissionState mutablePermissionState = (MutablePermissionState) it.next();
                if (!Intrinsics.areEqual(mutablePermissionState.getStatus(), PermissionStatus.Granted.INSTANCE)) {
                    mutablePermissionState.refreshPermissionStatus$permissions_release();
                }
            }
        }
    }

    public static final Activity findActivity(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        throw new IllegalStateException("Permissions should be called in the context of an Activity");
    }

    public static final boolean checkPermission(Context context, String permission) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    public static final boolean shouldShowRationale(Activity activity, String permission) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ActivityCompat.shouldShowRequestPermissionRationale(activity, permission);
    }
}
