package bai_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        findNumber(n);
    }

    public static void findNumber(int n) {
        List<Integer> number = new ArrayList<>();
        while (1 > 0) {
            number.add((n % 10));
            if (n == 0) {
                break;
            }
            n = n / 10;
        }
        if (number.size()-1 != 4) {
            System.out.println("Khong phai 4 cho so.");
        } else {
            System.out.println("do dai: " + number.size());
        }
    }
}
