.class public final Lcom/smartengines/app/targets/CodeTargetsKt;
.super Ljava/lang/Object;
.source "CodeTargets.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCodeTargets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeTargets.kt\ncom/smartengines/app/targets/CodeTargetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1755#2,3:245\n*S KotlinDebug\n*F\n+ 1 CodeTargets.kt\ncom/smartengines/app/targets/CodeTargetsKt\n*L\n134#1:245,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "TAG",
        "",
        "loadCodeTargetList",
        "Lcom/smartengines/app/targets/TreeItem;",
        "context",
        "Landroid/content/Context;",
        "codeEngine",
        "Lcom/smartengines/code/CodeEngine;",
        "app_storeRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "myapp.CodeTargets"


# direct methods
.method public static final loadCodeTargetList(Landroid/content/Context;Lcom/smartengines/code/CodeEngine;)Lcom/smartengines/app/targets/TreeItem;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "codeEngine"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {v2}, Lcom/smartengines/code/CodeEngine;->GetDefaultSessionSettings()Lcom/smartengines/code/CodeEngineSessionSettings;

    move-result-object v1

    const-string v2, "GetDefaultSessionSettings(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/smartengines/targets/code/CodeSessionOptionsKt;->parse(Lcom/smartengines/code/CodeEngineSessionSettings;)Lcom/smartengines/targets/code/CodeSessionOptions;

    move-result-object v1

    .line 20
    sget-object v2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    invoke-virtual {v2, v1}, Lcom/smartengines/targets/code/CodeTargets;->setSessionOptions(Lcom/smartengines/targets/code/CodeSessionOptions;)V

    .line 22
    sget-object v2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v3, "code_text_line"

    invoke-virtual {v2, v3}, Lcom/smartengines/targets/code/CodeTargets;->loadEngineSupportedTypes(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v2

    .line 26
    invoke-virtual {v1}, Lcom/smartengines/targets/code/CodeSessionOptions;->getInternalEngines()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    .line 27
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 31
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v6, "Universal Pay"

    invoke-direct {v7, v6, v6}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    new-instance v9, Lcom/smartengines/utils/Name;

    const-string v6, "4 in 1: Payment Barcode, Bank Card, Phone Lines (RUS), Bank Card Line"

    .line 33
    const-string v8, "4 \u0432 1: \u041f\u043b\u0430\u0442\u0451\u0436\u043d\u044b\u0439 \u0431\u0430\u0440\u043a\u043e\u0434, \u0411\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u0430\u044f \u043a\u0430\u0440\u0442\u0430, \u041d\u043e\u043c\u0435\u0440 \u0442\u0435\u043b\u0435\u0444\u043e\u043d\u0430 (\u0420\u0423\u0421), \u041d\u043e\u043c\u0435\u0440 \u0431\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u043e\u0439 \u043a\u0430\u0440\u0442\u044b"

    .line 32
    invoke-direct {v9, v6, v8}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    sget v6, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    .line 35
    new-instance v8, Lcom/smartengines/targets/code/CodeTargets$UniversalPay;

    invoke-direct {v8}, Lcom/smartengines/targets/code/CodeTargets$UniversalPay;-><init>()V

    move v10, v6

    .line 30
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 34
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 35
    move-object v13, v8

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x38

    const/4 v15, 0x0

    move-object v8, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 30
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    const-string v6, "payment_details"

    invoke-interface {v4, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 41
    new-instance v8, Lcom/smartengines/utils/Name;

    const-string v6, "Payment Details"

    const-string/jumbo v7, "\u041f\u043b\u0430\u0442\u0451\u0436\u043d\u044b\u0435 \u0440\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b"

    invoke-direct {v8, v6, v7}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    new-instance v10, Lcom/smartengines/utils/Name;

    const-string v6, "5 in 1: INN, KPP, Russian BIC, Russian Bank Account, Personal Account"

    .line 43
    const-string v7, "5 \u0432 1: \u0418\u041d\u041d, \u041a\u041f\u041f, \u0420\u043e\u0441\u0441\u0438\u0439\u0441\u043a\u0438\u0439 \u0411\u0418\u041a, \u0411\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u0438\u0439 \u0441\u0447\u0451\u0442, \u041b\u0438\u0446\u0435\u0432\u043e\u0439 \u0441\u0447\u0451\u0442"

    .line 42
    invoke-direct {v10, v6, v7}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    sget v6, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    .line 45
    new-instance v7, Lcom/smartengines/targets/code/CodeTargets$PaymentDetails;

    invoke-direct {v7}, Lcom/smartengines/targets/code/CodeTargets$PaymentDetails;-><init>()V

    move-object v9, v7

    .line 40
    new-instance v7, Lcom/smartengines/app/targets/TreeLeaf;

    .line 44
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 45
    move-object v14, v9

    check-cast v14, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v15, 0x38

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v9, v6

    .line 40
    invoke-direct/range {v7 .. v16}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    :cond_0
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 52
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v3, "Code Text Line (number)"

    const-string/jumbo v6, "\u041a\u043e\u0434\u043e\u0432\u044b\u0435 \u0442\u0435\u043a\u0441\u0442\u043e\u0432\u044b\u0435 \u0441\u0442\u0440\u043e\u043a\u0438 (\u043d\u043e\u043c\u0435\u0440\u0430)"

    invoke-direct {v7, v3, v6}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    new-instance v9, Lcom/smartengines/utils/Name;

    const-string v3, "3 in 1: Bank Card Lines, Phone Lines (RUS), Phone Lines (CIS)"

    .line 54
    const-string v6, "3 \u0432 1: \u041d\u043e\u043c\u0435\u0440 \u0431\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u043e\u0439 \u043a\u0430\u0440\u0442\u044b, \u041d\u043e\u043c\u0435\u0440 \u0442\u0435\u043b\u0435\u0444\u043e\u043d\u0430 (\u0420\u0423\u0421), \u041d\u043e\u043c\u0435\u0440 \u0442\u0435\u043b\u0435\u0444\u043e\u043d\u0430 (\u0421\u041d\u0413)"

    .line 53
    invoke-direct {v9, v3, v6}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    sget v3, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    .line 56
    new-instance v6, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineNumbers;

    invoke-direct {v6}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineNumbers;-><init>()V

    move-object v8, v6

    .line 51
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 55
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 56
    move-object v13, v8

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x38

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v8, v3

    .line 51
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    :cond_1
    const-string v3, "barcode"

    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 63
    new-instance v8, Lcom/smartengines/utils/Name;

    const-string v6, "Payment Barcode"

    const-string/jumbo v7, "\u041f\u043b\u0430\u0442\u0451\u0436\u043d\u044b\u0439 \u0431\u0430\u0440\u043a\u043e\u0434"

    invoke-direct {v8, v6, v7}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    new-instance v10, Lcom/smartengines/utils/Name;

    const-string v6, "3 in 1: QR CODE, Aztec, DataMatrix"

    .line 65
    const-string v7, "3 \u0432 1: QR CODE, Aztec, DataMatrix"

    .line 64
    invoke-direct {v10, v6, v7}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    sget v6, Lcom/smartengines/app/R$drawable;->home_payment_barcode:I

    .line 67
    new-instance v7, Lcom/smartengines/targets/code/CodeTargets$BarcodePayment;

    invoke-direct {v7}, Lcom/smartengines/targets/code/CodeTargets$BarcodePayment;-><init>()V

    move-object v9, v7

    .line 62
    new-instance v7, Lcom/smartengines/app/targets/TreeLeaf;

    .line 66
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 67
    move-object v14, v9

    check-cast v14, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v15, 0x38

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v9, v6

    .line 62
    invoke-direct/range {v7 .. v16}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    :cond_2
    const-string v6, "iban"

    invoke-interface {v2, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 73
    new-instance v7, Lcom/smartengines/app/targets/TreeLeaf;

    .line 74
    new-instance v8, Lcom/smartengines/utils/Name;

    const-string v6, "IBAN"

    const-string/jumbo v9, "\u041c\u0435\u0436\u0434\u0443\u043d\u0430\u0440\u043e\u0434\u043d\u044b\u0439 \u043d\u043e\u043c\u0435\u0440 \u0431\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u043e\u0433\u043e \u0441\u0447\u0451\u0442\u0430 (IBAN)"

    invoke-direct {v8, v6, v9}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    sget v6, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 76
    new-instance v6, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineIban;

    invoke-direct {v6}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineIban;-><init>()V

    move-object v14, v6

    check-cast v14, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v15, 0x3c

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 73
    invoke-direct/range {v7 .. v16}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    :cond_3
    const-string v6, "bank_card"

    invoke-interface {v4, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 82
    new-instance v7, Lcom/smartengines/app/targets/TreeLeaf;

    .line 83
    new-instance v8, Lcom/smartengines/utils/Name;

    const-string v6, "Bank Card"

    const-string/jumbo v9, "\u0411\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u0430\u044f \u043a\u0430\u0440\u0442\u0430"

    invoke-direct {v8, v6, v9}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    sget v6, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 85
    new-instance v6, Lcom/smartengines/targets/code/CodeTargets$BankCard;

    invoke-direct {v6}, Lcom/smartengines/targets/code/CodeTargets$BankCard;-><init>()V

    move-object v14, v6

    check-cast v14, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v15, 0x3c

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 82
    invoke-direct/range {v7 .. v16}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    :cond_4
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 91
    new-instance v7, Lcom/smartengines/app/targets/TreeLeaf;

    .line 92
    new-instance v8, Lcom/smartengines/utils/Name;

    const-string v6, "Barcode Session"

    const-string/jumbo v9, "\u0411\u0430\u0440\u043a\u043e\u0434\u043d\u0430\u044f \u0441\u0435\u0441\u0441\u0438\u044f"

    invoke-direct {v8, v6, v9}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    sget v6, Lcom/smartengines/app/R$drawable;->home_barcode_session:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 94
    new-instance v6, Lcom/smartengines/targets/code/CodeTargets$BarcodeSession;

    invoke-direct {v6}, Lcom/smartengines/targets/code/CodeTargets$BarcodeSession;-><init>()V

    move-object v14, v6

    check-cast v14, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v15, 0x3c

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 91
    invoke-direct/range {v7 .. v16}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    :cond_5
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 100
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 101
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v3, "Barcode"

    const-string/jumbo v8, "\u0411\u0430\u0440\u043a\u043e\u0434"

    invoke-direct {v7, v3, v8}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    sget v3, Lcom/smartengines/app/R$drawable;->home_barcode:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 103
    new-instance v3, Lcom/smartengines/targets/code/CodeTargets$Barcode;

    invoke-direct {v3}, Lcom/smartengines/targets/code/CodeTargets$Barcode;-><init>()V

    move-object v13, v3

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 100
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    :cond_6
    const-string v3, "mrz"

    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 109
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 110
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v3, "MRZ"

    const-string/jumbo v8, "\u041c\u0430\u0448\u0438\u043d\u043e\u0447\u0438\u0442\u0430\u0435\u043c\u0430\u044f \u0437\u043e\u043d\u0430 \u043f\u0430\u0441\u043f\u043e\u0440\u0442\u0430 (MRZ)"

    invoke-direct {v7, v3, v8}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    sget v3, Lcom/smartengines/dictionaries/R$drawable;->code_mrz:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 112
    new-instance v3, Lcom/smartengines/targets/code/CodeTargets$Mrz;

    invoke-direct {v3}, Lcom/smartengines/targets/code/CodeTargets$Mrz;-><init>()V

    move-object v13, v3

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 109
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    :cond_7
    const-string v3, "meters"

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 118
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 119
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v3, "Meters"

    const-string/jumbo v8, "\u041a\u043e\u043c\u043c\u0443\u043d\u0430\u043b\u044c\u043d\u044b\u0435 \u0441\u0447\u0451\u0442\u0447\u0438\u043a\u0438"

    invoke-direct {v7, v3, v8}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    sget v3, Lcom/smartengines/app/R$drawable;->home_meters:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 121
    new-instance v3, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineMeters;

    invoke-direct {v3}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineMeters;-><init>()V

    move-object v13, v3

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 118
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    :cond_8
    invoke-virtual {v1}, Lcom/smartengines/targets/code/CodeSessionOptions;->getInternalEngines()Ljava/util/Map;

    move-result-object v1

    const-string v3, "license_plate"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/targets/code/CodeSessionOptions$InternalEngine;

    if-eqz v1, :cond_b

    .line 128
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 129
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v3, "License Plate"

    const-string/jumbo v8, "\u041d\u043e\u043c\u0435\u0440\u0430 \u0430\u0432\u0442\u043e\u043c\u043e\u0431\u0438\u043b\u0435\u0439"

    invoke-direct {v7, v3, v8}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    sget v3, Lcom/smartengines/app/R$drawable;->home_license_plates:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 131
    new-instance v3, Lcom/smartengines/targets/code/CodeTargets$LicensePlate;

    invoke-direct {v3}, Lcom/smartengines/targets/code/CodeTargets$LicensePlate;-><init>()V

    move-object v13, v3

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 128
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    invoke-virtual {v1}, Lcom/smartengines/targets/code/CodeSessionOptions$InternalEngine;->getSubtypes()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 245
    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_9

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_0

    .line 246
    :cond_9
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/smartengines/targets/code/CodeSessionOptions$Option;

    .line 134
    invoke-virtual {v3}, Lcom/smartengines/targets/code/CodeSessionOptions$Option;->getKey()Ljava/lang/String;

    move-result-object v3

    const-string v6, "license_plate.are.enabled"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 135
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 136
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v1, "License Plate UAE"

    const-string/jumbo v3, "\u041d\u043e\u043c\u0435\u0440\u0430 \u0430\u0432\u0442\u043e\u043c\u043e\u0431\u0438\u043b\u0435\u0439 \u041e\u0410\u042d"

    invoke-direct {v7, v1, v3}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    sget v1, Lcom/smartengines/app/R$drawable;->home_license_plates:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 138
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$LicensePlateAre;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$LicensePlateAre;-><init>()V

    move-object v13, v1

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 135
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    :cond_b
    :goto_0
    const-string v1, "phone_number"

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 145
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 146
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v1, "Phone Lines (RUS)"

    const-string/jumbo v3, "\u041d\u043e\u043c\u0435\u0440 \u0442\u0435\u043b\u0435\u0444\u043e\u043d\u0430 (\u0420\u0423\u0421)"

    invoke-direct {v7, v1, v3}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    sget v1, Lcom/smartengines/app/R$drawable;->home_phone:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 148
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$CodeTextLinePhone;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLinePhone;-><init>()V

    move-object v13, v1

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 145
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    :cond_c
    const-string v1, "phone_number_cis"

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 154
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 155
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v1, "Phone Lines (CIS)"

    const-string/jumbo v3, "\u041d\u043e\u043c\u0435\u0440 \u0442\u0435\u043b\u0435\u0444\u043e\u043d\u0430 (\u0421\u041d\u0413)"

    invoke-direct {v7, v1, v3}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    sget v1, Lcom/smartengines/app/R$drawable;->home_phone:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 157
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$CodeTextLinePhoneCis;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLinePhoneCis;-><init>()V

    move-object v13, v1

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 154
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    :cond_d
    const-string v1, "card_number"

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 163
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 164
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v1, "Bank Card Lines"

    const-string/jumbo v3, "\u0411\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u0430\u044f \u043a\u0430\u0440\u0442\u0430 (\u043d\u043e\u043c\u0435\u0440)"

    invoke-direct {v7, v1, v3}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    sget v1, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 166
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineCardNumber;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineCardNumber;-><init>()V

    move-object v13, v1

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 163
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    :cond_e
    const-string v1, "inn"

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 172
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 173
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v1, "INN"

    const-string/jumbo v3, "\u0418\u041d\u041d"

    invoke-direct {v7, v1, v3}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    sget v1, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 175
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineInn;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineInn;-><init>()V

    move-object v13, v1

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 172
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    :cond_f
    const-string v1, "kpp"

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 181
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 182
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v1, "KPP"

    const-string/jumbo v3, "\u041a\u041f\u041f"

    invoke-direct {v7, v1, v3}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    sget v1, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 184
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineKpp;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineKpp;-><init>()V

    move-object v13, v1

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 181
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    :cond_10
    const-string v1, "rcbic"

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 190
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 191
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v1, "Russian BIC"

    const-string/jumbo v3, "\u0411\u0418\u041a"

    invoke-direct {v7, v1, v3}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    sget v1, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 193
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineBic;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineBic;-><init>()V

    move-object v13, v1

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 190
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    :cond_11
    const-string v1, "rus_bank_account"

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 199
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 200
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v1, "Russian Bank Account"

    const-string/jumbo v3, "\u041d\u043e\u043c\u0435\u0440 \u0431\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u043e\u0433\u043e \u0441\u0447\u0451\u0442\u0430"

    invoke-direct {v7, v1, v3}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    sget v1, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 202
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineBankAccount;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineBankAccount;-><init>()V

    move-object v13, v1

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 199
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    :cond_12
    const-string/jumbo v1, "vin"

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    .line 209
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 210
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v1, "VIN"

    invoke-direct {v7, v1, v1}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    sget v1, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 212
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineVin;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineVin;-><init>()V

    move-object v13, v1

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 209
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 208
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    :cond_13
    const-string/jumbo v1, "shipping_container"

    invoke-interface {v4, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    .line 219
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 220
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v1, "Shipping Container"

    const-string/jumbo v3, "\u0413\u0440\u0443\u0437\u043e\u0432\u043e\u0439 \u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440"

    invoke-direct {v7, v1, v3}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    sget v1, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 222
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$Container;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$Container;-><init>()V

    move-object v13, v1

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 219
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    :cond_14
    const-string v1, "container_seal_number"

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 228
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 229
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v1, "Container seal number"

    const-string/jumbo v2, "\u041d\u043e\u043c\u0435\u0440 \u043f\u043b\u043e\u043c\u0431\u044b \u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440\u0430"

    invoke-direct {v7, v1, v2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    sget v1, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 231
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineContainerNumber;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineContainerNumber;-><init>()V

    move-object v13, v1

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 228
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    :cond_15
    new-instance v1, Lcom/smartengines/app/targets/TreeGroupViewType$TwoLevelsIconsTexts;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lcom/smartengines/app/targets/TreeGroupViewType$TwoLevelsIconsTexts;-><init>(I)V

    .line 239
    new-instance v7, Lcom/smartengines/utils/Name;

    sget v2, Lcom/smartengines/app/R$string;->code_engine_name:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "getString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v0}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;)V

    .line 237
    new-instance v6, Lcom/smartengines/app/targets/TreeGroup;

    .line 241
    move-object v9, v5

    check-cast v9, Ljava/util/List;

    .line 238
    move-object v12, v1

    check-cast v12, Lcom/smartengines/app/targets/TreeGroupViewType;

    const/16 v13, 0x18

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 237
    invoke-direct/range {v6 .. v14}, Lcom/smartengines/app/targets/TreeGroup;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Lcom/smartengines/app/targets/TreeGroupViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v6, Lcom/smartengines/app/targets/TreeItem;

    return-object v6
.end method
