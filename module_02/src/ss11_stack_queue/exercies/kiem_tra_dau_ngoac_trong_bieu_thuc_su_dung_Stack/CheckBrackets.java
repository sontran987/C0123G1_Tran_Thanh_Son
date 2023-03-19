package ss11_stack_queue.exercies.kiem_tra_dau_ngoac_trong_bieu_thuc_su_dung_Stack;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        System.out.println(main());
    }

    public static boolean main() {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> bStack = new Stack<>();
        System.out.println("Enter expression: ");
        String ele = scanner.nextLine();
        char[] element = ele.toCharArray();
        for (char e : element) {
            switch (e) {
                case '(':
                    bStack.push(e);
                    break;
                case ')':
                    if (bStack.isEmpty() || bStack.pop() != '(') {
                        return false;
                    }
                    break;
            }
        }

        return bStack.isEmpty();
    }

}
