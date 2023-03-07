package ss3_mang_java.execries;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {12, 1, 41, 5, 3};
        System.out.println("Nhập số muốn thêm: ");
        int number = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm: ");
        int index = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                for (int j = array.length - 1; j > i; j--) {
                    array[j] = array[j - 1];
                }
                array[i] = number;

            }
        }
        System.out.println("Mang la: " + Arrays.toString(array));
    }
}
