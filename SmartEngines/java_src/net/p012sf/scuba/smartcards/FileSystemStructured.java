package net.p012sf.scuba.smartcards;

/* loaded from: classes3.dex */
public interface FileSystemStructured {
    FileInfo[] getSelectedPath() throws CardServiceException;

    byte[] readBinary(int i, int i2) throws CardServiceException;

    void selectFile(short s) throws CardServiceException;
}
