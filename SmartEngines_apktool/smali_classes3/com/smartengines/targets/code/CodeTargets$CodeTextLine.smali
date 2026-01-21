.class public abstract Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;
.super Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;
.source "CodeTargets.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/targets/code/CodeTargets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "CodeTextLine"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/targets/code/CodeTargets$CodeTextLine$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008&\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u0015\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\u0008*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;",
        "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;",
        "allowedTypes",
        "",
        "",
        "<init>",
        "(Ljava/util/Set;)V",
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
.field public static final Companion:Lcom/smartengines/targets/code/CodeTargets$CodeTextLine$Companion;

.field public static final INTERNAL_ENGINE:Ljava/lang/String; = "code_text_line"


# instance fields
.field private final allowedTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLine$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/smartengines/targets/code/CodeTargets$CodeTextLine$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;->Companion:Lcom/smartengines/targets/code/CodeTargets$CodeTextLine$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "allowedTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    invoke-direct {p0}, Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;-><init>()V

    .line 324
    iput-object p1, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;->allowedTypes:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public fill(Lcom/smartengines/code/CodeEngineSessionSettings;Lcom/smartengines/engine/SessionType;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 331
    sget-object p2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p2, p1, v0, v1, v0}, Lcom/smartengines/targets/code/CodeTargets;->setGlobalOptions$default(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;ILjava/lang/Object;)V

    .line 332
    sget-object p2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v0, "code_text_line.enabled"

    const-string/jumbo v1, "true"

    invoke-static {p2, p1, v0, v1}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    sget-object p2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v0, "code_text_line"

    iget-object v1, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;->allowedTypes:Ljava/util/Set;

    invoke-static {p2, p1, v0, v1}, Lcom/smartengines/targets/code/CodeTargets;->access$fillEngineSupportedTypesByAllowed(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/util/Set;)V

    .line 336
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object p2

    invoke-interface {p2}, Lcom/smartengines/targets/TargetSettings;->getCode()Lcom/smartengines/targets/code/CodeSettings;

    move-result-object p2

    .line 337
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    .line 338
    iget-object v1, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLine;->allowedTypes:Ljava/util/Set;

    const-string v2, "meters"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Lcom/smartengines/targets/code/CodeSettings;->getMeterMax()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 339
    :cond_0
    invoke-interface {p2}, Lcom/smartengines/targets/code/CodeSettings;->getLineMax()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    .line 337
    :goto_0
    const-string v1, "code_text_line.maxAllowedObjects"

    invoke-static {v0, p1, v1, p2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
