.class final Lcom/smartengines/app/ui/PhotoDialogKt$PhotoDialog$1;
.super Ljava/lang/Object;
.source "PhotoDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/PhotoDialogKt;->PhotoDialog(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $onCancel:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onPhotoTaken:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/smartengines/app/Photo;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/smartengines/app/Photo;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/PhotoDialogKt$PhotoDialog$1;->$onCancel:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/smartengines/app/ui/PhotoDialogKt$PhotoDialog$1;->$onPhotoTaken:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 43
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/PhotoDialogKt$PhotoDialog$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "C43@1613L134:PhotoDialog.kt#83idza"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 44
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 46
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 44
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/smartengines/app/ui/PhotoDialogKt$PhotoDialog$1;->$onCancel:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lcom/smartengines/app/ui/PhotoDialogKt$PhotoDialog$1;->$onPhotoTaken:Lkotlin/jvm/functions/Function1;

    sget-object p2, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p2}, Lcom/smartengines/app/Model;->getPhotoTaking()Lcom/smartengines/app/PhotoTakingState;

    move-result-object v2

    sget-object p2, Lcom/smartengines/app/ui/ComposableSingletons$PhotoDialogKt;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$PhotoDialogKt;

    invoke-virtual {p2}, Lcom/smartengines/app/ui/ComposableSingletons$PhotoDialogKt;->getLambda-1$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    const/16 v5, 0xc00

    move-object v4, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/PhotoDialogKt;->access$PhotoDialogContent(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/PhotoTakingState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
