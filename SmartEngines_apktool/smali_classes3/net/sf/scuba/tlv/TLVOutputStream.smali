.class public Lnet/sf/scuba/tlv/TLVOutputStream;
.super Ljava/io/OutputStream;
.source "TLVOutputStream.java"


# instance fields
.field private outputStream:Ljava/io/DataOutputStream;

.field private state:Lnet/sf/scuba/tlv/TLVOutputState;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 47
    instance-of v0, p1, Ljava/io/DataOutputStream;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/io/DataOutputStream;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-direct {v0, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->outputStream:Ljava/io/DataOutputStream;

    .line 48
    new-instance p1, Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-direct {p1}, Lnet/sf/scuba/tlv/TLVOutputState;-><init>()V

    iput-object p1, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 203
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState;->canBeWritten()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->outputStream:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V

    return-void

    .line 204
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot close stream yet, illegal TLV state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 192
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->outputStream:Ljava/io/DataOutputStream;

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    return-void
.end method

.method public write(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    int-to-byte p1, p1

    const/4 v0, 0x1

    .line 118
    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte p1, v1, v2

    invoke-virtual {p0, v1, v2, v0}, Lnet/sf/scuba/tlv/TLVOutputStream;->write([BII)V

    return-void
.end method

.method public write([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 132
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lnet/sf/scuba/tlv/TLVOutputStream;->write([BII)V

    return-void
.end method

.method public write([BII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 149
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfTag()Z

    move-result v0

    if-nez v0, :cond_2

    .line 152
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfLength()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState;->setDummyLengthProcessed()V

    .line 155
    :cond_0
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v0, p1, p2, p3}, Lnet/sf/scuba/tlv/TLVOutputState;->updateValueBytesProcessed([BII)V

    .line 156
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState;->canBeWritten()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 157
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->outputStream:Ljava/io/DataOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/DataOutputStream;->write([BII)V

    :cond_1
    return-void

    .line 150
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot write value bytes yet. Need to write a tag first."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public writeLength(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 74
    invoke-static {p1}, Lnet/sf/scuba/tlv/TLVUtil;->getLengthAsBytes(I)[B

    move-result-object v0

    .line 75
    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v1, p1}, Lnet/sf/scuba/tlv/TLVOutputState;->setLengthProcessed(I)V

    .line 76
    iget-object p1, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {p1}, Lnet/sf/scuba/tlv/TLVOutputState;->canBeWritten()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 77
    iget-object p1, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->outputStream:Ljava/io/DataOutputStream;

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->write([B)V

    :cond_0
    return-void
.end method

.method public writeTag(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 59
    invoke-static {p1}, Lnet/sf/scuba/tlv/TLVUtil;->getTagAsBytes(I)[B

    move-result-object v0

    .line 60
    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v1}, Lnet/sf/scuba/tlv/TLVOutputState;->canBeWritten()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 61
    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->outputStream:Ljava/io/DataOutputStream;

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 63
    :cond_0
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v0, p1}, Lnet/sf/scuba/tlv/TLVOutputState;->setTagProcessed(I)V

    return-void
.end method

.method public writeValue([B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 95
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfTag()Z

    move-result v0

    if-nez v0, :cond_1

    .line 98
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfLength()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    array-length v0, p1

    invoke-virtual {p0, v0}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeLength(I)V

    .line 100
    invoke-virtual {p0, p1}, Lnet/sf/scuba/tlv/TLVOutputStream;->write([B)V

    return-void

    .line 102
    :cond_0
    invoke-virtual {p0, p1}, Lnet/sf/scuba/tlv/TLVOutputStream;->write([B)V

    .line 103
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    array-length p1, p1

    invoke-virtual {v0, p1}, Lnet/sf/scuba/tlv/TLVOutputState;->updatePreviousLength(I)V

    return-void

    .line 96
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot write value bytes yet. Need to write a tag first."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 93
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot write null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public writeValueEnd()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 168
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfLength()Z

    move-result v0

    if-nez v0, :cond_2

    .line 171
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfTag()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState;->isDummyLengthSet()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 174
    :cond_0
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState;->getValue()[B

    move-result-object v0

    .line 175
    array-length v1, v0

    .line 176
    iget-object v2, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v2, v1}, Lnet/sf/scuba/tlv/TLVOutputState;->updatePreviousLength(I)V

    .line 177
    iget-object v2, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->state:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-virtual {v2}, Lnet/sf/scuba/tlv/TLVOutputState;->canBeWritten()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 178
    invoke-static {v1}, Lnet/sf/scuba/tlv/TLVUtil;->getLengthAsBytes(I)[B

    move-result-object v1

    .line 179
    iget-object v2, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->outputStream:Ljava/io/DataOutputStream;

    invoke-virtual {v2, v1}, Ljava/io/DataOutputStream;->write([B)V

    .line 180
    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVOutputStream;->outputStream:Ljava/io/DataOutputStream;

    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->write([B)V

    :cond_1
    :goto_0
    return-void

    .line 169
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not processing value yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
