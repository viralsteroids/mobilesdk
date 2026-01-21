.class public final synthetic Lcom/smartengines/app/ui/TutorialKt$Tutorial$1$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic f$1:Landroidx/compose/foundation/pager/PagerState;

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/pager/PagerState;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/TutorialKt$Tutorial$1$$ExternalSyntheticLambda2;->f$0:Lkotlinx/coroutines/CoroutineScope;

    iput-object p2, p0, Lcom/smartengines/app/ui/TutorialKt$Tutorial$1$$ExternalSyntheticLambda2;->f$1:Landroidx/compose/foundation/pager/PagerState;

    iput p3, p0, Lcom/smartengines/app/ui/TutorialKt$Tutorial$1$$ExternalSyntheticLambda2;->f$2:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/TutorialKt$Tutorial$1$$ExternalSyntheticLambda2;->f$0:Lkotlinx/coroutines/CoroutineScope;

    iget-object v1, p0, Lcom/smartengines/app/ui/TutorialKt$Tutorial$1$$ExternalSyntheticLambda2;->f$1:Landroidx/compose/foundation/pager/PagerState;

    iget v2, p0, Lcom/smartengines/app/ui/TutorialKt$Tutorial$1$$ExternalSyntheticLambda2;->f$2:I

    invoke-static {v0, v1, v2}, Lcom/smartengines/app/ui/TutorialKt$Tutorial$1;->$r8$lambda$0WVCguZTnlGA30mE0O43MfWwmJE(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/pager/PagerState;I)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
