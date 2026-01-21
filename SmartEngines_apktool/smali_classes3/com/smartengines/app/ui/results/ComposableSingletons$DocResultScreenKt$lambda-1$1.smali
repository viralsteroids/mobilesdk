.class final Lcom/smartengines/app/ui/results/ComposableSingletons$DocResultScreenKt$lambda-1$1;
.super Ljava/lang/Object;
.source "DocResultScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/results/ComposableSingletons$DocResultScreenKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/smartengines/app/ui/results/ComposableSingletons$DocResultScreenKt$lambda-1$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/results/ComposableSingletons$DocResultScreenKt$lambda-1$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/results/ComposableSingletons$DocResultScreenKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/results/ComposableSingletons$DocResultScreenKt$lambda-1$1;->INSTANCE:Lcom/smartengines/app/ui/results/ComposableSingletons$DocResultScreenKt$lambda-1$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 69
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/results/ComposableSingletons$DocResultScreenKt$lambda-1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string v0, "C69@2382L163:DocResultScreen.kt#4ipo3i"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 70
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 75
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 71
    :cond_1
    :goto_0
    invoke-static {}, Lcom/smartengines/app/mock/MockSelectorsKt;->getMockSelectedTreeLeaf()Lcom/smartengines/app/targets/TreeLeaf;

    move-result-object v0

    .line 72
    invoke-static {}, Lcom/smartengines/app/mock/MockDocKt;->getMockDocResult()Lcom/smartengines/engine/doc/DocResultData;

    move-result-object v1

    .line 73
    new-instance v2, Lcom/smartengines/app/settings/CommonSettings;

    const/4 p2, 0x0

    const/4 v3, 0x1

    invoke-direct {v2, p2, v3, p2}, Lcom/smartengines/app/settings/CommonSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v4, v3

    .line 74
    new-instance v3, Lcom/smartengines/app/settings/DocSettings;

    invoke-direct {v3, p2, v4, p2}, Lcom/smartengines/app/settings/DocSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v5, 0x1248

    const/4 v6, 0x0

    move-object v4, p1

    .line 70
    invoke-static/range {v0 .. v6}, Lcom/smartengines/app/ui/results/DocResultScreenKt;->DocResultScreen(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/doc/DocResultData;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/DocSettings;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
