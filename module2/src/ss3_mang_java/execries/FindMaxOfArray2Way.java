package ss3_mang_java.execries;

public class FindMaxOfArray2Way {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 6},
                {98, 54, 62, 12},
                {23, 43, 1, 2,}
        };
        int max =array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]>max){
                    max=array[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất là: " +max);
    }
}
