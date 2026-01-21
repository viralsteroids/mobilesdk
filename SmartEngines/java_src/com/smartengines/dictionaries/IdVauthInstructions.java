package com.smartengines.dictionaries;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* compiled from: IdVauthInstructions.kt */
@Metadata(m513d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00070\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m514d2 = {"Lcom/smartengines/dictionaries/IdVauthInstructions;", "", "<init>", "()V", "TAG", "", "loadDictionary", "", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdVauthInstructions {
    public static final IdVauthInstructions INSTANCE = new IdVauthInstructions();
    private static final String TAG = "myapp.IdVauthInstr";

    private IdVauthInstructions() {
    }

    public final Map<String, Map<String, String>> loadDictionary() {
        return MapsKt.mapOf(TuplesKt.m521to("show_document", MapsKt.mapOf(TuplesKt.m521to("en", ""), TuplesKt.m521to("ru", ""))), TuplesKt.m521to("keep_showing_document", MapsKt.mapOf(TuplesKt.m521to("en", ""), TuplesKt.m521to("ru", ""))), TuplesKt.m521to("show_other_side", MapsKt.mapOf(TuplesKt.m521to("en", "Show the other side"), TuplesKt.m521to("ru", "Покажите другую сторону"))), TuplesKt.m521to("keep_showing_side", MapsKt.mapOf(TuplesKt.m521to("en", ""), TuplesKt.m521to("ru", ""))), TuplesKt.m521to("provide_selfie_photo", MapsKt.mapOf(TuplesKt.m521to("en", ""), TuplesKt.m521to("ru", ""))), TuplesKt.m521to("finish", MapsKt.mapOf(TuplesKt.m521to("en", ""), TuplesKt.m521to("ru", ""))));
    }
}
