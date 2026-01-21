.class public final synthetic Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$2:Lcom/smartengines/app/settings/CommonSettings;

.field public final synthetic f$3:Lcom/smartengines/app/settings/CodeSettings;

.field public final synthetic f$4:Lcom/smartengines/app/settings/IdSettings;

.field public final synthetic f$5:Lcom/smartengines/app/settings/DocSettings;

.field public final synthetic f$6:Lcom/smartengines/app/settings/TextSettings;

.field public final synthetic f$7:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/DocSettings;Lcom/smartengines/app/settings/TextSettings;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$1:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$2:Lcom/smartengines/app/settings/CommonSettings;

    iput-object p4, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$3:Lcom/smartengines/app/settings/CodeSettings;

    iput-object p5, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$4:Lcom/smartengines/app/settings/IdSettings;

    iput-object p6, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$5:Lcom/smartengines/app/settings/DocSettings;

    iput-object p7, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$6:Lcom/smartengines/app/settings/TextSettings;

    iput p8, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$7:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$1:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$2:Lcom/smartengines/app/settings/CommonSettings;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$3:Lcom/smartengines/app/settings/CodeSettings;

    iget-object v4, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$4:Lcom/smartengines/app/settings/IdSettings;

    iget-object v5, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$5:Lcom/smartengines/app/settings/DocSettings;

    iget-object v6, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$6:Lcom/smartengines/app/settings/TextSettings;

    iget v7, p0, Lcom/smartengines/app/ui/settings/HomeKt$$ExternalSyntheticLambda0;->f$7:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/smartengines/app/ui/settings/HomeKt;->$r8$lambda$lFp4UpNjAG_u_P1snjGIYekA3pY(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/DocSettings;Lcom/smartengines/app/settings/TextSettings;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
