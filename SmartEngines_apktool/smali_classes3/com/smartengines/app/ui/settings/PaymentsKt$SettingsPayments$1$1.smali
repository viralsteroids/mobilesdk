.class final Lcom/smartengines/app/ui/settings/PaymentsKt$SettingsPayments$1$1;
.super Ljava/lang/Object;
.source "Payments.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/PaymentsKt$SettingsPayments$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
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

.field final synthetic $dictionary:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/smartengines/dictionaries/KeyName;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/CodeSettingsWriter;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/smartengines/app/settings/CodeSettings;",
            "Lcom/smartengines/app/settings/CodeSettingsWriter;",
            "Ljava/util/List<",
            "Lcom/smartengines/dictionaries/KeyName;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/PaymentsKt$SettingsPayments$1$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/PaymentsKt$SettingsPayments$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/PaymentsKt$SettingsPayments$1$1;->$codeSettingsWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

    iput-object p4, p0, Lcom/smartengines/app/ui/settings/PaymentsKt$SettingsPayments$1$1;->$dictionary:Ljava/util/List;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/PaymentsKt$SettingsPayments$1$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "$this$Section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C34@1375L262:Payments.kt#v86m6v"

    invoke-static {p2, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    .line 35
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 36
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/PaymentsKt$SettingsPayments$1$1;->$context:Landroid/content/Context;

    sget p3, Lcom/smartengines/app/R$string;->s_payment_types:I

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string p1, "getString(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/PaymentsKt$SettingsPayments$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    invoke-virtual {p1}, Lcom/smartengines/app/settings/CodeSettings;->getPaymentTypes()Ljava/util/Set;

    move-result-object v1

    new-instance p1, Lcom/smartengines/app/ui/settings/PaymentsKt$SettingsPayments$1$1$1;

    iget-object p3, p0, Lcom/smartengines/app/ui/settings/PaymentsKt$SettingsPayments$1$1;->$codeSettingsWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

    invoke-direct {p1, p3}, Lcom/smartengines/app/ui/settings/PaymentsKt$SettingsPayments$1$1$1;-><init>(Ljava/lang/Object;)V

    move-object v2, p1

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 38
    iget-object v3, p0, Lcom/smartengines/app/ui/settings/PaymentsKt$SettingsPayments$1$1;->$dictionary:Ljava/util/List;

    const v7, 0x37040

    const/4 v8, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v6, p2

    .line 35
    invoke-static/range {v0 .. v8}, Lcom/smartengines/app/ui/settings/ListSelectorsKt;->MultiFromList(Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Ljava/util/List;ZZLandroidx/compose/runtime/Composer;II)V

    return-void
.end method
