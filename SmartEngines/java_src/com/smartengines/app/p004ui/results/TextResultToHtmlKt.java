package com.smartengines.app.p004ui.results;

import android.content.Context;
import android.graphics.Bitmap;
import com.smartengines.engine.text.TextResultChunk;
import com.smartengines.engine.text.TextResultData;
import com.smartengines.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextResultToHtml.kt */
@Metadata(m513d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a%\u0010\u0007\u001a\u00020\b*\u00020\u00022\n\u0010\t\u001a\u00060\u000bj\u0002`\n2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\b*\u00020\u00022\n\u0010\t\u001a\u00060\u000bj\u0002`\nH\u0002¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m514d2 = {"toHtml", "", "Lcom/smartengines/engine/text/TextResultData;", "context", "Landroid/content/Context;", "scene", "Landroid/graphics/Bitmap;", "sceneToHtml", "", "html", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "bitmap", "(Lcom/smartengines/engine/text/TextResultData;Ljava/lang/StringBuilder;Landroid/graphics/Bitmap;)V", "chunksToHtml", "(Lcom/smartengines/engine/text/TextResultData;Ljava/lang/StringBuilder;)V", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextResultToHtmlKt {
    public static final String toHtml(TextResultData textResultData, Context context, Bitmap scene) {
        Intrinsics.checkNotNullParameter(textResultData, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scene, "scene");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("<!DOCTYPE html>\n<html>\n<head>\n<meta name='viewport'  content='width=device-width, initial-scale=1.0'>\n");
            sb.append("<style type='text/css'>" + UtilsKt.readAssetsTextFile(context, "text-result.css") + "</style>\n");
            sb.append("<script type='text/javascript'>" + UtilsKt.readAssetsTextFile(context, "text-result.js") + "</script>\n");
            sb.append("</head>\n<body>\n<section>\n");
            sceneToHtml(textResultData, sb, scene);
            chunksToHtml(textResultData, sb);
            sb.append("</section>\n");
            sb.append("</body>\n");
            sb.append("</html>\n");
            return sb.toString();
        } catch (Exception e) {
            return "<html><body>Error: " + e + " </body></html>";
        }
    }

    private static final void sceneToHtml(TextResultData textResultData, StringBuilder sb, Bitmap bitmap) {
        sb.append("<div class='svg_container' align='center'>");
        sb.append("<svg viewBox='0 0 " + bitmap.getWidth() + ' ' + bitmap.getHeight() + "' id='root' xmlns='http://www.w3.org/2000/svg' style='max-width: 100%; height:auto'>");
        sb.append("<image width='" + bitmap.getWidth() + "' height='" + bitmap.getHeight() + "' href='data:image/jpeg;base64," + UtilsKt.bitmapToBase64String(bitmap) + "'/>\n");
        int i = 0;
        for (Object obj : textResultData.getChunks()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DocResultToHtmlKt.toSvgPolygon$default(((TextResultChunk) obj).getGeometry(), sb, "chunk_" + i, false, 4, null);
            i = i2;
        }
        sb.append("</svg>");
        sb.append("</div>");
    }

    private static final void chunksToHtml(TextResultData textResultData, final StringBuilder sb) {
        sb.append("<div class='container'>\n");
        int i = 0;
        for (Object obj : textResultData.getChunks()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final TextResultChunk textResultChunk = (TextResultChunk) obj;
            DocResultToHtmlKt.dataRowToHtml(sb, "chunk_" + i, Boolean.valueOf(textResultChunk.isAccepted()), String.valueOf(i2), null, new Function0() { // from class: com.smartengines.app.ui.results.TextResultToHtmlKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextResultToHtmlKt.chunksToHtml$lambda$2$lambda$1(sb, textResultChunk);
                }
            });
            i = i2;
        }
        sb.append("</div>\n");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit chunksToHtml$lambda$2$lambda$1(StringBuilder html, TextResultChunk chunk) {
        Intrinsics.checkNotNullParameter(html, "$html");
        Intrinsics.checkNotNullParameter(chunk, "$chunk");
        html.append(chunk.getValue());
        return Unit.INSTANCE;
    }
}
