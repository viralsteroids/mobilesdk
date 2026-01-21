.class public final Lcom/smartengines/targets/doc/DocSessionOptionsKt;
.super Ljava/lang/Object;
.source "DocSessionOptions.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDocSessionOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocSessionOptions.kt\ncom/smartengines/targets/doc/DocSessionOptionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1863#2,2:145\n*S KotlinDebug\n*F\n+ 1 DocSessionOptions.kt\ncom/smartengines/targets/doc/DocSessionOptionsKt\n*L\n52#1:145,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u0004H\u0002\u001a\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0006*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a\"\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000b*\u00020\u00042\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000c\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "TAG",
        "",
        "parse",
        "Lcom/smartengines/targets/doc/DocSessionOptions;",
        "Lcom/smartengines/doc/DocSessionSettings;",
        "loadSupportedModes",
        "",
        "loadInternalEngines",
        "Lcom/smartengines/targets/doc/DocSessionOptions$InternalEngine;",
        "mode",
        "getDoctypes",
        "",
        "language",
        "targets_release"
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
.field private static final TAG:Ljava/lang/String; = "myapp.DocSessionOptions"


# direct methods
.method private static final getDoctypes(Lcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/doc/DocSessionSettings;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    .line 115
    invoke-static {v1}, Lkotlin/collections/SetsKt;->sortedSetOf([Ljava/lang/Object;)Ljava/util/TreeSet;

    move-result-object v1

    .line 116
    invoke-virtual {p0, p1}, Lcom/smartengines/doc/DocSessionSettings;->SetCurrentMode(Ljava/lang/String;)V

    .line 117
    invoke-virtual {p0}, Lcom/smartengines/doc/DocSessionSettings;->GetInternalEnginesCount()I

    move-result p1

    move v2, v0

    :goto_0
    if-ge v2, p1, :cond_6

    .line 120
    invoke-virtual {p0, v2}, Lcom/smartengines/doc/DocSessionSettings;->GetSupportedDocumentTypesCount(I)I

    move-result v3

    move v4, v0

    :goto_1
    if-ge v4, v3, :cond_5

    .line 123
    invoke-virtual {p0, v2, v4}, Lcom/smartengines/doc/DocSessionSettings;->GetSupportedDocumentType(II)Ljava/lang/String;

    move-result-object v5

    .line 124
    invoke-virtual {p0, v5}, Lcom/smartengines/doc/DocSessionSettings;->GetDocumentInfo(Ljava/lang/String;)Lcom/smartengines/doc/DocDocumentInfo;

    move-result-object v5

    .line 127
    const-string v6, "ru"

    const/4 v7, 0x1

    invoke-static {p2, v6, v7}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 128
    invoke-virtual {v5}, Lcom/smartengines/doc/DocDocumentInfo;->GetDocumentShortNameLocal()Ljava/lang/String;

    move-result-object v6

    .line 129
    move-object v7, v6

    check-cast v7, Ljava/lang/CharSequence;

    if-eqz v7, :cond_0

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_2

    .line 130
    :cond_0
    invoke-virtual {v5}, Lcom/smartengines/doc/DocDocumentInfo;->GetDocumentNameLocal()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    .line 135
    :cond_1
    invoke-virtual {v5}, Lcom/smartengines/doc/DocDocumentInfo;->GetDocumentName()Ljava/lang/String;

    move-result-object v6

    .line 138
    :cond_2
    :goto_2
    move-object v5, v6

    check-cast v5, Ljava/lang/CharSequence;

    if-eqz v5, :cond_4

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_3

    goto :goto_3

    .line 139
    :cond_3
    invoke-virtual {v1, v6}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 115
    :cond_6
    check-cast v1, Ljava/util/Set;

    return-object v1
.end method

.method private static final loadInternalEngines(Lcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/doc/DocSessionSettings;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/smartengines/targets/doc/DocSessionOptions$InternalEngine;",
            ">;"
        }
    .end annotation

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 94
    invoke-virtual {p0, p1}, Lcom/smartengines/doc/DocSessionSettings;->SetCurrentMode(Ljava/lang/String;)V

    .line 96
    invoke-virtual {p0}, Lcom/smartengines/doc/DocSessionSettings;->GetInternalEnginesCount()I

    move-result p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p1, :cond_1

    .line 101
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 102
    invoke-virtual {p0, v2}, Lcom/smartengines/doc/DocSessionSettings;->GetSupportedDocumentTypesCount(I)I

    move-result v4

    move v5, v1

    :goto_1
    if-ge v5, v4, :cond_0

    .line 104
    invoke-virtual {p0, v2, v5}, Lcom/smartengines/doc/DocSessionSettings;->GetSupportedDocumentType(II)Ljava/lang/String;

    move-result-object v6

    .line 106
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 108
    :cond_0
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 101
    check-cast v3, Ljava/util/List;

    .line 99
    new-instance v4, Lcom/smartengines/targets/doc/DocSessionOptions$InternalEngine;

    invoke-direct {v4, v2, v3}, Lcom/smartengines/targets/doc/DocSessionOptions$InternalEngine;-><init>(ILjava/util/List;)V

    .line 98
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 93
    :cond_1
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final loadSupportedModes(Lcom/smartengines/doc/DocSessionSettings;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/doc/DocSessionSettings;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 77
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 78
    invoke-virtual {p0}, Lcom/smartengines/doc/DocSessionSettings;->SupportedModesBegin()Lcom/smartengines/common/StringsVectorIterator;

    move-result-object v1

    .line 79
    invoke-virtual {p0}, Lcom/smartengines/doc/DocSessionSettings;->SupportedModesEnd()Lcom/smartengines/common/StringsVectorIterator;

    move-result-object p0

    .line 80
    :goto_0
    invoke-virtual {v1, p0}, Lcom/smartengines/common/StringsVectorIterator;->Equals(Lcom/smartengines/common/StringsVectorIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 81
    invoke-virtual {v1}, Lcom/smartengines/common/StringsVectorIterator;->GetValue()Ljava/lang/String;

    move-result-object v2

    .line 82
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    invoke-virtual {v1}, Lcom/smartengines/common/StringsVectorIterator;->Advance()V

    goto :goto_0

    .line 87
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, "DOC SUPPORTED MODES: "

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "myapp.DocSessionOptions"

    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static final parse(Lcom/smartengines/doc/DocSessionSettings;)Lcom/smartengines/targets/doc/DocSessionOptions;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-virtual {p0}, Lcom/smartengines/doc/DocSessionSettings;->GetCurrentMode()Ljava/lang/String;

    move-result-object v0

    .line 51
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 52
    invoke-static {p0}, Lcom/smartengines/targets/doc/DocSessionOptionsKt;->loadSupportedModes(Lcom/smartengines/doc/DocSessionSettings;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 145
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 55
    new-instance v4, Lcom/smartengines/targets/doc/DocSessionOptions$Mode;

    .line 57
    invoke-static {p0, v3}, Lcom/smartengines/targets/doc/DocSessionOptionsKt;->loadInternalEngines(Lcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 58
    const-string v6, "ru"

    invoke-static {p0, v3, v6}, Lcom/smartengines/targets/doc/DocSessionOptionsKt;->getDoctypes(Lcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v6

    .line 59
    const-string v7, "en"

    invoke-static {p0, v3, v7}, Lcom/smartengines/targets/doc/DocSessionOptionsKt;->getDoctypes(Lcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v7

    .line 55
    invoke-direct {v4, v3, v5, v6, v7}, Lcom/smartengines/targets/doc/DocSessionOptions$Mode;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V

    .line 54
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p0, v0}, Lcom/smartengines/doc/DocSessionSettings;->SetCurrentMode(Ljava/lang/String;)V

    .line 67
    new-instance p0, Lcom/smartengines/targets/doc/DocSessionOptions;

    check-cast v1, Ljava/util/Map;

    invoke-direct {p0, v1}, Lcom/smartengines/targets/doc/DocSessionOptions;-><init>(Ljava/util/Map;)V

    .line 69
    invoke-virtual {p0}, Lcom/smartengines/targets/doc/DocSessionOptions;->toString()Ljava/lang/String;

    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.DocSessionOptions"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object p0
.end method
