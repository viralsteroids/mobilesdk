.class final Lcom/smartengines/app/ui/settings/TextsKt$SettingsTexts$1;
.super Ljava/lang/Object;
.source "Texts.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/TextsKt;->SettingsTexts(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;Landroidx/compose/runtime/Composer;II)V
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

.field final synthetic $dictionary:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/smartengines/dictionaries/KeyName;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $textSettings:Lcom/smartengines/app/settings/TextSettings;

.field final synthetic $textSettingsWriter:Lcom/smartengines/app/settings/TextSettingsWriter;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/smartengines/app/settings/TextSettings;",
            "Lcom/smartengines/app/settings/TextSettingsWriter;",
            "Ljava/util/List<",
            "Lcom/smartengines/dictionaries/KeyName;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/TextsKt$SettingsTexts$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/TextsKt$SettingsTexts$1;->$textSettings:Lcom/smartengines/app/settings/TextSettings;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/TextsKt$SettingsTexts$1;->$textSettingsWriter:Lcom/smartengines/app/settings/TextSettingsWriter;

    iput-object p4, p0, Lcom/smartengines/app/ui/settings/TextsKt$SettingsTexts$1;->$dictionary:Ljava/util/List;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/TextsKt$SettingsTexts$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "$this$SettingsScaffold"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C34@1324L298,34@1317L305:Texts.kt#v86m6v"

    invoke-static {p2, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    .line 35
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 43
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 35
    :cond_1
    :goto_0
    new-instance p1, Lcom/smartengines/app/ui/settings/TextsKt$SettingsTexts$1$1;

    iget-object p3, p0, Lcom/smartengines/app/ui/settings/TextsKt$SettingsTexts$1;->$context:Landroid/content/Context;

    iget-object v0, p0, Lcom/smartengines/app/ui/settings/TextsKt$SettingsTexts$1;->$textSettings:Lcom/smartengines/app/settings/TextSettings;

    iget-object v1, p0, Lcom/smartengines/app/ui/settings/TextsKt$SettingsTexts$1;->$textSettingsWriter:Lcom/smartengines/app/settings/TextSettingsWriter;

    iget-object v2, p0, Lcom/smartengines/app/ui/settings/TextsKt$SettingsTexts$1;->$dictionary:Ljava/util/List;

    invoke-direct {p1, p3, v0, v1, v2}, Lcom/smartengines/app/ui/settings/TextsKt$SettingsTexts$1$1;-><init>(Landroid/content/Context;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;Ljava/util/List;)V

    const/16 p3, 0x36

    const v0, 0x60541586

    const/4 v1, 0x1

    invoke-static {v0, v1, p1, p2, p3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function3;

    const/16 p3, 0x30

    const/4 v0, 0x0

    invoke-static {v0, p1, p2, p3, v1}, Lcom/smartengines/app/ui/settings/FragmentsKt;->Section(Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
