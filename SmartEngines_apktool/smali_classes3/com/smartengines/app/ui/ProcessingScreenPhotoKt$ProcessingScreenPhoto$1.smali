.class final Lcom/smartengines/app/ui/ProcessingScreenPhotoKt$ProcessingScreenPhoto$1;
.super Ljava/lang/Object;
.source "ProcessingScreenPhoto.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/ProcessingScreenPhotoKt;->ProcessingScreenPhoto(Lcom/smartengines/app/Photo;Ljava/util/Collection;Lcom/smartengines/app/targets/TreeLeaf;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
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


# instance fields
.field final synthetic $selectedTreeLeaf:Lcom/smartengines/app/targets/TreeLeaf;


# direct methods
.method constructor <init>(Lcom/smartengines/app/targets/TreeLeaf;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/app/ui/ProcessingScreenPhotoKt$ProcessingScreenPhoto$1;->$selectedTreeLeaf:Lcom/smartengines/app/targets/TreeLeaf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 30
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/ProcessingScreenPhotoKt$ProcessingScreenPhoto$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 2

    const-string v0, "C29@1184L40:ProcessingScreenPhoto.kt#83idza"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 30
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/smartengines/app/ui/ProcessingScreenPhotoKt$ProcessingScreenPhoto$1;->$selectedTreeLeaf:Lcom/smartengines/app/targets/TreeLeaf;

    const/16 v0, 0x38

    const/4 v1, 0x0

    invoke-static {p2, v1, p1, v0, v1}, Lcom/smartengines/app/ui/ProcessingTitleKt;->ProcessingTitle(Lcom/smartengines/app/targets/TreeLeaf;ZLandroidx/compose/runtime/Composer;II)V

    return-void
.end method
