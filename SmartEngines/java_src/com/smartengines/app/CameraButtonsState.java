package com.smartengines.app;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CameraButtonsState.kt */
@Metadata(m513d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\t¨\u0006\u0015"}, m514d2 = {"Lcom/smartengines/app/CameraButtonsState;", "", "isCrop", "", "isVideoMode", "isVideoPhotoSwitchAllowed", "isGalleryAllowed", "<init>", "(ZZZZ)V", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CameraButtonsState {
    public static final int $stable = 0;
    private final boolean isCrop;
    private final boolean isGalleryAllowed;
    private final boolean isVideoMode;
    private final boolean isVideoPhotoSwitchAllowed;

    public CameraButtonsState() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ CameraButtonsState copy$default(CameraButtonsState cameraButtonsState, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cameraButtonsState.isCrop;
        }
        if ((i & 2) != 0) {
            z2 = cameraButtonsState.isVideoMode;
        }
        if ((i & 4) != 0) {
            z3 = cameraButtonsState.isVideoPhotoSwitchAllowed;
        }
        if ((i & 8) != 0) {
            z4 = cameraButtonsState.isGalleryAllowed;
        }
        return cameraButtonsState.copy(z, z2, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCrop() {
        return this.isCrop;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsVideoMode() {
        return this.isVideoMode;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsVideoPhotoSwitchAllowed() {
        return this.isVideoPhotoSwitchAllowed;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsGalleryAllowed() {
        return this.isGalleryAllowed;
    }

    public final CameraButtonsState copy(boolean isCrop, boolean isVideoMode, boolean isVideoPhotoSwitchAllowed, boolean isGalleryAllowed) {
        return new CameraButtonsState(isCrop, isVideoMode, isVideoPhotoSwitchAllowed, isGalleryAllowed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraButtonsState)) {
            return false;
        }
        CameraButtonsState cameraButtonsState = (CameraButtonsState) other;
        return this.isCrop == cameraButtonsState.isCrop && this.isVideoMode == cameraButtonsState.isVideoMode && this.isVideoPhotoSwitchAllowed == cameraButtonsState.isVideoPhotoSwitchAllowed && this.isGalleryAllowed == cameraButtonsState.isGalleryAllowed;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isCrop) * 31) + Boolean.hashCode(this.isVideoMode)) * 31) + Boolean.hashCode(this.isVideoPhotoSwitchAllowed)) * 31) + Boolean.hashCode(this.isGalleryAllowed);
    }

    public String toString() {
        return "CameraButtonsState(isCrop=" + this.isCrop + ", isVideoMode=" + this.isVideoMode + ", isVideoPhotoSwitchAllowed=" + this.isVideoPhotoSwitchAllowed + ", isGalleryAllowed=" + this.isGalleryAllowed + ')';
    }

    public CameraButtonsState(boolean z, boolean z2, boolean z3, boolean z4) {
        this.isCrop = z;
        this.isVideoMode = z2;
        this.isVideoPhotoSwitchAllowed = z3;
        this.isGalleryAllowed = z4;
    }

    public /* synthetic */ CameraButtonsState(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4);
    }

    public final boolean isCrop() {
        return this.isCrop;
    }

    public final boolean isVideoMode() {
        return this.isVideoMode;
    }

    public final boolean isVideoPhotoSwitchAllowed() {
        return this.isVideoPhotoSwitchAllowed;
    }

    public final boolean isGalleryAllowed() {
        return this.isGalleryAllowed;
    }
}
