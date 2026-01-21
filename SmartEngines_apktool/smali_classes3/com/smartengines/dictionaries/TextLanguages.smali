.class public final Lcom/smartengines/dictionaries/TextLanguages;
.super Ljava/lang/Object;
.source "TextLanguages.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/smartengines/dictionaries/TextLanguages;",
        "",
        "<init>",
        "()V",
        "loadDictionary",
        "",
        "Lcom/smartengines/dictionaries/KeyName;",
        "context",
        "Landroid/content/Context;",
        "allowedKeys",
        "",
        "",
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
.field public static final INSTANCE:Lcom/smartengines/dictionaries/TextLanguages;


# direct methods
.method public static synthetic $r8$lambda$qFSTcK7Dz6u14MT0GQM9lf46rDM(Ljava/util/Set;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/smartengines/dictionaries/TextLanguages;->loadDictionary$lambda$1$lambda$0(Ljava/util/Set;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/dictionaries/TextLanguages;

    invoke-direct {v0}, Lcom/smartengines/dictionaries/TextLanguages;-><init>()V

    sput-object v0, Lcom/smartengines/dictionaries/TextLanguages;->INSTANCE:Lcom/smartengines/dictionaries/TextLanguages;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final loadDictionary$lambda$1$lambda$0(Ljava/util/Set;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this_apply"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$language"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 19
    invoke-interface {p0, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 21
    :cond_0
    new-instance p0, Lcom/smartengines/dictionaries/KeyName;

    .line 23
    const-string v0, "name"

    invoke-virtual {p4, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p4

    invoke-virtual {p4, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p4, "getString(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0, p3, p2}, Lcom/smartengines/dictionaries/KeyName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final loadDictionary(Landroid/content/Context;Ljava/util/Set;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/smartengines/dictionaries/KeyName;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    invoke-static {p1}, Lcom/smartengines/utils/UtilsKt;->getCurrentLanguage(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 17
    new-instance v2, Lorg/json/JSONObject;

    const-string/jumbo v3, "text-languages.json"

    invoke-static {p1, v3}, Lcom/smartengines/utils/UtilsKt;->readAssetsTextFile(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 18
    new-instance p1, Lcom/smartengines/dictionaries/TextLanguages$$ExternalSyntheticLambda0;

    invoke-direct {p1, p2, v0, v1}, Lcom/smartengines/dictionaries/TextLanguages$$ExternalSyntheticLambda0;-><init>(Ljava/util/Set;Ljava/util/ArrayList;Ljava/lang/String;)V

    invoke-static {v2, p1}, Lcom/smartengines/utils/UtilsKt;->forEachJsonObject(Lorg/json/JSONObject;Lkotlin/jvm/functions/Function2;)V

    .line 15
    check-cast v0, Ljava/util/List;

    return-object v0
.end method
