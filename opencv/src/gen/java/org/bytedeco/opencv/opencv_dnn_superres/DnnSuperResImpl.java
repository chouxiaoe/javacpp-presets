// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn_superres;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_dnn_superres.*;


/** \addtogroup dnn_superres
 *  \{
<p>
/** \brief A class to upscale images via convolutional neural networks.
The following four models are implemented:
<p>
- edsr
- espcn
- fsrcnn
- lapsrn
 */

@Namespace("cv::dnn_superres") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn_superres.class)
public class DnnSuperResImpl extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DnnSuperResImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DnnSuperResImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DnnSuperResImpl position(long position) {
        return (DnnSuperResImpl)super.position(position);
    }


    /** \brief Empty constructor
     */
    public DnnSuperResImpl() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \brief Constructor which immediately sets the desired model
    @param algo String containing one of the desired models:
        - __edsr__
        - __espcn__
        - __fsrcnn__
        - __lapsrn__
    @param scale Integer specifying the upscale factor
     */
    public DnnSuperResImpl(@StdString BytePointer algo, int scale) { super((Pointer)null); allocate(algo, scale); }
    private native void allocate(@StdString BytePointer algo, int scale);
    public DnnSuperResImpl(@StdString String algo, int scale) { super((Pointer)null); allocate(algo, scale); }
    private native void allocate(@StdString String algo, int scale);

    /** \brief Read the model from the given path
    @param path Path to the model file.
    */
    public native void readModel(@StdString BytePointer path);
    public native void readModel(@StdString String path);

    /** \brief Read the model from the given path
    @param weights Path to the model weights file.
    @param definition Path to the model definition file.
    */
    public native void readModel(@StdString BytePointer weights, @StdString BytePointer definition);
    public native void readModel(@StdString String weights, @StdString String definition);

    /** \brief Set desired model
    @param algo String containing one of the desired models:
        - __edsr__
        - __espcn__
        - __fsrcnn__
        - __lapsrn__
    @param scale Integer specifying the upscale factor
     */
    public native void setModel(@StdString BytePointer algo, int scale);
    public native void setModel(@StdString String algo, int scale);

    /** \brief Upsample via neural network
    @param img Image to upscale
    @param result Destination upscaled image
     */
    public native void upsample(@ByVal Mat img, @ByVal Mat result);
    public native void upsample(@ByVal UMat img, @ByVal UMat result);
    public native void upsample(@ByVal GpuMat img, @ByVal GpuMat result);

    /** \brief Upsample via neural network of multiple outputs
    @param img Image to upscale
    @param imgs_new Destination upscaled images
    @param scale_factors Scaling factors of the output nodes
    @param node_names Names of the output nodes in the neural network
    */
    public native void upsampleMultioutput(@ByVal Mat img, @ByRef MatVector imgs_new, @StdVector IntPointer scale_factors, @Const @ByRef StringVector node_names);
    public native void upsampleMultioutput(@ByVal Mat img, @ByRef MatVector imgs_new, @StdVector IntBuffer scale_factors, @Const @ByRef StringVector node_names);
    public native void upsampleMultioutput(@ByVal Mat img, @ByRef MatVector imgs_new, @StdVector int[] scale_factors, @Const @ByRef StringVector node_names);
    public native void upsampleMultioutput(@ByVal UMat img, @ByRef MatVector imgs_new, @StdVector IntPointer scale_factors, @Const @ByRef StringVector node_names);
    public native void upsampleMultioutput(@ByVal UMat img, @ByRef MatVector imgs_new, @StdVector IntBuffer scale_factors, @Const @ByRef StringVector node_names);
    public native void upsampleMultioutput(@ByVal UMat img, @ByRef MatVector imgs_new, @StdVector int[] scale_factors, @Const @ByRef StringVector node_names);
    public native void upsampleMultioutput(@ByVal GpuMat img, @ByRef MatVector imgs_new, @StdVector IntPointer scale_factors, @Const @ByRef StringVector node_names);
    public native void upsampleMultioutput(@ByVal GpuMat img, @ByRef MatVector imgs_new, @StdVector IntBuffer scale_factors, @Const @ByRef StringVector node_names);
    public native void upsampleMultioutput(@ByVal GpuMat img, @ByRef MatVector imgs_new, @StdVector int[] scale_factors, @Const @ByRef StringVector node_names);

    /** \brief Returns the scale factor of the model:
    @return Current scale factor.
    */
    public native int getScale();

    /** \brief Returns the scale factor of the model:
    @return Current algorithm.
    */
    public native @StdString BytePointer getAlgorithm();
}
