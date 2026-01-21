package com.smartengines.nfc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.iso19794.FaceImageInfo;
import org.jmrtd.lds.iso19794.FaceInfo;

/* compiled from: FaceImageData.kt */
@Metadata(m513d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m514d2 = {"toFaceImageDataList", "", "Lcom/smartengines/nfc/FaceImageData;", "Lorg/jmrtd/lds/iso19794/FaceInfo;", "nfc_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class FaceImageDataKt {
    public static final List<FaceImageData> toFaceImageDataList(List<? extends FaceInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<FaceImageInfo> faceImageInfos = ((FaceInfo) it.next()).getFaceImageInfos();
            Intrinsics.checkNotNullExpressionValue(faceImageInfos, "getFaceImageInfos(...)");
            for (FaceImageInfo faceImageInfo : faceImageInfos) {
                Intrinsics.checkNotNull(faceImageInfo);
                arrayList.add(new FaceImageData(faceImageInfo));
            }
        }
        return arrayList;
    }
}
