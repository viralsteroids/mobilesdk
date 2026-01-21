.class public final Lcom/smartengines/engine/id/LvCallback;
.super Lcom/smartengines/id/IdFaceFeedback;
.source "LvCallback.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/smartengines/engine/id/LvCallback;",
        "Lcom/smartengines/id/IdFaceFeedback;",
        "timer",
        "Lcom/smartengines/visualization/Visualization$Timer;",
        "steps",
        "Lcom/smartengines/visualization/Visualization$Steps;",
        "quads",
        "Lcom/smartengines/visualization/Visualization$Quads;",
        "<init>",
        "(Lcom/smartengines/visualization/Visualization$Timer;Lcom/smartengines/visualization/Visualization$Steps;Lcom/smartengines/visualization/Visualization$Quads;)V",
        "MessageReceived",
        "",
        "message",
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


# instance fields
.field private final quads:Lcom/smartengines/visualization/Visualization$Quads;

.field private final steps:Lcom/smartengines/visualization/Visualization$Steps;

.field private final timer:Lcom/smartengines/visualization/Visualization$Timer;


# direct methods
.method public constructor <init>(Lcom/smartengines/visualization/Visualization$Timer;Lcom/smartengines/visualization/Visualization$Steps;Lcom/smartengines/visualization/Visualization$Quads;)V
    .locals 1

    const-string/jumbo v0, "timer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "steps"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "quads"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Lcom/smartengines/id/IdFaceFeedback;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/smartengines/engine/id/LvCallback;->timer:Lcom/smartengines/visualization/Visualization$Timer;

    .line 17
    iput-object p2, p0, Lcom/smartengines/engine/id/LvCallback;->steps:Lcom/smartengines/visualization/Visualization$Steps;

    .line 18
    iput-object p3, p0, Lcom/smartengines/engine/id/LvCallback;->quads:Lcom/smartengines/visualization/Visualization$Quads;

    return-void
.end method


# virtual methods
.method public MessageReceived(Ljava/lang/String;)V
    .locals 14

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "   ---> MessageReceived: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.LvCallback"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    const-string v0, "StartInst:"

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p1, v0, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    const-string v5, " "

    const-string v6, "Message parsing error"

    const/4 v7, 0x1

    if-eqz v0, :cond_0

    .line 27
    :try_start_0
    move-object v8, p1

    check-cast v8, Ljava/lang/CharSequence;

    new-array v9, v7, [Ljava/lang/String;

    aput-object v5, v9, v2

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x3

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 29
    iget-object p1, p0, Lcom/smartengines/engine/id/LvCallback;->timer:Lcom/smartengines/visualization/Visualization$Timer;

    invoke-virtual {p1, v2, v3}, Lcom/smartengines/visualization/Visualization$Timer;->start(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 31
    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v1, v6, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_1

    .line 36
    :cond_0
    const-string v0, "InstSuccess:"

    invoke-static {p1, v0, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 37
    iget-object p1, p0, Lcom/smartengines/engine/id/LvCallback;->steps:Lcom/smartengines/visualization/Visualization$Steps;

    sget-object v0, Lcom/smartengines/visualization/Visualization$Steps$StepState;->SUCCESSFUL:Lcom/smartengines/visualization/Visualization$Steps$StepState;

    invoke-virtual {p1, v0}, Lcom/smartengines/visualization/Visualization$Steps;->onStepCompleted(Lcom/smartengines/visualization/Visualization$Steps$StepState;)V

    return-void

    .line 39
    :cond_1
    const-string v0, "InstFailed:"

    invoke-static {p1, v0, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 40
    iget-object p1, p0, Lcom/smartengines/engine/id/LvCallback;->steps:Lcom/smartengines/visualization/Visualization$Steps;

    sget-object v0, Lcom/smartengines/visualization/Visualization$Steps$StepState;->FAILED:Lcom/smartengines/visualization/Visualization$Steps$StepState;

    invoke-virtual {p1, v0}, Lcom/smartengines/visualization/Visualization$Steps;->onStepCompleted(Lcom/smartengines/visualization/Visualization$Steps$StepState;)V

    return-void

    .line 44
    :cond_2
    const-string v0, "face_rect"

    invoke-static {p1, v0, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 47
    :try_start_1
    new-instance v3, Lorg/json/JSONArray;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 49
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v0

    move v4, v2

    :goto_0
    if-ge v4, v0, :cond_3

    .line 51
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v5

    .line 53
    new-instance v8, Lcom/smartengines/visualization/QuadPoint;

    .line 54
    invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v9

    int-to-float v9, v9

    .line 55
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->getInt(I)I

    move-result v5

    int-to-float v5, v5

    .line 53
    invoke-direct {v8, v9, v5}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    .line 52
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 60
    :cond_3
    iget-object v0, p0, Lcom/smartengines/engine/id/LvCallback;->quads:Lcom/smartengines/visualization/Visualization$Quads;

    new-instance v2, Lcom/smartengines/visualization/Quad;

    check-cast p1, Ljava/util/List;

    invoke-direct {v2, p1}, Lcom/smartengines/visualization/Quad;-><init>(Ljava/util/List;)V

    invoke-static {v2}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/smartengines/visualization/Visualization$Quads;->append(Ljava/util/Set;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v0

    move-object p1, v0

    .line 62
    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v1, v6, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 65
    :cond_4
    const-string v0, "kp_"

    invoke-static {p1, v0, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 68
    :try_start_2
    move-object v8, p1

    check-cast v8, Ljava/lang/CharSequence;

    new-array v9, v7, [Ljava/lang/String;

    aput-object v5, v9, v2

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 70
    new-instance v0, Lcom/smartengines/visualization/QuadPoint;

    .line 71
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    .line 72
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    .line 70
    invoke-direct {v0, v2, p1}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    .line 75
    iget-object p1, p0, Lcom/smartengines/engine/id/LvCallback;->quads:Lcom/smartengines/visualization/Visualization$Quads;

    new-instance v2, Lcom/smartengines/visualization/Quad;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/smartengines/visualization/Quad;-><init>(Ljava/util/List;)V

    invoke-static {v2}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/smartengines/visualization/Visualization$Quads;->append(Ljava/util/Set;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    return-void

    :catch_2
    move-exception v0

    move-object p1, v0

    .line 77
    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v1, v6, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_5
    :goto_1
    return-void
.end method
