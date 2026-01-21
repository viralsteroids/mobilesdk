.class final Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1;
.super Ljava/lang/Object;
.source "Fragments.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt;
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


# static fields
.field public static final INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1;


# direct methods
.method public static synthetic $r8$lambda$3ukpxRPgWczUPrqC75zBgjZKf48()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1;->invoke$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$JXrh1ehqAoi0u24_IKtfXMf0aUk(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1;->invoke$lambda$3(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ZFdHuBwtOQToPMyivgGy8zFMGn0(I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1;->invoke$lambda$1(I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$dOC2AMnq9xcAmWCiSxROz17jsW4(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1;->invoke$lambda$2(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1;->INSTANCE:Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 202
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$1(I)Lkotlin/Unit;
    .locals 0

    .line 203
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$2(Z)Lkotlin/Unit;
    .locals 0

    .line 204
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$3(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 201
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    const-string v0, "$this$Section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "C201@6348L23,202@6388L43,203@6448L33,204@6498L34:Fragments.kt#v86m6v"

    invoke-static {p2, p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    .line 202
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 205
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 202
    :cond_1
    :goto_0
    new-instance p1, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1$$ExternalSyntheticLambda0;

    invoke-direct {p1}, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1$$ExternalSyntheticLambda0;-><init>()V

    const/16 p3, 0x36

    const-string v0, "Link row"

    invoke-static {v0, p1, p2, p3}, Lcom/smartengines/app/ui/settings/FragmentsKt;->LinkRow(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 203
    new-instance v6, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1$$ExternalSyntheticLambda1;

    invoke-direct {v6}, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1$$ExternalSyntheticLambda1;-><init>()V

    const v9, 0x36db6

    const/16 v10, 0x40

    const-string v1, "Int row"

    const/16 v2, 0xd

    const/4 v3, 0x0

    const/16 v4, 0xd

    const/4 v5, 0x1

    const/4 v7, 0x0

    move-object v8, p2

    invoke-static/range {v1 .. v10}, Lcom/smartengines/app/ui/settings/FragmentsKt;->IntRow(Ljava/lang/String;IIIILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    .line 204
    new-instance p1, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1$$ExternalSyntheticLambda2;

    invoke-direct {p1}, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1$$ExternalSyntheticLambda2;-><init>()V

    const-string p2, "Boolean row"

    const/4 p3, 0x1

    const/16 v0, 0x1b6

    invoke-static {p2, p3, p1, v8, v0}, Lcom/smartengines/app/ui/settings/FragmentsKt;->BooleanRow(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 205
    new-instance p1, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1$$ExternalSyntheticLambda3;

    invoke-direct {p1}, Lcom/smartengines/app/ui/settings/ComposableSingletons$FragmentsKt$lambda-4$1$$ExternalSyntheticLambda3;-><init>()V

    const-string p2, "String row"

    const-string/jumbo p3, "value"

    invoke-static {p2, p3, p1, v8, v0}, Lcom/smartengines/app/ui/settings/FragmentsKt;->StringRow(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
