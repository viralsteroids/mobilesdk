.class public final synthetic Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/app/CameraButtonsState;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$4:J

.field public final synthetic f$5:I

.field public final synthetic f$6:I


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/app/CameraButtonsState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;JII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;->f$0:Lcom/smartengines/app/CameraButtonsState;

    iput-object p2, p0, Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;->f$1:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;->f$2:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;->f$3:Lkotlin/jvm/functions/Function0;

    iput-wide p5, p0, Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;->f$4:J

    iput p7, p0, Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;->f$5:I

    iput p8, p0, Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;->f$6:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;->f$0:Lcom/smartengines/app/CameraButtonsState;

    iget-object v1, p0, Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;->f$1:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;->f$2:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;->f$3:Lkotlin/jvm/functions/Function0;

    iget-wide v4, p0, Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;->f$4:J

    iget v6, p0, Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;->f$5:I

    iget v7, p0, Lcom/smartengines/app/ui/CameraButtonsViewKt$$ExternalSyntheticLambda9;->f$6:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/smartengines/app/ui/CameraButtonsViewKt;->$r8$lambda$3jmdQZ6jKnQzVjbJwY77dFHDBfU(Lcom/smartengines/app/CameraButtonsState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;JIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
