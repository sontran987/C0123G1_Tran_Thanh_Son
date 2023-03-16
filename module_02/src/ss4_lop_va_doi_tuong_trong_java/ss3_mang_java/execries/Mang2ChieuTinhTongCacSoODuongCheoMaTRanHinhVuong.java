package ss4_lop_va_doi_tuong_trong_java.ss3_mang_java.execries;

import java.util.Scanner;

public class Mang2ChieuTinhTongCacSoODuongCheoMaTRanHinhVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] array = new double[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element in array: ");
                array[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Array is:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+",");
            }
            System.out.println("");
        }

        sumOfNumber(array);
    }

    public static void sumOfNumber(double[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("Tổng đường chéo trong ma trận là: " + sum);
    }
}
