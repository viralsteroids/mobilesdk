package com.smartengines.camera;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShutterSound.kt */
@Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m514d2 = {"Lcom/smartengines/camera/ShutterSound;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "play", "", "camera_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ShutterSound {
    public static final int $stable = 8;
    private final AudioManager audioManager;
    private final MediaPlayer mediaPlayer;

    public ShutterSound(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
        MediaPlayer mediaPlayerCreate = MediaPlayer.create(context, Uri.parse("file:///system/media/audio/ui/camera_click.ogg"));
        Intrinsics.checkNotNullExpressionValue(mediaPlayerCreate, "create(...)");
        this.mediaPlayer = mediaPlayerCreate;
    }

    public final AudioManager getAudioManager() {
        return this.audioManager;
    }

    public final MediaPlayer getMediaPlayer() {
        return this.mediaPlayer;
    }

    public final void play() throws IllegalStateException {
        if (this.audioManager.getStreamVolume(5) != 0) {
            this.mediaPlayer.start();
        }
    }
}
