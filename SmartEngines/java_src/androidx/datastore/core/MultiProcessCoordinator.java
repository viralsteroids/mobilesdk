package androidx.datastore.core;

import androidx.datastore.core.SharedCounter;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.math.Primes;

/* compiled from: MultiProcessCoordinator.android.kt */
@Metadata(m513d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\bH\u0002J\u000e\u0010\"\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J2\u0010&\u001a\u0002H'\"\u0004\b\u0000\u0010'2\u001c\u0010(\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0)H\u0096@¢\u0006\u0002\u0010,J8\u0010-\u001a\u0002H'\"\u0004\b\u0000\u0010'2\"\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0.H\u0096@¢\u0006\u0002\u00100J:\u00101\u001a\u0002H'\"\u0004\b\u0000\u0010'2$\b\u0004\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0*\u0012\u0006\u0012\u0004\u0018\u00010+0.H\u0082H¢\u0006\u0002\u00100J\f\u00102\u001a\u00020\u001d*\u00020\u0005H\u0002J\f\u00103\u001a\u00020\u001d*\u00020\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a*\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, m514d2 = {"Landroidx/datastore/core/MultiProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "context", "Lkotlin/coroutines/CoroutineContext;", "file", "Ljava/io/File;", "(Lkotlin/coroutines/CoroutineContext;Ljava/io/File;)V", "LOCK_ERROR_MESSAGE", "", "LOCK_SUFFIX", "VERSION_SUFFIX", "getFile", "()Ljava/io/File;", "inMemoryMutex", "Lkotlinx/coroutines/sync/Mutex;", "lazySharedCounter", "Lkotlin/Lazy;", "Landroidx/datastore/core/SharedCounter;", "lockFile", "getLockFile", "lockFile$delegate", "Lkotlin/Lazy;", "sharedCounter", "getSharedCounter$delegate", "(Landroidx/datastore/core/MultiProcessCoordinator;)Ljava/lang/Object;", "getSharedCounter", "()Landroidx/datastore/core/SharedCounter;", "updateNotifications", "Lkotlinx/coroutines/flow/Flow;", "", "getUpdateNotifications", "()Lkotlinx/coroutines/flow/Flow;", "fileWithSuffix", "suffix", "getVersion", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", "lock", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryLock", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withLazyCounter", "createIfNotExists", "createParentDirectories", "Companion", "datastore-core_release"}, m515k = 1, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes2.dex */
public final class MultiProcessCoordinator implements InterProcessCoordinator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = 60000;
    private final String LOCK_ERROR_MESSAGE;
    private final String LOCK_SUFFIX;
    private final String VERSION_SUFFIX;
    private final CoroutineContext context;
    private final File file;
    private final Mutex inMemoryMutex;
    private final Lazy<SharedCounter> lazySharedCounter;

    /* renamed from: lockFile$delegate, reason: from kotlin metadata */
    private final Lazy lockFile;
    private final Flow<Unit> updateNotifications;

    /* compiled from: MultiProcessCoordinator.android.kt */
    @Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    @DebugMetadata(m532c = "androidx.datastore.core.MultiProcessCoordinator", m533f = "MultiProcessCoordinator.android.kt", m534i = {0, 0, 0, 1, 1, 2, 2}, m535l = {Primes.SMALL_FACTOR_LIMIT, 47, 48}, m536m = "lock", m537n = {"this", "block", "$this$withLock_u24default$iv", "block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "lock"}, m538s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$2"})
    /* renamed from: androidx.datastore.core.MultiProcessCoordinator$lock$1 */
    static final class C21691<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C21691(Continuation<? super C21691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.lock(null, this);
        }
    }

    /* compiled from: MultiProcessCoordinator.android.kt */
    @Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    @DebugMetadata(m532c = "androidx.datastore.core.MultiProcessCoordinator", m533f = "MultiProcessCoordinator.android.kt", m534i = {0, 0, 1, 1, 1}, m535l = {CipherSuite.TLS_DH_DSS_WITH_AES_128_CBC_SHA256, 87}, m536m = "tryLock", m537n = {"$this$withTryLock_u24default$iv", "locked$iv", "$this$withTryLock_u24default$iv", "lock", "locked$iv"}, m538s = {"L$0", "Z$0", "L$0", "L$2", "Z$0"})
    /* renamed from: androidx.datastore.core.MultiProcessCoordinator$tryLock$1 */
    static final class C21701<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C21701(Continuation<? super C21701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.tryLock(null, this);
        }
    }

    public MultiProcessCoordinator(CoroutineContext context, File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        this.context = context;
        this.file = file;
        this.updateNotifications = MulticastFileObserver.INSTANCE.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = MutexKt.Mutex$default(false, 1, null);
        this.lockFile = LazyKt.lazy(new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lockFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() throws IOException {
                MultiProcessCoordinator multiProcessCoordinator = this.this$0;
                File fileFileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.LOCK_SUFFIX);
                this.this$0.createIfNotExists(fileFileWithSuffix);
                return fileFileWithSuffix;
            }
        });
        this.lazySharedCounter = LazyKt.lazy(new Function0<SharedCounter>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SharedCounter invoke() {
                SharedCounter.INSTANCE.loadLib();
                SharedCounter.Companion companion = SharedCounter.INSTANCE;
                final MultiProcessCoordinator multiProcessCoordinator = this.this$0;
                return companion.create$datastore_core_release(new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final File invoke() throws IOException {
                        MultiProcessCoordinator multiProcessCoordinator2 = multiProcessCoordinator;
                        File fileFileWithSuffix = multiProcessCoordinator2.fileWithSuffix(multiProcessCoordinator2.VERSION_SUFFIX);
                        multiProcessCoordinator.createIfNotExists(fileFileWithSuffix);
                        return fileFileWithSuffix;
                    }
                });
            }
        });
    }

    protected final File getFile() {
        return this.file;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Flow<Unit> getUpdateNotifications() {
        return this.updateNotifications;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1 A[Catch: all -> 0x00df, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00df, blocks: (B:43:0x00c1, B:54:0x00db, B:57:0x00e3), top: B:82:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #8 {all -> 0x00df, blocks: (B:43:0x00c1, B:54:0x00db, B:57:0x00e3), top: B:82:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable, java.lang.Object] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object lock(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) throws Throwable {
        C21691 c21691;
        ?? r11;
        FileOutputStream fileOutputStream;
        MultiProcessCoordinator multiProcessCoordinator;
        FileOutputStream fileOutputStream2;
        Throwable th;
        Function1<? super Continuation<? super T>, ? extends Object> function12;
        java.io.Closeable closeable;
        Mutex mutex;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        java.io.Closeable closeable2;
        Mutex mutex2;
        if (continuation instanceof C21691) {
            c21691 = (C21691) continuation;
            if ((c21691.label & Integer.MIN_VALUE) != 0) {
                c21691.label -= Integer.MIN_VALUE;
            } else {
                c21691 = new C21691(continuation);
            }
        }
        Object obj = c21691.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c21691.label;
        try {
            try {
                try {
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Mutex mutex3 = this.inMemoryMutex;
                            c21691.L$0 = this;
                            c21691.L$1 = function1;
                            c21691.L$2 = mutex3;
                            c21691.label = 1;
                            if (mutex3.lock(null, c21691) != coroutine_suspended) {
                                multiProcessCoordinator = this;
                                r11 = mutex3;
                            }
                            return coroutine_suspended;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                fileLock = (FileLock) c21691.L$2;
                                closeable2 = (java.io.Closeable) c21691.L$1;
                                mutex2 = (Mutex) c21691.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    try {
                                        kotlin.p010io.CloseableKt.closeFinally(closeable2, null);
                                        mutex2.unlock(null);
                                        return obj;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r11 = mutex2;
                                        r11.unlock(null);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (fileLock != null) {
                                    }
                                    throw th;
                                }
                            }
                            closeable = (java.io.Closeable) c21691.L$2;
                            mutex = (Mutex) c21691.L$1;
                            function12 = (Function1) c21691.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                fileLock2 = (FileLock) obj;
                            } catch (Throwable th4) {
                                th = th4;
                                fileLock = null;
                                if (fileLock != null) {
                                }
                                throw th;
                            }
                            try {
                                c21691.L$0 = mutex;
                                c21691.L$1 = closeable;
                                c21691.L$2 = fileLock2;
                                c21691.label = 3;
                                objInvoke = function12.invoke(c21691);
                                if (objInvoke != coroutine_suspended) {
                                    closeable2 = closeable;
                                    fileLock = fileLock2;
                                    obj = objInvoke;
                                    mutex2 = mutex;
                                    if (fileLock != null) {
                                    }
                                    kotlin.p010io.CloseableKt.closeFinally(closeable2, null);
                                    mutex2.unlock(null);
                                    return obj;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th5) {
                                fileLock = fileLock2;
                                th = th5;
                                if (fileLock != null) {
                                }
                                throw th;
                            }
                        }
                        Mutex mutex4 = (Mutex) c21691.L$2;
                        Function1<? super Continuation<? super T>, ? extends Object> function13 = (Function1) c21691.L$1;
                        multiProcessCoordinator = (MultiProcessCoordinator) c21691.L$0;
                        ResultKt.throwOnFailure(obj);
                        r11 = mutex4;
                        function1 = function13;
                        Companion companion = INSTANCE;
                        c21691.L$0 = function1;
                        c21691.L$1 = r11;
                        c21691.L$2 = fileOutputStream;
                        c21691.label = 2;
                        Object exclusiveFileLockWithRetryIfDeadlock = companion.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream2, c21691);
                        if (exclusiveFileLockWithRetryIfDeadlock != coroutine_suspended) {
                            function12 = function1;
                            closeable = fileOutputStream;
                            mutex = r11;
                            obj = exclusiveFileLockWithRetryIfDeadlock;
                            fileLock2 = (FileLock) obj;
                            c21691.L$0 = mutex;
                            c21691.L$1 = closeable;
                            c21691.L$2 = fileLock2;
                            c21691.label = 3;
                            objInvoke = function12.invoke(c21691);
                            if (objInvoke != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    } catch (Throwable th6) {
                        th = th6;
                        fileLock = null;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                    fileOutputStream2 = fileOutputStream;
                } catch (Throwable th7) {
                    th = th7;
                    try {
                        throw th;
                    } finally {
                    }
                }
                fileOutputStream = new FileOutputStream(multiProcessCoordinator.getLockFile());
            } catch (Throwable th8) {
                th = th8;
                r11.unlock(null);
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
            r11 = c21691;
            fileOutputStream = coroutine_suspended;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7 A[Catch: all -> 0x0100, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0100, blocks: (B:58:0x00e7, B:67:0x00fc, B:70:0x0105), top: B:87:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc A[Catch: all -> 0x0100, TRY_ENTER, TryCatch #1 {all -> 0x0100, blocks: (B:58:0x00e7, B:67:0x00fc, B:70:0x0105), top: B:87:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0116  */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object tryLock(Function2<? super Boolean, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) throws Throwable {
        Mutex c21701;
        ?? TryLock;
        FileInputStream fileInputStream;
        Throwable th;
        FileLock fileLock;
        String message;
        FileLock fileLockTryLock;
        Mutex mutex;
        boolean z;
        java.io.Closeable closeable;
        Mutex mutex2;
        boolean z2;
        Function2<? super Boolean, ? super Continuation<? super T>, ? extends Object> function22 = function2;
        if (continuation instanceof C21701) {
            C21701 c217012 = (C21701) continuation;
            if ((c217012.label & Integer.MIN_VALUE) != 0) {
                c217012.label -= Integer.MIN_VALUE;
                c21701 = c217012;
            } else {
                c21701 = new C21701(continuation);
            }
        }
        Object objInvoke = ((C21701) c21701).result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r5 = ((C21701) c21701).label;
        try {
            try {
                if (r5 != 0) {
                    if (r5 == 1) {
                        z2 = ((C21701) c21701).Z$0;
                        mutex2 = (Mutex) ((C21701) c21701).L$0;
                        ResultKt.throwOnFailure(objInvoke);
                        if (z2) {
                            mutex2.unlock(null);
                        }
                        return objInvoke;
                    }
                    if (r5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = ((C21701) c21701).Z$0;
                    fileLock = (FileLock) ((C21701) c21701).L$2;
                    closeable = (java.io.Closeable) ((C21701) c21701).L$1;
                    mutex = (Mutex) ((C21701) c21701).L$0;
                    try {
                        ResultKt.throwOnFailure(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        kotlin.p010io.CloseableKt.closeFinally(closeable, null);
                        if (z) {
                            mutex.unlock(null);
                        }
                        return objInvoke;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileLock != null) {
                        }
                        throw th;
                    }
                }
                ResultKt.throwOnFailure(objInvoke);
                Mutex mutex3 = this.inMemoryMutex;
                TryLock = mutex3.tryLock(null);
                try {
                    if (TryLock == 0) {
                        Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                        ((C21701) c21701).L$0 = mutex3;
                        ((C21701) c21701).Z$0 = TryLock;
                        ((C21701) c21701).label = 1;
                        objInvoke = function22.invoke(boolBoxBoolean, (Object) c21701);
                        if (objInvoke != coroutine_suspended) {
                            mutex2 = mutex3;
                            z2 = TryLock == true ? 1 : 0;
                            if (z2) {
                            }
                            return objInvoke;
                        }
                    } else {
                        fileInputStream = new FileInputStream(getLockFile());
                        try {
                            try {
                                try {
                                    fileLockTryLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                                } catch (IOException e) {
                                    String message2 = e.getMessage();
                                    if ((message2 == null || !StringsKt.startsWith$default(message2, this.LOCK_ERROR_MESSAGE, false, 2, (Object) null)) && ((message = e.getMessage()) == null || !StringsKt.startsWith$default(message, DEADLOCK_ERROR_MESSAGE, false, 2, (Object) null))) {
                                        throw e;
                                    }
                                    fileLockTryLock = null;
                                }
                                try {
                                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(fileLockTryLock != null);
                                    ((C21701) c21701).L$0 = mutex3;
                                    ((C21701) c21701).L$1 = fileInputStream;
                                    ((C21701) c21701).L$2 = fileLockTryLock;
                                    ((C21701) c21701).Z$0 = TryLock;
                                    ((C21701) c21701).label = 2;
                                    objInvoke = function22.invoke(boolBoxBoolean2, (Object) c21701);
                                    if (objInvoke != coroutine_suspended) {
                                        mutex = mutex3;
                                        z = TryLock == true ? 1 : 0;
                                        closeable = fileInputStream;
                                        fileLock = fileLockTryLock;
                                        if (fileLock != null) {
                                        }
                                        kotlin.p010io.CloseableKt.closeFinally(closeable, null);
                                        if (z) {
                                        }
                                        return objInvoke;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileLock = fileLockTryLock;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                fileLock = null;
                                if (fileLock != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            c21701 = mutex3;
                            TryLock = TryLock;
                            try {
                                throw th;
                            } catch (Throwable th6) {
                                try {
                                    kotlin.p010io.CloseableKt.closeFinally(fileInputStream, th);
                                    throw th6;
                                } catch (Throwable th7) {
                                    th = th7;
                                    function22 = TryLock;
                                    if (function22 != null) {
                                    }
                                    throw th;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th8) {
                    th = th8;
                    c21701 = mutex3;
                    function22 = TryLock;
                    if (function22 != null) {
                        c21701.unlock(null);
                    }
                    throw th;
                }
            } catch (Throwable th9) {
                TryLock = function22;
                fileInputStream = r5;
                th = th9;
                c21701 = c21701;
            }
        } catch (Throwable th10) {
            th = th10;
            if (function22 != null) {
            }
            throw th;
        }
    }

    private final File getLockFile() {
        return (File) this.lockFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedCounter getSharedCounter() {
        return this.lazySharedCounter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File fileWithSuffix(String suffix) {
        return new File(this.file.getAbsolutePath() + suffix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createIfNotExists(File file) throws IOException {
        createParentDirectories(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
    }

    private final <T> Object withLazyCounter(Function2<? super SharedCounter, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return function2.invoke(getSharedCounter(), continuation);
        }
        return BuildersKt.withContext(this.context, new C21712(function2, this, null), continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: MultiProcessCoordinator.android.kt */
    @Metadata(m513d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    @DebugMetadata(m532c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", m533f = "MultiProcessCoordinator.android.kt", m534i = {}, m535l = {CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2 */
    public static final class C21712<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<SharedCounter, Continuation<? super T>, Object> $block;
        int label;
        final /* synthetic */ MultiProcessCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C21712(Function2<? super SharedCounter, ? super Continuation<? super T>, ? extends Object> function2, MultiProcessCoordinator multiProcessCoordinator, Continuation<? super C21712> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.this$0 = multiProcessCoordinator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C21712(this.$block, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C21712) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Function2<SharedCounter, Continuation<? super T>, Object> function2 = this.$block;
            SharedCounter sharedCounter = this.this$0.getSharedCounter();
            this.label = 1;
            Object objInvoke = function2.invoke(sharedCounter, this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.$block.invoke(this.this$0.getSharedCounter(), this);
        }
    }

    /* compiled from: MultiProcessCoordinator.android.kt */
    @Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, m514d2 = {"Landroidx/datastore/core/MultiProcessCoordinator$Companion;", "", "()V", "DEADLOCK_ERROR_MESSAGE", "", "INITIAL_WAIT_MILLIS", "", "MAX_WAIT_MILLIS", "getExclusiveFileLockWithRetryIfDeadlock", "Ljava/nio/channels/FileLock;", "lockFileStream", "Ljava/io/FileOutputStream;", "(Ljava/io/FileOutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, m515k = 1, m516mv = {1, 8, 0}, m518xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0081 -> B:27:0x0084). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getExclusiveFileLockWithRetryIfDeadlock(FileOutputStream fileOutputStream, Continuation<? super FileLock> continuation) throws IOException {
            C2167xe413854a c2167xe413854a;
            long j;
            C2167xe413854a c2167xe413854a2;
            if (continuation instanceof C2167xe413854a) {
                c2167xe413854a = (C2167xe413854a) continuation;
                if ((c2167xe413854a.label & Integer.MIN_VALUE) != 0) {
                    c2167xe413854a.label -= Integer.MIN_VALUE;
                } else {
                    c2167xe413854a = new C2167xe413854a(this, continuation);
                }
            }
            Object obj = c2167xe413854a.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = c2167xe413854a.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = c2167xe413854a.J$0;
                fileOutputStream = (FileOutputStream) c2167xe413854a.L$0;
                ResultKt.throwOnFailure(obj);
                c2167xe413854a2 = c2167xe413854a;
                j *= 2;
                if (j > MultiProcessCoordinator.MAX_WAIT_MILLIS) {
                    try {
                    } catch (IOException e) {
                        String message = e.getMessage();
                        if (message == null || !StringsKt.contains$default((CharSequence) message, (CharSequence) MultiProcessCoordinator.DEADLOCK_ERROR_MESSAGE, false, 2, (Object) null)) {
                            throw e;
                        }
                        c2167xe413854a2.L$0 = fileOutputStream;
                        c2167xe413854a2.J$0 = j;
                        c2167xe413854a2.label = 1;
                        if (DelayKt.delay(j, c2167xe413854a2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    FileLock fileLockLock = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                    Intrinsics.checkNotNullExpressionValue(fileLockLock, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                    return fileLockLock;
                }
                FileLock fileLockLock2 = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                Intrinsics.checkNotNullExpressionValue(fileLockLock2, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                return fileLockLock2;
            }
            ResultKt.throwOnFailure(obj);
            j = MultiProcessCoordinator.INITIAL_WAIT_MILLIS;
            c2167xe413854a2 = c2167xe413854a;
            if (j > MultiProcessCoordinator.MAX_WAIT_MILLIS) {
            }
        }
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(Continuation<? super Integer> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return Boxing.boxInt(getSharedCounter().getValue());
        }
        return BuildersKt.withContext(this.context, new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(Continuation<? super Integer> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return Boxing.boxInt(getSharedCounter().incrementAndGetValue());
        }
        return BuildersKt.withContext(this.context, new C2166xb55e9682(this, null), continuation);
    }
}
