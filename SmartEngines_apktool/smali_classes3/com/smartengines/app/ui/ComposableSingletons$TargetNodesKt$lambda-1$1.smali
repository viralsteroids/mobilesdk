.class final Lcom/smartengines/app/ui/ComposableSingletons$TargetNodesKt$lambda-1$1;
.super Ljava/lang/Object;
.source "TargetNodes.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/ComposableSingletons$TargetNodesKt;
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
    value = "SMAP\nTargetNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetNodes.kt\ncom/smartengines/app/ui/ComposableSingletons$TargetNodesKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,135:1\n149#2:136\n86#3:137\n83#3,6:138\n89#3:172\n93#3:176\n79#4,6:144\n86#4,4:159\n90#4,2:169\n94#4:175\n368#5,9:150\n377#5:171\n378#5,2:173\n4034#6,6:163\n*S KotlinDebug\n*F\n+ 1 TargetNodes.kt\ncom/smartengines/app/ui/ComposableSingletons$TargetNodesKt$lambda-1$1\n*L\n126#1:136\n126#1:137\n126#1:138,6\n126#1:172\n126#1:176\n126#1:144,6\n126#1:159,4\n126#1:169,2\n126#1:175\n126#1:150,9\n126#1:171\n126#1:173,2\n126#1:163,6\n*E\n"
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$TargetNodesKt$lambda-1$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/ComposableSingletons$TargetNodesKt$lambda-1$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/ComposableSingletons$TargetNodesKt$lambda-1$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/ComposableSingletons$TargetNodesKt$lambda-1$1;->INSTANCE:Lcom/smartengines/app/ui/ComposableSingletons$TargetNodesKt$lambda-1$1;

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

    .line 125
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/ComposableSingletons$TargetNodesKt$lambda-1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 15

    move-object/from16 v3, p1

    const-string v0, "C125@4454L432:TargetNodes.kt#83idza"

    invoke-static {v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 126
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 131
    :cond_0
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 126
    :cond_1
    :goto_0
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/16 v1, 0xa

    int-to-float v1, v1

    .line 136
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 126
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v1, -0x1cd0f17e

    const-string v2, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"

    .line 137
    invoke-static {v3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 138
    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v1

    .line 139
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v2

    const/4 v4, 0x0

    .line 142
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v1

    const v2, -0x4ee9b9da

    .line 143
    const-string v5, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    .line 144
    invoke-static {v3, v2, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 145
    invoke-static {v3, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v2

    .line 146
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v4

    .line 147
    invoke-static {v3, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 149
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v5

    const v6, -0x2942ffcf

    .line 148
    const-string v7, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 150
    invoke-static {v3, v6, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 151
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v6

    instance-of v6, v6, Landroidx/compose/runtime/Applier;

    if-nez v6, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 152
    :cond_2
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 153
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 154
    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    .line 156
    :cond_3
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 158
    :goto_1
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .line 159
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v5, v1, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 160
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v5, v4, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 162
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 164
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 165
    :cond_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 166
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 169
    :cond_5
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v5, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v0, -0x16ef5699

    .line 171
    const-string v1, "C88@4444L9:Column.kt#2w3rfo"

    .line 172
    invoke-static {v3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    check-cast v0, Landroidx/compose/foundation/layout/ColumnScope;

    const v0, -0x1ebae676

    const-string v1, "C126@4504L69,127@4590L96,128@4703L72,129@4792L80:TargetNodes.kt#83idza"

    .line 127
    invoke-static {v3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    new-instance v4, Lcom/smartengines/app/targets/TreeGroup;

    new-instance v5, Lcom/smartengines/utils/Name;

    const-string v0, "Node row group"

    invoke-direct {v5, v0}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;)V

    sget v0, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/16 v11, 0x3c

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lcom/smartengines/app/targets/TreeGroup;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Lcom/smartengines/app/targets/TreeGroupViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v4, Lcom/smartengines/app/targets/TreeItem;

    const/16 v0, 0x8

    invoke-static {v4, v3, v0}, Lcom/smartengines/app/ui/TargetNodesKt;->NodeRow(Lcom/smartengines/app/targets/TreeItem;Landroidx/compose/runtime/Composer;I)V

    .line 128
    new-instance v5, Lcom/smartengines/app/targets/TreeLeaf;

    new-instance v6, Lcom/smartengines/utils/Name;

    const-string v1, "Node row leaf"

    const-string v2, ""

    invoke-direct {v6, v1, v2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget v1, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v1, Lcom/smartengines/engine/MockTarget;

    invoke-direct {v1}, Lcom/smartengines/engine/MockTarget;-><init>()V

    move-object v12, v1

    check-cast v12, Lcom/smartengines/engine/RecognitionTarget;

    const/16 v13, 0x3c

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v14}, Lcom/smartengines/app/targets/TreeLeaf;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Object;Ljava/lang/Object;IZLjava/util/List;Lcom/smartengines/engine/RecognitionTarget;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v5, Lcom/smartengines/app/targets/TreeItem;

    invoke-static {v5, v3, v0}, Lcom/smartengines/app/ui/TargetNodesKt;->NodeRow(Lcom/smartengines/app/targets/TreeItem;Landroidx/compose/runtime/Composer;I)V

    .line 129
    new-instance v6, Lcom/smartengines/app/targets/TreeGroup;

    new-instance v7, Lcom/smartengines/utils/Name;

    const-string v0, "Node icon"

    invoke-direct {v7, v0}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;)V

    sget v0, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lcom/smartengines/app/targets/TreeGroup;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Lcom/smartengines/app/targets/TreeGroupViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v6

    check-cast v0, Lcom/smartengines/app/targets/TreeItem;

    const/16 v4, 0x38

    const/4 v5, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/TargetNodesKt;->NodeIcon-6a0pyJM(Lcom/smartengines/app/targets/TreeItem;ZFLandroidx/compose/runtime/Composer;II)V

    .line 130
    new-instance v0, Lcom/smartengines/app/targets/TreeGroup;

    new-instance v1, Lcom/smartengines/utils/Name;

    const-string v2, "Node icon selected"

    invoke-direct {v1, v2}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;)V

    sget v2, Lcom/smartengines/app/R$drawable;->home_bank_card:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/smartengines/app/targets/TreeGroup;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/String;Lcom/smartengines/app/targets/TreeGroupViewType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Lcom/smartengines/app/targets/TreeItem;

    const/16 v4, 0x38

    const/4 v5, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    move-object/from16 v3, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/TargetNodesKt;->NodeIcon-6a0pyJM(Lcom/smartengines/app/targets/TreeItem;ZFLandroidx/compose/runtime/Composer;II)V

    .line 127
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 172
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 173
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 150
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 144
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 137
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    return-void
.end method
