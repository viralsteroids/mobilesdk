package com.smartengines.common;

/* loaded from: classes3.dex */
public class jnisecommonJNI {
    public static final native int ByteString_CopyBase64ToBuffer(long j, ByteString byteString, String str, int i);

    public static final native int ByteString_CopyHexToBuffer(long j, ByteString byteString, String str, int i);

    public static final native long ByteString_GetBase64String(long j, ByteString byteString);

    public static final native long ByteString_GetHexString(long j, ByteString byteString);

    public static final native int ByteString_GetLength(long j, ByteString byteString);

    public static final native int ByteString_GetRequiredBase64BufferLength(long j, ByteString byteString);

    public static final native int ByteString_GetRequiredHexBufferLength(long j, ByteString byteString);

    public static final native void ByteString_swap(long j, ByteString byteString, long j2, ByteString byteString2);

    public static final native int IPF_G_get();

    public static final native void Image_AverageChannels(long j, Image image);

    public static final native void Image_Clear(long j, Image image);

    public static final native long Image_CloneAveragedChannels(long j, Image image);

    public static final native long Image_CloneCroppedShallow(long j, Image image, long j2, Rectangle rectangle);

    public static final native long Image_CloneCropped__SWIG_0(long j, Image image, long j2, Quadrangle quadrangle);

    public static final native long Image_CloneCropped__SWIG_1(long j, Image image, long j2, Quadrangle quadrangle, long j3, Size size);

    public static final native long Image_CloneCropped__SWIG_2(long j, Image image, long j2, Rectangle rectangle);

    public static final native long Image_CloneDeep(long j, Image image);

    public static final native long Image_CloneFilled__SWIG_0(long j, Image image, long j2, Rectangle rectangle, int i, int i2, int i3, int i4, int i5);

    public static final native long Image_CloneFilled__SWIG_1(long j, Image image, long j2, Rectangle rectangle, int i, int i2, int i3, int i4);

    public static final native long Image_CloneFilled__SWIG_2(long j, Image image, long j2, Rectangle rectangle, int i, int i2, int i3);

    public static final native long Image_CloneFilled__SWIG_3(long j, Image image, long j2, Rectangle rectangle, int i, int i2);

    public static final native long Image_CloneFilled__SWIG_4(long j, Image image, long j2, Rectangle rectangle, int i);

    public static final native long Image_CloneFilled__SWIG_5(long j, Image image, long j2, Quadrangle quadrangle, int i, int i2, int i3, int i4, int i5);

    public static final native long Image_CloneFilled__SWIG_6(long j, Image image, long j2, Quadrangle quadrangle, int i, int i2, int i3, int i4);

    public static final native long Image_CloneFilled__SWIG_7(long j, Image image, long j2, Quadrangle quadrangle, int i, int i2, int i3);

    public static final native long Image_CloneFilled__SWIG_8(long j, Image image, long j2, Quadrangle quadrangle, int i, int i2);

    public static final native long Image_CloneFilled__SWIG_9(long j, Image image, long j2, Quadrangle quadrangle, int i);

    public static final native long Image_CloneFlippedHorizontal(long j, Image image);

    public static final native long Image_CloneFlippedVertical(long j, Image image);

    public static final native long Image_CloneInverted(long j, Image image);

    public static final native long Image_CloneMasked__SWIG_0(long j, Image image, long j2, Rectangle rectangle, int i);

    public static final native long Image_CloneMasked__SWIG_1(long j, Image image, long j2, Rectangle rectangle);

    public static final native long Image_CloneMasked__SWIG_2(long j, Image image, long j2, Quadrangle quadrangle, int i);

    public static final native long Image_CloneMasked__SWIG_3(long j, Image image, long j2, Quadrangle quadrangle);

    public static final native long Image_CloneResized(long j, Image image, long j2, Size size);

    public static final native long Image_CloneRotated90(long j, Image image, int i);

    public static final native long Image_CloneShallow(long j, Image image);

    public static final native int Image_CopyBase64ToBuffer(long j, Image image, String str, int i);

    public static final native int Image_CopyToBuffer(long j, Image image, byte[] bArr);

    public static final native long Image_CreateEmpty();

    public static final native void Image_Crop__SWIG_0(long j, Image image, long j2, Quadrangle quadrangle);

    public static final native void Image_Crop__SWIG_1(long j, Image image, long j2, Quadrangle quadrangle, long j3, Size size);

    public static final native void Image_Crop__SWIG_2(long j, Image image, long j2, Rectangle rectangle);

    public static final native double Image_EstimateFocusScore__SWIG_0(long j, Image image, double d);

    public static final native double Image_EstimateFocusScore__SWIG_1(long j, Image image);

    public static final native void Image_Fill__SWIG_0(long j, Image image, long j2, Rectangle rectangle, int i, int i2, int i3, int i4, int i5);

    public static final native void Image_Fill__SWIG_1(long j, Image image, long j2, Rectangle rectangle, int i, int i2, int i3, int i4);

    public static final native void Image_Fill__SWIG_2(long j, Image image, long j2, Rectangle rectangle, int i, int i2, int i3);

    public static final native void Image_Fill__SWIG_3(long j, Image image, long j2, Rectangle rectangle, int i, int i2);

    public static final native void Image_Fill__SWIG_4(long j, Image image, long j2, Rectangle rectangle, int i);

    public static final native void Image_Fill__SWIG_5(long j, Image image, long j2, Quadrangle quadrangle, int i, int i2, int i3, int i4, int i5);

    public static final native void Image_Fill__SWIG_6(long j, Image image, long j2, Quadrangle quadrangle, int i, int i2, int i3, int i4);

    public static final native void Image_Fill__SWIG_7(long j, Image image, long j2, Quadrangle quadrangle, int i, int i2, int i3);

    public static final native void Image_Fill__SWIG_8(long j, Image image, long j2, Quadrangle quadrangle, int i, int i2);

    public static final native void Image_Fill__SWIG_9(long j, Image image, long j2, Quadrangle quadrangle, int i);

    public static final native void Image_FlipHorizontal(long j, Image image);

    public static final native void Image_FlipVertical(long j, Image image);

    public static final native void Image_ForceMemoryOwner(long j, Image image);

    public static final native long Image_FromBase64Buffer__SWIG_0(String str, int i, long j, Size size);

    public static final native long Image_FromBase64Buffer__SWIG_1(String str, int i);

    public static final native long Image_FromBase64Buffer__SWIG_2(String str);

    public static final native long Image_FromBuffer(byte[] bArr, int i, int i2, int i3, int i4);

    public static final native long Image_FromBufferExtended(byte[] bArr, int i, int i2, int i3, int i4, int i5);

    public static final native long Image_FromFileBuffer__SWIG_0(byte[] bArr, int i, long j, Size size);

    public static final native long Image_FromFileBuffer__SWIG_1(byte[] bArr, int i);

    public static final native long Image_FromFileBuffer__SWIG_2(byte[] bArr);

    public static final native long Image_FromFile__SWIG_0(String str, int i, long j, Size size);

    public static final native long Image_FromFile__SWIG_1(String str, int i);

    public static final native long Image_FromFile__SWIG_2(String str);

    public static final native long Image_FromYUV(byte[] bArr, byte[] bArr2, byte[] bArr3, long j, YUVDimensions yUVDimensions);

    public static final native long Image_FromYUVBuffer(byte[] bArr, int i, int i2);

    public static final native long Image_GetBase64String(long j, Image image);

    public static final native int Image_GetChannels(long j, Image image);

    public static final native int Image_GetHeight(long j, Image image);

    public static final native long Image_GetImagePageName(String str, int i);

    public static final native long Image_GetLayer(long j, Image image, String str);

    public static final native long Image_GetLayerPtr(long j, Image image, String str);

    public static final native int Image_GetNumberOfLayers(long j, Image image);

    public static final native int Image_GetNumberOfPages(String str);

    public static final native int Image_GetRequiredBase64BufferLength(long j, Image image);

    public static final native int Image_GetRequiredBufferLength(long j, Image image);

    public static final native long Image_GetSize(long j, Image image);

    public static final native int Image_GetStride(long j, Image image);

    public static final native int Image_GetWidth(long j, Image image);

    public static final native boolean Image_HasLayer(long j, Image image, String str);

    public static final native boolean Image_HasLayers(long j, Image image);

    public static final native void Image_Invert(long j, Image image);

    public static final native boolean Image_IsMemoryOwner(long j, Image image);

    public static final native long Image_LayersBegin(long j, Image image);

    public static final native long Image_LayersEnd(long j, Image image);

    public static final native void Image_Mask__SWIG_0(long j, Image image, long j2, Rectangle rectangle, int i, double d);

    public static final native void Image_Mask__SWIG_1(long j, Image image, long j2, Rectangle rectangle, int i);

    public static final native void Image_Mask__SWIG_2(long j, Image image, long j2, Rectangle rectangle);

    public static final native void Image_Mask__SWIG_3(long j, Image image, long j2, Quadrangle quadrangle, int i, double d);

    public static final native void Image_Mask__SWIG_4(long j, Image image, long j2, Quadrangle quadrangle, int i);

    public static final native void Image_Mask__SWIG_5(long j, Image image, long j2, Quadrangle quadrangle);

    public static final native void Image_RemoveLayer(long j, Image image, String str);

    public static final native void Image_RemoveLayers(long j, Image image);

    public static final native void Image_Resize(long j, Image image, long j2, Size size);

    public static final native void Image_Rotate90(long j, Image image, int i);

    public static final native void Image_Save(long j, Image image, String str);

    public static final native void Image_Serialize(long j, Image image, long j2, Serializer serializer);

    public static final native void Image_SetLayer(long j, Image image, String str, long j2, Image image2);

    public static final native void Image_SetLayerWithOwnership(long j, Image image, String str, long j2, Image image2);

    public static final native void ImagesMapIterator_Advance(long j, ImagesMapIterator imagesMapIterator);

    public static final native boolean ImagesMapIterator_Equals(long j, ImagesMapIterator imagesMapIterator, long j2, ImagesMapIterator imagesMapIterator2);

    public static final native String ImagesMapIterator_GetKey(long j, ImagesMapIterator imagesMapIterator);

    public static final native long ImagesMapIterator_GetValue(long j, ImagesMapIterator imagesMapIterator);

    public static final native String MutableString_GetCStr(long j, MutableString mutableString);

    public static final native int MutableString_GetLength(long j, MutableString mutableString);

    public static final native void MutableString_Serialize(long j, MutableString mutableString, long j2, Serializer serializer);

    public static final native String OcrCharVariant_GetCharacter(long j, OcrCharVariant ocrCharVariant);

    public static final native float OcrCharVariant_GetConfidence(long j, OcrCharVariant ocrCharVariant);

    public static final native float OcrCharVariant_GetInternalScore(long j, OcrCharVariant ocrCharVariant);

    public static final native void OcrCharVariant_Serialize(long j, OcrCharVariant ocrCharVariant, long j2, Serializer serializer);

    public static final native void OcrCharVariant_SetCharacter__SWIG_0(long j, OcrCharVariant ocrCharVariant, long j2, MutableString mutableString);

    public static final native void OcrCharVariant_SetCharacter__SWIG_1(long j, OcrCharVariant ocrCharVariant, String str);

    public static final native void OcrCharVariant_SetConfidence(long j, OcrCharVariant ocrCharVariant, float f);

    public static final native void OcrCharVariant_SetInternalScore(long j, OcrCharVariant ocrCharVariant, float f);

    public static final native long OcrChar_GetFirstVariant(long j, OcrChar ocrChar);

    public static final native boolean OcrChar_GetIsHighlighted(long j, OcrChar ocrChar);

    public static final native long OcrChar_GetMutableQuadrangle(long j, OcrChar ocrChar);

    public static final native long OcrChar_GetMutableVariant(long j, OcrChar ocrChar, int i);

    public static final native long OcrChar_GetQuadrangle(long j, OcrChar ocrChar);

    public static final native long OcrChar_GetVariant(long j, OcrChar ocrChar, int i);

    public static final native long OcrChar_GetVariants(long j, OcrChar ocrChar);

    public static final native int OcrChar_GetVariantsCount(long j, OcrChar ocrChar);

    public static final native void OcrChar_Resize(long j, OcrChar ocrChar, int i);

    public static final native void OcrChar_Serialize(long j, OcrChar ocrChar, long j2, Serializer serializer);

    public static final native void OcrChar_SetIsHighlighted(long j, OcrChar ocrChar, boolean z);

    public static final native void OcrChar_SetQuadrangle(long j, OcrChar ocrChar, long j2, Quadrangle quadrangle);

    public static final native void OcrChar_SetVariant(long j, OcrChar ocrChar, int i, long j2, OcrCharVariant ocrCharVariant);

    public static final native void OcrChar_SortVariants(long j, OcrChar ocrChar);

    public static final native String OcrPair_GetCharacter(long j, OcrPair ocrPair);

    public static final native short OcrPair_GetConfidence(long j, OcrPair ocrPair);

    public static final native void OcrPair_Serialize(long j, OcrPair ocrPair, long j2, Serializer serializer);

    public static final native void OcrPair_SetCharacter__SWIG_0(long j, OcrPair ocrPair, long j2, MutableString mutableString);

    public static final native void OcrPair_SetCharacter__SWIG_1(long j, OcrPair ocrPair, String str);

    public static final native void OcrPair_SetConfidence__SWIG_0(long j, OcrPair ocrPair, float f);

    public static final native void OcrPair_SetConfidence__SWIG_1(long j, OcrPair ocrPair, int i);

    public static final native void OcrString_AppendChar(long j, OcrString ocrString, long j2, OcrChar ocrChar);

    public static final native void OcrString_AppendString(long j, OcrString ocrString, long j2, OcrString ocrString2);

    public static final native boolean OcrString_GetAcceptFlag(long j, OcrString ocrString);

    public static final native float OcrString_GetBestVariantConfidenceByIndex(long j, OcrString ocrString, int i);

    public static final native boolean OcrString_GetCellAcceptFlagByIndex(long j, OcrString ocrString, int i);

    public static final native long OcrString_GetChar(long j, OcrString ocrString, int i);

    public static final native long OcrString_GetChars(long j, OcrString ocrString);

    public static final native int OcrString_GetCharsCount(long j, OcrString ocrString);

    public static final native long OcrString_GetFirstString(long j, OcrString ocrString);

    public static final native long OcrString_GetMutableChar(long j, OcrString ocrString, int i);

    public static final native long OcrString_GetPairTable(long j, OcrString ocrString);

    public static final native long OcrString_GetQuadrangleByIndex(long j, OcrString ocrString, int i);

    public static final native void OcrString_RepackChars(long j, OcrString ocrString);

    public static final native void OcrString_Resize(long j, OcrString ocrString, int i);

    public static final native void OcrString_Serialize(long j, OcrString ocrString, long j2, Serializer serializer);

    public static final native void OcrString_SetChar(long j, OcrString ocrString, int i, long j2, OcrChar ocrChar);

    public static final native void OcrString_SortVariants(long j, OcrString ocrString);

    public static final native void OcrString_UnpackChars(long j, OcrString ocrString);

    public static final native void Point_Serialize(long j, Point point, long j2, Serializer serializer);

    public static final native double Point_x_get(long j, Point point);

    public static final native void Point_x_set(long j, Point point, double d);

    public static final native double Point_y_get(long j, Point point);

    public static final native void Point_y_set(long j, Point point, double d);

    public static final native long Polygon_GetBoundingRectangle(long j, Polygon polygon);

    public static final native long Polygon_GetMutablePoint(long j, Polygon polygon, int i);

    public static final native long Polygon_GetPoint(long j, Polygon polygon, int i);

    public static final native long Polygon_GetPoints(long j, Polygon polygon);

    public static final native int Polygon_GetPointsCount(long j, Polygon polygon);

    public static final native void Polygon_Resize(long j, Polygon polygon, int i);

    public static final native void Polygon_Serialize(long j, Polygon polygon, long j2, Serializer serializer);

    public static final native void Polygon_SetPoint(long j, Polygon polygon, int i, long j2, Point point);

    public static final native boolean ProjectiveTransform_CanCreate__SWIG_0(long j, Quadrangle quadrangle, long j2, Quadrangle quadrangle2);

    public static final native boolean ProjectiveTransform_CanCreate__SWIG_1(long j, Quadrangle quadrangle, long j2, Size size);

    public static final native long ProjectiveTransform_Clone(long j, ProjectiveTransform projectiveTransform);

    public static final native long ProjectiveTransform_CloneInverted(long j, ProjectiveTransform projectiveTransform);

    public static final native long ProjectiveTransform_Create__SWIG_0();

    public static final native long ProjectiveTransform_Create__SWIG_1(long j, Quadrangle quadrangle, long j2, Quadrangle quadrangle2);

    public static final native long ProjectiveTransform_Create__SWIG_2(long j, Quadrangle quadrangle, long j2, Size size);

    public static final native void ProjectiveTransform_Invert(long j, ProjectiveTransform projectiveTransform);

    public static final native boolean ProjectiveTransform_IsInvertable(long j, ProjectiveTransform projectiveTransform);

    public static final native void ProjectiveTransform_Serialize(long j, ProjectiveTransform projectiveTransform, long j2, Serializer serializer);

    public static final native long ProjectiveTransform_TransformPoint(long j, ProjectiveTransform projectiveTransform, long j2, Point point);

    public static final native long ProjectiveTransform_TransformPolygon(long j, ProjectiveTransform projectiveTransform, long j2, Polygon polygon);

    public static final native long ProjectiveTransform_TransformQuad(long j, ProjectiveTransform projectiveTransform, long j2, Quadrangle quadrangle);

    public static final native long Quadrangle_GetBoundingRectangle(long j, Quadrangle quadrangle);

    public static final native long Quadrangle_GetMutablePoint(long j, Quadrangle quadrangle, int i);

    public static final native long Quadrangle_GetPoint(long j, Quadrangle quadrangle, int i);

    public static final native void Quadrangle_Serialize(long j, Quadrangle quadrangle, long j2, Serializer serializer);

    public static final native void Quadrangle_SetPoint(long j, Quadrangle quadrangle, int i, long j2, Point point);

    public static final native void QuadranglesMapIterator_Advance(long j, QuadranglesMapIterator quadranglesMapIterator);

    public static final native boolean QuadranglesMapIterator_Equals(long j, QuadranglesMapIterator quadranglesMapIterator, long j2, QuadranglesMapIterator quadranglesMapIterator2);

    public static final native String QuadranglesMapIterator_GetKey(long j, QuadranglesMapIterator quadranglesMapIterator);

    public static final native long QuadranglesMapIterator_GetValue(long j, QuadranglesMapIterator quadranglesMapIterator);

    public static final native void QuadranglesVectorIterator_Advance(long j, QuadranglesVectorIterator quadranglesVectorIterator);

    public static final native boolean QuadranglesVectorIterator_Equals(long j, QuadranglesVectorIterator quadranglesVectorIterator, long j2, QuadranglesVectorIterator quadranglesVectorIterator2);

    public static final native long QuadranglesVectorIterator_GetValue(long j, QuadranglesVectorIterator quadranglesVectorIterator);

    public static final native void Rectangle_Serialize(long j, Rectangle rectangle, long j2, Serializer serializer);

    public static final native int Rectangle_height_get(long j, Rectangle rectangle);

    public static final native void Rectangle_height_set(long j, Rectangle rectangle, int i);

    public static final native int Rectangle_width_get(long j, Rectangle rectangle);

    public static final native void Rectangle_width_set(long j, Rectangle rectangle, int i);

    public static final native int Rectangle_x_get(long j, Rectangle rectangle);

    public static final native void Rectangle_x_set(long j, Rectangle rectangle, int i);

    public static final native int Rectangle_y_get(long j, Rectangle rectangle);

    public static final native void Rectangle_y_set(long j, Rectangle rectangle, int i);

    public static final native void RectanglesVectorIterator_Advance(long j, RectanglesVectorIterator rectanglesVectorIterator);

    public static final native boolean RectanglesVectorIterator_Equals(long j, RectanglesVectorIterator rectanglesVectorIterator, long j2, RectanglesVectorIterator rectanglesVectorIterator2);

    public static final native long RectanglesVectorIterator_GetValue(long j, RectanglesVectorIterator rectanglesVectorIterator);

    public static final native void SerializationParameters_AddIgnoredKey(long j, SerializationParameters serializationParameters, String str);

    public static final native void SerializationParameters_AddIgnoredObjectType(long j, SerializationParameters serializationParameters, String str);

    public static final native boolean SerializationParameters_HasIgnoredKey(long j, SerializationParameters serializationParameters, String str);

    public static final native boolean SerializationParameters_HasIgnoredObjectType(long j, SerializationParameters serializationParameters, String str);

    public static final native long SerializationParameters_IgnoredKeysBegin(long j, SerializationParameters serializationParameters);

    public static final native long SerializationParameters_IgnoredKeysEnd(long j, SerializationParameters serializationParameters);

    public static final native long SerializationParameters_IgnoredObjectTypesBegin(long j, SerializationParameters serializationParameters);

    public static final native long SerializationParameters_IgnoredObjectTypesEnd(long j, SerializationParameters serializationParameters);

    public static final native void SerializationParameters_RemoveIgnoredKey(long j, SerializationParameters serializationParameters, String str);

    public static final native void SerializationParameters_RemoveIgnoredObjectType(long j, SerializationParameters serializationParameters, String str);

    public static final native long Serializer_CreateJSONSerializer(long j, SerializationParameters serializationParameters);

    public static final native String Serializer_GetCStr(long j, Serializer serializer);

    public static final native void Serializer_Reset(long j, Serializer serializer);

    public static final native String Serializer_SerializerType(long j, Serializer serializer);

    public static final native void Size_Serialize(long j, Size size, long j2, Serializer serializer);

    public static final native int Size_height_get(long j, Size size);

    public static final native void Size_height_set(long j, Size size, int i);

    public static final native int Size_width_get(long j, Size size);

    public static final native void Size_width_set(long j, Size size, int i);

    public static final native void StringsMapIterator_Advance(long j, StringsMapIterator stringsMapIterator);

    public static final native boolean StringsMapIterator_Equals(long j, StringsMapIterator stringsMapIterator, long j2, StringsMapIterator stringsMapIterator2);

    public static final native String StringsMapIterator_GetKey(long j, StringsMapIterator stringsMapIterator);

    public static final native String StringsMapIterator_GetValue(long j, StringsMapIterator stringsMapIterator);

    public static final native void StringsSetIterator_Advance(long j, StringsSetIterator stringsSetIterator);

    public static final native boolean StringsSetIterator_Equals(long j, StringsSetIterator stringsSetIterator, long j2, StringsSetIterator stringsSetIterator2);

    public static final native String StringsSetIterator_GetValue(long j, StringsSetIterator stringsSetIterator);

    public static final native int StringsSet_GetStringsCount(long j, StringsSet stringsSet);

    public static final native boolean StringsSet_HasString(long j, StringsSet stringsSet, String str);

    public static final native long StringsSet_StringsBegin(long j, StringsSet stringsSet);

    public static final native long StringsSet_StringsEnd(long j, StringsSet stringsSet);

    public static final native void StringsVectorIterator_Advance(long j, StringsVectorIterator stringsVectorIterator);

    public static final native boolean StringsVectorIterator_Equals(long j, StringsVectorIterator stringsVectorIterator, long j2, StringsVectorIterator stringsVectorIterator2);

    public static final native String StringsVectorIterator_GetValue(long j, StringsVectorIterator stringsVectorIterator);

    public static final native int YUVDimensions_height_get(long j, YUVDimensions yUVDimensions);

    public static final native void YUVDimensions_height_set(long j, YUVDimensions yUVDimensions, int i);

    public static final native int YUVDimensions_type_get(long j, YUVDimensions yUVDimensions);

    public static final native void YUVDimensions_type_set(long j, YUVDimensions yUVDimensions, int i);

    public static final native int YUVDimensions_u_plane_pixel_stride_get(long j, YUVDimensions yUVDimensions);

    public static final native void YUVDimensions_u_plane_pixel_stride_set(long j, YUVDimensions yUVDimensions, int i);

    public static final native int YUVDimensions_u_plane_row_stride_get(long j, YUVDimensions yUVDimensions);

    public static final native void YUVDimensions_u_plane_row_stride_set(long j, YUVDimensions yUVDimensions, int i);

    public static final native int YUVDimensions_v_plane_pixel_stride_get(long j, YUVDimensions yUVDimensions);

    public static final native void YUVDimensions_v_plane_pixel_stride_set(long j, YUVDimensions yUVDimensions, int i);

    public static final native int YUVDimensions_v_plane_row_stride_get(long j, YUVDimensions yUVDimensions);

    public static final native void YUVDimensions_v_plane_row_stride_set(long j, YUVDimensions yUVDimensions, int i);

    public static final native int YUVDimensions_width_get(long j, YUVDimensions yUVDimensions);

    public static final native void YUVDimensions_width_set(long j, YUVDimensions yUVDimensions, int i);

    public static final native int YUVDimensions_y_plane_pixel_stride_get(long j, YUVDimensions yUVDimensions);

    public static final native void YUVDimensions_y_plane_pixel_stride_set(long j, YUVDimensions yUVDimensions, int i);

    public static final native int YUVDimensions_y_plane_row_stride_get(long j, YUVDimensions yUVDimensions);

    public static final native void YUVDimensions_y_plane_row_stride_set(long j, YUVDimensions yUVDimensions, int i);

    public static final native int YUVTYPE_420_888_get();

    public static final native int YUVTYPE_NV21_get();

    public static final native int YUVTYPE_UNDEFINED_get();

    public static final native void delete_ByteString(long j);

    public static final native void delete_Image(long j);

    public static final native void delete_ImagesMapIterator(long j);

    public static final native void delete_MutableString(long j);

    public static final native void delete_OcrChar(long j);

    public static final native void delete_OcrCharVariant(long j);

    public static final native void delete_OcrPair(long j);

    public static final native void delete_OcrString(long j);

    public static final native void delete_Point(long j);

    public static final native void delete_Polygon(long j);

    public static final native void delete_ProjectiveTransform(long j);

    public static final native void delete_Quadrangle(long j);

    public static final native void delete_QuadranglesMapIterator(long j);

    public static final native void delete_QuadranglesVectorIterator(long j);

    public static final native void delete_Rectangle(long j);

    public static final native void delete_RectanglesVectorIterator(long j);

    public static final native void delete_SerializationParameters(long j);

    public static final native void delete_Serializer(long j);

    public static final native void delete_Size(long j);

    public static final native void delete_StringsMapIterator(long j);

    public static final native void delete_StringsSet(long j);

    public static final native void delete_StringsSetIterator(long j);

    public static final native void delete_StringsVectorIterator(long j);

    public static final native void delete_YUVDimensions(long j);

    public static final native long new_ByteString__SWIG_0();

    public static final native long new_ByteString__SWIG_1(byte[] bArr);

    public static final native long new_ByteString__SWIG_2(long j, ByteString byteString);

    public static final native long new_ImagesMapIterator(long j, ImagesMapIterator imagesMapIterator);

    public static final native long new_MutableString__SWIG_0();

    public static final native long new_MutableString__SWIG_1(String str);

    public static final native long new_MutableString__SWIG_2(long j, MutableString mutableString);

    public static final native long new_OcrCharVariant__SWIG_0();

    public static final native long new_OcrCharVariant__SWIG_1(long j, MutableString mutableString, float f);

    public static final native long new_OcrCharVariant__SWIG_2(String str, float f);

    public static final native long new_OcrChar__SWIG_0();

    public static final native long new_OcrChar__SWIG_1(long j, OcrCharVariant ocrCharVariant, int i, boolean z, long j2, Quadrangle quadrangle);

    public static final native long new_OcrChar__SWIG_2(long j, OcrChar ocrChar);

    public static final native long new_OcrPair__SWIG_0();

    public static final native long new_OcrPair__SWIG_1(long j, MutableString mutableString, float f);

    public static final native long new_OcrPair__SWIG_2(String str, float f);

    public static final native long new_OcrPair__SWIG_3(long j, MutableString mutableString, int i);

    public static final native long new_OcrPair__SWIG_4(String str, int i);

    public static final native long new_OcrString__SWIG_0();

    public static final native long new_OcrString__SWIG_1(String str);

    public static final native long new_OcrString__SWIG_2(long j, OcrChar ocrChar, int i);

    public static final native long new_OcrString__SWIG_3(long j, OcrString ocrString);

    public static final native long new_Point__SWIG_0();

    public static final native long new_Point__SWIG_1(double d, double d2);

    public static final native long new_Polygon__SWIG_0();

    public static final native long new_Polygon__SWIG_1(long j, Point point, int i);

    public static final native long new_Polygon__SWIG_2(long j, Polygon polygon);

    public static final native long new_Quadrangle__SWIG_0();

    public static final native long new_Quadrangle__SWIG_1(long j, Point point, long j2, Point point2, long j3, Point point3, long j4, Point point4);

    public static final native long new_QuadranglesMapIterator(long j, QuadranglesMapIterator quadranglesMapIterator);

    public static final native long new_QuadranglesVectorIterator(long j, QuadranglesVectorIterator quadranglesVectorIterator);

    public static final native long new_Rectangle__SWIG_0();

    public static final native long new_Rectangle__SWIG_1(int i, int i2, int i3, int i4);

    public static final native long new_RectanglesVectorIterator(long j, RectanglesVectorIterator rectanglesVectorIterator);

    public static final native long new_SerializationParameters__SWIG_0();

    public static final native long new_SerializationParameters__SWIG_1(long j, SerializationParameters serializationParameters);

    public static final native long new_Size__SWIG_0();

    public static final native long new_Size__SWIG_1(int i, int i2);

    public static final native long new_StringsMapIterator(long j, StringsMapIterator stringsMapIterator);

    public static final native long new_StringsSetIterator(long j, StringsSetIterator stringsSetIterator);

    public static final native long new_StringsVectorIterator(long j, StringsVectorIterator stringsVectorIterator);

    public static final native long new_YUVDimensions__SWIG_0();

    public static final native long new_YUVDimensions__SWIG_1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);
}
