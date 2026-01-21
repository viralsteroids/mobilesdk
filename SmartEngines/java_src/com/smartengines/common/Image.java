package com.smartengines.common;

/* loaded from: classes3.dex */
public class Image {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public Image(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(Image image) {
        if (image == null) {
            return 0L;
        }
        return image.swigCPtr;
    }

    public static long swigRelease(Image image) {
        if (image == null) {
            return 0L;
        }
        if (!image.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = image.swigCPtr;
        image.swigCMemOwn = false;
        image.delete();
        return j;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                jnisecommonJNI.delete_Image(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public static int GetNumberOfPages(String str) {
        return jnisecommonJNI.Image_GetNumberOfPages(str);
    }

    public static MutableString GetImagePageName(String str, int i) {
        return new MutableString(jnisecommonJNI.Image_GetImagePageName(str, i), true);
    }

    public static Image CreateEmpty() {
        long jImage_CreateEmpty = jnisecommonJNI.Image_CreateEmpty();
        if (jImage_CreateEmpty == 0) {
            return null;
        }
        return new Image(jImage_CreateEmpty, true);
    }

    public static Image FromFile(String str, int i, Size size) {
        long jImage_FromFile__SWIG_0 = jnisecommonJNI.Image_FromFile__SWIG_0(str, i, Size.getCPtr(size), size);
        if (jImage_FromFile__SWIG_0 == 0) {
            return null;
        }
        return new Image(jImage_FromFile__SWIG_0, true);
    }

    public static Image FromFile(String str, int i) {
        long jImage_FromFile__SWIG_1 = jnisecommonJNI.Image_FromFile__SWIG_1(str, i);
        if (jImage_FromFile__SWIG_1 == 0) {
            return null;
        }
        return new Image(jImage_FromFile__SWIG_1, true);
    }

    public static Image FromFile(String str) {
        long jImage_FromFile__SWIG_2 = jnisecommonJNI.Image_FromFile__SWIG_2(str);
        if (jImage_FromFile__SWIG_2 == 0) {
            return null;
        }
        return new Image(jImage_FromFile__SWIG_2, true);
    }

    public static Image FromFileBuffer(byte[] bArr, int i, Size size) {
        long jImage_FromFileBuffer__SWIG_0 = jnisecommonJNI.Image_FromFileBuffer__SWIG_0(bArr, i, Size.getCPtr(size), size);
        if (jImage_FromFileBuffer__SWIG_0 == 0) {
            return null;
        }
        return new Image(jImage_FromFileBuffer__SWIG_0, true);
    }

    public static Image FromFileBuffer(byte[] bArr, int i) {
        long jImage_FromFileBuffer__SWIG_1 = jnisecommonJNI.Image_FromFileBuffer__SWIG_1(bArr, i);
        if (jImage_FromFileBuffer__SWIG_1 == 0) {
            return null;
        }
        return new Image(jImage_FromFileBuffer__SWIG_1, true);
    }

    public static Image FromFileBuffer(byte[] bArr) {
        long jImage_FromFileBuffer__SWIG_2 = jnisecommonJNI.Image_FromFileBuffer__SWIG_2(bArr);
        if (jImage_FromFileBuffer__SWIG_2 == 0) {
            return null;
        }
        return new Image(jImage_FromFileBuffer__SWIG_2, true);
    }

    public static Image FromBuffer(byte[] bArr, int i, int i2, int i3, int i4) {
        long jImage_FromBuffer = jnisecommonJNI.Image_FromBuffer(bArr, i, i2, i3, i4);
        if (jImage_FromBuffer == 0) {
            return null;
        }
        return new Image(jImage_FromBuffer, true);
    }

    public static Image FromBufferExtended(byte[] bArr, int i, int i2, int i3, ImagePixelFormat imagePixelFormat, int i4) {
        long jImage_FromBufferExtended = jnisecommonJNI.Image_FromBufferExtended(bArr, i, i2, i3, imagePixelFormat.swigValue(), i4);
        if (jImage_FromBufferExtended == 0) {
            return null;
        }
        return new Image(jImage_FromBufferExtended, true);
    }

    public static Image FromYUVBuffer(byte[] bArr, int i, int i2) {
        long jImage_FromYUVBuffer = jnisecommonJNI.Image_FromYUVBuffer(bArr, i, i2);
        if (jImage_FromYUVBuffer == 0) {
            return null;
        }
        return new Image(jImage_FromYUVBuffer, true);
    }

    public static Image FromYUV(byte[] bArr, byte[] bArr2, byte[] bArr3, YUVDimensions yUVDimensions) {
        long jImage_FromYUV = jnisecommonJNI.Image_FromYUV(bArr, bArr2, bArr3, YUVDimensions.getCPtr(yUVDimensions), yUVDimensions);
        if (jImage_FromYUV == 0) {
            return null;
        }
        return new Image(jImage_FromYUV, true);
    }

    public static Image FromBase64Buffer(String str, int i, Size size) {
        long jImage_FromBase64Buffer__SWIG_0 = jnisecommonJNI.Image_FromBase64Buffer__SWIG_0(str, i, Size.getCPtr(size), size);
        if (jImage_FromBase64Buffer__SWIG_0 == 0) {
            return null;
        }
        return new Image(jImage_FromBase64Buffer__SWIG_0, true);
    }

    public static Image FromBase64Buffer(String str, int i) {
        long jImage_FromBase64Buffer__SWIG_1 = jnisecommonJNI.Image_FromBase64Buffer__SWIG_1(str, i);
        if (jImage_FromBase64Buffer__SWIG_1 == 0) {
            return null;
        }
        return new Image(jImage_FromBase64Buffer__SWIG_1, true);
    }

    public static Image FromBase64Buffer(String str) {
        long jImage_FromBase64Buffer__SWIG_2 = jnisecommonJNI.Image_FromBase64Buffer__SWIG_2(str);
        if (jImage_FromBase64Buffer__SWIG_2 == 0) {
            return null;
        }
        return new Image(jImage_FromBase64Buffer__SWIG_2, true);
    }

    public int GetNumberOfLayers() {
        return jnisecommonJNI.Image_GetNumberOfLayers(this.swigCPtr, this);
    }

    public Image GetLayer(String str) {
        return new Image(jnisecommonJNI.Image_GetLayer(this.swigCPtr, this, str), false);
    }

    public Image GetLayerPtr(String str) {
        long jImage_GetLayerPtr = jnisecommonJNI.Image_GetLayerPtr(this.swigCPtr, this, str);
        if (jImage_GetLayerPtr == 0) {
            return null;
        }
        return new Image(jImage_GetLayerPtr, false);
    }

    public ImagesMapIterator LayersBegin() {
        return new ImagesMapIterator(jnisecommonJNI.Image_LayersBegin(this.swigCPtr, this), true);
    }

    public ImagesMapIterator LayersEnd() {
        return new ImagesMapIterator(jnisecommonJNI.Image_LayersEnd(this.swigCPtr, this), true);
    }

    public boolean HasLayer(String str) {
        return jnisecommonJNI.Image_HasLayer(this.swigCPtr, this, str);
    }

    public boolean HasLayers() {
        return jnisecommonJNI.Image_HasLayers(this.swigCPtr, this);
    }

    public void RemoveLayer(String str) {
        jnisecommonJNI.Image_RemoveLayer(this.swigCPtr, this, str);
    }

    public void RemoveLayers() {
        jnisecommonJNI.Image_RemoveLayers(this.swigCPtr, this);
    }

    public void SetLayer(String str, Image image) {
        jnisecommonJNI.Image_SetLayer(this.swigCPtr, this, str, getCPtr(image), image);
    }

    public void SetLayerWithOwnership(String str, Image image) {
        jnisecommonJNI.Image_SetLayerWithOwnership(this.swigCPtr, this, str, getCPtr(image), image);
    }

    public Image CloneDeep() {
        long jImage_CloneDeep = jnisecommonJNI.Image_CloneDeep(this.swigCPtr, this);
        if (jImage_CloneDeep == 0) {
            return null;
        }
        return new Image(jImage_CloneDeep, true);
    }

    public Image CloneShallow() {
        long jImage_CloneShallow = jnisecommonJNI.Image_CloneShallow(this.swigCPtr, this);
        if (jImage_CloneShallow == 0) {
            return null;
        }
        return new Image(jImage_CloneShallow, true);
    }

    public void Clear() {
        jnisecommonJNI.Image_Clear(this.swigCPtr, this);
    }

    public int GetRequiredBufferLength() {
        return jnisecommonJNI.Image_GetRequiredBufferLength(this.swigCPtr, this);
    }

    public int CopyToBuffer(byte[] bArr) {
        return jnisecommonJNI.Image_CopyToBuffer(this.swigCPtr, this, bArr);
    }

    public void Save(String str) {
        jnisecommonJNI.Image_Save(this.swigCPtr, this, str);
    }

    public int GetRequiredBase64BufferLength() {
        return jnisecommonJNI.Image_GetRequiredBase64BufferLength(this.swigCPtr, this);
    }

    public int CopyBase64ToBuffer(String str, int i) {
        return jnisecommonJNI.Image_CopyBase64ToBuffer(this.swigCPtr, this, str, i);
    }

    public MutableString GetBase64String() {
        return new MutableString(jnisecommonJNI.Image_GetBase64String(this.swigCPtr, this), true);
    }

    public double EstimateFocusScore(double d) {
        return jnisecommonJNI.Image_EstimateFocusScore__SWIG_0(this.swigCPtr, this, d);
    }

    public double EstimateFocusScore() {
        return jnisecommonJNI.Image_EstimateFocusScore__SWIG_1(this.swigCPtr, this);
    }

    public void Resize(Size size) {
        jnisecommonJNI.Image_Resize(this.swigCPtr, this, Size.getCPtr(size), size);
    }

    public Image CloneResized(Size size) {
        long jImage_CloneResized = jnisecommonJNI.Image_CloneResized(this.swigCPtr, this, Size.getCPtr(size), size);
        if (jImage_CloneResized == 0) {
            return null;
        }
        return new Image(jImage_CloneResized, true);
    }

    public void Crop(Quadrangle quadrangle) {
        jnisecommonJNI.Image_Crop__SWIG_0(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle);
    }

    public Image CloneCropped(Quadrangle quadrangle) {
        long jImage_CloneCropped__SWIG_0 = jnisecommonJNI.Image_CloneCropped__SWIG_0(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle);
        if (jImage_CloneCropped__SWIG_0 == 0) {
            return null;
        }
        return new Image(jImage_CloneCropped__SWIG_0, true);
    }

    public void Crop(Quadrangle quadrangle, Size size) {
        jnisecommonJNI.Image_Crop__SWIG_1(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, Size.getCPtr(size), size);
    }

    public Image CloneCropped(Quadrangle quadrangle, Size size) {
        long jImage_CloneCropped__SWIG_1 = jnisecommonJNI.Image_CloneCropped__SWIG_1(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, Size.getCPtr(size), size);
        if (jImage_CloneCropped__SWIG_1 == 0) {
            return null;
        }
        return new Image(jImage_CloneCropped__SWIG_1, true);
    }

    public void Crop(Rectangle rectangle) {
        jnisecommonJNI.Image_Crop__SWIG_2(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle);
    }

    public Image CloneCropped(Rectangle rectangle) {
        long jImage_CloneCropped__SWIG_2 = jnisecommonJNI.Image_CloneCropped__SWIG_2(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle);
        if (jImage_CloneCropped__SWIG_2 == 0) {
            return null;
        }
        return new Image(jImage_CloneCropped__SWIG_2, true);
    }

    public Image CloneCroppedShallow(Rectangle rectangle) {
        long jImage_CloneCroppedShallow = jnisecommonJNI.Image_CloneCroppedShallow(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle);
        if (jImage_CloneCroppedShallow == 0) {
            return null;
        }
        return new Image(jImage_CloneCroppedShallow, true);
    }

    public void Mask(Rectangle rectangle, int i, double d) {
        jnisecommonJNI.Image_Mask__SWIG_0(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle, i, d);
    }

    public void Mask(Rectangle rectangle, int i) {
        jnisecommonJNI.Image_Mask__SWIG_1(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle, i);
    }

    public void Mask(Rectangle rectangle) {
        jnisecommonJNI.Image_Mask__SWIG_2(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle);
    }

    public Image CloneMasked(Rectangle rectangle, int i) {
        long jImage_CloneMasked__SWIG_0 = jnisecommonJNI.Image_CloneMasked__SWIG_0(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle, i);
        if (jImage_CloneMasked__SWIG_0 == 0) {
            return null;
        }
        return new Image(jImage_CloneMasked__SWIG_0, true);
    }

    public Image CloneMasked(Rectangle rectangle) {
        long jImage_CloneMasked__SWIG_1 = jnisecommonJNI.Image_CloneMasked__SWIG_1(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle);
        if (jImage_CloneMasked__SWIG_1 == 0) {
            return null;
        }
        return new Image(jImage_CloneMasked__SWIG_1, true);
    }

    public void Mask(Quadrangle quadrangle, int i, double d) {
        jnisecommonJNI.Image_Mask__SWIG_3(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, i, d);
    }

    public void Mask(Quadrangle quadrangle, int i) {
        jnisecommonJNI.Image_Mask__SWIG_4(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, i);
    }

    public void Mask(Quadrangle quadrangle) {
        jnisecommonJNI.Image_Mask__SWIG_5(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle);
    }

    public Image CloneMasked(Quadrangle quadrangle, int i) {
        long jImage_CloneMasked__SWIG_2 = jnisecommonJNI.Image_CloneMasked__SWIG_2(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, i);
        if (jImage_CloneMasked__SWIG_2 == 0) {
            return null;
        }
        return new Image(jImage_CloneMasked__SWIG_2, true);
    }

    public Image CloneMasked(Quadrangle quadrangle) {
        long jImage_CloneMasked__SWIG_3 = jnisecommonJNI.Image_CloneMasked__SWIG_3(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle);
        if (jImage_CloneMasked__SWIG_3 == 0) {
            return null;
        }
        return new Image(jImage_CloneMasked__SWIG_3, true);
    }

    public void Fill(Rectangle rectangle, int i, int i2, int i3, int i4, int i5) {
        jnisecommonJNI.Image_Fill__SWIG_0(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle, i, i2, i3, i4, i5);
    }

    public void Fill(Rectangle rectangle, int i, int i2, int i3, int i4) {
        jnisecommonJNI.Image_Fill__SWIG_1(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle, i, i2, i3, i4);
    }

    public void Fill(Rectangle rectangle, int i, int i2, int i3) {
        jnisecommonJNI.Image_Fill__SWIG_2(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle, i, i2, i3);
    }

    public void Fill(Rectangle rectangle, int i, int i2) {
        jnisecommonJNI.Image_Fill__SWIG_3(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle, i, i2);
    }

    public void Fill(Rectangle rectangle, int i) {
        jnisecommonJNI.Image_Fill__SWIG_4(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle, i);
    }

    public Image CloneFilled(Rectangle rectangle, int i, int i2, int i3, int i4, int i5) {
        long jImage_CloneFilled__SWIG_0 = jnisecommonJNI.Image_CloneFilled__SWIG_0(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle, i, i2, i3, i4, i5);
        if (jImage_CloneFilled__SWIG_0 == 0) {
            return null;
        }
        return new Image(jImage_CloneFilled__SWIG_0, false);
    }

    public Image CloneFilled(Rectangle rectangle, int i, int i2, int i3, int i4) {
        long jImage_CloneFilled__SWIG_1 = jnisecommonJNI.Image_CloneFilled__SWIG_1(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle, i, i2, i3, i4);
        if (jImage_CloneFilled__SWIG_1 == 0) {
            return null;
        }
        return new Image(jImage_CloneFilled__SWIG_1, false);
    }

    public Image CloneFilled(Rectangle rectangle, int i, int i2, int i3) {
        long jImage_CloneFilled__SWIG_2 = jnisecommonJNI.Image_CloneFilled__SWIG_2(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle, i, i2, i3);
        if (jImage_CloneFilled__SWIG_2 == 0) {
            return null;
        }
        return new Image(jImage_CloneFilled__SWIG_2, false);
    }

    public Image CloneFilled(Rectangle rectangle, int i, int i2) {
        long jImage_CloneFilled__SWIG_3 = jnisecommonJNI.Image_CloneFilled__SWIG_3(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle, i, i2);
        if (jImage_CloneFilled__SWIG_3 == 0) {
            return null;
        }
        return new Image(jImage_CloneFilled__SWIG_3, false);
    }

    public Image CloneFilled(Rectangle rectangle, int i) {
        long jImage_CloneFilled__SWIG_4 = jnisecommonJNI.Image_CloneFilled__SWIG_4(this.swigCPtr, this, Rectangle.getCPtr(rectangle), rectangle, i);
        if (jImage_CloneFilled__SWIG_4 == 0) {
            return null;
        }
        return new Image(jImage_CloneFilled__SWIG_4, false);
    }

    public void Fill(Quadrangle quadrangle, int i, int i2, int i3, int i4, int i5) {
        jnisecommonJNI.Image_Fill__SWIG_5(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, i, i2, i3, i4, i5);
    }

    public void Fill(Quadrangle quadrangle, int i, int i2, int i3, int i4) {
        jnisecommonJNI.Image_Fill__SWIG_6(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, i, i2, i3, i4);
    }

    public void Fill(Quadrangle quadrangle, int i, int i2, int i3) {
        jnisecommonJNI.Image_Fill__SWIG_7(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, i, i2, i3);
    }

    public void Fill(Quadrangle quadrangle, int i, int i2) {
        jnisecommonJNI.Image_Fill__SWIG_8(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, i, i2);
    }

    public void Fill(Quadrangle quadrangle, int i) {
        jnisecommonJNI.Image_Fill__SWIG_9(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, i);
    }

    public Image CloneFilled(Quadrangle quadrangle, int i, int i2, int i3, int i4, int i5) {
        long jImage_CloneFilled__SWIG_5 = jnisecommonJNI.Image_CloneFilled__SWIG_5(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, i, i2, i3, i4, i5);
        if (jImage_CloneFilled__SWIG_5 == 0) {
            return null;
        }
        return new Image(jImage_CloneFilled__SWIG_5, false);
    }

    public Image CloneFilled(Quadrangle quadrangle, int i, int i2, int i3, int i4) {
        long jImage_CloneFilled__SWIG_6 = jnisecommonJNI.Image_CloneFilled__SWIG_6(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, i, i2, i3, i4);
        if (jImage_CloneFilled__SWIG_6 == 0) {
            return null;
        }
        return new Image(jImage_CloneFilled__SWIG_6, false);
    }

    public Image CloneFilled(Quadrangle quadrangle, int i, int i2, int i3) {
        long jImage_CloneFilled__SWIG_7 = jnisecommonJNI.Image_CloneFilled__SWIG_7(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, i, i2, i3);
        if (jImage_CloneFilled__SWIG_7 == 0) {
            return null;
        }
        return new Image(jImage_CloneFilled__SWIG_7, false);
    }

    public Image CloneFilled(Quadrangle quadrangle, int i, int i2) {
        long jImage_CloneFilled__SWIG_8 = jnisecommonJNI.Image_CloneFilled__SWIG_8(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, i, i2);
        if (jImage_CloneFilled__SWIG_8 == 0) {
            return null;
        }
        return new Image(jImage_CloneFilled__SWIG_8, false);
    }

    public Image CloneFilled(Quadrangle quadrangle, int i) {
        long jImage_CloneFilled__SWIG_9 = jnisecommonJNI.Image_CloneFilled__SWIG_9(this.swigCPtr, this, Quadrangle.getCPtr(quadrangle), quadrangle, i);
        if (jImage_CloneFilled__SWIG_9 == 0) {
            return null;
        }
        return new Image(jImage_CloneFilled__SWIG_9, false);
    }

    public void FlipVertical() {
        jnisecommonJNI.Image_FlipVertical(this.swigCPtr, this);
    }

    public Image CloneFlippedVertical() {
        long jImage_CloneFlippedVertical = jnisecommonJNI.Image_CloneFlippedVertical(this.swigCPtr, this);
        if (jImage_CloneFlippedVertical == 0) {
            return null;
        }
        return new Image(jImage_CloneFlippedVertical, true);
    }

    public void FlipHorizontal() {
        jnisecommonJNI.Image_FlipHorizontal(this.swigCPtr, this);
    }

    public Image CloneFlippedHorizontal() {
        long jImage_CloneFlippedHorizontal = jnisecommonJNI.Image_CloneFlippedHorizontal(this.swigCPtr, this);
        if (jImage_CloneFlippedHorizontal == 0) {
            return null;
        }
        return new Image(jImage_CloneFlippedHorizontal, true);
    }

    public void Rotate90(int i) {
        jnisecommonJNI.Image_Rotate90(this.swigCPtr, this, i);
    }

    public Image CloneRotated90(int i) {
        long jImage_CloneRotated90 = jnisecommonJNI.Image_CloneRotated90(this.swigCPtr, this, i);
        if (jImage_CloneRotated90 == 0) {
            return null;
        }
        return new Image(jImage_CloneRotated90, true);
    }

    public void AverageChannels() {
        jnisecommonJNI.Image_AverageChannels(this.swigCPtr, this);
    }

    public Image CloneAveragedChannels() {
        long jImage_CloneAveragedChannels = jnisecommonJNI.Image_CloneAveragedChannels(this.swigCPtr, this);
        if (jImage_CloneAveragedChannels == 0) {
            return null;
        }
        return new Image(jImage_CloneAveragedChannels, true);
    }

    public void Invert() {
        jnisecommonJNI.Image_Invert(this.swigCPtr, this);
    }

    public Image CloneInverted() {
        long jImage_CloneInverted = jnisecommonJNI.Image_CloneInverted(this.swigCPtr, this);
        if (jImage_CloneInverted == 0) {
            return null;
        }
        return new Image(jImage_CloneInverted, true);
    }

    public int GetWidth() {
        return jnisecommonJNI.Image_GetWidth(this.swigCPtr, this);
    }

    public int GetHeight() {
        return jnisecommonJNI.Image_GetHeight(this.swigCPtr, this);
    }

    public Size GetSize() {
        return new Size(jnisecommonJNI.Image_GetSize(this.swigCPtr, this), true);
    }

    public int GetStride() {
        return jnisecommonJNI.Image_GetStride(this.swigCPtr, this);
    }

    public int GetChannels() {
        return jnisecommonJNI.Image_GetChannels(this.swigCPtr, this);
    }

    public boolean IsMemoryOwner() {
        return jnisecommonJNI.Image_IsMemoryOwner(this.swigCPtr, this);
    }

    public void ForceMemoryOwner() {
        jnisecommonJNI.Image_ForceMemoryOwner(this.swigCPtr, this);
    }

    public void Serialize(Serializer serializer) {
        jnisecommonJNI.Image_Serialize(this.swigCPtr, this, Serializer.getCPtr(serializer), serializer);
    }
}
