package ss13_search_algorithms.tim_chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class FindChainAscendingHaveLengthMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character string: ");
        String str = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character m : max) {
            System.out.print(m);
        }

    }
}
