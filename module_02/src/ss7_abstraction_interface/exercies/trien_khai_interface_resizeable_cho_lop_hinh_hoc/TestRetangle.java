package ss7_abstraction_interface.exercies.trien_khai_interface_resizeable_cho_lop_hinh_hoc;

import java.util.Scanner;

public class TestRetangle {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        rectangle.resize(Math.random() * 100);
        System.out.println("Sau khi tăng: " + rectangle);
    }
}
