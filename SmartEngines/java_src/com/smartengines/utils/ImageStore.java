package com.smartengines.utils;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* compiled from: ImageStore.kt */
@Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, m514d2 = {"Lcom/smartengines/utils/ImageStore;", "", "saveImage", "", "filename", "", "bitmap", "Landroid/graphics/Bitmap;", "querySize", "", "deleteAll", "utils_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface ImageStore {
    void deleteAll();

    int querySize();

    void saveImage(String filename, Bitmap bitmap);
}
