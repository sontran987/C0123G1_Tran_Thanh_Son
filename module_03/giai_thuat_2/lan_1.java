import java.util.Scanner;

public class lan_1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number;
        do {
            System.out.println("nhap so chan: ");
             number=scanner.nextInt();
        }while (number%2!=0);
        System.out.println("so da dung");
        result(number);
    }
    public static void result(int num){
        for (int i = num/2; i >= 1; i--) {
            for (int x = num/2; x > i; x--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= num/2; i++) {
            for (int x = num/2; x > i; x--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
