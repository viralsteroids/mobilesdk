package org.ejbca.cvc;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: classes2.dex */
public class OIDField extends AbstractDataField {
    private static final long serialVersionUID = 5212215839749666908L;

    /* renamed from: id */
    private String f1883id;

    OIDField() {
        super(CVCTagEnum.OID);
    }

    OIDField(String str) {
        this();
        this.f1883id = str;
    }

    OIDField(byte[] bArr) {
        this();
        this.f1883id = ASN1ObjectIdentifier.getInstance(new DERTaggedObject(true, 0, new DEROctetString(bArr)), false).getId();
    }

    public String getValue() {
        return this.f1883id;
    }

    @Override // org.ejbca.cvc.AbstractDataField
    protected byte[] getEncoded() {
        try {
            byte[] encoded = new ASN1ObjectIdentifier(this.f1883id).getEncoded();
            int length = encoded.length - 2;
            byte[] bArr = new byte[length];
            System.arraycopy(encoded, 2, bArr, 0, length);
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // org.ejbca.cvc.AbstractDataField
    protected String valueAsText() {
        return this.f1883id;
    }

    public String toString() {
        return getValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof OIDField) {
            return this.f1883id.equals(((OIDField) obj).getValue());
        }
        return false;
    }
}
