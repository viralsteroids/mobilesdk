.class Lnet/sf/scuba/tlv/TLVInputState;
.super Ljava/lang/Object;
.source "TLVInputState.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/sf/scuba/tlv/TLVInputState$TLStruct;
    }
.end annotation


# instance fields
.field private isAtStartOfLength:Z

.field private isAtStartOfTag:Z

.field private isReadingValue:Z

.field private state:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lnet/sf/scuba/tlv/TLVInputState$TLStruct;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 54
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2, v2}, Lnet/sf/scuba/tlv/TLVInputState;-><init>(Ljava/util/Deque;ZZZ)V

    return-void
.end method

.method private constructor <init>(Ljava/util/Deque;ZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Deque<",
            "Lnet/sf/scuba/tlv/TLVInputState$TLStruct;",
            ">;ZZZ)V"
        }
    .end annotation

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    .line 63
    iput-boolean p2, p0, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfTag:Z

    .line 64
    iput-boolean p3, p0, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfLength:Z

    .line 65
    iput-boolean p4, p0, Lnet/sf/scuba/tlv/TLVInputState;->isReadingValue:Z

    return-void
.end method

.method public constructor <init>(Lnet/sf/scuba/tlv/TLVInputState;)V
    .locals 3

    .line 58
    invoke-direct {p1}, Lnet/sf/scuba/tlv/TLVInputState;->getDeepCopyOfState()Ljava/util/Deque;

    move-result-object v0

    iget-boolean v1, p1, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfTag:Z

    iget-boolean v2, p1, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfLength:Z

    iget-boolean p1, p1, Lnet/sf/scuba/tlv/TLVInputState;->isReadingValue:Z

    invoke-direct {p0, v0, v1, v2, p1}, Lnet/sf/scuba/tlv/TLVInputState;-><init>(Ljava/util/Deque;ZZZ)V

    return-void
.end method

.method private getDeepCopyOfState()Ljava/util/Deque;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Deque<",
            "Lnet/sf/scuba/tlv/TLVInputState$TLStruct;",
            ">;"
        }
    .end annotation

    .line 177
    new-instance v0, Ljava/util/ArrayDeque;

    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 178
    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;

    .line 179
    new-instance v3, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;

    invoke-direct {v3, p0, v2}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;-><init>(Lnet/sf/scuba/tlv/TLVInputState;Lnet/sf/scuba/tlv/TLVInputState$TLStruct;)V

    invoke-interface {v0, v3}, Ljava/util/Deque;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public getLength()I
    .locals 2

    .line 89
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 92
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;

    .line 93
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;->getLength()I

    move-result v0

    return v0

    .line 90
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Length not yet known."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getTag()I
    .locals 2

    .line 81
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 84
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;

    .line 85
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;->getTag()I

    move-result v0

    return v0

    .line 82
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Tag not yet read."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getValueBytesLeft()I
    .locals 2

    .line 102
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;

    .line 106
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;->getLength()I

    move-result v1

    .line 107
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;->getValueBytesProcessed()I

    move-result v0

    sub-int/2addr v1, v0

    return v1

    .line 103
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Length of value is unknown."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getValueBytesProcessed()I
    .locals 1

    .line 97
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;

    .line 98
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;->getValueBytesProcessed()I

    move-result v0

    return v0
.end method

.method public isAtStartOfLength()Z
    .locals 1

    .line 73
    iget-boolean v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfLength:Z

    return v0
.end method

.method public isAtStartOfTag()Z
    .locals 1

    .line 69
    iget-boolean v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfTag:Z

    return v0
.end method

.method public isProcessingValue()Z
    .locals 1

    .line 77
    iget-boolean v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->isReadingValue:Z

    return v0
.end method

.method public setDummyLengthProcessed()V
    .locals 1

    const/4 v0, 0x0

    .line 125
    iput-boolean v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfTag:Z

    .line 126
    iput-boolean v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfLength:Z

    const/4 v0, 0x1

    .line 127
    iput-boolean v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->isReadingValue:Z

    return-void
.end method

.method public setLengthProcessed(II)V
    .locals 2

    if-ltz p1, :cond_1

    .line 134
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;

    .line 135
    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 136
    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;

    .line 137
    invoke-virtual {v1, p2}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;->updateValueBytesProcessed(I)V

    .line 139
    :cond_0
    invoke-virtual {v0, p1}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;->setLength(I)V

    .line 140
    iget-object p1, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {p1, v0}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 141
    iput-boolean p1, p0, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfTag:Z

    .line 142
    iput-boolean p1, p0, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfLength:Z

    const/4 p1, 0x1

    .line 143
    iput-boolean p1, p0, Lnet/sf/scuba/tlv/TLVInputState;->isReadingValue:Z

    return-void

    .line 132
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot set negative length (length = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", 0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, " for tag "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lnet/sf/scuba/tlv/TLVInputState;->getTag()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, ")."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public setTagProcessed(II)V
    .locals 1

    .line 113
    new-instance v0, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;

    invoke-direct {v0, p0, p1}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;-><init>(Lnet/sf/scuba/tlv/TLVInputState;I)V

    .line 114
    iget-object p1, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Deque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 115
    iget-object p1, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;

    .line 116
    invoke-virtual {p1, p2}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;->updateValueBytesProcessed(I)V

    .line 118
    :cond_0
    iget-object p1, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {p1, v0}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 119
    iput-boolean p1, p0, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfTag:Z

    const/4 p2, 0x1

    .line 120
    iput-boolean p2, p0, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfLength:Z

    .line 121
    iput-boolean p1, p0, Lnet/sf/scuba/tlv/TLVInputState;->isReadingValue:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 173
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public updateValueBytesProcessed(I)V
    .locals 5

    .line 147
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 150
    :cond_0
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;

    .line 151
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;->getLength()I

    move-result v1

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;->getValueBytesProcessed()I

    move-result v2

    sub-int/2addr v1, v2

    if-gt p1, v1, :cond_2

    .line 155
    invoke-virtual {v0, p1}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;->updateValueBytesProcessed(I)V

    .line 156
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;->getLength()I

    move-result p1

    .line 157
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVInputState$TLStruct;->getValueBytesProcessed()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, p1, :cond_1

    .line 158
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVInputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 160
    invoke-virtual {p0, p1}, Lnet/sf/scuba/tlv/TLVInputState;->updateValueBytesProcessed(I)V

    .line 161
    iput-boolean v1, p0, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfTag:Z

    .line 162
    iput-boolean v2, p0, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfLength:Z

    .line 163
    iput-boolean v2, p0, Lnet/sf/scuba/tlv/TLVInputState;->isReadingValue:Z

    return-void

    .line 165
    :cond_1
    iput-boolean v2, p0, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfTag:Z

    .line 166
    iput-boolean v2, p0, Lnet/sf/scuba/tlv/TLVInputState;->isAtStartOfLength:Z

    .line 167
    iput-boolean v1, p0, Lnet/sf/scuba/tlv/TLVInputState;->isReadingValue:Z

    return-void

    .line 153
    :cond_2
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Cannot process "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v3, " bytes! Only "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " bytes left in this TLV object "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
