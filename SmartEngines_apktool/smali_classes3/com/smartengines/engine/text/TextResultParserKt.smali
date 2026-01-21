.class public final Lcom/smartengines/engine/text/TextResultParserKt;
.super Ljava/lang/Object;
.source "TextResultParser.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0004\u001a\u0010\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t*\u00020\u0004\u001a\u0010\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00010\t*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0005\u00a8\u0006\u000c"
    }
    d2 = {
        "TAG",
        "",
        "isInvalid",
        "",
        "Lcom/smartengines/text/TextResult;",
        "(Lcom/smartengines/text/TextResult;)Z",
        "parse",
        "Lcom/smartengines/engine/text/TextResultData;",
        "parseChunks",
        "",
        "Lcom/smartengines/engine/text/TextResultChunk;",
        "parseLines",
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


# static fields
.field private static final TAG:Ljava/lang/String; = "engine.TextResultParser"


# direct methods
.method public static final isInvalid(Lcom/smartengines/text/TextResult;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p0}, Lcom/smartengines/text/TextResult;->GetCurrentScene()Lcom/smartengines/text/TextScene;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/text/TextScene;->IsGarbage()Z

    move-result p0

    return p0
.end method

.method public static final parse(Lcom/smartengines/text/TextResult;)Lcom/smartengines/engine/text/TextResultData;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    new-instance v0, Lcom/smartengines/engine/text/TextResultData;

    .line 18
    invoke-static {p0}, Lcom/smartengines/engine/text/TextResultParserKt;->parseChunks(Lcom/smartengines/text/TextResult;)Ljava/util/List;

    move-result-object v1

    .line 19
    invoke-static {p0}, Lcom/smartengines/engine/text/TextResultParserKt;->parseLines(Lcom/smartengines/text/TextResult;)Ljava/util/List;

    move-result-object p0

    .line 17
    invoke-direct {v0, v1, p0}, Lcom/smartengines/engine/text/TextResultData;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static final parseChunks(Lcom/smartengines/text/TextResult;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/text/TextResult;",
            ")",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/text/TextResultChunk;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-virtual {p0}, Lcom/smartengines/text/TextResult;->GetCurrentScene()Lcom/smartengines/text/TextScene;

    move-result-object p0

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TextResult.parseChunks; scene.IsGarbage="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/smartengines/text/TextScene;->IsGarbage()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; textIterator=default"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "engine.TextResultParser"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    invoke-virtual {p0}, Lcom/smartengines/text/TextScene;->IsGarbage()Z

    move-result v1

    if-nez v1, :cond_1

    .line 37
    const-string v1, "default"

    invoke-virtual {p0, v1}, Lcom/smartengines/text/TextScene;->CreateIterator(Ljava/lang/String;)Lcom/smartengines/text/TextIterator;

    move-result-object p0

    .line 38
    :goto_0
    invoke-virtual {p0}, Lcom/smartengines/text/TextIterator;->Finished()Z

    move-result v1

    if-nez v1, :cond_1

    .line 39
    invoke-virtual {p0}, Lcom/smartengines/text/TextIterator;->GetTextChunk()Lcom/smartengines/text/TextChunk;

    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lcom/smartengines/text/TextChunk;->GetOcrString()Lcom/smartengines/common/OcrString;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/common/OcrString;->GetFirstString()Lcom/smartengines/common/MutableString;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/common/MutableString;->GetCStr()Ljava/lang/String;

    move-result-object v4

    .line 41
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v2, v4

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    const-string v2, "\n"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 42
    new-instance v3, Lcom/smartengines/engine/text/TextResultChunk;

    .line 44
    invoke-virtual {v1}, Lcom/smartengines/text/TextChunk;->GetConfidence()D

    move-result-wide v5

    .line 45
    invoke-virtual {v1}, Lcom/smartengines/text/TextChunk;->GetAcceptFlag()Z

    move-result v7

    .line 46
    invoke-virtual {v1}, Lcom/smartengines/text/TextChunk;->GetGeometry()Lcom/smartengines/common/Polygon;

    move-result-object v1

    const-string v2, "GetGeometry(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/smartengines/engine/GeometryKt;->toGeometry(Lcom/smartengines/common/Polygon;I)Lcom/smartengines/engine/Geometry;

    move-result-object v8

    .line 42
    invoke-direct/range {v3 .. v8}, Lcom/smartengines/engine/text/TextResultChunk;-><init>(Ljava/lang/String;DZLcom/smartengines/engine/Geometry;)V

    .line 49
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    :cond_0
    invoke-virtual {p0}, Lcom/smartengines/text/TextIterator;->Advance()V

    goto :goto_0

    .line 35
    :cond_1
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static final parseLines(Lcom/smartengines/text/TextResult;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/text/TextResult;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-virtual {p0}, Lcom/smartengines/text/TextResult;->GetCurrentScene()Lcom/smartengines/text/TextScene;

    move-result-object p0

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TextResult.parseLines; scene.IsGarbage="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/smartengines/text/TextScene;->IsGarbage()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; textIterator=lines"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "engine.TextResultParser"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 72
    invoke-virtual {p0}, Lcom/smartengines/text/TextScene;->IsGarbage()Z

    move-result v1

    if-nez v1, :cond_1

    .line 73
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 74
    const-string v2, "lines"

    invoke-virtual {p0, v2}, Lcom/smartengines/text/TextScene;->CreateIterator(Ljava/lang/String;)Lcom/smartengines/text/TextIterator;

    move-result-object p0

    .line 75
    :goto_0
    invoke-virtual {p0}, Lcom/smartengines/text/TextIterator;->Finished()Z

    move-result v2

    if-nez v2, :cond_1

    .line 76
    invoke-virtual {p0}, Lcom/smartengines/text/TextIterator;->GetTextChunk()Lcom/smartengines/text/TextChunk;

    move-result-object v2

    .line 77
    invoke-virtual {v2}, Lcom/smartengines/text/TextChunk;->GetOcrString()Lcom/smartengines/common/OcrString;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/common/OcrString;->GetFirstString()Lcom/smartengines/common/MutableString;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/common/MutableString;->GetCStr()Ljava/lang/String;

    move-result-object v2

    .line 81
    const-string v3, "\n"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 82
    move-object v4, v1

    check-cast v4, Ljava/lang/Iterable;

    const-string v2, " "

    move-object v5, v2

    check-cast v5, Ljava/lang/CharSequence;

    const/16 v11, 0x3e

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    goto :goto_1

    .line 85
    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    :goto_1
    invoke-virtual {p0}, Lcom/smartengines/text/TextIterator;->Advance()V

    goto :goto_0

    .line 71
    :cond_1
    check-cast v0, Ljava/util/List;

    return-object v0
.end method
