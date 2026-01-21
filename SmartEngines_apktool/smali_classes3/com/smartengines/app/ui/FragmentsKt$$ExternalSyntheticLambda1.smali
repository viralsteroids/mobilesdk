.class public final synthetic Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$2:Z

.field public final synthetic f$3:Z

.field public final synthetic f$4:Z

.field public final synthetic f$5:Z

.field public final synthetic f$6:I

.field public final synthetic f$7:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZZZII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$1:Lkotlin/jvm/functions/Function0;

    iput-boolean p3, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$2:Z

    iput-boolean p4, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$3:Z

    iput-boolean p5, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$4:Z

    iput-boolean p6, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$5:Z

    iput p7, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$6:I

    iput p8, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$7:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$1:Lkotlin/jvm/functions/Function0;

    iget-boolean v2, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$2:Z

    iget-boolean v3, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$3:Z

    iget-boolean v4, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$4:Z

    iget-boolean v5, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$5:Z

    iget v6, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$6:I

    iget v7, p0, Lcom/smartengines/app/ui/FragmentsKt$$ExternalSyntheticLambda1;->f$7:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/smartengines/app/ui/FragmentsKt;->$r8$lambda$k51m4E7xo5D5umo3Pb29Tkn1pVw(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZZZIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
