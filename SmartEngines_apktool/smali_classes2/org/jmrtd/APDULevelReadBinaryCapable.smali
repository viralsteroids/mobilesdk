.class public interface abstract Lorg/jmrtd/APDULevelReadBinaryCapable;
.super Ljava/lang/Object;
.source "APDULevelReadBinaryCapable.java"


# virtual methods
.method public abstract sendReadBinary(Lnet/sf/scuba/smartcards/APDUWrapper;IIIZZ)[B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation
.end method

.method public abstract sendSelectApplet(Lnet/sf/scuba/smartcards/APDUWrapper;[B)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation
.end method

.method public abstract sendSelectFile(Lnet/sf/scuba/smartcards/APDUWrapper;S)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation
.end method
