.class public final Lcom/smartengines/targets/code/CodeTargets$CodeTextLineIban;
.super Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;
.source "CodeTargets.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/targets/code/CodeTargets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CodeTextLineIban"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLineIban$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/smartengines/targets/code/CodeTargets$CodeTextLineIban;",
        "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;",
        "<init>",
        "()V",
        "Companion",
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
.field public static final ALLOWED_TYPE:Ljava/lang/String; = "iban"

.field public static final Companion:Lcom/smartengines/targets/code/CodeTargets$CodeTextLineIban$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineIban$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineIban$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineIban;->Companion:Lcom/smartengines/targets/code/CodeTargets$CodeTextLineIban$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 352
    const-string v0, "iban"

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;-><init>(Ljava/util/Set;)V

    return-void
.end method
