.class public Lorg/jmrtd/cbeff/ISO781611Encoder;
.super Ljava/lang/Object;
.source "ISO781611Encoder.java"

# interfaces
.implements Lorg/jmrtd/cbeff/ISO781611;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B::",
        "Lorg/jmrtd/cbeff/BiometricDataBlock;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/jmrtd/cbeff/ISO781611;"
    }
.end annotation


# instance fields
.field private bdbEncoder:Lorg/jmrtd/cbeff/BiometricDataBlockEncoder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jmrtd/cbeff/BiometricDataBlockEncoder<",
            "TB;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/jmrtd/cbeff/BiometricDataBlockEncoder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jmrtd/cbeff/BiometricDataBlockEncoder<",
            "TB;>;)V"
        }
    .end annotation

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lorg/jmrtd/cbeff/ISO781611Encoder;->bdbEncoder:Lorg/jmrtd/cbeff/BiometricDataBlockEncoder;

    return-void
.end method

.method private writeBHT(Lnet/sf/scuba/tlv/TLVOutputStream;ILorg/jmrtd/cbeff/SimpleCBEFFInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/sf/scuba/tlv/TLVOutputStream;",
            "I",
            "Lorg/jmrtd/cbeff/SimpleCBEFFInfo<",
            "TB;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 p2, 0xa1

    .line 121
    invoke-virtual {p1, p2}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeTag(I)V

    .line 123
    invoke-virtual {p3}, Lorg/jmrtd/cbeff/SimpleCBEFFInfo;->getBiometricDataBlock()Lorg/jmrtd/cbeff/BiometricDataBlock;

    move-result-object p2

    .line 126
    invoke-interface {p2}, Lorg/jmrtd/cbeff/BiometricDataBlock;->getStandardBiometricHeader()Lorg/jmrtd/cbeff/StandardBiometricHeader;

    move-result-object p2

    .line 127
    invoke-virtual {p2}, Lorg/jmrtd/cbeff/StandardBiometricHeader;->getElements()Ljava/util/SortedMap;

    move-result-object p2

    .line 128
    invoke-interface {p2}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    .line 129
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeTag(I)V

    .line 130
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [B

    invoke-virtual {p1, p3}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeValue([B)V

    goto :goto_0

    .line 132
    :cond_0
    invoke-virtual {p1}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeValueEnd()V

    return-void
.end method

.method private writeBIT(Lnet/sf/scuba/tlv/TLVOutputStream;ILorg/jmrtd/cbeff/SimpleCBEFFInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/sf/scuba/tlv/TLVOutputStream;",
            "I",
            "Lorg/jmrtd/cbeff/SimpleCBEFFInfo<",
            "TB;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x7f60

    .line 105
    invoke-virtual {p1, v0}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeTag(I)V

    .line 106
    invoke-direct {p0, p1, p2, p3}, Lorg/jmrtd/cbeff/ISO781611Encoder;->writeBHT(Lnet/sf/scuba/tlv/TLVOutputStream;ILorg/jmrtd/cbeff/SimpleCBEFFInfo;)V

    .line 107
    invoke-virtual {p3}, Lorg/jmrtd/cbeff/SimpleCBEFFInfo;->getBiometricDataBlock()Lorg/jmrtd/cbeff/BiometricDataBlock;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lorg/jmrtd/cbeff/ISO781611Encoder;->writeBiometricDataBlock(Lnet/sf/scuba/tlv/TLVOutputStream;Lorg/jmrtd/cbeff/BiometricDataBlock;)V

    .line 108
    invoke-virtual {p1}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeValueEnd()V

    return-void
.end method

.method private writeBITGroup(Ljava/util/List;Ljava/io/OutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/jmrtd/cbeff/CBEFFInfo;",
            ">;",
            "Ljava/io/OutputStream;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 81
    instance-of v0, p2, Lnet/sf/scuba/tlv/TLVOutputStream;

    if-eqz v0, :cond_0

    check-cast p2, Lnet/sf/scuba/tlv/TLVOutputStream;

    goto :goto_0

    :cond_0
    new-instance v0, Lnet/sf/scuba/tlv/TLVOutputStream;

    invoke-direct {v0, p2}, Lnet/sf/scuba/tlv/TLVOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object p2, v0

    :goto_0
    const/16 v0, 0x7f61

    .line 82
    invoke-virtual {p2, v0}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeTag(I)V

    const/4 v0, 0x2

    .line 83
    invoke-virtual {p2, v0}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeTag(I)V

    .line 84
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    int-to-byte v1, v0

    const/4 v2, 0x1

    .line 85
    new-array v2, v2, [B

    const/4 v3, 0x0

    aput-byte v1, v2, v3

    invoke-virtual {p2, v2}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeValue([B)V

    :goto_1
    if-ge v3, v0, :cond_1

    .line 89
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/jmrtd/cbeff/SimpleCBEFFInfo;

    .line 90
    invoke-direct {p0, p2, v3, v1}, Lorg/jmrtd/cbeff/ISO781611Encoder;->writeBIT(Lnet/sf/scuba/tlv/TLVOutputStream;ILorg/jmrtd/cbeff/SimpleCBEFFInfo;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 92
    :cond_1
    invoke-virtual {p2}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeValueEnd()V

    return-void
.end method

.method private writeBiometricDataBlock(Lnet/sf/scuba/tlv/TLVOutputStream;Lorg/jmrtd/cbeff/BiometricDataBlock;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/sf/scuba/tlv/TLVOutputStream;",
            "TB;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x5f2e

    .line 144
    invoke-virtual {p1, v0}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeTag(I)V

    .line 146
    iget-object v0, p0, Lorg/jmrtd/cbeff/ISO781611Encoder;->bdbEncoder:Lorg/jmrtd/cbeff/BiometricDataBlockEncoder;

    invoke-interface {v0, p2, p1}, Lorg/jmrtd/cbeff/BiometricDataBlockEncoder;->encode(Lorg/jmrtd/cbeff/BiometricDataBlock;Ljava/io/OutputStream;)V

    .line 147
    invoke-virtual {p1}, Lnet/sf/scuba/tlv/TLVOutputStream;->writeValueEnd()V

    return-void
.end method


# virtual methods
.method public encode(Lorg/jmrtd/cbeff/CBEFFInfo;Ljava/io/OutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 64
    instance-of v0, p1, Lorg/jmrtd/cbeff/SimpleCBEFFInfo;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 65
    new-array v0, v0, [Lorg/jmrtd/cbeff/CBEFFInfo;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lorg/jmrtd/cbeff/ISO781611Encoder;->writeBITGroup(Ljava/util/List;Ljava/io/OutputStream;)V

    return-void

    .line 66
    :cond_0
    instance-of v0, p1, Lorg/jmrtd/cbeff/ComplexCBEFFInfo;

    if-eqz v0, :cond_1

    .line 67
    check-cast p1, Lorg/jmrtd/cbeff/ComplexCBEFFInfo;

    .line 68
    invoke-virtual {p1}, Lorg/jmrtd/cbeff/ComplexCBEFFInfo;->getSubRecords()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lorg/jmrtd/cbeff/ISO781611Encoder;->writeBITGroup(Ljava/util/List;Ljava/io/OutputStream;)V

    :cond_1
    return-void
.end method
