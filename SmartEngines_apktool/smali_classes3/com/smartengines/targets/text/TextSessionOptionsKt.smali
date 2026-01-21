.class public final Lcom/smartengines/targets/text/TextSessionOptionsKt;
.super Ljava/lang/Object;
.source "TextSessionOptions.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\u0010\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u0004\u001a\u0010\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u0004\u001a\u0010\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "TAG",
        "",
        "parse",
        "Lcom/smartengines/targets/text/TextSessionOptions;",
        "Lcom/smartengines/text/TextSessionSettings;",
        "loadSupportedIterators",
        "",
        "loadSupportedLanguages",
        "loadOptions",
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
.field private static final TAG:Ljava/lang/String; = "myapp.TextSesOptions"


# direct methods
.method public static final loadOptions(Lcom/smartengines/text/TextSessionSettings;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/text/TextSessionSettings;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 69
    invoke-virtual {p0}, Lcom/smartengines/text/TextSessionSettings;->OptionsBegin()Lcom/smartengines/common/StringsMapIterator;

    move-result-object v1

    .line 70
    invoke-virtual {p0}, Lcom/smartengines/text/TextSessionSettings;->OptionsEnd()Lcom/smartengines/common/StringsMapIterator;

    move-result-object p0

    .line 71
    :goto_0
    invoke-virtual {v1, p0}, Lcom/smartengines/common/StringsMapIterator;->Equals(Lcom/smartengines/common/StringsMapIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 72
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->GetValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->Advance()V

    goto :goto_0

    .line 68
    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static final loadSupportedIterators(Lcom/smartengines/text/TextSessionSettings;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/text/TextSessionSettings;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    invoke-virtual {p0}, Lcom/smartengines/text/TextSessionSettings;->SupportedTextIteratorsBegin()Lcom/smartengines/common/StringsSetIterator;

    move-result-object v1

    .line 48
    invoke-virtual {p0}, Lcom/smartengines/text/TextSessionSettings;->SupportedTextIteratorsEnd()Lcom/smartengines/common/StringsSetIterator;

    move-result-object p0

    .line 49
    :goto_0
    invoke-virtual {v1, p0}, Lcom/smartengines/common/StringsSetIterator;->Equals(Lcom/smartengines/common/StringsSetIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 50
    invoke-virtual {v1}, Lcom/smartengines/common/StringsSetIterator;->GetValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    invoke-virtual {v1}, Lcom/smartengines/common/StringsSetIterator;->Advance()V

    goto :goto_0

    .line 46
    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static final loadSupportedLanguages(Lcom/smartengines/text/TextSessionSettings;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/text/TextSessionSettings;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    invoke-virtual {p0}, Lcom/smartengines/text/TextSessionSettings;->SupportedLanguagesBegin()Lcom/smartengines/common/StringsSetIterator;

    move-result-object v1

    .line 59
    invoke-virtual {p0}, Lcom/smartengines/text/TextSessionSettings;->SupportedLanguagesEnd()Lcom/smartengines/common/StringsSetIterator;

    move-result-object p0

    .line 60
    :goto_0
    invoke-virtual {v1, p0}, Lcom/smartengines/common/StringsSetIterator;->Equals(Lcom/smartengines/common/StringsSetIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 61
    invoke-virtual {v1}, Lcom/smartengines/common/StringsSetIterator;->GetValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    invoke-virtual {v1}, Lcom/smartengines/common/StringsSetIterator;->Advance()V

    goto :goto_0

    .line 57
    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static final parse(Lcom/smartengines/text/TextSessionSettings;)Lcom/smartengines/targets/text/TextSessionOptions;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    new-instance v0, Lcom/smartengines/targets/text/TextSessionOptions;

    .line 35
    invoke-static {p0}, Lcom/smartengines/targets/text/TextSessionOptionsKt;->loadSupportedLanguages(Lcom/smartengines/text/TextSessionSettings;)Ljava/util/List;

    move-result-object v1

    .line 36
    invoke-static {p0}, Lcom/smartengines/targets/text/TextSessionOptionsKt;->loadSupportedIterators(Lcom/smartengines/text/TextSessionSettings;)Ljava/util/List;

    move-result-object p0

    .line 34
    invoke-direct {v0, v1, p0}, Lcom/smartengines/targets/text/TextSessionOptions;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method
