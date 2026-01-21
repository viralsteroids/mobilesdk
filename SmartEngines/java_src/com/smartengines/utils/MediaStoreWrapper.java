package com.smartengines.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Log;
import com.google.android.gms.actions.SearchIntents;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p010io.CloseableKt;
import kotlin.text.StringsKt;

/* compiled from: MediaStoreWrapper.kt */
@Metadata(m513d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003 !\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J.\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\u0016\u0010\u0016\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0005J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0005J8\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m514d2 = {"Lcom/smartengines/utils/MediaStoreWrapper;", "", "<init>", "()V", "TAG", "", "saveFile", "", "context", "Landroid/content/Context;", "buffer", "", "directory", "Lcom/smartengines/utils/MediaStoreWrapper$FileDirectories;", "filename", "mimeType", "imagesTableUri", "Landroid/net/Uri;", "getImagesTableUri", "()Landroid/net/Uri;", "saveImage", "relativePath", "makeRelativePath", "Lcom/smartengines/utils/MediaStoreWrapper$ImageDirectories;", "subdir", SearchIntents.EXTRA_QUERY, "", "Lcom/smartengines/utils/MediaStoreWrapper$FileData;", "delete", "", "saveBuffer", "tableUri", "ImageDirectories", "FileDirectories", "FileData", "utils_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class MediaStoreWrapper {
    public static final MediaStoreWrapper INSTANCE = new MediaStoreWrapper();
    private static final String TAG = "myapp.ExternalStorage";

    private MediaStoreWrapper() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MediaStoreWrapper.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m514d2 = {"Lcom/smartengines/utils/MediaStoreWrapper$ImageDirectories;", "", "<init>", "(Ljava/lang/String;I)V", "DCIM", "Pictures", "utils_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class ImageDirectories {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ImageDirectories[] $VALUES;
        public static final ImageDirectories DCIM = new ImageDirectories("DCIM", 0);
        public static final ImageDirectories Pictures = new ImageDirectories("Pictures", 1);

        private static final /* synthetic */ ImageDirectories[] $values() {
            return new ImageDirectories[]{DCIM, Pictures};
        }

        public static EnumEntries<ImageDirectories> getEntries() {
            return $ENTRIES;
        }

        static {
            ImageDirectories[] imageDirectoriesArr$values = $values();
            $VALUES = imageDirectoriesArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(imageDirectoriesArr$values);
        }

        private ImageDirectories(String str, int i) {
        }

        public static ImageDirectories valueOf(String str) {
            return (ImageDirectories) Enum.valueOf(ImageDirectories.class, str);
        }

        public static ImageDirectories[] values() {
            return (ImageDirectories[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MediaStoreWrapper.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m514d2 = {"Lcom/smartengines/utils/MediaStoreWrapper$FileDirectories;", "", "<init>", "(Ljava/lang/String;I)V", "Download", "Documents", "utils_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class FileDirectories {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FileDirectories[] $VALUES;
        public static final FileDirectories Download = new FileDirectories("Download", 0);
        public static final FileDirectories Documents = new FileDirectories("Documents", 1);

        private static final /* synthetic */ FileDirectories[] $values() {
            return new FileDirectories[]{Download, Documents};
        }

        public static EnumEntries<FileDirectories> getEntries() {
            return $ENTRIES;
        }

        static {
            FileDirectories[] fileDirectoriesArr$values = $values();
            $VALUES = fileDirectoriesArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(fileDirectoriesArr$values);
        }

        private FileDirectories(String str, int i) {
        }

        public static FileDirectories valueOf(String str) {
            return (FileDirectories) Enum.valueOf(FileDirectories.class, str);
        }

        public static FileDirectories[] values() {
            return (FileDirectories[]) $VALUES.clone();
        }
    }

    public final void saveFile(Context context, byte[] buffer, FileDirectories directory, String filename, String mimeType) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Uri contentUri = MediaStore.Files.getContentUri("external");
        Intrinsics.checkNotNullExpressionValue(contentUri, "getContentUri(...)");
        saveBuffer(context, buffer, contentUri, directory.toString(), filename, mimeType);
    }

    private final Uri getImagesTableUri() {
        if (Build.VERSION.SDK_INT >= 29) {
            Uri contentUri = MediaStore.Images.Media.getContentUri("external");
            Intrinsics.checkNotNullExpressionValue(contentUri, "getContentUri(...)");
            return contentUri;
        }
        Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        return EXTERNAL_CONTENT_URI;
    }

    public final void saveImage(Context context, byte[] buffer, String relativePath, String filename, String mimeType) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        saveBuffer(context, buffer, getImagesTableUri(), relativePath, filename, mimeType);
    }

    /* compiled from: MediaStoreWrapper.kt */
    @Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m514d2 = {"Lcom/smartengines/utils/MediaStoreWrapper$FileData;", "", "id", "", "size", "displayName", "", "<init>", "(JJLjava/lang/String;)V", "getId", "()J", "getSize", "getDisplayName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "utils_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class FileData {
        private final String displayName;
        private final long id;
        private final long size;

        public static /* synthetic */ FileData copy$default(FileData fileData, long j, long j2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = fileData.id;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = fileData.size;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = fileData.displayName;
            }
            return fileData.copy(j3, j4, str);
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        public final FileData copy(long id, long size, String displayName) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            return new FileData(id, size, displayName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileData)) {
                return false;
            }
            FileData fileData = (FileData) other;
            return this.id == fileData.id && this.size == fileData.size && Intrinsics.areEqual(this.displayName, fileData.displayName);
        }

        public int hashCode() {
            return (((Long.hashCode(this.id) * 31) + Long.hashCode(this.size)) * 31) + this.displayName.hashCode();
        }

        public String toString() {
            return "FileData(id=" + this.id + ", size=" + this.size + ", displayName=" + this.displayName + ')';
        }

        public FileData(long j, long j2, String displayName) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.id = j;
            this.size = j2;
            this.displayName = displayName;
        }

        public final long getId() {
            return this.id;
        }

        public final long getSize() {
            return this.size;
        }

        public final String getDisplayName() {
            return this.displayName;
        }
    }

    public final String makeRelativePath(ImageDirectories directory, String subdir) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(subdir, "subdir");
        return directory + '/' + StringsKt.removeSuffix(StringsKt.removePrefix(subdir, (CharSequence) "/"), (CharSequence) "/") + '/';
    }

    public final List<FileData> query(Context context, String relativePath) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        Log.w(TAG, "query, relativePath: " + relativePath);
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        Cursor cursorQuery = contentResolver.query(getImagesTableUri(), new String[]{"_id", "_display_name", "_size"}, "relative_path = ?", new String[]{relativePath}, null);
        if (cursorQuery != null) {
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("_display_name");
                int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("_size");
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(columnIndexOrThrow);
                    String string = cursor2.getString(columnIndexOrThrow2);
                    long j2 = cursor2.getLong(columnIndexOrThrow3);
                    Log.w(TAG, " - cursor.moveToNext: " + j + "  " + string + "  " + j2);
                    Intrinsics.checkNotNull(string);
                    arrayList.add(new FileData(j, j2, string));
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursor, null);
            } finally {
            }
        }
        return arrayList;
    }

    public final int delete(Context context, String relativePath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        Log.w(TAG, "delete, relativePath: " + relativePath);
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        int iDelete = contentResolver.delete(getImagesTableUri(), "relative_path = ?", new String[]{relativePath});
        Log.w(TAG, "files deleted: " + iDelete);
        return iDelete;
    }

    private final void saveBuffer(Context context, byte[] buffer, Uri tableUri, String relativePath, String filename, String mimeType) throws Exception {
        Log.w(TAG, "saveBuffer size: " + buffer.length + " relativePath: " + relativePath + "  filename: " + filename);
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        ContentValues contentValues = new ContentValues();
        contentValues.put("relative_path", relativePath);
        contentValues.put("_display_name", filename);
        contentValues.put("mime_type", mimeType);
        Uri uriInsert = contentResolver.insert(tableUri, contentValues);
        if (uriInsert == null) {
            throw new Exception("insert is failed");
        }
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
        if (outputStreamOpenOutputStream == null) {
            throw new Exception("can't open file for writing");
        }
        outputStreamOpenOutputStream.write(buffer);
        outputStreamOpenOutputStream.close();
        Log.d(TAG, "..... file " + filename + " is saved");
    }
}
