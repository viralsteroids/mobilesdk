.class public final Lcom/smartengines/app/settings/IdSettingsStore;
.super Lcom/smartengines/app/settings/SettingsStore;
.source "IdSettings.kt"

# interfaces
.implements Lcom/smartengines/app/settings/IdSettingsWriter;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIdSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdSettings.kt\ncom/smartengines/app/settings/IdSettingsStore\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,116:1\n53#2:117\n55#2:121\n50#3:118\n55#3:120\n107#4:119\n*S KotlinDebug\n*F\n+ 1 IdSettings.kt\ncom/smartengines/app/settings/IdSettingsStore\n*L\n91#1:117\n91#1:121\n91#1:118\n91#1:120\n91#1:119\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J\u0008\u0010\u0016\u001a\u00020\rH\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u001eH\u0016R\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006 "
    }
    d2 = {
        "Lcom/smartengines/app/settings/IdSettingsStore;",
        "Lcom/smartengines/app/settings/SettingsStore;",
        "Lcom/smartengines/app/settings/IdSettingsWriter;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "data",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/smartengines/app/settings/IdSettings;",
        "getData",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "writeVauthEnabled",
        "",
        "value",
        "",
        "writeEnableForensics",
        "writeMinInstrTime",
        "",
        "writeMaxInstrTime",
        "writeInstrCount",
        "writeInstrCountDelta",
        "resetInstrCountDelta",
        "writeInstrFailed",
        "writeAlwaysPass",
        "writeMinPassTime",
        "writeEnableVisualization",
        "writeFlashByDefault",
        "writeShowUndefChecks",
        "writeShowChecksFilter",
        "",
        "writeHideChecksFilter",
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
            "Lcom/smartengines/app/settings/IdSettings;",
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

    .line 88
    invoke-static {p1}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getIdDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/smartengines/app/settings/SettingsStore;-><init>(Landroidx/datastore/core/DataStore;)V

    .line 90
    invoke-virtual {p0}, Lcom/smartengines/app/settings/IdSettingsStore;->getDataStore()Landroidx/datastore/core/DataStore;

    move-result-object p1

    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    .line 119
    new-instance v0, Lcom/smartengines/app/settings/IdSettingsStore$special$$inlined$map$1;

    invoke-direct {v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore$special$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    .line 93
    invoke-virtual {p0}, Lcom/smartengines/app/settings/IdSettingsStore;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object p1

    .line 94
    sget-object v1, Lkotlinx/coroutines/flow/SharingStarted;->Companion:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    invoke-virtual {v1}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->getEagerly()Lkotlinx/coroutines/flow/SharingStarted;

    move-result-object v1

    .line 95
    new-instance v2, Lcom/smartengines/app/settings/IdSettings;

    invoke-static {}, Landroidx/datastore/preferences/core/PreferencesFactory;->createEmpty()Landroidx/datastore/preferences/core/Preferences;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/smartengines/app/settings/IdSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;)V

    .line 92
    invoke-static {v0, p1, v1, v2}, Lkotlinx/coroutines/flow/FlowKt;->stateIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/app/settings/IdSettingsStore;->data:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method


# virtual methods
.method public final getData()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/smartengines/app/settings/IdSettings;",
            ">;"
        }
    .end annotation

    .line 90
    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettingsStore;->data:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public resetInstrCountDelta()V
    .locals 2

    .line 104
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getINSTR_COUNT_DELTA$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeAlwaysPass(Z)V
    .locals 1

    .line 106
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getALWAYS_PASS$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeEnableForensics(Z)V
    .locals 1

    .line 99
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getENABLE_FORENSICS$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeEnableVisualization(Z)V
    .locals 1

    .line 108
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getENABLE_VISUAL$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeFlashByDefault(Z)V
    .locals 1

    .line 109
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getFLASH_BY_DEFAULT$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeHideChecksFilter(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getHIDE_CHECKS_FILTER$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeInstrCount(I)V
    .locals 1

    .line 102
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getINSTR_COUNT$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeInstrCountDelta(I)V
    .locals 1

    .line 103
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getINSTR_COUNT_DELTA$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeInstrFailed(I)V
    .locals 1

    .line 105
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getINSTR_FAILED$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeMaxInstrTime(I)V
    .locals 1

    .line 101
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getMAX_INSTR_TIME$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeMinInstrTime(I)V
    .locals 1

    .line 100
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getMIN_INSTR_TIME$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeMinPassTime(I)V
    .locals 1

    .line 107
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getMIN_PASS_TIME$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeShowChecksFilter(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getSHOW_CHECKS_FILTER$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeShowUndefChecks(Z)V
    .locals 1

    .line 110
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getSHOW_UNDEF_CHECKS$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writeVauthEnabled(Z)V
    .locals 1

    .line 98
    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getVAUTH_ENABLED$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/IdSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method
