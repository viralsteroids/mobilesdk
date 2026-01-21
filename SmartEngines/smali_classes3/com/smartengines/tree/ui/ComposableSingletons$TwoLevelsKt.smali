.class public final Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;
.super Ljava/lang/Object;
.source "TwoLevels.kt"


# annotations
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
.field public static final INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;

.field public static lambda-1:Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "Lcom/smartengines/tree/ui/AppNode;",
            "Ljava/lang/Boolean;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public static lambda-2:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Lcom/smartengines/tree/ui/AppNode;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public static lambda-3:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public static lambda-4:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;

    invoke-direct {v0}, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;-><init>()V

    sput-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;->INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;

    .line 97
    sget-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-1$1;->INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-1$1;

    const v1, -0x73463894

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function4;

    sput-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;->lambda-1:Lkotlin/jvm/functions/Function4;

    const v0, 0x1af2b389

    .line 98
    sget-object v1, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-2$1;->INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-2$1;

    invoke-static {v0, v2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function3;

    sput-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;->lambda-2:Lkotlin/jvm/functions/Function3;

    const v0, 0x86271ad

    .line 95
    sget-object v1, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-3$1;->INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-3$1;

    invoke-static {v0, v2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sput-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;->lambda-3:Lkotlin/jvm/functions/Function2;

    const v0, 0x750413a8

    .line 94
    sget-object v1, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-4$1;->INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-4$1;

    invoke-static {v0, v2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sput-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;->lambda-4:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLambda-1$tree_release()Lkotlin/jvm/functions/Function4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function4<",
            "Lcom/smartengines/tree/ui/AppNode;",
            "Ljava/lang/Boolean;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;->lambda-1:Lkotlin/jvm/functions/Function4;

    return-object v0
.end method

.method public final getLambda-2$tree_release()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Lcom/smartengines/tree/ui/AppNode;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;->lambda-2:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final getLambda-3$tree_release()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;->lambda-3:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public final getLambda-4$tree_release()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;->lambda-4:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method
