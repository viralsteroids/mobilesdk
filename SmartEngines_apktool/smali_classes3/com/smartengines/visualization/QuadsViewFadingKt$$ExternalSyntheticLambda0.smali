.class public final synthetic Lcom/smartengines/visualization/QuadsViewFadingKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/State;

.field public final synthetic f$1:J

.field public final synthetic f$2:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/State;JF)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/visualization/QuadsViewFadingKt$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/runtime/State;

    iput-wide p2, p0, Lcom/smartengines/visualization/QuadsViewFadingKt$$ExternalSyntheticLambda0;->f$1:J

    iput p4, p0, Lcom/smartengines/visualization/QuadsViewFadingKt$$ExternalSyntheticLambda0;->f$2:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/smartengines/visualization/QuadsViewFadingKt$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/runtime/State;

    iget-wide v1, p0, Lcom/smartengines/visualization/QuadsViewFadingKt$$ExternalSyntheticLambda0;->f$1:J

    iget v3, p0, Lcom/smartengines/visualization/QuadsViewFadingKt$$ExternalSyntheticLambda0;->f$2:F

    check-cast p1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/smartengines/visualization/QuadsViewFadingKt;->$r8$lambda$SxtkC7rg24VHN00DckHWFFCnRT8(Landroidx/compose/runtime/State;JFLandroidx/compose/ui/graphics/drawscope/DrawScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
