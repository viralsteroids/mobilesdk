.class public Lorg/ejbca/cvc/AccessRightsRawValue;
.super Ljava/lang/Object;
.source "AccessRightsRawValue.java"

# interfaces
.implements Lorg/ejbca/cvc/AccessRights;


# static fields
.field private static final EXCEPTION_MSG:Ljava/lang/String; = "Access Right object does not know its type/OID yet. This is a bug."


# instance fields
.field private final bytes:[B


# direct methods
.method constructor <init>([B)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lorg/ejbca/cvc/AccessRightsRawValue;->bytes:[B

    return-void
.end method


# virtual methods
.method public getEncoded()[B
    .locals 1

    .line 34
    iget-object v0, p0, Lorg/ejbca/cvc/AccessRightsRawValue;->bytes:[B

    return-object v0
.end method

.method public name()Ljava/lang/String;
    .locals 2

    .line 39
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Access Right object does not know its type/OID yet. This is a bug."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
