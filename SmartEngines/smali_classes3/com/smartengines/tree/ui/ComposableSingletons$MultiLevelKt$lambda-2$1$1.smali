.class final Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1$1;
.super Ljava/lang/Object;
.source "MultiLevel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1;->invoke(Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $model:Lcom/smartengines/tree/ui/MultiLevelTreeModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/smartengines/tree/ui/MultiLevelTreeModel<",
            "Lcom/smartengines/tree/ui/AppNode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$57nL7Y3VACKLaLpGwusc7LdZUiQ(Lcom/smartengines/tree/ui/AppNode;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1$1;->invoke$lambda$0(Lcom/smartengines/tree/ui/AppNode;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/smartengines/tree/ui/MultiLevelTreeModel;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/tree/ui/MultiLevelTreeModel<",
            "Lcom/smartengines/tree/ui/AppNode;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1$1;->$model:Lcom/smartengines/tree/ui/MultiLevelTreeModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0(Lcom/smartengines/tree/ui/AppNode;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 118
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "C118@4081L157:MultiLevel.kt#snoj4b"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 119
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 124
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 120
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1$1;->$model:Lcom/smartengines/tree/ui/MultiLevelTreeModel;

    new-instance v1, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1$1$$ExternalSyntheticLambda0;-><init>()V

    .line 121
    new-instance v2, Lcom/smartengines/tree/ui/TreeViewOptions;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/smartengines/tree/ui/TreeViewOptions;-><init>(ILjava/lang/Integer;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p2, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt;->INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt;

    invoke-virtual {p2}, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt;->getLambda-1$tree_release()Lkotlin/jvm/functions/Function3;

    move-result-object v3

    const/16 v5, 0xc38

    move-object v4, p1

    .line 119
    invoke-static/range {v0 .. v5}, Lcom/smartengines/tree/ui/MultiLevelKt;->MultiLevelTreeView(Lcom/smartengines/tree/ui/MultiLevelTreeModel;Lkotlin/jvm/functions/Function1;Lcom/smartengines/tree/ui/TreeViewOptions;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
