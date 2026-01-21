.class final Lcom/smartengines/app/ui/results/CodeResultScreenKt$CodeResultScreen_Preview$1$1;
.super Ljava/lang/Object;
.source "CodeResultScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/results/CodeResultScreenKt$CodeResultScreen_Preview$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $result:Lcom/smartengines/engine/code/CodeResultData;


# direct methods
.method constructor <init>(Lcom/smartengines/engine/code/CodeResultData;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$CodeResultScreen_Preview$1$1;->$result:Lcom/smartengines/engine/code/CodeResultData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 237
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/results/CodeResultScreenKt$CodeResultScreen_Preview$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "C237@8617L180:CodeResultScreen.kt#4ipo3i"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 238
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 243
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 239
    :cond_1
    :goto_0
    invoke-static {}, Lcom/smartengines/app/mock/MockSelectorsKt;->getMockSelectedTreeLeaf()Lcom/smartengines/app/targets/TreeLeaf;

    move-result-object v0

    .line 240
    iget-object v1, p0, Lcom/smartengines/app/ui/results/CodeResultScreenKt$CodeResultScreen_Preview$1$1;->$result:Lcom/smartengines/engine/code/CodeResultData;

    .line 241
    new-instance v2, Lcom/smartengines/app/settings/CommonSettings;

    const/4 p2, 0x0

    const/4 v3, 0x1

    invoke-direct {v2, p2, v3, p2}, Lcom/smartengines/app/settings/CommonSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v4, v3

    .line 242
    new-instance v3, Lcom/smartengines/app/settings/CodeSettings;

    invoke-direct {v3, p2, v4, p2}, Lcom/smartengines/app/settings/CodeSettings;-><init>(Landroidx/datastore/preferences/core/Preferences;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/smartengines/nfc/PassportKey;

    const-string p2, ""

    invoke-direct {v4, p2, p2, p2}, Lcom/smartengines/nfc/PassportKey;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const p2, 0x8040

    sget v5, Lcom/smartengines/app/targets/TreeLeaf;->$stable:I

    or-int/2addr p2, v5

    sget v5, Lcom/smartengines/app/settings/CommonSettings;->$stable:I

    shl-int/lit8 v5, v5, 0x6

    or-int/2addr p2, v5

    sget v5, Lcom/smartengines/app/settings/CodeSettings;->$stable:I

    shl-int/lit8 v5, v5, 0x9

    or-int v6, p2, v5

    const/4 v7, 0x0

    move-object v5, p1

    .line 238
    invoke-static/range {v0 .. v7}, Lcom/smartengines/app/ui/results/CodeResultScreenKt;->CodeResultScreen(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/code/CodeResultData;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/nfc/PassportKey;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
