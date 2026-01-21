.class public final Lcom/smartengines/utils/ResourceFinder;
.super Ljava/lang/Object;
.source "ResourceFinder.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J)\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/smartengines/utils/ResourceFinder;",
        "",
        "defaultResource",
        "",
        "<init>",
        "(I)V",
        "hash",
        "Ljava/util/HashMap;",
        "",
        "findResourceIdByString",
        "context",
        "Landroid/content/Context;",
        "stringId",
        "theDefault",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)I",
        "utils_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final defaultResource:I

.field private final hash:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput p1, p0, Lcom/smartengines/utils/ResourceFinder;->defaultResource:I

    .line 12
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/smartengines/utils/ResourceFinder;->hash:Ljava/util/HashMap;

    return-void
.end method

.method public static synthetic findResourceIdByString$default(Lcom/smartengines/utils/ResourceFinder;Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/utils/ResourceFinder;->findResourceIdByString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final findResourceIdByString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)I
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_1

    if-eqz p3, :cond_0

    .line 16
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    iget p1, p0, Lcom/smartengines/utils/ResourceFinder;->defaultResource:I

    return p1

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/smartengines/utils/ResourceFinder;->hash:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_2
    move-object v0, p0

    check-cast v0, Lcom/smartengines/utils/ResourceFinder;

    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "drawable"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, v1, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    :goto_0
    if-eqz p1, :cond_3

    return p1

    :cond_3
    if-eqz p3, :cond_4

    .line 24
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_4
    iget p1, p0, Lcom/smartengines/utils/ResourceFinder;->defaultResource:I

    return p1
.end method
