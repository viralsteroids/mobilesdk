.class public final Landroidx/navigation/compose/NavHostKt;
.super Ljava/lang/Object;
.source "NavHost.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 NavController.kt\nandroidx/navigation/NavControllerKt\n+ 4 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,780:1\n1225#2,3:781\n1228#2,3:786\n1225#2,3:789\n1228#2,3:794\n1225#2,3:797\n1228#2,3:802\n1225#2,3:805\n1228#2,3:810\n1225#2,3:813\n1228#2,3:818\n1225#2,6:823\n1225#2,6:829\n1225#2,6:835\n1225#2,6:841\n1225#2,6:847\n1225#2,6:853\n1225#2,6:859\n1225#2,6:865\n1225#2,6:871\n1225#2,6:877\n1225#2,6:883\n1225#2,6:889\n1225#2,6:895\n1225#2,6:901\n1225#2,6:907\n2892#3:784\n2892#3:792\n2892#3:800\n2909#3:808\n2926#3:816\n59#4:785\n59#4:793\n59#4:801\n77#4:809\n95#4:817\n77#5:821\n146#6:822\n146#6:913\n81#7:914\n81#7:918\n107#7,2:919\n81#7:921\n81#7:922\n79#8:915\n112#8,2:916\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n*L\n94#1:781,3\n94#1:786,3\n146#1:789,3\n146#1:794,3\n214#1:797,3\n214#1:802,3\n286#1:805,3\n286#1:810,3\n358#1:813,3\n358#1:818,3\n512#1:823,6\n513#1:829,6\n514#1:835,6\n541#1:841,6\n552#1:847,6\n562#1:853,6\n565#1:859,6\n579#1:865,6\n595#1:871,6\n603#1:877,6\n609#1:883,6\n619#1:889,6\n624#1:895,6\n657#1:901,6\n710#1:907,6\n95#1:784\n147#1:792\n215#1:800\n287#1:808\n359#1:816\n95#1:785\n147#1:793\n215#1:801\n287#1:809\n359#1:817\n493#1:821\n507#1:822\n729#1:913\n510#1:914\n513#1:918\n513#1:919,2\n549#1:921\n552#1:922\n512#1:915\n512#1:916,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\u0008\u001a\u00f3\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2$\u0008\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112$\u0008\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112$\u0008\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112$\u0008\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112(\u0008\u0002\u0010\u0016\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u0011H\u0007\u00a2\u0006\u0002\u0010\u0018\u001a\u00b5\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u001f\u0008\u0002\u0010\u000b\u001a\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\u000c\u00a2\u0006\u0002\u0008\u00112\u001f\u0008\u0002\u0010\u0012\u001a\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\u000c\u00a2\u0006\u0002\u0008\u00112\u001f\u0008\u0002\u0010\u0014\u001a\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\u000c\u00a2\u0006\u0002\u0008\u00112\u001f\u0008\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\u000c\u00a2\u0006\u0002\u0008\u0011H\u0007\u00a2\u0006\u0002\u0010\u0019\u001a\u00bb\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u000e\u0008\u0002\u0010\u001c\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u001d2\u001d\u0008\u0002\u0010\u001e\u001a\u0017\u0012\u0004\u0012\u00020 \u0012\r\u0012\u000b\u0012\u0002\u0008\u00030!\u00a2\u0006\u0002\u0008\u00100\u001f2$\u0008\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112$\u0008\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112$\u0008\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112$\u0008\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112(\u0008\u0002\u0010\u0016\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\u000c\u00a2\u0006\u0002\u0008\u0011H\u0007\u00a2\u0006\u0002\u0010$\u001a\u0098\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020%2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010%2$\u0008\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112$\u0008\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112$\u0008\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112$\u0008\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112(\u0008\u0002\u0010\u0016\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\u000c\u00a2\u0006\u0002\u0008\u0011H\u0007\u00a2\u0006\u0002\u0010&\u001a\u00da\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020%2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010%2\u001f\u0008\u0002\u0010\u000b\u001a\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\u000c\u00a2\u0006\u0002\u0008\u00112\u001f\u0008\u0002\u0010\u0012\u001a\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\u000c\u00a2\u0006\u0002\u0008\u00112\u001f\u0008\u0002\u0010\u0014\u001a\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\u000c\u00a2\u0006\u0002\u0008\u00112\u001f\u0008\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\u000c\u00a2\u0006\u0002\u0008\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\u000c\u00a2\u0006\u0002\u0008\u0011H\u0007\u00a2\u0006\u0002\u0010\'\u001aL\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020%2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010%2\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\u000c\u00a2\u0006\u0002\u0008\u0011H\u0007\u00a2\u0006\u0002\u0010(\u001a\u00bf\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u001a\u001a\u0006\u0012\u0002\u0008\u00030\u001d2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u000e\u0008\u0002\u0010\u001c\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u001d2\u001d\u0008\u0002\u0010\u001e\u001a\u0017\u0012\u0004\u0012\u00020 \u0012\r\u0012\u000b\u0012\u0002\u0008\u00030!\u00a2\u0006\u0002\u0008\u00100\u001f2$\u0008\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112$\u0008\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112$\u0008\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112$\u0008\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112(\u0008\u0002\u0010\u0016\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0002\u0008\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\u000c\u00a2\u0006\u0002\u0008\u0011H\u0007\u00a2\u0006\u0002\u0010)\u001a\u001c\u0010*\u001a\u0004\u0018\u00010\u000f*\u00020+2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010-\u001a\u0004\u0018\u00010\u0013*\u00020+2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010.\u001a\u0004\u0018\u00010\u000f*\u00020+2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010/\u001a\u0004\u0018\u00010\u0013*\u00020+2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u00100\u001a\u0004\u0018\u00010\u0017*\u00020+2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u00a8\u00061\u00b2\u0006\u0010\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u000e03X\u008a\u0084\u0002\u00b2\u0006\n\u00104\u001a\u000205X\u008a\u008e\u0002\u00b2\u0006\n\u00106\u001a\u000207X\u008a\u008e\u0002\u00b2\u0006\u0010\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u000e03X\u008a\u0084\u0002\u00b2\u0006\u0010\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u000e03X\u008a\u0084\u0002"
    }
    d2 = {
        "NavHost",
        "",
        "navController",
        "Landroidx/navigation/NavHostController;",
        "graph",
        "Landroidx/navigation/NavGraph;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "contentAlignment",
        "Landroidx/compose/ui/Alignment;",
        "enterTransition",
        "Lkotlin/Function1;",
        "Landroidx/compose/animation/AnimatedContentTransitionScope;",
        "Landroidx/navigation/NavBackStackEntry;",
        "Landroidx/compose/animation/EnterTransition;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "Lkotlin/ExtensionFunctionType;",
        "exitTransition",
        "Landroidx/compose/animation/ExitTransition;",
        "popEnterTransition",
        "popExitTransition",
        "sizeTransform",
        "Landroidx/compose/animation/SizeTransform;",
        "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "startDestination",
        "",
        "route",
        "Lkotlin/reflect/KClass;",
        "typeMap",
        "",
        "Lkotlin/reflect/KType;",
        "Landroidx/navigation/NavType;",
        "builder",
        "Landroidx/navigation/NavGraphBuilder;",
        "(Landroidx/navigation/NavHostController;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V",
        "",
        "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V",
        "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "(Landroidx/navigation/NavHostController;Lkotlin/reflect/KClass;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V",
        "createEnterTransition",
        "Landroidx/navigation/NavDestination;",
        "scope",
        "createExitTransition",
        "createPopEnterTransition",
        "createPopExitTransition",
        "createSizeTransform",
        "navigation-compose_release",
        "currentBackStack",
        "",
        "progress",
        "",
        "inPredictiveBack",
        "",
        "allVisibleEntries",
        "visibleEntries"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic NavHost(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Deprecated in favor of NavHost that supports AnimatedContent"
    .end annotation

    move/from16 v4, p4

    const v0, -0x390ae240    # -31374.875f

    move-object/from16 v1, p3

    .line 393
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v14

    const-string v1, "C(NavHost)P(2)392@15641L39:NavHost.kt#opm8kd"

    invoke-static {v14, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v2, v4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v4, 0x30

    move-object/from16 v6, p1

    if-nez v3, :cond_5

    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_8

    move-object/from16 v5, p2

    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v5, p2

    :goto_6
    and-int/lit16 v7, v2, 0x93

    const/16 v8, 0x92

    if-ne v7, v8, :cond_a

    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, v5

    goto :goto_9

    :cond_a
    :goto_7
    if-eqz v3, :cond_b

    .line 392
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v7, v3

    goto :goto_8

    :cond_b
    move-object v7, v5

    :goto_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_c

    const/4 v3, -0x1

    const-string v5, "androidx.navigation.compose.NavHost (NavHost.kt:392)"

    .line 393
    invoke-static {v0, v2, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_c
    and-int/lit16 v15, v2, 0x3fe

    const/16 v16, 0x1f8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v5, v1

    invoke-static/range {v5 .. v16}, Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_d
    move-object v3, v7

    :goto_9
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$19;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Landroidx/navigation/compose/NavHostKt$NavHost$19;-><init>(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_e
    return-void
.end method

.method public static final synthetic NavHost(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Deprecated in favor of NavHost that supports sizeTransform"
    .end annotation

    move/from16 v9, p9

    move/from16 v10, p10

    const v0, -0x6c5f682b

    move-object/from16 v1, p8

    .line 431
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    const-string v2, "C(NavHost)P(5,3,4)431@17424L199:NavHost.kt#opm8kd"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, v10, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v9, 0x6

    move-object/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v9, 0x6

    move-object/from16 v11, p0

    if-nez v2, :cond_2

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v9

    goto :goto_1

    :cond_2
    move v2, v9

    :goto_1
    and-int/lit8 v3, v10, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    move-object/from16 v12, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v9, 0x30

    move-object/from16 v12, p1

    if-nez v3, :cond_5

    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v10, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v9, 0x180

    if-nez v4, :cond_8

    move-object/from16 v4, p2

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_4

    :cond_7
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v2, v5

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v4, p2

    :goto_6
    and-int/lit8 v5, v10, 0x8

    if-eqz v5, :cond_9

    or-int/lit16 v2, v2, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v6, v9, 0xc00

    if-nez v6, :cond_b

    move-object/from16 v6, p3

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_7

    :cond_a
    const/16 v7, 0x400

    :goto_7
    or-int/2addr v2, v7

    goto :goto_9

    :cond_b
    :goto_8
    move-object/from16 v6, p3

    :goto_9
    and-int/lit8 v7, v10, 0x10

    if-eqz v7, :cond_c

    or-int/lit16 v2, v2, 0x6000

    goto :goto_b

    :cond_c
    and-int/lit16 v8, v9, 0x6000

    if-nez v8, :cond_e

    move-object/from16 v8, p4

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_a

    :cond_d
    const/16 v13, 0x2000

    :goto_a
    or-int/2addr v2, v13

    goto :goto_c

    :cond_e
    :goto_b
    move-object/from16 v8, p4

    :goto_c
    and-int/lit8 v13, v10, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_f

    or-int/2addr v2, v14

    goto :goto_e

    :cond_f
    and-int/2addr v14, v9

    if-nez v14, :cond_11

    move-object/from16 v14, p5

    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x20000

    goto :goto_d

    :cond_10
    const/high16 v15, 0x10000

    :goto_d
    or-int/2addr v2, v15

    goto :goto_f

    :cond_11
    :goto_e
    move-object/from16 v14, p5

    :goto_f
    const/high16 v15, 0x180000

    and-int/2addr v15, v9

    if-nez v15, :cond_14

    and-int/lit8 v15, v10, 0x40

    if-nez v15, :cond_12

    move-object/from16 v15, p6

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_10

    :cond_12
    move-object/from16 v15, p6

    :cond_13
    const/high16 v16, 0x80000

    :goto_10
    or-int v2, v2, v16

    goto :goto_11

    :cond_14
    move-object/from16 v15, p6

    :goto_11
    const/high16 v16, 0xc00000

    and-int v16, v9, v16

    if-nez v16, :cond_17

    and-int/lit16 v0, v10, 0x80

    if-nez v0, :cond_15

    move-object/from16 v0, p7

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_16

    const/high16 v17, 0x800000

    goto :goto_12

    :cond_15
    move-object/from16 v0, p7

    :cond_16
    const/high16 v17, 0x400000

    :goto_12
    or-int v2, v2, v17

    goto :goto_13

    :cond_17
    move-object/from16 v0, p7

    :goto_13
    const v17, 0x492493

    and-int v0, v2, v17

    move-object/from16 v20, v1

    const v1, 0x492492

    if-ne v0, v1, :cond_19

    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_14

    .line 442
    :cond_18
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, v4

    move-object v4, v6

    move-object v5, v8

    move-object v6, v14

    move-object v7, v15

    move-object/from16 v8, p7

    goto/16 :goto_1a

    .line 431
    :cond_19
    :goto_14
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v9, 0x1

    const v1, -0x1c00001

    const v17, -0x380001

    if-eqz v0, :cond_1d

    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_17

    .line 430
    :cond_1a
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v10, 0x40

    if-eqz v0, :cond_1b

    and-int v2, v2, v17

    :cond_1b
    and-int/lit16 v0, v10, 0x80

    if-eqz v0, :cond_1c

    and-int/2addr v2, v1

    :cond_1c
    move-object/from16 v18, p7

    move-object v13, v4

    :goto_15
    move-object/from16 v16, v14

    :goto_16
    move-object/from16 v17, v15

    const v0, -0x6c5f682b

    move-object v14, v6

    move-object v15, v8

    goto :goto_19

    :cond_1d
    :goto_17
    if-eqz v3, :cond_1e

    .line 419
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    goto :goto_18

    :cond_1e
    move-object v0, v4

    :goto_18
    if-eqz v5, :cond_1f

    .line 420
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v3

    move-object v6, v3

    :cond_1f
    if-eqz v7, :cond_20

    .line 421
    sget-object v3, Landroidx/navigation/compose/NavHostKt$NavHost$20;->INSTANCE:Landroidx/navigation/compose/NavHostKt$NavHost$20;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v8, v3

    :cond_20
    if-eqz v13, :cond_21

    .line 424
    sget-object v3, Landroidx/navigation/compose/NavHostKt$NavHost$21;->INSTANCE:Landroidx/navigation/compose/NavHostKt$NavHost$21;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v14, v3

    :cond_21
    and-int/lit8 v3, v10, 0x40

    if-eqz v3, :cond_22

    and-int v2, v2, v17

    move-object v15, v8

    :cond_22
    and-int/lit16 v3, v10, 0x80

    if-eqz v3, :cond_23

    and-int/2addr v2, v1

    move-object v13, v0

    move-object/from16 v16, v14

    move-object/from16 v18, v16

    goto :goto_16

    :cond_23
    move-object/from16 v18, p7

    move-object v13, v0

    goto :goto_15

    .line 430
    :goto_19
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_24

    const/4 v1, -0x1

    const-string v3, "androidx.navigation.compose.NavHost (NavHost.kt:430)"

    .line 431
    invoke-static {v0, v2, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_24
    const v0, 0x1fffffe

    and-int v21, v2, v0

    const/16 v22, 0x100

    const/16 v19, 0x0

    .line 432
    invoke-static/range {v11 .. v22}, Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_25
    move-object v3, v13

    move-object v4, v14

    move-object v5, v15

    move-object/from16 v6, v16

    move-object/from16 v7, v17

    move-object/from16 v8, v18

    .line 442
    :goto_1a
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_26

    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$22;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v10}, Landroidx/navigation/compose/NavHostKt$NavHost$22;-><init>(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_26
    return-void
.end method

.method public static final NavHost(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavHostController;",
            "Landroidx/navigation/NavGraph;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/Alignment;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/EnterTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/ExitTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/EnterTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/ExitTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/SizeTransform;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v10, p10

    move/from16 v11, p11

    const v0, -0x751a66d8

    move-object/from16 v2, p9

    .line 491
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v7

    const-string v2, "C(NavHost)P(5,3,4)492@19706L7,*494@19790L7,509@20395L16,511@20433L36,512@20498L34,513@20586L987,513@20537L1036,540@21612L138,540@21579L171,546@21782L29,548@21871L16,551@21976L186,561@22257L42,732@30615L27:NavHost.kt#opm8kd"

    invoke-static {v7, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, v11, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v10, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v10, 0x6

    if-nez v2, :cond_2

    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v10

    goto :goto_1

    :cond_2
    move v2, v10

    :goto_1
    and-int/lit8 v4, v11, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_5

    move-object/from16 v4, p1

    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v4, p1

    :goto_4
    and-int/lit8 v5, v11, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v6, v10, 0x180

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_5

    :cond_7
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v2, v8

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v6, p2

    :goto_7
    and-int/lit8 v8, v11, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v2, v2, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v9, v10, 0xc00

    if-nez v9, :cond_b

    move-object/from16 v9, p3

    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_8

    :cond_a
    const/16 v12, 0x400

    :goto_8
    or-int/2addr v2, v12

    goto :goto_a

    :cond_b
    :goto_9
    move-object/from16 v9, p3

    :goto_a
    and-int/lit8 v12, v11, 0x10

    if-eqz v12, :cond_c

    or-int/lit16 v2, v2, 0x6000

    goto :goto_c

    :cond_c
    and-int/lit16 v13, v10, 0x6000

    if-nez v13, :cond_e

    move-object/from16 v13, p4

    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_b

    :cond_d
    const/16 v14, 0x2000

    :goto_b
    or-int/2addr v2, v14

    goto :goto_d

    :cond_e
    :goto_c
    move-object/from16 v13, p4

    :goto_d
    and-int/lit8 v14, v11, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_f

    or-int/2addr v2, v15

    goto :goto_f

    :cond_f
    and-int/2addr v15, v10

    if-nez v15, :cond_11

    move-object/from16 v15, p5

    invoke-interface {v7, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_e

    :cond_10
    const/high16 v16, 0x10000

    :goto_e
    or-int v2, v2, v16

    goto :goto_10

    :cond_11
    :goto_f
    move-object/from16 v15, p5

    :goto_10
    const/high16 v16, 0x180000

    and-int v17, v10, v16

    if-nez v17, :cond_13

    and-int/lit8 v17, v11, 0x40

    move-object/from16 v3, p6

    if-nez v17, :cond_12

    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_12

    const/high16 v18, 0x100000

    goto :goto_11

    :cond_12
    const/high16 v18, 0x80000

    :goto_11
    or-int v2, v2, v18

    goto :goto_12

    :cond_13
    move-object/from16 v3, p6

    :goto_12
    const/high16 v18, 0xc00000

    and-int v19, v10, v18

    if-nez v19, :cond_16

    and-int/lit16 v0, v11, 0x80

    if-nez v0, :cond_14

    move-object/from16 v0, p7

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_15

    const/high16 v21, 0x800000

    goto :goto_13

    :cond_14
    move-object/from16 v0, p7

    :cond_15
    const/high16 v21, 0x400000

    :goto_13
    or-int v2, v2, v21

    goto :goto_14

    :cond_16
    move-object/from16 v0, p7

    :goto_14
    and-int/lit16 v0, v11, 0x100

    const/high16 v21, 0x6000000

    if-eqz v0, :cond_17

    or-int v2, v2, v21

    goto :goto_16

    :cond_17
    and-int v21, v10, v21

    if-nez v21, :cond_19

    move/from16 v21, v0

    move-object/from16 v0, p8

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_18

    const/high16 v22, 0x4000000

    goto :goto_15

    :cond_18
    const/high16 v22, 0x2000000

    :goto_15
    or-int v2, v2, v22

    goto :goto_17

    :cond_19
    :goto_16
    move/from16 v21, v0

    move-object/from16 v0, p8

    :goto_17
    const v22, 0x2492493

    and-int v0, v2, v22

    move/from16 v22, v2

    const v2, 0x2492492

    if-ne v0, v2, :cond_1b

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_1a

    goto :goto_18

    .line 734
    :cond_1a
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v8, p7

    move-object v0, v7

    move-object v4, v9

    move-object v5, v13

    move-object/from16 v9, p8

    move-object v7, v3

    move-object v3, v6

    move-object v6, v15

    goto/16 :goto_2e

    .line 491
    :cond_1b
    :goto_18
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v10, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_20

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_19

    .line 490
    :cond_1c
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v11, 0x40

    if-eqz v0, :cond_1d

    const v0, -0x380001

    and-int v0, v22, v0

    move/from16 v22, v0

    :cond_1d
    and-int/lit16 v0, v11, 0x80

    if-eqz v0, :cond_1e

    const v0, -0x1c00001

    and-int v22, v22, v0

    :cond_1e
    move-object/from16 v8, p7

    move-object v0, v3

    move-object v3, v6

    move-object v4, v9

    move-object v5, v13

    move-object v6, v15

    move/from16 v12, v22

    :cond_1f
    move-object/from16 v9, p8

    goto :goto_1b

    :cond_20
    :goto_19
    if-eqz v5, :cond_21

    .line 465
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v6, v0

    :cond_21
    if-eqz v8, :cond_22

    .line 466
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v0

    move-object v9, v0

    :cond_22
    if-eqz v12, :cond_23

    .line 470
    sget-object v0, Landroidx/navigation/compose/NavHostKt$NavHost$23;->INSTANCE:Landroidx/navigation/compose/NavHostKt$NavHost$23;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object v13, v0

    :cond_23
    if-eqz v14, :cond_24

    .line 476
    sget-object v0, Landroidx/navigation/compose/NavHostKt$NavHost$24;->INSTANCE:Landroidx/navigation/compose/NavHostKt$NavHost$24;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object v15, v0

    :cond_24
    and-int/lit8 v0, v11, 0x40

    if-eqz v0, :cond_25

    const v0, -0x380001

    and-int v0, v22, v0

    move/from16 v22, v0

    move-object v3, v13

    :cond_25
    and-int/lit16 v0, v11, 0x80

    if-eqz v0, :cond_26

    const v0, -0x1c00001

    and-int v0, v22, v0

    move/from16 v22, v0

    move-object v0, v15

    goto :goto_1a

    :cond_26
    move-object/from16 v0, p7

    :goto_1a
    move-object v8, v0

    move-object v0, v3

    move-object v3, v6

    move-object v4, v9

    move-object v5, v13

    move-object v6, v15

    move/from16 v12, v22

    if-eqz v21, :cond_1f

    move-object v9, v2

    .line 490
    :goto_1b
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v13

    if-eqz v13, :cond_27

    const/4 v13, -0x1

    const-string v14, "androidx.navigation.compose.NavHost (NavHost.kt:490)"

    const v15, -0x751a66d8

    .line 491
    invoke-static {v15, v12, v13, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 493
    :cond_27
    invoke-static {}, Landroidx/lifecycle/compose/LocalLifecycleOwnerKt;->getLocalLifecycleOwner()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v13

    check-cast v13, Landroidx/compose/runtime/CompositionLocal;

    const v14, 0x789c5f52

    const-string v15, "CC:CompositionLocal.kt#9igjgp"

    .line 821
    invoke-static {v7, v14, v15}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 493
    check-cast v13, Landroidx/lifecycle/LifecycleOwner;

    .line 495
    sget-object v14, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    sget v15, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    invoke-virtual {v14, v7, v15}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object v14

    if-eqz v14, :cond_55

    .line 499
    invoke-interface {v14}, Landroidx/lifecycle/ViewModelStoreOwner;->getViewModelStore()Landroidx/lifecycle/ViewModelStore;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/navigation/NavHostController;->setViewModelStore(Landroidx/lifecycle/ViewModelStore;)V

    .line 502
    invoke-virtual/range {p0 .. p1}, Landroidx/navigation/NavHostController;->setGraph(Landroidx/navigation/NavGraph;)V

    .line 507
    invoke-virtual {v1}, Landroidx/navigation/NavHostController;->getNavigatorProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v14

    const-string v15, "composable"

    .line 822
    invoke-virtual {v14, v15}, Landroidx/navigation/NavigatorProvider;->getNavigator(Ljava/lang/String;)Landroidx/navigation/Navigator;

    move-result-object v14

    .line 507
    instance-of v15, v14, Landroidx/navigation/compose/ComposeNavigator;

    if-eqz v15, :cond_28

    check-cast v14, Landroidx/navigation/compose/ComposeNavigator;

    goto :goto_1c

    :cond_28
    move-object v14, v2

    :goto_1c
    if-nez v14, :cond_2a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_29

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_29
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_54

    move-object v7, v0

    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$composeNavigator$1;

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v11}, Landroidx/navigation/compose/NavHostKt$NavHost$composeNavigator$1;-><init>(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    return-void

    :cond_2a
    move-object v11, v0

    move-object v0, v1

    move-object v10, v5

    move-object v15, v6

    move-object v1, v8

    move-object v5, v9

    .line 510
    invoke-virtual {v14}, Landroidx/navigation/compose/ComposeNavigator;->getBackStack()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-static {v6, v2, v7, v8, v9}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v6

    move/from16 p8, v8

    const v8, 0x26f085fe

    .line 512
    const-string v9, "CC(remember):NavHost.kt#9igjgp"

    invoke-static {v7, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 823
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .line 824
    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v8, v2, :cond_2b

    const/4 v2, 0x0

    .line 512
    invoke-static {v2}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    move-result-object v8

    .line 826
    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 512
    :cond_2b
    check-cast v8, Landroidx/compose/runtime/MutableFloatState;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v2, 0x26f08e1c

    .line 513
    invoke-static {v7, v2, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 829
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 830
    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v30, v3

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_2c

    .line 513
    invoke-static/range {p8 .. p8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    move-object/from16 p9, v4

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v2, v4, v3, v4}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    .line 832
    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    goto :goto_1d

    :cond_2c
    move-object/from16 p9, v4

    .line 513
    :goto_1d
    move-object/from16 v27, v2

    check-cast v27, Landroidx/compose/runtime/MutableState;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 514
    invoke-static {v6}, Landroidx/navigation/compose/NavHostKt;->NavHost$lambda$6(Landroidx/compose/runtime/State;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_2d

    const/4 v2, 0x1

    goto :goto_1e

    :cond_2d
    move/from16 v2, p8

    :goto_1e
    const v3, 0x26f09cd5

    invoke-static {v7, v3, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v7, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    .line 835
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_2f

    .line 836
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_2e

    goto :goto_1f

    :cond_2e
    move-object v3, v6

    move-object v6, v4

    move-object/from16 v4, v27

    goto :goto_20

    .line 514
    :cond_2f
    :goto_1f
    new-instance v3, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;

    const/4 v4, 0x0

    move-object/from16 p2, v3

    move-object/from16 p7, v4

    move-object/from16 p4, v6

    move-object/from16 p5, v8

    move-object/from16 p3, v14

    move-object/from16 p6, v27

    invoke-direct/range {p2 .. p7}, Landroidx/navigation/compose/NavHostKt$NavHost$25$1;-><init>(Landroidx/navigation/compose/ComposeNavigator;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    move-object/from16 v6, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p6

    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 838
    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 514
    :goto_20
    check-cast v6, Lkotlin/jvm/functions/Function2;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move/from16 v31, v12

    move/from16 v12, p8

    invoke-static {v2, v6, v7, v12, v12}, Landroidx/activity/compose/PredictiveBackHandlerKt;->PredictiveBackHandler(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    const v2, 0x26f119c4

    .line 541
    invoke-static {v7, v2, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v2, v6

    .line 841
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_30

    .line 842
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_31

    .line 541
    :cond_30
    new-instance v2, Landroidx/navigation/compose/NavHostKt$NavHost$26$1;

    invoke-direct {v2, v0, v13}, Landroidx/navigation/compose/NavHostKt$NavHost$26$1;-><init>(Landroidx/navigation/NavHostController;Landroidx/lifecycle/LifecycleOwner;)V

    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 844
    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 541
    :cond_31
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v12, 0x0

    invoke-static {v13, v6, v7, v12}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 547
    invoke-static {v7, v12}, Landroidx/compose/runtime/saveable/SaveableStateHolderKt;->rememberSaveableStateHolder(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/saveable/SaveableStateHolder;

    move-result-object v2

    .line 549
    invoke-virtual {v0}, Landroidx/navigation/NavHostController;->getVisibleEntries()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v6

    move-object/from16 p5, v2

    const/4 v2, 0x1

    const/4 v13, 0x0

    invoke-static {v6, v13, v7, v12, v2}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v6

    const v2, 0x26f14774

    .line 552
    invoke-static {v7, v2, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 847
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 848
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v2, v12, :cond_32

    .line 553
    new-instance v2, Landroidx/navigation/compose/NavHostKt$NavHost$visibleEntries$2$1;

    invoke-direct {v2, v6}, Landroidx/navigation/compose/NavHostKt$NavHost$visibleEntries$2$1;-><init>(Landroidx/compose/runtime/State;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-static {v2}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;

    move-result-object v2

    .line 850
    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 552
    :cond_32
    check-cast v2, Landroidx/compose/runtime/State;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 560
    invoke-static {v2}, Landroidx/navigation/compose/NavHostKt;->NavHost$lambda$17(Landroidx/compose/runtime/State;)Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/navigation/NavBackStackEntry;

    const v12, 0x26f16a04

    .line 562
    invoke-static {v7, v12, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 853
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .line 854
    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v13

    if-ne v12, v13, :cond_33

    .line 562
    new-instance v12, Ljava/util/LinkedHashMap;

    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v12, Ljava/util/Map;

    .line 856
    invoke-interface {v7, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 562
    :cond_33
    check-cast v12, Ljava/util/Map;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v13, 0x26f18f80

    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v13, "564@22433L597,578@23128L597,594@23856L301,602@24190L146,602@24167L169,608@24368L348,615@24743L52,656@26717L1208,682@28002L1465,654@26649L2818,709@29540L861,709@29476L925"

    invoke-static {v7, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    if-eqz v6, :cond_4f

    const v13, 0x26f1822f

    .line 565
    invoke-static {v7, v13, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    const/high16 v20, 0x380000

    and-int v20, v31, v20

    move/from16 p2, v13

    xor-int v13, v20, v16

    const/high16 v0, 0x100000

    if-le v13, v0, :cond_34

    invoke-interface {v7, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_35

    :cond_34
    and-int v13, v31, v16

    if-ne v13, v0, :cond_36

    :cond_35
    const/4 v0, 0x1

    goto :goto_21

    :cond_36
    const/4 v0, 0x0

    :goto_21
    or-int v0, p2, v0

    const v13, 0xe000

    and-int v13, v31, v13

    move/from16 p2, v0

    const/16 v0, 0x4000

    if-ne v13, v0, :cond_37

    const/4 v0, 0x1

    goto :goto_22

    :cond_37
    const/4 v0, 0x0

    :goto_22
    or-int v0, p2, v0

    .line 859
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    if-nez v0, :cond_38

    .line 860
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v13, v0, :cond_39

    .line 565
    :cond_38
    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$finalEnter$1$1;

    invoke-direct {v0, v14, v11, v10, v4}, Landroidx/navigation/compose/NavHostKt$NavHost$finalEnter$1$1;-><init>(Landroidx/navigation/compose/ComposeNavigator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)V

    move-object v13, v0

    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 862
    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 565
    :cond_39
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v0, 0x26f1d90f

    .line 579
    invoke-static {v7, v0, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    const/high16 v16, 0x1c00000

    and-int v16, v31, v16

    move/from16 p2, v0

    xor-int v0, v16, v18

    move-object/from16 v16, v10

    const/high16 v10, 0x800000

    if-le v0, v10, :cond_3a

    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3b

    :cond_3a
    and-int v0, v31, v18

    if-ne v0, v10, :cond_3c

    :cond_3b
    const/4 v0, 0x1

    goto :goto_23

    :cond_3c
    const/4 v0, 0x0

    :goto_23
    or-int v0, p2, v0

    const/high16 v10, 0x70000

    and-int v10, v31, v10

    move/from16 p2, v0

    const/high16 v0, 0x20000

    if-ne v10, v0, :cond_3d

    const/4 v0, 0x1

    goto :goto_24

    :cond_3d
    const/4 v0, 0x0

    :goto_24
    or-int v0, p2, v0

    .line 865
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v0, :cond_3e

    .line 866
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v10, v0, :cond_3f

    .line 579
    :cond_3e
    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$finalExit$1$1;

    invoke-direct {v0, v14, v1, v15, v4}, Landroidx/navigation/compose/NavHostKt$NavHost$finalExit$1$1;-><init>(Landroidx/navigation/compose/ComposeNavigator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)V

    move-object v10, v0

    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 868
    invoke-interface {v7, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 579
    :cond_3f
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v0, 0x26f232e7

    .line 595
    invoke-static {v7, v0, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v0, 0xe000000

    and-int v0, v31, v0

    move-object/from16 v17, v1

    const/high16 v1, 0x4000000

    if-ne v0, v1, :cond_40

    const/4 v0, 0x1

    goto :goto_25

    :cond_40
    const/4 v0, 0x0

    .line 871
    :goto_25
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_41

    .line 872
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_42

    .line 595
    :cond_41
    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$finalSizeTransform$1$1;

    invoke-direct {v0, v5}, Landroidx/navigation/compose/NavHostKt$NavHost$finalSizeTransform$1$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 874
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 595
    :cond_42
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/16 v28, 0x1

    .line 603
    invoke-static/range {v28 .. v28}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 p6, v4

    const v4, 0x26f25c0c

    invoke-static {v7, v4, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    move/from16 p2, v4

    .line 877
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez p2, :cond_43

    .line 878
    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v19, v5

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_44

    goto :goto_26

    :cond_43
    move-object/from16 v19, v5

    .line 603
    :goto_26
    new-instance v4, Landroidx/navigation/compose/NavHostKt$NavHost$27$1;

    invoke-direct {v4, v2, v14}, Landroidx/navigation/compose/NavHostKt$NavHost$27$1;-><init>(Landroidx/compose/runtime/State;Landroidx/navigation/compose/ComposeNavigator;)V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 880
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 603
    :cond_44
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v5, 0x6

    invoke-static {v0, v4, v7, v5}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const v0, 0x26f27316

    .line 609
    invoke-static {v7, v0, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 883
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 884
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v0, v4, :cond_45

    .line 613
    new-instance v0, Landroidx/compose/animation/core/SeekableTransitionState;

    invoke-direct {v0, v6}, Landroidx/compose/animation/core/SeekableTransitionState;-><init>(Ljava/lang/Object;)V

    .line 886
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 609
    :cond_45
    check-cast v0, Landroidx/compose/animation/core/SeekableTransitionState;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 616
    move-object v4, v0

    check-cast v4, Landroidx/compose/animation/core/TransitionState;

    sget v5, Landroidx/compose/animation/core/SeekableTransitionState;->$stable:I

    or-int/lit8 v5, v5, 0x30

    move-object/from16 v26, v2

    const-string v2, "entry"

    move-object/from16 v18, v11

    const/4 v11, 0x0

    invoke-static {v4, v2, v7, v5, v11}, Landroidx/compose/animation/core/TransitionKt;->rememberTransition(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;

    move-result-object v2

    .line 618
    invoke-static/range {p6 .. p6}, Landroidx/navigation/compose/NavHostKt;->NavHost$lambda$11(Landroidx/compose/runtime/MutableState;)Z

    move-result v4

    if-eqz v4, :cond_48

    const v4, -0x489d2ea8

    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v4, "618@24866L159,618@24841L184"

    invoke-static {v7, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 619
    invoke-static {v8}, Landroidx/navigation/compose/NavHostKt;->NavHost$lambda$8(Landroidx/compose/runtime/MutableFloatState;)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const v5, 0x26f2b099    # 1.683999E-15f

    invoke-static {v7, v5, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v5, v11

    .line 889
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    if-nez v5, :cond_46

    .line 890
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v11, v5, :cond_47

    .line 619
    :cond_46
    new-instance v5, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;

    const/4 v11, 0x0

    invoke-direct {v5, v0, v3, v8, v11}, Landroidx/navigation/compose/NavHostKt$NavHost$28$1;-><init>(Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableFloatState;Lkotlin/coroutines/Continuation;)V

    move-object v11, v5

    check-cast v11, Lkotlin/jvm/functions/Function2;

    .line 892
    invoke-interface {v7, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 619
    :cond_47
    check-cast v11, Lkotlin/jvm/functions/Function2;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v3, 0x0

    invoke-static {v4, v11, v7, v3}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 618
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v4, 0x0

    const/4 v11, 0x0

    goto :goto_29

    :cond_48
    const v3, -0x48994a6b

    .line 623
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v3, "623@25086L1532,623@25055L1563"

    invoke-static {v7, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const v3, 0x26f2d176

    .line 624
    invoke-static {v7, v3, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    .line 895
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_4a

    .line 896
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_49

    goto :goto_27

    :cond_49
    move-object v3, v4

    const/4 v4, 0x0

    goto :goto_28

    .line 624
    :cond_4a
    :goto_27
    new-instance v3, Landroidx/navigation/compose/NavHostKt$NavHost$29$1;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v6, v2, v4}, Landroidx/navigation/compose/NavHostKt$NavHost$29$1;-><init>(Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/animation/core/Transition;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 898
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 624
    :goto_28
    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const/4 v11, 0x0

    invoke-static {v6, v3, v7, v11}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 623
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_29
    const v3, 0x26f39c12

    .line 657
    invoke-static {v7, v3, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v7, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-interface {v7, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    .line 901
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_4c

    .line 902
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_4b

    goto :goto_2a

    :cond_4b
    move-object/from16 v27, p6

    goto :goto_2b

    .line 657
    :cond_4c
    :goto_2a
    new-instance v20, Landroidx/navigation/compose/NavHostKt$NavHost$30$1;

    move-object/from16 v27, p6

    move-object/from16 v25, v1

    move-object/from16 v24, v10

    move-object/from16 v21, v12

    move-object/from16 v23, v13

    move-object/from16 v22, v14

    invoke-direct/range {v20 .. v27}, Landroidx/navigation/compose/NavHostKt$NavHost$30$1;-><init>(Ljava/util/Map;Landroidx/navigation/compose/ComposeNavigator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;)V

    move-object/from16 v5, v20

    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 904
    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 657
    :goto_2b
    move-object v3, v5

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 655
    sget-object v1, Landroidx/navigation/compose/NavHostKt$NavHost$31;->INSTANCE:Landroidx/navigation/compose/NavHostKt$NavHost$31;

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 683
    new-instance v1, Landroidx/navigation/compose/NavHostKt$NavHost$32;

    move-object/from16 p3, v0

    move-object/from16 p2, v1

    move-object/from16 p4, v6

    move-object/from16 p7, v26

    move-object/from16 p6, v27

    invoke-direct/range {p2 .. p7}, Landroidx/navigation/compose/NavHostKt$NavHost$32;-><init>(Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/saveable/SaveableStateHolder;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;)V

    move-object/from16 v0, p2

    const/16 v1, 0x36

    const v6, 0x30ebd9dc

    const/4 v8, 0x1

    invoke-static {v6, v8, v0, v7, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function4;

    shr-int/lit8 v0, v31, 0x3

    and-int/lit8 v0, v0, 0x70

    const v1, 0x36000

    or-int/2addr v0, v1

    move/from16 v1, v31

    and-int/lit16 v1, v1, 0x1c00

    or-int v8, v0, v1

    move-object v0, v9

    const/4 v9, 0x0

    move-object v1, v2

    move-object/from16 v29, v4

    move-object/from16 v2, v30

    move-object/from16 v4, p9

    .line 655
    invoke-static/range {v1 .. v9}, Landroidx/compose/animation/AnimatedContentKt;->AnimatedContent(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v2

    .line 710
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v5

    const v6, 0x26f4fb97    # 1.6999095E-15f

    invoke-static {v7, v6, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    move-object/from16 v6, p0

    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v0, v8

    invoke-interface {v7, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v0, v8

    invoke-interface {v7, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v0, v8

    .line 907
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v0, :cond_4d

    .line 908
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v8, v0, :cond_4e

    .line 710
    :cond_4d
    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$33$1;

    const/4 v8, 0x0

    move-object/from16 p2, v0

    move-object/from16 p3, v1

    move-object/from16 p4, v6

    move-object/from16 p8, v8

    move-object/from16 p5, v12

    move-object/from16 p7, v14

    move-object/from16 p6, v26

    invoke-direct/range {p2 .. p8}, Landroidx/navigation/compose/NavHostKt$NavHost$33$1;-><init>(Landroidx/compose/animation/core/Transition;Landroidx/navigation/NavHostController;Ljava/util/Map;Landroidx/compose/runtime/State;Landroidx/navigation/compose/ComposeNavigator;Lkotlin/coroutines/Continuation;)V

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 910
    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 710
    :cond_4e
    check-cast v8, Lkotlin/jvm/functions/Function2;

    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v2, v5, v8, v7, v11}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    goto :goto_2c

    :cond_4f
    move-object/from16 v4, p9

    move-object/from16 v17, v1

    move-object/from16 v19, v5

    move-object/from16 v16, v10

    move-object/from16 v18, v11

    move-object/from16 v3, v30

    const/4 v11, 0x0

    const/16 v29, 0x0

    :goto_2c
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 729
    invoke-virtual/range {p0 .. p0}, Landroidx/navigation/NavHostController;->getNavigatorProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v0

    const-string v1, "dialog"

    .line 913
    invoke-virtual {v0, v1}, Landroidx/navigation/NavigatorProvider;->getNavigator(Ljava/lang/String;)Landroidx/navigation/Navigator;

    move-result-object v0

    .line 729
    instance-of v1, v0, Landroidx/navigation/compose/DialogNavigator;

    if-eqz v1, :cond_50

    move-object v2, v0

    check-cast v2, Landroidx/navigation/compose/DialogNavigator;

    goto :goto_2d

    :cond_50
    move-object/from16 v2, v29

    :goto_2d
    if-nez v2, :cond_52

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_51

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_51
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_54

    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$dialogNavigator$1;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v10, p10

    move/from16 v11, p11

    move-object v6, v15

    move-object/from16 v5, v16

    move-object/from16 v8, v17

    move-object/from16 v7, v18

    move-object/from16 v9, v19

    invoke-direct/range {v0 .. v11}, Landroidx/navigation/compose/NavHostKt$NavHost$dialogNavigator$1;-><init>(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    return-void

    :cond_52
    move-object v6, v15

    move-object/from16 v5, v16

    move-object/from16 v8, v17

    move-object/from16 v9, v19

    .line 733
    invoke-static {v2, v7, v11}, Landroidx/navigation/compose/DialogHostKt;->DialogHost(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_53

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_53
    move-object v0, v7

    move-object/from16 v7, v18

    .line 734
    :goto_2e
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_54

    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$34;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Landroidx/navigation/compose/NavHostKt$NavHost$34;-><init>(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_54
    return-void

    .line 495
    :cond_55
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final NavHost(Landroidx/navigation/NavHostController;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavHostController;",
            "Ljava/lang/Object;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/Alignment;",
            "Lkotlin/reflect/KClass<",
            "*>;",
            "Ljava/util/Map<",
            "Lkotlin/reflect/KType;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/EnterTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/ExitTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/EnterTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/ExitTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/SizeTransform;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/navigation/NavGraphBuilder;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    move-object/from16 v13, p11

    move/from16 v14, p13

    move/from16 v15, p15

    const v1, -0x57fa4371

    move-object/from16 v2, p12

    .line 355
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    const-string v2, "C(NavHost)P(5,10,4,1,8,11,2,3,6,7,9)357@14555L135,355@14515L352:NavHost.kt#opm8kd"

    invoke-static {v9, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, v15, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v14, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_2

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_2
    move v2, v14

    :goto_1
    and-int/lit8 v5, v15, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v14, 0x30

    if-nez v5, :cond_5

    invoke-interface {v9, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, v15, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v14, 0x180

    if-nez v8, :cond_8

    move-object/from16 v8, p2

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v2, v10

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v8, p2

    :goto_6
    and-int/lit8 v10, v15, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v2, v2, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v11, v14, 0xc00

    if-nez v11, :cond_b

    move-object/from16 v11, p3

    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x800

    goto :goto_7

    :cond_a
    const/16 v16, 0x400

    :goto_7
    or-int v2, v2, v16

    goto :goto_9

    :cond_b
    :goto_8
    move-object/from16 v11, p3

    :goto_9
    and-int/lit8 v16, v15, 0x10

    if-eqz v16, :cond_c

    or-int/lit16 v2, v2, 0x6000

    goto :goto_b

    :cond_c
    and-int/lit16 v3, v14, 0x6000

    if-nez v3, :cond_e

    move-object/from16 v3, p4

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_d

    const/16 v17, 0x4000

    goto :goto_a

    :cond_d
    const/16 v17, 0x2000

    :goto_a
    or-int v2, v2, v17

    goto :goto_c

    :cond_e
    :goto_b
    move-object/from16 v3, p4

    :goto_c
    and-int/lit8 v17, v15, 0x20

    const/high16 v18, 0x30000

    if-eqz v17, :cond_f

    or-int v2, v2, v18

    move-object/from16 v4, p5

    goto :goto_e

    :cond_f
    and-int v18, v14, v18

    move-object/from16 v4, p5

    if-nez v18, :cond_11

    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_10

    const/high16 v19, 0x20000

    goto :goto_d

    :cond_10
    const/high16 v19, 0x10000

    :goto_d
    or-int v2, v2, v19

    :cond_11
    :goto_e
    and-int/lit8 v19, v15, 0x40

    const/high16 v20, 0x180000

    if-eqz v19, :cond_12

    or-int v2, v2, v20

    move-object/from16 v6, p6

    goto :goto_10

    :cond_12
    and-int v20, v14, v20

    move-object/from16 v6, p6

    if-nez v20, :cond_14

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_13

    const/high16 v21, 0x100000

    goto :goto_f

    :cond_13
    const/high16 v21, 0x80000

    :goto_f
    or-int v2, v2, v21

    :cond_14
    :goto_10
    and-int/lit16 v7, v15, 0x80

    const/high16 v22, 0xc00000

    if-eqz v7, :cond_15

    or-int v2, v2, v22

    move-object/from16 v1, p7

    goto :goto_12

    :cond_15
    and-int v22, v14, v22

    move-object/from16 v1, p7

    if-nez v22, :cond_17

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_16

    const/high16 v23, 0x800000

    goto :goto_11

    :cond_16
    const/high16 v23, 0x400000

    :goto_11
    or-int v2, v2, v23

    :cond_17
    :goto_12
    const/high16 v23, 0x6000000

    and-int v23, v14, v23

    if-nez v23, :cond_1a

    and-int/lit16 v0, v15, 0x100

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_19

    const/high16 v23, 0x4000000

    goto :goto_13

    :cond_18
    move-object/from16 v0, p8

    :cond_19
    const/high16 v23, 0x2000000

    :goto_13
    or-int v2, v2, v23

    goto :goto_14

    :cond_1a
    move-object/from16 v0, p8

    :goto_14
    const/high16 v23, 0x30000000

    and-int v23, v14, v23

    if-nez v23, :cond_1d

    and-int/lit16 v0, v15, 0x200

    if-nez v0, :cond_1b

    move-object/from16 v0, p9

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1c

    const/high16 v23, 0x20000000

    goto :goto_15

    :cond_1b
    move-object/from16 v0, p9

    :cond_1c
    const/high16 v23, 0x10000000

    :goto_15
    or-int v2, v2, v23

    goto :goto_16

    :cond_1d
    move-object/from16 v0, p9

    :goto_16
    and-int/lit16 v0, v15, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v18, p14, 0x6

    move/from16 v23, v0

    move-object/from16 v0, p10

    goto :goto_18

    :cond_1e
    and-int/lit8 v23, p14, 0x6

    if-nez v23, :cond_20

    move/from16 v23, v0

    move-object/from16 v0, p10

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_1f

    const/16 v18, 0x4

    goto :goto_17

    :cond_1f
    const/16 v18, 0x2

    :goto_17
    or-int v18, p14, v18

    goto :goto_18

    :cond_20
    move/from16 v23, v0

    move-object/from16 v0, p10

    move/from16 v18, p14

    :goto_18
    and-int/lit16 v0, v15, 0x800

    if-eqz v0, :cond_21

    or-int/lit8 v18, v18, 0x30

    goto :goto_1a

    :cond_21
    and-int/lit8 v0, p14, 0x30

    if-nez v0, :cond_23

    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    const/16 v20, 0x20

    goto :goto_19

    :cond_22
    const/16 v20, 0x10

    :goto_19
    or-int v18, v18, v20

    :cond_23
    :goto_1a
    move/from16 v0, v18

    const v18, 0x12492493

    and-int v1, v2, v18

    move/from16 p12, v2

    const v2, 0x12492492

    if-ne v1, v2, :cond_25

    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-ne v1, v2, :cond_25

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_24

    goto :goto_1b

    .line 369
    :cond_24
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v10, p9

    move-object v5, v3

    move-object v7, v6

    move-object v3, v8

    move-object v0, v9

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object v6, v4

    move-object v4, v11

    move-object/from16 v11, p10

    goto/16 :goto_27

    .line 355
    :cond_25
    :goto_1b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v1, v14, 0x1

    const v2, -0x70000001

    const v18, -0xe000001

    if-eqz v1, :cond_29

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v1

    if-eqz v1, :cond_26

    goto :goto_1e

    .line 353
    :cond_26
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v1, v15, 0x100

    if-eqz v1, :cond_27

    and-int v1, p12, v18

    goto :goto_1c

    :cond_27
    move/from16 v1, p12

    :goto_1c
    and-int/lit16 v5, v15, 0x200

    if-eqz v5, :cond_28

    and-int/2addr v1, v2

    :cond_28
    move-object v2, v11

    move v11, v1

    move-object v1, v3

    move-object v3, v2

    move-object/from16 v5, p7

    move-object/from16 v10, p8

    move-object/from16 v7, p9

    move-object v2, v8

    :goto_1d
    move-object/from16 v8, p10

    goto/16 :goto_24

    :cond_29
    :goto_1e
    if-eqz v5, :cond_2a

    .line 326
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    goto :goto_1f

    :cond_2a
    move-object v1, v8

    :goto_1f
    if-eqz v10, :cond_2b

    .line 327
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v5

    goto :goto_20

    :cond_2b
    move-object v5, v11

    :goto_20
    const/4 v8, 0x0

    if-eqz v16, :cond_2c

    move-object v3, v8

    :cond_2c
    if-eqz v17, :cond_2d

    .line 329
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    :cond_2d
    if-eqz v19, :cond_2e

    .line 333
    sget-object v6, Landroidx/navigation/compose/NavHostKt$NavHost$15;->INSTANCE:Landroidx/navigation/compose/NavHostKt$NavHost$15;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    :cond_2e
    if-eqz v7, :cond_2f

    .line 339
    sget-object v7, Landroidx/navigation/compose/NavHostKt$NavHost$16;->INSTANCE:Landroidx/navigation/compose/NavHostKt$NavHost$16;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_21

    :cond_2f
    move-object/from16 v7, p7

    :goto_21
    and-int/lit16 v10, v15, 0x100

    if-eqz v10, :cond_30

    and-int v10, p12, v18

    move v11, v10

    move-object v10, v6

    goto :goto_22

    :cond_30
    move-object/from16 v10, p8

    move/from16 v11, p12

    :goto_22
    move/from16 p12, v2

    and-int/lit16 v2, v15, 0x200

    if-eqz v2, :cond_31

    and-int v2, v11, p12

    move v11, v2

    move-object v2, v7

    goto :goto_23

    :cond_31
    move-object/from16 v2, p9

    :goto_23
    if-eqz v23, :cond_32

    move-object/from16 v26, v2

    move-object v2, v1

    move-object v1, v3

    move-object v3, v5

    move-object v5, v7

    move-object/from16 v7, v26

    goto :goto_24

    :cond_32
    move-object v8, v2

    move-object v2, v1

    move-object v1, v3

    move-object v3, v5

    move-object v5, v7

    move-object v7, v8

    goto :goto_1d

    .line 353
    :goto_24
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v16

    move-object/from16 p2, v2

    if-eqz v16, :cond_33

    const-string v2, "androidx.navigation.compose.NavHost (NavHost.kt:354)"

    move-object/from16 p3, v3

    const v3, -0x57fa4371

    .line 355
    invoke-static {v3, v11, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_25

    :cond_33
    move-object/from16 p3, v3

    :goto_25
    const v2, 0x26eda7a1

    .line 357
    const-string v3, "CC(remember):NavHost.kt#9igjgp"

    .line 358
    invoke-static {v9, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v9, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    and-int/lit8 v3, v0, 0x70

    move/from16 p12, v0

    const/16 v0, 0x20

    if-ne v3, v0, :cond_34

    const/4 v0, 0x1

    goto :goto_26

    :cond_34
    const/4 v0, 0x0

    :goto_26
    or-int/2addr v0, v2

    .line 813
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_35

    .line 814
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_36

    .line 359
    :cond_35
    move-object/from16 v0, p0

    check-cast v0, Landroidx/navigation/NavController;

    .line 816
    invoke-virtual {v0}, Landroidx/navigation/NavController;->getNavigatorProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v0

    .line 817
    new-instance v2, Landroidx/navigation/NavGraphBuilder;

    invoke-direct {v2, v0, v12, v1, v4}, Landroidx/navigation/NavGraphBuilder;-><init>(Landroidx/navigation/NavigatorProvider;Ljava/lang/Object;Lkotlin/reflect/KClass;Ljava/util/Map;)V

    invoke-interface {v13, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Landroidx/navigation/NavGraphBuilder;->build()Landroidx/navigation/NavGraph;

    move-result-object v2

    .line 818
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 358
    :cond_36
    check-cast v2, Landroidx/navigation/NavGraph;

    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    and-int/lit16 v0, v11, 0x1f8e

    shr-int/lit8 v3, v11, 0x6

    const v11, 0xe000

    and-int/2addr v11, v3

    or-int/2addr v0, v11

    const/high16 v11, 0x70000

    and-int/2addr v11, v3

    or-int/2addr v0, v11

    const/high16 v11, 0x380000

    and-int/2addr v11, v3

    or-int/2addr v0, v11

    const/high16 v11, 0x1c00000

    and-int/2addr v3, v11

    or-int/2addr v0, v3

    shl-int/lit8 v3, p12, 0x18

    const/high16 v11, 0xe000000

    and-int/2addr v3, v11

    or-int/2addr v0, v3

    const/4 v11, 0x0

    move-object/from16 v3, p3

    move-object/from16 v16, v1

    move-object v1, v2

    move-object/from16 v17, v4

    move-object v4, v6

    move-object v6, v10

    move-object/from16 v2, p2

    move v10, v0

    move-object/from16 v0, p0

    .line 356
    invoke-static/range {v0 .. v11}, Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_37

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_37
    move-object v10, v7

    move-object v11, v8

    move-object v0, v9

    move-object v7, v4

    move-object v8, v5

    move-object v9, v6

    move-object/from16 v5, v16

    move-object/from16 v6, v17

    move-object v4, v3

    move-object v3, v2

    .line 369
    :goto_27
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_38

    move-object v1, v0

    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$18;

    move-object/from16 v25, v1

    move-object v2, v12

    move-object v12, v13

    move v13, v14

    move-object/from16 v1, p0

    move/from16 v14, p14

    invoke-direct/range {v0 .. v15}, Landroidx/navigation/compose/NavHostKt$NavHost$18;-><init>(Landroidx/navigation/NavHostController;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v25

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_38
    return-void
.end method

.method public static final synthetic NavHost(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Deprecated in favor of NavHost that supports sizeTransform"
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    move-object/from16 v13, p9

    move/from16 v14, p11

    move/from16 v15, p12

    const v1, 0x1876b5e3

    move-object/from16 v2, p10

    .line 143
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    const-string v2, "C(NavHost)P(5,9,4,1,8,2,3,6,7)145@6005L126,143@5965L320:NavHost.kt#opm8kd"

    invoke-static {v9, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, v15, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v14, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_2

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_2
    move v2, v14

    :goto_1
    and-int/lit8 v3, v15, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v14, 0x30

    if-nez v3, :cond_5

    invoke-interface {v9, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v15, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v14, 0x180

    if-nez v5, :cond_8

    move-object/from16 v5, p2

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v2, v6

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v5, p2

    :goto_6
    and-int/lit8 v6, v15, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v2, v2, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v7, v14, 0xc00

    if-nez v7, :cond_b

    move-object/from16 v7, p3

    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_7

    :cond_a
    const/16 v8, 0x400

    :goto_7
    or-int/2addr v2, v8

    goto :goto_9

    :cond_b
    :goto_8
    move-object/from16 v7, p3

    :goto_9
    and-int/lit8 v8, v15, 0x10

    if-eqz v8, :cond_c

    or-int/lit16 v2, v2, 0x6000

    goto :goto_b

    :cond_c
    and-int/lit16 v11, v14, 0x6000

    if-nez v11, :cond_e

    move-object/from16 v11, p4

    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_a

    :cond_d
    const/16 v16, 0x2000

    :goto_a
    or-int v2, v2, v16

    goto :goto_c

    :cond_e
    :goto_b
    move-object/from16 v11, p4

    :goto_c
    and-int/lit8 v16, v15, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v2, v2, v17

    move-object/from16 v4, p5

    goto :goto_e

    :cond_f
    and-int v17, v14, v17

    move-object/from16 v4, p5

    if-nez v17, :cond_11

    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_d

    :cond_10
    const/high16 v17, 0x10000

    :goto_d
    or-int v2, v2, v17

    :cond_11
    :goto_e
    and-int/lit8 v17, v15, 0x40

    const/high16 v18, 0x180000

    if-eqz v17, :cond_12

    or-int v2, v2, v18

    move-object/from16 v10, p6

    goto :goto_10

    :cond_12
    and-int v18, v14, v18

    move-object/from16 v10, p6

    if-nez v18, :cond_14

    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_13

    const/high16 v19, 0x100000

    goto :goto_f

    :cond_13
    const/high16 v19, 0x80000

    :goto_f
    or-int v2, v2, v19

    :cond_14
    :goto_10
    const/high16 v19, 0xc00000

    and-int v19, v14, v19

    if-nez v19, :cond_17

    and-int/lit16 v1, v15, 0x80

    if-nez v1, :cond_15

    move-object/from16 v1, p7

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/high16 v20, 0x800000

    goto :goto_11

    :cond_15
    move-object/from16 v1, p7

    :cond_16
    const/high16 v20, 0x400000

    :goto_11
    or-int v2, v2, v20

    goto :goto_12

    :cond_17
    move-object/from16 v1, p7

    :goto_12
    const/high16 v20, 0x6000000

    and-int v20, v14, v20

    if-nez v20, :cond_1a

    and-int/lit16 v0, v15, 0x100

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_19

    const/high16 v20, 0x4000000

    goto :goto_13

    :cond_18
    move-object/from16 v0, p8

    :cond_19
    const/high16 v20, 0x2000000

    :goto_13
    or-int v2, v2, v20

    goto :goto_14

    :cond_1a
    move-object/from16 v0, p8

    :goto_14
    and-int/lit16 v0, v15, 0x200

    move/from16 v20, v0

    const/high16 v21, 0x30000000

    if-eqz v20, :cond_1b

    or-int v2, v2, v21

    goto :goto_16

    :cond_1b
    and-int v20, v14, v21

    if-nez v20, :cond_1d

    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_1c

    const/high16 v20, 0x20000000

    goto :goto_15

    :cond_1c
    const/high16 v20, 0x10000000

    :goto_15
    or-int v2, v2, v20

    :cond_1d
    :goto_16
    const v20, 0x12492493

    and-int v0, v2, v20

    const v1, 0x12492492

    if-ne v0, v1, :cond_1f

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_17

    .line 156
    :cond_1e
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v8, p7

    move-object v6, v4

    move-object v3, v5

    move-object v4, v7

    move-object v0, v9

    move-object v7, v10

    move-object v5, v11

    move-object/from16 v9, p8

    goto/16 :goto_1f

    .line 143
    :cond_1f
    :goto_17
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v14, 0x1

    const v1, -0xe000001

    const v20, -0x1c00001

    if-eqz v0, :cond_23

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_20

    goto :goto_19

    .line 141
    :cond_20
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v0, v15, 0x80

    if-eqz v0, :cond_21

    and-int v2, v2, v20

    :cond_21
    and-int/lit16 v0, v15, 0x100

    if-eqz v0, :cond_22

    and-int/2addr v2, v1

    :cond_22
    move-object/from16 v6, p7

    :goto_18
    move v1, v2

    move-object v2, v5

    move-object v3, v7

    move-object v5, v10

    move-object v0, v11

    move-object/from16 v7, p8

    goto :goto_1b

    :cond_23
    :goto_19
    if-eqz v3, :cond_24

    .line 129
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v5, v0

    :cond_24
    if-eqz v6, :cond_25

    .line 130
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v0

    move-object v7, v0

    :cond_25
    if-eqz v8, :cond_26

    const/4 v0, 0x0

    move-object v11, v0

    :cond_26
    if-eqz v16, :cond_27

    .line 132
    sget-object v0, Landroidx/navigation/compose/NavHostKt$NavHost$3;->INSTANCE:Landroidx/navigation/compose/NavHostKt$NavHost$3;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object v4, v0

    :cond_27
    if-eqz v17, :cond_28

    .line 135
    sget-object v0, Landroidx/navigation/compose/NavHostKt$NavHost$4;->INSTANCE:Landroidx/navigation/compose/NavHostKt$NavHost$4;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object v10, v0

    :cond_28
    and-int/lit16 v0, v15, 0x80

    if-eqz v0, :cond_29

    and-int v2, v2, v20

    move-object v0, v4

    goto :goto_1a

    :cond_29
    move-object/from16 v0, p7

    :goto_1a
    and-int/lit16 v3, v15, 0x100

    if-eqz v3, :cond_2a

    and-int/2addr v2, v1

    move-object v6, v0

    move v1, v2

    move-object v2, v5

    move-object v3, v7

    move-object v5, v10

    move-object v7, v5

    move-object v0, v11

    goto :goto_1b

    :cond_2a
    move-object v6, v0

    goto :goto_18

    .line 141
    :goto_1b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v8

    if-eqz v8, :cond_2b

    const/4 v8, -0x1

    const-string v10, "androidx.navigation.compose.NavHost (NavHost.kt:142)"

    const v11, 0x1876b5e3

    .line 143
    invoke-static {v11, v1, v8, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2b
    const v8, 0x26e97ad8

    .line 145
    const-string v10, "CC(remember):NavHost.kt#9igjgp"

    .line 146
    invoke-static {v9, v8, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const v8, 0xe000

    and-int v10, v1, v8

    const/16 v16, 0x1

    move/from16 p2, v8

    const/16 v8, 0x4000

    if-ne v10, v8, :cond_2c

    move/from16 v8, v16

    goto :goto_1c

    :cond_2c
    const/4 v8, 0x0

    :goto_1c
    and-int/lit8 v10, v1, 0x70

    const/16 v11, 0x20

    if-ne v10, v11, :cond_2d

    move/from16 v10, v16

    goto :goto_1d

    :cond_2d
    const/4 v10, 0x0

    :goto_1d
    or-int/2addr v8, v10

    const/high16 v10, 0x70000000

    and-int/2addr v10, v1

    const/high16 v11, 0x20000000

    if-ne v10, v11, :cond_2e

    move/from16 v11, v16

    goto :goto_1e

    :cond_2e
    const/4 v11, 0x0

    :goto_1e
    or-int/2addr v8, v11

    .line 789
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_2f

    .line 790
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v10, v8, :cond_30

    .line 147
    :cond_2f
    move-object/from16 v8, p0

    check-cast v8, Landroidx/navigation/NavController;

    .line 792
    invoke-virtual {v8}, Landroidx/navigation/NavController;->getNavigatorProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v8

    .line 793
    new-instance v10, Landroidx/navigation/NavGraphBuilder;

    invoke-direct {v10, v8, v12, v0}, Landroidx/navigation/NavGraphBuilder;-><init>(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v13, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10}, Landroidx/navigation/NavGraphBuilder;->build()Landroidx/navigation/NavGraph;

    move-result-object v10

    .line 794
    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 146
    :cond_30
    check-cast v10, Landroidx/navigation/NavGraph;

    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    and-int/lit16 v8, v1, 0x1f8e

    shr-int/lit8 v1, v1, 0x3

    and-int v11, v1, p2

    or-int/2addr v8, v11

    const/high16 v11, 0x70000

    and-int/2addr v11, v1

    or-int/2addr v8, v11

    const/high16 v11, 0x380000

    and-int/2addr v11, v1

    or-int/2addr v8, v11

    const/high16 v11, 0x1c00000

    and-int/2addr v1, v11

    or-int/2addr v1, v8

    const/16 v11, 0x100

    const/4 v8, 0x0

    move-object/from16 v16, v10

    move v10, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    .line 144
    invoke-static/range {v0 .. v11}, Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_31
    move-object v8, v6

    move-object v0, v9

    move-object v6, v4

    move-object v9, v7

    move-object v4, v3

    move-object v7, v5

    move-object/from16 v5, v16

    move-object v3, v2

    .line 156
    :goto_1f
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_32

    move-object v1, v0

    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$6;

    move-object v2, v12

    move-object v10, v13

    move v11, v14

    move v12, v15

    move-object v13, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v12}, Landroidx/navigation/compose/NavHostKt$NavHost$6;-><init>(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v13, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_32
    return-void
.end method

.method public static final NavHost(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavHostController;",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/Alignment;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/EnterTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/ExitTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/EnterTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/ExitTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/SizeTransform;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/navigation/NavGraphBuilder;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v12, p1

    move-object/from16 v13, p10

    move/from16 v14, p12

    move/from16 v15, p14

    const v0, 0x6daffdb6

    move-object/from16 v2, p11

    .line 211
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    const-string v2, "C(NavHost)P(5,10,4,1,8,2,3,6,7,9)213@8656L126,211@8616L343:NavHost.kt#opm8kd"

    invoke-static {v9, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, v15, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v14, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_2

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_2
    move v2, v14

    :goto_1
    and-int/lit8 v5, v15, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v14, 0x30

    if-nez v5, :cond_5

    invoke-interface {v9, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, v15, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v14, 0x180

    if-nez v7, :cond_8

    move-object/from16 v7, p2

    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v7, p2

    :goto_6
    and-int/lit8 v8, v15, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v2, v2, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v10, v14, 0xc00

    if-nez v10, :cond_b

    move-object/from16 v10, p3

    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_7

    :cond_a
    const/16 v11, 0x400

    :goto_7
    or-int/2addr v2, v11

    goto :goto_9

    :cond_b
    :goto_8
    move-object/from16 v10, p3

    :goto_9
    and-int/lit8 v11, v15, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v2, v2, 0x6000

    goto :goto_b

    :cond_c
    and-int/lit16 v6, v14, 0x6000

    if-nez v6, :cond_e

    move-object/from16 v6, p4

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_d

    const/16 v17, 0x4000

    goto :goto_a

    :cond_d
    const/16 v17, 0x2000

    :goto_a
    or-int v2, v2, v17

    goto :goto_c

    :cond_e
    :goto_b
    move-object/from16 v6, p4

    :goto_c
    and-int/lit8 v17, v15, 0x20

    const/high16 v18, 0x30000

    if-eqz v17, :cond_f

    or-int v2, v2, v18

    move-object/from16 v3, p5

    goto :goto_e

    :cond_f
    and-int v18, v14, v18

    move-object/from16 v3, p5

    if-nez v18, :cond_11

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_10

    const/high16 v19, 0x20000

    goto :goto_d

    :cond_10
    const/high16 v19, 0x10000

    :goto_d
    or-int v2, v2, v19

    :cond_11
    :goto_e
    and-int/lit8 v19, v15, 0x40

    const/high16 v20, 0x180000

    if-eqz v19, :cond_12

    or-int v2, v2, v20

    move-object/from16 v0, p6

    goto :goto_10

    :cond_12
    and-int v20, v14, v20

    move-object/from16 v0, p6

    if-nez v20, :cond_14

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_13

    const/high16 v21, 0x100000

    goto :goto_f

    :cond_13
    const/high16 v21, 0x80000

    :goto_f
    or-int v2, v2, v21

    :cond_14
    :goto_10
    const/high16 v21, 0xc00000

    and-int v21, v14, v21

    if-nez v21, :cond_17

    and-int/lit16 v4, v15, 0x80

    if-nez v4, :cond_15

    move-object/from16 v4, p7

    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_16

    const/high16 v22, 0x800000

    goto :goto_11

    :cond_15
    move-object/from16 v4, p7

    :cond_16
    const/high16 v22, 0x400000

    :goto_11
    or-int v2, v2, v22

    goto :goto_12

    :cond_17
    move-object/from16 v4, p7

    :goto_12
    const/high16 v22, 0x6000000

    and-int v22, v14, v22

    if-nez v22, :cond_1a

    and-int/lit16 v0, v15, 0x100

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_19

    const/high16 v22, 0x4000000

    goto :goto_13

    :cond_18
    move-object/from16 v0, p8

    :cond_19
    const/high16 v22, 0x2000000

    :goto_13
    or-int v2, v2, v22

    goto :goto_14

    :cond_1a
    move-object/from16 v0, p8

    :goto_14
    and-int/lit16 v0, v15, 0x200

    const/high16 v22, 0x30000000

    if-eqz v0, :cond_1b

    or-int v2, v2, v22

    goto :goto_16

    :cond_1b
    and-int v22, v14, v22

    if-nez v22, :cond_1d

    move/from16 v22, v0

    move-object/from16 v0, p9

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1c

    const/high16 v23, 0x20000000

    goto :goto_15

    :cond_1c
    const/high16 v23, 0x10000000

    :goto_15
    or-int v2, v2, v23

    goto :goto_17

    :cond_1d
    :goto_16
    move/from16 v22, v0

    move-object/from16 v0, p9

    :goto_17
    and-int/lit16 v0, v15, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v0, p13, 0x6

    goto :goto_19

    :cond_1e
    and-int/lit8 v0, p13, 0x6

    if-nez v0, :cond_20

    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    const/4 v0, 0x4

    goto :goto_18

    :cond_1f
    const/4 v0, 0x2

    :goto_18
    or-int v0, p13, v0

    goto :goto_19

    :cond_20
    move/from16 v0, p13

    :goto_19
    const v23, 0x12492493

    and-int v1, v2, v23

    move/from16 v23, v2

    const v2, 0x12492492

    if-ne v1, v2, :cond_22

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_22

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_21

    goto :goto_1a

    .line 225
    :cond_21
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v8, v4

    move-object v5, v6

    move-object v0, v9

    move-object v4, v10

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object v6, v3

    move-object v3, v7

    move-object/from16 v7, p6

    goto/16 :goto_27

    .line 211
    :cond_22
    :goto_1a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v1, v14, 0x1

    const v2, -0x1c00001

    if-eqz v1, :cond_26

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v1

    if-eqz v1, :cond_23

    goto :goto_1c

    .line 209
    :cond_23
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v1, v15, 0x80

    if-eqz v1, :cond_24

    and-int v2, v23, v2

    goto :goto_1b

    :cond_24
    move/from16 v2, v23

    :goto_1b
    and-int/lit16 v1, v15, 0x100

    if-eqz v1, :cond_25

    const v1, -0xe000001

    and-int/2addr v2, v1

    :cond_25
    move-object/from16 v5, p6

    move-object/from16 v8, p9

    move-object v1, v6

    move-object v6, v4

    move-object v4, v3

    move-object v3, v10

    move v10, v2

    move-object v2, v7

    move-object/from16 v7, p8

    goto/16 :goto_22

    :cond_26
    :goto_1c
    if-eqz v5, :cond_27

    .line 183
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    goto :goto_1d

    :cond_27
    move-object v1, v7

    :goto_1d
    if-eqz v8, :cond_28

    .line 184
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v5

    goto :goto_1e

    :cond_28
    move-object v5, v10

    :goto_1e
    const/4 v7, 0x0

    if-eqz v11, :cond_29

    move-object v6, v7

    :cond_29
    if-eqz v17, :cond_2a

    .line 189
    sget-object v3, Landroidx/navigation/compose/NavHostKt$NavHost$7;->INSTANCE:Landroidx/navigation/compose/NavHostKt$NavHost$7;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    :cond_2a
    if-eqz v19, :cond_2b

    .line 195
    sget-object v8, Landroidx/navigation/compose/NavHostKt$NavHost$8;->INSTANCE:Landroidx/navigation/compose/NavHostKt$NavHost$8;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    goto :goto_1f

    :cond_2b
    move-object/from16 v8, p6

    :goto_1f
    and-int/lit16 v10, v15, 0x80

    if-eqz v10, :cond_2c

    and-int v2, v23, v2

    move-object v4, v3

    goto :goto_20

    :cond_2c
    move/from16 v2, v23

    :goto_20
    and-int/lit16 v10, v15, 0x100

    if-eqz v10, :cond_2d

    const v10, -0xe000001

    and-int/2addr v2, v10

    move v10, v2

    move-object v2, v8

    goto :goto_21

    :cond_2d
    move v10, v2

    move-object/from16 v2, p8

    :goto_21
    if-eqz v22, :cond_2e

    move-object/from16 v24, v2

    move-object v2, v1

    move-object v1, v6

    move-object v6, v4

    move-object v4, v3

    move-object v3, v5

    move-object v5, v8

    move-object v8, v7

    move-object/from16 v7, v24

    goto :goto_22

    :cond_2e
    move-object v7, v2

    move-object v2, v1

    move-object v1, v6

    move-object v6, v4

    move-object v4, v3

    move-object v3, v5

    move-object v5, v8

    move-object/from16 v8, p9

    .line 209
    :goto_22
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v11

    if-eqz v11, :cond_2f

    const-string v11, "androidx.navigation.compose.NavHost (NavHost.kt:210)"

    move-object/from16 p2, v2

    const v2, 0x6daffdb6

    .line 211
    invoke-static {v2, v10, v0, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_23

    :cond_2f
    move-object/from16 p2, v2

    :goto_23
    const v2, 0x26eac638

    .line 213
    const-string v11, "CC(remember):NavHost.kt#9igjgp"

    .line 214
    invoke-static {v9, v2, v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const v2, 0xe000

    and-int/2addr v2, v10

    const/16 v17, 0x1

    const/16 v11, 0x4000

    if-ne v2, v11, :cond_30

    move/from16 v2, v17

    goto :goto_24

    :cond_30
    const/4 v2, 0x0

    :goto_24
    and-int/lit8 v11, v10, 0x70

    move/from16 v18, v0

    const/16 v0, 0x20

    if-ne v11, v0, :cond_31

    move/from16 v0, v17

    goto :goto_25

    :cond_31
    const/4 v0, 0x0

    :goto_25
    or-int/2addr v0, v2

    and-int/lit8 v2, v18, 0xe

    const/4 v11, 0x4

    if-ne v2, v11, :cond_32

    move/from16 v11, v17

    goto :goto_26

    :cond_32
    const/4 v11, 0x0

    :goto_26
    or-int/2addr v0, v11

    .line 797
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_33

    .line 798
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_34

    .line 215
    :cond_33
    move-object/from16 v0, p0

    check-cast v0, Landroidx/navigation/NavController;

    .line 800
    invoke-virtual {v0}, Landroidx/navigation/NavController;->getNavigatorProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v0

    .line 801
    new-instance v2, Landroidx/navigation/NavGraphBuilder;

    invoke-direct {v2, v0, v12, v1}, Landroidx/navigation/NavGraphBuilder;-><init>(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v13, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Landroidx/navigation/NavGraphBuilder;->build()Landroidx/navigation/NavGraph;

    move-result-object v2

    .line 802
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 214
    :cond_34
    check-cast v2, Landroidx/navigation/NavGraph;

    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    and-int/lit16 v0, v10, 0x1f8e

    shr-int/lit8 v10, v10, 0x3

    const v11, 0xe000

    and-int/2addr v11, v10

    or-int/2addr v0, v11

    const/high16 v11, 0x70000

    and-int/2addr v11, v10

    or-int/2addr v0, v11

    const/high16 v11, 0x380000

    and-int/2addr v11, v10

    or-int/2addr v0, v11

    const/high16 v11, 0x1c00000

    and-int/2addr v11, v10

    or-int/2addr v0, v11

    const/high16 v11, 0xe000000

    and-int/2addr v10, v11

    or-int/2addr v10, v0

    const/4 v11, 0x0

    move-object/from16 v0, p0

    move-object/from16 v16, v1

    move-object v1, v2

    move-object/from16 v2, p2

    .line 212
    invoke-static/range {v0 .. v11}, Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_35

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_35
    move-object v10, v8

    move-object v0, v9

    move-object v8, v6

    move-object v9, v7

    move-object v6, v4

    move-object v7, v5

    move-object/from16 v5, v16

    move-object v4, v3

    move-object v3, v2

    .line 225
    :goto_27
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_36

    move-object v1, v0

    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$10;

    move-object v2, v12

    move-object v11, v13

    move v12, v14

    move v14, v15

    move/from16 v13, p13

    move-object v15, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v14}, Landroidx/navigation/compose/NavHostKt$NavHost$10;-><init>(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_36
    return-void
.end method

.method public static final synthetic NavHost(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Deprecated in favor of NavHost that supports AnimatedContent"
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    move-object/from16 v13, p4

    move/from16 v14, p6

    const v1, 0x8741dc0

    move-object/from16 v2, p5

    .line 91
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    const-string v2, "C(NavHost)P(2,4,1,3)93@3780L126,91@3740L190:NavHost.kt#opm8kd"

    invoke-static {v9, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, p7, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v14, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_2

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_2
    move v2, v14

    :goto_1
    and-int/lit8 v3, p7, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v14, 0x30

    if-nez v3, :cond_5

    invoke-interface {v9, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v4

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v14, 0x180

    if-nez v5, :cond_8

    move-object/from16 v5, p2

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v2, v6

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v5, p2

    :goto_6
    and-int/lit8 v6, p7, 0x8

    const/16 v7, 0x800

    if-eqz v6, :cond_9

    or-int/lit16 v2, v2, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v8, v14, 0xc00

    if-nez v8, :cond_b

    move-object/from16 v8, p3

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    move v10, v7

    goto :goto_7

    :cond_a
    const/16 v10, 0x400

    :goto_7
    or-int/2addr v2, v10

    goto :goto_9

    :cond_b
    :goto_8
    move-object/from16 v8, p3

    :goto_9
    and-int/lit8 v10, p7, 0x10

    const/16 v11, 0x4000

    if-eqz v10, :cond_c

    or-int/lit16 v2, v2, 0x6000

    goto :goto_b

    :cond_c
    and-int/lit16 v10, v14, 0x6000

    if-nez v10, :cond_e

    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    move v10, v11

    goto :goto_a

    :cond_d
    const/16 v10, 0x2000

    :goto_a
    or-int/2addr v2, v10

    :cond_e
    :goto_b
    and-int/lit16 v10, v2, 0x2493

    const/16 v15, 0x2492

    if-ne v10, v15, :cond_10

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v10

    if-nez v10, :cond_f

    goto :goto_c

    .line 99
    :cond_f
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, v5

    move-object v4, v8

    goto/16 :goto_11

    :cond_10
    :goto_c
    if-eqz v3, :cond_11

    .line 88
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    goto :goto_d

    :cond_11
    move-object v3, v5

    :goto_d
    if-eqz v6, :cond_12

    const/4 v5, 0x0

    move-object v15, v5

    goto :goto_e

    :cond_12
    move-object v15, v8

    .line 89
    :goto_e
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_13

    const/4 v5, -0x1

    const-string v6, "androidx.navigation.compose.NavHost (NavHost.kt:90)"

    .line 91
    invoke-static {v1, v2, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_13
    const v1, 0x26e864b8

    .line 93
    const-string v5, "CC(remember):NavHost.kt#9igjgp"

    .line 94
    invoke-static {v9, v1, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit16 v1, v2, 0x1c00

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v1, v7, :cond_14

    move v1, v6

    goto :goto_f

    :cond_14
    move v1, v5

    :goto_f
    and-int/lit8 v7, v2, 0x70

    if-ne v7, v4, :cond_15

    move v4, v6

    goto :goto_10

    :cond_15
    move v4, v5

    :goto_10
    or-int/2addr v1, v4

    const v4, 0xe000

    and-int/2addr v4, v2

    if-ne v4, v11, :cond_16

    move v5, v6

    :cond_16
    or-int/2addr v1, v5

    .line 781
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_17

    .line 782
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_18

    .line 95
    :cond_17
    move-object v1, v0

    check-cast v1, Landroidx/navigation/NavController;

    .line 784
    invoke-virtual {v1}, Landroidx/navigation/NavController;->getNavigatorProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    .line 785
    new-instance v4, Landroidx/navigation/NavGraphBuilder;

    invoke-direct {v4, v1, v12, v15}, Landroidx/navigation/NavGraphBuilder;-><init>(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v13, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Landroidx/navigation/NavGraphBuilder;->build()Landroidx/navigation/NavGraph;

    move-result-object v4

    .line 786
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 94
    :cond_18
    move-object v1, v4

    check-cast v1, Landroidx/navigation/NavGraph;

    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    and-int/lit16 v10, v2, 0x38e

    const/16 v11, 0x1f8

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 92
    invoke-static/range {v0 .. v11}, Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_19
    move-object v3, v2

    move-object v4, v15

    .line 99
    :goto_11
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v8

    if-eqz v8, :cond_1a

    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$2;

    move-object/from16 v1, p0

    move/from16 v7, p7

    move-object v2, v12

    move-object v5, v13

    move v6, v14

    invoke-direct/range {v0 .. v7}, Landroidx/navigation/compose/NavHostKt$NavHost$2;-><init>(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_1a
    return-void
.end method

.method public static final NavHost(Landroidx/navigation/NavHostController;Lkotlin/reflect/KClass;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavHostController;",
            "Lkotlin/reflect/KClass<",
            "*>;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/Alignment;",
            "Lkotlin/reflect/KClass<",
            "*>;",
            "Ljava/util/Map<",
            "Lkotlin/reflect/KType;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/EnterTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/ExitTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/EnterTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/ExitTransition;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;",
            "Landroidx/compose/animation/SizeTransform;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/navigation/NavGraphBuilder;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    move-object/from16 v13, p11

    move/from16 v14, p13

    move/from16 v15, p15

    const v1, 0x2cbb3aae

    move-object/from16 v2, p12

    .line 283
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    const-string v2, "C(NavHost)P(5,10,4,1,8,11,2,3,6,7,9)285@11603L135,283@11563L352:NavHost.kt#opm8kd"

    invoke-static {v9, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, v15, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v14, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_2

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_2
    move v2, v14

    :goto_1
    and-int/lit8 v5, v15, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v14, 0x30

    if-nez v5, :cond_5

    invoke-interface {v9, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, v15, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v14, 0x180

    if-nez v8, :cond_8

    move-object/from16 v8, p2

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v2, v10

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v8, p2

    :goto_6
    and-int/lit8 v10, v15, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v2, v2, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v11, v14, 0xc00

    if-nez v11, :cond_b

    move-object/from16 v11, p3

    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x800

    goto :goto_7

    :cond_a
    const/16 v16, 0x400

    :goto_7
    or-int v2, v2, v16

    goto :goto_9

    :cond_b
    :goto_8
    move-object/from16 v11, p3

    :goto_9
    and-int/lit8 v16, v15, 0x10

    if-eqz v16, :cond_c

    or-int/lit16 v2, v2, 0x6000

    goto :goto_b

    :cond_c
    and-int/lit16 v3, v14, 0x6000

    if-nez v3, :cond_e

    move-object/from16 v3, p4

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_d

    const/16 v17, 0x4000

    goto :goto_a

    :cond_d
    const/16 v17, 0x2000

    :goto_a
    or-int v2, v2, v17

    goto :goto_c

    :cond_e
    :goto_b
    move-object/from16 v3, p4

    :goto_c
    and-int/lit8 v17, v15, 0x20

    const/high16 v18, 0x30000

    if-eqz v17, :cond_f

    or-int v2, v2, v18

    move-object/from16 v4, p5

    goto :goto_e

    :cond_f
    and-int v18, v14, v18

    move-object/from16 v4, p5

    if-nez v18, :cond_11

    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_10

    const/high16 v19, 0x20000

    goto :goto_d

    :cond_10
    const/high16 v19, 0x10000

    :goto_d
    or-int v2, v2, v19

    :cond_11
    :goto_e
    and-int/lit8 v19, v15, 0x40

    const/high16 v20, 0x180000

    if-eqz v19, :cond_12

    or-int v2, v2, v20

    move-object/from16 v6, p6

    goto :goto_10

    :cond_12
    and-int v20, v14, v20

    move-object/from16 v6, p6

    if-nez v20, :cond_14

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_13

    const/high16 v21, 0x100000

    goto :goto_f

    :cond_13
    const/high16 v21, 0x80000

    :goto_f
    or-int v2, v2, v21

    :cond_14
    :goto_10
    and-int/lit16 v7, v15, 0x80

    const/high16 v22, 0xc00000

    if-eqz v7, :cond_15

    or-int v2, v2, v22

    move-object/from16 v1, p7

    goto :goto_12

    :cond_15
    and-int v22, v14, v22

    move-object/from16 v1, p7

    if-nez v22, :cond_17

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_16

    const/high16 v23, 0x800000

    goto :goto_11

    :cond_16
    const/high16 v23, 0x400000

    :goto_11
    or-int v2, v2, v23

    :cond_17
    :goto_12
    const/high16 v23, 0x6000000

    and-int v23, v14, v23

    if-nez v23, :cond_1a

    and-int/lit16 v0, v15, 0x100

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_19

    const/high16 v23, 0x4000000

    goto :goto_13

    :cond_18
    move-object/from16 v0, p8

    :cond_19
    const/high16 v23, 0x2000000

    :goto_13
    or-int v2, v2, v23

    goto :goto_14

    :cond_1a
    move-object/from16 v0, p8

    :goto_14
    const/high16 v23, 0x30000000

    and-int v23, v14, v23

    if-nez v23, :cond_1d

    and-int/lit16 v0, v15, 0x200

    if-nez v0, :cond_1b

    move-object/from16 v0, p9

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1c

    const/high16 v23, 0x20000000

    goto :goto_15

    :cond_1b
    move-object/from16 v0, p9

    :cond_1c
    const/high16 v23, 0x10000000

    :goto_15
    or-int v2, v2, v23

    goto :goto_16

    :cond_1d
    move-object/from16 v0, p9

    :goto_16
    and-int/lit16 v0, v15, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v18, p14, 0x6

    move/from16 v23, v0

    move-object/from16 v0, p10

    goto :goto_18

    :cond_1e
    and-int/lit8 v23, p14, 0x6

    if-nez v23, :cond_20

    move/from16 v23, v0

    move-object/from16 v0, p10

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_1f

    const/16 v18, 0x4

    goto :goto_17

    :cond_1f
    const/16 v18, 0x2

    :goto_17
    or-int v18, p14, v18

    goto :goto_18

    :cond_20
    move/from16 v23, v0

    move-object/from16 v0, p10

    move/from16 v18, p14

    :goto_18
    and-int/lit16 v0, v15, 0x800

    if-eqz v0, :cond_21

    or-int/lit8 v18, v18, 0x30

    goto :goto_1a

    :cond_21
    and-int/lit8 v0, p14, 0x30

    if-nez v0, :cond_23

    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    const/16 v20, 0x20

    goto :goto_19

    :cond_22
    const/16 v20, 0x10

    :goto_19
    or-int v18, v18, v20

    :cond_23
    :goto_1a
    move/from16 v0, v18

    const v18, 0x12492493

    and-int v1, v2, v18

    move/from16 p12, v2

    const v2, 0x12492492

    if-ne v1, v2, :cond_25

    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-ne v1, v2, :cond_25

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_24

    goto :goto_1b

    .line 297
    :cond_24
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v10, p9

    move-object v5, v3

    move-object v7, v6

    move-object v3, v8

    move-object v0, v9

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object v6, v4

    move-object v4, v11

    move-object/from16 v11, p10

    goto/16 :goto_27

    .line 283
    :cond_25
    :goto_1b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v1, v14, 0x1

    const v2, -0x70000001

    const v18, -0xe000001

    if-eqz v1, :cond_29

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v1

    if-eqz v1, :cond_26

    goto :goto_1e

    .line 281
    :cond_26
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v1, v15, 0x100

    if-eqz v1, :cond_27

    and-int v1, p12, v18

    goto :goto_1c

    :cond_27
    move/from16 v1, p12

    :goto_1c
    and-int/lit16 v5, v15, 0x200

    if-eqz v5, :cond_28

    and-int/2addr v1, v2

    :cond_28
    move-object v2, v11

    move v11, v1

    move-object v1, v3

    move-object v3, v2

    move-object/from16 v5, p7

    move-object/from16 v10, p8

    move-object/from16 v7, p9

    move-object v2, v8

    :goto_1d
    move-object/from16 v8, p10

    goto/16 :goto_24

    :cond_29
    :goto_1e
    if-eqz v5, :cond_2a

    .line 254
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    goto :goto_1f

    :cond_2a
    move-object v1, v8

    :goto_1f
    if-eqz v10, :cond_2b

    .line 255
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v5

    goto :goto_20

    :cond_2b
    move-object v5, v11

    :goto_20
    const/4 v8, 0x0

    if-eqz v16, :cond_2c

    move-object v3, v8

    :cond_2c
    if-eqz v17, :cond_2d

    .line 257
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    :cond_2d
    if-eqz v19, :cond_2e

    .line 261
    sget-object v6, Landroidx/navigation/compose/NavHostKt$NavHost$11;->INSTANCE:Landroidx/navigation/compose/NavHostKt$NavHost$11;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    :cond_2e
    if-eqz v7, :cond_2f

    .line 267
    sget-object v7, Landroidx/navigation/compose/NavHostKt$NavHost$12;->INSTANCE:Landroidx/navigation/compose/NavHostKt$NavHost$12;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_21

    :cond_2f
    move-object/from16 v7, p7

    :goto_21
    and-int/lit16 v10, v15, 0x100

    if-eqz v10, :cond_30

    and-int v10, p12, v18

    move v11, v10

    move-object v10, v6

    goto :goto_22

    :cond_30
    move-object/from16 v10, p8

    move/from16 v11, p12

    :goto_22
    move/from16 p12, v2

    and-int/lit16 v2, v15, 0x200

    if-eqz v2, :cond_31

    and-int v2, v11, p12

    move v11, v2

    move-object v2, v7

    goto :goto_23

    :cond_31
    move-object/from16 v2, p9

    :goto_23
    if-eqz v23, :cond_32

    move-object/from16 v26, v2

    move-object v2, v1

    move-object v1, v3

    move-object v3, v5

    move-object v5, v7

    move-object/from16 v7, v26

    goto :goto_24

    :cond_32
    move-object v8, v2

    move-object v2, v1

    move-object v1, v3

    move-object v3, v5

    move-object v5, v7

    move-object v7, v8

    goto :goto_1d

    .line 281
    :goto_24
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v16

    move-object/from16 p2, v2

    if-eqz v16, :cond_33

    const-string v2, "androidx.navigation.compose.NavHost (NavHost.kt:282)"

    move-object/from16 p3, v3

    const v3, 0x2cbb3aae

    .line 283
    invoke-static {v3, v11, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_25

    :cond_33
    move-object/from16 p3, v3

    :goto_25
    const v2, 0x26ec36a1

    .line 285
    const-string v3, "CC(remember):NavHost.kt#9igjgp"

    .line 286
    invoke-static {v9, v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v9, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    and-int/lit8 v3, v0, 0x70

    move/from16 p12, v0

    const/16 v0, 0x20

    if-ne v3, v0, :cond_34

    const/4 v0, 0x1

    goto :goto_26

    :cond_34
    const/4 v0, 0x0

    :goto_26
    or-int/2addr v0, v2

    .line 805
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_35

    .line 806
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_36

    .line 287
    :cond_35
    move-object/from16 v0, p0

    check-cast v0, Landroidx/navigation/NavController;

    .line 808
    invoke-virtual {v0}, Landroidx/navigation/NavController;->getNavigatorProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v0

    .line 809
    new-instance v2, Landroidx/navigation/NavGraphBuilder;

    invoke-direct {v2, v0, v12, v1, v4}, Landroidx/navigation/NavGraphBuilder;-><init>(Landroidx/navigation/NavigatorProvider;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Ljava/util/Map;)V

    invoke-interface {v13, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Landroidx/navigation/NavGraphBuilder;->build()Landroidx/navigation/NavGraph;

    move-result-object v2

    .line 810
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 286
    :cond_36
    check-cast v2, Landroidx/navigation/NavGraph;

    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    and-int/lit16 v0, v11, 0x1f8e

    shr-int/lit8 v3, v11, 0x6

    const v11, 0xe000

    and-int/2addr v11, v3

    or-int/2addr v0, v11

    const/high16 v11, 0x70000

    and-int/2addr v11, v3

    or-int/2addr v0, v11

    const/high16 v11, 0x380000

    and-int/2addr v11, v3

    or-int/2addr v0, v11

    const/high16 v11, 0x1c00000

    and-int/2addr v3, v11

    or-int/2addr v0, v3

    shl-int/lit8 v3, p12, 0x18

    const/high16 v11, 0xe000000

    and-int/2addr v3, v11

    or-int/2addr v0, v3

    const/4 v11, 0x0

    move-object/from16 v3, p3

    move-object/from16 v16, v1

    move-object v1, v2

    move-object/from16 v17, v4

    move-object v4, v6

    move-object v6, v10

    move-object/from16 v2, p2

    move v10, v0

    move-object/from16 v0, p0

    .line 284
    invoke-static/range {v0 .. v11}, Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_37

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_37
    move-object v10, v7

    move-object v11, v8

    move-object v0, v9

    move-object v7, v4

    move-object v8, v5

    move-object v9, v6

    move-object/from16 v5, v16

    move-object/from16 v6, v17

    move-object v4, v3

    move-object v3, v2

    .line 297
    :goto_27
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_38

    move-object v1, v0

    new-instance v0, Landroidx/navigation/compose/NavHostKt$NavHost$14;

    move-object/from16 v25, v1

    move-object v2, v12

    move-object v12, v13

    move v13, v14

    move-object/from16 v1, p0

    move/from16 v14, p14

    invoke-direct/range {v0 .. v15}, Landroidx/navigation/compose/NavHostKt$NavHost$14;-><init>(Landroidx/navigation/NavHostController;Lkotlin/reflect/KClass;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    move-object/from16 v1, v25

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_38
    return-void
.end method

.method private static final NavHost$lambda$11(Landroidx/compose/runtime/MutableState;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 513
    check-cast p0, Landroidx/compose/runtime/State;

    .line 918
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final NavHost$lambda$12(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    .line 513
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 919
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final NavHost$lambda$15(Landroidx/compose/runtime/State;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;>;)",
            "Ljava/util/List<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;"
        }
    .end annotation

    .line 921
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final NavHost$lambda$17(Landroidx/compose/runtime/State;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;>;)",
            "Ljava/util/List<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;"
        }
    .end annotation

    .line 922
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final NavHost$lambda$6(Landroidx/compose/runtime/State;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Ljava/util/List<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;>;)",
            "Ljava/util/List<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;"
        }
    .end annotation

    .line 914
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final NavHost$lambda$8(Landroidx/compose/runtime/MutableFloatState;)F
    .locals 0

    .line 512
    check-cast p0, Landroidx/compose/runtime/FloatState;

    .line 915
    invoke-interface {p0}, Landroidx/compose/runtime/FloatState;->getFloatValue()F

    move-result p0

    return p0
.end method

.method private static final NavHost$lambda$9(Landroidx/compose/runtime/MutableFloatState;F)V
    .locals 0

    .line 916
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

    return-void
.end method

.method public static final synthetic access$NavHost$lambda$11(Landroidx/compose/runtime/MutableState;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/compose/NavHostKt;->NavHost$lambda$11(Landroidx/compose/runtime/MutableState;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$NavHost$lambda$12(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/navigation/compose/NavHostKt;->NavHost$lambda$12(Landroidx/compose/runtime/MutableState;Z)V

    return-void
.end method

.method public static final synthetic access$NavHost$lambda$15(Landroidx/compose/runtime/State;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/compose/NavHostKt;->NavHost$lambda$15(Landroidx/compose/runtime/State;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$NavHost$lambda$17(Landroidx/compose/runtime/State;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/compose/NavHostKt;->NavHost$lambda$17(Landroidx/compose/runtime/State;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$NavHost$lambda$6(Landroidx/compose/runtime/State;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/compose/NavHostKt;->NavHost$lambda$6(Landroidx/compose/runtime/State;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$NavHost$lambda$8(Landroidx/compose/runtime/MutableFloatState;)F
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/compose/NavHostKt;->NavHost$lambda$8(Landroidx/compose/runtime/MutableFloatState;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$NavHost$lambda$9(Landroidx/compose/runtime/MutableFloatState;F)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/navigation/compose/NavHostKt;->NavHost$lambda$9(Landroidx/compose/runtime/MutableFloatState;F)V

    return-void
.end method

.method public static final synthetic access$createEnterTransition(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/navigation/compose/NavHostKt;->createEnterTransition(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createExitTransition(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ExitTransition;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/navigation/compose/NavHostKt;->createExitTransition(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ExitTransition;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createPopEnterTransition(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/navigation/compose/NavHostKt;->createPopEnterTransition(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createPopExitTransition(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ExitTransition;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/navigation/compose/NavHostKt;->createPopExitTransition(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ExitTransition;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$createSizeTransform(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/SizeTransform;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/navigation/compose/NavHostKt;->createSizeTransform(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/SizeTransform;

    move-result-object p0

    return-object p0
.end method

.method private static final createEnterTransition(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavDestination;",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;)",
            "Landroidx/compose/animation/EnterTransition;"
        }
    .end annotation

    .line 740
    instance-of v0, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Landroidx/navigation/compose/ComposeNavigator$Destination;

    invoke-virtual {p0}, Landroidx/navigation/compose/ComposeNavigator$Destination;->getEnterTransition$navigation_compose_release()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/EnterTransition;

    return-object p0

    :cond_0
    return-object v1

    .line 741
    :cond_1
    instance-of v0, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    if-eqz v0, :cond_2

    check-cast p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    invoke-virtual {p0}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->getEnterTransition$navigation_compose_release()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/EnterTransition;

    return-object p0

    :cond_2
    return-object v1
.end method

.method private static final createExitTransition(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ExitTransition;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavDestination;",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;)",
            "Landroidx/compose/animation/ExitTransition;"
        }
    .end annotation

    .line 749
    instance-of v0, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Landroidx/navigation/compose/ComposeNavigator$Destination;

    invoke-virtual {p0}, Landroidx/navigation/compose/ComposeNavigator$Destination;->getExitTransition$navigation_compose_release()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/ExitTransition;

    return-object p0

    :cond_0
    return-object v1

    .line 750
    :cond_1
    instance-of v0, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    if-eqz v0, :cond_2

    check-cast p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    invoke-virtual {p0}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->getExitTransition$navigation_compose_release()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/ExitTransition;

    return-object p0

    :cond_2
    return-object v1
.end method

.method private static final createPopEnterTransition(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavDestination;",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;)",
            "Landroidx/compose/animation/EnterTransition;"
        }
    .end annotation

    .line 758
    instance-of v0, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Landroidx/navigation/compose/ComposeNavigator$Destination;

    invoke-virtual {p0}, Landroidx/navigation/compose/ComposeNavigator$Destination;->getPopEnterTransition$navigation_compose_release()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/EnterTransition;

    return-object p0

    :cond_0
    return-object v1

    .line 759
    :cond_1
    instance-of v0, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    if-eqz v0, :cond_2

    check-cast p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    invoke-virtual {p0}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->getPopEnterTransition$navigation_compose_release()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/EnterTransition;

    return-object p0

    :cond_2
    return-object v1
.end method

.method private static final createPopExitTransition(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ExitTransition;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavDestination;",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;)",
            "Landroidx/compose/animation/ExitTransition;"
        }
    .end annotation

    .line 767
    instance-of v0, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Landroidx/navigation/compose/ComposeNavigator$Destination;

    invoke-virtual {p0}, Landroidx/navigation/compose/ComposeNavigator$Destination;->getPopExitTransition$navigation_compose_release()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/ExitTransition;

    return-object p0

    :cond_0
    return-object v1

    .line 768
    :cond_1
    instance-of v0, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    if-eqz v0, :cond_2

    check-cast p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    invoke-virtual {p0}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->getPopExitTransition$navigation_compose_release()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/ExitTransition;

    return-object p0

    :cond_2
    return-object v1
.end method

.method private static final createSizeTransform(Landroidx/navigation/NavDestination;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/SizeTransform;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavDestination;",
            "Landroidx/compose/animation/AnimatedContentTransitionScope<",
            "Landroidx/navigation/NavBackStackEntry;",
            ">;)",
            "Landroidx/compose/animation/SizeTransform;"
        }
    .end annotation

    .line 776
    instance-of v0, p0, Landroidx/navigation/compose/ComposeNavigator$Destination;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Landroidx/navigation/compose/ComposeNavigator$Destination;

    invoke-virtual {p0}, Landroidx/navigation/compose/ComposeNavigator$Destination;->getSizeTransform$navigation_compose_release()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/SizeTransform;

    return-object p0

    :cond_0
    return-object v1

    .line 777
    :cond_1
    instance-of v0, p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    if-eqz v0, :cond_2

    check-cast p0, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    invoke-virtual {p0}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->getSizeTransform$navigation_compose_release()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/SizeTransform;

    return-object p0

    :cond_2
    return-object v1
.end method
