package com.smartengines.engine.text;

import android.util.Log;
import com.smartengines.text.TextFeedback;
import com.smartengines.text.TextFeedbackContainer;
import com.smartengines.text.TextLocalizationFeedbackContainer;
import com.smartengines.text.TextPagesFeedbackContainer;
import kotlin.Metadata;

/* compiled from: TextCallback.kt */
@Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, m514d2 = {"Lcom/smartengines/engine/text/TextCallback;", "Lcom/smartengines/text/TextFeedback;", "<init>", "()V", "FeedbackReceived", "", "p0", "Lcom/smartengines/text/TextFeedbackContainer;", "PagesLocalizationFeedbackReceived", "Lcom/smartengines/text/TextPagesFeedbackContainer;", "TextLocalizationFeedbackReceived", "Lcom/smartengines/text/TextLocalizationFeedbackContainer;", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextCallback extends TextFeedback {
    @Override // com.smartengines.text.TextFeedback
    public void FeedbackReceived(TextFeedbackContainer p0) {
        Log.d("myapp.TextCallback", "===> FeedbackReceived " + p0);
    }

    @Override // com.smartengines.text.TextFeedback
    public void PagesLocalizationFeedbackReceived(TextPagesFeedbackContainer p0) {
        Log.d("myapp.TextCallback", "===> PagesLocalizationFeedbackReceived " + p0);
    }

    @Override // com.smartengines.text.TextFeedback
    public void TextLocalizationFeedbackReceived(TextLocalizationFeedbackContainer p0) {
        Log.d("myapp.TextCallback", "===> TextLocalizationFeedbackReceived " + p0);
    }
}
