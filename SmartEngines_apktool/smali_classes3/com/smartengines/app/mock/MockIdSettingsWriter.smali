.class public final Lcom/smartengines/app/mock/MockIdSettingsWriter;
.super Ljava/lang/Object;
.source "MockSettingWriter.kt"

# interfaces
.implements Lcom/smartengines/app/settings/IdSettingsWriter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0010\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0008\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0016H\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/smartengines/app/mock/MockIdSettingsWriter;",
        "Lcom/smartengines/app/settings/IdSettingsWriter;",
        "<init>",
        "()V",
        "writeVauthEnabled",
        "",
        "value",
        "",
        "writeEnableForensics",
        "writeMinInstrTime",
        "",
        "writeMaxInstrTime",
        "writeInstrCount",
        "writeInstrCountDelta",
        "resetInstrCountDelta",
        "writeInstrFailed",
        "writeAlwaysPass",
        "writeMinPassTime",
        "writeEnableVisualization",
        "writeFlashByDefault",
        "writeShowUndefChecks",
        "writeShowChecksFilter",
        "",
        "writeHideChecksFilter",
        "app_storeRelease"
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
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public resetInstrCountDelta()V
    .locals 0

    return-void
.end method

.method public writeAlwaysPass(Z)V
    .locals 0

    return-void
.end method

.method public writeEnableForensics(Z)V
    .locals 0

    return-void
.end method

.method public writeEnableVisualization(Z)V
    .locals 0

    return-void
.end method

.method public writeFlashByDefault(Z)V
    .locals 0

    return-void
.end method

.method public writeHideChecksFilter(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public writeInstrCount(I)V
    .locals 0

    return-void
.end method

.method public writeInstrCountDelta(I)V
    .locals 0

    return-void
.end method

.method public writeInstrFailed(I)V
    .locals 0

    return-void
.end method

.method public writeMaxInstrTime(I)V
    .locals 0

    return-void
.end method

.method public writeMinInstrTime(I)V
    .locals 0

    return-void
.end method

.method public writeMinPassTime(I)V
    .locals 0

    return-void
.end method

.method public writeShowChecksFilter(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public writeShowUndefChecks(Z)V
    .locals 0

    return-void
.end method

.method public writeVauthEnabled(Z)V
    .locals 0

    return-void
.end method
