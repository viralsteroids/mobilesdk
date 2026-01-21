.class public final Lcom/smartengines/app/App$onCreate$1;
.super Ljava/lang/Object;
.source "App.kt"

# interfaces
.implements Lcom/smartengines/targets/TargetSettings;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/App;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "com/smartengines/app/App$onCreate$1",
        "Lcom/smartengines/targets/TargetSettings;",
        "common",
        "Lcom/smartengines/targets/CommonSettings;",
        "getCommon",
        "()Lcom/smartengines/targets/CommonSettings;",
        "code",
        "Lcom/smartengines/targets/code/CodeSettings;",
        "getCode",
        "()Lcom/smartengines/targets/code/CodeSettings;",
        "id",
        "Lcom/smartengines/targets/id/IdSettings;",
        "getId",
        "()Lcom/smartengines/targets/id/IdSettings;",
        "text",
        "Lcom/smartengines/targets/text/TextSettings;",
        "getText",
        "()Lcom/smartengines/targets/text/TextSettings;",
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


# direct methods
.method constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCode()Lcom/smartengines/targets/code/CodeSettings;
    .locals 1

    .line 55
    invoke-static {}, Lcom/smartengines/app/AppKt;->getCodeSettingsStore()Lcom/smartengines/app/settings/CodeSettingsStore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/app/settings/CodeSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/targets/code/CodeSettings;

    return-object v0
.end method

.method public getCommon()Lcom/smartengines/targets/CommonSettings;
    .locals 1

    .line 53
    invoke-static {}, Lcom/smartengines/app/AppKt;->getCommonSettingsStore()Lcom/smartengines/app/settings/CommonSettingsStore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/app/settings/CommonSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/targets/CommonSettings;

    return-object v0
.end method

.method public getId()Lcom/smartengines/targets/id/IdSettings;
    .locals 1

    .line 57
    invoke-static {}, Lcom/smartengines/app/AppKt;->getIdSettingsStore()Lcom/smartengines/app/settings/IdSettingsStore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/app/settings/IdSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/targets/id/IdSettings;

    return-object v0
.end method

.method public getText()Lcom/smartengines/targets/text/TextSettings;
    .locals 1

    .line 59
    invoke-static {}, Lcom/smartengines/app/AppKt;->getTextSettingsStore()Lcom/smartengines/app/settings/TextSettingsStore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/app/settings/TextSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/targets/text/TextSettings;

    return-object v0
.end method
