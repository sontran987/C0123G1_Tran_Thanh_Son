package ss2_vong_lap_java.exercise;


import java.util.Scanner;

public class Display20Prime {
    public static void main(String[] args) {
        int countSNT = 1;
        int numberPrime;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a quantity prime: ");
        numberPrime = Integer.parseInt(scanner.nextLine());
        System.out.println("các số nguyên tố là: ");
        for (int i = 2; i < 10000; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2&&numberPrime>=countSNT) {
                countSNT++;
                System.out.println(i);

            }
        }
    }
}
