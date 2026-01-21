.class public final Lcom/smartengines/dictionaries/IdDocTypesRus;
.super Ljava/lang/Object;
.source "IdDocTypesRus.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R!\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/smartengines/dictionaries/IdDocTypesRus;",
        "",
        "<init>",
        "()V",
        "data",
        "",
        "Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;",
        "getData",
        "()Ljava/util/List;",
        "data$delegate",
        "Lkotlin/Lazy;",
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
.field public static final INSTANCE:Lcom/smartengines/dictionaries/IdDocTypesRus;

.field private static final data$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$voUBci_t7fIa75pkRZYbDtv94Go()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/smartengines/dictionaries/IdDocTypesRus;->data_delegate$lambda$0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/dictionaries/IdDocTypesRus;

    invoke-direct {v0}, Lcom/smartengines/dictionaries/IdDocTypesRus;-><init>()V

    sput-object v0, Lcom/smartengines/dictionaries/IdDocTypesRus;->INSTANCE:Lcom/smartengines/dictionaries/IdDocTypesRus;

    .line 13
    new-instance v0, Lcom/smartengines/dictionaries/IdDocTypesRus$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/smartengines/dictionaries/IdDocTypesRus$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/smartengines/dictionaries/IdDocTypesRus;->data$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final data_delegate$lambda$0()Ljava/util/List;
    .locals 28

    const/16 v0, 0x37

    .line 14
    new-array v0, v0, [Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-instance v1, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    const/4 v7, 0x2

    new-array v2, v7, [Lkotlin/Pair;

    const-string v3, "National passport"

    const-string v8, "en"

    invoke-static {v8, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v9, 0x0

    aput-object v3, v2, v9

    const-string/jumbo v3, "\u041d\u0430\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u043f\u0430\u0441\u043f\u043e\u0440\u0442"

    const-string v10, "ru"

    invoke-static {v10, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v11, 0x1

    aput-object v3, v2, v11

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    sget v5, Lcom/smartengines/dictionaries/R$drawable;->d_passport:I

    const/16 v6, 0x64

    const-string v2, "default"

    const-string v3, "rus.passport.national"

    invoke-direct/range {v1 .. v6}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)V

    aput-object v1, v0, v9

    .line 15
    new-instance v12, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "National passport (Face Control)"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u041d\u0430\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u043f\u0430\u0441\u043f\u043e\u0440\u0442 (Face Control)"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v15

    sget v16, Lcom/smartengines/dictionaries/R$drawable;->d_passport:I

    const/16 v17, 0x63

    const-string v13, "face_control"

    const-string v14, "rus.passport.national"

    invoke-direct/range {v12 .. v17}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)V

    aput-object v12, v0, v11

    .line 16
    new-instance v1, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v2, v7, [Lkotlin/Pair;

    const-string v3, "National Passport: Registration"

    invoke-static {v8, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v9

    const-string/jumbo v3, "\u041d\u0430\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u043f\u0430\u0441\u043f\u043e\u0440\u0442: \u043f\u0440\u043e\u043f\u0438\u0441\u043a\u0430"

    invoke-static {v10, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v11

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    sget v5, Lcom/smartengines/dictionaries/R$drawable;->d_stamp:I

    const/16 v6, 0x5a

    const-string v2, "anyrus"

    const-string v3, "rus.passport.registration"

    invoke-direct/range {v1 .. v6}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)V

    aput-object v1, v0, v7

    .line 17
    new-instance v12, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "National Passport: Registration Page"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u041d\u0430\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u043f\u0430\u0441\u043f\u043e\u0440\u0442: \u0441\u0442\u0440\u0430\u043d\u0438\u0446\u0430 \u043c\u0435\u0441\u0442\u0430 \u0436\u0438\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v15

    sget v16, Lcom/smartengines/dictionaries/R$drawable;->d_passport:I

    const/16 v17, 0x56

    const-string v13, "default"

    const-string v14, "rus.passport.stamps_registration"

    invoke-direct/range {v12 .. v17}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)V

    const/4 v1, 0x3

    aput-object v12, v0, v1

    .line 18
    new-instance v13, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "National Passport: Any Stamped Page"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u041d\u0430\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u043f\u0430\u0441\u043f\u043e\u0440\u0442: \u0441\u0442\u0440\u0430\u043d\u0438\u0446\u0430 \u0441 \u043b\u044e\u0431\u044b\u043c \u0448\u0442\u0430\u043c\u043f\u043e\u043c"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v16

    sget v17, Lcom/smartengines/dictionaries/R$drawable;->d_stamp:I

    const/16 v18, 0x55

    const-string v14, "default"

    const-string v15, "rus.passport.stamps"

    invoke-direct/range {v13 .. v18}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)V

    const/4 v1, 0x4

    aput-object v13, v0, v1

    .line 19
    new-instance v14, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "National passport additional pages"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u041d\u0430\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u044b\u0439 \u043f\u0430\u0441\u043f\u043e\u0440\u0442: \u0434\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0435 \u0441\u0442\u0440\u0430\u043d\u0438\u0446\u044b"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v17

    sget v18, Lcom/smartengines/dictionaries/R$drawable;->d_passport:I

    const/16 v19, 0x54

    const-string v15, "extended"

    const-string v16, "rus.passport.national"

    invoke-direct/range {v14 .. v19}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)V

    const/4 v1, 0x5

    aput-object v14, v0, v1

    .line 20
    new-instance v15, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Any Driving Licence"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0412\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v18

    sget v19, Lcom/smartengines/dictionaries/R$drawable;->d_drvlic:I

    const/16 v20, 0x50

    const-string v16, "default"

    const-string v17, "rus.drvlic.*"

    invoke-direct/range {v15 .. v20}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)V

    const/4 v1, 0x6

    aput-object v15, v0, v1

    .line 21
    new-instance v16, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "International biometric passport"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0417\u0430\u0433\u0440\u0430\u043d\u0438\u0447\u043d\u044b\u0439 \u0431\u0438\u043e\u043c\u0435\u0442\u0440\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u043f\u0430\u0441\u043f\u043e\u0440\u0442"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v19

    sget v20, Lcom/smartengines/dictionaries/R$drawable;->d_passport:I

    const/16 v21, 0x46

    const-string v17, "default"

    const-string v18, "rus.passport.biometric"

    invoke-direct/range {v16 .. v21}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)V

    const/4 v1, 0x7

    aput-object v16, v0, v1

    .line 22
    new-instance v17, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "International passport"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0417\u0430\u0433\u0440\u0430\u043d\u0438\u0447\u043d\u044b\u0439 \u043f\u0430\u0441\u043f\u043e\u0440\u0442 \u0441\u0442\u0430\u0440\u043e\u0433\u043e \u043e\u0431\u0440\u0430\u0437\u0446\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v20

    sget v21, Lcom/smartengines/dictionaries/R$drawable;->d_passport:I

    const/16 v22, 0x46

    const-string v18, "default"

    const-string v19, "rus.passport.international"

    invoke-direct/range {v17 .. v22}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)V

    const/16 v1, 0x8

    aput-object v17, v0, v1

    .line 23
    new-instance v18, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "International driving licence"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0417\u0430\u0433\u0440\u0430\u043d\u0438\u0447\u043d\u043e\u0435 \u0432\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v21

    sget v22, Lcom/smartengines/dictionaries/R$drawable;->d_drvlic:I

    const/16 v23, 0x3c

    const-string v19, "default"

    const-string v20, "rus.drvlic.international.*"

    invoke-direct/range {v18 .. v23}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)V

    const/16 v1, 0x9

    aput-object v18, v0, v1

    .line 24
    new-instance v19, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Police ID card"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string v2, "ID \u043f\u043e\u043b\u0438\u0446\u0435\u0439\u0441\u043a\u043e\u0433\u043e"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v22

    sget v23, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v25, 0x10

    const/16 v26, 0x0

    const-string v20, "default"

    const-string v21, "rus.id.police.*"

    const/16 v24, 0x0

    invoke-direct/range {v19 .. v26}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0xa

    aput-object v19, v0, v1

    .line 25
    new-instance v20, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Specialist in welding production certificate (NAKS)"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0410\u0442\u0442\u0435\u0441\u0442\u0430\u0446\u0438\u043e\u043d\u043d\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u0441\u043f\u0435\u0446\u0438\u0430\u043b\u0438\u0441\u0442\u0430 \u0441\u0432\u0430\u0440\u043e\u0447\u043d\u043e\u0433\u043e \u043f\u0440\u043e\u0438\u0437\u0432\u043e\u0434\u0441\u0442\u0432\u0430 (\u041d\u0410\u041a\u0421)"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v23

    sget v24, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v26, 0x10

    const/16 v27, 0x0

    const-string v21, "default"

    const-string v22, "rus.id.naks.*"

    const/16 v25, 0x0

    invoke-direct/range {v20 .. v27}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0xb

    aput-object v20, v0, v1

    .line 26
    new-instance v12, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Residence permit"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0412\u0438\u0434 \u043d\u0430 \u0436\u0438\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v15

    sget v16, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v18, 0x10

    const/16 v19, 0x0

    const-string v13, "default"

    const-string v14, "rus.residence.*"

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0xc

    aput-object v12, v0, v1

    .line 27
    new-instance v13, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Biometric residence permit"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0411\u0438\u043e\u043c\u0435\u0442\u0440\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0432\u0438\u0434 \u043d\u0430 \u0436\u0438\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v16

    sget v17, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v19, 0x10

    const/16 v20, 0x0

    const-string v14, "default"

    const-string v15, "rus.residence.biometric"

    const/16 v18, 0x0

    invoke-direct/range {v13 .. v20}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0xd

    aput-object v13, v0, v1

    .line 28
    new-instance v14, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Temporary residence permit"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0412\u0440\u0435\u043c\u0435\u043d\u043d\u044b\u0439 \u0432\u0438\u0434 \u043d\u0430 \u0436\u0438\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v17

    sget v18, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v20, 0x10

    const/16 v21, 0x0

    const-string v15, "default"

    const-string v16, "rus.residence.temporary.*"

    const/16 v19, 0x0

    invoke-direct/range {v14 .. v21}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0xe

    aput-object v14, v0, v1

    .line 29
    new-instance v15, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Visa"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0412\u0438\u0437\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v18

    sget v19, Lcom/smartengines/dictionaries/R$drawable;->d_visa:I

    const/16 v21, 0x10

    const/16 v22, 0x0

    const-string v16, "default"

    const-string v17, "rus.visa.*"

    const/16 v20, 0x0

    invoke-direct/range {v15 .. v22}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0xf

    aput-object v15, v0, v1

    .line 30
    new-instance v16, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Tractor driving licence"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0412\u043e\u0434\u0438\u0442\u0435\u043b\u044c\u0441\u043a\u0438\u0435 \u043f\u0440\u0430\u0432\u0430 \u043d\u0430 \u0442\u0440\u0430\u043a\u0442\u043e\u0440"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v19

    sget v20, Lcom/smartengines/dictionaries/R$drawable;->d_drvlic:I

    const/16 v22, 0x10

    const/16 v23, 0x0

    const-string v17, "default"

    const-string v18, "rus.tractor_drvlic.*"

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v23}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x10

    aput-object v16, v0, v1

    .line 31
    new-instance v17, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Military ID card"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0412\u043e\u0435\u043d\u043d\u044b\u0439 \u0431\u0438\u043b\u0435\u0442"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v20

    sget v21, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v23, 0x10

    const/16 v24, 0x0

    const-string v18, "default"

    const-string v19, "rus.id.military.*"

    const/16 v22, 0x0

    invoke-direct/range {v17 .. v24}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x11

    aput-object v17, v0, v1

    .line 32
    new-instance v18, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Temporary identity card"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0412\u0440\u0435\u043c\u0435\u043d\u043d\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u043b\u0438\u0447\u043d\u043e\u0441\u0442\u0438"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v21

    sget v22, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v24, 0x10

    const/16 v25, 0x0

    const-string v19, "default"

    const-string v20, "rus.2p.*"

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v25}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x12

    aput-object v18, v0, v1

    .line 33
    new-instance v19, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Identity document of a stateless person"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442, \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u044f\u044e\u0449\u0438\u0439 \u043b\u0438\u0447\u043d\u043e\u0441\u0442\u044c \u043b\u0438\u0446\u0430 \u0431\u0435\u0437 \u0433\u0440\u0430\u0436\u0434\u0430\u043d\u0441\u0442\u0432\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v22

    sget v23, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v25, 0x10

    const/16 v26, 0x0

    const-string v20, "default"

    const-string v21, "rus.id.no_citizenship.*"

    const/16 v24, 0x0

    invoke-direct/range {v19 .. v26}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x13

    aput-object v19, v0, v1

    .line 34
    new-instance v20, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Seafarer\'s identity document"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442, \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u044f\u044e\u0449\u0438\u0439 \u043b\u0438\u0447\u043d\u043e\u0441\u0442\u044c \u043c\u043e\u0440\u044f\u043a\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v23

    sget v24, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v26, 0x10

    const-string v21, "default"

    const-string v22, "rus.seafarers_identity_document.*"

    const/16 v25, 0x0

    invoke-direct/range {v20 .. v27}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x14

    aput-object v20, v0, v1

    .line 35
    new-instance v12, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "INN (citizen)"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0418\u041d\u041d \u0444\u0438\u0437\u0438\u0447\u0435\u0441\u043a\u043e\u0433\u043e \u043b\u0438\u0446\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v15

    sget v16, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    const/16 v18, 0x10

    const/16 v19, 0x0

    const-string v13, "default"

    const-string v14, "rus.inn.citizen.*"

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x15

    aput-object v12, v0, v1

    .line 36
    new-instance v13, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "INN (entity)"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0418\u041d\u041d \u044e\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043a\u043e\u0433\u043e \u043b\u0438\u0446\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v16

    sget v17, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    const/16 v19, 0x10

    const/16 v20, 0x0

    const-string v14, "default"

    const-string v15, "rus.inn.entity.*"

    const/16 v18, 0x0

    invoke-direct/range {v13 .. v20}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x16

    aput-object v13, v0, v1

    .line 37
    new-instance v14, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Foreigner ID Card"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u041a\u0430\u0440\u0442\u0430 \u0438\u043d\u043e\u0441\u0442\u0440\u0430\u043d\u043d\u043e\u0433\u043e \u0433\u0440\u0430\u0436\u0434\u0430\u043d\u0438\u043d\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v17

    sget v18, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v20, 0x10

    const/16 v21, 0x0

    const-string v15, "default"

    const-string v16, "rus.id.foreigner.*"

    const/16 v19, 0x0

    invoke-direct/range {v14 .. v21}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x17

    aput-object v14, v0, v1

    .line 38
    new-instance v15, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Workshop card"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u041a\u0430\u0440\u0442\u0430 \u043c\u0430\u0441\u0442\u0435\u0440\u0441\u043a\u043e\u0439"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v18

    sget v19, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    const/16 v21, 0x10

    const/16 v22, 0x0

    const-string v16, "default"

    const-string v17, "rus.workshop_card.*"

    const/16 v20, 0x0

    invoke-direct/range {v15 .. v22}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x18

    aput-object v15, v0, v1

    .line 39
    new-instance v16, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Medical insurance"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u041c\u0435\u0434\u0438\u0446\u0438\u043d\u0441\u043a\u0430\u044f \u0441\u0442\u0440\u0430\u0445\u043e\u0432\u043a\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v19

    sget v20, Lcom/smartengines/dictionaries/R$drawable;->d_medcard:I

    const/16 v22, 0x10

    const/16 v23, 0x0

    const-string v17, "default"

    const-string v18, "rus.oms.*"

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v23}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x19

    aput-object v16, v0, v1

    .line 40
    new-instance v17, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Migration card"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u041c\u0438\u0433\u0440\u0430\u0446\u0438\u043e\u043d\u043d\u0430\u044f \u043a\u0430\u0440\u0442\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v20

    sget v21, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v23, 0x10

    const/16 v24, 0x0

    const-string v18, "default"

    const-string v19, "rus.migration_card.*"

    const/16 v22, 0x0

    invoke-direct/range {v17 .. v24}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x1a

    aput-object v17, v0, v1

    .line 41
    new-instance v18, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "PTS"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u041f\u0422\u0421"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v21

    sget v22, Lcom/smartengines/dictionaries/R$drawable;->d_sts:I

    const/16 v24, 0x10

    const/16 v25, 0x0

    const-string v19, "default"

    const-string v20, "rus.pts.*"

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v25}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x1b

    aput-object v18, v0, v1

    .line 42
    new-instance v19, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Pension ID"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u041f\u0435\u043d\u0441\u0438\u043e\u043d\u043d\u043e\u0435 \u0443\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v22

    sget v23, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v25, 0x10

    const/16 v26, 0x0

    const-string v20, "default"

    const-string v21, "rus.pension_id.*"

    const/16 v24, 0x0

    invoke-direct/range {v19 .. v26}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x1c

    aput-object v19, v0, v1

    .line 43
    new-instance v20, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Conscription certificate"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u041f\u0440\u0438\u043f\u0438\u0441\u043d\u043e\u0435"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v23

    sget v24, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v26, 0x10

    const-string v21, "default"

    const-string v22, "rus.conscription_certificate.*"

    const/16 v25, 0x0

    invoke-direct/range {v20 .. v27}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x1d

    aput-object v20, v0, v1

    .line 44
    new-instance v12, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Health permit"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0420\u0430\u0437\u0440\u0435\u0448\u0435\u043d\u0438\u0435 \u043d\u0430 \u043c\u0435\u0434\u0438\u0446\u0438\u043d\u0441\u043a\u043e\u0435 \u043e\u0431\u0441\u043b\u0443\u0436\u0438\u0432\u0430\u043d\u0438\u0435"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v15

    sget v16, Lcom/smartengines/dictionaries/R$drawable;->d_medcard:I

    const/16 v18, 0x10

    const/16 v19, 0x0

    const-string v13, "default"

    const-string v14, "rus.health_permit.*"

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x1e

    aput-object v12, v0, v1

    .line 45
    new-instance v13, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Firearm permit"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0420\u0430\u0437\u0440\u0435\u0448\u0435\u043d\u0438\u0435 \u043d\u0430 \u043d\u043e\u0448\u0435\u043d\u0438\u0435 \u043e\u0433\u043d\u0435\u0441\u0442\u0440\u0435\u043b\u044c\u043d\u043e\u0433\u043e \u043e\u0440\u0443\u0436\u0438\u044f"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v16

    sget v17, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v19, 0x10

    const/16 v20, 0x0

    const-string v14, "default"

    const-string v15, "rus.firearm_permit.*"

    const/16 v18, 0x0

    invoke-direct/range {v13 .. v20}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x1f

    aput-object v13, v0, v1

    .line 46
    new-instance v14, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Work permit"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0420\u0430\u0437\u0440\u0435\u0448\u0435\u043d\u0438\u0435 \u043d\u0430 \u0440\u0430\u0431\u043e\u0442\u0443"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v17

    sget v18, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v20, 0x10

    const/16 v21, 0x0

    const-string v15, "default"

    const-string v16, "rus.work_permit.*"

    const/16 v19, 0x0

    invoke-direct/range {v14 .. v21}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x20

    aput-object v14, v0, v1

    .line 47
    new-instance v15, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "SNILS"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0421\u041d\u0418\u041b\u0421"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v18

    sget v19, Lcom/smartengines/dictionaries/R$drawable;->d_snils:I

    const/16 v21, 0x10

    const/16 v22, 0x0

    const-string v16, "default"

    const-string v17, "rus.snils.*"

    const/16 v20, 0x0

    invoke-direct/range {v15 .. v22}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x21

    aput-object v15, v0, v1

    .line 48
    new-instance v16, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "STS"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0421\u0422\u0421"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v19

    sget v20, Lcom/smartengines/dictionaries/R$drawable;->d_sts:I

    const/16 v22, 0x10

    const/16 v23, 0x0

    const-string v17, "default"

    const-string v18, "rus.sts.*"

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v23}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x22

    aput-object v16, v0, v1

    .line 49
    new-instance v17, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Marriage certificate"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e \u0431\u0440\u0430\u043a\u0435"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v20

    sget v21, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    const/16 v23, 0x10

    const/16 v24, 0x0

    const-string v18, "default"

    const-string v19, "rus.marriage_certificate.*"

    const/16 v22, 0x0

    invoke-direct/range {v17 .. v24}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x23

    aput-object v17, v0, v1

    .line 50
    new-instance v18, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Name change certificate"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e \u043f\u0435\u0440\u0435\u043c\u0435\u043d\u0435 \u0438\u043c\u0435\u043d\u0438"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v21

    sget v22, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    const/16 v24, 0x10

    const/16 v25, 0x0

    const-string v19, "default"

    const-string v20, "rus.name_change_certificate.*"

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v25}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x24

    aput-object v18, v0, v1

    .line 51
    new-instance v19, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Divorce certificate"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e \u0440\u0430\u0437\u0432\u043e\u0434\u0435"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v22

    sget v23, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    const/16 v25, 0x10

    const/16 v26, 0x0

    const-string v20, "default"

    const-string v21, "rus.divorce_certificate.*"

    const/16 v24, 0x0

    invoke-direct/range {v19 .. v26}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x25

    aput-object v19, v0, v1

    .line 52
    new-instance v20, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Birth certificate"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e \u0440\u043e\u0436\u0434\u0435\u043d\u0438\u0438"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v23

    sget v24, Lcom/smartengines/dictionaries/R$drawable;->d_birth_certificate:I

    const/16 v26, 0x10

    const-string v21, "default"

    const-string v22, "rus.birth_certificate.*"

    const/16 v25, 0x0

    invoke-direct/range {v20 .. v27}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x26

    aput-object v20, v0, v1

    .line 53
    new-instance v12, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Death certificate"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e \u0441\u043c\u0435\u0440\u0442\u0438"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v15

    sget v16, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    const/16 v18, 0x10

    const/16 v19, 0x0

    const-string v13, "default"

    const-string v14, "rus.death_certificate.*"

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x27

    aput-object v12, v0, v1

    .line 54
    new-instance v13, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Disability certificate"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e\u0431 \u0438\u043d\u0432\u0430\u043b\u0438\u0434\u043d\u043e\u0441\u0442\u0438"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v16

    sget v17, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    const/16 v19, 0x10

    const/16 v20, 0x0

    const-string v14, "default"

    const-string v15, "rus.disability_certificate.*"

    const/16 v18, 0x0

    invoke-direct/range {v13 .. v20}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x28

    aput-object v13, v0, v1

    .line 55
    new-instance v14, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Paternity certificate"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e\u0431 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u0438 \u043e\u0442\u0446\u043e\u0432\u0441\u0442\u0432\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v17

    sget v18, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    const/16 v20, 0x10

    const/16 v21, 0x0

    const-string v15, "default"

    const-string v16, "rus.paternity_certificate.*"

    const/16 v19, 0x0

    invoke-direct/range {v14 .. v21}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x29

    aput-object v14, v0, v1

    .line 56
    new-instance v15, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Adoption certificate"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043e\u0431 \u0443\u0441\u044b\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u0438"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v18

    sget v19, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    const/16 v21, 0x10

    const/16 v22, 0x0

    const-string v16, "default"

    const-string v17, "rus.adoption_certificate.*"

    const/16 v20, 0x0

    invoke-direct/range {v15 .. v22}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x2a

    aput-object v15, v0, v1

    .line 57
    new-instance v16, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Pension Certificate"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0421\u0432\u0438\u0434\u0435\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u043e \u043f\u0435\u043d\u0441\u0438\u043e\u043d\u0435\u0440\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v19

    sget v20, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v22, 0x10

    const/16 v23, 0x0

    const-string v17, "default"

    const-string v18, "rus.pension_certificate.*"

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v23}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x2b

    aput-object v16, v0, v1

    .line 58
    new-instance v17, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Employment record"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0422\u0440\u0443\u0434\u043e\u0432\u0430\u044f \u043a\u043d\u0438\u0436\u043a\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v20

    sget v21, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    const/16 v23, 0x10

    const/16 v24, 0x0

    const-string v18, "default"

    const-string v19, "rus.employment_record.*"

    const/16 v22, 0x0

    invoke-direct/range {v17 .. v24}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x2c

    aput-object v17, v0, v1

    .line 59
    new-instance v18, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Ministry of Foreign Affairs ID"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0423\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u041c\u0418\u0414"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v21

    sget v22, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v24, 0x10

    const/16 v25, 0x0

    const-string v19, "default"

    const-string v20, "rus.id.mfa.*"

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v25}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x2d

    aput-object v18, v0, v1

    .line 60
    new-instance v19, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Refugee ID"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0423\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u0431\u0435\u0436\u0435\u043d\u0446\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v22

    sget v23, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v25, 0x10

    const/16 v26, 0x0

    const-string v20, "default"

    const-string v21, "rus.refugee.*"

    const/16 v24, 0x0

    invoke-direct/range {v19 .. v26}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x2e

    aput-object v19, v0, v1

    .line 61
    new-instance v20, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Lawyer ID card"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0423\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u043b\u0438\u0447\u043d\u043e\u0441\u0442\u0438 \u0430\u0434\u0432\u043e\u043a\u0430\u0442\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v23

    sget v24, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v26, 0x10

    const-string v21, "default"

    const-string v22, "rus.id.lawyer.*"

    const/16 v25, 0x0

    invoke-direct/range {v20 .. v27}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x2f

    aput-object v20, v0, v1

    .line 62
    new-instance v12, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Procecutor ID card"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0423\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u043b\u0438\u0447\u043d\u043e\u0441\u0442\u0438 \u043f\u0440\u043e\u043a\u0443\u0440\u043e\u0440\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v15

    sget v16, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v18, 0x10

    const/16 v19, 0x0

    const-string v13, "default"

    const-string v14, "rus.id.prosecutor.*"

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x30

    aput-object v12, v0, v1

    .line 63
    new-instance v13, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Large Family Certificate"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0423\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u043c\u043d\u043e\u0433\u043e\u0434\u0435\u0442\u043d\u043e\u0439 \u0441\u0435\u043c\u044c\u0438"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v16

    sget v17, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    const/16 v19, 0x10

    const/16 v20, 0x0

    const-string v14, "default"

    const-string v15, "rus.large_family_certificate.*"

    const/16 v18, 0x0

    invoke-direct/range {v13 .. v20}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x31

    aput-object v13, v0, v1

    .line 64
    new-instance v14, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Military Deferment Certificate"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0423\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u043e\u0431 \u043e\u0442\u0441\u0440\u043e\u0447\u043a\u0435 \u043d\u0430 \u0432\u043e\u0435\u043d\u043d\u0443\u044e \u0441\u043b\u0443\u0436\u0431\u0443"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v17

    sget v18, Lcom/smartengines/dictionaries/R$drawable;->d_document:I

    const/16 v20, 0x10

    const/16 v21, 0x0

    const-string v15, "default"

    const-string v16, "rus.military_deferment_certificate.*"

    const/16 v19, 0x0

    invoke-direct/range {v14 .. v21}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x32

    aput-object v14, v0, v1

    .line 65
    new-instance v15, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Soldier ID card"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0423\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u0441\u043e\u043b\u0434\u0430\u0442\u0430"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v18

    sget v19, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v21, 0x10

    const/16 v22, 0x0

    const-string v16, "default"

    const-string v17, "rus.id.soldier.*"

    const/16 v20, 0x0

    invoke-direct/range {v15 .. v22}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x33

    aput-object v15, v0, v1

    .line 66
    new-instance v16, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Boating Licence"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0423\u0434\u043e\u0441\u0442\u043e\u0432\u0435\u0440\u0435\u043d\u0438\u0435 \u0441\u0443\u0434\u043e\u0432\u043e\u0434\u0438\u0442\u0435\u043b\u044f"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v19

    sget v20, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v22, 0x10

    const/16 v23, 0x0

    const-string v17, "default"

    const-string v18, "rus.btlic.*"

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v23}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x34

    aput-object v16, v0, v1

    .line 67
    new-instance v17, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Previous passports stamp"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u0428\u0442\u0430\u043c\u043f \u043e \u043f\u0440\u0435\u0434\u044b\u0434\u0443\u0449\u0438\u0445 \u043f\u0430\u0441\u043f\u043e\u0440\u0442\u0430\u0445"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v20

    sget v21, Lcom/smartengines/dictionaries/R$drawable;->d_passport:I

    const/16 v23, 0x10

    const/16 v24, 0x0

    const-string v18, "default"

    const-string v19, "rus.passport.previous"

    const/16 v22, 0x0

    invoke-direct/range {v17 .. v24}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x35

    aput-object v17, v0, v1

    .line 68
    new-instance v18, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;

    new-array v1, v7, [Lkotlin/Pair;

    const-string v2, "Vehicle Passport for Self-Propelled Machines and Other Equipment"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v9

    const-string/jumbo v2, "\u041f\u0430\u0441\u043f\u043e\u0440\u0442 \u0441\u0430\u043c\u043e\u0445\u043e\u0434\u043d\u043e\u0439 \u043c\u0430\u0448\u0438\u043d\u044b \u0438 \u0434\u0440\u0443\u0433\u0438\u0445 \u0432\u0438\u0434\u043e\u0432 \u0442\u0435\u0445\u043d\u0438\u043a\u0438"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v11

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v21

    sget v22, Lcom/smartengines/dictionaries/R$drawable;->d_id:I

    const/16 v24, 0x10

    const/16 v25, 0x0

    const-string v19, "default"

    const-string v20, "rus.psm.*"

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v25}, Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0x36

    aput-object v18, v0, v1

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
            "Lcom/smartengines/dictionaries/IdDocTypesRus$IdDocType;",
            ">;"
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/smartengines/dictionaries/IdDocTypesRus;->data$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
