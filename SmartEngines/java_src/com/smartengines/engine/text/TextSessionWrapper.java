package com.smartengines.engine.text;

import android.graphics.Bitmap;
import android.util.Log;
import com.smartengines.common.StringsSetIterator;
import com.smartengines.engine.ImageFactory;
import com.smartengines.engine.Result;
import com.smartengines.engine.Session;
import com.smartengines.text.TextEngine;
import com.smartengines.text.TextResult;
import com.smartengines.text.TextSession;
import com.smartengines.text.TextSessionSettings;
import com.smartengines.visualization.Visualization;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextSessionWrapper.kt */
@Metadata(m513d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001dH\u0017J\b\u0010*\u001a\u00020(H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00178F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m514d2 = {"Lcom/smartengines/engine/text/TextSessionWrapper;", "Lcom/smartengines/engine/Session;", "textEngine", "Lcom/smartengines/text/TextEngine;", "textSessionSettings", "Lcom/smartengines/text/TextSessionSettings;", "signature", "", "<init>", "(Lcom/smartengines/text/TextEngine;Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;)V", "getTextSessionSettings", "()Lcom/smartengines/text/TextSessionSettings;", "textSession", "Lcom/smartengines/text/TextSession;", "getTextSession", "()Lcom/smartengines/text/TextSession;", "callback", "Lcom/smartengines/engine/text/TextCallback;", "value", "", "isEnded", "()Z", "visualizations", "", "Lcom/smartengines/visualization/Visualization;", "getVisualizations", "()Ljava/util/List;", "_processedImages", "Ljava/util/ArrayList;", "Landroid/graphics/Bitmap;", "processedImages", "getProcessedImages", "currentResult", "Lcom/smartengines/engine/Result;", "getCurrentResult", "()Lcom/smartengines/engine/Result;", "setCurrentResult", "(Lcom/smartengines/engine/Result;)V", "supportedTextIterators", "processImage", "", "bitmap", "delete", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextSessionWrapper implements Session {
    private final ArrayList<Bitmap> _processedImages;
    private final TextCallback callback;
    private Result currentResult;
    private boolean isEnded;
    private final List<String> supportedTextIterators;
    private final TextSession textSession;
    private final TextSessionSettings textSessionSettings;
    private final List<Visualization> visualizations;

    public TextSessionWrapper(TextEngine textEngine, TextSessionSettings textSessionSettings, String signature) throws Exception {
        Intrinsics.checkNotNullParameter(textEngine, "textEngine");
        Intrinsics.checkNotNullParameter(textSessionSettings, "textSessionSettings");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.textSessionSettings = textSessionSettings;
        this.callback = new TextCallback();
        this.visualizations = CollectionsKt.emptyList();
        this._processedImages = new ArrayList<>();
        if (textSessionSettings.GetSupportedTextIteratorsCount() == 0) {
            throw new Exception("GetSupportedTextIteratorsCount()==0");
        }
        ArrayList arrayList = new ArrayList();
        StringsSetIterator stringsSetIteratorSupportedTextIteratorsBegin = textSessionSettings.SupportedTextIteratorsBegin();
        StringsSetIterator stringsSetIteratorSupportedTextIteratorsEnd = textSessionSettings.SupportedTextIteratorsEnd();
        while (!stringsSetIteratorSupportedTextIteratorsBegin.Equals(stringsSetIteratorSupportedTextIteratorsEnd)) {
            arrayList.add(stringsSetIteratorSupportedTextIteratorsBegin.GetValue());
            stringsSetIteratorSupportedTextIteratorsBegin.Advance();
        }
        this.supportedTextIterators = arrayList;
        this.textSession = textEngine.SpawnSession(this.textSessionSettings, signature, this.callback);
        Log.w("myapp.TextSessionWrapper", "Session created");
    }

    public final TextSessionSettings getTextSessionSettings() {
        return this.textSessionSettings;
    }

    public final TextSession getTextSession() {
        return this.textSession;
    }

    @Override // com.smartengines.engine.Session
    /* renamed from: isEnded, reason: from getter */
    public boolean getIsEnded() {
        return this.isEnded;
    }

    @Override // com.smartengines.engine.Session
    public List<Visualization> getVisualizations() {
        return this.visualizations;
    }

    public final List<Bitmap> getProcessedImages() {
        return this._processedImages;
    }

    @Override // com.smartengines.engine.Session
    public Result getCurrentResult() {
        return this.currentResult;
    }

    public void setCurrentResult(Result result) {
        this.currentResult = result;
    }

    @Override // com.smartengines.engine.Session
    public void processImage(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Log.d("myapp.TextSessionWrapper", "processImage");
        this.textSession.ProcessImage(ImageFactory.INSTANCE.imageFromBitmap(bitmap));
        this.isEnded = true;
        this._processedImages.add(bitmap);
        TextResult textResultGetCurrentResult = this.textSession.GetCurrentResult();
        Intrinsics.checkNotNull(textResultGetCurrentResult);
        setCurrentResult(TextResultParserKt.isInvalid(textResultGetCurrentResult) ? null : TextResultParserKt.parse(textResultGetCurrentResult));
    }

    @Override // com.smartengines.engine.Session
    public void delete() {
        this.textSession.delete();
        Log.w("myapp.TextSessionWrapper", "Session deleted");
    }
}
