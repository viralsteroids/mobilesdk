package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class Chain {
    private static final boolean DEBUG = false;

    Chain() {
    }

    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        if (i == 0) {
            i2 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = 0;
        } else {
            i2 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            ChainHead chainHead = chainHeadArr[i4];
            chainHead.define();
            applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a A[PHI: r13 r14
  0x004a: PHI (r13v4 boolean) = (r13v2 boolean), (r13v51 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r14v4 boolean) = (r14v2 boolean), (r14v9 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c A[PHI: r13 r14
  0x004c: PHI (r13v48 boolean) = (r13v2 boolean), (r13v51 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r14v6 boolean) = (r14v2 boolean), (r14v9 boolean) binds: [B:28:0x0048, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v49, types: [androidx.constraintlayout.solver.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.constraintlayout.solver.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i, int i2, ChainHead chainHead) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        LinearSystem linearSystem2;
        ConstraintWidget constraintWidget;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintWidget constraintWidget2;
        int i3;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        int i4;
        SolverVariable solverVariable5;
        float f2;
        int size;
        float f3;
        ArrayList<ConstraintWidget> arrayList;
        boolean z4;
        boolean z5;
        int i5;
        ConstraintWidget constraintWidget5 = chainHead.mFirst;
        ConstraintWidget constraintWidget6 = chainHead.mLast;
        ConstraintWidget constraintWidget7 = chainHead.mFirstVisibleWidget;
        ConstraintWidget constraintWidget8 = chainHead.mLastVisibleWidget;
        ConstraintWidget constraintWidget9 = chainHead.mHead;
        float f4 = chainHead.mTotalWeight;
        ConstraintWidget constraintWidget10 = chainHead.mFirstMatchConstraintWidget;
        ConstraintWidget constraintWidget11 = chainHead.mLastMatchConstraintWidget;
        boolean z6 = constraintWidgetContainer.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i == 0) {
            z = constraintWidget9.mHorizontalChainStyle == 0;
            z2 = constraintWidget9.mHorizontalChainStyle == 1;
            z3 = constraintWidget9.mHorizontalChainStyle == 2;
        } else {
            z = constraintWidget9.mVerticalChainStyle == 0;
            z2 = constraintWidget9.mVerticalChainStyle == 1;
            if (constraintWidget9.mVerticalChainStyle == 2) {
            }
        }
        ?? r7 = constraintWidget5;
        boolean z7 = false;
        while (true) {
            f = f4;
            if (z7) {
                break;
            }
            ConstraintAnchor constraintAnchor3 = r7.mListAnchors[i2];
            int i6 = z3 ? 1 : 4;
            int margin = constraintAnchor3.getMargin();
            boolean z8 = z6;
            boolean z9 = r7.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && r7.mResolvedMatchConstraintDefault[i] == 0;
            if (constraintAnchor3.mTarget != null && r7 != constraintWidget5) {
                margin += constraintAnchor3.mTarget.getMargin();
            }
            int i7 = margin;
            if (z3 && r7 != constraintWidget5 && r7 != constraintWidget7) {
                i6 = 5;
            }
            boolean z10 = z9;
            if (constraintAnchor3.mTarget != null) {
                if (r7 == constraintWidget7) {
                    z4 = z3;
                    z5 = z;
                    linearSystem.addGreaterThan(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, i7, 6);
                } else {
                    z4 = z3;
                    z5 = z;
                    linearSystem.addGreaterThan(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, i7, 8);
                }
                linearSystem.addEquality(constraintAnchor3.mSolverVariable, constraintAnchor3.mTarget.mSolverVariable, i7, (!z10 || z4) ? i6 : 5);
            } else {
                z4 = z3;
                z5 = z;
            }
            if (z8) {
                if (r7.getVisibility() == 8 || r7.mListDimensionBehaviors[i] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i5 = 0;
                } else {
                    i5 = 0;
                    linearSystem.addGreaterThan(r7.mListAnchors[i2 + 1].mSolverVariable, r7.mListAnchors[i2].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(r7.mListAnchors[i2].mSolverVariable, constraintWidgetContainer.mListAnchors[i2].mSolverVariable, i5, 8);
            }
            ConstraintAnchor constraintAnchor4 = r7.mListAnchors[i2 + 1].mTarget;
            if (constraintAnchor4 != null) {
                ?? r4 = constraintAnchor4.mOwner;
                if (r4.mListAnchors[i2].mTarget != null && r4.mListAnchors[i2].mTarget.mOwner == r7) {
                    solverVariable = r4;
                }
            }
            if (solverVariable != null) {
                r7 = solverVariable;
            } else {
                z7 = true;
            }
            f4 = f;
            z6 = z8;
            z3 = z4;
            z = z5;
            r7 = r7;
        }
        boolean z11 = z6;
        boolean z12 = z3;
        boolean z13 = z;
        if (constraintWidget8 != null) {
            int i8 = i2 + 1;
            if (constraintWidget6.mListAnchors[i8].mTarget != null) {
                ConstraintAnchor constraintAnchor5 = constraintWidget8.mListAnchors[i8];
                if (constraintWidget8.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget8.mResolvedMatchConstraintDefault[i] == 0 && !z12 && constraintAnchor5.mTarget.mOwner == constraintWidgetContainer) {
                    linearSystem.addEquality(constraintAnchor5.mSolverVariable, constraintAnchor5.mTarget.mSolverVariable, -constraintAnchor5.getMargin(), 5);
                } else if (z12 && constraintAnchor5.mTarget.mOwner == constraintWidgetContainer) {
                    linearSystem.addEquality(constraintAnchor5.mSolverVariable, constraintAnchor5.mTarget.mSolverVariable, -constraintAnchor5.getMargin(), 4);
                }
                linearSystem.addLowerThan(constraintAnchor5.mSolverVariable, constraintWidget6.mListAnchors[i8].mTarget.mSolverVariable, -constraintAnchor5.getMargin(), 6);
            }
        }
        if (z11) {
            int i9 = i2 + 1;
            linearSystem.addGreaterThan(constraintWidgetContainer.mListAnchors[i9].mSolverVariable, constraintWidget6.mListAnchors[i9].mSolverVariable, constraintWidget6.mListAnchors[i9].getMargin(), 8);
        }
        ArrayList<ConstraintWidget> arrayList2 = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList2 != null && (size = arrayList2.size()) > 1) {
            float f5 = (!chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f : chainHead.mWidgetsMatchCount;
            float f6 = 0.0f;
            float f7 = 0.0f;
            ConstraintWidget constraintWidget12 = null;
            int i10 = 0;
            while (i10 < size) {
                ConstraintWidget constraintWidget13 = arrayList2.get(i10);
                float f8 = constraintWidget13.mWeight[i];
                if (f8 >= f6) {
                    f3 = f6;
                } else if (chainHead.mHasComplexMatchWeights) {
                    f3 = f6;
                    linearSystem.addEquality(constraintWidget13.mListAnchors[i2 + 1].mSolverVariable, constraintWidget13.mListAnchors[i2].mSolverVariable, 0, 4);
                    arrayList = arrayList2;
                    i10++;
                    f6 = f3;
                    arrayList2 = arrayList;
                } else {
                    f3 = f6;
                    f8 = 1.0f;
                }
                float f9 = f8;
                if (f9 == f3) {
                    linearSystem.addEquality(constraintWidget13.mListAnchors[i2 + 1].mSolverVariable, constraintWidget13.mListAnchors[i2].mSolverVariable, 0, 8);
                    arrayList = arrayList2;
                    i10++;
                    f6 = f3;
                    arrayList2 = arrayList;
                } else {
                    if (constraintWidget12 != null) {
                        SolverVariable solverVariable6 = constraintWidget12.mListAnchors[i2].mSolverVariable;
                        int i11 = i2 + 1;
                        SolverVariable solverVariable7 = constraintWidget12.mListAnchors[i11].mSolverVariable;
                        SolverVariable solverVariable8 = constraintWidget13.mListAnchors[i2].mSolverVariable;
                        arrayList = arrayList2;
                        SolverVariable solverVariable9 = constraintWidget13.mListAnchors[i11].mSolverVariable;
                        ArrayRow arrayRowCreateRow = linearSystem.createRow();
                        arrayRowCreateRow.createRowEqualMatchDimensions(f7, f5, f9, solverVariable6, solverVariable7, solverVariable8, solverVariable9);
                        linearSystem.addConstraint(arrayRowCreateRow);
                    } else {
                        arrayList = arrayList2;
                    }
                    constraintWidget12 = constraintWidget13;
                    f7 = f9;
                    i10++;
                    f6 = f3;
                    arrayList2 = arrayList;
                }
            }
        }
        if (constraintWidget7 != null && (constraintWidget7 == constraintWidget8 || z12)) {
            ConstraintAnchor constraintAnchor6 = constraintWidget5.mListAnchors[i2];
            int i12 = i2 + 1;
            ConstraintAnchor constraintAnchor7 = constraintWidget6.mListAnchors[i12];
            SolverVariable solverVariable10 = constraintAnchor6.mTarget != null ? constraintAnchor6.mTarget.mSolverVariable : null;
            SolverVariable solverVariable11 = constraintAnchor7.mTarget != null ? constraintAnchor7.mTarget.mSolverVariable : null;
            ConstraintAnchor constraintAnchor8 = constraintWidget7.mListAnchors[i2];
            ConstraintAnchor constraintAnchor9 = constraintWidget8.mListAnchors[i12];
            if (solverVariable10 != null && solverVariable11 != null) {
                if (i == 0) {
                    f2 = constraintWidget9.mHorizontalBiasPercent;
                } else {
                    f2 = constraintWidget9.mVerticalBiasPercent;
                }
                linearSystem.addCentering(constraintAnchor8.mSolverVariable, solverVariable10, constraintAnchor8.getMargin(), f2, solverVariable11, constraintAnchor9.mSolverVariable, constraintAnchor9.getMargin(), 7);
            }
        } else {
            if (!z13 || constraintWidget7 == null) {
                int i13 = 8;
                if (z2 && constraintWidget7 != null) {
                    boolean z14 = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
                    ConstraintWidget constraintWidget14 = constraintWidget7;
                    ConstraintWidget constraintWidget15 = constraintWidget14;
                    while (constraintWidget15 != null) {
                        ConstraintWidget constraintWidget16 = constraintWidget15.mNextChainWidget[i];
                        while (constraintWidget16 != null && constraintWidget16.getVisibility() == i13) {
                            constraintWidget16 = constraintWidget16.mNextChainWidget[i];
                        }
                        if (constraintWidget15 == constraintWidget7 || constraintWidget15 == constraintWidget8 || constraintWidget16 == null) {
                            constraintWidget = constraintWidget14;
                        } else {
                            if (constraintWidget16 == constraintWidget8) {
                                constraintWidget16 = null;
                            }
                            ConstraintAnchor constraintAnchor10 = constraintWidget15.mListAnchors[i2];
                            SolverVariable solverVariable12 = constraintAnchor10.mSolverVariable;
                            if (constraintAnchor10.mTarget != null) {
                                SolverVariable solverVariable13 = constraintAnchor10.mTarget.mSolverVariable;
                            }
                            int i14 = i2 + 1;
                            SolverVariable solverVariable14 = constraintWidget14.mListAnchors[i14].mSolverVariable;
                            int margin2 = constraintAnchor10.getMargin();
                            int margin3 = constraintWidget15.mListAnchors[i14].getMargin();
                            if (constraintWidget16 != null) {
                                constraintAnchor = constraintWidget16.mListAnchors[i2];
                                solverVariable = constraintAnchor.mSolverVariable;
                                solverVariable2 = constraintAnchor.mTarget != null ? constraintAnchor.mTarget.mSolverVariable : null;
                            } else {
                                constraintAnchor = constraintWidget8.mListAnchors[i2];
                                solverVariable = constraintAnchor != null ? constraintAnchor.mSolverVariable : null;
                                solverVariable2 = constraintWidget15.mListAnchors[i14].mSolverVariable;
                            }
                            if (constraintAnchor != null) {
                                margin3 += constraintAnchor.getMargin();
                            }
                            int i15 = margin3;
                            if (constraintWidget14 != null) {
                                margin2 += constraintWidget14.mListAnchors[i14].getMargin();
                            }
                            SolverVariable solverVariable15 = solverVariable;
                            int i16 = z14 ? 8 : 4;
                            if (solverVariable12 == null || solverVariable14 == null || solverVariable15 == null || solverVariable2 == null) {
                                constraintWidget = constraintWidget14;
                                constraintWidget2 = constraintWidget16;
                            } else {
                                constraintWidget2 = constraintWidget16;
                                SolverVariable solverVariable16 = solverVariable2;
                                constraintWidget = constraintWidget14;
                                linearSystem.addCentering(solverVariable12, solverVariable14, margin2, 0.5f, solverVariable15, solverVariable16, i15, i16);
                            }
                            constraintWidget16 = constraintWidget2;
                        }
                        if (constraintWidget15.getVisibility() != 8) {
                            constraintWidget = constraintWidget15;
                        }
                        constraintWidget15 = constraintWidget16;
                        constraintWidget14 = constraintWidget;
                        i13 = 8;
                    }
                    linearSystem2 = linearSystem;
                    ConstraintAnchor constraintAnchor11 = constraintWidget7.mListAnchors[i2];
                    ConstraintAnchor constraintAnchor12 = constraintWidget5.mListAnchors[i2].mTarget;
                    int i17 = i2 + 1;
                    ConstraintAnchor constraintAnchor13 = constraintWidget8.mListAnchors[i17];
                    ConstraintAnchor constraintAnchor14 = constraintWidget6.mListAnchors[i17].mTarget;
                    if (constraintAnchor12 != null) {
                        if (constraintWidget7 != constraintWidget8) {
                            linearSystem2.addEquality(constraintAnchor11.mSolverVariable, constraintAnchor12.mSolverVariable, constraintAnchor11.getMargin(), 5);
                        } else if (constraintAnchor14 != null) {
                            linearSystem2.addCentering(constraintAnchor11.mSolverVariable, constraintAnchor12.mSolverVariable, constraintAnchor11.getMargin(), 0.5f, constraintAnchor13.mSolverVariable, constraintAnchor14.mSolverVariable, constraintAnchor13.getMargin(), 5);
                        }
                    }
                    if (constraintAnchor14 != null && constraintWidget7 != constraintWidget8) {
                        linearSystem2.addEquality(constraintAnchor13.mSolverVariable, constraintAnchor14.mSolverVariable, -constraintAnchor13.getMargin(), 5);
                    }
                }
                if ((z13 && !z2) || constraintWidget7 == null || constraintWidget7 == constraintWidget8) {
                    return;
                }
                ConstraintAnchor constraintAnchor15 = constraintWidget7.mListAnchors[i2];
                int i18 = i2 + 1;
                ConstraintAnchor constraintAnchor16 = constraintWidget8.mListAnchors[i18];
                solverVariable5 = constraintAnchor15.mTarget == null ? constraintAnchor15.mTarget.mSolverVariable : null;
                SolverVariable solverVariable17 = constraintAnchor16.mTarget == null ? constraintAnchor16.mTarget.mSolverVariable : null;
                if (constraintWidget6 != constraintWidget8) {
                    ConstraintAnchor constraintAnchor17 = constraintWidget6.mListAnchors[i18];
                    solverVariable17 = constraintAnchor17.mTarget != null ? constraintAnchor17.mTarget.mSolverVariable : null;
                }
                if (constraintWidget7 == constraintWidget8) {
                    constraintAnchor15 = constraintWidget7.mListAnchors[i2];
                    constraintAnchor16 = constraintWidget7.mListAnchors[i18];
                }
                if (solverVariable5 != null || solverVariable17 == null) {
                }
                int margin4 = constraintAnchor15.getMargin();
                if (constraintWidget8 != null) {
                    constraintWidget6 = constraintWidget8;
                }
                linearSystem2.addCentering(constraintAnchor15.mSolverVariable, solverVariable5, margin4, 0.5f, solverVariable17, constraintAnchor16.mSolverVariable, constraintWidget6.mListAnchors[i18].getMargin(), 5);
                return;
            }
            boolean z15 = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
            ConstraintWidget constraintWidget17 = constraintWidget7;
            ConstraintWidget constraintWidget18 = constraintWidget17;
            while (constraintWidget17 != null) {
                ConstraintWidget constraintWidget19 = constraintWidget17.mNextChainWidget[i];
                while (true) {
                    if (constraintWidget19 == null) {
                        i3 = 8;
                        break;
                    }
                    i3 = 8;
                    if (constraintWidget19.getVisibility() != 8) {
                        break;
                    } else {
                        constraintWidget19 = constraintWidget19.mNextChainWidget[i];
                    }
                }
                if (constraintWidget19 != null || constraintWidget17 == constraintWidget8) {
                    ConstraintAnchor constraintAnchor18 = constraintWidget17.mListAnchors[i2];
                    SolverVariable solverVariable18 = constraintAnchor18.mSolverVariable;
                    SolverVariable solverVariable19 = constraintAnchor18.mTarget != null ? constraintAnchor18.mTarget.mSolverVariable : null;
                    if (constraintWidget18 != constraintWidget17) {
                        solverVariable19 = constraintWidget18.mListAnchors[i2 + 1].mSolverVariable;
                    } else if (constraintWidget17 == constraintWidget7 && constraintWidget18 == constraintWidget17) {
                        solverVariable19 = constraintWidget5.mListAnchors[i2].mTarget != null ? constraintWidget5.mListAnchors[i2].mTarget.mSolverVariable : null;
                    }
                    int margin5 = constraintAnchor18.getMargin();
                    int i19 = i2 + 1;
                    int margin6 = constraintWidget17.mListAnchors[i19].getMargin();
                    if (constraintWidget19 != null) {
                        constraintAnchor2 = constraintWidget19.mListAnchors[i2];
                        solverVariable3 = constraintAnchor2.mSolverVariable;
                        solverVariable4 = constraintWidget17.mListAnchors[i19].mSolverVariable;
                    } else {
                        constraintAnchor2 = constraintWidget6.mListAnchors[i19].mTarget;
                        solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.mSolverVariable : null;
                        solverVariable4 = constraintWidget17.mListAnchors[i19].mSolverVariable;
                    }
                    if (constraintAnchor2 != null) {
                        margin6 += constraintAnchor2.getMargin();
                    }
                    if (constraintWidget18 != null) {
                        margin5 += constraintWidget18.mListAnchors[i19].getMargin();
                    }
                    if (solverVariable18 == null || solverVariable19 == null || solverVariable3 == null || solverVariable4 == null) {
                        constraintWidget3 = constraintWidget19;
                        constraintWidget4 = constraintWidget17;
                        i4 = 8;
                    } else {
                        if (constraintWidget17 == constraintWidget7) {
                            margin5 = constraintWidget7.mListAnchors[i2].getMargin();
                        }
                        if (constraintWidget17 == constraintWidget8) {
                            margin6 = constraintWidget8.mListAnchors[i19].getMargin();
                        }
                        constraintWidget3 = constraintWidget19;
                        constraintWidget4 = constraintWidget17;
                        i4 = 8;
                        linearSystem.addCentering(solverVariable18, solverVariable19, margin5, 0.5f, solverVariable3, solverVariable4, margin6, z15 ? 8 : 5);
                    }
                } else {
                    constraintWidget3 = constraintWidget19;
                    constraintWidget4 = constraintWidget17;
                    i4 = i3;
                }
                if (constraintWidget4.getVisibility() != i4) {
                    constraintWidget18 = constraintWidget4;
                }
                constraintWidget17 = constraintWidget3;
            }
        }
        linearSystem2 = linearSystem;
        if (z13) {
        }
        ConstraintAnchor constraintAnchor152 = constraintWidget7.mListAnchors[i2];
        int i182 = i2 + 1;
        ConstraintAnchor constraintAnchor162 = constraintWidget8.mListAnchors[i182];
        if (constraintAnchor152.mTarget == null) {
        }
        if (constraintAnchor162.mTarget == null) {
        }
        if (constraintWidget6 != constraintWidget8) {
        }
        if (constraintWidget7 == constraintWidget8) {
        }
        if (solverVariable5 != null) {
        }
    }
}
