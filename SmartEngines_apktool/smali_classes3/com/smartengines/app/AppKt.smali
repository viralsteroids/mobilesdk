.class public final Lcom/smartengines/app/AppKt;
.super Ljava/lang/Object;
.source "App.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0008\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\"\u001a\u0010\u000b\u001a\u00020\u000cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010\"\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016\"\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001c\"\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"\"\u001a\u0010#\u001a\u00020$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(\u00a8\u0006)"
    }
    d2 = {
        "TAG",
        "",
        "AppIcons",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAppIcons",
        "()Landroidx/compose/material/icons/Icons$Rounded;",
        "instance",
        "Lcom/smartengines/app/App;",
        "app",
        "getApp",
        "()Lcom/smartengines/app/App;",
        "commonSettingsStore",
        "Lcom/smartengines/app/settings/CommonSettingsStore;",
        "getCommonSettingsStore",
        "()Lcom/smartengines/app/settings/CommonSettingsStore;",
        "setCommonSettingsStore",
        "(Lcom/smartengines/app/settings/CommonSettingsStore;)V",
        "codeSettingsStore",
        "Lcom/smartengines/app/settings/CodeSettingsStore;",
        "getCodeSettingsStore",
        "()Lcom/smartengines/app/settings/CodeSettingsStore;",
        "setCodeSettingsStore",
        "(Lcom/smartengines/app/settings/CodeSettingsStore;)V",
        "idSettingsStore",
        "Lcom/smartengines/app/settings/IdSettingsStore;",
        "getIdSettingsStore",
        "()Lcom/smartengines/app/settings/IdSettingsStore;",
        "setIdSettingsStore",
        "(Lcom/smartengines/app/settings/IdSettingsStore;)V",
        "docSettingsStore",
        "Lcom/smartengines/app/settings/DocSettingsStore;",
        "getDocSettingsStore",
        "()Lcom/smartengines/app/settings/DocSettingsStore;",
        "setDocSettingsStore",
        "(Lcom/smartengines/app/settings/DocSettingsStore;)V",
        "textSettingsStore",
        "Lcom/smartengines/app/settings/TextSettingsStore;",
        "getTextSettingsStore",
        "()Lcom/smartengines/app/settings/TextSettingsStore;",
        "setTextSettingsStore",
        "(Lcom/smartengines/app/settings/TextSettingsStore;)V",
        "app_storeRelease"
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
.field private static final AppIcons:Landroidx/compose/material/icons/Icons$Rounded;

.field private static final TAG:Ljava/lang/String; = "myapp.App"

.field public static codeSettingsStore:Lcom/smartengines/app/settings/CodeSettingsStore;

.field public static commonSettingsStore:Lcom/smartengines/app/settings/CommonSettingsStore;

.field public static docSettingsStore:Lcom/smartengines/app/settings/DocSettingsStore;

.field public static idSettingsStore:Lcom/smartengines/app/settings/IdSettingsStore;

.field private static instance:Lcom/smartengines/app/App;

.field public static textSettingsStore:Lcom/smartengines/app/settings/TextSettingsStore;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    sget-object v0, Landroidx/compose/material/icons/Icons$Rounded;->INSTANCE:Landroidx/compose/material/icons/Icons$Rounded;

    sput-object v0, Lcom/smartengines/app/AppKt;->AppIcons:Landroidx/compose/material/icons/Icons$Rounded;

    return-void
.end method

.method public static final synthetic access$setInstance$p(Lcom/smartengines/app/App;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/smartengines/app/AppKt;->instance:Lcom/smartengines/app/App;

    return-void
.end method

.method public static final getApp()Lcom/smartengines/app/App;
    .locals 1

    .line 20
    sget-object v0, Lcom/smartengines/app/AppKt;->instance:Lcom/smartengines/app/App;

    if-nez v0, :cond_0

    const-string v0, "instance"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public static final getAppIcons()Landroidx/compose/material/icons/Icons$Rounded;
    .locals 1

    .line 17
    sget-object v0, Lcom/smartengines/app/AppKt;->AppIcons:Landroidx/compose/material/icons/Icons$Rounded;

    return-object v0
.end method

.method public static final getCodeSettingsStore()Lcom/smartengines/app/settings/CodeSettingsStore;
    .locals 1

    .line 23
    sget-object v0, Lcom/smartengines/app/AppKt;->codeSettingsStore:Lcom/smartengines/app/settings/CodeSettingsStore;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "codeSettingsStore"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final getCommonSettingsStore()Lcom/smartengines/app/settings/CommonSettingsStore;
    .locals 1

    .line 22
    sget-object v0, Lcom/smartengines/app/AppKt;->commonSettingsStore:Lcom/smartengines/app/settings/CommonSettingsStore;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "commonSettingsStore"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final getDocSettingsStore()Lcom/smartengines/app/settings/DocSettingsStore;
    .locals 1

    .line 25
    sget-object v0, Lcom/smartengines/app/AppKt;->docSettingsStore:Lcom/smartengines/app/settings/DocSettingsStore;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "docSettingsStore"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final getIdSettingsStore()Lcom/smartengines/app/settings/IdSettingsStore;
    .locals 1

    .line 24
    sget-object v0, Lcom/smartengines/app/AppKt;->idSettingsStore:Lcom/smartengines/app/settings/IdSettingsStore;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "idSettingsStore"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final getTextSettingsStore()Lcom/smartengines/app/settings/TextSettingsStore;
    .locals 1

    .line 26
    sget-object v0, Lcom/smartengines/app/AppKt;->textSettingsStore:Lcom/smartengines/app/settings/TextSettingsStore;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string/jumbo v0, "textSettingsStore"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final setCodeSettingsStore(Lcom/smartengines/app/settings/CodeSettingsStore;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    sput-object p0, Lcom/smartengines/app/AppKt;->codeSettingsStore:Lcom/smartengines/app/settings/CodeSettingsStore;

    return-void
.end method

.method public static final setCommonSettingsStore(Lcom/smartengines/app/settings/CommonSettingsStore;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sput-object p0, Lcom/smartengines/app/AppKt;->commonSettingsStore:Lcom/smartengines/app/settings/CommonSettingsStore;

    return-void
.end method

.method public static final setDocSettingsStore(Lcom/smartengines/app/settings/DocSettingsStore;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    sput-object p0, Lcom/smartengines/app/AppKt;->docSettingsStore:Lcom/smartengines/app/settings/DocSettingsStore;

    return-void
.end method

.method public static final setIdSettingsStore(Lcom/smartengines/app/settings/IdSettingsStore;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    sput-object p0, Lcom/smartengines/app/AppKt;->idSettingsStore:Lcom/smartengines/app/settings/IdSettingsStore;

    return-void
.end method

.method public static final setTextSettingsStore(Lcom/smartengines/app/settings/TextSettingsStore;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    sput-object p0, Lcom/smartengines/app/AppKt;->textSettingsStore:Lcom/smartengines/app/settings/TextSettingsStore;

    return-void
.end method
