.class public final synthetic Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:J

.field public final synthetic f$2:F

.field public final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;JFI)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda2;->f$0:Ljava/util/List;

    iput-wide p2, p0, Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda2;->f$1:J

    iput p4, p0, Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda2;->f$2:F

    iput p5, p0, Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda2;->f$3:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda2;->f$0:Ljava/util/List;

    iget-wide v1, p0, Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda2;->f$1:J

    iget v3, p0, Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda2;->f$2:F

    iget v4, p0, Lcom/smartengines/visualization/QuadsViewSimpleKt$$ExternalSyntheticLambda2;->f$3:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/smartengines/visualization/QuadsViewSimpleKt;->$r8$lambda$5z0FfGfaB2NAydSSB8JTtEpYJ7E(Ljava/util/List;JFILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
