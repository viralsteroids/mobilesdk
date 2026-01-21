.class public final Lcom/smartengines/app/settings/TextSettingsStore;
.super Lcom/smartengines/app/settings/SettingsStore;
.source "TextSettings.kt"

# interfaces
.implements Lcom/smartengines/app/settings/TextSettingsWriter;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextSettings.kt\ncom/smartengines/app/settings/TextSettingsStore\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,54:1\n53#2:55\n55#2:59\n50#3:56\n55#3:58\n107#4:57\n*S KotlinDebug\n*F\n+ 1 TextSettings.kt\ncom/smartengines/app/settings/TextSettingsStore\n*L\n45#1:55\n45#1:59\n45#1:56\n45#1:58\n45#1:57\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0016\u0010\u000c\u001a\u00020\r2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0012H\u0016R\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/smartengines/app/settings/TextSettingsStore;",
        "Lcom/smartengines/app/settings/SettingsStore;",
        "Lcom/smartengines/app/settings/TextSettingsWriter;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "data",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/smartengines/app/settings/TextSettings;",
        "getData",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "writeLanguages",
        "",
        "value",
        "",
        "",
        "writePageDetection",
        "",
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
            "Lcom/smartengines/app/settings/TextSettings;",
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

    .line 42
    invoke-static {p1}, Lcom/smartengines/app/settings/TextSettingsKt;->access$getTextDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/smartengines/app/settings/SettingsStore;-><init>(Landroidx/datastore/core/DataStore;)V

    .line 44
    invoke-virtual {p0}, Lcom/smartengines/app/settings/TextSettingsStore;->getDataStore()Landroidx/datastore/core/DataStore;

    move-result-object p1

    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    .line 57
    new-instance v0, Lcom/smartengines/app/settings/TextSettingsStore$special$$inlined$map$1;

    invoke-direct {v0, p1}, Lcom/smartengines/app/settings/TextSettingsStore$special$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    .line 47
    invoke-virtual {p0}, Lcom/smartengines/app/settings/TextSettingsStore;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object p1

    .line 48
    sget-object v1, Lkotlinx/coroutines/flow/SharingStarted;->Companion:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    invoke-virtual {v1}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->getEagerly()Lkotlinx/coroutines/flow/SharingStarted;

    move-result-object v1

    .line 49
    new-instance v2, Lcom/smartengines/app/settings/TextSettings;

    invoke-static {}, Landroidx/datastore/preferences/core/PreferencesFactory;->createEmpty()Landroidx/datastore/preferences/core/Preferences;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/smartengines/app/settings/TextSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;)V

    .line 46
    invoke-static {v0, p1, v1, v2}, Lkotlinx/coroutines/flow/FlowKt;->stateIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/app/settings/TextSettingsStore;->data:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method


# virtual methods
.method public final getData()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/smartengines/app/settings/TextSettings;",
            ">;"
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/smartengines/app/settings/TextSettingsStore;->data:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public writeLanguages(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-static {}, Lcom/smartengines/app/settings/TextSettingsKt;->access$getLANGUAGES$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/TextSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method

.method public writePageDetection(Z)V
    .locals 1

    .line 53
    invoke-static {}, Lcom/smartengines/app/settings/TextSettingsKt;->access$getPAGE_DETECTION$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/smartengines/app/settings/TextSettingsStore;->writeValue(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V

    return-void
.end method
