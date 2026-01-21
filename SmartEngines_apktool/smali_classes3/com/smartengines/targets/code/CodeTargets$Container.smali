.class public final Lcom/smartengines/targets/code/CodeTargets$Container;
.super Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;
.source "CodeTargets.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/targets/code/CodeTargets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Container"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/targets/code/CodeTargets$Container$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/smartengines/targets/code/CodeTargets$Container;",
        "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;",
        "<init>",
        "()V",
        "fill",
        "",
        "Lcom/smartengines/code/CodeEngineSessionSettings;",
        "sessionType",
        "Lcom/smartengines/engine/SessionType;",
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
.field public static final Companion:Lcom/smartengines/targets/code/CodeTargets$Container$Companion;

.field public static final INTERNAL_ENGINE:Ljava/lang/String; = "shipping_container"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/smartengines/targets/code/CodeTargets$Container$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/smartengines/targets/code/CodeTargets$Container$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/smartengines/targets/code/CodeTargets$Container;->Companion:Lcom/smartengines/targets/code/CodeTargets$Container$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 449
    invoke-direct {p0}, Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;-><init>()V

    return-void
.end method


# virtual methods
.method public fill(Lcom/smartengines/code/CodeEngineSessionSettings;Lcom/smartengines/engine/SessionType;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 452
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object p2

    invoke-interface {p2}, Lcom/smartengines/targets/TargetSettings;->getCode()Lcom/smartengines/targets/code/CodeSettings;

    move-result-object p2

    .line 453
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v1, v2, v1}, Lcom/smartengines/targets/code/CodeTargets;->setGlobalOptions$default(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;ILjava/lang/Object;)V

    .line 455
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string/jumbo v1, "shipping_container.enabled"

    const-string/jumbo v2, "true"

    invoke-static {v0, p1, v1, v2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 457
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    invoke-interface {p2}, Lcom/smartengines/targets/code/CodeSettings;->getContainerMax()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const-string/jumbo v1, "shipping_container.maxAllowedObjects"

    invoke-static {v0, p1, v1, p2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
