.class final Lcom/smartengines/app/ui/settings/ContainersKt$SettingsContainers$1$1;
.super Ljava/lang/Object;
.source "Containers.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/settings/ContainersKt$SettingsContainers$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
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


# direct methods
.method constructor <init>(Lcom/smartengines/app/settings/CodeSettings;)V
    .locals 0

    iput-object p1, p0, Lcom/smartengines/app/ui/settings/ContainersKt$SettingsContainers$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 20
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/ContainersKt$SettingsContainers$1$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const-string v0, "$this$Section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C20@692L185:Containers.kt#v86m6v"

    invoke-static {p2, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    .line 21
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 25
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 23
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/smartengines/app/ui/settings/ContainersKt$SettingsContainers$1$1;->$codeSettings:Lcom/smartengines/app/settings/CodeSettings;

    invoke-virtual {p1}, Lcom/smartengines/app/settings/CodeSettings;->getContainerMax()I

    move-result v1

    .line 24
    new-instance p1, Lcom/smartengines/app/ui/settings/ContainersKt$SettingsContainers$1$1$1;

    invoke-static {}, Lcom/smartengines/app/AppKt;->getCodeSettingsStore()Lcom/smartengines/app/settings/CodeSettingsStore;

    move-result-object p3

    invoke-direct {p1, p3}, Lcom/smartengines/app/ui/settings/ContainersKt$SettingsContainers$1$1$1;-><init>(Ljava/lang/Object;)V

    move-object v5, p1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v8, 0x6d86

    const/16 v9, 0x40

    .line 21
    const-string/jumbo v0, "\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u043e\u0435 \u0447\u0438\u0441\u043b\u043e \u0443\u043d\u0438\u043a\u0430\u043b\u044c\u043d\u044b\u0445 \u043e\u0431\u044a\u0435\u043a\u0442\u043e\u0432"

    const/4 v2, 0x0

    const/16 v3, 0x32

    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v7, p2

    invoke-static/range {v0 .. v9}, Lcom/smartengines/app/ui/settings/FragmentsKt;->IntRow(Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    return-void
.end method
