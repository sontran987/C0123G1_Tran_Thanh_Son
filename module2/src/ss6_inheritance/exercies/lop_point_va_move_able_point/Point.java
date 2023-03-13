package ss6_inheritance.exercies.lop_point_va_move_able_point;

import java.util.Arrays;

public class Point {
    protected double x = 0;
    protected double y = 0;

    public Point() {
    }

    public Point(double x, double y) {
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
        double[] array = new double[2];
        array[0] = getX();
        array[1] = getY();
        return array;
    }

    @Override
    public String toString() {
        return "Point: " + "(x,y)= " + Arrays.toString(getXY());
    }
}
