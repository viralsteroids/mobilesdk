.class final Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;
.super Lkotlin/jvm/internal/Lambda;
.source "TextFieldSelectionState.android.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt;->contextMenuBuilder(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/contextmenu/ContextMenuState;)Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroidx/compose/foundation/contextmenu/ContextMenuScope;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextFieldSelectionState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1\n+ 2 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n*L\n1#1,34:1\n99#2,5:35\n99#2,5:40\n99#2,5:45\n99#2,5:50\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.android.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1\n*L\n27#1:35,5\n28#1:40,5\n31#1:45,5\n32#1:50,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/foundation/contextmenu/ContextMenuScope;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $state:Landroidx/compose/foundation/contextmenu/ContextMenuState;

.field final synthetic $this_contextMenuBuilder:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/contextmenu/ContextMenuState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->$state:Landroidx/compose/foundation/contextmenu/ContextMenuState;

    iput-object p2, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->$this_contextMenuBuilder:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 26
    check-cast p1, Landroidx/compose/foundation/contextmenu/ContextMenuScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->invoke(Landroidx/compose/foundation/contextmenu/ContextMenuScope;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/contextmenu/ContextMenuScope;)V
    .locals 20

    move-object/from16 v0, p0

    .line 27
    iget-object v1, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->$state:Landroidx/compose/foundation/contextmenu/ContextMenuState;

    sget-object v2, Landroidx/compose/foundation/text/TextContextMenuItems;->Cut:Landroidx/compose/foundation/text/TextContextMenuItems;

    iget-object v3, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->$this_contextMenuBuilder:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->canCut()Z

    move-result v7

    iget-object v3, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->$this_contextMenuBuilder:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 35
    new-instance v4, Landroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$1;

    invoke-direct {v4, v2}, Landroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$1;-><init>(Landroidx/compose/foundation/text/TextContextMenuItems;)V

    move-object v5, v4

    check-cast v5, Lkotlin/jvm/functions/Function2;

    new-instance v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1;

    invoke-direct {v2, v1, v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1;-><init>(Landroidx/compose/foundation/contextmenu/ContextMenuState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    move-object v9, v2

    check-cast v9, Lkotlin/jvm/functions/Function0;

    const/16 v10, 0xa

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v4, p1

    invoke-static/range {v4 .. v11}, Landroidx/compose/foundation/contextmenu/ContextMenuScope;->item$default(Landroidx/compose/foundation/contextmenu/ContextMenuScope;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 28
    iget-object v1, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->$state:Landroidx/compose/foundation/contextmenu/ContextMenuState;

    sget-object v2, Landroidx/compose/foundation/text/TextContextMenuItems;->Copy:Landroidx/compose/foundation/text/TextContextMenuItems;

    iget-object v3, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->$this_contextMenuBuilder:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->canCopy()Z

    move-result v15

    iget-object v3, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->$this_contextMenuBuilder:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 40
    new-instance v4, Landroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$1;

    invoke-direct {v4, v2}, Landroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$1;-><init>(Landroidx/compose/foundation/text/TextContextMenuItems;)V

    move-object v13, v4

    check-cast v13, Lkotlin/jvm/functions/Function2;

    new-instance v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2;

    invoke-direct {v2, v1, v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2;-><init>(Landroidx/compose/foundation/contextmenu/ContextMenuState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    move-object/from16 v17, v2

    check-cast v17, Lkotlin/jvm/functions/Function0;

    const/16 v18, 0xa

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v12 .. v19}, Landroidx/compose/foundation/contextmenu/ContextMenuScope;->item$default(Landroidx/compose/foundation/contextmenu/ContextMenuScope;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 31
    iget-object v1, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->$state:Landroidx/compose/foundation/contextmenu/ContextMenuState;

    sget-object v2, Landroidx/compose/foundation/text/TextContextMenuItems;->Paste:Landroidx/compose/foundation/text/TextContextMenuItems;

    iget-object v3, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->$this_contextMenuBuilder:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->canPaste()Z

    move-result v15

    iget-object v3, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->$this_contextMenuBuilder:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 45
    new-instance v4, Landroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$1;

    invoke-direct {v4, v2}, Landroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$1;-><init>(Landroidx/compose/foundation/text/TextContextMenuItems;)V

    move-object v13, v4

    check-cast v13, Lkotlin/jvm/functions/Function2;

    new-instance v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3;

    invoke-direct {v2, v1, v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3;-><init>(Landroidx/compose/foundation/contextmenu/ContextMenuState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    move-object/from16 v17, v2

    check-cast v17, Lkotlin/jvm/functions/Function0;

    invoke-static/range {v12 .. v19}, Landroidx/compose/foundation/contextmenu/ContextMenuScope;->item$default(Landroidx/compose/foundation/contextmenu/ContextMenuScope;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 32
    iget-object v1, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->$state:Landroidx/compose/foundation/contextmenu/ContextMenuState;

    sget-object v2, Landroidx/compose/foundation/text/TextContextMenuItems;->SelectAll:Landroidx/compose/foundation/text/TextContextMenuItems;

    iget-object v3, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->$this_contextMenuBuilder:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->canSelectAll()Z

    move-result v15

    iget-object v3, v0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->$this_contextMenuBuilder:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 50
    new-instance v4, Landroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$1;

    invoke-direct {v4, v2}, Landroidx/compose/foundation/text/ContextMenu_androidKt$TextItem$1;-><init>(Landroidx/compose/foundation/text/TextContextMenuItems;)V

    move-object v13, v4

    check-cast v13, Lkotlin/jvm/functions/Function2;

    new-instance v2, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4;

    invoke-direct {v2, v1, v3}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4;-><init>(Landroidx/compose/foundation/contextmenu/ContextMenuState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V

    move-object/from16 v17, v2

    check-cast v17, Lkotlin/jvm/functions/Function0;

    invoke-static/range {v12 .. v19}, Landroidx/compose/foundation/contextmenu/ContextMenuScope;->item$default(Landroidx/compose/foundation/contextmenu/ContextMenuScope;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method
