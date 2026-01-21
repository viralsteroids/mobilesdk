.class public final Lcom/smartengines/visualization/IdLivenessInstructions;
.super Ljava/lang/Object;
.source "IdLivenessInstructions.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/visualization/IdLivenessInstructions$Item;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u000cB\t\u0008\u0003\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\'\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/smartengines/visualization/IdLivenessInstructions;",
        "",
        "<init>",
        "()V",
        "items",
        "",
        "",
        "Lcom/smartengines/visualization/Instruction;",
        "getItems",
        "()Ljava/util/Map;",
        "items$delegate",
        "Lkotlin/Lazy;",
        "Item",
        "visualization_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/smartengines/visualization/IdLivenessInstructions;

.field private static final items$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$f0veLrJiFCP1Nlwuw11V77_1KDc()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lcom/smartengines/visualization/IdLivenessInstructions;->items_delegate$lambda$0()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/visualization/IdLivenessInstructions;

    invoke-direct {v0}, Lcom/smartengines/visualization/IdLivenessInstructions;-><init>()V

    sput-object v0, Lcom/smartengines/visualization/IdLivenessInstructions;->INSTANCE:Lcom/smartengines/visualization/IdLivenessInstructions;

    .line 13
    new-instance v0, Lcom/smartengines/visualization/IdLivenessInstructions$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/smartengines/visualization/IdLivenessInstructions$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/smartengines/visualization/IdLivenessInstructions;->items$delegate:Lkotlin/Lazy;

    const/16 v0, 0x8

    sput v0, Lcom/smartengines/visualization/IdLivenessInstructions;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final items_delegate$lambda$0()Ljava/util/Map;
    .locals 6

    const/16 v0, 0xc

    .line 15
    new-array v0, v0, [Lkotlin/Pair;

    new-instance v1, Lcom/smartengines/visualization/Instruction;

    new-instance v2, Lcom/smartengines/utils/Name;

    const-string v3, "Complete"

    const-string/jumbo v4, "\u0421\u0435\u0441\u0441\u0438\u044f \u043e\u043a\u043e\u043d\u0447\u0435\u043d\u0430"

    invoke-direct {v2, v3, v4}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/smartengines/visualization/Instruction;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;)V

    const-string v2, "CT"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 16
    new-instance v1, Lcom/smartengines/visualization/Instruction;

    new-instance v2, Lcom/smartengines/utils/Name;

    const-string v4, "Hold still"

    const-string/jumbo v5, "\u041d\u0435 \u0434\u0432\u0438\u0433\u0430\u0439\u0442\u0435\u0441\u044c"

    invoke-direct {v2, v4, v5}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, v2, v3}, Lcom/smartengines/visualization/Instruction;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;)V

    const-string v2, "HS"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 17
    new-instance v1, Lcom/smartengines/visualization/Instruction;

    new-instance v2, Lcom/smartengines/utils/Name;

    const-string v3, "Look straight into the camera"

    const-string/jumbo v4, "\u0413\u043e\u043b\u043e\u0432\u0443 \u043f\u0440\u044f\u043c\u043e"

    invoke-direct {v2, v3, v4}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget v3, Lcom/smartengines/visualization/R$drawable;->mask_s:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/smartengines/visualization/Instruction;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;)V

    const-string v2, "S"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 18
    new-instance v1, Lcom/smartengines/visualization/Instruction;

    new-instance v2, Lcom/smartengines/utils/Name;

    const-string v3, "Rotate head to the right"

    const-string/jumbo v4, "\u041f\u043e\u0432\u043e\u0440\u0430\u0447\u0438\u0432\u0430\u0439\u0442\u0435 \u0433\u043e\u043b\u043e\u0432\u0443 \u0432\u043f\u0440\u0430\u0432\u043e"

    invoke-direct {v2, v3, v4}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget v3, Lcom/smartengines/visualization/R$drawable;->mask_r:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/smartengines/visualization/Instruction;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;)V

    const-string v2, "L"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 19
    new-instance v1, Lcom/smartengines/visualization/Instruction;

    new-instance v2, Lcom/smartengines/utils/Name;

    const-string v3, "Lift head up to the right"

    const-string/jumbo v4, "\u041f\u043e\u0432\u043e\u0440\u0430\u0447\u0438\u0432\u0430\u0439\u0442\u0435 \u0433\u043e\u043b\u043e\u0432\u0443 \u0432\u0432\u0435\u0440\u0445 \u0432\u043f\u0440\u0430\u0432\u043e"

    invoke-direct {v2, v3, v4}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget v3, Lcom/smartengines/visualization/R$drawable;->mask_ru:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/smartengines/visualization/Instruction;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;)V

    const-string v2, "LU"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 20
    new-instance v1, Lcom/smartengines/visualization/Instruction;

    new-instance v2, Lcom/smartengines/utils/Name;

    const-string v3, "Put head down to the right"

    const-string/jumbo v4, "\u041e\u043f\u0443\u0441\u043a\u0430\u0439\u0442\u0435 \u0433\u043e\u043b\u043e\u0432\u0443 \u0432\u043d\u0438\u0437 \u0432\u043f\u0440\u0430\u0432\u043e"

    invoke-direct {v2, v3, v4}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget v3, Lcom/smartengines/visualization/R$drawable;->mask_rd:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/smartengines/visualization/Instruction;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;)V

    const-string v2, "LD"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 21
    new-instance v1, Lcom/smartengines/visualization/Instruction;

    new-instance v2, Lcom/smartengines/utils/Name;

    const-string v3, "Rotate head to the left"

    const-string/jumbo v4, "\u041f\u043e\u0432\u043e\u0440\u0430\u0447\u0438\u0432\u0430\u0439\u0442\u0435 \u0433\u043e\u043b\u043e\u0432\u0443 \u0432\u043b\u0435\u0432\u043e"

    invoke-direct {v2, v3, v4}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget v3, Lcom/smartengines/visualization/R$drawable;->mask_l:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/smartengines/visualization/Instruction;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;)V

    const-string v2, "R"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 22
    new-instance v1, Lcom/smartengines/visualization/Instruction;

    new-instance v2, Lcom/smartengines/utils/Name;

    const-string v3, "Lift head up to the left"

    const-string/jumbo v4, "\u041f\u043e\u0434\u043d\u0438\u043c\u0430\u0439\u0442\u0435 \u0433\u043e\u043b\u043e\u0432\u0443 \u0432\u0432\u0435\u0440\u0445 \u0432\u043b\u0435\u0432\u043e"

    invoke-direct {v2, v3, v4}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget v3, Lcom/smartengines/visualization/R$drawable;->mask_lu:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/smartengines/visualization/Instruction;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;)V

    const-string v2, "RU"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 23
    new-instance v1, Lcom/smartengines/visualization/Instruction;

    new-instance v2, Lcom/smartengines/utils/Name;

    const-string v3, "Put head down to the left"

    const-string/jumbo v4, "\u041e\u043f\u0443\u0441\u043a\u0430\u0439\u0442\u0435 \u0433\u043e\u043b\u043e\u0432\u0443 \u0432\u043d\u0438\u0437 \u0432\u043b\u0435\u0432\u043e"

    invoke-direct {v2, v3, v4}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget v3, Lcom/smartengines/visualization/R$drawable;->mask_ld:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/smartengines/visualization/Instruction;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;)V

    const-string v2, "RD"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 24
    new-instance v1, Lcom/smartengines/visualization/Instruction;

    new-instance v2, Lcom/smartengines/utils/Name;

    const-string v3, "Rotate head to the up"

    const-string/jumbo v4, "\u041f\u043e\u0434\u043d\u0438\u043c\u0430\u0439\u0442\u0435 \u0433\u043e\u043b\u043e\u0432\u0443 \u0432\u0432\u0435\u0440\u0445"

    invoke-direct {v2, v3, v4}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget v3, Lcom/smartengines/visualization/R$drawable;->mask_u:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/smartengines/visualization/Instruction;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;)V

    const-string v2, "U"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    .line 25
    new-instance v1, Lcom/smartengines/visualization/Instruction;

    new-instance v2, Lcom/smartengines/utils/Name;

    const-string v3, "Rotate head to the down"

    const-string/jumbo v4, "\u041e\u043f\u0443\u0441\u0442\u0438\u0442\u0435 \u0433\u043e\u043b\u043e\u0432\u0443 \u0432\u043d\u0438\u0437"

    invoke-direct {v2, v3, v4}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget v3, Lcom/smartengines/visualization/R$drawable;->mask_d:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/smartengines/visualization/Instruction;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;)V

    const-string v2, "D"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    .line 26
    new-instance v1, Lcom/smartengines/visualization/Instruction;

    new-instance v2, Lcom/smartengines/utils/Name;

    const-string v3, "Smile"

    const-string/jumbo v4, "\u0423\u043b\u044b\u0431\u043d\u0438\u0442\u0435\u0441\u044c"

    invoke-direct {v2, v3, v4}, Lcom/smartengines/utils/Name;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget v3, Lcom/smartengines/visualization/R$drawable;->mask_sm:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/smartengines/visualization/Instruction;-><init>(Lcom/smartengines/utils/Name;Ljava/lang/Integer;)V

    const-string v2, "SM"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    .line 14
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getItems()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/visualization/Instruction;",
            ">;"
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/smartengines/visualization/IdLivenessInstructions;->items$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method
