.class public Lcom/smartengines/utils/Settings;
.super Ljava/lang/Object;
.source "Settings.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\ncom/smartengines/utils/Settings\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n216#2,2:113\n1863#3,2:115\n*S KotlinDebug\n*F\n+ 1 Settings.kt\ncom/smartengines/utils/Settings\n*L\n19#1:113,2\n29#1:115,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0003\u0008\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0013J\u001e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003J\u0014\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\u001c\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001eJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00080\u0007X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lcom/smartengines/utils/Settings;",
        "",
        "filename",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "items",
        "Ljava/util/HashMap;",
        "Lcom/smartengines/utils/SettingsValue;",
        "getItems",
        "()Ljava/util/HashMap;",
        "dirty",
        "Ljava/util/HashSet;",
        "load",
        "",
        "context",
        "Landroid/content/Context;",
        "save",
        "getBoolean",
        "",
        "key",
        "getBooleanAsString",
        "set",
        "newVal",
        "setAndSave",
        "getInt",
        "",
        "getIntAsString",
        "getString",
        "getStringSet",
        "",
        "getStringSetAsString",
        "throwNotFound",
        "",
        "throwNotOfType",
        "type",
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
.field private final dirty:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final filename:Ljava/lang/String;

.field private final items:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/smartengines/utils/SettingsValue;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "filename"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/smartengines/utils/Settings;->filename:Ljava/lang/String;

    .line 13
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/smartengines/utils/Settings;->items:Ljava/util/HashMap;

    .line 14
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/smartengines/utils/Settings;->dirty:Ljava/util/HashSet;

    return-void
.end method

.method private final throwNotFound(Ljava/lang/String;)Ljava/lang/Void;
    .locals 3

    .line 109
    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "key:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " is not found"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final throwNotOfType(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;
    .locals 3

    .line 111
    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "the value for key:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " is not "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final getBoolean(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lcom/smartengines/utils/Settings;->items:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/utils/SettingsValue;

    if-eqz v0, :cond_1

    .line 39
    instance-of v1, v0, Lcom/smartengines/utils/SettingsBoolean;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/smartengines/utils/SettingsBoolean;

    invoke-virtual {v0}, Lcom/smartengines/utils/SettingsBoolean;->getValue()Z

    move-result p1

    return p1

    .line 40
    :cond_0
    const-string v0, "Boolean"

    invoke-direct {p0, p1, v0}, Lcom/smartengines/utils/Settings;->throwNotOfType(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    .line 41
    :cond_1
    invoke-direct {p0, p1}, Lcom/smartengines/utils/Settings;->throwNotFound(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final getBooleanAsString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-virtual {p0, p1}, Lcom/smartengines/utils/Settings;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getInt(Ljava/lang/String;)I
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/smartengines/utils/Settings;->items:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/utils/SettingsValue;

    if-eqz v0, :cond_1

    .line 60
    instance-of v1, v0, Lcom/smartengines/utils/SettingsInt;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/smartengines/utils/SettingsInt;

    invoke-virtual {v0}, Lcom/smartengines/utils/SettingsInt;->getValue()I

    move-result p1

    return p1

    .line 61
    :cond_0
    const-string v0, "Int"

    invoke-direct {p0, p1, v0}, Lcom/smartengines/utils/Settings;->throwNotOfType(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    .line 62
    :cond_1
    invoke-direct {p0, p1}, Lcom/smartengines/utils/Settings;->throwNotFound(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final getIntAsString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-virtual {p0, p1}, Lcom/smartengines/utils/Settings;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected final getItems()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/smartengines/utils/SettingsValue;",
            ">;"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/smartengines/utils/Settings;->items:Ljava/util/HashMap;

    return-object v0
.end method

.method public final getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lcom/smartengines/utils/Settings;->items:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/utils/SettingsValue;

    if-eqz v0, :cond_1

    .line 77
    instance-of v1, v0, Lcom/smartengines/utils/SettingsString;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/smartengines/utils/SettingsString;

    invoke-virtual {v0}, Lcom/smartengines/utils/SettingsString;->getValue()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    .line 78
    :cond_0
    const-string v0, "String"

    invoke-direct {p0, p1, v0}, Lcom/smartengines/utils/Settings;->throwNotOfType(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    .line 79
    :cond_1
    invoke-direct {p0, p1}, Lcom/smartengines/utils/Settings;->throwNotFound(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final getStringSet(Ljava/lang/String;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    iget-object v0, p0, Lcom/smartengines/utils/Settings;->items:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/utils/SettingsValue;

    if-eqz v0, :cond_1

    .line 93
    instance-of v1, v0, Lcom/smartengines/utils/SettingsStringSet;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/smartengines/utils/SettingsStringSet;

    invoke-virtual {v0}, Lcom/smartengines/utils/SettingsStringSet;->getValue()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    .line 94
    :cond_0
    const-string v0, "StringSet"

    invoke-direct {p0, p1, v0}, Lcom/smartengines/utils/Settings;->throwNotOfType(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    .line 95
    :cond_1
    invoke-direct {p0, p1}, Lcom/smartengines/utils/Settings;->throwNotFound(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final getStringSetAsString(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    invoke-virtual {p0, p1}, Lcom/smartengines/utils/Settings;->getStringSet(Ljava/lang/String;)Ljava/util/Set;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const-string/jumbo p1, "|"

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final load(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iget-object v0, p0, Lcom/smartengines/utils/Settings;->filename:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 19
    iget-object v0, p0, Lcom/smartengines/utils/Settings;->items:Ljava/util/HashMap;

    check-cast v0, Ljava/util/Map;

    .line 113
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 19
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/utils/SettingsValue;

    .line 20
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, v2, p1}, Lcom/smartengines/utils/SettingsValue;->load(Ljava/lang/String;Landroid/content/SharedPreferences;)V

    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, Lcom/smartengines/utils/Settings;->dirty:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    return-void
.end method

.method public final save(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "save "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/utils/Settings;->dirty:Ljava/util/HashSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.Settings"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    iget-object v0, p0, Lcom/smartengines/utils/Settings;->dirty:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/smartengines/utils/Settings;->filename:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 28
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 29
    iget-object v0, p0, Lcom/smartengines/utils/Settings;->dirty:Ljava/util/HashSet;

    check-cast v0, Ljava/lang/Iterable;

    .line 115
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 30
    iget-object v2, p0, Lcom/smartengines/utils/Settings;->items:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/utils/SettingsValue;

    if-eqz v2, :cond_1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, v1, p1}, Lcom/smartengines/utils/SettingsValue;->save(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)V

    goto :goto_0

    .line 32
    :cond_2
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 33
    iget-object p1, p0, Lcom/smartengines/utils/Settings;->dirty:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    return-void
.end method

.method public final set(Ljava/lang/String;I)V
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lcom/smartengines/utils/Settings;->items:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/utils/SettingsValue;

    if-eqz v0, :cond_1

    .line 67
    instance-of v1, v0, Lcom/smartengines/utils/SettingsInt;

    if-eqz v1, :cond_0

    .line 68
    check-cast v0, Lcom/smartengines/utils/SettingsInt;

    invoke-virtual {v0, p2}, Lcom/smartengines/utils/SettingsInt;->setValue(I)V

    .line 69
    iget-object p2, p0, Lcom/smartengines/utils/Settings;->dirty:Ljava/util/HashSet;

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void

    .line 70
    :cond_0
    const-string p2, "Int"

    invoke-direct {p0, p1, p2}, Lcom/smartengines/utils/Settings;->throwNotOfType(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    .line 71
    :cond_1
    invoke-direct {p0, p1}, Lcom/smartengines/utils/Settings;->throwNotFound(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final set(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newVal"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/smartengines/utils/Settings;->items:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/utils/SettingsValue;

    if-eqz v0, :cond_1

    .line 83
    instance-of v1, v0, Lcom/smartengines/utils/SettingsString;

    if-eqz v1, :cond_0

    .line 84
    check-cast v0, Lcom/smartengines/utils/SettingsString;

    invoke-virtual {v0, p2}, Lcom/smartengines/utils/SettingsString;->setValue(Ljava/lang/String;)V

    .line 85
    iget-object p2, p0, Lcom/smartengines/utils/Settings;->dirty:Ljava/util/HashSet;

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void

    .line 86
    :cond_0
    const-string p2, "String"

    invoke-direct {p0, p1, p2}, Lcom/smartengines/utils/Settings;->throwNotOfType(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    .line 87
    :cond_1
    invoke-direct {p0, p1}, Lcom/smartengines/utils/Settings;->throwNotFound(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final set(Ljava/lang/String;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newVal"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lcom/smartengines/utils/Settings;->items:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/utils/SettingsValue;

    if-eqz v0, :cond_1

    .line 100
    instance-of v1, v0, Lcom/smartengines/utils/SettingsStringSet;

    if-eqz v1, :cond_0

    .line 101
    check-cast v0, Lcom/smartengines/utils/SettingsStringSet;

    invoke-virtual {v0, p2}, Lcom/smartengines/utils/SettingsStringSet;->setValue(Ljava/util/Set;)V

    .line 102
    iget-object p2, p0, Lcom/smartengines/utils/Settings;->dirty:Ljava/util/HashSet;

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void

    .line 103
    :cond_0
    const-string p2, "StringSet"

    invoke-direct {p0, p1, p2}, Lcom/smartengines/utils/Settings;->throwNotOfType(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    .line 104
    :cond_1
    invoke-direct {p0, p1}, Lcom/smartengines/utils/Settings;->throwNotFound(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final set(Ljava/lang/String;Z)V
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/smartengines/utils/Settings;->items:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/utils/SettingsValue;

    if-eqz v0, :cond_1

    .line 46
    instance-of v1, v0, Lcom/smartengines/utils/SettingsBoolean;

    if-eqz v1, :cond_0

    .line 47
    check-cast v0, Lcom/smartengines/utils/SettingsBoolean;

    invoke-virtual {v0, p2}, Lcom/smartengines/utils/SettingsBoolean;->setValue(Z)V

    .line 48
    iget-object p2, p0, Lcom/smartengines/utils/Settings;->dirty:Ljava/util/HashSet;

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void

    .line 49
    :cond_0
    const-string p2, "Boolean"

    invoke-direct {p0, p1, p2}, Lcom/smartengines/utils/Settings;->throwNotOfType(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    .line 50
    :cond_1
    invoke-direct {p0, p1}, Lcom/smartengines/utils/Settings;->throwNotFound(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final setAndSave(Ljava/lang/String;ZLandroid/content/Context;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/utils/Settings;->set(Ljava/lang/String;Z)V

    .line 54
    invoke-virtual {p0, p3}, Lcom/smartengines/utils/Settings;->save(Landroid/content/Context;)V

    return-void
.end method
