package ss3_mang_java.execries;

import java.util.Arrays;
import java.util.Scanner;

public class TotalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] array = new double[2][5];
        int colspan;
        do {
            System.out.println("Nhập cột bạn muốn cộng: ");
            colspan = scanner.nextInt();
        } while (colspan <= 0 || colspan > 5);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập phần tử vào mảng: ");
                array[i][j] = scanner.nextDouble();
            }
        }
       sum(array, colspan);
    }

    public static void sum(double[][] array, int index) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == index - 1) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Mang la: " + Arrays.deepToString(array));
        System.out.println("Tong la: " + sum);
    }
}
