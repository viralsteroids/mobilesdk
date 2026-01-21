.class public final Lcom/smartengines/engine/doc/DocResultParserKt;
.super Ljava/lang/Object;
.source "DocResultParser.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDocResultParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocResultParser.kt\ncom/smartengines/engine/doc/DocResultParserKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,348:1\n1863#2,2:349\n*S KotlinDebug\n*F\n+ 1 DocResultParser.kt\ncom/smartengines/engine/doc/DocResultParserKt\n*L\n297#1:349,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u001a \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a\u0018\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\t*\u00020\rH\u0002\u001a\u0018\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\t*\u00020\u000eH\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u000f*\u00020\u000eH\u0002\u001a\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0006*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0014H\u0002\u001a\u0018\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\t*\u00020\rH\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u0016*\u00020\u0017H\u0002\u001a\u0018\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00190\t*\u00020\rH\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u0019*\u00020\u001aH\u0002\u001a\u0018\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001c0\t*\u00020\rH\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u001c*\u00020\u001dH\u0002\u001a\u000e\u0010\u001e\u001a\u0004\u0018\u00010\u0007*\u00020\u0004H\u0002\u001a(\u0010\u0002\u001a\u00020\u001f*\u00020\u00122\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00010!H\u0002\u001a0\u0010\u0002\u001a\u00020\"*\u00020#2\u0006\u0010$\u001a\u00020%2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00010!H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "TAG",
        "",
        "parse",
        "Lcom/smartengines/engine/doc/DocResultData;",
        "Lcom/smartengines/doc/DocResult;",
        "processedImages",
        "",
        "Landroid/graphics/Bitmap;",
        "parseMap",
        "",
        "Lcom/smartengines/common/StringsMapIterator;",
        "end",
        "parseAttributes",
        "Lcom/smartengines/doc/Document;",
        "Lcom/smartengines/doc/DocBaseFieldInfo;",
        "Lcom/smartengines/engine/doc/FieldInfo;",
        "parseFieldGeometries",
        "Lcom/smartengines/engine/Geometry;",
        "Lcom/smartengines/doc/DocPhysicalDocument;",
        "fieldKey",
        "Lcom/smartengines/common/OcrString;",
        "parseTextFields",
        "Lcom/smartengines/engine/doc/TextField;",
        "Lcom/smartengines/doc/DocTextField;",
        "parseTableFields",
        "Lcom/smartengines/engine/doc/TableField;",
        "Lcom/smartengines/doc/DocTableField;",
        "parseImageFields",
        "Lcom/smartengines/engine/doc/ImageField;",
        "Lcom/smartengines/doc/DocImageField;",
        "parseCropBitmap",
        "Lcom/smartengines/engine/doc/PhysicalDocumentData;",
        "fieldIds",
        "",
        "Lcom/smartengines/engine/doc/PhysicalPageData;",
        "Lcom/smartengines/doc/DocPhysicalPage;",
        "pageId",
        "",
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
.field private static final TAG:Ljava/lang/String; = "engine.DocResultParser"


# direct methods
.method public static final parse(Lcom/smartengines/doc/DocResult;Ljava/util/List;)Lcom/smartengines/engine/doc/DocResultData;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/doc/DocResult;",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Lcom/smartengines/engine/doc/DocResultData;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processedImages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    invoke-virtual {p0}, Lcom/smartengines/doc/DocResult;->DocumentsBegin()Lcom/smartengines/doc/DocumentsIterator;

    move-result-object v1

    .line 38
    invoke-virtual {p0}, Lcom/smartengines/doc/DocResult;->DocumentsEnd()Lcom/smartengines/doc/DocumentsIterator;

    move-result-object v2

    .line 39
    :goto_0
    invoke-virtual {v1, v2}, Lcom/smartengines/doc/DocumentsIterator;->Equals(Lcom/smartengines/doc/DocumentsIterator;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 40
    invoke-virtual {v1}, Lcom/smartengines/doc/DocumentsIterator;->GetDocument()Lcom/smartengines/doc/Document;

    move-result-object v3

    .line 41
    invoke-virtual {v3}, Lcom/smartengines/doc/Document;->GetPhysicalDocIdx()I

    move-result v5

    .line 42
    invoke-virtual {p0, v5}, Lcom/smartengines/doc/DocResult;->GetPhysicalDocument(I)Lcom/smartengines/doc/DocPhysicalDocument;

    move-result-object v4

    .line 44
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v3}, Lcom/smartengines/engine/doc/DocResultParserKt;->parseTextFields(Lcom/smartengines/doc/Document;)Ljava/util/Map;

    move-result-object v9

    .line 45
    invoke-static {v3}, Lcom/smartengines/engine/doc/DocResultParserKt;->parseTableFields(Lcom/smartengines/doc/Document;)Ljava/util/Map;

    move-result-object v10

    .line 46
    invoke-static {v3}, Lcom/smartengines/engine/doc/DocResultParserKt;->parseImageFields(Lcom/smartengines/doc/Document;)Ljava/util/Map;

    move-result-object v11

    move-object v6, v4

    .line 47
    new-instance v4, Lcom/smartengines/engine/doc/DocumentData;

    move-object v7, v6

    .line 49
    invoke-virtual {v3}, Lcom/smartengines/doc/Document;->GetType()Ljava/lang/String;

    move-result-object v6

    const-string v8, "GetType(...)"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-static {v3}, Lcom/smartengines/engine/doc/DocResultParserKt;->parseAttributes(Lcom/smartengines/doc/Document;)Ljava/util/Map;

    move-result-object v8

    .line 55
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 57
    invoke-interface {v9}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v11}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    invoke-static {v3, v12}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v10}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    invoke-static {v3, v12}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    .line 55
    invoke-static {v7, p1, v3}, Lcom/smartengines/engine/doc/DocResultParserKt;->parse(Lcom/smartengines/doc/DocPhysicalDocument;Ljava/util/List;Ljava/util/Collection;)Lcom/smartengines/engine/doc/PhysicalDocumentData;

    move-result-object v12

    const/4 v7, 0x0

    .line 47
    invoke-direct/range {v4 .. v12}, Lcom/smartengines/engine/doc/DocumentData;-><init>(ILjava/lang/String;Lcom/smartengines/engine/doc/DocName;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/smartengines/engine/doc/PhysicalDocumentData;)V

    .line 43
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    invoke-virtual {v1}, Lcom/smartengines/doc/DocumentsIterator;->Advance()V

    goto :goto_0

    .line 36
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 35
    new-instance p0, Lcom/smartengines/engine/doc/DocResultData;

    invoke-direct {p0, v0, p1}, Lcom/smartengines/engine/doc/DocResultData;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 68
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "DocResult, documents.size: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/smartengines/engine/doc/DocResultData;->getDocuments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "engine.DocResultParser"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object p0
.end method

.method private static final parse(Lcom/smartengines/doc/DocBaseFieldInfo;)Lcom/smartengines/engine/doc/FieldInfo;
    .locals 7

    .line 92
    invoke-virtual {p0}, Lcom/smartengines/doc/DocBaseFieldInfo;->GetName()Ljava/lang/String;

    move-result-object v1

    .line 93
    invoke-virtual {p0}, Lcom/smartengines/doc/DocBaseFieldInfo;->IsFictive()Z

    move-result v0

    if-nez v0, :cond_0

    .line 94
    new-instance v0, Lcom/smartengines/engine/doc/FieldInfo;

    .line 95
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 97
    invoke-virtual {p0}, Lcom/smartengines/doc/DocBaseFieldInfo;->GetConfidence()D

    move-result-wide v3

    .line 98
    invoke-virtual {p0}, Lcom/smartengines/doc/DocBaseFieldInfo;->GetAcceptFlag()Z

    move-result v5

    .line 99
    invoke-static {p0}, Lcom/smartengines/engine/doc/DocResultParserKt;->parseAttributes(Lcom/smartengines/doc/DocBaseFieldInfo;)Ljava/util/Map;

    move-result-object v6

    const/4 v2, 0x0

    .line 94
    invoke-direct/range {v0 .. v6}, Lcom/smartengines/engine/doc/FieldInfo;-><init>(Ljava/lang/String;Lcom/smartengines/engine/doc/DocName;DZLjava/util/Map;)V

    return-object v0

    .line 93
    :cond_0
    new-instance p0, Lcom/smartengines/engine/doc/IsFictiveException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "The field "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " is fictive"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/smartengines/engine/doc/IsFictiveException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final parse(Lcom/smartengines/doc/DocImageField;)Lcom/smartengines/engine/doc/ImageField;
    .locals 3

    .line 237
    new-instance v0, Lcom/smartengines/engine/doc/ImageField;

    .line 238
    invoke-virtual {p0}, Lcom/smartengines/doc/DocImageField;->GetBaseFieldInfo()Lcom/smartengines/doc/DocBaseFieldInfo;

    move-result-object v1

    const-string v2, "GetBaseFieldInfo(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/smartengines/engine/doc/DocResultParserKt;->parse(Lcom/smartengines/doc/DocBaseFieldInfo;)Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v1

    .line 239
    invoke-virtual {p0}, Lcom/smartengines/doc/DocImageField;->GetImage()Lcom/smartengines/common/Image;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/common/Image;->GetBase64String()Lcom/smartengines/common/MutableString;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/common/MutableString;->GetCStr()Ljava/lang/String;

    move-result-object p0

    const-string v2, "GetCStr(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/smartengines/utils/UtilsKt;->bitmapFromBase64String(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 237
    invoke-direct {v0, v1, p0}, Lcom/smartengines/engine/doc/ImageField;-><init>(Lcom/smartengines/engine/doc/FieldInfo;Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method private static final parse(Lcom/smartengines/doc/DocPhysicalDocument;Ljava/util/List;Ljava/util/Collection;)Lcom/smartengines/engine/doc/PhysicalDocumentData;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/doc/DocPhysicalDocument;",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/smartengines/engine/doc/PhysicalDocumentData;"
        }
    .end annotation

    .line 274
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 275
    invoke-virtual {p0}, Lcom/smartengines/doc/DocPhysicalDocument;->GetPagesCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 276
    invoke-virtual {p0, v2}, Lcom/smartengines/doc/DocPhysicalDocument;->GetPhysicalPage(I)Lcom/smartengines/doc/DocPhysicalPage;

    move-result-object v3

    .line 278
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v3, v2, p1, p2}, Lcom/smartengines/engine/doc/DocResultParserKt;->parse(Lcom/smartengines/doc/DocPhysicalPage;ILjava/util/List;Ljava/util/Collection;)Lcom/smartengines/engine/doc/PhysicalPageData;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 274
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 273
    new-instance p0, Lcom/smartengines/engine/doc/PhysicalDocumentData;

    invoke-direct {p0, v0}, Lcom/smartengines/engine/doc/PhysicalDocumentData;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method private static final parse(Lcom/smartengines/doc/DocPhysicalPage;ILjava/util/List;Ljava/util/Collection;)Lcom/smartengines/engine/doc/PhysicalPageData;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/doc/DocPhysicalPage;",
            "I",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/smartengines/engine/doc/PhysicalPageData;"
        }
    .end annotation

    .line 290
    invoke-virtual {p0}, Lcom/smartengines/doc/DocPhysicalPage;->GetSourceSceneID()I

    move-result v0

    .line 291
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Bitmap;

    .line 293
    sget-object v0, Lcom/smartengines/engine/ImageFactory;->INSTANCE:Lcom/smartengines/engine/ImageFactory;

    invoke-virtual {v0, p2}, Lcom/smartengines/engine/ImageFactory;->imageFromBitmap(Landroid/graphics/Bitmap;)Lcom/smartengines/common/Image;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/smartengines/doc/DocPhysicalPage;->GetPageImageFromScene(Lcom/smartengines/common/Image;)Lcom/smartengines/common/Image;

    move-result-object p2

    .line 296
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 297
    check-cast p3, Ljava/lang/Iterable;

    .line 349
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 299
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 300
    invoke-virtual {p0, v1}, Lcom/smartengines/doc/DocPhysicalPage;->BasicObjectsBegin(Ljava/lang/String;)Lcom/smartengines/doc/DocBasicObjectsIterator;

    move-result-object v3

    .line 301
    invoke-virtual {p0, v1}, Lcom/smartengines/doc/DocPhysicalPage;->BasicObjectsEnd(Ljava/lang/String;)Lcom/smartengines/doc/DocBasicObjectsIterator;

    move-result-object v4

    .line 302
    :goto_1
    invoke-virtual {v3, v4}, Lcom/smartengines/doc/DocBasicObjectsIterator;->Equals(Lcom/smartengines/doc/DocBasicObjectsIterator;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 303
    invoke-virtual {v3}, Lcom/smartengines/doc/DocBasicObjectsIterator;->GetBasicObject()Lcom/smartengines/doc/DocBasicObject;

    move-result-object v5

    .line 304
    invoke-virtual {v5}, Lcom/smartengines/doc/DocBasicObject;->GetBaseObjectInfo()Lcom/smartengines/doc/DocBaseObjectInfo;

    move-result-object v5

    invoke-virtual {v5}, Lcom/smartengines/doc/DocBaseObjectInfo;->GetGeometryOnPage()Lcom/smartengines/common/Polygon;

    move-result-object v5

    .line 305
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v5, p1}, Lcom/smartengines/engine/GeometryKt;->toGeometry(Lcom/smartengines/common/Polygon;I)Lcom/smartengines/engine/Geometry;

    move-result-object v5

    .line 306
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    invoke-virtual {v3}, Lcom/smartengines/doc/DocBasicObjectsIterator;->Advance()V

    goto :goto_1

    .line 309
    :cond_0
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 299
    check-cast v2, Ljava/util/List;

    .line 298
    new-instance v3, Lcom/smartengines/engine/doc/PhysicalFieldInfo;

    invoke-direct {v3, v2}, Lcom/smartengines/engine/doc/PhysicalFieldInfo;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 316
    :cond_1
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    move-object v6, p3

    check-cast v6, Ljava/util/List;

    .line 317
    invoke-virtual {p0}, Lcom/smartengines/doc/DocPhysicalPage;->GetFulltextBasicObjectsBegin()Lcom/smartengines/doc/DocTextObjectsIterator;

    move-result-object p3

    .line 318
    invoke-virtual {p0}, Lcom/smartengines/doc/DocPhysicalPage;->GetFulltextBasicObjectsEnd()Lcom/smartengines/doc/DocTextObjectsIterator;

    move-result-object p0

    .line 319
    :goto_2
    invoke-virtual {p3, p0}, Lcom/smartengines/doc/DocTextObjectsIterator;->Equals(Lcom/smartengines/doc/DocTextObjectsIterator;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 320
    invoke-virtual {p3}, Lcom/smartengines/doc/DocTextObjectsIterator;->GetTextObject()Lcom/smartengines/doc/DocTextObject;

    move-result-object v1

    .line 321
    invoke-virtual {v1}, Lcom/smartengines/doc/DocTextObject;->GetBaseObjectInfo()Lcom/smartengines/doc/DocBaseObjectInfo;

    move-result-object v2

    .line 323
    new-instance v3, Lcom/smartengines/engine/doc/BasicTextObject;

    .line 324
    invoke-virtual {v1}, Lcom/smartengines/doc/DocTextObject;->GetOcrString()Lcom/smartengines/common/OcrString;

    move-result-object v1

    const-string v4, "GetOcrString(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/smartengines/engine/doc/DocResultParserKt;->parse(Lcom/smartengines/common/OcrString;)Ljava/lang/String;

    move-result-object v1

    .line 325
    invoke-virtual {v2}, Lcom/smartengines/doc/DocBaseObjectInfo;->GetGeometryOnPage()Lcom/smartengines/common/Polygon;

    move-result-object v4

    const-string v5, "GetGeometryOnPage(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, p1}, Lcom/smartengines/engine/GeometryKt;->toGeometry(Lcom/smartengines/common/Polygon;I)Lcom/smartengines/engine/Geometry;

    move-result-object v4

    .line 326
    invoke-virtual {v2}, Lcom/smartengines/doc/DocBaseObjectInfo;->GetAcceptFlag()Z

    move-result v2

    .line 323
    invoke-direct {v3, v1, v4, v2}, Lcom/smartengines/engine/doc/BasicTextObject;-><init>(Ljava/lang/String;Lcom/smartengines/engine/Geometry;Z)V

    .line 322
    invoke-interface {v6, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 333
    invoke-virtual {p3}, Lcom/smartengines/doc/DocTextObjectsIterator;->Advance()V

    goto :goto_2

    .line 338
    :cond_2
    new-instance v1, Lcom/smartengines/engine/doc/PhysicalPageData;

    .line 340
    invoke-virtual {p2}, Lcom/smartengines/common/Image;->GetWidth()I

    move-result v2

    .line 341
    invoke-virtual {p2}, Lcom/smartengines/common/Image;->GetHeight()I

    move-result v3

    .line 342
    invoke-virtual {p2}, Lcom/smartengines/common/Image;->GetBase64String()Lcom/smartengines/common/MutableString;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/common/MutableString;->GetCStr()Ljava/lang/String;

    move-result-object v4

    const-string p0, "GetCStr(...)"

    invoke-static {v4, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    move-object v5, v0

    check-cast v5, Ljava/util/Map;

    .line 338
    invoke-direct/range {v1 .. v6}, Lcom/smartengines/engine/doc/PhysicalPageData;-><init>(IILjava/lang/String;Ljava/util/Map;Ljava/util/List;)V

    return-object v1
.end method

.method private static final parse(Lcom/smartengines/doc/DocTableField;)Lcom/smartengines/engine/doc/TableField;
    .locals 11

    .line 190
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTableField;->GetColsCount()I

    move-result v0

    .line 191
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTableField;->GetRowsCount()I

    move-result v1

    .line 194
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTableField;->GetBaseFieldInfo()Lcom/smartengines/doc/DocBaseFieldInfo;

    move-result-object v2

    const-string v3, "GetBaseFieldInfo(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/smartengines/engine/doc/DocResultParserKt;->parse(Lcom/smartengines/doc/DocBaseFieldInfo;)Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v2

    .line 195
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v0, :cond_0

    .line 197
    invoke-virtual {p0, v5}, Lcom/smartengines/doc/DocTableField;->GetColName(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 195
    :cond_0
    check-cast v3, Ljava/util/List;

    .line 199
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    move v6, v4

    :goto_1
    if-ge v6, v1, :cond_2

    .line 201
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    move v8, v4

    :goto_2
    if-ge v8, v0, :cond_1

    .line 204
    invoke-virtual {p0, v6, v8}, Lcom/smartengines/doc/DocTableField;->GetCell(II)Lcom/smartengines/doc/DocTextField;

    move-result-object v9

    const-string v10, "GetCell(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lcom/smartengines/engine/doc/DocResultParserKt;->parse(Lcom/smartengines/doc/DocTextField;)Lcom/smartengines/engine/doc/TextField;

    move-result-object v9

    .line 203
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 201
    :cond_1
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 208
    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 199
    check-cast v5, Ljava/util/List;

    .line 193
    new-instance p0, Lcom/smartengines/engine/doc/TableField;

    invoke-direct {p0, v2, v3, v5}, Lcom/smartengines/engine/doc/TableField;-><init>(Lcom/smartengines/engine/doc/FieldInfo;Ljava/util/List;Ljava/util/List;)V

    return-object p0
.end method

.method private static final parse(Lcom/smartengines/doc/DocTextField;)Lcom/smartengines/engine/doc/TextField;
    .locals 3

    .line 161
    new-instance v0, Lcom/smartengines/engine/doc/TextField;

    .line 162
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTextField;->GetBaseFieldInfo()Lcom/smartengines/doc/DocBaseFieldInfo;

    move-result-object v1

    const-string v2, "GetBaseFieldInfo(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/smartengines/engine/doc/DocResultParserKt;->parse(Lcom/smartengines/doc/DocBaseFieldInfo;)Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v1

    .line 163
    invoke-virtual {p0}, Lcom/smartengines/doc/DocTextField;->GetOcrString()Lcom/smartengines/common/OcrString;

    move-result-object p0

    const-string v2, "GetOcrString(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/smartengines/engine/doc/DocResultParserKt;->parse(Lcom/smartengines/common/OcrString;)Ljava/lang/String;

    move-result-object p0

    .line 161
    invoke-direct {v0, v1, p0}, Lcom/smartengines/engine/doc/TextField;-><init>(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final parse(Lcom/smartengines/common/OcrString;)Ljava/lang/String;
    .locals 1

    .line 137
    invoke-virtual {p0}, Lcom/smartengines/common/OcrString;->GetFirstString()Lcom/smartengines/common/MutableString;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/common/MutableString;->GetCStr()Ljava/lang/String;

    move-result-object p0

    const-string v0, "GetCStr(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final parseAttributes(Lcom/smartengines/doc/DocBaseFieldInfo;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/doc/DocBaseFieldInfo;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 86
    invoke-virtual {p0}, Lcom/smartengines/doc/DocBaseFieldInfo;->AttributesBegin()Lcom/smartengines/common/StringsMapIterator;

    move-result-object v0

    const-string v1, "AttributesBegin(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/smartengines/doc/DocBaseFieldInfo;->AttributesEnd()Lcom/smartengines/common/StringsMapIterator;

    move-result-object p0

    const-string v1, "AttributesEnd(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lcom/smartengines/engine/doc/DocResultParserKt;->parseMap(Lcom/smartengines/common/StringsMapIterator;Lcom/smartengines/common/StringsMapIterator;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final parseAttributes(Lcom/smartengines/doc/Document;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/doc/Document;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 83
    invoke-virtual {p0}, Lcom/smartengines/doc/Document;->AttributesBegin()Lcom/smartengines/common/StringsMapIterator;

    move-result-object v0

    const-string v1, "AttributesBegin(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/smartengines/doc/Document;->AttributesEnd()Lcom/smartengines/common/StringsMapIterator;

    move-result-object p0

    const-string v1, "AttributesEnd(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lcom/smartengines/engine/doc/DocResultParserKt;->parseMap(Lcom/smartengines/common/StringsMapIterator;Lcom/smartengines/common/StringsMapIterator;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final parseCropBitmap(Lcom/smartengines/doc/DocResult;)Landroid/graphics/Bitmap;
    .locals 2

    .line 248
    :try_start_0
    invoke-virtual {p0}, Lcom/smartengines/doc/DocResult;->GetGraphicalStructure()Lcom/smartengines/doc/DocGraphicalStructure;

    move-result-object p0

    .line 249
    invoke-virtual {p0}, Lcom/smartengines/doc/DocGraphicalStructure;->GetViewsCollection()Lcom/smartengines/doc/DocViewsCollection;

    move-result-object p0

    const-string v0, "final"

    invoke-virtual {p0, v0}, Lcom/smartengines/doc/DocViewsCollection;->ViewsSlice(Ljava/lang/String;)Lcom/smartengines/doc/DocViewsSliceIterator;

    move-result-object p0

    .line 250
    invoke-virtual {p0}, Lcom/smartengines/doc/DocViewsSliceIterator;->Finished()Z

    move-result v0

    if-nez v0, :cond_0

    .line 251
    invoke-virtual {p0}, Lcom/smartengines/doc/DocViewsSliceIterator;->GetView()Lcom/smartengines/doc/DocView;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/doc/DocView;->GetImage()Lcom/smartengines/common/Image;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/common/Image;->GetBase64String()Lcom/smartengines/common/MutableString;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/common/MutableString;->GetCStr()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    .line 252
    invoke-static {p0, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    .line 253
    array-length v1, p0

    invoke-static {p0, v0, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 257
    const-string v0, "DocResult.parse()"

    check-cast p0, Ljava/lang/Throwable;

    const-string v1, "engine.DocResultParser"

    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final parseFieldGeometries(Lcom/smartengines/doc/DocPhysicalDocument;Ljava/lang/String;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/doc/DocPhysicalDocument;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/Geometry;",
            ">;"
        }
    .end annotation

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 108
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 109
    invoke-virtual {p0}, Lcom/smartengines/doc/DocPhysicalDocument;->GetPagesCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 110
    invoke-virtual {p0, v2}, Lcom/smartengines/doc/DocPhysicalDocument;->GetPhysicalPage(I)Lcom/smartengines/doc/DocPhysicalPage;

    move-result-object v3

    .line 113
    invoke-virtual {v3, p1}, Lcom/smartengines/doc/DocPhysicalPage;->BasicObjectsBegin(Ljava/lang/String;)Lcom/smartengines/doc/DocBasicObjectsIterator;

    move-result-object v4

    .line 114
    invoke-virtual {v3, p1}, Lcom/smartengines/doc/DocPhysicalPage;->BasicObjectsEnd(Ljava/lang/String;)Lcom/smartengines/doc/DocBasicObjectsIterator;

    move-result-object v5

    .line 115
    :goto_1
    invoke-virtual {v4, v5}, Lcom/smartengines/doc/DocBasicObjectsIterator;->Equals(Lcom/smartengines/doc/DocBasicObjectsIterator;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 116
    invoke-virtual {v4}, Lcom/smartengines/doc/DocBasicObjectsIterator;->GetBasicObject()Lcom/smartengines/doc/DocBasicObject;

    move-result-object v6

    invoke-virtual {v6}, Lcom/smartengines/doc/DocBasicObject;->GetBaseObjectInfo()Lcom/smartengines/doc/DocBaseObjectInfo;

    move-result-object v6

    invoke-virtual {v6}, Lcom/smartengines/doc/DocBaseObjectInfo;->GetGeometryOnScene()Lcom/smartengines/common/Polygon;

    move-result-object v6

    .line 119
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/smartengines/doc/DocPhysicalPage;->GetSourceSceneID()I

    move-result v7

    invoke-static {v6, v7}, Lcom/smartengines/engine/GeometryKt;->toGeometry(Lcom/smartengines/common/Polygon;I)Lcom/smartengines/engine/Geometry;

    move-result-object v6

    .line 118
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    invoke-virtual {v4}, Lcom/smartengines/doc/DocBasicObjectsIterator;->Advance()V

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 107
    :cond_1
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final parseImageFields(Lcom/smartengines/doc/Document;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/doc/Document;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/engine/doc/ImageField;",
            ">;"
        }
    .end annotation

    .line 215
    const-string v0, "engine.DocResultParser"

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 216
    invoke-virtual {p0}, Lcom/smartengines/doc/Document;->ImageFieldsBegin()Lcom/smartengines/doc/DocImageFieldsIterator;

    move-result-object v2

    .line 217
    invoke-virtual {p0}, Lcom/smartengines/doc/Document;->ImageFieldsEnd()Lcom/smartengines/doc/DocImageFieldsIterator;

    move-result-object p0

    .line 218
    :goto_0
    invoke-virtual {v2, p0}, Lcom/smartengines/doc/DocImageFieldsIterator;->Equals(Lcom/smartengines/doc/DocImageFieldsIterator;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 219
    invoke-virtual {v2}, Lcom/smartengines/doc/DocImageFieldsIterator;->GetKey()Ljava/lang/String;

    move-result-object v3

    .line 221
    :try_start_0
    invoke-virtual {v2}, Lcom/smartengines/doc/DocImageFieldsIterator;->GetField()Lcom/smartengines/doc/DocImageField;

    move-result-object v4

    .line 224
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v4}, Lcom/smartengines/engine/doc/DocResultParserKt;->parse(Lcom/smartengines/doc/DocImageField;)Lcom/smartengines/engine/doc/ImageField;

    move-result-object v4

    .line 222
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/smartengines/engine/doc/IsFictiveException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    .line 229
    const-string v4, "IdResult.parseImages"

    check-cast v3, Ljava/lang/Throwable;

    invoke-static {v0, v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 227
    :catch_1
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "image field \""

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\" is fictive, so ignored"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 231
    :goto_1
    invoke-virtual {v2}, Lcom/smartengines/doc/DocImageFieldsIterator;->Advance()V

    goto :goto_0

    .line 215
    :cond_0
    check-cast v1, Ljava/util/Map;

    return-object v1
.end method

.method private static final parseMap(Lcom/smartengines/common/StringsMapIterator;Lcom/smartengines/common/StringsMapIterator;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/common/StringsMapIterator;",
            "Lcom/smartengines/common/StringsMapIterator;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 75
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 76
    :goto_0
    invoke-virtual {p0, p1}, Lcom/smartengines/common/StringsMapIterator;->Equals(Lcom/smartengines/common/StringsMapIterator;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 77
    invoke-virtual {p0}, Lcom/smartengines/common/StringsMapIterator;->GetKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/smartengines/common/StringsMapIterator;->GetValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    invoke-virtual {p0}, Lcom/smartengines/common/StringsMapIterator;->Advance()V

    goto :goto_0

    .line 75
    :cond_0
    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private static final parseTableFields(Lcom/smartengines/doc/Document;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/doc/Document;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/engine/doc/TableField;",
            ">;"
        }
    .end annotation

    .line 170
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 171
    invoke-virtual {p0}, Lcom/smartengines/doc/Document;->TableFieldsBegin()Lcom/smartengines/doc/DocTableFieldsIterator;

    move-result-object v1

    .line 172
    invoke-virtual {p0}, Lcom/smartengines/doc/Document;->TableFieldsEnd()Lcom/smartengines/doc/DocTableFieldsIterator;

    move-result-object p0

    .line 173
    :cond_0
    invoke-virtual {v1, p0}, Lcom/smartengines/doc/DocTableFieldsIterator;->Equals(Lcom/smartengines/doc/DocTableFieldsIterator;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 174
    :goto_0
    invoke-virtual {v1, p0}, Lcom/smartengines/doc/DocTableFieldsIterator;->Equals(Lcom/smartengines/doc/DocTableFieldsIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 175
    invoke-virtual {v1}, Lcom/smartengines/doc/DocTableFieldsIterator;->GetKey()Ljava/lang/String;

    move-result-object v2

    .line 179
    :try_start_0
    invoke-virtual {v1}, Lcom/smartengines/doc/DocTableFieldsIterator;->GetField()Lcom/smartengines/doc/DocTableField;

    move-result-object v3

    const-string v4, "GetField(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lcom/smartengines/engine/doc/DocResultParserKt;->parse(Lcom/smartengines/doc/DocTableField;)Lcom/smartengines/engine/doc/TableField;

    move-result-object v3

    .line 177
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/smartengines/engine/doc/IsFictiveException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 182
    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "table field \""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\" is fictive, so ignored"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "engine.DocResultParser"

    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 184
    :goto_1
    invoke-virtual {v1}, Lcom/smartengines/doc/DocTableFieldsIterator;->Advance()V

    goto :goto_0

    .line 170
    :cond_1
    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private static final parseTextFields(Lcom/smartengines/doc/Document;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/doc/Document;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/engine/doc/TextField;",
            ">;"
        }
    .end annotation

    .line 143
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 144
    invoke-virtual {p0}, Lcom/smartengines/doc/Document;->TextFieldsBegin()Lcom/smartengines/doc/DocTextFieldsIterator;

    move-result-object v1

    .line 145
    invoke-virtual {p0}, Lcom/smartengines/doc/Document;->TextFieldsEnd()Lcom/smartengines/doc/DocTextFieldsIterator;

    move-result-object p0

    .line 146
    :goto_0
    invoke-virtual {v1, p0}, Lcom/smartengines/doc/DocTextFieldsIterator;->Equals(Lcom/smartengines/doc/DocTextFieldsIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 147
    invoke-virtual {v1}, Lcom/smartengines/doc/DocTextFieldsIterator;->GetKey()Ljava/lang/String;

    move-result-object v2

    .line 151
    :try_start_0
    invoke-virtual {v1}, Lcom/smartengines/doc/DocTextFieldsIterator;->GetField()Lcom/smartengines/doc/DocTextField;

    move-result-object v3

    const-string v4, "GetField(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lcom/smartengines/engine/doc/DocResultParserKt;->parse(Lcom/smartengines/doc/DocTextField;)Lcom/smartengines/engine/doc/TextField;

    move-result-object v3

    .line 149
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/smartengines/engine/doc/IsFictiveException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 154
    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "text field \""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\" is fictive, so ignored"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "engine.DocResultParser"

    invoke-static {v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    :goto_1
    invoke-virtual {v1}, Lcom/smartengines/doc/DocTextFieldsIterator;->Advance()V

    goto :goto_0

    .line 143
    :cond_0
    check-cast v0, Ljava/util/Map;

    return-object v0
.end method
