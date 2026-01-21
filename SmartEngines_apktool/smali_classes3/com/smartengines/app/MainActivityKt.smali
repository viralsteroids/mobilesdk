.class public final Lcom/smartengines/app/MainActivityKt;
.super Ljava/lang/Object;
.source "MainActivity.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "TAG",
        "",
        "exitApp",
        "",
        "app_storeRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "myapp.MainActivity"


# direct methods
.method public static final exitApp()V
    .locals 1

    .line 49
    sget-object v0, Lcom/smartengines/app/MainActivity;->Companion:Lcom/smartengines/app/MainActivity$Companion;

    invoke-virtual {v0}, Lcom/smartengines/app/MainActivity$Companion;->getInstance()Lcom/smartengines/app/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/smartengines/app/MainActivity;->finishAndRemoveTask()V

    :cond_0
    return-void
.end method
