.class public final Lcom/smartengines/app/settings/IdSettings;
.super Ljava/lang/Object;
.source "IdSettings.kt"

# interfaces
.implements Lcom/smartengines/targets/id/IdSettings;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0015\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010(\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c7\u0001J\u0013\u0010*\u001a\u00020\u00072\u0008\u0010+\u001a\u0004\u0018\u00010,H\u00d7\u0003J\t\u0010-\u001a\u00020\rH\u00d7\u0001J\t\u0010.\u001a\u00020#H\u00d7\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\tR\u0014\u0010\u000c\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\tR\u0011\u0010\u001a\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\tR\u0014\u0010\u001c\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u000fR\u0011\u0010\u001e\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\tR\u0011\u0010 \u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\tR\u0011\u0010\"\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%R\u0011\u0010&\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010%\u00a8\u0006/"
    }
    d2 = {
        "Lcom/smartengines/app/settings/IdSettings;",
        "Lcom/smartengines/targets/id/IdSettings;",
        "prefs",
        "Landroidx/datastore/preferences/core/Preferences;",
        "<init>",
        "(Landroidx/datastore/preferences/core/Preferences;)V",
        "vauthEnabled",
        "",
        "getVauthEnabled",
        "()Z",
        "enableForensics",
        "getEnableForensics",
        "minInstrTime",
        "",
        "getMinInstrTime",
        "()I",
        "maxInstrTime",
        "getMaxInstrTime",
        "instrCount",
        "getInstrCount",
        "instrCountDeltaRandom",
        "getInstrCountDeltaRandom",
        "instrFailed",
        "getInstrFailed",
        "alwaysPass",
        "getAlwaysPass",
        "enableVisualization",
        "getEnableVisualization",
        "minPassTime",
        "getMinPassTime",
        "flashByDefault",
        "getFlashByDefault",
        "showUndefChecks",
        "getShowUndefChecks",
        "showChecksFilter",
        "",
        "getShowChecksFilter",
        "()Ljava/lang/String;",
        "hideChecksFilter",
        "getHideChecksFilter",
        "component1",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final prefs:Landroidx/datastore/preferences/core/Preferences;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/smartengines/app/settings/IdSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/datastore/preferences/core/Preferences;)V
    .locals 1

    const-string v0, "prefs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 39
    invoke-static {}, Landroidx/datastore/preferences/core/PreferencesFactory;->createEmpty()Landroidx/datastore/preferences/core/Preferences;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/smartengines/app/settings/IdSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;)V

    return-void
.end method

.method private final component1()Landroidx/datastore/preferences/core/Preferences;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/smartengines/app/settings/IdSettings;Landroidx/datastore/preferences/core/Preferences;ILjava/lang/Object;)Lcom/smartengines/app/settings/IdSettings;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/smartengines/app/settings/IdSettings;->copy(Landroidx/datastore/preferences/core/Preferences;)Lcom/smartengines/app/settings/IdSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Landroidx/datastore/preferences/core/Preferences;)Lcom/smartengines/app/settings/IdSettings;
    .locals 1

    const-string v0, "prefs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/app/settings/IdSettings;

    invoke-direct {v0, p1}, Lcom/smartengines/app/settings/IdSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/app/settings/IdSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/app/settings/IdSettings;

    iget-object v1, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    iget-object p1, p1, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getAlwaysPass()Z
    .locals 2

    .line 48
    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getALWAYS_PASS$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getEnableForensics()Z
    .locals 2

    .line 41
    sget-object v0, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v0}, Lcom/smartengines/app/Model;->getBuildFlavor()Lcom/smartengines/app/settings/BuildFlavor;

    move-result-object v0

    sget-object v1, Lcom/smartengines/app/settings/BuildFlavor;->FORENSIC:Lcom/smartengines/app/settings/BuildFlavor;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getENABLE_FORENSICS$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    return v1

    :cond_2
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method public final getEnableVisualization()Z
    .locals 2

    .line 49
    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getENABLE_VISUAL$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getFlashByDefault()Z
    .locals 2

    .line 54
    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getFLASH_BY_DEFAULT$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final getHideChecksFilter()Ljava/lang/String;
    .locals 2

    .line 57
    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getHIDE_CHECKS_FILTER$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public getInstrCount()I
    .locals 2

    .line 45
    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getINSTR_COUNT$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x4

    return v0
.end method

.method public getInstrCountDeltaRandom()I
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getINSTR_COUNT_DELTA$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getInstrFailed()I
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getINSTR_FAILED$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public getMaxInstrTime()I
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getMAX_INSTR_TIME$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x7

    return v0
.end method

.method public getMinInstrTime()I
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getMIN_INSTR_TIME$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x6

    return v0
.end method

.method public getMinPassTime()I
    .locals 2

    .line 50
    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getMIN_PASS_TIME$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/16 v0, 0x3e8

    return v0
.end method

.method public final getShowChecksFilter()Ljava/lang/String;
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getSHOW_CHECKS_FILTER$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public final getShowUndefChecks()Z
    .locals 2

    .line 55
    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/IdSettingsKt;->access$getSHOW_UNDEF_CHECKS$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public getVauthEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-virtual {v0}, Landroidx/datastore/preferences/core/Preferences;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IdSettings(prefs="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/app/settings/IdSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
