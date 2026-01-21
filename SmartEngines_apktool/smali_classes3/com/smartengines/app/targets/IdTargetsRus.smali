.class public final Lcom/smartengines/app/targets/IdTargetsRus;
.super Ljava/lang/Object;
.source "IdTargetsRus.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIdTargetsRus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdTargetsRus.kt\ncom/smartengines/app/targets/IdTargetsRus\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1557#2:31\n1628#2,3:32\n*S KotlinDebug\n*F\n+ 1 IdTargetsRus.kt\ncom/smartengines/app/targets/IdTargetsRus\n*L\n15#1:31\n15#1:32,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0003\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R!\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/smartengines/app/targets/IdTargetsRus;",
        "",
        "<init>",
        "()V",
        "list",
        "",
        "Lcom/smartengines/app/targets/TreeLeaf;",
        "getList",
        "()Ljava/util/List;",
        "list$delegate",
        "Lkotlin/Lazy;",
        "app_storeRelease"
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/smartengines/app/targets/IdTargetsRus;

.field private static final list$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$AKbIHWQXV5doHYuBSxROfj0NuC8(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/targets/TreeLeaf;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/targets/IdTargetsRus;->list_delegate$lambda$4$lambda$2(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/targets/TreeLeaf;)I

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$XblmQu3e92ZcGvNKuB-UGh1Jh9U(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/targets/IdTargetsRus;->list_delegate$lambda$4$lambda$3(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$krftp2WEhyWDmKyMIkLdJxL3Tfg()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/targets/IdTargetsRus;->list_delegate$lambda$4()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/targets/IdTargetsRus;

    invoke-direct {v0}, Lcom/smartengines/app/targets/IdTargetsRus;-><init>()V

    sput-object v0, Lcom/smartengines/app/targets/IdTargetsRus;->INSTANCE:Lcom/smartengines/app/targets/IdTargetsRus;

    .line 13
    new-instance v0, Lcom/smartengines/app/targets/IdTargetsRus$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/smartengines/app/targets/IdTargetsRus$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/smartengines/app/targets/IdTargetsRus;->list$delegate:Lkotlin/Lazy;

    const/16 v0, 0x8

    sput v0, Lcom/smartengines/app/targets/IdTargetsRus;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final list_delegate$lambda$4()Ljava/util/List;
    .locals 13

    .line 15
    sget-object v0, Lcom/smartengines/dictionaries/IdDocTypesRus;->INSTANCE:Lcom/smartengines/dictionaries/IdDocTypesRus;

    invoke-virtual {v0}, Lcom/smartengines/dictionaries/IdDocTypesRus;->getData()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 31
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 33
    check-cast v2, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    .line 17
    new-instance v4, Lcom/smartengines/utils/Name;

    invoke-virtual {v2}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;->getName()Ljava/util/Map;

    move-result-object v3

    const-string v5, "en"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;->getName()Ljava/util/Map;

    move-result-object v5

    const-string v6, "ru"

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v5, Ljava/lang/String;

    invoke-direct {v4, v3, v5}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-virtual {v2}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;->getIcon()I

    move-result v3

    .line 19
    new-instance v5, Lcom/smartengines/targets/id/IdTarget;

    invoke-virtual {v2}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;->getMode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;->getMask()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Lcom/smartengines/targets/id/IdTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-virtual {v2}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;->getPriority()I

    move-result v7

    move v2, v3

    .line 16
    new-instance v3, Lcom/smartengines/app/targets/TreeLeaf;

    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 19
    move-object v10, v5

    check-cast v10, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v11, 0x34

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, v2

    .line 16
    invoke-direct/range {v3 .. v12}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 34
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 31
    check-cast v1, Ljava/lang/Iterable;

    new-instance v0, Lcom/smartengines/app/targets/IdTargetsRus$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/smartengines/app/targets/IdTargetsRus$$ExternalSyntheticLambda1;-><init>()V

    .line 22
    new-instance v2, Lcom/smartengines/app/targets/IdTargetsRus$$ExternalSyntheticLambda2;

    invoke-direct {v2, v0}, Lcom/smartengines/app/targets/IdTargetsRus$$ExternalSyntheticLambda2;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final list_delegate$lambda$4$lambda$2(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/targets/TreeLeaf;)I
    .locals 2

    .line 23
    invoke-virtual {p1}, Lcom/smartengines/app/targets/TreeLeaf;->getPriority()I

    move-result v0

    invoke-virtual {p0}, Lcom/smartengines/app/targets/TreeLeaf;->getPriority()I

    move-result v1

    sub-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v0

    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/smartengines/app/targets/TreeLeaf;->getName()Lcom/smartengines/utils/Name;

    move-result-object p0

    invoke-virtual {p0}, Lcom/smartengines/utils/Name;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/smartengines/app/targets/TreeLeaf;->getName()Lcom/smartengines/utils/Name;

    move-result-object p1

    invoke-virtual {p1}, Lcom/smartengines/utils/Name;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static final list_delegate$lambda$4$lambda$3(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final getList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/app/targets/TreeLeaf;",
            ">;"
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/smartengines/app/targets/IdTargetsRus;->list$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
