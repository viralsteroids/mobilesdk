.class final Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1;
.super Ljava/lang/Object;
.source "HomeDoc.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/HomeDocKt;->HomeDoc(Lcom/smartengines/app/settings/DocSettings;Lcom/smartengines/app/settings/DocSettingsWriter;Landroidx/compose/runtime/Composer;II)V
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

.field final synthetic $docSettings:Lcom/smartengines/app/settings/DocSettings;

.field final synthetic $docSettingsWriter:Lcom/smartengines/app/settings/DocSettingsWriter;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/smartengines/app/settings/DocSettings;Lcom/smartengines/app/settings/DocSettingsWriter;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1;->$docSettings:Lcom/smartengines/app/settings/DocSettings;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1;->$docSettingsWriter:Lcom/smartengines/app/settings/DocSettingsWriter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 22
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 4

    const-string v0, "$this$Section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C22@835L147,26@991L147,31@1206L159:HomeDoc.kt#v86m6v"

    invoke-static {p2, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    .line 23
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 36
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 24
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1;->$context:Landroid/content/Context;

    sget p3, Lcom/smartengines/app/R$string;->s_show_images:I

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p3, "getString(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1;->$docSettings:Lcom/smartengines/app/settings/DocSettings;

    invoke-virtual {v0}, Lcom/smartengines/app/settings/DocSettings;->getShowImages()Z

    move-result v0

    new-instance v1, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1$1;

    iget-object v2, p0, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1;->$docSettingsWriter:Lcom/smartengines/app/settings/DocSettingsWriter;

    invoke-direct {v1, v2}, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1$1;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    .line 23
    invoke-static {p1, v0, v1, p2, v2}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 28
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1;->$context:Landroid/content/Context;

    sget v0, Lcom/smartengines/app/R$string;->s_show_tables:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1;->$docSettings:Lcom/smartengines/app/settings/DocSettings;

    invoke-virtual {v0}, Lcom/smartengines/app/settings/DocSettings;->getShowTables()Z

    move-result v0

    new-instance v1, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1$2;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1;->$docSettingsWriter:Lcom/smartengines/app/settings/DocSettingsWriter;

    invoke-direct {v1, v3}, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1$2;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 27
    invoke-static {p1, v0, v1, p2, v2}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 31
    sget-object p1, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p1}, Lcom/smartengines/app/Model;->getBuildFlavor()Lcom/smartengines/app/settings/BuildFlavor;

    move-result-object p1

    invoke-virtual {p1}, Lcom/smartengines/app/settings/BuildFlavor;->isPrivate()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-static {}, Lcom/smartengines/app/ui/AppContentKt;->isPreview()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    return-void

    .line 33
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1;->$context:Landroid/content/Context;

    sget v0, Lcom/smartengines/app/R$string;->s_show_attrib:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iget-object p3, p0, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1;->$docSettings:Lcom/smartengines/app/settings/DocSettings;

    invoke-virtual {p3}, Lcom/smartengines/app/settings/DocSettings;->getShowAttrib()Z

    move-result p3

    new-instance v0, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1$3;

    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1;->$docSettingsWriter:Lcom/smartengines/app/settings/DocSettingsWriter;

    invoke-direct {v0, v1}, Lcom/smartengines/app/ui/settings/HomeDocKt$HomeDoc$1$3;-><init>(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 32
    invoke-static {p1, p3, v0, p2, v2}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
