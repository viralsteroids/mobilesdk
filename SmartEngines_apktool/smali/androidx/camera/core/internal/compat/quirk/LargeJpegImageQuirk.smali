.class public final Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;
.super Ljava/lang/Object;
.source "LargeJpegImageQuirk.java"

# interfaces
.implements Landroidx/camera/core/impl/Quirk;


# static fields
.field private static final INVALID_JPEG_DATA_CHECK_THRESHOLD:I = 0x989680

.field private static final SAMSUNG_DEVICE_MODELS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final VIVO_DEVICE_MODELS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 44
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x1f

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "SM-A520F"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "SM-A520L"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "SM-A520K"

    const/4 v5, 0x2

    aput-object v2, v1, v5

    const-string v2, "SM-A520S"

    const/4 v6, 0x3

    aput-object v2, v1, v6

    const/4 v2, 0x4

    const-string v7, "SM-A520X"

    aput-object v7, v1, v2

    const/4 v2, 0x5

    const-string v7, "SM-A520W"

    aput-object v7, v1, v2

    const/4 v2, 0x6

    const-string v7, "SM-A525F"

    aput-object v7, v1, v2

    const/4 v2, 0x7

    const-string v7, "SM-A525M"

    aput-object v7, v1, v2

    const/16 v2, 0x8

    const-string v7, "SM-A705F"

    aput-object v7, v1, v2

    const/16 v2, 0x9

    const-string v7, "SM-A705FN"

    aput-object v7, v1, v2

    const/16 v2, 0xa

    const-string v7, "SM-A705GM"

    aput-object v7, v1, v2

    const/16 v2, 0xb

    const-string v7, "SM-A705MN"

    aput-object v7, v1, v2

    const/16 v2, 0xc

    const-string v7, "SM-A7050"

    aput-object v7, v1, v2

    const/16 v2, 0xd

    const-string v7, "SM-A705W"

    aput-object v7, v1, v2

    const/16 v2, 0xe

    const-string v7, "SM-A705YN"

    aput-object v7, v1, v2

    const/16 v2, 0xf

    const-string v7, "SM-A705U"

    aput-object v7, v1, v2

    const/16 v2, 0x10

    const-string v7, "SM-A715F"

    aput-object v7, v1, v2

    const/16 v2, 0x11

    const-string v7, "SM-A715F/DS"

    aput-object v7, v1, v2

    const/16 v2, 0x12

    const-string v7, "SM-A715F/DSM"

    aput-object v7, v1, v2

    const/16 v2, 0x13

    const-string v7, "SM-A715F/DSN"

    aput-object v7, v1, v2

    const/16 v2, 0x14

    const-string v7, "SM-A715W"

    aput-object v7, v1, v2

    const/16 v2, 0x15

    const-string v7, "SM-A715X"

    aput-object v7, v1, v2

    const/16 v2, 0x16

    const-string v7, "SM-A725F"

    aput-object v7, v1, v2

    const/16 v2, 0x17

    const-string v7, "SM-A725M"

    aput-object v7, v1, v2

    const/16 v2, 0x18

    const-string v7, "SM-M515F"

    aput-object v7, v1, v2

    const/16 v2, 0x19

    const-string v7, "SM-M515F/DSN"

    aput-object v7, v1, v2

    const/16 v2, 0x1a

    const-string v7, "SM-G930T"

    aput-object v7, v1, v2

    const/16 v2, 0x1b

    const-string v7, "SM-G930V"

    aput-object v7, v1, v2

    const/16 v2, 0x1c

    const-string v7, "SM-S901B"

    aput-object v7, v1, v2

    const/16 v2, 0x1d

    const-string v7, "SM-S901B/DS"

    aput-object v7, v1, v2

    const/16 v2, 0x1e

    const-string v7, "SM-S906B"

    aput-object v7, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->SAMSUNG_DEVICE_MODELS:Ljava/util/Set;

    .line 87
    new-instance v0, Ljava/util/HashSet;

    new-array v1, v6, [Ljava/lang/String;

    const-string v2, "V2244A"

    aput-object v2, v1, v3

    const-string v2, "V2045"

    aput-object v2, v1, v4

    const-string v2, "V2046"

    aput-object v2, v1, v5

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->VIVO_DEVICE_MODELS:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static isSamsungDevice()Z
    .locals 2

    .line 106
    const-string v0, "Samsung"

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static isSamsungProblematicDevice()Z
    .locals 3

    .line 101
    const-string v0, "Samsung"

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->SAMSUNG_DEVICE_MODELS:Ljava/util/Set;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 101
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static isVivoProblematicDevice()Z
    .locals 3

    .line 110
    const-string v0, "Vivo"

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->VIVO_DEVICE_MODELS:Ljava/util/Set;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 111
    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 110
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static load()Z
    .locals 1

    .line 97
    invoke-static {}, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->isSamsungDevice()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->isVivoProblematicDevice()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public shouldCheckInvalidJpegData([B)Z
    .locals 2

    .line 119
    invoke-static {}, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->isSamsungProblematicDevice()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    invoke-static {}, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->isVivoProblematicDevice()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 123
    :cond_0
    array-length p1, p1

    const v0, 0x989680

    if-le p1, v0, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    return v1
.end method
