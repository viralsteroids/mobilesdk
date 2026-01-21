.class final Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt$lambda-3$1;
.super Ljava/lang/Object;
.source "Texts.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt;
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt$lambda-3$1;


# direct methods
.method public static synthetic $r8$lambda$jis-2IPn9JDWOHYzBRwL_Dqw5E0()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt$lambda-3$1;->invoke$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt$lambda-3$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt$lambda-3$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt$lambda-3$1;->INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt$lambda-3$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 69
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 68
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt$lambda-3$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "C68@2313L122:Texts.kt#v86m6v"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 69
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 72
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 69
    :cond_1
    :goto_0
    new-instance v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt$lambda-3$1$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$TextsKt$lambda-3$1$$ExternalSyntheticLambda0;-><init>()V

    .line 70
    new-instance v1, Lcom/smartengines/app/settings/TextSettings;

    invoke-static {}, Landroidx/datastore/preferences/core/PreferencesFactory;->createEmpty()Landroidx/datastore/preferences/core/Preferences;

    move-result-object p2

    invoke-direct {v1, p2}, Lcom/smartengines/app/settings/TextSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;)V

    .line 71
    new-instance p2, Lcom/smartengines/app/mock/MockTextSettingsWriter;

    invoke-direct {p2}, Lcom/smartengines/app/mock/MockTextSettingsWriter;-><init>()V

    move-object v2, p2

    check-cast v2, Lcom/smartengines/app/settings/TextSettingsWriter;

    sget p2, Lcom/smartengines/app/settings/TextSettings;->$stable:I

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 v4, p2, 0x6

    const/4 v5, 0x0

    move-object v3, p1

    .line 69
    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/settings/TextsKt;->SettingsTexts(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
