package ss3_mang_java.execries;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrA = new int[5];
        int[] arrB = new int[4];
        int[] arrC = new int[arrA.length + arrB.length];
        for (int i = 0; i < arrA.length; i++) {
            System.out.println("Nhap phan tu mang A: ");
            arrA[i] = scanner.nextInt();
        }
        for (int i = 0; i < arrB.length; i++) {
            System.out.println("Nhap phan tu mang B: ");
            arrB[i] = scanner.nextInt();
        }
        for (int i = 0; i < arrA.length; i++) {
            arrC[i] = arrA[i];
        }
        for (int i = 0; i < arrB.length; i++) {
            arrC[arrA.length + i] = arrB[i];
        }
        System.out.println("mang thu 3 la: " + Arrays.toString(arrC));
    }
}
