package ss6_inheritance.exercies.lop_point2D_va_lop_point3D;

import java.util.Arrays;

public class Point2D {
    double x = 0.0;
    double y = 0.0;

    public Point2D() {
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getXY() {
        double[] arr = new double[2];
        arr[0] = getX();
        arr[1] = getY();
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D: " +
                "(x,y): " + Arrays.toString(getXY())
                ;
    }
}
