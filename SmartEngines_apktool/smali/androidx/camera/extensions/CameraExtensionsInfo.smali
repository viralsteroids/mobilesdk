.class public interface abstract Landroidx/camera/extensions/CameraExtensionsInfo;
.super Ljava/lang/Object;
.source "CameraExtensionsInfo.java"


# virtual methods
.method public getCurrentExtensionMode()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getExtensionStrength()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public isCurrentExtensionModeAvailable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isExtensionStrengthAvailable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
