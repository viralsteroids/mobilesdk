.class final Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1;
.super Ljava/lang/Object;
.source "CameraButtonsView.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt;
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1;


# direct methods
.method public static synthetic $r8$lambda$5Xpz9D536o1jF9V2G76H6If8oBQ()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1;->invoke$lambda$2()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$DgGahSIpG_DVpZ-TymmlCbAOxhc()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1;->invoke$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$Dqj-yAoF203u2TUvFYIsf4lulVM(Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1;->invoke$lambda$1(Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 280
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$1(Landroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$2()Lkotlin/Unit;
    .locals 1

    .line 280
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 276
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "C276@9746L12,277@9771L91:CameraButtonsView.kt#83idza"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 277
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 280
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_1
    :goto_0
    const/4 p2, 0x0

    .line 277
    invoke-static {p1, p2}, Lcom/smartengines/app/mock/MockComposesKt;->MockCamera(Landroidx/compose/runtime/Composer;I)V

    .line 279
    new-instance v0, Lcom/smartengines/app/CameraButtonsState;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/smartengines/app/CameraButtonsState;-><init>(ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1$$ExternalSyntheticLambda0;-><init>()V

    new-instance v2, Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1$$ExternalSyntheticLambda1;

    invoke-direct {v2}, Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1$$ExternalSyntheticLambda1;-><init>()V

    new-instance v3, Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1$$ExternalSyntheticLambda2;

    invoke-direct {v3}, Lcom/smartengines/app/ui/ComposableSingletons$CameraButtonsViewKt$lambda-3$1$$ExternalSyntheticLambda2;-><init>()V

    .line 280
    sget-object p2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v4

    const/16 v7, 0x6db0

    const/4 v8, 0x0

    move-object v6, p1

    .line 278
    invoke-static/range {v0 .. v8}, Lcom/smartengines/app/ui/CameraButtonsViewKt;->CameraButtons-yrwZFoE(Lcom/smartengines/app/CameraButtonsState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;II)V

    return-void
.end method
