package com.smartengines.engine.doc;

import android.graphics.Bitmap;
import com.smartengines.engine.Result;
import com.smartengines.visualization.Quad;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocResultData.kt */
@Metadata(m513d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J+\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m514d2 = {"Lcom/smartengines/engine/doc/DocResultData;", "Lcom/smartengines/engine/Result;", "documents", "", "Lcom/smartengines/engine/doc/DocumentData;", "scenes", "Landroid/graphics/Bitmap;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getDocuments", "()Ljava/util/List;", "getScenes", "isEmpty", "", "()Z", "quads", "", "Lcom/smartengines/visualization/Quad;", "getQuads", "()Ljava/util/Collection;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DocResultData implements Result {
    private final List<DocumentData> documents;
    private final List<Bitmap> scenes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocResultData copy$default(DocResultData docResultData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = docResultData.documents;
        }
        if ((i & 2) != 0) {
            list2 = docResultData.scenes;
        }
        return docResultData.copy(list, list2);
    }

    public final List<DocumentData> component1() {
        return this.documents;
    }

    public final List<Bitmap> component2() {
        return this.scenes;
    }

    public final DocResultData copy(List<DocumentData> documents, List<Bitmap> scenes) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        return new DocResultData(documents, scenes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocResultData)) {
            return false;
        }
        DocResultData docResultData = (DocResultData) other;
        return Intrinsics.areEqual(this.documents, docResultData.documents) && Intrinsics.areEqual(this.scenes, docResultData.scenes);
    }

    public int hashCode() {
        int iHashCode = this.documents.hashCode() * 31;
        List<Bitmap> list = this.scenes;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "DocResultData(documents=" + this.documents + ", scenes=" + this.scenes + ')';
    }

    public DocResultData(List<DocumentData> documents, List<Bitmap> list) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.documents = documents;
        this.scenes = list;
    }

    public final List<DocumentData> getDocuments() {
        return this.documents;
    }

    public final List<Bitmap> getScenes() {
        return this.scenes;
    }

    @Override // com.smartengines.engine.Result
    public boolean isEmpty() {
        return this.documents.isEmpty();
    }

    @Override // com.smartengines.engine.Result
    public Collection<Quad> getQuads() {
        if (((DocumentData) CollectionsKt.lastOrNull((List) this.documents)) != null) {
            return new ArrayList();
        }
        return CollectionsKt.emptyList();
    }
}
