package com.smartengines.app;

import com.smartengines.engine.SessionSettingsLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionSettingsLoggerImpl.kt */
@Metadata(m513d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, m514d2 = {"Lcom/smartengines/app/SessionSettingsLoggerImpl;", "Lcom/smartengines/engine/SessionSettingsLogger;", "<init>", "()V", "_actions", "Ljava/util/ArrayList;", "Lcom/smartengines/engine/SessionSettingsLogger$Action;", "actions", "", "getActions", "()Ljava/util/List;", "logAction", "", "action", "_data", "Ljava/util/HashMap;", "", "", "data", "", "getData", "()Ljava/util/Map;", "logData", "key", "value", "clear", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class SessionSettingsLoggerImpl implements SessionSettingsLogger {
    public static final SessionSettingsLoggerImpl INSTANCE = new SessionSettingsLoggerImpl();
    private static final ArrayList<SessionSettingsLogger.Action> _actions = new ArrayList<>();
    private static final HashMap<String, Object> _data = new HashMap<>();
    public static final int $stable = 8;

    private SessionSettingsLoggerImpl() {
    }

    @Override // com.smartengines.engine.SessionSettingsLogger
    public List<SessionSettingsLogger.Action> getActions() {
        return _actions;
    }

    @Override // com.smartengines.engine.SessionSettingsLogger
    public void logAction(SessionSettingsLogger.Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        _actions.add(action);
    }

    @Override // com.smartengines.engine.SessionSettingsLogger
    public Map<String, Object> getData() {
        return _data;
    }

    @Override // com.smartengines.engine.SessionSettingsLogger
    public void logData(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        _data.put(key, value);
    }

    @Override // com.smartengines.engine.SessionSettingsLogger
    public void clear() {
        _actions.clear();
        _data.clear();
    }
}
