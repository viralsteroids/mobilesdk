.class public interface abstract Lcom/smartengines/app/settings/IdSettingsWriter;
.super Ljava/lang/Object;
.source "IdSettings.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0008H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0008H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0008H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0008H&J\u0008\u0010\u000c\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0008H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0008H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0014H&\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/smartengines/app/settings/IdSettingsWriter;",
        "",
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


# virtual methods
.method public abstract resetInstrCountDelta()V
.end method

.method public abstract writeAlwaysPass(Z)V
.end method

.method public abstract writeEnableForensics(Z)V
.end method

.method public abstract writeEnableVisualization(Z)V
.end method

.method public abstract writeFlashByDefault(Z)V
.end method

.method public abstract writeHideChecksFilter(Ljava/lang/String;)V
.end method

.method public abstract writeInstrCount(I)V
.end method

.method public abstract writeInstrCountDelta(I)V
.end method

.method public abstract writeInstrFailed(I)V
.end method

.method public abstract writeMaxInstrTime(I)V
.end method

.method public abstract writeMinInstrTime(I)V
.end method

.method public abstract writeMinPassTime(I)V
.end method

.method public abstract writeShowChecksFilter(Ljava/lang/String;)V
.end method

.method public abstract writeShowUndefChecks(Z)V
.end method

.method public abstract writeVauthEnabled(Z)V
.end method
