package net.p012sf.scuba.smartcards;

import java.util.EventListener;

/* loaded from: classes3.dex */
public interface CardTerminalListener extends EventListener {
    void cardInserted(CardEvent cardEvent);

    void cardRemoved(CardEvent cardEvent);
}
