.class public final Lcom/smartengines/targets/id/IdTargetUtils;
.super Ljava/lang/Object;
.source "IdTargetUtils.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIdTargetUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdTargetUtils.kt\ncom/smartengines/targets/id/IdTargetUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n1863#2,2:29\n*S KotlinDebug\n*F\n+ 1 IdTargetUtils.kt\ncom/smartengines/targets/id/IdTargetUtils\n*L\n22#1:29,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0008\u001a\u00020\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/smartengines/targets/id/IdTargetUtils;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "loadDocumentTypesForManyInternalEngines",
        "",
        "country",
        "internalEngines",
        "",
        "Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;",
        "targets_release"
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
.field public static final INSTANCE:Lcom/smartengines/targets/id/IdTargetUtils;

.field private static final TAG:Ljava/lang/String; = "myapp.IdTargetUtils"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/targets/id/IdTargetUtils;

    invoke-direct {v0}, Lcom/smartengines/targets/id/IdTargetUtils;-><init>()V

    sput-object v0, Lcom/smartengines/targets/id/IdTargetUtils;->INSTANCE:Lcom/smartengines/targets/id/IdTargetUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final loadDocumentTypesForManyInternalEngines(Ljava/lang/String;Ljava/lang/Iterable;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Iterable<",
            "Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "country"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalEngines"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;

    .line 23
    invoke-virtual {v1}, Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/16 v4, 0x2e

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v2, v3, v6, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 24
    :cond_1
    invoke-virtual {v1}, Lcom/smartengines/targets/id/IdSessionOptions$InternalEngine;->getSupportedDocumentTypes()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 26
    :cond_2
    check-cast v0, Ljava/util/List;

    return-object v0
.end method
