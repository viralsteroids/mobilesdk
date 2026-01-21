package com.smartengines.engine.doc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocResultData.kt */
@Metadata(m513d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0005HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, m514d2 = {"Lcom/smartengines/engine/doc/TableField;", "", "info", "Lcom/smartengines/engine/doc/FieldInfo;", "header", "", "", "rows", "Lcom/smartengines/engine/doc/TextField;", "<init>", "(Lcom/smartengines/engine/doc/FieldInfo;Ljava/util/List;Ljava/util/List;)V", "getInfo", "()Lcom/smartengines/engine/doc/FieldInfo;", "getHeader", "()Ljava/util/List;", "getRows", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TableField {
    private final List<String> header;
    private final FieldInfo info;
    private final List<List<TextField>> rows;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TableField copy$default(TableField tableField, FieldInfo fieldInfo, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            fieldInfo = tableField.info;
        }
        if ((i & 2) != 0) {
            list = tableField.header;
        }
        if ((i & 4) != 0) {
            list2 = tableField.rows;
        }
        return tableField.copy(fieldInfo, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final FieldInfo getInfo() {
        return this.info;
    }

    public final List<String> component2() {
        return this.header;
    }

    public final List<List<TextField>> component3() {
        return this.rows;
    }

    public final TableField copy(FieldInfo info, List<String> header, List<? extends List<TextField>> rows) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new TableField(info, header, rows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TableField)) {
            return false;
        }
        TableField tableField = (TableField) other;
        return Intrinsics.areEqual(this.info, tableField.info) && Intrinsics.areEqual(this.header, tableField.header) && Intrinsics.areEqual(this.rows, tableField.rows);
    }

    public int hashCode() {
        return (((this.info.hashCode() * 31) + this.header.hashCode()) * 31) + this.rows.hashCode();
    }

    public String toString() {
        return "TableField(info=" + this.info + ", header=" + this.header + ", rows=" + this.rows + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TableField(FieldInfo info, List<String> header, List<? extends List<TextField>> rows) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.info = info;
        this.header = header;
        this.rows = rows;
    }

    public final FieldInfo getInfo() {
        return this.info;
    }

    public final List<String> getHeader() {
        return this.header;
    }

    public final List<List<TextField>> getRows() {
        return this.rows;
    }
}
