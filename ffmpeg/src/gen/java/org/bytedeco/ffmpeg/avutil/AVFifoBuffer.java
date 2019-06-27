// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVFifoBuffer extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFifoBuffer() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVFifoBuffer(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFifoBuffer(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVFifoBuffer position(long position) {
        return (AVFifoBuffer)super.position(position);
    }

    public native @Cast("uint8_t*") BytePointer buffer(); public native AVFifoBuffer buffer(BytePointer setter);
    public native @Cast("uint8_t*") BytePointer rptr(); public native AVFifoBuffer rptr(BytePointer setter);
    public native @Cast("uint8_t*") BytePointer wptr(); public native AVFifoBuffer wptr(BytePointer setter);
    public native @Cast("uint8_t*") BytePointer end(); public native AVFifoBuffer end(BytePointer setter);
    public native @Cast("uint32_t") int rndx(); public native AVFifoBuffer rndx(int setter);
    public native @Cast("uint32_t") int wndx(); public native AVFifoBuffer wndx(int setter);
}
