package com.smartengines.visualization;

import android.util.Size;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: Visualization.kt */
@Metadata(m513d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m514d2 = {"Lcom/smartengines/visualization/Visualization;", "", "Quads", "Instruction", "Steps", "Timer", "Lcom/smartengines/visualization/Visualization$Instruction;", "Lcom/smartengines/visualization/Visualization$Quads;", "Lcom/smartengines/visualization/Visualization$Steps;", "Lcom/smartengines/visualization/Visualization$Timer;", "visualization_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface Visualization {

    /* compiled from: Visualization.kt */
    @Metadata(m513d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m514d2 = {"Lcom/smartengines/visualization/Visualization$Quads;", "Lcom/smartengines/visualization/Visualization;", "initialValue", "", "Lcom/smartengines/visualization/QuadFrame;", "<init>", "(Ljava/util/List;)V", "frameSize", "Landroid/util/Size;", "getFrameSize", "()Landroid/util/Size;", "setFrameSize", "(Landroid/util/Size;)V", "dataFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getDataFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "append", "", "quads", "", "Lcom/smartengines/visualization/Quad;", "visualization_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class Quads implements Visualization {
        public static final int $stable = 8;
        private final MutableStateFlow<List<QuadFrame>> dataFlow;
        public Size frameSize;

        /* JADX WARN: Multi-variable type inference failed */
        public Quads() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Quads(List<QuadFrame> initialValue) {
            Intrinsics.checkNotNullParameter(initialValue, "initialValue");
            this.dataFlow = StateFlowKt.MutableStateFlow(initialValue);
        }

        public /* synthetic */ Quads(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final Size getFrameSize() {
            Size size = this.frameSize;
            if (size != null) {
                return size;
            }
            Intrinsics.throwUninitializedPropertyAccessException("frameSize");
            return null;
        }

        public final void setFrameSize(Size size) {
            Intrinsics.checkNotNullParameter(size, "<set-?>");
            this.frameSize = size;
        }

        public final MutableStateFlow<List<QuadFrame>> getDataFlow() {
            return this.dataFlow;
        }

        public final void append(Set<Quad> quads) {
            Intrinsics.checkNotNullParameter(quads, "quads");
            MutableStateFlow<List<QuadFrame>> mutableStateFlow = this.dataFlow;
            while (true) {
                List<QuadFrame> value = mutableStateFlow.getValue();
                Set<Quad> set = quads;
                if (mutableStateFlow.compareAndSet(value, CollectionsKt.plus((Collection<? extends QuadFrame>) value, new QuadFrame(set, getFrameSize(), 0L, 4, null)))) {
                    return;
                } else {
                    quads = set;
                }
            }
        }
    }

    /* compiled from: Visualization.kt */
    @Metadata(m513d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m514d2 = {"Lcom/smartengines/visualization/Visualization$Instruction;", "Lcom/smartengines/visualization/Visualization;", "initialValue", "", "<init>", "(Ljava/lang/String;)V", "dataFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getDataFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "update", "", "newValue", "visualization_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class Instruction implements Visualization {
        public static final int $stable = 8;
        private final MutableStateFlow<String> dataFlow;

        /* JADX WARN: Multi-variable type inference failed */
        public Instruction() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Instruction(String str) {
            this.dataFlow = StateFlowKt.MutableStateFlow(str);
        }

        public /* synthetic */ Instruction(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final MutableStateFlow<String> getDataFlow() {
            return this.dataFlow;
        }

        public final void update(String newValue) {
            this.dataFlow.setValue(newValue);
        }
    }

    /* compiled from: Visualization.kt */
    @Metadata(m513d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082.¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0014"}, m514d2 = {"Lcom/smartengines/visualization/Visualization$Steps;", "Lcom/smartengines/visualization/Visualization;", "stepsCount", "", "<init>", "(I)V", "dataFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/smartengines/visualization/Visualization$Steps$StepState;", "getDataFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "data", "", "[Lcom/smartengines/visualization/Visualization$Steps$StepState;", "reset", "", "onStepCompleted", "stepState", "StepState", "visualization_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class Steps implements Visualization {
        public static final int $stable = 8;
        private StepState[] data;
        private final MutableStateFlow<List<StepState>> dataFlow;

        public Steps() {
            this(0, 1, null);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Visualization.kt */
        @Metadata(m513d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m514d2 = {"Lcom/smartengines/visualization/Visualization$Steps$StepState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_COMPLETED", "SUCCESSFUL", "FAILED", "visualization_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
        public static final class StepState {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ StepState[] $VALUES;
            public static final StepState NOT_COMPLETED = new StepState("NOT_COMPLETED", 0);
            public static final StepState SUCCESSFUL = new StepState("SUCCESSFUL", 1);
            public static final StepState FAILED = new StepState("FAILED", 2);

            private static final /* synthetic */ StepState[] $values() {
                return new StepState[]{NOT_COMPLETED, SUCCESSFUL, FAILED};
            }

            public static EnumEntries<StepState> getEntries() {
                return $ENTRIES;
            }

            static {
                StepState[] stepStateArr$values = $values();
                $VALUES = stepStateArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(stepStateArr$values);
            }

            private StepState(String str, int i) {
            }

            public static StepState valueOf(String str) {
                return (StepState) Enum.valueOf(StepState.class, str);
            }

            public static StepState[] values() {
                return (StepState[]) $VALUES.clone();
            }
        }

        public Steps(int i) {
            this.dataFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
            reset(i);
        }

        public /* synthetic */ Steps(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public final MutableStateFlow<List<StepState>> getDataFlow() {
            return this.dataFlow;
        }

        public final void reset(int stepsCount) {
            StepState[] stepStateArr = new StepState[stepsCount];
            for (int i = 0; i < stepsCount; i++) {
                stepStateArr[i] = StepState.NOT_COMPLETED;
            }
            this.data = stepStateArr;
            this.dataFlow.setValue(ArraysKt.toList(stepStateArr));
        }

        public final void onStepCompleted(StepState stepState) {
            Intrinsics.checkNotNullParameter(stepState, "stepState");
            StepState[] stepStateArr = this.data;
            StepState[] stepStateArr2 = null;
            if (stepStateArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
                stepStateArr = null;
            }
            int length = stepStateArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (stepStateArr[i] == StepState.NOT_COMPLETED) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                StepState[] stepStateArr3 = this.data;
                if (stepStateArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("data");
                    stepStateArr3 = null;
                }
                stepStateArr3[i] = stepState;
                MutableStateFlow<List<StepState>> mutableStateFlow = this.dataFlow;
                StepState[] stepStateArr4 = this.data;
                if (stepStateArr4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("data");
                } else {
                    stepStateArr2 = stepStateArr4;
                }
                mutableStateFlow.setValue(ArraysKt.toList(stepStateArr2));
            }
        }
    }

    /* compiled from: Visualization.kt */
    @Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m514d2 = {"Lcom/smartengines/visualization/Visualization$Timer;", "Lcom/smartengines/visualization/Visualization;", "<init>", "()V", "dataFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/smartengines/visualization/Visualization$Timer$Data;", "getDataFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "start", "", "length", "", "Data", "visualization_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class Timer implements Visualization {
        public static final int $stable = 8;
        private final MutableStateFlow<Data> dataFlow = StateFlowKt.MutableStateFlow(new Data(0, 0));

        /* compiled from: Visualization.kt */
        @Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0016"}, m514d2 = {"Lcom/smartengines/visualization/Visualization$Timer$Data;", "", "startTime", "", "stopTime", "<init>", "(JJ)V", "getStartTime", "()J", "getStopTime", "length", "getLength", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "visualization_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
        public static final /* data */ class Data {
            public static final int $stable = 0;
            private final long startTime;
            private final long stopTime;

            public static /* synthetic */ Data copy$default(Data data, long j, long j2, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = data.startTime;
                }
                if ((i & 2) != 0) {
                    j2 = data.stopTime;
                }
                return data.copy(j, j2);
            }

            /* renamed from: component1, reason: from getter */
            public final long getStartTime() {
                return this.startTime;
            }

            /* renamed from: component2, reason: from getter */
            public final long getStopTime() {
                return this.stopTime;
            }

            public final Data copy(long startTime, long stopTime) {
                return new Data(startTime, stopTime);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                return this.startTime == data.startTime && this.stopTime == data.stopTime;
            }

            public int hashCode() {
                return (Long.hashCode(this.startTime) * 31) + Long.hashCode(this.stopTime);
            }

            public String toString() {
                return "Data(startTime=" + this.startTime + ", stopTime=" + this.stopTime + ')';
            }

            public Data(long j, long j2) {
                this.startTime = j;
                this.stopTime = j2;
            }

            public final long getStartTime() {
                return this.startTime;
            }

            public final long getStopTime() {
                return this.stopTime;
            }

            public final long getLength() {
                return this.stopTime - this.startTime;
            }
        }

        public final MutableStateFlow<Data> getDataFlow() {
            return this.dataFlow;
        }

        public final void start(long length) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.dataFlow.setValue(new Data(jCurrentTimeMillis, length + jCurrentTimeMillis));
        }
    }
}
