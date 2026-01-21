.class public final Lcom/smartengines/nfc/NfcAdapterWrapper;
.super Ljava/lang/Object;
.source "NfcAdapterWrapper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/smartengines/nfc/NfcAdapterWrapper;",
        "",
        "<init>",
        "()V",
        "enableNfcReceiving",
        "Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;",
        "activity",
        "Landroid/app/Activity;",
        "enable",
        "",
        "getIsoDepTag",
        "Landroid/nfc/Tag;",
        "intent",
        "Landroid/content/Intent;",
        "ActivationResult",
        "nfc_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/smartengines/nfc/NfcAdapterWrapper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/nfc/NfcAdapterWrapper;

    invoke-direct {v0}, Lcom/smartengines/nfc/NfcAdapterWrapper;-><init>()V

    sput-object v0, Lcom/smartengines/nfc/NfcAdapterWrapper;->INSTANCE:Lcom/smartengines/nfc/NfcAdapterWrapper;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final enableNfcReceiving(Landroid/app/Activity;Z)Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;
    .locals 5

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    move-object v0, p1

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Landroid/nfc/NfcAdapter;->getDefaultAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 26
    invoke-virtual {v1}, Landroid/nfc/NfcAdapter;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_0

    sget-object p1, Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;->ERROR_DISABLED:Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;

    return-object p1

    .line 27
    :cond_0
    const-string v2, "myapp.NfcAdapterWrapper"

    if-eqz p2, :cond_1

    .line 28
    const-string p2, ">>> enable NFC Receiving"

    invoke-static {v2, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    new-instance p2, Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-direct {p2, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v2, 0x20000000

    .line 30
    invoke-virtual {p2, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const/high16 v2, 0x2000000

    const/4 v3, 0x0

    .line 32
    invoke-static {v0, v3, p2, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p2

    const/4 v0, 0x1

    .line 33
    new-array v2, v0, [[Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/String;

    const-string v4, "android.nfc.tech.IsoDep"

    aput-object v4, v0, v3

    aput-object v0, v2, v3

    const/4 v0, 0x0

    .line 34
    invoke-virtual {v1, p1, p2, v0, v2}, Landroid/nfc/NfcAdapter;->enableForegroundDispatch(Landroid/app/Activity;Landroid/app/PendingIntent;[Landroid/content/IntentFilter;[[Ljava/lang/String;)V

    goto :goto_0

    .line 36
    :cond_1
    const-string p2, "<<< disable NFC Receiving"

    invoke-static {v2, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    invoke-virtual {v1, p1}, Landroid/nfc/NfcAdapter;->disableForegroundDispatch(Landroid/app/Activity;)V

    .line 39
    :goto_0
    sget-object p1, Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;->SUCCESS:Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;

    return-object p1

    .line 41
    :cond_2
    sget-object p1, Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;->ERROR_NOT_SUPPORTED:Lcom/smartengines/nfc/NfcAdapterWrapper$ActivationResult;

    return-object p1
.end method

.method public final getIsoDepTag(Landroid/content/Intent;)Landroid/nfc/Tag;
    .locals 3

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getPassportTag "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.NfcAdapterWrapper"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    const-string v0, "android.nfc.action.TECH_DISCOVERED"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 47
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "android.nfc.extra.TAG"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/nfc/Tag;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    .line 48
    invoke-virtual {p1}, Landroid/nfc/Tag;->getTechList()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v2, "android.nfc.tech.IsoDep"

    invoke-static {v0, v2}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    return-object p1

    :cond_1
    return-object v1
.end method
