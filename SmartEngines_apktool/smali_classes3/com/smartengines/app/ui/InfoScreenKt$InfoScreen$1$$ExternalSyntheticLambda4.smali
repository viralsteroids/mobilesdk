.class public final synthetic Lcom/smartengines/app/ui/InfoScreenKt$InfoScreen$1$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/app/targets/TargetsLogger$State;


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/app/targets/TargetsLogger$State;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/InfoScreenKt$InfoScreen$1$$ExternalSyntheticLambda4;->f$0:Lcom/smartengines/app/targets/TargetsLogger$State;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/InfoScreenKt$InfoScreen$1$$ExternalSyntheticLambda4;->f$0:Lcom/smartengines/app/targets/TargetsLogger$State;

    invoke-static {v0}, Lcom/smartengines/app/ui/InfoScreenKt$InfoScreen$1;->$r8$lambda$kYPoMfz6_mCZrMouRzAExWvrSUc(Lcom/smartengines/app/targets/TargetsLogger$State;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
