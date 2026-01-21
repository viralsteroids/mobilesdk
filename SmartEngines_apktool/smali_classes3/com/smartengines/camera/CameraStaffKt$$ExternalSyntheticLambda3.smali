.class public final synthetic Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lcom/google/accompanist/permissions/PermissionState;


# direct methods
.method public synthetic constructor <init>(ZLcom/google/accompanist/permissions/PermissionState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda3;->f$0:Z

    iput-object p2, p0, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda3;->f$1:Lcom/google/accompanist/permissions/PermissionState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-boolean v0, p0, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda3;->f$0:Z

    iget-object v1, p0, Lcom/smartengines/camera/CameraStaffKt$$ExternalSyntheticLambda3;->f$1:Lcom/google/accompanist/permissions/PermissionState;

    invoke-static {v0, v1}, Lcom/smartengines/camera/CameraStaffKt;->$r8$lambda$abD2zclspl5GGNHxZIenhUvB3XM(ZLcom/google/accompanist/permissions/PermissionState;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
