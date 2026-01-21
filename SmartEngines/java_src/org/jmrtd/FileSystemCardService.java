package org.jmrtd;

import net.p012sf.scuba.smartcards.CardFileInputStream;
import net.p012sf.scuba.smartcards.CardService;
import net.p012sf.scuba.smartcards.CardServiceException;

/* loaded from: classes2.dex */
public abstract class FileSystemCardService extends CardService {
    public abstract CardFileInputStream getInputStream(short s) throws CardServiceException;
}
