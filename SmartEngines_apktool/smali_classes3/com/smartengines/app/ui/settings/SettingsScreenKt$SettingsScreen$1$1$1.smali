.class final Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;
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

.field final synthetic $commonSettings$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/CommonSettings;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $docSettings$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/DocSettings;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $idSettings$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/IdSettings;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $navController:Landroidx/navigation/NavHostController;

.field final synthetic $onDismiss:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $textSettings$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/TextSettings;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavHostController;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/navigation/NavHostController;",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/CommonSettings;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/CodeSettings;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/IdSettings;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/DocSettings;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Lcom/smartengines/app/settings/TextSettings;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->$onDismiss:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->$navController:Landroidx/navigation/NavHostController;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->$commonSettings$delegate:Landroidx/compose/runtime/State;

    iput-object p4, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->$codeSettings$delegate:Landroidx/compose/runtime/State;

    iput-object p5, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->$idSettings$delegate:Landroidx/compose/runtime/State;

    iput-object p6, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->$docSettings$delegate:Landroidx/compose/runtime/State;

    iput-object p7, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->$textSettings$delegate:Landroidx/compose/runtime/State;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 66
    check-cast p1, Landroidx/compose/animation/AnimatedContentScope;

    check-cast p2, Landroidx/navigation/NavBackStackEntry;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->invoke(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string p4, "$this$composable"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C66@2657L275:SettingsScreen.kt#v86m6v"

    invoke-static {p3, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->$onDismiss:Lkotlin/jvm/functions/Function0;

    .line 69
    new-instance p1, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1$1;

    iget-object p2, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {p1, p2}, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1$1;-><init>(Ljava/lang/Object;)V

    move-object v1, p1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 70
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->$commonSettings$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->access$SettingsScreen$lambda$0(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CommonSettings;

    move-result-object v2

    .line 71
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->$codeSettings$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->access$SettingsScreen$lambda$1(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/CodeSettings;

    move-result-object v3

    .line 72
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->$idSettings$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->access$SettingsScreen$lambda$2(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/IdSettings;

    move-result-object v4

    .line 73
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->$docSettings$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->access$SettingsScreen$lambda$3(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/DocSettings;

    move-result-object v5

    .line 74
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/SettingsScreenKt$SettingsScreen$1$1$1;->$textSettings$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/smartengines/app/ui/settings/SettingsScreenKt;->access$SettingsScreen$lambda$4(Landroidx/compose/runtime/State;)Lcom/smartengines/app/settings/TextSettings;

    move-result-object v6

    const v8, 0x249200

    move-object v7, p3

    .line 67
    invoke-static/range {v0 .. v8}, Lcom/smartengines/app/ui/settings/HomeKt;->SettingsHome(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/DocSettings;Lcom/smartengines/app/settings/TextSettings;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
