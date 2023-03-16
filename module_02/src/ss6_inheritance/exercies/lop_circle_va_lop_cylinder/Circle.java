package ss6_inheritance.exercies.lop_circle_va_lop_cylinder;

public class Circle {
    private double radius = 2.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area() {
        return getRadius() * getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: " + "radius= " + radius + ", color= " + color;
    }
}
