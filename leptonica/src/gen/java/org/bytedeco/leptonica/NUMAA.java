// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;


    /** Array of number arrays */
@Name("Numaa") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class NUMAA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NUMAA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NUMAA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NUMAA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NUMAA position(long position) {
        return (NUMAA)super.position(position);
    }

    /** size of allocated ptr array          */
    public native @Cast("l_int32") int nalloc(); public native NUMAA nalloc(int setter);
    /** number of Numa saved                 */
    public native @Cast("l_int32") int n(); public native NUMAA n(int setter);
    /** array of Numa                        */
    public native NUMA numa(int i); public native NUMAA numa(int i, NUMA setter);
    public native @Cast("Numa**") PointerPointer numa(); public native NUMAA numa(PointerPointer setter);
}
