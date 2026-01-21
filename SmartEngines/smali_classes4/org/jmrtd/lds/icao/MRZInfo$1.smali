.class synthetic Lorg/jmrtd/lds/icao/MRZInfo$1;
.super Ljava/lang/Object;
.source "MRZInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jmrtd/lds/icao/MRZInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$net$sf$scuba$data$Gender:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 867
    invoke-static {}, Lnet/sf/scuba/data/Gender;->values()[Lnet/sf/scuba/data/Gender;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lorg/jmrtd/lds/icao/MRZInfo$1;->$SwitchMap$net$sf$scuba$data$Gender:[I

    :try_start_0
    sget-object v1, Lnet/sf/scuba/data/Gender;->MALE:Lnet/sf/scuba/data/Gender;

    invoke-virtual {v1}, Lnet/sf/scuba/data/Gender;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lorg/jmrtd/lds/icao/MRZInfo$1;->$SwitchMap$net$sf$scuba$data$Gender:[I

    sget-object v1, Lnet/sf/scuba/data/Gender;->FEMALE:Lnet/sf/scuba/data/Gender;

    invoke-virtual {v1}, Lnet/sf/scuba/data/Gender;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
