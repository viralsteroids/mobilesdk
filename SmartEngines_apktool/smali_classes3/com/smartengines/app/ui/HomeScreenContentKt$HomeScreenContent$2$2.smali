.class final Lcom/smartengines/app/ui/HomeScreenContentKt$HomeScreenContent$2$2;
.super Ljava/lang/Object;
.source "HomeScreenContent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/HomeScreenContentKt;->HomeScreenContent(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Lcom/smartengines/app/targets/TreeItem;",
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
.field final synthetic $cardWidth:F


# direct methods
.method constructor <init>(F)V
    .locals 0

    iput p1, p0, Lcom/smartengines/app/ui/HomeScreenContentKt$HomeScreenContent$2$2;->$cardWidth:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 82
    check-cast p1, Lcom/smartengines/app/targets/TreeItem;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/HomeScreenContentKt$HomeScreenContent$2$2;->invoke(Lcom/smartengines/app/targets/TreeItem;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/smartengines/app/targets/TreeItem;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "C83@3677L132:HomeScreenContent.kt#83idza"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0xe

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 p3, p3, 0x5b

    const/16 v0, 0x12

    if-ne p3, v0, :cond_3

    .line 84
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_1

    .line 88
    :cond_2
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 85
    :cond_3
    :goto_1
    invoke-interface {p1}, Lcom/smartengines/app/targets/TreeItem;->getName()Lcom/smartengines/utils/Name;

    move-result-object p3

    invoke-virtual {p3}, Lcom/smartengines/utils/Name;->toString()Ljava/lang/String;

    move-result-object v0

    .line 86
    invoke-interface {p1}, Lcom/smartengines/app/targets/TreeItem;->getIcon()Ljava/lang/Integer;

    move-result-object v1

    .line 87
    iget v2, p0, Lcom/smartengines/app/ui/HomeScreenContentKt$HomeScreenContent$2$2;->$cardWidth:F

    const/16 v5, 0x180

    const/16 v6, 0x8

    const/4 v3, 0x0

    move-object v4, p2

    .line 84
    invoke-static/range {v0 .. v6}, Lcom/smartengines/app/ui/HomeCardKt;->HomeCard-942rkJo(Ljava/lang/String;Ljava/lang/Integer;FLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
