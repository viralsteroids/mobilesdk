.class public final Landroidx/compose/foundation/text/ClickableTextKt;
.super Ljava/lang/Object;
.source "ClickableText.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClickableText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1225#2,6:204\n1225#2,6:210\n1225#2,6:216\n1225#2,6:222\n1225#2,3:233\n1228#2,3:239\n1225#2,6:243\n1225#2,6:249\n481#3:228\n480#3,4:229\n484#3,2:236\n488#3:242\n480#4:238\n70#5:255\n73#5:256\n1#6:257\n*S KotlinDebug\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n*L\n85#1:204,6\n86#1:210,6\n101#1:216,6\n164#1:222,6\n165#1:233,3\n165#1:239,3\n172#1:243,6\n194#1:249,6\n165#1:228\n165#1:229,4\n165#1:236,2\n165#1:242\n165#1:238\n-1#1:255\n202#1:256\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u008c\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00062\u0014\u0008\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001av\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00062\u0014\u0008\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u001e\u0010\u0017\u001a\u00020\u000c*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u001d"
    }
    d2 = {
        "ClickableText",
        "",
        "text",
        "Landroidx/compose/ui/text/AnnotatedString;",
        "onHover",
        "Lkotlin/Function1;",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "style",
        "Landroidx/compose/ui/text/TextStyle;",
        "softWrap",
        "",
        "overflow",
        "Landroidx/compose/ui/text/style/TextOverflow;",
        "maxLines",
        "onTextLayout",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "onClick",
        "ClickableText-03UYbkw",
        "(Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "ClickableText-4YKlhWE",
        "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "containsWithinBounds",
        "Landroidx/compose/ui/text/MultiParagraph;",
        "positionOffset",
        "Landroidx/compose/ui/geometry/Offset;",
        "containsWithinBounds-Uv8p0NA",
        "(Landroidx/compose/ui/text/MultiParagraph;J)Z",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final ClickableText-03UYbkw(Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/text/TextStyle;",
            "ZII",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use Text or BasicText and pass an AnnotatedString that contains a LinkAnnotation"
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    const v0, 0x3cd7c7e4

    move-object/from16 v1, p9

    .line 163
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    const-string v3, "C(ClickableText)P(8,3,1,7,6,5:c#ui.text.style.TextOverflow!1,4)163@7538L52,164@7616L24,171@7916L413,193@8556L76,186@8335L303:ClickableText.kt#423gt5"

    invoke-static {v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v3, v11, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v10, 0x6

    move-object/from16 v12, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v10, 0x6

    move-object/from16 v12, p0

    if-nez v3, :cond_2

    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_2
    move v3, v10

    :goto_1
    and-int/lit8 v5, v11, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v10, 0x30

    if-nez v5, :cond_5

    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, v11, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v10, 0x180

    if-nez v7, :cond_8

    move-object/from16 v7, p2

    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v7, p2

    :goto_6
    and-int/lit8 v8, v11, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v13, v10, 0xc00

    if-nez v13, :cond_b

    move-object/from16 v13, p3

    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_7

    :cond_a
    const/16 v14, 0x400

    :goto_7
    or-int/2addr v3, v14

    goto :goto_9

    :cond_b
    :goto_8
    move-object/from16 v13, p3

    :goto_9
    and-int/lit8 v14, v11, 0x10

    if-eqz v14, :cond_c

    or-int/lit16 v3, v3, 0x6000

    goto :goto_b

    :cond_c
    and-int/lit16 v15, v10, 0x6000

    if-nez v15, :cond_e

    move/from16 v15, p4

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_a

    :cond_d
    const/16 v16, 0x2000

    :goto_a
    or-int v3, v3, v16

    goto :goto_c

    :cond_e
    :goto_b
    move/from16 v15, p4

    :goto_c
    and-int/lit8 v16, v11, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v3, v3, v17

    move/from16 v6, p5

    goto :goto_e

    :cond_f
    and-int v17, v10, v17

    move/from16 v6, p5

    if-nez v17, :cond_11

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_d

    :cond_10
    const/high16 v17, 0x10000

    :goto_d
    or-int v3, v3, v17

    :cond_11
    :goto_e
    and-int/lit8 v17, v11, 0x40

    const/high16 v18, 0x180000

    if-eqz v17, :cond_12

    or-int v3, v3, v18

    move/from16 v4, p6

    goto :goto_10

    :cond_12
    and-int v18, v10, v18

    move/from16 v4, p6

    if-nez v18, :cond_14

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v19

    if-eqz v19, :cond_13

    const/high16 v19, 0x100000

    goto :goto_f

    :cond_13
    const/high16 v19, 0x80000

    :goto_f
    or-int v3, v3, v19

    :cond_14
    :goto_10
    and-int/lit16 v0, v11, 0x80

    move/from16 v20, v0

    const/high16 v21, 0xc00000

    if-eqz v20, :cond_15

    or-int v3, v3, v21

    move-object/from16 v0, p7

    goto :goto_12

    :cond_15
    and-int v21, v10, v21

    move-object/from16 v0, p7

    if-nez v21, :cond_17

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_16

    const/high16 v22, 0x800000

    goto :goto_11

    :cond_16
    const/high16 v22, 0x400000

    :goto_11
    or-int v3, v3, v22

    :cond_17
    :goto_12
    and-int/lit16 v0, v11, 0x100

    move/from16 v22, v0

    const/high16 v23, 0x6000000

    if-eqz v22, :cond_18

    or-int v3, v3, v23

    goto :goto_14

    :cond_18
    and-int v22, v10, v23

    if-nez v22, :cond_1a

    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_19

    const/high16 v22, 0x4000000

    goto :goto_13

    :cond_19
    const/high16 v22, 0x2000000

    :goto_13
    or-int v3, v3, v22

    :cond_1a
    :goto_14
    const v22, 0x2492493

    and-int v0, v3, v22

    const v2, 0x2492492

    if-ne v0, v2, :cond_1c

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_15

    .line 199
    :cond_1b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v0, p1

    move-object/from16 v8, p7

    move-object/from16 v22, v1

    move-object v3, v7

    move v5, v15

    move v7, v4

    move-object v4, v13

    goto/16 :goto_1d

    :cond_1c
    :goto_15
    if-eqz v5, :cond_1d

    .line 156
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v7, v0

    :cond_1d
    if-eqz v8, :cond_1e

    .line 157
    sget-object v0, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v0

    move-object v13, v0

    :cond_1e
    if-eqz v14, :cond_1f

    const/4 v15, 0x1

    :cond_1f
    if-eqz v16, :cond_20

    .line 159
    sget-object v2, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v2

    move/from16 v16, v2

    goto :goto_16

    :cond_20
    move/from16 v16, v6

    :goto_16
    if-eqz v17, :cond_21

    const v2, 0x7fffffff

    move v4, v2

    :cond_21
    if-eqz v20, :cond_22

    .line 161
    sget-object v2, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$4;->INSTANCE:Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$4;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_17

    :cond_22
    move-object/from16 v2, p7

    :goto_17
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_23

    const/4 v5, -0x1

    const-string v6, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:162)"

    const v8, 0x3cd7c7e4

    .line 163
    invoke-static {v8, v3, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_23
    const v5, 0x594c8bfc

    .line 164
    const-string v6, "CC(remember):ClickableText.kt#9igjgp"

    invoke-static {v1, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 222
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .line 223
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v5, v8, :cond_24

    const/4 v5, 0x0

    const/4 v8, 0x2

    .line 164
    invoke-static {v5, v5, v8, v5}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v5

    .line 225
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 164
    :cond_24
    check-cast v5, Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v8, 0x2e20b340

    .line 165
    const-string v14, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp"

    .line 228
    invoke-static {v1, v8, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const v8, -0x38e27f50

    .line 231
    const-string v14, "CC(remember):Effects.kt#9igjgp"

    .line 232
    invoke-static {v1, v8, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 233
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .line 234
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v8, v14, :cond_25

    .line 238
    sget-object v8, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 237
    check-cast v8, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v8, v1}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v8

    .line 236
    new-instance v14, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v14, v8}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lkotlinx/coroutines/CoroutineScope;)V

    .line 239
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v8, v14

    .line 232
    :cond_25
    check-cast v8, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 242
    invoke-virtual {v8}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    move-result-object v8

    .line 228
    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 172
    sget-object v14, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v14, Landroidx/compose/ui/Modifier;

    const v0, 0x594cbca5

    invoke-static {v1, v0, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    move/from16 p2, v0

    and-int/lit8 v0, v3, 0x70

    const/16 v18, 0x0

    move/from16 v19, v3

    const/16 v3, 0x20

    if-ne v0, v3, :cond_26

    const/4 v0, 0x1

    goto :goto_18

    :cond_26
    move/from16 v0, v18

    :goto_18
    or-int v0, p2, v0

    const/high16 v3, 0xe000000

    and-int v3, v19, v3

    move/from16 p2, v0

    const/high16 v0, 0x4000000

    if-ne v3, v0, :cond_27

    const/4 v0, 0x1

    goto :goto_19

    :cond_27
    move/from16 v0, v18

    :goto_19
    or-int v0, p2, v0

    .line 243
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_29

    .line 244
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_28

    goto :goto_1a

    :cond_28
    move-object/from16 v0, p1

    goto :goto_1b

    .line 172
    :cond_29
    :goto_1a
    new-instance v0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1$1;

    const/4 v3, 0x0

    move-object/from16 p4, p1

    move-object/from16 p2, v0

    move-object/from16 p7, v3

    move-object/from16 p5, v5

    move-object/from16 p3, v8

    move-object/from16 p6, v9

    invoke-direct/range {p2 .. p7}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pointerInputModifier$1$1;-><init>(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    move-object/from16 v3, p2

    move-object/from16 v0, p4

    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 246
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 172
    :goto_1b
    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v14, v9, v0, v3}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 189
    invoke-interface {v7, v3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v8, 0x594d0b54

    .line 194
    invoke-static {v1, v8, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v6, 0x1c00000

    and-int v6, v19, v6

    const/high16 v8, 0x800000

    if-ne v6, v8, :cond_2a

    const/16 v17, 0x1

    goto :goto_1c

    :cond_2a
    move/from16 v17, v18

    .line 249
    :goto_1c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v17, :cond_2b

    .line 250
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_2c

    .line 194
    :cond_2b
    new-instance v6, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$5$1;

    invoke-direct {v6, v5, v2}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$5$1;-><init>(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;)V

    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 252
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 194
    :cond_2c
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    and-int/lit8 v5, v19, 0xe

    shr-int/lit8 v8, v19, 0x3

    and-int/lit16 v14, v8, 0x380

    or-int/2addr v5, v14

    const v14, 0xe000

    and-int/2addr v8, v14

    or-int/2addr v5, v8

    shl-int/lit8 v8, v19, 0x3

    const/high16 v14, 0x70000

    and-int/2addr v8, v14

    or-int/2addr v5, v8

    const/high16 v8, 0x380000

    and-int v8, v19, v8

    or-int v23, v5, v8

    const/16 v24, 0x380

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v22, v1

    move/from16 v18, v4

    move-object v14, v13

    move/from16 v17, v15

    move-object v13, v3

    move-object v15, v6

    .line 187
    invoke-static/range {v12 .. v24}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-RWo7tUw(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_2d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2d
    move-object v8, v2

    move-object v3, v7

    move-object v4, v14

    move/from16 v6, v16

    move/from16 v5, v17

    move/from16 v7, v18

    .line 199
    :goto_1d
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_2e

    new-instance v0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$6;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v11}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$6;-><init>(Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2e
    return-void
.end method

.method public static final ClickableText-4YKlhWE(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/text/TextStyle;",
            "ZII",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Use Text or BasicText and pass an AnnotatedString that contains a LinkAnnotation"
    .end annotation

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    const v0, -0xeb2f629

    move-object/from16 v1, p8

    .line 84
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    const-string v2, "C(ClickableText)P(7,1,6,5,4:c#ui.text.style.TextOverflow!1,3)84@3976L52,85@4085L184,100@4490L76,93@4275L297:ClickableText.kt#423gt5"

    invoke-static {v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, v10, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v9, 0x6

    move-object/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v9, 0x6

    move-object/from16 v11, p0

    if-nez v2, :cond_2

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v9

    goto :goto_1

    :cond_2
    move v2, v9

    :goto_1
    and-int/lit8 v4, v10, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v9, 0x30

    if-nez v5, :cond_5

    move-object/from16 v5, p1

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v5, p1

    :goto_4
    and-int/lit8 v6, v10, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v7, v9, 0x180

    if-nez v7, :cond_8

    move-object/from16 v7, p2

    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_5

    :cond_7
    const/16 v12, 0x80

    :goto_5
    or-int/2addr v2, v12

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v7, p2

    :goto_7
    and-int/lit8 v12, v10, 0x8

    if-eqz v12, :cond_9

    or-int/lit16 v2, v2, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v13, v9, 0xc00

    if-nez v13, :cond_b

    move/from16 v13, p3

    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_8

    :cond_a
    const/16 v14, 0x400

    :goto_8
    or-int/2addr v2, v14

    goto :goto_a

    :cond_b
    :goto_9
    move/from16 v13, p3

    :goto_a
    and-int/lit8 v14, v10, 0x10

    if-eqz v14, :cond_c

    or-int/lit16 v2, v2, 0x6000

    goto :goto_c

    :cond_c
    and-int/lit16 v15, v9, 0x6000

    if-nez v15, :cond_e

    move/from16 v15, p4

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_b

    :cond_d
    const/16 v16, 0x2000

    :goto_b
    or-int v2, v2, v16

    goto :goto_d

    :cond_e
    :goto_c
    move/from16 v15, p4

    :goto_d
    and-int/lit8 v16, v10, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_f

    or-int v2, v2, v17

    move/from16 v3, p5

    goto :goto_f

    :cond_f
    and-int v17, v9, v17

    move/from16 v3, p5

    if-nez v17, :cond_11

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_e

    :cond_10
    const/high16 v17, 0x10000

    :goto_e
    or-int v2, v2, v17

    :cond_11
    :goto_f
    and-int/lit8 v17, v10, 0x40

    const/high16 v19, 0x180000

    if-eqz v17, :cond_12

    or-int v2, v2, v19

    move-object/from16 v0, p6

    goto :goto_11

    :cond_12
    and-int v19, v9, v19

    move-object/from16 v0, p6

    if-nez v19, :cond_14

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_13

    const/high16 v20, 0x100000

    goto :goto_10

    :cond_13
    const/high16 v20, 0x80000

    :goto_10
    or-int v2, v2, v20

    :cond_14
    :goto_11
    and-int/lit16 v0, v10, 0x80

    move/from16 v20, v0

    const/high16 v21, 0xc00000

    if-eqz v20, :cond_15

    or-int v2, v2, v21

    goto :goto_13

    :cond_15
    and-int v20, v9, v21

    if-nez v20, :cond_17

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/high16 v20, 0x800000

    goto :goto_12

    :cond_16
    const/high16 v20, 0x400000

    :goto_12
    or-int v2, v2, v20

    :cond_17
    :goto_13
    const v20, 0x492493

    and-int v0, v2, v20

    const v3, 0x492492

    if-ne v0, v3, :cond_19

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_15

    .line 106
    :cond_18
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v6, p5

    move-object/from16 v21, v1

    move-object v3, v7

    move v4, v13

    move-object/from16 v7, p6

    :goto_14
    move-object v2, v5

    move v5, v15

    goto/16 :goto_19

    :cond_19
    :goto_15
    if-eqz v4, :cond_1a

    .line 77
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v5, v0

    :cond_1a
    if-eqz v6, :cond_1b

    .line 78
    sget-object v0, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v0

    move-object v7, v0

    :cond_1b
    if-eqz v12, :cond_1c

    const/4 v13, 0x1

    :cond_1c
    if-eqz v14, :cond_1d

    .line 80
    sget-object v3, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v3

    move v15, v3

    :cond_1d
    if-eqz v16, :cond_1e

    const v3, 0x7fffffff

    goto :goto_16

    :cond_1e
    move/from16 v3, p5

    :goto_16
    if-eqz v17, :cond_1f

    .line 82
    sget-object v4, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$1;->INSTANCE:Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$1;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_17

    :cond_1f
    move-object/from16 v4, p6

    :goto_17
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v6

    if-eqz v6, :cond_20

    const/4 v6, -0x1

    const-string v12, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)"

    const v14, -0xeb2f629

    .line 84
    invoke-static {v14, v2, v6, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_20
    const v6, 0x594acebc

    .line 85
    const-string v12, "CC(remember):ClickableText.kt#9igjgp"

    invoke-static {v1, v6, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 204
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .line 205
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    const/4 v0, 0x0

    if-ne v6, v14, :cond_21

    const/4 v14, 0x2

    .line 85
    invoke-static {v0, v0, v14, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v6

    .line 207
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 85
    :cond_21
    check-cast v6, Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 86
    sget-object v14, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v14, Landroidx/compose/ui/Modifier;

    const v0, 0x594adce0    # 3.5688E15f

    invoke-static {v1, v0, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v0, 0x1c00000

    and-int/2addr v0, v2

    const/16 v16, 0x0

    move/from16 p8, v2

    const/high16 v2, 0x800000

    if-ne v0, v2, :cond_22

    const/4 v0, 0x1

    goto :goto_18

    :cond_22
    move/from16 v0, v16

    .line 210
    :goto_18
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_23

    .line 211
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_24

    .line 86
    :cond_23
    new-instance v0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pressIndicator$1$1;

    const/4 v2, 0x0

    invoke-direct {v0, v6, v8, v2}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pressIndicator$1$1;-><init>(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 213
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 86
    :cond_24
    check-cast v2, Lkotlin/jvm/functions/Function2;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v14, v8, v2}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 96
    invoke-interface {v5, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v2, 0x594b0f14

    .line 101
    invoke-static {v1, v2, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/high16 v2, 0x380000

    and-int v12, p8, v2

    const/high16 v14, 0x100000

    if-ne v12, v14, :cond_25

    const/16 v16, 0x1

    .line 216
    :cond_25
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    if-nez v16, :cond_26

    .line 217
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v14

    if-ne v12, v14, :cond_27

    .line 101
    :cond_26
    new-instance v12, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$2$1;

    invoke-direct {v12, v6, v4}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$2$1;-><init>(Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;)V

    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 219
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 101
    :cond_27
    move-object v14, v12

    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v6, 0xe38e

    and-int v6, p8, v6

    const/high16 v12, 0x70000

    shl-int/lit8 v16, p8, 0x6

    and-int v12, v16, v12

    or-int/2addr v6, v12

    shl-int/lit8 v12, p8, 0x3

    and-int/2addr v2, v12

    or-int v22, v6, v2

    const/16 v23, 0x380

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v12, v0

    move-object/from16 v21, v1

    move/from16 v17, v3

    move/from16 v16, v13

    move-object v13, v7

    .line 94
    invoke-static/range {v11 .. v23}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-RWo7tUw(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_28
    move-object v7, v4

    move-object v3, v13

    move/from16 v4, v16

    move/from16 v6, v17

    goto/16 :goto_14

    .line 106
    :goto_19
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_29

    new-instance v0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$3;

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$3;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_29
    return-void
.end method

.method private static final ClickableText_03UYbkw$getOffset(Landroidx/compose/runtime/MutableState;J)Ljava/lang/Integer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;J)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    .line 167
    invoke-interface {p0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/text/TextLayoutResult;

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 168
    invoke-virtual {p0}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 169
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/text/ClickableTextKt;->containsWithinBounds-Uv8p0NA(Landroidx/compose/ui/text/MultiParagraph;J)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_1

    .line 170
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/text/MultiParagraph;->getOffsetForPosition-k-4lQ0M(J)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0
.end method

.method public static final synthetic access$ClickableText_03UYbkw$getOffset(Landroidx/compose/runtime/MutableState;J)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/text/ClickableTextKt;->ClickableText_03UYbkw$getOffset(Landroidx/compose/runtime/MutableState;J)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final containsWithinBounds-Uv8p0NA(Landroidx/compose/ui/text/MultiParagraph;J)Z
    .locals 2

    .line 255
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v0

    .line 256
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result p1

    const/4 p2, 0x0

    cmpl-float v1, v0, p2

    if-lez v1, :cond_0

    cmpl-float p2, p1, p2

    if-ltz p2, :cond_0

    .line 202
    invoke-virtual {p0}, Landroidx/compose/ui/text/MultiParagraph;->getWidth()F

    move-result p2

    cmpg-float p2, v0, p2

    if-gtz p2, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/text/MultiParagraph;->getHeight()F

    move-result p0

    cmpg-float p0, p1, p0

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
