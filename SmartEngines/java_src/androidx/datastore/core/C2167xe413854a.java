package androidx.datastore.core;

import androidx.datastore.core.MultiProcessCoordinator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.crypto.tls.CipherSuite;

/* compiled from: MultiProcessCoordinator.android.kt */
@Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
@DebugMetadata(m532c = "androidx.datastore.core.MultiProcessCoordinator$Companion", m533f = "MultiProcessCoordinator.android.kt", m534i = {0, 0}, m535l = {CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256}, m536m = "getExclusiveFileLockWithRetryIfDeadlock", m537n = {"lockFileStream", "backoff"}, m538s = {"L$0", "J$0"})
/* renamed from: androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 */
/* loaded from: classes2.dex */
final class C2167xe413854a extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MultiProcessCoordinator.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2167xe413854a(MultiProcessCoordinator.Companion companion, Continuation<? super C2167xe413854a> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getExclusiveFileLockWithRetryIfDeadlock(null, this);
    }
}
