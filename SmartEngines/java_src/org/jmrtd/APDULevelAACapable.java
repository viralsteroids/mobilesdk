package org.jmrtd;

import net.p012sf.scuba.smartcards.APDUWrapper;
import net.p012sf.scuba.smartcards.CardServiceException;

/* loaded from: classes2.dex */
public interface APDULevelAACapable {
    byte[] sendInternalAuthenticate(APDUWrapper aPDUWrapper, byte[] bArr) throws CardServiceException;
}
