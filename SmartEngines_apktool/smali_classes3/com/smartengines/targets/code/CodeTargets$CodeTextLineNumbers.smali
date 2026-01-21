.class public final Lcom/smartengines/targets/code/CodeTargets$CodeTextLineNumbers;
.super Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;
.source "CodeTargets.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/targets/code/CodeTargets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CodeTextLineNumbers"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/smartengines/targets/code/CodeTargets$CodeTextLineNumbers;",
        "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;",
        "<init>",
        "()V",
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


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x3

    .line 345
    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "card_number"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 346
    const-string v2, "phone_number"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 347
    const-string v2, "phone_number_cis"

    aput-object v2, v0, v1

    .line 344
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;-><init>(Ljava/util/Set;)V

    return-void
.end method
