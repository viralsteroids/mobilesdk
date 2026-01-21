package com.smartengines.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhotoTakingState.kt */
@Metadata(m513d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m514d2 = {"Lcom/smartengines/app/PhotoTakingState;", "", "Inactive", "InProgress", "Ready", "Lcom/smartengines/app/PhotoTakingState$InProgress;", "Lcom/smartengines/app/PhotoTakingState$Inactive;", "Lcom/smartengines/app/PhotoTakingState$Ready;", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface PhotoTakingState {

    /* compiled from: PhotoTakingState.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/app/PhotoTakingState$Inactive;", "Lcom/smartengines/app/PhotoTakingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Inactive implements PhotoTakingState {
        public static final int $stable = 0;
        public static final Inactive INSTANCE = new Inactive();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Inactive)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -324836040;
        }

        public String toString() {
            return "Inactive";
        }

        private Inactive() {
        }
    }

    /* compiled from: PhotoTakingState.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/app/PhotoTakingState$InProgress;", "Lcom/smartengines/app/PhotoTakingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class InProgress implements PhotoTakingState {
        public static final int $stable = 0;
        public static final InProgress INSTANCE = new InProgress();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InProgress)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2084718591;
        }

        public String toString() {
            return "InProgress";
        }

        private InProgress() {
        }
    }

    /* compiled from: PhotoTakingState.kt */
    @Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m514d2 = {"Lcom/smartengines/app/PhotoTakingState$Ready;", "Lcom/smartengines/app/PhotoTakingState;", "photo", "Lcom/smartengines/app/Photo;", "fromGallery", "", "<init>", "(Lcom/smartengines/app/Photo;Z)V", "getPhoto", "()Lcom/smartengines/app/Photo;", "getFromGallery", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Ready implements PhotoTakingState {
        public static final int $stable = 8;
        private final boolean fromGallery;
        private final Photo photo;

        public static /* synthetic */ Ready copy$default(Ready ready, Photo photo, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                photo = ready.photo;
            }
            if ((i & 2) != 0) {
                z = ready.fromGallery;
            }
            return ready.copy(photo, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Photo getPhoto() {
            return this.photo;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getFromGallery() {
            return this.fromGallery;
        }

        public final Ready copy(Photo photo, boolean fromGallery) {
            Intrinsics.checkNotNullParameter(photo, "photo");
            return new Ready(photo, fromGallery);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.photo, ready.photo) && this.fromGallery == ready.fromGallery;
        }

        public int hashCode() {
            return (this.photo.hashCode() * 31) + Boolean.hashCode(this.fromGallery);
        }

        public String toString() {
            return "Ready(photo=" + this.photo + ", fromGallery=" + this.fromGallery + ')';
        }

        public Ready(Photo photo, boolean z) {
            Intrinsics.checkNotNullParameter(photo, "photo");
            this.photo = photo;
            this.fromGallery = z;
        }

        public final boolean getFromGallery() {
            return this.fromGallery;
        }

        public final Photo getPhoto() {
            return this.photo;
        }
    }
}
