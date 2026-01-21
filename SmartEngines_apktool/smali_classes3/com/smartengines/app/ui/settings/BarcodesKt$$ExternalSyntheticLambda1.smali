.class public final synthetic Lcom/smartengines/app/ui/settings/BarcodesKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$2:Lcom/smartengines/app/settings/CodeSettings;

.field public final synthetic f$3:Lcom/smartengines/app/settings/CodeSettingsWriter;

.field public final synthetic f$4:I

.field public final synthetic f$5:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/CodeSettingsWriter;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$$ExternalSyntheticLambda1;->f$0:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$$ExternalSyntheticLambda1;->f$1:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$$ExternalSyntheticLambda1;->f$2:Lcom/smartengines/app/settings/CodeSettings;

    iput-object p4, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$$ExternalSyntheticLambda1;->f$3:Lcom/smartengines/app/settings/CodeSettingsWriter;

    iput p5, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$$ExternalSyntheticLambda1;->f$4:I

    iput p6, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$$ExternalSyntheticLambda1;->f$5:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$$ExternalSyntheticLambda1;->f$0:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$$ExternalSyntheticLambda1;->f$1:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$$ExternalSyntheticLambda1;->f$2:Lcom/smartengines/app/settings/CodeSettings;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$$ExternalSyntheticLambda1;->f$3:Lcom/smartengines/app/settings/CodeSettingsWriter;

    iget v4, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$$ExternalSyntheticLambda1;->f$4:I

    iget v5, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$$ExternalSyntheticLambda1;->f$5:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/smartengines/app/ui/settings/BarcodesKt;->$r8$lambda$oFU_Y82gFsC4AAVEJTnvA8V_LLA(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/CodeSettingsWriter;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
