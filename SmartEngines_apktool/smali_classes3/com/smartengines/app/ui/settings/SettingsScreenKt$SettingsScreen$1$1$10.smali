.class final Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$10;
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

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$10;->$navController:Landroidx/navigation/NavHostController;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$10;->$codeSettings$delegate:Landroidx/compose/runtime/State;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 130
    check-cast p1, Landroidx/compose/animation/AnimatedContentScope;

    check-cast p2, Landroidx/navigation/NavBackStackEntry;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$10;->invoke(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    const-string p4, "$this$composable"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C130@4507L117:SettingsScreen.kt#v86m6v"

    invoke-static {p3, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 132
    new-instance p1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$10$1;

    iget-object p2, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$10;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {p1, p2}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$10$1;-><init>(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/jvm/functions/Function0;

    .line 133
    iget-object p2, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$10;->$codeSettings$delegate:Landroidx/compose/runtime/State;

    invoke-static {p2}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->access$SettingsScreen$lambda$1(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CodeSettings;

    move-result-object p2

    const/16 p4, 0x40

    .line 131
    invoke-static {p1, p2, p3, p4}, Lcom/smartengines/app/ui/settings/ContainersKt;->SettingsContainers(Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/CodeSettings;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
