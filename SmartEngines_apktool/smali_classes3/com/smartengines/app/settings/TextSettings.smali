.class public final Lcom/smartengines/app/settings/TextSettings;
.super Ljava/lang/Object;
.source "TextSettings.kt"

# interfaces
.implements Lcom/smartengines/targets/text/TextSettings;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u000f\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c7\u0001J\u0013\u0010\u0011\u001a\u00020\u000c2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d7\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d7\u0001J\t\u0010\u0016\u001a\u00020\u0008H\u00d7\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/smartengines/app/settings/TextSettings;",
        "Lcom/smartengines/targets/text/TextSettings;",
        "prefs",
        "Landroidx/datastore/preferences/core/Preferences;",
        "<init>",
        "(Landroidx/datastore/preferences/core/Preferences;)V",
        "languages",
        "",
        "",
        "getLanguages",
        "()Ljava/util/Set;",
        "pageDetection",
        "",
        "getPageDetection",
        "()Z",
        "component1",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
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

    invoke-direct {p0, v0, v1, v0}, Lcom/smartengines/app/settings/TextSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/datastore/preferences/core/Preferences;)V
    .locals 1

    const-string v0, "prefs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/settings/TextSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 23
    invoke-static {}, Landroidx/datastore/preferences/core/PreferencesFactory;->createEmpty()Landroidx/datastore/preferences/core/Preferences;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/smartengines/app/settings/TextSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;)V

    return-void
.end method

.method private final component1()Landroidx/datastore/preferences/core/Preferences;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/settings/TextSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/smartengines/app/settings/TextSettings;Landroidx/datastore/preferences/core/Preferences;ILjava/lang/Object;)Lcom/smartengines/app/settings/TextSettings;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/smartengines/app/settings/TextSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/smartengines/app/settings/TextSettings;->copy(Landroidx/datastore/preferences/core/Preferences;)Lcom/smartengines/app/settings/TextSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(Landroidx/datastore/preferences/core/Preferences;)Lcom/smartengines/app/settings/TextSettings;
    .locals 1

    const-string v0, "prefs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/app/settings/TextSettings;

    invoke-direct {v0, p1}, Lcom/smartengines/app/settings/TextSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/app/settings/TextSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/app/settings/TextSettings;

    iget-object v1, p0, Lcom/smartengines/app/settings/TextSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    iget-object p1, p1, Lcom/smartengines/app/settings/TextSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getLanguages()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/smartengines/app/settings/TextSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/TextSettingsKt;->access$getLANGUAGES$p()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/datastore/preferences/core/Preferences;->get(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "digits"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "eng"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "rus"

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getPageDetection()Z
    .locals 2

    .line 25
    iget-object v0, p0, Lcom/smartengines/app/settings/TextSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-static {}, Lcom/smartengines/app/settings/TextSettingsKt;->access$getPAGE_DETECTION$p()Landroidx/datastore/preferences/core/Preferences$Key;

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

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/settings/TextSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-virtual {v0}, Landroidx/datastore/preferences/core/Preferences;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TextSettings(prefs="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/app/settings/TextSettings;->prefs:Landroidx/datastore/preferences/core/Preferences;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
