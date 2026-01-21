package com.smartengines.app;

import com.smartengines.nfc.ReadingEngine;
import com.smartengines.nfc.ReadingEngineScuba;
import kotlin.Metadata;

/* compiled from: Dependencies.kt */
@Metadata(m513d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m514d2 = {"Lcom/smartengines/app/Dependencies;", "", "<init>", "()V", "nfcReadingEngine", "Lcom/smartengines/nfc/ReadingEngine;", "getNfcReadingEngine", "()Lcom/smartengines/nfc/ReadingEngine;", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class Dependencies {
    public static final int $stable = 0;
    public static final Dependencies INSTANCE = new Dependencies();

    private Dependencies() {
    }

    public final ReadingEngine getNfcReadingEngine() {
        return new ReadingEngineScuba();
    }
}
