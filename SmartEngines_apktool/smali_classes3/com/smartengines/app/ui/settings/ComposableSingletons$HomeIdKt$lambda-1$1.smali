.class final Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeIdKt$lambda-1$1;
.super Ljava/lang/Object;
.source "HomeId.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeIdKt;
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


# static fields
.field public static final INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeIdKt$lambda-1$1;


# direct methods
.method public static synthetic $r8$lambda$QpcG9_P61RJ6leTc6Zn4gfs6mpU(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeIdKt$lambda-1$1;->invoke$lambda$0(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeIdKt$lambda-1$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeIdKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeIdKt$lambda-1$1;->INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeIdKt$lambda-1$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 60
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeIdKt$lambda-1$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "$this$SettingsScaffold"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C60@2268L111:HomeId.kt#v86m6v"

    invoke-static {p2, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    .line 61
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 64
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 61
    :cond_1
    :goto_0
    new-instance v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeIdKt$lambda-1$1$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeIdKt$lambda-1$1$$ExternalSyntheticLambda0;-><init>()V

    .line 62
    new-instance v1, Lcom/smartengines/app/settings/IdSettings;

    invoke-static {}, Landroidx/datastore/preferences/core/PreferencesFactory;->createEmpty()Landroidx/datastore/preferences/core/Preferences;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/smartengines/app/settings/IdSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;)V

    .line 63
    new-instance p1, Lcom/smartengines/app/mock/MockIdSettingsWriter;

    invoke-direct {p1}, Lcom/smartengines/app/mock/MockIdSettingsWriter;-><init>()V

    move-object v2, p1

    check-cast v2, Lcom/smartengines/app/settings/IdSettingsWriter;

    sget p1, Lcom/smartengines/app/settings/IdSettings;->$stable:I

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 v4, p1, 0x6

    const/4 v5, 0x0

    move-object v3, p2

    .line 61
    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/settings/HomeIdKt;->HomeId(Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
