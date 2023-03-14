package ss7_abstraction_interface.exercies.trien_khai_interface_resizeable_cho_lop_hinh_hoc;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[7];
        Circle circle = new Circle("white", true, 6);
        Rectangle rectangle = new Rectangle(4, 9, "blue", true);
        Square square = new Square(5, "black", true);
        array[0] = "S circle: " + String.valueOf(circle.getArea());
        array[1] = "S rectangle: " + String.valueOf(rectangle.getArea());
        array[2] = "S square: " + String.valueOf(square.getArea());
        array[3] = "Sau khi thay đổi: " + Math.round(Math.random() * 99 + 1);
        circle.resize((int)(Math.random() * 100 + 1));
        square.resize((int)(Math.random() * 100 + 1));
        rectangle.resize((int)(Math.random() * 100 + 1));
        array[4] = "S circle: " + String.valueOf(circle.getArea());
        array[5] = "S rectangle: " + String.valueOf(rectangle.getArea());
        array[6] = "S square: " + String.valueOf(square.getArea());
        for (String a : array) {
            System.out.println(a);
        }
    }
}