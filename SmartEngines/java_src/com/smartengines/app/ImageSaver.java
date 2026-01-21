package com.smartengines.app;

import android.graphics.Bitmap;
import android.util.Log;
import com.smartengines.utils.MediaStoreWrapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.bouncycastle.asn1.eac.EACTags;

/* compiled from: ImageSaver.kt */
@Metadata(m513d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m514d2 = {"Lcom/smartengines/app/ImageSaver;", "", "<init>", "()V", "TAG", "", "FILE_EXT", "MIME_TYPE", "IMAGE_DIR", "Lcom/smartengines/utils/MediaStoreWrapper$ImageDirectories;", "ROOT_DIR", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "channel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/smartengines/app/ImageSaver$ChannelData;", "saveImage", "", "dir", "Lcom/smartengines/app/ImageSaver$Dir;", "bitmap", "Landroid/graphics/Bitmap;", "queryImages", "", "Lcom/smartengines/utils/MediaStoreWrapper$FileData;", "deleteImages", "", "Dir", "ChannelData", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ImageSaver {
    public static final int $stable;
    private static final String FILE_EXT = ".jpg";
    private static final String MIME_TYPE = "image/jpeg";
    private static final String ROOT_DIR = "Smart Engines";
    public static final String TAG = "myapp.ImageSaver";
    private static final Channel<ChannelData> channel;
    private static final CoroutineScope scope;
    public static final ImageSaver INSTANCE = new ImageSaver();
    private static final MediaStoreWrapper.ImageDirectories IMAGE_DIR = MediaStoreWrapper.ImageDirectories.Pictures;

    private ImageSaver() {
    }

    static {
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        scope = CoroutineScope;
        channel = ChannelKt.Channel$default(0, null, null, 7, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new C30581(null), 3, null);
        $stable = 8;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageSaver.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m514d2 = {"Lcom/smartengines/app/ImageSaver$Dir;", "", "<init>", "(Ljava/lang/String;I)V", "Photo", "Video", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class Dir {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Dir[] $VALUES;
        public static final Dir Photo = new Dir("Photo", 0);
        public static final Dir Video = new Dir("Video", 1);

        private static final /* synthetic */ Dir[] $values() {
            return new Dir[]{Photo, Video};
        }

        public static EnumEntries<Dir> getEntries() {
            return $ENTRIES;
        }

        private Dir(String str, int i) {
        }

        static {
            Dir[] dirArr$values = $values();
            $VALUES = dirArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(dirArr$values);
        }

        public static Dir valueOf(String str) {
            return (Dir) Enum.valueOf(Dir.class, str);
        }

        public static Dir[] values() {
            return (Dir[]) $VALUES.clone();
        }
    }

    public final CoroutineScope getScope() {
        return scope;
    }

    /* compiled from: ImageSaver.kt */
    @Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m514d2 = {"Lcom/smartengines/app/ImageSaver$ChannelData;", "", "dir", "Lcom/smartengines/app/ImageSaver$Dir;", "bitmap", "Landroid/graphics/Bitmap;", "<init>", "(Lcom/smartengines/app/ImageSaver$Dir;Landroid/graphics/Bitmap;)V", "getDir", "()Lcom/smartengines/app/ImageSaver$Dir;", "getBitmap", "()Landroid/graphics/Bitmap;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    private static final /* data */ class ChannelData {
        private final Bitmap bitmap;
        private final Dir dir;

        public static /* synthetic */ ChannelData copy$default(ChannelData channelData, Dir dir, Bitmap bitmap, int i, Object obj) {
            if ((i & 1) != 0) {
                dir = channelData.dir;
            }
            if ((i & 2) != 0) {
                bitmap = channelData.bitmap;
            }
            return channelData.copy(dir, bitmap);
        }

        /* renamed from: component1, reason: from getter */
        public final Dir getDir() {
            return this.dir;
        }

        /* renamed from: component2, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final ChannelData copy(Dir dir, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(dir, "dir");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            return new ChannelData(dir, bitmap);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChannelData)) {
                return false;
            }
            ChannelData channelData = (ChannelData) other;
            return this.dir == channelData.dir && Intrinsics.areEqual(this.bitmap, channelData.bitmap);
        }

        public int hashCode() {
            return (this.dir.hashCode() * 31) + this.bitmap.hashCode();
        }

        public String toString() {
            return "ChannelData(dir=" + this.dir + ", bitmap=" + this.bitmap + ')';
        }

        public ChannelData(Dir dir, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(dir, "dir");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.dir = dir;
            this.bitmap = bitmap;
        }

        public final Dir getDir() {
            return this.dir;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }
    }

    /* compiled from: ImageSaver.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.ImageSaver$1", m533f = "ImageSaver.kt", m534i = {}, m535l = {42}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.ImageSaver$1 */
    static final class C30581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C30581(Continuation<? super C30581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30581(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.String r1 = "image "
                java.lang.String r2 = "myapp.ImageSaver"
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r12.label
                r4 = 1
                if (r0 == 0) goto L1b
                if (r0 != r4) goto L13
                kotlin.ResultKt.throwOnFailure(r13)
                goto L2e
            L13:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1b:
                kotlin.ResultKt.throwOnFailure(r13)
            L1e:
                kotlinx.coroutines.channels.Channel r13 = com.smartengines.app.ImageSaver.access$getChannel$p()
                r0 = r12
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r12.label = r4
                java.lang.Object r13 = r13.receive(r0)
                if (r13 != r3) goto L2e
                return r3
            L2e:
                com.smartengines.app.ImageSaver$ChannelData r13 = (com.smartengines.app.ImageSaver.ChannelData) r13
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
                java.lang.String r6 = "MM.dd HH:mm:ss.SSS"
                r5.<init>(r6)
                java.util.Date r6 = new java.util.Date
                r6.<init>()
                java.lang.String r5 = r5.format(r6)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r5 = ".jpg"
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r9 = r0.toString()
                com.smartengines.utils.MediaStoreWrapper r5 = com.smartengines.utils.MediaStoreWrapper.INSTANCE     // Catch: java.lang.Exception -> La8
                com.smartengines.app.App r0 = com.smartengines.app.AppKt.getApp()     // Catch: java.lang.Exception -> La8
                r6 = r0
                android.content.Context r6 = (android.content.Context) r6     // Catch: java.lang.Exception -> La8
                android.graphics.Bitmap r0 = r13.getBitmap()     // Catch: java.lang.Exception -> La8
                android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> La8
                byte[] r7 = com.smartengines.utils.UtilsKt.toByteArray(r0, r7)     // Catch: java.lang.Exception -> La8
                com.smartengines.utils.MediaStoreWrapper r0 = com.smartengines.utils.MediaStoreWrapper.INSTANCE     // Catch: java.lang.Exception -> La8
                com.smartengines.utils.MediaStoreWrapper$ImageDirectories r8 = com.smartengines.app.ImageSaver.access$getIMAGE_DIR$p()     // Catch: java.lang.Exception -> La8
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La8
                r10.<init>()     // Catch: java.lang.Exception -> La8
                java.lang.String r11 = "Smart Engines/"
                java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.Exception -> La8
                com.smartengines.app.ImageSaver$Dir r13 = r13.getDir()     // Catch: java.lang.Exception -> La8
                java.lang.StringBuilder r13 = r10.append(r13)     // Catch: java.lang.Exception -> La8
                java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> La8
                java.lang.String r8 = r0.makeRelativePath(r8, r13)     // Catch: java.lang.Exception -> La8
                java.lang.String r10 = "image/jpeg"
                r5.saveImage(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> La8
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La8
                r13.<init>()     // Catch: java.lang.Exception -> La8
                java.lang.StringBuilder r13 = r13.append(r1)     // Catch: java.lang.Exception -> La8
                java.lang.StringBuilder r13 = r13.append(r9)     // Catch: java.lang.Exception -> La8
                java.lang.String r0 = " saved"
                java.lang.StringBuilder r13 = r13.append(r0)     // Catch: java.lang.Exception -> La8
                java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> La8
                android.util.Log.w(r2, r13)     // Catch: java.lang.Exception -> La8
                goto L1e
            La8:
                r0 = move-exception
                r13 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                java.lang.StringBuilder r0 = r0.append(r9)
                java.lang.String r5 = " saving error"
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                android.util.Log.e(r2, r0, r13)
                goto L1e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smartengines.app.ImageSaver.C30581.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ImageSaver.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.app.ImageSaver$saveImage$1", m533f = "ImageSaver.kt", m534i = {}, m535l = {EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.app.ImageSaver$saveImage$1 */
    static final class C30591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ Dir $dir;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30591(Dir dir, Bitmap bitmap, Continuation<? super C30591> continuation) {
            super(2, continuation);
            this.$dir = dir;
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30591(this.$dir, this.$bitmap, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ImageSaver.channel.send(new ChannelData(this.$dir, this.$bitmap), this) == coroutine_suspended) {
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

    public final void saveImage(Dir dir, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C30591(dir, bitmap, null), 3, null);
    }

    public final List<MediaStoreWrapper.FileData> queryImages(Dir dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Log.w(TAG, "queryImages in dir: " + dir);
        try {
            List<MediaStoreWrapper.FileData> listQuery = MediaStoreWrapper.INSTANCE.query(AppKt.getApp(), MediaStoreWrapper.INSTANCE.makeRelativePath(IMAGE_DIR, "Smart Engines/" + dir));
            Log.w(TAG, "queryDir: " + dir + " success, result.size: " + listQuery.size());
            return listQuery;
        } catch (Exception e) {
            Log.e(TAG, "queryDir " + dir + " error", e);
            return CollectionsKt.emptyList();
        }
    }

    public final int deleteImages(Dir dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Log.w(TAG, "deleteImages in dir: " + dir);
        try {
            int iDelete = MediaStoreWrapper.INSTANCE.delete(AppKt.getApp(), MediaStoreWrapper.INSTANCE.makeRelativePath(IMAGE_DIR, "Smart Engines/" + dir));
            Log.w(TAG, "deleted " + iDelete + " images in dir: " + dir);
            return iDelete;
        } catch (Exception e) {
            Log.e(TAG, "delete " + dir + " error", e);
            return 0;
        }
    }
}
