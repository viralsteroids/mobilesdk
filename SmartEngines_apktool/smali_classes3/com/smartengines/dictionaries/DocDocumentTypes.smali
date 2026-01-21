.class public final Lcom/smartengines/dictionaries/DocDocumentTypes;
.super Ljava/lang/Object;
.source "DocDocumentTypes.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/dictionaries/DocDocumentTypes$DocumentType;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDocDocumentTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocDocumentTypes.kt\ncom/smartengines/dictionaries/DocDocumentTypes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/smartengines/dictionaries/DocDocumentTypes;",
        "",
        "<init>",
        "()V",
        "loadDictionary",
        "",
        "",
        "Lcom/smartengines/dictionaries/DocDocumentTypes$DocumentType;",
        "context",
        "Landroid/content/Context;",
        "DocumentType",
        "dictionaries_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/smartengines/dictionaries/DocDocumentTypes;


# direct methods
.method public static synthetic $r8$lambda$IlRvZZpbZaMR69lfabp4RsUkMWk(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/smartengines/dictionaries/DocDocumentTypes$DocumentType;
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/dictionaries/DocDocumentTypes;->loadDictionary$lambda$1(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/smartengines/dictionaries/DocDocumentTypes$DocumentType;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/dictionaries/DocDocumentTypes;

    invoke-direct {v0}, Lcom/smartengines/dictionaries/DocDocumentTypes;-><init>()V

    sput-object v0, Lcom/smartengines/dictionaries/DocDocumentTypes;->INSTANCE:Lcom/smartengines/dictionaries/DocDocumentTypes;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final loadDictionary$lambda$1(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/smartengines/dictionaries/DocDocumentTypes$DocumentType;
    .locals 1

    const-string v0, "$language"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    const-string v0, "name"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "getString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    const-string v0, "group"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 21
    new-instance v0, Lcom/smartengines/dictionaries/DocDocumentTypes$DocumentType;

    invoke-direct {v0, p0, p1}, Lcom/smartengines/dictionaries/DocDocumentTypes$DocumentType;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final loadDictionary(Landroid/content/Context;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/dictionaries/DocDocumentTypes$DocumentType;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 15
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "en"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    const-string v3, "ru"

    aput-object v3, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Lcom/smartengines/dictionaries/DicUtilsKt;->getCurrentLanguage(Landroid/content/Context;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    .line 17
    new-instance v1, Lcom/smartengines/dictionaries/DocDocumentTypes$$ExternalSyntheticLambda0;

    invoke-direct {v1, v0}, Lcom/smartengines/dictionaries/DocDocumentTypes$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;)V

    const-string v0, "doc-document-types.json"

    invoke-static {p1, v2, v0, v1}, Lcom/smartengines/dictionaries/DicUtilsKt;->loadJSONObjectDictionary(Landroid/content/Context;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
