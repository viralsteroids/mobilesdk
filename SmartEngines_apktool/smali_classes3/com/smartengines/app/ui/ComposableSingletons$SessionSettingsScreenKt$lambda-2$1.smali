.class final Lcom/smartengines/app/ui/ComposableSingletons$SessionSettingsScreenKt$lambda-2$1;
.super Ljava/lang/Object;
.source "SessionSettingsScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/ComposableSingletons$SessionSettingsScreenKt;
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


# static fields
.field public static final INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$SessionSettingsScreenKt$lambda-2$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/ComposableSingletons$SessionSettingsScreenKt$lambda-2$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/ComposableSingletons$SessionSettingsScreenKt$lambda-2$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/ComposableSingletons$SessionSettingsScreenKt$lambda-2$1;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$SessionSettingsScreenKt$lambda-2$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 111
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/ComposableSingletons$SessionSettingsScreenKt$lambda-2$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string v0, "C111@4362L392:SessionSettingsScreen.kt#83idza"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 112
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 118
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_1
    :goto_0
    const/4 p2, 0x4

    .line 113
    new-array p2, p2, [Lcom/smartengines/engine/SessionSettingsLogger$Action;

    new-instance v1, Lcom/smartengines/engine/SessionSettingsLogger$Action;

    new-array v2, v0, [Ljava/lang/String;

    const-string v3, "code_txt_line.rcbic.enabled"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "false"

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "SetOption"

    invoke-direct {v1, v3, v2}, Lcom/smartengines/engine/SessionSettingsLogger$Action;-><init>(Ljava/lang/String;Ljava/util/List;)V

    aput-object v1, p2, v4

    .line 114
    new-instance v1, Lcom/smartengines/engine/SessionSettingsLogger$Action;

    new-array v2, v0, [Ljava/lang/String;

    const-string v6, "barcode.effortLevel"

    aput-object v6, v2, v4

    const-string v6, "normal"

    aput-object v6, v2, v5

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v3, v2}, Lcom/smartengines/engine/SessionSettingsLogger$Action;-><init>(Ljava/lang/String;Ljava/util/List;)V

    aput-object v1, p2, v5

    .line 115
    new-instance v1, Lcom/smartengines/engine/SessionSettingsLogger$Action;

    const-string v2, "anydoc"

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v6, "SetCurrentMode"

    invoke-direct {v1, v6, v2}, Lcom/smartengines/engine/SessionSettingsLogger$Action;-><init>(Ljava/lang/String;Ljava/util/List;)V

    aput-object v1, p2, v0

    .line 116
    new-instance v1, Lcom/smartengines/engine/SessionSettingsLogger$Action;

    new-array v0, v0, [Ljava/lang/String;

    const-string v2, "bank_card.extractBankCardImages.enabled_long"

    aput-object v2, v0, v4

    const-string/jumbo v2, "true"

    aput-object v2, v0, v5

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Lcom/smartengines/engine/SessionSettingsLogger$Action;-><init>(Ljava/lang/String;Ljava/util/List;)V

    const/4 v0, 0x3

    aput-object v1, p2, v0

    .line 112
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    const/16 v0, 0x8

    invoke-static {p2, p1, v0, v4}, Lcom/smartengines/app/ui/SessionSettingsScreenKt;->SessionSettingsScreen(Ljava/util/List;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
