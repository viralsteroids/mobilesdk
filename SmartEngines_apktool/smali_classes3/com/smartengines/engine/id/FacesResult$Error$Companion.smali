.class public final Lcom/smartengines/engine/id/FacesResult$Error$Companion;
.super Ljava/lang/Object;
.source "Faces.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/engine/id/FacesResult$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFaces.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Faces.kt\ncom/smartengines/engine/id/FacesResult$Error$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n230#2,2:54\n*S KotlinDebug\n*F\n+ 1 Faces.kt\ncom/smartengines/engine/id/FacesResult$Error$Companion\n*L\n19#1:54,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/smartengines/engine/id/FacesResult$Error$Companion;",
        "",
        "<init>",
        "()V",
        "fromInt",
        "Lcom/smartengines/engine/id/FacesResult$Error;",
        "value",
        "",
        "engine_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/smartengines/engine/id/FacesResult$Error$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromInt(I)Lcom/smartengines/engine/id/FacesResult$Error;
    .locals 3

    .line 19
    invoke-static {}, Lcom/smartengines/engine/id/FacesResult$Error;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 54
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/engine/id/FacesResult$Error;

    .line 19
    invoke-virtual {v1}, Lcom/smartengines/engine/id/FacesResult$Error;->getCode()I

    move-result v2

    if-ne v2, p1, :cond_0

    return-object v1

    .line 55
    :cond_1
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "Collection contains no element matching the predicate."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
