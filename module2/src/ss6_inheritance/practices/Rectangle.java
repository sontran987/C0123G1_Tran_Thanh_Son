package ss6_inheritance.practices;

public class Rectangle extends Shape {
private double width = 1.0;
private double length =1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return getWidth()*getLength();
    }
    public double getPerimeter (){
        return 2*(getWidth()+getLength());
    }

    @Override
    public String toString() {
        return "A Rectangle width " +
                "width=" + width +
                ", length=" + length +
                ", which is a subclass of "+
                super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle( "orange", true,2.5,3.8);
        System.out.println(rectangle);
    }
}
