.class final Lcom/smartengines/app/ui/results/ComposableSingletons$NfcScreenKt$lambda-9$1;
.super Ljava/lang/Object;
.source "NfcScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/ui/results/ComposableSingletons$NfcScreenKt;
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
.field public static final INSTANCE:Lcom/smartengines/app/ui/results/ComposableSingletons$NfcScreenKt$lambda-9$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/ui/results/ComposableSingletons$NfcScreenKt$lambda-9$1;

    invoke-direct {v0}, Lcom/smartengines/app/ui/results/ComposableSingletons$NfcScreenKt$lambda-9$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/ui/results/ComposableSingletons$NfcScreenKt$lambda-9$1;->INSTANCE:Lcom/smartengines/app/ui/results/ComposableSingletons$NfcScreenKt$lambda-9$1;

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

    .line 146
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/results/ComposableSingletons$NfcScreenKt$lambda-9$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 1

    const-string v0, "C146@4834L58:NfcScreen.kt#4ipo3i"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 147
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_1
    :goto_0
    new-instance p2, Lcom/smartengines/nfc/PassportReaderState$Error;

    const-string v0, "Data reading error"

    invoke-direct {p2, v0}, Lcom/smartengines/nfc/PassportReaderState$Error;-><init>(Ljava/lang/String;)V

    check-cast p2, Lcom/smartengines/nfc/PassportReaderState;

    const/16 v0, 0x8

    invoke-static {p2, p1, v0}, Lcom/smartengines/app/ui/results/NfcScreenKt;->NfcScreen(Lcom/smartengines/nfc/PassportReaderState;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
