.class public final Lcom/smartengines/app/targets/IdTargetsKt;
.super Ljava/lang/Object;
.source "IdTargets.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIdTargets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdTargets.kt\ncom/smartengines/app/targets/IdTargetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1863#2,2:259\n774#2:262\n865#2,2:263\n1053#2:266\n1863#2:267\n1864#2:269\n1863#2,2:270\n216#3:261\n217#3:265\n216#3,2:272\n1#4:268\n*S KotlinDebug\n*F\n+ 1 IdTargets.kt\ncom/smartengines/app/targets/IdTargetsKt\n*L\n53#1:259,2\n104#1:262\n104#1:263,2\n137#1:266\n142#1:267\n142#1:269\n179#1:270,2\n92#1:261\n92#1:265\n187#1:272,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u001a&\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\t\u001a\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u000c\u001a\u00020\rH\u0002\u001a\u0014\u0010\u0012\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0002\u001a2\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\r2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002\u001a\u000c\u0010\u001b\u001a\u00020\u001c*\u00020\u001aH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "TAG",
        "",
        "loadIdTargetList",
        "Lcom/smartengines/app/targets/TreeItem;",
        "context",
        "Landroid/content/Context;",
        "idEngine",
        "Lcom/smartengines/id/IdEngine;",
        "stat",
        "Lcom/smartengines/targets/DocumentTypesStatistics;",
        "loadCountryList",
        "",
        "sessionSettings",
        "Lcom/smartengines/targets/id/IdSessionOptions;",
        "statistics",
        "checkTargetValidity",
        "",
        "Lcom/smartengines/targets/id/IdTarget;",
        "containsDocumentsForMask",
        "Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;",
        "mask",
        "loadCountryListItems",
        "Lcom/smartengines/app/targets/TreeLeaf;",
        "country",
        "documentTypesDictionary",
        "",
        "Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;",
        "getName",
        "Lcom/smartengines/utils/Name;",
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
.field private static final TAG:Ljava/lang/String; = "myapp.IdTargets"


# direct methods
.method public static synthetic $r8$lambda$1B542F0nAhX5agnAjcQmlwrdS1I(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/targets/TreeLeaf;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/targets/IdTargetsKt;->loadCountryListItems$lambda$20(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/targets/TreeLeaf;)I

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$e76qNIpJAYiPPVGHJ9HyMRhnKvA(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/targets/IdTargetsKt;->loadCountryListItems$lambda$21(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private static final checkTargetValidity(Lcom/smartengines/targets/id/IdTarget;Lcom/smartengines/targets/id/IdSessionOptions;)Z
    .locals 5

    .line 141
    invoke-virtual {p1}, Lcom/smartengines/targets/id/IdSessionOptions;->getModes()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0}, Lcom/smartengines/targets/id/IdTarget;->getMode()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/smartengines/targets/id/IdSessionOptions$Mode;

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 142
    invoke-virtual {p0}, Lcom/smartengines/targets/id/IdTarget;->getEnabledMasks()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 267
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 144
    invoke-virtual {p1}, Lcom/smartengines/targets/id/IdSessionOptions$Mode;->getInternalEngines()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;

    .line 145
    invoke-static {v4, v1}, Lcom/smartengines/app/targets/IdTargetsKt;->containsDocumentsForMask(Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    .line 144
    :goto_0
    check-cast v3, Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;

    if-nez v3, :cond_0

    return v0

    :cond_3
    const/4 p0, 0x1

    return p0

    :cond_4
    return v0
.end method

.method private static final containsDocumentsForMask(Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;Ljava/lang/String;)Z
    .locals 5

    .line 153
    const-string v0, "*"

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 154
    invoke-virtual {p0}, Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;->getSupportedDocumentTypes()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x2

    invoke-static {v3, p1, v1, v4, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    :cond_1
    if-eqz v2, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method private static final getName(Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;)Lcom/smartengines/utils/Name;
    .locals 3

    .line 256
    new-instance v0, Lcom/smartengines/utils/Name;

    invoke-virtual {p0}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;->getName()Ljava/util/Map;

    move-result-object v1

    const-string v2, "en"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;->getName()Ljava/util/Map;

    move-result-object p0

    const-string v2, "ru"

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p0, Ljava/lang/String;

    invoke-direct {v0, v1, p0}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final loadCountryList(Landroid/content/Context;Lcom/smartengines/targets/id/IdSessionOptions;Lcom/smartengines/targets/DocumentTypesStatistics;)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/smartengines/targets/id/IdSessionOptions;",
            "Lcom/smartengines/targets/DocumentTypesStatistics;",
            ")",
            "Ljava/util/List<",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "context"

    move-object/from16 v3, p0

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "sessionSettings"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    sget-object v2, Lcom/smartengines/dictionaries/Issuers;->INSTANCE:Lcom/smartengines/dictionaries/Issuers;

    invoke-virtual {v2}, Lcom/smartengines/dictionaries/Issuers;->loadDictionary()Ljava/util/Map;

    move-result-object v2

    .line 85
    sget-object v3, Lcom/smartengines/dictionaries/IdDocTypesNoRus;->INSTANCE:Lcom/smartengines/dictionaries/IdDocTypesNoRus;

    invoke-virtual {v3}, Lcom/smartengines/dictionaries/IdDocTypesNoRus;->loadDictionary()Ljava/util/Map;

    move-result-object v3

    if-eqz v1, :cond_0

    .line 87
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/smartengines/targets/DocumentTypesStatistics;->setDictionary(Ljava/util/Set;)V

    .line 89
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 261
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 92
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/smartengines/dictionaries/Issuers$Issuer;

    .line 93
    const-string v6, "rus"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 100
    new-instance v8, Lcom/smartengines/utils/Name;

    invoke-virtual {v4}, Lcom/smartengines/dictionaries/Issuers$Issuer;->getName()Ljava/util/Map;

    move-result-object v5

    invoke-direct {v8, v5}, Lcom/smartengines/utils/Name;-><init>(Ljava/util/Map;)V

    .line 101
    invoke-virtual {v4}, Lcom/smartengines/dictionaries/Issuers$Issuer;->getAltName()Ljava/lang/String;

    move-result-object v12

    .line 102
    invoke-virtual {v4}, Lcom/smartengines/dictionaries/Issuers$Issuer;->getIcon()I

    move-result v4

    .line 103
    sget-object v5, Lcom/smartengines/app/targets/IdTargetsRus;->INSTANCE:Lcom/smartengines/app/targets/IdTargetsRus;

    invoke-virtual {v5}, Lcom/smartengines/app/targets/IdTargetsRus;->getList()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 262
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .line 263
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Lcom/smartengines/app/targets/TreeLeaf;

    .line 105
    invoke-virtual {v9}, Lcom/smartengines/app/targets/TreeLeaf;->getTarget()Lcom/smartengines/engine/RecognitionTarget;

    move-result-object v10

    instance-of v10, v10, Lcom/smartengines/targets/id/IdTarget;

    if-eqz v10, :cond_3

    .line 106
    invoke-virtual {v9}, Lcom/smartengines/app/targets/TreeLeaf;->getTarget()Lcom/smartengines/engine/RecognitionTarget;

    move-result-object v9

    check-cast v9, Lcom/smartengines/targets/id/IdTarget;

    invoke-static {v9, v0}, Lcom/smartengines/app/targets/IdTargetsKt;->checkTargetValidity(Lcom/smartengines/targets/id/IdTarget;Lcom/smartengines/targets/id/IdSessionOptions;)Z

    move-result v9

    goto :goto_2

    :cond_3
    const/4 v9, 0x0

    :goto_2
    if-eqz v9, :cond_2

    .line 263
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 264
    :cond_4
    move-object v10, v6

    check-cast v10, Ljava/util/List;

    .line 99
    new-instance v7, Lcom/smartengines/app/targets/TreeGroup;

    .line 102
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/16 v14, 0x28

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    .line 99
    invoke-direct/range {v7 .. v15}, Lcom/smartengines/app/targets/TreeGroup;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Lcom/smartengines/app/targets/TreeGroupViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 98
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 115
    :cond_5
    invoke-static {v5, v0, v3}, Lcom/smartengines/app/targets/IdTargetsKt;->loadCountryListItems(Ljava/lang/String;Lcom/smartengines/targets/id/IdSessionOptions;Ljava/util/Map;)Ljava/util/List;

    move-result-object v11

    .line 122
    move-object v5, v11

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    .line 125
    new-instance v9, Lcom/smartengines/utils/Name;

    invoke-virtual {v4}, Lcom/smartengines/dictionaries/Issuers$Issuer;->getName()Ljava/util/Map;

    move-result-object v5

    invoke-direct {v9, v5}, Lcom/smartengines/utils/Name;-><init>(Ljava/util/Map;)V

    .line 126
    invoke-virtual {v4}, Lcom/smartengines/dictionaries/Issuers$Issuer;->getAltName()Ljava/lang/String;

    move-result-object v13

    .line 127
    invoke-virtual {v4}, Lcom/smartengines/dictionaries/Issuers$Issuer;->getIcon()I

    move-result v4

    .line 124
    new-instance v8, Lcom/smartengines/app/targets/TreeGroup;

    .line 127
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v15, 0x28

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    .line 124
    invoke-direct/range {v8 .. v16}, Lcom/smartengines/app/targets/TreeGroup;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Lcom/smartengines/app/targets/TreeGroupViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 123
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 89
    :cond_6
    check-cast v1, Ljava/lang/Iterable;

    .line 266
    new-instance v0, Lcom/smartengines/app/targets/IdTargetsKt$loadCountryList$$inlined$sortedBy$1;

    invoke-direct {v0}, Lcom/smartengines/app/targets/IdTargetsKt$loadCountryList$$inlined$sortedBy$1;-><init>()V

    check-cast v0, Ljava/util/Comparator;

    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final loadCountryListItems(Ljava/lang/String;Lcom/smartengines/targets/id/IdSessionOptions;Ljava/util/Map;)Ljava/util/List;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/smartengines/targets/id/IdSessionOptions;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/smartengines/app/targets/TreeLeaf;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 165
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    .line 172
    const-string/jumbo v3, "usa"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/String;

    aput-object v0, v4, v8

    const-string/jumbo v9, "usa.medcard"

    aput-object v9, v4, v6

    const-string/jumbo v6, "usa.vrc"

    aput-object v6, v4, v7

    const-string/jumbo v6, "usa.naturalization_certificate"

    aput-object v6, v4, v5

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    goto :goto_0

    .line 173
    :cond_0
    const-string v4, "eue"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    new-array v4, v5, [Ljava/lang/String;

    aput-object v0, v4, v8

    const-string v5, "eue.medcard"

    aput-object v5, v4, v6

    const-string v5, "eue.payslip"

    aput-object v5, v4, v7

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    goto :goto_0

    .line 174
    :cond_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 178
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/List;

    .line 179
    check-cast v4, Ljava/lang/Iterable;

    .line 270
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v9, "default"

    if-eqz v6, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 180
    invoke-virtual/range {p1 .. p1}, Lcom/smartengines/targets/id/IdSessionOptions;->getModes()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/smartengines/targets/id/IdSessionOptions$Mode;

    if-eqz v9, :cond_2

    invoke-virtual {v9}, Lcom/smartengines/targets/id/IdSessionOptions$Mode;->getInternalEngines()Ljava/util/Map;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;->getSupportedDocumentTypes()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 181
    check-cast v6, Ljava/util/Collection;

    invoke-interface {v5, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 272
    :cond_3
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 187
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    .line 189
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const/16 v12, 0x2e

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 191
    move-object v11, v5

    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const/4 v13, 0x0

    if-eqz v12, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v14, v12

    check-cast v14, Ljava/lang/String;

    invoke-static {v14, v10, v8, v7, v13}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    move-object v13, v12

    :cond_6
    check-cast v13, Ljava/lang/String;

    if-eqz v13, :cond_4

    .line 194
    invoke-static {v13, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    .line 196
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, " is the same "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const-string v13, "myapp.IdTargets"

    invoke-static {v13, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 200
    :cond_7
    invoke-static {v6}, Lcom/smartengines/app/targets/IdTargetsKt;->getName(Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;)Lcom/smartengines/utils/Name;

    move-result-object v15

    .line 201
    new-instance v12, Lcom/smartengines/targets/id/IdTarget;

    .line 203
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    if-eqz v11, :cond_8

    const-string v11, ""

    goto :goto_3

    :cond_8
    const-string v11, ".*"

    :goto_3
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 201
    invoke-direct {v12, v9, v10}, Lcom/smartengines/targets/id/IdTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    invoke-virtual {v6}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;->getIcon()I

    move-result v10

    .line 206
    invoke-virtual {v6}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;->getPriority()I

    move-result v18

    .line 199
    new-instance v14, Lcom/smartengines/app/targets/TreeLeaf;

    .line 205
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    .line 201
    move-object/from16 v21, v12

    check-cast v21, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v22, 0x34

    const/16 v23, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 199
    invoke-direct/range {v14 .. v23}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 198
    invoke-interface {v2, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 215
    :cond_9
    const-string v4, "blr"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 216
    const-string v4, "passport.registration"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    if-eqz v4, :cond_a

    .line 219
    invoke-static {v4}, Lcom/smartengines/app/targets/IdTargetsKt;->getName(Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;)Lcom/smartengines/utils/Name;

    move-result-object v6

    .line 220
    new-instance v5, Lcom/smartengines/targets/id/IdTarget;

    const-string v7, "blr.passport.registration"

    invoke-direct {v5, v7, v7}, Lcom/smartengines/targets/id/IdTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    invoke-virtual {v4}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;->getIcon()I

    move-result v7

    .line 225
    invoke-virtual {v4}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;->getPriority()I

    move-result v9

    move-object v4, v5

    .line 218
    new-instance v5, Lcom/smartengines/app/targets/TreeLeaf;

    .line 224
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 220
    move-object v12, v4

    check-cast v12, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v13, 0x34

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 218
    invoke-direct/range {v5 .. v14}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 217
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 230
    :cond_a
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 231
    const-string v0, "AAMVA.drvlic"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    if-eqz v0, :cond_b

    .line 234
    invoke-static {v0}, Lcom/smartengines/app/targets/IdTargetsKt;->getName(Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;)Lcom/smartengines/utils/Name;

    move-result-object v4

    .line 235
    new-instance v1, Lcom/smartengines/targets/id/IdTarget;

    .line 236
    const-string v3, "extended"

    .line 237
    const-string/jumbo v5, "usa.*"

    .line 235
    invoke-direct {v1, v3, v5}, Lcom/smartengines/targets/id/IdTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    invoke-virtual {v0}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;->getIcon()I

    move-result v3

    .line 240
    invoke-virtual {v0}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;->getPriority()I

    move-result v7

    move v0, v3

    .line 233
    new-instance v3, Lcom/smartengines/app/targets/TreeLeaf;

    .line 239
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 235
    move-object v10, v1

    check-cast v10, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v11, 0x34

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 233
    invoke-direct/range {v3 .. v12}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 232
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 246
    :cond_b
    check-cast v2, Ljava/lang/Iterable;

    new-instance v0, Lcom/smartengines/app/targets/IdTargetsKt$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/smartengines/app/targets/IdTargetsKt$$ExternalSyntheticLambda0;-><init>()V

    new-instance v1, Lcom/smartengines/app/targets/IdTargetsKt$$ExternalSyntheticLambda1;

    invoke-direct {v1, v0}, Lcom/smartengines/app/targets/IdTargetsKt$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final loadCountryListItems$lambda$20(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/targets/TreeLeaf;)I
    .locals 2

    .line 247
    invoke-virtual {p1}, Lcom/smartengines/app/targets/TreeLeaf;->getPriority()I

    move-result v0

    invoke-virtual {p0}, Lcom/smartengines/app/targets/TreeLeaf;->getPriority()I

    move-result v1

    sub-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v0

    .line 251
    :cond_0
    invoke-virtual {p0}, Lcom/smartengines/app/targets/TreeLeaf;->getName()Lcom/smartengines/utils/Name;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/utils/Name;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/smartengines/app/targets/TreeLeaf;->getName()Lcom/smartengines/utils/Name;

    move-result-object p1

    invoke-virtual {p1}, Lcom/smartengines/utils/Name;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static final loadCountryListItems$lambda$21(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public static final loadIdTargetList(Landroid/content/Context;Lcom/smartengines/id/IdEngine;Lcom/smartengines/targets/DocumentTypesStatistics;)Lcom/smartengines/app/targets/TreeItem;
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "idEngine"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-virtual {v2}, Lcom/smartengines/id/IdEngine;->CreateSessionSettings()Lcom/smartengines/id/IdSessionSettings;

    move-result-object v1

    const-string v2, "CreateSessionSettings(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/smartengines/targets/id/IdSessionOptionsKt;->parse(Lcom/smartengines/id/IdSessionSettings;)Lcom/smartengines/targets/id/IdSessionOptions;

    move-result-object v1

    .line 30
    new-instance v2, Lcom/smartengines/app/targets/TreeGroupViewType$OneLevelIcons;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lcom/smartengines/app/targets/TreeGroupViewType$OneLevelIcons;-><init>(I)V

    .line 31
    new-instance v5, Lcom/smartengines/utils/Name;

    sget v3, Lcom/smartengines/app/R$string;->id_engine_name:I

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v3}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;)V

    .line 33
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 36
    new-instance v6, Lcom/smartengines/app/targets/TreeLeaf;

    .line 37
    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v4, "Russian Passport"

    const-string/jumbo v8, "\u041f\u0430\u0441\u043f\u043e\u0440\u0442 \u0420\u0424"

    invoke-direct {v7, v4, v8}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    sget v4, Lcom/smartengines/app/R$drawable;->home_rus_passport:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    .line 39
    new-instance v4, Lcom/smartengines/targets/id/IdTarget;

    const-string v9, "default"

    const-string v10, "rus.passport.national"

    invoke-direct {v4, v9, v10}, Lcom/smartengines/targets/id/IdTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v13, v4

    check-cast v13, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v14, 0x3c

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 36
    invoke-direct/range {v6 .. v15}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    new-instance v4, Lcom/smartengines/app/targets/TreeGroup;

    .line 33
    move-object v7, v3

    check-cast v7, Ljava/util/List;

    .line 30
    move-object v10, v2

    check-cast v10, Lcom/smartengines/app/targets/TreeGroupViewType;

    const/16 v11, 0x18

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 29
    invoke-direct/range {v4 .. v12}, Lcom/smartengines/app/targets/TreeGroup;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Lcom/smartengines/app/targets/TreeGroupViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 74
    check-cast v4, Lcom/smartengines/app/targets/TreeItem;

    return-object v4
.end method

.method public static synthetic loadIdTargetList$default(Landroid/content/Context;Lcom/smartengines/id/IdEngine;Lcom/smartengines/targets/DocumentTypesStatistics;ILjava/lang/Object;)Lcom/smartengines/app/targets/TreeItem;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 23
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/smartengines/app/targets/IdTargetsKt;->loadIdTargetList(Landroid/content/Context;Lcom/smartengines/id/IdEngine;Lcom/smartengines/targets/DocumentTypesStatistics;)Lcom/smartengines/app/targets/TreeItem;

    move-result-object p0

    return-object p0
.end method
