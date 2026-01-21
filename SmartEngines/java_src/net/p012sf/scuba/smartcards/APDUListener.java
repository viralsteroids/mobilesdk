package net.p012sf.scuba.smartcards;

import java.util.EventListener;

/* loaded from: classes3.dex */
public interface APDUListener extends EventListener {
    void exchangedAPDU(APDUEvent aPDUEvent);
}
