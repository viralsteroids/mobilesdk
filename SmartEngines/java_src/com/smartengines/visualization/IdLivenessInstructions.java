package com.smartengines.visualization;

import androidx.exifinterface.media.ExifInterface;
import com.smartengines.utils.Name;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: IdLivenessInstructions.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m514d2 = {"Lcom/smartengines/visualization/IdLivenessInstructions;", "", "<init>", "()V", "items", "", "", "Lcom/smartengines/visualization/Instruction;", "getItems", "()Ljava/util/Map;", "items$delegate", "Lkotlin/Lazy;", "Item", "visualization_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdLivenessInstructions {
    public static final IdLivenessInstructions INSTANCE = new IdLivenessInstructions();

    /* renamed from: items$delegate, reason: from kotlin metadata */
    private static final Lazy items = LazyKt.lazy(new Function0() { // from class: com.smartengines.visualization.IdLivenessInstructions$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IdLivenessInstructions.items_delegate$lambda$0();
        }
    });
    public static final int $stable = 8;

    private IdLivenessInstructions() {
    }

    /* compiled from: IdLivenessInstructions.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ0\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0006H×\u0001J\t\u0010\u0016\u001a\u00020\u0004H×\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m514d2 = {"Lcom/smartengines/visualization/IdLivenessInstructions$Item;", "", TextBundle.TEXT_ENTRY, "", "", "icon", "", "<init>", "(Ljava/util/Map;Ljava/lang/Integer;)V", "getText", "()Ljava/util/Map;", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/Map;Ljava/lang/Integer;)Lcom/smartengines/visualization/IdLivenessInstructions$Item;", "equals", "", "other", "hashCode", "toString", "visualization_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final Integer icon;
        private final Map<String, String> text;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Item copy$default(Item item, Map map, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                map = item.text;
            }
            if ((i & 2) != 0) {
                num = item.icon;
            }
            return item.copy(map, num);
        }

        public final Map<String, String> component1() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getIcon() {
            return this.icon;
        }

        public final Item copy(Map<String, String> text, Integer icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Item(text, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.text, item.text) && Intrinsics.areEqual(this.icon, item.icon);
        }

        public int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            Integer num = this.icon;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Item(text=" + this.text + ", icon=" + this.icon + ')';
        }

        public Item(Map<String, String> text, Integer num) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.icon = num;
        }

        public final Map<String, String> getText() {
            return this.text;
        }

        public final Integer getIcon() {
            return this.icon;
        }
    }

    public final Map<String, Instruction> getItems() {
        return (Map) items.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map items_delegate$lambda$0() {
        return MapsKt.mapOf(TuplesKt.m521to("CT", new Instruction(new Name("Complete", "Сессия окончена"), null)), TuplesKt.m521to("HS", new Instruction(new Name("Hold still", "Не двигайтесь"), null)), TuplesKt.m521to(ExifInterface.LATITUDE_SOUTH, new Instruction(new Name("Look straight into the camera", "Голову прямо"), Integer.valueOf(C3315R.drawable.mask_s))), TuplesKt.m521to("L", new Instruction(new Name("Rotate head to the right", "Поворачивайте голову вправо"), Integer.valueOf(C3315R.drawable.mask_r))), TuplesKt.m521to("LU", new Instruction(new Name("Lift head up to the right", "Поворачивайте голову вверх вправо"), Integer.valueOf(C3315R.drawable.mask_ru))), TuplesKt.m521to("LD", new Instruction(new Name("Put head down to the right", "Опускайте голову вниз вправо"), Integer.valueOf(C3315R.drawable.mask_rd))), TuplesKt.m521to("R", new Instruction(new Name("Rotate head to the left", "Поворачивайте голову влево"), Integer.valueOf(C3315R.drawable.mask_l))), TuplesKt.m521to("RU", new Instruction(new Name("Lift head up to the left", "Поднимайте голову вверх влево"), Integer.valueOf(C3315R.drawable.mask_lu))), TuplesKt.m521to("RD", new Instruction(new Name("Put head down to the left", "Опускайте голову вниз влево"), Integer.valueOf(C3315R.drawable.mask_ld))), TuplesKt.m521to("U", new Instruction(new Name("Rotate head to the up", "Поднимайте голову вверх"), Integer.valueOf(C3315R.drawable.mask_u))), TuplesKt.m521to("D", new Instruction(new Name("Rotate head to the down", "Опустите голову вниз"), Integer.valueOf(C3315R.drawable.mask_d))), TuplesKt.m521to("SM", new Instruction(new Name("Smile", "Улыбнитесь"), Integer.valueOf(C3315R.drawable.mask_sm))));
    }
}
