.class public final Lcom/smartengines/targets/id/LivenessTargetKt;
.super Ljava/lang/Object;
.source "LivenessTarget.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a&\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0002\u001a\u0014\u0010\t\u001a\u00020\u0003*\u00020\u00082\u0006\u0010\n\u001a\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "TAG",
        "",
        "setOption",
        "",
        "Lcom/smartengines/id/IdFaceSessionSettings;",
        "key",
        "value",
        "logger",
        "Lcom/smartengines/engine/SessionSettingsLogger;",
        "dump",
        "sessionSettings",
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
.field private static final TAG:Ljava/lang/String; = "myapp.LivenessTarget"


# direct methods
.method public static final synthetic access$dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/id/IdFaceSessionSettings;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/smartengines/targets/id/LivenessTargetKt;->dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/id/IdFaceSessionSettings;)V

    return-void
.end method

.method public static final synthetic access$setOption(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/smartengines/targets/id/LivenessTargetKt;->setOption(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    return-void
.end method

.method private static final dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/id/IdFaceSessionSettings;)V
    .locals 4

    .line 76
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 77
    invoke-virtual {p1}, Lcom/smartengines/id/IdFaceSessionSettings;->OptionsBegin()Lcom/smartengines/common/StringsMapIterator;

    move-result-object v1

    .line 78
    invoke-virtual {p1}, Lcom/smartengines/id/IdFaceSessionSettings;->OptionsEnd()Lcom/smartengines/common/StringsMapIterator;

    move-result-object p1

    .line 79
    :goto_0
    invoke-virtual {v1, p1}, Lcom/smartengines/common/StringsMapIterator;->Equals(Lcom/smartengines/common/StringsMapIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 80
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->GetKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->GetValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->Advance()V

    goto :goto_0

    .line 83
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 76
    const-string p1, "session_settings"

    invoke-interface {p0, p1, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logData(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static final setOption(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 3

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "      - SetOption: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " >>> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.LivenessTarget"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p3, :cond_0

    .line 64
    new-instance v0, Lcom/smartengines/engine/SessionSettingsLogger$Action;

    const/4 v1, 0x2

    .line 66
    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 64
    const-string v2, "SetOption"

    invoke-direct {v0, v2, v1}, Lcom/smartengines/engine/SessionSettingsLogger$Action;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 63
    invoke-interface {p3, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logAction(Lcom/smartengines/engine/SessionSettingsLogger$Action;)V

    .line 69
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/id/IdFaceSessionSettings;->SetOption(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
