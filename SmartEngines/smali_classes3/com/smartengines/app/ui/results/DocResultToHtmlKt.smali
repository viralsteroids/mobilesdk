.class public final Lcom/smartengines/app/ui/results/DocResultToHtmlKt;
.super Ljava/lang/Object;
.source "DocResultToHtml.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDocResultToHtml.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocResultToHtml.kt\ncom/smartengines/app/ui/results/DocResultToHtmlKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,370:1\n1872#2,3:371\n1863#2,2:374\n1863#2:376\n1863#2,2:378\n1872#2,3:381\n1864#2:384\n1863#2,2:385\n1863#2:387\n1872#2,3:388\n1864#2:391\n1863#2,2:392\n1863#2,2:394\n1557#2:402\n1628#2,3:403\n1863#2:406\n1863#2,2:407\n1864#2:409\n216#3:377\n217#3:380\n216#3,2:396\n1#4:398\n439#5:399\n439#5:400\n439#5:401\n*S KotlinDebug\n*F\n+ 1 DocResultToHtml.kt\ncom/smartengines/app/ui/results/DocResultToHtmlKt\n*L\n61#1:371,3\n76#1:374,2\n110#1:376\n124#1:378,2\n130#1:381,3\n110#1:384\n143#1:385,2\n156#1:387\n157#1:388,3\n156#1:391\n172#1:392,2\n194#1:394,2\n308#1:402\n308#1:403,3\n200#1:406\n202#1:407,2\n200#1:409\n120#1:377\n120#1:380\n219#1:396,2\n265#1:399\n272#1:400\n280#1:401\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u001a0\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u001a-\u0010\n\u001a\u00020\u000b*\u00020\u00032\n\u0010\u000c\u001a\u00060\u000ej\u0002`\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u00a2\u0006\u0002\u0010\u0013\u001a=\u0010\u0002\u001a\u00020\u000b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00012\n\u0010\u000c\u001a\u00060\u000ej\u0002`\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u00a2\u0006\u0002\u0010\u0016\u001a\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a=\u0010\u0002\u001a\u00020\u000b*\u00020\u00192\n\u0010\u000c\u001a\u00060\u000ej\u0002`\r2\u0006\u0010\u001e\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u00072\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u000b0!H\u0002\u00a2\u0006\u0002\u0010\"\u001a\u000c\u0010#\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a-\u0010$\u001a\u00020\u000b*\u00020%2\n\u0010\u000c\u001a\u00060\u000ej\u0002`\r2\u0006\u0010&\u001a\u00020\u00012\u0008\u0008\u0002\u0010\'\u001a\u00020\u0007\u00a2\u0006\u0002\u0010(\u001aM\u0010)\u001a\u00020\u000b2\n\u0010\u000c\u001a\u00060\u000ej\u0002`\r2\u0008\u0010&\u001a\u0004\u0018\u00010\u00012\u0008\u0010*\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0008\u0010+\u001a\u0004\u0018\u00010\u00012\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u000b0!\u00a2\u0006\u0002\u0010,\u001a \u0010-\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0008\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010.\u001a\u00020\u0001\u001a0\u0010-\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\u0008\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010.\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u001b\u001a\u00020\u0001*\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u00062"
    }
    d2 = {
        "TAG",
        "",
        "toHtml",
        "Lcom/smartengines/engine/doc/DocResultData;",
        "context",
        "Landroid/content/Context;",
        "showImages",
        "",
        "showTables",
        "showAttributes",
        "sceneToHtml",
        "",
        "html",
        "Lkotlin/text/StringBuilder;",
        "Ljava/lang/StringBuilder;",
        "sceneId",
        "",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "(Lcom/smartengines/engine/doc/DocResultData;Ljava/lang/StringBuilder;ILandroid/graphics/Bitmap;)V",
        "Lcom/smartengines/engine/doc/DocumentData;",
        "language",
        "(Lcom/smartengines/engine/doc/DocumentData;Ljava/lang/String;Ljava/lang/StringBuilder;ZZZ)V",
        "compareFieldInfo",
        "a",
        "Lcom/smartengines/engine/doc/FieldInfo;",
        "b",
        "label",
        "getLabel",
        "(Lcom/smartengines/engine/doc/FieldInfo;)Ljava/lang/String;",
        "docId",
        "isImageField",
        "printValue",
        "Lkotlin/Function0;",
        "(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/StringBuilder;IZLkotlin/jvm/functions/Function0;)V",
        "toHtmlEscaped",
        "toSvgPolygon",
        "Lcom/smartengines/engine/Geometry;",
        "id",
        "isHidden",
        "(Lcom/smartengines/engine/Geometry;Ljava/lang/StringBuilder;Ljava/lang/String;Z)V",
        "dataRowToHtml",
        "isAccepted",
        "rightIcon",
        "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V",
        "htmlSvgImage",
        "style",
        "base64String",
        "width",
        "height",
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
.field private static final TAG:Ljava/lang/String; = "myapp.Doc-to-Html"


# direct methods
.method public static synthetic $r8$lambda$2Oyi-BlV7kMIjwgAgTTY-la_4hw(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml$lambda$9(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$51_ul2W-BPriS9rvLIjJdRGYv-k(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/TextField;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml$lambda$11$lambda$10(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/TextField;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$EYyMO4pdi5h87q4BdvkS-PPJXIo(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml$lambda$16(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$RiN0DHtJxkNWao6QKc3UCpobJLc(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/TableField;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml$lambda$22$lambda$21(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/TableField;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XMd-FFFLRW_MpEqtSSc6F_SR9Xg(Lcom/smartengines/engine/doc/TextField;Lcom/smartengines/engine/doc/TextField;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml$lambda$8(Lcom/smartengines/engine/doc/TextField;Lcom/smartengines/engine/doc/TextField;)I

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$ab9PyR9qxWceQ6xA-bQQZAI7H2w(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/BasicTextObject;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml$lambda$14$lambda$13$lambda$12(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/BasicTextObject;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$hY9P-91l1IYqKb7OUGgRQlRo8V8(Lcom/smartengines/engine/doc/ImageField;Lcom/smartengines/engine/doc/ImageField;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml$lambda$15(Lcom/smartengines/engine/doc/ImageField;Lcom/smartengines/engine/doc/ImageField;)I

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$lhYNfRHZYpHhzwU5DQLG9zGc4sM(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/ImageField;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml$lambda$18$lambda$17(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/ImageField;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final compareFieldInfo(Lcom/smartengines/engine/doc/FieldInfo;Lcom/smartengines/engine/doc/FieldInfo;)I
    .locals 2

    .line 233
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/FieldInfo;->getAttributes()Ljava/util/Map;

    move-result-object p0

    const-string v0, "order"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v1

    .line 234
    :goto_0
    invoke-virtual {p1}, Lcom/smartengines/engine/doc/FieldInfo;->getAttributes()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    :cond_1
    if-eqz p0, :cond_2

    if-eqz v1, :cond_2

    .line 236
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sub-int/2addr p0, p1

    return p0

    :cond_2
    if-eqz p0, :cond_3

    const/4 p0, 0x1

    return p0

    :cond_3
    if-nez v1, :cond_4

    goto :goto_1

    .line 238
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-eqz p0, :cond_5

    :goto_1
    const/4 p0, -0x1

    return p0

    :cond_5
    const/4 p0, 0x0

    return p0
.end method

.method public static final dataRowToHtml(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "html"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "printValue"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    const-string v0, "<div class=\'item\'>\n"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    const-string v0, "<span class=\'key\'>\n"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_2

    .line 327
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 329
    const-string p2, "green"

    goto :goto_0

    :cond_0
    const-string/jumbo p2, "yellow"

    .line 330
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<span class=\'dot_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, "\'></span>"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_1

    .line 333
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    if-eqz p4, :cond_2

    .line 337
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    :cond_2
    const-string p2, "</span>\n"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "<div class=\'value\' data-id=\'"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, "\'>"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    invoke-interface {p5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 350
    const-string p1, "</div>\n"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static final getLabel(Lcom/smartengines/engine/doc/FieldInfo;)Ljava/lang/String;
    .locals 2

    .line 243
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/FieldInfo;->getName()Lcom/smartengines/engine/doc/DocName;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/smartengines/engine/doc/DocName;->getLocal()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/FieldInfo;->getKey()Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/FieldInfo;->getKey()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final htmlSvgImage(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "bitmap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    invoke-static {p0}, Lcom/smartengines/utils/UtilsKt;->bitmapToBase64String(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v0

    .line 359
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p0

    .line 357
    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->htmlSvgImage(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final htmlSvgImage(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "base64String"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 364
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<svg xmlns=\'http://www.w3.org/2000/svg\' viewBox=\'0 0 "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    if-eqz p3, :cond_0

    .line 366
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "id=\'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    const-string p3, ""

    .line 364
    :goto_0
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    .line 367
    const-string/jumbo v0, "style=\'"

    .line 364
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    .line 367
    const-string p4, "\'><image width=\'"

    .line 364
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 368
    const-string p3, "\' height=\'"

    .line 364
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 368
    const-string p2, "\' href=\'data:image/jpeg;base64,"

    .line 364
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 368
    const-string p1, "\'/>\n</svg>"

    .line 364
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final sceneToHtml(Lcom/smartengines/engine/doc/DocResultData;Ljava/lang/StringBuilder;ILandroid/graphics/Bitmap;)V
    .locals 0

    .line 90
    const-string p0, "<div class=\'svg_container\' align=\'center\'>"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p2, "<svg viewBox=\'0 0 "

    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    const/16 p2, 0x20

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p2, "\' id=\'root\' xmlns=\'http://www.w3.org/2000/svg\' style=\'max-width: 100%; height:auto\'>"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p2, "<image width=\'"

    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p2, "\' height=\'"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p2, "\' href=\'data:image/jpeg;base64,"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-static {p3}, Lcom/smartengines/utils/UtilsKt;->bitmapToBase64String(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p2, "\'/>\n"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    const-string p0, "</svg>"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    const-string p0, "</div>"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static final toHtml(Lcom/smartengines/engine/doc/DocResultData;Landroid/content/Context;ZZZ)Ljava/lang/String;
    .locals 11

    const-string v0, "\'>"

    const-string v1, "<script type=\'text/javascript\'>"

    const-string v2, "<style type=\'text/css\'>"

    const-string v3, "<this>"

    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "context"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v6

    .line 26
    :try_start_0
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    const-string v3, "<!DOCTYPE html>\n"

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    const-string v3, "<html>\n"

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    const-string v3, "<head>\n"

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    const-string v3, "<meta name=\'viewport\'  content=\'width=device-width, initial-scale=1.0\'>\n"

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "doc-result.css"

    invoke-static {p1, v2}, Lcom/smartengines/utils/UtilsKt;->readAssetsTextFile(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "</style>\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    const-string v2, "<style>\npolygon.poly {\n  stroke: #00B09A;\n  fill: rgba(0, 176, 154, 0.2);\n  fill-opacity: 30%;\n}\npolygon.selected_poly {\n  stroke: #000000;\n  fill: #70A269;\n  fill-opacity: 30%;\n}\n</style>"

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "doc-result.js"

    invoke-static {p1, v1}, Lcom/smartengines/utils/UtilsKt;->readAssetsTextFile(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, "</script>\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    const-string p1, "</head>\n"

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    const-string p1, "<body>\n"

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/DocResultData;->getDocuments()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    .line 58
    const-string p1, "<div class=\'doc-carousel\'>"

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    const-string p1, "<button class=\'carousel-btn carousel-prev\'>\u2190</button>"

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    const-string p1, "<div class=\'carousel-container\'>"

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/DocResultData;->getDocuments()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 372
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "</div>"

    if-eqz v1, :cond_3

    :try_start_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v3, v4, 0x1

    if-gez v4, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v1, Lcom/smartengines/engine/doc/DocumentData;

    .line 62
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "<div class=\'doc-thumbnail\' data-index=\'"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    const-string v4, "<img "

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual {v1}, Lcom/smartengines/engine/doc/DocumentData;->getPhysicalDoc()Lcom/smartengines/engine/doc/PhysicalDocumentData;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/smartengines/engine/doc/PhysicalDocumentData;->getPages()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/smartengines/engine/doc/PhysicalPageData;

    if-eqz v4, :cond_1

    .line 65
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v8, "src=\'data:image/jpeg;base64,"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v4}, Lcom/smartengines/engine/doc/PhysicalPageData;->getImageBase64String()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const/16 v5, 0x27

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, " alt=\'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Lcom/smartengines/engine/doc/DocumentData;->getName()Lcom/smartengines/engine/doc/DocName;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/smartengines/engine/doc/DocName;->getDefault()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v4, v3

    goto/16 :goto_0

    .line 70
    :cond_3
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    const-string p1, "<button class=\'carousel-btn carousel-next\'>\u2192</button>"

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    :cond_4
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/DocResultData;->getDocuments()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 374
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/smartengines/engine/doc/DocumentData;

    .line 77
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move v8, p2

    move v9, p3

    move v10, p4

    invoke-static/range {v5 .. v10}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml(Lcom/smartengines/engine/doc/DocumentData;Ljava/lang/String;Ljava/lang/StringBuilder;ZZZ)V

    move p2, v8

    move p3, v9

    move p4, v10

    goto :goto_2

    .line 79
    :cond_5
    const-string p0, "</body>\n"

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    const-string p0, "</html>\n"

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    move-object p0, v0

    .line 83
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "<html><body>Error: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, " </body></html>"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final toHtml(Lcom/smartengines/engine/doc/DocumentData;Ljava/lang/String;Ljava/lang/StringBuilder;ZZZ)V
    .locals 20

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    .line 101
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getId()I

    move-result v8

    .line 102
    const-string v2, "<section class=\'doc-section\'>\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getName()Lcom/smartengines/engine/doc/DocName;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 105
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "<h3 align=\'center\'>"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/smartengines/engine/doc/DocName;->getShort(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "</h3>\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "<h4 align=\'center\'>("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")</h4>\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getPhysicalDoc()Lcom/smartengines/engine/doc/PhysicalDocumentData;

    move-result-object v2

    const-string/jumbo v9, "untypified"

    const/16 v10, 0x3a

    const/4 v11, 0x0

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/smartengines/engine/doc/PhysicalDocumentData;->getPages()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_6

    check-cast v2, Ljava/lang/Iterable;

    .line 376
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/smartengines/engine/doc/PhysicalPageData;

    .line 113
    const-string v4, "<div class=\'svg_container\' align=\'center\'>"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "<svg viewBox=\'0 0 "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/smartengines/engine/doc/PhysicalPageData;->getWidth()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const/16 v5, 0x20

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/smartengines/engine/doc/PhysicalPageData;->getHeight()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\' id=\'root\' xmlns=\'http://www.w3.org/2000/svg\' style=\'max-width: 100%; height:auto\'>"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "<image width=\'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/smartengines/engine/doc/PhysicalPageData;->getWidth()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\' height=\'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/smartengines/engine/doc/PhysicalPageData;->getHeight()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\' href=\'data:image/jpeg;base64,"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/smartengines/engine/doc/PhysicalPageData;->getImageBase64String()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\'/>\n"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    invoke-virtual {v3}, Lcom/smartengines/engine/doc/PhysicalPageData;->getFields()Ljava/util/Map;

    move-result-object v4

    .line 377
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 120
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/smartengines/engine/doc/PhysicalFieldInfo;

    move-object/from16 v12, p0

    .line 121
    invoke-virtual {v12, v6}, Lcom/smartengines/engine/doc/DocumentData;->getFieldInfo(Ljava/lang/String;)Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v7

    if-eqz v7, :cond_2

    .line 122
    invoke-virtual {v7}, Lcom/smartengines/engine/doc/FieldInfo;->getAttributes()Ljava/util/Map;

    move-result-object v7

    if-eqz v7, :cond_2

    const-string v13, "has_object"

    invoke-interface {v7, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    const-string v13, "false"

    invoke-static {v7, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    .line 124
    invoke-virtual {v5}, Lcom/smartengines/engine/doc/PhysicalFieldInfo;->getGeometries()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 378
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/smartengines/engine/Geometry;

    .line 125
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v1, v14, v7}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toSvgPolygon(Lcom/smartengines/engine/Geometry;Ljava/lang/StringBuilder;Ljava/lang/String;Z)V

    goto :goto_2

    :cond_3
    move-object/from16 v12, p0

    .line 129
    invoke-virtual {v12}, Lcom/smartengines/engine/doc/DocumentData;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 130
    invoke-virtual {v3}, Lcom/smartengines/engine/doc/PhysicalPageData;->getBasicTextObjects()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 382
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v11

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-gez v4, :cond_4

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_4
    check-cast v5, Lcom/smartengines/engine/doc/BasicTextObject;

    .line 131
    invoke-virtual {v5}, Lcom/smartengines/engine/doc/BasicTextObject;->getGeometry()Lcom/smartengines/engine/Geometry;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v1, v4, v11}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toSvgPolygon(Lcom/smartengines/engine/Geometry;Ljava/lang/StringBuilder;Ljava/lang/String;Z)V

    move v4, v6

    goto :goto_3

    .line 135
    :cond_5
    const-string v3, "</svg>"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    const-string v3, "</div>"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_6
    move-object/from16 v12, p0

    .line 140
    invoke-virtual {v12}, Lcom/smartengines/engine/doc/DocumentData;->getTexts()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    const-string/jumbo v13, "\u041f\u043e\u043b\u044f"

    const-string v14, "Fields"

    const-string v15, "</h2>\n"

    const-string v3, "ru"

    const-string v4, "<h2>"

    const-string v5, "<div class=\'container\'>\n"

    const-string v6, "</div>\n"

    if-nez v2, :cond_9

    .line 141
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move-object v7, v13

    goto :goto_4

    :cond_7
    move-object v7, v14

    :goto_4
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    invoke-virtual {v12}, Lcom/smartengines/engine/doc/DocumentData;->getTexts()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v7, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda0;

    invoke-direct {v7}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda0;-><init>()V

    new-instance v11, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda1;

    invoke-direct {v11, v7}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v2, v11}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 385
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/engine/doc/TextField;

    .line 145
    invoke-virtual {v2}, Lcom/smartengines/engine/doc/TextField;->getInfo()Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v7

    move-object/from16 v16, v3

    invoke-virtual {v12}, Lcom/smartengines/engine/doc/DocumentData;->getId()I

    move-result v3

    move-object/from16 v17, v5

    new-instance v5, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda2;

    invoke-direct {v5, v1, v2}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda2;-><init>(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/TextField;)V

    move-object v2, v6

    const/4 v6, 0x4

    move-object v1, v7

    const/4 v7, 0x0

    move-object/from16 v18, v4

    const/4 v4, 0x0

    move-object/from16 v10, v16

    move-object/from16 v12, v17

    move-object/from16 v16, v11

    move-object/from16 v17, v13

    move-object/from16 v11, v18

    move-object v13, v2

    move-object/from16 v2, p2

    invoke-static/range {v1 .. v7}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml$default(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/StringBuilder;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    move-object v1, v2

    move-object v3, v10

    move-object v4, v11

    move-object v5, v12

    move-object v6, v13

    move-object/from16 v11, v16

    move-object/from16 v13, v17

    const/16 v10, 0x3a

    move-object/from16 v12, p0

    goto :goto_5

    :cond_8
    move-object v10, v3

    move-object v11, v4

    move-object v12, v5

    move-object/from16 v17, v13

    move-object v13, v6

    .line 150
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_6

    :cond_9
    move-object v10, v3

    move-object v11, v4

    move-object v12, v5

    move-object/from16 v17, v13

    move-object v13, v6

    .line 153
    :goto_6
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 154
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    move-object/from16 v14, v17

    :cond_a
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getPhysicalDoc()Lcom/smartengines/engine/doc/PhysicalDocumentData;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Lcom/smartengines/engine/doc/PhysicalDocumentData;->getPages()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_d

    check-cast v2, Ljava/lang/Iterable;

    .line 387
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/engine/doc/PhysicalPageData;

    .line 157
    invoke-virtual {v2}, Lcom/smartengines/engine/doc/PhysicalPageData;->getBasicTextObjects()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 389
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v2, 0x0

    :goto_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v14, v2, 0x1

    if-gez v2, :cond_b

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_b
    check-cast v3, Lcom/smartengines/engine/doc/BasicTextObject;

    .line 159
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const/16 v5, 0x3a

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lcom/smartengines/engine/doc/BasicTextObject;->isAccepted()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    new-instance v6, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda3;

    invoke-direct {v6, v1, v3}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda3;-><init>(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/BasicTextObject;)V

    move-object v3, v4

    const/4 v4, 0x0

    move/from16 v19, v5

    const/4 v5, 0x0

    invoke-static/range {v1 .. v6}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->dataRowToHtml(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    move v2, v14

    goto :goto_8

    :cond_c
    const/16 v19, 0x3a

    goto :goto_7

    .line 165
    :cond_d
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    :cond_e
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getImages()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_11

    if-eqz p3, :cond_11

    .line 170
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    const-string/jumbo v3, "\u0418\u0437\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u044f"

    goto :goto_9

    :cond_f
    const-string v3, "Images"

    :goto_9
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getImages()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda4;

    invoke-direct {v3}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda4;-><init>()V

    new-instance v4, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda5;

    invoke-direct {v4, v3}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda5;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 392
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/smartengines/engine/doc/ImageField;

    .line 174
    invoke-virtual {v3}, Lcom/smartengines/engine/doc/ImageField;->getInfo()Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getId()I

    move-result v5

    new-instance v6, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda6;

    invoke-direct {v6, v1, v3}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda6;-><init>(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/ImageField;)V

    const/4 v3, 0x1

    invoke-static {v4, v1, v5, v3, v6}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/StringBuilder;IZLkotlin/jvm/functions/Function0;)V

    goto :goto_a

    .line 187
    :cond_10
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getTables()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_14

    if-eqz p4, :cond_14

    .line 192
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    const-string/jumbo v0, "\u0422\u0430\u0431\u043b\u0438\u0446\u044b"

    goto :goto_b

    :cond_12
    const-string v0, "Tables"

    :goto_b
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getTables()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 394
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/engine/doc/TableField;

    .line 195
    const-string v2, "<div style=\'overflow-x:auto;\'>\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    invoke-virtual {v0}, Lcom/smartengines/engine/doc/TableField;->getInfo()Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v2

    move-object v3, v2

    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getId()I

    move-result v2

    new-instance v4, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda7;

    invoke-direct {v4, v1, v0}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda7;-><init>(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/TableField;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v0, v3

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml$default(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/StringBuilder;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 210
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_c

    .line 212
    :cond_13
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    :cond_14
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getAttributes()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_16

    if-eqz p5, :cond_16

    .line 217
    const-string v0, "<h2>Attributes</h2>\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    invoke-virtual/range {p0 .. p0}, Lcom/smartengines/engine/doc/DocumentData;->getAttributes()Ljava/util/Map;

    move-result-object v0

    .line 396
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 220
    const-string v3, "<div class=\'item\'>\n"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "<span class=\'key\'>"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "</span>\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "<span class=\'value\'>"

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_d

    .line 225
    :cond_15
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    :cond_16
    const-string v0, "</section>\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static final toHtml(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/StringBuilder;IZLkotlin/jvm/functions/Function0;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/engine/doc/FieldInfo;",
            "Ljava/lang/StringBuilder;",
            "IZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_2

    .line 260
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/FieldInfo;->getAttributes()Ljava/util/Map;

    move-result-object p3

    const-string v1, "has_object"

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    const-string/jumbo v1, "true"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    const-string v2, "#000000"

    const-string/jumbo v3, "width:1em; height:1em; margin-left:1em"

    const-string v4, "#FFFFFF"

    if-eqz p3, :cond_1

    .line 261
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/FieldInfo;->getAttributes()Ljava/util/Map;

    move-result-object p3

    const-string v5, "color_check"

    invoke-interface {p3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 264
    invoke-static {}, Lcom/smartengines/app/AppKt;->getApp()Lcom/smartengines/app/App;

    move-result-object p3

    check-cast p3, Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$drawable;->res_check_passed:I

    .line 265
    const-string v2, "#0000FF"

    .line 399
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    .line 264
    invoke-static {p3, v1, v2, v4}, Lcom/smartengines/utils/UtilsKt;->drawableToBitmap(Landroid/content/Context;III)Landroid/graphics/Bitmap;

    move-result-object p3

    .line 263
    invoke-static {p3, v0, v3}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->htmlSvgImage(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    .line 271
    :cond_0
    invoke-static {}, Lcom/smartengines/app/AppKt;->getApp()Lcom/smartengines/app/App;

    move-result-object p3

    check-cast p3, Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$drawable;->res_check_passed:I

    .line 400
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    .line 271
    invoke-static {p3, v1, v2, v4}, Lcom/smartengines/utils/UtilsKt;->drawableToBitmap(Landroid/content/Context;III)Landroid/graphics/Bitmap;

    move-result-object p3

    .line 270
    invoke-static {p3, v0, v3}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->htmlSvgImage(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    .line 279
    :cond_1
    invoke-static {}, Lcom/smartengines/app/AppKt;->getApp()Lcom/smartengines/app/App;

    move-result-object p3

    check-cast p3, Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$drawable;->res_check_undefined:I

    .line 401
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    .line 279
    invoke-static {p3, v1, v2, v4}, Lcom/smartengines/utils/UtilsKt;->drawableToBitmap(Landroid/content/Context;III)Landroid/graphics/Bitmap;

    move-result-object p3

    .line 278
    invoke-static {p3, v0, v3}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->htmlSvgImage(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 285
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<span>"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    const-string v0, "</span>"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    move-object v5, v0

    .line 289
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    const/16 p3, 0x3a

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p0}, Lcom/smartengines/engine/doc/FieldInfo;->getKey()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/smartengines/engine/doc/FieldInfo;->isAccepted()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {p0}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->getLabel(Lcom/smartengines/engine/doc/FieldInfo;)Ljava/lang/String;

    move-result-object v4

    move-object v1, p1

    move-object v6, p4

    invoke-static/range {v1 .. v6}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->dataRowToHtml(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic toHtml$default(Lcom/smartengines/engine/doc/DocResultData;Landroid/content/Context;ZZZILjava/lang/Object;)Ljava/lang/String;
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x1

    if-eqz p6, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move p4, v0

    .line 18
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml(Lcom/smartengines/engine/doc/DocResultData;Landroid/content/Context;ZZZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic toHtml$default(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/StringBuilder;IZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    .line 256
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtml(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/StringBuilder;IZLkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private static final toHtml$lambda$11$lambda$10(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/TextField;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$html"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    invoke-virtual {p1}, Lcom/smartengines/engine/doc/TextField;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtmlEscaped(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final toHtml$lambda$14$lambda$13$lambda$12(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/BasicTextObject;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$html"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    invoke-virtual {p1}, Lcom/smartengines/engine/doc/BasicTextObject;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toHtmlEscaped(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final toHtml$lambda$15(Lcom/smartengines/engine/doc/ImageField;Lcom/smartengines/engine/doc/ImageField;)I
    .locals 0

    .line 172
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/ImageField;->getInfo()Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object p0

    invoke-virtual {p1}, Lcom/smartengines/engine/doc/ImageField;->getInfo()Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->compareFieldInfo(Lcom/smartengines/engine/doc/FieldInfo;Lcom/smartengines/engine/doc/FieldInfo;)I

    move-result p0

    return p0
.end method

.method private static final toHtml$lambda$16(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final toHtml$lambda$18$lambda$17(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/ImageField;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$html"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    invoke-virtual {p1}, Lcom/smartengines/engine/doc/ImageField;->getValue()Landroid/graphics/Bitmap;

    move-result-object p1

    const-string v0, "root"

    const-string v1, "max-width: 100%; height:auto"

    invoke-static {p1, v0, v1}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->htmlSvgImage(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final toHtml$lambda$22$lambda$21(Ljava/lang/StringBuilder;Lcom/smartengines/engine/doc/TableField;)Lkotlin/Unit;
    .locals 5

    const-string v0, "$html"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    const-string v0, "<table cellspacing=\'2\' cellpadding=\'2\'>\n"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    invoke-virtual {p1}, Lcom/smartengines/engine/doc/TableField;->getRows()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 406
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 201
    const-string v1, "<tr>"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    check-cast v0, Ljava/lang/Iterable;

    .line 407
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/engine/doc/TextField;

    .line 203
    invoke-virtual {v1}, Lcom/smartengines/engine/doc/TextField;->getInfo()Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/engine/doc/FieldInfo;->getAttributes()Ljava/util/Map;

    move-result-object v2

    const-string v3, "multicol"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v2, "1"

    .line 204
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "<td colspan="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "><span>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/smartengines/engine/doc/TextField;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "</span></td>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 206
    :cond_1
    const-string v0, "</tr>\n"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 208
    :cond_2
    const-string p1, "</table>\n"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final toHtml$lambda$8(Lcom/smartengines/engine/doc/TextField;Lcom/smartengines/engine/doc/TextField;)I
    .locals 0

    .line 143
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/TextField;->getInfo()Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object p0

    invoke-virtual {p1}, Lcom/smartengines/engine/doc/TextField;->getInfo()Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->compareFieldInfo(Lcom/smartengines/engine/doc/FieldInfo;Lcom/smartengines/engine/doc/FieldInfo;)I

    move-result p0

    return p0
.end method

.method private static final toHtml$lambda$9(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final toHtmlEscaped(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    const/4 v4, 0x4

    const/4 v5, 0x0

    .line 295
    const-string v1, "&"

    const-string v2, "&amp;"

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x4

    const/4 v11, 0x0

    .line 296
    const-string v7, "<"

    const-string v8, "&lt;"

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 297
    const-string v1, ">"

    const-string v2, "&gt;"

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 298
    const-string v7, "\""

    const-string v8, "&quot;"

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 299
    const-string v1, "\'"

    const-string v2, "&#39;"

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final toSvgPolygon(Lcom/smartengines/engine/Geometry;Ljava/lang/StringBuilder;Ljava/lang/String;Z)V
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "html"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    invoke-virtual {p0}, Lcom/smartengines/engine/Geometry;->getPoints()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 402
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 403
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 404
    check-cast v1, Lcom/smartengines/visualization/QuadPoint;

    .line 308
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/smartengines/visualization/QuadPoint;->getX()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x2c

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/smartengines/visualization/QuadPoint;->getY()F

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 404
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 405
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 402
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    .line 309
    const-string p0, " "

    move-object v2, p0

    check-cast v2, Ljava/lang/CharSequence;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 311
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<polygon class=\'poly"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p3, :cond_1

    const-string p3, " hidden-poly"

    goto :goto_1

    :cond_1
    const-string p3, ""

    :goto_1
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    const-string v0, "\' parent_id=\'"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string p3, "\' points=\'"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p2, "\'/>\n"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static synthetic toSvgPolygon$default(Lcom/smartengines/engine/Geometry;Ljava/lang/StringBuilder;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 305
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->toSvgPolygon(Lcom/smartengines/engine/Geometry;Ljava/lang/StringBuilder;Ljava/lang/String;Z)V

    return-void
.end method
