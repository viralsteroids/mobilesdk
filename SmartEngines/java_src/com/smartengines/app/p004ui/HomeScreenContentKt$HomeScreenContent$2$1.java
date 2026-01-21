package com.smartengines.app.p004ui;

import com.smartengines.app.Model;
import com.smartengines.app.targets.TreeItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeScreenContent.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class HomeScreenContentKt$HomeScreenContent$2$1 extends FunctionReferenceImpl implements Function1<TreeItem, Unit> {
    HomeScreenContentKt$HomeScreenContent$2$1(Object obj) {
        super(1, obj, Model.class, "onNodeClick", "onNodeClick(Lcom/smartengines/app/targets/TreeItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TreeItem treeItem) {
        invoke2(treeItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TreeItem p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((Model) this.receiver).onNodeClick(p0);
    }
}
