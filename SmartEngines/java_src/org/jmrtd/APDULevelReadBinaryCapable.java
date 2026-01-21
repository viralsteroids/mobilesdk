package org.jmrtd;

import net.p012sf.scuba.smartcards.APDUWrapper;
import net.p012sf.scuba.smartcards.CardServiceException;

/* loaded from: classes2.dex */
public interface APDULevelReadBinaryCapable {
    byte[] sendReadBinary(APDUWrapper aPDUWrapper, int i, int i2, int i3, boolean z, boolean z2) throws CardServiceException;

    void sendSelectApplet(APDUWrapper aPDUWrapper, byte[] bArr) throws CardServiceException;

    void sendSelectFile(APDUWrapper aPDUWrapper, short s) throws CardServiceException;
}
