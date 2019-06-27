// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;


/** \brief Simple blender which mixes images at its borders.
 */
@Namespace("cv::detail") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class FeatherBlender extends Blender {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FeatherBlender(Pointer p) { super(p); }

    public FeatherBlender(float sharpness/*=0.02f*/) { super((Pointer)null); allocate(sharpness); }
    private native void allocate(float sharpness/*=0.02f*/);
    public FeatherBlender() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native float sharpness();
    public native void setSharpness(float val);

    public native void prepare(@ByVal Rect dst_roi);
    public native void feed(@ByVal Mat img, @ByVal Mat mask, @ByVal Point tl);
    public native void feed(@ByVal UMat img, @ByVal UMat mask, @ByVal Point tl);
    public native void feed(@ByVal GpuMat img, @ByVal GpuMat mask, @ByVal Point tl);
    public native void blend(@ByVal Mat dst, @ByVal Mat dst_mask);
    public native void blend(@ByVal UMat dst, @ByVal UMat dst_mask);
    public native void blend(@ByVal GpuMat dst, @ByVal GpuMat dst_mask);

    /** Creates weight maps for fixed set of source images by their masks and top-left corners.
     *  Final image can be obtained by simple weighting of the source images. */
    public native @ByVal Rect createWeightMaps(@Const @ByRef UMatVector masks, @Const @ByRef PointVector corners,
            @ByRef UMatVector weight_maps);
}
