.class final Lcom/smartengines/app/ui/settings/ComposableSingletons$DeleteImagesDialogKt$lambda-3$1;
.super Ljava/lang/Object;
.source "DeleteImagesDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/settings/ComposableSingletons$DeleteImagesDialogKt;
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$DeleteImagesDialogKt$lambda-3$1;


# direct methods
.method public static synthetic $r8$lambda$qrvy8wymHmUUecllV5RzdhHNGTM()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/settings/ComposableSingletons$DeleteImagesDialogKt$lambda-3$1;->invoke$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$DeleteImagesDialogKt$lambda-3$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$DeleteImagesDialogKt$lambda-3$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$DeleteImagesDialogKt$lambda-3$1;->INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$DeleteImagesDialogKt$lambda-3$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 84
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 83
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/ComposableSingletons$DeleteImagesDialogKt$lambda-3$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 1

    const-string v0, "$this$SettingsScaffold"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C83@3080L44:DeleteImagesDialog.kt#v86m6v"

    invoke-static {p2, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    .line 84
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_1
    :goto_0
    sget-object p1, Lcom/smartengines/app/ImageSaver$Dir;->Photo:Lcom/smartengines/app/ImageSaver$Dir;

    new-instance p3, Lcom/smartengines/app/ui/settings/ComposableSingletons$DeleteImagesDialogKt$lambda-3$1$$ExternalSyntheticLambda0;

    invoke-direct {p3}, Lcom/smartengines/app/ui/settings/ComposableSingletons$DeleteImagesDialogKt$lambda-3$1$$ExternalSyntheticLambda0;-><init>()V

    const/16 v0, 0x36

    invoke-static {p1, p3, p2, v0}, Lcom/smartengines/app/ui/settings/DeleteImagesDialogKt;->DeleteImagesDialog(Lcom/smartengines/app/ImageSaver$Dir;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
