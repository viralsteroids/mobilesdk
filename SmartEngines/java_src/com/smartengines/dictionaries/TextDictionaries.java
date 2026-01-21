package com.smartengines.dictionaries;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextDictionaries.kt */
@Metadata(m513d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m514d2 = {"Lcom/smartengines/dictionaries/TextDictionaries;", "", "<init>", "()V", "loadTextLanguages", "", "Lcom/smartengines/dictionaries/KeyName;", "context", "Landroid/content/Context;", "isShortList", "", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextDictionaries {
    public static final TextDictionaries INSTANCE = new TextDictionaries();

    private TextDictionaries() {
    }

    public final List<KeyName> loadTextLanguages(Context context, boolean isShortList) {
        Intrinsics.checkNotNullParameter(context, "context");
        return TextLanguages.INSTANCE.loadDictionary(context, isShortList ? SetsKt.setOf((Object[]) new String[]{"digits", "eng", "rus"}) : null);
    }
}
