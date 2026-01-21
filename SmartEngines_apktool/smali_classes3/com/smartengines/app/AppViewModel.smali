.class public final Lcom/smartengines/app/AppViewModel;
.super Ljava/lang/Object;
.source "AppViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAppViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppViewModel.kt\ncom/smartengines/app/AppViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,86:1\n81#2:87\n107#2,2:88\n81#2:90\n107#2,2:91\n81#2:93\n107#2,2:94\n81#2:96\n107#2,2:97\n81#2:99\n107#2,2:100\n81#2:102\n107#2,2:103\n81#2:105\n107#2,2:106\n81#2:108\n107#2,2:109\n*S KotlinDebug\n*F\n+ 1 AppViewModel.kt\ncom/smartengines/app/AppViewModel\n*L\n14#1:87\n14#1:88,2\n15#1:90\n15#1:91,2\n16#1:93\n16#1:94,2\n17#1:96\n17#1:97,2\n18#1:99\n18#1:100,2\n19#1:102\n19#1:103,2\n21#1:105\n21#1:106,2\n29#1:108\n29#1:109,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0003\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010@\u001a\u000209H\u0002J\u000e\u0010A\u001a\u00020\u00172\u0006\u0010B\u001a\u00020CJ\u0006\u0010D\u001a\u00020\u0005R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR+\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u000c\u001a\u0004\u0008\u000e\u0010\u0008\"\u0004\u0008\u000f\u0010\nR+\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u000c\u001a\u0004\u0008\u0012\u0010\u0008\"\u0004\u0008\u0013\u0010\nRG\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u000c\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR+\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008!\u0010\u000c\u001a\u0004\u0008\u001f\u0010\u0008\"\u0004\u0008 \u0010\nR+\u0010\"\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008%\u0010\u000c\u001a\u0004\u0008#\u0010\u0008\"\u0004\u0008$\u0010\nR/\u0010\'\u001a\u0004\u0018\u00010&2\u0008\u0010\u0004\u001a\u0004\u0018\u00010&8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008,\u0010\u000c\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R+\u0010:\u001a\u0002092\u0006\u0010\u0004\u001a\u0002098F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008?\u0010\u000c\u001a\u0004\u0008;\u0010<\"\u0004\u0008=\u0010>\u00a8\u0006E"
    }
    d2 = {
        "Lcom/smartengines/app/AppViewModel;",
        "",
        "<init>",
        "()V",
        "<set-?>",
        "",
        "showExit",
        "getShowExit",
        "()Z",
        "setShowExit",
        "(Z)V",
        "showExit$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "showInfo",
        "getShowInfo",
        "setShowInfo",
        "showInfo$delegate",
        "showTestErrors",
        "getShowTestErrors",
        "setShowTestErrors",
        "showTestErrors$delegate",
        "Lkotlin/Function1;",
        "Lcom/smartengines/app/Photo;",
        "",
        "onPhotoTaken",
        "getOnPhotoTaken",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnPhotoTaken",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onPhotoTaken$delegate",
        "showSettings",
        "getShowSettings",
        "setShowSettings",
        "showSettings$delegate",
        "showSessionSettings",
        "getShowSessionSettings",
        "setShowSessionSettings",
        "showSessionSettings$delegate",
        "Lcom/smartengines/app/FacesModel2;",
        "facesModel",
        "getFacesModel",
        "()Lcom/smartengines/app/FacesModel2;",
        "setFacesModel",
        "(Lcom/smartengines/app/FacesModel2;)V",
        "facesModel$delegate",
        "selectedGroup",
        "Lcom/smartengines/app/ui/TargetsViewModel;",
        "getSelectedGroup",
        "()Lcom/smartengines/app/ui/TargetsViewModel;",
        "setSelectedGroup",
        "(Lcom/smartengines/app/ui/TargetsViewModel;)V",
        "selectedLeaf",
        "Lcom/smartengines/app/targets/TreeLeaf;",
        "getSelectedLeaf",
        "()Lcom/smartengines/app/targets/TreeLeaf;",
        "setSelectedLeaf",
        "(Lcom/smartengines/app/targets/TreeLeaf;)V",
        "Lcom/smartengines/app/ui/MainRoute;",
        "mainRoute",
        "getMainRoute",
        "()Lcom/smartengines/app/ui/MainRoute;",
        "setMainRoute",
        "(Lcom/smartengines/app/ui/MainRoute;)V",
        "mainRoute$delegate",
        "calculateMainRoute",
        "onNodeClick",
        "node",
        "Lcom/smartengines/app/targets/TreeItem;",
        "onBack",
        "app_storeRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/smartengines/app/AppViewModel;

.field private static final facesModel$delegate:Landroidx/compose/runtime/MutableState;

.field private static final mainRoute$delegate:Landroidx/compose/runtime/MutableState;

.field private static final onPhotoTaken$delegate:Landroidx/compose/runtime/MutableState;

.field private static selectedGroup:Lcom/smartengines/app/ui/TargetsViewModel;

.field private static selectedLeaf:Lcom/smartengines/app/targets/TreeLeaf;

.field private static final showExit$delegate:Landroidx/compose/runtime/MutableState;

.field private static final showInfo$delegate:Landroidx/compose/runtime/MutableState;

.field private static final showSessionSettings$delegate:Landroidx/compose/runtime/MutableState;

.field private static final showSettings$delegate:Landroidx/compose/runtime/MutableState;

.field private static final showTestErrors$delegate:Landroidx/compose/runtime/MutableState;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/smartengines/app/AppViewModel;

    invoke-direct {v0}, Lcom/smartengines/app/AppViewModel;-><init>()V

    sput-object v0, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    const/4 v1, 0x0

    .line 14
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    sput-object v4, Lcom/smartengines/app/AppViewModel;->showExit$delegate:Landroidx/compose/runtime/MutableState;

    .line 15
    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    sput-object v4, Lcom/smartengines/app/AppViewModel;->showInfo$delegate:Landroidx/compose/runtime/MutableState;

    .line 16
    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    sput-object v4, Lcom/smartengines/app/AppViewModel;->showTestErrors$delegate:Landroidx/compose/runtime/MutableState;

    .line 17
    invoke-static {v2, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    sput-object v4, Lcom/smartengines/app/AppViewModel;->onPhotoTaken$delegate:Landroidx/compose/runtime/MutableState;

    .line 18
    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    sput-object v4, Lcom/smartengines/app/AppViewModel;->showSettings$delegate:Landroidx/compose/runtime/MutableState;

    .line 19
    invoke-static {v1, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    sput-object v1, Lcom/smartengines/app/AppViewModel;->showSessionSettings$delegate:Landroidx/compose/runtime/MutableState;

    .line 21
    invoke-static {v2, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v1

    sput-object v1, Lcom/smartengines/app/AppViewModel;->facesModel$delegate:Landroidx/compose/runtime/MutableState;

    .line 29
    invoke-direct {v0}, Lcom/smartengines/app/AppViewModel;->calculateMainRoute()Lcom/smartengines/app/ui/MainRoute;

    move-result-object v0

    invoke-static {v0, v2, v3, v2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    sput-object v0, Lcom/smartengines/app/AppViewModel;->mainRoute$delegate:Landroidx/compose/runtime/MutableState;

    const/16 v0, 0x8

    sput v0, Lcom/smartengines/app/AppViewModel;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final calculateMainRoute()Lcom/smartengines/app/ui/MainRoute;
    .locals 2

    .line 38
    sget-object v0, Lcom/smartengines/app/AppViewModel;->selectedLeaf:Lcom/smartengines/app/targets/TreeLeaf;

    if-eqz v0, :cond_0

    .line 34
    new-instance v1, Lcom/smartengines/app/ui/MainRoute$TargetProcessing;

    invoke-direct {v1, v0}, Lcom/smartengines/app/ui/MainRoute$TargetProcessing;-><init>(Lcom/smartengines/app/targets/TreeLeaf;)V

    check-cast v1, Lcom/smartengines/app/ui/MainRoute;

    return-object v1

    .line 38
    :cond_0
    sget-object v0, Lcom/smartengines/app/AppViewModel;->selectedGroup:Lcom/smartengines/app/ui/TargetsViewModel;

    if-eqz v0, :cond_1

    .line 39
    new-instance v1, Lcom/smartengines/app/ui/MainRoute$TargetList;

    invoke-direct {v1, v0}, Lcom/smartengines/app/ui/MainRoute$TargetList;-><init>(Lcom/smartengines/app/ui/TargetsViewModel;)V

    check-cast v1, Lcom/smartengines/app/ui/MainRoute;

    return-object v1

    .line 43
    :cond_1
    sget-object v0, Lcom/smartengines/app/ui/MainRoute$Home;->INSTANCE:Lcom/smartengines/app/ui/MainRoute$Home;

    check-cast v0, Lcom/smartengines/app/ui/MainRoute;

    return-object v0
.end method


# virtual methods
.method public final getFacesModel()Lcom/smartengines/app/FacesModel2;
    .locals 1

    .line 21
    sget-object v0, Lcom/smartengines/app/AppViewModel;->facesModel$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 105
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/app/FacesModel2;

    return-object v0
.end method

.method public final getMainRoute()Lcom/smartengines/app/ui/MainRoute;
    .locals 1

    .line 29
    sget-object v0, Lcom/smartengines/app/AppViewModel;->mainRoute$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 108
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/app/ui/MainRoute;

    return-object v0
.end method

.method public final getOnPhotoTaken()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/smartengines/app/Photo;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 17
    sget-object v0, Lcom/smartengines/app/AppViewModel;->onPhotoTaken$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 96
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getSelectedGroup()Lcom/smartengines/app/ui/TargetsViewModel;
    .locals 1

    .line 26
    sget-object v0, Lcom/smartengines/app/AppViewModel;->selectedGroup:Lcom/smartengines/app/ui/TargetsViewModel;

    return-object v0
.end method

.method public final getSelectedLeaf()Lcom/smartengines/app/targets/TreeLeaf;
    .locals 1

    .line 27
    sget-object v0, Lcom/smartengines/app/AppViewModel;->selectedLeaf:Lcom/smartengines/app/targets/TreeLeaf;

    return-object v0
.end method

.method public final getShowExit()Z
    .locals 1

    .line 14
    sget-object v0, Lcom/smartengines/app/AppViewModel;->showExit$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 87
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getShowInfo()Z
    .locals 1

    .line 15
    sget-object v0, Lcom/smartengines/app/AppViewModel;->showInfo$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 90
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getShowSessionSettings()Z
    .locals 1

    .line 19
    sget-object v0, Lcom/smartengines/app/AppViewModel;->showSessionSettings$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 102
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getShowSettings()Z
    .locals 1

    .line 18
    sget-object v0, Lcom/smartengines/app/AppViewModel;->showSettings$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 99
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getShowTestErrors()Z
    .locals 1

    .line 16
    sget-object v0, Lcom/smartengines/app/AppViewModel;->showTestErrors$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .line 93
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final onBack()Z
    .locals 3

    .line 77
    invoke-virtual {p0}, Lcom/smartengines/app/AppViewModel;->getFacesModel()Lcom/smartengines/app/FacesModel2;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 66
    sget-object v0, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    invoke-virtual {v0, v2}, Lcom/smartengines/app/AppViewModel;->setFacesModel(Lcom/smartengines/app/FacesModel2;)V

    .line 67
    invoke-direct {v0}, Lcom/smartengines/app/AppViewModel;->calculateMainRoute()Lcom/smartengines/app/ui/MainRoute;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/smartengines/app/AppViewModel;->setMainRoute(Lcom/smartengines/app/ui/MainRoute;)V

    return v1

    .line 71
    :cond_0
    sget-object v0, Lcom/smartengines/app/AppViewModel;->selectedLeaf:Lcom/smartengines/app/targets/TreeLeaf;

    if-eqz v0, :cond_1

    .line 72
    sget-object v0, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    sput-object v2, Lcom/smartengines/app/AppViewModel;->selectedLeaf:Lcom/smartengines/app/targets/TreeLeaf;

    .line 73
    invoke-direct {v0}, Lcom/smartengines/app/AppViewModel;->calculateMainRoute()Lcom/smartengines/app/ui/MainRoute;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/smartengines/app/AppViewModel;->setMainRoute(Lcom/smartengines/app/ui/MainRoute;)V

    return v1

    .line 77
    :cond_1
    sget-object v0, Lcom/smartengines/app/AppViewModel;->selectedGroup:Lcom/smartengines/app/ui/TargetsViewModel;

    if-eqz v0, :cond_2

    .line 78
    sget-object v0, Lcom/smartengines/app/AppViewModel;->INSTANCE:Lcom/smartengines/app/AppViewModel;

    sput-object v2, Lcom/smartengines/app/AppViewModel;->selectedGroup:Lcom/smartengines/app/ui/TargetsViewModel;

    .line 79
    invoke-direct {v0}, Lcom/smartengines/app/AppViewModel;->calculateMainRoute()Lcom/smartengines/app/ui/MainRoute;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/smartengines/app/AppViewModel;->setMainRoute(Lcom/smartengines/app/ui/MainRoute;)V

    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final onNodeClick(Lcom/smartengines/app/targets/TreeItem;)V
    .locals 2

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    instance-of v0, p1, Lcom/smartengines/app/targets/TreeLeaf;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/smartengines/app/targets/TreeLeaf;

    invoke-virtual {v1}, Lcom/smartengines/app/targets/TreeLeaf;->getTarget()Lcom/smartengines/engine/RecognitionTarget;

    move-result-object v1

    instance-of v1, v1, Lcom/smartengines/targets/FacesTarget;

    if-eqz v1, :cond_0

    .line 49
    new-instance p1, Lcom/smartengines/app/FacesModel2;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/smartengines/app/FacesModel2;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, p1}, Lcom/smartengines/app/AppViewModel;->setFacesModel(Lcom/smartengines/app/FacesModel2;)V

    return-void

    .line 53
    :cond_0
    instance-of v1, p1, Lcom/smartengines/app/targets/TreeGroup;

    if-eqz v1, :cond_1

    new-instance v0, Lcom/smartengines/app/ui/TargetsViewModel;

    check-cast p1, Lcom/smartengines/app/targets/TreeGroup;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/TargetsViewModel;-><init>(Lcom/smartengines/app/targets/TreeGroup;)V

    sput-object v0, Lcom/smartengines/app/AppViewModel;->selectedGroup:Lcom/smartengines/app/ui/TargetsViewModel;

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 54
    check-cast p1, Lcom/smartengines/app/targets/TreeLeaf;

    sput-object p1, Lcom/smartengines/app/AppViewModel;->selectedLeaf:Lcom/smartengines/app/targets/TreeLeaf;

    .line 56
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/smartengines/app/AppViewModel;->calculateMainRoute()Lcom/smartengines/app/ui/MainRoute;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/smartengines/app/AppViewModel;->setMainRoute(Lcom/smartengines/app/ui/MainRoute;)V

    return-void
.end method

.method public final setFacesModel(Lcom/smartengines/app/FacesModel2;)V
    .locals 1

    .line 21
    sget-object v0, Lcom/smartengines/app/AppViewModel;->facesModel$delegate:Landroidx/compose/runtime/MutableState;

    .line 106
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setMainRoute(Lcom/smartengines/app/ui/MainRoute;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    sget-object v0, Lcom/smartengines/app/AppViewModel;->mainRoute$delegate:Landroidx/compose/runtime/MutableState;

    .line 109
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setOnPhotoTaken(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/smartengines/app/Photo;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 17
    sget-object v0, Lcom/smartengines/app/AppViewModel;->onPhotoTaken$delegate:Landroidx/compose/runtime/MutableState;

    .line 97
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setSelectedGroup(Lcom/smartengines/app/ui/TargetsViewModel;)V
    .locals 0

    .line 26
    sput-object p1, Lcom/smartengines/app/AppViewModel;->selectedGroup:Lcom/smartengines/app/ui/TargetsViewModel;

    return-void
.end method

.method public final setSelectedLeaf(Lcom/smartengines/app/targets/TreeLeaf;)V
    .locals 0

    .line 27
    sput-object p1, Lcom/smartengines/app/AppViewModel;->selectedLeaf:Lcom/smartengines/app/targets/TreeLeaf;

    return-void
.end method

.method public final setShowExit(Z)V
    .locals 1

    .line 14
    sget-object v0, Lcom/smartengines/app/AppViewModel;->showExit$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 88
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setShowInfo(Z)V
    .locals 1

    .line 15
    sget-object v0, Lcom/smartengines/app/AppViewModel;->showInfo$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 91
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setShowSessionSettings(Z)V
    .locals 1

    .line 19
    sget-object v0, Lcom/smartengines/app/AppViewModel;->showSessionSettings$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 103
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setShowSettings(Z)V
    .locals 1

    .line 18
    sget-object v0, Lcom/smartengines/app/AppViewModel;->showSettings$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 100
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setShowTestErrors(Z)V
    .locals 1

    .line 16
    sget-object v0, Lcom/smartengines/app/AppViewModel;->showTestErrors$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 94
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    return-void
.end method
