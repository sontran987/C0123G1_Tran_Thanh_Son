package ss13_search_algorithms.cai_dat_thuat_toan_search_nhi_phan_using_de_quy;


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the number: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array sort ascending: " + Arrays.toString(array));

        System.out.println("Enter check value: ");
        int value = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (array[i] > array[j]) {
                    int max = array[i];
                    array[i] = array[j];
                    array[j] = max;
                }
            }
        }
        System.out.println("Array sort ascending: " + Arrays.toString(array));
        System.out.println(binarySearch(array, 0, array.length - 1, value));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
