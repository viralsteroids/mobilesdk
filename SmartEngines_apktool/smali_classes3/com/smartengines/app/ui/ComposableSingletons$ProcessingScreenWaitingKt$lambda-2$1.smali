.class final Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenWaitingKt$lambda-2$1;
.super Ljava/lang/Object;
.source "ProcessingScreenWaiting.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenWaitingKt;
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenWaitingKt$lambda-2$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenWaitingKt$lambda-2$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenWaitingKt$lambda-2$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenWaitingKt$lambda-2$1;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenWaitingKt$lambda-2$1;

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

    .line 163
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenWaitingKt$lambda-2$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "C163@6408L12,164@6433L199:ProcessingScreenWaiting.kt#83idza"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 164
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 170
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_1
    :goto_0
    const/4 p2, 0x0

    .line 164
    invoke-static {p1, p2}, Lcom/smartengines/app/mock/MockComposesKt;->MockCamera(Landroidx/compose/runtime/Composer;I)V

    .line 166
    invoke-static {}, Lcom/smartengines/app/mock/MockSelectorsKt;->getMockSelectedTreeLeaf()Lcom/smartengines/app/targets/TreeLeaf;

    move-result-object v0

    .line 167
    sget-object p2, Lcom/smartengines/app/PhotoTakingState$Inactive;->INSTANCE:Lcom/smartengines/app/PhotoTakingState$Inactive;

    move-object v1, p2

    check-cast v1, Lcom/smartengines/app/PhotoTakingState;

    .line 168
    new-instance v2, Lcom/smartengines/app/CameraButtonsState;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/smartengines/app/CameraButtonsState;-><init>(ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p2, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenWaitingKt;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenWaitingKt;

    invoke-virtual {p2}, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenWaitingKt;->getLambda-1$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    const/16 v5, 0xc38

    move-object v4, p1

    .line 165
    invoke-static/range {v0 .. v6}, Lcom/smartengines/app/ui/ProcessingScreenWaitingKt;->ProcessingScreenWaiting(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/PhotoTakingState;Lcom/smartengines/app/CameraButtonsState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
