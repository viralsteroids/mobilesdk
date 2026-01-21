package androidx.camera.video;

import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class Quality {
    public static final Quality FHD;

    /* renamed from: HD */
    public static final Quality f28HD;
    public static final Quality HIGHEST;
    public static final Quality LOWEST;
    static final Quality NONE;
    private static final Set<Quality> QUALITIES;
    private static final List<Quality> QUALITIES_ORDER_BY_SIZE;

    /* renamed from: SD */
    public static final Quality f29SD;
    public static final Quality UHD;

    private Quality() {
    }

    static {
        ConstantQuality constantQualityM232of = ConstantQuality.m232of(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f29SD = constantQualityM232of;
        ConstantQuality constantQualityM232of2 = ConstantQuality.m232of(5, "HD", Collections.singletonList(new Size(1280, 720)));
        f28HD = constantQualityM232of2;
        ConstantQuality constantQualityM232of3 = ConstantQuality.m232of(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        FHD = constantQualityM232of3;
        ConstantQuality constantQualityM232of4 = ConstantQuality.m232of(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        UHD = constantQualityM232of4;
        ConstantQuality constantQualityM232of5 = ConstantQuality.m232of(0, "LOWEST", Collections.emptyList());
        LOWEST = constantQualityM232of5;
        ConstantQuality constantQualityM232of6 = ConstantQuality.m232of(1, "HIGHEST", Collections.emptyList());
        HIGHEST = constantQualityM232of6;
        NONE = ConstantQuality.m232of(-1, "NONE", Collections.emptyList());
        QUALITIES = new HashSet(Arrays.asList(constantQualityM232of5, constantQualityM232of6, constantQualityM232of, constantQualityM232of2, constantQualityM232of3, constantQualityM232of4));
        QUALITIES_ORDER_BY_SIZE = Arrays.asList(constantQualityM232of4, constantQualityM232of3, constantQualityM232of2, constantQualityM232of);
    }

    static boolean containsQuality(Quality quality) {
        return QUALITIES.contains(quality);
    }

    public static List<Quality> getSortedQualities() {
        return new ArrayList(QUALITIES_ORDER_BY_SIZE);
    }

    public static abstract class ConstantQuality extends Quality {
        public abstract String getName();

        public abstract List<Size> getTypicalSizes();

        public abstract int getValue();

        public ConstantQuality() {
            super();
        }

        /* renamed from: of */
        static ConstantQuality m232of(int i, String str, List<Size> list) {
            return new AutoValue_Quality_ConstantQuality(i, str, list);
        }
    }
}
