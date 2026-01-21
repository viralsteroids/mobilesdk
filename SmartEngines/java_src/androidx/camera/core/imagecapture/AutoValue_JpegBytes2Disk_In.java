package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.JpegBytes2Disk;
import androidx.camera.core.processing.Packet;

/* loaded from: classes.dex */
final class AutoValue_JpegBytes2Disk_In extends JpegBytes2Disk.AbstractC0220In {
    private final ImageCapture.OutputFileOptions outputFileOptions;
    private final Packet<byte[]> packet;

    AutoValue_JpegBytes2Disk_In(Packet<byte[]> packet, ImageCapture.OutputFileOptions outputFileOptions) {
        if (packet == null) {
            throw new NullPointerException("Null packet");
        }
        this.packet = packet;
        if (outputFileOptions == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.outputFileOptions = outputFileOptions;
    }

    @Override // androidx.camera.core.imagecapture.JpegBytes2Disk.AbstractC0220In
    Packet<byte[]> getPacket() {
        return this.packet;
    }

    @Override // androidx.camera.core.imagecapture.JpegBytes2Disk.AbstractC0220In
    ImageCapture.OutputFileOptions getOutputFileOptions() {
        return this.outputFileOptions;
    }

    public String toString() {
        return "In{packet=" + this.packet + ", outputFileOptions=" + this.outputFileOptions + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof JpegBytes2Disk.AbstractC0220In) {
            JpegBytes2Disk.AbstractC0220In abstractC0220In = (JpegBytes2Disk.AbstractC0220In) obj;
            if (this.packet.equals(abstractC0220In.getPacket()) && this.outputFileOptions.equals(abstractC0220In.getOutputFileOptions())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.packet.hashCode() ^ 1000003) * 1000003) ^ this.outputFileOptions.hashCode();
    }
}
