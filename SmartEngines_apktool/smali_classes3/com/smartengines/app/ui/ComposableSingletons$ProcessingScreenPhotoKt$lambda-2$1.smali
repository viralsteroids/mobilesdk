.class final Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenPhotoKt$lambda-2$1;
.super Ljava/lang/Object;
.source "ProcessingScreenPhoto.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenPhotoKt;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nProcessingScreenPhoto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessingScreenPhoto.kt\ncom/smartengines/app/ui/ComposableSingletons$ProcessingScreenPhotoKt$lambda-2$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,84:1\n77#2:85\n1225#3,6:86\n*S KotlinDebug\n*F\n+ 1 ProcessingScreenPhoto.kt\ncom/smartengines/app/ui/ComposableSingletons$ProcessingScreenPhotoKt$lambda-2$1\n*L\n70#1:85\n71#1:86,6\n*E\n"
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenPhotoKt$lambda-2$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenPhotoKt$lambda-2$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenPhotoKt$lambda-2$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenPhotoKt$lambda-2$1;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenPhotoKt$lambda-2$1;

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

    .line 69
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenPhotoKt$lambda-2$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "C69@2497L7,70@2529L103,74@2646L227:ProcessingScreenPhoto.kt#83idza"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 70
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 80
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 70
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object p2

    check-cast p2, Landroidx/compose/runtime/CompositionLocal;

    const v0, 0x789c5f52

    const-string v1, "CC:CompositionLocal.kt#9igjgp"

    .line 85
    invoke-static {p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 70
    check-cast p2, Landroid/content/Context;

    const v0, -0x6422f1e1

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "CC(remember):ProcessingScreenPhoto.kt#9igjgp"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 86
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 87
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 72
    new-instance v0, Lcom/smartengines/app/Photo;

    const-string v1, "sample_camera.png"

    invoke-static {p2, v1}, Lcom/smartengines/utils/UtilsKt;->loadBitmapFromAssetFile(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/smartengines/app/Photo;-><init>(Landroid/graphics/Bitmap;)V

    .line 89
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 71
    :cond_2
    move-object v1, v0

    check-cast v1, Lcom/smartengines/app/Photo;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 77
    invoke-static {}, Lcom/smartengines/visualization/MockKt;->getMockVisualizations()Ljava/util/Collection;

    move-result-object v2

    .line 78
    invoke-static {}, Lcom/smartengines/app/mock/MockSelectorsKt;->getMockSelectedTreeLeaf()Lcom/smartengines/app/targets/TreeLeaf;

    move-result-object v3

    sget-object p2, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenPhotoKt;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenPhotoKt;

    invoke-virtual {p2}, Lcom/smartengines/app/ui/ComposableSingletons$ProcessingScreenPhotoKt;->getLambda-1$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    const/16 v6, 0xe48

    const/4 v7, 0x0

    move-object v5, p1

    .line 75
    invoke-static/range {v1 .. v7}, Lcom/smartengines/app/ui/ProcessingScreenPhotoKt;->ProcessingScreenPhoto(Lcom/smartengines/app/Photo;Ljava/util/Collection;Lcom/smartengines/app/targets/TreeLeaf;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
