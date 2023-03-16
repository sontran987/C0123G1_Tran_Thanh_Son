package ss6_inheritance.exercies.lop_point2D_va_lop_point3D;

import java.util.Scanner;

public class TestPoint3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x: ");
        double x = scanner.nextDouble();
        System.out.println("nhap y: ");
        double y = scanner.nextDouble();
        System.out.println("nhap z: ");
        double z = scanner.nextDouble();
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(z);
        System.out.println(point3D);

        point3D = new Point3D(x, y, z);
        System.out.println(point3D);
    }
}
