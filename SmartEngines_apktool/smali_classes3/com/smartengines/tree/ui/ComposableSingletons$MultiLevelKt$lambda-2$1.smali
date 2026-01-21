.class final Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1;
.super Ljava/lang/Object;
.source "MultiLevel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultiLevel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiLevel.kt\ncom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,128:1\n1225#2,6:129\n*S KotlinDebug\n*F\n+ 1 MultiLevel.kt\ncom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1\n*L\n116#1:129,6\n*E\n"
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
.field public static final INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1;

    invoke-direct {v0}, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1;-><init>()V

    sput-object v0, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1;->INSTANCE:Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 114
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    const-string v0, "C115@3991L45,117@4067L181,117@4059L189:MultiLevel.kt#snoj4b"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 116
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 125
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_1
    :goto_0
    const p2, -0x5f57695a    # -2.8559998E-19f

    .line 116
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p2, "CC(remember):MultiLevel.kt#9igjgp"

    invoke-static {p1, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 129
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    .line 130
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_2

    .line 116
    new-instance p2, Lcom/smartengines/tree/ui/MultiLevelTreeModel;

    invoke-static {}, Lcom/smartengines/tree/ui/PreviewKt;->getPreviewData()Ljava/util/List;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/smartengines/tree/ui/MultiLevelTreeModel;-><init>(Ljava/util/List;)V

    .line 132
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 116
    :cond_2
    check-cast p2, Lcom/smartengines/tree/ui/MultiLevelTreeModel;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 118
    new-instance v0, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1$1;

    invoke-direct {v0, p2}, Lcom/smartengines/tree/ui/ComposableSingletons$MultiLevelKt$lambda-2$1$1;-><init>(Lcom/smartengines/tree/ui/MultiLevelTreeModel;)V

    const/16 p2, 0x36

    const v1, -0x49cea700

    const/4 v2, 0x1

    invoke-static {v1, v2, v0, p1, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p2

    move-object v9, p2

    check-cast v9, Lkotlin/jvm/functions/Function2;

    const/high16 v11, 0xc00000

    const/16 v12, 0x7f

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v10, p1

    invoke-static/range {v0 .. v12}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
