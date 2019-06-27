// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** A GigE property. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2GigEProperty extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2GigEProperty() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2GigEProperty(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2GigEProperty(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2GigEProperty position(long position) {
            return (fc2GigEProperty)super.position(position);
        }
    
        /** The type of property. */
        public native @Cast("fc2GigEPropertyType") int propType(); public native fc2GigEProperty propType(int setter);
        /**
         * Whether the property is readable. If this is false, then
         * no other value in this structure is valid.
         */
        public native @Cast("BOOL") int isReadable(); public native fc2GigEProperty isReadable(int setter);
        /** Whether the property is writable. */
        public native @Cast("BOOL") int isWritable(); public native fc2GigEProperty isWritable(int setter);
        /** Minimum value. */
        public native @Cast("unsigned int") int min(); public native fc2GigEProperty min(int setter);
        /** Maximum value. */
        public native @Cast("unsigned int") int max(); public native fc2GigEProperty max(int setter);
        /** Current value. */
        public native @Cast("unsigned int") int value(); public native fc2GigEProperty value(int setter);

        public native @Cast("unsigned int") int reserved(int i); public native fc2GigEProperty reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
    }
