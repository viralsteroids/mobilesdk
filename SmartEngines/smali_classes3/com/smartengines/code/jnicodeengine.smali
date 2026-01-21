.class public Lcom/smartengines/code/jnicodeengine;
.super Ljava/lang/Object;
.source "jnicodeengine.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static engineSettingsGroupFromString(Ljava/lang/String;)Lcom/smartengines/code/EngineSettingsGroup;
    .locals 0

    .line 13
    invoke-static {p0}, Lcom/smartengines/code/jnicodeengineJNI;->engineSettingsGroupFromString(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Lcom/smartengines/code/EngineSettingsGroup;->swigToEnum(I)Lcom/smartengines/code/EngineSettingsGroup;

    move-result-object p0

    return-object p0
.end method

.method public static presetToString(Lcom/smartengines/code/BarcodePreset;)Ljava/lang/String;
    .locals 0

    .line 21
    invoke-virtual {p0}, Lcom/smartengines/code/BarcodePreset;->swigValue()I

    move-result p0

    invoke-static {p0}, Lcom/smartengines/code/jnicodeengineJNI;->presetToString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toString(Lcom/smartengines/code/EngineSettingsGroup;)Ljava/lang/String;
    .locals 0

    .line 17
    invoke-virtual {p0}, Lcom/smartengines/code/EngineSettingsGroup;->swigValue()I

    move-result p0

    invoke-static {p0}, Lcom/smartengines/code/jnicodeengineJNI;->toString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
