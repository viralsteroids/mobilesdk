.class final Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeKt$lambda-1$1;
.super Ljava/lang/Object;
.source "Home.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeKt;
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeKt$lambda-1$1;


# direct methods
.method public static synthetic $r8$lambda$Q-x8UKvNHGWgvQUwm1veRvbZci4()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeKt$lambda-1$1;->invoke$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$ojbAChuflBFT2CNHnwt8eqPs8lQ(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeKt$lambda-1$1;->invoke$lambda$1(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeKt$lambda-1$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeKt$lambda-1$1;->INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeKt$lambda-1$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 79
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$1(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 78
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeKt$lambda-1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "C78@2838L191:Home.kt#v86m6v"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 79
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 85
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 79
    :cond_1
    :goto_0
    new-instance v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeKt$lambda-1$1$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeKt$lambda-1$1$$ExternalSyntheticLambda0;-><init>()V

    new-instance v1, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeKt$lambda-1$1$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeKt$lambda-1$1$$ExternalSyntheticLambda1;-><init>()V

    .line 80
    new-instance v2, Lcom/smartengines/app/settings/CommonSettings;

    const/4 p2, 0x0

    const/4 v3, 0x1

    invoke-direct {v2, p2, v3, p2}, Lcom/smartengines/app/settings/CommonSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v4, v3

    .line 81
    new-instance v3, Lcom/smartengines/app/settings/CodeSettings;

    invoke-direct {v3, p2, v4, p2}, Lcom/smartengines/app/settings/CodeSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v5, v4

    .line 82
    new-instance v4, Lcom/smartengines/app/settings/IdSettings;

    invoke-direct {v4, p2, v5, p2}, Lcom/smartengines/app/settings/IdSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v6, v5

    .line 83
    new-instance v5, Lcom/smartengines/app/settings/DocSettings;

    invoke-direct {v5, p2, v6, p2}, Lcom/smartengines/app/settings/DocSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v7, v6

    .line 84
    new-instance v6, Lcom/smartengines/app/settings/TextSettings;

    invoke-direct {v6, p2, v7, p2}, Lcom/smartengines/app/settings/TextSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget p2, Lcom/smartengines/app/settings/CommonSettings;->$stable:I

    shl-int/lit8 p2, p2, 0x6

    or-int/lit16 p2, p2, 0x1036

    sget v7, Lcom/smartengines/app/settings/IdSettings;->$stable:I

    shl-int/lit8 v7, v7, 0xc

    or-int/2addr p2, v7

    sget v7, Lcom/smartengines/app/settings/DocSettings;->$stable:I

    shl-int/lit8 v7, v7, 0xf

    or-int/2addr p2, v7

    sget v7, Lcom/smartengines/app/settings/TextSettings;->$stable:I

    shl-int/lit8 v7, v7, 0x12

    or-int v8, p2, v7

    move-object v7, p1

    .line 79
    invoke-static/range {v0 .. v8}, Lcom/smartengines/app/ui/settings/HomeKt;->SettingsHome(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/DocSettings;Lcom/smartengines/app/settings/TextSettings;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
