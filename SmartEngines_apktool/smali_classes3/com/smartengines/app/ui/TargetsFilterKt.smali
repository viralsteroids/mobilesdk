.class public final Lcom/smartengines/app/ui/TargetsFilterKt;
.super Ljava/lang/Object;
.source "TargetsFilter.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTargetsFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetsFilter.kt\ncom/smartengines/app/ui/TargetsFilterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n774#2:56\n865#2,2:57\n1#3:59\n*S KotlinDebug\n*F\n+ 1 TargetsFilter.kt\ncom/smartengines/app/ui/TargetsFilterKt\n*L\n36#1:56\n36#1:57,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\"\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0018\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "TAG",
        "",
        "filterData",
        "",
        "Lcom/smartengines/app/targets/TreeItem;",
        "filter",
        "data",
        "checkNode",
        "",
        "node",
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
.field private static final TAG:Ljava/lang/String; = "myapp.Targets2Screen"


# direct methods
.method private static final checkNode(Lcom/smartengines/app/targets/TreeItem;Ljava/lang/String;)Z
    .locals 2

    .line 49
    invoke-interface {p0}, Lcom/smartengines/app/targets/TreeItem;->getName()Lcom/smartengines/utils/Name;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/utils/Name;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    check-cast p1, Ljava/lang/CharSequence;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 51
    instance-of v0, p0, Lcom/smartengines/app/targets/TreeGroup;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/smartengines/app/targets/TreeGroup;

    invoke-virtual {v0}, Lcom/smartengines/app/targets/TreeGroup;->getAltName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0, p1, v1}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 53
    :cond_0
    instance-of v0, p0, Lcom/smartengines/app/targets/TreeLeaf;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/smartengines/app/targets/TreeLeaf;

    invoke-virtual {p0}, Lcom/smartengines/app/targets/TreeLeaf;->getTarget()Lcom/smartengines/engine/RecognitionTarget;

    move-result-object v0

    instance-of v0, v0, Lcom/smartengines/targets/id/IdTarget;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/smartengines/app/targets/TreeLeaf;->getTarget()Lcom/smartengines/engine/RecognitionTarget;

    move-result-object p0

    check-cast p0, Lcom/smartengines/targets/id/IdTarget;

    invoke-virtual {p0}, Lcom/smartengines/targets/id/IdTarget;->getMask()Ljava/lang/String;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0, p1, v1}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    return v1
.end method

.method public static final filterData(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/smartengines/app/targets/TreeItem;",
            ">;"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    move-object v0, p0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 26
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/app/targets/TreeItem;

    .line 30
    invoke-static {v1, p0}, Lcom/smartengines/app/ui/TargetsFilterKt;->checkNode(Lcom/smartengines/app/targets/TreeItem;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 35
    :cond_2
    instance-of v2, v1, Lcom/smartengines/app/targets/TreeGroup;

    if-eqz v2, :cond_1

    .line 36
    move-object v3, v1

    check-cast v3, Lcom/smartengines/app/targets/TreeGroup;

    invoke-virtual {v3}, Lcom/smartengines/app/targets/TreeGroup;->getChildren()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 56
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .line 57
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/smartengines/app/targets/TreeItem;

    .line 37
    invoke-static {v5, p0}, Lcom/smartengines/app/ui/TargetsFilterKt;->checkNode(Lcom/smartengines/app/targets/TreeItem;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 57
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 58
    :cond_4
    move-object v6, v2

    check-cast v6, Ljava/util/List;

    .line 39
    move-object v1, v6

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const/16 v10, 0x3b

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 40
    invoke-static/range {v3 .. v11}, Lcom/smartengines/app/targets/TreeGroup;->copy$default(Lcom/smartengines/app/targets/TreeGroup;Lcom/smartengines/utils/Name;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Lcom/smartengines/app/targets/TreeGroupViewType;ILjava/lang/Object;)Lcom/smartengines/app/targets/TreeGroup;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 45
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "filterData "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, " => "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "myapp.Targets2Screen"

    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
