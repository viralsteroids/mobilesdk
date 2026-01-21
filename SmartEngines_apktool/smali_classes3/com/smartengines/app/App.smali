.class public final Lcom/smartengines/app/App;
.super Landroid/app/Application;
.source "App.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0008\u0010\u0006\u001a\u00020\u0005H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/smartengines/app/App;",
        "Landroid/app/Application;",
        "<init>",
        "()V",
        "updateLanguage",
        "",
        "onCreate",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 30
    invoke-static {p0}, Lcom/smartengines/app/AppKt;->access$setInstance$p(Lcom/smartengines/app/App;)V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .line 38
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 39
    const-string v0, "myapp.App"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    new-instance v0, Lcom/smartengines/app/settings/CommonSettingsStore;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/smartengines/app/settings/CommonSettingsStore;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lcom/smartengines/app/AppKt;->setCommonSettingsStore(Lcom/smartengines/app/settings/CommonSettingsStore;)V

    .line 41
    new-instance v0, Lcom/smartengines/app/settings/CodeSettingsStore;

    invoke-direct {v0, v1}, Lcom/smartengines/app/settings/CodeSettingsStore;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lcom/smartengines/app/AppKt;->setCodeSettingsStore(Lcom/smartengines/app/settings/CodeSettingsStore;)V

    .line 42
    new-instance v0, Lcom/smartengines/app/settings/IdSettingsStore;

    invoke-direct {v0, v1}, Lcom/smartengines/app/settings/IdSettingsStore;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lcom/smartengines/app/AppKt;->setIdSettingsStore(Lcom/smartengines/app/settings/IdSettingsStore;)V

    .line 43
    new-instance v0, Lcom/smartengines/app/settings/DocSettingsStore;

    invoke-direct {v0, v1}, Lcom/smartengines/app/settings/DocSettingsStore;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lcom/smartengines/app/AppKt;->setDocSettingsStore(Lcom/smartengines/app/settings/DocSettingsStore;)V

    .line 44
    new-instance v0, Lcom/smartengines/app/settings/TextSettingsStore;

    invoke-direct {v0, v1}, Lcom/smartengines/app/settings/TextSettingsStore;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lcom/smartengines/app/AppKt;->setTextSettingsStore(Lcom/smartengines/app/settings/TextSettingsStore;)V

    .line 51
    new-instance v0, Lcom/smartengines/app/App$onCreate$1;

    invoke-direct {v0}, Lcom/smartengines/app/App$onCreate$1;-><init>()V

    check-cast v0, Lcom/smartengines/targets/TargetSettings;

    invoke-static {v0}, Lcom/smartengines/targets/TargetSettingsKt;->setTargetSettings(Lcom/smartengines/targets/TargetSettings;)V

    .line 63
    sget-object v0, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v0, v1}, Lcom/smartengines/app/Model;->load(Landroid/content/Context;)V

    return-void
.end method

.method public final updateLanguage()V
    .locals 3

    .line 34
    sget-object v0, Lcom/smartengines/utils/Name;->Companion:Lcom/smartengines/utils/Name$Companion;

    invoke-virtual {p0}, Lcom/smartengines/app/App;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/smartengines/utils/Name$Companion;->setLanguage(Ljava/lang/String;)V

    return-void
.end method
