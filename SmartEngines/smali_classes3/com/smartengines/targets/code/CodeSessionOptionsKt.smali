.class public final Lcom/smartengines/targets/code/CodeSessionOptionsKt;
.super Ljava/lang/Object;
.source "CodeSessionOptions.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCodeSessionOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeSessionOptions.kt\ncom/smartengines/targets/code/CodeSessionOptionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1863#2:100\n1864#2:102\n1#3:101\n*S KotlinDebug\n*F\n+ 1 CodeSessionOptions.kt\ncom/smartengines/targets/code/CodeSessionOptionsKt\n*L\n75#1:100\n75#1:102\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "TAG",
        "",
        "parse",
        "Lcom/smartengines/targets/code/CodeSessionOptions;",
        "Lcom/smartengines/code/CodeEngineSessionSettings;",
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
.field private static final TAG:Ljava/lang/String; = "myapp.CodeSessionOptions"


# direct methods
.method public static final parse(Lcom/smartengines/code/CodeEngineSessionSettings;)Lcom/smartengines/targets/code/CodeSessionOptions;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 56
    invoke-virtual {p0}, Lcom/smartengines/code/CodeEngineSessionSettings;->SettingsBegin()Lcom/smartengines/common/StringsMapIterator;

    move-result-object v1

    .line 57
    invoke-virtual {p0}, Lcom/smartengines/code/CodeEngineSessionSettings;->SettingsEnd()Lcom/smartengines/common/StringsMapIterator;

    move-result-object p0

    .line 58
    :goto_0
    invoke-virtual {v1, p0}, Lcom/smartengines/common/StringsMapIterator;->Equals(Lcom/smartengines/common/StringsMapIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 60
    new-instance v2, Lcom/smartengines/targets/code/CodeSessionOptions$Option;

    .line 61
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->GetKey()Ljava/lang/String;

    move-result-object v3

    const-string v4, "GetKey(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->GetValue()Ljava/lang/String;

    move-result-object v4

    const-string v5, "GetValue(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-direct {v2, v3, v4}, Lcom/smartengines/targets/code/CodeSessionOptions$Option;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->Advance()V

    goto :goto_0

    .line 73
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 74
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 75
    check-cast v0, Ljava/lang/Iterable;

    .line 100
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/targets/code/CodeSessionOptions$Option;

    .line 76
    invoke-virtual {v2}, Lcom/smartengines/targets/code/CodeSessionOptions$Option;->getSubkeys()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 77
    const-string v5, "global"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 80
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/smartengines/targets/code/CodeSessionOptions$InternalEngine;

    if-nez v5, :cond_2

    new-instance v5, Lcom/smartengines/targets/code/CodeSessionOptions$InternalEngine;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/List;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/List;

    invoke-direct {v5, v3, v6, v7}, Lcom/smartengines/targets/code/CodeSessionOptions$InternalEngine;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v1, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    :cond_2
    invoke-virtual {v2}, Lcom/smartengines/targets/code/CodeSessionOptions$Option;->getSubkeys()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v6, 0x3

    const-string v7, "null cannot be cast to non-null type java.util.ArrayList<com.smartengines.targets.code.CodeSessionOptions.Option>"

    if-ne v3, v6, :cond_3

    invoke-virtual {v2}, Lcom/smartengines/targets/code/CodeSessionOptions$Option;->getSubkeys()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v5}, Lcom/smartengines/targets/code/CodeSessionOptions$InternalEngine;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Lcom/smartengines/targets/code/CodeSessionOptions$Option;->getSubkeys()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x2

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "enabled"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 84
    invoke-virtual {v5}, Lcom/smartengines/targets/code/CodeSessionOptions$InternalEngine;->getSubtypes()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 86
    :cond_3
    invoke-virtual {v5}, Lcom/smartengines/targets/code/CodeSessionOptions$InternalEngine;->getOptions()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 90
    :cond_4
    new-instance v0, Lcom/smartengines/targets/code/CodeSessionOptions;

    .line 91
    check-cast p0, Ljava/util/List;

    .line 92
    check-cast v1, Ljava/util/Map;

    .line 90
    invoke-direct {v0, p0, v1}, Lcom/smartengines/targets/code/CodeSessionOptions;-><init>(Ljava/util/List;Ljava/util/Map;)V

    return-object v0
.end method
