.class Lnet/sf/scuba/tlv/TLVOutputState;
.super Ljava/lang/Object;
.source "TLVOutputState.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;
    }
.end annotation


# static fields
.field private static final LOGGER:Ljava/util/logging/Logger;


# instance fields
.field private isAtStartOfLength:Z

.field private isAtStartOfTag:Z

.field private isReadingValue:Z

.field private state:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const-string v0, "net.sf.scuba"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lnet/sf/scuba/tlv/TLVOutputState;->LOGGER:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 66
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2, v2}, Lnet/sf/scuba/tlv/TLVOutputState;-><init>(Ljava/util/Deque;ZZZ)V

    return-void
.end method

.method private constructor <init>(Ljava/util/Deque;ZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Deque<",
            "Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;",
            ">;ZZZ)V"
        }
    .end annotation

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    .line 75
    iput-boolean p2, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfTag:Z

    .line 76
    iput-boolean p3, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfLength:Z

    .line 77
    iput-boolean p4, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isReadingValue:Z

    return-void
.end method

.method public constructor <init>(Lnet/sf/scuba/tlv/TLVOutputState;)V
    .locals 3

    .line 70
    invoke-direct {p1}, Lnet/sf/scuba/tlv/TLVOutputState;->getDeepCopyOfState()Ljava/util/Deque;

    move-result-object v0

    iget-boolean v1, p1, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfTag:Z

    iget-boolean v2, p1, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfLength:Z

    iget-boolean p1, p1, Lnet/sf/scuba/tlv/TLVOutputState;->isReadingValue:Z

    invoke-direct {p0, v0, v1, v2, p1}, Lnet/sf/scuba/tlv/TLVOutputState;-><init>(Ljava/util/Deque;ZZZ)V

    return-void
.end method

.method static synthetic access$100()Ljava/util/logging/Logger;
    .locals 1

    .line 43
    sget-object v0, Lnet/sf/scuba/tlv/TLVOutputState;->LOGGER:Ljava/util/logging/Logger;

    return-object v0
.end method

.method private getDeepCopyOfState()Ljava/util/Deque;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Deque<",
            "Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;",
            ">;"
        }
    .end annotation

    .line 251
    new-instance v0, Ljava/util/ArrayDeque;

    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 252
    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    .line 253
    new-instance v3, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    invoke-direct {v3, p0, v2}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;-><init>(Lnet/sf/scuba/tlv/TLVOutputState;Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;)V

    invoke-interface {v0, v3}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public canBeWritten()Z
    .locals 2

    .line 242
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    .line 243
    invoke-virtual {v1}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->isLengthSet()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public getLength()I
    .locals 2

    .line 101
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 104
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    .line 105
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getLength()I

    move-result v0

    if-ltz v0, :cond_0

    return v0

    .line 107
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Length not yet knwon."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 102
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Length not yet known."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getTag()I
    .locals 2

    .line 93
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    .line 97
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getTag()I

    move-result v0

    return v0

    .line 94
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Tag not yet read."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getValue()[B
    .locals 2

    .line 227
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 230
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getValue()[B

    move-result-object v0

    return-object v0

    .line 228
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot get value yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getValueBytesLeft()I
    .locals 2

    .line 118
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 121
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    .line 122
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getLength()I

    move-result v1

    .line 123
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getValueBytesProcessed()I

    move-result v0

    sub-int/2addr v1, v0

    return v1

    .line 119
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Length of value is unknown."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getValueBytesProcessed()I
    .locals 1

    .line 113
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    .line 114
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getValueBytesProcessed()I

    move-result v0

    return v0
.end method

.method public isAtStartOfLength()Z
    .locals 1

    .line 85
    iget-boolean v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfLength:Z

    return v0
.end method

.method public isAtStartOfTag()Z
    .locals 1

    .line 81
    iget-boolean v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfTag:Z

    return v0
.end method

.method public isDummyLengthSet()Z
    .locals 1

    .line 152
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 155
    :cond_0
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->isLengthSet()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isProcessingValue()Z
    .locals 1

    .line 89
    iget-boolean v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isReadingValue:Z

    return v0
.end method

.method public setDummyLengthProcessed()V
    .locals 1

    const/4 v0, 0x0

    .line 145
    iput-boolean v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfTag:Z

    .line 146
    iput-boolean v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfLength:Z

    const/4 v0, 0x1

    .line 147
    iput-boolean v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isReadingValue:Z

    return-void
.end method

.method public setLengthProcessed(I)V
    .locals 5

    if-ltz p1, :cond_1

    .line 162
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    .line 163
    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 164
    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    .line 165
    invoke-static {p1}, Lnet/sf/scuba/tlv/TLVUtil;->getLengthAsBytes(I)[B

    move-result-object v3

    .line 166
    array-length v4, v3

    invoke-virtual {v1, v3, v2, v4}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->write([BII)V

    .line 168
    :cond_0
    invoke-virtual {v0, p1}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->setLength(I)V

    .line 169
    iget-object p1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {p1, v0}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 170
    iput-boolean v2, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfTag:Z

    .line 171
    iput-boolean v2, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfLength:Z

    const/4 p1, 0x1

    .line 172
    iput-boolean p1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isReadingValue:Z

    return-void

    .line 160
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot set negative length (length = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, ")."

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setTagProcessed(I)V
    .locals 4

    .line 129
    new-instance v0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    invoke-direct {v0, p0, p1}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;-><init>(Lnet/sf/scuba/tlv/TLVOutputState;I)V

    .line 130
    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 131
    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    .line 132
    invoke-static {p1}, Lnet/sf/scuba/tlv/TLVUtil;->getTagAsBytes(I)[B

    move-result-object p1

    .line 133
    array-length v3, p1

    invoke-virtual {v1, p1, v2, v3}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->write([BII)V

    .line 135
    :cond_0
    iget-object p1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {p1, v0}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 136
    iput-boolean v2, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfTag:Z

    const/4 p1, 0x1

    .line 137
    iput-boolean p1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfLength:Z

    .line 138
    iput-boolean v2, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isReadingValue:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 235
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public updatePreviousLength(I)V
    .locals 3

    .line 176
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 179
    :cond_0
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    .line 181
    invoke-static {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->access$000(Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getLength()I

    move-result v1

    if-ne v1, p1, :cond_1

    goto :goto_0

    .line 185
    :cond_1
    invoke-virtual {v0, p1}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->setLength(I)V

    .line 187
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getValueBytesProcessed()I

    move-result v1

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getLength()I

    move-result v2

    if-ne v1, v2, :cond_2

    .line 189
    iget-object v1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 190
    invoke-static {p1}, Lnet/sf/scuba/tlv/TLVUtil;->getLengthAsBytes(I)[B

    move-result-object p1

    .line 191
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getValue()[B

    move-result-object v0

    .line 192
    array-length v1, p1

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2, v1}, Lnet/sf/scuba/tlv/TLVOutputState;->updateValueBytesProcessed([BII)V

    .line 193
    array-length p1, v0

    invoke-virtual {p0, v0, v2, p1}, Lnet/sf/scuba/tlv/TLVOutputState;->updateValueBytesProcessed([BII)V

    const/4 p1, 0x1

    .line 194
    iput-boolean p1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfTag:Z

    .line 195
    iput-boolean v2, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfLength:Z

    .line 196
    iput-boolean v2, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isReadingValue:Z

    :cond_2
    :goto_0
    return-void
.end method

.method public updateValueBytesProcessed([BII)V
    .locals 3

    .line 201
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 204
    :cond_0
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;

    .line 205
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getLength()I

    move-result v1

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getValueBytesProcessed()I

    move-result v2

    sub-int/2addr v1, v2

    if-gt p3, v1, :cond_2

    .line 209
    invoke-virtual {v0, p1, p2, p3}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->write([BII)V

    .line 211
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getValueBytesProcessed()I

    move-result p1

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getLength()I

    move-result p2

    const/4 p3, 0x1

    const/4 v1, 0x0

    if-ne p1, p2, :cond_1

    .line 213
    iget-object p1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->state:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 214
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getValue()[B

    move-result-object p1

    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getLength()I

    move-result p2

    invoke-virtual {p0, p1, v1, p2}, Lnet/sf/scuba/tlv/TLVOutputState;->updateValueBytesProcessed([BII)V

    .line 215
    iput-boolean p3, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfTag:Z

    .line 216
    iput-boolean v1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfLength:Z

    .line 217
    iput-boolean v1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isReadingValue:Z

    return-void

    .line 220
    :cond_1
    iput-boolean v1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfTag:Z

    .line 221
    iput-boolean v1, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isAtStartOfLength:Z

    .line 222
    iput-boolean p3, p0, Lnet/sf/scuba/tlv/TLVOutputState;->isReadingValue:Z

    return-void

    .line 207
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "Cannot process "

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string p3, " bytes! Only "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string p3, " bytes left in this TLV object "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
