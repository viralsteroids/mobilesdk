.class public final Lcom/smartengines/app/ImageSaver;
.super Ljava/lang/Object;
.source "ImageSaver.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/app/ImageSaver$ChannelData;,
        Lcom/smartengines/app/ImageSaver$Dir;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\t\u0008\u0003\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/smartengines/app/ImageSaver;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "FILE_EXT",
        "MIME_TYPE",
        "IMAGE_DIR",
        "Lcom/smartengines/utils/MediaStoreWrapper$ImageDirectories;",
        "ROOT_DIR",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "getScope",
        "()Lkotlinx/coroutines/CoroutineScope;",
        "channel",
        "Lkotlinx/coroutines/channels/Channel;",
        "Lcom/smartengines/app/ImageSaver$ChannelData;",
        "saveImage",
        "",
        "dir",
        "Lcom/smartengines/app/ImageSaver$Dir;",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "queryImages",
        "",
        "Lcom/smartengines/utils/MediaStoreWrapper$FileData;",
        "deleteImages",
        "",
        "Dir",
        "ChannelData",
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

.field private static final FILE_EXT:Ljava/lang/String; = ".jpg"

.field private static final IMAGE_DIR:Lcom/smartengines/utils/MediaStoreWrapper$ImageDirectories;

.field public static final INSTANCE:Lcom/smartengines/app/ImageSaver;

.field private static final MIME_TYPE:Ljava/lang/String; = "image/jpeg"

.field private static final ROOT_DIR:Ljava/lang/String; = "Smart Engines"

.field public static final TAG:Ljava/lang/String; = "myapp.ImageSaver"

.field private static final channel:Lkotlinx/coroutines/channels/Channel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/Channel<",
            "Lcom/smartengines/app/ImageSaver$ChannelData;",
            ">;"
        }
    .end annotation
.end field

.field private static final scope:Lkotlinx/coroutines/CoroutineScope;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/smartengines/app/ImageSaver;

    invoke-direct {v0}, Lcom/smartengines/app/ImageSaver;-><init>()V

    sput-object v0, Lcom/smartengines/app/ImageSaver;->INSTANCE:Lcom/smartengines/app/ImageSaver;

    .line 22
    sget-object v0, Lcom/smartengines/utils/MediaStoreWrapper$ImageDirectories;->Pictures:Lcom/smartengines/utils/MediaStoreWrapper$ImageDirectories;

    sput-object v0, Lcom/smartengines/app/ImageSaver;->IMAGE_DIR:Lcom/smartengines/utils/MediaStoreWrapper$ImageDirectories;

    .line 29
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    sput-object v1, Lcom/smartengines/app/ImageSaver;->scope:Lkotlinx/coroutines/CoroutineScope;

    const/4 v0, 0x7

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 35
    invoke-static {v2, v3, v3, v0, v3}, Lkotlinx/coroutines/channels/ChannelKt;->Channel$default(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/Channel;

    move-result-object v0

    sput-object v0, Lcom/smartengines/app/ImageSaver;->channel:Lkotlinx/coroutines/channels/Channel;

    .line 38
    new-instance v0, Lcom/smartengines/app/ImageSaver$1;

    invoke-direct {v0, v3}, Lcom/smartengines/app/ImageSaver$1;-><init>(Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    const/16 v0, 0x8

    .line 68
    sput v0, Lcom/smartengines/app/ImageSaver;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getChannel$p()Lkotlinx/coroutines/channels/Channel;
    .locals 1

    .line 15
    sget-object v0, Lcom/smartengines/app/ImageSaver;->channel:Lkotlinx/coroutines/channels/Channel;

    return-object v0
.end method

.method public static final synthetic access$getIMAGE_DIR$p()Lcom/smartengines/utils/MediaStoreWrapper$ImageDirectories;
    .locals 1

    .line 15
    sget-object v0, Lcom/smartengines/app/ImageSaver;->IMAGE_DIR:Lcom/smartengines/utils/MediaStoreWrapper$ImageDirectories;

    return-object v0
.end method


# virtual methods
.method public final deleteImages(Lcom/smartengines/app/ImageSaver$Dir;)I
    .locals 8

    const-string v0, "deleted "

    const-string v1, "Smart Engines/"

    const-string v2, "dir"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "deleteImages in dir: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "myapp.ImageSaver"

    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    :try_start_0
    sget-object v2, Lcom/smartengines/utils/MediaStoreWrapper;->INSTANCE:Lcom/smartengines/utils/MediaStoreWrapper;

    .line 104
    invoke-static {}, Lcom/smartengines/app/AppKt;->getApp()Lcom/smartengines/app/App;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    .line 105
    sget-object v5, Lcom/smartengines/utils/MediaStoreWrapper;->INSTANCE:Lcom/smartengines/utils/MediaStoreWrapper;

    sget-object v6, Lcom/smartengines/app/ImageSaver;->IMAGE_DIR:Lcom/smartengines/utils/MediaStoreWrapper$ImageDirectories;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v6, v1}, Lcom/smartengines/utils/MediaStoreWrapper;->makeRelativePath(Lcom/smartengines/utils/MediaStoreWrapper$ImageDirectories;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 103
    invoke-virtual {v2, v4, v1}, Lcom/smartengines/utils/MediaStoreWrapper;->delete(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    .line 108
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " images in dir: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception v0

    .line 112
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "delete "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " error"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v3, p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p1, 0x0

    return p1
.end method

.method public final getScope()Lkotlinx/coroutines/CoroutineScope;
    .locals 1

    .line 29
    sget-object v0, Lcom/smartengines/app/ImageSaver;->scope:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public final queryImages(Lcom/smartengines/app/ImageSaver$Dir;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/app/ImageSaver$Dir;",
            ")",
            "Ljava/util/List<",
            "Lcom/smartengines/utils/MediaStoreWrapper$FileData;",
            ">;"
        }
    .end annotation

    const-string v0, "queryDir: "

    const-string v1, "Smart Engines/"

    const-string v2, "dir"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "queryImages in dir: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "myapp.ImageSaver"

    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    :try_start_0
    sget-object v2, Lcom/smartengines/utils/MediaStoreWrapper;->INSTANCE:Lcom/smartengines/utils/MediaStoreWrapper;

    .line 84
    invoke-static {}, Lcom/smartengines/app/AppKt;->getApp()Lcom/smartengines/app/App;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    .line 85
    sget-object v5, Lcom/smartengines/utils/MediaStoreWrapper;->INSTANCE:Lcom/smartengines/utils/MediaStoreWrapper;

    sget-object v6, Lcom/smartengines/app/ImageSaver;->IMAGE_DIR:Lcom/smartengines/utils/MediaStoreWrapper$ImageDirectories;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v6, v1}, Lcom/smartengines/utils/MediaStoreWrapper;->makeRelativePath(Lcom/smartengines/utils/MediaStoreWrapper$ImageDirectories;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 83
    invoke-virtual {v2, v4, v1}, Lcom/smartengines/utils/MediaStoreWrapper;->query(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 89
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " success, result.size: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    .line 93
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "queryDir "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " error"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v3, p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 94
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final saveImage(Lcom/smartengines/app/ImageSaver$Dir;Landroid/graphics/Bitmap;)V
    .locals 7

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    sget-object v1, Lcom/smartengines/app/ImageSaver;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/smartengines/app/ImageSaver$saveImage$1;

    const/4 v2, 0x0

    invoke-direct {v0, p1, p2, v2}, Lcom/smartengines/app/ImageSaver$saveImage$1;-><init>(Lcom/smartengines/app/ImageSaver$Dir;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method
