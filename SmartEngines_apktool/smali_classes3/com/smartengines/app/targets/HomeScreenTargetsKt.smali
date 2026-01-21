.class public final Lcom/smartengines/app/targets/HomeScreenTargetsKt;
.super Ljava/lang/Object;
.source "HomeScreenTargets.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "TAG",
        "",
        "loadHomeScreenTargets",
        "",
        "Lcom/smartengines/app/targets/TreeItem;",
        "context",
        "Landroid/content/Context;",
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
.field private static final TAG:Ljava/lang/String; = "myapp.HomeScreenTargets"


# direct methods
.method public static final loadHomeScreenTargets(Landroid/content/Context;)Ljava/util/List;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xc

    .line 16
    new-array v0, v0, [Lcom/smartengines/app/targets/TreeLeaf;

    new-instance v1, Lcom/smartengines/app/targets/TreeLeaf;

    .line 17
    new-instance v2, Lcom/smartengines/utils/Name;

    const-string v3, "Russian Passport"

    const-string/jumbo v4, "\u041f\u0430\u0441\u043f\u043e\u0440\u0442 \u0420\u0424"

    invoke-direct {v2, v3, v4}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    sget v3, Lcom/smartengines/app/R$drawable;->home_rus_passport:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 19
    new-instance v4, Lcom/smartengines/targets/id/IdTarget;

    .line 21
    const-string v5, "rus.passport.national"

    .line 19
    const-string v11, "default"

    invoke-direct {v4, v11, v5}, Lcom/smartengines/targets/id/IdTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v8, v4

    check-cast v8, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 16
    invoke-direct/range {v1 .. v10}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 24
    new-instance v12, Lcom/smartengines/app/targets/TreeLeaf;

    .line 25
    new-instance v13, Lcom/smartengines/utils/Name;

    const-string v1, "Registration"

    const-string/jumbo v2, "\u041f\u0440\u043e\u043f\u0438\u0441\u043a\u0430"

    invoke-direct {v13, v1, v2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    sget v1, Lcom/smartengines/app/R$drawable;->home_registration:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 27
    new-instance v1, Lcom/smartengines/targets/id/IdTarget;

    .line 29
    const-string v2, "rus.passport.registration"

    .line 27
    const-string v3, "anyrus"

    invoke-direct {v1, v3, v2}, Lcom/smartengines/targets/id/IdTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v19, v1

    check-cast v19, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v20, 0x3c

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 24
    invoke-direct/range {v12 .. v21}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x1

    aput-object v12, v0, v1

    .line 32
    new-instance v13, Lcom/smartengines/app/targets/TreeLeaf;

    .line 33
    new-instance v14, Lcom/smartengines/utils/Name;

    const-string v1, "Birth Certificate"

    const-string/jumbo v2, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e\n\u043e \u0440\u043e\u0436\u0434\u0435\u043d\u0438\u0438"

    invoke-direct {v14, v1, v2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    new-instance v15, Lcom/smartengines/app/targets/Icon;

    .line 35
    sget v1, Lcom/smartengines/app/R$drawable;->home_birth_certificate_light:I

    .line 36
    sget v2, Lcom/smartengines/app/R$drawable;->home_birth_certificate_dark:I

    .line 34
    invoke-direct {v15, v1, v2}, Lcom/smartengines/app/targets/Icon;-><init>(II)V

    .line 38
    new-instance v1, Lcom/smartengines/targets/id/IdTarget;

    .line 40
    const-string v2, "rus.birth_certificate.*"

    .line 38
    invoke-direct {v1, v11, v2}, Lcom/smartengines/targets/id/IdTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v20, v1

    check-cast v20, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v21, 0x3c

    const/16 v22, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    .line 32
    invoke-direct/range {v13 .. v22}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x2

    aput-object v13, v0, v1

    .line 44
    new-instance v14, Lcom/smartengines/app/targets/TreeLeaf;

    .line 45
    new-instance v15, Lcom/smartengines/utils/Name;

    const-string v1, "Any Document"

    const-string/jumbo v2, "\u0410\u0432\u0442\u043e\u0432\u044b\u0431\u043e\u0440 \u0414\u0423\u041b"

    invoke-direct {v15, v1, v2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    sget v1, Lcom/smartengines/app/R$drawable;->home_anydoc:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    .line 47
    new-instance v1, Lcom/smartengines/targets/id/IdTarget;

    const-string v2, "anydoc"

    const-string v4, "*"

    invoke-direct {v1, v2, v4}, Lcom/smartengines/targets/id/IdTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v21, v1

    check-cast v21, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v22, 0x3c

    const/16 v23, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 44
    invoke-direct/range {v14 .. v23}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x3

    aput-object v14, v0, v1

    .line 52
    new-instance v15, Lcom/smartengines/app/targets/TreeLeaf;

    .line 53
    new-instance v1, Lcom/smartengines/utils/Name;

    const-string v2, "CIS Documents"

    const-string/jumbo v5, "\u0414\u0423\u041b \u0421\u041d\u0413"

    invoke-direct {v1, v2, v5}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    sget v2, Lcom/smartengines/app/R$drawable;->home_anycis:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    .line 55
    new-instance v2, Lcom/smartengines/targets/id/IdTarget;

    .line 56
    const-string v5, "anycis"

    .line 55
    invoke-direct {v2, v5, v4}, Lcom/smartengines/targets/id/IdTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v22, v2

    check-cast v22, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v23, 0x3c

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v16, v1

    .line 52
    invoke-direct/range {v15 .. v24}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x4

    aput-object v15, v0, v1

    .line 60
    new-instance v4, Lcom/smartengines/app/targets/TreeLeaf;

    .line 61
    new-instance v5, Lcom/smartengines/utils/Name;

    const-string v1, "Any Russian Document"

    const-string/jumbo v2, "\u0414\u0423\u041b \u0420\u0424"

    invoke-direct {v5, v1, v2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    sget v1, Lcom/smartengines/app/R$drawable;->home_anyrus:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 63
    new-instance v1, Lcom/smartengines/targets/id/IdTarget;

    .line 65
    const-string v2, "*/rus.passport.previous"

    .line 63
    invoke-direct {v1, v3, v2}, Lcom/smartengines/targets/id/IdTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v11, v1

    check-cast v11, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v12, 0x3c

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 60
    invoke-direct/range {v4 .. v13}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x5

    aput-object v4, v0, v1

    .line 69
    new-instance v5, Lcom/smartengines/app/targets/TreeLeaf;

    .line 70
    new-instance v6, Lcom/smartengines/utils/Name;

    const-string v1, "QR and other barcodes"

    const-string v2, "QR \u0438 \u0434\u0440\u0443\u0433\u0438\u0435 \u0431\u0430\u0440\u043a\u043e\u0434\u044b"

    invoke-direct {v6, v1, v2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    sget v1, Lcom/smartengines/app/R$drawable;->home_barcode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 72
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$Barcode;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$Barcode;-><init>()V

    move-object v12, v1

    check-cast v12, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v13, 0x3c

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 69
    invoke-direct/range {v5 .. v14}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x6

    aput-object v5, v0, v1

    .line 74
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 75
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v1, "Bank Card"

    const-string/jumbo v2, "\u0411\u0430\u043d\u043a\u043e\u0432\u0441\u043a\u0430\u044f\n\u043a\u0430\u0440\u0442\u0430"

    invoke-direct {v7, v1, v2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    sget v1, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 77
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$BankCard;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$BankCard;-><init>()V

    move-object v13, v1

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 74
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x7

    aput-object v6, v0, v1

    .line 79
    new-instance v7, Lcom/smartengines/app/targets/TreeLeaf;

    .line 80
    new-instance v8, Lcom/smartengines/utils/Name;

    const-string v1, "Meters"

    const-string/jumbo v2, "\u041a\u043e\u043c\u043c\u0443\u043d\u0430\u043b\u044c\u043d\u044b\u0435 \u0441\u0447\u0451\u0442\u0447\u0438\u043a\u0438"

    invoke-direct {v8, v1, v2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    sget v1, Lcom/smartengines/app/R$drawable;->home_meters:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 82
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineMeters;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineMeters;-><init>()V

    move-object v14, v1

    check-cast v14, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v15, 0x3c

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 79
    invoke-direct/range {v7 .. v16}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x8

    aput-object v7, v0, v1

    .line 85
    new-instance v8, Lcom/smartengines/app/targets/TreeLeaf;

    .line 86
    new-instance v9, Lcom/smartengines/utils/Name;

    const-string v1, "Russian DL and VRC"

    const-string/jumbo v2, "\u0412\u0423 \u0438 \u0421\u0422\u0421 \u0420\u0424"

    invoke-direct {v9, v1, v2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    sget v1, Lcom/smartengines/app/R$drawable;->home_drvlic:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 88
    new-instance v1, Lcom/smartengines/targets/id/IdTarget;

    .line 90
    const-string v2, "rus.sts.*,rus.drvlic.*"

    .line 88
    invoke-direct {v1, v3, v2}, Lcom/smartengines/targets/id/IdTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v15, v1

    check-cast v15, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v16, 0x3c

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 85
    invoke-direct/range {v8 .. v17}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x9

    aput-object v8, v0, v1

    .line 93
    new-instance v9, Lcom/smartengines/app/targets/TreeLeaf;

    .line 94
    new-instance v10, Lcom/smartengines/utils/Name;

    const-string v1, "License Plate"

    const-string/jumbo v2, "\u041d\u043e\u043c\u0435\u0440\u0430 \u0430\u0432\u0442\u043e\u043c\u043e\u0431\u0438\u043b\u0435\u0439"

    invoke-direct {v10, v1, v2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    sget v1, Lcom/smartengines/app/R$drawable;->home_license_plates:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    .line 96
    new-instance v1, Lcom/smartengines/targets/code/CodeTargets$LicensePlate;

    invoke-direct {v1}, Lcom/smartengines/targets/code/CodeTargets$LicensePlate;-><init>()V

    move-object/from16 v16, v1

    check-cast v16, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v17, 0x3c

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 93
    invoke-direct/range {v9 .. v18}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0xa

    aput-object v9, v0, v1

    .line 98
    new-instance v10, Lcom/smartengines/app/targets/TreeLeaf;

    .line 99
    new-instance v11, Lcom/smartengines/utils/Name;

    const-string v1, "Text recognition (OCR)"

    const-string/jumbo v2, "\u0420\u0430\u0441\u043f\u043e\u0437\u043d\u0430\u0432\u0430\u043d\u0438\u0435 \u0442\u0435\u043a\u0441\u0442\u0430 (OCR)"

    invoke-direct {v11, v1, v2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    sget v1, Lcom/smartengines/app/R$drawable;->home_text:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 101
    new-instance v1, Lcom/smartengines/targets/text/TextTarget;

    invoke-direct {v1}, Lcom/smartengines/targets/text/TextTarget;-><init>()V

    move-object/from16 v17, v1

    check-cast v17, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v18, 0x3c

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    .line 98
    invoke-direct/range {v10 .. v19}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0xb

    aput-object v10, v0, v1

    .line 14
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
