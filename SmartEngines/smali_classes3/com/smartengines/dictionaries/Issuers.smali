.class public final Lcom/smartengines/dictionaries/Issuers;
.super Ljava/lang/Object;
.source "Issuers.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/dictionaries/Issuers$Issuer;,
        Lcom/smartengines/dictionaries/Issuers$IssuerSrc;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIssuers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Issuers.kt\ncom/smartengines/dictionaries/Issuers\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,292:1\n126#2:293\n153#2,3:294\n*S KotlinDebug\n*F\n+ 1 Issuers.kt\ncom/smartengines/dictionaries/Issuers\n*L\n28#1:293\n28#1:294,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u000c\rB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00080\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/smartengines/dictionaries/Issuers;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "loadDictionary",
        "",
        "Lcom/smartengines/dictionaries/Issuers$Issuer;",
        "issuersAlternativeDictionary",
        "data",
        "Lcom/smartengines/dictionaries/Issuers$IssuerSrc;",
        "Issuer",
        "IssuerSrc",
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
.field public static final INSTANCE:Lcom/smartengines/dictionaries/Issuers;

.field private static final TAG:Ljava/lang/String; = "myapp.Issuers"

.field private static final data:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/dictionaries/Issuers$IssuerSrc;",
            ">;"
        }
    .end annotation
.end field

.field private static final issuersAlternativeDictionary:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 26

    new-instance v0, Lcom/smartengines/dictionaries/Issuers;

    invoke-direct {v0}, Lcom/smartengines/dictionaries/Issuers;-><init>()V

    sput-object v0, Lcom/smartengines/dictionaries/Issuers;->INSTANCE:Lcom/smartengines/dictionaries/Issuers;

    const/16 v0, 0xc

    .line 34
    new-array v1, v0, [Lkotlin/Pair;

    const-string v2, "UAE \u041e\u0410\u042d"

    const-string v3, "are"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x0

    aput-object v2, v1, v4

    .line 35
    const-string/jumbo v2, "\u041a\u041d\u0420"

    const-string v5, "chn"

    invoke-static {v5, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x1

    aput-object v2, v1, v6

    .line 36
    const-string v2, "Cote dIvoire"

    const-string v7, "civ"

    invoke-static {v7, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v8, 0x2

    aput-object v2, v1, v8

    .line 37
    const-string v2, "Curacao"

    const-string v9, "cuw"

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v10, 0x3

    aput-object v2, v1, v10

    .line 38
    const-string/jumbo v2, "\u0424\u0420\u0413"

    const-string v11, "deu"

    invoke-static {v11, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v12, 0x4

    aput-object v2, v1, v12

    .line 39
    const-string v2, "UK"

    const-string v13, "gbr"

    invoke-static {v13, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v14, 0x5

    aput-object v2, v1, v14

    .line 40
    const-string v2, "NZ"

    const-string v15, "nzl"

    invoke-static {v15, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v16, 0x6

    aput-object v2, v1, v16

    .line 41
    const-string/jumbo v2, "\u041a\u041d\u0414\u0420"

    move/from16 v17, v0

    const-string v0, "prk"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v18, 0x7

    aput-object v2, v1, v18

    .line 42
    const-string/jumbo v2, "\u0420\u0424"

    move/from16 v19, v4

    const-string v4, "rus"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v20, 0x8

    aput-object v2, v1, v20

    .line 43
    const-string v2, "sau"

    move/from16 v21, v6

    const-string v6, "KSA"

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x9

    aput-object v2, v1, v6

    .line 44
    const-string/jumbo v2, "usa"

    move/from16 v22, v6

    const-string/jumbo v6, "\u0421\u0428\u0410"

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0xa

    aput-object v2, v1, v6

    .line 45
    const-string/jumbo v2, "zaf"

    const-string v6, "SA \u042e\u0410\u0420"

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0xb

    aput-object v2, v1, v6

    .line 33
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Lcom/smartengines/dictionaries/Issuers;->issuersAlternativeDictionary:Ljava/util/Map;

    const/16 v1, 0xf2

    .line 49
    new-array v1, v1, [Lkotlin/Pair;

    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    move/from16 v23, v10

    const-string v10, "South Sudan"

    move/from16 v24, v12

    const-string v12, "en"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u042e\u0436\u043d\u044b\u0439 \u0421\u0443\u0434\u0430\u043d"

    move/from16 v25, v14

    const-string v14, "ru"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_ssd:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v6, "ssd"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v19

    .line 50
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Nicaragua"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u041d\u0438\u043a\u0430\u0440\u0430\u0433\u0443\u0430"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_nic:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "nic"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v21

    .line 51
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Finland"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0424\u0438\u043d\u043b\u044f\u043d\u0434\u0438\u044f"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_fin:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "fin"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v8

    .line 52
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Tunisia"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0422\u0443\u043d\u0438\u0441"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_tun:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v6, "tun"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v23

    .line 53
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Luxembourg"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u041b\u044e\u043a\u0441\u0435\u043c\u0431\u0443\u0440\u0433"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_lux:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "lux"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v24

    .line 54
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Uganda"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0423\u0433\u0430\u043d\u0434\u0430"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_uga:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v6, "uga"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v25

    .line 55
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Brazil"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0411\u0440\u0430\u0437\u0438\u043b\u0438\u044f"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_bra:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "bra"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v16

    .line 56
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Turkey"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0422\u0443\u0440\u0446\u0438\u044f"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_tur:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v6, "tur"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v18

    .line 57
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Barbados"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0411\u0430\u0440\u0431\u0430\u0434\u043e\u0441"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_brb:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "brb"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v20

    .line 58
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Tuvalu"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0422\u0443\u0432\u0430\u043b\u0443"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_tuv:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v6, "tuv"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v22

    .line 59
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Germany"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0413\u0435\u0440\u043c\u0430\u043d\u0438\u044f"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_deu:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    invoke-static {v11, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0xa

    aput-object v2, v1, v6

    .line 60
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Egypt"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0415\u0433\u0438\u043f\u0435\u0442"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_egy:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "egy"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0xb

    aput-object v2, v1, v6

    .line 61
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Latvia"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u041b\u0430\u0442\u0432\u0438\u044f"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_lva:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "lva"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v17

    .line 62
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Jamaica"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u042f\u043c\u0430\u0439\u043a\u0430"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_jam:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "jam"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0xd

    aput-object v2, v1, v6

    .line 63
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Niue"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u041d\u0438\u0443\u044d"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_niu:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "niu"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0xe

    aput-object v2, v1, v6

    .line 64
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "South Africa"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u042e\u0436\u043d\u0430\u044f \u0410\u0444\u0440\u0438\u043a\u0430"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_zaf:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v6, "zaf"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0xf

    aput-object v2, v1, v6

    .line 65
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Brunei Darussalam"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0411\u0440\u0443\u043d\u0435\u0439-\u0414\u0430\u0440\u0443\u0441\u0441\u0430\u043b\u0430\u043c"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_brn:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "brn"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x10

    aput-object v2, v1, v6

    .line 66
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Honduras"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0413\u043e\u043d\u0434\u0443\u0440\u0430\u0441"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_hnd:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "hnd"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x11

    aput-object v2, v1, v6

    .line 67
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "New Zealand"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u041d\u043e\u0432\u0430\u044f \u0417\u0435\u043b\u0430\u043d\u0434\u0438\u044f"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_nzl:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    invoke-static {v15, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x12

    aput-object v2, v1, v6

    .line 68
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Fiji"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0424\u0438\u0434\u0436\u0438"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_fji:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "fji"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x13

    aput-object v2, v1, v6

    .line 69
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Papua New Guinea"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u041f\u0430\u043f\u0443\u0430 - \u041d\u043e\u0432\u0430\u044f \u0413\u0432\u0438\u043d\u0435\u044f"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_png:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "png"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x14

    aput-object v2, v1, v6

    .line 70
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Sao Tome and Principe"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0421\u0430\u043d-\u0422\u043e\u043c\u0435 \u0438 \u041f\u0440\u0438\u043d\u0441\u0438\u043f\u0438"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_stp:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v6, "stp"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x15

    aput-object v2, v1, v6

    .line 71
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Marshall Islands"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u041c\u0430\u0440\u0448\u0430\u043b\u043b\u043e\u0432\u044b \u043e\u0441\u0442\u0440\u043e\u0432\u0430"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_mhl:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "mhl"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x16

    aput-object v2, v1, v6

    .line 72
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Cuba"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u041a\u0443\u0431\u0430"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_cub:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "cub"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x17

    aput-object v2, v1, v6

    .line 73
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Sudan"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0421\u0443\u0434\u0430\u043d"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_sdn:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "sdn"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x18

    aput-object v2, v1, v6

    .line 74
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Gambia"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u0413\u0430\u043c\u0431\u0438\u044f"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_gmb:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "gmb"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x19

    aput-object v2, v1, v6

    .line 75
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v10, "Cura\u00e7ao"

    invoke-static {v12, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v19

    const-string/jumbo v10, "\u041a\u044e\u0440\u0430\u0441\u0430\u043e"

    invoke-static {v14, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v10, Lcom/smartengines/dictionaries/R$drawable;->flag_cuw:I

    invoke-direct {v2, v6, v10}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x1a

    aput-object v2, v1, v6

    .line 76
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v9, "Malaysia"

    invoke-static {v12, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v6, v19

    const-string/jumbo v9, "\u041c\u0430\u043b\u0430\u0439\u0437\u0438\u044f"

    invoke-static {v14, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v9, Lcom/smartengines/dictionaries/R$drawable;->flag_mys:I

    invoke-direct {v2, v6, v9}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "mys"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x1b

    aput-object v2, v1, v6

    .line 77
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v9, "Taiwan, Province of China"

    invoke-static {v12, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v6, v19

    const-string/jumbo v9, "\u0422\u0430\u0439\u0432\u0430\u043d\u044c, \u043f\u0440\u043e\u0432\u0438\u043d\u0446\u0438\u044f \u041a\u0438\u0442\u0430\u044f"

    invoke-static {v14, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v9, Lcom/smartengines/dictionaries/R$drawable;->flag_twn:I

    invoke-direct {v2, v6, v9}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v6, "twn"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x1c

    aput-object v2, v1, v6

    .line 78
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v9, "Somaliland"

    invoke-static {v12, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v6, v19

    const-string/jumbo v9, "\u0421\u043e\u043c\u0430\u043b\u0438\u043b\u0435\u043d\u0434"

    invoke-static {v14, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v9, Lcom/smartengines/dictionaries/R$drawable;->flag_rsl:I

    invoke-direct {v2, v6, v9}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "rsl"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x1d

    aput-object v2, v1, v6

    .line 79
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v9, "Poland"

    invoke-static {v12, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v6, v19

    const-string/jumbo v9, "\u041f\u043e\u043b\u044c\u0448\u0430"

    invoke-static {v14, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v9, Lcom/smartengines/dictionaries/R$drawable;->flag_pol:I

    invoke-direct {v2, v6, v9}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "pol"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x1e

    aput-object v2, v1, v6

    .line 80
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v9, "Oman"

    invoke-static {v12, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v6, v19

    const-string/jumbo v9, "\u041e\u043c\u0430\u043d"

    invoke-static {v14, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v9, Lcom/smartengines/dictionaries/R$drawable;->flag_omn:I

    invoke-direct {v2, v6, v9}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v6, "omn"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x1f

    aput-object v2, v1, v6

    .line 81
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v9, "Suriname"

    invoke-static {v12, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v6, v19

    const-string/jumbo v9, "\u0421\u0443\u0440\u0438\u043d\u0430\u043c"

    invoke-static {v14, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v9, Lcom/smartengines/dictionaries/R$drawable;->flag_sur:I

    invoke-direct {v2, v6, v9}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v6, "sur"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x20

    aput-object v2, v1, v6

    .line 82
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v6, v8, [Lkotlin/Pair;

    const-string v9, "United Arab Emirates"

    invoke-static {v12, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v6, v19

    const-string/jumbo v9, "\u041e\u0431\u044a\u0435\u0434\u0438\u043d\u0435\u043d\u043d\u044b\u0435 \u0410\u0440\u0430\u0431\u0441\u043a\u0438\u0435 \u042d\u043c\u0438\u0440\u0430\u0442\u044b"

    invoke-static {v14, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v6, v21

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    sget v9, Lcom/smartengines/dictionaries/R$drawable;->flag_are:I

    invoke-direct {v2, v6, v9}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x21

    aput-object v2, v1, v3

    .line 83
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Kenya"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u041a\u0435\u043d\u0438\u044f"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_ken:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "ken"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x22

    aput-object v2, v1, v3

    .line 84
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Argentina"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0410\u0440\u0433\u0435\u043d\u0442\u0438\u043d\u0430"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_arg:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "arg"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x23

    aput-object v2, v1, v3

    .line 85
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "The Sovereign Military Order of Malta"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0421\u0443\u0432\u0435\u0440\u0435\u043d\u043d\u044b\u0439 \u0432\u043e\u0435\u043d\u043d\u044b\u0439 \u041c\u0430\u043b\u044c\u0442\u0438\u0439\u0441\u043a\u0438\u0439 \u043e\u0440\u0434\u0435\u043d"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_xom:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v3, "xom"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x24

    aput-object v2, v1, v3

    .line 86
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Guinea-Bissau"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0413\u0432\u0438\u043d\u0435\u044f-\u0411\u0438\u0441\u0430\u0443"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_gnb:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "gnb"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x25

    aput-object v2, v1, v3

    .line 87
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Uzbekistan"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0423\u0437\u0431\u0435\u043a\u0438\u0441\u0442\u0430\u043d"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_uzb:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v3, "uzb"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x26

    aput-object v2, v1, v3

    .line 88
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Armenia"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0410\u0440\u043c\u0435\u043d\u0438\u044f"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_arm:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "arm"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x27

    aput-object v2, v1, v3

    .line 89
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Bhutan"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0411\u0443\u0442\u0430\u043d"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_btn:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "btn"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x28

    aput-object v2, v1, v3

    .line 90
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Senegal"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0421\u0435\u043d\u0435\u0433\u0430\u043b"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_sen:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "sen"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x29

    aput-object v2, v1, v3

    .line 91
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Togo"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0422\u043e\u0433\u043e"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_tgo:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v3, "tgo"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x2a

    aput-object v2, v1, v3

    .line 92
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Ireland"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0418\u0440\u043b\u0430\u043d\u0434\u0438\u044f"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_irl:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "irl"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x2b

    aput-object v2, v1, v3

    .line 93
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Iran, Islamic Republic of"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0418\u0440\u0430\u043d, \u0418\u0441\u043b\u0430\u043c\u0441\u043a\u0430\u044f \u0420\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0430"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_irn:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "irn"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x2c

    aput-object v2, v1, v3

    .line 94
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Qatar"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u041a\u0430\u0442\u0430\u0440"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_qat:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "qat"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x2d

    aput-object v2, v1, v3

    .line 95
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Burundi"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0411\u0443\u0440\u0443\u043d\u0434\u0438"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_bdi:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "bdi"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x2e

    aput-object v2, v1, v3

    .line 96
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Netherlands"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u041d\u0438\u0434\u0435\u0440\u043b\u0430\u043d\u0434\u044b"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_nld:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "nld"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x2f

    aput-object v2, v1, v3

    .line 97
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Iraq"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0418\u0440\u0430\u043a"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_irq:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "irq"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x30

    aput-object v2, v1, v3

    .line 98
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Slovakia"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0421\u043b\u043e\u0432\u0430\u043a\u0438\u044f"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_svk:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v3, "svk"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x31

    aput-object v2, v1, v3

    .line 99
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Slovenia"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0421\u043b\u043e\u0432\u0435\u043d\u0438\u044f"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_svn:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v3, "svn"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x32

    aput-object v2, v1, v3

    .line 100
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Abkhazia"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0410\u0431\u0445\u0430\u0437\u0438\u044f"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_abk:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "abk"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x33

    aput-object v2, v1, v3

    .line 101
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Equatorial Guinea"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u042d\u043a\u0432\u0430\u0442\u043e\u0440\u0438\u0430\u043b\u044c\u043d\u0430\u044f \u0413\u0432\u0438\u043d\u0435\u044f"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_gnq:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "gnq"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x34

    aput-object v2, v1, v3

    .line 102
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Thailand"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0422\u0430\u0438\u043b\u0430\u043d\u0434"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_tha:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v3, "tha"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x35

    aput-object v2, v1, v3

    .line 103
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Interpol"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0418\u043d\u0442\u0435\u0440\u043f\u043e\u043b"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_xpo:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v3, "xpo"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x36

    aput-object v2, v1, v3

    .line 104
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Aruba"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0410\u0440\u0443\u0431\u0430"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_abw:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "abw"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x37

    aput-object v2, v1, v3

    .line 105
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Sweden"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0428\u0432\u0435\u0446\u0438\u044f"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_swe:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v3, "swe"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x38

    aput-object v2, v1, v3

    .line 106
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Iceland"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0418\u0441\u043b\u0430\u043d\u0434\u0438\u044f"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_isl:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "isl"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x39

    aput-object v2, v1, v3

    .line 107
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "North Macedonia"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0421\u0435\u0432\u0435\u0440\u043d\u0430\u044f \u041c\u0430\u043a\u0435\u0434\u043e\u043d\u0438\u044f"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_mkd:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "mkd"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x3a

    aput-object v2, v1, v3

    .line 108
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Belgium"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0411\u0435\u043b\u044c\u0433\u0438\u044f"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_bel:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "bel"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x3b

    aput-object v2, v1, v3

    .line 109
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Israel"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0418\u0437\u0440\u0430\u0438\u043b\u044c"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_isr:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "isr"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x3c

    aput-object v2, v1, v3

    .line 110
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Kuwait"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u041a\u0443\u0432\u0435\u0439\u0442"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_kwt:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "kwt"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x3d

    aput-object v2, v1, v3

    .line 111
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Liechtenstein"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u041b\u0438\u0445\u0442\u0435\u043d\u0448\u0442\u0435\u0439\u043d"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_lie:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "lie"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x3e

    aput-object v2, v1, v3

    .line 112
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Benin"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0411\u0435\u043d\u0438\u043d"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_ben:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "ben"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x3f

    aput-object v2, v1, v3

    .line 113
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Algeria"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0410\u043b\u0436\u0438\u0440"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_dza:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "dza"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x40

    aput-object v2, v1, v3

    .line 114
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Bonaire, Sint Eustatius and Saba"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0411\u043e\u043d\u0430\u0439\u0440\u0435, \u0421\u0438\u043d\u0442-\u042d\u0441\u0442\u0430\u0442\u0438\u0443\u0441 \u0438 \u0421\u0430\u0431\u0430"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_bes:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "bes"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x41

    aput-object v2, v1, v3

    .line 115
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v6, "Russian Federation"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v19

    const-string/jumbo v6, "\u0420\u043e\u0441\u0441\u0438\u0439\u0441\u043a\u0430\u044f \u0424\u0435\u0434\u0435\u0440\u0430\u0446\u0438\u044f"

    invoke-static {v14, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v6, Lcom/smartengines/dictionaries/R$drawable;->flag_rus:I

    invoke-direct {v2, v3, v6}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x42

    aput-object v2, v1, v3

    .line 116
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Antigua and Barbuda"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u0410\u043d\u0442\u0438\u0433\u0443\u0430 \u0438 \u0411\u0430\u0440\u0431\u0443\u0434\u0430"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_atg:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "atg"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x43

    aput-object v2, v1, v3

    .line 117
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Italy"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u0418\u0442\u0430\u043b\u0438\u044f"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_ita:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "ita"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x44

    aput-object v2, v1, v3

    .line 118
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Eswatini"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u042d\u0441\u0432\u0430\u0442\u0438\u043d\u0438"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_swz:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v3, "swz"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x45

    aput-object v2, v1, v3

    .line 119
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Tanzania, United Republic of"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u0422\u0430\u043d\u0437\u0430\u043d\u0438\u044f, \u041e\u0431\u044a\u0435\u0434\u0438\u043d\u0435\u043d\u043d\u0430\u044f \u0420\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0430"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_tza:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v3, "tza"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x46

    aput-object v2, v1, v3

    .line 120
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Pakistan"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u041f\u0430\u043a\u0438\u0441\u0442\u0430\u043d"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_pak:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "pak"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x47

    aput-object v2, v1, v3

    .line 121
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Burkina Faso"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u0411\u0443\u0440\u043a\u0438\u043d\u0430-\u0424\u0430\u0441\u043e"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_bfa:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "bfa"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x48

    aput-object v2, v1, v3

    .line 122
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Panama"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u041f\u0430\u043d\u0430\u043c\u0430"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_pan:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "pan"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x49

    aput-object v2, v1, v3

    .line 123
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Singapore"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u0421\u0438\u043d\u0433\u0430\u043f\u0443\u0440"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_sgp:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v3, "sgp"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x4a

    aput-object v2, v1, v3

    .line 124
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Ukraine"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u0423\u043a\u0440\u0430\u0438\u043d\u0430"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_ukr:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v3, "ukr"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x4b

    aput-object v2, v1, v3

    .line 125
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Jersey"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u0414\u0436\u0435\u0440\u0441\u0438"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_jey:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "jey"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x4c

    aput-object v2, v1, v3

    .line 126
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Kyrgyzstan"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u041a\u044b\u0440\u0433\u044b\u0437\u0441\u0442\u0430\u043d"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_kgz:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "kgz"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x4d

    aput-object v2, v1, v3

    .line 127
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Switzerland"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u0428\u0432\u0435\u0439\u0446\u0430\u0440\u0438\u044f"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_che:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "che"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x4e

    aput-object v2, v1, v3

    .line 128
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Djibouti"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u0414\u0436\u0438\u0431\u0443\u0442\u0438"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_dji:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "dji"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x4f

    aput-object v2, v1, v3

    .line 129
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Chile"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u0427\u0438\u043b\u0438"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_chl:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v3, "chl"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x50

    aput-object v2, v1, v3

    .line 130
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "China"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u041a\u0438\u0442\u0430\u0439"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_chn:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    invoke-static {v5, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v3, 0x51

    aput-object v2, v1, v3

    .line 131
    new-instance v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v3, v8, [Lkotlin/Pair;

    const-string v4, "Korea, Democratic People\'s Republic of"

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    const-string/jumbo v4, "\u041a\u043e\u0440\u0435\u044f, \u041d\u0430\u0440\u043e\u0434\u043d\u043e-\u0414\u0435\u043c\u043e\u043a\u0440\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u0420\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0430"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v21

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    sget v4, Lcom/smartengines/dictionaries/R$drawable;->flag_prk:I

    invoke-direct {v2, v3, v4}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x52

    aput-object v0, v1, v2

    .line 132
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Sint Maarten (Dutch part)"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u0438\u043d\u0442-\u041c\u0430\u0440\u0442\u0435\u043d (\u0413\u043e\u043b\u043b\u0430\u043d\u0434\u0441\u043a\u0430\u044f \u0447\u0430\u0441\u0442\u044c)"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_sxm:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "sxm"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x53

    aput-object v0, v1, v2

    .line 133
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Mali"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u0430\u043b\u0438"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mli:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mli"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x54

    aput-object v0, v1, v2

    .line 134
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Botswana"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0411\u043e\u0442\u0441\u0432\u0430\u043d\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_bwa:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "bwa"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x55

    aput-object v0, v1, v2

    .line 135
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Croatia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0425\u043e\u0440\u0432\u0430\u0442\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_hrv:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "hrv"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x56

    aput-object v0, v1, v2

    .line 136
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Cambodia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u0430\u043c\u0431\u043e\u0434\u0436\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_khm:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "khm"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x57

    aput-object v0, v1, v2

    .line 137
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Indonesia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0418\u043d\u0434\u043e\u043d\u0435\u0437\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_idn:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "idn"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x58

    aput-object v0, v1, v2

    .line 138
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Portugal"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041f\u043e\u0440\u0442\u0443\u0433\u0430\u043b\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_prt:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "prt"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x59

    aput-object v0, v1, v2

    .line 139
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Malta"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u0430\u043b\u044c\u0442\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mlt:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mlt"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x5a

    aput-object v0, v1, v2

    .line 140
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Tajikistan"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0422\u0430\u0434\u0436\u0438\u043a\u0438\u0441\u0442\u0430\u043d"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_tjk:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "tjk"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x5b

    aput-object v0, v1, v2

    .line 141
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Viet Nam"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0412\u044c\u0435\u0442\u043d\u0430\u043c"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_vnm:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "vnm"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x5c

    aput-object v0, v1, v2

    .line 142
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Cayman Islands"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u0430\u0439\u043c\u0430\u043d\u043e\u0432\u044b \u043e\u0441\u0442\u0440\u043e\u0432\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_cym:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "cym"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x5d

    aput-object v0, v1, v2

    .line 143
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Paraguay"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041f\u0430\u0440\u0430\u0433\u0432\u0430\u0439"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_pry:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "pry"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x5e

    aput-object v0, v1, v2

    .line 144
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "African Development Bank"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0410\u0444\u0440\u0438\u043a\u0430\u043d\u0441\u043a\u0438\u0439 \u0431\u0430\u043d\u043a \u0440\u0430\u0437\u0432\u0438\u0442\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_xba:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "xba"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x5f

    aput-object v0, v1, v2

    .line 145
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Saint Helena, Ascension and Tristan da Cunha"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041e\u0441\u0442\u0440\u043e\u0432\u0430 \u0421\u0432\u044f\u0442\u043e\u0439 \u0415\u043b\u0435\u043d\u044b, \u0412\u043e\u0437\u043d\u0435\u0441\u0435\u043d\u0438\u044f \u0438 \u0422\u0440\u0438\u0441\u0442\u0430\u043d-\u0434\u0430-\u041a\u0443\u043d\u044c\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_shn:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "shn"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x60

    aput-object v0, v1, v2

    .line 146
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Cyprus"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u0438\u043f\u0440"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_cyp:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "cyp"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x61

    aput-object v0, v1, v2

    .line 147
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Seychelles"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u0435\u0439\u0448\u0435\u043b\u044c\u0441\u043a\u0438\u0435 \u043e\u0441\u0442\u0440\u043e\u0432\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_syc:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "syc"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x62

    aput-object v0, v1, v2

    .line 148
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Rwanda"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0420\u0443\u0430\u043d\u0434\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_rwa:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "rwa"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x63

    aput-object v0, v1, v2

    .line 149
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Australia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0410\u0432\u0441\u0442\u0440\u0430\u043b\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_aus:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "aus"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x64

    aput-object v0, v1, v2

    .line 150
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Bangladesh"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0411\u0430\u043d\u0433\u043b\u0430\u0434\u0435\u0448"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_bgd:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "bgd"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x65

    aput-object v0, v1, v2

    .line 151
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Austria"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0410\u0432\u0441\u0442\u0440\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_aut:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "aut"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x66

    aput-object v0, v1, v2

    .line 152
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Sri Lanka"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0428\u0440\u0438-\u041b\u0430\u043d\u043a\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_lka:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "lka"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x67

    aput-object v0, v1, v2

    .line 153
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Palestine, State of"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041f\u0430\u043b\u0435\u0441\u0442\u0438\u043d\u0430, \u0413\u043e\u0441\u0443\u0434\u0430\u0440\u0441\u0442\u0432\u043e"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_pse:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "pse"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x68

    aput-object v0, v1, v2

    .line 154
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Gabon"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0413\u0430\u0431\u043e\u043d"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_gab:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "gab"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x69

    aput-object v0, v1, v2

    .line 155
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Zimbabwe"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0417\u0438\u043c\u0431\u0430\u0431\u0432\u0435"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_zwe:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "zwe"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x6a

    aput-object v0, v1, v2

    .line 156
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Bulgaria"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0411\u043e\u043b\u0433\u0430\u0440\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_bgr:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "bgr"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x6b

    aput-object v0, v1, v2

    .line 157
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Syrian Arab Republic"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u0438\u0440\u0438\u0439\u0441\u043a\u0430\u044f \u0410\u0440\u0430\u0431\u0441\u043a\u0430\u044f \u0420\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_syr:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "syr"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x6c

    aput-object v0, v1, v2

    .line 158
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Czechia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0427\u0435\u0445\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_cze:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "cze"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x6d

    aput-object v0, v1, v2

    .line 159
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Norway"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041d\u043e\u0440\u0432\u0435\u0433\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_nor:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "nor"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x6e

    aput-object v0, v1, v2

    .line 160
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "C\u00f4te d\'Ivoire"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u043e\u0442-\u0434\'\u0418\u0432\u0443\u0430\u0440"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_civ:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    invoke-static {v7, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x6f

    aput-object v0, v1, v2

    .line 161
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Myanmar"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u044c\u044f\u043d\u043c\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mmr:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mmr"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x70

    aput-object v0, v1, v2

    .line 162
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Kiribati"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u0438\u0440\u0438\u0431\u0430\u0442\u0438"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_kir:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "kir"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x71

    aput-object v0, v1, v2

    .line 163
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Turkmenistan"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0422\u0443\u0440\u043a\u043c\u0435\u043d\u0438\u0441\u0442\u0430\u043d"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_tkm:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "tkm"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x72

    aput-object v0, v1, v2

    .line 164
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Grenada"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0413\u0440\u0435\u043d\u0430\u0434\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_grd:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "grd"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x73

    aput-object v0, v1, v2

    .line 165
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Greece"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0413\u0440\u0435\u0446\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_grc:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "grc"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x74

    aput-object v0, v1, v2

    .line 166
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Haiti"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0413\u0430\u0438\u0442\u0438"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_hti:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "hti"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x75

    aput-object v0, v1, v2

    .line 167
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Greenland"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0413\u0440\u0435\u043d\u043b\u0430\u043d\u0434\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_grl:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "grl"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x76

    aput-object v0, v1, v2

    .line 168
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Yemen"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0419\u0435\u043c\u0435\u043d"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_yem:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "yem"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x77

    aput-object v0, v1, v2

    .line 169
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Afghanistan"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0410\u0444\u0433\u0430\u043d\u0438\u0441\u0442\u0430\u043d"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_afg:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "afg"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x78

    aput-object v0, v1, v2

    .line 170
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Montenegro"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0427\u0435\u0440\u043d\u043e\u0433\u043e\u0440\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mne:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mne"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x79

    aput-object v0, v1, v2

    .line 171
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Mongolia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u043e\u043d\u0433\u043e\u043b\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mng:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mng"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x7a

    aput-object v0, v1, v2

    .line 172
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Cayman Islands: BOTC"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u0430\u0439\u043c\u0430\u043d\u043e\u0432\u044b \u043e\u0441\u0442\u0440\u043e\u0432\u0430: \u0411\u041e\u0422\u041a"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_gbd:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "gbd"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x7b

    aput-object v0, v1, v2

    .line 173
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Nortnern Cyprus Territory"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u0435\u0432\u0435\u0440\u043d\u0430\u044f \u0442\u0435\u0440\u0440\u0438\u0442\u043e\u0440\u0438\u044f \u041a\u0438\u043f\u0440\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_xct:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "xct"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x7c

    aput-object v0, v1, v2

    .line 174
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Nepal"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041d\u0435\u043f\u0430\u043b"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_npl:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "npl"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x7d

    aput-object v0, v1, v2

    .line 175
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Bahamas"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0411\u0430\u0433\u0430\u043c\u0441\u043a\u0438\u0435 \u043e\u0441\u0442\u0440\u043e\u0432\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_bhs:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "bhs"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x7e

    aput-object v0, v1, v2

    .line 176
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Bahrain"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0411\u0430\u0445\u0440\u0435\u0439\u043d"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_bhr:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "bhr"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x7f

    aput-object v0, v1, v2

    .line 177
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "United Nations Interim Administration Mission in Kosovo"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u0438\u0441\u0441\u0438\u044f \u041e\u041e\u041d \u043f\u043e \u0434\u0435\u043b\u0430\u043c \u0432\u0440\u0435\u043c\u0435\u043d\u043d\u043e\u0439 \u0430\u0434\u043c\u0438\u043d\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438 \u0432 \u041a\u043e\u0441\u043e\u0432\u043e"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_unk:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "unk"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x80

    aput-object v0, v1, v2

    .line 178
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "United Kingdom"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0412\u0435\u043b\u0438\u043a\u043e\u0431\u0440\u0438\u0442\u0430\u043d\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_gbr:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    invoke-static {v13, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x81

    aput-object v0, v1, v2

    .line 179
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "United Nations"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f \u041e\u0431\u044a\u0435\u0434\u0438\u043d\u0451\u043d\u043d\u044b\u0445 \u041d\u0430\u0446\u0438\u0439"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_uno:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "uno"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x82

    aput-object v0, v1, v2

    .line 180
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Dominica"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0414\u043e\u043c\u0438\u043d\u0438\u043a\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_dma:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "dma"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x83

    aput-object v0, v1, v2

    .line 181
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Timor-Leste"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0422\u0438\u043c\u043e\u0440-\u041b\u0435\u0448\u0442\u0438"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_tls:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "tls"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x84

    aput-object v0, v1, v2

    .line 182
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Bosnia and Herzegovina"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0411\u043e\u0441\u043d\u0438\u044f \u0438 \u0413\u0435\u0440\u0446\u0435\u0433\u043e\u0432\u0438\u043d\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_bih:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "bih"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x85

    aput-object v0, v1, v2

    .line 183
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Hungary"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0412\u0435\u043d\u0433\u0440\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_hun:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "hun"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x86

    aput-object v0, v1, v2

    .line 184
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Angola"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0410\u043d\u0433\u043e\u043b\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_ago:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "ago"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x87

    aput-object v0, v1, v2

    .line 185
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Samoa"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u0430\u043c\u043e\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_wsm:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "wsm"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x88

    aput-object v0, v1, v2

    .line 186
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "France"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0424\u0440\u0430\u043d\u0446\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_fra:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "fra"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x89

    aput-object v0, v1, v2

    .line 187
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Economic Community of West African States - ECOWAS"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u042d\u043a\u043e\u043d\u043e\u043c\u0438\u0447\u0435\u0441\u043a\u043e\u0435 \u0441\u043e\u043e\u0431\u0449\u0435\u0441\u0442\u0432\u043e \u0417\u0430\u043f\u0430\u0434\u043d\u043e\u0430\u0444\u0440\u0438\u043a\u0430\u043d\u0441\u043a\u0438\u0445 \u0433\u043e\u0441\u0443\u0434\u0430\u0440\u0441\u0442\u0432 - \u042d\u041a\u041e\u0412\u0410\u0421"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_xec:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "xec"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x8a

    aput-object v0, v1, v2

    .line 188
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Mozambique"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u043e\u0437\u0430\u043c\u0431\u0438\u043a"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_moz:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "moz"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x8b

    aput-object v0, v1, v2

    .line 189
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Namibia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041d\u0430\u043c\u0438\u0431\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_nam:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "nam"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x8c

    aput-object v0, v1, v2

    .line 190
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Peru"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041f\u0435\u0440\u0443"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_per:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "per"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x8d

    aput-object v0, v1, v2

    .line 191
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Denmark"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0414\u0430\u043d\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_dnk:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "dnk"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x8e

    aput-object v0, v1, v2

    .line 192
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Guatemala"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0413\u0432\u0430\u0442\u0435\u043c\u0430\u043b\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_gtm:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "gtm"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x8f

    aput-object v0, v1, v2

    .line 193
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Faroe Islands"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0424\u0430\u0440\u0435\u0440\u0441\u043a\u0438\u0435 \u043e\u0441\u0442\u0440\u043e\u0432\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_fro:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "fro"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x90

    aput-object v0, v1, v2

    .line 194
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Organisation of Eastern Caribbean States(OECS)"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f \u0412\u043e\u0441\u0442\u043e\u0447\u043d\u043e-\u043a\u0430\u0440\u0438\u0431\u0441\u043a\u0438\u0445 \u0433\u043e\u0441\u0443\u0434\u0430\u0440\u0441\u0442\u0432 (\u041e\u0412\u041a\u0413)"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_xes:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "xes"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x91

    aput-object v0, v1, v2

    .line 195
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Solomon Islands"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u043e\u043b\u043e\u043c\u043e\u043d\u043e\u0432\u044b \u043e\u0441\u0442\u0440\u043e\u0432\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_slb:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "slb"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x92

    aput-object v0, v1, v2

    .line 196
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Holy See (Vatican City State)"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u0432\u044f\u0442\u043e\u0439 \u041f\u0440\u0435\u0441\u0442\u043e\u043b (\u0433\u043e\u0440\u043e\u0434-\u0433\u043e\u0441\u0443\u0434\u0430\u0440\u0441\u0442\u0432\u043e \u0412\u0430\u0442\u0438\u043a\u0430\u043d)"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_vat:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "vat"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x93

    aput-object v0, v1, v2

    .line 197
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Sierra Leone"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u044c\u0435\u0440\u0440\u0430-\u041b\u0435\u043e\u043d\u0435"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_sle:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "sle"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x94

    aput-object v0, v1, v2

    .line 198
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Nauru"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041d\u0430\u0443\u0440\u0443"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_nru:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "nru"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x95

    aput-object v0, v1, v2

    .line 199
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Anguilla"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0410\u043d\u0433\u0438\u043b\u044c\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_aia:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "aia"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x96

    aput-object v0, v1, v2

    .line 200
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "El Salvador"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u0430\u043b\u044c\u0432\u0430\u0434\u043e\u0440"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_slv:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "slv"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x97

    aput-object v0, v1, v2

    .line 201
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Micronesia, Federated States of"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u0438\u043a\u0440\u043e\u043d\u0435\u0437\u0438\u044f, \u0424\u0435\u0434\u0435\u0440\u0430\u0442\u0438\u0432\u043d\u044b\u0435 \u0448\u0442\u0430\u0442\u044b"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_fsm:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "fsm"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x98

    aput-object v0, v1, v2

    .line 202
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Dominican Republic"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0414\u043e\u043c\u0438\u043d\u0438\u043a\u0430\u043d\u0441\u043a\u0430\u044f \u0420\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_dom:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "dom"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x99

    aput-object v0, v1, v2

    .line 203
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Cameroon"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u0430\u043c\u0435\u0440\u0443\u043d"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_cmr:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "cmr"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x9a

    aput-object v0, v1, v2

    .line 204
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Guyana"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0413\u0430\u0439\u0430\u043d\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_guy:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "guy"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x9b

    aput-object v0, v1, v2

    .line 205
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Azerbaijan"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0410\u0437\u0435\u0440\u0431\u0430\u0439\u0434\u0436\u0430\u043d"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_aze:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "aze"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x9c

    aput-object v0, v1, v2

    .line 206
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Macao"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u0430\u043a\u0430\u043e"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mac:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mac"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x9d

    aput-object v0, v1, v2

    .line 207
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Georgia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0413\u0440\u0443\u0437\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_geo:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "geo"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x9e

    aput-object v0, v1, v2

    .line 208
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Tonga"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0422\u043e\u043d\u0433\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_ton:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "ton"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x9f

    aput-object v0, v1, v2

    .line 209
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Saint Martin (French part)"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u0435\u043d-\u041c\u0430\u0440\u0442\u0435\u043d (\u0424\u0440\u0430\u043d\u0446\u0443\u0437\u0441\u043a\u0430\u044f \u0447\u0430\u0441\u0442\u044c)"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_maf:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "maf"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xa0

    aput-object v0, v1, v2

    .line 210
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "New Caledonia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041d\u043e\u0432\u0430\u044f \u041a\u0430\u043b\u0435\u0434\u043e\u043d\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_ncl:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "ncl"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xa1

    aput-object v0, v1, v2

    .line 211
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "San Marino"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u0430\u043d-\u041c\u0430\u0440\u0438\u043d\u043e"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_smr:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "smr"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xa2

    aput-object v0, v1, v2

    .line 212
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "The Republic of Kosovo"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0420\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0430 \u041a\u043e\u0441\u043e\u0432\u043e"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_rks:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "rks"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xa3

    aput-object v0, v1, v2

    .line 213
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Eritrea"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u042d\u0440\u0438\u0442\u0440\u0435\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_eri:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "eri"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xa4

    aput-object v0, v1, v2

    .line 214
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Saint Kitts and Nevis"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u0435\u043d\u0442-\u041a\u0438\u0442\u0441 \u0438 \u041d\u0435\u0432\u0438\u0441"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_kna:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "kna"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xa5

    aput-object v0, v1, v2

    .line 215
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Morocco"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u0430\u0440\u043e\u043a\u043a\u043e"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mar:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mar"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xa6

    aput-object v0, v1, v2

    .line 216
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "The African Union"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0410\u0444\u0440\u0438\u043a\u0430\u043d\u0441\u043a\u0438\u0439 \u0441\u043e\u044e\u0437"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_uap:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "uap"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xa7

    aput-object v0, v1, v2

    .line 217
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Saint Vincent and the Grenadines"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u0435\u043d\u0442-\u0412\u0438\u043d\u0441\u0435\u043d\u0442 \u0438 \u0413\u0440\u0435\u043d\u0430\u0434\u0438\u043d\u044b"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_vct:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "vct"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xa8

    aput-object v0, v1, v2

    .line 218
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Belarus"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0411\u0435\u043b\u0430\u0440\u0443\u0441\u044c"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_blr:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "blr"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xa9

    aput-object v0, v1, v2

    .line 219
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Mauritania"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u0430\u0432\u0440\u0438\u0442\u0430\u043d\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mrt:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mrt"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xaa

    aput-object v0, v1, v2

    .line 220
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Belize"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0411\u0435\u043b\u0438\u0437"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_blz:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "blz"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xab

    aput-object v0, v1, v2

    .line 221
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Philippines"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0424\u0438\u043b\u0438\u043f\u043f\u0438\u043d\u044b"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_phl:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "phl"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xac

    aput-object v0, v1, v2

    .line 222
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Congo, The Democratic Republic of the"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u043e\u043d\u0433\u043e, \u0414\u0435\u043c\u043e\u043a\u0440\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u0420\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_cod:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "cod"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xad

    aput-object v0, v1, v2

    .line 223
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Congo"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u043e\u043d\u0433\u043e"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_cog:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "cog"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xae

    aput-object v0, v1, v2

    .line 224
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Western Sahara"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0417\u0430\u043f\u0430\u0434\u043d\u0430\u044f \u0421\u0430\u0445\u0430\u0440\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_esh:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "esh"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xaf

    aput-object v0, v1, v2

    .line 225
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "French Polynesia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0424\u0440\u0430\u043d\u0446\u0443\u0437\u0441\u043a\u0430\u044f \u041f\u043e\u043b\u0438\u043d\u0435\u0437\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_pyf:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "pyf"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xb0

    aput-object v0, v1, v2

    .line 226
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Uruguay"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0423\u0440\u0443\u0433\u0432\u0430\u0439"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_ury:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "ury"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xb1

    aput-object v0, v1, v2

    .line 227
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Cook Islands"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041e\u0441\u0442\u0440\u043e\u0432\u0430 \u041a\u0443\u043a\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_cok:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "cok"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xb2

    aput-object v0, v1, v2

    .line 228
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Comoros"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u043e\u043c\u043e\u0440\u0441\u043a\u0438\u0435 \u043e\u0441\u0442\u0440\u043e\u0432\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_com:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "com"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xb3

    aput-object v0, v1, v2

    .line 229
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Colombia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u043e\u043b\u0443\u043c\u0431\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_col:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "col"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xb4

    aput-object v0, v1, v2

    .line 230
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "United States"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u043e\u0435\u0434\u0438\u043d\u0435\u043d\u043d\u044b\u0435 \u0428\u0442\u0430\u0442\u044b"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_usa:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "usa"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xb5

    aput-object v0, v1, v2

    .line 231
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Spain"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0418\u0441\u043f\u0430\u043d\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_esp:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "esp"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xb6

    aput-object v0, v1, v2

    .line 232
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Estonia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u042d\u0441\u0442\u043e\u043d\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_est:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "est"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xb7

    aput-object v0, v1, v2

    .line 233
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Bermuda"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0411\u0435\u0440\u043c\u0443\u0434\u0441\u043a\u0438\u0435 \u043e\u0441\u0442\u0440\u043e\u0432\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_bmu:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "bmu"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xb8

    aput-object v0, v1, v2

    .line 234
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Montserrat"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u043e\u043d\u0442\u0441\u0435\u0440\u0440\u0430\u0442"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_msr:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "msr"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xb9

    aput-object v0, v1, v2

    .line 235
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Zambia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0417\u0430\u043c\u0431\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_zmb:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "zmb"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xba

    aput-object v0, v1, v2

    .line 236
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Korea, Republic of"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u043e\u0440\u0435\u044f, \u0420\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_kor:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "kor"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xbb

    aput-object v0, v1, v2

    .line 237
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Somalia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u043e\u043c\u0430\u043b\u0438"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_som:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "som"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xbc

    aput-object v0, v1, v2

    .line 238
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Vanuatu"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0412\u0430\u043d\u0443\u0430\u0442\u0443"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_vut:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "vut"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xbd

    aput-object v0, v1, v2

    .line 239
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Albania"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0410\u043b\u0431\u0430\u043d\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_alb:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "alb"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xbe

    aput-object v0, v1, v2

    .line 240
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Ecuador"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u042d\u043a\u0432\u0430\u0434\u043e\u0440"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_ecu:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "ecu"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xbf

    aput-object v0, v1, v2

    .line 241
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Ethiopia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u042d\u0444\u0438\u043e\u043f\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_eth:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "eth"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xc0

    aput-object v0, v1, v2

    .line 242
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Guernsey"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0413\u0435\u0440\u043d\u0441\u0438"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_ggy:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "ggy"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xc1

    aput-object v0, v1, v2

    .line 243
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Monaco"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u043e\u043d\u0430\u043a\u043e"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mco:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mco"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xc2

    aput-object v0, v1, v2

    .line 244
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Niger"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041d\u0438\u0433\u0435\u0440"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_ner:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "ner"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xc3

    aput-object v0, v1, v2

    .line 245
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Lao People\'s Democratic Republic"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041b\u0430\u043e\u0441\u0441\u043a\u0430\u044f \u041d\u0430\u0440\u043e\u0434\u043d\u043e-\u0414\u0435\u043c\u043e\u043a\u0440\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u0420\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_lao:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "lao"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xc4

    aput-object v0, v1, v2

    .line 246
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Venezuela, Bolivarian Republic of"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0412\u0435\u043d\u0435\u0441\u0443\u044d\u043b\u0430, \u0411\u043e\u043b\u0438\u0432\u0430\u0440\u0438\u0430\u043d\u0441\u043a\u0430\u044f \u0420\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_ven:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "ven"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xc5

    aput-object v0, v1, v2

    .line 247
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Ghana"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0413\u0430\u043d\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_gha:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "gha"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xc6

    aput-object v0, v1, v2

    .line 248
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Cabo Verde"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u0430\u0431\u043e-\u0412\u0435\u0440\u0434\u0435"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_cpv:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "cpv"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xc7

    aput-object v0, v1, v2

    .line 249
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Moldova, Republic of"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u043e\u043b\u0434\u043e\u0432\u0430, \u0420\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mda:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mda"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xc8

    aput-object v0, v1, v2

    .line 250
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Madagascar"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u0430\u0434\u0430\u0433\u0430\u0441\u043a\u0430\u0440"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mdg:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mdg"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xc9

    aput-object v0, v1, v2

    .line 251
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "European Union"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0415\u0432\u0440\u043e\u043f\u0435\u0439\u0441\u043a\u0438\u0439 \u0441\u043e\u044e\u0437"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_eue:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "eue"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xca

    aput-object v0, v1, v2

    .line 252
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Lebanon"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041b\u0438\u0432\u0430\u043d"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_lbn:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "lbn"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xcb

    aput-object v0, v1, v2

    .line 253
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Liberia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041b\u0438\u0431\u0435\u0440\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_lbr:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "lbr"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xcc

    aput-object v0, v1, v2

    .line 254
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Bolivia, Plurinational State of"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0411\u043e\u043b\u0438\u0432\u0438\u044f, \u041c\u043d\u043e\u0433\u043e\u043d\u0430\u0446\u0438\u043e\u043d\u0430\u043b\u044c\u043d\u043e\u0435 \u0433\u043e\u0441\u0443\u0434\u0430\u0440\u0441\u0442\u0432\u043e"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_bol:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "bol"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xcd

    aput-object v0, v1, v2

    .line 255
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Maldives"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u0430\u043b\u044c\u0434\u0438\u0432\u044b"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mdv:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mdv"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xce

    aput-object v0, v1, v2

    .line 256
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Gibraltar"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0413\u0438\u0431\u0440\u0430\u043b\u0442\u0430\u0440"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_gib:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "gib"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xcf

    aput-object v0, v1, v2

    .line 257
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Libya"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041b\u0438\u0432\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_lby:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "lby"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xd0

    aput-object v0, v1, v2

    .line 258
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Hong Kong"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0413\u043e\u043d\u043a\u043e\u043d\u0433"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_hkg:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "hkg"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xd1

    aput-object v0, v1, v2

    .line 259
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Central African Republic"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0426\u0435\u043d\u0442\u0440\u0430\u043b\u044c\u043d\u043e\u0430\u0444\u0440\u0438\u043a\u0430\u043d\u0441\u043a\u0430\u044f \u0420\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_caf:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "caf"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xd2

    aput-object v0, v1, v2

    .line 260
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Lesotho"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041b\u0435\u0441\u043e\u0442\u043e"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_lso:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "lso"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xd3

    aput-object v0, v1, v2

    .line 261
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Nigeria"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041d\u0438\u0433\u0435\u0440\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_nga:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "nga"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xd4

    aput-object v0, v1, v2

    .line 262
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Mauritius"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u0430\u0432\u0440\u0438\u043a\u0438\u0439"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mus:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mus"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xd5

    aput-object v0, v1, v2

    .line 263
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Isle of Man"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041e\u0441\u0442\u0440\u043e\u0432 \u041c\u044d\u043d"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_imn:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "imn"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xd6

    aput-object v0, v1, v2

    .line 264
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Saint Lucia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u0435\u043d\u0442-\u041b\u044e\u0441\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_lca:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "lca"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xd7

    aput-object v0, v1, v2

    .line 265
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Jordan"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0418\u043e\u0440\u0434\u0430\u043d\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_jor:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "jor"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xd8

    aput-object v0, v1, v2

    .line 266
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Guinea"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0413\u0432\u0438\u043d\u0435\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_gin:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "gin"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xd9

    aput-object v0, v1, v2

    .line 267
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Virgin Islands, British"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0412\u0438\u0440\u0433\u0438\u043d\u0441\u043a\u0438\u0435 \u043e\u0441\u0442\u0440\u043e\u0432\u0430, \u0412\u0435\u043b\u0438\u043a\u043e\u0431\u0440\u0438\u0442\u0430\u043d\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_vgb:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "vgb"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xda

    aput-object v0, v1, v2

    .line 268
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Canada"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u0430\u043d\u0430\u0434\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_can:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "can"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xdb

    aput-object v0, v1, v2

    .line 269
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Turks and Caicos Islands"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041e\u0441\u0442\u0440\u043e\u0432\u0430 \u0422\u0435\u0440\u043a\u0441 \u0438 \u041a\u0430\u0439\u043a\u043e\u0441"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_tca:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "tca"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xdc

    aput-object v0, v1, v2

    .line 270
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Chad"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0427\u0430\u0434"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_tcd:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "tcd"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xdd

    aput-object v0, v1, v2

    .line 271
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Andorra"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0410\u043d\u0434\u043e\u0440\u0440\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_and:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "and"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xde

    aput-object v0, v1, v2

    .line 272
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Romania"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0420\u0443\u043c\u044b\u043d\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_rou:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "rou"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xdf

    aput-object v0, v1, v2

    .line 273
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Costa Rica"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u043e\u0441\u0442\u0430-\u0420\u0438\u043a\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_cri:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "cri"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xe0

    aput-object v0, v1, v2

    .line 274
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "India"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0418\u043d\u0434\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_ind:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "ind"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xe1

    aput-object v0, v1, v2

    .line 275
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Mexico"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u0435\u043a\u0441\u0438\u043a\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mex:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mex"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xe2

    aput-object v0, v1, v2

    .line 276
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Serbia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u0435\u0440\u0431\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_srb:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "srb"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xe3

    aput-object v0, v1, v2

    .line 277
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Kazakhstan"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u0430\u0437\u0430\u0445\u0441\u0442\u0430\u043d"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_kaz:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "kaz"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xe4

    aput-object v0, v1, v2

    .line 278
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Saudi Arabia"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0421\u0430\u0443\u0434\u043e\u0432\u0441\u043a\u0430\u044f \u0410\u0440\u0430\u0432\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_sau:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "sau"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xe5

    aput-object v0, v1, v2

    .line 279
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Japan"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u042f\u043f\u043e\u043d\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_jpn:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "jpn"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xe6

    aput-object v0, v1, v2

    .line 280
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Lithuania"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041b\u0438\u0442\u0432\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_ltu:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "ltu"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xe7

    aput-object v0, v1, v2

    .line 281
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Trinidad and Tobago"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0422\u0440\u0438\u043d\u0438\u0434\u0430\u0434 \u0438 \u0422\u043e\u0431\u0430\u0433\u043e"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_tto:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "tto"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xe8

    aput-object v0, v1, v2

    .line 282
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Palau"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041f\u0430\u043b\u0430\u0443"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_plw:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "plw"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xe9

    aput-object v0, v1, v2

    .line 283
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Malawi"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u0430\u043b\u0430\u0432\u0438"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_mwi:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "mwi"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xea

    aput-object v0, v1, v2

    .line 284
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "UNHCR"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string v3, "UNHCR"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_unhcr:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "unhcr"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xeb

    aput-object v0, v1, v2

    .line 285
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Pridnestrovian Moldavian Republic"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041f\u0440\u0438\u0434\u043d\u0435\u0441\u0442\u0440\u043e\u0432\u0441\u043a\u0430\u044f \u041c\u043e\u043b\u0434\u0430\u0432\u0441\u043a\u0430\u044f \u0420\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0430"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_pmr:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "pmr"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xec

    aput-object v0, v1, v2

    .line 286
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Asia-Pacific Economic Cooperation"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u0410\u0437\u0438\u0430\u0442\u0441\u043a\u043e-\u0422\u0438\u0445\u043e\u043e\u043a\u0435\u0430\u043d\u0441\u043a\u043e\u0435 \u044d\u043a\u043e\u043d\u043e\u043c\u0438\u0447\u0435\u0441\u043a\u043e\u0435 \u0441\u043e\u0442\u0440\u0443\u0434\u043d\u0438\u0447\u0435\u0441\u0442\u0432\u043e"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_apec:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string v2, "apec"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xed

    aput-object v0, v1, v2

    .line 287
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Intergovernmental Authority on Development"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041c\u0435\u0436\u043f\u0440\u0430\u0432\u0438\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u0435\u043d\u043d\u044b\u0439 \u043e\u0440\u0433\u0430\u043d \u043f\u043e \u0432\u043e\u043f\u0440\u043e\u0441\u0430\u043c \u0440\u0430\u0437\u0432\u0438\u0442\u0438\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_xig:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "xig"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xee

    aput-object v0, v1, v2

    .line 288
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Common Market for Eastern and Southern Africa - COMESA"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041e\u0431\u0449\u0438\u0439 \u0440\u044b\u043d\u043e\u043a \u0412\u043e\u0441\u0442\u043e\u0447\u043d\u043e\u0439 \u0438 \u042e\u0436\u043d\u043e\u0439 \u0410\u0444\u0440\u0438\u043a\u0438 - \u041a\u041e\u041c\u0415\u0421\u0410"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_xco:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "xco"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xef

    aput-object v0, v1, v2

    .line 289
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Caribbean Community - CARICOM"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041a\u0430\u0440\u0438\u0431\u0441\u043a\u043e\u0435 \u0441\u043e\u043e\u0431\u0449\u0435\u0441\u0442\u0432\u043e - \u041a\u0410\u0420\u0418\u041a\u041e\u041c"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_xcc:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "xcc"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xf0

    aput-object v0, v1, v2

    .line 290
    new-instance v0, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    new-array v2, v8, [Lkotlin/Pair;

    const-string v3, "Parliamentary Assembly of the Mediterranean"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v19

    const-string/jumbo v3, "\u041f\u0430\u0440\u043b\u0430\u043c\u0435\u043d\u0442\u0441\u043a\u0430\u044f \u0410\u0441\u0441\u0430\u043c\u0431\u043b\u0435\u044f \u0421\u0440\u0435\u0434\u0438\u0437\u0435\u043c\u043d\u043e\u043c\u043e\u0440\u044c\u044f"

    invoke-static {v14, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v21

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    sget v3, Lcom/smartengines/dictionaries/R$drawable;->flag_xmp:I

    invoke-direct {v0, v2, v3}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;-><init>(Ljava/util/Map;I)V

    const-string/jumbo v2, "xmp"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xf1

    aput-object v0, v1, v2

    .line 48
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/smartengines/dictionaries/Issuers;->data:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final loadDictionary()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/smartengines/dictionaries/Issuers$Issuer;",
            ">;"
        }
    .end annotation

    .line 28
    sget-object v0, Lcom/smartengines/dictionaries/Issuers;->data:Ljava/util/Map;

    .line 293
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 294
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;

    .line 29
    new-instance v4, Lcom/smartengines/dictionaries/Issuers$Issuer;

    invoke-virtual {v2}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;->getName()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v2}, Lcom/smartengines/dictionaries/Issuers$IssuerSrc;->getIcon()I

    move-result v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const/16 v7, 0x20

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v6

    sget-object v7, Lcom/smartengines/dictionaries/Issuers;->issuersAlternativeDictionary:Ljava/util/Map;

    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_0

    const-string v7, ""

    :cond_0
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v2, v6}, Lcom/smartengines/dictionaries/Issuers$Issuer;-><init>(Ljava/util/Map;ILjava/lang/String;)V

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 295
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 296
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 293
    check-cast v1, Ljava/lang/Iterable;

    .line 30
    invoke-static {v1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
