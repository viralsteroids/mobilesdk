.class final Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;
.super Lkotlin/jvm/internal/Lambda;
.source "BasicTextField.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\u000b\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "(Landroidx/compose/runtime/Composer;I)V"
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
.field final synthetic $cursorBrush:Landroidx/compose/ui/graphics/Brush;

.field final synthetic $decorator:Landroidx/compose/foundation/text/input/TextFieldDecorator;

.field final synthetic $enabled:Z

.field final synthetic $isDragHovered:Z

.field final synthetic $isFocused:Z

.field final synthetic $isWindowFocused:Z

.field final synthetic $lineLimits:Landroidx/compose/foundation/text/input/TextFieldLineLimits;

.field final synthetic $onTextLayout:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/ui/unit/Density;",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $orientation:Landroidx/compose/foundation/gestures/Orientation;

.field final synthetic $readOnly:Z

.field final synthetic $scrollState:Landroidx/compose/foundation/ScrollState;

.field final synthetic $singleLine:Z

.field final synthetic $textFieldSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

.field final synthetic $textLayoutState:Landroidx/compose/foundation/text/input/internal/TextLayoutState;

.field final synthetic $textStyle:Landroidx/compose/ui/text/TextStyle;

.field final synthetic $transformedState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/TextStyle;ZZZLandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;ZLkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/input/TextFieldDecorator;",
            "Landroidx/compose/foundation/text/input/TextFieldLineLimits;",
            "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
            "Landroidx/compose/ui/text/TextStyle;",
            "ZZZ",
            "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;",
            "Landroidx/compose/ui/graphics/Brush;",
            "ZZ",
            "Landroidx/compose/foundation/ScrollState;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "-",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$decorator:Landroidx/compose/foundation/text/input/TextFieldDecorator;

    iput-object p2, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$lineLimits:Landroidx/compose/foundation/text/input/TextFieldLineLimits;

    iput-object p3, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$textLayoutState:Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    iput-object p4, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$textStyle:Landroidx/compose/ui/text/TextStyle;

    iput-boolean p5, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$isFocused:Z

    iput-boolean p6, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$isWindowFocused:Z

    iput-boolean p7, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$isDragHovered:Z

    iput-object p8, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$transformedState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    iput-object p9, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$textFieldSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    iput-object p10, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$cursorBrush:Landroidx/compose/ui/graphics/Brush;

    iput-boolean p11, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$enabled:Z

    iput-boolean p12, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$readOnly:Z

    iput-object p13, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$scrollState:Landroidx/compose/foundation/ScrollState;

    iput-object p14, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    iput-boolean p15, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$singleLine:Z

    move-object/from16 p1, p16

    iput-object p1, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$onTextLayout:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 344
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const-string v3, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5"

    invoke-static {v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    .line 345
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 409
    :cond_0
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 345
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)"

    const v5, -0x2820d9ff

    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    iget-object v2, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$decorator:Landroidx/compose/foundation/text/input/TextFieldDecorator;

    if-nez v2, :cond_3

    invoke-static {}, Landroidx/compose/foundation/text/BasicTextFieldKt;->access$getDefaultTextFieldDecorator$p()Landroidx/compose/foundation/text/input/TextFieldDecorator;

    move-result-object v2

    .line 346
    :cond_3
    new-instance v3, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1$1;

    iget-object v4, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$lineLimits:Landroidx/compose/foundation/text/input/TextFieldLineLimits;

    iget-object v5, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$textLayoutState:Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    iget-object v6, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$textStyle:Landroidx/compose/ui/text/TextStyle;

    iget-boolean v7, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$isFocused:Z

    iget-boolean v8, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$isWindowFocused:Z

    iget-boolean v9, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$isDragHovered:Z

    iget-object v10, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$transformedState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    iget-object v11, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$textFieldSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    iget-object v12, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$cursorBrush:Landroidx/compose/ui/graphics/Brush;

    iget-boolean v13, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$enabled:Z

    iget-boolean v14, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$readOnly:Z

    iget-object v15, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$scrollState:Landroidx/compose/foundation/ScrollState;

    move-object/from16 p2, v3

    iget-object v3, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$orientation:Landroidx/compose/foundation/gestures/Orientation;

    move-object/from16 v16, v3

    iget-boolean v3, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$singleLine:Z

    move/from16 v17, v3

    iget-object v3, v0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1;->$onTextLayout:Lkotlin/jvm/functions/Function2;

    move-object/from16 v18, v3

    move-object/from16 v3, p2

    invoke-direct/range {v3 .. v18}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$4$1$1;-><init>(Landroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/TextStyle;ZZZLandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;ZLkotlin/jvm/functions/Function2;)V

    const/16 v4, 0x36

    const v5, 0x755f253e

    const/4 v6, 0x1

    invoke-static {v5, v6, v3, v1, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x6

    invoke-interface {v2, v3, v1, v4}, Landroidx/compose/foundation/text/input/TextFieldDecorator;->Decoration(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    return-void
.end method
