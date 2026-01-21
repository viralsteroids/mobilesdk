.class public final Lcom/smartengines/app/SessionSettingsLoggerImpl;
.super Ljava/lang/Object;
.source "SessionSettingsLoggerImpl.kt"

# interfaces
.implements Lcom/smartengines/engine/SessionSettingsLogger;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0007\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0003\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0008\u0010\u0019\u001a\u00020\u000cH\u0016R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/smartengines/app/SessionSettingsLoggerImpl;",
        "Lcom/smartengines/engine/SessionSettingsLogger;",
        "<init>",
        "()V",
        "_actions",
        "Ljava/util/ArrayList;",
        "Lcom/smartengines/engine/SessionSettingsLogger$Action;",
        "actions",
        "",
        "getActions",
        "()Ljava/util/List;",
        "logAction",
        "",
        "action",
        "_data",
        "Ljava/util/HashMap;",
        "",
        "",
        "data",
        "",
        "getData",
        "()Ljava/util/Map;",
        "logData",
        "key",
        "value",
        "clear",
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/smartengines/app/SessionSettingsLoggerImpl;

.field private static final _actions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/smartengines/engine/SessionSettingsLogger$Action;",
            ">;"
        }
    .end annotation
.end field

.field private static final _data:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/SessionSettingsLoggerImpl;

    invoke-direct {v0}, Lcom/smartengines/app/SessionSettingsLoggerImpl;-><init>()V

    sput-object v0, Lcom/smartengines/app/SessionSettingsLoggerImpl;->INSTANCE:Lcom/smartengines/app/SessionSettingsLoggerImpl;

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/smartengines/app/SessionSettingsLoggerImpl;->_actions:Ljava/util/ArrayList;

    .line 19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/smartengines/app/SessionSettingsLoggerImpl;->_data:Ljava/util/HashMap;

    const/16 v0, 0x8

    sput v0, Lcom/smartengines/app/SessionSettingsLoggerImpl;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 28
    sget-object v0, Lcom/smartengines/app/SessionSettingsLoggerImpl;->_actions:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 29
    sget-object v0, Lcom/smartengines/app/SessionSettingsLoggerImpl;->_data:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public getActions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/SessionSettingsLogger$Action;",
            ">;"
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/smartengines/app/SessionSettingsLoggerImpl;->_actions:Ljava/util/ArrayList;

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 20
    sget-object v0, Lcom/smartengines/app/SessionSettingsLoggerImpl;->_data:Ljava/util/HashMap;

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public logAction(Lcom/smartengines/engine/SessionSettingsLogger$Action;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    sget-object v0, Lcom/smartengines/app/SessionSettingsLoggerImpl;->_actions:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public logData(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    sget-object v0, Lcom/smartengines/app/SessionSettingsLoggerImpl;->_data:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
