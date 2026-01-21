.class final Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1;
.super Ljava/lang/Object;
.source "Lines.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
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

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1;->$codeSettingsWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

    iput-object p4, p0, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1;->$dictionary:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 32
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    const-string v0, "$this$Section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "C32@1264L175,37@1452L269:Lines.kt#v86m6v"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x51

    const/16 v1, 0x10

    if-ne v0, v1, :cond_1

    .line 33
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 34
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_max_objects:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v0, "getString(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    iget-object v2, p0, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    invoke-virtual {v2}, Lcom/smartengines/app/settings/CodeSettings;->getLineMax()I

    move-result v2

    .line 36
    new-instance v3, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1$1;

    iget-object v4, p0, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1;->$codeSettingsWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

    invoke-direct {v3, v4}, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1$1;-><init>(Ljava/lang/Object;)V

    move-object v6, v3

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x6d80

    const/16 v10, 0x40

    const/4 v3, 0x1

    const/16 v4, 0xa

    const/4 v5, 0x1

    const/4 v7, 0x0

    move-object v8, p2

    .line 33
    invoke-static/range {v1 .. v10}, Lcom/smartengines/app/ui/settings/FragmentsKt;->IntRow(Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    .line 39
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1;->$context:Landroid/content/Context;

    sget v2, Lcom/smartengines/app/R$string;->s_line_types:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    invoke-virtual {v0}, Lcom/smartengines/app/settings/CodeSettings;->getLineTypes()Ljava/util/Set;

    move-result-object v2

    new-instance v0, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1$2;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1;->$codeSettingsWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

    invoke-direct {v0, v3}, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1$2;-><init>(Ljava/lang/Object;)V

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 41
    iget-object v4, p0, Lcom/smartengines/app/ui/settings/LinesKt$SettingsTextLines$1$1;->$dictionary:Ljava/util/List;

    const v8, 0x37040

    const/4 v9, 0x0

    const/4 v6, 0x1

    move-object v7, p2

    .line 38
    invoke-static/range {v1 .. v9}, Lcom/smartengines/app/ui/settings/ListSelectorsKt;->MultiFromList(Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Ljava/util/List;ZZLandroidx/compose/runtime/Composer;II)V

    return-void
.end method
