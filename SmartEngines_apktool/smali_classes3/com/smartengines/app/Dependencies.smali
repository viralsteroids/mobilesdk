.class public final Lcom/smartengines/app/Dependencies;
.super Ljava/lang/Object;
.source "Dependencies.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0003\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/smartengines/app/Dependencies;",
        "",
        "<init>",
        "()V",
        "nfcReadingEngine",
        "Lcom/smartengines/nfc/ReadingEngine;",
        "getNfcReadingEngine",
        "()Lcom/smartengines/nfc/ReadingEngine;",
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

.field public static final INSTANCE:Lcom/smartengines/app/Dependencies;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/Dependencies;

    invoke-direct {v0}, Lcom/smartengines/app/Dependencies;-><init>()V

    sput-object v0, Lcom/smartengines/app/Dependencies;->INSTANCE:Lcom/smartengines/app/Dependencies;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getNfcReadingEngine()Lcom/smartengines/nfc/ReadingEngine;
    .locals 1

    .line 13
    new-instance v0, Lcom/smartengines/nfc/ReadingEngineScuba;

    invoke-direct {v0}, Lcom/smartengines/nfc/ReadingEngineScuba;-><init>()V

    check-cast v0, Lcom/smartengines/nfc/ReadingEngine;

    return-object v0
.end method
