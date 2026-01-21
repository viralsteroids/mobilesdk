.class public final Lcom/smartengines/dictionaries/IdDocTypesNoRus;
.super Ljava/lang/Object;
.source "IdDocTypesNoRus.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0008B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/smartengines/dictionaries/IdDocTypesNoRus;",
        "",
        "<init>",
        "()V",
        "loadDictionary",
        "",
        "",
        "Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;",
        "IdDocType",
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
.field public static final INSTANCE:Lcom/smartengines/dictionaries/IdDocTypesNoRus;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/dictionaries/IdDocTypesNoRus;

    invoke-direct {v0}, Lcom/smartengines/dictionaries/IdDocTypesNoRus;-><init>()V

    sput-object v0, Lcom/smartengines/dictionaries/IdDocTypesNoRus;->INSTANCE:Lcom/smartengines/dictionaries/IdDocTypesNoRus;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final loadDictionary()Ljava/util/Map;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x3f

    .line 13
    new-array v0, v0, [Lkotlin/Pair;

    new-instance v1, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    const/4 v2, 0x2

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Passport"

    const-string v5, "en"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v6, 0x0

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u041f\u0430\u0441\u043f\u043e\u0440\u0442"

    const-string v7, "ru"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v8, 0x1

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_passport:I

    const/16 v9, 0x46

    invoke-direct {v1, v3, v4, v9}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;II)V

    const-string v3, "passport"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v6

    .line 14
    new-instance v1, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Internal passport"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0412\u043d\u0443\u0442\u0440\u0435\u043d\u043d\u0438\u0439 \u043f\u0430\u0441\u043f\u043e\u0440\u0442"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_passport:I

    const/16 v9, 0x64

    invoke-direct {v1, v3, v4, v9}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;II)V

    const-string v3, "passport.internal"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v8

    .line 15
    new-instance v1, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Registration page"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0421\u0442\u0440\u0430\u043d\u0438\u0446\u0430 \u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/4 v10, -0x1

    invoke-direct {v1, v3, v4, v10}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;II)V

    const-string v3, "passport.registration"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v2

    .line 16
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Passport card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041f\u0430\u0441\u043f\u043e\u0440\u0442\u043d\u0430\u044f \u043a\u0430\u0440\u0442\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "passport_card"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    .line 18
    new-instance v1, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "ID card"

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

    invoke-direct {v1, v3, v4, v9}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;II)V

    const-string v3, "id"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    .line 19
    new-instance v9, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Diplomatic ID card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0414\u0438\u043f\u043b\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u043b\u0438\u0447\u043d\u043e\u0441\u0442\u0438"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    sget v11, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "id.diplomatic"

    invoke-static {v1, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    .line 20
    new-instance v9, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Professional ID document"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041f\u0440\u043e\u0444\u0435\u0441\u0441\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u043b\u0438\u0447\u043d\u043e\u0441\u0442\u0438"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    sget v11, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    invoke-direct/range {v9 .. v14}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "id.professional"

    invoke-static {v1, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x6

    aput-object v1, v0, v3

    .line 21
    new-instance v9, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Builder ID"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v1, v6

    const-string v4, "ID \u0441\u0442\u0440\u043e\u0438\u0442\u0435\u043b\u044f"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    sget v11, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v9 .. v14}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "id.builder"

    invoke-static {v1, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v9, 0x7

    aput-object v1, v0, v9

    .line 22
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/4 v14, 0x4

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "btp"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x8

    aput-object v1, v0, v3

    .line 23
    new-instance v9, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Military ID card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0412\u043e\u0435\u043d\u043d\u044b\u0439 \u0431\u0438\u043b\u0435\u0442"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    sget v11, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "id.military"

    invoke-static {v1, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x9

    aput-object v1, v0, v3

    .line 24
    new-instance v9, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Doctor ID"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string v3, "ID \u0434\u043e\u043a\u0442\u043e\u0440\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    sget v11, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v9 .. v14}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "id.doctor"

    invoke-static {v1, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0xa

    aput-object v1, v0, v3

    .line 25
    new-instance v9, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Police ID card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string v3, "ID \u043f\u043e\u043b\u0438\u0446\u0435\u0439\u0441\u043a\u043e\u0433\u043e"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    sget v11, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v9 .. v14}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "id.police"

    invoke-static {v1, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0xb

    aput-object v1, v0, v3

    .line 26
    new-instance v9, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Veterinary ID card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0423\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u043b\u0438\u0447\u043d\u043e\u0441\u0442\u0438 \u0432\u0435\u0442\u0435\u0440\u0438\u043d\u0430\u0440\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    sget v11, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v9 .. v14}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "id.veterinary"

    invoke-static {v1, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0xc

    aput-object v1, v0, v3

    .line 27
    new-instance v9, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Student ID card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0421\u0442\u0443\u0434\u0435\u043d\u0447\u0435\u0441\u043a\u0430\u044f ID \u043a\u0430\u0440\u0442\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    sget v11, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v9 .. v14}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "id.student"

    invoke-static {v1, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0xd

    aput-object v1, v0, v3

    .line 28
    new-instance v9, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Lawyer ID card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0423\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u043b\u0438\u0447\u043d\u043e\u0441\u0442\u0438 \u0430\u0434\u0432\u043e\u043a\u0430\u0442\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    sget v11, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v9 .. v14}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "id.lawyer"

    invoke-static {v1, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0xe

    aput-object v1, v0, v3

    .line 30
    new-instance v1, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Driving licence"

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

    const/16 v9, 0x50

    invoke-direct {v1, v3, v4, v9}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;II)V

    const-string v3, "drvlic"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0xf

    aput-object v1, v0, v3

    .line 31
    new-instance v1, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Provisional driving licence"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0412\u0440\u0435\u043c\u0435\u043d\u043d\u043e\u0435 \u0432\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_drvlic:I

    const/16 v9, 0x3c

    invoke-direct {v1, v3, v4, v9}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;II)V

    const-string v3, "drvlic.provisional"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x10

    aput-object v1, v0, v3

    .line 32
    new-instance v1, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "Military driving licence"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string/jumbo v4, "\u0412\u043e\u0435\u043d\u043d\u043e\u0435 \u0432\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_drvlic:I

    invoke-direct {v1, v3, v4, v9}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;II)V

    const-string v3, "drvlic.military"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x11

    aput-object v1, v0, v3

    .line 33
    new-instance v1, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "AAMVA Driver\'s License"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v6

    const-string v4, "AAMVA \u0412\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->d_drvlic:I

    const/16 v10, 0x54

    invoke-direct {v1, v3, v4, v10}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;II)V

    const-string v3, "AAMVA.drvlic"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x12

    aput-object v1, v0, v3

    .line 35
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Birth certificate"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e \u0440\u043e\u0436\u0434\u0435\u043d\u0438\u0438"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_birth_certificate:I

    const/4 v14, 0x4

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "birth_certificate"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x13

    aput-object v1, v0, v3

    .line 36
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Death certificate"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e \u0441\u043c\u0435\u0440\u0442\u0438"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "death_certificate"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x14

    aput-object v1, v0, v3

    .line 37
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Name change certificate"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e \u043f\u0435\u0440\u0435\u043c\u0435\u043d\u0435 \u0438\u043c\u0435\u043d\u0438"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "name_change_certificate"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x15

    aput-object v1, v0, v3

    .line 38
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Paternity certificate"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e\u0431 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u0438 \u043e\u0442\u0446\u043e\u0432\u0441\u0442\u0432\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "paternity_certificate"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x16

    aput-object v1, v0, v3

    .line 39
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Immigration Certificate"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0418\u043c\u043c\u0438\u0433\u0440\u0430\u0446\u0438\u043e\u043d\u043d\u044b\u0439 \u0441\u0435\u0440\u0442\u0438\u0444\u0438\u043a\u0430\u0442"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "immigration_certificate"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x17

    aput-object v1, v0, v3

    .line 40
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Adoption certificate"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e\u0431 \u0443\u0441\u044b\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u0438"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "adoption_certificate"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x18

    aput-object v1, v0, v3

    .line 41
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Divorce certificate"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e \u0440\u0430\u0437\u0432\u043e\u0434\u0435"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "divorce_certificate"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x19

    aput-object v1, v0, v3

    .line 42
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Marriage certificate"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e \u0431\u0440\u0430\u043a\u0435"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "marriage_certificate"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x1a

    aput-object v1, v0, v3

    .line 43
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Certificate of Naturalization"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0421\u0435\u0440\u0442\u0438\u0444\u0438\u043a\u0430\u0442 \u043d\u0430\u0442\u0443\u0440\u0430\u043b\u0438\u0437\u0430\u0446\u0438\u0438"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "naturalization_certificate"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x1b

    aput-object v1, v0, v3

    .line 45
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Vehicle registration certificate"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e \u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438 \u0442\u0440\u0430\u043d\u0441\u043f\u043e\u0440\u0442\u043d\u043e\u0433\u043e \u0441\u0440\u0435\u0434\u0441\u0442\u0432\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_sts:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string/jumbo v1, "vrc"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x1c

    aput-object v1, v0, v3

    .line 46
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Work permit"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v1, v6

    const-string/jumbo v4, "\u0420\u0430\u0437\u0440\u0435\u0448\u0435\u043d\u0438\u0435 \u043d\u0430 \u0440\u0430\u0431\u043e\u0442\u0443"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    aput-object v11, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string/jumbo v1, "wp"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v10, 0x1d

    aput-object v1, v0, v10

    .line 47
    new-instance v11, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v12

    sget v13, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string/jumbo v1, "work"

    invoke-static {v1, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x1e

    aput-object v1, v0, v3

    .line 48
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Residence permit"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v1, v6

    const-string/jumbo v4, "\u0412\u0438\u0434 \u043d\u0430 \u0436\u0438\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e"

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    aput-object v11, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "residence"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v10, 0x1f

    aput-object v1, v0, v10

    .line 49
    new-instance v11, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v10, "SSN-82"

    invoke-static {v5, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v1, v6

    const-string/jumbo v10, "\u041d\u043e\u043c\u0435\u0440 \u0441\u043e\u0446\u0438\u0430\u043b\u044c\u043d\u043e\u0433\u043e \u0441\u0442\u0440\u0430\u0445\u043e\u0432\u0430\u043d\u0438\u044f (SSN-82)"

    invoke-static {v7, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v12

    sget v13, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/4 v15, 0x4

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string/jumbo v1, "ssn82"

    invoke-static {v1, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v10, 0x20

    aput-object v1, v0, v10

    .line 50
    new-instance v11, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v12

    sget v13, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v11 .. v16}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "rp"

    invoke-static {v1, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x21

    aput-object v1, v0, v3

    .line 51
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Border crossing card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041a\u0430\u0440\u0442\u0430 \u0434\u043b\u044f \u043f\u0435\u0440\u0435\u0441\u0435\u0447\u0435\u043d\u0438\u044f \u0433\u0440\u0430\u043d\u0438\u0446\u044b"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "border_crossing"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x22

    aput-object v1, v0, v3

    .line 52
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Pilot licence"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041b\u0438\u0446\u0435\u043d\u0437\u0438\u044f \u043f\u0438\u043b\u043e\u0442\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "pilotlic"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x23

    aput-object v1, v0, v3

    .line 53
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Aadhaar card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string v3, "Aadhaar \u043a\u0430\u0440\u0442\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "aadhaar"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x24

    aput-object v1, v0, v3

    .line 54
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Firearm permit"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0420\u0430\u0437\u0440\u0435\u0448\u0435\u043d\u0438\u0435 \u043d\u0430 \u043d\u043e\u0448\u0435\u043d\u0438\u0435 \u043e\u0433\u043d\u0435\u0441\u0442\u0440\u0435\u043b\u044c\u043d\u043e\u0433\u043e \u043e\u0440\u0443\u0436\u0438\u044f"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "firearm_permit"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x25

    aput-object v1, v0, v3

    .line 55
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Real estate licence"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041b\u0438\u0446\u0435\u043d\u0437\u0438\u044f \u043d\u0430 \u043d\u0435\u0434\u0432\u0438\u0436\u0438\u043c\u043e\u0441\u0442\u044c"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "re_license"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x26

    aput-object v1, v0, v3

    .line 56
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Veteran card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0423\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u0432\u0435\u0442\u0435\u0440\u0430\u043d\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string/jumbo v1, "veteran_card"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x27

    aput-object v1, v0, v3

    .line 57
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Advocate license"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0410\u0434\u0432\u043e\u043a\u0430\u0442\u0441\u043a\u0430\u044f \u043b\u0438\u0446\u0435\u043d\u0437\u0438\u044f"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "advocate_license"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x28

    aput-object v1, v0, v3

    .line 58
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Voter card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041a\u0430\u0440\u0442\u0430 \u0438\u0437\u0431\u0438\u0440\u0430\u0442\u0435\u043b\u044f"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string/jumbo v1, "voter_card"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x29

    aput-object v1, v0, v3

    .line 59
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Employment record"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0422\u0440\u0443\u0434\u043e\u0432\u0430\u044f \u043a\u043d\u0438\u0436\u043a\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "employment_record"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x2a

    aput-object v1, v0, v3

    .line 60
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Tax identification"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0418\u041d\u041d"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string/jumbo v1, "tin"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x2b

    aput-object v1, v0, v3

    .line 61
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Health insurance"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0421\u0442\u0440\u0430\u0445\u043e\u0432\u0430\u043d\u0438\u0435 \u0437\u0434\u043e\u0440\u043e\u0432\u044c\u044f"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_medcard:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "health_insurance"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x2c

    aput-object v1, v0, v3

    .line 62
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "PAN card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041a\u0430\u0440\u0442\u0430 PAN"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "pancard"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x2d

    aput-object v1, v0, v3

    .line 63
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "AMMPID"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v1, v6

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "ammpid"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x2e

    aput-object v1, v0, v3

    .line 64
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Visa"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0412\u0438\u0437\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_visa:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string/jumbo v1, "visa"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x2f

    aput-object v1, v0, v3

    .line 65
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "NINS slip"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041a\u0432\u0438\u0442\u0430\u043d\u0446\u0438\u044f NINS"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "nins"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x30

    aput-object v1, v0, v3

    .line 66
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Seafarer\'s identity document"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442, \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u044f\u044e\u0449\u0438\u0439 \u043b\u0438\u0447\u043d\u043e\u0441\u0442\u044c \u043c\u043e\u0440\u044f\u043a\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "seafarers_identity_document"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x31

    aput-object v1, v0, v3

    .line 67
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Home return card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041a\u0430\u0440\u0442\u0430 \u0432\u043e\u0437\u0432\u0440\u0430\u0442\u0430 \u0434\u043e\u043c\u043e\u0439"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "homereturn"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x32

    aput-object v1, v0, v3

    .line 68
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Medical insurance"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041c\u0435\u0434\u0438\u0446\u0438\u043d\u0441\u043a\u0430\u044f \u0441\u0442\u0440\u0430\u0445\u043e\u0432\u043a\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_medcard:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "insurance"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x33

    aput-object v1, v0, v3

    .line 69
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Vaccination card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041a\u0430\u0440\u0442\u0430 \u043e \u0432\u0430\u043a\u0446\u0438\u043d\u0430\u0446\u0438\u0438"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string/jumbo v1, "vaccination_card"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x34

    aput-object v1, v0, v3

    .line 70
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Medical card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041c\u0435\u0434\u0438\u0446\u0438\u043d\u0441\u043a\u0430\u044f \u043a\u0430\u0440\u0442\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_medcard:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "medcard"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x35

    aput-object v1, v0, v3

    .line 71
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Address card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0410\u0434\u0440\u0435\u0441\u043d\u0430\u044f \u043a\u0430\u0440\u0442\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "address_card"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x36

    aput-object v1, v0, v3

    .line 72
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Payment slip"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041f\u043b\u0430\u0442\u0451\u0436\u043d\u044b\u0439 \u0447\u0435\u043a"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "payslip"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x37

    aput-object v1, v0, v3

    .line 73
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Establishment card"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041a\u0430\u0440\u0442\u0430 \u0443\u0447\u0440\u0435\u0436\u0434\u0435\u043d\u0438\u044f"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "establishment_card"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x38

    aput-object v1, v0, v3

    .line 74
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Asylum residence permit"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0412\u0438\u0434 \u043d\u0430 \u0436\u0438\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u0431\u0435\u0436\u0435\u043d\u0446\u0430"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "rp.asylum"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x39

    aput-object v1, v0, v3

    .line 75
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Boating Licence"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0423\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u0441\u0443\u0434\u043e\u0432\u043e\u0434\u0438\u0442\u0435\u043b\u044f"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "btlic"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x3a

    aput-object v1, v0, v3

    .line 76
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Emergency Travel Document"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u042d\u043a\u0441\u0442\u0440\u0435\u043d\u043d\u044b\u0439 \u041f\u0440\u043e\u0435\u0437\u0434\u043d\u043e\u0439 \u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "emergency_travel_document"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x3b

    aput-object v1, v0, v3

    .line 77
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Hunting License"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u0420\u0430\u0437\u0440\u0435\u0448\u0435\u043d\u0438\u0435 \u043d\u0430 \u043e\u0445\u043e\u0442\u0443"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "hunting_license"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v9

    .line 78
    new-instance v10, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v3, "Vehicle Passport for Self-Propelled Machines and Other Equipment"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v6

    const-string/jumbo v3, "\u041f\u0430\u0441\u043f\u043e\u0440\u0442 \u0441\u0430\u043c\u043e\u0445\u043e\u0434\u043d\u043e\u0439 \u043c\u0430\u0448\u0438\u043d\u044b \u0438 \u0434\u0440\u0443\u0433\u0438\u0445 \u0432\u0438\u0434\u043e\u0432 \u0442\u0435\u0445\u043d\u0438\u043a\u0438"

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    sget v12, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    invoke-direct/range {v10 .. v15}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "psm"

    invoke-static {v1, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x3d

    aput-object v1, v0, v3

    .line 79
    new-instance v9, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;

    new-array v1, v2, [Lkotlin/Pair;

    const-string v2, "Tribal ID card"

    invoke-static {v5, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v6

    const-string/jumbo v2, "\u041f\u043b\u0435\u043c\u0435\u043d\u043d\u0430\u044f ID-\u043a\u0430\u0440\u0442\u0430"

    invoke-static {v7, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v8

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    sget v11, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lcom/smartengines/dictionaries/IdDocTypesNoRus$IdDocType;-><init>(Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "id.tribal"

    invoke-static {v1, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x3e

    aput-object v1, v0, v2

    .line 12
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
