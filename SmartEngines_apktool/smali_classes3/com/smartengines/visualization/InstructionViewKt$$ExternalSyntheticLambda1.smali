.class public final synthetic Lcom/smartengines/visualization/InstructionViewKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/visualization/Visualization$Instruction;

.field public final synthetic f$1:Ljava/util/Map;

.field public final synthetic f$2:J

.field public final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/visualization/Visualization$Instruction;Ljava/util/Map;JI)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/visualization/InstructionViewKt$$ExternalSyntheticLambda1;->f$0:Lcom/smartengines/visualization/Visualization$Instruction;

    iput-object p2, p0, Lcom/smartengines/visualization/InstructionViewKt$$ExternalSyntheticLambda1;->f$1:Ljava/util/Map;

    iput-wide p3, p0, Lcom/smartengines/visualization/InstructionViewKt$$ExternalSyntheticLambda1;->f$2:J

    iput p5, p0, Lcom/smartengines/visualization/InstructionViewKt$$ExternalSyntheticLambda1;->f$3:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/smartengines/visualization/InstructionViewKt$$ExternalSyntheticLambda1;->f$0:Lcom/smartengines/visualization/Visualization$Instruction;

    iget-object v1, p0, Lcom/smartengines/visualization/InstructionViewKt$$ExternalSyntheticLambda1;->f$1:Ljava/util/Map;

    iget-wide v2, p0, Lcom/smartengines/visualization/InstructionViewKt$$ExternalSyntheticLambda1;->f$2:J

    iget v4, p0, Lcom/smartengines/visualization/InstructionViewKt$$ExternalSyntheticLambda1;->f$3:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/smartengines/visualization/InstructionViewKt;->$r8$lambda$EoH3nLDRZIdasp58tdVT8yo6JlE(Lcom/smartengines/visualization/Visualization$Instruction;Ljava/util/Map;JILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
