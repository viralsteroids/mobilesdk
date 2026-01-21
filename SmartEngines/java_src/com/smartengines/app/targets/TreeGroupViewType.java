package com.smartengines.app.targets;

import kotlin.Metadata;

/* compiled from: TreeGroupViewType.kt */
@Metadata(m513d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m514d2 = {"Lcom/smartengines/app/targets/TreeGroupViewType;", "", "OneLevelRows", "OneLevelIcons", "TwoLevelsIconsTexts", "ThreeLevelsAccordion", "Lcom/smartengines/app/targets/TreeGroupViewType$OneLevelIcons;", "Lcom/smartengines/app/targets/TreeGroupViewType$OneLevelRows;", "Lcom/smartengines/app/targets/TreeGroupViewType$ThreeLevelsAccordion;", "Lcom/smartengines/app/targets/TreeGroupViewType$TwoLevelsIconsTexts;", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface TreeGroupViewType {

    /* compiled from: TreeGroupViewType.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/app/targets/TreeGroupViewType$OneLevelRows;", "Lcom/smartengines/app/targets/TreeGroupViewType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class OneLevelRows implements TreeGroupViewType {
        public static final int $stable = 0;
        public static final OneLevelRows INSTANCE = new OneLevelRows();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OneLevelRows)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -249057897;
        }

        public String toString() {
            return "OneLevelRows";
        }

        private OneLevelRows() {
        }
    }

    /* compiled from: TreeGroupViewType.kt */
    @Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m514d2 = {"Lcom/smartengines/app/targets/TreeGroupViewType$OneLevelIcons;", "Lcom/smartengines/app/targets/TreeGroupViewType;", "colNumber", "", "<init>", "(I)V", "getColNumber", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class OneLevelIcons implements TreeGroupViewType {
        public static final int $stable = 0;
        private final int colNumber;

        public static /* synthetic */ OneLevelIcons copy$default(OneLevelIcons oneLevelIcons, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = oneLevelIcons.colNumber;
            }
            return oneLevelIcons.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getColNumber() {
            return this.colNumber;
        }

        public final OneLevelIcons copy(int colNumber) {
            return new OneLevelIcons(colNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OneLevelIcons) && this.colNumber == ((OneLevelIcons) other).colNumber;
        }

        public int hashCode() {
            return Integer.hashCode(this.colNumber);
        }

        public String toString() {
            return "OneLevelIcons(colNumber=" + this.colNumber + ')';
        }

        public OneLevelIcons(int i) {
            this.colNumber = i;
        }

        public final int getColNumber() {
            return this.colNumber;
        }
    }

    /* compiled from: TreeGroupViewType.kt */
    @Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m514d2 = {"Lcom/smartengines/app/targets/TreeGroupViewType$TwoLevelsIconsTexts;", "Lcom/smartengines/app/targets/TreeGroupViewType;", "colNumber", "", "<init>", "(I)V", "getColNumber", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class TwoLevelsIconsTexts implements TreeGroupViewType {
        public static final int $stable = 0;
        private final int colNumber;

        public static /* synthetic */ TwoLevelsIconsTexts copy$default(TwoLevelsIconsTexts twoLevelsIconsTexts, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = twoLevelsIconsTexts.colNumber;
            }
            return twoLevelsIconsTexts.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getColNumber() {
            return this.colNumber;
        }

        public final TwoLevelsIconsTexts copy(int colNumber) {
            return new TwoLevelsIconsTexts(colNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TwoLevelsIconsTexts) && this.colNumber == ((TwoLevelsIconsTexts) other).colNumber;
        }

        public int hashCode() {
            return Integer.hashCode(this.colNumber);
        }

        public String toString() {
            return "TwoLevelsIconsTexts(colNumber=" + this.colNumber + ')';
        }

        public TwoLevelsIconsTexts(int i) {
            this.colNumber = i;
        }

        public final int getColNumber() {
            return this.colNumber;
        }
    }

    /* compiled from: TreeGroupViewType.kt */
    @Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m514d2 = {"Lcom/smartengines/app/targets/TreeGroupViewType$ThreeLevelsAccordion;", "Lcom/smartengines/app/targets/TreeGroupViewType;", "colNumber", "", "<init>", "(I)V", "getColNumber", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class ThreeLevelsAccordion implements TreeGroupViewType {
        public static final int $stable = 0;
        private final int colNumber;

        public static /* synthetic */ ThreeLevelsAccordion copy$default(ThreeLevelsAccordion threeLevelsAccordion, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = threeLevelsAccordion.colNumber;
            }
            return threeLevelsAccordion.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getColNumber() {
            return this.colNumber;
        }

        public final ThreeLevelsAccordion copy(int colNumber) {
            return new ThreeLevelsAccordion(colNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ThreeLevelsAccordion) && this.colNumber == ((ThreeLevelsAccordion) other).colNumber;
        }

        public int hashCode() {
            return Integer.hashCode(this.colNumber);
        }

        public String toString() {
            return "ThreeLevelsAccordion(colNumber=" + this.colNumber + ')';
        }

        public ThreeLevelsAccordion(int i) {
            this.colNumber = i;
        }

        public final int getColNumber() {
            return this.colNumber;
        }
    }
}
