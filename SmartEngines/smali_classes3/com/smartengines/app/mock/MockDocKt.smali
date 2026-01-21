.class public final Lcom/smartengines/app/mock/MockDocKt;
.super Ljava/lang/Object;
.source "MockDoc.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0011\u0010\u0000\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "mockDocResult",
        "Lcom/smartengines/engine/doc/DocResultData;",
        "getMockDocResult",
        "()Lcom/smartengines/engine/doc/DocResultData;",
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
.method public static final getMockDocResult()Lcom/smartengines/engine/doc/DocResultData;
    .locals 25

    .line 14
    new-instance v0, Lcom/smartengines/engine/doc/DocResultData;

    .line 15
    new-instance v1, Lcom/smartengines/engine/doc/DocumentData;

    .line 18
    new-instance v4, Lcom/smartengines/engine/doc/DocName;

    const-string/jumbo v2, "\u0424\u043e\u0440\u043c\u0430 2-\u041d\u0414\u0424\u041b"

    const-string v3, "2-\u041d\u0414\u0424\u041b"

    const-string v5, "Personal income form"

    invoke-direct {v4, v5, v2, v3}, Lcom/smartengines/engine/doc/DocName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x2

    .line 19
    new-array v3, v2, [Lkotlin/Pair;

    const-string/jumbo v5, "template"

    const-string v6, "rus.2ndfl.type1:main"

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v3, v6

    const-string v5, "page_count"

    const-string v7, "1"

    invoke-static {v5, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v8, 0x1

    aput-object v5, v3, v8

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    .line 21
    new-array v3, v2, [Lkotlin/Pair;

    new-instance v9, Lorg/json/JSONObject;

    const-string/jumbo v10, "{\n          \"info\": {\n            \"key\": \"birth_date\",\n            \"name\": {\n              \"default\": \"birth_date\",\n              \"local\": \"\u0414\u0430\u0442\u0430 \u0440\u043e\u0436\u0434\u0435\u043d\u0438\u044f\",\n              \"shortLocal\": \"\u0414\u0430\u0442\u0430 \u0440\u043e\u0436\u0434\u0435\u043d\u0438\u044f\"\n            },\n            \"confidence\": 0.9968043565750122,\n            \"isAccepted\": true,\n            \"attributes\": {\n              \"order\": \"2\"\n            },\n            \"geometries\": [\n              {\n                \"sceneId\": 0,\n                \"points\": [\n                  {\n                    \"x\": 1001.6207885742188,\n                    \"y\": 829.6555786132812\n                  },\n                  {\n                    \"x\": 1210.3980712890625,\n                    \"y\": 829.2437133789062\n                  },\n                  {\n                    \"x\": 1210.3980712890625,\n                    \"y\": 869.8695678710938\n                  },\n                  {\n                    \"x\": 1001.6207885742188,\n                    \"y\": 870.3015747070312\n                  }\n                ]\n              }\n            ]\n          },\n          \"value\": \"27.10.1971\"\n        }"

    invoke-direct {v9, v10}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 59
    invoke-static {v9}, Lcom/smartengines/engine/doc/DocResultJsonKt;->toTextField(Lorg/json/JSONObject;)Lcom/smartengines/engine/doc/TextField;

    move-result-object v9

    .line 21
    const-string v10, "birth_date"

    invoke-static {v10, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v3, v6

    .line 60
    new-instance v9, Lorg/json/JSONObject;

    const-string/jumbo v10, "{\n          \"info\": {\n            \"key\": \"surname\",\n            \"name\": {\n              \"default\": \"surname\",\n              \"local\": \"\u0424\u0430\u043c\u0438\u043b\u0438\u044f\",\n              \"shortLocal\": \"\u0424\u0430\u043c\u0438\u043b\u0438\u044f\"\n            },\n            \"confidence\": 0.9879308342933655,\n            \"isAccepted\": true,\n            \"attributes\": {\n              \"order\": \"39\"\n            },\n            \"geometries\": [\n              {\n                \"sceneId\": 0,\n                \"points\": [\n                  {\n                    \"x\": 392.16162109375,\n                    \"y\": 785.3642578125\n                  },\n                  {\n                    \"x\": 591.3628540039062,\n                    \"y\": 784.9927978515625\n                  },\n                  {\n                    \"x\": 591.3628540039062,\n                    \"y\": 823.28515625\n                  },\n                  {\n                    \"x\": 392.16162109375,\n                    \"y\": 823.6746826171875\n                  }\n                ]\n              }\n            ]\n          },\n          \"value\": \"\u041c\u0410\u042f\u0427\u0415\u041d\u041a\u041e\u0412\"\n        }"

    invoke-direct {v9, v10}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 98
    invoke-static {v9}, Lcom/smartengines/engine/doc/DocResultJsonKt;->toTextField(Lorg/json/JSONObject;)Lcom/smartengines/engine/doc/TextField;

    move-result-object v9

    .line 60
    const-string/jumbo v10, "surname"

    invoke-static {v10, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v3, v8

    .line 20
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    .line 101
    new-instance v9, Lcom/smartengines/engine/doc/TableField;

    .line 102
    new-instance v10, Lorg/json/JSONObject;

    const-string/jumbo v11, "{\n            \"key\": \"tax3_tab_0\",\n            \"name\": {\n              \"default\": \"tax3_tab_0\",\n              \"local\": \"\u0414\u043e\u0445\u043e\u0434\u044b \u043e\u0431\u043b\u0430\u0433\u0430\u0435\u043c\u044b\u0435 \u043f\u043e \u0441\u0442\u0430\u0432\u043a\u0435\",\n              \"shortLocal\": \"\u0414\u043e\u0445\u043e\u0434\u044b \u043e\u0431\u043b\u0430\u0433\u0430\u0435\u043c\u044b\u0435 \u043f\u043e \u0441\u0442\u0430\u0432\u043a\u0435\"\n            },\n            \"confidence\": 0.985852837562561,\n            \"isAccepted\": true,\n            \"attributes\": {\n              \"order\": \"43\"\n            },\n            \"geometries\": [\n              {\n                \"sceneId\": 0,\n                \"points\": [\n                  {\n                    \"x\": 0,\n                    \"y\": 969.4379272460938\n                  },\n                  {\n                    \"x\": 2143.40576171875,\n                    \"y\": 964.5089111328125\n                  },\n                  {\n                    \"x\": 2143.40576171875,\n                    \"y\": 1313.830322265625\n                  },\n                  {\n                    \"x\": 0,\n                    \"y\": 1320.5445556640625\n                  }\n                ]\n              }\n            ]\n          }"

    invoke-direct {v10, v11}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 137
    invoke-static {v10}, Lcom/smartengines/engine/doc/DocResultJsonKt;->toFieldInfo(Lorg/json/JSONObject;)Lcom/smartengines/engine/doc/FieldInfo;

    move-result-object v10

    const/4 v11, 0x3

    .line 138
    new-array v12, v11, [Ljava/lang/String;

    const-string/jumbo v13, "\u041c\u0435\u0441\u044f\u0446"

    aput-object v13, v12, v6

    const-string/jumbo v13, "\u041a\u043e\u0434 \u0434\u043e\u0445\u043e\u0434\u0430"

    aput-object v13, v12, v8

    const-string/jumbo v13, "\u0421\u0443\u043c\u043c\u0430 \u0434\u043e\u0445\u043e\u0434\u0430"

    aput-object v13, v12, v2

    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    .line 140
    new-array v13, v11, [Ljava/util/List;

    .line 141
    new-array v14, v11, [Lcom/smartengines/engine/doc/TextField;

    new-instance v15, Lcom/smartengines/engine/doc/TextField;

    new-instance v16, Lcom/smartengines/engine/doc/FieldInfo;

    const/16 v21, 0x1

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v22

    const-string v17, ""

    const/16 v18, 0x0

    const-wide v19, 0x4058c00000000000L    # 99.0

    invoke-direct/range {v16 .. v22}, Lcom/smartengines/engine/doc/FieldInfo;-><init>(Ljava/lang/String;Lcom/smartengines/engine/doc/DocName;DZLjava/util/Map;)V

    move/from16 v17, v2

    move-object/from16 v2, v16

    invoke-direct {v15, v2, v7}, Lcom/smartengines/engine/doc/TextField;-><init>(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/String;)V

    aput-object v15, v14, v6

    .line 142
    new-instance v2, Lcom/smartengines/engine/doc/TextField;

    new-instance v18, Lcom/smartengines/engine/doc/FieldInfo;

    const/16 v23, 0x1

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v24

    const-string v19, ""

    const/16 v20, 0x0

    const-wide v21, 0x4058c00000000000L    # 99.0

    invoke-direct/range {v18 .. v24}, Lcom/smartengines/engine/doc/FieldInfo;-><init>(Ljava/lang/String;Lcom/smartengines/engine/doc/DocName;DZLjava/util/Map;)V

    move-object/from16 v7, v18

    const-string v15, "2000"

    invoke-direct {v2, v7, v15}, Lcom/smartengines/engine/doc/TextField;-><init>(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/String;)V

    aput-object v2, v14, v8

    .line 143
    new-instance v2, Lcom/smartengines/engine/doc/TextField;

    new-instance v18, Lcom/smartengines/engine/doc/FieldInfo;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v24

    const-string v19, ""

    invoke-direct/range {v18 .. v24}, Lcom/smartengines/engine/doc/FieldInfo;-><init>(Ljava/lang/String;Lcom/smartengines/engine/doc/DocName;DZLjava/util/Map;)V

    move/from16 v16, v6

    move-object/from16 v7, v18

    const-string v6, "1100"

    invoke-direct {v2, v7, v6}, Lcom/smartengines/engine/doc/TextField;-><init>(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/String;)V

    aput-object v2, v14, v17

    .line 140
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    aput-object v2, v13, v16

    .line 146
    new-array v2, v11, [Lcom/smartengines/engine/doc/TextField;

    new-instance v6, Lcom/smartengines/engine/doc/TextField;

    new-instance v18, Lcom/smartengines/engine/doc/FieldInfo;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v24

    const-string v19, ""

    invoke-direct/range {v18 .. v24}, Lcom/smartengines/engine/doc/FieldInfo;-><init>(Ljava/lang/String;Lcom/smartengines/engine/doc/DocName;DZLjava/util/Map;)V

    move-object/from16 v7, v18

    const-string v14, "2"

    invoke-direct {v6, v7, v14}, Lcom/smartengines/engine/doc/TextField;-><init>(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/String;)V

    aput-object v6, v2, v16

    .line 147
    new-instance v6, Lcom/smartengines/engine/doc/TextField;

    new-instance v18, Lcom/smartengines/engine/doc/FieldInfo;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v24

    const-string v19, ""

    invoke-direct/range {v18 .. v24}, Lcom/smartengines/engine/doc/FieldInfo;-><init>(Ljava/lang/String;Lcom/smartengines/engine/doc/DocName;DZLjava/util/Map;)V

    move-object/from16 v7, v18

    invoke-direct {v6, v7, v15}, Lcom/smartengines/engine/doc/TextField;-><init>(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/String;)V

    aput-object v6, v2, v8

    .line 148
    new-instance v6, Lcom/smartengines/engine/doc/TextField;

    new-instance v18, Lcom/smartengines/engine/doc/FieldInfo;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v24

    const-string v19, ""

    invoke-direct/range {v18 .. v24}, Lcom/smartengines/engine/doc/FieldInfo;-><init>(Ljava/lang/String;Lcom/smartengines/engine/doc/DocName;DZLjava/util/Map;)V

    move-object/from16 v7, v18

    const-string v14, "1200"

    invoke-direct {v6, v7, v14}, Lcom/smartengines/engine/doc/TextField;-><init>(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/String;)V

    aput-object v6, v2, v17

    .line 145
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    aput-object v2, v13, v8

    .line 151
    new-array v2, v11, [Lcom/smartengines/engine/doc/TextField;

    new-instance v6, Lcom/smartengines/engine/doc/TextField;

    new-instance v18, Lcom/smartengines/engine/doc/FieldInfo;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v24

    const-string v19, ""

    invoke-direct/range {v18 .. v24}, Lcom/smartengines/engine/doc/FieldInfo;-><init>(Ljava/lang/String;Lcom/smartengines/engine/doc/DocName;DZLjava/util/Map;)V

    move-object/from16 v7, v18

    const-string v11, "3"

    invoke-direct {v6, v7, v11}, Lcom/smartengines/engine/doc/TextField;-><init>(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/String;)V

    aput-object v6, v2, v16

    .line 152
    new-instance v6, Lcom/smartengines/engine/doc/TextField;

    new-instance v18, Lcom/smartengines/engine/doc/FieldInfo;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v24

    const-string v19, ""

    invoke-direct/range {v18 .. v24}, Lcom/smartengines/engine/doc/FieldInfo;-><init>(Ljava/lang/String;Lcom/smartengines/engine/doc/DocName;DZLjava/util/Map;)V

    move-object/from16 v7, v18

    const-string v11, "2200"

    invoke-direct {v6, v7, v11}, Lcom/smartengines/engine/doc/TextField;-><init>(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/String;)V

    aput-object v6, v2, v8

    .line 153
    new-instance v6, Lcom/smartengines/engine/doc/TextField;

    new-instance v18, Lcom/smartengines/engine/doc/FieldInfo;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v24

    const-string v19, ""

    invoke-direct/range {v18 .. v24}, Lcom/smartengines/engine/doc/FieldInfo;-><init>(Ljava/lang/String;Lcom/smartengines/engine/doc/DocName;DZLjava/util/Map;)V

    move-object/from16 v7, v18

    const-string v8, "1300"

    invoke-direct {v6, v7, v8}, Lcom/smartengines/engine/doc/TextField;-><init>(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/String;)V

    aput-object v6, v2, v17

    .line 150
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    aput-object v2, v13, v17

    .line 139
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 101
    invoke-direct {v9, v10, v12, v2}, Lcom/smartengines/engine/doc/TableField;-><init>(Lcom/smartengines/engine/doc/FieldInfo;Ljava/util/List;Ljava/util/List;)V

    const-string/jumbo v2, "tax3_tab_0"

    invoke-static {v2, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 100
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    .line 158
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v2, 0x0

    move-object v6, v3

    .line 15
    const-string v3, "rus.2ndfl.type1"

    invoke-direct/range {v1 .. v9}, Lcom/smartengines/engine/doc/DocumentData;-><init>(ILjava/lang/String;Lcom/smartengines/engine/doc/DocName;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/smartengines/engine/doc/PhysicalDocumentData;)V

    .line 14
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/doc/DocResultData;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method
