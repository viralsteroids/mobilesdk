.class public final Lcom/smartengines/app/targets/DocTargetsListKt;
.super Ljava/lang/Object;
.source "DocTargetsList.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDocTargetsList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocTargetsList.kt\ncom/smartengines/app/targets/DocTargetsListKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n774#2:169\n865#2,2:170\n774#2:172\n865#2,2:173\n1368#2:175\n1454#2,5:176\n*S KotlinDebug\n*F\n+ 1 DocTargetsList.kt\ncom/smartengines/app/targets/DocTargetsListKt\n*L\n78#1:169\n78#1:170,2\n146#1:172\n146#1:173,2\n161#1:175\n161#1:176,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u001a \u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "TAG",
        "",
        "loadDocTargetSections",
        "",
        "Lcom/smartengines/app/targets/DocSection;",
        "context",
        "Landroid/content/Context;",
        "docEngine",
        "Lcom/smartengines/doc/DocEngine;",
        "statistics",
        "Lcom/smartengines/targets/DocumentTypesStatistics;",
        "loadDocTargetList",
        "Lcom/smartengines/app/targets/TreeItem;",
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
.field private static final TAG:Ljava/lang/String; = "myapp.DocTargetsList"


# direct methods
.method public static final loadDocTargetList(Landroid/content/Context;Lcom/smartengines/doc/DocEngine;Lcom/smartengines/targets/DocumentTypesStatistics;)Lcom/smartengines/app/targets/TreeItem;
    .locals 10

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "docEngine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    invoke-static {p0, p1, p2}, Lcom/smartengines/app/targets/DocTargetsListKt;->loadDocTargetSections(Landroid/content/Context;Lcom/smartengines/doc/DocEngine;Lcom/smartengines/targets/DocumentTypesStatistics;)Ljava/util/List;

    move-result-object p1

    .line 161
    check-cast p1, Ljava/lang/Iterable;

    .line 175
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/Collection;

    .line 176
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 177
    check-cast v0, Lcom/smartengines/app/targets/DocSection;

    .line 161
    invoke-virtual {v0}, Lcom/smartengines/app/targets/DocSection;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 178
    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    .line 180
    :cond_0
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 162
    new-instance v1, Lcom/smartengines/app/targets/TreeGroup;

    .line 163
    new-instance v2, Lcom/smartengines/utils/Name;

    sget p1, Lcom/smartengines/app/R$string;->doc_engine_name:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "getString(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p0}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;)V

    .line 166
    new-instance p0, Lcom/smartengines/app/targets/TreeGroupViewType$OneLevelIcons;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lcom/smartengines/app/targets/TreeGroupViewType$OneLevelIcons;-><init>(I)V

    move-object v7, p0

    check-cast v7, Lcom/smartengines/app/targets/TreeGroupViewType;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 162
    invoke-direct/range {v1 .. v9}, Lcom/smartengines/app/targets/TreeGroup;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Lcom/smartengines/app/targets/TreeGroupViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/smartengines/app/targets/TreeItem;

    return-object v1
.end method

.method public static final loadDocTargetSections(Landroid/content/Context;Lcom/smartengines/doc/DocEngine;Lcom/smartengines/targets/DocumentTypesStatistics;)Ljava/util/List;
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/smartengines/doc/DocEngine;",
            "Lcom/smartengines/targets/DocumentTypesStatistics;",
            ")",
            "Ljava/util/List<",
            "Lcom/smartengines/app/targets/DocSection;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "docEngine"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    .line 28
    new-array v3, v1, [Ljava/lang/String;

    const-string v4, "en"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    const-string v6, "ru"

    aput-object v6, v3, v4

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v0, v3}, Lcom/smartengines/utils/UtilsKt;->getCurrentLanguage(Landroid/content/Context;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-virtual {v2}, Lcom/smartengines/doc/DocEngine;->CreateSessionSettings()Lcom/smartengines/doc/DocSessionSettings;

    move-result-object v2

    const-string v3, "CreateSessionSettings(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/smartengines/targets/doc/DocSessionOptionsKt;->parse(Lcom/smartengines/doc/DocSessionSettings;)Lcom/smartengines/targets/doc/DocSessionOptions;

    move-result-object v2

    .line 30
    invoke-static {}, Lkotlin/collections/CollectionsKt;->createListBuilder()Ljava/util/List;

    move-result-object v3

    .line 32
    new-instance v7, Lcom/smartengines/app/targets/DocSection;

    .line 33
    sget-object v8, Lcom/smartengines/app/targets/DocSectionType;->TEXT_ENGINE:Lcom/smartengines/app/targets/DocSectionType;

    .line 35
    new-instance v9, Lcom/smartengines/app/targets/TreeLeaf;

    .line 36
    new-instance v10, Lcom/smartengines/utils/Name;

    const-string v11, "Text recognition (OCR)"

    const-string/jumbo v12, "\u0420\u0430\u0441\u043f\u043e\u0437\u043d\u0430\u0432\u0430\u043d\u0438\u0435 \u0442\u0435\u043a\u0441\u0442\u0430 (OCR)"

    invoke-direct {v10, v11, v12}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    sget v11, Lcom/smartengines/app/R$drawable;->home_text:I

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    .line 38
    new-instance v12, Lcom/smartengines/targets/text/TextTarget;

    invoke-direct {v12}, Lcom/smartengines/targets/text/TextTarget;-><init>()V

    move-object/from16 v16, v12

    check-cast v16, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v17, 0x3c

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 35
    invoke-direct/range {v9 .. v18}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 34
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const/4 v11, 0x2

    const/4 v9, 0x0

    .line 32
    invoke-direct/range {v7 .. v12}, Lcom/smartengines/app/targets/DocSection;-><init>(Lcom/smartengines/app/targets/DocSectionType;Lcom/smartengines/utils/Name;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x3

    .line 44
    new-array v8, v7, [Lcom/smartengines/app/targets/TreeLeaf;

    .line 45
    new-instance v9, Lcom/smartengines/targets/doc/DocTarget;

    const-string v10, "primary_accounting"

    const-string v11, "*"

    invoke-direct {v9, v10, v11}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    new-instance v13, Lcom/smartengines/utils/Name;

    const-string v12, "Primary Accounting Documents"

    const-string/jumbo v14, "\u041f\u0435\u0440\u0432\u0438\u0447\u043d\u044b\u0435 \u0431\u0443\u0445\u0433\u0430\u043b\u0442\u0435\u0440\u0441\u043a\u0438\u0435 \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u044b"

    invoke-direct {v13, v12, v14}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    sget v12, Lcom/smartengines/dictionaries/R$drawable;->accounting:I

    .line 49
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    const/16 v22, 0x0

    if-eqz v14, :cond_0

    .line 50
    invoke-virtual {v2}, Lcom/smartengines/targets/doc/DocSessionOptions;->getModes()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/smartengines/targets/doc/DocSessionOptions$Mode;

    if-eqz v14, :cond_1

    invoke-virtual {v14}, Lcom/smartengines/targets/doc/DocSessionOptions$Mode;->getDoctypesRU()Ljava/util/Set;

    move-result-object v14

    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {v2}, Lcom/smartengines/targets/doc/DocSessionOptions;->getModes()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/smartengines/targets/doc/DocSessionOptions$Mode;

    if-eqz v14, :cond_1

    invoke-virtual {v14}, Lcom/smartengines/targets/doc/DocSessionOptions$Mode;->getDoctypesEN()Ljava/util/Set;

    move-result-object v14

    goto :goto_0

    :cond_1
    move-object/from16 v14, v22

    :goto_0
    if-eqz v14, :cond_2

    .line 49
    check-cast v14, Ljava/lang/Iterable;

    .line 53
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v14

    move-object/from16 v18, v14

    goto :goto_1

    :cond_2
    move-object/from16 v18, v22

    :goto_1
    move v14, v12

    .line 44
    new-instance v12, Lcom/smartengines/app/targets/TreeLeaf;

    .line 47
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 45
    move-object/from16 v19, v9

    check-cast v19, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v20, 0xc

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    .line 44
    invoke-direct/range {v12 .. v21}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v12, v8, v5

    .line 57
    new-instance v9, Lcom/smartengines/targets/doc/DocTarget;

    const-string v12, "hiring"

    invoke-direct {v9, v12, v11}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    new-instance v13, Lcom/smartengines/utils/Name;

    const-string v14, "Personnel Documents"

    const-string/jumbo v15, "\u041a\u0430\u0434\u0440\u043e\u0432\u044b\u0435 \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u044b"

    invoke-direct {v13, v14, v15}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    sget v14, Lcom/smartengines/dictionaries/R$drawable;->document_folder:I

    .line 61
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3

    .line 62
    invoke-virtual {v2}, Lcom/smartengines/targets/doc/DocSessionOptions;->getModes()Ljava/util/Map;

    move-result-object v15

    invoke-interface {v15, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/smartengines/targets/doc/DocSessionOptions$Mode;

    if-eqz v12, :cond_4

    invoke-virtual {v12}, Lcom/smartengines/targets/doc/DocSessionOptions$Mode;->getDoctypesRU()Ljava/util/Set;

    move-result-object v12

    goto :goto_2

    .line 64
    :cond_3
    invoke-virtual {v2}, Lcom/smartengines/targets/doc/DocSessionOptions;->getModes()Ljava/util/Map;

    move-result-object v15

    invoke-interface {v15, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/smartengines/targets/doc/DocSessionOptions$Mode;

    if-eqz v12, :cond_4

    invoke-virtual {v12}, Lcom/smartengines/targets/doc/DocSessionOptions$Mode;->getDoctypesEN()Ljava/util/Set;

    move-result-object v12

    goto :goto_2

    :cond_4
    move-object/from16 v12, v22

    :goto_2
    if-eqz v12, :cond_5

    .line 61
    check-cast v12, Ljava/lang/Iterable;

    .line 65
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v12

    move-object/from16 v29, v12

    goto :goto_3

    :cond_5
    move-object/from16 v29, v22

    .line 56
    :goto_3
    new-instance v23, Lcom/smartengines/app/targets/TreeLeaf;

    .line 59
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v25

    .line 57
    move-object/from16 v30, v9

    check-cast v30, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v31, 0xc

    const/16 v32, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x1

    move-object/from16 v24, v13

    .line 56
    invoke-direct/range {v23 .. v32}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v23, v8, v4

    .line 68
    new-instance v9, Lcom/smartengines/targets/doc/DocTarget;

    const-string v12, "legal_entity_pack"

    invoke-direct {v9, v12, v11}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    new-instance v13, Lcom/smartengines/utils/Name;

    const-string v14, "Legal Entity Documents"

    const-string/jumbo v15, "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u044b \u044e\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043a\u0438\u0445 \u043b\u0438\u0446 \u0438 \u0418\u041f"

    invoke-direct {v13, v14, v15}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    sget v14, Lcom/smartengines/dictionaries/R$drawable;->owner_register:I

    .line 72
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 73
    invoke-virtual {v2}, Lcom/smartengines/targets/doc/DocSessionOptions;->getModes()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/targets/doc/DocSessionOptions$Mode;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/smartengines/targets/doc/DocSessionOptions$Mode;->getDoctypesRU()Ljava/util/Set;

    move-result-object v0

    goto :goto_4

    .line 75
    :cond_6
    invoke-virtual {v2}, Lcom/smartengines/targets/doc/DocSessionOptions;->getModes()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/targets/doc/DocSessionOptions$Mode;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/smartengines/targets/doc/DocSessionOptions$Mode;->getDoctypesEN()Ljava/util/Set;

    move-result-object v0

    goto :goto_4

    :cond_7
    move-object/from16 v0, v22

    :goto_4
    if-eqz v0, :cond_8

    .line 72
    check-cast v0, Ljava/lang/Iterable;

    .line 76
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v22

    :cond_8
    move-object/from16 v29, v22

    .line 67
    new-instance v23, Lcom/smartengines/app/targets/TreeLeaf;

    .line 70
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v25

    .line 68
    move-object/from16 v30, v9

    check-cast v30, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v31, 0xc

    const/16 v32, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x1

    move-object/from16 v24, v13

    .line 67
    invoke-direct/range {v23 .. v32}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v23, v8, v1

    .line 43
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 169
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .line 170
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const-string v9, "null cannot be cast to non-null type com.smartengines.targets.doc.DocTarget"

    if-eqz v8, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, Lcom/smartengines/app/targets/TreeLeaf;

    .line 79
    invoke-virtual {v2}, Lcom/smartengines/targets/doc/DocSessionOptions;->getModes()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v13

    invoke-virtual {v12}, Lcom/smartengines/app/targets/TreeLeaf;->getTarget()Lcom/smartengines/engine/RecognitionTarget;

    move-result-object v12

    invoke-static {v12, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Lcom/smartengines/targets/doc/DocTarget;

    invoke-virtual {v12}, Lcom/smartengines/targets/doc/DocTarget;->getMode()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v13, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 170
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 171
    :cond_a
    check-cast v6, Ljava/util/List;

    .line 82
    move-object v0, v6

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    .line 83
    new-instance v0, Lcom/smartengines/app/targets/DocSection;

    .line 84
    sget-object v8, Lcom/smartengines/app/targets/DocSectionType;->AUTO_SELECT:Lcom/smartengines/app/targets/DocSectionType;

    .line 85
    new-instance v12, Lcom/smartengines/utils/Name;

    const-string v13, "Autoselect"

    const-string/jumbo v14, "\u0410\u0432\u0442\u043e\u0432\u044b\u0431\u043e\u0440"

    invoke-direct {v12, v13, v14}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    invoke-direct {v0, v8, v12, v6}, Lcom/smartengines/app/targets/DocSection;-><init>(Lcom/smartengines/app/targets/DocSectionType;Lcom/smartengines/utils/Name;Ljava/util/List;)V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    const/16 v0, 0xb

    .line 91
    new-array v0, v0, [Lcom/smartengines/app/targets/TreeLeaf;

    .line 92
    new-instance v6, Lcom/smartengines/targets/doc/DocTarget;

    const-string v8, "rus.2ndfl.type1"

    invoke-direct {v6, v10, v8}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    new-instance v13, Lcom/smartengines/utils/Name;

    const-string v8, "Personal income form"

    const-string/jumbo v12, "\u0421\u043f\u0440\u0430\u0432\u043a\u0430 \u043e \u0434\u043e\u0445\u043e\u0434\u0430\u0445 \u0438 \u0441\u0443\u043c\u043c\u0430\u0445 \u043d\u0430\u043b\u043e\u0433\u0430 \u0444\u0438\u0437\u0438\u0447\u0435\u0441\u043a\u043e\u0433\u043e \u043b\u0438\u0446\u0430 (2\u041d\u0414\u0424\u041b)"

    invoke-direct {v13, v8, v12}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    sget v8, Lcom/smartengines/dictionaries/R$drawable;->taxes:I

    .line 91
    new-instance v12, Lcom/smartengines/app/targets/TreeLeaf;

    .line 94
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 92
    move-object/from16 v19, v6

    check-cast v19, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v20, 0x3c

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 91
    invoke-direct/range {v12 .. v21}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v12, v0, v5

    .line 97
    new-instance v5, Lcom/smartengines/targets/doc/DocTarget;

    const-string v6, "rus.act.type1"

    invoke-direct {v5, v10, v6}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    new-instance v13, Lcom/smartengines/utils/Name;

    const-string v6, "Certificate"

    const-string/jumbo v8, "\u0410\u043a\u0442"

    invoke-direct {v13, v6, v8}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    sget v6, Lcom/smartengines/dictionaries/R$drawable;->taxes:I

    .line 96
    new-instance v12, Lcom/smartengines/app/targets/TreeLeaf;

    .line 99
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 97
    move-object/from16 v19, v5

    check-cast v19, Lcom/smartengines/engine/RecognitionTarget;

    .line 96
    invoke-direct/range {v12 .. v21}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v12, v0, v4

    .line 102
    new-instance v4, Lcom/smartengines/targets/doc/DocTarget;

    const-string v5, "rus.invoice.type1"

    invoke-direct {v4, v10, v5}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    new-instance v13, Lcom/smartengines/utils/Name;

    const-string v5, "Payment bill"

    const-string/jumbo v6, "\u0421\u0447\u0451\u0442"

    invoke-direct {v13, v5, v6}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    sget v5, Lcom/smartengines/dictionaries/R$drawable;->taxes:I

    .line 101
    new-instance v12, Lcom/smartengines/app/targets/TreeLeaf;

    .line 104
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 102
    move-object/from16 v19, v4

    check-cast v19, Lcom/smartengines/engine/RecognitionTarget;

    .line 101
    invoke-direct/range {v12 .. v21}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v12, v0, v1

    .line 107
    new-instance v1, Lcom/smartengines/targets/doc/DocTarget;

    const-string v4, "inn"

    invoke-direct {v1, v4, v11}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    new-instance v13, Lcom/smartengines/utils/Name;

    const-string v4, "TIN"

    const-string/jumbo v5, "\u0418\u041d\u041d"

    invoke-direct {v13, v4, v5}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    sget v4, Lcom/smartengines/dictionaries/R$drawable;->owner_register:I

    .line 106
    new-instance v12, Lcom/smartengines/app/targets/TreeLeaf;

    .line 109
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 107
    move-object/from16 v19, v1

    check-cast v19, Lcom/smartengines/engine/RecognitionTarget;

    .line 106
    invoke-direct/range {v12 .. v21}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v12, v0, v7

    .line 112
    new-instance v1, Lcom/smartengines/targets/doc/DocTarget;

    const-string v4, "rus.torg12.type1"

    invoke-direct {v1, v10, v4}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    new-instance v13, Lcom/smartengines/utils/Name;

    const-string v4, "TORG-12 form"

    const-string/jumbo v5, "\u0422\u043e\u0432\u0430\u0440\u043d\u0430\u044f \u043d\u0430\u043a\u043b\u0430\u0434\u043d\u0430\u044f \u0422\u041e\u0420\u0413-12"

    invoke-direct {v13, v4, v5}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    sget v4, Lcom/smartengines/dictionaries/R$drawable;->taxes:I

    .line 111
    new-instance v12, Lcom/smartengines/app/targets/TreeLeaf;

    .line 114
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 112
    move-object/from16 v19, v1

    check-cast v19, Lcom/smartengines/engine/RecognitionTarget;

    .line 111
    invoke-direct/range {v12 .. v21}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x4

    aput-object v12, v0, v1

    .line 117
    new-instance v1, Lcom/smartengines/targets/doc/DocTarget;

    const-string v4, "rus.upd.type1"

    invoke-direct {v1, v10, v4}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    new-instance v13, Lcom/smartengines/utils/Name;

    const-string/jumbo v4, "\u0423\u041f\u0414"

    const-string v5, "Universal transfer document"

    invoke-direct {v13, v5, v4}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    sget v4, Lcom/smartengines/dictionaries/R$drawable;->accounting:I

    .line 116
    new-instance v12, Lcom/smartengines/app/targets/TreeLeaf;

    .line 119
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 117
    move-object/from16 v19, v1

    check-cast v19, Lcom/smartengines/engine/RecognitionTarget;

    .line 116
    invoke-direct/range {v12 .. v21}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x5

    aput-object v12, v0, v1

    .line 122
    new-instance v1, Lcom/smartengines/targets/doc/DocTarget;

    const-string v4, "rus.egrip.type1"

    invoke-direct {v1, v10, v4}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    new-instance v13, Lcom/smartengines/utils/Name;

    const-string v4, "EGRIP record"

    const-string/jumbo v6, "\u0412\u044b\u043f\u0438\u0441\u043a\u0430 \u0415\u0413\u0420\u0418\u041f"

    invoke-direct {v13, v4, v6}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    sget v4, Lcom/smartengines/dictionaries/R$drawable;->accounting:I

    .line 121
    new-instance v12, Lcom/smartengines/app/targets/TreeLeaf;

    .line 124
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 122
    move-object/from16 v19, v1

    check-cast v19, Lcom/smartengines/engine/RecognitionTarget;

    .line 121
    invoke-direct/range {v12 .. v21}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x6

    aput-object v12, v0, v1

    .line 127
    new-instance v1, Lcom/smartengines/targets/doc/DocTarget;

    const-string v4, "rus.egrul.type1"

    invoke-direct {v1, v10, v4}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    new-instance v13, Lcom/smartengines/utils/Name;

    const-string/jumbo v4, "\u0412\u044b\u043f\u0438\u0441\u043a\u0430 \u0415\u0413\u0420\u042e\u041b"

    invoke-direct {v13, v5, v4}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    sget v4, Lcom/smartengines/dictionaries/R$drawable;->accounting:I

    .line 126
    new-instance v12, Lcom/smartengines/app/targets/TreeLeaf;

    .line 129
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 127
    move-object/from16 v19, v1

    check-cast v19, Lcom/smartengines/engine/RecognitionTarget;

    .line 126
    invoke-direct/range {v12 .. v21}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x7

    aput-object v12, v0, v1

    .line 132
    new-instance v1, Lcom/smartengines/targets/doc/DocTarget;

    const-string/jumbo v4, "snils_adireg"

    invoke-direct {v1, v4, v11}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    new-instance v13, Lcom/smartengines/utils/Name;

    const-string v4, "SNILS/ADI-REG"

    const-string/jumbo v5, "\u0421\u041d\u0418\u041b\u0421/\u0410\u0414\u0418-\u0420\u0415\u0413 "

    invoke-direct {v13, v4, v5}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    sget v4, Lcom/smartengines/dictionaries/R$drawable;->document_folder:I

    .line 131
    new-instance v12, Lcom/smartengines/app/targets/TreeLeaf;

    .line 134
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 132
    move-object/from16 v19, v1

    check-cast v19, Lcom/smartengines/engine/RecognitionTarget;

    .line 131
    invoke-direct/range {v12 .. v21}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x8

    aput-object v12, v0, v1

    .line 137
    new-instance v1, Lcom/smartengines/targets/doc/DocTarget;

    const-string v4, "rus.epts.type1"

    const-string v5, "default"

    invoke-direct {v1, v5, v4}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    new-instance v11, Lcom/smartengines/utils/Name;

    const-string v4, "Electronic Vehicle Passport"

    const-string/jumbo v6, "\u042d\u041f\u0422\u0421"

    invoke-direct {v11, v4, v6}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    sget v4, Lcom/smartengines/dictionaries/R$drawable;->document_folder:I

    .line 136
    new-instance v10, Lcom/smartengines/app/targets/TreeLeaf;

    .line 139
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 137
    move-object/from16 v17, v1

    check-cast v17, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v18, 0x3c

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    .line 136
    invoke-direct/range {v10 .. v19}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x9

    aput-object v10, v0, v1

    .line 142
    new-instance v1, Lcom/smartengines/targets/doc/DocTarget;

    const-string v4, "rus.epsm.type1"

    invoke-direct {v1, v5, v4}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    new-instance v11, Lcom/smartengines/utils/Name;

    const-string v4, "Electronic Self-Propelled Vehicle Passport"

    const-string/jumbo v5, "\u042d\u041f\u0421\u041c"

    invoke-direct {v11, v4, v5}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    sget v4, Lcom/smartengines/dictionaries/R$drawable;->document_folder:I

    .line 141
    new-instance v10, Lcom/smartengines/app/targets/TreeLeaf;

    .line 144
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 142
    move-object/from16 v17, v1

    check-cast v17, Lcom/smartengines/engine/RecognitionTarget;

    .line 141
    invoke-direct/range {v10 .. v19}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0xa

    aput-object v10, v0, v1

    .line 90
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 172
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 173
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/smartengines/app/targets/TreeLeaf;

    .line 147
    invoke-virtual {v2}, Lcom/smartengines/targets/doc/DocSessionOptions;->getModes()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-virtual {v5}, Lcom/smartengines/app/targets/TreeLeaf;->getTarget()Lcom/smartengines/engine/RecognitionTarget;

    move-result-object v5

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/smartengines/targets/doc/DocTarget;

    invoke-virtual {v5}, Lcom/smartengines/targets/doc/DocTarget;->getMode()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 173
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 174
    :cond_d
    check-cast v1, Ljava/util/List;

    .line 150
    move-object v0, v1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    .line 151
    new-instance v0, Lcom/smartengines/app/targets/DocSection;

    .line 152
    sget-object v2, Lcom/smartengines/app/targets/DocSectionType;->POPULAR_DOCUMENTS:Lcom/smartengines/app/targets/DocSectionType;

    .line 153
    new-instance v4, Lcom/smartengines/utils/Name;

    const-string v5, "Popular Documents"

    const-string/jumbo v6, "\u041f\u043e\u043f\u0443\u043b\u044f\u0440\u043d\u044b\u0435 \u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u044b"

    invoke-direct {v4, v5, v6}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    invoke-direct {v0, v2, v4, v1}, Lcom/smartengines/app/targets/DocSection;-><init>(Lcom/smartengines/app/targets/DocSectionType;Lcom/smartengines/utils/Name;Ljava/util/List;)V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    :cond_e
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->build(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
