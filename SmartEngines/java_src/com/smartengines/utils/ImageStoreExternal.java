package com.smartengines.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Log;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jmrtd.lds.ImageInfo;

/* compiled from: ImageStoreExternal.kt */
@Metadata(m513d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m514d2 = {"Lcom/smartengines/utils/ImageStoreExternal;", "Lcom/smartengines/utils/ImageStore;", "appDirectory", "", "resolver", "Landroid/content/ContentResolver;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Ljava/lang/String;Landroid/content/ContentResolver;Lkotlinx/coroutines/CoroutineScope;)V", "relativePath", "selectAllWhere", "getSelectAllWhere", "()Ljava/lang/String;", "selectAllWhereArgs", "", "getSelectAllWhereArgs", "()[Ljava/lang/String;", "queue", "Lkotlinx/coroutines/channels/Channel;", "Lcom/smartengines/utils/ImageStoreExternal$Item;", "tableUri", "Landroid/net/Uri;", "saveImage", "", "filename", "bitmap", "Landroid/graphics/Bitmap;", "querySize", "", "deleteAll", "insertImageToExternalStorage", "item", "Item", "utils_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ImageStoreExternal implements ImageStore {
    private final Channel<Item> queue;
    private final String relativePath;
    private final ContentResolver resolver;
    private final CoroutineScope scope;
    private final Uri tableUri;

    public ImageStoreExternal(String appDirectory, ContentResolver resolver, CoroutineScope scope) {
        Uri EXTERNAL_CONTENT_URI;
        Intrinsics.checkNotNullParameter(appDirectory, "appDirectory");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.resolver = resolver;
        this.scope = scope;
        this.relativePath = ImageStoreExternalKt.primaryDirectory + '/' + appDirectory + '/';
        this.queue = ChannelKt.Channel$default(0, null, null, 7, null);
        if (Build.VERSION.SDK_INT >= 29) {
            EXTERNAL_CONTENT_URI = MediaStore.Images.Media.getContentUri("external_primary");
            Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "getContentUri(...)");
        } else {
            EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        }
        this.tableUri = EXTERNAL_CONTENT_URI;
        Log.d("myapp.ImageStorageExt", "init image storage " + EXTERNAL_CONTENT_URI);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C33101(null), 3, null);
    }

    private final String getSelectAllWhere() {
        return "relative_path = ?";
    }

    private final String[] getSelectAllWhereArgs() {
        return new String[]{this.relativePath};
    }

    /* compiled from: ImageStoreExternal.kt */
    @Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m514d2 = {"Lcom/smartengines/utils/ImageStoreExternal$Item;", "", "filename", "", "bitmap", "Landroid/graphics/Bitmap;", "<init>", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getFilename", "()Ljava/lang/String;", "getBitmap", "()Landroid/graphics/Bitmap;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "utils_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    private static final /* data */ class Item {
        private final Bitmap bitmap;
        private final String filename;

        public static /* synthetic */ Item copy$default(Item item, String str, Bitmap bitmap, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item.filename;
            }
            if ((i & 2) != 0) {
                bitmap = item.bitmap;
            }
            return item.copy(str, bitmap);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        /* renamed from: component2, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final Item copy(String filename, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(filename, "filename");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            return new Item(filename, bitmap);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.filename, item.filename) && Intrinsics.areEqual(this.bitmap, item.bitmap);
        }

        public int hashCode() {
            return (this.filename.hashCode() * 31) + this.bitmap.hashCode();
        }

        public String toString() {
            return "Item(filename=" + this.filename + ", bitmap=" + this.bitmap + ')';
        }

        public Item(String filename, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(filename, "filename");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.filename = filename;
            this.bitmap = bitmap;
        }

        public final String getFilename() {
            return this.filename;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }
    }

    /* compiled from: ImageStoreExternal.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.utils.ImageStoreExternal$1", m533f = "ImageStoreExternal.kt", m534i = {}, m535l = {50}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.utils.ImageStoreExternal$1 */
    static final class C33101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C33101(Continuation<? super C33101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ImageStoreExternal.this.new C33101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ImageStoreExternal.kt */
        @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
        @DebugMetadata(m532c = "com.smartengines.utils.ImageStoreExternal$1$1", m533f = "ImageStoreExternal.kt", m534i = {}, m535l = {52}, m536m = "invokeSuspend", m537n = {}, m538s = {})
        /* renamed from: com.smartengines.utils.ImageStoreExternal$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ImageStoreExternal this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ImageStoreExternal imageStoreExternal, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = imageStoreExternal;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:12:0x002c). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r4.label
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.ResultKt.throwOnFailure(r5)
                    goto L2c
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    kotlin.ResultKt.throwOnFailure(r5)
                L1a:
                    com.smartengines.utils.ImageStoreExternal r5 = r4.this$0
                    kotlinx.coroutines.channels.Channel r5 = com.smartengines.utils.ImageStoreExternal.access$getQueue$p(r5)
                    r1 = r4
                    kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                    r4.label = r2
                    java.lang.Object r5 = r5.receive(r1)
                    if (r5 != r0) goto L2c
                    return r0
                L2c:
                    com.smartengines.utils.ImageStoreExternal$Item r5 = (com.smartengines.utils.ImageStoreExternal.Item) r5
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r3 = "saving image: "
                    r1.<init>(r3)
                    java.lang.String r3 = r5.getFilename()
                    java.lang.StringBuilder r1 = r1.append(r3)
                    java.lang.String r3 = "   ....."
                    java.lang.StringBuilder r1 = r1.append(r3)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r3 = "myapp.ImageStorageExt"
                    android.util.Log.w(r3, r1)
                    com.smartengines.utils.ImageStoreExternal r1 = r4.this$0
                    com.smartengines.utils.ImageStoreExternal.access$insertImageToExternalStorage(r1, r5)
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.smartengines.utils.ImageStoreExternal.C33101.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(ImageStoreExternal.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ImageStoreExternal.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.utils.ImageStoreExternal$saveImage$1", m533f = "ImageStoreExternal.kt", m534i = {}, m535l = {65}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.utils.ImageStoreExternal$saveImage$1 */
    static final class C33111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ String $filename;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33111(String str, Bitmap bitmap, Continuation<? super C33111> continuation) {
            super(2, continuation);
            this.$filename = str;
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ImageStoreExternal.this.new C33111(this.$filename, this.$bitmap, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ImageStoreExternal.this.queue.send(new Item(this.$filename, this.$bitmap), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.smartengines.utils.ImageStore
    public void saveImage(String filename, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Log.d("myapp.ImageStorageExt", "saveImage " + filename + ' ' + bitmap.getWidth() + 'x' + bitmap.getHeight());
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C33111(filename, bitmap, null), 3, null);
    }

    @Override // com.smartengines.utils.ImageStore
    public int querySize() {
        int count = 0;
        Cursor cursorQuery = this.resolver.query(this.tableUri, new String[]{"_display_name"}, getSelectAllWhere(), getSelectAllWhereArgs(), null);
        if (cursorQuery != null) {
            count = cursorQuery.getCount();
            cursorQuery.close();
        }
        Log.d("myapp.ImageStorageExt", "querySize: " + count);
        return count;
    }

    @Override // com.smartengines.utils.ImageStore
    public void deleteAll() {
        Log.e("myapp.ImageStorageExt", "deleteAll, images deleted: " + this.resolver.delete(this.tableUri, getSelectAllWhere(), getSelectAllWhereArgs()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertImageToExternalStorage(Item item) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("relative_path", this.relativePath);
            contentValues.put("_display_name", item.getFilename() + ".jpg");
            contentValues.put("mime_type", ImageInfo.JPEG_MIME_TYPE);
            Uri uriInsert = this.resolver.insert(this.tableUri, contentValues);
            if (uriInsert == null) {
                throw new Exception("insert is failed");
            }
            OutputStream outputStreamOpenOutputStream = this.resolver.openOutputStream(uriInsert);
            if (outputStreamOpenOutputStream == null) {
                throw new Exception("can't open file for writing");
            }
            item.getBitmap().compress(Bitmap.CompressFormat.JPEG, 90, outputStreamOpenOutputStream);
            outputStreamOpenOutputStream.close();
            Log.d("myapp.ImageStorageExt", "..... image " + item.getFilename() + " is saved");
        } catch (Throwable th) {
            Log.e("myapp.ImageStorageExt", "insertImageToExternalStorage", th);
        }
    }
}
