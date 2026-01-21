.class public final Lcom/smartengines/targets/id/IdTargetKt;
.super Ljava/lang/Object;
.source "IdTarget.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a&\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0002\u001a\u001e\u0010\t\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\n\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0002\u001a\u001e\u0010\u000b\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0002\u001a\u001e\u0010\r\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0002\u001a\u0016\u0010\u000e\u001a\u00020\u0003*\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "TAG",
        "",
        "setOption",
        "",
        "Lcom/smartengines/id/IdSessionSettings;",
        "key",
        "value",
        "logger",
        "Lcom/smartengines/engine/SessionSettingsLogger;",
        "setCurrentMode",
        "mode",
        "addEnabledDocumentTypes",
        "mask",
        "removeEnabledDocumentTypes",
        "enableForensics",
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
.field private static final TAG:Ljava/lang/String; = "myapp.IdTarget"


# direct methods
.method public static final synthetic access$addEnabledDocumentTypes(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/smartengines/targets/id/IdTargetKt;->addEnabledDocumentTypes(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    return-void
.end method

.method public static final synthetic access$dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/id/IdSessionSettings;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/smartengines/targets/id/IdTargetKt;->dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/id/IdSessionSettings;)V

    return-void
.end method

.method public static final synthetic access$enableForensics(Lcom/smartengines/id/IdSessionSettings;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/smartengines/targets/id/IdTargetKt;->enableForensics(Lcom/smartengines/id/IdSessionSettings;Lcom/smartengines/engine/SessionSettingsLogger;)V

    return-void
.end method

.method public static final synthetic access$removeEnabledDocumentTypes(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/smartengines/targets/id/IdTargetKt;->removeEnabledDocumentTypes(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    return-void
.end method

.method public static final synthetic access$setCurrentMode(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/smartengines/targets/id/IdTargetKt;->setCurrentMode(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    return-void
.end method

.method public static final synthetic access$setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/smartengines/targets/id/IdTargetKt;->setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    return-void
.end method

.method private static final addEnabledDocumentTypes(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 3

    .line 179
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "      - AddEnabledDocumentTypes: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.IdTarget"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p2, :cond_0

    .line 181
    new-instance v0, Lcom/smartengines/engine/SessionSettingsLogger$Action;

    .line 182
    const-string v1, "AddEnabledDocumentTypes"

    .line 183
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 181
    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/SessionSettingsLogger$Action;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 180
    invoke-interface {p2, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logAction(Lcom/smartengines/engine/SessionSettingsLogger$Action;)V

    .line 186
    :cond_0
    invoke-virtual {p0, p1}, Lcom/smartengines/id/IdSessionSettings;->AddEnabledDocumentTypes(Ljava/lang/String;)V

    return-void
.end method

.method private static final dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/id/IdSessionSettings;)V
    .locals 4

    .line 213
    invoke-virtual {p1}, Lcom/smartengines/id/IdSessionSettings;->GetCurrentMode()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GetCurrentMode(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "mode"

    invoke-interface {p0, v1, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 214
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 215
    invoke-virtual {p1}, Lcom/smartengines/id/IdSessionSettings;->EnabledDocumentTypesBegin()Lcom/smartengines/common/StringsSetIterator;

    move-result-object v1

    .line 216
    invoke-virtual {p1}, Lcom/smartengines/id/IdSessionSettings;->EnabledDocumentTypesEnd()Lcom/smartengines/common/StringsSetIterator;

    move-result-object v2

    .line 217
    :goto_0
    invoke-virtual {v1, v2}, Lcom/smartengines/common/StringsSetIterator;->Equals(Lcom/smartengines/common/StringsSetIterator;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 218
    invoke-virtual {v1}, Lcom/smartengines/common/StringsSetIterator;->GetValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    invoke-virtual {v1}, Lcom/smartengines/common/StringsSetIterator;->Advance()V

    goto :goto_0

    .line 221
    :cond_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 214
    const-string v1, "mask"

    invoke-interface {p0, v1, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logData(Ljava/lang/String;Ljava/lang/Object;)V

    .line 222
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 223
    invoke-virtual {p1}, Lcom/smartengines/id/IdSessionSettings;->OptionsBegin()Lcom/smartengines/common/StringsMapIterator;

    move-result-object v1

    .line 224
    invoke-virtual {p1}, Lcom/smartengines/id/IdSessionSettings;->OptionsEnd()Lcom/smartengines/common/StringsMapIterator;

    move-result-object p1

    .line 225
    :goto_1
    invoke-virtual {v1, p1}, Lcom/smartengines/common/StringsMapIterator;->Equals(Lcom/smartengines/common/StringsMapIterator;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 226
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->GetKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->GetValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    invoke-virtual {v1}, Lcom/smartengines/common/StringsMapIterator;->Advance()V

    goto :goto_1

    .line 229
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 222
    const-string p1, "session_settings"

    invoke-interface {p0, p1, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logData(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static final enableForensics(Lcom/smartengines/id/IdSessionSettings;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 3

    .line 199
    const-string v0, "myapp.IdTarget"

    const-string v1, "      - EnableForensics"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    .line 201
    new-instance v0, Lcom/smartengines/engine/SessionSettingsLogger$Action;

    .line 202
    const-string v1, "EnableForensics"

    .line 203
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    .line 201
    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/SessionSettingsLogger$Action;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 200
    invoke-interface {p1, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logAction(Lcom/smartengines/engine/SessionSettingsLogger$Action;)V

    .line 206
    :cond_0
    invoke-virtual {p0}, Lcom/smartengines/id/IdSessionSettings;->EnableForensics()V

    return-void
.end method

.method private static final removeEnabledDocumentTypes(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 3

    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "      - RemoveEnabledDocumentTypes: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.IdTarget"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p2, :cond_0

    .line 191
    new-instance v0, Lcom/smartengines/engine/SessionSettingsLogger$Action;

    .line 192
    const-string v1, "RemoveEnabledDocumentTypes"

    .line 193
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 191
    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/SessionSettingsLogger$Action;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 190
    invoke-interface {p2, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logAction(Lcom/smartengines/engine/SessionSettingsLogger$Action;)V

    .line 196
    :cond_0
    invoke-virtual {p0, p1}, Lcom/smartengines/id/IdSessionSettings;->RemoveEnabledDocumentTypes(Ljava/lang/String;)V

    return-void
.end method

.method private static final setCurrentMode(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 3

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "      - SetCurrentMode: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.IdTarget"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p2, :cond_0

    .line 171
    new-instance v0, Lcom/smartengines/engine/SessionSettingsLogger$Action;

    .line 172
    const-string v1, "SetCurrentMode"

    .line 173
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 171
    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/SessionSettingsLogger$Action;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 170
    invoke-interface {p2, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logAction(Lcom/smartengines/engine/SessionSettingsLogger$Action;)V

    .line 176
    :cond_0
    invoke-virtual {p0, p1}, Lcom/smartengines/id/IdSessionSettings;->SetCurrentMode(Ljava/lang/String;)V

    return-void
.end method

.method private static final setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 3

    .line 159
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

    const-string v1, "myapp.IdTarget"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p3, :cond_0

    .line 161
    new-instance v0, Lcom/smartengines/engine/SessionSettingsLogger$Action;

    const/4 v1, 0x2

    .line 163
    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 161
    const-string v2, "SetOption"

    invoke-direct {v0, v2, v1}, Lcom/smartengines/engine/SessionSettingsLogger$Action;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 160
    invoke-interface {p3, v0}, Lcom/smartengines/engine/SessionSettingsLogger;->logAction(Lcom/smartengines/engine/SessionSettingsLogger$Action;)V

    .line 166
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/id/IdSessionSettings;->SetOption(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
