package androidx.datastore.core.okio;

import androidx.datastore.core.WriteScope;
import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.FileHandle;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* compiled from: OkioStorage.kt */
@Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m514d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "writeData", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, m515k = 1, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes2.dex */
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {

    /* compiled from: OkioStorage.kt */
    @Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    @DebugMetadata(m532c = "androidx.datastore.core.okio.OkioWriteScope", m533f = "OkioStorage.kt", m534i = {0, 0, 0}, m535l = {216}, m536m = "writeData", m537n = {"$this$use$iv", "handle", "$this$use$iv"}, m538s = {"L$0", "L$1", "L$2"})
    /* renamed from: androidx.datastore.core.okio.OkioWriteScope$writeData$1 */
    static final class C21871 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C21871(OkioWriteScope<T> okioWriteScope, Continuation<? super C21871> continuation) {
            super(continuation);
            this.this$0 = okioWriteScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(FileSystem fileSystem, Path path, OkioSerializer<T> serializer) {
        super(fileSystem, path, serializer);
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #5 {all -> 0x009b, blocks: (B:42:0x00a2, B:48:0x00af, B:37:0x0097, B:34:0x0092), top: B:62:0x0092, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af A[Catch: all -> 0x009b, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x009b, blocks: (B:42:0x00a2, B:48:0x00af, B:37:0x0097, B:34:0x0092), top: B:62:0x0092, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // androidx.datastore.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object writeData(T t, Continuation<? super Unit> continuation) throws Throwable {
        C21871 c21871;
        FileHandle fileHandleOpenReadWrite;
        ?? r0;
        Throwable th;
        Closeable closeable;
        FileHandle fileHandle;
        Unit unit;
        Throwable th2;
        Unit unit2;
        if (continuation instanceof C21871) {
            c21871 = (C21871) continuation;
            if ((c21871.label & Integer.MIN_VALUE) != 0) {
                c21871.label -= Integer.MIN_VALUE;
            } else {
                c21871 = new C21871(this, continuation);
            }
        }
        Object obj = c21871.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c21871.label;
        Throwable th3 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            checkClose();
            fileHandleOpenReadWrite = getFileSystem().openReadWrite(getPath());
            try {
                FileHandle fileHandle2 = fileHandleOpenReadWrite;
                BufferedSink bufferedSinkBuffer = Okio.buffer(FileHandle.sink$default(fileHandle2, 0L, 1, null));
                try {
                    OkioSerializer<T> serializer = getSerializer();
                    c21871.L$0 = fileHandleOpenReadWrite;
                    c21871.L$1 = fileHandle2;
                    c21871.L$2 = bufferedSinkBuffer;
                    c21871.label = 1;
                    if (serializer.writeTo(t, bufferedSinkBuffer, c21871) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r0 = fileHandleOpenReadWrite;
                    fileHandle = fileHandle2;
                    closeable = bufferedSinkBuffer;
                } catch (Throwable th4) {
                    r0 = fileHandleOpenReadWrite;
                    th = th4;
                    closeable = bufferedSinkBuffer;
                    if (closeable != null) {
                    }
                    th2 = th;
                    unit2 = null;
                    if (th2 == null) {
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (fileHandleOpenReadWrite != null) {
                    try {
                        fileHandleOpenReadWrite.close();
                    } catch (Throwable th6) {
                        ExceptionsKt.addSuppressed(th, th6);
                    }
                }
                th3 = th;
                unit = null;
                if (th3 != null) {
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = (Closeable) c21871.L$2;
            fileHandle = (FileHandle) c21871.L$1;
            r0 = (Closeable) c21871.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                r0 = r0;
            } catch (Throwable th7) {
                th = th7;
                if (closeable != null) {
                    try {
                        try {
                            closeable.close();
                        } catch (Throwable th8) {
                            ExceptionsKt.addSuppressed(th, th8);
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        fileHandleOpenReadWrite = r0;
                        if (fileHandleOpenReadWrite != null) {
                        }
                        th3 = th;
                        unit = null;
                        if (th3 != null) {
                        }
                    }
                }
                th2 = th;
                unit2 = null;
                if (th2 == null) {
                }
            }
        }
        fileHandle.flush();
        unit2 = Unit.INSTANCE;
        if (closeable != null) {
            try {
                closeable.close();
                th2 = null;
            } catch (Throwable th10) {
                th2 = th10;
            }
            if (th2 == null) {
                throw th2;
            }
            Intrinsics.checkNotNull(unit2);
            unit = Unit.INSTANCE;
            if (r0 != 0) {
                try {
                    r0.close();
                } catch (Throwable th11) {
                    th3 = th11;
                }
            }
        } else {
            th2 = null;
            if (th2 == null) {
            }
        }
        if (th3 != null) {
            throw th3;
        }
        Intrinsics.checkNotNull(unit);
        return Unit.INSTANCE;
    }
}
