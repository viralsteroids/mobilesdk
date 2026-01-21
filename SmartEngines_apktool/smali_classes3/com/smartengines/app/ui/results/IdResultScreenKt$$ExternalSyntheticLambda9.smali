.class public final synthetic Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/engine/id/IdResultData;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Lcom/smartengines/app/settings/CommonSettings;

.field public final synthetic f$3:Lcom/smartengines/app/settings/IdSettings;

.field public final synthetic f$4:Lcom/smartengines/nfc/PassportKey;

.field public final synthetic f$5:I


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;->f$0:Lcom/smartengines/engine/id/IdResultData;

    iput-boolean p2, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;->f$1:Z

    iput-object p3, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;->f$2:Lcom/smartengines/app/settings/CommonSettings;

    iput-object p4, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;->f$3:Lcom/smartengines/app/settings/IdSettings;

    iput-object p5, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;->f$4:Lcom/smartengines/nfc/PassportKey;

    iput p6, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;->f$5:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;->f$0:Lcom/smartengines/engine/id/IdResultData;

    iget-boolean v1, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;->f$1:Z

    iget-object v2, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;->f$2:Lcom/smartengines/app/settings/CommonSettings;

    iget-object v3, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;->f$3:Lcom/smartengines/app/settings/IdSettings;

    iget-object v4, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;->f$4:Lcom/smartengines/nfc/PassportKey;

    iget v5, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda9;->f$5:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->$r8$lambda$-On70cCyx_fycLzh7A46bd6GasA(Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
