.class public final Lcom/smartengines/dictionaries/IdAutoselectionModes;
.super Ljava/lang/Object;
.source "IdAutoselectionModes.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R!\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/smartengines/dictionaries/IdAutoselectionModes;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "data",
        "",
        "Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;",
        "getData",
        "()Ljava/util/List;",
        "data$delegate",
        "Lkotlin/Lazy;",
        "Item",
        "dictionaries_release"
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
.field public static final INSTANCE:Lcom/smartengines/dictionaries/IdAutoselectionModes;

.field private static final TAG:Ljava/lang/String; = "myapp.IdAutoModes"

.field private static final data$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$zv3MW1WaaKE1n5zC2rfrbyy-Cl4()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/smartengines/dictionaries/IdAutoselectionModes;->data_delegate$lambda$0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/dictionaries/IdAutoselectionModes;

    invoke-direct {v0}, Lcom/smartengines/dictionaries/IdAutoselectionModes;-><init>()V

    sput-object v0, Lcom/smartengines/dictionaries/IdAutoselectionModes;->INSTANCE:Lcom/smartengines/dictionaries/IdAutoselectionModes;

    .line 13
    new-instance v0, Lcom/smartengines/dictionaries/IdAutoselectionModes$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/smartengines/dictionaries/IdAutoselectionModes$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/smartengines/dictionaries/IdAutoselectionModes;->data$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final data_delegate$lambda$0()Ljava/util/List;
    .locals 12

    const/16 v0, 0x11

    .line 14
    new-array v0, v0, [Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    const/4 v2, 0x2

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any Document"

    const-string v5, "en"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v6, 0x0

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0410\u0432\u0442\u043e\u0432\u044b\u0431\u043e\u0440 \u0414\u0423\u041b"

    const-string v7, "ru"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v8, 0x1

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    const-string v9, "anydoc"

    const-string v10, "*"

    invoke-direct {v1, v9, v10, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    aput-object v1, v0, v6

    .line 15
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any Passport"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0417\u0430\u0433\u0440\u0430\u043d\u0438\u0447\u043d\u044b\u0439 \u043f\u0430\u0441\u043f\u043e\u0440\u0442"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_passport:I

    const-string v9, "anypassport"

    invoke-direct {v1, v9, v10, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    aput-object v1, v0, v8

    .line 16
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any Driving Licence"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0412\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_drvlic:I

    const-string v9, "anydrvlic"

    invoke-direct {v1, v9, v10, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    aput-object v1, v0, v2

    .line 17
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any ID Card"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string v4, "ID-\u043a\u0430\u0440\u0442\u0430"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const-string v9, "anyid"

    invoke-direct {v1, v9, v10, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    const/4 v3, 0x3

    aput-object v1, v0, v3

    .line 18
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any USA Driver\'s License"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0412\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u0421\u0428\u0410"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_drvlic:I

    const-string v9, "default"

    const-string/jumbo v11, "usa.drvlic.*"

    invoke-direct {v1, v9, v11, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    const/4 v3, 0x4

    aput-object v1, v0, v3

    .line 19
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any EU ID Card"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string v4, "ID-\u043a\u0430\u0440\u0442\u0430 \u0441\u0442\u0440\u0430\u043d\u044b \u0415\u0421"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const-string v9, "anyid_eu"

    invoke-direct {v1, v9, v10, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    const/4 v3, 0x5

    aput-object v1, v0, v3

    .line 20
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any EU Driving Licence"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0412\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u0441\u0442\u0440\u0430\u043d\u044b \u0415\u0421"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_drvlic:I

    const-string v9, "anydrvlic_eu"

    invoke-direct {v1, v9, v10, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    const/4 v3, 0x6

    aput-object v1, v0, v3

    .line 21
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any Russian ID Document"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442 \u0420\u0424, \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u044f\u044e\u0449\u0438\u0439 \u043b\u0438\u0447\u043d\u043e\u0441\u0442\u044c"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const-string v9, "anyrus"

    const-string v11, "*/rus.passport.previous"

    invoke-direct {v1, v9, v11, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    const/4 v3, 0x7

    aput-object v1, v0, v3

    .line 22
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any CIS ID Document"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442 \u0421\u041d\u0413, \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u044f\u044e\u0449\u0438\u0439 \u043b\u0438\u0447\u043d\u043e\u0441\u0442\u044c"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const-string v9, "anycis"

    invoke-direct {v1, v9, v10, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    const/16 v3, 0x8

    aput-object v1, v0, v3

    .line 23
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any LATAM Driving Licence"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0412\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u0441\u0442\u0440\u0430\u043d\u044b \u041b\u0430\u0442\u0410\u043c"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_drvlic:I

    const-string v9, "anydrvlic_latam"

    invoke-direct {v1, v9, v10, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    const/16 v3, 0x9

    aput-object v1, v0, v3

    .line 24
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any LATAM ID Card"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string v4, "ID-\u043a\u0430\u0440\u0442\u0430 \u0441\u0442\u0440\u0430\u043d\u044b \u041b\u0430\u0442\u0410\u043c"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const-string v9, "anyid_latam"

    invoke-direct {v1, v9, v10, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    const/16 v3, 0xa

    aput-object v1, v0, v3

    .line 25
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any LATAM Document"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442 \u0441\u0442\u0440\u0430\u043d\u044b \u041b\u0430\u0442\u0410\u043c"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const-string v9, "anylatam"

    invoke-direct {v1, v9, v10, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    const/16 v3, 0xb

    aput-object v1, v0, v3

    .line 26
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any Asia Document"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442 \u0441\u0442\u0440\u0430\u043d\u044b \u0410\u0437\u0438\u0438"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const-string v9, "anyasia"

    invoke-direct {v1, v9, v10, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    const/16 v3, 0xc

    aput-object v1, v0, v3

    .line 27
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any MENA Document"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442 \u0441\u0442\u0440\u0430\u043d\u044b MENA"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const-string v9, "anymena"

    invoke-direct {v1, v9, v10, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    const/16 v3, 0xd

    aput-object v1, v0, v3

    .line 28
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Any Africa Document"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442 \u0441\u0442\u0440\u0430\u043d\u044b \u0410\u0444\u0440\u0438\u043a\u0438"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const-string v9, "anyafrica"

    invoke-direct {v1, v9, v10, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    const/16 v3, 0xe

    aput-object v1, v0, v3

    .line 29
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Australian E-Driving License"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0410\u0432\u0441\u0442\u0440\u0430\u043b\u0438\u0439\u0441\u043a\u043e\u0435 \u044d\u043b\u0435\u043a\u0442\u0440\u043e\u043d\u043d\u043e\u0435 \u0432\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_drvlic:I

    const-string v9, "aus_edrvlic"

    invoke-direct {v1, v9, v10, v3, v4}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    const/16 v3, 0xf

    aput-object v1, v0, v3

    .line 30
    new-instance v1, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;

    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "Any Visa"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v6

    const-string/jumbo v3, "\u0412\u0438\u0437\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v8

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->d_visa:I

    const-string v4, "anyvisa"

    invoke-direct {v1, v4, v10, v2, v3}, Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    const/16 v2, 0x10

    aput-object v1, v0, v2

    .line 13
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/dictionaries/IdAutoselectionModes$Item;",
            ">;"
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/smartengines/dictionaries/IdAutoselectionModes;->data$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
