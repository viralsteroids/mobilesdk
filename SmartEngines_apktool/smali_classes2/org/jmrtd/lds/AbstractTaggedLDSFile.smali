.class public abstract Lorg/jmrtd/lds/AbstractTaggedLDSFile;
.super Lorg/jmrtd/lds/AbstractLDSFile;
.source "AbstractTaggedLDSFile.java"


# static fields
.field private static final LOGGER:Ljava/util/logging/Logger;

.field private static final serialVersionUID:J = -0x4213c07dbe126c47L


# instance fields
.field private length:I

.field private tag:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    const-string v0, "org.jmrtd"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->LOGGER:Ljava/util/logging/Logger;

    return-void
.end method

.method protected constructor <init>(I)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lorg/jmrtd/lds/AbstractLDSFile;-><init>()V

    .line 58
    iput p1, p0, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->tag:I

    return-void
.end method

.method protected constructor <init>(ILjava/io/InputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 70
    invoke-direct {p0}, Lorg/jmrtd/lds/AbstractLDSFile;-><init>()V

    .line 71
    iput p1, p0, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->tag:I

    .line 72
    invoke-virtual {p0, p2}, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->readObject(Ljava/io/InputStream;)V

    return-void
.end method

.method private getContent()[B
    .locals 5

    .line 169
    const-string v0, "Error closing stream"

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 171
    :try_start_0
    invoke-virtual {p0, v1}, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->writeContent(Ljava/io/OutputStream;)V

    .line 172
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->flush()V

    .line 173
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    :try_start_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v2

    :catch_0
    move-exception v1

    .line 180
    sget-object v3, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->LOGGER:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v3, v4, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v2

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    .line 175
    :try_start_2
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "Could not get DG content"

    invoke-direct {v3, v4, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 178
    :goto_0
    :try_start_3
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :catch_2
    move-exception v1

    .line 180
    sget-object v3, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->LOGGER:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v3, v4, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 182
    :goto_1
    throw v2
.end method


# virtual methods
.method public bridge synthetic getEncoded()[B
    .locals 1

    .line 42
    invoke-super {p0}, Lorg/jmrtd/lds/AbstractLDSFile;->getEncoded()[B

    move-result-object v0

    return-object v0
.end method

.method public getLength()I
    .locals 1

    .line 157
    iget v0, p0, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->length:I

    if-gtz v0, :cond_0

    .line 158
    invoke-direct {p0}, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->getContent()[B

    move-result-object v0

    array-length v0, v0

    iput v0, p0, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->length:I

    .line 160
    :cond_0
    iget v0, p0, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->length:I

    return v0
.end method

.method public getTag()I
    .locals 1

    .line 148
    iget v0, p0, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->tag:I

    return v0
.end method

.method protected abstract readContent(Ljava/io/InputStream;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method protected readObject(Ljava/io/InputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 84
    instance-of v0, p1, Lnet/sf/scuba/tlv/TLVInputStream;

    if-eqz v0, :cond_0

    check-cast p1, Lnet/sf/scuba/tlv/TLVInputStream;

    goto :goto_0

    :cond_0
    new-instance v0, Lnet/sf/scuba/tlv/TLVInputStream;

    invoke-direct {v0, p1}, Lnet/sf/scuba/tlv/TLVInputStream;-><init>(Ljava/io/InputStream;)V

    move-object p1, v0

    .line 85
    :goto_0
    invoke-virtual {p1}, Lnet/sf/scuba/tlv/TLVInputStream;->readTag()I

    move-result v0

    .line 86
    iget v1, p0, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->tag:I

    if-ne v0, v1, :cond_1

    .line 89
    invoke-virtual {p1}, Lnet/sf/scuba/tlv/TLVInputStream;->readLength()I

    move-result v0

    iput v0, p0, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->length:I

    .line 90
    invoke-virtual {p0, p1}, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->readContent(Ljava/io/InputStream;)V

    return-void

    .line 87
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Was expecting tag "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->tag:I

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", found "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 139
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TaggedLDSFile ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->getTag()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->getLength()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected abstract writeContent(Ljava/io/OutputStream;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method protected writeObject(Ljava/io/OutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 96
    instance-of v0, p1, Lnet/sf/scuba/tlv/TLVOutputStream;

    if-eqz v0, :cond_0

    check-cast p1, Lnet/sf/scuba/tlv/TLVOutputStream;

    goto :goto_0

    :cond_0
    new-instance v0, Lnet/sf/scuba/tlv/TLVOutputStream;

    invoke-direct {v0, p1}, Lnet/sf/scuba/tlv/TLVOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object p1, v0

    .line 97
    :goto_0
    invoke-virtual {p0}, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->getTag()I

    move-result v0

    .line 98
    iget v1, p0, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->tag:I

    if-eq v1, v0, :cond_1

    .line 99
    iput v0, p0, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->tag:I

    .line 101
    :cond_1
    invoke-virtual {p1, v0}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeTag(I)V

    .line 102
    invoke-direct {p0}, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->getContent()[B

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    .line 103
    :cond_2
    array-length v1, v0

    .line 104
    :goto_1
    iget v2, p0, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->length:I

    if-eq v2, v1, :cond_3

    .line 105
    iput v1, p0, Lorg/jmrtd/lds/AbstractTaggedLDSFile;->length:I

    .line 107
    :cond_3
    invoke-virtual {p1, v0}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeValue([B)V

    return-void
.end method
