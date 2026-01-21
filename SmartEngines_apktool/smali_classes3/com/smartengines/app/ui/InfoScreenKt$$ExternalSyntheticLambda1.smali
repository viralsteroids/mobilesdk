.class public final synthetic Lcom/smartengines/app/ui/InfoScreenKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$1:Lcom/smartengines/app/settings/CommonSettings;

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CommonSettings;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/InfoScreenKt$$ExternalSyntheticLambda1;->f$0:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/smartengines/app/ui/InfoScreenKt$$ExternalSyntheticLambda1;->f$1:Lcom/smartengines/app/settings/CommonSettings;

    iput p3, p0, Lcom/smartengines/app/ui/InfoScreenKt$$ExternalSyntheticLambda1;->f$2:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/InfoScreenKt$$ExternalSyntheticLambda1;->f$0:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lcom/smartengines/app/ui/InfoScreenKt$$ExternalSyntheticLambda1;->f$1:Lcom/smartengines/app/settings/CommonSettings;

    iget v2, p0, Lcom/smartengines/app/ui/InfoScreenKt$$ExternalSyntheticLambda1;->f$2:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/smartengines/app/ui/InfoScreenKt;->$r8$lambda$VYyp-2W-83aQHIz5shHvppHQ8Fs(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CommonSettings;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
