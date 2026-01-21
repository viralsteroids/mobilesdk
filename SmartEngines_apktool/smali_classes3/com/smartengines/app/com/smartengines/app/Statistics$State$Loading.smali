.class public final Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;
.super Ljava/lang/Object;
.source "Statistics.kt"

# interfaces
.implements Lcom/smartengines/app/com/smartengines/app/Statistics$State;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/com/smartengines/app/Statistics$State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Loading"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u00c7\n\u0018\u00002\u00020\u0001B\t\u0008\u0003\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00d7\u0003J\t\u0010\u0008\u001a\u00020\tH\u00d7\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d7\u0001\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;",
        "Lcom/smartengines/app/com/smartengines/app/Statistics$State;",
        "<init>",
        "()V",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "app_storeRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;

    invoke-direct {v0}, Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;-><init>()V

    sput-object v0, Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;->INSTANCE:Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;

    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x2d34090c

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Loading"

    return-object v0
.end method
