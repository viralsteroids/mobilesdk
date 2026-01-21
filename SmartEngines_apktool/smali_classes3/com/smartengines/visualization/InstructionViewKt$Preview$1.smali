.class final Lcom/smartengines/visualization/InstructionViewKt$Preview$1;
.super Ljava/lang/Object;
.source "InstructionView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/visualization/InstructionViewKt;->Preview(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $visObject:Lcom/smartengines/visualization/Visualization$Instruction;


# direct methods
.method constructor <init>(Lcom/smartengines/visualization/Visualization$Instruction;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/visualization/InstructionViewKt$Preview$1;->$visObject:Lcom/smartengines/visualization/Visualization$Instruction;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 74
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/visualization/InstructionViewKt$Preview$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "C74@2598L149:InstructionView.kt#hal2ob"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 75
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 79
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 76
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/smartengines/visualization/InstructionViewKt$Preview$1;->$visObject:Lcom/smartengines/visualization/Visualization$Instruction;

    .line 77
    sget-object p2, Lcom/smartengines/visualization/IdLivenessInstructions;->INSTANCE:Lcom/smartengines/visualization/IdLivenessInstructions;

    invoke-virtual {p2}, Lcom/smartengines/visualization/IdLivenessInstructions;->getItems()Ljava/util/Map;

    move-result-object v1

    .line 78
    sget-object p2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/graphics/Color$Companion;->getYellow-0d7_KjU()J

    move-result-wide v2

    sget p2, Lcom/smartengines/visualization/Visualization$Instruction;->$stable:I

    or-int/lit16 v5, p2, 0x1c0

    move-object v4, p1

    .line 75
    invoke-static/range {v0 .. v5}, Lcom/smartengines/visualization/InstructionViewKt;->InstructionView-XO-JAsU(Lcom/smartengines/visualization/Visualization$Instruction;Ljava/util/Map;JLandroidx/compose/runtime/Composer;I)V

    return-void
.end method
