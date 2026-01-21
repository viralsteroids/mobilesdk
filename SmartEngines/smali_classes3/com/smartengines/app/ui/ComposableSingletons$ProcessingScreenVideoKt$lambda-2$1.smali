.class final Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenVideoKt$lambda-2$1;
.super Ljava/lang/Object;
.source "ProcessingScreenVideo.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenVideoKt;
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenVideoKt$lambda-2$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenVideoKt$lambda-2$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenVideoKt$lambda-2$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenVideoKt$lambda-2$1;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenVideoKt$lambda-2$1;

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

    .line 104
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenVideoKt$lambda-2$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "C104@3941L279:ProcessingScreenVideo.kt#83idza"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 105
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 112
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 106
    :cond_1
    :goto_0
    new-instance v0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;

    .line 107
    new-instance p2, Lcom/smartengines/engine/MockTarget;

    invoke-direct {p2}, Lcom/smartengines/engine/MockTarget;-><init>()V

    check-cast p2, Lcom/smartengines/engine/RecognitionTarget;

    const/4 v1, 0x0

    .line 106
    invoke-direct {v0, p2, v1}, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;-><init>(Lcom/smartengines/engine/RecognitionTarget;Ljava/util/Collection;)V

    .line 110
    invoke-static {}, Lcom/smartengines/app/mock/MockSelectorsKt;->getMockSelectedTreeLeaf()Lcom/smartengines/app/targets/TreeLeaf;

    move-result-object v1

    sget-object p2, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenVideoKt;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenVideoKt;

    invoke-virtual {p2}, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenVideoKt;->getLambda-1$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    const/16 v4, 0x1c8

    const/4 v5, 0x0

    move-object v3, p1

    .line 105
    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/ProcessingScreenVideoKt;->ProcessingScreenVideo(Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;Lcom/smartengines/app/targets/TreeLeaf;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
