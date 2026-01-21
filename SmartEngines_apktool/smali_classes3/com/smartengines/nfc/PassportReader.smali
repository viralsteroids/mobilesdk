.class public final Lcom/smartengines/nfc/PassportReader;
.super Ljava/lang/Object;
.source "PassportReader.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/nfc/PassportReader$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003J\u0008\u0010\u001e\u001a\u00020\u001cH\u0002J\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u001c2\u0008\u0010 \u001a\u0004\u0018\u00010!J,\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\u0006\u0010 \u001a\u00020!2\u0008\u0008\u0002\u0010&\u001a\u00020\u00192\u0008\u0008\u0002\u0010\'\u001a\u00020\u0019H\u0002J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!J\u0016\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+2\u0006\u0010 \u001a\u00020!R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\u0005R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00158F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u001a\u00a8\u0006,"
    }
    d2 = {
        "Lcom/smartengines/nfc/PassportReader;",
        "",
        "readingEngine",
        "Lcom/smartengines/nfc/ReadingEngine;",
        "<init>",
        "(Lcom/smartengines/nfc/ReadingEngine;)V",
        "getReadingEngine",
        "()Lcom/smartengines/nfc/ReadingEngine;",
        "setReadingEngine",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "passportKeyFlow",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/smartengines/nfc/PassportKey;",
        "getPassportKeyFlow",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
        "setPassportKeyFlow",
        "(Lkotlinx/coroutines/flow/MutableStateFlow;)V",
        "_stateFlow",
        "Lcom/smartengines/nfc/PassportReaderState;",
        "stateFlow",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getStateFlow",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "isActive",
        "",
        "()Z",
        "changeReadingEngine",
        "",
        "newReadingEngine",
        "setNotSupported",
        "activate",
        "activity",
        "Landroid/app/Activity;",
        "reset",
        "readPassportData",
        "isoDep",
        "Landroid/nfc/tech/IsoDep;",
        "checkChip",
        "checkData",
        "onResumeActivity",
        "onNewIntent",
        "intent",
        "Landroid/content/Intent;",
        "nfc_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final _stateFlow:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/smartengines/nfc/PassportReaderState;",
            ">;"
        }
    .end annotation
.end field

.field private final coroutineScope:Lkotlinx/coroutines/CoroutineScope;

.field private passportKeyFlow:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/smartengines/nfc/PassportKey;",
            ">;"
        }
    .end annotation
.end field

.field private readingEngine:Lcom/smartengines/nfc/ReadingEngine;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/smartengines/nfc/PassportReader;-><init>(Lcom/smartengines/nfc/ReadingEngine;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/nfc/ReadingEngine;)V
    .locals 1

    const-string v0, "readingEngine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/smartengines/nfc/PassportReader;->readingEngine:Lcom/smartengines/nfc/ReadingEngine;

    .line 27
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {p1}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/nfc/PassportReader;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    const/4 p1, 0x0

    .line 30
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/nfc/PassportReader;->passportKeyFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 33
    sget-object p1, Lcom/smartengines/nfc/PassportReaderState$Disabled;->INSTANCE:Lcom/smartengines/nfc/PassportReaderState$Disabled;

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/nfc/PassportReader;->_stateFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/smartengines/nfc/ReadingEngine;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 25
    new-instance p1, Lcom/smartengines/nfc/ReadingEngineScuba;

    invoke-direct {p1}, Lcom/smartengines/nfc/ReadingEngineScuba;-><init>()V

    check-cast p1, Lcom/smartengines/nfc/ReadingEngine;

    .line 24
    :cond_0
    invoke-direct {p0, p1}, Lcom/smartengines/nfc/PassportReader;-><init>(Lcom/smartengines/nfc/ReadingEngine;)V

    return-void
.end method

.method public static final synthetic access$get_stateFlow$p(Lcom/smartengines/nfc/PassportReader;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/smartengines/nfc/PassportReader;->_stateFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method private final readPassportData(Landroid/nfc/tech/IsoDep;Landroid/app/Activity;ZZ)V
    .locals 9

    .line 79
    iget-object p3, p0, Lcom/smartengines/nfc/PassportReader;->passportKeyFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p3}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object p3

    move-object v2, p3

    check-cast v2, Lcom/smartengines/nfc/PassportKey;

    .line 80
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "readPassportData, passportKey: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p4, "myapp.PassportReader"

    invoke-static {p4, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    iget-object p3, p0, Lcom/smartengines/nfc/PassportReader;->coroutineScope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/smartengines/nfc/PassportReader$readPassportData$1;-><init>(Lcom/smartengines/nfc/PassportReader;Lcom/smartengines/nfc/PassportKey;Landroid/nfc/tech/IsoDep;Landroid/app/Activity;Lkotlin/coroutines/Continuation;)V

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v3, p3

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method static synthetic readPassportData$default(Lcom/smartengines/nfc/PassportReader;Landroid/nfc/tech/IsoDep;Landroid/app/Activity;ZZILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move p4, v0

    .line 73
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/smartengines/nfc/PassportReader;->readPassportData(Landroid/nfc/tech/IsoDep;Landroid/app/Activity;ZZ)V

    return-void
.end method

.method private final setNotSupported()V
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/smartengines/nfc/PassportReader;->_stateFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    sget-object v1, Lcom/smartengines/nfc/PassportReaderState$NotSupported;->INSTANCE:Lcom/smartengines/nfc/PassportReaderState$NotSupported;

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final activate(Landroid/app/Activity;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    const-string v0, "myapp.PassportReader"

    const-string v1, "activate"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    invoke-virtual {p0}, Lcom/smartengines/nfc/PassportReader;->isActive()Z

    move-result v0

    if-nez v0, :cond_3

    .line 54
    sget-object v0, Lcom/smartengines/nfc/NfcAdapterWrapper;->INSTANCE:Lcom/smartengines/nfc/NfcAdapterWrapper;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/smartengines/nfc/NfcAdapterWrapper;->enableNfcReceiving(Landroid/app/Activity;Z)Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;

    move-result-object p1

    .line 56
    iget-object v0, p0, Lcom/smartengines/nfc/PassportReader;->_stateFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    sget-object v2, Lcom/smartengines/nfc/PassportReader$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;->ordinal()I

    move-result p1

    aget p1, v2, p1

    if-eq p1, v1, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    .line 59
    sget-object p1, Lcom/smartengines/nfc/PassportReaderState$NotSupported;->INSTANCE:Lcom/smartengines/nfc/PassportReaderState$NotSupported;

    check-cast p1, Lcom/smartengines/nfc/PassportReaderState;

    goto :goto_0

    .line 56
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 58
    :cond_1
    new-instance p1, Lcom/smartengines/nfc/PassportReaderState$Error;

    const-string v1, "NFC adapter is disabled"

    invoke-direct {p1, v1}, Lcom/smartengines/nfc/PassportReaderState$Error;-><init>(Ljava/lang/String;)V

    check-cast p1, Lcom/smartengines/nfc/PassportReaderState;

    goto :goto_0

    .line 57
    :cond_2
    sget-object p1, Lcom/smartengines/nfc/PassportReaderState$Waiting;->INSTANCE:Lcom/smartengines/nfc/PassportReaderState$Waiting;

    check-cast p1, Lcom/smartengines/nfc/PassportReaderState;

    .line 56
    :goto_0
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public final changeReadingEngine(Lcom/smartengines/nfc/ReadingEngine;)V
    .locals 2

    const-string v0, "newReadingEngine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "changeReadingEngine "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.PassportReader"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    iput-object p1, p0, Lcom/smartengines/nfc/PassportReader;->readingEngine:Lcom/smartengines/nfc/ReadingEngine;

    return-void
.end method

.method public final getPassportKeyFlow()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/smartengines/nfc/PassportKey;",
            ">;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/smartengines/nfc/PassportReader;->passportKeyFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public final getReadingEngine()Lcom/smartengines/nfc/ReadingEngine;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/smartengines/nfc/PassportReader;->readingEngine:Lcom/smartengines/nfc/ReadingEngine;

    return-object v0
.end method

.method public final getStateFlow()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/smartengines/nfc/PassportReaderState;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/smartengines/nfc/PassportReader;->_stateFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final isActive()Z
    .locals 3

    const/4 v0, 0x2

    .line 38
    new-array v0, v0, [Lcom/smartengines/nfc/PassportReaderState;

    const/4 v1, 0x0

    sget-object v2, Lcom/smartengines/nfc/PassportReaderState$Waiting;->INSTANCE:Lcom/smartengines/nfc/PassportReaderState$Waiting;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/smartengines/nfc/PassportReaderState$Reading;->INSTANCE:Lcom/smartengines/nfc/PassportReaderState$Reading;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lcom/smartengines/nfc/PassportReader;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final onNewIntent(Landroid/content/Intent;Landroid/app/Activity;)V
    .locals 7

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onNewIntent intent:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.PassportReader"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    invoke-virtual {p0}, Lcom/smartengines/nfc/PassportReader;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    sget-object v0, Lcom/smartengines/nfc/NfcAdapterWrapper;->INSTANCE:Lcom/smartengines/nfc/NfcAdapterWrapper;

    invoke-virtual {v0, p1}, Lcom/smartengines/nfc/NfcAdapterWrapper;->getIsoDepTag(Landroid/content/Intent;)Landroid/nfc/Tag;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 135
    invoke-static {p1}, Landroid/nfc/tech/IsoDep;->get(Landroid/nfc/Tag;)Landroid/nfc/tech/IsoDep;

    move-result-object v1

    const-string p1, "get(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/nfc/PassportReader;->readPassportData$default(Lcom/smartengines/nfc/PassportReader;Landroid/nfc/tech/IsoDep;Landroid/app/Activity;ZZILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final onResumeActivity(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onResumeActivity nfcEnabled:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/smartengines/nfc/PassportReader;->isActive()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.PassportReader"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    invoke-virtual {p0}, Lcom/smartengines/nfc/PassportReader;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/smartengines/nfc/PassportReaderState$NotSupported;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 125
    :cond_0
    sget-object v0, Lcom/smartengines/nfc/NfcAdapterWrapper;->INSTANCE:Lcom/smartengines/nfc/NfcAdapterWrapper;

    invoke-virtual {p0}, Lcom/smartengines/nfc/PassportReader;->isActive()Z

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/smartengines/nfc/NfcAdapterWrapper;->enableNfcReceiving(Landroid/app/Activity;Z)Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;

    move-result-object p1

    sget-object v0, Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;->ERROR_NOT_SUPPORTED:Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;

    if-ne p1, v0, :cond_1

    .line 126
    invoke-direct {p0}, Lcom/smartengines/nfc/PassportReader;->setNotSupported()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final reset(Landroid/app/Activity;)V
    .locals 2

    .line 65
    const-string v0, "myapp.PassportReader"

    const-string v1, "reset"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    iget-object v0, p0, Lcom/smartengines/nfc/PassportReader;->_stateFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    sget-object v1, Lcom/smartengines/nfc/PassportReaderState$Disabled;->INSTANCE:Lcom/smartengines/nfc/PassportReaderState$Disabled;

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    .line 69
    sget-object v0, Lcom/smartengines/nfc/NfcAdapterWrapper;->INSTANCE:Lcom/smartengines/nfc/NfcAdapterWrapper;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/smartengines/nfc/NfcAdapterWrapper;->enableNfcReceiving(Landroid/app/Activity;Z)Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;

    :cond_0
    return-void
.end method

.method public final setPassportKeyFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/smartengines/nfc/PassportKey;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iput-object p1, p0, Lcom/smartengines/nfc/PassportReader;->passportKeyFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-void
.end method

.method public final setReadingEngine(Lcom/smartengines/nfc/ReadingEngine;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iput-object p1, p0, Lcom/smartengines/nfc/PassportReader;->readingEngine:Lcom/smartengines/nfc/ReadingEngine;

    return-void
.end method
