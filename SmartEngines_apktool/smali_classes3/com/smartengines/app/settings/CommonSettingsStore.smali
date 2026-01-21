.class public final Lcom/smartengines/app/settings/CommonSettingsStore;
.super Lcom/smartengines/app/settings/SettingsStore;
.source "CommonSettings.kt"

# interfaces
.implements Lcom/smartengines/app/settings/CommonSettingWriter;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCommonSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonSettings.kt\ncom/smartengines/app/settings/CommonSettingsStore\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,111:1\n53#2:112\n55#2:116\n50#3:113\n55#3:115\n107#4:114\n*S KotlinDebug\n*F\n+ 1 CommonSettings.kt\ncom/smartengines/app/settings/CommonSettingsStore\n*L\n87#1:112\n87#1:116\n87#1:113\n87#1:115\n87#1:114\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006 "
    }
    d2 = {
        "Lcom/smartengines/app/settings/CommonSettingsStore;",
        "Lcom/smartengines/app/settings/SettingsStore;",
        "Lcom/smartengines/app/settings/CommonSettingWriter;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "data",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/smartengines/app/settings/CommonSettings;",
        "getData",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "writeExtendedMode",
        "",
        "value",
        "",
        "writeTutorialShown",
        "writeEulaVersion",
        "",
        "writeDarkTheme",
        "writeShowQuads",
        "writeResultPreview",
        "writeAlwaysAccepted",
        "writeSavePhoto",
        "writeSaveVideo",
        "writeLivenessIntro",
        "writeSessionTimeout",
        "",
        "writeMultiThreading",
        "writeComputeMetrics",
        "writeIgnoreTerminal",
        "writeEnableStoppers",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final data:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/smartengines/app/settings/CommonSettings;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    invoke-static {p1}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getCommonDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/smartengines/app/settings/SettingsStore;-><init>(Landroidx/datastore/core/DataStore;)V

    .line 86
    invoke-virtual {p0}, Lcom/smartengines/app/settings/CommonSettingsStore;->getDataStore()Landroidx/datastore/core/DataStore;

    move-result-object p1

    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    .line 114
    new-instance v0, Lcom/smartengines/app/settings/CommonSettingsStore$special$$inlined$map$1;

    invoke-direct {v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore$special$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    .line 89
    invoke-virtual {p0}, Lcom/smartengines/app/settings/CommonSettingsStore;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object p1

    .line 90
    sget-object v1, Lkotlinx/coroutines/flow/SharingStarted;->Companion:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    invoke-virtual {v1}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->getEagerly()Lkotlinx/coroutines/flow/SharingStarted;

    move-result-object v1

    .line 91
    new-instance v2, Lcom/smartengines/app/settings/CommonSettings;

    invoke-static {}, Landroidx/datastore/preferences/core/PreferencesFactory;->createEmpty()Landroidx/datastore/preferences/core/Preferences;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/smartengines/app/settings/CommonSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;)V

    .line 88
    invoke-static {v0, p1, v1, v2}, Lkotlinx/coroutines/flow/FlowKt;->stateIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/app/settings/CommonSettingsStore;->data:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method


# virtual methods
.method public final getData()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/smartengines/app/settings/CommonSettings;",
            ">;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/smartengines/app/settings/CommonSettingsStore;->data:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public writeAlwaysAccepted(Z)V
    .locals 1

    .line 100
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getALWAYS_ACCEPTED$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeComputeMetrics(Z)V
    .locals 1

    .line 106
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getCOMPUTE_METRICS$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeDarkTheme(Z)V
    .locals 1

    .line 97
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getDARK_THEME$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeEnableStoppers(Z)V
    .locals 1

    .line 108
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getENABLE_STOPPERS$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeEulaVersion(J)V
    .locals 1

    .line 96
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getEULA_VERSION$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeExtendedMode(Z)V
    .locals 1

    .line 94
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getEXTENDED_MODE$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeIgnoreTerminal(Z)V
    .locals 1

    .line 107
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getIGNORE_TERMINAL$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeLivenessIntro(Z)V
    .locals 1

    .line 103
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getLIVENESS_INTRO$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeMultiThreading(Z)V
    .locals 1

    .line 105
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getMULTI_THREADING$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeResultPreview(Z)V
    .locals 1

    .line 99
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getRESULT_PREVIEW$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeSavePhoto(Z)V
    .locals 1

    .line 101
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getSAVE_PHOTO$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeSaveVideo(Z)V
    .locals 1

    .line 102
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getSAVE_VIDEO$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeSessionTimeout(I)V
    .locals 1

    .line 104
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getSESSION_TIMEOUT$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeShowQuads(Z)V
    .locals 1

    .line 98
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getSHOW_QUADS$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeTutorialShown(Z)V
    .locals 1

    .line 95
    invoke-static {}, Lcom/smartengines/app/settings/CommonSettingsKt;->access$getTUTORIAL_SHOWN$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/CommonSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method
