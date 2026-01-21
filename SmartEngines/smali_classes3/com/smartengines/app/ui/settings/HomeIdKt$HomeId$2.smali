.class final Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;
.super Ljava/lang/Object;
.source "HomeId.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/HomeIdKt;->HomeId(Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;Landroidx/compose/runtime/Composer;II)V
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

.field final synthetic $idSettings:Lcom/smartengines/app/settings/IdSettings;

.field final synthetic $idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 34
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 4

    const-string v0, "$this$Section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C34@1271L158,38@1438L161,42@1608L163,46@1780L163:HomeId.kt#v86m6v"

    invoke-static {p2, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    .line 35
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 50
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 36
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$context:Landroid/content/Context;

    sget p3, Lcom/smartengines/app/R$string;->s_flash_by_default:I

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p3, "getString(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {v0}, Lcom/smartengines/app/settings/IdSettings;->getFlashByDefault()Z

    move-result v0

    new-instance v1, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2$1;

    iget-object v2, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    invoke-direct {v1, v2}, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2$1;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    .line 35
    invoke-static {p1, v0, v1, p2, v2}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 40
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$context:Landroid/content/Context;

    sget v0, Lcom/smartengines/app/R$string;->s_show_undef_checks:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {v0}, Lcom/smartengines/app/settings/IdSettings;->getShowUndefChecks()Z

    move-result v0

    new-instance v1, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2$2;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    invoke-direct {v1, v3}, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2$2;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 39
    invoke-static {p1, v0, v1, p2, v2}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 44
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$context:Landroid/content/Context;

    sget v0, Lcom/smartengines/app/R$string;->s_show_checks_filter:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {v0}, Lcom/smartengines/app/settings/IdSettings;->getShowChecksFilter()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2$3;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    invoke-direct {v1, v3}, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2$3;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 43
    invoke-static {p1, v0, v1, p2, v2}, Lcom/smartengines/app/ui/settings/FragmentsKt;->StringRow(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 48
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$context:Landroid/content/Context;

    sget v0, Lcom/smartengines/app/R$string;->s_hide_checks_filter:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iget-object p3, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {p3}, Lcom/smartengines/app/settings/IdSettings;->getHideChecksFilter()Ljava/lang/String;

    move-result-object p3

    new-instance v0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2$4;

    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    invoke-direct {v0, v1}, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$2$4;-><init>(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 47
    invoke-static {p1, p3, v0, p2, v2}, Lcom/smartengines/app/ui/settings/FragmentsKt;->StringRow(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
