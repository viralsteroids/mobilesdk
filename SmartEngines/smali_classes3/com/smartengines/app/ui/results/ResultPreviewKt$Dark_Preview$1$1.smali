.class final Lcom/smartengines/app/ui/results/ResultPreviewKt$Dark_Preview$1$1;
.super Ljava/lang/Object;
.source "ResultPreview.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/results/ResultPreviewKt$Dark_Preview$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $photo:Landroid/graphics/Bitmap;


# direct methods
.method public static synthetic $r8$lambda$fggGnN7ZPAWf6rRiL9G-3wL5yIE()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/results/ResultPreviewKt$Dark_Preview$1$1;->invoke$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/app/ui/results/ResultPreviewKt$Dark_Preview$1$1;->$photo:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 89
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 86
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/results/ResultPreviewKt$Dark_Preview$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "C86@3069L128:ResultPreview.kt#4ipo3i"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 87
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 90
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 88
    :cond_1
    :goto_0
    new-instance v0, Lcom/smartengines/engine/ImageProcessingState$FINISHED;

    sget-object p2, Lcom/smartengines/engine/SessionType;->PHOTO_SESSION:Lcom/smartengines/engine/SessionType;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/ResultPreviewKt$Dark_Preview$1$1;->$photo:Landroid/graphics/Bitmap;

    invoke-direct {v0, p2, v1}, Lcom/smartengines/engine/ImageProcessingState$FINISHED;-><init>(Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;)V

    new-instance v1, Lcom/smartengines/app/ui/results/ResultPreviewKt$Dark_Preview$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/smartengines/app/ui/results/ResultPreviewKt$Dark_Preview$1$1$$ExternalSyntheticLambda0;-><init>()V

    const/16 v4, 0x38

    const/4 v5, 0x4

    const/4 v2, 0x0

    move-object v3, p1

    .line 87
    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/results/ResultPreviewKt;->ResultPreview(Lcom/smartengines/engine/ImageProcessingState$FINISHED;Lkotlin/jvm/functions/Function0;Lcom/smartengines/app/settings/VisualizationSettings;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
