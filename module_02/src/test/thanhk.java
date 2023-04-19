package test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class thanhk {
    public static void main(String[] args) {
        int[][] arr= {{1, 2, 8, 43}, {9, 4, 53, 7}, {11, 6, 4, 0}, {1, 2, 6, 51}};
        solution(arr);
        System.out.println(solution(arr));
    }
    int[] solution(int[][] arr) {
        Set<Integer> list =new LinkedHashSet<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        int [] ar = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (ak(arr[i][j])){
                    list.add(arr[i][j]);
                }
            }
        }
        arrayList.addAll(list);
        for (int i = 0; i < list.size(); i++) {
            ar[i]= arrayList.get(i);
        }
        return ar ;

    }
    boolean ak(int num ){
        int count=0;
        for (int i = 0; i < num; i++) {
            if (num % i == 0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
}
