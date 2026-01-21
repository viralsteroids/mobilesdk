.class public final Lcom/smartengines/app/settings/CodeSettings;
.super Ljava/lang/Object;
.source "CodeSettings.kt"

# interfaces
.implements Lcom/smartengines/targets/code/CodeSettings;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u001a\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010,\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c7\u0001J\u0013\u0010.\u001a\u00020\u00152\u0008\u0010/\u001a\u0004\u0018\u000100H\u00d7\u0003J\t\u00101\u001a\u00020\u000cH\u00d7\u0001J\t\u00102\u001a\u00020\u0008H\u00d7\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0017R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u0017R\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\nR\u0014\u0010\"\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u000eR\u001a\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\nR\u0014\u0010&\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\u000eR\u001a\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010\nR\u0014\u0010*\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010\u000e\u00a8\u00063"
    }
    d2 = {
        "Lcom/smartengines/app/settings/CodeSettings;",
        "Lcom/smartengines/targets/code/CodeSettings;",
        "prefs",
        "Landroidx/datastore/preferences/core/Preferences;",
        "<init>",
        "(Landroidx/datastore/preferences/core/Preferences;)V",
        "barcodeTypes",
        "",
        "",
        "getBarcodeTypes",
        "()Ljava/util/Set;",
        "barcodeMax",
        "",
        "getBarcodeMax",
        "()I",
        "barcodeRoi",
        "getBarcodeRoi",
        "()Ljava/lang/String;",
        "barcodeEffort",
        "getBarcodeEffort",
        "barcodeDecode",
        "",
        "getBarcodeDecode",
        "()Z",
        "barcodeSmart",
        "getBarcodeSmart",
        "barcodeNonpayment",
        "getBarcodeNonpayment",
        "cardTypes",
        "getCardTypes",
        "cardShowOptionalData",
        "getCardShowOptionalData",
        "paymentTypes",
        "getPaymentTypes",
        "lineMax",
        "getLineMax",
        "lineTypes",
        "getLineTypes",
        "meterMax",
        "getMeterMax",
        "plateTypes",
        "getPlateTypes",
        "containerMax",
        "getContainerMax",
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

    invoke-direct {p0, v0, v1, v0}, Lcom/smartengines/app/settings/CodeSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/datastore/preferences/core/Preferences;)V
    .locals 1

    const-string v0, "prefs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 46
    invoke-static {}, Landroidx/datastore/preferences/core/PreferencesFactory;->createEmpty()Landroidx/datastore/preferences/core/Preferences;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/smartengines/app/settings/CodeSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;)V

    return-void
.end method

.method private final component1()Landroidx/datastore/preferences/core/Preferences;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/smartengines/app/settings/CodeSettings;Landroidx/datastore/preferences/core/Preferences;ILjava/lang/Object;)Lcom/smartengines/app/settings/CodeSettings;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/smartengines/app/settings/CodeSettings;->copy(Landroidx/datastore/preferences/core/Preferences;)Lcom/smartengines/app/settings/CodeSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Landroidx/datastore/preferences/core/Preferences;)Lcom/smartengines/app/settings/CodeSettings;
    .locals 1

    const-string v0, "prefs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/app/settings/CodeSettings;

    invoke-direct {v0, p1}, Lcom/smartengines/app/settings/CodeSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/app/settings/CodeSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/app/settings/CodeSettings;

    iget-object v1, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    iget-object p1, p1, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getBarcodeDecode()Z
    .locals 2

    .line 52
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getBARCODE_DECODE$p()Landroidx/datastore/preferences/core/Preferences$Key;

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

.method public getBarcodeEffort()Ljava/lang/String;
    .locals 2

    .line 51
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getBARCODE_EFFORT$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    sget-object v0, Lcom/smartengines/dictionaries/CodeDictionaries;->INSTANCE:Lcom/smartengines/dictionaries/CodeDictionaries;

    invoke-virtual {v0}, Lcom/smartengines/dictionaries/CodeDictionaries;->getBarcodeEffortDefault()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getBarcodeMax()I
    .locals 2

    .line 49
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getBARCODE_MAX$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x5

    return v0
.end method

.method public getBarcodeNonpayment()Z
    .locals 2

    .line 54
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getBARCODE_NONPAYMENT$p()Landroidx/datastore/preferences/core/Preferences$Key;

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

.method public getBarcodeRoi()Ljava/lang/String;
    .locals 2

    .line 50
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getBARCODE_ROI$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    sget-object v0, Lcom/smartengines/dictionaries/CodeDictionaries;->INSTANCE:Lcom/smartengines/dictionaries/CodeDictionaries;

    invoke-virtual {v0}, Lcom/smartengines/dictionaries/CodeDictionaries;->getBarcodeRoiDefault()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getBarcodeSmart()Z
    .locals 2

    .line 53
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getBARCODE_SMART$p()Landroidx/datastore/preferences/core/Preferences$Key;

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

.method public getBarcodeTypes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getBARCODE_TYPES$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    const-string v0, "GS1_DATABAR"

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getCardShowOptionalData()Z
    .locals 2

    .line 57
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getCARD_OPTIONAL$p()Landroidx/datastore/preferences/core/Preferences$Key;

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

.method public getCardTypes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getCARD_TYPES$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getContainerMax()I
    .locals 2

    .line 68
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getCONTAINER_MAX$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/16 v0, 0xa

    return v0
.end method

.method public getLineMax()I
    .locals 2

    .line 61
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getLINE_MAX$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x2

    return v0
.end method

.method public getLineTypes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getLINE_TYPES$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getMeterMax()I
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getMETER_MAX$p()Landroidx/datastore/preferences/core/Preferences$Key;

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

.method public getPaymentTypes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getPAYMENT_TYPES$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getPlateTypes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/CodeSettingsKt;->access$getPLATE_TYPES$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    sget-object v0, Lcom/smartengines/dictionaries/CodeDictionaries;->INSTANCE:Lcom/smartengines/dictionaries/CodeDictionaries;

    invoke-virtual {v0}, Lcom/smartengines/dictionaries/CodeDictionaries;->getPlateTypesDefault()Ljava/util/Set;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-virtual {v0}, Landroidx/datastore/preferences/core/Preferences;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CodeSettings(prefs="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/app/settings/CodeSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
