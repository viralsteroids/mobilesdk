.class public final synthetic Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/engine/code/CodeObjectData;

.field public final synthetic f$1:Lcom/smartengines/app/settings/CommonSettings;

.field public final synthetic f$2:Lcom/smartengines/app/settings/CodeSettings;

.field public final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/engine/code/CodeObjectData;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CodeSettings;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda3;->f$0:Lcom/smartengines/engine/code/CodeObjectData;

    iput-object p2, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda3;->f$1:Lcom/smartengines/app/settings/CommonSettings;

    iput-object p3, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda3;->f$2:Lcom/smartengines/app/settings/CodeSettings;

    iput p4, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda3;->f$3:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda3;->f$0:Lcom/smartengines/engine/code/CodeObjectData;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda3;->f$1:Lcom/smartengines/app/settings/CommonSettings;

    iget-object v2, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda3;->f$2:Lcom/smartengines/app/settings/CodeSettings;

    iget v3, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$$ExternalSyntheticLambda3;->f$3:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/results/CodeResultScreenKt;->$r8$lambda$l6Ghj3myDWBemHF6HHL_WQ2Z9Og(Lcom/smartengines/engine/code/CodeObjectData;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CodeSettings;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
