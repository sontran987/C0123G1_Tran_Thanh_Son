package ss15_xu_ly_ngoai_le_and_debug;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first edge: ");
            int edgeA = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter second edge: ");
            int edgeB = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter third edge: ");
            int edgeC = Integer.parseInt(scanner.nextLine());
            try {
                isTriangle(edgeA, edgeB, edgeC);
                System.out.println("Tam giác bạn muốn đã hình thành xong bạn hãy xem thành quả của mình '_' ");
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("kết thúc chương trình");
    }

    public static boolean isTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("edge cannot be negative :)");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("không thể vẽ tam giác với độ dài này ");
        } else {
            return true;
        }
    }
}
