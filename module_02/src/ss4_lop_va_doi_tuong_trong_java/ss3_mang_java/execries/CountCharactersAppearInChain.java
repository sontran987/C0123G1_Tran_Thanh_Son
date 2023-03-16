package ss4_lop_va_doi_tuong_trong_java.ss3_mang_java.execries;

import java.util.Scanner;

public class CountCharactersAppearInChain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ky tu cho chuoi:");
        String chain = scanner.nextLine();
        String charac;
        do {
            System.out.println("Nhap ky tu xem xuat hien trong chuoi may lan: ");
            charac = scanner.nextLine();
        } while (chain.length() > 1);
        System.out.println("So lan xuat hien: " + count(chain, charac));
    }

    public static int count(String chain, String charac) {
        int count = 0;
        char chara = charac.charAt(0);
        for (int i = 0; i < chain.length(); i++) {
            if (chain.charAt(i) == chara) {
                count++;
            }

        }
        return count;
    }
}
