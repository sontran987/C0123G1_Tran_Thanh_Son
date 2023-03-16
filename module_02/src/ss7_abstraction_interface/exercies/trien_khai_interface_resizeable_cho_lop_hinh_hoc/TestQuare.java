package ss7_abstraction_interface.exercies.trien_khai_interface_resizeable_cho_lop_hinh_hoc;

import java.util.Scanner;

public class TestQuare {
    public static void main(String[] args) {

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
        square.resize(Math.random() * 100);
        System.out.println("Sau khi tăng: " + square);
    }
}
