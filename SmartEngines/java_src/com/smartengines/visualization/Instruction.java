package com.smartengines.visualization;

import com.smartengines.utils.Name;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: Instruction.kt */
@Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0014\u001a\u00020\u0005H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m514d2 = {"Lcom/smartengines/visualization/Instruction;", "", TextBundle.TEXT_ENTRY, "Lcom/smartengines/utils/Name;", "icon", "", "<init>", "(Lcom/smartengines/utils/Name;Ljava/lang/Integer;)V", "getText", "()Lcom/smartengines/utils/Name;", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/smartengines/utils/Name;Ljava/lang/Integer;)Lcom/smartengines/visualization/Instruction;", "equals", "", "other", "hashCode", "toString", "", "visualization_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Instruction {
    public static final int $stable = 8;
    private final Integer icon;
    private final Name text;

    public static /* synthetic */ Instruction copy$default(Instruction instruction, Name name, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            name = instruction.text;
        }
        if ((i & 2) != 0) {
            num = instruction.icon;
        }
        return instruction.copy(name, num);
    }

    /* renamed from: component1, reason: from getter */
    public final Name getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    public final Instruction copy(Name text, Integer icon) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new Instruction(text, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Instruction)) {
            return false;
        }
        Instruction instruction = (Instruction) other;
        return Intrinsics.areEqual(this.text, instruction.text) && Intrinsics.areEqual(this.icon, instruction.icon);
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Integer num = this.icon;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "Instruction(text=" + this.text + ", icon=" + this.icon + ')';
    }

    public Instruction(Name text, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.icon = num;
    }

    public final Name getText() {
        return this.text;
    }

    public final Integer getIcon() {
        return this.icon;
    }
}
