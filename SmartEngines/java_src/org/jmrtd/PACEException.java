package org.jmrtd;

import net.p012sf.scuba.smartcards.CardServiceException;

/* loaded from: classes2.dex */
public class PACEException extends CardServiceException {
    private static final long serialVersionUID = 8383980807753919040L;

    public PACEException(String str) {
        super(str);
    }

    public PACEException(String str, Throwable th) {
        super(str, th);
    }

    public PACEException(String str, int i) {
        super(str, i);
    }

    public PACEException(String str, Throwable th, int i) {
        super(str, th, i);
    }
}
