.class public Lnet/sf/scuba/smartcards/WrappingCardService;
.super Lnet/sf/scuba/smartcards/CardService;
.source "WrappingCardService.java"


# instance fields
.field private enabled:Z

.field private service:Lnet/sf/scuba/smartcards/CardService;

.field private wrapper:Lnet/sf/scuba/smartcards/APDUWrapper;


# direct methods
.method public constructor <init>(Lnet/sf/scuba/smartcards/CardService;Lnet/sf/scuba/smartcards/APDUWrapper;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lnet/sf/scuba/smartcards/CardService;-><init>()V

    .line 39
    iput-object p1, p0, Lnet/sf/scuba/smartcards/WrappingCardService;->service:Lnet/sf/scuba/smartcards/CardService;

    .line 40
    iput-object p2, p0, Lnet/sf/scuba/smartcards/WrappingCardService;->wrapper:Lnet/sf/scuba/smartcards/APDUWrapper;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 71
    iget-object v0, p0, Lnet/sf/scuba/smartcards/WrappingCardService;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v0}, Lnet/sf/scuba/smartcards/CardService;->close()V

    return-void
.end method

.method public disable()V
    .locals 1

    const/4 v0, 0x0

    .line 83
    iput-boolean v0, p0, Lnet/sf/scuba/smartcards/WrappingCardService;->enabled:Z

    return-void
.end method

.method public enable()V
    .locals 1

    const/4 v0, 0x1

    .line 75
    iput-boolean v0, p0, Lnet/sf/scuba/smartcards/WrappingCardService;->enabled:Z

    return-void
.end method

.method public getATR()[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lnet/sf/scuba/smartcards/WrappingCardService;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v0}, Lnet/sf/scuba/smartcards/CardService;->getATR()[B

    move-result-object v0

    return-object v0
.end method

.method public isConnectionLost(Ljava/lang/Exception;)Z
    .locals 1

    .line 88
    iget-object v0, p0, Lnet/sf/scuba/smartcards/WrappingCardService;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v0, p1}, Lnet/sf/scuba/smartcards/CardService;->isConnectionLost(Ljava/lang/Exception;)Z

    move-result p1

    return p1
.end method

.method public isEnabled()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lnet/sf/scuba/smartcards/WrappingCardService;->enabled:Z

    return v0
.end method

.method public isOpen()Z
    .locals 1

    .line 50
    iget-object v0, p0, Lnet/sf/scuba/smartcards/WrappingCardService;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v0}, Lnet/sf/scuba/smartcards/CardService;->isOpen()Z

    move-result v0

    return v0
.end method

.method public open()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lnet/sf/scuba/smartcards/WrappingCardService;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v0}, Lnet/sf/scuba/smartcards/CardService;->open()V

    return-void
.end method

.method public transmit(Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    .line 56
    invoke-virtual {p0}, Lnet/sf/scuba/smartcards/WrappingCardService;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lnet/sf/scuba/smartcards/WrappingCardService;->service:Lnet/sf/scuba/smartcards/CardService;

    iget-object v1, p0, Lnet/sf/scuba/smartcards/WrappingCardService;->wrapper:Lnet/sf/scuba/smartcards/APDUWrapper;

    invoke-interface {v1, p1}, Lnet/sf/scuba/smartcards/APDUWrapper;->wrap(Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/CommandAPDU;

    move-result-object p1

    invoke-virtual {v0, p1}, Lnet/sf/scuba/smartcards/CardService;->transmit(Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object p1

    .line 58
    iget-object v0, p0, Lnet/sf/scuba/smartcards/WrappingCardService;->wrapper:Lnet/sf/scuba/smartcards/APDUWrapper;

    invoke-interface {v0, p1}, Lnet/sf/scuba/smartcards/APDUWrapper;->unwrap(Lnet/sf/scuba/smartcards/ResponseAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object p1

    return-object p1

    .line 60
    :cond_0
    iget-object v0, p0, Lnet/sf/scuba/smartcards/WrappingCardService;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v0, p1}, Lnet/sf/scuba/smartcards/CardService;->transmit(Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object p1

    return-object p1
.end method
