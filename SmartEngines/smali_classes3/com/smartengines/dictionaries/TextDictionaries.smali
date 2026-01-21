.class public final Lcom/smartengines/dictionaries/TextDictionaries;
.super Ljava/lang/Object;
.source "TextDictionaries.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/smartengines/dictionaries/TextDictionaries;",
        "",
        "<init>",
        "()V",
        "loadTextLanguages",
        "",
        "Lcom/smartengines/dictionaries/KeyName;",
        "context",
        "Landroid/content/Context;",
        "isShortList",
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
.field public static final INSTANCE:Lcom/smartengines/dictionaries/TextDictionaries;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/dictionaries/TextDictionaries;

    invoke-direct {v0}, Lcom/smartengines/dictionaries/TextDictionaries;-><init>()V

    sput-object v0, Lcom/smartengines/dictionaries/TextDictionaries;->INSTANCE:Lcom/smartengines/dictionaries/TextDictionaries;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final loadTextLanguages(Landroid/content/Context;Z)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/smartengines/dictionaries/KeyName;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    sget-object v0, Lcom/smartengines/dictionaries/TextLanguages;->INSTANCE:Lcom/smartengines/dictionaries/TextLanguages;

    if-eqz p2, :cond_0

    const/4 p2, 0x3

    .line 9
    new-array p2, p2, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "digits"

    aput-object v2, p2, v1

    const/4 v1, 0x1

    const-string v2, "eng"

    aput-object v2, p2, v1

    const/4 v1, 0x2

    const-string v2, "rus"

    aput-object v2, p2, v1

    invoke-static {p2}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 7
    :goto_0
    invoke-virtual {v0, p1, p2}, Lcom/smartengines/dictionaries/TextLanguages;->loadDictionary(Landroid/content/Context;Ljava/util/Set;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
