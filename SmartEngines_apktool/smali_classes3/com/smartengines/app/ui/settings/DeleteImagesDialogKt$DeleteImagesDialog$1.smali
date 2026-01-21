.class final Lcom/smartengines/app/ui/settings/DeleteImagesDialogKt$DeleteImagesDialog$1;
.super Ljava/lang/Object;
.source "DeleteImagesDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/DeleteImagesDialogKt;->DeleteImagesDialog(Lcom/smartengines/app/ImageSaver$Dir;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nDeleteImagesDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteImagesDialog.kt\ncom/smartengines/app/ui/settings/DeleteImagesDialogKt$DeleteImagesDialog$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,87:1\n149#2:88\n149#2:89\n*S KotlinDebug\n*F\n+ 1 DeleteImagesDialog.kt\ncom/smartengines/app/ui/settings/DeleteImagesDialogKt$DeleteImagesDialog$1\n*L\n37#1:88\n38#1:89\n*E\n"
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
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $dir:Lcom/smartengines/app/ImageSaver$Dir;

.field final synthetic $images:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/smartengines/utils/MediaStoreWrapper$FileData;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onDispose:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;Landroid/content/Context;Lcom/smartengines/app/ImageSaver$Dir;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/smartengines/utils/MediaStoreWrapper$FileData;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/smartengines/app/ImageSaver$Dir;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/DeleteImagesDialogKt$DeleteImagesDialog$1;->$images:Ljava/util/List;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/DeleteImagesDialogKt$DeleteImagesDialog$1;->$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/DeleteImagesDialogKt$DeleteImagesDialog$1;->$dir:Lcom/smartengines/app/ImageSaver$Dir;

    iput-object p4, p0, Lcom/smartengines/app/ui/settings/DeleteImagesDialogKt$DeleteImagesDialog$1;->$onDispose:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 33
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/settings/DeleteImagesDialogKt$DeleteImagesDialog$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const-string v0, "C38@1481L1274,33@1320L1435:DeleteImagesDialog.kt#v86m6v"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 34
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 73
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 35
    :cond_1
    :goto_0
    sget-object p2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p2, Landroidx/compose/ui/Modifier;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 36
    invoke-static {p2, v0, v2, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    const/16 v0, 0x10

    int-to-float v0, v0

    .line 88
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 37
    invoke-static {p2, v1}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 89
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p2

    .line 38
    invoke-static {p2}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Landroidx/compose/ui/graphics/Shape;

    .line 39
    new-instance p2, Lcom/smartengines/app/ui/settings/DeleteImagesDialogKt$DeleteImagesDialog$1$1;

    iget-object v0, p0, Lcom/smartengines/app/ui/settings/DeleteImagesDialogKt$DeleteImagesDialog$1;->$images:Ljava/util/List;

    iget-object v1, p0, Lcom/smartengines/app/ui/settings/DeleteImagesDialogKt$DeleteImagesDialog$1;->$context:Landroid/content/Context;

    iget-object v5, p0, Lcom/smartengines/app/ui/settings/DeleteImagesDialogKt$DeleteImagesDialog$1;->$dir:Lcom/smartengines/app/ImageSaver$Dir;

    iget-object v6, p0, Lcom/smartengines/app/ui/settings/DeleteImagesDialogKt$DeleteImagesDialog$1;->$onDispose:Lkotlin/jvm/functions/Function0;

    invoke-direct {p2, v0, v1, v5, v6}, Lcom/smartengines/app/ui/settings/DeleteImagesDialogKt$DeleteImagesDialog$1$1;-><init>(Ljava/util/List;Landroid/content/Context;Lcom/smartengines/app/ImageSaver$Dir;Lkotlin/jvm/functions/Function0;)V

    const/16 v0, 0x36

    const v1, -0x1ffe2111

    invoke-static {v1, v2, p2, p1, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p2

    move-object v8, p2

    check-cast v8, Lkotlin/jvm/functions/Function3;

    const v10, 0x30006

    const/16 v11, 0x1c

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v9, p1

    .line 34
    invoke-static/range {v3 .. v11}, Landroidx/compose/material3/CardKt;->Card(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
