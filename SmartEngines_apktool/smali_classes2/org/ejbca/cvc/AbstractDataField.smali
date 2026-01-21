.class public abstract Lorg/ejbca/cvc/AbstractDataField;
.super Lorg/ejbca/cvc/CVCObject;
.source "AbstractDataField.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>(Lorg/ejbca/cvc/CVCTagEnum;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lorg/ejbca/cvc/CVCObject;-><init>(Lorg/ejbca/cvc/CVCTagEnum;)V

    return-void
.end method


# virtual methods
.method protected encode(Ljava/io/DataOutputStream;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 52
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->size()I

    move-result v0

    .line 53
    invoke-virtual {p0}, Lorg/ejbca/cvc/AbstractDataField;->getTag()Lorg/ejbca/cvc/CVCTagEnum;

    move-result-object v1

    invoke-virtual {v1}, Lorg/ejbca/cvc/CVCTagEnum;->getValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lorg/ejbca/cvc/AbstractDataField;->toByteArray(Ljava/lang/Integer;)[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->write([B)V

    .line 55
    invoke-virtual {p0}, Lorg/ejbca/cvc/AbstractDataField;->getEncoded()[B

    move-result-object v1

    .line 56
    array-length v2, v1

    .line 57
    invoke-static {v2}, Lorg/ejbca/cvc/AbstractDataField;->encodeLength(I)[B

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/DataOutputStream;->write([B)V

    .line 58
    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->write([B)V

    .line 59
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->size()I

    move-result p1

    sub-int/2addr p1, v0

    return p1
.end method

.method public getAsText(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    .line 68
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 70
    invoke-super {p0, p1, p2}, Lorg/ejbca/cvc/CVCObject;->getAsText(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object p1

    invoke-virtual {p0}, Lorg/ejbca/cvc/AbstractDataField;->valueAsText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected abstract getEncoded()[B
.end method

.method protected abstract valueAsText()Ljava/lang/String;
.end method
