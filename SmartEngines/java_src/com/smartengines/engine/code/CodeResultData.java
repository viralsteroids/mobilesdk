package com.smartengines.engine.code;

import com.smartengines.engine.Result;
import com.smartengines.visualization.Quad;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeResultData.kt */
@Metadata(m513d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m514d2 = {"Lcom/smartengines/engine/code/CodeResultData;", "Lcom/smartengines/engine/Result;", "objects", "", "Lcom/smartengines/engine/code/CodeObjectData;", "<init>", "(Ljava/util/List;)V", "getObjects", "()Ljava/util/List;", "isEmpty", "", "()Z", "quads", "", "Lcom/smartengines/visualization/Quad;", "getQuads", "()Ljava/util/Collection;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CodeResultData implements Result {
    private final List<CodeObjectData> objects;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CodeResultData copy$default(CodeResultData codeResultData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = codeResultData.objects;
        }
        return codeResultData.copy(list);
    }

    public final List<CodeObjectData> component1() {
        return this.objects;
    }

    public final CodeResultData copy(List<CodeObjectData> objects) {
        Intrinsics.checkNotNullParameter(objects, "objects");
        return new CodeResultData(objects);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CodeResultData) && Intrinsics.areEqual(this.objects, ((CodeResultData) other).objects);
    }

    public int hashCode() {
        return this.objects.hashCode();
    }

    public String toString() {
        return "CodeResultData(objects=" + this.objects + ')';
    }

    public CodeResultData(List<CodeObjectData> objects) {
        Intrinsics.checkNotNullParameter(objects, "objects");
        this.objects = objects;
    }

    public final List<CodeObjectData> getObjects() {
        return this.objects;
    }

    @Override // com.smartengines.engine.Result
    public boolean isEmpty() {
        return this.objects.isEmpty();
    }

    @Override // com.smartengines.engine.Result
    public Collection<Quad> getQuads() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.objects.iterator();
        while (it.hasNext()) {
            Quad quad = ((CodeObjectData) it.next()).getQuad();
            if (quad != null) {
                arrayList.add(quad);
            }
        }
        return arrayList;
    }
}
