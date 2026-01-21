.class public final Lcom/smartengines/engine/id/IdResultParserKt;
.super Ljava/lang/Object;
.source "IdResultParser.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIdResultParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdResultParser.kt\ncom/smartengines/engine/id/IdResultParserKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,267:1\n1863#2,2:268\n1#3:270\n216#4,2:271\n*S KotlinDebug\n*F\n+ 1 IdResultParser.kt\ncom/smartengines/engine/id/IdResultParserKt\n*L\n148#1:268,2\n232#1:271,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001e\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u001a\u0016\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0004\u001a:\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u001a\u0010\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u000f\u001a\u000c\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002\u001a\u000c\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0002\u001a\"\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002\u001a\u0010\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00140\r*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "TAG",
        "",
        "parse",
        "Lcom/smartengines/engine/id/IdResultData;",
        "Lcom/smartengines/id/IdResult;",
        "templates",
        "",
        "Lcom/smartengines/engine/id/Template;",
        "parseTemplates",
        "mergeTemplates",
        "oldTemplates",
        "newTemplates",
        "parseAttributes",
        "",
        "Lcom/smartengines/engine/id/Attribute;",
        "Lcom/smartengines/id/IdBaseFieldInfo;",
        "parseTextField",
        "Lcom/smartengines/engine/id/TextField;",
        "Lcom/smartengines/id/IdTextField;",
        "parseCheckField",
        "Lcom/smartengines/engine/id/CheckField;",
        "Lcom/smartengines/id/IdCheckField;",
        "parseImageField",
        "Lcom/smartengines/engine/id/ImageField;",
        "Lcom/smartengines/id/IdImageField;",
        "parseForensicCheckFields",
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
.field private static final TAG:Ljava/lang/String; = "engine.IdResultParser"


# direct methods
.method public static final mergeTemplates(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/engine/id/Template;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/engine/id/Template;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/engine/id/Template;",
            ">;"
        }
    .end annotation

    const-string v0, "oldTemplates"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newTemplates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    .line 148
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 268
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 149
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/smartengines/engine/id/Template;

    .line 150
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/smartengines/engine/id/Template;

    if-nez v4, :cond_0

    .line 152
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v4, v3

    goto :goto_1

    :cond_0
    if-nez v3, :cond_1

    goto :goto_1

    .line 155
    :cond_1
    invoke-virtual {v3}, Lcom/smartengines/engine/id/Template;->getFieldTemplateRectangles()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v4}, Lcom/smartengines/engine/id/Template;->getFieldTemplateRectangles()Ljava/util/Map;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v8

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Lcom/smartengines/engine/id/Template;->copy$default(Lcom/smartengines/engine/id/Template;Ljava/lang/String;Lcom/smartengines/visualization/Quad;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/smartengines/engine/id/Template;

    move-result-object v4

    :goto_1
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static final parse(Lcom/smartengines/id/IdResult;Ljava/util/Map;)Lcom/smartengines/engine/id/IdResultData;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/id/IdResult;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/engine/id/Template;",
            ">;)",
            "Lcom/smartengines/engine/id/IdResultData;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "templates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->GetDocumentType()Ljava/lang/String;

    move-result-object v2

    .line 37
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 38
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->TextFieldsBegin()Lcom/smartengines/id/IdTextFieldsMapIterator;

    move-result-object v0

    .line 40
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->TextFieldsEnd()Lcom/smartengines/id/IdTextFieldsMapIterator;

    move-result-object v3

    .line 41
    :goto_0
    invoke-virtual {v0, v3}, Lcom/smartengines/id/IdTextFieldsMapIterator;->Equals(Lcom/smartengines/id/IdTextFieldsMapIterator;)Z

    move-result v4

    const-string v5, "GetValue(...)"

    if-nez v4, :cond_0

    .line 42
    invoke-virtual {v0}, Lcom/smartengines/id/IdTextFieldsMapIterator;->GetValue()Lcom/smartengines/id/IdTextField;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lcom/smartengines/engine/id/IdResultParserKt;->parseTextField(Lcom/smartengines/id/IdTextField;)Lcom/smartengines/engine/id/TextField;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    invoke-virtual {v0}, Lcom/smartengines/id/IdTextFieldsMapIterator;->Advance()V

    goto :goto_0

    .line 46
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 47
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->CheckFieldsBegin()Lcom/smartengines/id/IdCheckFieldsMapIterator;

    move-result-object v0

    .line 48
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->CheckFieldsEnd()Lcom/smartengines/id/IdCheckFieldsMapIterator;

    move-result-object v4

    .line 49
    :goto_1
    invoke-virtual {v0, v4}, Lcom/smartengines/id/IdCheckFieldsMapIterator;->Equals(Lcom/smartengines/id/IdCheckFieldsMapIterator;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 50
    invoke-virtual {v0}, Lcom/smartengines/id/IdCheckFieldsMapIterator;->GetValue()Lcom/smartengines/id/IdCheckField;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lcom/smartengines/engine/id/IdResultParserKt;->parseCheckField(Lcom/smartengines/id/IdCheckField;)Lcom/smartengines/engine/id/CheckField;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    invoke-virtual {v0}, Lcom/smartengines/id/IdCheckFieldsMapIterator;->Advance()V

    goto :goto_1

    .line 54
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 55
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->ImageFieldsBegin()Lcom/smartengines/id/IdImageFieldsMapIterator;

    move-result-object v6

    .line 56
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->ImageFieldsEnd()Lcom/smartengines/id/IdImageFieldsMapIterator;

    move-result-object v7

    .line 57
    :goto_2
    invoke-virtual {v6, v7}, Lcom/smartengines/id/IdImageFieldsMapIterator;->Equals(Lcom/smartengines/id/IdImageFieldsMapIterator;)Z

    move-result v0

    const-string v8, "engine.IdResultParser"

    if-nez v0, :cond_2

    .line 59
    :try_start_0
    invoke-virtual {v6}, Lcom/smartengines/id/IdImageFieldsMapIterator;->GetValue()Lcom/smartengines/id/IdImageField;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lcom/smartengines/engine/id/IdResultParserKt;->parseImageField(Lcom/smartengines/id/IdImageField;Ljava/util/Map;)Lcom/smartengines/engine/id/ImageField;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 61
    const-string v9, "IdResult.parseImages"

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v8, v9, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 63
    :goto_3
    invoke-virtual {v6}, Lcom/smartengines/id/IdImageFieldsMapIterator;->Advance()V

    goto :goto_2

    .line 67
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 68
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->ForensicTextFieldsBegin()Lcom/smartengines/id/IdTextFieldsMapIterator;

    move-result-object v0

    .line 69
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->ForensicTextFieldsEnd()Lcom/smartengines/id/IdTextFieldsMapIterator;

    move-result-object v7

    .line 70
    :goto_4
    invoke-virtual {v0, v7}, Lcom/smartengines/id/IdTextFieldsMapIterator;->Equals(Lcom/smartengines/id/IdTextFieldsMapIterator;)Z

    move-result v9

    if-nez v9, :cond_3

    .line 71
    invoke-virtual {v0}, Lcom/smartengines/id/IdTextFieldsMapIterator;->GetValue()Lcom/smartengines/id/IdTextField;

    move-result-object v9

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lcom/smartengines/engine/id/IdResultParserKt;->parseTextField(Lcom/smartengines/id/IdTextField;)Lcom/smartengines/engine/id/TextField;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    invoke-virtual {v0}, Lcom/smartengines/id/IdTextFieldsMapIterator;->Advance()V

    goto :goto_4

    .line 75
    :cond_3
    invoke-static {p0}, Lcom/smartengines/engine/id/IdResultParserKt;->parseForensicCheckFields(Lcom/smartengines/id/IdResult;)Ljava/util/List;

    move-result-object v7

    .line 76
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 77
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->ForensicImageFieldsBegin()Lcom/smartengines/id/IdImageFieldsMapIterator;

    move-result-object v10

    .line 78
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->ForensicImageFieldsEnd()Lcom/smartengines/id/IdImageFieldsMapIterator;

    move-result-object p0

    .line 79
    :goto_5
    invoke-virtual {v10, p0}, Lcom/smartengines/id/IdImageFieldsMapIterator;->Equals(Lcom/smartengines/id/IdImageFieldsMapIterator;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 81
    :try_start_1
    invoke-virtual {v10}, Lcom/smartengines/id/IdImageFieldsMapIterator;->GetValue()Lcom/smartengines/id/IdImageField;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lcom/smartengines/engine/id/IdResultParserKt;->parseImageField(Lcom/smartengines/id/IdImageField;Ljava/util/Map;)Lcom/smartengines/engine/id/ImageField;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :catch_1
    move-exception v0

    .line 83
    const-string v11, "IdResult.parseForensicImages"

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v8, v11, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 85
    :goto_6
    invoke-virtual {v10}, Lcom/smartengines/id/IdImageFieldsMapIterator;->Advance()V

    goto :goto_5

    .line 36
    :cond_4
    new-instance p0, Lcom/smartengines/engine/id/IdResultData;

    .line 38
    check-cast v1, Ljava/util/List;

    .line 46
    check-cast v3, Ljava/util/List;

    .line 54
    move-object v5, v4

    check-cast v5, Ljava/util/List;

    .line 67
    check-cast v6, Ljava/util/List;

    .line 76
    move-object v8, v9

    check-cast v8, Ljava/util/List;

    move-object v4, v7

    move-object v7, v6

    move-object v6, v4

    move-object v9, p1

    move-object v4, v3

    move-object v3, v1

    move-object v1, p0

    .line 36
    invoke-direct/range {v1 .. v9}, Lcom/smartengines/engine/id/IdResultData;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V

    return-object v1
.end method

.method public static final parseAttributes(Lcom/smartengines/id/IdBaseFieldInfo;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/id/IdBaseFieldInfo;",
            ")",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/id/Attribute;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 175
    invoke-virtual {p0}, Lcom/smartengines/id/IdBaseFieldInfo;->AttributesBegin()Lcom/smartengines/common/StringsMapIterator;

    move-result-object v1

    .line 176
    invoke-virtual {p0}, Lcom/smartengines/id/IdBaseFieldInfo;->AttributesEnd()Lcom/smartengines/common/StringsMapIterator;

    move-result-object p0

    .line 177
    :goto_0
    invoke-virtual {v1, p0}, Lcom/smartengines/common/StringsMapIterator;->Equals(Lcom/smartengines/common/StringsMapIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 179
    new-instance v2, Lcom/smartengines/engine/id/Attribute;

    .line 180
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->GetKey()Ljava/lang/String;

    move-result-object v3

    const-string v4, "GetKey(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->GetValue()Ljava/lang/String;

    move-result-object v4

    const-string v5, "GetValue(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    invoke-direct {v2, v3, v4}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->Advance()V

    goto :goto_0

    .line 174
    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final parseCheckField(Lcom/smartengines/id/IdCheckField;)Lcom/smartengines/engine/id/CheckField;
    .locals 4

    .line 207
    invoke-virtual {p0}, Lcom/smartengines/id/IdCheckField;->GetBaseFieldInfo()Lcom/smartengines/id/IdBaseFieldInfo;

    move-result-object v0

    .line 208
    new-instance v1, Lcom/smartengines/engine/id/CheckField;

    .line 209
    invoke-virtual {p0}, Lcom/smartengines/id/IdCheckField;->GetName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "GetName(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    invoke-virtual {p0}, Lcom/smartengines/id/IdCheckField;->GetValue()Lcom/smartengines/id/IdCheckStatus;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/id/IdCheckStatus;->swigValue()I

    move-result p0

    if-eqz p0, :cond_2

    const/4 v3, 0x1

    if-eq p0, v3, :cond_1

    const/4 v3, 0x2

    if-eq p0, v3, :cond_0

    .line 214
    const-string p0, "engine.IdResultParser"

    const-string/jumbo v3, "wrong IdCheckField value"

    invoke-static {p0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lcom/smartengines/engine/id/CheckStatus;->UNDEFINED:Lcom/smartengines/engine/id/CheckStatus;

    goto :goto_0

    .line 213
    :cond_0
    sget-object p0, Lcom/smartengines/engine/id/CheckStatus;->FAILED:Lcom/smartengines/engine/id/CheckStatus;

    goto :goto_0

    .line 212
    :cond_1
    sget-object p0, Lcom/smartengines/engine/id/CheckStatus;->PASSED:Lcom/smartengines/engine/id/CheckStatus;

    goto :goto_0

    .line 211
    :cond_2
    sget-object p0, Lcom/smartengines/engine/id/CheckStatus;->UNDEFINED:Lcom/smartengines/engine/id/CheckStatus;

    .line 216
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/smartengines/engine/id/IdResultParserKt;->parseAttributes(Lcom/smartengines/id/IdBaseFieldInfo;)Ljava/util/List;

    move-result-object v0

    .line 208
    invoke-direct {v1, v2, p0, v0}, Lcom/smartengines/engine/id/CheckField;-><init>(Ljava/lang/String;Lcom/smartengines/engine/id/CheckStatus;Ljava/util/List;)V

    return-object v1
.end method

.method public static final parseForensicCheckFields(Lcom/smartengines/id/IdResult;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/id/IdResult;",
            ")",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/id/CheckField;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 260
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->ForensicCheckFieldsBegin()Lcom/smartengines/id/IdCheckFieldsMapIterator;

    move-result-object v1

    .line 261
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->ForensicCheckFieldsEnd()Lcom/smartengines/id/IdCheckFieldsMapIterator;

    move-result-object p0

    .line 262
    :goto_0
    invoke-virtual {v1, p0}, Lcom/smartengines/id/IdCheckFieldsMapIterator;->Equals(Lcom/smartengines/id/IdCheckFieldsMapIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 263
    invoke-virtual {v1}, Lcom/smartengines/id/IdCheckFieldsMapIterator;->GetValue()Lcom/smartengines/id/IdCheckField;

    move-result-object v2

    const-string v3, "GetValue(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/smartengines/engine/id/IdResultParserKt;->parseCheckField(Lcom/smartengines/id/IdCheckField;)Lcom/smartengines/engine/id/CheckField;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    invoke-virtual {v1}, Lcom/smartengines/id/IdCheckFieldsMapIterator;->Advance()V

    goto :goto_0

    .line 259
    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final parseImageField(Lcom/smartengines/id/IdImageField;Ljava/util/Map;)Lcom/smartengines/engine/id/ImageField;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/id/IdImageField;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/engine/id/Template;",
            ">;)",
            "Lcom/smartengines/engine/id/ImageField;"
        }
    .end annotation

    .line 223
    invoke-virtual {p0}, Lcom/smartengines/id/IdImageField;->GetName()Ljava/lang/String;

    move-result-object v0

    .line 224
    invoke-virtual {p0}, Lcom/smartengines/id/IdImageField;->GetBaseFieldInfo()Lcom/smartengines/id/IdBaseFieldInfo;

    move-result-object v1

    .line 225
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/smartengines/engine/id/IdResultParserKt;->parseAttributes(Lcom/smartengines/id/IdBaseFieldInfo;)Ljava/util/List;

    move-result-object v2

    .line 226
    invoke-virtual {p0}, Lcom/smartengines/id/IdImageField;->GetValue()Lcom/smartengines/common/Image;

    move-result-object p0

    .line 229
    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/smartengines/engine/id/Attribute;

    invoke-virtual {v4}, Lcom/smartengines/engine/id/Attribute;->getKey()Ljava/lang/String;

    move-result-object v5

    const-string v6, "TemplateImage"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Lcom/smartengines/engine/id/Attribute;->getValue()Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "true"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    if-eqz p1, :cond_2

    .line 232
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/smartengines/engine/id/Template;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/smartengines/engine/id/Template;->getFieldTemplateRectangles()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 271
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 232
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/common/Rectangle;

    const/4 v4, 0x5

    .line 235
    :try_start_0
    invoke-virtual {p0, v2, v4}, Lcom/smartengines/common/Image;->Mask(Lcom/smartengines/common/Rectangle;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    .line 240
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "IdResult.parseImageField template="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "  field="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, "  image size="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Lcom/smartengines/common/Image;->GetWidth()I

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const/16 v5, 0x78

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Lcom/smartengines/common/Image;->GetHeight()I

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " quad="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v2}, Lcom/smartengines/engine/EngineUtilsKt;->toQuad(Lcom/smartengines/common/Rectangle;)Lcom/smartengines/visualization/Quad;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    check-cast v4, Ljava/lang/Throwable;

    const-string v3, "engine.IdResultParser"

    invoke-static {v3, v2, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 246
    :cond_2
    invoke-virtual {p0}, Lcom/smartengines/common/Image;->GetBase64String()Lcom/smartengines/common/MutableString;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/common/MutableString;->GetCStr()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    .line 247
    invoke-static {p0, p1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    .line 250
    new-instance v2, Lcom/smartengines/engine/id/ImageField;

    .line 251
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 252
    array-length v3, p0

    invoke-static {p0, p1, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p0

    const-string p1, "decodeByteArray(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    invoke-virtual {v1}, Lcom/smartengines/id/IdBaseFieldInfo;->GetIsAccepted()Z

    move-result p1

    .line 254
    invoke-static {v1}, Lcom/smartengines/engine/id/IdResultParserKt;->parseAttributes(Lcom/smartengines/id/IdBaseFieldInfo;)Ljava/util/List;

    move-result-object v1

    .line 250
    invoke-direct {v2, v0, p0, p1, v1}, Lcom/smartengines/engine/id/ImageField;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/util/List;)V

    return-object v2
.end method

.method public static final parseTemplates(Lcom/smartengines/id/IdResult;)Ljava/util/Map;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/id/IdResult;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/engine/id/Template;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 97
    invoke-virtual {p0}, Lcom/smartengines/id/IdResult;->GetTemplateDetectionResultsCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 98
    invoke-virtual {p0, v2}, Lcom/smartengines/id/IdResult;->GetTemplateDetectionResult(I)Lcom/smartengines/id/IdTemplateDetectionResult;

    move-result-object v3

    .line 101
    invoke-virtual {v3}, Lcom/smartengines/id/IdTemplateDetectionResult;->GetTemplateName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "GetTemplateName(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    invoke-virtual {v3}, Lcom/smartengines/id/IdTemplateDetectionResult;->GetQuadrangle()Lcom/smartengines/common/Quadrangle;

    move-result-object v3

    const-string v5, "GetQuadrangle(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lcom/smartengines/engine/EngineUtilsKt;->toQuad(Lcom/smartengines/common/Quadrangle;)Lcom/smartengines/visualization/Quad;

    move-result-object v3

    .line 103
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v5, Ljava/util/Map;

    .line 104
    invoke-virtual {p0, v2}, Lcom/smartengines/id/IdResult;->GetTemplateSegmentationResult(I)Lcom/smartengines/id/IdTemplateSegmentationResult;

    move-result-object v6

    .line 106
    invoke-virtual {v6}, Lcom/smartengines/id/IdTemplateSegmentationResult;->RawFieldQuadranglesBegin()Lcom/smartengines/common/QuadranglesMapIterator;

    move-result-object v7

    .line 107
    invoke-virtual {v6}, Lcom/smartengines/id/IdTemplateSegmentationResult;->RawFieldQuadranglesEnd()Lcom/smartengines/common/QuadranglesMapIterator;

    move-result-object v6

    .line 108
    :goto_1
    invoke-virtual {v7, v6}, Lcom/smartengines/common/QuadranglesMapIterator;->Equals(Lcom/smartengines/common/QuadranglesMapIterator;)Z

    move-result v8

    const-string v9, "GetKey(...)"

    if-nez v8, :cond_0

    .line 111
    invoke-virtual {v7}, Lcom/smartengines/common/QuadranglesMapIterator;->GetKey()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    invoke-virtual {v7}, Lcom/smartengines/common/QuadranglesMapIterator;->GetValue()Lcom/smartengines/common/Quadrangle;

    move-result-object v9

    const-string v10, "GetValue(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lcom/smartengines/engine/EngineUtilsKt;->toQuad(Lcom/smartengines/common/Quadrangle;)Lcom/smartengines/visualization/Quad;

    move-result-object v9

    .line 110
    invoke-interface {v5, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    invoke-virtual {v7}, Lcom/smartengines/common/QuadranglesMapIterator;->Advance()V

    goto :goto_1

    .line 118
    :cond_0
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 119
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v6, Ljava/util/Map;

    .line 120
    invoke-virtual {p0, v2}, Lcom/smartengines/id/IdResult;->GetTemplateSegmentationResult(I)Lcom/smartengines/id/IdTemplateSegmentationResult;

    move-result-object v7

    .line 122
    invoke-virtual {v7}, Lcom/smartengines/id/IdTemplateSegmentationResult;->RawFieldTemplateQuadranglesBegin()Lcom/smartengines/common/QuadranglesMapIterator;

    move-result-object v8

    .line 123
    invoke-virtual {v7}, Lcom/smartengines/id/IdTemplateSegmentationResult;->RawFieldTemplateQuadranglesEnd()Lcom/smartengines/common/QuadranglesMapIterator;

    move-result-object v7

    .line 124
    :goto_2
    invoke-virtual {v8, v7}, Lcom/smartengines/common/QuadranglesMapIterator;->Equals(Lcom/smartengines/common/QuadranglesMapIterator;)Z

    move-result v10

    if-nez v10, :cond_1

    .line 127
    invoke-virtual {v8}, Lcom/smartengines/common/QuadranglesMapIterator;->GetKey()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    invoke-virtual {v8}, Lcom/smartengines/common/QuadranglesMapIterator;->GetValue()Lcom/smartengines/common/Quadrangle;

    move-result-object v11

    invoke-virtual {v11}, Lcom/smartengines/common/Quadrangle;->GetBoundingRectangle()Lcom/smartengines/common/Rectangle;

    move-result-object v11

    const-string v12, "GetBoundingRectangle(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    invoke-interface {v6, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    invoke-virtual {v8}, Lcom/smartengines/common/QuadranglesMapIterator;->Advance()V

    goto :goto_2

    .line 134
    :cond_1
    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 100
    new-instance v7, Lcom/smartengines/engine/id/Template;

    invoke-direct {v7, v4, v3, v5, v6}, Lcom/smartengines/engine/id/Template;-><init>(Ljava/lang/String;Lcom/smartengines/visualization/Quad;Ljava/util/Map;Ljava/util/Map;)V

    .line 137
    invoke-virtual {v7}, Lcom/smartengines/engine/id/Template;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 96
    :cond_2
    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private static final parseTextField(Lcom/smartengines/id/IdTextField;)Lcom/smartengines/engine/id/TextField;
    .locals 4

    .line 195
    invoke-virtual {p0}, Lcom/smartengines/id/IdTextField;->GetBaseFieldInfo()Lcom/smartengines/id/IdBaseFieldInfo;

    move-result-object v0

    .line 196
    new-instance v1, Lcom/smartengines/engine/id/TextField;

    .line 197
    invoke-virtual {p0}, Lcom/smartengines/id/IdTextField;->GetName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "GetName(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    invoke-virtual {p0}, Lcom/smartengines/id/IdTextField;->GetValue()Lcom/smartengines/common/OcrString;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/common/OcrString;->GetFirstString()Lcom/smartengines/common/MutableString;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/common/MutableString;->GetCStr()Ljava/lang/String;

    move-result-object p0

    const-string v3, "GetCStr(...)"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    invoke-virtual {v0}, Lcom/smartengines/id/IdBaseFieldInfo;->GetIsAccepted()Z

    move-result v3

    .line 200
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/smartengines/engine/id/IdResultParserKt;->parseAttributes(Lcom/smartengines/id/IdBaseFieldInfo;)Ljava/util/List;

    move-result-object v0

    .line 196
    invoke-direct {v1, v2, p0, v3, v0}, Lcom/smartengines/engine/id/TextField;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V

    return-object v1
.end method
