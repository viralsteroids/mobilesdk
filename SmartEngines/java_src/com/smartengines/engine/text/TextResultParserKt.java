package com.smartengines.engine.text;

import android.util.Log;
import com.smartengines.common.Polygon;
import com.smartengines.engine.GeometryKt;
import com.smartengines.text.TextChunk;
import com.smartengines.text.TextIterator;
import com.smartengines.text.TextResult;
import com.smartengines.text.TextScene;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextResultParser.kt */
@Metadata(m513d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0004\u001a\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u0004\u001a\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\t*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\f"}, m514d2 = {"TAG", "", "isInvalid", "", "Lcom/smartengines/text/TextResult;", "(Lcom/smartengines/text/TextResult;)Z", "parse", "Lcom/smartengines/engine/text/TextResultData;", "parseChunks", "", "Lcom/smartengines/engine/text/TextResultChunk;", "parseLines", "engine_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextResultParserKt {
    private static final String TAG = "engine.TextResultParser";

    public static final boolean isInvalid(TextResult textResult) {
        Intrinsics.checkNotNullParameter(textResult, "<this>");
        return textResult.GetCurrentScene().IsGarbage();
    }

    public static final TextResultData parse(TextResult textResult) {
        Intrinsics.checkNotNullParameter(textResult, "<this>");
        return new TextResultData(parseChunks(textResult), parseLines(textResult));
    }

    public static final List<TextResultChunk> parseChunks(TextResult textResult) {
        Intrinsics.checkNotNullParameter(textResult, "<this>");
        TextScene textSceneGetCurrentScene = textResult.GetCurrentScene();
        Log.d(TAG, "TextResult.parseChunks; scene.IsGarbage=" + textSceneGetCurrentScene.IsGarbage() + "; textIterator=default");
        ArrayList arrayList = new ArrayList();
        if (!textSceneGetCurrentScene.IsGarbage()) {
            TextIterator textIteratorCreateIterator = textSceneGetCurrentScene.CreateIterator("default");
            while (!textIteratorCreateIterator.Finished()) {
                TextChunk textChunkGetTextChunk = textIteratorCreateIterator.GetTextChunk();
                String strGetCStr = textChunkGetTextChunk.GetOcrString().GetFirstString().GetCStr();
                Intrinsics.checkNotNull(strGetCStr);
                if (strGetCStr.length() > 0 && !Intrinsics.areEqual(strGetCStr, "\n")) {
                    double dGetConfidence = textChunkGetTextChunk.GetConfidence();
                    boolean zGetAcceptFlag = textChunkGetTextChunk.GetAcceptFlag();
                    Polygon polygonGetGeometry = textChunkGetTextChunk.GetGeometry();
                    Intrinsics.checkNotNullExpressionValue(polygonGetGeometry, "GetGeometry(...)");
                    arrayList.add(new TextResultChunk(strGetCStr, dGetConfidence, zGetAcceptFlag, GeometryKt.toGeometry(polygonGetGeometry, 0)));
                }
                textIteratorCreateIterator.Advance();
            }
        }
        return arrayList;
    }

    public static final List<String> parseLines(TextResult textResult) {
        Intrinsics.checkNotNullParameter(textResult, "<this>");
        TextScene textSceneGetCurrentScene = textResult.GetCurrentScene();
        Log.d(TAG, "TextResult.parseLines; scene.IsGarbage=" + textSceneGetCurrentScene.IsGarbage() + "; textIterator=lines");
        ArrayList arrayList = new ArrayList();
        if (!textSceneGetCurrentScene.IsGarbage()) {
            ArrayList arrayList2 = new ArrayList();
            TextIterator textIteratorCreateIterator = textSceneGetCurrentScene.CreateIterator("lines");
            while (!textIteratorCreateIterator.Finished()) {
                String strGetCStr = textIteratorCreateIterator.GetTextChunk().GetOcrString().GetFirstString().GetCStr();
                if (Intrinsics.areEqual(strGetCStr, "\n") && !arrayList2.isEmpty()) {
                    arrayList.add(CollectionsKt.joinToString$default(arrayList2, " ", null, null, 0, null, null, 62, null));
                    arrayList2.clear();
                } else {
                    arrayList2.add(strGetCStr);
                }
                textIteratorCreateIterator.Advance();
            }
        }
        return arrayList;
    }
}
