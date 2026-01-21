.class public final Lcom/smartengines/targets/code/CodeTargetsKt;
.super Ljava/lang/Object;
.source "CodeTargets.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "TAG",
        "",
        "dump",
        "",
        "Lcom/smartengines/engine/SessionSettingsLogger;",
        "sessionSettings",
        "Lcom/smartengines/code/CodeEngineSessionSettings;",
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
.field private static final TAG:Ljava/lang/String; = "myapp.CodeTarget"


# direct methods
.method public static final synthetic access$dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/code/CodeEngineSessionSettings;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/smartengines/targets/code/CodeTargetsKt;->dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/code/CodeEngineSessionSettings;)V

    return-void
.end method

.method private static final dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/code/CodeEngineSessionSettings;)V
    .locals 4

    .line 483
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 484
    invoke-virtual {p1}, Lcom/smartengines/code/CodeEngineSessionSettings;->SettingsBegin()Lcom/smartengines/common/StringsMapIterator;

    move-result-object v1

    .line 485
    invoke-virtual {p1}, Lcom/smartengines/code/CodeEngineSessionSettings;->SettingsEnd()Lcom/smartengines/common/StringsMapIterator;

    move-result-object p1

    .line 486
    :goto_0
    invoke-virtual {v1, p1}, Lcom/smartengines/common/StringsMapIterator;->Equals(Lcom/smartengines/common/StringsMapIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 487
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->GetKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->GetValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->Advance()V

    goto :goto_0

    .line 490
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 483
    const-string p1, "session_settings"

    invoke-interface {p0, p1, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logData(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
