.class public final Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt;
.super Ljava/lang/Object;
.source "MultiLevel.kt"


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
.field public static final INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt;

.field public static lambda-1:Lkotlin/jvm/functions/Function3;
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

.field public static lambda-2:Lkotlin/jvm/functions/Function2;
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

    new-instance v0, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt;

    invoke-direct {v0}, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt;-><init>()V

    sput-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt;->INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt;

    .line 122
    sget-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-1$1;->INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-1$1;

    const v1, 0x4251e1f1

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function3;

    sput-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt;->lambda-1:Lkotlin/jvm/functions/Function3;

    const v0, 0x22d2fafb

    .line 114
    sget-object v1, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1;->INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1;

    invoke-static {v0, v2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sput-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt;->lambda-2:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLambda-1$tree_release()Lkotlin/jvm/functions/Function3;
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

    sget-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt;->lambda-1:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final getLambda-2$tree_release()Lkotlin/jvm/functions/Function2;
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

    sget-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt;->lambda-2:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method
