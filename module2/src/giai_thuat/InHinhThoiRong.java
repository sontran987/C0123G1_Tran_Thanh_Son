package giai_thuat;

public class InHinhThoiRong {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (j==a || j==b) {
                    System.out.print(i+1);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            a--;
            b++;
        }
        int c = 1;
        int d = 8;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (j==c||j==d) {
                    System.out.print(5-i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            c++;
            d--;
        }
    }
}