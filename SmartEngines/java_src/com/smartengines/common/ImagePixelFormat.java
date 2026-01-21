package com.smartengines.common;

/* loaded from: classes3.dex */
public final class ImagePixelFormat {
    public static final ImagePixelFormat IPF_AG;
    public static final ImagePixelFormat IPF_ARGB;
    public static final ImagePixelFormat IPF_BGR;
    public static final ImagePixelFormat IPF_BGRA;
    public static final ImagePixelFormat IPF_G;
    public static final ImagePixelFormat IPF_GA;
    public static final ImagePixelFormat IPF_RGB;
    public static final ImagePixelFormat IPF_RGBA;
    private static int swigNext;
    private static ImagePixelFormat[] swigValues;
    private final String swigName;
    private final int swigValue;

    static {
        ImagePixelFormat imagePixelFormat = new ImagePixelFormat("IPF_G", jnisecommonJNI.IPF_G_get());
        IPF_G = imagePixelFormat;
        ImagePixelFormat imagePixelFormat2 = new ImagePixelFormat("IPF_GA");
        IPF_GA = imagePixelFormat2;
        ImagePixelFormat imagePixelFormat3 = new ImagePixelFormat("IPF_AG");
        IPF_AG = imagePixelFormat3;
        ImagePixelFormat imagePixelFormat4 = new ImagePixelFormat("IPF_RGB");
        IPF_RGB = imagePixelFormat4;
        ImagePixelFormat imagePixelFormat5 = new ImagePixelFormat("IPF_BGR");
        IPF_BGR = imagePixelFormat5;
        ImagePixelFormat imagePixelFormat6 = new ImagePixelFormat("IPF_BGRA");
        IPF_BGRA = imagePixelFormat6;
        ImagePixelFormat imagePixelFormat7 = new ImagePixelFormat("IPF_ARGB");
        IPF_ARGB = imagePixelFormat7;
        ImagePixelFormat imagePixelFormat8 = new ImagePixelFormat("IPF_RGBA");
        IPF_RGBA = imagePixelFormat8;
        swigValues = new ImagePixelFormat[]{imagePixelFormat, imagePixelFormat2, imagePixelFormat3, imagePixelFormat4, imagePixelFormat5, imagePixelFormat6, imagePixelFormat7, imagePixelFormat8};
        swigNext = 0;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    public static ImagePixelFormat swigToEnum(int i) {
        ImagePixelFormat[] imagePixelFormatArr = swigValues;
        if (i < imagePixelFormatArr.length && i >= 0) {
            ImagePixelFormat imagePixelFormat = imagePixelFormatArr[i];
            if (imagePixelFormat.swigValue == i) {
                return imagePixelFormat;
            }
        }
        int i2 = 0;
        while (true) {
            ImagePixelFormat[] imagePixelFormatArr2 = swigValues;
            if (i2 < imagePixelFormatArr2.length) {
                ImagePixelFormat imagePixelFormat2 = imagePixelFormatArr2[i2];
                if (imagePixelFormat2.swigValue == i) {
                    return imagePixelFormat2;
                }
                i2++;
            } else {
                throw new IllegalArgumentException("No enum " + ImagePixelFormat.class + " with value " + i);
            }
        }
    }

    private ImagePixelFormat(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    private ImagePixelFormat(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private ImagePixelFormat(String str, ImagePixelFormat imagePixelFormat) {
        this.swigName = str;
        int i = imagePixelFormat.swigValue;
        this.swigValue = i;
        swigNext = i + 1;
    }
}
