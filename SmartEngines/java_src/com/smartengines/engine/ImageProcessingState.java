package com.smartengines.engine;

import android.graphics.Bitmap;
import com.smartengines.visualization.Visualization;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageProcessingState.kt */
@Metadata(m513d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m514d2 = {"Lcom/smartengines/engine/ImageProcessingState;", "", "WAITING", "VIDEO_PROCESSING", "PHOTO_PROCESSING", "FINISHED", "ERROR", "Lcom/smartengines/engine/ImageProcessingState$ERROR;", "Lcom/smartengines/engine/ImageProcessingState$FINISHED;", "Lcom/smartengines/engine/ImageProcessingState$PHOTO_PROCESSING;", "Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;", "Lcom/smartengines/engine/ImageProcessingState$WAITING;", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface ImageProcessingState {

    /* compiled from: ImageProcessingState.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/engine/ImageProcessingState$WAITING;", "Lcom/smartengines/engine/ImageProcessingState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class WAITING implements ImageProcessingState {
        public static final WAITING INSTANCE = new WAITING();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WAITING)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1740013653;
        }

        public String toString() {
            return "WAITING";
        }

        private WAITING() {
        }
    }

    /* compiled from: ImageProcessingState.kt */
    @Metadata(m513d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m514d2 = {"Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;", "Lcom/smartengines/engine/ImageProcessingState;", "target", "Lcom/smartengines/engine/RecognitionTarget;", "visualizations", "", "Lcom/smartengines/visualization/Visualization;", "<init>", "(Lcom/smartengines/engine/RecognitionTarget;Ljava/util/Collection;)V", "getTarget", "()Lcom/smartengines/engine/RecognitionTarget;", "getVisualizations", "()Ljava/util/Collection;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class VIDEO_PROCESSING implements ImageProcessingState {
        private final RecognitionTarget target;
        private final Collection<Visualization> visualizations;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VIDEO_PROCESSING copy$default(VIDEO_PROCESSING video_processing, RecognitionTarget recognitionTarget, Collection collection, int i, Object obj) {
            if ((i & 1) != 0) {
                recognitionTarget = video_processing.target;
            }
            if ((i & 2) != 0) {
                collection = video_processing.visualizations;
            }
            return video_processing.copy(recognitionTarget, collection);
        }

        /* renamed from: component1, reason: from getter */
        public final RecognitionTarget getTarget() {
            return this.target;
        }

        public final Collection<Visualization> component2() {
            return this.visualizations;
        }

        public final VIDEO_PROCESSING copy(RecognitionTarget target, Collection<? extends Visualization> visualizations) {
            Intrinsics.checkNotNullParameter(target, "target");
            return new VIDEO_PROCESSING(target, visualizations);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VIDEO_PROCESSING)) {
                return false;
            }
            VIDEO_PROCESSING video_processing = (VIDEO_PROCESSING) other;
            return Intrinsics.areEqual(this.target, video_processing.target) && Intrinsics.areEqual(this.visualizations, video_processing.visualizations);
        }

        public int hashCode() {
            int iHashCode = this.target.hashCode() * 31;
            Collection<Visualization> collection = this.visualizations;
            return iHashCode + (collection == null ? 0 : collection.hashCode());
        }

        public String toString() {
            return "VIDEO_PROCESSING(target=" + this.target + ", visualizations=" + this.visualizations + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public VIDEO_PROCESSING(RecognitionTarget target, Collection<? extends Visualization> collection) {
            Intrinsics.checkNotNullParameter(target, "target");
            this.target = target;
            this.visualizations = collection;
        }

        public final RecognitionTarget getTarget() {
            return this.target;
        }

        public final Collection<Visualization> getVisualizations() {
            return this.visualizations;
        }
    }

    /* compiled from: ImageProcessingState.kt */
    @Metadata(m513d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m514d2 = {"Lcom/smartengines/engine/ImageProcessingState$PHOTO_PROCESSING;", "Lcom/smartengines/engine/ImageProcessingState;", "target", "Lcom/smartengines/engine/RecognitionTarget;", "visualizations", "", "Lcom/smartengines/visualization/Visualization;", "photo", "Landroid/graphics/Bitmap;", "<init>", "(Lcom/smartengines/engine/RecognitionTarget;Ljava/util/Collection;Landroid/graphics/Bitmap;)V", "getTarget", "()Lcom/smartengines/engine/RecognitionTarget;", "getVisualizations", "()Ljava/util/Collection;", "getPhoto", "()Landroid/graphics/Bitmap;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class PHOTO_PROCESSING implements ImageProcessingState {
        private final Bitmap photo;
        private final RecognitionTarget target;
        private final Collection<Visualization> visualizations;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PHOTO_PROCESSING copy$default(PHOTO_PROCESSING photo_processing, RecognitionTarget recognitionTarget, Collection collection, Bitmap bitmap, int i, Object obj) {
            if ((i & 1) != 0) {
                recognitionTarget = photo_processing.target;
            }
            if ((i & 2) != 0) {
                collection = photo_processing.visualizations;
            }
            if ((i & 4) != 0) {
                bitmap = photo_processing.photo;
            }
            return photo_processing.copy(recognitionTarget, collection, bitmap);
        }

        /* renamed from: component1, reason: from getter */
        public final RecognitionTarget getTarget() {
            return this.target;
        }

        public final Collection<Visualization> component2() {
            return this.visualizations;
        }

        /* renamed from: component3, reason: from getter */
        public final Bitmap getPhoto() {
            return this.photo;
        }

        public final PHOTO_PROCESSING copy(RecognitionTarget target, Collection<? extends Visualization> visualizations, Bitmap photo) {
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(photo, "photo");
            return new PHOTO_PROCESSING(target, visualizations, photo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PHOTO_PROCESSING)) {
                return false;
            }
            PHOTO_PROCESSING photo_processing = (PHOTO_PROCESSING) other;
            return Intrinsics.areEqual(this.target, photo_processing.target) && Intrinsics.areEqual(this.visualizations, photo_processing.visualizations) && Intrinsics.areEqual(this.photo, photo_processing.photo);
        }

        public int hashCode() {
            int iHashCode = this.target.hashCode() * 31;
            Collection<Visualization> collection = this.visualizations;
            return ((iHashCode + (collection == null ? 0 : collection.hashCode())) * 31) + this.photo.hashCode();
        }

        public String toString() {
            return "PHOTO_PROCESSING(target=" + this.target + ", visualizations=" + this.visualizations + ", photo=" + this.photo + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PHOTO_PROCESSING(RecognitionTarget target, Collection<? extends Visualization> collection, Bitmap photo) {
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(photo, "photo");
            this.target = target;
            this.visualizations = collection;
            this.photo = photo;
        }

        public final RecognitionTarget getTarget() {
            return this.target;
        }

        public final Collection<Visualization> getVisualizations() {
            return this.visualizations;
        }

        public final Bitmap getPhoto() {
            return this.photo;
        }
    }

    /* compiled from: ImageProcessingState.kt */
    @Metadata(m513d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m514d2 = {"Lcom/smartengines/engine/ImageProcessingState$FINISHED;", "Lcom/smartengines/engine/ImageProcessingState;", "sessionType", "Lcom/smartengines/engine/SessionType;", "lastImage", "Landroid/graphics/Bitmap;", "<init>", "(Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;)V", "getSessionType", "()Lcom/smartengines/engine/SessionType;", "getLastImage", "()Landroid/graphics/Bitmap;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class FINISHED implements ImageProcessingState {
        private final Bitmap lastImage;
        private final SessionType sessionType;

        public static /* synthetic */ FINISHED copy$default(FINISHED finished, SessionType sessionType, Bitmap bitmap, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionType = finished.sessionType;
            }
            if ((i & 2) != 0) {
                bitmap = finished.lastImage;
            }
            return finished.copy(sessionType, bitmap);
        }

        /* renamed from: component1, reason: from getter */
        public final SessionType getSessionType() {
            return this.sessionType;
        }

        /* renamed from: component2, reason: from getter */
        public final Bitmap getLastImage() {
            return this.lastImage;
        }

        public final FINISHED copy(SessionType sessionType, Bitmap lastImage) {
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            Intrinsics.checkNotNullParameter(lastImage, "lastImage");
            return new FINISHED(sessionType, lastImage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FINISHED)) {
                return false;
            }
            FINISHED finished = (FINISHED) other;
            return this.sessionType == finished.sessionType && Intrinsics.areEqual(this.lastImage, finished.lastImage);
        }

        public int hashCode() {
            return (this.sessionType.hashCode() * 31) + this.lastImage.hashCode();
        }

        public String toString() {
            return "FINISHED(sessionType=" + this.sessionType + ", lastImage=" + this.lastImage + ')';
        }

        public FINISHED(SessionType sessionType, Bitmap lastImage) {
            Intrinsics.checkNotNullParameter(sessionType, "sessionType");
            Intrinsics.checkNotNullParameter(lastImage, "lastImage");
            this.sessionType = sessionType;
            this.lastImage = lastImage;
        }

        public final SessionType getSessionType() {
            return this.sessionType;
        }

        public final Bitmap getLastImage() {
            return this.lastImage;
        }
    }

    /* compiled from: ImageProcessingState.kt */
    @Metadata(m513d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0004j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\n\u001a\u00060\u0004j\u0002`\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0004j\u0002`\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\u00060\u0004j\u0002`\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m514d2 = {"Lcom/smartengines/engine/ImageProcessingState$ERROR;", "Lcom/smartengines/engine/ImageProcessingState;", "error", "Lkotlin/Exception;", "Ljava/lang/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "Ljava/lang/Exception;", "component1", "copy", "(Ljava/lang/Exception;)Lcom/smartengines/engine/ImageProcessingState$ERROR;", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class ERROR implements ImageProcessingState {
        private final Exception error;

        public static /* synthetic */ ERROR copy$default(ERROR error, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.error;
            }
            return error.copy(exc);
        }

        /* renamed from: component1, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        public final ERROR copy(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new ERROR(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ERROR) && Intrinsics.areEqual(this.error, ((ERROR) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "ERROR(error=" + this.error + ')';
        }

        public ERROR(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Exception getError() {
            return this.error;
        }
    }
}
