.class public Lorg/ejbca/cvc/DateField;
.super Lorg/ejbca/cvc/AbstractDataField;
.source "DateField.java"


# static fields
.field private static final DATE_ARRAY_SIZE:I = 0x6

.field private static final FORMAT_PRINTABLE:Ljava/text/DateFormat;

.field private static final GMTTIMEZONE:Ljava/util/TimeZone;

.field private static final serialVersionUID:J = 0x548e55e5131db956L


# instance fields
.field private date:Ljava/util/Date;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 36
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    sput-object v0, Lorg/ejbca/cvc/DateField;->GMTTIMEZONE:Ljava/util/TimeZone;

    .line 39
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyy-MM-dd"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    sput-object v1, Lorg/ejbca/cvc/DateField;->FORMAT_PRINTABLE:Ljava/text/DateFormat;

    .line 41
    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    return-void
.end method

.method constructor <init>(Lorg/ejbca/cvc/CVCTagEnum;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lorg/ejbca/cvc/AbstractDataField;-><init>(Lorg/ejbca/cvc/CVCTagEnum;)V

    return-void
.end method

.method constructor <init>(Lorg/ejbca/cvc/CVCTagEnum;Ljava/util/Date;)V
    .locals 2

    .line 57
    invoke-direct {p0, p1}, Lorg/ejbca/cvc/DateField;-><init>(Lorg/ejbca/cvc/CVCTagEnum;)V

    .line 59
    sget-object p1, Lorg/ejbca/cvc/DateField;->GMTTIMEZONE:Ljava/util/TimeZone;

    invoke-static {p1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object p1

    .line 60
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/4 p2, 0x1

    .line 63
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    move-result p2

    const/4 v0, 0x2

    .line 64
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x5

    .line 65
    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 66
    invoke-virtual {p1}, Ljava/util/Calendar;->clear()V

    .line 67
    invoke-virtual {p1, p2, v0, v1}, Ljava/util/Calendar;->set(III)V

    .line 68
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lorg/ejbca/cvc/DateField;->date:Ljava/util/Date;

    return-void
.end method

.method constructor <init>(Lorg/ejbca/cvc/CVCTagEnum;[B)V
    .locals 10

    .line 78
    invoke-direct {p0, p1}, Lorg/ejbca/cvc/DateField;-><init>(Lorg/ejbca/cvc/CVCTagEnum;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    .line 79
    array-length v1, p2

    const/4 v2, 0x6

    if-eq v1, v2, :cond_0

    goto :goto_1

    .line 82
    :cond_0
    aget-byte v0, p2, v0

    mul-int/lit8 v0, v0, 0xa

    add-int/lit16 v0, v0, 0x7d0

    const/4 v1, 0x1

    aget-byte v2, p2, v1

    add-int v4, v0, v2

    const/4 v0, 0x2

    .line 83
    aget-byte v0, p2, v0

    mul-int/lit8 v0, v0, 0xa

    const/4 v2, 0x3

    aget-byte v2, p2, v2

    add-int/2addr v0, v2

    add-int/lit8 v5, v0, -0x1

    const/4 v0, 0x4

    .line 85
    aget-byte v0, p2, v0

    mul-int/lit8 v0, v0, 0xa

    const/4 v1, 0x5

    aget-byte p2, p2, v1

    add-int v6, v0, p2

    .line 87
    sget-object p2, Lorg/ejbca/cvc/DateField;->GMTTIMEZONE:Ljava/util/TimeZone;

    invoke-static {p2}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v3

    .line 88
    invoke-virtual {v3}, Ljava/util/Calendar;->clear()V

    .line 89
    sget-object p2, Lorg/ejbca/cvc/CVCTagEnum;->EFFECTIVE_DATE:Lorg/ejbca/cvc/CVCTagEnum;

    if-ne p1, p2, :cond_1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 90
    invoke-virtual/range {v3 .. v9}, Ljava/util/Calendar;->set(IIIIII)V

    goto :goto_0

    :cond_1
    const/16 v8, 0x3b

    const/16 v9, 0x3b

    const/16 v7, 0x17

    .line 95
    invoke-virtual/range {v3 .. v9}, Ljava/util/Calendar;->set(IIIIII)V

    .line 97
    :goto_0
    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lorg/ejbca/cvc/DateField;->date:Ljava/util/Date;

    return-void

    .line 80
    :cond_2
    :goto_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "data argument must have length 6, was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez p2, :cond_3

    goto :goto_2

    :cond_3
    array-length v0, p2

    :goto_2
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getDate()Ljava/util/Date;
    .locals 1

    .line 106
    iget-object v0, p0, Lorg/ejbca/cvc/DateField;->date:Ljava/util/Date;

    return-object v0
.end method

.method protected getEncoded()[B
    .locals 11

    .line 119
    sget-object v0, Lorg/ejbca/cvc/DateField;->GMTTIMEZONE:Ljava/util/TimeZone;

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    .line 120
    iget-object v1, p0, Lorg/ejbca/cvc/DateField;->date:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/4 v1, 0x1

    .line 121
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v2

    add-int/lit16 v2, v2, -0x7d0

    const/4 v3, 0x2

    .line 123
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v4

    add-int/2addr v4, v1

    const/4 v5, 0x5

    .line 125
    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 126
    div-int/lit8 v6, v2, 0xa

    int-to-byte v6, v6

    .line 127
    rem-int/lit8 v2, v2, 0xa

    int-to-byte v2, v2

    .line 128
    div-int/lit8 v7, v4, 0xa

    int-to-byte v7, v7

    .line 129
    rem-int/lit8 v4, v4, 0xa

    int-to-byte v4, v4

    .line 130
    div-int/lit8 v8, v0, 0xa

    int-to-byte v8, v8

    .line 131
    rem-int/lit8 v0, v0, 0xa

    int-to-byte v0, v0

    const/4 v9, 0x6

    new-array v9, v9, [B

    const/4 v10, 0x0

    aput-byte v6, v9, v10

    aput-byte v2, v9, v1

    aput-byte v7, v9, v3

    const/4 v1, 0x3

    aput-byte v4, v9, v1

    const/4 v1, 0x4

    aput-byte v8, v9, v1

    aput-byte v0, v9, v5

    return-object v9
.end method

.method protected valueAsText()Ljava/lang/String;
    .locals 2

    .line 137
    sget-object v0, Lorg/ejbca/cvc/DateField;->FORMAT_PRINTABLE:Ljava/text/DateFormat;

    iget-object v1, p0, Lorg/ejbca/cvc/DateField;->date:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
