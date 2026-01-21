.class public final Lcom/smartengines/app/PassportKeyKt;
.super Ljava/lang/Object;
.source "PassportKey.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPassportKey.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PassportKey.kt\ncom/smartengines/app/PassportKeyKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n1863#2:33\n1864#2:35\n1#3:34\n*S KotlinDebug\n*F\n+ 1 PassportKey.kt\ncom/smartengines/app/PassportKeyKt\n*L\n14#1:33\n14#1:35\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u000c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "calculatePassportKey",
        "Lcom/smartengines/nfc/PassportKey;",
        "Lcom/smartengines/engine/code/CodeResultData;",
        "Lcom/smartengines/engine/id/IdResultData;",
        "app_storeRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final calculatePassportKey(Lcom/smartengines/engine/code/CodeResultData;)Lcom/smartengines/nfc/PassportKey;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 14
    :try_start_0
    invoke-virtual {p0}, Lcom/smartengines/engine/code/CodeResultData;->getObjects()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 33
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/smartengines/engine/code/CodeObjectData;

    .line 15
    invoke-virtual {v1}, Lcom/smartengines/engine/code/CodeObjectData;->getFields()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/smartengines/engine/code/CodeObjectField;

    invoke-virtual {v3}, Lcom/smartengines/engine/code/CodeObjectField;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "full_mrz"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    move-object v2, v0

    :goto_0
    check-cast v2, Lcom/smartengines/engine/code/CodeObjectField;

    if-eqz v2, :cond_0

    .line 16
    sget-object p0, Lcom/smartengines/nfc/PassportKey;->Companion:Lcom/smartengines/nfc/PassportKey$Companion;

    invoke-virtual {v2}, Lcom/smartengines/engine/code/CodeObjectField;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/smartengines/nfc/PassportKey$Companion;->fromMRZ(Ljava/lang/String;)Lcom/smartengines/nfc/PassportKey;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_3
    return-object v0
.end method

.method public static final calculatePassportKey(Lcom/smartengines/engine/id/IdResultData;)Lcom/smartengines/nfc/PassportKey;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 25
    :try_start_0
    invoke-virtual {p0}, Lcom/smartengines/engine/id/IdResultData;->getTextFields()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/smartengines/engine/id/TextField;

    invoke-virtual {v2}, Lcom/smartengines/engine/id/TextField;->getKey()Ljava/lang/String;

    move-result-object v2

    const-string v3, "full_mrz"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    check-cast v1, Lcom/smartengines/engine/id/TextField;

    if-eqz v1, :cond_2

    .line 26
    sget-object p0, Lcom/smartengines/nfc/PassportKey;->Companion:Lcom/smartengines/nfc/PassportKey$Companion;

    invoke-virtual {v1}, Lcom/smartengines/engine/id/TextField;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/smartengines/nfc/PassportKey$Companion;->fromMRZ(Ljava/lang/String;)Lcom/smartengines/nfc/PassportKey;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_2
    return-object v0
.end method
