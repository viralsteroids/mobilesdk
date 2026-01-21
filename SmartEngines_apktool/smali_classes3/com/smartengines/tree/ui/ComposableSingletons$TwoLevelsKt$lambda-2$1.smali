.class final Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-2$1;
.super Ljava/lang/Object;
.source "TwoLevels.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Lcom/smartengines/tree/ui/AppNode;",
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
.field public static final INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-2$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-2$1;

    invoke-direct {v0}, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-2$1;-><init>()V

    sput-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-2$1;->INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-2$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 98
    check-cast p1, Lcom/smartengines/tree/ui/AppNode;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/tree/ui/ComposableSingletons$TwoLevelsKt$lambda-2$1;->invoke(Lcom/smartengines/tree/ui/AppNode;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/smartengines/tree/ui/AppNode;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "C97@3506L11:TwoLevels.kt#snoj4b"

    invoke-static {p2, p3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const/16 p3, 0x8

    .line 98
    invoke-static {p1, p2, p3}, Lcom/smartengines/tree/ui/PreviewKt;->NodeRow(Lcom/smartengines/tree/ui/AppNode;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
