.class public Lnet/sf/scuba/data/TestCountry;
.super Lnet/sf/scuba/data/Country;
.source "TestCountry.java"


# static fields
.field public static final BP:Lnet/sf/scuba/data/TestCountry;

.field public static final DV:Lnet/sf/scuba/data/TestCountry;

.field public static final UT:Lnet/sf/scuba/data/TestCountry;

.field private static final VALUES:[Lnet/sf/scuba/data/TestCountry;

.field private static final serialVersionUID:J = 0x60d6887a66dd822cL


# instance fields
.field private alpha2Code:Ljava/lang/String;

.field private alpha3Code:Ljava/lang/String;

.field private code:I

.field private name:Ljava/lang/String;

.field private nationality:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 37
    new-instance v0, Lnet/sf/scuba/data/TestCountry;

    const-string v4, "Utopia"

    const-string v5, "Utopian"

    const/4 v1, -0x1

    const-string v2, "UT"

    const-string v3, "UTO"

    invoke-direct/range {v0 .. v5}, Lnet/sf/scuba/data/TestCountry;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lnet/sf/scuba/data/TestCountry;->UT:Lnet/sf/scuba/data/TestCountry;

    .line 40
    new-instance v1, Lnet/sf/scuba/data/TestCountry;

    const-string v5, "BP"

    const-string v6, "BP"

    const/4 v2, -0x1

    const-string v3, "BP"

    const-string v4, "XBP"

    invoke-direct/range {v1 .. v6}, Lnet/sf/scuba/data/TestCountry;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lnet/sf/scuba/data/TestCountry;->BP:Lnet/sf/scuba/data/TestCountry;

    .line 41
    new-instance v2, Lnet/sf/scuba/data/TestCountry;

    const-string v6, "DV"

    const-string v7, "DV"

    const/4 v3, -0x1

    const-string v4, "DV"

    const-string v5, "XDV"

    invoke-direct/range {v2 .. v7}, Lnet/sf/scuba/data/TestCountry;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lnet/sf/scuba/data/TestCountry;->DV:Lnet/sf/scuba/data/TestCountry;

    .line 50
    filled-new-array {v0, v1, v2}, [Lnet/sf/scuba/data/TestCountry;

    move-result-object v0

    sput-object v0, Lnet/sf/scuba/data/TestCountry;->VALUES:[Lnet/sf/scuba/data/TestCountry;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Lnet/sf/scuba/data/Country;-><init>()V

    return-void
.end method

.method private constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lnet/sf/scuba/data/Country;-><init>()V

    .line 56
    iput p1, p0, Lnet/sf/scuba/data/TestCountry;->code:I

    .line 57
    iput-object p2, p0, Lnet/sf/scuba/data/TestCountry;->alpha2Code:Ljava/lang/String;

    .line 58
    iput-object p3, p0, Lnet/sf/scuba/data/TestCountry;->alpha3Code:Ljava/lang/String;

    .line 59
    iput-object p4, p0, Lnet/sf/scuba/data/TestCountry;->name:Ljava/lang/String;

    .line 60
    iput-object p5, p0, Lnet/sf/scuba/data/TestCountry;->nationality:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lnet/sf/scuba/data/TestCountry;
    .locals 1

    .line 64
    sget-object v0, Lnet/sf/scuba/data/TestCountry;->VALUES:[Lnet/sf/scuba/data/TestCountry;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-ne p1, p0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 105
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    .line 108
    :cond_2
    check-cast p1, Lnet/sf/scuba/data/TestCountry;

    .line 109
    iget-object v0, p0, Lnet/sf/scuba/data/TestCountry;->alpha3Code:Ljava/lang/String;

    iget-object p1, p1, Lnet/sf/scuba/data/TestCountry;->alpha3Code:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lnet/sf/scuba/data/TestCountry;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNationality()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lnet/sf/scuba/data/TestCountry;->nationality:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 114
    iget-object v0, p0, Lnet/sf/scuba/data/TestCountry;->alpha3Code:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public toAlpha2Code()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lnet/sf/scuba/data/TestCountry;->alpha2Code:Ljava/lang/String;

    return-object v0
.end method

.method public toAlpha3Code()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lnet/sf/scuba/data/TestCountry;->alpha3Code:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lnet/sf/scuba/data/TestCountry;->alpha2Code:Ljava/lang/String;

    return-object v0
.end method

.method public valueOf()I
    .locals 1

    .line 69
    iget v0, p0, Lnet/sf/scuba/data/TestCountry;->code:I

    return v0
.end method
