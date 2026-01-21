.class public final Landroidx/camera/core/LayoutSettings$Builder;
.super Ljava/lang/Object;
.source "LayoutSettings.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/LayoutSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private mAlpha:F

.field private mHeight:F

.field private mOffsetX:F

.field private mOffsetY:F

.field private mWidth:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 113
    iput v0, p0, Landroidx/camera/core/LayoutSettings$Builder;->mAlpha:F

    const/4 v0, 0x0

    .line 114
    iput v0, p0, Landroidx/camera/core/LayoutSettings$Builder;->mOffsetX:F

    .line 115
    iput v0, p0, Landroidx/camera/core/LayoutSettings$Builder;->mOffsetY:F

    .line 116
    iput v0, p0, Landroidx/camera/core/LayoutSettings$Builder;->mWidth:F

    .line 117
    iput v0, p0, Landroidx/camera/core/LayoutSettings$Builder;->mHeight:F

    return-void
.end method


# virtual methods
.method public build()Landroidx/camera/core/LayoutSettings;
    .locals 7

    .line 187
    new-instance v0, Landroidx/camera/core/LayoutSettings;

    iget v1, p0, Landroidx/camera/core/LayoutSettings$Builder;->mAlpha:F

    iget v2, p0, Landroidx/camera/core/LayoutSettings$Builder;->mOffsetX:F

    iget v3, p0, Landroidx/camera/core/LayoutSettings$Builder;->mOffsetY:F

    iget v4, p0, Landroidx/camera/core/LayoutSettings$Builder;->mWidth:F

    iget v5, p0, Landroidx/camera/core/LayoutSettings$Builder;->mHeight:F

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Landroidx/camera/core/LayoutSettings;-><init>(FFFFFLandroidx/camera/core/LayoutSettings$1;)V

    return-object v0
.end method

.method public setAlpha(F)Landroidx/camera/core/LayoutSettings$Builder;
    .locals 0

    .line 128
    iput p1, p0, Landroidx/camera/core/LayoutSettings$Builder;->mAlpha:F

    return-object p0
.end method

.method public setHeight(F)Landroidx/camera/core/LayoutSettings$Builder;
    .locals 0

    .line 176
    iput p1, p0, Landroidx/camera/core/LayoutSettings$Builder;->mHeight:F

    return-object p0
.end method

.method public setOffsetX(F)Landroidx/camera/core/LayoutSettings$Builder;
    .locals 0

    .line 140
    iput p1, p0, Landroidx/camera/core/LayoutSettings$Builder;->mOffsetX:F

    return-object p0
.end method

.method public setOffsetY(F)Landroidx/camera/core/LayoutSettings$Builder;
    .locals 0

    .line 152
    iput p1, p0, Landroidx/camera/core/LayoutSettings$Builder;->mOffsetY:F

    return-object p0
.end method

.method public setWidth(F)Landroidx/camera/core/LayoutSettings$Builder;
    .locals 0

    .line 164
    iput p1, p0, Landroidx/camera/core/LayoutSettings$Builder;->mWidth:F

    return-object p0
.end method
