package com.smartengines.targets.text;

import com.smartengines.common.StringsMapIterator;
import com.smartengines.common.StringsSetIterator;
import com.smartengines.text.TextSessionSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextSessionOptions.kt */
@Metadata(m513d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u0004\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u0004\u001a\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m514d2 = {"TAG", "", "parse", "Lcom/smartengines/targets/text/TextSessionOptions;", "Lcom/smartengines/text/TextSessionSettings;", "loadSupportedIterators", "", "loadSupportedLanguages", "loadOptions", "targets_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextSessionOptionsKt {
    private static final String TAG = "myapp.TextSesOptions";

    public static final TextSessionOptions parse(TextSessionSettings textSessionSettings) {
        Intrinsics.checkNotNullParameter(textSessionSettings, "<this>");
        return new TextSessionOptions(loadSupportedLanguages(textSessionSettings), loadSupportedIterators(textSessionSettings));
    }

    public static final List<String> loadSupportedIterators(TextSessionSettings textSessionSettings) {
        Intrinsics.checkNotNullParameter(textSessionSettings, "<this>");
        ArrayList arrayList = new ArrayList();
        StringsSetIterator stringsSetIteratorSupportedTextIteratorsBegin = textSessionSettings.SupportedTextIteratorsBegin();
        StringsSetIterator stringsSetIteratorSupportedTextIteratorsEnd = textSessionSettings.SupportedTextIteratorsEnd();
        while (!stringsSetIteratorSupportedTextIteratorsBegin.Equals(stringsSetIteratorSupportedTextIteratorsEnd)) {
            arrayList.add(stringsSetIteratorSupportedTextIteratorsBegin.GetValue());
            stringsSetIteratorSupportedTextIteratorsBegin.Advance();
        }
        return arrayList;
    }

    public static final List<String> loadSupportedLanguages(TextSessionSettings textSessionSettings) {
        Intrinsics.checkNotNullParameter(textSessionSettings, "<this>");
        ArrayList arrayList = new ArrayList();
        StringsSetIterator stringsSetIteratorSupportedLanguagesBegin = textSessionSettings.SupportedLanguagesBegin();
        StringsSetIterator stringsSetIteratorSupportedLanguagesEnd = textSessionSettings.SupportedLanguagesEnd();
        while (!stringsSetIteratorSupportedLanguagesBegin.Equals(stringsSetIteratorSupportedLanguagesEnd)) {
            arrayList.add(stringsSetIteratorSupportedLanguagesBegin.GetValue());
            stringsSetIteratorSupportedLanguagesBegin.Advance();
        }
        return arrayList;
    }

    public static final List<String> loadOptions(TextSessionSettings textSessionSettings) {
        Intrinsics.checkNotNullParameter(textSessionSettings, "<this>");
        ArrayList arrayList = new ArrayList();
        StringsMapIterator stringsMapIteratorOptionsBegin = textSessionSettings.OptionsBegin();
        StringsMapIterator stringsMapIteratorOptionsEnd = textSessionSettings.OptionsEnd();
        while (!stringsMapIteratorOptionsBegin.Equals(stringsMapIteratorOptionsEnd)) {
            arrayList.add(stringsMapIteratorOptionsBegin.GetValue());
            stringsMapIteratorOptionsBegin.Advance();
        }
        return arrayList;
    }
}
