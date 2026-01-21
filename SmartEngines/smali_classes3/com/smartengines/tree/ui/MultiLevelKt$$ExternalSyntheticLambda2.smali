.class public final synthetic Lcom/smartengines/tree/ui/MultiLevelKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/tree/ui/MultiLevelTreeModel;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$2:Lcom/smartengines/tree/ui/TreeViewOptions;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function3;


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/tree/ui/MultiLevelTreeModel;Lkotlin/jvm/functions/Function1;Lcom/smartengines/tree/ui/TreeViewOptions;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/tree/ui/MultiLevelKt$$ExternalSyntheticLambda2;->f$0:Lcom/smartengines/tree/ui/MultiLevelTreeModel;

    iput-object p2, p0, Lcom/smartengines/tree/ui/MultiLevelKt$$ExternalSyntheticLambda2;->f$1:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/smartengines/tree/ui/MultiLevelKt$$ExternalSyntheticLambda2;->f$2:Lcom/smartengines/tree/ui/TreeViewOptions;

    iput-object p4, p0, Lcom/smartengines/tree/ui/MultiLevelKt$$ExternalSyntheticLambda2;->f$3:Lkotlin/jvm/functions/Function3;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/smartengines/tree/ui/MultiLevelKt$$ExternalSyntheticLambda2;->f$0:Lcom/smartengines/tree/ui/MultiLevelTreeModel;

    iget-object v1, p0, Lcom/smartengines/tree/ui/MultiLevelKt$$ExternalSyntheticLambda2;->f$1:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/smartengines/tree/ui/MultiLevelKt$$ExternalSyntheticLambda2;->f$2:Lcom/smartengines/tree/ui/TreeViewOptions;

    iget-object v3, p0, Lcom/smartengines/tree/ui/MultiLevelKt$$ExternalSyntheticLambda2;->f$3:Lkotlin/jvm/functions/Function3;

    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/smartengines/tree/ui/MultiLevelKt;->$r8$lambda$MZQhfQjHlr8D7CmXbDD3INOR4mo(Lcom/smartengines/tree/ui/MultiLevelTreeModel;Lkotlin/jvm/functions/Function1;Lcom/smartengines/tree/ui/TreeViewOptions;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/lazy/LazyListScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
