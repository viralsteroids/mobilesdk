package org.jmrtd;

import net.p012sf.scuba.smartcards.APDUWrapper;
import net.p012sf.scuba.smartcards.CardServiceException;

/* loaded from: classes2.dex */
public interface APDULevelPACECapable {
    byte[] sendGeneralAuthenticate(APDUWrapper aPDUWrapper, byte[] bArr, int i, boolean z) throws CardServiceException;

    void sendMSESetATMutualAuth(APDUWrapper aPDUWrapper, String str, int i, byte[] bArr) throws CardServiceException;
}
