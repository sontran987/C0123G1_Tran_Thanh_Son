package ss14_thuat_toan_sap_xep;

import java.util.Arrays;
import java.util.Scanner;

public class MinhHoaThuatToanSapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number: ");
            arr[i] = scanner.nextInt();
        }
        insertionSort(arr);
    }

    public static void insertionSort(int[] array) {
        System.out.println(Arrays.toString(array));
        int pos, temp;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            pos = i;
            while (pos > 0 && temp < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println("Thay doi");
            }
            array[pos] = temp;
            System.out.println("Thay doi phan tu thu " + i + ":" + Arrays.toString(array));

        }

//        System.out.println(Arrays.toString(array));
    }
}
