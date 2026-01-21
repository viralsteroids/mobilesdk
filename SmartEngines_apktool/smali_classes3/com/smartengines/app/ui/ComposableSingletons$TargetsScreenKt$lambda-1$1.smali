.class final Lcom/smartengines/app/ui/ComposableSingletons$TargetsScreenKt$lambda-1$1;
.super Ljava/lang/Object;
.source "TargetsScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/ComposableSingletons$TargetsScreenKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Lcom/smartengines/app/targets/TreeItem;",
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$TargetsScreenKt$lambda-1$1;


# direct methods
.method public static synthetic $r8$lambda$ubmzpSOJUhdQrwSl9H5UggPeodc(Lcom/smartengines/app/targets/TreeItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/ComposableSingletons$TargetsScreenKt$lambda-1$1;->invoke$lambda$0(Lcom/smartengines/app/targets/TreeItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/ComposableSingletons$TargetsScreenKt$lambda-1$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/ComposableSingletons$TargetsScreenKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/ComposableSingletons$TargetsScreenKt$lambda-1$1;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$TargetsScreenKt$lambda-1$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0(Lcom/smartengines/app/targets/TreeItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$node"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    sget-object v0, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v0, p0}, Lcom/smartengines/app/Model;->onNodeClick(Lcom/smartengines/app/targets/TreeItem;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 119
    check-cast p1, Lcom/smartengines/app/targets/TreeItem;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/ComposableSingletons$TargetsScreenKt$lambda-1$1;->invoke(Lcom/smartengines/app/targets/TreeItem;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/smartengines/app/targets/TreeItem;Landroidx/compose/runtime/Composer;I)V
    .locals 2

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "C119@4631L142:TargetsScreen.kt#83idza"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0xe

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x5b

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    .line 120
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 123
    :cond_2
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 120
    :cond_3
    :goto_1
    new-instance v0, Lcom/smartengines/app/ui/ComposableSingletons$TargetsScreenKt$lambda-1$1$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/smartengines/app/ui/ComposableSingletons$TargetsScreenKt$lambda-1$1$$ExternalSyntheticLambda0;-><init>(Lcom/smartengines/app/targets/TreeItem;)V

    and-int/lit8 p3, p3, 0xe

    invoke-static {p1, v0, p2, p3}, Lcom/smartengines/app/ui/TargetsScreenKt;->access$ItemView(Lcom/smartengines/app/targets/TreeItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
