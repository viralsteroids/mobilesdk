.class final Lcom/smartengines/app/ui/ComposableSingletons$TestScreenKt$lambda-4$1;
.super Ljava/lang/Object;
.source "TestScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/ComposableSingletons$TestScreenKt;
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$TestScreenKt$lambda-4$1;


# direct methods
.method public static synthetic $r8$lambda$7fIdWHtTTd-gm593aSptys5WjOk()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/ComposableSingletons$TestScreenKt$lambda-4$1;->invoke$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/ComposableSingletons$TestScreenKt$lambda-4$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/ComposableSingletons$TestScreenKt$lambda-4$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/ComposableSingletons$TestScreenKt$lambda-4$1;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$TestScreenKt$lambda-4$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 89
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 88
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/ComposableSingletons$TestScreenKt$lambda-4$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 4

    const-string v0, "C88@3013L45:TestScreen.kt#83idza"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 89
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_1
    :goto_0
    new-instance p2, Lcom/smartengines/app/ui/ComposableSingletons$TestScreenKt$lambda-4$1$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lcom/smartengines/app/ui/ComposableSingletons$TestScreenKt$lambda-4$1$$ExternalSyntheticLambda0;-><init>()V

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "one"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string/jumbo v3, "two"

    aput-object v3, v1, v2

    const-string/jumbo v2, "three"

    aput-object v2, v1, v0

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/16 v1, 0x36

    invoke-static {p2, v0, p1, v1}, Lcom/smartengines/app/ui/TestScreenKt;->TestScreen(Lkotlin/jvm/functions/Function0;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
