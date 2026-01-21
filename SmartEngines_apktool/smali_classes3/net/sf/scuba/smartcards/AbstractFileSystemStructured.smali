.class public abstract Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;
.super Ljava/lang/Object;
.source "AbstractFileSystemStructured.java"

# interfaces
.implements Lnet/sf/scuba/smartcards/FileSystemStructured;


# static fields
.field public static final MF_ID:S = 0x3f00s


# instance fields
.field private fileInfo:Lnet/sf/scuba/smartcards/ISOFileInfo;

.field private length:I

.field private p2:I

.field private selectLe:I

.field private selectedFID:S

.field private service:Lnet/sf/scuba/smartcards/CardService;


# direct methods
.method public constructor <init>(Lnet/sf/scuba/smartcards/CardService;)V
    .locals 2

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 41
    iput-short v0, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectedFID:S

    const/4 v1, -0x1

    .line 42
    iput v1, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->length:I

    .line 43
    iput v0, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->p2:I

    const/16 v0, 0x100

    .line 44
    iput v0, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectLe:I

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->fileInfo:Lnet/sf/scuba/smartcards/ISOFileInfo;

    .line 48
    iput-object p1, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->service:Lnet/sf/scuba/smartcards/CardService;

    return-void
.end method

.method public constructor <init>(Lnet/sf/scuba/smartcards/CardService;Z)V
    .locals 3

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 41
    iput-short v0, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectedFID:S

    const/4 v1, -0x1

    .line 42
    iput v1, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->length:I

    .line 43
    iput v0, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->p2:I

    const/16 v1, 0x100

    .line 44
    iput v1, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectLe:I

    const/4 v2, 0x0

    .line 45
    iput-object v2, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->fileInfo:Lnet/sf/scuba/smartcards/ISOFileInfo;

    .line 52
    iput-object p1, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->service:Lnet/sf/scuba/smartcards/CardService;

    if-eqz p2, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/16 p1, 0xc

    .line 53
    :goto_0
    iput p1, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->p2:I

    if-eqz p2, :cond_1

    move v0, v1

    .line 54
    :cond_1
    iput v0, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectLe:I

    return-void
.end method

.method private createSelectFileAPDU(II[BI)Lnet/sf/scuba/smartcards/CommandAPDU;
    .locals 8

    if-nez p4, :cond_0

    .line 129
    new-instance v0, Lnet/sf/scuba/smartcards/CommandAPDU;

    const/4 v1, 0x0

    const/16 v2, -0x5c

    move v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lnet/sf/scuba/smartcards/CommandAPDU;-><init>(IIII[B)V

    return-object v0

    :cond_0
    move v3, p1

    move v4, p2

    move-object v5, p3

    .line 133
    new-instance v1, Lnet/sf/scuba/smartcards/CommandAPDU;

    const/4 v2, 0x0

    move-object v6, v5

    move v5, v4

    move v4, v3

    const/16 v3, -0x5c

    move v7, p4

    invoke-direct/range {v1 .. v7}, Lnet/sf/scuba/smartcards/CommandAPDU;-><init>(IIII[BI)V

    return-object v1
.end method

.method private selectFile(SI)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 91
    new-array p1, v0, [B

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    new-array v1, v1, [B

    shr-int/lit8 v2, p1, 0x8

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    const/4 v0, 0x1

    aput-byte p1, v1, v0

    move-object p1, v1

    .line 92
    :goto_0
    invoke-direct {p0, p1, p2}, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectFile([BI)V

    return-void
.end method

.method private selectFile([BI)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    .line 68
    iget v0, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->p2:I

    iget v1, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectLe:I

    invoke-direct {p0, p2, v0, p1, v1}, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->createSelectFileAPDU(II[BI)Lnet/sf/scuba/smartcards/CommandAPDU;

    move-result-object p1

    .line 69
    iget-object p2, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {p2, p1}, Lnet/sf/scuba/smartcards/CardService;->transmit(Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object p1

    .line 71
    invoke-virtual {p1}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getSW()I

    move-result p2

    .line 72
    invoke-virtual {p1}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getData()[B

    move-result-object p1

    const/16 v0, -0x7000

    if-ne p2, v0, :cond_2

    .line 81
    new-instance p2, Lnet/sf/scuba/smartcards/ISOFileInfo;

    invoke-direct {p2, p1}, Lnet/sf/scuba/smartcards/ISOFileInfo;-><init>([B)V

    iput-object p2, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->fileInfo:Lnet/sf/scuba/smartcards/ISOFileInfo;

    .line 82
    iget-short p1, p2, Lnet/sf/scuba/smartcards/ISOFileInfo;->fid:S

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    .line 83
    iget-object p1, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->fileInfo:Lnet/sf/scuba/smartcards/ISOFileInfo;

    iget-short p1, p1, Lnet/sf/scuba/smartcards/ISOFileInfo;->fid:S

    iput-short p1, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectedFID:S

    .line 85
    :cond_0
    iget-object p1, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->fileInfo:Lnet/sf/scuba/smartcards/ISOFileInfo;

    iget p1, p1, Lnet/sf/scuba/smartcards/ISOFileInfo;->fileLength:I

    if-eq p1, p2, :cond_1

    .line 86
    iget-object p1, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->fileInfo:Lnet/sf/scuba/smartcards/ISOFileInfo;

    iget p1, p1, Lnet/sf/scuba/smartcards/ISOFileInfo;->fileLength:I

    iput p1, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->length:I

    :cond_1
    return-void

    .line 75
    :cond_2
    new-instance p1, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string v0, "File could not be selected."

    invoke-direct {p1, v0, p2}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;I)V

    throw p1
.end method


# virtual methods
.method public getFileLength()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    .line 58
    iget v0, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->length:I

    return v0
.end method

.method public getSelectedFID()S
    .locals 1

    .line 62
    iget-short v0, p0, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectedFID:S

    return v0
.end method

.method public abstract readBinary(II)[B
.end method

.method public selectAID([B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    const/4 v0, 0x4

    .line 116
    invoke-direct {p0, p1, v0}, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectFile([BI)V

    return-void
.end method

.method public selectDFRelative(S)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 112
    invoke-direct {p0, p1, v0}, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectFile(SI)V

    return-void
.end method

.method public selectEFRelative(S)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 108
    invoke-direct {p0, p1, v0}, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectFile(SI)V

    return-void
.end method

.method public selectFile(S)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 96
    invoke-direct {p0, p1, v0}, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectFile(SI)V

    return-void
.end method

.method public selectMF()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 100
    invoke-direct {p0, v0, v0}, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectFile(SI)V

    return-void
.end method

.method public selectParent()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 104
    invoke-direct {p0, v0, v1}, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectFile(SI)V

    return-void
.end method

.method public selectPath([B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    const/16 v0, 0x8

    .line 120
    invoke-direct {p0, p1, v0}, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectFile([BI)V

    return-void
.end method

.method public selectPathRelative([B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    const/16 v0, 0x9

    .line 124
    invoke-direct {p0, p1, v0}, Lnet/sf/scuba/smartcards/AbstractFileSystemStructured;->selectFile([BI)V

    return-void
.end method
