.class public final Lcom/smartengines/app/MainActivity;
.super Landroidx/activity/ComponentActivity;
.source "MainActivity.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/app/MainActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0008\u0010\u0008\u001a\u00020\u0005H\u0014J\u0008\u0010\t\u001a\u00020\u0005H\u0014J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000cH\u0014\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/smartengines/app/MainActivity;",
        "Landroidx/activity/ComponentActivity;",
        "<init>",
        "()V",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onDestroy",
        "onResume",
        "onNewIntent",
        "intent",
        "Landroid/content/Intent;",
        "Companion",
        "app_storeRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/smartengines/app/MainActivity$Companion;

.field private static instance:Lcom/smartengines/app/MainActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/smartengines/app/MainActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/smartengines/app/MainActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/smartengines/app/MainActivity;->Companion:Lcom/smartengines/app/MainActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    return-void
.end method

.method public static final synthetic access$getInstance$cp()Lcom/smartengines/app/MainActivity;
    .locals 1

    .line 13
    sget-object v0, Lcom/smartengines/app/MainActivity;->instance:Lcom/smartengines/app/MainActivity;

    return-object v0
.end method

.method public static final synthetic access$setInstance$cp(Lcom/smartengines/app/MainActivity;)V
    .locals 0

    .line 13
    sput-object p0, Lcom/smartengines/app/MainActivity;->instance:Lcom/smartengines/app/MainActivity;

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 18
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 19
    const-string p1, "myapp.MainActivity"

    const-string v0, "onCreate"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    sput-object p0, Lcom/smartengines/app/MainActivity;->instance:Lcom/smartengines/app/MainActivity;

    .line 21
    invoke-static {}, Lcom/smartengines/app/AppKt;->getApp()Lcom/smartengines/app/App;

    move-result-object p1

    invoke-virtual {p1}, Lcom/smartengines/app/App;->updateLanguage()V

    .line 22
    move-object p1, p0

    check-cast p1, Landroidx/activity/ComponentActivity;

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p1, v1, v1, v0, v1}, Landroidx/activity/EdgeToEdge;->enable$default(Landroidx/activity/ComponentActivity;Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;ILjava/lang/Object;)V

    .line 23
    sget-object v0, Lcom/smartengines/app/ComposableSingletons$MainActivityKt;->INSTANCE:Lcom/smartengines/app/ComposableSingletons$MainActivityKt;

    invoke-virtual {v0}, Lcom/smartengines/app/ComposableSingletons$MainActivityKt;->getLambda-1$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {p1, v1, v0, v2, v1}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 29
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onDestroy()V

    .line 30
    const-string v0, "myapp.MainActivity"

    const-string v1, "onDestroy"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 31
    sput-object v0, Lcom/smartengines/app/MainActivity;->instance:Lcom/smartengines/app/MainActivity;

    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 41
    sget-object v0, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v0}, Lcom/smartengines/app/Model;->getPassportReader()Lcom/smartengines/nfc/PassportReader;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0, p1, v1}, Lcom/smartengines/nfc/PassportReader;->onNewIntent(Landroid/content/Intent;Landroid/app/Activity;)V

    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 35
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onResume()V

    .line 36
    sget-object v0, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v0}, Lcom/smartengines/app/Model;->getPassportReader()Lcom/smartengines/nfc/PassportReader;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/smartengines/nfc/PassportReader;->onResumeActivity(Landroid/app/Activity;)V

    return-void
.end method
