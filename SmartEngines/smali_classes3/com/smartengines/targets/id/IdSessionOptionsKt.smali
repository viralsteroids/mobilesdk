.class public final Lcom/smartengines/targets/id/IdSessionOptionsKt;
.super Ljava/lang/Object;
.source "IdSessionOptions.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIdSessionOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdSessionOptions.kt\ncom/smartengines/targets/id/IdSessionOptionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1863#2:137\n1863#2,2:138\n1864#2:140\n*S KotlinDebug\n*F\n+ 1 IdSessionOptions.kt\ncom/smartengines/targets/id/IdSessionOptionsKt\n*L\n55#1:137\n62#1:138,2\n55#1:140\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0005\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\u0010\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u0004\u001a\u0018\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0001\u001a\u0018\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "TAG",
        "",
        "parse",
        "Lcom/smartengines/targets/id/IdSessionOptions;",
        "Lcom/smartengines/id/IdSessionSettings;",
        "loadSupportedModes",
        "",
        "loadInternalEngines",
        "mode",
        "loadSupportedDocumentTypes",
        "internalEngine",
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
.field private static final TAG:Ljava/lang/String; = "engine.IdSessionOptions"


# direct methods
.method public static final loadInternalEngines(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/id/IdSessionSettings;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    invoke-virtual {p0, p1}, Lcom/smartengines/id/IdSessionSettings;->SetCurrentMode(Ljava/lang/String;)V

    .line 109
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 110
    invoke-virtual {p0}, Lcom/smartengines/id/IdSessionSettings;->InternalEngineNamesBegin()Lcom/smartengines/common/StringsSetIterator;

    move-result-object v0

    .line 111
    invoke-virtual {p0}, Lcom/smartengines/id/IdSessionSettings;->InternalEngineNamesEnd()Lcom/smartengines/common/StringsSetIterator;

    move-result-object p0

    .line 112
    :goto_0
    invoke-virtual {v0, p0}, Lcom/smartengines/common/StringsSetIterator;->Equals(Lcom/smartengines/common/StringsSetIterator;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 113
    invoke-virtual {v0}, Lcom/smartengines/common/StringsSetIterator;->GetValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    invoke-virtual {v0}, Lcom/smartengines/common/StringsSetIterator;->Advance()V

    goto :goto_0

    .line 109
    :cond_0
    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public static final loadSupportedDocumentTypes(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/id/IdSessionSettings;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalEngine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 125
    invoke-virtual {p0, p1}, Lcom/smartengines/id/IdSessionSettings;->SupportedDocumentTypesBegin(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;

    move-result-object v1

    .line 126
    invoke-virtual {p0, p1}, Lcom/smartengines/id/IdSessionSettings;->SupportedDocumentTypesEnd(Ljava/lang/String;)Lcom/smartengines/common/StringsSetIterator;

    move-result-object p0

    .line 127
    :goto_0
    invoke-virtual {v1, p0}, Lcom/smartengines/common/StringsSetIterator;->Equals(Lcom/smartengines/common/StringsSetIterator;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 128
    invoke-virtual {v1}, Lcom/smartengines/common/StringsSetIterator;->GetValue()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    invoke-virtual {v1}, Lcom/smartengines/common/StringsSetIterator;->Advance()V

    goto :goto_0

    .line 132
    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static final loadSupportedModes(Lcom/smartengines/id/IdSessionSettings;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/id/IdSessionSettings;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 91
    invoke-virtual {p0}, Lcom/smartengines/id/IdSessionSettings;->SupportedModesBegin()Lcom/smartengines/common/StringsSetIterator;

    move-result-object v1

    .line 92
    invoke-virtual {p0}, Lcom/smartengines/id/IdSessionSettings;->SupportedModesEnd()Lcom/smartengines/common/StringsSetIterator;

    move-result-object p0

    .line 93
    :goto_0
    invoke-virtual {v1, p0}, Lcom/smartengines/common/StringsSetIterator;->Equals(Lcom/smartengines/common/StringsSetIterator;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 94
    invoke-virtual {v1}, Lcom/smartengines/common/StringsSetIterator;->GetValue()Ljava/lang/String;

    move-result-object v2

    .line 95
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v3, v2

    check-cast v3, Ljava/lang/CharSequence;

    const-string/jumbo v4, "singleshot"

    check-cast v4, Ljava/lang/CharSequence;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v3, v4, v7, v5, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 96
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    :cond_0
    invoke-virtual {v1}, Lcom/smartengines/common/StringsSetIterator;->Advance()V

    goto :goto_0

    .line 102
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, "ID SUPPORTED MODES: "

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "engine.IdSessionOptions"

    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static final parse(Lcom/smartengines/id/IdSessionSettings;)Lcom/smartengines/targets/id/IdSessionOptions;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0}, Lcom/smartengines/id/IdSessionSettings;->GetCurrentMode()Ljava/lang/String;

    move-result-object v0

    .line 54
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 55
    invoke-static {p0}, Lcom/smartengines/targets/id/IdSessionOptionsKt;->loadSupportedModes(Lcom/smartengines/id/IdSessionSettings;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 137
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 61
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 62
    invoke-static {p0, v3}, Lcom/smartengines/targets/id/IdSessionOptionsKt;->loadInternalEngines(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 138
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 67
    new-instance v7, Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;

    .line 69
    invoke-static {p0, v6}, Lcom/smartengines/targets/id/IdSessionOptionsKt;->loadSupportedDocumentTypes(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    .line 67
    invoke-direct {v7, v6, v8}, Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 65
    invoke-virtual {v4, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 73
    :cond_0
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 61
    check-cast v4, Ljava/util/Map;

    .line 59
    new-instance v5, Lcom/smartengines/targets/id/IdSessionOptions$Mode;

    invoke-direct {v5, v3, v4}, Lcom/smartengines/targets/id/IdSessionOptions$Mode;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 58
    invoke-virtual {v1, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {p0, v0}, Lcom/smartengines/id/IdSessionSettings;->SetCurrentMode(Ljava/lang/String;)V

    .line 81
    new-instance p0, Lcom/smartengines/targets/id/IdSessionOptions;

    check-cast v1, Ljava/util/Map;

    invoke-direct {p0, v1}, Lcom/smartengines/targets/id/IdSessionOptions;-><init>(Ljava/util/Map;)V

    return-object p0
.end method
