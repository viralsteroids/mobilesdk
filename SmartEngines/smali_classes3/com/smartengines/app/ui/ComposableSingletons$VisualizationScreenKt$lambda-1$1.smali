.class final Lcom/smartengines/app/ui/ComposableSingletons$VisualizationScreenKt$lambda-1$1;
.super Ljava/lang/Object;
.source "VisualizationScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/ComposableSingletons$VisualizationScreenKt;
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$VisualizationScreenKt$lambda-1$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/ComposableSingletons$VisualizationScreenKt$lambda-1$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/ComposableSingletons$VisualizationScreenKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/ComposableSingletons$VisualizationScreenKt$lambda-1$1;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$VisualizationScreenKt$lambda-1$1;

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

    .line 109
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/ComposableSingletons$VisualizationScreenKt$lambda-1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "C109@3738L120:VisualizationScreen.kt#83idza"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 110
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 113
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 111
    :cond_1
    :goto_0
    invoke-static {}, Lcom/smartengines/visualization/MockKt;->getMockVisualizations()Ljava/util/Collection;

    move-result-object v0

    const/16 v4, 0x38

    const/4 v5, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    move-object v3, p1

    .line 110
    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/VisualizationScreenKt;->VisualizationScreen(Ljava/util/Collection;ZLcom/smartengines/app/settings/VisualizationSettings;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
