.class final Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;
.super Ljava/lang/Object;
.source "Barcodes.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBarcodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Barcodes.kt\ncom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,152:1\n1225#2,6:153\n149#3:159\n*S KotlinDebug\n*F\n+ 1 Barcodes.kt\ncom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1\n*L\n32#1:153,6\n56#1:159\n*E\n"
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
.field final synthetic $codeSettings:Lcom/smartengines/app/settings/CodeSettings;

.field final synthetic $codeWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $navigate:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$_TZh7WkDn0gTzQAjoRZUWeUzcYA(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->invoke$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/CodeSettingsWriter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/smartengines/app/settings/CodeSettings;",
            "Lcom/smartengines/app/settings/CodeSettingsWriter;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$navigate:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    iput-object p4, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$codeWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$navigate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    const-string v0, "barcode-types"

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 31
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const-string v0, "$this$Section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "C31@1270L27,31@1217L80,32@1310L177,37@1500L206,42@1719L218,47@1950L162,51@2125L159,55@2297L29,56@2339L174:Barcodes.kt#v86m6v"

    invoke-static {p2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x51

    const/16 v1, 0x10

    if-ne v0, v1, :cond_1

    .line 32
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 60
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 32
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_barcode_types:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v10, "getString(...)"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x289062a6    # 1.6029993E-14f

    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "CC(remember):Barcodes.kt#9igjgp"

    invoke-static {p2, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$navigate:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$navigate:Lkotlin/jvm/functions/Function1;

    .line 153
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_2

    .line 154
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_3

    .line 32
    :cond_2
    new-instance v3, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v3, v2}, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 156
    invoke-interface {p2, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 32
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v11, 0x0

    invoke-static {v0, v3, p2, v11}, Lcom/smartengines/app/ui/settings/FragmentsKt;->LinkRow(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 34
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_max_barcodes:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CodeSettings;->getBarcodeMax()I

    move-result v1

    .line 36
    new-instance v2, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1$2;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$codeWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1$2;-><init>(Ljava/lang/Object;)V

    move-object v5, v2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v8, 0x6d80

    const/16 v9, 0x40

    const/4 v2, 0x0

    const/16 v3, 0x32

    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v7, p2

    .line 33
    invoke-static/range {v0 .. v9}, Lcom/smartengines/app/ui/settings/FragmentsKt;->IntRow(Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    .line 39
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_barcode_roi:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CodeSettings;->getBarcodeRoi()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1$3;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$codeWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1$3;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 41
    sget-object v3, Lcom/smartengines/dictionaries/CodeDictionaries;->INSTANCE:Lcom/smartengines/dictionaries/CodeDictionaries;

    invoke-virtual {v3}, Lcom/smartengines/dictionaries/CodeDictionaries;->getBarcodeRoiList()Ljava/util/List;

    move-result-object v3

    const/16 v5, 0x1000

    move-object v4, p2

    .line 38
    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/settings/ListSelectorsKt;->SingleFromList(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    .line 44
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_barcode_effort:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CodeSettings;->getBarcodeEffort()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1$4;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$codeWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1$4;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 46
    sget-object v3, Lcom/smartengines/dictionaries/CodeDictionaries;->INSTANCE:Lcom/smartengines/dictionaries/CodeDictionaries;

    invoke-virtual {v3}, Lcom/smartengines/dictionaries/CodeDictionaries;->getBarcodeEffortList()Ljava/util/List;

    move-result-object v3

    .line 43
    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/settings/ListSelectorsKt;->SingleFromList(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    .line 49
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_barcode_decode:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CodeSettings;->getBarcodeDecode()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1$5;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$codeWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1$5;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 48
    invoke-static {v0, v1, v2, p2, v11}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 53
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_barcode_smart:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CodeSettings;->getBarcodeSmart()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1$6;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$codeWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1$6;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 52
    invoke-static {v0, v1, v2, p2, v11}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 56
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/4 v1, 0x5

    int-to-float v1, v1

    .line 159
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 56
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p2, v1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 58
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$context:Landroid/content/Context;

    sget v1, Lcom/smartengines/app/R$string;->s_barcode_nonpayment:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    iget-object v1, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    invoke-virtual {v1}, Lcom/smartengines/app/settings/CodeSettings;->getBarcodeNonpayment()Z

    move-result v1

    new-instance v2, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1$7;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1;->$codeWriter:Lcom/smartengines/app/settings/CodeSettingsWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/BarcodesKt$SettingsBarcodes$1$1$7;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 57
    invoke-static {v0, v1, v2, p2, v11}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
