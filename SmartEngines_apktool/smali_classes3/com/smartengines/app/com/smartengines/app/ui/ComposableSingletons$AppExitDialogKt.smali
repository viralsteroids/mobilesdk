.class public final Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt;
.super Ljava/lang/Object;
.source "AppExitDialog.kt"


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
.field public static final INSTANCE:Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt;

.field public static lambda-1:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/RowScope;",
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
            "Landroidx/compose/foundation/layout/RowScope;",
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

    new-instance v0, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt;

    invoke-direct {v0}, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt;-><init>()V

    sput-object v0, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt;->INSTANCE:Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt;

    .line 47
    sget-object v0, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt$lambda-1$1;->INSTANCE:Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt$lambda-1$1;

    const v1, -0x46e2721b

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function3;

    sput-object v0, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt;->lambda-1:Lkotlin/jvm/functions/Function3;

    const v0, -0x470b87f2

    .line 54
    sget-object v1, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt$lambda-2$1;->INSTANCE:Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt$lambda-2$1;

    invoke-static {v0, v2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function3;

    sput-object v0, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt;->lambda-2:Lkotlin/jvm/functions/Function3;

    const v0, -0x40d054c3

    .line 69
    sget-object v1, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt$lambda-3$1;->INSTANCE:Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt$lambda-3$1;

    invoke-static {v0, v2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sput-object v0, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt;->lambda-3:Lkotlin/jvm/functions/Function2;

    const v0, -0x4230011e

    .line 68
    sget-object v1, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt$lambda-4$1;->INSTANCE:Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt$lambda-4$1;

    invoke-static {v0, v2, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sput-object v0, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt;->lambda-4:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLambda-1$app_storeRelease()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt;->lambda-1:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final getLambda-2$app_storeRelease()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt;->lambda-2:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final getLambda-3$app_storeRelease()Lkotlin/jvm/functions/Function2;
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

    sget-object v0, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt;->lambda-3:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public final getLambda-4$app_storeRelease()Lkotlin/jvm/functions/Function2;
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

    sget-object v0, Lcom/smartengines/app/com/smartengines/app/ui/ComposableSingletons$AppExitDialogKt;->lambda-4:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method
