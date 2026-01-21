.class public final synthetic Lcom/smartengines/engine/doc/DocResultJsonKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/util/HashMap;


# direct methods
.method public synthetic constructor <init>(Ljava/util/HashMap;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/engine/doc/DocResultJsonKt$$ExternalSyntheticLambda2;->f$0:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/smartengines/engine/doc/DocResultJsonKt$$ExternalSyntheticLambda2;->f$0:Ljava/util/HashMap;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lorg/json/JSONObject;

    invoke-static {v0, p1, p2}, Lcom/smartengines/engine/doc/DocResultJsonKt;->$r8$lambda$7NaKuM1nA_g8VlCDDXZ0bKvFvC8(Ljava/util/HashMap;Ljava/lang/String;Lorg/json/JSONObject;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
