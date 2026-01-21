.class final Lcom/smartengines/tree/ui/ComposableSingletons$OneLevelKt$lambda-5$1;
.super Ljava/lang/Object;
.source "OneLevel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/tree/ui/ComposableSingletons$OneLevelKt;
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


# static fields
.field public static final INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$OneLevelKt$lambda-5$1;


# direct methods
.method public static synthetic $r8$lambda$yfQRKWDL_AfZW33VD-0FQ5hUZlg(Lcom/smartengines/tree/ui/AppNode;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/tree/ui/ComposableSingletons$OneLevelKt$lambda-5$1;->invoke$lambda$0(Lcom/smartengines/tree/ui/AppNode;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/tree/ui/ComposableSingletons$OneLevelKt$lambda-5$1;

    invoke-direct {v0}, Lcom/smartengines/tree/ui/ComposableSingletons$OneLevelKt$lambda-5$1;-><init>()V

    sput-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$OneLevelKt$lambda-5$1;->INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$OneLevelKt$lambda-5$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0(Lcom/smartengines/tree/ui/AppNode;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 98
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/tree/ui/ComposableSingletons$OneLevelKt$lambda-5$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "C98@2887L142:OneLevel.kt#snoj4b"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 99
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 102
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 99
    :cond_1
    :goto_0
    invoke-static {}, Lcom/smartengines/tree/ui/PreviewKt;->getPreviewData()Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/smartengines/tree/ui/ComposableSingletons$OneLevelKt$lambda-5$1$$ExternalSyntheticLambda0;

    invoke-direct {v2}, Lcom/smartengines/tree/ui/ComposableSingletons$OneLevelKt$lambda-5$1$$ExternalSyntheticLambda0;-><init>()V

    sget-object p2, Lcom/smartengines/tree/ui/ComposableSingletons$OneLevelKt;->INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$OneLevelKt;

    invoke-virtual {p2}, Lcom/smartengines/tree/ui/ComposableSingletons$OneLevelKt;->getLambda-4$tree_release()Lkotlin/jvm/functions/Function3;

    move-result-object v3

    const/16 v5, 0xdc6

    const/4 v0, 0x3

    move-object v4, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/tree/ui/OneLevelKt;->OneLevelIcons(ILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
