.class public Lcom/smartengines/code/CodeObject;
.super Ljava/lang/Object;
.source "CodeObject.java"


# instance fields
.field protected transient swigCMemOwn:Z

.field private transient swigCPtr:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 54
    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->new_CodeObject__SWIG_0()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/smartengines/code/CodeObject;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-boolean p3, p0, Lcom/smartengines/code/CodeObject;->swigCMemOwn:Z

    .line 19
    iput-wide p1, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/code/CodeObject;)V
    .locals 2

    .line 70
    invoke-static {p1}, Lcom/smartengines/code/CodeObject;->getCPtr(Lcom/smartengines/code/CodeObject;)J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/smartengines/code/jnicodeengineJNI;->new_CodeObject__SWIG_4(JLcom/smartengines/code/CodeObject;)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-direct {p0, v0, v1, p1}, Lcom/smartengines/code/CodeObject;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/smartengines/code/CodeObjectType;)V
    .locals 1

    .line 66
    invoke-virtual {p2}, Lcom/smartengines/code/CodeObjectType;->swigValue()I

    move-result p2

    invoke-static {p1, p2}, Lcom/smartengines/code/jnicodeengineJNI;->new_CodeObject__SWIG_3(Ljava/lang/String;I)J

    move-result-wide p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/smartengines/code/CodeObject;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/smartengines/code/CodeObjectType;Z)V
    .locals 0

    .line 62
    invoke-virtual {p2}, Lcom/smartengines/code/CodeObjectType;->swigValue()I

    move-result p2

    invoke-static {p1, p2, p3}, Lcom/smartengines/code/jnicodeengineJNI;->new_CodeObject__SWIG_2(Ljava/lang/String;IZ)J

    move-result-wide p1

    const/4 p3, 0x1

    invoke-direct {p0, p1, p2, p3}, Lcom/smartengines/code/CodeObject;-><init>(JZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/smartengines/code/CodeObjectType;ZF)V
    .locals 0

    .line 58
    invoke-virtual {p2}, Lcom/smartengines/code/CodeObjectType;->swigValue()I

    move-result p2

    invoke-static {p1, p2, p3, p4}, Lcom/smartengines/code/jnicodeengineJNI;->new_CodeObject__SWIG_1(Ljava/lang/String;IZF)J

    move-result-wide p1

    const/4 p3, 0x1

    invoke-direct {p0, p1, p2, p3}, Lcom/smartengines/code/CodeObject;-><init>(JZ)V

    return-void
.end method

.method public static getCPtr(Lcom/smartengines/code/CodeObject;)J
    .locals 2

    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    return-wide v0
.end method

.method public static swigRelease(Lcom/smartengines/code/CodeObject;)J
    .locals 3

    if-eqz p0, :cond_1

    .line 29
    iget-boolean v0, p0, Lcom/smartengines/code/CodeObject;->swigCMemOwn:Z

    if-eqz v0, :cond_0

    .line 31
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    const/4 v2, 0x0

    .line 32
    iput-boolean v2, p0, Lcom/smartengines/code/CodeObject;->swigCMemOwn:Z

    .line 33
    invoke-virtual {p0}, Lcom/smartengines/code/CodeObject;->delete()V

    return-wide v0

    .line 30
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Cannot release ownership as memory is not owned"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const-wide/16 v0, 0x0

    return-wide v0
.end method


# virtual methods
.method public AttributesBegin()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 222
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_AttributesBegin(JLcom/smartengines/code/CodeObject;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public AttributesEnd()Lcom/smartengines/common/StringsMapIterator;
    .locals 4

    .line 226
    new-instance v0, Lcom/smartengines/common/StringsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_AttributesEnd(JLcom/smartengines/code/CodeObject;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/StringsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ComponentsBegin()Lcom/smartengines/common/QuadranglesMapIterator;
    .locals 4

    .line 170
    new-instance v0, Lcom/smartengines/common/QuadranglesMapIterator;

    iget-wide v1, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_ComponentsBegin(JLcom/smartengines/code/CodeObject;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/QuadranglesMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public ComponentsEnd()Lcom/smartengines/common/QuadranglesMapIterator;
    .locals 4

    .line 174
    new-instance v0, Lcom/smartengines/common/QuadranglesMapIterator;

    iget-wide v1, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_ComponentsEnd(JLcom/smartengines/code/CodeObject;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/QuadranglesMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public FieldsBegin()Lcom/smartengines/code/CodeFieldsMapIterator;
    .locals 4

    .line 198
    new-instance v0, Lcom/smartengines/code/CodeFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_FieldsBegin(JLcom/smartengines/code/CodeObject;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/code/CodeFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public FieldsEnd()Lcom/smartengines/code/CodeFieldsMapIterator;
    .locals 4

    .line 202
    new-instance v0, Lcom/smartengines/code/CodeFieldsMapIterator;

    iget-wide v1, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_FieldsEnd(JLcom/smartengines/code/CodeObject;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/code/CodeFieldsMapIterator;-><init>(JZ)V

    return-object v0
.end method

.method public GetAttribute(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 210
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetAttribute(JLcom/smartengines/code/CodeObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public GetAttributesCount()I
    .locals 2

    .line 206
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetAttributesCount(JLcom/smartengines/code/CodeObject;)I

    move-result v0

    return v0
.end method

.method public GetComponent(Ljava/lang/String;)Lcom/smartengines/common/Quadrangle;
    .locals 3

    .line 158
    new-instance v0, Lcom/smartengines/common/Quadrangle;

    iget-wide v1, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetComponent(JLcom/smartengines/code/CodeObject;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/common/Quadrangle;-><init>(JZ)V

    return-object v0
.end method

.method public GetComponentsCount()I
    .locals 2

    .line 154
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetComponentsCount(JLcom/smartengines/code/CodeObject;)I

    move-result v0

    return v0
.end method

.method public GetConfidence()F
    .locals 2

    .line 98
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetConfidence(JLcom/smartengines/code/CodeObject;)F

    move-result v0

    return v0
.end method

.method public GetField(Ljava/lang/String;)Lcom/smartengines/code/CodeField;
    .locals 3

    .line 182
    new-instance v0, Lcom/smartengines/code/CodeField;

    iget-wide v1, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v1, v2, p0, p1}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetField(JLcom/smartengines/code/CodeObject;Ljava/lang/String;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lcom/smartengines/code/CodeField;-><init>(JZ)V

    return-object v0
.end method

.method public GetFieldsCount()I
    .locals 2

    .line 178
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetFieldsCount(JLcom/smartengines/code/CodeObject;)I

    move-result v0

    return v0
.end method

.method public GetFirstDetectedFrame()I
    .locals 2

    .line 110
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetFirstDetectedFrame(JLcom/smartengines/code/CodeObject;)I

    move-result v0

    return v0
.end method

.method public GetID()I
    .locals 2

    .line 74
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetID(JLcom/smartengines/code/CodeObject;)I

    move-result v0

    return v0
.end method

.method public GetImage()Lcom/smartengines/common/Image;
    .locals 4

    .line 142
    new-instance v0, Lcom/smartengines/common/Image;

    iget-wide v1, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetImage(JLcom/smartengines/code/CodeObject;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/Image;-><init>(JZ)V

    return-object v0
.end method

.method public GetIsTerminal()Z
    .locals 2

    .line 118
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetIsTerminal(JLcom/smartengines/code/CodeObject;)Z

    move-result v0

    return v0
.end method

.method public GetLastUpdatedFrame()I
    .locals 2

    .line 114
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetLastUpdatedFrame(JLcom/smartengines/code/CodeObject;)I

    move-result v0

    return v0
.end method

.method public GetName()Ljava/lang/String;
    .locals 2

    .line 86
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetName(JLcom/smartengines/code/CodeObject;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public GetQuadrangle()Lcom/smartengines/common/Quadrangle;
    .locals 4

    .line 130
    new-instance v0, Lcom/smartengines/common/Quadrangle;

    iget-wide v1, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v1, v2, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetQuadrangle(JLcom/smartengines/code/CodeObject;)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/smartengines/common/Quadrangle;-><init>(JZ)V

    return-object v0
.end method

.method public GetType()Lcom/smartengines/code/CodeObjectType;
    .locals 2

    .line 78
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetType(JLcom/smartengines/code/CodeObject;)I

    move-result v0

    invoke-static {v0}, Lcom/smartengines/code/CodeObjectType;->swigToEnum(I)Lcom/smartengines/code/CodeObjectType;

    move-result-object v0

    return-object v0
.end method

.method public GetTypeStr()Ljava/lang/String;
    .locals 2

    .line 82
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_GetTypeStr(JLcom/smartengines/code/CodeObject;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public HasAttribute(Ljava/lang/String;)Z
    .locals 2

    .line 214
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_HasAttribute(JLcom/smartengines/code/CodeObject;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasComponent(Ljava/lang/String;)Z
    .locals 2

    .line 166
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_HasComponent(JLcom/smartengines/code/CodeObject;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasField(Ljava/lang/String;)Z
    .locals 2

    .line 190
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_HasField(JLcom/smartengines/code/CodeObject;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public HasImage()Z
    .locals 2

    .line 138
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_HasImage(JLcom/smartengines/code/CodeObject;)Z

    move-result v0

    return v0
.end method

.method public HasQuadrangle()Z
    .locals 2

    .line 126
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_HasQuadrangle(JLcom/smartengines/code/CodeObject;)Z

    move-result v0

    return v0
.end method

.method public IsAccepted()Z
    .locals 2

    .line 90
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_IsAccepted(JLcom/smartengines/code/CodeObject;)Z

    move-result v0

    return v0
.end method

.method public IsValidated()Z
    .locals 2

    .line 94
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_IsValidated(JLcom/smartengines/code/CodeObject;)Z

    move-result v0

    return v0
.end method

.method public RemoveField(Ljava/lang/String;)V
    .locals 2

    .line 194
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_RemoveField(JLcom/smartengines/code/CodeObject;Ljava/lang/String;)V

    return-void
.end method

.method public RemoveImage()V
    .locals 2

    .line 150
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_RemoveImage(JLcom/smartengines/code/CodeObject;)V

    return-void
.end method

.method public SetAttribute(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 218
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1, p2}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_SetAttribute(JLcom/smartengines/code/CodeObject;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public SetComponent(Ljava/lang/String;Lcom/smartengines/common/Quadrangle;)V
    .locals 7

    .line 162
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_SetComponent(JLcom/smartengines/code/CodeObject;Ljava/lang/String;JLcom/smartengines/common/Quadrangle;)V

    return-void
.end method

.method public SetField(Ljava/lang/String;Lcom/smartengines/code/CodeField;)V
    .locals 7

    .line 186
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {p2}, Lcom/smartengines/code/CodeField;->getCPtr(Lcom/smartengines/code/CodeField;)J

    move-result-wide v4

    move-object v2, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v0 .. v6}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_SetField(JLcom/smartengines/code/CodeObject;Ljava/lang/String;JLcom/smartengines/code/CodeField;)V

    return-void
.end method

.method public SetFirstDetectedFrame(I)V
    .locals 2

    .line 102
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_SetFirstDetectedFrame(JLcom/smartengines/code/CodeObject;I)V

    return-void
.end method

.method public SetImage(Lcom/smartengines/common/Image;)V
    .locals 6

    .line 146
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Image;->getCPtr(Lcom/smartengines/common/Image;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_SetImage(JLcom/smartengines/code/CodeObject;JLcom/smartengines/common/Image;)V

    return-void
.end method

.method public SetIsTerminal(Z)V
    .locals 2

    .line 122
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_SetIsTerminal(JLcom/smartengines/code/CodeObject;Z)V

    return-void
.end method

.method public SetLastUpdatedFrame(I)V
    .locals 2

    .line 106
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {v0, v1, p0, p1}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_SetLastUpdatedFrame(JLcom/smartengines/code/CodeObject;I)V

    return-void
.end method

.method public SetQuadrangle(Lcom/smartengines/common/Quadrangle;)V
    .locals 6

    .line 134
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    invoke-static {p1}, Lcom/smartengines/common/Quadrangle;->getCPtr(Lcom/smartengines/common/Quadrangle;)J

    move-result-wide v3

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/smartengines/code/jnicodeengineJNI;->CodeObject_SetQuadrangle(JLcom/smartengines/code/CodeObject;JLcom/smartengines/common/Quadrangle;)V

    return-void
.end method

.method public declared-synchronized delete()V
    .locals 5

    monitor-enter p0

    .line 44
    :try_start_0
    iget-wide v0, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 45
    iget-boolean v4, p0, Lcom/smartengines/code/CodeObject;->swigCMemOwn:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 46
    iput-boolean v4, p0, Lcom/smartengines/code/CodeObject;->swigCMemOwn:Z

    .line 47
    invoke-static {v0, v1}, Lcom/smartengines/code/jnicodeengineJNI;->delete_CodeObject(J)V

    .line 49
    :cond_0
    iput-wide v2, p0, Lcom/smartengines/code/CodeObject;->swigCPtr:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected finalize()V
    .locals 0

    .line 40
    invoke-virtual {p0}, Lcom/smartengines/code/CodeObject;->delete()V

    return-void
.end method
