package org.bytedeco.opencv.opencv_core;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.Properties;

@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public abstract class AbstractCvPoint2D64f extends DoublePointer {
    static { Loader.load(); }
    public AbstractCvPoint2D64f(Pointer p) { super(p); }

//    public CvPoint2D64f(double[] pts, int offset, int length) {
//        this(length/2);
//        put(pts, offset, length);
//    }
//    public CvPoint2D64f(double ... pts) {
//        this(pts, 0, pts.length);
//    }

    public abstract double x(); public abstract CvPoint2D64f x(double x);
    public abstract double y(); public abstract CvPoint2D64f y(double y);

//    public double[] get() {
//        double[] pts = new double[capacity == 0 ? 2 : 2*capacity];
//        get(pts);
//        return pts;
//    }
    public CvPoint2D64f get(double[] pts) {
        return get(pts, 0, pts.length);
    }
    public CvPoint2D64f get(double[] pts, int offset, int length) {
        for (int i = 0; i < length/2; i++) {
            position(i);
            pts[offset + i*2  ] = x();
            pts[offset + i*2+1] = y();
        }
        return (CvPoint2D64f)position(0);
    }

    public final CvPoint2D64f put(double[] pts, int offset, int length) {
        for (int i = 0; i < length/2; i++) {
            position(i); put(pts[offset + i*2], pts[offset + i*2+1]);
        }
        return (CvPoint2D64f)position(0);
    }
    public final CvPoint2D64f put(double ... pts) {
        return put(pts, 0, pts.length);
    }

    public CvPoint2D64f put(double x, double y) {
        return x(x).y(y);
    }
    public CvPoint2D64f put(CvPoint o) {
        return x(o.x()).y(o.y());
    }
    public CvPoint2D64f put(CvPoint2D32f o) {
        return x(o.x()).y(o.y());
    }
    public CvPoint2D64f put(CvPoint2D64f o) {
        return x(o.x()).y(o.y());
    }

    @Override public String toString() {
        if (isNull()) {
            return super.toString();
        } else {
            if (capacity() == 0) {
                return "(" + (float)x() + ", " + (float)y() + ")";
            }
            String s = "";
            long p = position();
            for (long i = 0; i < capacity(); i++) {
                position(i);
                s += (i == 0 ? "(" : " (") + (float)x() + ", " + (float)y() + ")";
            }
            position(p);
            return s;
        }
    }
}
