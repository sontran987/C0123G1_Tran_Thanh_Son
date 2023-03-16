package ss6_inheritance.exercies.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double heigth = 2.0;

    public Cylinder() {
    }

    public Cylinder(double heigth) {
        this.heigth = heigth;
    }

    public Cylinder(double radius, String color, double heigth) {
        super(radius, color);
        this.heigth = heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double volume() {
        return Math.pow(super.getRadius(), 2) * getHeigth() * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder: " +
                " heigth= " + heigth +
                ", S Circle= " + super.area() +
                ", V Cylinder= " + volume() +
                ", color= " + getColor();
    }

}
