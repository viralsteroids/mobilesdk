.class final synthetic Lcom/smartengines/app/ui/FacesScreen2Kt$FacesScreen2$2;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "FacesScreen2.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/ui/FacesScreen2Kt;->FacesScreen2(Lcom/smartengines/app/FacesModel2;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Integer;",
        "Lcom/smartengines/app/Photo;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-class v3, Lcom/smartengines/app/FacesModel2;

    const-string v5, "onNewImage(ILcom/smartengines/app/Photo;)V"

    const/4 v6, 0x0

    const/4 v1, 0x2

    const-string v4, "onNewImage"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 65
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Lcom/smartengines/app/Photo;

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/ui/FacesScreen2Kt$FacesScreen2$2;->invoke(ILcom/smartengines/app/Photo;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(ILcom/smartengines/app/Photo;)V
    .locals 1

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lcom/smartengines/app/ui/FacesScreen2Kt$FacesScreen2$2;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/smartengines/app/FacesModel2;

    invoke-virtual {v0, p1, p2}, Lcom/smartengines/app/FacesModel2;->onNewImage(ILcom/smartengines/app/Photo;)V

    return-void
.end method
