.class public final Lcom/smartengines/targets/text/TextTargetKt;
.super Ljava/lang/Object;
.source "TextTarget.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a&\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0002\u001a\u001e\u0010\t\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\n\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0002\u001a\u0014\u0010\u000b\u001a\u00020\u0003*\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "TAG",
        "",
        "setOption",
        "",
        "Lcom/smartengines/text/TextSessionSettings;",
        "key",
        "value",
        "logger",
        "Lcom/smartengines/engine/SessionSettingsLogger;",
        "addEnabledLanguages",
        "lang",
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
.field private static final TAG:Ljava/lang/String; = "myapp.TextTarget"


# direct methods
.method public static final synthetic access$addEnabledLanguages(Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/smartengines/targets/text/TextTargetKt;->addEnabledLanguages(Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    return-void
.end method

.method public static final synthetic access$dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/text/TextSessionSettings;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/smartengines/targets/text/TextTargetKt;->dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/text/TextSessionSettings;)V

    return-void
.end method

.method public static final synthetic access$setOption(Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/smartengines/targets/text/TextTargetKt;->setOption(Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    return-void
.end method

.method private static final addEnabledLanguages(Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 3

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "      - AddEnabledLanguages: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.TextTarget"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p2, :cond_0

    .line 80
    new-instance v0, Lcom/smartengines/engine/SessionSettingsLogger$Action;

    .line 81
    const-string v1, "AddEnabledLanguages"

    .line 82
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 80
    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/SessionSettingsLogger$Action;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 79
    invoke-interface {p2, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logAction(Lcom/smartengines/engine/SessionSettingsLogger$Action;)V

    .line 85
    :cond_0
    invoke-virtual {p0, p1}, Lcom/smartengines/text/TextSessionSettings;->AddEnabledLanguages(Ljava/lang/String;)V

    return-void
.end method

.method private static final dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/text/TextSessionSettings;)V
    .locals 5

    .line 92
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 93
    invoke-virtual {p1}, Lcom/smartengines/text/TextSessionSettings;->OptionsBegin()Lcom/smartengines/common/StringsMapIterator;

    move-result-object v1

    .line 94
    invoke-virtual {p1}, Lcom/smartengines/text/TextSessionSettings;->OptionsEnd()Lcom/smartengines/common/StringsMapIterator;

    move-result-object v2

    .line 95
    :goto_0
    invoke-virtual {v1, v2}, Lcom/smartengines/common/StringsMapIterator;->Equals(Lcom/smartengines/common/StringsMapIterator;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 96
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->GetKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->GetValue()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->Advance()V

    goto :goto_0

    .line 99
    :cond_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 92
    const-string v1, "session_settings"

    invoke-interface {p0, v1, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 101
    invoke-virtual {p1}, Lcom/smartengines/text/TextSessionSettings;->EnabledLanguagesBegin()Lcom/smartengines/common/StringsSetIterator;

    move-result-object v1

    .line 102
    invoke-virtual {p1}, Lcom/smartengines/text/TextSessionSettings;->EnabledLanguagesEnd()Lcom/smartengines/common/StringsSetIterator;

    move-result-object p1

    .line 103
    :goto_1
    invoke-virtual {v1, p1}, Lcom/smartengines/common/StringsSetIterator;->Equals(Lcom/smartengines/common/StringsSetIterator;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 104
    invoke-virtual {v1}, Lcom/smartengines/common/StringsSetIterator;->GetValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    invoke-virtual {v1}, Lcom/smartengines/common/StringsSetIterator;->Advance()V

    goto :goto_1

    .line 107
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 100
    const-string p1, "languages"

    invoke-interface {p0, p1, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logData(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static final setOption(Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 3

    .line 68
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

    const-string v1, "myapp.TextTarget"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p3, :cond_0

    .line 70
    new-instance v0, Lcom/smartengines/engine/SessionSettingsLogger$Action;

    const/4 v1, 0x2

    .line 72
    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 70
    const-string v2, "SetOption"

    invoke-direct {v0, v2, v1}, Lcom/smartengines/engine/SessionSettingsLogger$Action;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 69
    invoke-interface {p3, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logAction(Lcom/smartengines/engine/SessionSettingsLogger$Action;)V

    .line 75
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/text/TextSessionSettings;->SetOption(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
