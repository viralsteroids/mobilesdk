.class public final Lcom/smartengines/utils/SettingsBoolean;
.super Ljava/lang/Object;
.source "SettingsBoolean.kt"

# interfaces
.implements Lcom/smartengines/utils/SettingsValue;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0008\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\u0007\"\u0004\u0008\n\u0010\u0005\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/smartengines/utils/SettingsBoolean;",
        "Lcom/smartengines/utils/SettingsValue;",
        "defaultVal",
        "",
        "<init>",
        "(Z)V",
        "getDefaultVal",
        "()Z",
        "value",
        "getValue",
        "setValue",
        "load",
        "",
        "key",
        "",
        "prefs",
        "Landroid/content/SharedPreferences;",
        "save",
        "editor",
        "Landroid/content/SharedPreferences$Editor;",
        "utils_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final defaultVal:Z

.field private value:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-boolean p1, p0, Lcom/smartengines/utils/SettingsBoolean;->defaultVal:Z

    .line 11
    iput-boolean p1, p0, Lcom/smartengines/utils/SettingsBoolean;->value:Z

    return-void
.end method


# virtual methods
.method public final getDefaultVal()Z
    .locals 1

    .line 9
    iget-boolean v0, p0, Lcom/smartengines/utils/SettingsBoolean;->defaultVal:Z

    return v0
.end method

.method public final getValue()Z
    .locals 1

    .line 11
    iget-boolean v0, p0, Lcom/smartengines/utils/SettingsBoolean;->value:Z

    return v0
.end method

.method public load(Ljava/lang/String;Landroid/content/SharedPreferences;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iget-boolean v0, p0, Lcom/smartengines/utils/SettingsBoolean;->defaultVal:Z

    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    iput-boolean p2, p0, Lcom/smartengines/utils/SettingsBoolean;->value:Z

    .line 15
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, " ---load--- "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, " : "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-boolean p2, p0, Lcom/smartengines/utils/SettingsBoolean;->value:Z

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "myapp.SettingsBoolean"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public save(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iget-boolean v0, p0, Lcom/smartengines/utils/SettingsBoolean;->value:Z

    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    return-void
.end method

.method public final setValue(Z)V
    .locals 0

    .line 11
    iput-boolean p1, p0, Lcom/smartengines/utils/SettingsBoolean;->value:Z

    return-void
.end method
