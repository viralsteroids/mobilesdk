.class Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;
.super Ljava/lang/Object;
.source "TLVOutputState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/sf/scuba/tlv/TLVOutputState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TLVStruct"
.end annotation


# instance fields
.field private isLengthSet:Z

.field private length:I

.field private tag:I

.field final synthetic this$0:Lnet/sf/scuba/tlv/TLVOutputState;

.field private value:Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>(Lnet/sf/scuba/tlv/TLVOutputState;I)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v3, 0x7fffffff

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 270
    invoke-direct/range {v0 .. v5}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;-><init>(Lnet/sf/scuba/tlv/TLVOutputState;IIZ[B)V

    return-void
.end method

.method public constructor <init>(Lnet/sf/scuba/tlv/TLVOutputState;IIZ[B)V
    .locals 0

    .line 273
    iput-object p1, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->this$0:Lnet/sf/scuba/tlv/TLVOutputState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 274
    iput p2, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->tag:I

    .line 275
    iput p3, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->length:I

    .line 276
    iput-boolean p4, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->isLengthSet:Z

    .line 277
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object p1, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->value:Ljava/io/ByteArrayOutputStream;

    if-eqz p5, :cond_0

    .line 280
    :try_start_0
    invoke-virtual {p1, p5}, Ljava/io/ByteArrayOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 282
    invoke-static {}, Lnet/sf/scuba/tlv/TLVOutputState;->access$100()Ljava/util/logging/Logger;

    move-result-object p2

    sget-object p3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string p4, "Exception writing bytes in memory"

    invoke-virtual {p2, p3, p4, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Lnet/sf/scuba/tlv/TLVOutputState;Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;)V
    .locals 6

    .line 266
    iget v2, p2, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->tag:I

    iget v3, p2, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->length:I

    iget-boolean v4, p2, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->isLengthSet:Z

    invoke-virtual {p2}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->getValue()[B

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;-><init>(Lnet/sf/scuba/tlv/TLVOutputState;IIZ[B)V

    return-void
.end method

.method static synthetic access$000(Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;)Z
    .locals 0

    .line 258
    iget-boolean p0, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->isLengthSet:Z

    return p0
.end method


# virtual methods
.method public getLength()I
    .locals 1

    .line 297
    iget v0, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->length:I

    return v0
.end method

.method public getTag()I
    .locals 1

    .line 293
    iget v0, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->tag:I

    return v0
.end method

.method public getValue()[B
    .locals 1

    .line 309
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->value:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public getValueBytesProcessed()I
    .locals 1

    .line 305
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->value:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v0

    return v0
.end method

.method public isLengthSet()Z
    .locals 1

    .line 301
    iget-boolean v0, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->isLengthSet:Z

    return v0
.end method

.method public setLength(I)V
    .locals 0

    .line 288
    iput p1, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->length:I

    const/4 p1, 0x1

    .line 289
    iput-boolean p1, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->isLengthSet:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 318
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->value:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 319
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[TLVStruct "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->tag:I

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v3, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->isLengthSet:Z

    if-eqz v3, :cond_0

    iget v3, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->length:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    :cond_0
    const-string v3, "UNDEFINED"

    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v0, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") ]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write([BII)V
    .locals 1

    .line 313
    iget-object v0, p0, Lnet/sf/scuba/tlv/TLVOutputState$TLVStruct;->value:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    return-void
.end method
