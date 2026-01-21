.class public final Lcom/smartengines/engine/doc/DocResultNamesFillerKt;
.super Ljava/lang/Object;
.source "DocResultNamesFiller.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDocResultNamesFiller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocResultNamesFiller.kt\ncom/smartengines/engine/doc/DocResultNamesFillerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,71:1\n1557#2:72\n1628#2,3:73\n1246#2,4:78\n1246#2,4:84\n1246#2,4:90\n462#3:76\n412#3:77\n462#3:82\n412#3:83\n462#3:88\n412#3:89\n*S KotlinDebug\n*F\n+ 1 DocResultNamesFiller.kt\ncom/smartengines/engine/doc/DocResultNamesFillerKt\n*L\n11#1:72\n11#1:73,3\n20#1:78,4\n21#1:84,4\n22#1:90,4\n20#1:76\n20#1:77\n21#1:82\n21#1:83\n22#1:88\n22#1:89\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a \u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0002\u001a\u000c\u0010\u000b\u001a\u00020\u000c*\u00020\rH\u0002\u001a\u0018\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008*\u00020\rH\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "fillNames",
        "Lcom/smartengines/engine/doc/DocResultData;",
        "docSessionSettings",
        "Lcom/smartengines/doc/DocSessionSettings;",
        "Lcom/smartengines/engine/doc/DocumentData;",
        "fillName",
        "Lcom/smartengines/engine/doc/FieldInfo;",
        "dictionary",
        "",
        "",
        "Lcom/smartengines/engine/doc/SessionFieldInfo;",
        "parseDocName",
        "Lcom/smartengines/engine/doc/DocName;",
        "Lcom/smartengines/doc/DocDocumentInfo;",
        "parseFieldInfos",
        "engine_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final fillName(Lcom/smartengines/engine/doc/FieldInfo;Ljava/util/Map;)Lcom/smartengines/engine/doc/FieldInfo;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/engine/doc/FieldInfo;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/engine/doc/SessionFieldInfo;",
            ">;)",
            "Lcom/smartengines/engine/doc/FieldInfo;"
        }
    .end annotation

    .line 27
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/FieldInfo;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/smartengines/engine/doc/SessionFieldInfo;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/smartengines/engine/doc/SessionFieldInfo;->getName()Lcom/smartengines/engine/doc/DocName;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v2, p1

    const/16 v7, 0x1d

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    .line 26
    invoke-static/range {v0 .. v8}, Lcom/smartengines/engine/doc/FieldInfo;->copy$default(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/String;Lcom/smartengines/engine/doc/DocName;DZLjava/util/Map;ILjava/lang/Object;)Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object p0

    return-object p0
.end method

.method public static final fillNames(Lcom/smartengines/engine/doc/DocResultData;Lcom/smartengines/doc/DocSessionSettings;)Lcom/smartengines/engine/doc/DocResultData;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "docSessionSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/DocResultData;->getDocuments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 72
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 73
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 74
    check-cast v2, Lcom/smartengines/engine/doc/DocumentData;

    .line 11
    invoke-static {v2, p1}, Lcom/smartengines/engine/doc/DocResultNamesFillerKt;->fillNames(Lcom/smartengines/engine/doc/DocumentData;Lcom/smartengines/doc/DocSessionSettings;)Lcom/smartengines/engine/doc/DocumentData;

    move-result-object v2

    .line 74
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 75
    :cond_0
    check-cast v1, Ljava/util/List;

    const/4 p1, 0x2

    const/4 v0, 0x0

    .line 10
    invoke-static {p0, v1, v0, p1, v0}, Lcom/smartengines/engine/doc/DocResultData;->copy$default(Lcom/smartengines/engine/doc/DocResultData;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/smartengines/engine/doc/DocResultData;

    move-result-object p0

    return-object p0
.end method

.method private static final fillNames(Lcom/smartengines/engine/doc/DocumentData;Lcom/smartengines/doc/DocSessionSettings;)Lcom/smartengines/engine/doc/DocumentData;
    .locals 16

    .line 16
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getType()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/smartengines/doc/DocSessionSettings;->GetDocumentInfo(Ljava/lang/String;)Lcom/smartengines/doc/DocDocumentInfo;

    move-result-object v0

    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/smartengines/engine/doc/DocResultNamesFillerKt;->parseFieldInfos(Lcom/smartengines/doc/DocDocumentInfo;)Ljava/util/Map;

    move-result-object v1

    .line 19
    invoke-static {v0}, Lcom/smartengines/engine/doc/DocResultNamesFillerKt;->parseDocName(Lcom/smartengines/doc/DocDocumentInfo;)Lcom/smartengines/engine/doc/DocName;

    move-result-object v5

    .line 20
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getTexts()Ljava/util/Map;

    move-result-object v0

    .line 76
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    move-object v7, v2

    check-cast v7, Ljava/util/Map;

    .line 77
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 78
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 79
    check-cast v2, Ljava/util/Map$Entry;

    .line 77
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    .line 20
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/smartengines/engine/doc/TextField;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/engine/doc/TextField;

    invoke-virtual {v2}, Lcom/smartengines/engine/doc/TextField;->getInfo()Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/smartengines/engine/doc/DocResultNamesFillerKt;->fillName(Lcom/smartengines/engine/doc/FieldInfo;Ljava/util/Map;)Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v2

    invoke-static {v8, v2, v4, v3, v4}, Lcom/smartengines/engine/doc/TextField;->copy$default(Lcom/smartengines/engine/doc/TextField;Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/String;ILjava/lang/Object;)Lcom/smartengines/engine/doc/TextField;

    move-result-object v2

    .line 79
    invoke-interface {v7, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getTables()Ljava/util/Map;

    move-result-object v0

    .line 82
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v6

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v6

    invoke-direct {v2, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    move-object v8, v2

    check-cast v8, Ljava/util/Map;

    .line 83
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 84
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 85
    check-cast v2, Ljava/util/Map$Entry;

    .line 83
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    .line 21
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/smartengines/engine/doc/TableField;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/engine/doc/TableField;

    invoke-virtual {v2}, Lcom/smartengines/engine/doc/TableField;->getInfo()Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/smartengines/engine/doc/DocResultNamesFillerKt;->fillName(Lcom/smartengines/engine/doc/FieldInfo;Ljava/util/Map;)Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v11

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/smartengines/engine/doc/TableField;->copy$default(Lcom/smartengines/engine/doc/TableField;Lcom/smartengines/engine/doc/FieldInfo;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/smartengines/engine/doc/TableField;

    move-result-object v2

    .line 85
    invoke-interface {v8, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 22
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getImages()Ljava/util/Map;

    move-result-object v0

    .line 88
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v6

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v6

    invoke-direct {v2, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    move-object v9, v2

    check-cast v9, Ljava/util/Map;

    .line 89
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 90
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 91
    check-cast v2, Ljava/util/Map$Entry;

    .line 89
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    .line 22
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/smartengines/engine/doc/ImageField;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/engine/doc/ImageField;

    invoke-virtual {v2}, Lcom/smartengines/engine/doc/ImageField;->getInfo()Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/smartengines/engine/doc/DocResultNamesFillerKt;->fillName(Lcom/smartengines/engine/doc/FieldInfo;Ljava/util/Map;)Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v2

    invoke-static {v10, v2, v4, v3, v4}, Lcom/smartengines/engine/doc/ImageField;->copy$default(Lcom/smartengines/engine/doc/ImageField;Lcom/smartengines/engine/doc/FieldInfo;Landroid/graphics/Bitmap;ILjava/lang/Object;)Lcom/smartengines/engine/doc/ImageField;

    move-result-object v2

    .line 91
    invoke-interface {v9, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    const/16 v11, 0x8b

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    move-object/from16 v2, p0

    .line 18
    invoke-static/range {v2 .. v12}, Lcom/smartengines/engine/doc/DocumentData;->copy$default(Lcom/smartengines/engine/doc/DocumentData;ILjava/lang/String;Lcom/smartengines/engine/doc/DocName;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/smartengines/engine/doc/PhysicalDocumentData;ILjava/lang/Object;)Lcom/smartengines/engine/doc/DocumentData;

    move-result-object v0

    return-object v0
.end method

.method private static final parseDocName(Lcom/smartengines/doc/DocDocumentInfo;)Lcom/smartengines/engine/doc/DocName;
    .locals 4

    .line 34
    new-instance v0, Lcom/smartengines/engine/doc/DocName;

    .line 35
    invoke-virtual {p0}, Lcom/smartengines/doc/DocDocumentInfo;->GetDocumentName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "GetDocumentName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p0}, Lcom/smartengines/doc/DocDocumentInfo;->GetDocumentNameLocal()Ljava/lang/String;

    move-result-object v2

    const-string v3, "GetDocumentNameLocal(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p0}, Lcom/smartengines/doc/DocDocumentInfo;->GetDocumentShortNameLocal()Ljava/lang/String;

    move-result-object p0

    const-string v3, "GetDocumentShortNameLocal(...)"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {v0, v1, v2, p0}, Lcom/smartengines/engine/doc/DocName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final parseFieldInfos(Lcom/smartengines/doc/DocDocumentInfo;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/doc/DocDocumentInfo;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/engine/doc/SessionFieldInfo;",
            ">;"
        }
    .end annotation

    .line 47
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 48
    invoke-virtual {p0}, Lcom/smartengines/doc/DocDocumentInfo;->DocumentFieldsInfoBegin()Lcom/smartengines/doc/DocDocumentFieldsInfoIterator;

    move-result-object v1

    .line 49
    invoke-virtual {p0}, Lcom/smartengines/doc/DocDocumentInfo;->DocumentFieldsInfoEnd()Lcom/smartengines/doc/DocDocumentFieldsInfoIterator;

    move-result-object p0

    .line 50
    :goto_0
    invoke-virtual {v1, p0}, Lcom/smartengines/doc/DocDocumentFieldsInfoIterator;->Equals(Lcom/smartengines/doc/DocDocumentFieldsInfoIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 51
    invoke-virtual {v1}, Lcom/smartengines/doc/DocDocumentFieldsInfoIterator;->GetDocumentFieldInfo()Lcom/smartengines/doc/DocDocumentFieldInfo;

    move-result-object v2

    .line 53
    invoke-virtual {v1}, Lcom/smartengines/doc/DocDocumentFieldsInfoIterator;->GetKey()Ljava/lang/String;

    move-result-object v3

    .line 54
    new-instance v4, Lcom/smartengines/engine/doc/SessionFieldInfo;

    .line 55
    new-instance v5, Lcom/smartengines/engine/doc/DocName;

    .line 56
    invoke-virtual {v2}, Lcom/smartengines/doc/DocDocumentFieldInfo;->GetDocumentFieldName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "GetDocumentFieldName(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-virtual {v2}, Lcom/smartengines/doc/DocDocumentFieldInfo;->GetDocumentFieldNameLocal()Ljava/lang/String;

    move-result-object v7

    const-string v8, "GetDocumentFieldNameLocal(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-virtual {v2}, Lcom/smartengines/doc/DocDocumentFieldInfo;->GetDocumentFieldShortNameLocal()Ljava/lang/String;

    move-result-object v8

    const-string v9, "GetDocumentFieldShortNameLocal(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-direct {v5, v6, v7, v8}, Lcom/smartengines/engine/doc/DocName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    invoke-virtual {v2}, Lcom/smartengines/doc/DocDocumentFieldInfo;->GetDocumentFieldType()Ljava/lang/String;

    move-result-object v6

    const-string v7, "GetDocumentFieldType(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-virtual {v2}, Lcom/smartengines/doc/DocDocumentFieldInfo;->GetDocumentFieldFormat()Ljava/lang/String;

    move-result-object v7

    const-string v8, "GetDocumentFieldFormat(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-virtual {v2}, Lcom/smartengines/doc/DocDocumentFieldInfo;->GetDocumentFieldExtFormat()Ljava/lang/String;

    move-result-object v2

    const-string v8, "GetDocumentFieldExtFormat(...)"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-direct {v4, v5, v6, v7, v2}, Lcom/smartengines/engine/doc/SessionFieldInfo;-><init>(Lcom/smartengines/engine/doc/DocName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/engine/doc/SessionFieldInfo;

    .line 66
    invoke-virtual {v1}, Lcom/smartengines/doc/DocDocumentFieldsInfoIterator;->Advance()V

    goto :goto_0

    .line 47
    :cond_0
    check-cast v0, Ljava/util/Map;

    return-object v0
.end method
