package com.smartengines.app;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: EngineList.kt */
@Metadata(m513d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u001dH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m514d2 = {"Lcom/smartengines/app/EngineList;", "", "code", "Lcom/smartengines/app/EngineStaff;", "doc", "id", TextBundle.TEXT_ENTRY, "<init>", "(Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;Lcom/smartengines/app/EngineStaff;)V", "getCode", "()Lcom/smartengines/app/EngineStaff;", "getDoc", "getId", "getText", "asList", "", "getAsList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EngineList {
    public static final int $stable = 8;
    private final List<EngineStaff> asList;
    private final EngineStaff code;
    private final EngineStaff doc;
    private final EngineStaff id;
    private final EngineStaff text;

    public static /* synthetic */ EngineList copy$default(EngineList engineList, EngineStaff engineStaff, EngineStaff engineStaff2, EngineStaff engineStaff3, EngineStaff engineStaff4, int i, Object obj) {
        if ((i & 1) != 0) {
            engineStaff = engineList.code;
        }
        if ((i & 2) != 0) {
            engineStaff2 = engineList.doc;
        }
        if ((i & 4) != 0) {
            engineStaff3 = engineList.id;
        }
        if ((i & 8) != 0) {
            engineStaff4 = engineList.text;
        }
        return engineList.copy(engineStaff, engineStaff2, engineStaff3, engineStaff4);
    }

    /* renamed from: component1, reason: from getter */
    public final EngineStaff getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final EngineStaff getDoc() {
        return this.doc;
    }

    /* renamed from: component3, reason: from getter */
    public final EngineStaff getId() {
        return this.id;
    }

    /* renamed from: component4, reason: from getter */
    public final EngineStaff getText() {
        return this.text;
    }

    public final EngineList copy(EngineStaff code, EngineStaff doc, EngineStaff id, EngineStaff text) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(doc, "doc");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        return new EngineList(code, doc, id, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EngineList)) {
            return false;
        }
        EngineList engineList = (EngineList) other;
        return Intrinsics.areEqual(this.code, engineList.code) && Intrinsics.areEqual(this.doc, engineList.doc) && Intrinsics.areEqual(this.id, engineList.id) && Intrinsics.areEqual(this.text, engineList.text);
    }

    public int hashCode() {
        return (((((this.code.hashCode() * 31) + this.doc.hashCode()) * 31) + this.id.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "EngineList(code=" + this.code + ", doc=" + this.doc + ", id=" + this.id + ", text=" + this.text + ')';
    }

    public EngineList(EngineStaff code, EngineStaff doc, EngineStaff id, EngineStaff text) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(doc, "doc");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.code = code;
        this.doc = doc;
        this.id = id;
        this.text = text;
        this.asList = CollectionsKt.listOf((Object[]) new EngineStaff[]{code, doc, id, text});
    }

    public final EngineStaff getCode() {
        return this.code;
    }

    public final EngineStaff getDoc() {
        return this.doc;
    }

    public final EngineStaff getId() {
        return this.id;
    }

    public final EngineStaff getText() {
        return this.text;
    }

    public final List<EngineStaff> getAsList() {
        return this.asList;
    }
}
