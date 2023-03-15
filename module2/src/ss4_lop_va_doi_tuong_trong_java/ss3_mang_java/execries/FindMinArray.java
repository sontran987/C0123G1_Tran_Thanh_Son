package ss4_lop_va_doi_tuong_trong_java.ss3_mang_java.execries;

import java.util.Scanner;

public class FindMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = new int[5];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Nhập phần tử cho mảng: ");
            arrays[i] = scanner.nextInt();
        }
        int min = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < min) {
                min = arrays[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
