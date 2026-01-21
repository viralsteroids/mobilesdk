.class public final Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt;
.super Ljava/lang/Object;
.source "MutableMultiplePermissionsState.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMutableMultiplePermissionsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1116#2,6:153\n1116#2,6:159\n1116#2,3:166\n1119#2,3:173\n1116#2,6:176\n74#3:165\n1549#4:169\n1620#4,3:170\n*S KotlinDebug\n*F\n+ 1 MutableMultiplePermissionsState.kt\ncom/google/accompanist/permissions/MutableMultiplePermissionsStateKt\n*L\n52#1:153,6\n59#1:159,6\n81#1:166,3\n81#1:173,3\n90#1:176,6\n79#1:165\n82#1:169\n82#1:170,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032 \u0008\u0002\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0001\u00a2\u0006\u0002\u0010\n\u001a!\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0003\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "rememberMutableMultiplePermissionsState",
        "Lcom/google/accompanist/permissions/MultiplePermissionsState;",
        "permissions",
        "",
        "",
        "onPermissionsResult",
        "Lkotlin/Function1;",
        "",
        "",
        "",
        "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/google/accompanist/permissions/MultiplePermissionsState;",
        "rememberMutablePermissionsState",
        "Lcom/google/accompanist/permissions/MutablePermissionState;",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/List;",
        "permissions_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final rememberMutableMultiplePermissionsState(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/google/accompanist/permissions/MultiplePermissionsState;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Lcom/google/accompanist/permissions/MultiplePermissionsState;"
        }
    .end annotation

    const-string v0, "permissions"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x79e0b87b

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    const/4 v1, 0x2

    and-int/2addr p4, v1

    if-eqz p4, :cond_0

    .line 45
    sget-object p1, Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$1;->INSTANCE:Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$1;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, -0x1

    const-string v2, "com.google.accompanist.permissions.rememberMutableMultiplePermissionsState (MutableMultiplePermissionsState.kt:45)"

    .line 46
    invoke-static {v0, p3, p4, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1
    const/16 p4, 0x8

    .line 48
    invoke-static {p0, p2, p4}, Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt;->rememberMutablePermissionsState(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    .line 50
    invoke-static {v0, v2, p2, p4, v1}, Lcom/google/accompanist/permissions/PermissionsUtilKt;->PermissionsLifecycleCheckerEffect(Ljava/util/List;Landroidx/lifecycle/Lifecycle$Event;Landroidx/compose/runtime/Composer;II)V

    const v1, -0x5e849b3f

    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 52
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p0

    .line 153
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez p0, :cond_2

    .line 154
    sget-object p0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p0

    if-ne v1, p0, :cond_3

    .line 53
    :cond_2
    new-instance v1, Lcom/google/accompanist/permissions/MutableMultiplePermissionsState;

    invoke-direct {v1, v0}, Lcom/google/accompanist/permissions/MutableMultiplePermissionsState;-><init>(Ljava/util/List;)V

    .line 156
    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 52
    :cond_3
    check-cast v1, Lcom/google/accompanist/permissions/MutableMultiplePermissionsState;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 58
    new-instance p0, Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;

    invoke-direct {p0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;-><init>()V

    check-cast p0, Landroidx/activity/result/contract/ActivityResultContract;

    const v0, -0x5e849a0d

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit8 v2, p3, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/16 v3, 0x20

    if-le v2, v3, :cond_4

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :cond_4
    and-int/lit8 p3, p3, 0x30

    if-ne p3, v3, :cond_6

    :cond_5
    const/4 p3, 0x1

    goto :goto_0

    :cond_6
    const/4 p3, 0x0

    :goto_0
    or-int/2addr p3, v0

    .line 159
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_7

    .line 160
    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_8

    .line 59
    :cond_7
    new-instance p3, Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$launcher$1$1;

    invoke-direct {p3, v1, p1}, Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$launcher$1$1;-><init>(Lcom/google/accompanist/permissions/MutableMultiplePermissionsState;Lkotlin/jvm/functions/Function1;)V

    move-object v0, p3

    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 162
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 59
    :cond_8
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 57
    invoke-static {p0, v0, p2, p4}, Landroidx/activity/compose/ActivityResultRegistryKt;->rememberLauncherForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;

    move-result-object p0

    .line 63
    new-instance p1, Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2;

    invoke-direct {p1, v1, p0}, Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2;-><init>(Lcom/google/accompanist/permissions/MutableMultiplePermissionsState;Landroidx/activity/compose/ManagedActivityResultLauncher;)V

    check-cast p1, Lkotlin/jvm/functions/Function1;

    sget p3, Landroidx/activity/compose/ManagedActivityResultLauncher;->$stable:I

    shl-int/lit8 p3, p3, 0x3

    invoke-static {v1, p0, p1, p2, p3}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v1, Lcom/google/accompanist/permissions/MultiplePermissionsState;

    return-object v1
.end method

.method private static final rememberMutablePermissionsState(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Lcom/google/accompanist/permissions/MutablePermissionState;",
            ">;"
        }
    .end annotation

    const v0, 0x3b260d07

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.google.accompanist.permissions.rememberMutablePermissionsState (MutableMultiplePermissionsState.kt:76)"

    .line 77
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 79
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object p2

    check-cast p2, Landroidx/compose/runtime/CompositionLocal;

    const v0, 0x789c5f52

    const-string v1, "CC:CompositionLocal.kt#9igjgp"

    .line 165
    invoke-static {p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 79
    check-cast p2, Landroid/content/Context;

    .line 80
    invoke-static {p2}, Lcom/google/accompanist/permissions/PermissionsUtilKt;->findActivity(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    const v1, -0x56e8e7f2

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 81
    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    .line 166
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    .line 167
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_3

    .line 82
    :cond_1
    check-cast p0, Ljava/lang/Iterable;

    .line 169
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 170
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 171
    check-cast v2, Ljava/lang/String;

    .line 82
    new-instance v3, Lcom/google/accompanist/permissions/MutablePermissionState;

    invoke-direct {v3, v2, p2, v0}, Lcom/google/accompanist/permissions/MutablePermissionState;-><init>(Ljava/lang/String;Landroid/content/Context;Landroid/app/Activity;)V

    .line 171
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 172
    :cond_2
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    .line 173
    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 81
    :cond_3
    check-cast v2, Ljava/util/List;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 85
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/accompanist/permissions/MutablePermissionState;

    const v0, -0x56e8e70c

    .line 86
    invoke-virtual {p2}, Lcom/google/accompanist/permissions/MutablePermissionState;->getPermission()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->startMovableGroup(ILjava/lang/Object;)V

    .line 89
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    const v1, -0x56e8e61c

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    .line 176
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_4

    .line 177
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_5

    .line 90
    :cond_4
    new-instance v1, Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$launcher$1$1;

    invoke-direct {v1, p2}, Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$launcher$1$1;-><init>(Lcom/google/accompanist/permissions/MutablePermissionState;)V

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 179
    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 90
    :cond_5
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const/16 v1, 0x8

    .line 88
    invoke-static {v0, v3, p1, v1}, Landroidx/activity/compose/ActivityResultRegistryKt;->rememberLauncherForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;

    move-result-object v0

    .line 93
    new-instance v1, Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1;

    invoke-direct {v1, p2, v0}, Lcom/google/accompanist/permissions/MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1;-><init>(Lcom/google/accompanist/permissions/MutablePermissionState;Landroidx/activity/compose/ManagedActivityResultLauncher;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget p2, Landroidx/activity/compose/ManagedActivityResultLauncher;->$stable:I

    invoke-static {v0, v1, p1, p2}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endMovableGroup()V

    goto :goto_1

    :cond_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    return-object v2
.end method
