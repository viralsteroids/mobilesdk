.class public final enum Lcom/smartengines/engine/EngineId;
.super Ljava/lang/Enum;
.source "EngineId.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/smartengines/engine/EngineId;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/smartengines/engine/EngineId;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "CODE",
        "DOC",
        "ID",
        "TEXT",
        "engine_release"
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

.field private static final synthetic $VALUES:[Lcom/smartengines/engine/EngineId;

.field public static final enum CODE:Lcom/smartengines/engine/EngineId;

.field public static final enum DOC:Lcom/smartengines/engine/EngineId;

.field public static final enum ID:Lcom/smartengines/engine/EngineId;

.field public static final enum TEXT:Lcom/smartengines/engine/EngineId;


# direct methods
.method private static final synthetic $values()[Lcom/smartengines/engine/EngineId;
    .locals 4

    sget-object v0, Lcom/smartengines/engine/EngineId;->CODE:Lcom/smartengines/engine/EngineId;

    sget-object v1, Lcom/smartengines/engine/EngineId;->DOC:Lcom/smartengines/engine/EngineId;

    sget-object v2, Lcom/smartengines/engine/EngineId;->ID:Lcom/smartengines/engine/EngineId;

    sget-object v3, Lcom/smartengines/engine/EngineId;->TEXT:Lcom/smartengines/engine/EngineId;

    filled-new-array {v0, v1, v2, v3}, [Lcom/smartengines/engine/EngineId;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 4
    new-instance v0, Lcom/smartengines/engine/EngineId;

    const-string v1, "CODE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/EngineId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/engine/EngineId;->CODE:Lcom/smartengines/engine/EngineId;

    new-instance v0, Lcom/smartengines/engine/EngineId;

    const-string v1, "DOC"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/EngineId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/engine/EngineId;->DOC:Lcom/smartengines/engine/EngineId;

    new-instance v0, Lcom/smartengines/engine/EngineId;

    const-string v1, "ID"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/EngineId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/engine/EngineId;->ID:Lcom/smartengines/engine/EngineId;

    new-instance v0, Lcom/smartengines/engine/EngineId;

    const-string v1, "TEXT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/EngineId;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/engine/EngineId;->TEXT:Lcom/smartengines/engine/EngineId;

    invoke-static {}, Lcom/smartengines/engine/EngineId;->$values()[Lcom/smartengines/engine/EngineId;

    move-result-object v0

    sput-object v0, Lcom/smartengines/engine/EngineId;->$VALUES:[Lcom/smartengines/engine/EngineId;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/smartengines/engine/EngineId;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
            "Lcom/smartengines/engine/EngineId;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/smartengines/engine/EngineId;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/smartengines/engine/EngineId;
    .locals 1

    const-class v0, Lcom/smartengines/engine/EngineId;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 5
    check-cast p0, Lcom/smartengines/engine/EngineId;

    return-object p0
.end method

.method public static values()[Lcom/smartengines/engine/EngineId;
    .locals 1

    sget-object v0, Lcom/smartengines/engine/EngineId;->$VALUES:[Lcom/smartengines/engine/EngineId;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 5
    check-cast v0, [Lcom/smartengines/engine/EngineId;

    return-object v0
.end method
