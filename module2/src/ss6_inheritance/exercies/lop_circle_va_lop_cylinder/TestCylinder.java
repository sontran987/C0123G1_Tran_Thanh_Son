package ss6_inheritance.exercies.lop_circle_va_lop_cylinder;

import java.util.Scanner;

public class TestCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu cao: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap  ban kinh: ");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap mau sac: ");
        String color = scanner.nextLine();
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(height);
        System.out.println(cylinder);

        cylinder = new Cylinder(radius, color, height);
        System.out.println(cylinder);
    }
}
