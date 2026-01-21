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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdDocTypesRus.kt */
@Metadata(m513d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m514d2 = {"Lcom/smartengines/dictionaries/IdDocTypesRus;", "", "<init>", "()V", "data", "", "Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;", "getData", "()Ljava/util/List;", "data$delegate", "Lkotlin/Lazy;", "IdDocType", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdDocTypesRus {
    public static final IdDocTypesRus INSTANCE = new IdDocTypesRus();

    /* renamed from: data$delegate, reason: from kotlin metadata */
    private static final Lazy data = LazyKt.lazy(new Function0() { // from class: com.smartengines.dictionaries.IdDocTypesRus$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IdDocTypesRus.data_delegate$lambda$0();
        }
    });

    private IdDocTypesRus() {
    }

    /* compiled from: IdDocTypesRus.kt */
    @Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, m514d2 = {"Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;", "", "mode", "", "mask", HintConstants.AUTOFILL_HINT_NAME, "", "icon", "", "priority", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)V", "getMode", "()Ljava/lang/String;", "getMask", "getName", "()Ljava/util/Map;", "getIcon", "()I", "getPriority", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class IdDocType {
        private final int icon;
        private final String mask;
        private final String mode;
        private final Map<String, String> name;
        private final int priority;

        public static /* synthetic */ IdDocType copy$default(IdDocType idDocType, String str, String str2, Map map, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = idDocType.mode;
            }
            if ((i3 & 2) != 0) {
                str2 = idDocType.mask;
            }
            if ((i3 & 4) != 0) {
                map = idDocType.name;
            }
            if ((i3 & 8) != 0) {
                i = idDocType.icon;
            }
            if ((i3 & 16) != 0) {
                i2 = idDocType.priority;
            }
            int i4 = i2;
            Map map2 = map;
            return idDocType.copy(str, str2, map2, i, i4);
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

        /* renamed from: component5, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        public final IdDocType copy(String mode, String mask, Map<String, String> name, int icon, int priority) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(mask, "mask");
            Intrinsics.checkNotNullParameter(name, "name");
            return new IdDocType(mode, mask, name, icon, priority);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdDocType)) {
                return false;
            }
            IdDocType idDocType = (IdDocType) other;
            return Intrinsics.areEqual(this.mode, idDocType.mode) && Intrinsics.areEqual(this.mask, idDocType.mask) && Intrinsics.areEqual(this.name, idDocType.name) && this.icon == idDocType.icon && this.priority == idDocType.priority;
        }

        public int hashCode() {
            return (((((((this.mode.hashCode() * 31) + this.mask.hashCode()) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.icon)) * 31) + Integer.hashCode(this.priority);
        }

        public String toString() {
            return "IdDocType(mode=" + this.mode + ", mask=" + this.mask + ", name=" + this.name + ", icon=" + this.icon + ", priority=" + this.priority + ')';
        }

        public IdDocType(String mode, String mask, Map<String, String> name, int i, int i2) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(mask, "mask");
            Intrinsics.checkNotNullParameter(name, "name");
            this.mode = mode;
            this.mask = mask;
            this.name = name;
            this.icon = i;
            this.priority = i2;
        }

        public /* synthetic */ IdDocType(String str, String str2, Map map, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, map, i, (i3 & 16) != 0 ? 0 : i2);
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

        public final int getPriority() {
            return this.priority;
        }
    }

    public final List<IdDocType> getData() {
        return (List) data.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List data_delegate$lambda$0() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        return CollectionsKt.listOf((Object[]) new IdDocType[]{new IdDocType("default", "rus.passport.national", MapsKt.mapOf(TuplesKt.m521to("en", "National passport"), TuplesKt.m521to("ru", "Национальный паспорт")), C3289R.drawable.d_passport, 100), new IdDocType("face_control", "rus.passport.national", MapsKt.mapOf(TuplesKt.m521to("en", "National passport (Face Control)"), TuplesKt.m521to("ru", "Национальный паспорт (Face Control)")), C3289R.drawable.d_passport, 99), new IdDocType("anyrus", "rus.passport.registration", MapsKt.mapOf(TuplesKt.m521to("en", "National Passport: Registration"), TuplesKt.m521to("ru", "Национальный паспорт: прописка")), C3289R.drawable.d_stamp, 90), new IdDocType("default", "rus.passport.stamps_registration", MapsKt.mapOf(TuplesKt.m521to("en", "National Passport: Registration Page"), TuplesKt.m521to("ru", "Национальный паспорт: страница места жительства")), C3289R.drawable.d_passport, 86), new IdDocType("default", "rus.passport.stamps", MapsKt.mapOf(TuplesKt.m521to("en", "National Passport: Any Stamped Page"), TuplesKt.m521to("ru", "Национальный паспорт: страница с любым штампом")), C3289R.drawable.d_stamp, 85), new IdDocType("extended", "rus.passport.national", MapsKt.mapOf(TuplesKt.m521to("en", "National passport additional pages"), TuplesKt.m521to("ru", "Национальный паспорт: дополнительные страницы")), C3289R.drawable.d_passport, 84), new IdDocType("default", "rus.drvlic.*", MapsKt.mapOf(TuplesKt.m521to("en", "Any Driving Licence"), TuplesKt.m521to("ru", "Водительское удостоверение")), C3289R.drawable.d_drvlic, 80), new IdDocType("default", "rus.passport.biometric", MapsKt.mapOf(TuplesKt.m521to("en", "International biometric passport"), TuplesKt.m521to("ru", "Заграничный биометрический паспорт")), C3289R.drawable.d_passport, 70), new IdDocType("default", "rus.passport.international", MapsKt.mapOf(TuplesKt.m521to("en", "International passport"), TuplesKt.m521to("ru", "Заграничный паспорт старого образца")), C3289R.drawable.d_passport, 70), new IdDocType("default", "rus.drvlic.international.*", MapsKt.mapOf(TuplesKt.m521to("en", "International driving licence"), TuplesKt.m521to("ru", "Заграничное водительское удостоверение")), C3289R.drawable.d_drvlic, 60), new IdDocType("default", "rus.id.police.*", MapsKt.mapOf(TuplesKt.m521to("en", "Police ID card"), TuplesKt.m521to("ru", "ID полицейского")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.id.naks.*", MapsKt.mapOf(TuplesKt.m521to("en", "Specialist in welding production certificate (NAKS)"), TuplesKt.m521to("ru", "Аттестационное удостоверение специалиста сварочного производства (НАКС)")), C3289R.drawable.d_id, 0, 16, defaultConstructorMarker), new IdDocType("default", "rus.residence.*", MapsKt.mapOf(TuplesKt.m521to("en", "Residence permit"), TuplesKt.m521to("ru", "Вид на жительство")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.residence.biometric", MapsKt.mapOf(TuplesKt.m521to("en", "Biometric residence permit"), TuplesKt.m521to("ru", "Биометрический вид на жительство")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.residence.temporary.*", MapsKt.mapOf(TuplesKt.m521to("en", "Temporary residence permit"), TuplesKt.m521to("ru", "Временный вид на жительство")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.visa.*", MapsKt.mapOf(TuplesKt.m521to("en", "Visa"), TuplesKt.m521to("ru", "Виза")), C3289R.drawable.d_visa, 0, 16, null), new IdDocType("default", "rus.tractor_drvlic.*", MapsKt.mapOf(TuplesKt.m521to("en", "Tractor driving licence"), TuplesKt.m521to("ru", "Водительские права на трактор")), C3289R.drawable.d_drvlic, 0, 16, null), new IdDocType("default", "rus.id.military.*", MapsKt.mapOf(TuplesKt.m521to("en", "Military ID card"), TuplesKt.m521to("ru", "Военный билет")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.2p.*", MapsKt.mapOf(TuplesKt.m521to("en", "Temporary identity card"), TuplesKt.m521to("ru", "Временное удостоверение личности")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.id.no_citizenship.*", MapsKt.mapOf(TuplesKt.m521to("en", "Identity document of a stateless person"), TuplesKt.m521to("ru", "Документ, удостоверяющий личность лица без гражданства")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.seafarers_identity_document.*", MapsKt.mapOf(TuplesKt.m521to("en", "Seafarer's identity document"), TuplesKt.m521to("ru", "Документ, удостоверяющий личность моряка")), C3289R.drawable.d_id, 0, 16, defaultConstructorMarker), new IdDocType("default", "rus.inn.citizen.*", MapsKt.mapOf(TuplesKt.m521to("en", "INN (citizen)"), TuplesKt.m521to("ru", "ИНН физического лица")), C3289R.drawable.d_document, 0, 16, null), new IdDocType("default", "rus.inn.entity.*", MapsKt.mapOf(TuplesKt.m521to("en", "INN (entity)"), TuplesKt.m521to("ru", "ИНН юридического лица")), C3289R.drawable.d_document, 0, 16, null), new IdDocType("default", "rus.id.foreigner.*", MapsKt.mapOf(TuplesKt.m521to("en", "Foreigner ID Card"), TuplesKt.m521to("ru", "Карта иностранного гражданина")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.workshop_card.*", MapsKt.mapOf(TuplesKt.m521to("en", "Workshop card"), TuplesKt.m521to("ru", "Карта мастерской")), C3289R.drawable.d_document, 0, 16, null), new IdDocType("default", "rus.oms.*", MapsKt.mapOf(TuplesKt.m521to("en", "Medical insurance"), TuplesKt.m521to("ru", "Медицинская страховка")), C3289R.drawable.d_medcard, 0, 16, null), new IdDocType("default", "rus.migration_card.*", MapsKt.mapOf(TuplesKt.m521to("en", "Migration card"), TuplesKt.m521to("ru", "Миграционная карта")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.pts.*", MapsKt.mapOf(TuplesKt.m521to("en", "PTS"), TuplesKt.m521to("ru", "ПТС")), C3289R.drawable.d_sts, 0, 16, null), new IdDocType("default", "rus.pension_id.*", MapsKt.mapOf(TuplesKt.m521to("en", "Pension ID"), TuplesKt.m521to("ru", "Пенсионное удостоверение")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.conscription_certificate.*", MapsKt.mapOf(TuplesKt.m521to("en", "Conscription certificate"), TuplesKt.m521to("ru", "Приписное")), C3289R.drawable.d_id, 0, 16, defaultConstructorMarker), new IdDocType("default", "rus.health_permit.*", MapsKt.mapOf(TuplesKt.m521to("en", "Health permit"), TuplesKt.m521to("ru", "Разрешение на медицинское обслуживание")), C3289R.drawable.d_medcard, 0, 16, null), new IdDocType("default", "rus.firearm_permit.*", MapsKt.mapOf(TuplesKt.m521to("en", "Firearm permit"), TuplesKt.m521to("ru", "Разрешение на ношение огнестрельного оружия")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.work_permit.*", MapsKt.mapOf(TuplesKt.m521to("en", "Work permit"), TuplesKt.m521to("ru", "Разрешение на работу")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.snils.*", MapsKt.mapOf(TuplesKt.m521to("en", "SNILS"), TuplesKt.m521to("ru", "СНИЛС")), C3289R.drawable.d_snils, 0, 16, null), new IdDocType("default", "rus.sts.*", MapsKt.mapOf(TuplesKt.m521to("en", "STS"), TuplesKt.m521to("ru", "СТС")), C3289R.drawable.d_sts, 0, 16, null), new IdDocType("default", "rus.marriage_certificate.*", MapsKt.mapOf(TuplesKt.m521to("en", "Marriage certificate"), TuplesKt.m521to("ru", "Свидетельство о браке")), C3289R.drawable.d_document, 0, 16, null), new IdDocType("default", "rus.name_change_certificate.*", MapsKt.mapOf(TuplesKt.m521to("en", "Name change certificate"), TuplesKt.m521to("ru", "Свидетельство о перемене имени")), C3289R.drawable.d_document, 0, 16, null), new IdDocType("default", "rus.divorce_certificate.*", MapsKt.mapOf(TuplesKt.m521to("en", "Divorce certificate"), TuplesKt.m521to("ru", "Свидетельство о разводе")), C3289R.drawable.d_document, 0, 16, null), new IdDocType("default", "rus.birth_certificate.*", MapsKt.mapOf(TuplesKt.m521to("en", "Birth certificate"), TuplesKt.m521to("ru", "Свидетельство о рождении")), C3289R.drawable.d_birth_certificate, 0, 16, defaultConstructorMarker), new IdDocType("default", "rus.death_certificate.*", MapsKt.mapOf(TuplesKt.m521to("en", "Death certificate"), TuplesKt.m521to("ru", "Свидетельство о смерти")), C3289R.drawable.d_document, 0, 16, null), new IdDocType("default", "rus.disability_certificate.*", MapsKt.mapOf(TuplesKt.m521to("en", "Disability certificate"), TuplesKt.m521to("ru", "Свидетельство об инвалидности")), C3289R.drawable.d_document, 0, 16, null), new IdDocType("default", "rus.paternity_certificate.*", MapsKt.mapOf(TuplesKt.m521to("en", "Paternity certificate"), TuplesKt.m521to("ru", "Свидетельство об установлении отцовства")), C3289R.drawable.d_document, 0, 16, null), new IdDocType("default", "rus.adoption_certificate.*", MapsKt.mapOf(TuplesKt.m521to("en", "Adoption certificate"), TuplesKt.m521to("ru", "Свидетельство об усыновлении")), C3289R.drawable.d_document, 0, 16, null), new IdDocType("default", "rus.pension_certificate.*", MapsKt.mapOf(TuplesKt.m521to("en", "Pension Certificate"), TuplesKt.m521to("ru", "Свидетельство пенсионера")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.employment_record.*", MapsKt.mapOf(TuplesKt.m521to("en", "Employment record"), TuplesKt.m521to("ru", "Трудовая книжка")), C3289R.drawable.d_document, 0, 16, null), new IdDocType("default", "rus.id.mfa.*", MapsKt.mapOf(TuplesKt.m521to("en", "Ministry of Foreign Affairs ID"), TuplesKt.m521to("ru", "Удостоверение МИД")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.refugee.*", MapsKt.mapOf(TuplesKt.m521to("en", "Refugee ID"), TuplesKt.m521to("ru", "Удостоверение беженца")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.id.lawyer.*", MapsKt.mapOf(TuplesKt.m521to("en", "Lawyer ID card"), TuplesKt.m521to("ru", "Удостоверение личности адвоката")), C3289R.drawable.d_id, 0, 16, defaultConstructorMarker), new IdDocType("default", "rus.id.prosecutor.*", MapsKt.mapOf(TuplesKt.m521to("en", "Procecutor ID card"), TuplesKt.m521to("ru", "Удостоверение личности прокурора")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.large_family_certificate.*", MapsKt.mapOf(TuplesKt.m521to("en", "Large Family Certificate"), TuplesKt.m521to("ru", "Удостоверение многодетной семьи")), C3289R.drawable.d_document, 0, 16, null), new IdDocType("default", "rus.military_deferment_certificate.*", MapsKt.mapOf(TuplesKt.m521to("en", "Military Deferment Certificate"), TuplesKt.m521to("ru", "Удостоверение об отсрочке на военную службу")), C3289R.drawable.d_document, 0, 16, null), new IdDocType("default", "rus.id.soldier.*", MapsKt.mapOf(TuplesKt.m521to("en", "Soldier ID card"), TuplesKt.m521to("ru", "Удостоверение солдата")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.btlic.*", MapsKt.mapOf(TuplesKt.m521to("en", "Boating Licence"), TuplesKt.m521to("ru", "Удостоверение судоводителя")), C3289R.drawable.d_id, 0, 16, null), new IdDocType("default", "rus.passport.previous", MapsKt.mapOf(TuplesKt.m521to("en", "Previous passports stamp"), TuplesKt.m521to("ru", "Штамп о предыдущих паспортах")), C3289R.drawable.d_passport, 0, 16, null), new IdDocType("default", "rus.psm.*", MapsKt.mapOf(TuplesKt.m521to("en", "Vehicle Passport for Self-Propelled Machines and Other Equipment"), TuplesKt.m521to("ru", "Паспорт самоходной машины и других видов техники")), C3289R.drawable.d_id, 0, 16, null)});
    }
}
