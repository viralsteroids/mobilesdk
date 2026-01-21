.class final Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;
.super Ljava/lang/Object;
.source "Home.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/HomeKt;->SettingsHome(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/DocSettings;Lcom/smartengines/app/settings/TextSettings;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nHome.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Home.kt\ncom/smartengines/app/ui/settings/HomeKt$SettingsHome$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,105:1\n149#2:106\n*S KotlinDebug\n*F\n+ 1 Home.kt\ncom/smartengines/app/ui/settings/HomeKt$SettingsHome$1\n*L\n67#1:106\n*E\n"
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

.field final synthetic $commonSettings:Lcom/smartengines/app/settings/CommonSettings;

.field final synthetic $docSettings:Lcom/smartengines/app/settings/DocSettings;

.field final synthetic $idSettings:Lcom/smartengines/app/settings/IdSettings;

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

.field final synthetic $textSettings:Lcom/smartengines/app/settings/TextSettings;


# direct methods
.method constructor <init>(Lcom/smartengines/app/settings/CommonSettings;Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/DocSettings;Lcom/smartengines/app/settings/TextSettings;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/app/settings/CommonSettings;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/smartengines/app/settings/CodeSettings;",
            "Lcom/smartengines/app/settings/IdSettings;",
            "Lcom/smartengines/app/settings/DocSettings;",
            "Lcom/smartengines/app/settings/TextSettings;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->$commonSettings:Lcom/smartengines/app/settings/CommonSettings;

    iput-object p2, p0, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->$navigate:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    iput-object p4, p0, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    iput-object p5, p0, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->$docSettings:Lcom/smartengines/app/settings/DocSettings;

    iput-object p6, p0, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->$textSettings:Lcom/smartengines/app/settings/TextSettings;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 47
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const-string v0, "$this$SettingsScaffold"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C48@1880L26,50@1916L34,58@2274L20,60@2304L32,66@2484L30:Home.kt#v86m6v"

    invoke-static {p2, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    .line 49
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 67
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 49
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->$commonSettings:Lcom/smartengines/app/settings/CommonSettings;

    sget v4, Lcom/smartengines/app/settings/CommonSettings;->$stable:I

    const/4 v5, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lcom/smartengines/app/ui/settings/HomeCommonKt;->HomeCommon(Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CommonSettingWriter;Lcom/smartengines/app/settings/BuildFlavor;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v3

    .line 51
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->$navigate:Lkotlin/jvm/functions/Function1;

    iget-object p2, p0, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    const/16 p3, 0x40

    invoke-static {p1, p2, v9, p3}, Lcom/smartengines/app/ui/settings/HomeCodeKt;->HomeCode(Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/CodeSettings;Landroidx/compose/runtime/Composer;I)V

    const p1, -0x12b2d918

    invoke-interface {v9, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p1, "53@2066L28"

    invoke-static {v9, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const/4 p1, 0x3

    .line 53
    new-array p2, p1, [Lcom/smartengines/app/settings/BuildFlavor;

    sget-object p3, Lcom/smartengines/app/settings/BuildFlavor;->NIGHTLY:Lcom/smartengines/app/settings/BuildFlavor;

    const/4 v0, 0x0

    aput-object p3, p2, v0

    sget-object p3, Lcom/smartengines/app/settings/BuildFlavor;->BETA:Lcom/smartengines/app/settings/BuildFlavor;

    const/4 v1, 0x1

    aput-object p3, p2, v1

    sget-object p3, Lcom/smartengines/app/settings/BuildFlavor;->FORENSIC:Lcom/smartengines/app/settings/BuildFlavor;

    const/4 v2, 0x2

    aput-object p3, p2, v2

    invoke-static {p2}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p2

    sget-object p3, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p3}, Lcom/smartengines/app/Model;->getBuildFlavor()Lcom/smartengines/app/settings/BuildFlavor;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 54
    iget-object v6, p0, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->$navigate:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->$idSettings:Lcom/smartengines/app/settings/IdSettings;

    sget p2, Lcom/smartengines/app/settings/IdSettings;->$stable:I

    shl-int/lit8 v10, p2, 0x3

    const/4 v11, 0x4

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lcom/smartengines/app/ui/settings/HomeIdKt;->HomeId(Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/IdSettings;Lcom/smartengines/app/settings/IdSettingsWriter;Landroidx/compose/runtime/Composer;II)V

    :cond_2
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 59
    iget-object p2, p0, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->$docSettings:Lcom/smartengines/app/settings/DocSettings;

    const/4 p3, 0x0

    sget v3, Lcom/smartengines/app/settings/DocSettings;->$stable:I

    invoke-static {p2, p3, v9, v3, v2}, Lcom/smartengines/app/ui/settings/HomeDocKt;->HomeDoc(Lcom/smartengines/app/settings/DocSettings;Lcom/smartengines/app/settings/DocSettingsWriter;Landroidx/compose/runtime/Composer;II)V

    .line 61
    iget-object v6, p0, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->$navigate:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lcom/smartengines/app/ui/settings/HomeKt$SettingsHome$1;->$textSettings:Lcom/smartengines/app/settings/TextSettings;

    sget p2, Lcom/smartengines/app/settings/TextSettings;->$stable:I

    shl-int/lit8 v10, p2, 0x3

    const/4 v11, 0x4

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lcom/smartengines/app/ui/settings/HomeTextKt;->HomeText(Lkotlin/jvm/functions/Function1;Lcom/smartengines/app/settings/TextSettings;Lcom/smartengines/app/settings/TextSettingsWriter;Landroidx/compose/runtime/Composer;II)V

    const p2, -0x12b2a988

    invoke-interface {v9, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string p2, "63@2452L12"

    invoke-static {v9, p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 63
    new-array p1, p1, [Lcom/smartengines/app/settings/BuildFlavor;

    sget-object p2, Lcom/smartengines/app/settings/BuildFlavor;->NIGHTLY:Lcom/smartengines/app/settings/BuildFlavor;

    aput-object p2, p1, v0

    sget-object p2, Lcom/smartengines/app/settings/BuildFlavor;->BETA:Lcom/smartengines/app/settings/BuildFlavor;

    aput-object p2, p1, v1

    sget-object p2, Lcom/smartengines/app/settings/BuildFlavor;->FORENSIC:Lcom/smartengines/app/settings/BuildFlavor;

    aput-object p2, p1, v2

    invoke-static {p1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    sget-object p2, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p2}, Lcom/smartengines/app/Model;->getBuildFlavor()Lcom/smartengines/app/settings/BuildFlavor;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 64
    invoke-static {v9, v0}, Lcom/smartengines/app/ui/settings/HomeImagesKt;->HomeImages(Landroidx/compose/runtime/Composer;I)V

    :cond_3
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 67
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p1, Landroidx/compose/ui/Modifier;

    const/16 p2, 0x14

    int-to-float p2, p2

    .line 106
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p2

    .line 67
    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/4 p2, 0x6

    invoke-static {p1, v9, p2}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
