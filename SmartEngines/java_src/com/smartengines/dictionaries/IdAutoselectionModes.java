package com.smartengines.dictionaries;

import androidx.autofill.HintConstants;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdAutoselectionModes.kt */
@Metadata(m513d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m514d2 = {"Lcom/smartengines/dictionaries/IdAutoselectionModes;", "", "<init>", "()V", "TAG", "", "data", "", "Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;", "getData", "()Ljava/util/List;", "data$delegate", "Lkotlin/Lazy;", "Item", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdAutoselectionModes {
    private static final String TAG = "myapp.IdAutoModes";
    public static final IdAutoselectionModes INSTANCE = new IdAutoselectionModes();

    /* renamed from: data$delegate, reason: from kotlin metadata */
    private static final Lazy data = LazyKt.lazy(new Function0() { // from class: com.smartengines.dictionaries.IdAutoselectionModes$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IdAutoselectionModes.data_delegate$lambda$0();
        }
    });

    private IdAutoselectionModes() {
    }

    /* compiled from: IdAutoselectionModes.kt */
    @Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m514d2 = {"Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;", "", "mode", "", "mask", HintConstants.AUTOFILL_HINT_NAME, "", "icon", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V", "getMode", "()Ljava/lang/String;", "getMask", "getName", "()Ljava/util/Map;", "getIcon", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Item {
        private final int icon;
        private final String mask;
        private final String mode;
        private final Map<String, String> name;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Item copy$default(Item item, String str, String str2, Map map, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = item.mode;
            }
            if ((i2 & 2) != 0) {
                str2 = item.mask;
            }
            if ((i2 & 4) != 0) {
                map = item.name;
            }
            if ((i2 & 8) != 0) {
                i = item.icon;
            }
            return item.copy(str, str2, map, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMask() {
            return this.mask;
        }

        public final Map<String, String> component3() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        public final Item copy(String mode, String mask, Map<String, String> name, int icon) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(mask, "mask");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Item(mode, mask, name, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.mode, item.mode) && Intrinsics.areEqual(this.mask, item.mask) && Intrinsics.areEqual(this.name, item.name) && this.icon == item.icon;
        }

        public int hashCode() {
            return (((((this.mode.hashCode() * 31) + this.mask.hashCode()) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.icon);
        }

        public String toString() {
            return "Item(mode=" + this.mode + ", mask=" + this.mask + ", name=" + this.name + ", icon=" + this.icon + ')';
        }

        public Item(String mode, String mask, Map<String, String> name, int i) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(mask, "mask");
            Intrinsics.checkNotNullParameter(name, "name");
            this.mode = mode;
            this.mask = mask;
            this.name = name;
            this.icon = i;
        }

        public final String getMode() {
            return this.mode;
        }

        public final String getMask() {
            return this.mask;
        }

        public final Map<String, String> getName() {
            return this.name;
        }

        public final int getIcon() {
            return this.icon;
        }
    }

    public final List<Item> getData() {
        return (List) data.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List data_delegate$lambda$0() {
        return CollectionsKt.listOf((Object[]) new Item[]{new Item("anydoc", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Any Document"), TuplesKt.m521to("ru", "Автовыбор ДУЛ")), C3289R.drawable.d_document), new Item("anypassport", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Any Passport"), TuplesKt.m521to("ru", "Заграничный паспорт")), C3289R.drawable.d_passport), new Item("anydrvlic", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Any Driving Licence"), TuplesKt.m521to("ru", "Водительское удостоверение")), C3289R.drawable.d_drvlic), new Item("anyid", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Any ID Card"), TuplesKt.m521to("ru", "ID-карта")), C3289R.drawable.d_id), new Item("default", "usa.drvlic.*", MapsKt.mapOf(TuplesKt.m521to("en", "Any USA Driver's License"), TuplesKt.m521to("ru", "Водительское удостоверение США")), C3289R.drawable.d_drvlic), new Item("anyid_eu", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Any EU ID Card"), TuplesKt.m521to("ru", "ID-карта страны ЕС")), C3289R.drawable.d_id), new Item("anydrvlic_eu", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Any EU Driving Licence"), TuplesKt.m521to("ru", "Водительское удостоверение страны ЕС")), C3289R.drawable.d_drvlic), new Item("anyrus", "*/rus.passport.previous", MapsKt.mapOf(TuplesKt.m521to("en", "Any Russian ID Document"), TuplesKt.m521to("ru", "Документ РФ, удостоверяющий личность")), C3289R.drawable.d_id), new Item("anycis", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Any CIS ID Document"), TuplesKt.m521to("ru", "Документ СНГ, удостоверяющий личность")), C3289R.drawable.d_id), new Item("anydrvlic_latam", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Any LATAM Driving Licence"), TuplesKt.m521to("ru", "Водительское удостоверение страны ЛатАм")), C3289R.drawable.d_drvlic), new Item("anyid_latam", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Any LATAM ID Card"), TuplesKt.m521to("ru", "ID-карта страны ЛатАм")), C3289R.drawable.d_id), new Item("anylatam", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Any LATAM Document"), TuplesKt.m521to("ru", "Документ страны ЛатАм")), C3289R.drawable.d_id), new Item("anyasia", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Any Asia Document"), TuplesKt.m521to("ru", "Документ страны Азии")), C3289R.drawable.d_id), new Item("anymena", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Any MENA Document"), TuplesKt.m521to("ru", "Документ страны MENA")), C3289R.drawable.d_id), new Item("anyafrica", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Any Africa Document"), TuplesKt.m521to("ru", "Документ страны Африки")), C3289R.drawable.d_id), new Item("aus_edrvlic", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Australian E-Driving License"), TuplesKt.m521to("ru", "Австралийское электронное водительское удостоверение")), C3289R.drawable.d_drvlic), new Item("anyvisa", "*", MapsKt.mapOf(TuplesKt.m521to("en", "Any Visa"), TuplesKt.m521to("ru", "Виза")), C3289R.drawable.d_visa)});
    }
}
