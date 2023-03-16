package ss7_abstraction_interface.exercies.trien_khai_interface_resizeable_cho_lop_hinh_hoc;

public class Circle extends Shape implements IResizeable {
    private double radius = 2.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
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

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double perimeter() {
        return 2 * getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: " + "radius= " + radius +
                ", color= " + getColor() +
                ", Area= " + getArea() +
                ", Perimeter= " + perimeter();
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() + getRadius() * percent / 100);
    }
}
