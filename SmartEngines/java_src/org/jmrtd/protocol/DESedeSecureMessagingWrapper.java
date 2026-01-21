package org.jmrtd.protocol;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes4.dex */
public class DESedeSecureMessagingWrapper extends SecureMessagingWrapper implements Serializable {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final IvParameterSpec ZERO_IV_PARAM_SPEC = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
    private static final long serialVersionUID = -2859033943345961793L;

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public int getPadLength() {
        return 8;
    }

    public DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2) throws GeneralSecurityException {
        this(secretKey, secretKey2, true);
    }

    public DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, boolean z) throws GeneralSecurityException {
        this(secretKey, secretKey2, 256, z, 0L);
    }

    public DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, long j) throws GeneralSecurityException {
        this(secretKey, secretKey2, 256, true, j);
    }

    public DESedeSecureMessagingWrapper(DESedeSecureMessagingWrapper dESedeSecureMessagingWrapper) throws GeneralSecurityException {
        this(dESedeSecureMessagingWrapper.getEncryptionKey(), dESedeSecureMessagingWrapper.getMACKey(), dESedeSecureMessagingWrapper.getMaxTranceiveLength(), dESedeSecureMessagingWrapper.shouldCheckMAC(), dESedeSecureMessagingWrapper.getSendSequenceCounter());
    }

    public DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, int i, boolean z, long j) throws GeneralSecurityException {
        super(secretKey, secretKey2, "DESede/CBC/NoPadding", "ISO9797Alg3Mac", i, z, j);
    }

    @Override // net.p012sf.scuba.smartcards.APDUWrapper
    public String getType() {
        return "DESede";
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public byte[] getEncodedSendSequenceCounter() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                new DataOutputStream(byteArrayOutputStream).writeLong(getSendSequenceCounter());
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e);
                }
            }
        } catch (IOException e2) {
            LOGGER.log(Level.FINE, "Error writing to stream", (Throwable) e2);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public String toString() {
        return "DESedeSecureMessagingWrapper [ssc: " + getSendSequenceCounter() + ", kEnc: " + getEncryptionKey() + ", kMac: " + getMACKey() + ", shouldCheckMAC: " + shouldCheckMAC() + ", maxTranceiveLength: " + getMaxTranceiveLength() + "]";
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public int hashCode() {
        return (super.hashCode() * 31) + 13;
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    protected IvParameterSpec getIV() {
        return ZERO_IV_PARAM_SPEC;
    }
}
