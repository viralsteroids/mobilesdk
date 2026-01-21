.class public abstract Lorg/ejbca/cvc/AbstractSequence;
.super Lorg/ejbca/cvc/CVCObject;
.source "AbstractSequence.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final allowedFields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/ejbca/cvc/CVCTagEnum;",
            ">;"
        }
    .end annotation
.end field

.field private final subfields:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/ejbca/cvc/CVCTagEnum;",
            "Lorg/ejbca/cvc/CVCObject;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lorg/ejbca/cvc/CVCTagEnum;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lorg/ejbca/cvc/CVCObject;-><init>(Lorg/ejbca/cvc/CVCTagEnum;)V

    .line 39
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lorg/ejbca/cvc/AbstractSequence;->subfields:Ljava/util/Map;

    .line 48
    invoke-virtual {p0}, Lorg/ejbca/cvc/AbstractSequence;->getAllowedFields()[Lorg/ejbca/cvc/CVCTagEnum;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/ejbca/cvc/AbstractSequence;->allowedFields:Ljava/util/List;

    return-void
.end method

.method private getOrderedSubfields()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/ejbca/cvc/CVCObject;",
            ">;"
        }
    .end annotation

    .line 195
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 196
    iget-object v1, p0, Lorg/ejbca/cvc/AbstractSequence;->allowedFields:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/ejbca/cvc/CVCTagEnum;

    .line 197
    iget-object v3, p0, Lorg/ejbca/cvc/AbstractSequence;->subfields:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/ejbca/cvc/CVCObject;

    if-eqz v2, :cond_0

    .line 200
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method addSubfield(Lorg/ejbca/cvc/CVCObject;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 58
    iget-object v0, p0, Lorg/ejbca/cvc/AbstractSequence;->allowedFields:Ljava/util/List;

    invoke-virtual {p1}, Lorg/ejbca/cvc/CVCObject;->getTag()Lorg/ejbca/cvc/CVCTagEnum;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "Field "

    if-eqz v0, :cond_1

    .line 59
    iget-object v0, p0, Lorg/ejbca/cvc/AbstractSequence;->subfields:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/ejbca/cvc/CVCObject;->getTag()Lorg/ejbca/cvc/CVCTagEnum;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    invoke-virtual {p1, p0}, Lorg/ejbca/cvc/CVCObject;->setParent(Lorg/ejbca/cvc/AbstractSequence;)V

    .line 64
    iget-object v0, p0, Lorg/ejbca/cvc/AbstractSequence;->subfields:Ljava/util/Map;

    invoke-virtual {p1}, Lorg/ejbca/cvc/CVCObject;->getTag()Lorg/ejbca/cvc/CVCTagEnum;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 60
    :cond_0
    new-instance v0, Lorg/ejbca/cvc/exception/ConstructionException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/ejbca/cvc/CVCObject;->getTag()Lorg/ejbca/cvc/CVCTagEnum;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " has already been added to "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/ejbca/cvc/exception/ConstructionException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 68
    :cond_1
    new-instance v0, Lorg/ejbca/cvc/exception/ConstructionException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/ejbca/cvc/CVCObject;->getTag()Lorg/ejbca/cvc/CVCTagEnum;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " not allowed in "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/ejbca/cvc/exception/ConstructionException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void
.end method

.method public encode(Ljava/io/DataOutputStream;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 121
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 122
    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 124
    invoke-virtual {p0}, Lorg/ejbca/cvc/AbstractSequence;->getEncodableFields()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/ejbca/cvc/CVCObject;

    .line 125
    invoke-virtual {v4, v1}, Lorg/ejbca/cvc/CVCObject;->encode(Ljava/io/DataOutputStream;)I

    move-result v4

    add-int/2addr v3, v4

    goto :goto_0

    .line 127
    :cond_0
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->close()V

    .line 129
    invoke-virtual {p0}, Lorg/ejbca/cvc/AbstractSequence;->getTag()Lorg/ejbca/cvc/CVCTagEnum;

    move-result-object v1

    invoke-virtual {v1}, Lorg/ejbca/cvc/CVCTagEnum;->getValue()I

    move-result v1

    .line 130
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->size()I

    move-result v2

    .line 131
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lorg/ejbca/cvc/AbstractSequence;->toByteArray(Ljava/lang/Integer;)[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->write([B)V

    .line 132
    invoke-static {v3}, Lorg/ejbca/cvc/AbstractSequence;->encodeLength(I)[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->write([B)V

    .line 133
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 135
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->size()I

    move-result p1

    sub-int/2addr p1, v2

    return p1
.end method

.method protected abstract getAllowedFields()[Lorg/ejbca/cvc/CVCTagEnum;
.end method

.method public getAsText(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 176
    invoke-virtual {p0, p1, v0}, Lorg/ejbca/cvc/AbstractSequence;->getAsText(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsText(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 5

    .line 183
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 184
    invoke-super {p0, p1, p2}, Lorg/ejbca/cvc/CVCObject;->getAsText(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 185
    invoke-direct {p0}, Lorg/ejbca/cvc/AbstractSequence;->getOrderedSubfields()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/ejbca/cvc/CVCObject;

    .line 186
    sget-object v3, Lorg/ejbca/cvc/AbstractSequence;->NEWLINE:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 187
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "   "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, p2}, Lorg/ejbca/cvc/CVCObject;->getAsText(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 189
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getDEREncoded()[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 156
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 157
    :try_start_1
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 160
    invoke-virtual {p0, v0}, Lorg/ejbca/cvc/AbstractSequence;->encode(Ljava/io/DataOutputStream;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 167
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v1

    move-object v2, v1

    move-object v1, v0

    move-object v0, v2

    :goto_0
    if-eqz v1, :cond_0

    .line 165
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    :cond_0
    throw v0
.end method

.method protected getEncodableFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/ejbca/cvc/CVCObject;",
            ">;"
        }
    .end annotation

    .line 144
    invoke-direct {p0}, Lorg/ejbca/cvc/AbstractSequence;->getOrderedSubfields()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method getOptionalSubfield(Lorg/ejbca/cvc/CVCTagEnum;)Lorg/ejbca/cvc/CVCObject;
    .locals 1

    .line 104
    iget-object v0, p0, Lorg/ejbca/cvc/AbstractSequence;->subfields:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/ejbca/cvc/CVCObject;

    return-object p1
.end method

.method getSubfield(Lorg/ejbca/cvc/CVCTagEnum;)Lorg/ejbca/cvc/CVCObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;
        }
    .end annotation

    .line 89
    iget-object v0, p0, Lorg/ejbca/cvc/AbstractSequence;->subfields:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/ejbca/cvc/CVCObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 91
    :cond_0
    new-instance v0, Ljava/lang/NoSuchFieldException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not find subfield "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected getSubfields()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lorg/ejbca/cvc/CVCObject;",
            ">;"
        }
    .end annotation

    .line 112
    iget-object v0, p0, Lorg/ejbca/cvc/AbstractSequence;->subfields:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
