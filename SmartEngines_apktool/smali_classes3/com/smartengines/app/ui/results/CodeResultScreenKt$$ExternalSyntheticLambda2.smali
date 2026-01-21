.class public final synthetic Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/app/targets/TreeLeaf;

.field public final synthetic f$1:Lcom/smartengines/engine/code/CodeResultData;

.field public final synthetic f$2:Lcom/smartengines/app/settings/CommonSettings;

.field public final synthetic f$3:Lcom/smartengines/app/settings/CodeSettings;

.field public final synthetic f$4:Lcom/smartengines/nfc/PassportKey;

.field public final synthetic f$5:I

.field public final synthetic f$6:I


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/code/CodeResultData;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/nfc/PassportKey;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;->f$0:Lcom/smartengines/app/targets/TreeLeaf;

    iput-object p2, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;->f$1:Lcom/smartengines/engine/code/CodeResultData;

    iput-object p3, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;->f$2:Lcom/smartengines/app/settings/CommonSettings;

    iput-object p4, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;->f$3:Lcom/smartengines/app/settings/CodeSettings;

    iput-object p5, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;->f$4:Lcom/smartengines/nfc/PassportKey;

    iput p6, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;->f$5:I

    iput p7, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;->f$6:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;->f$0:Lcom/smartengines/app/targets/TreeLeaf;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;->f$1:Lcom/smartengines/engine/code/CodeResultData;

    iget-object v2, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;->f$2:Lcom/smartengines/app/settings/CommonSettings;

    iget-object v3, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;->f$3:Lcom/smartengines/app/settings/CodeSettings;

    iget-object v4, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;->f$4:Lcom/smartengines/nfc/PassportKey;

    iget v5, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;->f$5:I

    iget v6, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda2;->f$6:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/smartengines/app/ui/results/CodeResultScreenKt;->$r8$lambda$cWjuwBea-HPSDvP29mCVfNWAyb8(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/code/CodeResultData;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/nfc/PassportKey;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
