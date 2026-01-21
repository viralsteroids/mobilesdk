package com.smartengines.engine.p005id;

import android.graphics.Bitmap;
import com.smartengines.engine.ImageFactory;
import com.smartengines.engine.p005id.FacesResult;
import com.smartengines.p006id.IdFaceSession;
import com.smartengines.p006id.IdFaceSimilarityResult;
import com.smartengines.p006id.IdFaceStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Faces.kt */
@Metadata(m513d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, m514d2 = {"compareFaces", "Lcom/smartengines/engine/id/FacesResult;", "Lcom/smartengines/engine/id/IdEngineWrapper;", "bitmapOne", "Landroid/graphics/Bitmap;", "bitmapTwo", "engine_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class FacesKt {
    public static final FacesResult compareFaces(IdEngineWrapper idEngineWrapper, Bitmap bitmapOne, Bitmap bitmapTwo) {
        Intrinsics.checkNotNullParameter(idEngineWrapper, "<this>");
        Intrinsics.checkNotNullParameter(bitmapOne, "bitmapOne");
        Intrinsics.checkNotNullParameter(bitmapTwo, "bitmapTwo");
        IdFaceSession idFaceSession = null;
        try {
            IdFaceSession idFaceSessionSpawnFaceSession = idEngineWrapper.getIdEngine().SpawnFaceSession(idEngineWrapper.getIdEngine().CreateFaceSessionSettings(), idEngineWrapper.getSignature());
            IdFaceSimilarityResult idFaceSimilarityResultGetSimilarity = idFaceSessionSpawnFaceSession.GetSimilarity(ImageFactory.INSTANCE.imageFromBitmap(bitmapOne), ImageFactory.INSTANCE.imageFromBitmap(bitmapTwo));
            idFaceSessionSpawnFaceSession.delete();
            IdFaceStatus idFaceStatusGetStatus = idFaceSimilarityResultGetSimilarity.GetStatus();
            if (Intrinsics.areEqual(idFaceStatusGetStatus, IdFaceStatus.IdFaceStatus_Success)) {
                return new FacesResult.Success(idFaceSimilarityResultGetSimilarity.GetSimilarityEstimation());
            }
            return FacesResult.Error.INSTANCE.fromInt(idFaceStatusGetStatus.swigValue());
        } catch (Throwable th) {
            if (0 != 0) {
                idFaceSession.delete();
            }
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            return new FacesResult.Exception(message);
        }
    }
}
