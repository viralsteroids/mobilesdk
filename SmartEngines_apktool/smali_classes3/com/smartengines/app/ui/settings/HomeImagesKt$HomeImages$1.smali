.class final Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;
.super Ljava/lang/Object;
.source "HomeImages.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/HomeImagesKt;->HomeImages(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHomeImages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeImages.kt\ncom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,66:1\n1225#2,6:67\n1225#2,6:73\n*S KotlinDebug\n*F\n+ 1 HomeImages.kt\ncom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1\n*L\n40#1:67,6\n43#1:73,6\n*E\n"
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
.field final synthetic $colors:Landroidx/compose/material3/ButtonColors;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $dirToRemove:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/smartengines/app/ImageSaver$Dir;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;


# direct methods
.method public static synthetic $r8$lambda$LwliyPoXrnAotMBEDdFKpghbhxs(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->invoke$lambda$3$lambda$2(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$UgR5_-sY-NoV_NG3R_M06pqoYKU(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->invoke$lambda$1$lambda$0(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/ButtonColors;Landroidx/compose/runtime/MutableState;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/material3/ButtonColors;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/smartengines/app/ImageSaver$Dir;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->$modifier:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->$colors:Landroidx/compose/material3/ButtonColors;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->$dirToRemove:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$dirToRemove"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    sget-object v0, Lcom/smartengines/app/ImageSaver$Dir;->Photo:Lcom/smartengines/app/ImageSaver$Dir;

    invoke-interface {p0, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$3$lambda$2(Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$dirToRemove"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    sget-object v0, Lcom/smartengines/app/ImageSaver$Dir;->Video:Lcom/smartengines/app/ImageSaver$Dir;

    invoke-interface {p0, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 39
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v11, p2

    const-string v1, "$this$Section"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "C39@1643L42,39@1714L79,39@1636L157,42@1809L42,42@1880L79,42@1802L157:HomeImages.kt#v86m6v"

    invoke-static {v11, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x51

    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    .line 40
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 45
    :cond_0
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_1
    :goto_0
    const v1, 0x7e4833d7

    .line 40
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v14, "CC(remember):HomeImages.kt#9igjgp"

    invoke-static {v11, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->$dirToRemove:Landroidx/compose/runtime/MutableState;

    .line 67
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 68
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_2

    .line 40
    new-instance v2, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1}, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 70
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 40
    :cond_2
    move-object v1, v2

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    iget-object v2, v0, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v5, v0, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->$colors:Landroidx/compose/material3/ButtonColors;

    new-instance v3, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1$2;

    iget-object v4, v0, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->$context:Landroid/content/Context;

    invoke-direct {v3, v4}, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1$2;-><init>(Landroid/content/Context;)V

    const v4, -0x3778aef8    # -277128.25f

    const/4 v15, 0x1

    const/16 v6, 0x36

    invoke-static {v4, v15, v3, v11, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Lkotlin/jvm/functions/Function3;

    const v12, 0x30000036

    const/16 v13, 0x1ec

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move/from16 v16, v9

    const/4 v9, 0x0

    invoke-static/range {v1 .. v13}, Landroidx/compose/material3/ButtonKt;->Button(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const v1, 0x7e484897

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v11, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 43
    iget-object v1, v0, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->$dirToRemove:Landroidx/compose/runtime/MutableState;

    .line 73
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 74
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_3

    .line 43
    new-instance v2, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1$$ExternalSyntheticLambda1;

    invoke-direct {v2, v1}, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1$$ExternalSyntheticLambda1;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 76
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 43
    :cond_3
    move-object v1, v2

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    iget-object v2, v0, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->$modifier:Landroidx/compose/ui/Modifier;

    iget-object v5, v0, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->$colors:Landroidx/compose/material3/ButtonColors;

    new-instance v3, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1$4;

    iget-object v4, v0, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1;->$context:Landroid/content/Context;

    invoke-direct {v3, v4}, Lcom/smartengines/app/ui/settings/HomeImagesKt$HomeImages$1$4;-><init>(Landroid/content/Context;)V

    const v4, 0x3c2462bf

    const/16 v7, 0x36

    invoke-static {v4, v15, v3, v11, v7}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Lkotlin/jvm/functions/Function3;

    const v12, 0x30000036

    const/16 v13, 0x1ec

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v13}, Landroidx/compose/material3/ButtonKt;->Button(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
