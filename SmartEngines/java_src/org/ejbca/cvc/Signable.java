package org.ejbca.cvc;

import org.ejbca.cvc.exception.ConstructionException;

/* loaded from: classes2.dex */
public interface Signable {
    byte[] getTBS() throws ConstructionException;
}
