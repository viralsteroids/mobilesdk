.class public final Lcom/smartengines/utils/ImageStoreExternal;
.super Ljava/lang/Object;
.source "ImageStoreExternal.kt"

# interfaces
.implements Lcom/smartengines/utils/ImageStore;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/utils/ImageStoreExternal$Item;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0008\u0010\u001c\u001a\u00020\u001dH\u0016J\u0008\u0010\u001e\u001a\u00020\u0018H\u0016J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""
    }
    d2 = {
        "Lcom/smartengines/utils/ImageStoreExternal;",
        "Lcom/smartengines/utils/ImageStore;",
        "appDirectory",
        "",
        "resolver",
        "Landroid/content/ContentResolver;",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "<init>",
        "(Ljava/lang/String;Landroid/content/ContentResolver;Lkotlinx/coroutines/CoroutineScope;)V",
        "relativePath",
        "selectAllWhere",
        "getSelectAllWhere",
        "()Ljava/lang/String;",
        "selectAllWhereArgs",
        "",
        "getSelectAllWhereArgs",
        "()[Ljava/lang/String;",
        "queue",
        "Lkotlinx/coroutines/channels/Channel;",
        "Lcom/smartengines/utils/ImageStoreExternal$Item;",
        "tableUri",
        "Landroid/net/Uri;",
        "saveImage",
        "",
        "filename",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "querySize",
        "",
        "deleteAll",
        "insertImageToExternalStorage",
        "item",
        "Item",
        "utils_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final queue:Lkotlinx/coroutines/channels/Channel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/Channel<",
            "Lcom/smartengines/utils/ImageStoreExternal$Item;",
            ">;"
        }
    .end annotation
.end field

.field private final relativePath:Ljava/lang/String;

.field private final resolver:Landroid/content/ContentResolver;

.field private final scope:Lkotlinx/coroutines/CoroutineScope;

.field private final tableUri:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/ContentResolver;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 7

    const-string v0, "appDirectory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p2, p0, Lcom/smartengines/utils/ImageStoreExternal;->resolver:Landroid/content/ContentResolver;

    .line 28
    iput-object p3, p0, Lcom/smartengines/utils/ImageStoreExternal;->scope:Lkotlinx/coroutines/CoroutineScope;

    .line 31
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/smartengines/utils/ImageStoreExternalKt;->access$getPrimaryDirectory$p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const/16 v0, 0x2f

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/utils/ImageStoreExternal;->relativePath:Ljava/lang/String;

    const/4 p1, 0x7

    const/4 p2, 0x0

    const/4 v0, 0x0

    .line 40
    invoke-static {p2, v0, v0, p1, v0}, Lkotlinx/coroutines/channels/ChannelKt;->Channel$default(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/Channel;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/utils/ImageStoreExternal;->queue:Lkotlinx/coroutines/channels/Channel;

    .line 42
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1d

    if-lt p1, p2, :cond_0

    .line 43
    const-string p1, "external_primary"

    invoke-static {p1}, Landroid/provider/MediaStore$Images$Media;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string p2, "getContentUri(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 45
    :cond_0
    sget-object p1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string p2, "EXTERNAL_CONTENT_URI"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    :goto_0
    iput-object p1, p0, Lcom/smartengines/utils/ImageStoreExternal;->tableUri:Landroid/net/Uri;

    .line 48
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "init image storage "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "myapp.ImageStorageExt"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    new-instance p1, Lcom/smartengines/utils/ImageStoreExternal$1;

    invoke-direct {p1, p0, v0}, Lcom/smartengines/utils/ImageStoreExternal$1;-><init>(Lcom/smartengines/utils/ImageStoreExternal;Lkotlin/coroutines/Continuation;)V

    move-object v4, p1

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p3

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$getQueue$p(Lcom/smartengines/utils/ImageStoreExternal;)Lkotlinx/coroutines/channels/Channel;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/smartengines/utils/ImageStoreExternal;->queue:Lkotlinx/coroutines/channels/Channel;

    return-object p0
.end method

.method public static final synthetic access$insertImageToExternalStorage(Lcom/smartengines/utils/ImageStoreExternal;Lcom/smartengines/utils/ImageStoreExternal$Item;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/smartengines/utils/ImageStoreExternal;->insertImageToExternalStorage(Lcom/smartengines/utils/ImageStoreExternal$Item;)V

    return-void
.end method

.method private final getSelectAllWhere()Ljava/lang/String;
    .locals 1

    .line 32
    const-string v0, "relative_path = ?"

    return-object v0
.end method

.method private final getSelectAllWhereArgs()[Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    .line 33
    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/smartengines/utils/ImageStoreExternal;->relativePath:Ljava/lang/String;

    aput-object v2, v0, v1

    return-object v0
.end method

.method private final insertImageToExternalStorage(Lcom/smartengines/utils/ImageStoreExternal$Item;)V
    .locals 6

    .line 100
    const-string v0, "myapp.ImageStorageExt"

    .line 0
    const-string v1, "..... image "

    .line 102
    :try_start_0
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 103
    const-string v3, "relative_path"

    iget-object v4, p0, Lcom/smartengines/utils/ImageStoreExternal;->relativePath:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    const-string v3, "_display_name"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/smartengines/utils/ImageStoreExternal$Item;->getFilename()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ".jpg"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    const-string v3, "mime_type"

    const-string v4, "image/jpeg"

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    iget-object v3, p0, Lcom/smartengines/utils/ImageStoreExternal;->resolver:Landroid/content/ContentResolver;

    iget-object v4, p0, Lcom/smartengines/utils/ImageStoreExternal;->tableUri:Landroid/net/Uri;

    invoke-virtual {v3, v4, v2}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 109
    iget-object v3, p0, Lcom/smartengines/utils/ImageStoreExternal;->resolver:Landroid/content/ContentResolver;

    invoke-virtual {v3, v2}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 111
    invoke-virtual {p1}, Lcom/smartengines/utils/ImageStoreExternal$Item;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v3

    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v5, 0x5a

    invoke-virtual {v3, v4, v5, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 112
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 113
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/smartengines/utils/ImageStoreExternal$Item;->getFilename()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " is saved"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 109
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    const-string v1, "can\'t open file for writing"

    invoke-direct {p1, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 107
    :cond_1
    new-instance p1, Ljava/lang/Exception;

    const-string v1, "insert is failed"

    invoke-direct {p1, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    .line 115
    const-string v1, "insertImageToExternalStorage"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method


# virtual methods
.method public deleteAll()V
    .locals 4

    .line 91
    iget-object v0, p0, Lcom/smartengines/utils/ImageStoreExternal;->resolver:Landroid/content/ContentResolver;

    .line 92
    iget-object v1, p0, Lcom/smartengines/utils/ImageStoreExternal;->tableUri:Landroid/net/Uri;

    .line 93
    invoke-direct {p0}, Lcom/smartengines/utils/ImageStoreExternal;->getSelectAllWhere()Ljava/lang/String;

    move-result-object v2

    .line 94
    invoke-direct {p0}, Lcom/smartengines/utils/ImageStoreExternal;->getSelectAllWhereArgs()[Ljava/lang/String;

    move-result-object v3

    .line 91
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 96
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "deleteAll, images deleted: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.ImageStorageExt"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public querySize()I
    .locals 7

    .line 71
    iget-object v0, p0, Lcom/smartengines/utils/ImageStoreExternal;->resolver:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/smartengines/utils/ImageStoreExternal;->tableUri:Landroid/net/Uri;

    const/4 v2, 0x1

    .line 73
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "_display_name"

    const/4 v6, 0x0

    aput-object v3, v2, v6

    .line 74
    invoke-direct {p0}, Lcom/smartengines/utils/ImageStoreExternal;->getSelectAllWhere()Ljava/lang/String;

    move-result-object v3

    .line 75
    invoke-direct {p0}, Lcom/smartengines/utils/ImageStoreExternal;->getSelectAllWhereArgs()[Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    .line 71
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 77
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v6

    .line 84
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 86
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "querySize: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.ImageStorageExt"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v6
.end method

.method public saveImage(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 8

    const-string v0, "filename"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "saveImage "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x78

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.ImageStorageExt"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    iget-object v2, p0, Lcom/smartengines/utils/ImageStoreExternal;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/smartengines/utils/ImageStoreExternal$saveImage$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/smartengines/utils/ImageStoreExternal$saveImage$1;-><init>(Lcom/smartengines/utils/ImageStoreExternal;Ljava/lang/String;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method
