.class Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;
.super Ljava/lang/Object;
.source "SurfaceViewImplementation.java"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/view/SurfaceViewImplementation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SurfaceRequestCallback"
.end annotation


# instance fields
.field private mCurrentSurfaceSize:Landroid/util/Size;

.field private mNeedToInvalidate:Z

.field private mOnSurfaceNotInUseListener:Landroidx/camera/view/PreviewViewImplementation$OnSurfaceNotInUseListener;

.field private mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

.field private mSurfaceRequestToBeInvalidated:Landroidx/camera/core/SurfaceRequest;

.field private mTargetSize:Landroid/util/Size;

.field private mWasSurfaceProvided:Z

.field final synthetic this$0:Landroidx/camera/view/SurfaceViewImplementation;


# direct methods
.method constructor <init>(Landroidx/camera/view/SurfaceViewImplementation;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    .line 181
    iput-object p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->this$0:Landroidx/camera/view/SurfaceViewImplementation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 206
    iput-boolean p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mWasSurfaceProvided:Z

    .line 208
    iput-boolean p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mNeedToInvalidate:Z

    return-void
.end method

.method private canProvideSurface()Z
    .locals 2

    .line 275
    iget-boolean v0, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mWasSurfaceProvided:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mTargetSize:Landroid/util/Size;

    iget-object v1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mCurrentSurfaceSize:Landroid/util/Size;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private cancelPreviousRequest()V
    .locals 2

    .line 282
    iget-object v0, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    if-eqz v0, :cond_0

    .line 283
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Request canceled: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SurfaceViewImpl"

    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    iget-object v0, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    invoke-virtual {v0}, Landroidx/camera/core/SurfaceRequest;->willNotProvideSurface()Z

    :cond_0
    return-void
.end method

.method private closeSurface()V
    .locals 2

    .line 291
    iget-object v0, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    if-eqz v0, :cond_0

    .line 292
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Surface closed "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SurfaceViewImpl"

    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    iget-object v0, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    invoke-virtual {v0}, Landroidx/camera/core/SurfaceRequest;->getDeferrableSurface()Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->close()V

    :cond_0
    return-void
.end method

.method static synthetic lambda$tryToComplete$0(Landroidx/camera/view/PreviewViewImplementation$OnSurfaceNotInUseListener;Landroidx/camera/core/SurfaceRequest$Result;)V
    .locals 1

    .line 261
    const-string p1, "SurfaceViewImpl"

    const-string v0, "Safe to release surface."

    invoke-static {p1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 263
    invoke-interface {p0}, Landroidx/camera/view/PreviewViewImplementation$OnSurfaceNotInUseListener;->onSurfaceNotInUse()V

    :cond_0
    return-void
.end method

.method private tryToComplete()Z
    .locals 5

    .line 253
    iget-object v0, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->this$0:Landroidx/camera/view/SurfaceViewImplementation;

    iget-object v0, v0, Landroidx/camera/view/SurfaceViewImplementation;->mSurfaceView:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    .line 254
    invoke-direct {p0}, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->canProvideSurface()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 255
    const-string v1, "SurfaceViewImpl"

    const-string v2, "Surface set on Preview."

    invoke-static {v1, v2}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    iget-object v1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mOnSurfaceNotInUseListener:Landroidx/camera/view/PreviewViewImplementation$OnSurfaceNotInUseListener;

    .line 258
    iget-object v2, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/SurfaceRequest;

    iget-object v3, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->this$0:Landroidx/camera/view/SurfaceViewImplementation;

    iget-object v3, v3, Landroidx/camera/view/SurfaceViewImplementation;->mSurfaceView:Landroid/view/SurfaceView;

    .line 259
    invoke-virtual {v3}, Landroid/view/SurfaceView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object v3

    new-instance v4, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback$$ExternalSyntheticLambda0;

    invoke-direct {v4, v1}, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback$$ExternalSyntheticLambda0;-><init>(Landroidx/camera/view/PreviewViewImplementation$OnSurfaceNotInUseListener;)V

    .line 258
    invoke-virtual {v2, v0, v3, v4}, Landroidx/camera/core/SurfaceRequest;->provideSurface(Landroid/view/Surface;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V

    const/4 v0, 0x1

    .line 267
    iput-boolean v0, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mWasSurfaceProvided:Z

    .line 268
    iget-object v1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->this$0:Landroidx/camera/view/SurfaceViewImplementation;

    invoke-virtual {v1}, Landroidx/camera/view/SurfaceViewImplementation;->onSurfaceProvided()V

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method setSurfaceRequest(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/view/PreviewViewImplementation$OnSurfaceNotInUseListener;)V
    .locals 2

    .line 218
    invoke-direct {p0}, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->cancelPreviousRequest()V

    .line 220
    iget-boolean v0, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mNeedToInvalidate:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 228
    iput-boolean v1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mNeedToInvalidate:Z

    .line 229
    invoke-virtual {p1}, Landroidx/camera/core/SurfaceRequest;->invalidate()Z

    return-void

    .line 231
    :cond_0
    iput-object p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    .line 232
    iput-object p2, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mOnSurfaceNotInUseListener:Landroidx/camera/view/PreviewViewImplementation$OnSurfaceNotInUseListener;

    .line 233
    invoke-virtual {p1}, Landroidx/camera/core/SurfaceRequest;->getResolution()Landroid/util/Size;

    move-result-object p1

    .line 234
    iput-object p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mTargetSize:Landroid/util/Size;

    .line 235
    iput-boolean v1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mWasSurfaceProvided:Z

    .line 237
    invoke-direct {p0}, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->tryToComplete()Z

    move-result p2

    if-nez p2, :cond_1

    .line 239
    const-string p2, "SurfaceViewImpl"

    const-string v0, "Wait for new Surface creation."

    invoke-static {p2, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    iget-object p2, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->this$0:Landroidx/camera/view/SurfaceViewImplementation;

    iget-object p2, p2, Landroidx/camera/view/SurfaceViewImplementation;->mSurfaceView:Landroid/view/SurfaceView;

    invoke-virtual {p2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p2

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    .line 241
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    .line 240
    invoke-interface {p2, v0, p1}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    :cond_1
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    .line 313
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Surface changed. Size: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string/jumbo p2, "x"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "SurfaceViewImpl"

    invoke-static {p2, p1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    new-instance p1, Landroid/util/Size;

    invoke-direct {p1, p3, p4}, Landroid/util/Size;-><init>(II)V

    iput-object p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mCurrentSurfaceSize:Landroid/util/Size;

    .line 315
    invoke-direct {p0}, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->tryToComplete()Z

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 299
    const-string p1, "SurfaceViewImpl"

    const-string v0, "Surface created."

    invoke-static {p1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    iget-boolean p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mNeedToInvalidate:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mSurfaceRequestToBeInvalidated:Landroidx/camera/core/SurfaceRequest;

    if-eqz p1, :cond_0

    .line 304
    invoke-virtual {p1}, Landroidx/camera/core/SurfaceRequest;->invalidate()Z

    const/4 p1, 0x0

    .line 305
    iput-object p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mSurfaceRequestToBeInvalidated:Landroidx/camera/core/SurfaceRequest;

    const/4 p1, 0x0

    .line 306
    iput-boolean p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mNeedToInvalidate:Z

    :cond_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 320
    const-string p1, "SurfaceViewImpl"

    const-string v0, "Surface destroyed."

    invoke-static {p1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    iget-boolean p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mWasSurfaceProvided:Z

    if-eqz p1, :cond_0

    .line 325
    invoke-direct {p0}, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->closeSurface()V

    goto :goto_0

    .line 327
    :cond_0
    invoke-direct {p0}, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->cancelPreviousRequest()V

    :goto_0
    const/4 p1, 0x1

    .line 332
    iput-boolean p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mNeedToInvalidate:Z

    .line 333
    iget-object p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    if-eqz p1, :cond_1

    .line 334
    iput-object p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mSurfaceRequestToBeInvalidated:Landroidx/camera/core/SurfaceRequest;

    :cond_1
    const/4 p1, 0x0

    .line 338
    iput-boolean p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mWasSurfaceProvided:Z

    const/4 p1, 0x0

    .line 339
    iput-object p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    .line 340
    iput-object p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mOnSurfaceNotInUseListener:Landroidx/camera/view/PreviewViewImplementation$OnSurfaceNotInUseListener;

    .line 341
    iput-object p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mCurrentSurfaceSize:Landroid/util/Size;

    .line 342
    iput-object p1, p0, Landroidx/camera/view/SurfaceViewImplementation$SurfaceRequestCallback;->mTargetSize:Landroid/util/Size;

    return-void
.end method
