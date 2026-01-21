.class public Lcom/smartengines/common/jnisecommonJNI;
.super Ljava/lang/Object;
.source "jnisecommonJNI.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native ByteString_CopyBase64ToBuffer(JLcom/smartengines/common/ByteString;Ljava/lang/String;I)I
.end method

.method public static final native ByteString_CopyHexToBuffer(JLcom/smartengines/common/ByteString;Ljava/lang/String;I)I
.end method

.method public static final native ByteString_GetBase64String(JLcom/smartengines/common/ByteString;)J
.end method

.method public static final native ByteString_GetHexString(JLcom/smartengines/common/ByteString;)J
.end method

.method public static final native ByteString_GetLength(JLcom/smartengines/common/ByteString;)I
.end method

.method public static final native ByteString_GetRequiredBase64BufferLength(JLcom/smartengines/common/ByteString;)I
.end method

.method public static final native ByteString_GetRequiredHexBufferLength(JLcom/smartengines/common/ByteString;)I
.end method

.method public static final native ByteString_swap(JLcom/smartengines/common/ByteString;JLcom/smartengines/common/ByteString;)V
.end method

.method public static final native IPF_G_get()I
.end method

.method public static final native Image_AverageChannels(JLcom/smartengines/common/Image;)V
.end method

.method public static final native Image_Clear(JLcom/smartengines/common/Image;)V
.end method

.method public static final native Image_CloneAveragedChannels(JLcom/smartengines/common/Image;)J
.end method

.method public static final native Image_CloneCroppedShallow(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;)J
.end method

.method public static final native Image_CloneCropped__SWIG_0(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;)J
.end method

.method public static final native Image_CloneCropped__SWIG_1(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;JLcom/smartengines/common/Size;)J
.end method

.method public static final native Image_CloneCropped__SWIG_2(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;)J
.end method

.method public static final native Image_CloneDeep(JLcom/smartengines/common/Image;)J
.end method

.method public static final native Image_CloneFilled__SWIG_0(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;IIIII)J
.end method

.method public static final native Image_CloneFilled__SWIG_1(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;IIII)J
.end method

.method public static final native Image_CloneFilled__SWIG_2(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;III)J
.end method

.method public static final native Image_CloneFilled__SWIG_3(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;II)J
.end method

.method public static final native Image_CloneFilled__SWIG_4(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;I)J
.end method

.method public static final native Image_CloneFilled__SWIG_5(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;IIIII)J
.end method

.method public static final native Image_CloneFilled__SWIG_6(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;IIII)J
.end method

.method public static final native Image_CloneFilled__SWIG_7(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;III)J
.end method

.method public static final native Image_CloneFilled__SWIG_8(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;II)J
.end method

.method public static final native Image_CloneFilled__SWIG_9(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;I)J
.end method

.method public static final native Image_CloneFlippedHorizontal(JLcom/smartengines/common/Image;)J
.end method

.method public static final native Image_CloneFlippedVertical(JLcom/smartengines/common/Image;)J
.end method

.method public static final native Image_CloneInverted(JLcom/smartengines/common/Image;)J
.end method

.method public static final native Image_CloneMasked__SWIG_0(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;I)J
.end method

.method public static final native Image_CloneMasked__SWIG_1(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;)J
.end method

.method public static final native Image_CloneMasked__SWIG_2(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;I)J
.end method

.method public static final native Image_CloneMasked__SWIG_3(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;)J
.end method

.method public static final native Image_CloneResized(JLcom/smartengines/common/Image;JLcom/smartengines/common/Size;)J
.end method

.method public static final native Image_CloneRotated90(JLcom/smartengines/common/Image;I)J
.end method

.method public static final native Image_CloneShallow(JLcom/smartengines/common/Image;)J
.end method

.method public static final native Image_CopyBase64ToBuffer(JLcom/smartengines/common/Image;Ljava/lang/String;I)I
.end method

.method public static final native Image_CopyToBuffer(JLcom/smartengines/common/Image;[B)I
.end method

.method public static final native Image_CreateEmpty()J
.end method

.method public static final native Image_Crop__SWIG_0(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;)V
.end method

.method public static final native Image_Crop__SWIG_1(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;JLcom/smartengines/common/Size;)V
.end method

.method public static final native Image_Crop__SWIG_2(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;)V
.end method

.method public static final native Image_EstimateFocusScore__SWIG_0(JLcom/smartengines/common/Image;D)D
.end method

.method public static final native Image_EstimateFocusScore__SWIG_1(JLcom/smartengines/common/Image;)D
.end method

.method public static final native Image_Fill__SWIG_0(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;IIIII)V
.end method

.method public static final native Image_Fill__SWIG_1(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;IIII)V
.end method

.method public static final native Image_Fill__SWIG_2(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;III)V
.end method

.method public static final native Image_Fill__SWIG_3(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;II)V
.end method

.method public static final native Image_Fill__SWIG_4(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;I)V
.end method

.method public static final native Image_Fill__SWIG_5(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;IIIII)V
.end method

.method public static final native Image_Fill__SWIG_6(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;IIII)V
.end method

.method public static final native Image_Fill__SWIG_7(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;III)V
.end method

.method public static final native Image_Fill__SWIG_8(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;II)V
.end method

.method public static final native Image_Fill__SWIG_9(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;I)V
.end method

.method public static final native Image_FlipHorizontal(JLcom/smartengines/common/Image;)V
.end method

.method public static final native Image_FlipVertical(JLcom/smartengines/common/Image;)V
.end method

.method public static final native Image_ForceMemoryOwner(JLcom/smartengines/common/Image;)V
.end method

.method public static final native Image_FromBase64Buffer__SWIG_0(Ljava/lang/String;IJLcom/smartengines/common/Size;)J
.end method

.method public static final native Image_FromBase64Buffer__SWIG_1(Ljava/lang/String;I)J
.end method

.method public static final native Image_FromBase64Buffer__SWIG_2(Ljava/lang/String;)J
.end method

.method public static final native Image_FromBuffer([BIIII)J
.end method

.method public static final native Image_FromBufferExtended([BIIIII)J
.end method

.method public static final native Image_FromFileBuffer__SWIG_0([BIJLcom/smartengines/common/Size;)J
.end method

.method public static final native Image_FromFileBuffer__SWIG_1([BI)J
.end method

.method public static final native Image_FromFileBuffer__SWIG_2([B)J
.end method

.method public static final native Image_FromFile__SWIG_0(Ljava/lang/String;IJLcom/smartengines/common/Size;)J
.end method

.method public static final native Image_FromFile__SWIG_1(Ljava/lang/String;I)J
.end method

.method public static final native Image_FromFile__SWIG_2(Ljava/lang/String;)J
.end method

.method public static final native Image_FromYUV([B[B[BJLcom/smartengines/common/YUVDimensions;)J
.end method

.method public static final native Image_FromYUVBuffer([BII)J
.end method

.method public static final native Image_GetBase64String(JLcom/smartengines/common/Image;)J
.end method

.method public static final native Image_GetChannels(JLcom/smartengines/common/Image;)I
.end method

.method public static final native Image_GetHeight(JLcom/smartengines/common/Image;)I
.end method

.method public static final native Image_GetImagePageName(Ljava/lang/String;I)J
.end method

.method public static final native Image_GetLayer(JLcom/smartengines/common/Image;Ljava/lang/String;)J
.end method

.method public static final native Image_GetLayerPtr(JLcom/smartengines/common/Image;Ljava/lang/String;)J
.end method

.method public static final native Image_GetNumberOfLayers(JLcom/smartengines/common/Image;)I
.end method

.method public static final native Image_GetNumberOfPages(Ljava/lang/String;)I
.end method

.method public static final native Image_GetRequiredBase64BufferLength(JLcom/smartengines/common/Image;)I
.end method

.method public static final native Image_GetRequiredBufferLength(JLcom/smartengines/common/Image;)I
.end method

.method public static final native Image_GetSize(JLcom/smartengines/common/Image;)J
.end method

.method public static final native Image_GetStride(JLcom/smartengines/common/Image;)I
.end method

.method public static final native Image_GetWidth(JLcom/smartengines/common/Image;)I
.end method

.method public static final native Image_HasLayer(JLcom/smartengines/common/Image;Ljava/lang/String;)Z
.end method

.method public static final native Image_HasLayers(JLcom/smartengines/common/Image;)Z
.end method

.method public static final native Image_Invert(JLcom/smartengines/common/Image;)V
.end method

.method public static final native Image_IsMemoryOwner(JLcom/smartengines/common/Image;)Z
.end method

.method public static final native Image_LayersBegin(JLcom/smartengines/common/Image;)J
.end method

.method public static final native Image_LayersEnd(JLcom/smartengines/common/Image;)J
.end method

.method public static final native Image_Mask__SWIG_0(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;ID)V
.end method

.method public static final native Image_Mask__SWIG_1(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;I)V
.end method

.method public static final native Image_Mask__SWIG_2(JLcom/smartengines/common/Image;JLcom/smartengines/common/Rectangle;)V
.end method

.method public static final native Image_Mask__SWIG_3(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;ID)V
.end method

.method public static final native Image_Mask__SWIG_4(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;I)V
.end method

.method public static final native Image_Mask__SWIG_5(JLcom/smartengines/common/Image;JLcom/smartengines/common/Quadrangle;)V
.end method

.method public static final native Image_RemoveLayer(JLcom/smartengines/common/Image;Ljava/lang/String;)V
.end method

.method public static final native Image_RemoveLayers(JLcom/smartengines/common/Image;)V
.end method

.method public static final native Image_Resize(JLcom/smartengines/common/Image;JLcom/smartengines/common/Size;)V
.end method

.method public static final native Image_Rotate90(JLcom/smartengines/common/Image;I)V
.end method

.method public static final native Image_Save(JLcom/smartengines/common/Image;Ljava/lang/String;)V
.end method

.method public static final native Image_Serialize(JLcom/smartengines/common/Image;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native Image_SetLayer(JLcom/smartengines/common/Image;Ljava/lang/String;JLcom/smartengines/common/Image;)V
.end method

.method public static final native Image_SetLayerWithOwnership(JLcom/smartengines/common/Image;Ljava/lang/String;JLcom/smartengines/common/Image;)V
.end method

.method public static final native ImagesMapIterator_Advance(JLcom/smartengines/common/ImagesMapIterator;)V
.end method

.method public static final native ImagesMapIterator_Equals(JLcom/smartengines/common/ImagesMapIterator;JLcom/smartengines/common/ImagesMapIterator;)Z
.end method

.method public static final native ImagesMapIterator_GetKey(JLcom/smartengines/common/ImagesMapIterator;)Ljava/lang/String;
.end method

.method public static final native ImagesMapIterator_GetValue(JLcom/smartengines/common/ImagesMapIterator;)J
.end method

.method public static final native MutableString_GetCStr(JLcom/smartengines/common/MutableString;)Ljava/lang/String;
.end method

.method public static final native MutableString_GetLength(JLcom/smartengines/common/MutableString;)I
.end method

.method public static final native MutableString_Serialize(JLcom/smartengines/common/MutableString;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native OcrCharVariant_GetCharacter(JLcom/smartengines/common/OcrCharVariant;)Ljava/lang/String;
.end method

.method public static final native OcrCharVariant_GetConfidence(JLcom/smartengines/common/OcrCharVariant;)F
.end method

.method public static final native OcrCharVariant_GetInternalScore(JLcom/smartengines/common/OcrCharVariant;)F
.end method

.method public static final native OcrCharVariant_Serialize(JLcom/smartengines/common/OcrCharVariant;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native OcrCharVariant_SetCharacter__SWIG_0(JLcom/smartengines/common/OcrCharVariant;JLcom/smartengines/common/MutableString;)V
.end method

.method public static final native OcrCharVariant_SetCharacter__SWIG_1(JLcom/smartengines/common/OcrCharVariant;Ljava/lang/String;)V
.end method

.method public static final native OcrCharVariant_SetConfidence(JLcom/smartengines/common/OcrCharVariant;F)V
.end method

.method public static final native OcrCharVariant_SetInternalScore(JLcom/smartengines/common/OcrCharVariant;F)V
.end method

.method public static final native OcrChar_GetFirstVariant(JLcom/smartengines/common/OcrChar;)J
.end method

.method public static final native OcrChar_GetIsHighlighted(JLcom/smartengines/common/OcrChar;)Z
.end method

.method public static final native OcrChar_GetMutableQuadrangle(JLcom/smartengines/common/OcrChar;)J
.end method

.method public static final native OcrChar_GetMutableVariant(JLcom/smartengines/common/OcrChar;I)J
.end method

.method public static final native OcrChar_GetQuadrangle(JLcom/smartengines/common/OcrChar;)J
.end method

.method public static final native OcrChar_GetVariant(JLcom/smartengines/common/OcrChar;I)J
.end method

.method public static final native OcrChar_GetVariants(JLcom/smartengines/common/OcrChar;)J
.end method

.method public static final native OcrChar_GetVariantsCount(JLcom/smartengines/common/OcrChar;)I
.end method

.method public static final native OcrChar_Resize(JLcom/smartengines/common/OcrChar;I)V
.end method

.method public static final native OcrChar_Serialize(JLcom/smartengines/common/OcrChar;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native OcrChar_SetIsHighlighted(JLcom/smartengines/common/OcrChar;Z)V
.end method

.method public static final native OcrChar_SetQuadrangle(JLcom/smartengines/common/OcrChar;JLcom/smartengines/common/Quadrangle;)V
.end method

.method public static final native OcrChar_SetVariant(JLcom/smartengines/common/OcrChar;IJLcom/smartengines/common/OcrCharVariant;)V
.end method

.method public static final native OcrChar_SortVariants(JLcom/smartengines/common/OcrChar;)V
.end method

.method public static final native OcrPair_GetCharacter(JLcom/smartengines/common/OcrPair;)Ljava/lang/String;
.end method

.method public static final native OcrPair_GetConfidence(JLcom/smartengines/common/OcrPair;)S
.end method

.method public static final native OcrPair_Serialize(JLcom/smartengines/common/OcrPair;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native OcrPair_SetCharacter__SWIG_0(JLcom/smartengines/common/OcrPair;JLcom/smartengines/common/MutableString;)V
.end method

.method public static final native OcrPair_SetCharacter__SWIG_1(JLcom/smartengines/common/OcrPair;Ljava/lang/String;)V
.end method

.method public static final native OcrPair_SetConfidence__SWIG_0(JLcom/smartengines/common/OcrPair;F)V
.end method

.method public static final native OcrPair_SetConfidence__SWIG_1(JLcom/smartengines/common/OcrPair;I)V
.end method

.method public static final native OcrString_AppendChar(JLcom/smartengines/common/OcrString;JLcom/smartengines/common/OcrChar;)V
.end method

.method public static final native OcrString_AppendString(JLcom/smartengines/common/OcrString;JLcom/smartengines/common/OcrString;)V
.end method

.method public static final native OcrString_GetAcceptFlag(JLcom/smartengines/common/OcrString;)Z
.end method

.method public static final native OcrString_GetBestVariantConfidenceByIndex(JLcom/smartengines/common/OcrString;I)F
.end method

.method public static final native OcrString_GetCellAcceptFlagByIndex(JLcom/smartengines/common/OcrString;I)Z
.end method

.method public static final native OcrString_GetChar(JLcom/smartengines/common/OcrString;I)J
.end method

.method public static final native OcrString_GetChars(JLcom/smartengines/common/OcrString;)J
.end method

.method public static final native OcrString_GetCharsCount(JLcom/smartengines/common/OcrString;)I
.end method

.method public static final native OcrString_GetFirstString(JLcom/smartengines/common/OcrString;)J
.end method

.method public static final native OcrString_GetMutableChar(JLcom/smartengines/common/OcrString;I)J
.end method

.method public static final native OcrString_GetPairTable(JLcom/smartengines/common/OcrString;)J
.end method

.method public static final native OcrString_GetQuadrangleByIndex(JLcom/smartengines/common/OcrString;I)J
.end method

.method public static final native OcrString_RepackChars(JLcom/smartengines/common/OcrString;)V
.end method

.method public static final native OcrString_Resize(JLcom/smartengines/common/OcrString;I)V
.end method

.method public static final native OcrString_Serialize(JLcom/smartengines/common/OcrString;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native OcrString_SetChar(JLcom/smartengines/common/OcrString;IJLcom/smartengines/common/OcrChar;)V
.end method

.method public static final native OcrString_SortVariants(JLcom/smartengines/common/OcrString;)V
.end method

.method public static final native OcrString_UnpackChars(JLcom/smartengines/common/OcrString;)V
.end method

.method public static final native Point_Serialize(JLcom/smartengines/common/Point;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native Point_x_get(JLcom/smartengines/common/Point;)D
.end method

.method public static final native Point_x_set(JLcom/smartengines/common/Point;D)V
.end method

.method public static final native Point_y_get(JLcom/smartengines/common/Point;)D
.end method

.method public static final native Point_y_set(JLcom/smartengines/common/Point;D)V
.end method

.method public static final native Polygon_GetBoundingRectangle(JLcom/smartengines/common/Polygon;)J
.end method

.method public static final native Polygon_GetMutablePoint(JLcom/smartengines/common/Polygon;I)J
.end method

.method public static final native Polygon_GetPoint(JLcom/smartengines/common/Polygon;I)J
.end method

.method public static final native Polygon_GetPoints(JLcom/smartengines/common/Polygon;)J
.end method

.method public static final native Polygon_GetPointsCount(JLcom/smartengines/common/Polygon;)I
.end method

.method public static final native Polygon_Resize(JLcom/smartengines/common/Polygon;I)V
.end method

.method public static final native Polygon_Serialize(JLcom/smartengines/common/Polygon;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native Polygon_SetPoint(JLcom/smartengines/common/Polygon;IJLcom/smartengines/common/Point;)V
.end method

.method public static final native ProjectiveTransform_CanCreate__SWIG_0(JLcom/smartengines/common/Quadrangle;JLcom/smartengines/common/Quadrangle;)Z
.end method

.method public static final native ProjectiveTransform_CanCreate__SWIG_1(JLcom/smartengines/common/Quadrangle;JLcom/smartengines/common/Size;)Z
.end method

.method public static final native ProjectiveTransform_Clone(JLcom/smartengines/common/ProjectiveTransform;)J
.end method

.method public static final native ProjectiveTransform_CloneInverted(JLcom/smartengines/common/ProjectiveTransform;)J
.end method

.method public static final native ProjectiveTransform_Create__SWIG_0()J
.end method

.method public static final native ProjectiveTransform_Create__SWIG_1(JLcom/smartengines/common/Quadrangle;JLcom/smartengines/common/Quadrangle;)J
.end method

.method public static final native ProjectiveTransform_Create__SWIG_2(JLcom/smartengines/common/Quadrangle;JLcom/smartengines/common/Size;)J
.end method

.method public static final native ProjectiveTransform_Invert(JLcom/smartengines/common/ProjectiveTransform;)V
.end method

.method public static final native ProjectiveTransform_IsInvertable(JLcom/smartengines/common/ProjectiveTransform;)Z
.end method

.method public static final native ProjectiveTransform_Serialize(JLcom/smartengines/common/ProjectiveTransform;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native ProjectiveTransform_TransformPoint(JLcom/smartengines/common/ProjectiveTransform;JLcom/smartengines/common/Point;)J
.end method

.method public static final native ProjectiveTransform_TransformPolygon(JLcom/smartengines/common/ProjectiveTransform;JLcom/smartengines/common/Polygon;)J
.end method

.method public static final native ProjectiveTransform_TransformQuad(JLcom/smartengines/common/ProjectiveTransform;JLcom/smartengines/common/Quadrangle;)J
.end method

.method public static final native Quadrangle_GetBoundingRectangle(JLcom/smartengines/common/Quadrangle;)J
.end method

.method public static final native Quadrangle_GetMutablePoint(JLcom/smartengines/common/Quadrangle;I)J
.end method

.method public static final native Quadrangle_GetPoint(JLcom/smartengines/common/Quadrangle;I)J
.end method

.method public static final native Quadrangle_Serialize(JLcom/smartengines/common/Quadrangle;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native Quadrangle_SetPoint(JLcom/smartengines/common/Quadrangle;IJLcom/smartengines/common/Point;)V
.end method

.method public static final native QuadranglesMapIterator_Advance(JLcom/smartengines/common/QuadranglesMapIterator;)V
.end method

.method public static final native QuadranglesMapIterator_Equals(JLcom/smartengines/common/QuadranglesMapIterator;JLcom/smartengines/common/QuadranglesMapIterator;)Z
.end method

.method public static final native QuadranglesMapIterator_GetKey(JLcom/smartengines/common/QuadranglesMapIterator;)Ljava/lang/String;
.end method

.method public static final native QuadranglesMapIterator_GetValue(JLcom/smartengines/common/QuadranglesMapIterator;)J
.end method

.method public static final native QuadranglesVectorIterator_Advance(JLcom/smartengines/common/QuadranglesVectorIterator;)V
.end method

.method public static final native QuadranglesVectorIterator_Equals(JLcom/smartengines/common/QuadranglesVectorIterator;JLcom/smartengines/common/QuadranglesVectorIterator;)Z
.end method

.method public static final native QuadranglesVectorIterator_GetValue(JLcom/smartengines/common/QuadranglesVectorIterator;)J
.end method

.method public static final native Rectangle_Serialize(JLcom/smartengines/common/Rectangle;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native Rectangle_height_get(JLcom/smartengines/common/Rectangle;)I
.end method

.method public static final native Rectangle_height_set(JLcom/smartengines/common/Rectangle;I)V
.end method

.method public static final native Rectangle_width_get(JLcom/smartengines/common/Rectangle;)I
.end method

.method public static final native Rectangle_width_set(JLcom/smartengines/common/Rectangle;I)V
.end method

.method public static final native Rectangle_x_get(JLcom/smartengines/common/Rectangle;)I
.end method

.method public static final native Rectangle_x_set(JLcom/smartengines/common/Rectangle;I)V
.end method

.method public static final native Rectangle_y_get(JLcom/smartengines/common/Rectangle;)I
.end method

.method public static final native Rectangle_y_set(JLcom/smartengines/common/Rectangle;I)V
.end method

.method public static final native RectanglesVectorIterator_Advance(JLcom/smartengines/common/RectanglesVectorIterator;)V
.end method

.method public static final native RectanglesVectorIterator_Equals(JLcom/smartengines/common/RectanglesVectorIterator;JLcom/smartengines/common/RectanglesVectorIterator;)Z
.end method

.method public static final native RectanglesVectorIterator_GetValue(JLcom/smartengines/common/RectanglesVectorIterator;)J
.end method

.method public static final native SerializationParameters_AddIgnoredKey(JLcom/smartengines/common/SerializationParameters;Ljava/lang/String;)V
.end method

.method public static final native SerializationParameters_AddIgnoredObjectType(JLcom/smartengines/common/SerializationParameters;Ljava/lang/String;)V
.end method

.method public static final native SerializationParameters_HasIgnoredKey(JLcom/smartengines/common/SerializationParameters;Ljava/lang/String;)Z
.end method

.method public static final native SerializationParameters_HasIgnoredObjectType(JLcom/smartengines/common/SerializationParameters;Ljava/lang/String;)Z
.end method

.method public static final native SerializationParameters_IgnoredKeysBegin(JLcom/smartengines/common/SerializationParameters;)J
.end method

.method public static final native SerializationParameters_IgnoredKeysEnd(JLcom/smartengines/common/SerializationParameters;)J
.end method

.method public static final native SerializationParameters_IgnoredObjectTypesBegin(JLcom/smartengines/common/SerializationParameters;)J
.end method

.method public static final native SerializationParameters_IgnoredObjectTypesEnd(JLcom/smartengines/common/SerializationParameters;)J
.end method

.method public static final native SerializationParameters_RemoveIgnoredKey(JLcom/smartengines/common/SerializationParameters;Ljava/lang/String;)V
.end method

.method public static final native SerializationParameters_RemoveIgnoredObjectType(JLcom/smartengines/common/SerializationParameters;Ljava/lang/String;)V
.end method

.method public static final native Serializer_CreateJSONSerializer(JLcom/smartengines/common/SerializationParameters;)J
.end method

.method public static final native Serializer_GetCStr(JLcom/smartengines/common/Serializer;)Ljava/lang/String;
.end method

.method public static final native Serializer_Reset(JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native Serializer_SerializerType(JLcom/smartengines/common/Serializer;)Ljava/lang/String;
.end method

.method public static final native Size_Serialize(JLcom/smartengines/common/Size;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native Size_height_get(JLcom/smartengines/common/Size;)I
.end method

.method public static final native Size_height_set(JLcom/smartengines/common/Size;I)V
.end method

.method public static final native Size_width_get(JLcom/smartengines/common/Size;)I
.end method

.method public static final native Size_width_set(JLcom/smartengines/common/Size;I)V
.end method

.method public static final native StringsMapIterator_Advance(JLcom/smartengines/common/StringsMapIterator;)V
.end method

.method public static final native StringsMapIterator_Equals(JLcom/smartengines/common/StringsMapIterator;JLcom/smartengines/common/StringsMapIterator;)Z
.end method

.method public static final native StringsMapIterator_GetKey(JLcom/smartengines/common/StringsMapIterator;)Ljava/lang/String;
.end method

.method public static final native StringsMapIterator_GetValue(JLcom/smartengines/common/StringsMapIterator;)Ljava/lang/String;
.end method

.method public static final native StringsSetIterator_Advance(JLcom/smartengines/common/StringsSetIterator;)V
.end method

.method public static final native StringsSetIterator_Equals(JLcom/smartengines/common/StringsSetIterator;JLcom/smartengines/common/StringsSetIterator;)Z
.end method

.method public static final native StringsSetIterator_GetValue(JLcom/smartengines/common/StringsSetIterator;)Ljava/lang/String;
.end method

.method public static final native StringsSet_GetStringsCount(JLcom/smartengines/common/StringsSet;)I
.end method

.method public static final native StringsSet_HasString(JLcom/smartengines/common/StringsSet;Ljava/lang/String;)Z
.end method

.method public static final native StringsSet_StringsBegin(JLcom/smartengines/common/StringsSet;)J
.end method

.method public static final native StringsSet_StringsEnd(JLcom/smartengines/common/StringsSet;)J
.end method

.method public static final native StringsVectorIterator_Advance(JLcom/smartengines/common/StringsVectorIterator;)V
.end method

.method public static final native StringsVectorIterator_Equals(JLcom/smartengines/common/StringsVectorIterator;JLcom/smartengines/common/StringsVectorIterator;)Z
.end method

.method public static final native StringsVectorIterator_GetValue(JLcom/smartengines/common/StringsVectorIterator;)Ljava/lang/String;
.end method

.method public static final native YUVDimensions_height_get(JLcom/smartengines/common/YUVDimensions;)I
.end method

.method public static final native YUVDimensions_height_set(JLcom/smartengines/common/YUVDimensions;I)V
.end method

.method public static final native YUVDimensions_type_get(JLcom/smartengines/common/YUVDimensions;)I
.end method

.method public static final native YUVDimensions_type_set(JLcom/smartengines/common/YUVDimensions;I)V
.end method

.method public static final native YUVDimensions_u_plane_pixel_stride_get(JLcom/smartengines/common/YUVDimensions;)I
.end method

.method public static final native YUVDimensions_u_plane_pixel_stride_set(JLcom/smartengines/common/YUVDimensions;I)V
.end method

.method public static final native YUVDimensions_u_plane_row_stride_get(JLcom/smartengines/common/YUVDimensions;)I
.end method

.method public static final native YUVDimensions_u_plane_row_stride_set(JLcom/smartengines/common/YUVDimensions;I)V
.end method

.method public static final native YUVDimensions_v_plane_pixel_stride_get(JLcom/smartengines/common/YUVDimensions;)I
.end method

.method public static final native YUVDimensions_v_plane_pixel_stride_set(JLcom/smartengines/common/YUVDimensions;I)V
.end method

.method public static final native YUVDimensions_v_plane_row_stride_get(JLcom/smartengines/common/YUVDimensions;)I
.end method

.method public static final native YUVDimensions_v_plane_row_stride_set(JLcom/smartengines/common/YUVDimensions;I)V
.end method

.method public static final native YUVDimensions_width_get(JLcom/smartengines/common/YUVDimensions;)I
.end method

.method public static final native YUVDimensions_width_set(JLcom/smartengines/common/YUVDimensions;I)V
.end method

.method public static final native YUVDimensions_y_plane_pixel_stride_get(JLcom/smartengines/common/YUVDimensions;)I
.end method

.method public static final native YUVDimensions_y_plane_pixel_stride_set(JLcom/smartengines/common/YUVDimensions;I)V
.end method

.method public static final native YUVDimensions_y_plane_row_stride_get(JLcom/smartengines/common/YUVDimensions;)I
.end method

.method public static final native YUVDimensions_y_plane_row_stride_set(JLcom/smartengines/common/YUVDimensions;I)V
.end method

.method public static final native YUVTYPE_420_888_get()I
.end method

.method public static final native YUVTYPE_NV21_get()I
.end method

.method public static final native YUVTYPE_UNDEFINED_get()I
.end method

.method public static final native delete_ByteString(J)V
.end method

.method public static final native delete_Image(J)V
.end method

.method public static final native delete_ImagesMapIterator(J)V
.end method

.method public static final native delete_MutableString(J)V
.end method

.method public static final native delete_OcrChar(J)V
.end method

.method public static final native delete_OcrCharVariant(J)V
.end method

.method public static final native delete_OcrPair(J)V
.end method

.method public static final native delete_OcrString(J)V
.end method

.method public static final native delete_Point(J)V
.end method

.method public static final native delete_Polygon(J)V
.end method

.method public static final native delete_ProjectiveTransform(J)V
.end method

.method public static final native delete_Quadrangle(J)V
.end method

.method public static final native delete_QuadranglesMapIterator(J)V
.end method

.method public static final native delete_QuadranglesVectorIterator(J)V
.end method

.method public static final native delete_Rectangle(J)V
.end method

.method public static final native delete_RectanglesVectorIterator(J)V
.end method

.method public static final native delete_SerializationParameters(J)V
.end method

.method public static final native delete_Serializer(J)V
.end method

.method public static final native delete_Size(J)V
.end method

.method public static final native delete_StringsMapIterator(J)V
.end method

.method public static final native delete_StringsSet(J)V
.end method

.method public static final native delete_StringsSetIterator(J)V
.end method

.method public static final native delete_StringsVectorIterator(J)V
.end method

.method public static final native delete_YUVDimensions(J)V
.end method

.method public static final native new_ByteString__SWIG_0()J
.end method

.method public static final native new_ByteString__SWIG_1([B)J
.end method

.method public static final native new_ByteString__SWIG_2(JLcom/smartengines/common/ByteString;)J
.end method

.method public static final native new_ImagesMapIterator(JLcom/smartengines/common/ImagesMapIterator;)J
.end method

.method public static final native new_MutableString__SWIG_0()J
.end method

.method public static final native new_MutableString__SWIG_1(Ljava/lang/String;)J
.end method

.method public static final native new_MutableString__SWIG_2(JLcom/smartengines/common/MutableString;)J
.end method

.method public static final native new_OcrCharVariant__SWIG_0()J
.end method

.method public static final native new_OcrCharVariant__SWIG_1(JLcom/smartengines/common/MutableString;F)J
.end method

.method public static final native new_OcrCharVariant__SWIG_2(Ljava/lang/String;F)J
.end method

.method public static final native new_OcrChar__SWIG_0()J
.end method

.method public static final native new_OcrChar__SWIG_1(JLcom/smartengines/common/OcrCharVariant;IZJLcom/smartengines/common/Quadrangle;)J
.end method

.method public static final native new_OcrChar__SWIG_2(JLcom/smartengines/common/OcrChar;)J
.end method

.method public static final native new_OcrPair__SWIG_0()J
.end method

.method public static final native new_OcrPair__SWIG_1(JLcom/smartengines/common/MutableString;F)J
.end method

.method public static final native new_OcrPair__SWIG_2(Ljava/lang/String;F)J
.end method

.method public static final native new_OcrPair__SWIG_3(JLcom/smartengines/common/MutableString;I)J
.end method

.method public static final native new_OcrPair__SWIG_4(Ljava/lang/String;I)J
.end method

.method public static final native new_OcrString__SWIG_0()J
.end method

.method public static final native new_OcrString__SWIG_1(Ljava/lang/String;)J
.end method

.method public static final native new_OcrString__SWIG_2(JLcom/smartengines/common/OcrChar;I)J
.end method

.method public static final native new_OcrString__SWIG_3(JLcom/smartengines/common/OcrString;)J
.end method

.method public static final native new_Point__SWIG_0()J
.end method

.method public static final native new_Point__SWIG_1(DD)J
.end method

.method public static final native new_Polygon__SWIG_0()J
.end method

.method public static final native new_Polygon__SWIG_1(JLcom/smartengines/common/Point;I)J
.end method

.method public static final native new_Polygon__SWIG_2(JLcom/smartengines/common/Polygon;)J
.end method

.method public static final native new_Quadrangle__SWIG_0()J
.end method

.method public static final native new_Quadrangle__SWIG_1(JLcom/smartengines/common/Point;JLcom/smartengines/common/Point;JLcom/smartengines/common/Point;JLcom/smartengines/common/Point;)J
.end method

.method public static final native new_QuadranglesMapIterator(JLcom/smartengines/common/QuadranglesMapIterator;)J
.end method

.method public static final native new_QuadranglesVectorIterator(JLcom/smartengines/common/QuadranglesVectorIterator;)J
.end method

.method public static final native new_Rectangle__SWIG_0()J
.end method

.method public static final native new_Rectangle__SWIG_1(IIII)J
.end method

.method public static final native new_RectanglesVectorIterator(JLcom/smartengines/common/RectanglesVectorIterator;)J
.end method

.method public static final native new_SerializationParameters__SWIG_0()J
.end method

.method public static final native new_SerializationParameters__SWIG_1(JLcom/smartengines/common/SerializationParameters;)J
.end method

.method public static final native new_Size__SWIG_0()J
.end method

.method public static final native new_Size__SWIG_1(II)J
.end method

.method public static final native new_StringsMapIterator(JLcom/smartengines/common/StringsMapIterator;)J
.end method

.method public static final native new_StringsSetIterator(JLcom/smartengines/common/StringsSetIterator;)J
.end method

.method public static final native new_StringsVectorIterator(JLcom/smartengines/common/StringsVectorIterator;)J
.end method

.method public static final native new_YUVDimensions__SWIG_0()J
.end method

.method public static final native new_YUVDimensions__SWIG_1(IIIIIIIII)J
.end method
