.class final Lcom/smartengines/app/ui/settings/ComposableSingletons$BarcodesKt$lambda-5$1;
.super Ljava/lang/Object;
.source "Barcodes.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/settings/ComposableSingletons$BarcodesKt;
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$BarcodesKt$lambda-5$1;


# direct methods
.method public static synthetic $r8$lambda$CWTM1QgAmTXXGdH4rRf581sgJiI()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/settings/ComposableSingletons$BarcodesKt$lambda-5$1;->invoke$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$ktgS5tpKYSddZw4c8YUad7KchNs(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$BarcodesKt$lambda-5$1;->invoke$lambda$1(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$BarcodesKt$lambda-5$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$BarcodesKt$lambda-5$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$BarcodesKt$lambda-5$1;->INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$BarcodesKt$lambda-5$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 132
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$1(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 131
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/settings/ComposableSingletons$BarcodesKt$lambda-5$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string v0, "C131@4699L128:Barcodes.kt#v86m6v"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 132
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 135
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 132
    :cond_1
    :goto_0
    new-instance v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$BarcodesKt$lambda-5$1$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$BarcodesKt$lambda-5$1$$ExternalSyntheticLambda0;-><init>()V

    new-instance v1, Lcom/smartengines/app/ui/settings/ComposableSingletons$BarcodesKt$lambda-5$1$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lcom/smartengines/app/ui/settings/ComposableSingletons$BarcodesKt$lambda-5$1$$ExternalSyntheticLambda1;-><init>()V

    .line 133
    new-instance v2, Lcom/smartengines/app/settings/CodeSettings;

    invoke-static {}, Landroidx/datastore/preferences/core/PreferencesFactory;->createEmpty()Landroidx/datastore/preferences/core/Preferences;

    move-result-object p2

    invoke-direct {v2, p2}, Lcom/smartengines/app/settings/CodeSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;)V

    .line 134
    new-instance p2, Lcom/smartengines/app/mock/MockCodeSettingsWriter;

    invoke-direct {p2}, Lcom/smartengines/app/mock/MockCodeSettingsWriter;-><init>()V

    move-object v3, p2

    check-cast v3, Lcom/smartengines/app/settings/CodeSettingsWriter;

    const/16 v5, 0x236

    const/4 v6, 0x0

    move-object v4, p1

    .line 132
    invoke-static/range {v0 .. v6}, Lcom/smartengines/app/ui/settings/BarcodesKt;->SettingsBarcodes(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/CodeSettingsWriter;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
