.class final Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;
.super Ljava/lang/Object;
.source "Liveness.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/ColumnScope;",
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
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $highlightDelta$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $idSettings:Lcom/smartengines/app/settings/IdSettings;

.field final synthetic $idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

.field final synthetic $maxDelta:I


# direct methods
.method public static synthetic $r8$lambda$c7QremJ2wHKbb9qsGa6pCGz2XrU(Lcom/smartengines/app/settings/IdSettingsWriter;Landroidx/compose/runtime/MutableState;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->invoke$lambda$0(Lcom/smartengines/app/settings/IdSettingsWriter;Landroidx/compose/runtime/MutableState;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Landroid/content/Context;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;ILandroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/smartengines/app/settings/IdSettings;",
            "Lcom/smartengines/app/settings/IdSettingsWriter;",
            "I",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    iput p4, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$maxDelta:I

    iput-object p5, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$highlightDelta$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0(Lcom/smartengines/app/settings/IdSettingsWriter;Landroidx/compose/runtime/MutableState;I)Lkotlin/Unit;
    .locals 1

    const-string v0, "$highlightDelta$delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-interface {p0, p2}, Lcom/smartengines/app/settings/IdSettingsWriter;->writeInstrCount(I)V

    .line 63
    invoke-interface {p0}, Lcom/smartengines/app/settings/IdSettingsWriter;->resetInstrCountDelta()V

    const/4 p0, 0x1

    .line 64
    invoke-static {p1, p0}, Lcom/smartengines/app/ui/settings/LivenessKt;->access$SettingsLiveness$lambda$2(Landroidx/compose/runtime/MutableState;Z)V

    .line 65
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 47
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    const-string v0, "$this$Section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "C47@1716L208,52@1937L209,57@2159L354,66@2526L236,71@2775L183,76@2971L189,81@3173L157,85@3343L184:Liveness.kt#v86m6v"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x51

    const/16 v1, 0x10

    if-ne v0, v1, :cond_1

    .line 48
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 89
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 49
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_min_instr_time:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v10, "getString(...)"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/IdSettings;->getMinInstrTime()I

    move-result v1

    iget-object v2, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {v2}, Lcom/smartengines/app/settings/IdSettings;->getMaxInstrTime()I

    move-result v3

    .line 51
    new-instance v2, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$1;

    iget-object v4, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    invoke-direct {v2, v4}, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$1;-><init>(Ljava/lang/Object;)V

    move-object v5, v2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v8, 0x6180

    const/16 v9, 0x40

    const/4 v2, 0x1

    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v7, p2

    .line 48
    invoke-static/range {v0 .. v9}, Lcom/smartengines/app/ui/settings/FragmentsKt;->IntRow(Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    .line 54
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_max_instr_time:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/IdSettings;->getMaxInstrTime()I

    move-result v1

    iget-object v2, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {v2}, Lcom/smartengines/app/settings/IdSettings;->getMinInstrTime()I

    move-result v2

    .line 56
    new-instance v3, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$2;

    iget-object v4, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    invoke-direct {v3, v4}, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$2;-><init>(Ljava/lang/Object;)V

    move-object v5, v3

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v8, 0x6c00

    const/16 v3, 0xa

    const/4 v4, 0x1

    .line 53
    invoke-static/range {v0 .. v9}, Lcom/smartengines/app/ui/settings/FragmentsKt;->IntRow(Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    .line 59
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_instr_count:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/IdSettings;->getInstrCount()I

    move-result v1

    .line 58
    iget-object v2, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$highlightDelta$delegate:Landroidx/compose/runtime/MutableState;

    new-instance v5, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$$ExternalSyntheticLambda0;

    invoke-direct {v5, v2, v3}, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$$ExternalSyntheticLambda0;-><init>(Lcom/smartengines/app/settings/IdSettingsWriter;Landroidx/compose/runtime/MutableState;)V

    const/16 v8, 0x6d80

    const/4 v2, 0x1

    const/16 v3, 0xa

    invoke-static/range {v0 .. v9}, Lcom/smartengines/app/ui/settings/FragmentsKt;->IntRow(Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    .line 68
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_instr_count_delta:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/IdSettings;->getInstrCountDeltaRandom()I

    move-result v1

    iget v3, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$maxDelta:I

    .line 70
    new-instance v2, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$4;

    iget-object v4, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    invoke-direct {v2, v4}, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$4;-><init>(Ljava/lang/Object;)V

    move-object v5, v2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$highlightDelta$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/smartengines/app/ui/settings/LivenessKt;->access$SettingsLiveness$lambda$1(Landroidx/compose/runtime/MutableState;)Z

    move-result v6

    const/16 v8, 0x6180

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x1

    .line 67
    invoke-static/range {v0 .. v9}, Lcom/smartengines/app/ui/settings/FragmentsKt;->IntRow(Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    .line 73
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_instr_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/IdSettings;->getInstrFailed()I

    move-result v1

    .line 75
    new-instance v2, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$5;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$5;-><init>(Ljava/lang/Object;)V

    move-object v5, v2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v8, 0x6d80

    const/16 v9, 0x40

    const/4 v2, 0x1

    const/16 v3, 0xa

    const/4 v6, 0x0

    .line 72
    invoke-static/range {v0 .. v9}, Lcom/smartengines/app/ui/settings/FragmentsKt;->IntRow(Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    .line 78
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_min_pass_time:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/IdSettings;->getMinPassTime()I

    move-result v1

    .line 80
    new-instance v2, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$6;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$6;-><init>(Ljava/lang/Object;)V

    move-object v5, v2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v2, 0x1f4

    const/16 v3, 0x1388

    const/16 v4, 0x32

    .line 77
    invoke-static/range {v0 .. v9}, Lcom/smartengines/app/ui/settings/FragmentsKt;->IntRow(Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    .line 83
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_always_pass:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/IdSettings;->getAlwaysPass()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$7;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$7;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x0

    .line 82
    invoke-static {v0, v1, v2, p2, v3}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 87
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_enable_visualization:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/IdSettings;->getEnableVisualization()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$8;

    iget-object v4, p0, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    invoke-direct {v2, v4}, Lcom/smartengines/app/ui/settings/LivenessKt$SettingsLiveness$2$1$8;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 86
    invoke-static {v0, v1, v2, p2, v3}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
