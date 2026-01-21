.class public final enum Lcom/smartengines/engine/SessionType;
.super Ljava/lang/Enum;
.source "SessionType.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/smartengines/engine/SessionType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\tj\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/smartengines/engine/SessionType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "VIDEO_SESSION",
        "PHOTO_SESSION",
        "GALLERY_SESSION",
        "isSingleShot",
        "",
        "()Z",
        "isVideo",
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

.field private static final synthetic $VALUES:[Lcom/smartengines/engine/SessionType;

.field public static final enum GALLERY_SESSION:Lcom/smartengines/engine/SessionType;

.field public static final enum PHOTO_SESSION:Lcom/smartengines/engine/SessionType;

.field public static final enum VIDEO_SESSION:Lcom/smartengines/engine/SessionType;


# direct methods
.method private static final synthetic $values()[Lcom/smartengines/engine/SessionType;
    .locals 3

    sget-object v0, Lcom/smartengines/engine/SessionType;->VIDEO_SESSION:Lcom/smartengines/engine/SessionType;

    sget-object v1, Lcom/smartengines/engine/SessionType;->PHOTO_SESSION:Lcom/smartengines/engine/SessionType;

    sget-object v2, Lcom/smartengines/engine/SessionType;->GALLERY_SESSION:Lcom/smartengines/engine/SessionType;

    filled-new-array {v0, v1, v2}, [Lcom/smartengines/engine/SessionType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 9
    new-instance v0, Lcom/smartengines/engine/SessionType;

    const-string v1, "VIDEO_SESSION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/SessionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/engine/SessionType;->VIDEO_SESSION:Lcom/smartengines/engine/SessionType;

    .line 10
    new-instance v0, Lcom/smartengines/engine/SessionType;

    const-string v1, "PHOTO_SESSION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/SessionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/engine/SessionType;->PHOTO_SESSION:Lcom/smartengines/engine/SessionType;

    .line 11
    new-instance v0, Lcom/smartengines/engine/SessionType;

    const-string v1, "GALLERY_SESSION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/SessionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/smartengines/engine/SessionType;->GALLERY_SESSION:Lcom/smartengines/engine/SessionType;

    invoke-static {}, Lcom/smartengines/engine/SessionType;->$values()[Lcom/smartengines/engine/SessionType;

    move-result-object v0

    sput-object v0, Lcom/smartengines/engine/SessionType;->$VALUES:[Lcom/smartengines/engine/SessionType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/smartengines/engine/SessionType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/smartengines/engine/SessionType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/smartengines/engine/SessionType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/smartengines/engine/SessionType;
    .locals 1

    const-class v0, Lcom/smartengines/engine/SessionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 17
    check-cast p0, Lcom/smartengines/engine/SessionType;

    return-object p0
.end method

.method public static values()[Lcom/smartengines/engine/SessionType;
    .locals 1

    sget-object v0, Lcom/smartengines/engine/SessionType;->$VALUES:[Lcom/smartengines/engine/SessionType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 17
    check-cast v0, [Lcom/smartengines/engine/SessionType;

    return-object v0
.end method


# virtual methods
.method public final isSingleShot()Z
    .locals 1

    .line 14
    sget-object v0, Lcom/smartengines/engine/SessionType;->PHOTO_SESSION:Lcom/smartengines/engine/SessionType;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/smartengines/engine/SessionType;->GALLERY_SESSION:Lcom/smartengines/engine/SessionType;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isVideo()Z
    .locals 1

    .line 16
    sget-object v0, Lcom/smartengines/engine/SessionType;->VIDEO_SESSION:Lcom/smartengines/engine/SessionType;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
