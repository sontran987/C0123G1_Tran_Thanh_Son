package ss6_inheritance.exercies.lop_point2D_va_lop_point3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private double z = 0;

    public Point3D() {
    }

    public Point3D(double z) {
        this.z = z;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(double z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public double[] getXYZ() {
        double[] arr = new double[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = getZ();
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D: " + "(x,y,z): " +
                Arrays.toString(getXYZ());
    }
}
