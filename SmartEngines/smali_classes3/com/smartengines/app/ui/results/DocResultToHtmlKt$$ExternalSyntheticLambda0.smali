.class public final synthetic Lcom/smartengines/app/ui/results/DocResultToHtmlKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Lcom/smartengines/engine/doc/TextField;

    check-cast p2, Lcom/smartengines/engine/doc/TextField;

    invoke-static {p1, p2}, Lcom/smartengines/app/ui/results/DocResultToHtmlKt;->$r8$lambda$XMd-FFFLRW_MpEqtSSc6F_SR9Xg(Lcom/smartengines/engine/doc/TextField;Lcom/smartengines/engine/doc/TextField;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
