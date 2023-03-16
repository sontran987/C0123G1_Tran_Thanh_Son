package ss6_inheritance.exercies.lop_point_va_move_able_point;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MovablePoint extends Point {
    private double xSpeed = 0.0;
    private double ySpeed = 0.0;

    public MovablePoint() {
    }

    public MovablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double[] getSpeed() {
        double[] arr = new double[2];
        arr[0] = getxSpeed();
        arr[1] = getySpeed();
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint: " +
                Arrays.toString(getXY()) + ", speed= " +
                Arrays.toString(getSpeed());
    }

    public MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
