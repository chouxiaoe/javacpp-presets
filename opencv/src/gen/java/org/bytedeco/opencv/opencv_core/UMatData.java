// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;



/////////////////////////////////////// Mat ///////////////////////////////////////////

// note that umatdata might be allocated together
// with the matrix data, not as a separate object.
// therefore, it does not have constructor or destructor;
// it should be explicitly initialized using init().
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class UMatData extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UMatData(Pointer p) { super(p); }

    /** enum cv::UMatData::MemoryFlag */
    public static final int COPY_ON_MAP = 1, HOST_COPY_OBSOLETE = 2,
        DEVICE_COPY_OBSOLETE = 4, TEMP_UMAT = 8, TEMP_COPIED_UMAT = 24,
        USER_ALLOCATED = 32, DEVICE_MEM_MAPPED = 64,
        ASYNC_CLEANUP = 128;
    public UMatData(@Const MatAllocator allocator) { super((Pointer)null); allocate(allocator); }
    private native void allocate(@Const MatAllocator allocator);

    // provide atomic access to the structure
    public native void lock();
    public native void unlock();

    public native @Cast("bool") boolean hostCopyObsolete();
    public native @Cast("bool") boolean deviceCopyObsolete();
    public native @Cast("bool") boolean deviceMemMapped();
    public native @Cast("bool") boolean copyOnMap();
    public native @Cast("bool") boolean tempUMat();
    public native @Cast("bool") boolean tempCopiedUMat();
    public native void markHostCopyObsolete(@Cast("bool") boolean flag);
    public native void markDeviceCopyObsolete(@Cast("bool") boolean flag);
    public native void markDeviceMemMapped(@Cast("bool") boolean flag);

    public native @Const MatAllocator prevAllocator(); public native UMatData prevAllocator(MatAllocator setter);
    public native @Const MatAllocator currAllocator(); public native UMatData currAllocator(MatAllocator setter);
    public native int urefcount(); public native UMatData urefcount(int setter);
    public native int refcount(); public native UMatData refcount(int setter);
    public native @Cast("uchar*") BytePointer data(); public native UMatData data(BytePointer setter);
    public native @Cast("uchar*") BytePointer origdata(); public native UMatData origdata(BytePointer setter);
    public native @Cast("size_t") long size(); public native UMatData size(long setter);

    public native @Cast("cv::UMatData::MemoryFlag") int flags(); public native UMatData flags(int setter);
    public native Pointer handle(); public native UMatData handle(Pointer setter);
    public native Pointer userdata(); public native UMatData userdata(Pointer setter);
    public native int allocatorFlags_(); public native UMatData allocatorFlags_(int setter);
    public native int mapcount(); public native UMatData mapcount(int setter);
    public native UMatData originalUMatData(); public native UMatData originalUMatData(UMatData setter);
}
