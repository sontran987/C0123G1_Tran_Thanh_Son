package ss7_abstraction_interface.exercies.trien_khai_interface_resizeable_cho_lop_hinh_hoc;

public class Square extends Rectangle implements IResizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    public double getArea() {
        return getSide() * getSide();
    }

    public double getPerimeter() {
        return getSide() * 4;
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() +
                ", Area= " + getArea() +
                ", Perimeter= " + getPerimeter();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + getSide() * percent / 100);
    }
}