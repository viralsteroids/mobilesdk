package com.smartengines.app;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.smartengines.app.p004ui.MainRoute;
import com.smartengines.app.p004ui.TargetsViewModel;
import com.smartengines.app.targets.TreeGroup;
import com.smartengines.app.targets.TreeItem;
import com.smartengines.app.targets.TreeLeaf;
import com.smartengines.targets.FacesTarget;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppViewModel.kt */
@Metadata(m513d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010@\u001a\u000209H\u0002J\u000e\u0010A\u001a\u00020\u00172\u0006\u0010B\u001a\u00020CJ\u0006\u0010D\u001a\u00020\u0005R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR+\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nRG\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\f\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\nR+\u0010\"\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\f\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\nR/\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\u0004\u001a\u0004\u0018\u00010&8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R+\u0010:\u001a\u0002092\u0006\u0010\u0004\u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006E"}, m514d2 = {"Lcom/smartengines/app/AppViewModel;", "", "<init>", "()V", "<set-?>", "", "showExit", "getShowExit", "()Z", "setShowExit", "(Z)V", "showExit$delegate", "Landroidx/compose/runtime/MutableState;", "showInfo", "getShowInfo", "setShowInfo", "showInfo$delegate", "showTestErrors", "getShowTestErrors", "setShowTestErrors", "showTestErrors$delegate", "Lkotlin/Function1;", "Lcom/smartengines/app/Photo;", "", "onPhotoTaken", "getOnPhotoTaken", "()Lkotlin/jvm/functions/Function1;", "setOnPhotoTaken", "(Lkotlin/jvm/functions/Function1;)V", "onPhotoTaken$delegate", "showSettings", "getShowSettings", "setShowSettings", "showSettings$delegate", "showSessionSettings", "getShowSessionSettings", "setShowSessionSettings", "showSessionSettings$delegate", "Lcom/smartengines/app/FacesModel2;", "facesModel", "getFacesModel", "()Lcom/smartengines/app/FacesModel2;", "setFacesModel", "(Lcom/smartengines/app/FacesModel2;)V", "facesModel$delegate", "selectedGroup", "Lcom/smartengines/app/ui/TargetsViewModel;", "getSelectedGroup", "()Lcom/smartengines/app/ui/TargetsViewModel;", "setSelectedGroup", "(Lcom/smartengines/app/ui/TargetsViewModel;)V", "selectedLeaf", "Lcom/smartengines/app/targets/TreeLeaf;", "getSelectedLeaf", "()Lcom/smartengines/app/targets/TreeLeaf;", "setSelectedLeaf", "(Lcom/smartengines/app/targets/TreeLeaf;)V", "Lcom/smartengines/app/ui/MainRoute;", "mainRoute", "getMainRoute", "()Lcom/smartengines/app/ui/MainRoute;", "setMainRoute", "(Lcom/smartengines/app/ui/MainRoute;)V", "mainRoute$delegate", "calculateMainRoute", "onNodeClick", "node", "Lcom/smartengines/app/targets/TreeItem;", "onBack", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class AppViewModel {
    public static final int $stable;
    public static final AppViewModel INSTANCE;

    /* renamed from: facesModel$delegate, reason: from kotlin metadata */
    private static final MutableState facesModel;

    /* renamed from: mainRoute$delegate, reason: from kotlin metadata */
    private static final MutableState mainRoute;

    /* renamed from: onPhotoTaken$delegate, reason: from kotlin metadata */
    private static final MutableState onPhotoTaken;
    private static TargetsViewModel selectedGroup;
    private static TreeLeaf selectedLeaf;

    /* renamed from: showExit$delegate, reason: from kotlin metadata */
    private static final MutableState showExit;

    /* renamed from: showInfo$delegate, reason: from kotlin metadata */
    private static final MutableState showInfo;

    /* renamed from: showSessionSettings$delegate, reason: from kotlin metadata */
    private static final MutableState showSessionSettings;

    /* renamed from: showSettings$delegate, reason: from kotlin metadata */
    private static final MutableState showSettings;

    /* renamed from: showTestErrors$delegate, reason: from kotlin metadata */
    private static final MutableState showTestErrors;

    private AppViewModel() {
    }

    static {
        AppViewModel appViewModel = new AppViewModel();
        INSTANCE = appViewModel;
        showExit = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        showInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        showTestErrors = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        onPhotoTaken = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        showSettings = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        showSessionSettings = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        facesModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        mainRoute = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(appViewModel.calculateMainRoute(), null, 2, null);
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowExit() {
        return ((Boolean) showExit.getValue()).booleanValue();
    }

    public final void setShowExit(boolean z) {
        showExit.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowInfo() {
        return ((Boolean) showInfo.getValue()).booleanValue();
    }

    public final void setShowInfo(boolean z) {
        showInfo.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowTestErrors() {
        return ((Boolean) showTestErrors.getValue()).booleanValue();
    }

    public final void setShowTestErrors(boolean z) {
        showTestErrors.setValue(Boolean.valueOf(z));
    }

    public final Function1<Photo, Unit> getOnPhotoTaken() {
        return (Function1) onPhotoTaken.getValue();
    }

    public final void setOnPhotoTaken(Function1<? super Photo, Unit> function1) {
        onPhotoTaken.setValue(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSettings() {
        return ((Boolean) showSettings.getValue()).booleanValue();
    }

    public final void setShowSettings(boolean z) {
        showSettings.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSessionSettings() {
        return ((Boolean) showSessionSettings.getValue()).booleanValue();
    }

    public final void setShowSessionSettings(boolean z) {
        showSessionSettings.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FacesModel2 getFacesModel() {
        return (FacesModel2) facesModel.getValue();
    }

    public final void setFacesModel(FacesModel2 facesModel2) {
        facesModel.setValue(facesModel2);
    }

    public final TargetsViewModel getSelectedGroup() {
        return selectedGroup;
    }

    public final void setSelectedGroup(TargetsViewModel targetsViewModel) {
        selectedGroup = targetsViewModel;
    }

    public final TreeLeaf getSelectedLeaf() {
        return selectedLeaf;
    }

    public final void setSelectedLeaf(TreeLeaf treeLeaf) {
        selectedLeaf = treeLeaf;
    }

    public final MainRoute getMainRoute() {
        return (MainRoute) mainRoute.getValue();
    }

    public final void setMainRoute(MainRoute mainRoute2) {
        Intrinsics.checkNotNullParameter(mainRoute2, "<set-?>");
        mainRoute.setValue(mainRoute2);
    }

    private final MainRoute calculateMainRoute() {
        TreeLeaf treeLeaf = selectedLeaf;
        if (treeLeaf != null) {
            return new MainRoute.TargetProcessing(treeLeaf);
        }
        TargetsViewModel targetsViewModel = selectedGroup;
        if (targetsViewModel != null) {
            return new MainRoute.TargetList(targetsViewModel);
        }
        return MainRoute.Home.INSTANCE;
    }

    public final void onNodeClick(TreeItem node) {
        Intrinsics.checkNotNullParameter(node, "node");
        boolean z = node instanceof TreeLeaf;
        if (z && (((TreeLeaf) node).getTarget() instanceof FacesTarget)) {
            setFacesModel(new FacesModel2(null));
            return;
        }
        if (node instanceof TreeGroup) {
            selectedGroup = new TargetsViewModel((TreeGroup) node);
        } else if (z) {
            selectedLeaf = (TreeLeaf) node;
        }
        setMainRoute(calculateMainRoute());
    }

    public final boolean onBack() {
        if (getFacesModel() != null) {
            AppViewModel appViewModel = INSTANCE;
            appViewModel.setFacesModel(null);
            appViewModel.setMainRoute(appViewModel.calculateMainRoute());
            return true;
        }
        if (selectedLeaf != null) {
            AppViewModel appViewModel2 = INSTANCE;
            selectedLeaf = null;
            appViewModel2.setMainRoute(appViewModel2.calculateMainRoute());
            return true;
        }
        if (selectedGroup == null) {
            return false;
        }
        AppViewModel appViewModel3 = INSTANCE;
        selectedGroup = null;
        appViewModel3.setMainRoute(appViewModel3.calculateMainRoute());
        return true;
    }
}
