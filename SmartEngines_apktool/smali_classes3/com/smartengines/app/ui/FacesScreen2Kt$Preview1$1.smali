.class final Lcom/smartengines/app/ui/FacesScreen2Kt$Preview1$1;
.super Ljava/lang/Object;
.source "FacesScreen2.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/FacesScreen2Kt;->Preview1(Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $photo:Lcom/smartengines/app/Photo;


# direct methods
.method public static synthetic $r8$lambda$MyLWr1wHSK_X3vzvRNl3EsaHuvA(ILcom/smartengines/app/Photo;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/smartengines/app/ui/FacesScreen2Kt$Preview1$1;->invoke$lambda$1(ILcom/smartengines/app/Photo;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$j04fUhQDGGsf8X1lfjxnqMm8lWw(I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/FacesScreen2Kt$Preview1$1;->invoke$lambda$0(I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/smartengines/app/Photo;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/app/ui/FacesScreen2Kt$Preview1$1;->$photo:Lcom/smartengines/app/Photo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0(I)Lkotlin/Unit;
    .locals 0

    .line 285
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$1(ILcom/smartengines/app/Photo;)Lkotlin/Unit;
    .locals 0

    const-string p0, "b"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 286
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 281
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/FacesScreen2Kt$Preview1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "C281@9891L178:FacesScreen2.kt#83idza"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 282
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 287
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 283
    :cond_1
    :goto_0
    new-array p2, v0, [Lcom/smartengines/app/Photo;

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/smartengines/app/ui/FacesScreen2Kt$Preview1$1;->$photo:Lcom/smartengines/app/Photo;

    aput-object v1, p2, v0

    const/4 v0, 0x1

    const/4 v1, 0x0

    aput-object v1, p2, v0

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 284
    new-instance p2, Lcom/smartengines/engine/id/FacesResult$Success;

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    invoke-direct {p2, v0, v1}, Lcom/smartengines/engine/id/FacesResult$Success;-><init>(D)V

    move-object v3, p2

    check-cast v3, Lcom/smartengines/engine/id/FacesResult;

    new-instance v4, Lcom/smartengines/app/ui/FacesScreen2Kt$Preview1$1$$ExternalSyntheticLambda0;

    invoke-direct {v4}, Lcom/smartengines/app/ui/FacesScreen2Kt$Preview1$1$$ExternalSyntheticLambda0;-><init>()V

    new-instance v5, Lcom/smartengines/app/ui/FacesScreen2Kt$Preview1$1$$ExternalSyntheticLambda1;

    invoke-direct {v5}, Lcom/smartengines/app/ui/FacesScreen2Kt$Preview1$1$$ExternalSyntheticLambda1;-><init>()V

    const/16 v7, 0xdc8

    move-object v6, p1

    .line 282
    invoke-static/range {v2 .. v7}, Lcom/smartengines/app/ui/FacesScreen2Kt;->access$FacesScreen(Ljava/util/List;Lcom/smartengines/engine/id/FacesResult;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
