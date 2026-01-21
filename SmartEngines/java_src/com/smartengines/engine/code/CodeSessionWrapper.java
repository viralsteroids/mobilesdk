package com.smartengines.engine.code;

import android.graphics.Bitmap;
import android.util.Log;
import com.smartengines.code.CodeEngine;
import com.smartengines.code.CodeEngineResult;
import com.smartengines.code.CodeEngineSession;
import com.smartengines.code.CodeEngineSessionSettings;
import com.smartengines.engine.ImageFactory;
import com.smartengines.engine.Result;
import com.smartengines.engine.Session;
import com.smartengines.utils.UtilsKt;
import com.smartengines.visualization.Visualization;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeSessionWrapper.kt */
@Metadata(m513d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006%"}, m514d2 = {"Lcom/smartengines/engine/code/CodeSessionWrapper;", "Lcom/smartengines/engine/Session;", "codeEngine", "Lcom/smartengines/code/CodeEngine;", "codeSessionSettings", "Lcom/smartengines/code/CodeEngineSessionSettings;", "signature", "", "<init>", "(Lcom/smartengines/code/CodeEngine;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;)V", "getCodeSessionSettings", "()Lcom/smartengines/code/CodeEngineSessionSettings;", "codeSession", "Lcom/smartengines/code/CodeEngineSession;", "getCodeSession", "()Lcom/smartengines/code/CodeEngineSession;", "value", "", "isEnded", "()Z", "quads", "Lcom/smartengines/visualization/Visualization$Quads;", "visualizations", "", "getVisualizations", "()Ljava/util/List;", "callback", "Lcom/smartengines/engine/code/CodeCallback;", "processImage", "", "bitmap", "Landroid/graphics/Bitmap;", "delete", "currentResult", "Lcom/smartengines/engine/Result;", "getCurrentResult", "()Lcom/smartengines/engine/Result;", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CodeSessionWrapper implements Session {
    private final CodeCallback callback;
    private final CodeEngineSession codeSession;
    private final CodeEngineSessionSettings codeSessionSettings;
    private boolean isEnded;
    private final Visualization.Quads quads;
    private final List<Visualization.Quads> visualizations;

    public CodeSessionWrapper(CodeEngine codeEngine, CodeEngineSessionSettings codeSessionSettings, String signature) {
        Intrinsics.checkNotNullParameter(codeEngine, "codeEngine");
        Intrinsics.checkNotNullParameter(codeSessionSettings, "codeSessionSettings");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.codeSessionSettings = codeSessionSettings;
        Visualization.Quads quads = new Visualization.Quads(null, 1, null);
        this.quads = quads;
        this.visualizations = CollectionsKt.listOf(quads);
        CodeCallback codeCallback = new CodeCallback(new CodeSessionWrapper$callback$1(quads), null);
        this.callback = codeCallback;
        this.codeSession = codeEngine.SpawnSession(codeSessionSettings, signature, null, codeCallback);
        Log.w("myapp.CodeSessionWrapper", "Session created");
    }

    public final CodeEngineSessionSettings getCodeSessionSettings() {
        return this.codeSessionSettings;
    }

    public final CodeEngineSession getCodeSession() {
        return this.codeSession;
    }

    @Override // com.smartengines.engine.Session
    /* renamed from: isEnded, reason: from getter */
    public boolean getIsEnded() {
        return this.isEnded;
    }

    @Override // com.smartengines.engine.Session
    public List<Visualization.Quads> getVisualizations() {
        return this.visualizations;
    }

    @Override // com.smartengines.engine.Session
    public void processImage(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.quads.setFrameSize(UtilsKt.getSize(bitmap));
        this.isEnded = this.codeSession.Process(ImageFactory.INSTANCE.imageFromBitmap(bitmap)).IsTerminal();
    }

    @Override // com.smartengines.engine.Session
    public void delete() {
        this.codeSession.delete();
        Log.w("myapp.CodeSessionWrapper", "Session deleted");
    }

    @Override // com.smartengines.engine.Session
    public Result getCurrentResult() {
        CodeEngineResult codeEngineResultGetCurrentResult = this.codeSession.GetCurrentResult();
        Intrinsics.checkNotNullExpressionValue(codeEngineResultGetCurrentResult, "GetCurrentResult(...)");
        return CodeResultParserKt.parse(codeEngineResultGetCurrentResult);
    }
}
