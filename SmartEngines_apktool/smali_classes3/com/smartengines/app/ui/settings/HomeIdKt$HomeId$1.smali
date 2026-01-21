.class final Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1;
.super Ljava/lang/Object;
.source "HomeId.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/HomeIdKt;->HomeId(Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;Landroidx/compose/runtime/Composer;II)V
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
    value = "SMAP\nHomeId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeId.kt\ncom/smartengines/app/ui/settings/HomeIdKt$HomeId$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,68:1\n1225#2,6:69\n*S KotlinDebug\n*F\n+ 1 HomeId.kt\ncom/smartengines/app/ui/settings/HomeIdKt$HomeId$1\n*L\n31#1:69,6\n*E\n"
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
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $idSettings:Lcom/smartengines/app/settings/IdSettings;

.field final synthetic $idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

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
.method public static synthetic $r8$lambda$O4kJrbR4jpdz4iUqz59COtIp3vs(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1;->invoke$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Landroid/content/Context;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/smartengines/app/settings/IdSettings;",
            "Lcom/smartengines/app/settings/IdSettingsWriter;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    iput-object p4, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1;->$navigate:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$navigate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    const-string v0, "liveness"

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 24
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 4

    const-string v0, "$this$Section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C30@1206L23,30@1154L75:HomeId.kt#v86m6v"

    invoke-static {p2, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    .line 25
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_1
    :goto_0
    const p1, -0x47981b5f

    .line 25
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p1, "25@963L172"

    invoke-static {p2, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    sget-object p1, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p1}, Lcom/smartengines/app/Model;->getBuildFlavor()Lcom/smartengines/app/settings/BuildFlavor;

    move-result-object p1

    sget-object p3, Lcom/smartengines/app/settings/BuildFlavor;->FORENSIC:Lcom/smartengines/app/settings/BuildFlavor;

    const/4 v0, 0x0

    const-string v1, "getString(...)"

    if-eq p1, p3, :cond_2

    .line 27
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1;->$context:Landroid/content/Context;

    sget p3, Lcom/smartengines/app/R$string;->s_enable_forensics:I

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    iget-object p3, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {p3}, Lcom/smartengines/app/settings/IdSettings;->getEnableForensics()Z

    move-result p3

    new-instance v2, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1$1;

    iget-object v3, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1;->$idSettingsWriter:Lcom/smartengines/app/settings/IdSettingsWriter;

    invoke-direct {v2, v3}, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1$1;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 26
    invoke-static {p1, p3, v2, p2, v0}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    :cond_2
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 31
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1;->$context:Landroid/content/Context;

    sget p3, Lcom/smartengines/app/R$string;->s_liveness:I

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, -0x4797f679

    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p3, "CC(remember):HomeId.kt#9igjgp"

    invoke-static {p2, p3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    iget-object p3, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1;->$navigate:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p3

    iget-object v1, p0, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1;->$navigate:Lkotlin/jvm/functions/Function1;

    .line 69
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez p3, :cond_3

    .line 70
    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p3

    if-ne v2, p3, :cond_4

    .line 31
    :cond_3
    new-instance v2, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1}, Lcom/smartengines/app/ui/settings/HomeIdKt$HomeId$1$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 72
    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 31
    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {p1, v2, p2, v0}, Lcom/smartengines/app/ui/settings/FragmentsKt;->LinkRow(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
