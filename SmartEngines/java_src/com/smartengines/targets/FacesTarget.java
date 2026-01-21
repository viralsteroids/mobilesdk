package com.smartengines.targets;

import android.graphics.Bitmap;
import com.smartengines.engine.Engine;
import com.smartengines.engine.EngineId;
import com.smartengines.engine.RecognitionTarget;
import com.smartengines.engine.Session;
import com.smartengines.engine.SessionSettingsLogger;
import com.smartengines.engine.SessionType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FacesTarget.kt */
@Metadata(m513d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m514d2 = {"Lcom/smartengines/targets/FacesTarget;", "Lcom/smartengines/engine/RecognitionTarget;", "photo", "Landroid/graphics/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "getPhoto", "()Landroid/graphics/Bitmap;", "engineId", "Lcom/smartengines/engine/EngineId;", "getEngineId", "()Lcom/smartengines/engine/EngineId;", "createSession", "Lcom/smartengines/engine/Session;", "engine", "Lcom/smartengines/engine/Engine;", "sessionType", "Lcom/smartengines/engine/SessionType;", "logger", "Lcom/smartengines/engine/SessionSettingsLogger;", "sessionTypes", "", "getSessionTypes", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FacesTarget implements RecognitionTarget {
    private final Bitmap photo;
    private final EngineId engineId = EngineId.f368ID;
    private final Set<SessionType> sessionTypes = SetsKt.setOf(SessionType.PHOTO_SESSION);

    public static /* synthetic */ FacesTarget copy$default(FacesTarget facesTarget, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = facesTarget.photo;
        }
        return facesTarget.copy(bitmap);
    }

    /* renamed from: component1, reason: from getter */
    public final Bitmap getPhoto() {
        return this.photo;
    }

    public final FacesTarget copy(Bitmap photo) {
        return new FacesTarget(photo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FacesTarget) && Intrinsics.areEqual(this.photo, ((FacesTarget) other).photo);
    }

    public int hashCode() {
        Bitmap bitmap = this.photo;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }

    public String toString() {
        return "FacesTarget(photo=" + this.photo + ')';
    }

    public FacesTarget(Bitmap bitmap) {
        this.photo = bitmap;
    }

    public final Bitmap getPhoto() {
        return this.photo;
    }

    @Override // com.smartengines.engine.RecognitionTarget
    public EngineId getEngineId() {
        return this.engineId;
    }

    @Override // com.smartengines.engine.RecognitionTarget
    public Session createSession(Engine engine, SessionType sessionType, SessionSettingsLogger logger) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.smartengines.engine.RecognitionTarget
    public Set<SessionType> getSessionTypes() {
        return this.sessionTypes;
    }
}
