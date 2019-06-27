// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avcodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;

import static org.bytedeco.ffmpeg.global.avcodec.*;

@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class Func_AVCodecContext_Pointer_int_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Func_AVCodecContext_Pointer_int_int(Pointer p) { super(p); }
    protected Func_AVCodecContext_Pointer_int_int() { allocate(); }
    private native void allocate();
    public native int call(AVCodecContext c2, Pointer arg2, int arg3, int arg4);
}
