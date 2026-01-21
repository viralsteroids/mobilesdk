package androidx.compose.foundation.layout;

import androidx.compose.p000ui.layout.Measurable;
import androidx.compose.p000ui.layout.MeasureResult;
import androidx.compose.p000ui.layout.MeasureScope;
import androidx.compose.p000ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: RowColumnMeasurePolicy.kt */
@Metadata(m513d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, m514d2 = {"measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "startIndex", "endIndex", "crossAxisOffset", "", "currentLineIndex", "(Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;IIIIILandroidx/compose/ui/layout/MeasureScope;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;II[II)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class RowColumnMeasurePolicyKt {
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029b A[Catch: IllegalArgumentException -> 0x0337, TRY_LEAVE, TryCatch #3 {IllegalArgumentException -> 0x0337, blocks: (B:65:0x0288, B:73:0x029b), top: B:127:0x0288 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MeasureResult measure(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i, int i2, int i3, int i4, int i5, MeasureScope measureScope, List<? extends Measurable> list, Placeable[] placeableArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        int i11;
        float f;
        String str;
        String str2;
        String str3;
        long j;
        String str4;
        String str5;
        long j2;
        String str6;
        int i12;
        int iCoerceIn;
        int i13;
        int i14;
        String str7;
        int i15;
        String str8;
        int i16;
        String str9;
        int i17;
        String str10;
        String str11;
        FlowLayoutData flowLayoutData;
        String str12;
        int i18;
        String str13;
        int i19;
        String str14;
        float f2;
        long j3;
        String str15;
        long j4;
        Integer num;
        float f3;
        int i20;
        char c;
        String str16;
        int iIntValue;
        int iIntValue2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        RowColumnMeasurePolicy rowColumnMeasurePolicy2;
        int i28;
        FlowLayoutData flowLayoutData2;
        int i29 = i4;
        List<? extends Measurable> list2 = list;
        int i30 = i7;
        long j5 = i5;
        int i31 = i30 - i6;
        int[] iArr2 = new int[i31];
        int i32 = 0;
        int i33 = i6;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        float f4 = 0.0f;
        while (true) {
            Integer numValueOf = null;
            i9 = i35;
            if (i33 >= i30) {
                break;
            }
            float f5 = f4;
            Measurable measurable = list2.get(i33);
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            int i39 = (i36 != 0 || RowColumnImplKt.isRelative(rowColumnParentData)) ? 1 : i32;
            if (weight > 0.0f) {
                f4 = f5 + weight;
                i34++;
                i24 = i31;
                i25 = i33;
                i35 = i9;
            } else {
                if (i29 != Integer.MAX_VALUE && rowColumnParentData != null && (flowLayoutData2 = rowColumnParentData.getFlowLayoutData()) != null) {
                    numValueOf = Integer.valueOf(Math.round(flowLayoutData2.getFillCrossAxisFraction() * i29));
                }
                int i40 = i3 - i9;
                Placeable placeableMo5931measureBRTryo0 = placeableArr[i33];
                if (placeableMo5931measureBRTryo0 == null) {
                    i26 = i40;
                    i25 = i33;
                    i24 = i31;
                    i27 = i9;
                    rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
                    i28 = i34;
                    placeableMo5931measureBRTryo0 = measurable.mo5931measureBRTryo0(RowColumnMeasurePolicy.m1460createConstraintsxF2OJ5Q$default(rowColumnMeasurePolicy2, 0, numValueOf != null ? numValueOf.intValue() : i32, i3 != Integer.MAX_VALUE ? RangesKt.coerceAtLeast(i40, i32) : Integer.MAX_VALUE, numValueOf != null ? numValueOf.intValue() : i29, false, 16, null));
                } else {
                    i24 = i31;
                    i25 = i33;
                    i26 = i40;
                    i27 = i9;
                    rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
                    i28 = i34;
                }
                int iMainAxisSize = rowColumnMeasurePolicy2.mainAxisSize(placeableMo5931measureBRTryo0);
                int iCrossAxisSize = rowColumnMeasurePolicy2.crossAxisSize(placeableMo5931measureBRTryo0);
                iArr2[i25 - i6] = iMainAxisSize;
                int iMin = Math.min(i5, RangesKt.coerceAtLeast(i26 - iMainAxisSize, 0));
                i35 = i27 + iMainAxisSize + iMin;
                int iMax = Math.max(i38, iCrossAxisSize);
                placeableArr[i25] = placeableMo5931measureBRTryo0;
                i38 = iMax;
                i37 = iMin;
                i34 = i28;
                f4 = f5;
            }
            i33 = i25 + 1;
            i29 = i4;
            i36 = i39;
            i31 = i24;
            i32 = 0;
        }
        int i41 = i31;
        float f6 = f4;
        int i42 = i38;
        int i43 = i9;
        RowColumnMeasurePolicy rowColumnMeasurePolicy3 = rowColumnMeasurePolicy;
        int i44 = i34;
        if (i44 == 0) {
            i13 = i43 - i37;
            i12 = i42;
            i10 = i36;
            iCoerceIn = 0;
        } else {
            int i45 = i3 != Integer.MAX_VALUE ? i3 : i;
            long j6 = (i44 - 1) * j5;
            int i46 = i42;
            long jCoerceAtLeast = RangesKt.coerceAtLeast((i45 - i43) - j6, 0L);
            float f7 = jCoerceAtLeast / f6;
            int i47 = i6;
            long jRound = jCoerceAtLeast;
            i10 = i36;
            while (true) {
                i11 = i46;
                f = f7;
                str = "weightUnitSpace ";
                str2 = "arrangementSpacingTotal ";
                str3 = "fixedSpace ";
                j = jCoerceAtLeast;
                str4 = "remainingToTarget ";
                str5 = "targetSpace ";
                j2 = j6;
                str6 = "mainAxisMin ";
                if (i47 >= i30) {
                    break;
                }
                float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(list2.get(i47)));
                float f8 = f * weight2;
                try {
                    jRound -= Math.round(f8);
                    i47++;
                    list2 = list;
                    i46 = i11;
                    f7 = f;
                    jCoerceAtLeast = j;
                    j6 = j2;
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ");
                    sb.append(i3).append("mainAxisMin ").append(i).append("targetSpace ").append(i45).append("arrangementSpacingPx ").append(j5).append("weightChildrenCount ").append(i44).append("fixedSpace ").append(i43).append("arrangementSpacingTotal ").append(j2).append(str4).append(j).append("totalWeight ").append(f6).append(str).append(f).append("itemWeight ").append(weight2).append("weightedSize ");
                    sb.append(f8);
                    throw new IllegalArgumentException(sb.toString()).initCause(e);
                }
            }
            int i48 = i44;
            String str17 = "weightedSize ";
            String str18 = "weightChildrenCount ";
            int iMax2 = i11;
            int i49 = 0;
            int i50 = i6;
            while (i50 < i30) {
                if (placeableArr[i50] == null) {
                    i16 = i50;
                    Measurable measurable2 = list.get(i50);
                    RowColumnParentData rowColumnParentData2 = RowColumnImplKt.getRowColumnParentData(measurable2);
                    float weight3 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    int i51 = i49;
                    Integer numValueOf2 = (i4 == Integer.MAX_VALUE || rowColumnParentData2 == null || (flowLayoutData = rowColumnParentData2.getFlowLayoutData()) == null) ? null : Integer.valueOf(Math.round(i4 * flowLayoutData.getFillCrossAxisFraction()));
                    if (weight3 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    Integer num2 = numValueOf2;
                    int sign = MathKt.getSign(jRound);
                    String str19 = str5;
                    jRound -= sign;
                    float f9 = f * weight3;
                    String str20 = str6;
                    int iMax3 = Math.max(0, Math.round(f9) + sign);
                    try {
                        try {
                            if (RowColumnImplKt.getFill(rowColumnParentData2)) {
                                c = CharCompanionObject.MAX_VALUE;
                                int i52 = iMax3 != Integer.MAX_VALUE ? iMax3 : 0;
                                if (num2 == null) {
                                    String str21 = str17;
                                    i20 = iMax3;
                                    iIntValue = num2.intValue();
                                    str16 = str21;
                                } else {
                                    str16 = str17;
                                    i20 = iMax3;
                                    iIntValue = 0;
                                }
                                if (num2 == null) {
                                    try {
                                        iIntValue2 = num2.intValue();
                                    } catch (IllegalArgumentException e2) {
                                        e = e2;
                                        String str22 = str18;
                                        i14 = i43;
                                        str7 = str22;
                                        str8 = str2;
                                        i18 = sign;
                                        i19 = i48;
                                        str12 = str16;
                                        str14 = str;
                                        f2 = weight3;
                                        j3 = j;
                                        str15 = str4;
                                        j4 = j2;
                                        num = num2;
                                        f3 = f9;
                                        str11 = str20;
                                        str13 = str3;
                                        str10 = str19;
                                        StringBuilder sb2 = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ");
                                        sb2.append(i3).append(str11).append(i).append(str10).append(i45).append("arrangementSpacingPx ").append(j5).append(str7).append(i19).append(str13).append(i14).append(str8).append(j4).append(str15).append(j3).append("totalWeight ").append(f6).append(str14).append(f).append("weight ").append(f2).append(str12);
                                        sb2.append(f3).append("crossAxisDesiredSize ").append(num).append("remainderUnit ").append(i18).append("childMainAxisSize ").append(i20);
                                        throw new IllegalArgumentException(sb2.toString()).initCause(e);
                                    }
                                } else {
                                    iIntValue2 = i4;
                                }
                                String str23 = str18;
                                i14 = i43;
                                str7 = str23;
                                str8 = str2;
                                str12 = str16;
                                int i53 = iIntValue2;
                                str14 = str;
                                f2 = weight3;
                                j3 = j;
                                str15 = str4;
                                j4 = j2;
                                num = num2;
                                f3 = f9;
                                i18 = sign;
                                str13 = str3;
                                i19 = i48;
                                str10 = str19;
                                str11 = str20;
                                Placeable placeableMo5931measureBRTryo02 = measurable2.mo5931measureBRTryo0(rowColumnMeasurePolicy.mo1350createConstraintsxF2OJ5Q(i52, iIntValue, i20, i53, true));
                                int iMainAxisSize2 = rowColumnMeasurePolicy.mainAxisSize(placeableMo5931measureBRTryo02);
                                int iCrossAxisSize2 = rowColumnMeasurePolicy.crossAxisSize(placeableMo5931measureBRTryo02);
                                iArr2[i16 - i6] = iMainAxisSize2;
                                iMax2 = Math.max(iMax2, iCrossAxisSize2);
                                placeableArr[i16] = placeableMo5931measureBRTryo02;
                                i15 = i51 + iMainAxisSize2;
                                str9 = str13;
                                i17 = i19;
                                j2 = j4;
                                j = j3;
                                str17 = str12;
                                str = str14;
                                str4 = str15;
                            } else {
                                c = CharCompanionObject.MAX_VALUE;
                            }
                            Placeable placeableMo5931measureBRTryo022 = measurable2.mo5931measureBRTryo0(rowColumnMeasurePolicy.mo1350createConstraintsxF2OJ5Q(i52, iIntValue, i20, i53, true));
                            int iMainAxisSize22 = rowColumnMeasurePolicy.mainAxisSize(placeableMo5931measureBRTryo022);
                            int iCrossAxisSize22 = rowColumnMeasurePolicy.crossAxisSize(placeableMo5931measureBRTryo022);
                            iArr2[i16 - i6] = iMainAxisSize22;
                            iMax2 = Math.max(iMax2, iCrossAxisSize22);
                            placeableArr[i16] = placeableMo5931measureBRTryo022;
                            i15 = i51 + iMainAxisSize22;
                            str9 = str13;
                            i17 = i19;
                            j2 = j4;
                            j = j3;
                            str17 = str12;
                            str = str14;
                            str4 = str15;
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            StringBuilder sb22 = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ");
                            sb22.append(i3).append(str11).append(i).append(str10).append(i45).append("arrangementSpacingPx ").append(j5).append(str7).append(i19).append(str13).append(i14).append(str8).append(j4).append(str15).append(j3).append("totalWeight ").append(f6).append(str14).append(f).append("weight ").append(f2).append(str12);
                            sb22.append(f3).append("crossAxisDesiredSize ").append(num).append("remainderUnit ").append(i18).append("childMainAxisSize ").append(i20);
                            throw new IllegalArgumentException(sb22.toString()).initCause(e);
                        }
                        if (num2 == null) {
                        }
                        if (num2 == null) {
                        }
                        String str232 = str18;
                        i14 = i43;
                        str7 = str232;
                        str8 = str2;
                        str12 = str16;
                        int i532 = iIntValue2;
                        str14 = str;
                        f2 = weight3;
                        j3 = j;
                        str15 = str4;
                        j4 = j2;
                        num = num2;
                        f3 = f9;
                        i18 = sign;
                        str13 = str3;
                        i19 = i48;
                        str10 = str19;
                        str11 = str20;
                    } catch (IllegalArgumentException e4) {
                        e = e4;
                        String str24 = str18;
                        i14 = i43;
                        str7 = str24;
                        str12 = str17;
                        str8 = str2;
                        i18 = sign;
                        str13 = str3;
                        i19 = i48;
                        str14 = str;
                        f2 = weight3;
                        j3 = j;
                        str15 = str4;
                        j4 = j2;
                        num = num2;
                        str10 = str19;
                        f3 = f9;
                        str11 = str20;
                        i20 = iMax3;
                    }
                } else {
                    String str25 = str18;
                    i14 = i43;
                    str7 = str25;
                    i15 = i49;
                    str8 = str2;
                    i16 = i50;
                    str9 = str3;
                    i17 = i48;
                    str10 = str5;
                    str11 = str6;
                }
                int i54 = i14;
                str18 = str7;
                i43 = i54;
                str6 = str11;
                i49 = i15;
                str2 = str8;
                i48 = i17;
                i50 = i16 + 1;
                str5 = str10;
                str3 = str9;
                i30 = i7;
            }
            int i55 = i49;
            int i56 = i43;
            i12 = iMax2;
            rowColumnMeasurePolicy3 = rowColumnMeasurePolicy;
            iCoerceIn = RangesKt.coerceIn((int) (i55 + j2), 0, i3 - i56);
            i13 = i56;
        }
        if (i10 != 0) {
            i21 = i7;
            int iMax4 = 0;
            int iMax5 = 0;
            for (int i57 = i6; i57 < i21; i57++) {
                Placeable placeable = placeableArr[i57];
                Intrinsics.checkNotNull(placeable);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(RowColumnImplKt.getRowColumnParentData(placeable));
                Integer numCalculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable) : null;
                if (numCalculateAlignmentLinePosition$foundation_layout_release != null) {
                    int iIntValue3 = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    int iCrossAxisSize3 = rowColumnMeasurePolicy3.crossAxisSize(placeable);
                    iMax4 = Math.max(iMax4, iIntValue3 != Integer.MIN_VALUE ? numCalculateAlignmentLinePosition$foundation_layout_release.intValue() : 0);
                    if (iIntValue3 == Integer.MIN_VALUE) {
                        iIntValue3 = iCrossAxisSize3;
                    }
                    iMax5 = Math.max(iMax5, iCrossAxisSize3 - iIntValue3);
                }
            }
            int i58 = iMax5;
            i23 = iMax4;
            i22 = i58;
        } else {
            i21 = i7;
            i22 = 0;
            i23 = 0;
        }
        int iMax6 = Math.max(RangesKt.coerceAtLeast(i13 + iCoerceIn, 0), i);
        int iMax7 = Math.max(i12, Math.max(i2, i22 + i23));
        int[] iArr3 = new int[i41];
        for (int i59 = 0; i59 < i41; i59++) {
            iArr3[i59] = 0;
        }
        rowColumnMeasurePolicy3.populateMainAxisPositions(iMax6, iArr2, iArr3, measureScope);
        return rowColumnMeasurePolicy3.placeHelper(placeableArr, measureScope, i23, iArr3, iMax6, iMax7, iArr, i8, i6, i21);
    }
}
