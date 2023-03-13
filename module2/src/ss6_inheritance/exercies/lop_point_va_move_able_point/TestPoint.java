package ss6_inheritance.exercies.lop_point_va_move_able_point;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x: ");
        double x = scanner.nextDouble();
        System.out.println("nhap y: ");
        double y = scanner.nextDouble();
        Point point = new Point();
        System.out.println(point);
        point = new Point(x, y);
        System.out.println(point);
    }
}
