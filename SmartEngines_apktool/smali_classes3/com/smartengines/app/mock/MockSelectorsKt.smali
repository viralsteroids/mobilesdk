.class public final Lcom/smartengines/app/mock/MockSelectorsKt;
.super Ljava/lang/Object;
.source "MockSelectors.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "mockSelectedTreeLeaf",
        "Lcom/smartengines/app/targets/TreeLeaf;",
        "getMockSelectedTreeLeaf",
        "()Lcom/smartengines/app/targets/TreeLeaf;",
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
.field private static final mockSelectedTreeLeaf:Lcom/smartengines/app/targets/TreeLeaf;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 8
    new-instance v0, Lcom/smartengines/app/targets/TreeLeaf;

    .line 9
    new-instance v1, Lcom/smartengines/utils/Name;

    const-string v2, "Any doc"

    invoke-direct {v1, v2, v2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    sget v2, Lcom/smartengines/app/R$drawable;->home_anydoc:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 11
    new-instance v3, Lcom/smartengines/targets/id/IdTarget;

    const-string v4, "anydoc"

    const-string v5, "*"

    invoke-direct {v3, v4, v5}, Lcom/smartengines/targets/id/IdTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v3

    check-cast v7, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 8
    invoke-direct/range {v0 .. v9}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/smartengines/app/mock/MockSelectorsKt;->mockSelectedTreeLeaf:Lcom/smartengines/app/targets/TreeLeaf;

    return-void
.end method

.method public static final getMockSelectedTreeLeaf()Lcom/smartengines/app/targets/TreeLeaf;
    .locals 1

    .line 8
    sget-object v0, Lcom/smartengines/app/mock/MockSelectorsKt;->mockSelectedTreeLeaf:Lcom/smartengines/app/targets/TreeLeaf;

    return-object v0
.end method
