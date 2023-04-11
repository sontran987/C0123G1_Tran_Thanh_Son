package bai_1;

public class Thu {
    public static void main(String[] args) {
        int[] mang = {0,1,2, 3};
        if (thuMang(mang)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean thuMang(int[] mang) {
        int buocNhay = mang[1] - mang[0];
        for (int i = 1; i < mang.length; i++) {
            if ((mang[i] - mang[i - 1]) != buocNhay) {
                return false;
            }
        }
        return true;
    }
}
