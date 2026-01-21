.class final Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeCommonKt$lambda-1$1;
.super Ljava/lang/Object;
.source "HomeCommon.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeCommonKt;
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeCommonKt$lambda-1$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeCommonKt$lambda-1$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeCommonKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeCommonKt$lambda-1$1;->INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeCommonKt$lambda-1$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 88
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/ComposableSingletons$HomeCommonKt$lambda-1$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "$this$SettingsScaffold"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C88@3411L139:HomeCommon.kt#v86m6v"

    invoke-static {p2, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    .line 89
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 93
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 90
    :cond_1
    :goto_0
    new-instance v0, Lcom/smartengines/app/settings/CommonSettings;

    const/4 p1, 0x1

    const/4 p3, 0x0

    invoke-direct {v0, p3, p1, p3}, Lcom/smartengines/app/settings/CommonSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 91
    new-instance p1, Lcom/smartengines/app/mock/MockCommonSettingsWriter;

    invoke-direct {p1}, Lcom/smartengines/app/mock/MockCommonSettingsWriter;-><init>()V

    move-object v1, p1

    check-cast v1, Lcom/smartengines/app/settings/CommonSettingWriter;

    .line 92
    sget-object v2, Lcom/smartengines/app/settings/BuildFlavor;->NIGHTLY:Lcom/smartengines/app/settings/BuildFlavor;

    sget p1, Lcom/smartengines/app/settings/CommonSettings;->$stable:I

    or-int/lit16 v4, p1, 0x180

    const/4 v5, 0x0

    move-object v3, p2

    .line 89
    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/settings/HomeCommonKt;->HomeCommon(Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CommonSettingWriter;Lcom/smartengines/app/settings/BuildFlavor;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
