.class public final enum Lcom/smartengines/app/settings/BuildFlavor;
.super Ljava/lang/Enum;
.source "BuildFlavor.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/smartengines/app/settings/BuildFlavor;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000cj\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/smartengines/app/settings/BuildFlavor;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "STORE",
        "BETA",
        "NIGHTLY",
        "FORENSIC",
        "RUSTORE",
        "UNKNOWN",
        "isPrivate",
        "",
        "()Z",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/smartengines/app/settings/BuildFlavor;

.field public static final enum BETA:Lcom/smartengines/app/settings/BuildFlavor;

.field public static final enum FORENSIC:Lcom/smartengines/app/settings/BuildFlavor;

.field public static final enum NIGHTLY:Lcom/smartengines/app/settings/BuildFlavor;

.field public static final enum RUSTORE:Lcom/smartengines/app/settings/BuildFlavor;

.field public static final enum STORE:Lcom/smartengines/app/settings/BuildFlavor;

.field public static final enum UNKNOWN:Lcom/smartengines/app/settings/BuildFlavor;


# direct methods
.method private static final synthetic $values()[Lcom/smartengines/app/settings/BuildFlavor;
    .locals 6

    sget-object v0, Lcom/smartengines/app/settings/BuildFlavor;->STORE:Lcom/smartengines/app/settings/BuildFlavor;

    sget-object v1, Lcom/smartengines/app/settings/BuildFlavor;->BETA:Lcom/smartengines/app/settings/BuildFlavor;

    sget-object v2, Lcom/smartengines/app/settings/BuildFlavor;->NIGHTLY:Lcom/smartengines/app/settings/BuildFlavor;

    sget-object v3, Lcom/smartengines/app/settings/BuildFlavor;->FORENSIC:Lcom/smartengines/app/settings/BuildFlavor;

    sget-object v4, Lcom/smartengines/app/settings/BuildFlavor;->RUSTORE:Lcom/smartengines/app/settings/BuildFlavor;

    sget-object v5, Lcom/smartengines/app/settings/BuildFlavor;->UNKNOWN:Lcom/smartengines/app/settings/BuildFlavor;

    filled-new-array/range {v0 .. v5}, [Lcom/smartengines/app/settings/BuildFlavor;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 4
    new-instance v0, Lcom/smartengines/app/settings/BuildFlavor;

    const-string v1, "STORE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/smartengines/app/settings/BuildFlavor;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/app/settings/BuildFlavor;->STORE:Lcom/smartengines/app/settings/BuildFlavor;

    new-instance v0, Lcom/smartengines/app/settings/BuildFlavor;

    const-string v1, "BETA"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/smartengines/app/settings/BuildFlavor;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/app/settings/BuildFlavor;->BETA:Lcom/smartengines/app/settings/BuildFlavor;

    new-instance v0, Lcom/smartengines/app/settings/BuildFlavor;

    const-string v1, "NIGHTLY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/smartengines/app/settings/BuildFlavor;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/app/settings/BuildFlavor;->NIGHTLY:Lcom/smartengines/app/settings/BuildFlavor;

    new-instance v0, Lcom/smartengines/app/settings/BuildFlavor;

    const-string v1, "FORENSIC"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/smartengines/app/settings/BuildFlavor;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/app/settings/BuildFlavor;->FORENSIC:Lcom/smartengines/app/settings/BuildFlavor;

    new-instance v0, Lcom/smartengines/app/settings/BuildFlavor;

    const-string v1, "RUSTORE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/smartengines/app/settings/BuildFlavor;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/app/settings/BuildFlavor;->RUSTORE:Lcom/smartengines/app/settings/BuildFlavor;

    .line 5
    new-instance v0, Lcom/smartengines/app/settings/BuildFlavor;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/smartengines/app/settings/BuildFlavor;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/app/settings/BuildFlavor;->UNKNOWN:Lcom/smartengines/app/settings/BuildFlavor;

    invoke-static {}, Lcom/smartengines/app/settings/BuildFlavor;->$values()[Lcom/smartengines/app/settings/BuildFlavor;

    move-result-object v0

    sput-object v0, Lcom/smartengines/app/settings/BuildFlavor;->$VALUES:[Lcom/smartengines/app/settings/BuildFlavor;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/smartengines/app/settings/BuildFlavor;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/smartengines/app/settings/BuildFlavor;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/smartengines/app/settings/BuildFlavor;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/smartengines/app/settings/BuildFlavor;
    .locals 1

    const-class v0, Lcom/smartengines/app/settings/BuildFlavor;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 8
    check-cast p0, Lcom/smartengines/app/settings/BuildFlavor;

    return-object p0
.end method

.method public static values()[Lcom/smartengines/app/settings/BuildFlavor;
    .locals 1

    sget-object v0, Lcom/smartengines/app/settings/BuildFlavor;->$VALUES:[Lcom/smartengines/app/settings/BuildFlavor;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 8
    check-cast v0, [Lcom/smartengines/app/settings/BuildFlavor;

    return-object v0
.end method


# virtual methods
.method public final isPrivate()Z
    .locals 1

    .line 7
    sget-object v0, Lcom/smartengines/app/settings/BuildFlavor;->STORE:Lcom/smartengines/app/settings/BuildFlavor;

    if-eq p0, v0, :cond_0

    sget-object v0, Lcom/smartengines/app/settings/BuildFlavor;->RUSTORE:Lcom/smartengines/app/settings/BuildFlavor;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
