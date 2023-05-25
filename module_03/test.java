import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

    }
    int[] solution(int[][] arr) {
        List<Integer> arList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (findSNT(arr[i][j])) {
                    arList.add(arr[i][j]);
                }
            }
        }
        int[] ar =new int[arList.size()];
        for (int i = 0; i < ar.length; i++) {
            ar[i]= arList.get(i);
        }
        return ar;
    }
    boolean findSNT(int number){
        if (number<=1) {
            return false;
        }
        int count=0;
        for (int i = 2; i <number; i++) {
            if (number%i==0) {
                count++;
            }
        }
        if (count==2) {
            return true;
        }
        return false;
    }
}
