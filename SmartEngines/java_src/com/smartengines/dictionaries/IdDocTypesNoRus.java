package com.smartengines.dictionaries;

import androidx.autofill.HintConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdDocTypesNoRus.kt */
@Metadata(m513d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¨\u0006\t"}, m514d2 = {"Lcom/smartengines/dictionaries/IdDocTypesNoRus;", "", "<init>", "()V", "loadDictionary", "", "", "Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;", "IdDocType", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdDocTypesNoRus {
    public static final IdDocTypesNoRus INSTANCE = new IdDocTypesNoRus();

    private IdDocTypesNoRus() {
    }

    /* compiled from: IdDocTypesNoRus.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0018"}, m514d2 = {"Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;", "", HintConstants.AUTOFILL_HINT_NAME, "", "", "icon", "", "priority", "<init>", "(Ljava/util/Map;II)V", "getName", "()Ljava/util/Map;", "getIcon", "()I", "getPriority", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class IdDocType {
        private final int icon;
        private final Map<String, String> name;
        private final int priority;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IdDocType copy$default(IdDocType idDocType, Map map, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                map = idDocType.name;
            }
            if ((i3 & 2) != 0) {
                i = idDocType.icon;
            }
            if ((i3 & 4) != 0) {
                i2 = idDocType.priority;
            }
            return idDocType.copy(map, i, i2);
        }

        public final Map<String, String> component1() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        public final IdDocType copy(Map<String, String> name, int icon, int priority) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new IdDocType(name, icon, priority);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdDocType)) {
                return false;
            }
            IdDocType idDocType = (IdDocType) other;
            return Intrinsics.areEqual(this.name, idDocType.name) && this.icon == idDocType.icon && this.priority == idDocType.priority;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + Integer.hashCode(this.icon)) * 31) + Integer.hashCode(this.priority);
        }

        public String toString() {
            return "IdDocType(name=" + this.name + ", icon=" + this.icon + ", priority=" + this.priority + ')';
        }

        public IdDocType(Map<String, String> name, int i, int i2) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.icon = i;
            this.priority = i2;
        }

        public /* synthetic */ IdDocType(Map map, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(map, i, (i3 & 4) != 0 ? 0 : i2);
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

    public final Map<String, IdDocType> loadDictionary() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 4;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        int i2 = 0;
        int i3 = 4;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        int i4 = 0;
        int i5 = 4;
        int i6 = 0;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        int i7 = 4;
        int i8 = 0;
        int i9 = 4;
        DefaultConstructorMarker defaultConstructorMarker5 = null;
        int i10 = 0;
        return MapsKt.mapOf(TuplesKt.m521to("passport", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Passport"), TuplesKt.m521to("ru", "Паспорт")), C3289R.drawable.d_passport, 70)), TuplesKt.m521to("passport.internal", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Internal passport"), TuplesKt.m521to("ru", "Внутренний паспорт")), C3289R.drawable.d_passport, 100)), TuplesKt.m521to("passport.registration", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Registration page"), TuplesKt.m521to("ru", "Страница регистрации")), C3289R.drawable.d_id, -1)), TuplesKt.m521to("passport_card", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Passport card"), TuplesKt.m521to("ru", "Паспортная карта")), C3289R.drawable.d_id, 0, 4, defaultConstructorMarker)), TuplesKt.m521to("id", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "ID card"), TuplesKt.m521to("ru", "ID-карта")), C3289R.drawable.d_id, 100)), TuplesKt.m521to("id.diplomatic", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Diplomatic ID card"), TuplesKt.m521to("ru", "Дипломатическое удостоверение личности")), C3289R.drawable.d_id, i2, i, defaultConstructorMarker2)), TuplesKt.m521to("id.professional", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Professional ID document"), TuplesKt.m521to("ru", "Профессиональное удостоверение личности")), C3289R.drawable.d_document, i2, i, defaultConstructorMarker2)), TuplesKt.m521to("id.builder", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Builder ID"), TuplesKt.m521to("ru", "ID строителя")), C3289R.drawable.d_id, i2, i, defaultConstructorMarker2)), TuplesKt.m521to("btp", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Builder ID"), TuplesKt.m521to("ru", "ID строителя")), C3289R.drawable.d_id, 0, 4, defaultConstructorMarker)), TuplesKt.m521to("id.military", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Military ID card"), TuplesKt.m521to("ru", "Военный билет")), C3289R.drawable.d_id, i4, i3, defaultConstructorMarker3)), TuplesKt.m521to("id.doctor", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Doctor ID"), TuplesKt.m521to("ru", "ID доктора")), C3289R.drawable.d_id, i4, i3, defaultConstructorMarker3)), TuplesKt.m521to("id.police", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Police ID card"), TuplesKt.m521to("ru", "ID полицейского")), C3289R.drawable.d_id, i4, i3, defaultConstructorMarker3)), TuplesKt.m521to("id.veterinary", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Veterinary ID card"), TuplesKt.m521to("ru", "Удостоверение личности ветеринара")), C3289R.drawable.d_id, i4, i3, defaultConstructorMarker3)), TuplesKt.m521to("id.student", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Student ID card"), TuplesKt.m521to("ru", "Студенческая ID карта")), C3289R.drawable.d_id, i4, i3, defaultConstructorMarker3)), TuplesKt.m521to("id.lawyer", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Lawyer ID card"), TuplesKt.m521to("ru", "Удостоверение личности адвоката")), C3289R.drawable.d_id, i4, i3, defaultConstructorMarker3)), TuplesKt.m521to("drvlic", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Driving licence"), TuplesKt.m521to("ru", "Водительское удостоверение")), C3289R.drawable.d_drvlic, 80)), TuplesKt.m521to("drvlic.provisional", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Provisional driving licence"), TuplesKt.m521to("ru", "Временное водительское удостоверение")), C3289R.drawable.d_drvlic, 60)), TuplesKt.m521to("drvlic.military", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Military driving licence"), TuplesKt.m521to("ru", "Военное водительское удостоверение")), C3289R.drawable.d_drvlic, 60)), TuplesKt.m521to("AAMVA.drvlic", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "AAMVA Driver's License"), TuplesKt.m521to("ru", "AAMVA Водительское удостоверение")), C3289R.drawable.d_drvlic, 84)), TuplesKt.m521to("birth_certificate", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Birth certificate"), TuplesKt.m521to("ru", "Свидетельство о рождении")), C3289R.drawable.d_birth_certificate, i6, i5, defaultConstructorMarker)), TuplesKt.m521to("death_certificate", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Death certificate"), TuplesKt.m521to("ru", "Свидетельство о смерти")), C3289R.drawable.d_document, i6, i5, defaultConstructorMarker)), TuplesKt.m521to("name_change_certificate", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Name change certificate"), TuplesKt.m521to("ru", "Свидетельство о перемене имени")), C3289R.drawable.d_document, i6, i5, defaultConstructorMarker)), TuplesKt.m521to("paternity_certificate", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Paternity certificate"), TuplesKt.m521to("ru", "Свидетельство об установлении отцовства")), C3289R.drawable.d_document, i6, i5, defaultConstructorMarker)), TuplesKt.m521to("immigration_certificate", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Immigration Certificate"), TuplesKt.m521to("ru", "Иммиграционный сертификат")), C3289R.drawable.d_document, i6, i5, defaultConstructorMarker)), TuplesKt.m521to("adoption_certificate", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Adoption certificate"), TuplesKt.m521to("ru", "Свидетельство об усыновлении")), C3289R.drawable.d_document, i6, i5, defaultConstructorMarker)), TuplesKt.m521to("divorce_certificate", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Divorce certificate"), TuplesKt.m521to("ru", "Свидетельство о разводе")), C3289R.drawable.d_document, i6, i5, defaultConstructorMarker)), TuplesKt.m521to("marriage_certificate", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Marriage certificate"), TuplesKt.m521to("ru", "Свидетельство о браке")), C3289R.drawable.d_document, i6, i5, defaultConstructorMarker)), TuplesKt.m521to("naturalization_certificate", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Certificate of Naturalization"), TuplesKt.m521to("ru", "Сертификат натурализации")), C3289R.drawable.d_id, i6, i5, defaultConstructorMarker)), TuplesKt.m521to("vrc", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Vehicle registration certificate"), TuplesKt.m521to("ru", "Свидетельство о регистрации транспортного средства")), C3289R.drawable.d_sts, i6, i5, defaultConstructorMarker)), TuplesKt.m521to("wp", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Work permit"), TuplesKt.m521to("ru", "Разрешение на работу")), C3289R.drawable.d_id, i6, i5, defaultConstructorMarker)), TuplesKt.m521to("work", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Work permit"), TuplesKt.m521to("ru", "Разрешение на работу")), C3289R.drawable.d_id, 0, 4, defaultConstructorMarker4)), TuplesKt.m521to("residence", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Residence permit"), TuplesKt.m521to("ru", "Вид на жительство")), C3289R.drawable.d_id, 0, 4, null)), TuplesKt.m521to("ssn82", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "SSN-82"), TuplesKt.m521to("ru", "Номер социального страхования (SSN-82)")), C3289R.drawable.d_id, i8, i7, defaultConstructorMarker4)), TuplesKt.m521to("rp", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Residence permit"), TuplesKt.m521to("ru", "Вид на жительство")), C3289R.drawable.d_id, i8, i7, defaultConstructorMarker4)), TuplesKt.m521to("border_crossing", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Border crossing card"), TuplesKt.m521to("ru", "Карта для пересечения границы")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("pilotlic", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Pilot licence"), TuplesKt.m521to("ru", "Лицензия пилота")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("aadhaar", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Aadhaar card"), TuplesKt.m521to("ru", "Aadhaar карта")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("firearm_permit", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Firearm permit"), TuplesKt.m521to("ru", "Разрешение на ношение огнестрельного оружия")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("re_license", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Real estate licence"), TuplesKt.m521to("ru", "Лицензия на недвижимость")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("veteran_card", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Veteran card"), TuplesKt.m521to("ru", "Удостоверение ветерана")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("advocate_license", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Advocate license"), TuplesKt.m521to("ru", "Адвокатская лицензия")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("voter_card", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Voter card"), TuplesKt.m521to("ru", "Карта избирателя")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("employment_record", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Employment record"), TuplesKt.m521to("ru", "Трудовая книжка")), C3289R.drawable.d_document, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("tin", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Tax identification"), TuplesKt.m521to("ru", "ИНН")), C3289R.drawable.d_document, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("health_insurance", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Health insurance"), TuplesKt.m521to("ru", "Страхование здоровья")), C3289R.drawable.d_medcard, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("pancard", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "PAN card"), TuplesKt.m521to("ru", "Карта PAN")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("ammpid", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "AMMPID"), TuplesKt.m521to("ru", "AMMPID")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("visa", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Visa"), TuplesKt.m521to("ru", "Виза")), C3289R.drawable.d_visa, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("nins", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "NINS slip"), TuplesKt.m521to("ru", "Квитанция NINS")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("seafarers_identity_document", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Seafarer's identity document"), TuplesKt.m521to("ru", "Документ, удостоверяющий личность моряка")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("homereturn", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Home return card"), TuplesKt.m521to("ru", "Карта возврата домой")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("insurance", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Medical insurance"), TuplesKt.m521to("ru", "Медицинская страховка")), C3289R.drawable.d_medcard, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("vaccination_card", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Vaccination card"), TuplesKt.m521to("ru", "Карта о вакцинации")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("medcard", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Medical card"), TuplesKt.m521to("ru", "Медицинская карта")), C3289R.drawable.d_medcard, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("address_card", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Address card"), TuplesKt.m521to("ru", "Адресная карта")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("payslip", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Payment slip"), TuplesKt.m521to("ru", "Платёжный чек")), C3289R.drawable.d_document, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("establishment_card", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Establishment card"), TuplesKt.m521to("ru", "Карта учреждения")), C3289R.drawable.d_document, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("rp.asylum", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Asylum residence permit"), TuplesKt.m521to("ru", "Вид на жительство беженца")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("btlic", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Boating Licence"), TuplesKt.m521to("ru", "Удостоверение судоводителя")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("emergency_travel_document", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Emergency Travel Document"), TuplesKt.m521to("ru", "Экстренный Проездной Документ")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("hunting_license", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Hunting License"), TuplesKt.m521to("ru", "Разрешение на охоту")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("psm", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Vehicle Passport for Self-Propelled Machines and Other Equipment"), TuplesKt.m521to("ru", "Паспорт самоходной машины и других видов техники")), C3289R.drawable.d_id, i10, i9, defaultConstructorMarker5)), TuplesKt.m521to("id.tribal", new IdDocType(MapsKt.mapOf(TuplesKt.m521to("en", "Tribal ID card"), TuplesKt.m521to("ru", "Племенная ID-карта")), C3289R.drawable.d_id, 0, 4, null)));
    }
}
