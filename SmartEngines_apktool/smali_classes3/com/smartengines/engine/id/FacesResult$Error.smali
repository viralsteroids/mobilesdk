.class public final enum Lcom/smartengines/engine/id/FacesResult$Error;
.super Ljava/lang/Enum;
.source "Faces.kt"

# interfaces
.implements Lcom/smartengines/engine/id/FacesResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/engine/id/FacesResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Error"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/engine/id/FacesResult$Error$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/smartengines/engine/id/FacesResult$Error;",
        ">;",
        "Lcom/smartengines/engine/id/FacesResult;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/smartengines/engine/id/FacesResult$Error;",
        "Lcom/smartengines/engine/id/FacesResult;",
        "",
        "code",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getCode",
        "()I",
        "AFaceNotFound",
        "BFaceNotFound",
        "FaceNotFound",
        "NoAccumulatedResult",
        "Companion",
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

.field private static final synthetic $VALUES:[Lcom/smartengines/engine/id/FacesResult$Error;

.field public static final enum AFaceNotFound:Lcom/smartengines/engine/id/FacesResult$Error;

.field public static final enum BFaceNotFound:Lcom/smartengines/engine/id/FacesResult$Error;

.field public static final Companion:Lcom/smartengines/engine/id/FacesResult$Error$Companion;

.field public static final enum FaceNotFound:Lcom/smartengines/engine/id/FacesResult$Error;

.field public static final enum NoAccumulatedResult:Lcom/smartengines/engine/id/FacesResult$Error;


# instance fields
.field private final code:I


# direct methods
.method private static final synthetic $values()[Lcom/smartengines/engine/id/FacesResult$Error;
    .locals 4

    sget-object v0, Lcom/smartengines/engine/id/FacesResult$Error;->AFaceNotFound:Lcom/smartengines/engine/id/FacesResult$Error;

    sget-object v1, Lcom/smartengines/engine/id/FacesResult$Error;->BFaceNotFound:Lcom/smartengines/engine/id/FacesResult$Error;

    sget-object v2, Lcom/smartengines/engine/id/FacesResult$Error;->FaceNotFound:Lcom/smartengines/engine/id/FacesResult$Error;

    sget-object v3, Lcom/smartengines/engine/id/FacesResult$Error;->NoAccumulatedResult:Lcom/smartengines/engine/id/FacesResult$Error;

    filled-new-array {v0, v1, v2, v3}, [Lcom/smartengines/engine/id/FacesResult$Error;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 14
    new-instance v0, Lcom/smartengines/engine/id/FacesResult$Error;

    const-string v1, "AFaceNotFound"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/engine/id/FacesResult$Error;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/smartengines/engine/id/FacesResult$Error;->AFaceNotFound:Lcom/smartengines/engine/id/FacesResult$Error;

    .line 15
    new-instance v0, Lcom/smartengines/engine/id/FacesResult$Error;

    const-string v1, "BFaceNotFound"

    const/4 v2, 0x1

    const/4 v4, 0x3

    invoke-direct {v0, v1, v2, v4}, Lcom/smartengines/engine/id/FacesResult$Error;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/smartengines/engine/id/FacesResult$Error;->BFaceNotFound:Lcom/smartengines/engine/id/FacesResult$Error;

    .line 16
    new-instance v0, Lcom/smartengines/engine/id/FacesResult$Error;

    const-string v1, "FaceNotFound"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v2}, Lcom/smartengines/engine/id/FacesResult$Error;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/smartengines/engine/id/FacesResult$Error;->FaceNotFound:Lcom/smartengines/engine/id/FacesResult$Error;

    .line 17
    new-instance v0, Lcom/smartengines/engine/id/FacesResult$Error;

    const-string v1, "NoAccumulatedResult"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v4, v2}, Lcom/smartengines/engine/id/FacesResult$Error;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/smartengines/engine/id/FacesResult$Error;->NoAccumulatedResult:Lcom/smartengines/engine/id/FacesResult$Error;

    invoke-static {}, Lcom/smartengines/engine/id/FacesResult$Error;->$values()[Lcom/smartengines/engine/id/FacesResult$Error;

    move-result-object v0

    sput-object v0, Lcom/smartengines/engine/id/FacesResult$Error;->$VALUES:[Lcom/smartengines/engine/id/FacesResult$Error;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/smartengines/engine/id/FacesResult$Error;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/smartengines/engine/id/FacesResult$Error$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/smartengines/engine/id/FacesResult$Error$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/smartengines/engine/id/FacesResult$Error;->Companion:Lcom/smartengines/engine/id/FacesResult$Error$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/smartengines/engine/id/FacesResult$Error;->code:I

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/smartengines/engine/id/FacesResult$Error;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/smartengines/engine/id/FacesResult$Error;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/smartengines/engine/id/FacesResult$Error;
    .locals 1

    const-class v0, Lcom/smartengines/engine/id/FacesResult$Error;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 21
    check-cast p0, Lcom/smartengines/engine/id/FacesResult$Error;

    return-object p0
.end method

.method public static values()[Lcom/smartengines/engine/id/FacesResult$Error;
    .locals 1

    sget-object v0, Lcom/smartengines/engine/id/FacesResult$Error;->$VALUES:[Lcom/smartengines/engine/id/FacesResult$Error;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 21
    check-cast v0, [Lcom/smartengines/engine/id/FacesResult$Error;

    return-object v0
.end method


# virtual methods
.method public final getCode()I
    .locals 1

    .line 13
    iget v0, p0, Lcom/smartengines/engine/id/FacesResult$Error;->code:I

    return v0
.end method
