package androidx.compose.foundation.text;

import androidx.compose.p000ui.input.key.Key;
import androidx.compose.p000ui.input.key.KeyEvent;
import androidx.compose.p000ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: KeyMapping.kt */
@Metadata(m513d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, m514d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    public static final KeyMapping commonKeyMapping(final Function1<? super KeyEvent, Boolean> function1) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo1751mapZmokQxo(android.view.KeyEvent event) {
                if (function1.invoke(KeyEvent.m5643boximpl(event)).booleanValue() && KeyEvent_androidKt.m5666isShiftPressedZmokQxo(event)) {
                    if (Key.m5352equalsimpl0(KeyEvent_androidKt.m5660getKeyZmokQxo(event), MappedKeys.INSTANCE.m1805getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (function1.invoke(KeyEvent.m5643boximpl(event)).booleanValue()) {
                    long jM5660getKeyZmokQxo = KeyEvent_androidKt.m5660getKeyZmokQxo(event);
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo, MappedKeys.INSTANCE.m1785getCEK5gGoQ()) ? true : Key.m5352equalsimpl0(jM5660getKeyZmokQxo, MappedKeys.INSTANCE.m1795getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo, MappedKeys.INSTANCE.m1802getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo, MappedKeys.INSTANCE.m1803getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo, MappedKeys.INSTANCE.m1782getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo, MappedKeys.INSTANCE.m1804getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo, MappedKeys.INSTANCE.m1805getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m5664isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m5666isShiftPressedZmokQxo(event)) {
                    long jM5660getKeyZmokQxo2 = KeyEvent_androidKt.m5660getKeyZmokQxo(event);
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1790getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1791getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1792getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1789getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1799getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1798getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1797getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1796getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1795getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM5660getKeyZmokQxo3 = KeyEvent_androidKt.m5660getKeyZmokQxo(event);
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1790getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1791getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1792getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1789getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1799getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1798getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1797getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1796getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1793getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1784getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1788getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1800getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1787getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1786getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1801getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m5664isCtrlPressedZmokQxo(((KeyEvent) obj).m5649unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo1751mapZmokQxo(android.view.KeyEvent event) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m5666isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m5664isCtrlPressedZmokQxo(event)) {
                    long jM5660getKeyZmokQxo = KeyEvent_androidKt.m5660getKeyZmokQxo(event);
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo, MappedKeys.INSTANCE.m1790getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo, MappedKeys.INSTANCE.m1791getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo, MappedKeys.INSTANCE.m1792getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo, MappedKeys.INSTANCE.m1789getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m5664isCtrlPressedZmokQxo(event)) {
                    long jM5660getKeyZmokQxo2 = KeyEvent_androidKt.m5660getKeyZmokQxo(event);
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1790getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1791getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1792getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1789getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1794getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1788getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1784getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo2, MappedKeys.INSTANCE.m1783getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m5666isShiftPressedZmokQxo(event)) {
                    long jM5660getKeyZmokQxo3 = KeyEvent_androidKt.m5660getKeyZmokQxo(event);
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1797getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_LEFT;
                    } else if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo3, MappedKeys.INSTANCE.m1796getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                    }
                } else if (KeyEvent_androidKt.m5663isAltPressedZmokQxo(event)) {
                    long jM5660getKeyZmokQxo4 = KeyEvent_androidKt.m5660getKeyZmokQxo(event);
                    if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo4, MappedKeys.INSTANCE.m1784getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m5352equalsimpl0(jM5660getKeyZmokQxo4, MappedKeys.INSTANCE.m1788getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo1751mapZmokQxo(event) : keyCommand;
            }
        };
    }
}
