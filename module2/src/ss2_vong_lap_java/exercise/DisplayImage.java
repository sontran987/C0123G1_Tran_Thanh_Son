package ss2_vong_lap_java.exercise;

public class DisplayImage {
    public static void main(String[] args) {
        System.out.println("Hình chữ nhật: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        System.out.println("Hình tam giác cạch góc vuông: ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n");
        System.out.println("Hình tam giác cạch góc vuông ngược: ");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n");
        System.out.println("Tam giác cân: ");
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= (10 * 2 - 1) / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
//                    if (i==10||k==0||k==i*2-2){
                System.out.print("*");
//                    }
            }

            System.out.println("");
        }
    }
}
