package ss14_thuat_toan_sap_xep;

import java.util.Arrays;
import java.util.Scanner;

public class CaiDatThuatToanSapXepChon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr1={1,0,2,5,2,7,8,3};
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array sort: "+insertionSort(arr));

    }

    public static int[] insertionSort(int[] list) {
        System.out.println("Array initial: "+Arrays.toString(list));
        int pos, x;
        for (int i = 0; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x <list[pos-1]){
                list[pos]=list[pos-1];
                pos--;
            }
            list[pos]=x;
        }
        return list;
    }
}
