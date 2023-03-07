package ss3_mang_java.execries;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter element to be delete: ");
        int element = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element of array:" + i);
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                i--;
                array[array.length - 1] = 0;

            }
        }

        System.out.println("Mảng là: " + Arrays.toString(array));

    }
}
