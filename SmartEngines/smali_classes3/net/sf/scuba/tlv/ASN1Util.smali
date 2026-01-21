.class Lnet/sf/scuba/tlv/ASN1Util;
.super Ljava/lang/Object;
.source "ASN1Util.java"

# interfaces
.implements Lnet/sf/scuba/tlv/ASN1Constants;


# static fields
.field private static final LOGGER:Ljava/util/logging/Logger;

.field private static final SDF:Ljava/lang/String; = "yyMMddhhmmss\'Z\'"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const-string v0, "net.sf.scuba"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lnet/sf/scuba/tlv/ASN1Util;->LOGGER:Ljava/util/logging/Logger;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static interpretPrimitiveValue(I[B)Ljava/lang/Object;
    .locals 3

    .line 50
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string/jumbo v1, "yyMMddhhmmss\'Z\'"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 51
    invoke-static {p0}, Lnet/sf/scuba/tlv/TLVUtil;->getTagClass(I)I

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0xc

    if-eq p0, v1, :cond_2

    const/16 v1, 0x1e

    if-eq p0, v1, :cond_2

    const/16 v1, 0x13

    if-eq p0, v1, :cond_2

    const/16 v1, 0x14

    if-eq p0, v1, :cond_2

    const/16 v1, 0x16

    if-eq p0, v1, :cond_2

    const/16 v1, 0x17

    if-eq p0, v1, :cond_1

    packed-switch p0, :pswitch_data_0

    :goto_0
    return-object p1

    .line 73
    :cond_1
    :try_start_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 75
    sget-object v0, Lnet/sf/scuba/tlv/ASN1Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "Parse exception parsing UTC time"

    invoke-virtual {v0, v1, v2, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p1

    .line 70
    :cond_2
    :pswitch_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([B)V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method static tagToString(I)Ljava/lang/String;
    .locals 4

    .line 84
    invoke-static {p0}, Lnet/sf/scuba/tlv/TLVUtil;->getTagClass(I)I

    move-result v0

    const-string v1, "\'"

    const-string v2, "\'0x"

    if-eqz v0, :cond_0

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lnet/sf/scuba/util/Hex;->intToHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 87
    :cond_0
    invoke-static {p0}, Lnet/sf/scuba/tlv/TLVUtil;->isPrimitive(I)Z

    move-result v0

    if-eqz v0, :cond_6

    and-int/lit8 v0, p0, 0x1f

    const/16 v3, 0x9

    if-eq v0, v3, :cond_5

    const/16 v3, 0xc

    if-eq v0, v3, :cond_4

    const/16 v3, 0x1e

    if-eq v0, v3, :cond_3

    const/16 v3, 0x13

    if-eq v0, v3, :cond_2

    const/16 v3, 0x14

    if-eq v0, v3, :cond_1

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    goto :goto_0

    .line 116
    :pswitch_0
    const-string p0, "UNIVERSAL_STRING"

    return-object p0

    .line 114
    :pswitch_1
    const-string p0, "GENERAL_STRING"

    return-object p0

    .line 112
    :pswitch_2
    const-string p0, "VISIBLE_STRING"

    return-object p0

    .line 122
    :pswitch_3
    const-string p0, "GENERAL_TIME"

    return-object p0

    .line 120
    :pswitch_4
    const-string p0, "UTC_TIME"

    return-object p0

    .line 110
    :pswitch_5
    const-string p0, "IA5_STRING"

    return-object p0

    .line 100
    :pswitch_6
    const-string p0, "OBJECT_IDENTIFIER"

    return-object p0

    .line 98
    :pswitch_7
    const-string p0, "NULL"

    return-object p0

    .line 96
    :pswitch_8
    const-string p0, "OCTET_STRING"

    return-object p0

    .line 94
    :pswitch_9
    const-string p0, "BIT_STRING"

    return-object p0

    .line 92
    :pswitch_a
    const-string p0, "INTEGER"

    return-object p0

    .line 90
    :pswitch_b
    const-string p0, "BOOLEAN"

    return-object p0

    .line 108
    :cond_1
    const-string p0, "T61_STRING"

    return-object p0

    .line 106
    :cond_2
    const-string p0, "PRINTABLE_STRING"

    return-object p0

    .line 118
    :cond_3
    const-string p0, "BMP_STRING"

    return-object p0

    .line 104
    :cond_4
    const-string p0, "UTF_STRING"

    return-object p0

    .line 102
    :cond_5
    const-string p0, "REAL"

    return-object p0

    :cond_6
    and-int/lit8 v0, p0, 0x1f

    const/16 v3, 0xa

    if-eq v0, v3, :cond_9

    const/16 v3, 0x10

    if-eq v0, v3, :cond_8

    const/16 v3, 0x11

    if-eq v0, v3, :cond_7

    .line 135
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lnet/sf/scuba/util/Hex;->intToHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 131
    :cond_7
    const-string p0, "SET"

    return-object p0

    .line 129
    :cond_8
    const-string p0, "SEQUENCE"

    return-object p0

    .line 127
    :cond_9
    const-string p0, "ENUMERATED"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x16
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1a
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
