package org.bouncycastle.jce.interfaces;

import java.security.PublicKey;
import org.bouncycastle.math.p023ec.ECPoint;

/* loaded from: classes3.dex */
public interface ECPublicKey extends ECKey, PublicKey {
    ECPoint getQ();
}
