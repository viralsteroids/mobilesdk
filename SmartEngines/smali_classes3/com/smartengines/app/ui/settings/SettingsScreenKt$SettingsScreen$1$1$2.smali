.class final Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$2;
.super Ljava/lang/Object;
.source "SettingsScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1;->invoke(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function4<",
        "Landroidx/compose/animation/AnimatedContentScope;",
        "Landroidx/navigation/NavBackStackEntry;",
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
.field final synthetic $codeSettings$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/CodeSettings;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $navController:Landroidx/navigation/NavHostController;


# direct methods
.method constructor <init>(Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavHostController;",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/CodeSettings;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$2;->$navController:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$2;->$codeSettings$delegate:Landroidx/compose/runtime/State;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 78
    check-cast p1, Landroidx/compose/animation/AnimatedContentScope;

    check-cast p2, Landroidx/navigation/NavBackStackEntry;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$2;->invoke(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string p4, "$this$composable"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C78@3001L160:SettingsScreen.kt#v86m6v"

    invoke-static {p3, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 80
    new-instance p1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$2$1;

    iget-object p2, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$2;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {p1, p2}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$2$1;-><init>(Ljava/lang/Object;)V

    move-object v0, p1

    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 81
    new-instance p1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$2$2;

    iget-object p2, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$2;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {p1, p2}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$2$2;-><init>(Ljava/lang/Object;)V

    move-object v1, p1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 82
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$2;->$codeSettings$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->access$SettingsScreen$lambda$1(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CodeSettings;

    move-result-object v2

    const/16 v5, 0x200

    const/16 v6, 0x8

    const/4 v3, 0x0

    move-object v4, p3

    .line 79
    invoke-static/range {v0 .. v6}, Lcom/smartengines/app/ui/settings/BarcodesKt;->SettingsBarcodes(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/CodeSettingsWriter;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
