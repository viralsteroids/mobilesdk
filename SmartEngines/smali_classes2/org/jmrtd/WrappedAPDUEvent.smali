.class public Lorg/jmrtd/WrappedAPDUEvent;
.super Lnet/sf/scuba/smartcards/APDUEvent;
.source "WrappedAPDUEvent.java"


# static fields
.field private static final serialVersionUID:J = 0x52b16be7d9f02cb0L


# instance fields
.field private plainTextCommandAPDU:Lnet/sf/scuba/smartcards/CommandAPDU;

.field private plainTextResponseAPDU:Lnet/sf/scuba/smartcards/ResponseAPDU;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;ILnet/sf/scuba/smartcards/CommandAPDU;Lnet/sf/scuba/smartcards/ResponseAPDU;Lnet/sf/scuba/smartcards/CommandAPDU;Lnet/sf/scuba/smartcards/ResponseAPDU;)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p6

    move-object v5, p7

    .line 62
    invoke-direct/range {v0 .. v5}, Lnet/sf/scuba/smartcards/APDUEvent;-><init>(Ljava/lang/Object;Ljava/io/Serializable;ILnet/sf/scuba/smartcards/CommandAPDU;Lnet/sf/scuba/smartcards/ResponseAPDU;)V

    .line 63
    iput-object p4, v0, Lorg/jmrtd/WrappedAPDUEvent;->plainTextCommandAPDU:Lnet/sf/scuba/smartcards/CommandAPDU;

    .line 64
    iput-object p5, v0, Lorg/jmrtd/WrappedAPDUEvent;->plainTextResponseAPDU:Lnet/sf/scuba/smartcards/ResponseAPDU;

    return-void
.end method


# virtual methods
.method public getPlainTextCommandAPDU()Lnet/sf/scuba/smartcards/CommandAPDU;
    .locals 1

    .line 73
    iget-object v0, p0, Lorg/jmrtd/WrappedAPDUEvent;->plainTextCommandAPDU:Lnet/sf/scuba/smartcards/CommandAPDU;

    return-object v0
.end method

.method public getPlainTextResponseAPDU()Lnet/sf/scuba/smartcards/ResponseAPDU;
    .locals 1

    .line 82
    iget-object v0, p0, Lorg/jmrtd/WrappedAPDUEvent;->plainTextResponseAPDU:Lnet/sf/scuba/smartcards/ResponseAPDU;

    return-object v0
.end method
