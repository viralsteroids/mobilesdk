package com.smartengines.app.com.smartengines.app;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FacesModel.kt */
@Metadata(m513d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m514d2 = {"Lcom/smartengines/app/com/smartengines/app/SlotState;", "", "EMPTY", "CAMERA", "PHOTO", "Lcom/smartengines/app/com/smartengines/app/SlotState$CAMERA;", "Lcom/smartengines/app/com/smartengines/app/SlotState$EMPTY;", "Lcom/smartengines/app/com/smartengines/app/SlotState$PHOTO;", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface SlotState {

    /* compiled from: FacesModel.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/app/com/smartengines/app/SlotState$EMPTY;", "Lcom/smartengines/app/com/smartengines/app/SlotState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class EMPTY implements SlotState {
        public static final int $stable = 0;
        public static final EMPTY INSTANCE = new EMPTY();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EMPTY)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 841202898;
        }

        public String toString() {
            return "EMPTY";
        }

        private EMPTY() {
        }
    }

    /* compiled from: FacesModel.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/app/com/smartengines/app/SlotState$CAMERA;", "Lcom/smartengines/app/com/smartengines/app/SlotState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class CAMERA implements SlotState {
        public static final int $stable = 0;
        public static final CAMERA INSTANCE = new CAMERA();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CAMERA)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 239041568;
        }

        public String toString() {
            return "CAMERA";
        }

        private CAMERA() {
        }
    }

    /* compiled from: FacesModel.kt */
    @Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m514d2 = {"Lcom/smartengines/app/com/smartengines/app/SlotState$PHOTO;", "Lcom/smartengines/app/com/smartengines/app/SlotState;", "bitmap", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class PHOTO implements SlotState {
        public static final int $stable = 8;
        private final Bitmap bitmap;

        public static /* synthetic */ PHOTO copy$default(PHOTO photo, Bitmap bitmap, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = photo.bitmap;
            }
            return photo.copy(bitmap);
        }

        /* renamed from: component1, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final PHOTO copy(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            return new PHOTO(bitmap);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PHOTO) && Intrinsics.areEqual(this.bitmap, ((PHOTO) other).bitmap);
        }

        public int hashCode() {
            return this.bitmap.hashCode();
        }

        public String toString() {
            return "PHOTO(bitmap=" + this.bitmap + ')';
        }

        public PHOTO(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.bitmap = bitmap;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }
    }
}
