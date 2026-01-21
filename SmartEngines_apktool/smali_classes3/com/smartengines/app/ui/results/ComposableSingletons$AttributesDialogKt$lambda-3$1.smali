.class final Lcom/smartengines/app/ui/results/ComposableSingletons$AttributesDialogKt$lambda-3$1;
.super Ljava/lang/Object;
.source "AttributesDialog.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/results/ComposableSingletons$AttributesDialogKt;
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/results/ComposableSingletons$AttributesDialogKt$lambda-3$1;


# direct methods
.method public static synthetic $r8$lambda$gR-nvww-9H2kXAes037FolqTElE()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/results/ComposableSingletons$AttributesDialogKt$lambda-3$1;->invoke$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/results/ComposableSingletons$AttributesDialogKt$lambda-3$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/results/ComposableSingletons$AttributesDialogKt$lambda-3$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/results/ComposableSingletons$AttributesDialogKt$lambda-3$1;->INSTANCE:Lcom/smartengines/app/ui/results/ComposableSingletons$AttributesDialogKt$lambda-3$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 90
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 80
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/results/ComposableSingletons$AttributesDialogKt$lambda-3$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 4

    const-string v0, "C80@2898L531:AttributesDialog.kt#4ipo3i"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 81
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 90
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_1
    :goto_0
    const/16 p2, 0x8

    .line 82
    new-array p2, p2, [Lcom/smartengines/engine/id/Attribute;

    new-instance v1, Lcom/smartengines/engine/id/Attribute;

    const-string v2, "key-1"

    const-string/jumbo v3, "the attribute value #1"

    invoke-direct {v1, v2, v3}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    aput-object v1, p2, v2

    .line 83
    new-instance v1, Lcom/smartengines/engine/id/Attribute;

    const-string v2, "key-2"

    const-string/jumbo v3, "the attribute value #2"

    invoke-direct {v1, v2, v3}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    aput-object v1, p2, v2

    .line 84
    new-instance v1, Lcom/smartengines/engine/id/Attribute;

    const-string v2, "key-3"

    const-string/jumbo v3, "the attribute value #3"

    invoke-direct {v1, v2, v3}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, p2, v0

    .line 85
    new-instance v0, Lcom/smartengines/engine/id/Attribute;

    const-string v1, "key-4"

    const-string/jumbo v2, "the attribute value #4"

    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x3

    aput-object v0, p2, v1

    .line 86
    new-instance v0, Lcom/smartengines/engine/id/Attribute;

    const-string v1, "key-5"

    const-string/jumbo v2, "the attribute value #5"

    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x4

    aput-object v0, p2, v1

    .line 87
    new-instance v0, Lcom/smartengines/engine/id/Attribute;

    const-string v1, "key-6"

    const-string/jumbo v2, "the attribute value #6"

    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x5

    aput-object v0, p2, v1

    .line 88
    new-instance v0, Lcom/smartengines/engine/id/Attribute;

    const-string v1, "key-7"

    const-string/jumbo v2, "the attribute value #7"

    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x6

    aput-object v0, p2, v1

    .line 89
    new-instance v0, Lcom/smartengines/engine/id/Attribute;

    const-string v1, "key-8"

    const-string/jumbo v2, "the attribute value #8"

    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/id/Attribute;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x7

    aput-object v0, p2, v1

    .line 81
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    new-instance v0, Lcom/smartengines/app/ui/results/ComposableSingletons$AttributesDialogKt$lambda-3$1$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/smartengines/app/ui/results/ComposableSingletons$AttributesDialogKt$lambda-3$1$$ExternalSyntheticLambda0;-><init>()V

    const/16 v1, 0x38

    invoke-static {p2, v0, p1, v1}, Lcom/smartengines/app/ui/results/AttributesDialogKt;->AttributesDialog(Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
