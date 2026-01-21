.class public Lorg/jmrtd/lds/CVCAFile;
.super Lorg/jmrtd/lds/AbstractLDSFile;
.source "CVCAFile.java"


# static fields
.field public static final CAR_TAG:B = 0x42t

.field public static final LENGTH:I = 0x24

.field private static final serialVersionUID:J = -0xf47326895aadb87L


# instance fields
.field private altCAReference:Ljava/lang/String;

.field private caReference:Ljava/lang/String;

.field private fid:S


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x11c

    .line 62
    invoke-direct {p0, v0, p1}, Lorg/jmrtd/lds/CVCAFile;-><init>(SLjava/io/InputStream;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x11c

    .line 85
    invoke-direct {p0, v0, p1, p2}, Lorg/jmrtd/lds/CVCAFile;-><init>(SLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(SLjava/io/InputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 73
    invoke-direct {p0}, Lorg/jmrtd/lds/AbstractLDSFile;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lorg/jmrtd/lds/CVCAFile;->caReference:Ljava/lang/String;

    .line 52
    iput-object v0, p0, Lorg/jmrtd/lds/CVCAFile;->altCAReference:Ljava/lang/String;

    .line 74
    iput-short p1, p0, Lorg/jmrtd/lds/CVCAFile;->fid:S

    .line 75
    invoke-virtual {p0, p2}, Lorg/jmrtd/lds/CVCAFile;->readObject(Ljava/io/InputStream;)V

    return-void
.end method

.method public constructor <init>(SLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 113
    invoke-direct {p0, p1, p2, v0}, Lorg/jmrtd/lds/CVCAFile;-><init>(SLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(SLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 95
    invoke-direct {p0}, Lorg/jmrtd/lds/AbstractLDSFile;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lorg/jmrtd/lds/CVCAFile;->caReference:Ljava/lang/String;

    .line 52
    iput-object v0, p0, Lorg/jmrtd/lds/CVCAFile;->altCAReference:Ljava/lang/String;

    if-eqz p2, :cond_1

    .line 97
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-gt v0, v1, :cond_1

    if-eqz p3, :cond_0

    .line 98
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v0, v1, :cond_1

    .line 101
    :cond_0
    iput-short p1, p0, Lorg/jmrtd/lds/CVCAFile;->fid:S

    .line 102
    iput-object p2, p0, Lorg/jmrtd/lds/CVCAFile;->caReference:Ljava/lang/String;

    .line 103
    iput-object p3, p0, Lorg/jmrtd/lds/CVCAFile;->altCAReference:Ljava/lang/String;

    return-void

    .line 99
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 221
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return v0

    .line 225
    :cond_1
    check-cast p1, Lorg/jmrtd/lds/CVCAFile;

    .line 226
    iget-object v1, p0, Lorg/jmrtd/lds/CVCAFile;->caReference:Ljava/lang/String;

    iget-object v2, p1, Lorg/jmrtd/lds/CVCAFile;->caReference:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lorg/jmrtd/lds/CVCAFile;->altCAReference:Ljava/lang/String;

    if-nez v1, :cond_2

    iget-object v2, p1, Lorg/jmrtd/lds/CVCAFile;->altCAReference:Ljava/lang/String;

    if-eqz v2, :cond_3

    :cond_2
    if-eqz v1, :cond_4

    iget-object p1, p1, Lorg/jmrtd/lds/CVCAFile;->altCAReference:Ljava/lang/String;

    .line 228
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    return v0
.end method

.method public getAltCAReference()Lorg/jmrtd/cert/CVCPrincipal;
    .locals 2

    .line 193
    iget-object v0, p0, Lorg/jmrtd/lds/CVCAFile;->altCAReference:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Lorg/jmrtd/cert/CVCPrincipal;

    iget-object v1, p0, Lorg/jmrtd/lds/CVCAFile;->altCAReference:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/jmrtd/cert/CVCPrincipal;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public getCAReference()Lorg/jmrtd/cert/CVCPrincipal;
    .locals 2

    .line 183
    iget-object v0, p0, Lorg/jmrtd/lds/CVCAFile;->caReference:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Lorg/jmrtd/cert/CVCPrincipal;

    iget-object v1, p0, Lorg/jmrtd/lds/CVCAFile;->caReference:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/jmrtd/cert/CVCPrincipal;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic getEncoded()[B
    .locals 1

    .line 41
    invoke-super {p0}, Lorg/jmrtd/lds/AbstractLDSFile;->getEncoded()[B

    move-result-object v0

    return-object v0
.end method

.method public getFID()S
    .locals 1

    .line 122
    iget-short v0, p0, Lorg/jmrtd/lds/CVCAFile;->fid:S

    return v0
.end method

.method public getLength()I
    .locals 1

    const/16 v0, 0x24

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 238
    iget-object v0, p0, Lorg/jmrtd/lds/CVCAFile;->caReference:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0xb

    iget-object v1, p0, Lorg/jmrtd/lds/CVCAFile;->altCAReference:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 239
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0xd

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x5

    return v0
.end method

.method protected readObject(Ljava/io/InputStream;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 127
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 128
    invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I

    move-result p1

    const/16 v1, 0x42

    if-ne p1, v1, :cond_6

    .line 132
    invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I

    move-result p1

    .line 133
    const-string v2, "Wrong length"

    const/16 v3, 0x10

    if-gt p1, v3, :cond_5

    .line 136
    new-array p1, p1, [B

    .line 137
    invoke-virtual {v0, p1}, Ljava/io/DataInputStream;->readFully([B)V

    .line 138
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, p1}, Ljava/lang/String;-><init>([B)V

    iput-object v4, p0, Lorg/jmrtd/lds/CVCAFile;->caReference:Ljava/lang/String;

    .line 139
    invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I

    move-result p1

    const/4 v4, -0x1

    if-eqz p1, :cond_2

    if-eq p1, v4, :cond_2

    if-ne p1, v1, :cond_1

    .line 144
    invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I

    move-result p1

    if-gt p1, v3, :cond_0

    .line 148
    new-array p1, p1, [B

    .line 149
    invoke-virtual {v0, p1}, Ljava/io/DataInputStream;->readFully([B)V

    .line 150
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>([B)V

    iput-object v1, p0, Lorg/jmrtd/lds/CVCAFile;->altCAReference:Ljava/lang/String;

    .line 151
    invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I

    move-result p1

    goto :goto_0

    .line 146
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 142
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong tag"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    if-eq p1, v4, :cond_4

    if-nez p1, :cond_3

    .line 157
    invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I

    move-result p1

    goto :goto_0

    .line 155
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Bad file padding"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void

    .line 134
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 130
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Wrong tag, expected "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", found "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 203
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CA reference: \""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    iget-object v1, p0, Lorg/jmrtd/lds/CVCAFile;->caReference:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jmrtd/lds/CVCAFile;->altCAReference:Ljava/lang/String;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", Alternative CA reference: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/jmrtd/lds/CVCAFile;->altCAReference:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    .line 205
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 206
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected writeObject(Ljava/io/OutputStream;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x24

    .line 163
    new-array v0, v0, [B

    const/4 v1, 0x0

    const/16 v2, 0x42

    .line 164
    aput-byte v2, v0, v1

    .line 165
    iget-object v3, p0, Lorg/jmrtd/lds/CVCAFile;->caReference:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    int-to-byte v3, v3

    const/4 v4, 0x1

    aput-byte v3, v0, v4

    .line 166
    iget-object v3, p0, Lorg/jmrtd/lds/CVCAFile;->caReference:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    const/4 v5, 0x2

    aget-byte v6, v0, v4

    invoke-static {v3, v1, v0, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 167
    iget-object v3, p0, Lorg/jmrtd/lds/CVCAFile;->altCAReference:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 168
    aget-byte v4, v0, v4

    add-int/lit8 v5, v4, 0x2

    .line 169
    aput-byte v2, v0, v5

    add-int/lit8 v2, v4, 0x3

    .line 170
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    .line 171
    iget-object v3, p0, Lorg/jmrtd/lds/CVCAFile;->altCAReference:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    add-int/lit8 v4, v4, 0x4

    aget-byte v2, v0, v2

    invoke-static {v3, v1, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 174
    :cond_0
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method
