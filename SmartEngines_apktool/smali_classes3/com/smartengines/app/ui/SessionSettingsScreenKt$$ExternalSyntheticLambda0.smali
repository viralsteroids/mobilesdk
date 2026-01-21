.class public final synthetic Lcom/smartengines/app/ui/SessionSettingsScreenKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:I

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/SessionSettingsScreenKt$$ExternalSyntheticLambda0;->f$0:Ljava/util/List;

    iput p2, p0, Lcom/smartengines/app/ui/SessionSettingsScreenKt$$ExternalSyntheticLambda0;->f$1:I

    iput p3, p0, Lcom/smartengines/app/ui/SessionSettingsScreenKt$$ExternalSyntheticLambda0;->f$2:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/SessionSettingsScreenKt$$ExternalSyntheticLambda0;->f$0:Ljava/util/List;

    iget v1, p0, Lcom/smartengines/app/ui/SessionSettingsScreenKt$$ExternalSyntheticLambda0;->f$1:I

    iget v2, p0, Lcom/smartengines/app/ui/SessionSettingsScreenKt$$ExternalSyntheticLambda0;->f$2:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/smartengines/app/ui/SessionSettingsScreenKt;->$r8$lambda$a_VTTGmF41hJ45-Oa5OoLUfxG-E(Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
