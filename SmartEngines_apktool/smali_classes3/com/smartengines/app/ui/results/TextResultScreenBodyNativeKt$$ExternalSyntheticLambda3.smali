.class public final synthetic Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/engine/text/TextResultData;

.field public final synthetic f$1:Landroid/graphics/Bitmap;

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/engine/text/TextResultData;Landroid/graphics/Bitmap;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda3;->f$0:Lcom/smartengines/engine/text/TextResultData;

    iput-object p2, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda3;->f$1:Landroid/graphics/Bitmap;

    iput p3, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda3;->f$2:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda3;->f$0:Lcom/smartengines/engine/text/TextResultData;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda3;->f$1:Landroid/graphics/Bitmap;

    iget v2, p0, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt$$ExternalSyntheticLambda3;->f$2:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/smartengines/app/ui/results/TextResultScreenBodyNativeKt;->$r8$lambda$QPyo_dSu5cuQDcgdEgtVYbMKUW8(Lcom/smartengines/engine/text/TextResultData;Landroid/graphics/Bitmap;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
