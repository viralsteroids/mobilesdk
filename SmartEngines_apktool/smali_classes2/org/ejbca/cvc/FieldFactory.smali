.class public Lorg/ejbca/cvc/FieldFactory;
.super Ljava/lang/Object;
.source "FieldFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static decodeField(Lorg/ejbca/cvc/CVCTagEnum;[B)Lorg/ejbca/cvc/AbstractDataField;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 36
    invoke-virtual {p0}, Lorg/ejbca/cvc/CVCTagEnum;->isSequence()Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    sget-object v0, Lorg/ejbca/cvc/FieldFactory$1;->$SwitchMap$org$ejbca$cvc$CVCTagEnum:[I

    invoke-virtual {p0}, Lorg/ejbca/cvc/CVCTagEnum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 50
    new-instance v0, Lorg/ejbca/cvc/ByteField;

    invoke-direct {v0, p0, p1}, Lorg/ejbca/cvc/ByteField;-><init>(Lorg/ejbca/cvc/CVCTagEnum;[B)V

    return-object v0

    .line 49
    :pswitch_0
    new-instance v0, Lorg/ejbca/cvc/IntegerField;

    invoke-direct {v0, p0, p1}, Lorg/ejbca/cvc/IntegerField;-><init>(Lorg/ejbca/cvc/CVCTagEnum;[B)V

    return-object v0

    .line 48
    :pswitch_1
    new-instance v0, Lorg/ejbca/cvc/IntegerField;

    invoke-direct {v0, p0, p1}, Lorg/ejbca/cvc/IntegerField;-><init>(Lorg/ejbca/cvc/CVCTagEnum;[B)V

    return-object v0

    .line 47
    :pswitch_2
    new-instance p0, Lorg/ejbca/cvc/AuthorizationField;

    invoke-direct {p0, p1}, Lorg/ejbca/cvc/AuthorizationField;-><init>([B)V

    return-object p0

    .line 46
    :pswitch_3
    new-instance p0, Lorg/ejbca/cvc/OIDField;

    invoke-direct {p0, p1}, Lorg/ejbca/cvc/OIDField;-><init>([B)V

    return-object p0

    .line 45
    :pswitch_4
    new-instance p0, Lorg/ejbca/cvc/HolderReferenceField;

    invoke-direct {p0, p1}, Lorg/ejbca/cvc/HolderReferenceField;-><init>([B)V

    return-object p0

    .line 44
    :pswitch_5
    new-instance p0, Lorg/ejbca/cvc/CAReferenceField;

    invoke-direct {p0, p1}, Lorg/ejbca/cvc/CAReferenceField;-><init>([B)V

    return-object p0

    .line 43
    :pswitch_6
    new-instance v0, Lorg/ejbca/cvc/DateField;

    invoke-direct {v0, p0, p1}, Lorg/ejbca/cvc/DateField;-><init>(Lorg/ejbca/cvc/CVCTagEnum;[B)V

    return-object v0

    .line 42
    :pswitch_7
    new-instance v0, Lorg/ejbca/cvc/DateField;

    invoke-direct {v0, p0, p1}, Lorg/ejbca/cvc/DateField;-><init>(Lorg/ejbca/cvc/CVCTagEnum;[B)V

    return-object v0

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Tag "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, " is a sequence"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
