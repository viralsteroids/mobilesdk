.class public final Lcom/smartengines/targets/TargetSettingsKt;
.super Ljava/lang/Object;
.source "TargetSettings.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\"\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "targetSettings",
        "Lcom/smartengines/targets/TargetSettings;",
        "getTargetSettings",
        "()Lcom/smartengines/targets/TargetSettings;",
        "setTargetSettings",
        "(Lcom/smartengines/targets/TargetSettings;)V",
        "targets_release"
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
.field private static targetSettings:Lcom/smartengines/targets/TargetSettings;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 24
    new-instance v0, Lcom/smartengines/targets/TargetSettingsMock;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/smartengines/targets/TargetSettingsMock;-><init>(Lcom/smartengines/targets/CommonSettings;Lcom/smartengines/targets/code/CodeSettings;Lcom/smartengines/targets/id/IdSettings;Lcom/smartengines/targets/text/TextSettings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/smartengines/targets/TargetSettings;

    sput-object v0, Lcom/smartengines/targets/TargetSettingsKt;->targetSettings:Lcom/smartengines/targets/TargetSettings;

    return-void
.end method

.method public static final getTargetSettings()Lcom/smartengines/targets/TargetSettings;
    .locals 1

    .line 24
    sget-object v0, Lcom/smartengines/targets/TargetSettingsKt;->targetSettings:Lcom/smartengines/targets/TargetSettings;

    return-object v0
.end method

.method public static final setTargetSettings(Lcom/smartengines/targets/TargetSettings;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    sput-object p0, Lcom/smartengines/targets/TargetSettingsKt;->targetSettings:Lcom/smartengines/targets/TargetSettings;

    return-void
.end method
