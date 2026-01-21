package org.jmrtd;

import javax.crypto.SecretKey;
import net.p012sf.scuba.smartcards.CardServiceException;

/* loaded from: classes2.dex */
public interface APDULevelBACCapable {
    byte[] sendGetChallenge() throws CardServiceException;

    byte[] sendMutualAuth(byte[] bArr, byte[] bArr2, byte[] bArr3, SecretKey secretKey, SecretKey secretKey2) throws CardServiceException;
}
