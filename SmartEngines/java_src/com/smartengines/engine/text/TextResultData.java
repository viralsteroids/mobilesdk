package com.smartengines.engine.text;

import com.smartengines.engine.Result;
import com.smartengines.visualization.Quad;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextResultData.kt */
@Metadata(m513d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m514d2 = {"Lcom/smartengines/engine/text/TextResultData;", "Lcom/smartengines/engine/Result;", "chunks", "", "Lcom/smartengines/engine/text/TextResultChunk;", "lines", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getChunks", "()Ljava/util/List;", "getLines", "isEmpty", "", "()Z", "quads", "", "Lcom/smartengines/visualization/Quad;", "getQuads", "()Ljava/util/Collection;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextResultData implements Result {
    private final List<TextResultChunk> chunks;
    private final List<String> lines;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextResultData copy$default(TextResultData textResultData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = textResultData.chunks;
        }
        if ((i & 2) != 0) {
            list2 = textResultData.lines;
        }
        return textResultData.copy(list, list2);
    }

    public final List<TextResultChunk> component1() {
        return this.chunks;
    }

    public final List<String> component2() {
        return this.lines;
    }

    public final TextResultData copy(List<TextResultChunk> chunks, List<String> lines) {
        Intrinsics.checkNotNullParameter(chunks, "chunks");
        Intrinsics.checkNotNullParameter(lines, "lines");
        return new TextResultData(chunks, lines);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextResultData)) {
            return false;
        }
        TextResultData textResultData = (TextResultData) other;
        return Intrinsics.areEqual(this.chunks, textResultData.chunks) && Intrinsics.areEqual(this.lines, textResultData.lines);
    }

    public int hashCode() {
        return (this.chunks.hashCode() * 31) + this.lines.hashCode();
    }

    public String toString() {
        return "TextResultData(chunks=" + this.chunks + ", lines=" + this.lines + ')';
    }

    public TextResultData(List<TextResultChunk> chunks, List<String> lines) {
        Intrinsics.checkNotNullParameter(chunks, "chunks");
        Intrinsics.checkNotNullParameter(lines, "lines");
        this.chunks = chunks;
        this.lines = lines;
    }

    public final List<TextResultChunk> getChunks() {
        return this.chunks;
    }

    public final List<String> getLines() {
        return this.lines;
    }

    @Override // com.smartengines.engine.Result
    public boolean isEmpty() {
        return this.chunks.isEmpty();
    }

    @Override // com.smartengines.engine.Result
    public Collection<Quad> getQuads() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.chunks.iterator();
        while (it.hasNext()) {
            Quad quad = ((TextResultChunk) it.next()).getGeometry().toQuad();
            if (quad != null) {
                arrayList.add(quad);
            }
        }
        return arrayList;
    }
}
