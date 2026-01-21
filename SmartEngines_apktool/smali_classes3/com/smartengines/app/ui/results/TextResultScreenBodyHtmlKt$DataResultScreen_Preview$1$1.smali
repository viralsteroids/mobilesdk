.class final Lcom/smartengines/app/ui/results/TextResultScreenBodyHtmlKt$DataResultScreen_Preview$1$1;
.super Ljava/lang/Object;
.source "TextResultScreenBodyHtml.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/results/TextResultScreenBodyHtmlKt$DataResultScreen_Preview$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $bitmap:Landroid/graphics/Bitmap;

.field final synthetic $resultData:Lcom/smartengines/engine/text/TextResultData;


# direct methods
.method constructor <init>(Lcom/smartengines/engine/text/TextResultData;Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyHtmlKt$DataResultScreen_Preview$1$1;->$resultData:Lcom/smartengines/engine/text/TextResultData;

    iput-object p2, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyHtmlKt$DataResultScreen_Preview$1$1;->$bitmap:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 57
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/results/TextResultScreenBodyHtmlKt$DataResultScreen_Preview$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 2

    const-string v0, "C57@1865L112:TextResultScreenBodyHtml.kt#4ipo3i"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 58
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 61
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 59
    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyHtmlKt$DataResultScreen_Preview$1$1;->$resultData:Lcom/smartengines/engine/text/TextResultData;

    .line 60
    iget-object v0, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyHtmlKt$DataResultScreen_Preview$1$1;->$bitmap:Landroid/graphics/Bitmap;

    const/16 v1, 0x48

    .line 58
    invoke-static {p2, v0, p1, v1}, Lcom/smartengines/app/ui/results/TextResultScreenBodyHtmlKt;->TextResultScreenBodyHtml(Lcom/smartengines/engine/text/TextResultData;Landroid/graphics/Bitmap;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
