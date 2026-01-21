.class public final Lcom/smartengines/app/targets/TextTargetsKt;
.super Ljava/lang/Object;
.source "TextTargets.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "TAG",
        "",
        "loadTextTargetList",
        "Lcom/smartengines/app/targets/TreeItem;",
        "context",
        "Landroid/content/Context;",
        "textEngine",
        "Lcom/smartengines/text/TextEngine;",
        "stat",
        "Lcom/smartengines/targets/DocumentTypesStatistics;",
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
.field private static final TAG:Ljava/lang/String; = "myapp.TextTargets"


# direct methods
.method public static final loadTextTargetList(Landroid/content/Context;Lcom/smartengines/text/TextEngine;Lcom/smartengines/targets/DocumentTypesStatistics;)Lcom/smartengines/app/targets/TreeItem;
    .locals 9

    const-string p2, "context"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p0, "textEngine"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p1}, Lcom/smartengines/text/TextEngine;->CreateSessionSettings()Lcom/smartengines/text/TextSessionSettings;

    move-result-object p0

    const-string p1, "CreateSessionSettings(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/smartengines/targets/text/TextSessionOptionsKt;->parse(Lcom/smartengines/text/TextSessionSettings;)Lcom/smartengines/targets/text/TextSessionOptions;

    .line 18
    new-instance v0, Lcom/smartengines/app/targets/TreeGroup;

    .line 19
    new-instance v1, Lcom/smartengines/utils/Name;

    const-string/jumbo p0, "text-engine"

    invoke-direct {v1, p0}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;)V

    .line 21
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    const/16 v7, 0x38

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 18
    invoke-direct/range {v0 .. v8}, Lcom/smartengines/app/targets/TreeGroup;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Lcom/smartengines/app/targets/TreeGroupViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/smartengines/app/targets/TreeItem;

    return-object v0
.end method

.method public static synthetic loadTextTargetList$default(Landroid/content/Context;Lcom/smartengines/text/TextEngine;Lcom/smartengines/targets/DocumentTypesStatistics;ILjava/lang/Object;)Lcom/smartengines/app/targets/TreeItem;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 13
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/smartengines/app/targets/TextTargetsKt;->loadTextTargetList(Landroid/content/Context;Lcom/smartengines/text/TextEngine;Lcom/smartengines/targets/DocumentTypesStatistics;)Lcom/smartengines/app/targets/TreeItem;

    move-result-object p0

    return-object p0
.end method
