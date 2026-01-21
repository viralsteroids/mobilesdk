package androidx.navigation.compose;

import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.Navigator;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.lds.LDSFile;

/* compiled from: NavHost.kt */
@Metadata(m513d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aó\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2$\b\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0018\u001aµ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u001f\b\u0002\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0014\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0019\u001a»\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u001d\b\u0002\u0010\u001e\u001a\u0017\u0012\u0004\u0012\u00020 \u0012\r\u0012\u000b\u0012\u0002\b\u00030!¢\u0006\u0002\b\u00100\u001f2$\b\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010$\u001a\u0098\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020%2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010%2$\b\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010&\u001aÚ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020%2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010%2\u001f\b\u0002\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0014\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010'\u001aL\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020%2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010%2\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010(\u001a¿\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001d2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u001d\b\u0002\u0010\u001e\u001a\u0017\u0012\u0004\u0012\u00020 \u0012\r\u0012\u000b\u0012\u0002\b\u00030!¢\u0006\u0002\b\u00100\u001f2$\b\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010)\u001a\u001c\u0010*\u001a\u0004\u0018\u00010\u000f*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010-\u001a\u0004\u0018\u00010\u0013*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010.\u001a\u0004\u0018\u00010\u000f*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010/\u001a\u0004\u0018\u00010\u0013*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u00100\u001a\u0004\u0018\u00010\u0017*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¨\u00061²\u0006\u0010\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e03X\u008a\u0084\u0002²\u0006\n\u00104\u001a\u000205X\u008a\u008e\u0002²\u0006\n\u00106\u001a\u000207X\u008a\u008e\u0002²\u0006\u0010\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e03X\u008a\u0084\u0002²\u0006\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e03X\u008a\u0084\u0002"}, m514d2 = {"NavHost", "", "navController", "Landroidx/navigation/NavHostController;", "graph", "Landroidx/navigation/NavGraph;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "contentAlignment", "Landroidx/compose/ui/Alignment;", "enterTransition", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "exitTransition", "Landroidx/compose/animation/ExitTransition;", "popEnterTransition", "popExitTransition", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "startDestination", "", "route", "Lkotlin/reflect/KClass;", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "builder", "Landroidx/navigation/NavGraphBuilder;", "(Landroidx/navigation/NavHostController;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Lkotlin/reflect/KClass;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "createEnterTransition", "Landroidx/navigation/NavDestination;", "scope", "createExitTransition", "createPopEnterTransition", "createPopExitTransition", "createSizeTransform", "navigation-compose_release", "currentBackStack", "", NotificationCompat.CATEGORY_PROGRESS, "", "inPredictiveBack", "", "allVisibleEntries", "visibleEntries"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes2.dex */
public final class NavHostKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void NavHost(final NavHostController navHostController, final String str, Modifier modifier, String str2, final Function1 function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str3;
        String str4;
        boolean z;
        Object objRememberedValue;
        final Modifier modifier3;
        final String str5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(141827520);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NavHost)P(2,4,1,3)93@3780L126,91@3740L190:NavHost.kt#opm8kd");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    str3 = str2;
                    i3 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    str4 = i4 == 0 ? null : str3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(141827520, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:90)");
                    }
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 652764344, "CC(remember):NavHost.kt#9igjgp");
                    z = ((i3 & 7168) != 2048) | ((i3 & LDSFile.EF_DG16_TAG) != 32) | ((57344 & i3) == 16384);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str4);
                        function1.invoke(navGraphBuilder);
                        objRememberedValue = navGraphBuilder.build();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    int i6 = i3 & 910;
                    Modifier modifier4 = companion;
                    NavHost(navHostController, (NavGraph) objRememberedValue, modifier4, null, null, null, null, null, null, composerStartRestartGroup, i6, 504);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    str5 = str4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    str5 = str3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.2
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

                        public final void invoke(Composer composer2, int i7) {
                            NavHostKt.NavHost(navHostController, str, modifier3, str5, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            str3 = str2;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) != 9362) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 652764344, "CC(remember):NavHost.kt#9igjgp");
                z = ((i3 & 7168) != 2048) | ((i3 & LDSFile.EF_DG16_TAG) != 32) | ((57344 & i3) == 16384);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str4);
                    function1.invoke(navGraphBuilder2);
                    objRememberedValue = navGraphBuilder2.build();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    int i62 = i3 & 910;
                    Modifier modifier42 = companion;
                    NavHost(navHostController, (NavGraph) objRememberedValue, modifier42, null, null, null, null, null, null, composerStartRestartGroup, i62, 504);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    str5 = str4;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        str3 = str2;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports sizeTransform")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void NavHost(final NavHostController navHostController, final String str, Modifier modifier, Alignment alignment, String str2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, final Function1 function15, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Alignment topStart;
        int i5;
        String str3;
        int i6;
        Function1 function16;
        int i7;
        Function1 function17;
        Function1 function18;
        Function1 function19;
        int i8;
        Modifier modifier3;
        Alignment alignment2;
        Function1 function110;
        Function1 function111;
        String str4;
        boolean z;
        Object objRememberedValue;
        final Function1 function112;
        Composer composer2;
        final Function1 function113;
        final Function1 function114;
        final Alignment alignment3;
        final Function1 function115;
        final String str5;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(410432995);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NavHost)P(5,9,4,1,8,2,3,6,7)145@6005L126,143@5965L320:NavHost.kt#opm8kd");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
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
                    topStart = alignment;
                    i3 |= composerStartRestartGroup.changed(topStart) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        str3 = str2;
                        i3 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        function16 = function1;
                    } else {
                        function16 = function1;
                        if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function16) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        function17 = function12;
                    } else {
                        function17 = function12;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function17) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changedInstance(function13)) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= ((i2 & 256) == 0 && composerStartRestartGroup.changedInstance(function14)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function15) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                topStart = Alignment.INSTANCE.getTopStart();
                            }
                            if (i5 != 0) {
                                str3 = null;
                            }
                            if (i6 != 0) {
                                function16 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                    }
                                };
                            }
                            if (i7 != 0) {
                                function17 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                    }
                                };
                            }
                            if ((i2 & 128) == 0) {
                                i3 &= -29360129;
                                function18 = function16;
                            } else {
                                function18 = function13;
                            }
                            if ((i2 & 256) == 0) {
                                function19 = function18;
                                i8 = i3 & (-234881025);
                                modifier3 = modifier2;
                                alignment2 = topStart;
                                function110 = function17;
                                function111 = function110;
                                str4 = str3;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(410432995, i8, -1, "androidx.navigation.compose.NavHost (NavHost.kt:142)");
                                }
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 652835544, "CC(remember):NavHost.kt#9igjgp");
                                z = ((i8 & 57344) != 16384) | ((i8 & LDSFile.EF_DG16_TAG) != 32) | ((1879048192 & i8) != 536870912);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str4);
                                    function15.invoke(navGraphBuilder);
                                    objRememberedValue = navGraphBuilder.build();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                int i10 = i8 & 8078;
                                int i11 = i8 >> 3;
                                String str6 = str4;
                                NavHost(navHostController, (NavGraph) objRememberedValue, modifier3, alignment2, function16, function110, function19, function111, null, composerStartRestartGroup, (i11 & 29360128) | i10 | (i11 & 57344) | (458752 & i11) | (3670016 & i11), 256);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function112 = function19;
                                composer2 = composerStartRestartGroup;
                                function113 = function16;
                                function114 = function111;
                                alignment3 = alignment2;
                                function115 = function110;
                                str5 = str6;
                                modifier4 = modifier3;
                            } else {
                                function19 = function18;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            function19 = function13;
                        }
                        i8 = i3;
                        modifier3 = modifier2;
                        alignment2 = topStart;
                        function110 = function17;
                        str4 = str3;
                        function111 = function14;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 652835544, "CC(remember):NavHost.kt#9igjgp");
                        z = ((i8 & 57344) != 16384) | ((i8 & LDSFile.EF_DG16_TAG) != 32) | ((1879048192 & i8) != 536870912);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str4);
                            function15.invoke(navGraphBuilder2);
                            objRememberedValue = navGraphBuilder2.build();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            int i102 = i8 & 8078;
                            int i112 = i8 >> 3;
                            String str62 = str4;
                            NavHost(navHostController, (NavGraph) objRememberedValue, modifier3, alignment2, function16, function110, function19, function111, null, composerStartRestartGroup, (i112 & 29360128) | i102 | (i112 & 57344) | (458752 & i112) | (3670016 & i112), 256);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function112 = function19;
                            composer2 = composerStartRestartGroup;
                            function113 = function16;
                            function114 = function111;
                            alignment3 = alignment2;
                            function115 = function110;
                            str5 = str62;
                            modifier4 = modifier3;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function112 = function13;
                        function113 = function16;
                        modifier4 = modifier2;
                        alignment3 = topStart;
                        composer2 = composerStartRestartGroup;
                        function115 = function17;
                        str5 = str3;
                        function114 = function14;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.6
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

                            public final void invoke(Composer composer3, int i12) {
                                NavHostKt.NavHost(navHostController, str, modifier4, alignment3, str5, function113, function115, function112, function114, function15, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                str3 = str2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        if ((i2 & 256) == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            topStart = alignment;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            str3 = str2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        topStart = alignment;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        str3 = str2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavHost(final NavHostController navHostController, final String str, Modifier modifier, Alignment alignment, String str2, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function12, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function13, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function14, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function15, final Function1<? super NavGraphBuilder, Unit> function16, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Alignment alignment2;
        int i6;
        String str3;
        int i7;
        C25327 c25327;
        int i8;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function17;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function18;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function19;
        Modifier modifier3;
        String str4;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function110;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function111;
        Alignment alignment3;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function112;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function113;
        Modifier modifier4;
        boolean z;
        Object objRememberedValue;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function114;
        Composer composer2;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function115;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function116;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function117;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function118;
        final String str5;
        final Alignment alignment4;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1840250294);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NavHost)P(5,10,4,1,8,2,3,6,7,9)213@8656L126,211@8616L343:NavHost.kt#opm8kd");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    alignment2 = alignment;
                    i4 |= composerStartRestartGroup.changed(alignment2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        str3 = str2;
                        i4 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        c25327 = function1;
                    } else {
                        c25327 = function1;
                        if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(c25327) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            function17 = function13;
                            int i15 = composerStartRestartGroup.changedInstance(function17) ? 8388608 : 4194304;
                            i4 |= i15;
                        } else {
                            function17 = function13;
                        }
                        i4 |= i15;
                    } else {
                        function17 = function13;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changedInstance(function14)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i9 = i3 & 512;
                    if (i9 != 0) {
                        if ((i & 805306368) == 0) {
                            i10 = i9;
                            i4 |= composerStartRestartGroup.changedInstance(function15) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i2 | (composerStartRestartGroup.changedInstance(function16) ? 4 : 2);
                        } else {
                            i11 = i2;
                        }
                        int i16 = i4;
                        if ((i4 & 306783379) != 306783378 || (i11 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i14 == 0 ? Modifier.INSTANCE : modifier2;
                                Alignment topStart = i5 == 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                                if (i6 != 0) {
                                    str3 = null;
                                }
                                if (i7 != 0) {
                                    c25327 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.7
                                        @Override // kotlin.jvm.functions.Function1
                                        public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                            return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                        }
                                    };
                                }
                                C25338 c25338 = i8 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                    }
                                } : function12;
                                if ((i3 & 128) == 0) {
                                    i12 = i16 & (-29360129);
                                    function17 = c25327;
                                } else {
                                    i12 = i16;
                                }
                                if ((i3 & 256) == 0) {
                                    i13 = i12 & (-234881025);
                                    function18 = c25338;
                                } else {
                                    i13 = i12;
                                    function18 = function14;
                                }
                                if (i10 == 0) {
                                    Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function119 = function18;
                                    modifier3 = companion;
                                    str4 = str3;
                                    function110 = function17;
                                    function111 = c25327;
                                    alignment3 = topStart;
                                    function112 = c25338;
                                    function113 = null;
                                    function19 = function119;
                                } else {
                                    function19 = function18;
                                    modifier3 = companion;
                                    str4 = str3;
                                    function110 = function17;
                                    function111 = c25327;
                                    alignment3 = topStart;
                                    function112 = c25338;
                                    function113 = function15;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                int i17 = (i3 & 128) != 0 ? i16 & (-29360129) : i16;
                                if ((i3 & 256) != 0) {
                                    i17 &= -234881025;
                                }
                                function112 = function12;
                                function113 = function15;
                                str4 = str3;
                                function110 = function17;
                                function111 = c25327;
                                alignment3 = alignment2;
                                i13 = i17;
                                modifier3 = modifier2;
                                function19 = function14;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                modifier4 = modifier3;
                            } else {
                                modifier4 = modifier3;
                                ComposerKt.traceEventStart(1840250294, i13, i11, "androidx.navigation.compose.NavHost (NavHost.kt:210)");
                            }
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 652920376, "CC(remember):NavHost.kt#9igjgp");
                            z = ((i13 & LDSFile.EF_DG16_TAG) != 32) | ((57344 & i13) != 16384) | ((i11 & 14) != 4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str4);
                                function16.invoke(navGraphBuilder);
                                objRememberedValue = navGraphBuilder.build();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            int i18 = i13 & 8078;
                            int i19 = i13 >> 3;
                            String str6 = str4;
                            Modifier modifier6 = modifier4;
                            NavHost(navHostController, (NavGraph) objRememberedValue, modifier6, alignment3, function111, function112, function110, function19, function113, composerStartRestartGroup, (i19 & 234881024) | i18 | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (29360128 & i19), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function114 = function113;
                            composer2 = composerStartRestartGroup;
                            function115 = function110;
                            function116 = function19;
                            function117 = function111;
                            function118 = function112;
                            str5 = str6;
                            alignment4 = alignment3;
                            modifier5 = modifier6;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function115 = function17;
                            str5 = str3;
                            composer2 = composerStartRestartGroup;
                            alignment4 = alignment2;
                            function116 = function14;
                            function114 = function15;
                            function117 = c25327;
                            modifier5 = modifier2;
                            function118 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.10
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

                                public final void invoke(Composer composer3, int i20) {
                                    NavHostKt.NavHost(navHostController, str, modifier5, alignment4, str5, function117, function118, function115, function116, function114, function16, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i10 = i9;
                    if ((i3 & 1024) != 0) {
                    }
                    int i162 = i4;
                    if ((i4 & 306783379) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i14 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 == 0) {
                            }
                            if ((i3 & 128) == 0) {
                            }
                            if ((i3 & 256) == 0) {
                            }
                            if (i10 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 652920376, "CC(remember):NavHost.kt#9igjgp");
                            if ((57344 & i13) != 16384) {
                            }
                            z = ((i13 & LDSFile.EF_DG16_TAG) != 32) | ((57344 & i13) != 16384) | ((i11 & 14) != 4);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z) {
                                NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str4);
                                function16.invoke(navGraphBuilder2);
                                objRememberedValue = navGraphBuilder2.build();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                int i182 = i13 & 8078;
                                int i192 = i13 >> 3;
                                String str62 = str4;
                                Modifier modifier62 = modifier4;
                                NavHost(navHostController, (NavGraph) objRememberedValue, modifier62, alignment3, function111, function112, function110, function19, function113, composerStartRestartGroup, (i192 & 234881024) | i182 | (57344 & i192) | (458752 & i192) | (3670016 & i192) | (29360128 & i192), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function114 = function113;
                                composer2 = composerStartRestartGroup;
                                function115 = function110;
                                function116 = function19;
                                function117 = function111;
                                function118 = function112;
                                str5 = str62;
                                alignment4 = alignment3;
                                modifier5 = modifier62;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str3 = str2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                }
                i10 = i9;
                if ((i3 & 1024) != 0) {
                }
                int i1622 = i4;
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            alignment2 = alignment;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            str3 = str2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i9;
            if ((i3 & 1024) != 0) {
            }
            int i16222 = i4;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        alignment2 = alignment;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        str3 = str2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        if ((i3 & 1024) != 0) {
        }
        int i162222 = i4;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavHost(final NavHostController navHostController, final KClass<?> kClass, Modifier modifier, Alignment alignment, KClass<?> kClass2, Map<KType, NavType<?>> map, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function12, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function13, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function14, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function15, final Function1<? super NavGraphBuilder, Unit> function16, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Alignment alignment2;
        int i6;
        KClass<?> kClass3;
        int i7;
        Map<KType, NavType<?>> mapEmptyMap;
        int i8;
        C251111 c251111;
        int i9;
        int i10;
        int i11;
        int i12;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function17;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function18;
        int i13;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function19;
        Modifier modifier3;
        KClass<?> kClass4;
        Alignment alignment3;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function110;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function111;
        Alignment alignment4;
        boolean zChanged;
        Object objRememberedValue;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function112;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function113;
        Composer composer2;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function114;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function115;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function116;
        final KClass<?> kClass5;
        final Map<KType, NavType<?>> map2;
        final Alignment alignment5;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(750467758);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NavHost)P(5,10,4,1,8,11,2,3,6,7,9)285@11603L135,283@11563L352:NavHost.kt#opm8kd");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(kClass) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    alignment2 = alignment;
                    i4 |= composerStartRestartGroup.changed(alignment2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 == 0) {
                    if ((i & 24576) == 0) {
                        kClass3 = kClass2;
                        i4 |= composerStartRestartGroup.changedInstance(kClass3) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        mapEmptyMap = map;
                    } else {
                        mapEmptyMap = map;
                        if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(mapEmptyMap) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        c251111 = function1;
                    } else {
                        c251111 = function1;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(c251111) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changedInstance(function13)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changedInstance(function14)) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i12 = i2 | 6;
                        i11 = i10;
                    } else if ((i2 & 6) == 0) {
                        i11 = i10;
                        i12 = i2 | (composerStartRestartGroup.changedInstance(function15) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    if ((i3 & 2048) == 0) {
                        i12 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i12 |= composerStartRestartGroup.changedInstance(function16) ? 32 : 16;
                    }
                    int i15 = i12;
                    int i16 = i4;
                    if ((i4 & 306783379) == 306783378 || (i15 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i14 == 0 ? Modifier.INSTANCE : modifier2;
                            Alignment topStart = i5 == 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                            function17 = null;
                            if (i6 != 0) {
                                kClass3 = null;
                            }
                            if (i7 != 0) {
                                mapEmptyMap = MapsKt.emptyMap();
                            }
                            if (i8 != 0) {
                                c251111 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.11
                                    @Override // kotlin.jvm.functions.Function1
                                    public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                    }
                                };
                            }
                            C251212 c251212 = i9 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.12
                                @Override // kotlin.jvm.functions.Function1
                                public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                    return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                }
                            } : function12;
                            if ((i3 & 256) == 0) {
                                i13 = i16 & (-234881025);
                                function18 = c251111;
                            } else {
                                function18 = function13;
                                i13 = i16;
                            }
                            if ((i3 & 512) == 0) {
                                i13 &= -1879048193;
                                function19 = c251212;
                            } else {
                                function19 = function14;
                            }
                            if (i11 == 0) {
                                Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function117 = function19;
                                modifier3 = companion;
                                kClass4 = kClass3;
                                alignment3 = topStart;
                                function110 = c251212;
                                function111 = function117;
                                composerStartRestartGroup.endDefaults();
                                Modifier modifier5 = modifier3;
                                if (ComposerKt.isTraceInProgress()) {
                                    alignment4 = alignment3;
                                } else {
                                    alignment4 = alignment3;
                                    ComposerKt.traceEventStart(750467758, i13, i15, "androidx.navigation.compose.NavHost (NavHost.kt:282)");
                                }
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653014689, "CC(remember):NavHost.kt#9igjgp");
                                zChanged = ((i15 & LDSFile.EF_DG16_TAG) != 32) | composerStartRestartGroup.changed(kClass4) | composerStartRestartGroup.changed(kClass);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.get_navigatorProvider(), kClass, kClass4, mapEmptyMap);
                                    function16.invoke(navGraphBuilder);
                                    objRememberedValue = navGraphBuilder.build();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                int i17 = i13 >> 6;
                                int i18 = (i13 & 8078) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128) | ((i15 << 24) & 234881024);
                                Alignment alignment6 = alignment4;
                                KClass<?> kClass6 = kClass4;
                                Map<KType, NavType<?>> map3 = mapEmptyMap;
                                Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function118 = c251111;
                                Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function119 = function18;
                                NavHost(navHostController, (NavGraph) objRememberedValue, modifier5, alignment6, function118, function110, function119, function111, function17, composerStartRestartGroup, i18, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function112 = function111;
                                function113 = function17;
                                composer2 = composerStartRestartGroup;
                                function114 = function118;
                                function115 = function110;
                                function116 = function119;
                                kClass5 = kClass6;
                                map2 = map3;
                                alignment5 = alignment6;
                                modifier4 = modifier5;
                            } else {
                                Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function120 = function19;
                                modifier3 = companion;
                                kClass4 = kClass3;
                                alignment3 = topStart;
                                function110 = c251212;
                                function111 = function120;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            int i19 = (i3 & 256) != 0 ? i16 & (-234881025) : i16;
                            if ((i3 & 512) != 0) {
                                i19 &= -1879048193;
                            }
                            Alignment alignment7 = alignment2;
                            i13 = i19;
                            kClass4 = kClass3;
                            alignment3 = alignment7;
                            function110 = function12;
                            function18 = function13;
                            function111 = function14;
                            modifier3 = modifier2;
                        }
                        function17 = function15;
                        composerStartRestartGroup.endDefaults();
                        Modifier modifier52 = modifier3;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653014689, "CC(remember):NavHost.kt#9igjgp");
                        zChanged = ((i15 & LDSFile.EF_DG16_TAG) != 32) | composerStartRestartGroup.changed(kClass4) | composerStartRestartGroup.changed(kClass);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController.get_navigatorProvider(), kClass, kClass4, mapEmptyMap);
                            function16.invoke(navGraphBuilder2);
                            objRememberedValue = navGraphBuilder2.build();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            int i172 = i13 >> 6;
                            int i182 = (i13 & 8078) | (57344 & i172) | (458752 & i172) | (3670016 & i172) | (i172 & 29360128) | ((i15 << 24) & 234881024);
                            Alignment alignment62 = alignment4;
                            KClass<?> kClass62 = kClass4;
                            Map<KType, NavType<?>> map32 = mapEmptyMap;
                            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1182 = c251111;
                            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1192 = function18;
                            NavHost(navHostController, (NavGraph) objRememberedValue, modifier52, alignment62, function1182, function110, function1192, function111, function17, composerStartRestartGroup, i182, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function112 = function111;
                            function113 = function17;
                            composer2 = composerStartRestartGroup;
                            function114 = function1182;
                            function115 = function110;
                            function116 = function1192;
                            kClass5 = kClass62;
                            map2 = map32;
                            alignment5 = alignment62;
                            modifier4 = modifier52;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function112 = function14;
                        kClass5 = kClass3;
                        function114 = c251111;
                        modifier4 = modifier2;
                        composer2 = composerStartRestartGroup;
                        function115 = function12;
                        function116 = function13;
                        map2 = mapEmptyMap;
                        alignment5 = alignment2;
                        function113 = function15;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.14
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

                            public final void invoke(Composer composer3, int i20) {
                                NavHostKt.NavHost(navHostController, kClass, modifier4, alignment5, kClass5, map2, function114, function115, function116, function112, function113, (Function1<? super NavGraphBuilder, Unit>) function16, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 24576;
                kClass3 = kClass2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                int i152 = i12;
                int i162 = i4;
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i14 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        function17 = null;
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        if (i11 == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            alignment2 = alignment;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            kClass3 = kClass2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            int i1522 = i12;
            int i1622 = i4;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        alignment2 = alignment;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        kClass3 = kClass2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i15222 = i12;
        int i16222 = i4;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavHost(final NavHostController navHostController, final Object obj, Modifier modifier, Alignment alignment, KClass<?> kClass, Map<KType, NavType<?>> map, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function12, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function13, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function14, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function15, final Function1<? super NavGraphBuilder, Unit> function16, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Alignment alignment2;
        int i6;
        KClass<?> kClass2;
        int i7;
        Map<KType, NavType<?>> mapEmptyMap;
        int i8;
        C251415 c251415;
        int i9;
        int i10;
        int i11;
        int i12;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function17;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function18;
        int i13;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function19;
        Modifier modifier3;
        KClass<?> kClass3;
        Alignment alignment3;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function110;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function111;
        Alignment alignment4;
        boolean zChanged;
        Object objRememberedValue;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function112;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function113;
        Composer composer2;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function114;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function115;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function116;
        final KClass<?> kClass4;
        final Map<KType, NavType<?>> map2;
        final Alignment alignment5;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1476019057);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NavHost)P(5,10,4,1,8,11,2,3,6,7,9)357@14555L135,355@14515L352:NavHost.kt#opm8kd");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(obj) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    alignment2 = alignment;
                    i4 |= composerStartRestartGroup.changed(alignment2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 == 0) {
                    if ((i & 24576) == 0) {
                        kClass2 = kClass;
                        i4 |= composerStartRestartGroup.changedInstance(kClass2) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        mapEmptyMap = map;
                    } else {
                        mapEmptyMap = map;
                        if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(mapEmptyMap) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        c251415 = function1;
                    } else {
                        c251415 = function1;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(c251415) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changedInstance(function13)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changedInstance(function14)) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i12 = i2 | 6;
                        i11 = i10;
                    } else if ((i2 & 6) == 0) {
                        i11 = i10;
                        i12 = i2 | (composerStartRestartGroup.changedInstance(function15) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    if ((i3 & 2048) == 0) {
                        i12 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i12 |= composerStartRestartGroup.changedInstance(function16) ? 32 : 16;
                    }
                    int i15 = i12;
                    int i16 = i4;
                    if ((i4 & 306783379) == 306783378 || (i15 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i14 == 0 ? Modifier.INSTANCE : modifier2;
                            Alignment topStart = i5 == 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                            function17 = null;
                            if (i6 != 0) {
                                kClass2 = null;
                            }
                            if (i7 != 0) {
                                mapEmptyMap = MapsKt.emptyMap();
                            }
                            if (i8 != 0) {
                                c251415 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.15
                                    @Override // kotlin.jvm.functions.Function1
                                    public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                    }
                                };
                            }
                            C251516 c251516 = i9 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.16
                                @Override // kotlin.jvm.functions.Function1
                                public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                    return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                }
                            } : function12;
                            if ((i3 & 256) == 0) {
                                i13 = i16 & (-234881025);
                                function18 = c251415;
                            } else {
                                function18 = function13;
                                i13 = i16;
                            }
                            if ((i3 & 512) == 0) {
                                i13 &= -1879048193;
                                function19 = c251516;
                            } else {
                                function19 = function14;
                            }
                            if (i11 == 0) {
                                Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function117 = function19;
                                modifier3 = companion;
                                kClass3 = kClass2;
                                alignment3 = topStart;
                                function110 = c251516;
                                function111 = function117;
                                composerStartRestartGroup.endDefaults();
                                Modifier modifier5 = modifier3;
                                if (ComposerKt.isTraceInProgress()) {
                                    alignment4 = alignment3;
                                } else {
                                    alignment4 = alignment3;
                                    ComposerKt.traceEventStart(-1476019057, i13, i15, "androidx.navigation.compose.NavHost (NavHost.kt:354)");
                                }
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653109153, "CC(remember):NavHost.kt#9igjgp");
                                zChanged = ((i15 & LDSFile.EF_DG16_TAG) != 32) | composerStartRestartGroup.changed(kClass3) | composerStartRestartGroup.changed(obj);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.get_navigatorProvider(), obj, kClass3, mapEmptyMap);
                                    function16.invoke(navGraphBuilder);
                                    objRememberedValue = navGraphBuilder.build();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                int i17 = i13 >> 6;
                                int i18 = (i13 & 8078) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128) | ((i15 << 24) & 234881024);
                                Alignment alignment6 = alignment4;
                                KClass<?> kClass5 = kClass3;
                                Map<KType, NavType<?>> map3 = mapEmptyMap;
                                Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function118 = c251415;
                                Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function119 = function18;
                                NavHost(navHostController, (NavGraph) objRememberedValue, modifier5, alignment6, function118, function110, function119, function111, function17, composerStartRestartGroup, i18, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function112 = function111;
                                function113 = function17;
                                composer2 = composerStartRestartGroup;
                                function114 = function118;
                                function115 = function110;
                                function116 = function119;
                                kClass4 = kClass5;
                                map2 = map3;
                                alignment5 = alignment6;
                                modifier4 = modifier5;
                            } else {
                                Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function120 = function19;
                                modifier3 = companion;
                                kClass3 = kClass2;
                                alignment3 = topStart;
                                function110 = c251516;
                                function111 = function120;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            int i19 = (i3 & 256) != 0 ? i16 & (-234881025) : i16;
                            if ((i3 & 512) != 0) {
                                i19 &= -1879048193;
                            }
                            Alignment alignment7 = alignment2;
                            i13 = i19;
                            kClass3 = kClass2;
                            alignment3 = alignment7;
                            function110 = function12;
                            function18 = function13;
                            function111 = function14;
                            modifier3 = modifier2;
                        }
                        function17 = function15;
                        composerStartRestartGroup.endDefaults();
                        Modifier modifier52 = modifier3;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653109153, "CC(remember):NavHost.kt#9igjgp");
                        zChanged = ((i15 & LDSFile.EF_DG16_TAG) != 32) | composerStartRestartGroup.changed(kClass3) | composerStartRestartGroup.changed(obj);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController.get_navigatorProvider(), obj, kClass3, mapEmptyMap);
                            function16.invoke(navGraphBuilder2);
                            objRememberedValue = navGraphBuilder2.build();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            int i172 = i13 >> 6;
                            int i182 = (i13 & 8078) | (57344 & i172) | (458752 & i172) | (3670016 & i172) | (i172 & 29360128) | ((i15 << 24) & 234881024);
                            Alignment alignment62 = alignment4;
                            KClass<?> kClass52 = kClass3;
                            Map<KType, NavType<?>> map32 = mapEmptyMap;
                            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1182 = c251415;
                            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1192 = function18;
                            NavHost(navHostController, (NavGraph) objRememberedValue, modifier52, alignment62, function1182, function110, function1192, function111, function17, composerStartRestartGroup, i182, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function112 = function111;
                            function113 = function17;
                            composer2 = composerStartRestartGroup;
                            function114 = function1182;
                            function115 = function110;
                            function116 = function1192;
                            kClass4 = kClass52;
                            map2 = map32;
                            alignment5 = alignment62;
                            modifier4 = modifier52;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function112 = function14;
                        kClass4 = kClass2;
                        function114 = c251415;
                        modifier4 = modifier2;
                        composer2 = composerStartRestartGroup;
                        function115 = function12;
                        function116 = function13;
                        map2 = mapEmptyMap;
                        alignment5 = alignment2;
                        function113 = function15;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.18
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

                            public final void invoke(Composer composer3, int i20) {
                                NavHostKt.NavHost(navHostController, obj, modifier4, alignment5, kClass4, map2, function114, function115, function116, function112, function113, function16, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 24576;
                kClass2 = kClass;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                int i152 = i12;
                int i162 = i4;
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i14 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        function17 = null;
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        if (i11 == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            alignment2 = alignment;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            kClass2 = kClass;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            int i1522 = i12;
            int i1622 = i4;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        alignment2 = alignment;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        kClass2 = kClass;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i15222 = i12;
        int i16222 = i4;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void NavHost(final NavHostController navHostController, final NavGraph navGraph, Modifier modifier, Composer composer, final int i, final int i2) {
        NavHostController navHostController2;
        int i3;
        NavGraph navGraph2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-957014592);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NavHost)P(2)392@15641L39:NavHost.kt#opm8kd");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            navHostController2 = navHostController;
        } else if ((i & 6) == 0) {
            navHostController2 = navHostController;
            i3 = (composerStartRestartGroup.changedInstance(navHostController2) ? 4 : 2) | i;
        } else {
            navHostController2 = navHostController;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            navGraph2 = navGraph;
        } else {
            navGraph2 = navGraph;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(navGraph2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-957014592, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:392)");
                }
                NavHost(navHostController2, navGraph2, modifier4, null, null, null, null, null, null, composerStartRestartGroup, i3 & 1022, 504);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.19
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
                        NavHostKt.NavHost(navHostController, navGraph, modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            NavHost(navHostController2, navGraph2, modifier4, null, null, null, null, null, null, composerStartRestartGroup, i3 & 1022, 504);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0112  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports sizeTransform")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void NavHost(final NavHostController navHostController, final NavGraph navGraph, Modifier modifier, Alignment alignment, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Composer composer, final int i, final int i2) {
        NavHostController navHostController2;
        int i3;
        NavGraph navGraph2;
        Modifier modifier2;
        int i4;
        Alignment topStart;
        int i5;
        Function1 function15;
        int i6;
        Function1 function16;
        Function1 function17;
        Function1 function18;
        Modifier modifier3;
        Function1 function19;
        final Modifier modifier4;
        final Alignment alignment2;
        final Function1 function110;
        final Function1 function111;
        final Function1 function112;
        final Function1 function113;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1818191915);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NavHost)P(5,3,4)431@17424L199:NavHost.kt#opm8kd");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            navHostController2 = navHostController;
        } else {
            navHostController2 = navHostController;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(navHostController2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            navGraph2 = navGraph;
        } else {
            navGraph2 = navGraph;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(navGraph2) ? 32 : 16;
            }
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
                    topStart = alignment;
                    i3 |= composerStartRestartGroup.changed(topStart) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function15 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function15) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            function16 = function12;
                            i3 |= composerStartRestartGroup.changedInstance(function16) ? 131072 : 65536;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                function17 = function13;
                                int i8 = composerStartRestartGroup.changedInstance(function17) ? 1048576 : 524288;
                                i3 |= i8;
                            } else {
                                function17 = function13;
                            }
                            i3 |= i8;
                        } else {
                            function17 = function13;
                        }
                        if ((i & 12582912) == 0) {
                            i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changedInstance(function14)) ? 8388608 : 4194304;
                        }
                        if ((i3 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    topStart = Alignment.INSTANCE.getTopStart();
                                }
                                if (i5 != 0) {
                                    function15 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.20
                                        @Override // kotlin.jvm.functions.Function1
                                        public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                            return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                        }
                                    };
                                }
                                if (i6 != 0) {
                                    function16 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.21
                                        @Override // kotlin.jvm.functions.Function1
                                        public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                            return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                        }
                                    };
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    function17 = function15;
                                }
                                if ((i2 & 128) == 0) {
                                    i3 &= -29360129;
                                    modifier3 = companion;
                                    function19 = function16;
                                    function18 = function19;
                                    Function1 function114 = function17;
                                    Alignment alignment3 = topStart;
                                    Function1 function115 = function15;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1818191915, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:430)");
                                    }
                                    NavHost(navHostController2, navGraph2, modifier3, alignment3, function115, function19, function114, function18, null, composerStartRestartGroup, i3 & 33554430, 256);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier4 = modifier3;
                                    alignment2 = alignment3;
                                    function110 = function115;
                                    function111 = function19;
                                    function112 = function114;
                                    function113 = function18;
                                } else {
                                    function18 = function14;
                                    modifier3 = companion;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                function18 = function14;
                                modifier3 = modifier2;
                            }
                            function19 = function16;
                            Function1 function1142 = function17;
                            Alignment alignment32 = topStart;
                            Function1 function1152 = function15;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            NavHost(navHostController2, navGraph2, modifier3, alignment32, function1152, function19, function1142, function18, null, composerStartRestartGroup, i3 & 33554430, 256);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            alignment2 = alignment32;
                            function110 = function1152;
                            function111 = function19;
                            function112 = function1142;
                            function113 = function18;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            alignment2 = topStart;
                            function110 = function15;
                            function111 = function16;
                            function112 = function17;
                            function113 = function14;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.22
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

                                public final void invoke(Composer composer2, int i9) {
                                    NavHostKt.NavHost(navHostController, navGraph, modifier4, alignment2, function110, function111, function112, function113, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    function16 = function12;
                    if ((1572864 & i) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    if ((i3 & 4793491) != 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if ((i2 & 64) != 0) {
                            }
                            if ((i2 & 128) == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function15 = function1;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                function16 = function12;
                if ((1572864 & i) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i3 & 4793491) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            topStart = alignment;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function15 = function1;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            function16 = function12;
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i3 & 4793491) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        topStart = alignment;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function15 = function1;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        function16 = function12;
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i3 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavHost(final NavHostController navHostController, final NavGraph navGraph, Modifier modifier, Alignment alignment, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function12, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function13, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function14, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function15, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        Alignment topStart;
        int i6;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function16;
        int i7;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function17;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function18;
        int i8;
        int i9;
        int i10;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function19;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function110;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function111;
        final Modifier modifier3;
        final Alignment alignment2;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function112;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function113;
        int i11;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function114;
        ViewModelStoreOwner current;
        Alignment alignment3;
        State state;
        final MutableState mutableState;
        Object obj;
        final Alignment alignment4;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function115;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function116;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function117;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function118;
        final Modifier modifier4;
        int i12;
        DialogNavigator dialogNavigator;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function119;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function120;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function121;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function122;
        Composer composer2;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function123;
        Object objRememberedValue;
        Transition transitionRememberTransition;
        DialogNavigator dialogNavigator2;
        Object obj2;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final MutableState mutableState2;
        boolean zChanged;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1964664536);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NavHost)P(5,3,4)492@19706L7,*494@19790L7,509@20395L16,511@20433L36,512@20498L34,513@20586L987,513@20537L1036,540@21612L138,540@21579L171,546@21782L29,548@21871L16,551@21976L186,561@22257L42,732@30615L27:NavHost.kt#opm8kd");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(navGraph) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        topStart = alignment;
                        i3 |= composerStartRestartGroup.changed(topStart) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            function16 = function1;
                            i3 |= composerStartRestartGroup.changedInstance(function16) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        } else {
                            if ((196608 & i) == 0) {
                                function17 = function12;
                                i3 |= composerStartRestartGroup.changedInstance(function17) ? 131072 : 65536;
                            }
                            if ((i & 1572864) != 0) {
                                function18 = function13;
                                i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changedInstance(function18)) ? 1048576 : 524288;
                            } else {
                                function18 = function13;
                            }
                            if ((i & 12582912) == 0) {
                                i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changedInstance(function14)) ? 8388608 : 4194304;
                            }
                            i8 = i2 & 256;
                            if (i8 != 0) {
                                if ((i & 100663296) == 0) {
                                    i9 = i8;
                                    i3 |= composerStartRestartGroup.changedInstance(function15) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                i10 = i3;
                                if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i4 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i5 != 0) {
                                            topStart = Alignment.INSTANCE.getTopStart();
                                        }
                                        if (i6 != 0) {
                                            function16 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.23
                                                @Override // kotlin.jvm.functions.Function1
                                                public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                                    return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                                }
                                            };
                                        }
                                        if (i7 != 0) {
                                            function17 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.24
                                                @Override // kotlin.jvm.functions.Function1
                                                public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                                    return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                                }
                                            };
                                        }
                                        if ((i2 & 64) != 0) {
                                            i10 &= -3670017;
                                            function18 = function16;
                                        }
                                        if ((i2 & 128) == 0) {
                                            i10 &= -29360129;
                                            function19 = function17;
                                        } else {
                                            function19 = function14;
                                        }
                                        function110 = function19;
                                        function111 = function18;
                                        modifier3 = modifier2;
                                        alignment2 = topStart;
                                        function112 = function16;
                                        function113 = function17;
                                        i11 = i10;
                                        if (i9 == 0) {
                                            function114 = null;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1964664536, i11, -1, "androidx.navigation.compose.NavHost (NavHost.kt:490)");
                                        }
                                        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object objConsume = composerStartRestartGroup.consume(localLifecycleOwner);
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        final LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume;
                                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                        if (current == null) {
                                            throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString());
                                        }
                                        navHostController.setViewModelStore(current.getViewModelStore());
                                        navHostController.setGraph(navGraph);
                                        Navigator navigator = navHostController.get_navigatorProvider().getNavigator(ComposeNavigator.NAME);
                                        final ComposeNavigator composeNavigator = navigator instanceof ComposeNavigator ? (ComposeNavigator) navigator : null;
                                        if (composeNavigator == null) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                                            if (scopeUpdateScopeEndRestartGroup2 != null) {
                                                final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function124 = function111;
                                                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$composeNavigator$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                        invoke(composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer3, int i13) {
                                                        NavHostKt.NavHost(navHostController, navGraph, modifier3, alignment2, function112, function113, function124, function110, function114, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function125 = function111;
                                        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function126 = function112;
                                        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function127 = function113;
                                        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function128 = function110;
                                        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function129 = function114;
                                        State stateCollectAsState = SnapshotStateKt.collectAsState(composeNavigator.getBackStack(), null, composerStartRestartGroup, 0, 1);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653297150, "CC(remember):NavHost.kt#9igjgp");
                                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        }
                                        MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue4;
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653299228, "CC(remember):NavHost.kt#9igjgp");
                                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        Modifier modifier5 = modifier3;
                                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            alignment3 = alignment2;
                                            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                        } else {
                                            alignment3 = alignment2;
                                        }
                                        MutableState mutableState3 = (MutableState) objRememberedValue5;
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        boolean z = NavHost$lambda$6(stateCollectAsState).size() > 1;
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653302997, "CC(remember):NavHost.kt#9igjgp");
                                        boolean zChanged2 = composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changed(composeNavigator);
                                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                        if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            state = stateCollectAsState;
                                            mutableState = mutableState3;
                                            obj = (Function2) new NavHostKt$NavHost$25$1(composeNavigator, stateCollectAsState, mutableFloatState, mutableState3, null);
                                            composerStartRestartGroup.updateRememberedValue(obj);
                                        } else {
                                            state = stateCollectAsState;
                                            obj = objRememberedValue6;
                                            mutableState = mutableState3;
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        int i13 = i11;
                                        PredictiveBackHandlerKt.PredictiveBackHandler(z, (Function2) obj, composerStartRestartGroup, 0, 0);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653334980, "CC(remember):NavHost.kt#9igjgp");
                                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navHostController) | composerStartRestartGroup.changedInstance(lifecycleOwner);
                                        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue7 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$26$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                    navHostController.setLifecycleOwner(lifecycleOwner);
                                                    return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$26$1$invoke$$inlined$onDispose$1
                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                        public void dispose() {
                                                        }
                                                    };
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composerStartRestartGroup, 0);
                                        final SaveableStateHolder saveableStateHolderRememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(composerStartRestartGroup, 0);
                                        final State stateCollectAsState2 = SnapshotStateKt.collectAsState(navHostController.getVisibleEntries(), null, composerStartRestartGroup, 0, 1);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653346676, "CC(remember):NavHost.kt#9igjgp");
                                        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue8 = SnapshotStateKt.derivedStateOf(new Function0<List<? extends NavBackStackEntry>>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$visibleEntries$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final List<? extends NavBackStackEntry> invoke() {
                                                    List listNavHost$lambda$15 = NavHostKt.NavHost$lambda$15(stateCollectAsState2);
                                                    ArrayList arrayList = new ArrayList();
                                                    for (Object obj3 : listNavHost$lambda$15) {
                                                        if (Intrinsics.areEqual(((NavBackStackEntry) obj3).getDestination().getNavigatorName(), ComposeNavigator.NAME)) {
                                                            arrayList.add(obj3);
                                                        }
                                                    }
                                                    return arrayList;
                                                }
                                            });
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                        }
                                        final State state2 = (State) objRememberedValue8;
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        final NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull((List) NavHost$lambda$17(state2));
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653355524, "CC(remember):NavHost.kt#9igjgp");
                                        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue9 = (Map) new LinkedHashMap();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                        }
                                        final Map map = (Map) objRememberedValue9;
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        composerStartRestartGroup.startReplaceGroup(653365120);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "564@22433L597,578@23128L597,594@23856L301,602@24190L146,602@24167L169,608@24368L348,615@24743L52,656@26717L1208,682@28002L1465,654@26649L2818,709@29540L861,709@29476L925");
                                        if (navBackStackEntry != null) {
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653361711, "CC(remember):NavHost.kt#9igjgp");
                                            boolean zChanged3 = composerStartRestartGroup.changed(composeNavigator) | ((((i13 & 3670016) ^ 1572864) > 1048576 && composerStartRestartGroup.changed(function125)) || (i13 & 1572864) == 1048576) | ((i13 & 57344) == 16384);
                                            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue10 = (Function1) new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$finalEnter$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                                        NavDestination destination = animatedContentTransitionScope.getTargetState().getDestination();
                                                        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                        ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
                                                        EnterTransition enterTransition = null;
                                                        if (composeNavigator.isPop$navigation_compose_release().getValue().booleanValue() || NavHostKt.NavHost$lambda$11(mutableState)) {
                                                            Iterator<NavDestination> it = NavDestination.INSTANCE.getHierarchy(destination2).iterator();
                                                            while (true) {
                                                                if (!it.hasNext()) {
                                                                    break;
                                                                }
                                                                EnterTransition enterTransitionCreatePopEnterTransition = NavHostKt.createPopEnterTransition(it.next(), animatedContentTransitionScope);
                                                                if (enterTransitionCreatePopEnterTransition != null) {
                                                                    enterTransition = enterTransitionCreatePopEnterTransition;
                                                                    break;
                                                                }
                                                            }
                                                            return enterTransition == null ? function125.invoke(animatedContentTransitionScope) : enterTransition;
                                                        }
                                                        Iterator<NavDestination> it2 = NavDestination.INSTANCE.getHierarchy(destination2).iterator();
                                                        while (true) {
                                                            if (!it2.hasNext()) {
                                                                break;
                                                            }
                                                            EnterTransition enterTransitionCreateEnterTransition = NavHostKt.createEnterTransition(it2.next(), animatedContentTransitionScope);
                                                            if (enterTransitionCreateEnterTransition != null) {
                                                                enterTransition = enterTransitionCreateEnterTransition;
                                                                break;
                                                            }
                                                        }
                                                        return enterTransition == null ? function126.invoke(animatedContentTransitionScope) : enterTransition;
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                            }
                                            final Function1 function130 = (Function1) objRememberedValue10;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653383951, "CC(remember):NavHost.kt#9igjgp");
                                            function117 = function126;
                                            boolean zChanged4 = composerStartRestartGroup.changed(composeNavigator) | ((((i13 & 29360128) ^ 12582912) > 8388608 && composerStartRestartGroup.changed(function128)) || (i13 & 12582912) == 8388608) | ((i13 & 458752) == 131072);
                                            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue11 = (Function1) new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$finalExit$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                                        NavDestination destination = animatedContentTransitionScope.getInitialState().getDestination();
                                                        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                        ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
                                                        ExitTransition exitTransition = null;
                                                        if (composeNavigator.isPop$navigation_compose_release().getValue().booleanValue() || NavHostKt.NavHost$lambda$11(mutableState)) {
                                                            Iterator<NavDestination> it = NavDestination.INSTANCE.getHierarchy(destination2).iterator();
                                                            while (true) {
                                                                if (!it.hasNext()) {
                                                                    break;
                                                                }
                                                                ExitTransition exitTransitionCreatePopExitTransition = NavHostKt.createPopExitTransition(it.next(), animatedContentTransitionScope);
                                                                if (exitTransitionCreatePopExitTransition != null) {
                                                                    exitTransition = exitTransitionCreatePopExitTransition;
                                                                    break;
                                                                }
                                                            }
                                                            return exitTransition == null ? function128.invoke(animatedContentTransitionScope) : exitTransition;
                                                        }
                                                        Iterator<NavDestination> it2 = NavDestination.INSTANCE.getHierarchy(destination2).iterator();
                                                        while (true) {
                                                            if (!it2.hasNext()) {
                                                                break;
                                                            }
                                                            ExitTransition exitTransitionCreateExitTransition = NavHostKt.createExitTransition(it2.next(), animatedContentTransitionScope);
                                                            if (exitTransitionCreateExitTransition != null) {
                                                                exitTransition = exitTransitionCreateExitTransition;
                                                                break;
                                                            }
                                                        }
                                                        return exitTransition == null ? function127.invoke(animatedContentTransitionScope) : exitTransition;
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                            }
                                            final Function1 function131 = (Function1) objRememberedValue11;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653406951, "CC(remember):NavHost.kt#9igjgp");
                                            function115 = function128;
                                            boolean z2 = (i13 & 234881024) == 67108864;
                                            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                            if (z2 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue12 = (Function1) new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$finalSizeTransform$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final SizeTransform invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                                        SizeTransform sizeTransformCreateSizeTransform;
                                                        NavDestination destination = animatedContentTransitionScope.getTargetState().getDestination();
                                                        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                        Iterator<NavDestination> it = NavDestination.INSTANCE.getHierarchy((ComposeNavigator.Destination) destination).iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                sizeTransformCreateSizeTransform = null;
                                                                break;
                                                            }
                                                            sizeTransformCreateSizeTransform = NavHostKt.createSizeTransform(it.next(), animatedContentTransitionScope);
                                                            if (sizeTransformCreateSizeTransform != null) {
                                                                break;
                                                            }
                                                        }
                                                        if (sizeTransformCreateSizeTransform != null) {
                                                            return sizeTransformCreateSizeTransform;
                                                        }
                                                        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function132 = function129;
                                                        if (function132 != null) {
                                                            return function132.invoke(animatedContentTransitionScope);
                                                        }
                                                        return null;
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                            }
                                            final Function1 function132 = (Function1) objRememberedValue12;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            MutableState mutableState4 = mutableState;
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653417484, "CC(remember):NavHost.kt#9igjgp");
                                            boolean zChanged5 = composerStartRestartGroup.changed(composeNavigator);
                                            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged5) {
                                                function116 = function129;
                                            } else {
                                                function116 = function129;
                                                if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                EffectsKt.DisposableEffect((Object) true, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue13, composerStartRestartGroup, 6);
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653423382, "CC(remember):NavHost.kt#9igjgp");
                                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new SeekableTransitionState(navBackStackEntry);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                }
                                                final SeekableTransitionState seekableTransitionState = (SeekableTransitionState) objRememberedValue;
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                function118 = function125;
                                                transitionRememberTransition = TransitionKt.rememberTransition(seekableTransitionState, "entry", composerStartRestartGroup, SeekableTransitionState.$stable | 48, 0);
                                                if (!NavHost$lambda$11(mutableState4)) {
                                                    composerStartRestartGroup.startReplaceGroup(-1218260648);
                                                    ComposerKt.sourceInformation(composerStartRestartGroup, "618@24866L159,618@24841L184");
                                                    Float fValueOf = Float.valueOf(NavHost$lambda$8(mutableFloatState));
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653439129, "CC(remember):NavHost.kt#9igjgp");
                                                    boolean zChanged6 = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changedInstance(seekableTransitionState);
                                                    Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                                                    if (zChanged6 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue14 = (Function2) new NavHostKt$NavHost$28$1(seekableTransitionState, state, mutableFloatState, null);
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    EffectsKt.LaunchedEffect(fValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue14, composerStartRestartGroup, 0);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    dialogNavigator2 = null;
                                                    i12 = 0;
                                                } else {
                                                    composerStartRestartGroup.startReplaceGroup(-1218005611);
                                                    ComposerKt.sourceInformation(composerStartRestartGroup, "623@25086L1532,623@25055L1563");
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653447542, "CC(remember):NavHost.kt#9igjgp");
                                                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(seekableTransitionState) | composerStartRestartGroup.changedInstance(navBackStackEntry) | composerStartRestartGroup.changed(transitionRememberTransition);
                                                    Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                                                    if (zChangedInstance3 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                                        dialogNavigator2 = null;
                                                        obj2 = (Function2) new NavHostKt$NavHost$29$1(seekableTransitionState, navBackStackEntry, transitionRememberTransition, null);
                                                        composerStartRestartGroup.updateRememberedValue(obj2);
                                                    } else {
                                                        obj2 = objRememberedValue15;
                                                        dialogNavigator2 = null;
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    i12 = 0;
                                                    EffectsKt.LaunchedEffect(navBackStackEntry, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj2, composerStartRestartGroup, 0);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                }
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653499410, "CC(remember):NavHost.kt#9igjgp");
                                                zChangedInstance = composerStartRestartGroup.changedInstance(map) | composerStartRestartGroup.changed(composeNavigator) | composerStartRestartGroup.changed(function130) | composerStartRestartGroup.changed(function131) | composerStartRestartGroup.changed(function132);
                                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    mutableState2 = mutableState4;
                                                    final ComposeNavigator composeNavigator2 = composeNavigator;
                                                    objRememberedValue2 = (Function1) new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ContentTransform>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$30$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final ContentTransform invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                                            float fFloatValue;
                                                            if (NavHostKt.NavHost$lambda$17(state2).contains(animatedContentTransitionScope.getInitialState())) {
                                                                Float f = map.get(animatedContentTransitionScope.getInitialState().getId());
                                                                if (f != null) {
                                                                    fFloatValue = f.floatValue();
                                                                } else {
                                                                    map.put(animatedContentTransitionScope.getInitialState().getId(), Float.valueOf(0.0f));
                                                                    fFloatValue = 0.0f;
                                                                }
                                                                if (!Intrinsics.areEqual(animatedContentTransitionScope.getTargetState().getId(), animatedContentTransitionScope.getInitialState().getId())) {
                                                                    fFloatValue = (composeNavigator2.isPop$navigation_compose_release().getValue().booleanValue() || NavHostKt.NavHost$lambda$11(mutableState2)) ? fFloatValue - 1.0f : fFloatValue + 1.0f;
                                                                }
                                                                map.put(animatedContentTransitionScope.getTargetState().getId(), Float.valueOf(fFloatValue));
                                                                return new ContentTransform(function130.invoke(animatedContentTransitionScope), function131.invoke(animatedContentTransitionScope), fFloatValue, function132.invoke(animatedContentTransitionScope));
                                                            }
                                                            return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                } else {
                                                    mutableState2 = mutableState4;
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                final MutableState mutableState5 = mutableState2;
                                                dialogNavigator = dialogNavigator2;
                                                alignment4 = alignment3;
                                                AnimatedContentKt.AnimatedContent(transitionRememberTransition, modifier5, (Function1) objRememberedValue2, alignment4, new Function1<NavBackStackEntry, Object>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.31
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(NavBackStackEntry navBackStackEntry2) {
                                                        return navBackStackEntry2.getId();
                                                    }
                                                }, ComposableLambdaKt.rememberComposableLambda(820763100, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.32
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(4);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function4
                                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry2, Composer composer3, Integer num) {
                                                        invoke(animatedContentScope, navBackStackEntry2, composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    /* JADX WARN: Type inference failed for: r0v10 */
                                                    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
                                                    /* JADX WARN: Type inference failed for: r0v9 */
                                                    public final void invoke(final AnimatedContentScope animatedContentScope, final NavBackStackEntry navBackStackEntry2, Composer composer3, int i14) {
                                                        NavBackStackEntry navBackStackEntryPrevious;
                                                        ComposerKt.sourceInformation(composer3, "C702@29281L176,702@29240L217:NavHost.kt#opm8kd");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(820763100, i14, -1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:689)");
                                                        }
                                                        boolean zAreEqual = Intrinsics.areEqual(seekableTransitionState.getCurrentState(), navBackStackEntry);
                                                        if (!NavHostKt.NavHost$lambda$11(mutableState5) && !zAreEqual) {
                                                            List listNavHost$lambda$17 = NavHostKt.NavHost$lambda$17(state2);
                                                            ListIterator listIterator = listNavHost$lambda$17.listIterator(listNavHost$lambda$17.size());
                                                            while (true) {
                                                                if (!listIterator.hasPrevious()) {
                                                                    navBackStackEntryPrevious = 0;
                                                                    break;
                                                                } else {
                                                                    navBackStackEntryPrevious = listIterator.previous();
                                                                    if (Intrinsics.areEqual(navBackStackEntry2, (NavBackStackEntry) navBackStackEntryPrevious)) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            navBackStackEntry2 = navBackStackEntryPrevious;
                                                        }
                                                        if (navBackStackEntry2 != null) {
                                                            NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry2, saveableStateHolderRememberSaveableStateHolder, ComposableLambdaKt.rememberComposableLambda(-1263531443, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.32.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                    invoke(composer4, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(Composer composer4, int i15) {
                                                                    ComposerKt.sourceInformation(composer4, "C703@29358L85:NavHost.kt#opm8kd");
                                                                    if ((i15 & 3) != 2 || !composer4.getSkipping()) {
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(-1263531443, i15, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:703)");
                                                                        }
                                                                        NavDestination destination = navBackStackEntry2.getDestination();
                                                                        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                                        ((ComposeNavigator.Destination) destination).getContent$navigation_compose_release().invoke(animatedContentScope, navBackStackEntry2, composer4, 0);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    composer4.skipToGroupEnd();
                                                                }
                                                            }, composer3, 54), composer3, 384);
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 3) & LDSFile.EF_DG16_TAG) | 221184 | (i13 & 7168), 0);
                                                modifier4 = modifier5;
                                                Object currentState = transitionRememberTransition.getCurrentState();
                                                Object targetState = transitionRememberTransition.getTargetState();
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653589399, "CC(remember):NavHost.kt#9igjgp");
                                                zChanged = composerStartRestartGroup.changed(transitionRememberTransition) | composerStartRestartGroup.changedInstance(navHostController) | composerStartRestartGroup.changed(composeNavigator) | composerStartRestartGroup.changedInstance(map);
                                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                if (!zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue3 = (Function2) new NavHostKt$NavHost$33$1(transitionRememberTransition, navHostController, map, state2, composeNavigator, null);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                EffectsKt.LaunchedEffect(currentState, targetState, (Function2) objRememberedValue3, composerStartRestartGroup, i12);
                                            }
                                            objRememberedValue13 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$27$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                    final State<List<NavBackStackEntry>> state3 = state2;
                                                    final ComposeNavigator composeNavigator3 = composeNavigator;
                                                    return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$27$1$invoke$$inlined$onDispose$1
                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                        public void dispose() {
                                                            Iterator it = NavHostKt.NavHost$lambda$17(state3).iterator();
                                                            while (it.hasNext()) {
                                                                composeNavigator3.onTransitionComplete((NavBackStackEntry) it.next());
                                                            }
                                                        }
                                                    };
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            EffectsKt.DisposableEffect((Object) true, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue13, composerStartRestartGroup, 6);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653423382, "CC(remember):NavHost.kt#9igjgp");
                                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            }
                                            final SeekableTransitionState<NavBackStackEntry> seekableTransitionState2 = (SeekableTransitionState) objRememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            function118 = function125;
                                            transitionRememberTransition = TransitionKt.rememberTransition(seekableTransitionState2, "entry", composerStartRestartGroup, SeekableTransitionState.$stable | 48, 0);
                                            if (!NavHost$lambda$11(mutableState4)) {
                                            }
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653499410, "CC(remember):NavHost.kt#9igjgp");
                                            zChangedInstance = composerStartRestartGroup.changedInstance(map) | composerStartRestartGroup.changed(composeNavigator) | composerStartRestartGroup.changed(function130) | composerStartRestartGroup.changed(function131) | composerStartRestartGroup.changed(function132);
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance) {
                                                mutableState2 = mutableState4;
                                                final ComposeNavigator composeNavigator22 = composeNavigator;
                                                objRememberedValue2 = (Function1) new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ContentTransform>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$30$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final ContentTransform invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                                        float fFloatValue;
                                                        if (NavHostKt.NavHost$lambda$17(state2).contains(animatedContentTransitionScope.getInitialState())) {
                                                            Float f = map.get(animatedContentTransitionScope.getInitialState().getId());
                                                            if (f != null) {
                                                                fFloatValue = f.floatValue();
                                                            } else {
                                                                map.put(animatedContentTransitionScope.getInitialState().getId(), Float.valueOf(0.0f));
                                                                fFloatValue = 0.0f;
                                                            }
                                                            if (!Intrinsics.areEqual(animatedContentTransitionScope.getTargetState().getId(), animatedContentTransitionScope.getInitialState().getId())) {
                                                                fFloatValue = (composeNavigator22.isPop$navigation_compose_release().getValue().booleanValue() || NavHostKt.NavHost$lambda$11(mutableState2)) ? fFloatValue - 1.0f : fFloatValue + 1.0f;
                                                            }
                                                            map.put(animatedContentTransitionScope.getTargetState().getId(), Float.valueOf(fFloatValue));
                                                            return new ContentTransform(function130.invoke(animatedContentTransitionScope), function131.invoke(animatedContentTransitionScope), fFloatValue, function132.invoke(animatedContentTransitionScope));
                                                        }
                                                        return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                final MutableState<Boolean> mutableState52 = mutableState2;
                                                dialogNavigator = dialogNavigator2;
                                                alignment4 = alignment3;
                                                AnimatedContentKt.AnimatedContent(transitionRememberTransition, modifier5, (Function1) objRememberedValue2, alignment4, new Function1<NavBackStackEntry, Object>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.31
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(NavBackStackEntry navBackStackEntry2) {
                                                        return navBackStackEntry2.getId();
                                                    }
                                                }, ComposableLambdaKt.rememberComposableLambda(820763100, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.32
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(4);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function4
                                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry2, Composer composer3, Integer num) {
                                                        invoke(animatedContentScope, navBackStackEntry2, composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    /* JADX WARN: Type inference failed for: r0v10 */
                                                    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
                                                    /* JADX WARN: Type inference failed for: r0v9 */
                                                    public final void invoke(final AnimatedContentScope animatedContentScope, final NavBackStackEntry navBackStackEntry2, Composer composer3, int i14) {
                                                        NavBackStackEntry navBackStackEntryPrevious;
                                                        ComposerKt.sourceInformation(composer3, "C702@29281L176,702@29240L217:NavHost.kt#opm8kd");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(820763100, i14, -1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:689)");
                                                        }
                                                        boolean zAreEqual = Intrinsics.areEqual(seekableTransitionState2.getCurrentState(), navBackStackEntry);
                                                        if (!NavHostKt.NavHost$lambda$11(mutableState52) && !zAreEqual) {
                                                            List listNavHost$lambda$17 = NavHostKt.NavHost$lambda$17(state2);
                                                            ListIterator listIterator = listNavHost$lambda$17.listIterator(listNavHost$lambda$17.size());
                                                            while (true) {
                                                                if (!listIterator.hasPrevious()) {
                                                                    navBackStackEntryPrevious = 0;
                                                                    break;
                                                                } else {
                                                                    navBackStackEntryPrevious = listIterator.previous();
                                                                    if (Intrinsics.areEqual(navBackStackEntry2, (NavBackStackEntry) navBackStackEntryPrevious)) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            navBackStackEntry2 = navBackStackEntryPrevious;
                                                        }
                                                        if (navBackStackEntry2 != null) {
                                                            NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry2, saveableStateHolderRememberSaveableStateHolder, ComposableLambdaKt.rememberComposableLambda(-1263531443, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.32.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                    invoke(composer4, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(Composer composer4, int i15) {
                                                                    ComposerKt.sourceInformation(composer4, "C703@29358L85:NavHost.kt#opm8kd");
                                                                    if ((i15 & 3) != 2 || !composer4.getSkipping()) {
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(-1263531443, i15, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:703)");
                                                                        }
                                                                        NavDestination destination = navBackStackEntry2.getDestination();
                                                                        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                                        ((ComposeNavigator.Destination) destination).getContent$navigation_compose_release().invoke(animatedContentScope, navBackStackEntry2, composer4, 0);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    composer4.skipToGroupEnd();
                                                                }
                                                            }, composer3, 54), composer3, 384);
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i13 >> 3) & LDSFile.EF_DG16_TAG) | 221184 | (i13 & 7168), 0);
                                                modifier4 = modifier5;
                                                Object currentState2 = transitionRememberTransition.getCurrentState();
                                                Object targetState2 = transitionRememberTransition.getTargetState();
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 653589399, "CC(remember):NavHost.kt#9igjgp");
                                                zChanged = composerStartRestartGroup.changed(transitionRememberTransition) | composerStartRestartGroup.changedInstance(navHostController) | composerStartRestartGroup.changed(composeNavigator) | composerStartRestartGroup.changedInstance(map);
                                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                if (!zChanged) {
                                                    objRememberedValue3 = (Function2) new NavHostKt$NavHost$33$1(transitionRememberTransition, navHostController, map, state2, composeNavigator, null);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    EffectsKt.LaunchedEffect(currentState2, targetState2, (Function2) objRememberedValue3, composerStartRestartGroup, i12);
                                                }
                                            }
                                        } else {
                                            alignment4 = alignment3;
                                            function115 = function128;
                                            function116 = function129;
                                            function117 = function126;
                                            function118 = function125;
                                            modifier4 = modifier5;
                                            i12 = 0;
                                            dialogNavigator = null;
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        Navigator navigator2 = navHostController.get_navigatorProvider().getNavigator(DialogNavigator.NAME);
                                        DialogNavigator dialogNavigator3 = navigator2 instanceof DialogNavigator ? (DialogNavigator) navigator2 : dialogNavigator;
                                        if (dialogNavigator3 == null) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
                                            if (scopeUpdateScopeEndRestartGroup3 != null) {
                                                final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function133 = function117;
                                                final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function134 = function115;
                                                final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function135 = function118;
                                                final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function136 = function116;
                                                scopeUpdateScopeEndRestartGroup3.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$dialogNavigator$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                        invoke(composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer3, int i14) {
                                                        NavHostKt.NavHost(navHostController, navGraph, modifier4, alignment4, function133, function127, function135, function134, function136, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        function119 = function127;
                                        function120 = function117;
                                        function121 = function115;
                                        function122 = function116;
                                        DialogHostKt.DialogHost(dialogNavigator3, composerStartRestartGroup, i12);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2 = composerStartRestartGroup;
                                        function123 = function118;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i2 & 64) != 0) {
                                            i10 &= -3670017;
                                        }
                                        if ((i2 & 128) != 0) {
                                            i10 &= -29360129;
                                        }
                                        function110 = function14;
                                        function111 = function18;
                                        modifier3 = modifier2;
                                        alignment2 = topStart;
                                        function112 = function16;
                                        function113 = function17;
                                        i11 = i10;
                                    }
                                    function114 = function15;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner2 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume2 = composerStartRestartGroup.consume(localLifecycleOwner2);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    final LifecycleOwner lifecycleOwner2 = (LifecycleOwner) objConsume2;
                                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                    if (current == null) {
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    function121 = function14;
                                    composer2 = composerStartRestartGroup;
                                    alignment4 = topStart;
                                    function120 = function16;
                                    function122 = function15;
                                    function123 = function18;
                                    modifier4 = modifier2;
                                    function119 = function17;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt.NavHost.34
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i14) {
                                            NavHostKt.NavHost(navHostController, navGraph, modifier4, alignment4, function120, function119, function123, function121, function122, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 100663296;
                            i9 = i8;
                            i10 = i3;
                            if ((i3 & 38347923) != 38347922) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i4 != 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if ((i2 & 64) != 0) {
                                    }
                                    if ((i2 & 128) == 0) {
                                    }
                                    function110 = function19;
                                    function111 = function18;
                                    modifier3 = modifier2;
                                    alignment2 = topStart;
                                    function112 = function16;
                                    function113 = function17;
                                    i11 = i10;
                                    if (i9 == 0) {
                                        function114 = function15;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner22 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume22 = composerStartRestartGroup.consume(localLifecycleOwner22);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    final LifecycleOwner lifecycleOwner22 = (LifecycleOwner) objConsume22;
                                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                    if (current == null) {
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        function17 = function12;
                        if ((i & 1572864) != 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
                        }
                        i9 = i8;
                        i10 = i3;
                        if ((i3 & 38347923) != 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    function16 = function1;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function17 = function12;
                    if ((i & 1572864) != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i3;
                    if ((i3 & 38347923) != 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                topStart = alignment;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function16 = function1;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function17 = function12;
                if ((i & 1572864) != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i3;
                if ((i3 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            topStart = alignment;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function16 = function1;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function17 = function12;
            if ((i & 1572864) != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3;
            if ((i3 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        topStart = alignment;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function16 = function1;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function17 = function12;
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3;
        if ((i3 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavHost$lambda$8(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean NavHost$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavHost$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition createEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getEnterTransition$navigation_compose_release();
            if (enterTransition$navigation_compose_release2 != null) {
                return enterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (enterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return enterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition createExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getExitTransition$navigation_compose_release();
            if (exitTransition$navigation_compose_release2 != null) {
                return exitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (exitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return exitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition createPopEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopEnterTransition$navigation_compose_release();
            if (popEnterTransition$navigation_compose_release2 != null) {
                return popEnterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popEnterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return popEnterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition createPopExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopExitTransition$navigation_compose_release();
            if (popExitTransition$navigation_compose_release2 != null) {
                return popExitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popExitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return popExitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SizeTransform createSizeTransform(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getSizeTransform$navigation_compose_release();
            if (sizeTransform$navigation_compose_release2 != null) {
                return sizeTransform$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (sizeTransform$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getSizeTransform$navigation_compose_release()) == null) {
            return null;
        }
        return sizeTransform$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$6(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$15(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$17(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }
}
