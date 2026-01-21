.class public final synthetic Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/app/targets/TreeLeaf;

.field public final synthetic f$1:Lcom/smartengines/engine/id/IdResultData;

.field public final synthetic f$2:Z

.field public final synthetic f$3:Lcom/smartengines/app/settings/CommonSettings;

.field public final synthetic f$4:Lcom/smartengines/app/settings/IdSettings;

.field public final synthetic f$5:Lcom/smartengines/nfc/PassportKey;

.field public final synthetic f$6:I

.field public final synthetic f$7:I


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$0:Lcom/smartengines/app/targets/TreeLeaf;

    iput-object p2, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$1:Lcom/smartengines/engine/id/IdResultData;

    iput-boolean p3, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$2:Z

    iput-object p4, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$3:Lcom/smartengines/app/settings/CommonSettings;

    iput-object p5, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$4:Lcom/smartengines/app/settings/IdSettings;

    iput-object p6, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$5:Lcom/smartengines/nfc/PassportKey;

    iput p7, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$6:I

    iput p8, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$7:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$0:Lcom/smartengines/app/targets/TreeLeaf;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$1:Lcom/smartengines/engine/id/IdResultData;

    iget-boolean v2, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$2:Z

    iget-object v3, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$3:Lcom/smartengines/app/settings/CommonSettings;

    iget-object v4, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$4:Lcom/smartengines/app/settings/IdSettings;

    iget-object v5, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$5:Lcom/smartengines/nfc/PassportKey;

    iget v6, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$6:I

    iget v7, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$$ExternalSyntheticLambda13;->f$7:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->$r8$lambda$JWFlWF1n3jLFMRb3_GtStqTAXAA(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
