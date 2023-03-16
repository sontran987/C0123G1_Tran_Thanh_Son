package ss2_vong_lap_java.exercise;

public class Display100Prime {
    public static void main(String[] args) {
        System.out.println("Hiển thị các số nguyên tố: ");
        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }

        }
    }
}
