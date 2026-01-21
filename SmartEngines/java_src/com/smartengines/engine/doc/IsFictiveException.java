package com.smartengines.engine.doc;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocResultParser.kt */
@Metadata(m513d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0002j\u0002`\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m514d2 = {"Lcom/smartengines/engine/doc/IsFictiveException;", "Lkotlin/Exception;", "Ljava/lang/Exception;", NotificationCompat.CATEGORY_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
final class IsFictiveException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsFictiveException(String msg) {
        super(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
