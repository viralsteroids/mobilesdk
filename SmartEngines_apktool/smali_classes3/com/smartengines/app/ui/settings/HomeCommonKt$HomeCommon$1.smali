.class final Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;
.super Ljava/lang/Object;
.source "HomeCommon.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/HomeCommonKt;->HomeCommon(Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CommonSettingWriter;Lcom/smartengines/app/settings/BuildFlavor;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic $buildFlavor:Lcom/smartengines/app/settings/BuildFlavor;

.field final synthetic $commonSettings:Lcom/smartengines/app/settings/CommonSettings;

.field final synthetic $commonWriter:Lcom/smartengines/app/settings/CommonSettingWriter;

.field final synthetic $context:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CommonSettingWriter;Lcom/smartengines/app/settings/BuildFlavor;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonSettings:Lcom/smartengines/app/settings/CommonSettings;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonWriter:Lcom/smartengines/app/settings/CommonSettingWriter;

    iput-object p4, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$buildFlavor:Lcom/smartengines/app/settings/BuildFlavor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 28
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const-string v0, "$this$Section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "C28@1040L142,32@1191L175,37@1375L149,41@1533L154,54@2015L177,58@2205L171,62@2389L172,66@2574L169,70@2756L154,74@2923L154:HomeCommon.kt#v86m6v"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x51

    const/16 v1, 0x10

    if-ne v0, v1, :cond_1

    .line 29
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 79
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 30
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_dark_theme:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v10, "getString(...)"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonSettings:Lcom/smartengines/app/settings/CommonSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettings;->getDarkTheme()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$1;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonWriter:Lcom/smartengines/app/settings/CommonSettingWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$1;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    .line 29
    invoke-static {v0, v1, v2, p2, v11}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 34
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->settings_timeout:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonSettings:Lcom/smartengines/app/settings/CommonSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettings;->getSessionTimeout()I

    move-result v1

    .line 36
    new-instance v2, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$2;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonWriter:Lcom/smartengines/app/settings/CommonSettingWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$2;-><init>(Ljava/lang/Object;)V

    move-object v5, v2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v8, 0x6d80

    const/16 v9, 0x40

    const/4 v2, 0x0

    const/16 v3, 0xa

    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v7, p2

    .line 33
    invoke-static/range {v0 .. v9}, Lcom/smartengines/app/ui/settings/FragmentsKt;->IntRow(Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    .line 39
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->settings_show_quads:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonSettings:Lcom/smartengines/app/settings/CommonSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettings;->getShowQuads()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$3;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonWriter:Lcom/smartengines/app/settings/CommonSettingWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$3;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 38
    invoke-static {v0, v1, v2, p2, v11}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 43
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_result_preview:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonSettings:Lcom/smartengines/app/settings/CommonSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettings;->getResultPreview()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$4;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonWriter:Lcom/smartengines/app/settings/CommonSettingWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$4;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 42
    invoke-static {v0, v1, v2, p2, v11}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const v0, -0x2af2a27a

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "47@1748L169"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$buildFlavor:Lcom/smartengines/app/settings/BuildFlavor;

    sget-object v1, Lcom/smartengines/app/settings/BuildFlavor;->NIGHTLY:Lcom/smartengines/app/settings/BuildFlavor;

    if-ne v0, v1, :cond_2

    .line 49
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_always_accepted:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonSettings:Lcom/smartengines/app/settings/CommonSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettings;->getAlwaysAccepted()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$5;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonWriter:Lcom/smartengines/app/settings/CommonSettingWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$5;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 48
    invoke-static {v0, v1, v2, p2, v11}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :cond_2
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v0, 0x2

    .line 54
    new-array v0, v0, [Lcom/smartengines/app/settings/BuildFlavor;

    sget-object v1, Lcom/smartengines/app/settings/BuildFlavor;->NIGHTLY:Lcom/smartengines/app/settings/BuildFlavor;

    aput-object v1, v0, v11

    const/4 v1, 0x1

    sget-object v2, Lcom/smartengines/app/settings/BuildFlavor;->BETA:Lcom/smartengines/app/settings/BuildFlavor;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$buildFlavor:Lcom/smartengines/app/settings/BuildFlavor;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 56
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_enable_multithreading:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonSettings:Lcom/smartengines/app/settings/CommonSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettings;->getMultiThreading()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$6;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonWriter:Lcom/smartengines/app/settings/CommonSettingWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$6;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 55
    invoke-static {v0, v1, v2, p2, v11}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 60
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_calculate_metrics:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonSettings:Lcom/smartengines/app/settings/CommonSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettings;->getComputeMetrics()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$7;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonWriter:Lcom/smartengines/app/settings/CommonSettingWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$7;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 59
    invoke-static {v0, v1, v2, p2, v11}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 64
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_ignore_terminality:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonSettings:Lcom/smartengines/app/settings/CommonSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettings;->getIgnoreTerminal()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$8;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonWriter:Lcom/smartengines/app/settings/CommonSettingWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$8;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 63
    invoke-static {v0, v1, v2, p2, v11}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 68
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_enable_stoppers:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonSettings:Lcom/smartengines/app/settings/CommonSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettings;->getEnableStoppers()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$9;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonWriter:Lcom/smartengines/app/settings/CommonSettingWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$9;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 67
    invoke-static {v0, v1, v2, p2, v11}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 72
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_save_photo:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonSettings:Lcom/smartengines/app/settings/CommonSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettings;->getSavePhoto()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$10;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonWriter:Lcom/smartengines/app/settings/CommonSettingWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$10;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 71
    invoke-static {v0, v1, v2, p2, v11}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 76
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_save_video:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonSettings:Lcom/smartengines/app/settings/CommonSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CommonSettings;->getSaveVideo()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$11;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1;->$commonWriter:Lcom/smartengines/app/settings/CommonSettingWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/HomeCommonKt$HomeCommon$1$11;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 75
    invoke-static {v0, v1, v2, p2, v11}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :cond_3
    return-void
.end method
