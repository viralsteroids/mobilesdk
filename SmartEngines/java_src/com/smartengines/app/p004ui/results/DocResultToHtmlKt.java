package com.smartengines.app.p004ui.results;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import com.smartengines.app.AppKt;
import com.smartengines.app.C3069R;
import com.smartengines.engine.Geometry;
import com.smartengines.engine.doc.BasicTextObject;
import com.smartengines.engine.doc.DocName;
import com.smartengines.engine.doc.DocResultData;
import com.smartengines.engine.doc.DocumentData;
import com.smartengines.engine.doc.FieldInfo;
import com.smartengines.engine.doc.ImageField;
import com.smartengines.engine.doc.PhysicalDocumentData;
import com.smartengines.engine.doc.PhysicalFieldInfo;
import com.smartengines.engine.doc.PhysicalPageData;
import com.smartengines.engine.doc.TableField;
import com.smartengines.engine.doc.TextField;
import com.smartengines.utils.UtilsKt;
import com.smartengines.visualization.QuadPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: DocResultToHtml.kt */
@Metadata(m513d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a0\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007\u001a-\u0010\n\u001a\u00020\u000b*\u00020\u00032\n\u0010\f\u001a\u00060\u000ej\u0002`\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013\u001a=\u0010\u0002\u001a\u00020\u000b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00012\n\u0010\f\u001a\u00060\u000ej\u0002`\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a=\u0010\u0002\u001a\u00020\u000b*\u00020\u00192\n\u0010\f\u001a\u00060\u000ej\u0002`\r2\u0006\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0!H\u0002¢\u0006\u0002\u0010\"\u001a\f\u0010#\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a-\u0010$\u001a\u00020\u000b*\u00020%2\n\u0010\f\u001a\u00060\u000ej\u0002`\r2\u0006\u0010&\u001a\u00020\u00012\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0002\u0010(\u001aM\u0010)\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u000ej\u0002`\r2\b\u0010&\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\u0010+\u001a\u0004\u0018\u00010\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0!¢\u0006\u0002\u0010,\u001a \u0010-\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010.\u001a\u00020\u0001\u001a0\u0010-\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010.\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u001b\u001a\u00020\u0001*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, m514d2 = {"TAG", "", "toHtml", "Lcom/smartengines/engine/doc/DocResultData;", "context", "Landroid/content/Context;", "showImages", "", "showTables", "showAttributes", "sceneToHtml", "", "html", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "sceneId", "", "bitmap", "Landroid/graphics/Bitmap;", "(Lcom/smartengines/engine/doc/DocResultData;Ljava/lang/StringBuilder;ILandroid/graphics/Bitmap;)V", "Lcom/smartengines/engine/doc/DocumentData;", "language", "(Lcom/smartengines/engine/doc/DocumentData;Ljava/lang/String;Ljava/lang/StringBuilder;ZZZ)V", "compareFieldInfo", "a", "Lcom/smartengines/engine/doc/FieldInfo;", "b", AnnotatedPrivateKey.LABEL, "getLabel", "(Lcom/smartengines/engine/doc/FieldInfo;)Ljava/lang/String;", "docId", "isImageField", "printValue", "Lkotlin/Function0;", "(Lcom/smartengines/engine/doc/FieldInfo;Ljava/lang/StringBuilder;IZLkotlin/jvm/functions/Function0;)V", "toHtmlEscaped", "toSvgPolygon", "Lcom/smartengines/engine/Geometry;", "id", "isHidden", "(Lcom/smartengines/engine/Geometry;Ljava/lang/StringBuilder;Ljava/lang/String;Z)V", "dataRowToHtml", "isAccepted", "rightIcon", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "htmlSvgImage", "style", "base64String", "width", "height", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocResultToHtmlKt {
    private static final String TAG = "myapp.Doc-to-Html";

    public static /* synthetic */ String toHtml$default(DocResultData docResultData, Context context, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        return toHtml(docResultData, context, z, z2, z3);
    }

    public static final String toHtml(DocResultData docResultData, Context context, boolean z, boolean z2, boolean z3) {
        List<PhysicalPageData> pages;
        PhysicalPageData physicalPageData;
        Intrinsics.checkNotNullParameter(docResultData, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = 0;
        String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("<!DOCTYPE html>\n");
            sb.append("<html>\n");
            sb.append("<head>\n");
            sb.append("<meta name='viewport'  content='width=device-width, initial-scale=1.0'>\n");
            sb.append("<style type='text/css'>" + UtilsKt.readAssetsTextFile(context, "doc-result.css") + "</style>\n");
            sb.append("<style>\npolygon.poly {\n  stroke: #00B09A;\n  fill: rgba(0, 176, 154, 0.2);\n  fill-opacity: 30%;\n}\npolygon.selected_poly {\n  stroke: #000000;\n  fill: #70A269;\n  fill-opacity: 30%;\n}\n</style>");
            sb.append("<script type='text/javascript'>" + UtilsKt.readAssetsTextFile(context, "doc-result.js") + "</script>\n");
            sb.append("</head>\n");
            sb.append("<body>\n");
            if (!docResultData.getDocuments().isEmpty()) {
                sb.append("<div class='doc-carousel'>");
                sb.append("<button class='carousel-btn carousel-prev'>←</button>");
                sb.append("<div class='carousel-container'>");
                for (Object obj : docResultData.getDocuments()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    DocumentData documentData = (DocumentData) obj;
                    sb.append("<div class='doc-thumbnail' data-index='" + i + "'>");
                    sb.append("<img ");
                    PhysicalDocumentData physicalDoc = documentData.getPhysicalDoc();
                    if (physicalDoc != null && (pages = physicalDoc.getPages()) != null && (physicalPageData = (PhysicalPageData) CollectionsKt.firstOrNull((List) pages)) != null) {
                        sb.append("src='data:image/jpeg;base64," + physicalPageData.getImageBase64String() + '\'');
                    }
                    StringBuilder sbAppend = new StringBuilder().append(" alt='");
                    DocName name = documentData.getName();
                    sb.append(sbAppend.append(name != null ? name.getDefault() : null).append("'>").toString());
                    sb.append("</div>");
                    i = i2;
                }
                sb.append("</div>");
                sb.append("<button class='carousel-btn carousel-next'>→</button>");
                sb.append("</div>");
            }
            for (DocumentData documentData2 : docResultData.getDocuments()) {
                Intrinsics.checkNotNull(language);
                boolean z4 = z;
                boolean z5 = z2;
                boolean z6 = z3;
                toHtml(documentData2, language, sb, z4, z5, z6);
                z = z4;
                z2 = z5;
                z3 = z6;
            }
            sb.append("</body>\n");
            sb.append("</html>\n");
            return sb.toString();
        } catch (Exception e) {
            return "<html><body>Error: " + e + " </body></html>";
        }
    }

    private static final void sceneToHtml(DocResultData docResultData, StringBuilder sb, int i, Bitmap bitmap) {
        sb.append("<div class='svg_container' align='center'>");
        sb.append("<svg viewBox='0 0 " + bitmap.getWidth() + ' ' + bitmap.getHeight() + "' id='root' xmlns='http://www.w3.org/2000/svg' style='max-width: 100%; height:auto'>");
        sb.append("<image width='" + bitmap.getWidth() + "' height='" + bitmap.getHeight() + "' href='data:image/jpeg;base64," + UtilsKt.bitmapToBase64String(bitmap) + "'/>\n");
        sb.append("</svg>");
        sb.append("</div>");
    }

    private static final void toHtml(DocumentData documentData, String str, StringBuilder sb, boolean z, boolean z2, boolean z3) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List<PhysicalPageData> pages;
        List<PhysicalPageData> pages2;
        Map<String, String> attributes;
        final StringBuilder sb2 = sb;
        int id = documentData.getId();
        sb2.append("<section class='doc-section'>\n");
        DocName name = documentData.getName();
        if (name != null) {
            sb2.append("<h3 align='center'>" + name.getShort(str) + "</h3>\n");
        }
        sb2.append("<h4 align='center'>(" + documentData.getType() + ")</h4>\n");
        PhysicalDocumentData physicalDoc = documentData.getPhysicalDoc();
        if (physicalDoc != null && (pages2 = physicalDoc.getPages()) != null) {
            for (PhysicalPageData physicalPageData : pages2) {
                sb2.append("<div class='svg_container' align='center'>");
                sb2.append("<svg viewBox='0 0 " + physicalPageData.getWidth() + ' ' + physicalPageData.getHeight() + "' id='root' xmlns='http://www.w3.org/2000/svg' style='max-width: 100%; height:auto'>");
                sb2.append("<image width='" + physicalPageData.getWidth() + "' height='" + physicalPageData.getHeight() + "' href='data:image/jpeg;base64," + physicalPageData.getImageBase64String() + "'/>\n");
                for (Map.Entry<String, PhysicalFieldInfo> entry : physicalPageData.getFields().entrySet()) {
                    String key = entry.getKey();
                    PhysicalFieldInfo value = entry.getValue();
                    FieldInfo fieldInfo = documentData.getFieldInfo(key);
                    boolean zAreEqual = Intrinsics.areEqual((fieldInfo == null || (attributes = fieldInfo.getAttributes()) == null) ? null : attributes.get("has_object"), "false");
                    Iterator<T> it = value.getGeometries().iterator();
                    while (it.hasNext()) {
                        toSvgPolygon((Geometry) it.next(), sb2, id + ':' + key, zAreEqual);
                    }
                }
                if (Intrinsics.areEqual(documentData.getType(), "untypified")) {
                    int i = 0;
                    for (Object obj : physicalPageData.getBasicTextObjects()) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        toSvgPolygon(((BasicTextObject) obj).getGeometry(), sb2, new StringBuilder().append(id).append(':').append(i).toString(), false);
                        i = i2;
                    }
                }
                sb2.append("</svg>");
                sb2.append("</div>");
            }
        }
        DocumentData documentData2 = documentData;
        String str7 = "Поля";
        String str8 = "ru";
        String str9 = "<h2>";
        String str10 = "<div class='container'>\n";
        String str11 = "</div>\n";
        if (documentData2.getTexts().isEmpty()) {
            str2 = "ru";
            str3 = "<h2>";
            str4 = "<div class='container'>\n";
            str5 = "Поля";
            str6 = "</div>\n";
        } else {
            sb2.append("<h2>" + (Intrinsics.areEqual(str, "ru") ? "Поля" : "Fields") + "</h2>\n");
            sb2.append("<div class='container'>\n");
            Collection<TextField> collectionValues = documentData2.getTexts().values();
            final Function2 function2 = new Function2() { // from class: com.smartengines.app.ui.results.DocResultToHtmlKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Integer.valueOf(DocResultToHtmlKt.toHtml$lambda$8((TextField) obj2, (TextField) obj3));
                }
            };
            Iterator it2 = CollectionsKt.sortedWith(collectionValues, new Comparator() { // from class: com.smartengines.app.ui.results.DocResultToHtmlKt$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return DocResultToHtmlKt.toHtml$lambda$9(function2, obj2, obj3);
                }
            }).iterator();
            while (it2.hasNext()) {
                final TextField textField = (TextField) it2.next();
                toHtml$default(textField.getInfo(), sb, documentData2.getId(), false, new Function0() { // from class: com.smartengines.app.ui.results.DocResultToHtmlKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DocResultToHtmlKt.toHtml$lambda$11$lambda$10(sb2, textField);
                    }
                }, 4, (Object) null);
                sb2 = sb;
                str8 = str8;
                str9 = str9;
                str10 = str10;
                str11 = str11;
                it2 = it2;
                str7 = str7;
                documentData2 = documentData;
            }
            str2 = str8;
            str3 = str9;
            str4 = str10;
            str5 = str7;
            str6 = str11;
            sb2.append(str6);
        }
        if (Intrinsics.areEqual(documentData.getType(), "untypified")) {
            sb2.append(str3 + (Intrinsics.areEqual(str, str2) ? str5 : "Fields") + "</h2>\n");
            sb2.append(str4);
            PhysicalDocumentData physicalDoc2 = documentData.getPhysicalDoc();
            if (physicalDoc2 != null && (pages = physicalDoc2.getPages()) != null) {
                Iterator<T> it3 = pages.iterator();
                while (it3.hasNext()) {
                    int i3 = 0;
                    for (Object obj2 : ((PhysicalPageData) it3.next()).getBasicTextObjects()) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        final BasicTextObject basicTextObject = (BasicTextObject) obj2;
                        dataRowToHtml(sb2, new StringBuilder().append(id).append(':').append(i3).toString(), Boolean.valueOf(basicTextObject.isAccepted()), null, null, new Function0() { // from class: com.smartengines.app.ui.results.DocResultToHtmlKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DocResultToHtmlKt.toHtml$lambda$14$lambda$13$lambda$12(sb2, basicTextObject);
                            }
                        });
                        i3 = i4;
                    }
                }
            }
            sb2.append(str6);
        }
        if (!documentData.getImages().isEmpty() && z) {
            sb2.append(str3 + (Intrinsics.areEqual(str, str2) ? "Изображения" : "Images") + "</h2>\n");
            sb2.append(str4);
            Collection<ImageField> collectionValues2 = documentData.getImages().values();
            final Function2 function22 = new Function2() { // from class: com.smartengines.app.ui.results.DocResultToHtmlKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return Integer.valueOf(DocResultToHtmlKt.toHtml$lambda$15((ImageField) obj3, (ImageField) obj4));
                }
            };
            for (final ImageField imageField : CollectionsKt.sortedWith(collectionValues2, new Comparator() { // from class: com.smartengines.app.ui.results.DocResultToHtmlKt$$ExternalSyntheticLambda5
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    return DocResultToHtmlKt.toHtml$lambda$16(function22, obj3, obj4);
                }
            })) {
                toHtml(imageField.getInfo(), sb2, documentData.getId(), true, (Function0<Unit>) new Function0() { // from class: com.smartengines.app.ui.results.DocResultToHtmlKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DocResultToHtmlKt.toHtml$lambda$18$lambda$17(sb2, imageField);
                    }
                });
            }
            sb2.append(str6);
        }
        if (!documentData.getTables().isEmpty() && z2) {
            sb2.append(str3 + (Intrinsics.areEqual(str, str2) ? "Таблицы" : "Tables") + "</h2>\n");
            sb2.append(str4);
            for (final TableField tableField : documentData.getTables().values()) {
                sb2.append("<div style='overflow-x:auto;'>\n");
                toHtml$default(tableField.getInfo(), sb2, documentData.getId(), false, new Function0() { // from class: com.smartengines.app.ui.results.DocResultToHtmlKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DocResultToHtmlKt.toHtml$lambda$22$lambda$21(sb2, tableField);
                    }
                }, 4, (Object) null);
                sb2.append(str6);
            }
            sb2.append(str6);
        }
        if (!documentData.getAttributes().isEmpty() && z3) {
            sb2.append("<h2>Attributes</h2>\n");
            sb2.append(str4);
            for (Map.Entry<String, String> entry2 : documentData.getAttributes().entrySet()) {
                sb2.append("<div class='item'>\n");
                sb2.append("<span class='key'>" + entry2.getKey() + "</span>\n");
                sb2.append("<span class='value'>" + entry2.getValue() + "</span>\n");
                sb2.append(str6);
            }
            sb2.append(str6);
        }
        sb2.append("</section>\n");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toHtml$lambda$8(TextField textField, TextField textField2) {
        return compareFieldInfo(textField.getInfo(), textField2.getInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toHtml$lambda$9(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toHtml$lambda$11$lambda$10(StringBuilder html, TextField it) {
        Intrinsics.checkNotNullParameter(html, "$html");
        Intrinsics.checkNotNullParameter(it, "$it");
        html.append(toHtmlEscaped(it.getValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toHtml$lambda$14$lambda$13$lambda$12(StringBuilder html, BasicTextObject obj) {
        Intrinsics.checkNotNullParameter(html, "$html");
        Intrinsics.checkNotNullParameter(obj, "$obj");
        html.append(toHtmlEscaped(obj.getText()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toHtml$lambda$15(ImageField imageField, ImageField imageField2) {
        return compareFieldInfo(imageField.getInfo(), imageField2.getInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toHtml$lambda$16(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toHtml$lambda$18$lambda$17(StringBuilder html, ImageField it) {
        Intrinsics.checkNotNullParameter(html, "$html");
        Intrinsics.checkNotNullParameter(it, "$it");
        html.append(htmlSvgImage(it.getValue(), "root", "max-width: 100%; height:auto"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toHtml$lambda$22$lambda$21(StringBuilder html, TableField it) {
        Intrinsics.checkNotNullParameter(html, "$html");
        Intrinsics.checkNotNullParameter(it, "$it");
        html.append("<table cellspacing='2' cellpadding='2'>\n");
        Iterator<T> it2 = it.getRows().iterator();
        while (it2.hasNext()) {
            List<TextField> list = (List) it2.next();
            html.append("<tr>");
            for (TextField textField : list) {
                String str = textField.getInfo().getAttributes().get("multicol");
                if (str == null) {
                    str = "1";
                }
                html.append("<td colspan=" + str + "><span>" + textField.getValue() + "</span></td>");
            }
            html.append("</tr>\n");
        }
        html.append("</table>\n");
        return Unit.INSTANCE;
    }

    private static final int compareFieldInfo(FieldInfo fieldInfo, FieldInfo fieldInfo2) {
        String str = fieldInfo.getAttributes().get("order");
        Integer intOrNull = str != null ? StringsKt.toIntOrNull(str) : null;
        String str2 = fieldInfo2.getAttributes().get("order");
        Integer intOrNull2 = str2 != null ? StringsKt.toIntOrNull(str2) : null;
        if (intOrNull != null && intOrNull2 != null) {
            return intOrNull.intValue() - intOrNull2.intValue();
        }
        if (intOrNull != null) {
            return 1;
        }
        return (intOrNull2 != null && intOrNull2.intValue() == 0) ? 0 : -1;
    }

    private static final String getLabel(FieldInfo fieldInfo) {
        String local;
        DocName name = fieldInfo.getName();
        if (name != null && (local = name.getLocal()) != null) {
            if (local.length() <= 0) {
                local = fieldInfo.getKey();
            }
            if (local != null) {
                return local;
            }
        }
        return fieldInfo.getKey();
    }

    static /* synthetic */ void toHtml$default(FieldInfo fieldInfo, StringBuilder sb, int i, boolean z, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        toHtml(fieldInfo, sb, i, z, (Function0<Unit>) function0);
    }

    private static final void toHtml(FieldInfo fieldInfo, StringBuilder sb, int i, boolean z, Function0<Unit> function0) {
        String strHtmlSvgImage;
        String str = null;
        if (z) {
            if (Intrinsics.areEqual(fieldInfo.getAttributes().get("has_object"), "true")) {
                if (Intrinsics.areEqual(fieldInfo.getAttributes().get("color_check"), "true")) {
                    strHtmlSvgImage = htmlSvgImage(UtilsKt.drawableToBitmap(AppKt.getApp(), C3069R.drawable.res_check_passed, Color.parseColor("#0000FF"), Color.parseColor("#FFFFFF")), null, "width:1em; height:1em; margin-left:1em");
                } else {
                    strHtmlSvgImage = htmlSvgImage(UtilsKt.drawableToBitmap(AppKt.getApp(), C3069R.drawable.res_check_passed, Color.parseColor("#000000"), Color.parseColor("#FFFFFF")), null, "width:1em; height:1em; margin-left:1em");
                }
            } else {
                strHtmlSvgImage = htmlSvgImage(UtilsKt.drawableToBitmap(AppKt.getApp(), C3069R.drawable.res_check_undefined, Color.parseColor("#000000"), Color.parseColor("#FFFFFF")), null, "width:1em; height:1em; margin-left:1em");
            }
            str = "<span>" + strHtmlSvgImage + "</span>";
        }
        dataRowToHtml(sb, i + ':' + fieldInfo.getKey(), Boolean.valueOf(fieldInfo.isAccepted()), getLabel(fieldInfo), str, function0);
    }

    private static final String toHtmlEscaped(String str) {
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "&", "&amp;", false, 4, (Object) null), "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null), "\"", "&quot;", false, 4, (Object) null), "'", "&#39;", false, 4, (Object) null);
    }

    public static /* synthetic */ void toSvgPolygon$default(Geometry geometry, StringBuilder sb, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        toSvgPolygon(geometry, sb, str, z);
    }

    public static final void toSvgPolygon(Geometry geometry, StringBuilder html, String id, boolean z) {
        Intrinsics.checkNotNullParameter(geometry, "<this>");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(id, "id");
        List<QuadPoint> points = geometry.getPoints();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
        for (QuadPoint quadPoint : points) {
            arrayList.add(new StringBuilder().append(quadPoint.getX()).append(',').append(quadPoint.getY()).toString());
        }
        html.append("<polygon class='poly" + (z ? " hidden-poly" : "") + "' parent_id='" + id + "' points='" + CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, null, 62, null) + "'/>\n");
    }

    public static final void dataRowToHtml(StringBuilder html, String str, Boolean bool, String str2, String str3, Function0<Unit> printValue) {
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(printValue, "printValue");
        html.append("<div class='item'>\n");
        html.append("<span class='key'>\n");
        if (bool != null) {
            html.append("<span class='dot_" + (bool.booleanValue() ? "green" : "yellow") + "'></span>");
            if (str2 != null) {
                html.append(str2);
            }
            if (str3 != null) {
                html.append(str3);
            }
        }
        html.append("</span>\n");
        html.append("<div class='value' data-id='" + str + "'>");
        printValue.invoke();
        html.append("</div>\n");
        html.append("</div>\n");
    }

    public static final String htmlSvgImage(Bitmap bitmap, String str, String style) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(style, "style");
        return htmlSvgImage(UtilsKt.bitmapToBase64String(bitmap), bitmap.getWidth(), bitmap.getHeight(), str, style);
    }

    public static final String htmlSvgImage(String base64String, int i, int i2, String str, String style) {
        Intrinsics.checkNotNullParameter(base64String, "base64String");
        Intrinsics.checkNotNullParameter(style, "style");
        return "<svg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 " + i + ' ' + i2 + "' " + (str != null ? "id='" + str + "' " : "") + "style='" + style + "'><image width='" + i + "' height='" + i2 + "' href='data:image/jpeg;base64," + base64String + "'/>\n</svg>";
    }
}
