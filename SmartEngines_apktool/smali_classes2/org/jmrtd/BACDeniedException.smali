.class public Lorg/jmrtd/BACDeniedException;
.super Lnet/sf/scuba/smartcards/CardServiceException;
.source "BACDeniedException.java"


# static fields
.field private static final serialVersionUID:J = -0x627656c2ef81b081L


# instance fields
.field private final bacKey:Lorg/jmrtd/BACKeySpec;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/jmrtd/BACKeySpec;I)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p3}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;I)V

    .line 51
    iput-object p2, p0, Lorg/jmrtd/BACDeniedException;->bacKey:Lorg/jmrtd/BACKeySpec;

    return-void
.end method


# virtual methods
.method public getBACKey()Lorg/jmrtd/BACKeySpec;
    .locals 1

    .line 60
    iget-object v0, p0, Lorg/jmrtd/BACDeniedException;->bacKey:Lorg/jmrtd/BACKeySpec;

    return-object v0
.end method
