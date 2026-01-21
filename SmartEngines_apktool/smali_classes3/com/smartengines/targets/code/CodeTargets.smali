.class public final Lcom/smartengines/targets/code/CodeTargets;
.super Ljava/lang/Object;
.source "CodeTargets.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/targets/code/CodeTargets$BankCard;,
        Lcom/smartengines/targets/code/CodeTargets$Barcode;,
        Lcom/smartengines/targets/code/CodeTargets$BarcodePayment;,
        Lcom/smartengines/targets/code/CodeTargets$BarcodeSession;,
        Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;,
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;,
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLineBankAccount;,
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLineBic;,
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLineCardNumber;,
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLineContainerNumber;,
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLineIban;,
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLineInn;,
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLineKpp;,
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLineMeters;,
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLineNumbers;,
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLinePhone;,
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLinePhoneCis;,
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLineVin;,
        Lcom/smartengines/targets/code/CodeTargets$Container;,
        Lcom/smartengines/targets/code/CodeTargets$LicensePlate;,
        Lcom/smartengines/targets/code/CodeTargets$LicensePlateAre;,
        Lcom/smartengines/targets/code/CodeTargets$Mrz;,
        Lcom/smartengines/targets/code/CodeTargets$PaymentDetails;,
        Lcom/smartengines/targets/code/CodeTargets$UniversalPay;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCodeTargets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeTargets.kt\ncom/smartengines/targets/code/CodeTargets\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,493:1\n1863#2,2:494\n1863#2,2:496\n1863#2,2:498\n*S KotlinDebug\n*F\n+ 1 CodeTargets.kt\ncom/smartengines/targets/code/CodeTargets\n*L\n56#1:494,2\n85#1:496,2\n96#1:498,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\"\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0018 !\"#$%&\'()*+,-./01234567B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0012J\u0018\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0002J\"\u0010\u0018\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00122\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\"\u0010\u001b\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00122\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u001c\u0010\u001d\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u00068"
    }
    d2 = {
        "Lcom/smartengines/targets/code/CodeTargets;",
        "",
        "<init>",
        "()V",
        "sessionOptions",
        "Lcom/smartengines/targets/code/CodeSessionOptions;",
        "getSessionOptions",
        "()Lcom/smartengines/targets/code/CodeSessionOptions;",
        "setSessionOptions",
        "(Lcom/smartengines/targets/code/CodeSessionOptions;)V",
        "sessionSettingsLogger",
        "Lcom/smartengines/engine/SessionSettingsLogger;",
        "getSessionSettingsLogger",
        "()Lcom/smartengines/engine/SessionSettingsLogger;",
        "setSessionSettingsLogger",
        "(Lcom/smartengines/engine/SessionSettingsLogger;)V",
        "loadEngineSupportedTypes",
        "",
        "",
        "engine",
        "setGlobalOptions",
        "",
        "Lcom/smartengines/code/CodeEngineSessionSettings;",
        "sessionTimeout",
        "fillEngineSupportedTypesByDisabled",
        "internalEngine",
        "disabledTypes",
        "fillEngineSupportedTypesByAllowed",
        "allowedTypes",
        "setOption",
        "key",
        "value",
        "CodeTargetBase",
        "BankCard",
        "Barcode",
        "BarcodeSession",
        "BarcodePayment",
        "PaymentDetails",
        "LicensePlate",
        "LicensePlateAre",
        "CodeTextLine",
        "CodeTextLineNumbers",
        "CodeTextLineMeters",
        "CodeTextLineIban",
        "CodeTextLinePhone",
        "CodeTextLinePhoneCis",
        "CodeTextLineCardNumber",
        "CodeTextLineInn",
        "CodeTextLineKpp",
        "CodeTextLineBic",
        "CodeTextLineVin",
        "CodeTextLineBankAccount",
        "CodeTextLineContainerNumber",
        "Mrz",
        "UniversalPay",
        "Container",
        "targets_release"
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
.field public static final INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

.field public static sessionOptions:Lcom/smartengines/targets/code/CodeSessionOptions;

.field private static sessionSettingsLogger:Lcom/smartengines/engine/SessionSettingsLogger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/targets/code/CodeTargets;

    invoke-direct {v0}, Lcom/smartengines/targets/code/CodeTargets;-><init>()V

    sput-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$fillEngineSupportedTypesByAllowed(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/util/Set;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2, p3}, Lcom/smartengines/targets/code/CodeTargets;->fillEngineSupportedTypesByAllowed(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/util/Set;)V

    return-void
.end method

.method public static final synthetic access$fillEngineSupportedTypesByDisabled(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/util/Set;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2, p3}, Lcom/smartengines/targets/code/CodeTargets;->fillEngineSupportedTypesByDisabled(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/util/Set;)V

    return-void
.end method

.method public static final synthetic access$setGlobalOptions(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/smartengines/targets/code/CodeTargets;->setGlobalOptions(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2, p3}, Lcom/smartengines/targets/code/CodeTargets;->setOption(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final fillEngineSupportedTypesByAllowed(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/util/Set;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/code/CodeEngineSessionSettings;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 96
    invoke-virtual {p0, p2}, Lcom/smartengines/targets/code/CodeTargets;->loadEngineSupportedTypes(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 498
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 97
    sget-object v2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    .line 98
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/16 v4, 0x2e

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ".enabled"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 99
    invoke-interface {p3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string/jumbo v1, "true"

    goto :goto_1

    :cond_0
    const-string v1, "false"

    .line 97
    :goto_1
    invoke-direct {v2, p1, v3, v1}, Lcom/smartengines/targets/code/CodeTargets;->setOption(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final fillEngineSupportedTypesByDisabled(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/util/Set;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/code/CodeEngineSessionSettings;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 85
    invoke-virtual {p0, p2}, Lcom/smartengines/targets/code/CodeTargets;->loadEngineSupportedTypes(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 496
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 86
    sget-object v2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    .line 87
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/16 v4, 0x2e

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ".enabled"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 88
    invoke-interface {p3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "false"

    goto :goto_1

    :cond_0
    const-string/jumbo v1, "true"

    .line 86
    :goto_1
    invoke-direct {v2, p1, v3, v1}, Lcom/smartengines/targets/code/CodeTargets;->setOption(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final setGlobalOptions(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;)V
    .locals 3

    .line 73
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object v0

    invoke-interface {v0}, Lcom/smartengines/targets/TargetSettings;->getCommon()Lcom/smartengines/targets/CommonSettings;

    move-result-object v0

    .line 74
    sget-object v1, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    if-nez p2, :cond_0

    .line 75
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Lcom/smartengines/targets/CommonSettings;->getSessionTimeout()I

    move-result v2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v2, ".0"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 74
    :cond_0
    const-string v2, "global.sessionTimeout"

    invoke-direct {v1, p1, v2, p2}, Lcom/smartengines/targets/code/CodeTargets;->setOption(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    invoke-interface {v0}, Lcom/smartengines/targets/CommonSettings;->getMultiThreading()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p2

    const-string v2, "global.enableMultiThreading"

    invoke-direct {v1, p1, v2, p2}, Lcom/smartengines/targets/code/CodeTargets;->setOption(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    invoke-interface {v0}, Lcom/smartengines/targets/CommonSettings;->getComputeMetrics()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p2

    const-string v0, "_computeMetrics"

    invoke-direct {v1, p1, v0, p2}, Lcom/smartengines/targets/code/CodeTargets;->setOption(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic setGlobalOptions$default(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 71
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/smartengines/targets/code/CodeTargets;->setGlobalOptions(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;)V

    return-void
.end method

.method private final setOption(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 465
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "      - SetOption: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " >>> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.CodeTarget"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 467
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->sessionSettingsLogger:Lcom/smartengines/engine/SessionSettingsLogger;

    if-eqz v0, :cond_0

    .line 468
    new-instance v1, Lcom/smartengines/engine/SessionSettingsLogger$Action;

    const/4 v2, 0x2

    .line 470
    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const/4 v3, 0x1

    aput-object p3, v2, v3

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 468
    const-string v3, "SetOption"

    invoke-direct {v1, v3, v2}, Lcom/smartengines/engine/SessionSettingsLogger$Action;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 467
    invoke-interface {v0, v1}, Lcom/smartengines/engine/SessionSettingsLogger;->logAction(Lcom/smartengines/engine/SessionSettingsLogger$Action;)V

    .line 474
    :cond_0
    invoke-virtual {p1, p2, p3}, Lcom/smartengines/code/CodeEngineSessionSettings;->SetOption(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getSessionOptions()Lcom/smartengines/targets/code/CodeSessionOptions;
    .locals 1

    .line 46
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->sessionOptions:Lcom/smartengines/targets/code/CodeSessionOptions;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sessionOptions"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSessionSettingsLogger()Lcom/smartengines/engine/SessionSettingsLogger;
    .locals 1

    .line 48
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->sessionSettingsLogger:Lcom/smartengines/engine/SessionSettingsLogger;

    return-object v0
.end method

.method public final loadEngineSupportedTypes(Ljava/lang/String;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 56
    sget-object v1, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    invoke-virtual {v1}, Lcom/smartengines/targets/code/CodeTargets;->getSessionOptions()Lcom/smartengines/targets/code/CodeSessionOptions;

    move-result-object v1

    invoke-virtual {v1}, Lcom/smartengines/targets/code/CodeSessionOptions;->getInternalEngines()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/smartengines/targets/code/CodeSessionOptions$InternalEngine;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/smartengines/targets/code/CodeSessionOptions$InternalEngine;->getSubtypes()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Iterable;

    .line 494
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/targets/code/CodeSessionOptions$Option;

    .line 58
    invoke-virtual {v1}, Lcom/smartengines/targets/code/CodeSessionOptions$Option;->getSubkeys()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 55
    :cond_0
    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public final setSessionOptions(Lcom/smartengines/targets/code/CodeSessionOptions;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    sput-object p1, Lcom/smartengines/targets/code/CodeTargets;->sessionOptions:Lcom/smartengines/targets/code/CodeSessionOptions;

    return-void
.end method

.method public final setSessionSettingsLogger(Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 0

    .line 48
    sput-object p1, Lcom/smartengines/targets/code/CodeTargets;->sessionSettingsLogger:Lcom/smartengines/engine/SessionSettingsLogger;

    return-void
.end method
