package org.jmrtd;

import net.p012sf.scuba.smartcards.CardServiceException;

/* loaded from: classes2.dex */
public class AccessDeniedException extends CardServiceException {
    private static final long serialVersionUID = -7094953658210693249L;
    private final AccessKeySpec bacKey;

    public AccessDeniedException(String str, int i) {
        this(str, null, i);
    }

    public AccessDeniedException(String str, AccessKeySpec accessKeySpec, int i) {
        super(str, i);
        this.bacKey = accessKeySpec;
    }

    public AccessKeySpec getAccessKey() {
        return this.bacKey;
    }
}
