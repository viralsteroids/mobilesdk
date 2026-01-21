.class final Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1;
.super Ljava/lang/Object;
.source "FacesScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt;
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1;


# direct methods
.method public static synthetic $r8$lambda$BBpV0piBWOJcVurfRQE8MMTE3zQ()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1;->invoke$lambda$3()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$J2ZDl3Wco360r8JLMwFkSsVEot0(I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1;->invoke$lambda$0(I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$X4diOTylUSvXyZriW6_NzW2xg-Q()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1;->invoke$lambda$1()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$tnWMjoytgCo7VX1rm1GPEhcJGo0(Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1;->invoke$lambda$2(Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0(I)Lkotlin/Unit;
    .locals 0

    .line 192
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$1()Lkotlin/Unit;
    .locals 1

    .line 192
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$2(Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$3()Lkotlin/Unit;
    .locals 1

    .line 192
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 188
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 11

    const-string v0, "C188@6216L142:FacesScreen.kt#83idza"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 189
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 194
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 190
    :cond_1
    :goto_0
    new-array p2, v0, [Lcom/smartengines/app/com/smartengines/app/SlotState;

    const/4 v0, 0x0

    sget-object v1, Lcom/smartengines/app/com/smartengines/app/SlotState$CAMERA;->INSTANCE:Lcom/smartengines/app/com/smartengines/app/SlotState$CAMERA;

    aput-object v1, p2, v0

    const/4 v0, 0x1

    .line 191
    sget-object v1, Lcom/smartengines/app/com/smartengines/app/SlotState$EMPTY;->INSTANCE:Lcom/smartengines/app/com/smartengines/app/SlotState$EMPTY;

    aput-object v1, p2, v0

    .line 189
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 192
    new-instance v4, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1$$ExternalSyntheticLambda0;

    invoke-direct {v4}, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1$$ExternalSyntheticLambda0;-><init>()V

    new-instance v5, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1$$ExternalSyntheticLambda1;

    invoke-direct {v5}, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1$$ExternalSyntheticLambda1;-><init>()V

    new-instance v6, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1$$ExternalSyntheticLambda2;

    invoke-direct {v6}, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1$$ExternalSyntheticLambda2;-><init>()V

    new-instance v7, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1$$ExternalSyntheticLambda3;

    invoke-direct {v7}, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt$lambda-3$1$$ExternalSyntheticLambda3;-><init>()V

    sget-object p2, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt;

    invoke-virtual {p2}, Lcom/smartengines/app/ui/ComposableSingletons$FacesScreenKt;->getLambda-2$app_storeRelease()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    const v10, 0x1b6db6

    const/4 v3, 0x0

    move-object v9, p1

    .line 189
    invoke-static/range {v2 .. v10}, Lcom/smartengines/app/ui/FacesScreenKt;->access$FacesScreen(Ljava/util/List;Lcom/smartengines/engine/id/FacesResult;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
