package ss7_abstraction_interface.exercies.trien_khai_interface_resizeable_cho_lop_hinh_hoc;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5, "white");
        System.out.println(circle);

        circle = new Circle("blue", true, 7);
        System.out.println(circle);
        circle.resize(Math.random() * 100);
        System.out.println("Sau khi tăng: " + circle);
    }
}
