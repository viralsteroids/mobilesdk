.class final Lcom/smartengines/app/ui/settings/MetersKt$SettingsMeters$1$1;
.super Ljava/lang/Object;
.source "Meters.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/MetersKt$SettingsMeters$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $codeSettings:Lcom/smartengines/app/settings/CodeSettings;

.field final synthetic $codeSettingsWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

.field final synthetic $context:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/CodeSettingsWriter;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/MetersKt$SettingsMeters$1$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/MetersKt$SettingsMeters$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/MetersKt$SettingsMeters$1$1;->$codeSettingsWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 26
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/MetersKt$SettingsMeters$1$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const-string v0, "$this$Section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C26@1005L177:Meters.kt#v86m6v"

    invoke-static {p2, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    .line 27
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 28
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/MetersKt$SettingsMeters$1$1;->$context:Landroid/content/Context;

    sget p3, Lcom/smartengines/app/R$string;->s_max_objects:I

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string p1, "getString(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/MetersKt$SettingsMeters$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    invoke-virtual {p1}, Lcom/smartengines/app/settings/CodeSettings;->getMeterMax()I

    move-result v1

    .line 30
    new-instance p1, Lcom/smartengines/app/ui/settings/MetersKt$SettingsMeters$1$1$1;

    iget-object p3, p0, Lcom/smartengines/app/ui/settings/MetersKt$SettingsMeters$1$1;->$codeSettingsWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

    invoke-direct {p1, p3}, Lcom/smartengines/app/ui/settings/MetersKt$SettingsMeters$1$1$1;-><init>(Ljava/lang/Object;)V

    move-object v5, p1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v8, 0x6d80

    const/16 v9, 0x40

    const/4 v2, 0x1

    const/16 v3, 0xa

    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v7, p2

    .line 27
    invoke-static/range {v0 .. v9}, Lcom/smartengines/app/ui/settings/FragmentsKt;->IntRow(Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    return-void
.end method
