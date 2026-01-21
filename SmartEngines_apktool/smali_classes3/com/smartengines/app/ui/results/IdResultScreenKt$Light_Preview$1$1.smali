.class final Lcom/smartengines/app/ui/results/IdResultScreenKt$Light_Preview$1$1;
.super Ljava/lang/Object;
.source "IdResultScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/results/IdResultScreenKt$Light_Preview$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $data:Lcom/smartengines/engine/id/IdResultData;


# direct methods
.method constructor <init>(Lcom/smartengines/engine/id/IdResultData;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$Light_Preview$1$1;->$data:Lcom/smartengines/engine/id/IdResultData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 334
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/results/IdResultScreenKt$Light_Preview$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "C334@11252L96:IdResultScreen.kt#4ipo3i"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 335
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 336
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 335
    :cond_1
    :goto_0
    invoke-static {}, Lcom/smartengines/app/mock/MockSelectorsKt;->getMockSelectedTreeLeaf()Lcom/smartengines/app/targets/TreeLeaf;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/app/ui/results/IdResultScreenKt$Light_Preview$1$1;->$data:Lcom/smartengines/engine/id/IdResultData;

    .line 336
    new-instance v3, Lcom/smartengines/app/settings/CommonSettings;

    const/4 p2, 0x0

    const/4 v2, 0x1

    invoke-direct {v3, p2, v2, p2}, Lcom/smartengines/app/settings/CommonSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/smartengines/app/settings/IdSettings;

    invoke-direct {v4, p2, v2, p2}, Lcom/smartengines/app/settings/IdSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v7, 0x91c8

    const/16 v8, 0x20

    const/4 v5, 0x0

    move-object v6, p1

    .line 335
    invoke-static/range {v0 .. v8}, Lcom/smartengines/app/ui/results/IdResultScreenKt;->IdResultScreen(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/id/IdResultData;ZLcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/nfc/PassportKey;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
