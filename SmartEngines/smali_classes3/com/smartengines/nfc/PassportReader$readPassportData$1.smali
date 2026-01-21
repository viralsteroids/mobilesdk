.class final Lcom/smartengines/nfc/PassportReader$readPassportData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "PassportReader.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/nfc/PassportReader;->readPassportData(Landroid/nfc/tech/IsoDep;Landroid/app/Activity;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPassportReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PassportReader.kt\ncom/smartengines/nfc/PassportReader$readPassportData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.smartengines.nfc.PassportReader$readPassportData$1"
    f = "PassportReader.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $activity:Landroid/app/Activity;

.field final synthetic $isoDep:Landroid/nfc/tech/IsoDep;

.field final synthetic $passportKey:Lcom/smartengines/nfc/PassportKey;

.field label:I

.field final synthetic this$0:Lcom/smartengines/nfc/PassportReader;


# direct methods
.method constructor <init>(Lcom/smartengines/nfc/PassportReader;Lcom/smartengines/nfc/PassportKey;Landroid/nfc/tech/IsoDep;Landroid/app/Activity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/nfc/PassportReader;",
            "Lcom/smartengines/nfc/PassportKey;",
            "Landroid/nfc/tech/IsoDep;",
            "Landroid/app/Activity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/smartengines/nfc/PassportReader$readPassportData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->this$0:Lcom/smartengines/nfc/PassportReader;

    iput-object p2, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->$passportKey:Lcom/smartengines/nfc/PassportKey;

    iput-object p3, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->$isoDep:Landroid/nfc/tech/IsoDep;

    iput-object p4, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->$activity:Landroid/app/Activity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;

    iget-object v1, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->this$0:Lcom/smartengines/nfc/PassportReader;

    iget-object v2, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->$passportKey:Lcom/smartengines/nfc/PassportKey;

    iget-object v3, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->$isoDep:Landroid/nfc/tech/IsoDep;

    iget-object v4, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->$activity:Landroid/app/Activity;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/smartengines/nfc/PassportReader$readPassportData$1;-><init>(Lcom/smartengines/nfc/PassportReader;Lcom/smartengines/nfc/PassportKey;Landroid/nfc/tech/IsoDep;Landroid/app/Activity;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/smartengines/nfc/PassportReader$readPassportData$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const-string v0, "myapp.PassportReader"

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 81
    iget v1, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->label:I

    if-nez v1, :cond_2

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 84
    :try_start_0
    iget-object p1, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->this$0:Lcom/smartengines/nfc/PassportReader;

    invoke-static {p1}, Lcom/smartengines/nfc/PassportReader;->access$get_stateFlow$p(Lcom/smartengines/nfc/PassportReader;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    sget-object v1, Lcom/smartengines/nfc/PassportReaderState$Reading;->INSTANCE:Lcom/smartengines/nfc/PassportReaderState$Reading;

    invoke-interface {p1, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 86
    iget-object p1, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->$passportKey:Lcom/smartengines/nfc/PassportKey;

    if-eqz p1, :cond_0

    .line 88
    new-instance v1, Lorg/jmrtd/BACKey;

    invoke-virtual {p1}, Lcom/smartengines/nfc/PassportKey;->getPassportNumber()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/smartengines/nfc/PassportKey;->getBirthDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/smartengines/nfc/PassportKey;->getExpirationDate()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, v3, p1}, Lorg/jmrtd/BACKey;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    iget-object p1, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->this$0:Lcom/smartengines/nfc/PassportReader;

    invoke-virtual {p1}, Lcom/smartengines/nfc/PassportReader;->getReadingEngine()Lcom/smartengines/nfc/ReadingEngine;

    move-result-object p1

    .line 90
    iget-object v2, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->$isoDep:Landroid/nfc/tech/IsoDep;

    .line 89
    invoke-interface {p1, v2}, Lcom/smartengines/nfc/ReadingEngine;->open(Landroid/nfc/tech/IsoDep;)V

    .line 92
    iget-object p1, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->this$0:Lcom/smartengines/nfc/PassportReader;

    invoke-virtual {p1}, Lcom/smartengines/nfc/PassportReader;->getReadingEngine()Lcom/smartengines/nfc/ReadingEngine;

    move-result-object p1

    invoke-interface {p1, v1}, Lcom/smartengines/nfc/ReadingEngine;->readPassportData(Lorg/jmrtd/BACKey;)Lcom/smartengines/nfc/PassportData;

    move-result-object p1

    .line 103
    const-string v1, "Success"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    iget-object v1, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->this$0:Lcom/smartengines/nfc/PassportReader;

    invoke-static {v1}, Lcom/smartengines/nfc/PassportReader;->access$get_stateFlow$p(Lcom/smartengines/nfc/PassportReader;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    new-instance v2, Lcom/smartengines/nfc/PassportReaderState$Data;

    invoke-direct {v2, p1}, Lcom/smartengines/nfc/PassportReaderState$Data;-><init>(Lcom/smartengines/nfc/PassportData;)V

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    .line 86
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    const-string v1, "passport key is null"

    invoke-direct {p1, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 106
    const-string v1, "readPassportData"

    move-object v2, p1

    check-cast v2, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 108
    iget-object v0, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->this$0:Lcom/smartengines/nfc/PassportReader;

    invoke-static {v0}, Lcom/smartengines/nfc/PassportReader;->access$get_stateFlow$p(Lcom/smartengines/nfc/PassportReader;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    new-instance v1, Lcom/smartengines/nfc/PassportReaderState$Error;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-direct {v1, v2}, Lcom/smartengines/nfc/PassportReaderState$Error;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 110
    :goto_0
    iget-object p1, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->this$0:Lcom/smartengines/nfc/PassportReader;

    invoke-virtual {p1}, Lcom/smartengines/nfc/PassportReader;->getReadingEngine()Lcom/smartengines/nfc/ReadingEngine;

    move-result-object p1

    invoke-interface {p1}, Lcom/smartengines/nfc/ReadingEngine;->close()V

    .line 113
    sget-object p1, Lcom/smartengines/nfc/NfcAdapterWrapper;->INSTANCE:Lcom/smartengines/nfc/NfcAdapterWrapper;

    iget-object v0, p0, Lcom/smartengines/nfc/PassportReader$readPassportData$1;->$activity:Landroid/app/Activity;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/smartengines/nfc/NfcAdapterWrapper;->enableNfcReceiving(Landroid/app/Activity;Z)Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;

    .line 114
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 81
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
