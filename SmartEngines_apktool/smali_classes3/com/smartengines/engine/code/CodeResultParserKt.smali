.class public final Lcom/smartengines/engine/code/CodeResultParserKt;
.super Ljava/lang/Object;
.source "CodeResultParser.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\u0012\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0004H\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0007*\u00020\u0008H\u0002\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0004H\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "parse",
        "Lcom/smartengines/engine/code/CodeResultData;",
        "Lcom/smartengines/code/CodeEngineResult;",
        "Lcom/smartengines/engine/code/CodeObjectData;",
        "Lcom/smartengines/code/CodeObject;",
        "parseFields",
        "",
        "Lcom/smartengines/engine/code/CodeObjectField;",
        "Lcom/smartengines/code/CodeField;",
        "parseImage",
        "Landroid/graphics/Bitmap;",
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
.method private static final parse(Lcom/smartengines/code/CodeObject;)Lcom/smartengines/engine/code/CodeObjectData;
    .locals 5

    .line 34
    new-instance v0, Lcom/smartengines/engine/code/CodeObjectData;

    .line 35
    invoke-virtual {p0}, Lcom/smartengines/code/CodeObject;->GetTypeStr()Ljava/lang/String;

    move-result-object v1

    const-string v2, "GetTypeStr(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-static {p0}, Lcom/smartengines/engine/code/CodeResultParserKt;->parseFields(Lcom/smartengines/code/CodeObject;)Ljava/util/List;

    move-result-object v2

    .line 37
    invoke-static {p0}, Lcom/smartengines/engine/code/CodeResultParserKt;->parseImage(Lcom/smartengines/code/CodeObject;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 38
    invoke-virtual {p0}, Lcom/smartengines/code/CodeObject;->HasQuadrangle()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0}, Lcom/smartengines/code/CodeObject;->GetQuadrangle()Lcom/smartengines/common/Quadrangle;

    move-result-object p0

    const-string v4, "GetQuadrangle(...)"

    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/smartengines/engine/EngineUtilsKt;->toQuad(Lcom/smartengines/common/Quadrangle;)Lcom/smartengines/visualization/Quad;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 34
    :goto_0
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/smartengines/engine/code/CodeObjectData;-><init>(Ljava/lang/String;Ljava/util/List;Landroid/graphics/Bitmap;Lcom/smartengines/visualization/Quad;)V

    return-object v0
.end method

.method private static final parse(Lcom/smartengines/code/CodeField;)Lcom/smartengines/engine/code/CodeObjectField;
    .locals 3

    .line 54
    new-instance v0, Lcom/smartengines/engine/code/CodeObjectField;

    .line 55
    invoke-virtual {p0}, Lcom/smartengines/code/CodeField;->Name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Name(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {p0}, Lcom/smartengines/code/CodeField;->HasOcrStringRepresentation()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 57
    invoke-virtual {p0}, Lcom/smartengines/code/CodeField;->GetOcrString()Lcom/smartengines/common/OcrString;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/common/OcrString;->GetFirstString()Lcom/smartengines/common/MutableString;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/common/MutableString;->GetCStr()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {p0}, Lcom/smartengines/code/CodeField;->GetBinaryRepresentation()Lcom/smartengines/common/ByteString;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/common/ByteString;->GetBase64String()Lcom/smartengines/common/MutableString;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/common/MutableString;->GetCStr()Ljava/lang/String;

    move-result-object v2

    .line 56
    :goto_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 60
    invoke-virtual {p0}, Lcom/smartengines/code/CodeField;->IsAccepted()Z

    move-result p0

    .line 54
    invoke-direct {v0, v1, v2, p0}, Lcom/smartengines/engine/code/CodeObjectField;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static final parse(Lcom/smartengines/code/CodeEngineResult;)Lcom/smartengines/engine/code/CodeResultData;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    invoke-virtual {p0}, Lcom/smartengines/code/CodeEngineResult;->ObjectsBegin()Lcom/smartengines/code/CodeObjectsMapIterator;

    move-result-object v1

    .line 22
    invoke-virtual {p0}, Lcom/smartengines/code/CodeEngineResult;->ObjectsEnd()Lcom/smartengines/code/CodeObjectsMapIterator;

    move-result-object p0

    .line 23
    :goto_0
    invoke-virtual {v1, p0}, Lcom/smartengines/code/CodeObjectsMapIterator;->Equals(Lcom/smartengines/code/CodeObjectsMapIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 24
    invoke-virtual {v1}, Lcom/smartengines/code/CodeObjectsMapIterator;->GetValue()Lcom/smartengines/code/CodeObject;

    move-result-object v2

    const-string v3, "GetValue(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/smartengines/engine/code/CodeResultParserKt;->parse(Lcom/smartengines/code/CodeObject;)Lcom/smartengines/engine/code/CodeObjectData;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    invoke-virtual {v1}, Lcom/smartengines/code/CodeObjectsMapIterator;->Advance()V

    goto :goto_0

    .line 28
    :cond_0
    new-instance p0, Lcom/smartengines/engine/code/CodeResultData;

    .line 29
    check-cast v0, Ljava/util/List;

    .line 28
    invoke-direct {p0, v0}, Lcom/smartengines/engine/code/CodeResultData;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method private static final parseFields(Lcom/smartengines/code/CodeObject;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/code/CodeObject;",
            ")",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/code/CodeObjectField;",
            ">;"
        }
    .end annotation

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    invoke-virtual {p0}, Lcom/smartengines/code/CodeObject;->FieldsBegin()Lcom/smartengines/code/CodeFieldsMapIterator;

    move-result-object v1

    .line 45
    invoke-virtual {p0}, Lcom/smartengines/code/CodeObject;->FieldsEnd()Lcom/smartengines/code/CodeFieldsMapIterator;

    move-result-object p0

    .line 46
    :goto_0
    invoke-virtual {v1, p0}, Lcom/smartengines/code/CodeFieldsMapIterator;->Equals(Lcom/smartengines/code/CodeFieldsMapIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 47
    invoke-virtual {v1}, Lcom/smartengines/code/CodeFieldsMapIterator;->GetValue()Lcom/smartengines/code/CodeField;

    move-result-object v2

    const-string v3, "GetValue(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/smartengines/engine/code/CodeResultParserKt;->parse(Lcom/smartengines/code/CodeField;)Lcom/smartengines/engine/code/CodeObjectField;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    invoke-virtual {v1}, Lcom/smartengines/code/CodeFieldsMapIterator;->Advance()V

    goto :goto_0

    .line 43
    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final parseImage(Lcom/smartengines/code/CodeObject;)Landroid/graphics/Bitmap;
    .locals 2

    .line 65
    invoke-virtual {p0}, Lcom/smartengines/code/CodeObject;->HasImage()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 66
    :cond_0
    invoke-virtual {p0}, Lcom/smartengines/code/CodeObject;->GetImage()Lcom/smartengines/common/Image;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/common/Image;->GetBase64String()Lcom/smartengines/common/MutableString;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/common/MutableString;->GetCStr()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    .line 67
    invoke-static {p0, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    .line 68
    array-length v1, p0

    invoke-static {p0, v0, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method
