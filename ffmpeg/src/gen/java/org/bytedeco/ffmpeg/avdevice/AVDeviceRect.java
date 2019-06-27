// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avdevice;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;
import org.bytedeco.ffmpeg.avformat.*;
import static org.bytedeco.ffmpeg.global.avformat.*;
import org.bytedeco.ffmpeg.postproc.*;
import static org.bytedeco.ffmpeg.global.postproc.*;
import org.bytedeco.ffmpeg.swscale.*;
import static org.bytedeco.ffmpeg.global.swscale.*;
import org.bytedeco.ffmpeg.avfilter.*;
import static org.bytedeco.ffmpeg.global.avfilter.*;

import static org.bytedeco.ffmpeg.global.avdevice.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avdevice.class)
public class AVDeviceRect extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVDeviceRect() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVDeviceRect(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVDeviceRect(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVDeviceRect position(long position) {
        return (AVDeviceRect)super.position(position);
    }

    /** x coordinate of top left corner */
    public native int x(); public native AVDeviceRect x(int setter);
    /** y coordinate of top left corner */
    public native int y(); public native AVDeviceRect y(int setter);
    /** width */
    public native int width(); public native AVDeviceRect width(int setter);
    /** height */
    public native int height(); public native AVDeviceRect height(int setter);
}
