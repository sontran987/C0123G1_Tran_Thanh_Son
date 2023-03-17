package ss11_stack_queue.exercies.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();
        boolean flag;
        do {
            System.out.print("Enter String Number to check it is Palindrome or not: ");
            String inputString = in.nextLine();
            if (inputString.length() > 1) {
                for (int i = inputString.length() - 1; i >= 0; i--) {
                    queue.add(inputString.charAt(i));
                }
                String reverseString = "";
                while (!queue.isEmpty()) {
                    reverseString = reverseString + queue.remove();
                }
                if (inputString.equals(reverseString)) {
                    System.out.println("It's Palindrome ");
                    flag = true;
                } else {
                    System.out.println("It's not Palindrome ");
                    flag = true;
                }
            } else {
                System.out.println("Please try again");
                flag = false;
            }
        } while (!flag);
    }
}
